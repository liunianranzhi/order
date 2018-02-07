package com.shanyuan.platform.ms.core.user.impl;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import com.aliyun.openservices.shade.com.alibaba.fastjson.JSON;
import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.OrderConstant;
import com.shanyuan.platform.ms.core.constant.OrderConstant.VoucherTCostMode;
import com.shanyuan.platform.ms.core.constant.OrderConstant.VoucherType;
import com.shanyuan.platform.ms.core.order.bo.DisOrderGoodsInfo;
import com.shanyuan.platform.ms.core.order.bo.GoodsInfo;
import com.shanyuan.platform.ms.core.order.impl.OrderServiceImpl;
import com.shanyuan.platform.ms.core.order.impl.exceptype.OrderServiceExcepType;
import com.shanyuan.platform.ms.core.user.UserCorrelationService;
import com.shanyuan.platform.ms.core.user.VoucherService;
import com.shanyuan.platform.ms.dao.order.mapper.SyVoucherAreaMapper;
import com.shanyuan.platform.ms.dao.order.mapper.SyVoucherGoodsMapper;
import com.shanyuan.platform.ms.dao.order.mapper.SyVoucherMapper;
import com.shanyuan.platform.ms.dao.order.mapper.SyVoucherOrderMapper;
import com.shanyuan.platform.ms.dao.order.mapper.SyVoucherTemplateMapper;
import com.shanyuan.platform.ms.dao.user.entity.SyRole;
import com.shanyuan.platform.ms.dao.user.entity.SyVoucher;
import com.shanyuan.platform.ms.dao.user.entity.SyVoucherArea;
import com.shanyuan.platform.ms.dao.user.entity.SyVoucherAreaExample;
import com.shanyuan.platform.ms.dao.user.entity.SyVoucherExample;
import com.shanyuan.platform.ms.dao.user.entity.SyVoucherGoods;
import com.shanyuan.platform.ms.dao.user.entity.SyVoucherGoodsExample;
import com.shanyuan.platform.ms.dao.user.entity.SyVoucherOrder;
import com.shanyuan.platform.ms.dao.user.entity.SyVoucherOrderExample;
import com.shanyuan.platform.ms.dao.user.entity.SyVoucherTemplate;
import com.shanyuan.platform.ms.dao.user.entity.SyVoucherTemplateExample;

/**
 * 
 * @author 曹勇军
 * 
 */
@Component
public class VoucherServiceImpl implements VoucherService {
	private static final Logger logger = LoggerFactory.getLogger(VoucherServiceImpl.class);
	
	@Autowired 
	private SyVoucherMapper syVoucherMapper;
	
	@Autowired
	private SyVoucherTemplateMapper syVoucherTemplateMapper;
	
	@Autowired
	private SyVoucherOrderMapper syVoucherOrderMapper;
	
	@Autowired
	private SyVoucherGoodsMapper syVoucherGoodsMapper;
	@Autowired
	private UserCorrelationService userCorrelationService;
	
	@Autowired
	private SyVoucherAreaMapper syVoucherAreaMapper;
	
	/**
	 * @author 曹勇军
    * 将购物卷添加到订单记录
    * @param 包含order_id,goods_id,voucher_code,use_time,amount,buyer_id
	*/
	@Transactional(timeout=36000,rollbackFor=Throwable.class)
	@Override
	public void useVoucher(SyVoucherOrder syVoucherOrder) throws CoreServiceException{
		//循环插入数据
		try {
			syVoucherOrderMapper.insertSelective(syVoucherOrder);
		}catch (Exception e) {
			logger.info("[VoucherService][useVoucher] 使用优惠券失败：voucherCode={}",  syVoucherOrder.getVoucherCode() );
			throw new CoreServiceException(OrderServiceExcepType.ADD_VOUCHER_LOG_FAIL,MessageFormat.format("[VoucherService][useCoupon] 添加优惠券订单记录失败：voucherCode={0}", syVoucherOrder.getVoucherCode() ));
		}
		
	}
	@Override
	@Transactional(timeout=36000,rollbackFor=Throwable.class)
	public void updateVoucherStatus(String voucherCode)throws CoreServiceException{
		try {
		//把优惠券更新为已用
		SyVoucher record=new SyVoucher();
		record.setVoucherState(VoucherType.USED);
		record.setVoucherUsedDate(DateUtil.getNowInt());
		SyVoucherExample example=new SyVoucherExample();
		example.createCriteria()
			.andVoucherCodeEqualTo(voucherCode)
			.andVoucherStateEqualTo(VoucherType.UN_USED);
		int updateResult=syVoucherMapper.updateByExampleSelective(record, example);

		if(updateResult==0){
			//回滚事务
			logger.info("[VoucherService][useVoucher] 使用优惠券失败：voucherCode={}",  voucherCode);
			throw new CoreServiceException(OrderServiceExcepType.USE_Voucher_FAIL,MessageFormat.format("[VoucherService][useCoupon] 使用优惠券失败：voucherCode={0}",  voucherCode));
		}

		}catch (Exception e) {
			logger.error(e.getMessage(),e);
			logger.info("[VoucherService][useVoucher] 更新优惠券失败：voucherCode={}",  voucherCode );
			throw new CoreServiceException(OrderServiceExcepType.ADD_VOUCHER_LOG_FAIL,MessageFormat.format("[VoucherService][useCoupon] 添加优惠券订单记录失败：voucherCode={0}", voucherCode ));
		}

	}
	@Override
	@Transactional(timeout=36000,rollbackFor=Throwable.class)
	public void updateVouchertused(SyVoucher record)throws CoreServiceException{
		try {
		syVoucherMapper.updateByTused(record);
		}catch (Exception e) {
			logger.error(e.getMessage(),e);
			logger.info("[VoucherService][useVoucher] 更新优惠券失败：voucherCode={}",  record.getVoucherCode() );
			throw new CoreServiceException(OrderServiceExcepType.ADD_VOUCHER_LOG_FAIL,MessageFormat.format("[VoucherService][useCoupon] 添加优惠券订单记录失败：voucherCode={0}", record.getVoucherCode()  ));
		}
	}
	/**
	 * @author 曹勇军
	 * 返还订单中锁定的优惠券
	 * 
	 * 业务逻辑   1.删除sy_voucher_order的数据
	 * 		  2.把sy_voucher的状态变为未使用
	 * 
	 * @return result 大于零 更新成功后的条数  
	 */
	@Override
	@Transactional(timeout=36000,rollbackFor=Throwable.class)
	public void deleteVoucherOrder(Integer orderId) throws CoreServiceException{
		
		SyVoucherOrderExample syVoucherOrderExample=new SyVoucherOrderExample();
		syVoucherOrderExample.createCriteria().andOrderIdEqualTo(orderId);
		
		List<SyVoucherOrder> voucherOrderList=syVoucherOrderMapper.selectByExample(syVoucherOrderExample);
		if(voucherOrderList!=null && voucherOrderList.size()>0){
			//删除优惠券订单表
			SyVoucherOrder syVoucherOrder = voucherOrderList.get(0);
			int deleteResult=syVoucherOrderMapper.deleteByPrimaryKey(syVoucherOrder.getRecId());
			if(deleteResult>0){
				//把代金券表的数据变为未使用
				SyVoucher record=new SyVoucher();
				record.setVoucherState(VoucherType.UN_USED);
				SyVoucherExample example=new SyVoucherExample();
				example.createCriteria().andVoucherCodeEqualTo(syVoucherOrder.getVoucherCode());
				int updateResult = syVoucherMapper.updateByExampleSelective(record, example);
				
				//没有更新成功  要回滚事物
				if(updateResult==0){
					logger.info("[VoucherService][deleteVoucherOrder] 优惠券退回失败,回滚数据：orderId={},voucherCode={}", orderId, syVoucherOrder.getVoucherCode());
					throw new CoreServiceException(CoreServiceExcepType.DEFAULT_TYPE,"优惠券退回失败,回滚数据");
				}
			}
		}
	}
	/**
	 * 获得店铺为id的有优惠的商品列表
	 * @param voucherList
	 * @param disOrderGoodsInfo
	 * @return
	 */
	 public Map<String,Object> getStoreVoucherGoodsList
	 (List<SyVoucher> voucherList,Map<String,DisOrderGoodsInfo> disOrderGoodsInfo){
		 Map<String,Object> storeMap= new HashMap<String,Object>();
		 Map<Integer,List<GoodsInfo>> storeGoodsInfo= new HashMap<Integer,List<GoodsInfo>>();
		    
         List<SyVoucher> storevoucherlist= new ArrayList<SyVoucher>();
		 if(!ObjectUtils.isEmpty(voucherList)){
			 //获得店铺分组的list
	            Map<Integer,List<SyVoucher>> storevoucher= new HashMap<Integer,List<SyVoucher>>();
	            if(!ObjectUtils.isEmpty(voucherList)) {
	            	for(SyVoucher syVoucher:voucherList){
	            		Integer voucherTstoreId = syVoucher.getVoucherTstoreId();
	            		List<SyVoucher> storelist2 = storevoucher.get(voucherTstoreId);
	            		if(CollectionUtils.isEmpty(storelist2)) {
	            			storelist2=	new ArrayList<SyVoucher>();
	            			storelist2.add(syVoucher);
	            		}else {
	            			storelist2.add(syVoucher);
	            		}
	            		storevoucher.put(voucherTstoreId, storelist2);
	                }
	            }
	           logger.info("voucher store:"+JSON.toJSONString(storevoucher));
			 for(String key:disOrderGoodsInfo.keySet()) {
				 DisOrderGoodsInfo goodsInfo = disOrderGoodsInfo.get(key);
				 List<GoodsInfo> goodsInfoList = goodsInfo.getGoodsInfoList();
				 if(!ObjectUtils.isEmpty(goodsInfoList)) {
					for(GoodsInfo gf:goodsInfoList) {
						Integer storeId = gf.getStoreId();
						if(!ObjectUtils.isEmpty(storevoucher.get(storeId))) {
							List<GoodsInfo> list = storeGoodsInfo.get(storeId);
							if(ObjectUtils.isEmpty(list)) {
								list =new ArrayList<GoodsInfo>();
								list.add(gf);
							}else {
								list.add(gf);
							}
							List<SyVoucher> list2 = storevoucher.get(storeId);
							for(SyVoucher sy:list2) {
								if(!storevoucherlist.contains(sy)) {
									storevoucherlist.add(sy);
								}
								
							}
							if(logger.isDebugEnabled()){
								logger.info("voucher storevoucherlist:"+JSON.toJSONString(storevoucherlist));
							}
							//新的
							storeGoodsInfo.put(storeId, list);
						}
					} 
				 }
			 }
		 }
		 if(logger.isDebugEnabled()){
			 logger.info("new voucher storevoucherlist:"+JSON.toJSONString(storevoucherlist));
		 }
		 storeMap.put("storeGoodsInfo", storeGoodsInfo);
		 storeMap.put("storevoucherlist", storevoucherlist);
		 return storeMap;
	 }
	 /**
	  @author caoyongjun
     * 根据购买商品列表筛选出参与满减活动的商品
     * 返回以活动id为键的商品列表
     * 
     * @param voucherList 
     * 		voucher_t_activity_id:活动id
     * @param goodsList 
     * 		goods_commonid:商品id
     * 		support_county_id:商品所在县ID
     * @return resultMap ==> key:活动id,value:goodsInfo
     */
    public Map<String,Object> getActivityVoucherGoodsList(List<SyVoucher>  platformList
    		,Map<String,DisOrderGoodsInfo> disOrderGoodsInfo){
    	Map<String,Object> map=new HashMap<String,Object>();
    	//按照活动id对商品进行分组 
        Map<Integer,List<GoodsInfo>> resultMap=null;
    	if(!ObjectUtils.isEmpty(disOrderGoodsInfo)){
    		List<GoodsInfo> goodsList=null;
    		List<Integer> activityIdList=new ArrayList<Integer>();
    		List<Integer> goodsCommonidList=new ArrayList<Integer>();
            List<Long> supportCountyIdList=new ArrayList<Long>();
            if(!ObjectUtils.isEmpty(platformList)) {
            	//获得活动id
                for(SyVoucher syVoucher:platformList){
                	activityIdList.add(syVoucher.getVoucherTActivityId());
                }
            }
           
            //获得商品id和商品所在县id 
            Map<String,List<GoodsInfo>> goodsMap=new HashMap<String,List<GoodsInfo>>();
            //设定循环用的参数
            List<GoodsInfo> goodsInfos=null;
            String commonIdKey=null;
            String areaIdKey=null;
            for(String resultKey:disOrderGoodsInfo.keySet()){
            	goodsList=disOrderGoodsInfo.get(resultKey).getGoodsInfoList();
            	for(GoodsInfo goodsInfo:goodsList){
            		//为了最下面分组用
            		commonIdKey=goodsInfo.getGoodsCommonid()+"";
            		if(!ObjectUtils.isEmpty(commonIdKey)){
            			goodsInfos=goodsMap.get(commonIdKey);
            			if(ObjectUtils.isEmpty(goodsInfos)){
            				goodsInfos=new ArrayList<GoodsInfo>();
            				goodsInfos.add(goodsInfo);
            				goodsMap.put(commonIdKey, goodsInfos);
            			}else{
            				goodsInfos.add(goodsInfo);
            				goodsMap.put(commonIdKey, goodsInfos);
            			}
            		}
            		
            		areaIdKey=goodsInfo.getSupportCountyId()+"";
            		if(!ObjectUtils.isEmpty(areaIdKey)){
            			goodsInfos=goodsMap.get(areaIdKey);
            			if(ObjectUtils.isEmpty(goodsInfos)){
            				goodsInfos=new ArrayList<GoodsInfo>();
            				goodsInfos.add(goodsInfo);
            				goodsMap.put(areaIdKey, goodsInfos);
            			}else{
            				goodsInfos.add(goodsInfo);
            				goodsMap.put(areaIdKey, goodsInfos);
            			}
            			supportCountyIdList.add(Long.parseLong(areaIdKey));
            		}
            		//为了sql查询用
            		goodsCommonidList.add(Integer.parseInt(commonIdKey));
            	}
            }
            
            //如果优惠券模板id为空就返回null
            if(ObjectUtils.isEmpty(activityIdList)){
            	return null;
            }
            
            //优惠券活动参与商品范围(指定商品)
            List<SyVoucherGoods> syVoucherGoodsList=null;
            if(!ObjectUtils.isEmpty(goodsCommonidList)){
            	SyVoucherGoodsExample syVoucherGoodsExample=new SyVoucherGoodsExample();
            	syVoucherGoodsExample.createCriteria().andActivityIdIn(activityIdList).andGoodsCommonidIn(goodsCommonidList);
            	syVoucherGoodsList=syVoucherGoodsMapper.selectByExample(syVoucherGoodsExample);
            }
            
            //优惠券活动参与商品范围(指定区域)
            List<SyVoucherArea> syVoucherAreaList=null;
            if(!ObjectUtils.isEmpty(supportCountyIdList)){
            	SyVoucherAreaExample syVoucherAreaExample=new SyVoucherAreaExample();
            	syVoucherAreaExample.createCriteria().andActivityIdIn(activityIdList).andAreaIdIn(supportCountyIdList);
            	syVoucherAreaList=syVoucherAreaMapper.selectByExample(syVoucherAreaExample);
				logger.info("area syVoucherAreaList"+JSON.toJSONString(syVoucherAreaList));
            }

            
            if(!ObjectUtils.isEmpty(syVoucherGoodsList) || !ObjectUtils.isEmpty(syVoucherAreaList)){
            	resultMap=new HashMap<Integer,List<GoodsInfo>>();
            	Integer key=null;
            	List<GoodsInfo> goodsInfoList=null;
            	
            	//循环商品打折
            	if(!ObjectUtils.isEmpty(syVoucherGoodsList)){
	            	for (SyVoucherGoods syVoucherGoods:syVoucherGoodsList) {
	            		key=syVoucherGoods.getActivityId();

	            		goodsInfoList=goodsMap.get(syVoucherGoods.getGoodsCommonid()+"");
	                	//如果没有设定过该活动id
	                	if(ObjectUtils.isEmpty(resultMap.get(key))){
	                		resultMap.put(key, goodsInfoList);
	                	}else{
	                		resultMap.get(key).addAll(removeList(goodsInfoList, resultMap.get(key)));
	                	}
	                }
            	}
            	//循环区域打折
            	if(!ObjectUtils.isEmpty(syVoucherAreaList)){
            		for (SyVoucherArea syVoucherArea:syVoucherAreaList) {
                		key=syVoucherArea.getActivityId();
                		goodsInfoList=goodsMap.get(syVoucherArea.getAreaId()+"");
                		logger.info("areaId is :"+syVoucherArea.getAreaId()+""+"area goodsInfoList"+JSON.toJSONString(goodsInfoList));
                    	if(ObjectUtils.isEmpty(resultMap.get(key))){
                    		resultMap.put(key, goodsInfoList);
                    	}else{
                    		resultMap.get(key).addAll(removeList(goodsInfoList, resultMap.get(key)));
                    	}
                    }
            	}
				logger.info("area resultMap"+JSON.toJSONString(resultMap));
            }
    	}
    	List<SyVoucher> plist=new ArrayList<SyVoucher>();
    	if(!ObjectUtils.isEmpty(platformList)&&!ObjectUtils.isEmpty(resultMap)) {
        	//获得活动id
            for(SyVoucher syVoucher:platformList){
            	Integer voucherTActivityId = syVoucher.getVoucherTActivityId();
            	if(!ObjectUtils.isEmpty(resultMap.get(voucherTActivityId))) {
            		if(!plist.contains(syVoucher)) {
            			plist.add(syVoucher);
            		}
            		
            	}
            }
        }
    	map.put("platformGoodsInfo", resultMap);
    	map.put("platformvoucherlist", plist);
    	return map;
    }
    
    public List<GoodsInfo> removeList(List<GoodsInfo> goodsInfoList,List<GoodsInfo> oldGoodsInfoList){
    	Iterator<GoodsInfo> it = goodsInfoList.iterator();
		while(it.hasNext()){
			GoodsInfo x = it.next();
			for(GoodsInfo goodsInfoModel2:oldGoodsInfoList){
				if(x.getGoodsId().equals(goodsInfoModel2.getGoodsId())){
					it.remove();
    			}
			}
		}
		return goodsInfoList;
    }
	

	/**
	 * @author 曹勇军
     * 得到可用的活动折扣卷（满减）列表
     */
	public Map<String,List<SyVoucher>> getCanUseActivityVoucherList(Integer memberId,Integer voucherId) {
		
		int currDts=DateUtil.getNowInt();
		
		SyVoucher record=new SyVoucher();
		record.setVoucherOwnerId(memberId);
		List<SyVoucher> voucherList= new ArrayList<SyVoucher>();
		if(ObjectUtils.isEmpty(voucherId)) {
			record.setVoucherState(OrderConstant.VoucherType.UN_USED);//可用的
			record.setVoucherStartDate(currDts);
			record.setVoucherEndDate(currDts);
			voucherList = syVoucherMapper.selectByParam(record);
		}else {
			record.setVoucherId(voucherId);
			voucherList = syVoucherMapper.selectByVid(record);
		}
		
		Map<String,List<SyVoucher>> map=new HashMap<String,List<SyVoucher>>();
		if(ObjectUtils.isEmpty(voucherList)) {
			return map;
		}
		List<SyVoucher> platform=new ArrayList<SyVoucher>();
		List<SyVoucher> store=new ArrayList<SyVoucher>();
		for(SyVoucher sy:voucherList) {
			Integer memberId2 = sy.getMemberId();
		String  voucherStoreType="platform";
			if(!ObjectUtils.isEmpty(memberId2)) {
				SyRole roleAgent = userCorrelationService.getRoleAgent(memberId2);
				if(!ObjectUtils.isEmpty(roleAgent)) {
					 voucherStoreType="agent";
				}else if(!ObjectUtils.isEmpty(userCorrelationService.getVendor(memberId2))
						) {
					 voucherStoreType="syshop";
				}
			}
			//new add
			sy.setVoucherStoreType(voucherStoreType);
			Integer voucherTstoreId = sy.getVoucherTstoreId();
			Integer voucherTActivityId = sy.getVoucherTActivityId();
			Byte voucherTcreatorType = sy.getVoucherTcreatorType();
			if(!ObjectUtils.isEmpty(voucherTcreatorType)&&
					voucherTcreatorType.equals(OrderConstant.creatorType.platform)&&!ObjectUtils.isEmpty(voucherTActivityId)) {
				platform.add(sy);
			}else if(!ObjectUtils.isEmpty(voucherTcreatorType)&&
					voucherTcreatorType.equals(OrderConstant.creatorType.store)&&!ObjectUtils.isEmpty(voucherTstoreId)	) {
				store.add(sy);
			}
		}
		map.put("platform", platform);
		map.put("store", store);
		return map;
	}

	/**
	 * @author 曹勇军
	 * 查询可用的代金券详细信息，包括店铺信息
	 * @param voucherTId   代金券模版编号
	 * @return 返回模板的对象信息包括店铺信息
	 */
	@Override
	public SyVoucherTemplate getUsableTemplateInfo(Integer voucherTId) {
		SyVoucherTemplate syVoucherTemplate=new SyVoucherTemplate();
		syVoucherTemplate.setVoucherTEndDate(DateUtil.getNowInt());
		syVoucherTemplate.setVoucherTState(OrderConstant.VoucherTemplateType.USE);
		syVoucherTemplate.setVoucherTId(voucherTId);
		
		List<SyVoucherTemplate> syVoucherTemplateList=syVoucherTemplateMapper.selectVoucherAndStore(syVoucherTemplate);
		if(syVoucherTemplateList!=null && syVoucherTemplateList.size()>0 ){
			SyVoucherTemplate voucherInfo=syVoucherTemplateList.get(0);
			
			//模版可发放的代金券总数  > 模版已发放的代金券数量
			if(voucherInfo.getVoucherTTotal() > voucherInfo.getVoucherTGiveout()){
				return voucherInfo;
			}
		}
		
		return null;
	}
	/**
	 * 店铺优惠
	 * @param storeid
	 * @return
	 */
	@Override
	public List<SyVoucherTemplate> getVoucherTemByStoreid(Integer storeid)throws CoreServiceException {
		if(ObjectUtils.isEmpty(storeid)) {
			return null;
		}
		SyVoucherTemplate record =new SyVoucherTemplate();
		record.setVoucherTStoreId(storeid);
		record.setVoucherTState(OrderConstant.VoucherTemplateType.USE);
		record.setVoucherTEndDate(DateUtil.getNowInt());
		List<SyVoucherTemplate> list=syVoucherTemplateMapper.selectVoucherByStoreId(record);
		return list;
	}
	/**
	 * @author caoyongjun
     *计算订单满减详细信息:
     * 
     * @param disOrderGoodsInfo:{
     * 			SyGoods:{goodsPrice:金额}
     * 			SyGoodsCommon:{goodsCommonid:公共商品id,supportCountyId:区县id,assistId:是否为集采}
     * 
     * @return cost_mode:{discount:为店铺承担满减费用订单总额中会扣除掉满减的部分,platform_pay:为平台承担满减费用订单总额中不会扣除掉满减的部分}
			   voucher_goods_amount_list:最终的优惠券使用金额的map
			   voucher_order_amount_list:优惠券的使用后的订单金额总
			   voucher_info:最终的优惠券详情             	
			   activit_id:最终的活动id
			   all_voucher_order_amount:最终的优惠券面额
     * 
     */
	@SuppressWarnings("unchecked")
	@Override
	public Map<String,Object> calOrderVoucherInfoDetail(Integer memberId,Map<String,DisOrderGoodsInfo> disOrderGoodsInfo,Integer voucherId)throws CoreServiceException{
		
		Map<String,Object> resultMap= new HashMap<String,Object>();
		
		Map<String, List<SyVoucher>> canUserList = this.getCanUseActivityVoucherList(memberId,voucherId);
		 logger.info("canUserList:"+JSON.toJSONString(canUserList));
		List<SyVoucher> platform=new ArrayList<SyVoucher>();
		List<SyVoucher> store=new ArrayList<SyVoucher>();
		if(!ObjectUtils.isEmpty(canUserList)) {
			store =canUserList.get("store");
			platform =canUserList.get("platform");
		}
		//List<SyVoucher> voucherList
		SyVoucher platformVoucherInfo =null;
		SyVoucher storeVoucherInfo =null;
		Map<Integer,List<GoodsInfo>> activityMap=null;
		Map<Integer, List<GoodsInfo>> storeMap =null;
		List<SyVoucher> sjvoucherlist=new ArrayList<SyVoucher>();
		//店铺
		if(!ObjectUtils.isEmpty(store)) {
			 Map<String, Object> storeVoucherGoodsList = this.getStoreVoucherGoodsList(store, disOrderGoodsInfo);
			 logger.info("voucherlist:"+JSON.toJSONString(storeVoucherGoodsList));
			 storeMap = (Map<Integer, List<GoodsInfo>>)storeVoucherGoodsList.get("storeGoodsInfo");
			// List<SyVoucher> storeVoucherlist =(List<SyVoucher>)storeVoucherGoodsList.get("storevoucherlist");
			// sjvoucherlist.addAll(storeVoucherlist);
			Map<String, Object> oneVocherlist = this.getOneVocher(store, storeMap,"store");
			storeVoucherInfo =(SyVoucher)oneVocherlist.get("onevoucher");
			List<SyVoucher> storeVoucherlist = (List<SyVoucher>)oneVocherlist.get("canUselist");
			if(!CollectionUtils.isEmpty(storeVoucherlist)) {
				 sjvoucherlist.addAll(storeVoucherlist);
			}
			logger.info("voucher:"+JSON.toJSONString(storeVoucherInfo));
		}
		if(!ObjectUtils.isEmpty(platform)) {
			Map<String, Object> platformVoucherGoodsList=this.getActivityVoucherGoodsList(platform, disOrderGoodsInfo);
			if(logger.isDebugEnabled()){
				logger.info("platformvoucher:"+JSON.toJSONString(platformVoucherGoodsList));
			}
			activityMap = (Map<Integer, List<GoodsInfo>>)platformVoucherGoodsList.get("platformGoodsInfo");
			/*List<SyVoucher> plVoucherlist =(List<SyVoucher>)platformVoucherGoodsList.get("platformvoucherlist");
			sjvoucherlist.addAll(plVoucherlist);*/
			Map<String,Object> oneVocherlist = this.getOneVocher(platform, activityMap,"platform");
			platformVoucherInfo =(SyVoucher)oneVocherlist.get("onevoucher");
			List<SyVoucher> plVoucherlist = (List<SyVoucher>)oneVocherlist.get("canUselist");
			if(!CollectionUtils.isEmpty(plVoucherlist)) {
				 sjvoucherlist.addAll(plVoucherlist);
			}
		}
		resultMap.put("actualVoucherList", sjvoucherlist);
		if(logger.isDebugEnabled()) {
			logger.info("order sjvoucherlist :"+JSON.toJSONString(sjvoucherlist));
		}
		SyVoucher finalVoucherInfo=null;
		String type=null;
		if(!ObjectUtils.isEmpty(platformVoucherInfo)&&!ObjectUtils.isEmpty(storeVoucherInfo)) {
			Integer voucherPrice = platformVoucherInfo.getVoucherPrice();
			Integer voucherPrice2 = storeVoucherInfo.getVoucherPrice();
			voucherPrice = ObjectUtils.isEmpty(voucherPrice)?0:voucherPrice;
			voucherPrice2 = ObjectUtils.isEmpty(voucherPrice2)?0:voucherPrice2;
			if(voucherPrice2>=voucherPrice) {
				finalVoucherInfo=storeVoucherInfo;
				type="store";
			}else {
				finalVoucherInfo=platformVoucherInfo;
				type="platform";
			}
		}else if(!ObjectUtils.isEmpty(platformVoucherInfo)&&ObjectUtils.isEmpty(storeVoucherInfo)) {
			finalVoucherInfo=platformVoucherInfo;
			type="platform";
		}else if(ObjectUtils.isEmpty(platformVoucherInfo)&&!ObjectUtils.isEmpty(storeVoucherInfo)) {
			finalVoucherInfo=storeVoucherInfo;
			type="store";
		}
		logger.info("finalVoucherInfo:"+JSON.toJSONString(finalVoucherInfo));
		
		//
		if(!ObjectUtils.isEmpty(finalVoucherInfo)){
			BigDecimal goodsAmount=BigDecimal.ZERO;
				List<GoodsInfo> voucherGoodsList=null;;
				if("platform".equals(type)) {
					voucherGoodsList = activityMap.get(finalVoucherInfo.getVoucherTActivityId());
				}else if("store".equals(type)){
					voucherGoodsList = storeMap.get(finalVoucherInfo.getVoucherTstoreId());
				}
				//排序按价格排序
				this.sortGoodsByPrice(voucherGoodsList,false);

			       if(!ObjectUtils.isEmpty(voucherGoodsList)){
			        	
			        	for(GoodsInfo goodsInfo:voucherGoodsList){
							goodsAmount=goodsAmount.add(goodsInfo.getGoodsMoneyTotal());
						}
			            //计算每个商品的满减金额
			        	//注意除不尽的情况
			        	boolean errorFlag=false;
			        	GoodsInfo goodsInfo=null;
			        	Map<Integer,BigDecimal> finalVoucherGoodsAmountMap=new HashMap<Integer,BigDecimal>();
			        	BigDecimal tempVoucherAmount=BigDecimal.ZERO;
			        	for(int i=0;i<voucherGoodsList.size();i++){
			        		goodsInfo=voucherGoodsList.get(i);
			                if (i!=voucherGoodsList.size()-1) {
			                	BigDecimal tempVoucherGoodsAmount=new BigDecimal(finalVoucherInfo.getVoucherPrice()).multiply(goodsInfo.getGoodsMoneyTotal()).divide(goodsAmount,2, BigDecimal.ROUND_HALF_UP);
								int oucherGoodsAmount = tempVoucherGoodsAmount.intValue();
			                	/*int oucherGoodsAmount = tempVoucherGoodsAmount;*/
								tempVoucherGoodsAmount= new BigDecimal(oucherGoodsAmount);
			                		goodsInfo.setVoucherGoodsAmount(tempVoucherGoodsAmount);
			                	tempVoucherAmount=tempVoucherAmount.add(tempVoucherGoodsAmount);
			                }else{
			                	BigDecimal tempVoucherGoodsAmount=new BigDecimal(finalVoucherInfo.getVoucherPrice()).subtract(tempVoucherAmount);
			                	goodsInfo.setVoucherGoodsAmount(tempVoucherGoodsAmount);
			                }
			                //如果商品总额小于优惠金额则不使用优惠券
			                if(goodsInfo.getGoodsMoneyTotal().compareTo(goodsInfo.getVoucherGoodsAmount())<0){
			                	errorFlag=true;
			                    break;
			                }
			                //集采不参与满减
			                if(goodsInfo.getAssistId()>0){
			                	errorFlag=true;
			                    break;
			                }
			                finalVoucherGoodsAmountMap.put(goodsInfo.getGoodsId(), goodsInfo.getVoucherGoodsAmount());
			            }
			        	if(!errorFlag){
			        		//判断费用承担方式
			                String reslutkey=null;
			                Byte voucherTCostMode = finalVoucherInfo.getVoucherTCostMode();
			                voucherTCostMode = ObjectUtils.isEmpty(voucherTCostMode)?(byte)0:voucherTCostMode;
			                if(VoucherTCostMode.PLATFORM.equals(voucherTCostMode)){
			                	reslutkey="platform_pay";

			                }else if(VoucherTCostMode.STORE.equals(voucherTCostMode)){
			                	reslutkey="store_pay";
			                }
			                if(!ObjectUtils.isEmpty(reslutkey)){
			                	resultMap.put("cost_mode", reslutkey);
			                	resultMap.put("voucher_goods_amount_list", finalVoucherGoodsAmountMap);
			                	
			                	BigDecimal voucherOrderAmount=null;
			                	BigDecimal syVoucherGoodsAmount=null;
			                	Map<String,BigDecimal> voucherOrderAmountMap=new HashMap<String,BigDecimal>();
			                	for(String resultKey:disOrderGoodsInfo.keySet()){
			                		voucherOrderAmount=BigDecimal.ZERO;
			                		for(GoodsInfo voucherGoodsInfo:disOrderGoodsInfo.get(resultKey).getGoodsInfoList()){
			                			Integer goodsId = voucherGoodsInfo.getGoodsId();
				                		syVoucherGoodsAmount=finalVoucherGoodsAmountMap.get(goodsId);
				                        if(ObjectUtils.isEmpty(syVoucherGoodsAmount)){
				                        	syVoucherGoodsAmount=BigDecimal.ZERO;
				                        }
				                        voucherGoodsInfo.setVoucherGoodsAmount(syVoucherGoodsAmount);
				                        voucherOrderAmount=voucherOrderAmount.add(syVoucherGoodsAmount);
				                    }
			                		voucherOrderAmountMap.put(resultKey, voucherOrderAmount);
								//	resultMap.put("voucher_order_amount_list", voucherOrderAmountMap);
			                	}
			                	//by zy
								resultMap.put("voucher_order_amount_list", voucherOrderAmountMap);
								logger.info("voucher voucher_order_amount_list :"+JSON.toJSONString(voucherOrderAmountMap));
			                	resultMap.put("voucher_info", finalVoucherInfo);
			                	resultMap.put("all_voucher_order_amount", finalVoucherInfo.getVoucherPrice());
			                }
			        	}
			        }
				
		}
		logger.info("voucher resultMap :"+JSON.toJSONString(resultMap));
		return resultMap;
	}
	/**
	 * 挑选一张面额最大，过期时间最早，领取时间最早的优惠券
	 */
	@Override
	public Map<String,Object> getOneVocher(List<SyVoucher>voucherList ,Map<Integer,List<GoodsInfo>> activityMap,String type) {
		List<GoodsInfo> goodsInfoList=null;
		BigDecimal goodsAmount=null;
		SyVoucher finalVoucherInfo=null;
		Map<String ,Object> map=new HashMap<String ,Object>();
		//计算金额看是否可以满减(并筛选抵扣最大的获取最终的满减商品,和所使用的优惠券)
		//挑选满减最大的jin'e
		List<SyVoucher> canUselist=new ArrayList<SyVoucher>();
		for(SyVoucher voucher:voucherList){
			if("platform".equals(type)) {
				Integer voucherTActivityId = voucher.getVoucherTActivityId();
				if(!ObjectUtils.isEmpty(activityMap)) {
					goodsInfoList=activityMap.get(voucherTActivityId);
				}
				
			}else if("store".equals(type)){
				Integer voucherTstoreId = voucher.getVoucherTstoreId();
				if(!ObjectUtils.isEmpty(activityMap)) {
					goodsInfoList=activityMap.get(voucherTstoreId);
				}
				logger.info("onevoucher goodsInfoList :"+JSON.toJSONString(goodsInfoList));
			}
			if (!CollectionUtils.isEmpty(goodsInfoList)) {
				//计算每个活动的总金额
				goodsAmount=BigDecimal.ZERO;
				for(GoodsInfo goodsInfo:goodsInfoList){
					goodsAmount=goodsAmount.add(goodsInfo.getGoodsMoneyTotal());
				}
				//选取最大的面额    商品金额>=代金券使用时的订单限额 && finalVoucherInfo==null || 代金券面额 > finalVoucherInfo的面额
				BigDecimal voucherLimit = voucher.getVoucherLimit();
				voucherLimit = ObjectUtils.isEmpty(voucherLimit)?BigDecimal.ZERO:voucherLimit;
				if(goodsAmount.compareTo(voucherLimit) >= 0 && (ObjectUtils.isEmpty(finalVoucherInfo) || voucher.getVoucherPrice() > finalVoucherInfo.getVoucherPrice())){
					finalVoucherInfo=voucher;
				}
				if(goodsAmount.compareTo(voucherLimit) >= 0 ) {
					//可以使用的优惠券list
					canUselist.add(voucher);
				}
				
			}
		}
		//满减金额相同的 =========by zy
		List<SyVoucher> maxlist=new ArrayList<SyVoucher>();
		if(!ObjectUtils.isEmpty(finalVoucherInfo)&&!ObjectUtils.isEmpty(canUselist)&&canUselist.size()>1) {
			Integer voucherEndDate=0;
			for(SyVoucher voucher:canUselist) {
				//取最小的过期日期时间
				Integer voucherPrice = voucher.getVoucherPrice();
				Integer voucherPrice2 = finalVoucherInfo.getVoucherPrice();
				voucherPrice = ObjectUtils.isEmpty(voucherPrice)?0:voucherPrice;
				voucherPrice2 = ObjectUtils.isEmpty(voucherPrice2)?0:voucherPrice2;
				if(voucherPrice.equals(voucherPrice2)) {
					Integer voucherEndDate2 = voucher.getVoucherEndDate();
					voucherEndDate2 = ObjectUtils.isEmpty(voucherEndDate2)?0:voucherEndDate2;
					if(voucherEndDate==0 ||voucherEndDate2<voucherEndDate) {
						voucherEndDate = voucherEndDate2;
						finalVoucherInfo =voucher;
					}
					maxlist.add(voucher);
				}
			}
			List<SyVoucher> endlist=new ArrayList<SyVoucher>();
			//满减金额相同的 中选到期日最近的
			//取最近的领取时间
			Integer voucherActiveDate=0;
			if(!ObjectUtils.isEmpty(maxlist)&&maxlist.size()>1) {
				for(SyVoucher voucher:maxlist) {
					Integer voucherEndDate2 = voucher.getVoucherEndDate();
					voucherEndDate2 = ObjectUtils.isEmpty(voucherEndDate2)?0:voucherEndDate2;
					if(voucherEndDate2.equals(voucherEndDate)) {
						Integer voucherActiveDate2 = voucher.getVoucherActiveDate();
						voucherActiveDate2 = ObjectUtils.isEmpty(voucherActiveDate2)?0:voucherActiveDate2;
						if(voucherActiveDate==0 ||voucherActiveDate2<voucherActiveDate) {
							voucherActiveDate =voucherActiveDate2;
							finalVoucherInfo =voucher;
						}
						endlist.add(voucher);
					}
					
				}
			}
			
			if(!ObjectUtils.isEmpty(endlist)&&endlist.size()>1) {
				for(SyVoucher voucher:endlist) {
					Integer voucherActiveDate2 = voucher.getVoucherActiveDate();
					voucherActiveDate2 = ObjectUtils.isEmpty(voucherActiveDate2)?0:voucherActiveDate2;
					if(voucherActiveDate2.equals(voucherActiveDate)) {
						finalVoucherInfo =voucher;
					}
					
				}
			}
		}
		map.put("onevoucher", finalVoucherInfo);
		map.put("canUselist", canUselist);
		logger.info("onevoucher final :"+JSON.toJSONString(finalVoucherInfo));
		logger.info("canUselist :"+JSON.toJSONString(canUselist));
	//==========end by zy
	return map;
	}

	/**
	 *
	 * @param list
	 * @param desc true 降序 flase 升序
	 */
	public   void sortGoodsByPrice( List<GoodsInfo> list,boolean desc){
		for(int i=0;i<list.size();i++){

			for(int j=i+1;j<list.size();j++){
				if(desc){
					if(list.get(j).getGoodsPrice().compareTo(  list.get(i).getGoodsPrice())>0){
						GoodsInfo gi = list.get(j);
						list.set(j,list.get(i));
						list.set(i,gi);
					}
				}else{
					if(list.get(j).getGoodsPrice().compareTo(  list.get(i).getGoodsPrice())<0){
						GoodsInfo gi = list.get(j);
						list.set(j,list.get(i));
						list.set(i,gi);
					}
				}
			}
		}

	}




	
}
