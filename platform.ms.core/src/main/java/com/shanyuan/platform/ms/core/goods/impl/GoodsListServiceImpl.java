package com.shanyuan.platform.ms.core.goods.impl;

import com.aliyun.openservices.shade.com.alibaba.fastjson.JSON;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.cart.CartService;
import com.shanyuan.platform.ms.core.constant.GoodsConstant;
import com.shanyuan.platform.ms.core.constant.GoodsConstant.GoodsState;
import com.shanyuan.platform.ms.core.constant.OrderConstant;
import com.shanyuan.platform.ms.core.goods.GoodsListService;
import com.shanyuan.platform.ms.core.goods.SyGoodsCommonService;
import com.shanyuan.platform.ms.core.goods.SyGoodsService;
import com.shanyuan.platform.ms.core.order.bo.GoodsInfo;
import com.shanyuan.platform.ms.core.order.impl.exceptype.OrderServiceExcepType;
import com.shanyuan.platform.ms.core.store.SyStoreService;
import com.shanyuan.platform.ms.core.topic.SyTopicService;
import com.shanyuan.platform.ms.core.topic.bo.TopicGoodsInfo;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoods;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;
import com.shanyuan.platform.ms.dao.store.entity.SyStore;
import com.shanyuan.platform.ms.dao.user.entity.SyAddress;
import com.shanyuan.platform.ms.dao.user.mapper.SyShopAccountMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author zy
 * @date 2017-10-19
 *
 */
@Component
public class GoodsListServiceImpl implements GoodsListService {
	
	private static final Logger logger = LoggerFactory.getLogger(GoodsListServiceImpl.class);
	@Autowired
	private SyGoodsService syGoodsService;

	@Autowired
	private SyTopicService topicService;
	@Autowired
	private SyGoodsCommonService goodsCommonService;
	@Autowired
	private SyStoreService storeService;
	@Autowired
	private CartService cartService;




    @Override
    public List<GoodsInfo> getGoodsList(Map<Integer, Integer> goodsNumMap,List<Integer> goodsIdList, Integer buyerId,SyAddress syAddress)throws CoreServiceException{
        if(ObjectUtils.isEmpty(goodsNumMap)||ObjectUtils.isEmpty(buyerId) || ObjectUtils.isEmpty(goodsIdList)) {
            throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"参数为空");
        }
        //区分活动正常
        Map<String, Object> goodsDiff = this.getGoodsDiff(goodsIdList);
        if(ObjectUtils.isEmpty(goodsDiff)){
            throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"参数为空");
        }
        @SuppressWarnings("unchecked")
		Map<Integer, TopicGoodsInfo> topicGoodsMap = ( Map<Integer, TopicGoodsInfo> )goodsDiff.get("topicGoodsMap");
        @SuppressWarnings("unchecked")
		List<Integer>   ngoodsIdList=  (List<Integer>)goodsDiff.get("goodsIdList");
        List<GoodsInfo> allgoodsInfoList =new ArrayList<GoodsInfo>();
        //计算正常价
        if(!ObjectUtils.isEmpty(ngoodsIdList)){
            List<GoodsInfo> goodsInfoList = this.getGoodsInfoList(goodsNumMap, goodsIdList, buyerId, syAddress);
            allgoodsInfoList.addAll(goodsInfoList);
        }
        //计算活动价
        if(!ObjectUtils.isEmpty(topicGoodsMap)){
            List<GoodsInfo> topicInfoList =  this.getTopicGoodsList(goodsNumMap, topicGoodsMap, buyerId, syAddress);
            allgoodsInfoList.addAll(topicInfoList);
        }
        return allgoodsInfoList;
    }
    //活动商品计算
    @Override
    public List<GoodsInfo> getTopicGoodsList(Map<Integer, Integer> goodsNumMap,Map<Integer, TopicGoodsInfo> topicGoodsMap, Integer buyerId,SyAddress syAddress)throws CoreServiceException{
        List<Integer> goodsids= new ArrayList<Integer>();
        List<Integer> goodsCommonIdList = new ArrayList<Integer>();
        for(Integer key:topicGoodsMap.keySet()){
        	TopicGoodsInfo goodsInfo = topicGoodsMap.get(key);
            Integer goodsCommonid = goodsInfo.getGoodsCommonid();
            if(!goodsCommonIdList.contains(goodsCommonid)) {
                goodsCommonIdList.add(goodsCommonid);
            }

            goodsids.add(key);
       }
        List<SyGoods> goodsList = null;
        try {
     			goodsList = syGoodsService.selectGoodsInfo(goodsids, "goods_id  DESC");
     		} catch (Exception e) {
     			logger.error(e.getMessage(),e);
     			
     		}
        if(logger.isDebugEnabled()) {
            logger.info("order topic goodsList :"+JSON.toJSONString(goodsList));

        }
        List<SyGoodsCommon> goodsCommonList = goodsCommonService.getGoodsCommonInfo(goodsCommonIdList);
        if(logger.isDebugEnabled()) {
            logger.info("order topic goodsCommonList :"+JSON.toJSONString(goodsCommonList));
        }
        if(!ObjectUtils.isEmpty(goodsCommonList)&&goodsCommonList.size()!=goodsCommonIdList.size()) {
            throw new CoreServiceException(OrderServiceExcepType.GOODS_COMMON_MISSING,"没有此类商品commonid");
        }
        Map<Integer,SyGoodsCommon> goodsCommonMap=new HashMap<Integer,SyGoodsCommon>();
        List<Integer> storeIdsList =new ArrayList<Integer>();
        for(int i=0;i<goodsCommonList.size();i++) {
            SyGoodsCommon syGoodsCommon = goodsCommonList.get(i);
            String buyAreaStr = this.checkBuyAreaStr(syGoodsCommon, syAddress);
            if(!ObjectUtils.isEmpty(buyAreaStr)) {
                logger.info("不符合地区购买："+buyAreaStr);
                throw new CoreServiceException(OrderServiceExcepType.NOT_SUPPORTED,buyAreaStr);
            }
            Integer goodsCommonid = syGoodsCommon.getGoodsCommonid();
            Integer storeid = syGoodsCommon.getStoreId();
            if(!ObjectUtils.isEmpty(storeid)&&!storeIdsList.contains(storeid)) {
                storeIdsList.add(storeid);
            }
            goodsCommonMap.put(goodsCommonid,goodsCommonList.get(i));
        }
        Map<Integer,Integer> storeMap = null;
        if(!ObjectUtils.isEmpty(storeIdsList)) {
            List<SyStore> memberByStore = storeService.getMemberByStore(storeIdsList);
            if(!ObjectUtils.isEmpty(memberByStore)){
                storeMap = new HashMap<Integer,Integer>();
                for(SyStore sy:memberByStore) {
                    storeMap.put(sy.getStoreId(), sy.getMemberId());
                }
            }
        }
        if(logger.isDebugEnabled()) {
            logger.info("order topic storeMap :"+JSON.toJSONString(storeMap));
        }
        int goodsNum=0,storeId=0,sellerId=0;
        GoodsInfo goodsInfo=null;
        SyGoodsCommon goodsCommon=null;
        List<GoodsInfo> goodsInfoList =new ArrayList<GoodsInfo>();
        for(SyGoods goods:goodsList) {
            goodsCommon=goodsCommonMap.get(goods.getGoodsCommonid());

            goodsNum=goodsNumMap.get(goods.getGoodsId());
			goodsNum= ObjectUtils.isEmpty(goodsNum)?0:goodsNum;
			if(goodsNum <=0){
				logger.info("goodsNum："+goodsNum);
				throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"购买商品数量不能小于1件~");
			}
            goodsInfo=new GoodsInfo(goods,goodsCommon,goodsNum);
            TopicGoodsInfo goodsInfo2 = topicGoodsMap.get(goods.getGoodsId());
            if(!ObjectUtils.isEmpty(goodsInfo2)) {
            	  BigDecimal  gprice =goodsInfo2.getActGoodsPrice();
                  gprice= ObjectUtils.isEmpty(gprice)?BigDecimal.ZERO:gprice;
                  goodsInfo.setBocPointsPrice(goodsInfo2.getBocPointsPrice());
                  goodsInfo.setGoodsPrice(gprice);
                  goodsInfo.setGoodsType(goodsInfo2.getGoodsType());
                  goodsInfo.setGoodsStorage(goodsInfo2.getActStorage().longValue());
                  goodsInfo.setPurchasePrice(goodsInfo2.getPurchasePrice());
                  goodsInfo.setPromotionsid(goodsInfo2.getTopicId());
                  BigDecimal totalprice=gprice.multiply(new BigDecimal(goodsNum));
                  goodsInfo.setGoodsMoneyTotal(totalprice);
            }
            //置换数据 end
            goodsInfo.setGoodsCommonid(goods.getGoodsCommonid());
            storeId = goodsInfo.getStoreId();
            if(!ObjectUtils.isEmpty(storeMap)) {
                sellerId =ObjectUtils.isEmpty(storeMap.get(storeId))?0:sellerId;
            }
            goodsInfo.setSellerId(sellerId);
            //校验每个人最多可买
			goodsCommonService.checkBuyNum(goodsInfo,buyerId);
            //校验购买数量是否大于库存数量
            try {
            	goodsCommonService.checkStore(goodsInfo);
            }catch (CoreServiceException e) {
            	throw new CoreServiceException(OrderServiceExcepType.STOCK_COUNT_NOT_ENOUGH_FAIL,"活动商品:"+goodsInfo.getGoodsName()+" 库存不足，请修改购买数量~");
			}
            goodsInfoList.add(goodsInfo);
        }

        return goodsInfoList;
    }
	/**
	 * 返回商品列表
	 * by zy
	 */
	@Override
	public List<GoodsInfo> getGoodsInfoList(Map<Integer, Integer> goodsNumMap,List<Integer> goodsIdList, Integer buyerId,SyAddress syAddress)throws CoreServiceException  {
		if(ObjectUtils.isEmpty(goodsNumMap)||ObjectUtils.isEmpty(buyerId) || ObjectUtils.isEmpty(goodsIdList)) {
			 throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"参数为空");
		}
		List<GoodsInfo> goodsInfoList = new ArrayList<GoodsInfo>();
	
		List<Integer> goodsCommonIdList = new ArrayList<Integer>();
		List<SyGoods> goodsList=null;
        try {
			goodsList = syGoodsService.selectGoodsInfo(goodsIdList, "goods_id  DESC");
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			
		}
		if(logger.isDebugEnabled()) {
			logger.info("order goodsList :"+JSON.toJSONString(goodsList));
		}
		if(ObjectUtils.isEmpty(goodsList)) {
			 throw new CoreServiceException(OrderServiceExcepType.NO_ONLINE_GOODS,"该商品已下架，请选购其他商品~");
		}
		
		List<Integer> goodsIdsList =new ArrayList<Integer>();
		
		for (int i = 0; i < goodsList.size(); i++) {
			SyGoods goods=goodsList.get(i);
            Long goodsStorage1 = goods.getGoodsStorage();
			String goodsname=goods.getGoodsName();


           if(goodsStorage1<0L){
        	   cartService.updateChecked(goods.getGoodsId(), buyerId, (byte)0);
               throw new CoreServiceException(OrderServiceExcepType.NO_ONLINE_GOODS,"商品:"+goodsname+"已售罄，请选购其他商品~");
			}
			Byte state=goods.getGoodsState();
			
			if(!ObjectUtils.nullSafeEquals(GoodsState.GOODS_STATE1,state)){
				cartService.updateChecked(goods.getGoodsId(), buyerId, (byte)0);
				throw new CoreServiceException(OrderServiceExcepType.NO_ONLINE_GOODS,"商品:"+goodsname+"已下架，请选购其他商品~");
			}
			if(!goodsCommonIdList.contains(goods.getGoodsCommonid())) {
				goodsCommonIdList.add(goodsList.get(i).getGoodsCommonid());
			}
			goodsIdsList.add(goodsList.get(i).getGoodsId());
		}
	/*	if(!ObjectUtils.isEmpty(goodsIdsList)&&goodsIdsList.size()!=goodsIdList.size()) {
			 throw new CoreServiceException(OrderServiceExcepType.GOODS_MISSING,"没有此类商品或相关商品库存不足");
		}*/
		if(ObjectUtils.isEmpty(goodsCommonIdList)) {
			throw new CoreServiceException(OrderServiceExcepType.NO_ONLINE_GOODS,"该商品已售罄，请选购其他商品~");
		}
		List<SyGoodsCommon> goodsCommonList = goodsCommonService.getGoodsCommonInfo(goodsCommonIdList);
		if(logger.isDebugEnabled()) {
			logger.info("order goodsCommonList :"+JSON.toJSONString(goodsCommonList));
		}
		if(!ObjectUtils.isEmpty(goodsCommonList)&&goodsCommonList.size()!=goodsCommonIdList.size()) {
			 throw new CoreServiceException(OrderServiceExcepType.GOODS_COMMON_MISSING,"没有此类商品commonid");
		}
		Map<Integer,SyGoodsCommon> goodsCommonMap=new HashMap<Integer,SyGoodsCommon>();
		List<Integer> storeIdsList =new ArrayList<Integer>();
		for(int i=0;i<goodsCommonList.size();i++) {
			SyGoodsCommon syGoodsCommon = goodsCommonList.get(i);
			String buyAreaStr = this.checkBuyAreaStr(syGoodsCommon, syAddress);
			if(!ObjectUtils.isEmpty(buyAreaStr)) {
				logger.info("不符合地区购买："+buyAreaStr);
				 throw new CoreServiceException(OrderServiceExcepType.NOT_SUPPORTED,buyAreaStr);
			}
			Integer goodsCommonid = syGoodsCommon.getGoodsCommonid();
			Integer storeid = syGoodsCommon.getStoreId();
			if(!ObjectUtils.isEmpty(storeid)&&!storeIdsList.contains(storeid)) {
				storeIdsList.add(storeid);
			}
			goodsCommonMap.put(goodsCommonid,goodsCommonList.get(i));
		}
		Map<Integer,Integer> storeMap = null;
		if(!ObjectUtils.isEmpty(storeIdsList)) {
			List<SyStore> memberByStore = storeService.getMemberByStore(storeIdsList);
			if(!ObjectUtils.isEmpty(memberByStore)){
				storeMap = new HashMap<Integer,Integer>();
				for(SyStore sy:memberByStore) {
					storeMap.put(sy.getStoreId(), sy.getMemberId());
				}
			}
		}
		if(logger.isDebugEnabled()) {
			logger.info("order storeMap :"+JSON.toJSONString(storeMap));
		}
		int goodsNum=0,storeId=0,sellerId=0;
		GoodsInfo goodsInfo=null;
		SyGoodsCommon goodsCommon=null;
		for(int i=0;i<goodsList.size();i++) {
			goodsCommon=goodsCommonMap.get(goodsList.get(i).getGoodsCommonid());
			
			goodsNum=goodsNumMap.get(goodsList.get(i).getGoodsId());
			if(goodsNum <=0){
				logger.info("goodsNum："+goodsNum);
				throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"购买商品数量不能小于1件~");
			}
			//中间判断批发价
			goodsInfo=new GoodsInfo(goodsList.get(i),goodsCommon,goodsNum);
			storeId = goodsInfo.getStoreId();
			if(!ObjectUtils.isEmpty(storeMap)) {
				sellerId =ObjectUtils.isEmpty(storeMap.get(storeId))?0:sellerId;
			}
			goodsInfo.setSellerId(sellerId);
			//校验每个人最多可买
			goodsCommonService.checkBuyNum(goodsInfo,buyerId);
			//校验购买数量是否大于库存数量
			goodsCommonService.checkStore(goodsInfo);
			goodsInfoList.add(goodsInfo);
		}
		return goodsInfoList;
	}
	
	 /**
	  * 判断地区购买
	  * @param
	  * @param
	  * @param
	  * @return
	  */
	 public  String checkBuyAreaStr(SyGoodsCommon goodscommon,SyAddress syAddress) {
		 String goodsname = goodscommon.getGoodsName();
		 String buyArea = goodscommon.getBuyArea();
		 String province ="";
		
		if(!ObjectUtils.isEmpty(syAddress)) {
			 String areaInfo = syAddress.getAreaInfo();
			 if(!ObjectUtils.isEmpty(areaInfo)) {
				 String[] split = areaInfo.split(" ");
				 if(!ObjectUtils.isEmpty(split)&&split.length>1) {
					 province = split[0];
				 }
			 }
				
		}
		 boolean flag=true;
		 String backarea="";
		 if(!ObjectUtils.isEmpty(buyArea)&&!ObjectUtils.isEmpty(province)) {
			 String[] areastr = buyArea.split(",");
			 if(!ObjectUtils.isEmpty(areastr)) {
					flag=false;
				 for(int i=0;i<areastr.length;i++) {
					 if(province.equals(areastr[i])) {
						 flag=true;
						 break;
					 }
				 }
			 }
			 
		 }
		 //如果不是在这个地方
		 if(!flag) {
			 backarea="您购买的产品："+goodsname+"仅支持："+buyArea+"地区的用户购买；";
		 }
		 return backarea;
	 }

    /**
     * 区分活动
     * @param goodsIdList
     * @return
     * @throws CoreServiceException
     */
    public Map<String,Object> getGoodsDiff(List<Integer> goodsIdList)throws CoreServiceException{
    	boolean flag=true;
        Map<Integer,TopicGoodsInfo>  goodsMap=new HashMap<Integer,TopicGoodsInfo>();
        List<Integer> ngoodsidlist=new ArrayList<Integer>();
        if(!flag) {
        	 for(Integer  goodsid :goodsIdList){
             	TopicGoodsInfo topicGoods = topicService.getTopicGoods(goodsid);
             	String goodsStatus = topicGoods.getGoodsStatus();
                 if(GoodsConstant.TopicStatus.can_buy.equals(goodsStatus)){
                      goodsMap.put(goodsid,topicGoods);
                 }else{
                     //非活动在活动中的商品
                     ngoodsidlist.add(goodsid);
                 }

             }
        }else {
        	ngoodsidlist=goodsIdList;
        }
        Map<String,Object>  goods=new HashMap<String,Object>();



        goods.put("goodsIdList",ngoodsidlist);
        goods.put("topicGoodsMap",goodsMap);
        if(logger.isDebugEnabled()) {
            logger.info("order topic goodsIdList :"+JSON.toJSONString(ngoodsidlist));
            logger.info("order topic topicGoodsMap :"+JSON.toJSONString(goodsMap));
        }
        return goods;
    }
	/**
	 * 产品所属类型
	 * @param goodsProjectType
	 * @param assistId
	 * @param ownerType
	 * @return
	 * @throws CoreServiceException
	 */
	public String getGoodsOwnerType(Integer goodsProjectType,Integer assistId ,String ownerType)throws CoreServiceException {
		String goodstype="";
		if(OrderConstant.ProjectType.PROJECT_TYPE_SY_SHOP.equals(goodsProjectType)){
			goodstype =OrderConstant.orderType.order_syshop;
		}else if(OrderConstant.ProjectType.PROJECT_TYPE_DA_SHOP.equals(goodsProjectType)){
			if(assistId >0) {//集采
				goodstype=OrderConstant.orderType.order_biz;
			}else if(OrderConstant.ownerType.OWNER_TYPE_AGENT.equals(ownerType)) {
				goodstype=OrderConstant.orderType.order_agent;
			}else if(OrderConstant.ownerType.OWNER_TYPE_AGENT.equals(ownerType)) {
				goodstype=OrderConstant.orderType.order_poor;
			}
		}
		return goodstype;
	}
}
