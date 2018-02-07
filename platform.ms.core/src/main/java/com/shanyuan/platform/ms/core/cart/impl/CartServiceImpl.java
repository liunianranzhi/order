package com.shanyuan.platform.ms.core.cart.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.shanyuan.platform.ms.core.goods.GoodsListService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import com.alibaba.fastjson.JSON;
import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.base.common.util.ImageUtil;
import com.shanyuan.platform.ms.base.common.util.OrderUtil;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.cart.CartService;
import com.shanyuan.platform.ms.core.cart.bo.CartBO;
import com.shanyuan.platform.ms.core.cart.bo.CartGoodsBo;

import com.shanyuan.platform.ms.core.cart.bo.GoodsCartBO;
import com.shanyuan.platform.ms.core.cart.bo.SyCartBO;
import com.shanyuan.platform.ms.core.cart.bo.SyGoodsCartBO;
import com.shanyuan.platform.ms.core.cart.impl.exceptype.CartServiceExcepType;
import com.shanyuan.platform.ms.core.constant.GoodsConstant;
import com.shanyuan.platform.ms.core.constant.OrderConstant;
import com.shanyuan.platform.ms.core.constant.ProjectConstant;
import com.shanyuan.platform.ms.core.constant.ProjectConstant.ProjectType;
import com.shanyuan.platform.ms.core.goods.SyGoodsCommonService;
import com.shanyuan.platform.ms.core.goods.SyGoodsService;
import com.shanyuan.platform.ms.core.goods.impl.exceptype.GoodsExcepType;
import com.shanyuan.platform.ms.core.order.bo.GoodsInfo;
import com.shanyuan.platform.ms.core.order.impl.exceptype.OrderServiceExcepType;
import com.shanyuan.platform.ms.core.store.SyStoreService;
import com.shanyuan.platform.ms.core.store.bo.StoreBo;
import com.shanyuan.platform.ms.core.topic.SyTopicService;
import com.shanyuan.platform.ms.core.topic.bo.TopicGoodsInfo;
import com.shanyuan.platform.ms.dao.cart.entity.SyCart;
import com.shanyuan.platform.ms.dao.cart.entity.SyCartExample;
import com.shanyuan.platform.ms.dao.cart.mapper.SyCartMapper;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoods;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsExample;
import com.shanyuan.platform.ms.dao.goods.mapper.SyGoodsMapper;


/**
 * @author 曹勇军
 *
 */
@Component
public class CartServiceImpl implements CartService{

	private static final Logger logger = LoggerFactory.getLogger(CartServiceImpl.class);
	
	@Autowired
	private SyCartMapper syCartMapper;
	
	@Autowired
	private SyGoodsMapper syGoodsMapper;
	
	@Autowired
	private SyGoodsService syGoodsService;
	
	
	@Autowired
	private SyStoreService syStoreService;
	
	@Autowired
	private SyGoodsCommonService syGoodsCommonService;
	@Autowired
	private SyTopicService topicService;
	@Autowired
	private GoodsListService goodsListService;

	//===================================by zy start
	/**
	 * by zy
	 */
	public Map<String , Object> cartListByMid(Integer memberId,Integer pageSize,Integer currentPage,String orderBy) throws CoreServiceException{
		Integer selectCartNum = this.selectCartNum(memberId,null);
		Map<String , Object> data =new HashMap<String , Object> ();
		pageSize = ObjectUtils.isEmpty(pageSize)?20:pageSize;
		currentPage = ObjectUtils.isEmpty(currentPage)?1:currentPage;
		if(selectCartNum<=0) {
			return data;
		}
		
		List<SyCart> cartList = this.getCartListByMid(memberId, null,pageSize,currentPage,orderBy);
		if(ObjectUtils.isEmpty(cartList)) {
			return data;
		}
		boolean haNext = OrderUtil.hasNext(currentPage, pageSize, selectCartNum);
		String hasNext = haNext?"Y":"N";
		List<Integer> goodsIdList=new ArrayList<Integer>();
		Map<Integer,Integer> goodsNumMap=new HashMap<Integer,Integer>();
		List<Integer> cartIdList=new ArrayList<Integer>();
			for(SyCart cart:cartList){
				 Short goodsNum2 = cart.getGoodsNum();
				 cartIdList.add(cart.getCartId());
				Integer znum=ObjectUtils.isEmpty(goodsNum2)?0:goodsNum2.intValue();
				if(!ObjectUtils.isEmpty(goodsNumMap.get(cart.getGoodsId()))) {
					Integer cnum = goodsNumMap.get(cart.getGoodsId());
					znum += cnum;
				}
				goodsNumMap.put(cart.getGoodsId(),znum);
				goodsIdList.add(cart.getGoodsId());
			}
		List<SyGoods> goodsInfos = syGoodsService.getGoodsList(goodsIdList, "goods_id DESC", GoodsConstant.QueryType.QUERY_ALL);
		List<Integer> goodsCommonIdList=new ArrayList<Integer>();
		for(SyGoods sg:goodsInfos) {
			Integer goodsCommonid = sg.getGoodsCommonid();
			if(!goodsCommonIdList.contains(goodsCommonid)) {
				goodsCommonIdList.add(goodsCommonid);
			}
		}
		Map<Integer,SyGoodsCommon> goodsCommonMap=new HashMap<Integer,SyGoodsCommon>();
		List<SyGoodsCommon> goodsCommonList = syGoodsCommonService.getGoodsCommonInfo(goodsCommonIdList);
		for(int i=0;i<goodsCommonList.size();i++) {
			Integer goodsCommonid = goodsCommonList.get(i).getGoodsCommonid();
			goodsCommonMap.put(goodsCommonid,goodsCommonList.get(i));
		}
		
		Map<Integer, CartGoodsBo> goodsList = this.getGoodsList(goodsInfos,goodsNumMap,goodsCommonMap,memberId);
		//以cartid为维度的CartGoodsBo
		Map<String, List<CartGoodsBo>> cartMap=new HashMap<String,List<CartGoodsBo>>();
        List<Integer> publisherids=  new ArrayList<Integer>();
        List<Integer> syshopids=  new ArrayList<Integer>();
        Map<String ,String>  ownertypes= new HashMap<String ,String>();
		for(SyCart cart:cartList){
			boolean storageState= true;
			Integer cartId = cart.getCartId();
			
			Integer goodsId = cart.getGoodsId();
			CartGoodsBo cartGoodsBo = goodsList.get(goodsId);

            if(ObjectUtils.isEmpty(cartGoodsBo)) {
				logger.info("没有购物车中的商品, cartId={} goodsId={}", cartId,goodsId);
				throw new CoreServiceException(OrderServiceExcepType.CART_EMPTY,"没有购物车中的商品！");
			}
			Integer goodsStorge = cartGoodsBo.getGoodsStorge();
			Short goodsNum = cart.getGoodsNum();
			Integer gn=ObjectUtils.isEmpty(goodsNum)?0:goodsNum.intValue();
			if(gn>goodsStorge) {
				storageState=false;
			}
			String checked = ObjectUtils.isEmpty(cart.getChecked())?"0":cart.getChecked().toString();
			//每个购物车的库存状态
			cartGoodsBo.setChecked(checked);
			cartGoodsBo.setStorageState(storageState);
			cartGoodsBo.setGoodsNum(gn);
			cartGoodsBo.setCartId(cartId);
			List<CartGoodsBo> list=new ArrayList<CartGoodsBo>();
			String orderKey = cartGoodsBo.getOrderKey();
			if(!ObjectUtils.isEmpty(cartMap.get(orderKey))) {
				 list = cartMap.get(orderKey);
				 list.add(cartGoodsBo);
			}else {
				 list.add(cartGoodsBo);
			}
            String ownerType = cartGoodsBo.getOwnerType();
            Integer publisherId = cartGoodsBo.getPublisherId();

            if(OrderConstant.orderType.order_agent.equals(ownerType)){
                publisherids.add(publisherId);
                ownertypes.put(orderKey,ownerType);
            }else if(OrderConstant.orderType.order_poor.equals(ownerType)){
                publisherids.add(publisherId);
                ownertypes.put(orderKey,ownerType);
            }else if(OrderConstant.orderType.order_syshop.equals(ownerType)){
                syshopids.add(publisherId);
                ownertypes.put(orderKey,ownerType);
            }else if(OrderConstant.orderType.order_biz.equals(ownerType)){
                ownertypes.put(orderKey,ownerType);
            }

			cartMap.put(orderKey, list);
			
		}
		data.put("cartMap", cartMap);
		data.put("hasNext", hasNext);
		data.put("publisherids", publisherids);
		data.put("syshopids", syshopids);
		data.put("ownertypes", ownertypes);
		return data ;
	}
	/**@author zy
	 * 以goodsId为维度的CartGoodsBo
	 * @param goodsInfos
	 * @param goodsNumMap
	 * @param goodsCommonMap
	 * @param storeMap
	 * @param memberId
	 * @return
	 * @throws CoreServiceException
	 */
	public Map<Integer,CartGoodsBo> getGoodsList(List<SyGoods> goodsInfos,Map<Integer,Integer> goodsNumMap,Map<Integer,SyGoodsCommon> goodsCommonMap,
			Integer memberId) throws CoreServiceException{
		Map<Integer,CartGoodsBo> map=new HashMap<Integer,CartGoodsBo>();
		for(int i=0;i<goodsInfos.size();i++) {
			SyGoods syGoods = goodsInfos.get(i);
			Integer goodsId = syGoods.getGoodsId();
			Integer goodsCommonid = goodsInfos.get(i).getGoodsCommonid();
			SyGoodsCommon goodsCommon=goodsCommonMap.get(goodsCommonid);
			Integer goodsNum = goodsNumMap.get(goodsId);
			if(ObjectUtils.isEmpty(goodsCommon)) {
				logger.info("goodscommon 为空! goodsId=",goodsId);
				throw new CoreServiceException(OrderServiceExcepType.CART_EMPTY,"goodsId:="+goodsId+"goodscommon 为空!");
			}
			CartGoodsBo cartGoodsBo = this.getCartGoodsBo(syGoods, goodsCommon, memberId, goodsNum);
			map.put(goodsId, cartGoodsBo);
		}
		return map;
	}
	/**
	 * @author zy
	 * @param syGoods
	 * @param goodsCommon
	 * @param memberId
	 * @param goodsNum
	 * @return
	 * @throws CoreServiceException
	 */
	//转为cartGoodBo
	public CartGoodsBo getCartGoodsBo(SyGoods syGoods ,SyGoodsCommon goodsCommon,Integer memberId,Integer goodsNum) throws CoreServiceException{
		GoodsInfo goodsInfo =new GoodsInfo(syGoods,goodsCommon,goodsNum);
		CartGoodsBo cartBo=new CartGoodsBo();
		Integer goodsId = goodsInfo.getGoodsId();
		cartBo.setGoodsId(goodsId);
		cartBo.setGoodsCommonId(goodsInfo.getGoodsCommonid());
		Byte goodsState = syGoods.getGoodsState();
		boolean state=true;
		goodsState =ObjectUtils.isEmpty(goodsState)?GoodsConstant.GoodsState.GOODS_STATE0:goodsState;
		Byte goodsVerify = syGoods.getGoodsVerify();
		goodsVerify =ObjectUtils.isEmpty(goodsVerify)?GoodsConstant.GoodsVerify.GOODS_VERIFY0:goodsVerify;
		if(goodsState.equals(GoodsConstant.GoodsState.GOODS_STATE1)
				&&goodsVerify.equals(GoodsConstant.GoodsVerify.GOODS_VERIFY1)) {
		}else {
			//下架
			state= false;
		}
		TopicGoodsInfo topicGoods = topicService.getTopicGoods(goodsId);
		String goodsStatus = topicGoods.getGoodsStatus();
		BigDecimal goodsPrice = syGoods.getGoodsPrice();
		Long goodsStorage = goodsInfo.getGoodsStorage();
		Integer actStorage =ObjectUtils.isEmpty(goodsStorage)?0:Integer.parseInt(goodsStorage.toString());
		String isDailylimited="0";
		String startTime="";
		//判断活动价
		if(GoodsConstant.TopicStatus.can_buy.equals(goodsStatus)) {
			//活动价
			goodsPrice = topicGoods.getActGoodsPrice();
			actStorage = topicGoods.getActStorage();
			isDailylimited=topicGoods.getDailyLimited();
			startTime=DateUtil.getDay()+" "+topicGoods.getSaleStartTime(); //
		}
		cartBo.setIsDailylimited(isDailylimited);
		cartBo.setStartTime(startTime);
		cartBo.setTopicStatus(goodsStatus);
		Integer wholesaleNum = goodsCommon.getWholesaleNum();
		Byte wType = goodsCommon.getWholesaleType();
		String WholesaleType= ObjectUtils.isEmpty(wType)?"0":wType.toString();
		cartBo.setWholesaleType(WholesaleType);
		wholesaleNum = ObjectUtils.isEmpty(wholesaleNum)?0:wholesaleNum;
		cartBo.setWholesaleNum(wholesaleNum);
		
		BigDecimal wholesalePrice = syGoods.getWholesalePrice();
		goodsPrice = ObjectUtils.isEmpty(goodsPrice)?BigDecimal.ZERO:goodsPrice;
		wholesalePrice = ObjectUtils.isEmpty(wholesalePrice)?BigDecimal.ZERO:wholesalePrice;
		cartBo.setGoodsName(goodsInfo.getGoodsName());
		cartBo.setGoodsStorge(actStorage);
		cartBo.setGoodsProjectType(goodsInfo.getGoodsProjectType());
		cartBo.setGoodsPrice(goodsPrice);
		cartBo.setWholesalePrice(wholesalePrice);
		cartBo.setState(state);
		cartBo.setStoreName(goodsInfo.getStoreName());
		cartBo.setStoreId(goodsInfo.getStoreId());
		cartBo.setPublisherId(goodsInfo.getPublisherId());
		Integer assistid=goodsInfo.getAssistId();
		Integer gtype=goodsInfo.getGoodsProjectType();
        String ownerType = goodsInfo.getOwnerType();
        String goodsOwnerType = goodsListService.getGoodsOwnerType(gtype, assistid, ownerType);
        cartBo.setOwnerType(goodsOwnerType);
        cartBo.setAssistId(assistid);
		cartBo.setBizOperationMid(goodsInfo.getBizOperationMid());
		cartBo.setMaxBuyNum(syGoods.getMaxBuyNum());
		String goodsImgFullUrl = ImageUtil.getGoodsImgFullUrl(syGoods.getGoodsImage(), syGoods.getStoreId(), "240", goodsCommon.getGoodsProjectType());
		cartBo.setGoodsimage(syGoods.getGoodsImage());
		cartBo.setImage(goodsImgFullUrl);
		Integer haveBuyNum = syGoodsCommonService.getHaveBuyNum(goodsInfo,memberId);
		cartBo.setHaveBuyNum(haveBuyNum);
		cartBo.setOrderKey(goodsInfo.getDisOrderKey());
        
		if(logger.isDebugEnabled()) {
			logger.info("cart getCartGoodsBo:"+JSON.toJSONString(cartBo));
		}
		
		return cartBo;
	}
	/**
	 * @author zy
	 * @param memberId
	 * @param type
	 * @return
	 * @throws CoreServiceException
	 */
	public List<SyCart> getCartListByMid(Integer memberId,String type,Integer pageSize,Integer currentPage,String orderBy ) throws CoreServiceException{
		pageSize = ObjectUtils.isEmpty(pageSize)?20:pageSize;
		currentPage = ObjectUtils.isEmpty(currentPage)?1:currentPage;
		Integer sizeStart= (currentPage-1)*pageSize;
		orderBy = ObjectUtils.isEmpty(orderBy)?" cart_id DESC LIMIT "+sizeStart+" , "+pageSize:orderBy+" LIMIT "+sizeStart+" , "+pageSize;
		//String type 预留字段
		SyCartExample syCartExample=new SyCartExample();
		List<Integer> projectTypeList=new ArrayList<Integer>();
		projectTypeList.add(ProjectConstant.ProjectType.PROJECT_TYPE_SUPPORT_POOR);
		projectTypeList.add(ProjectConstant.ProjectType.PROJECT_TYPE_SY_SHOP);
		syCartExample.createCriteria().andBuyerIdEqualTo(memberId).andGoodsProjectTypeIn(projectTypeList);
		syCartExample.setOrderByClause(orderBy);	
    	List<SyCart> cartList=syCartMapper.selectByExample(syCartExample);
		return cartList;
	}
	/**
	 * @author zy
	 * @param memberId
	 * @param goodsId
	 * @param goodsNum
	 * @param userstoreId
	 * @return
	 * @throws CoreServiceException
	 */
	public Integer addCartInfo(Integer memberId,Integer goodsId,Integer goodsNum,List<Integer> userstoreId) throws CoreServiceException {
		//校验是否可以加入
		CartGoodsBo syGoods = this.checkGoods(memberId, goodsId, goodsNum, userstoreId);
		//判断是否已经存在
		SyCartExample  example = new SyCartExample();
		example.createCriteria().andBuyerIdEqualTo(memberId).andGoodsIdEqualTo(goodsId);
		List<SyCart> selectByExample = syCartMapper.selectByExample(example);
		//已经存在这个人的这个商品，修改商品数量
		Integer row=0;
		if(!ObjectUtils.isEmpty(selectByExample)) {
			Integer cartId = selectByExample.get(0).getCartId();
			 row = this.updateNumAndState(cartId,memberId,goodsNum.shortValue());
		}else {
			SyCart	syCart=new SyCart();
			
			syCart.setBuyerId(memberId);
			syCart.setGoodsNum(goodsNum.shortValue());
			syCart.setStoreId(syGoods.getStoreId());
			syCart.setStoreName(syGoods.getStoreName());
			syCart.setGoodsName(syGoods.getGoodsName());
			syCart.setGoodsPrice(syGoods.getGoodsPrice());
			syCart.setGoodsImage(syGoods.getGoodsimage());
			syCart.setGoodsProjectType(syGoods.getGoodsProjectType());
			syCart.setGoodsId(goodsId);
			syCart.setChecked((byte)1);
			syCart.setNewAddState((byte)0);
			syCart.setBlId(0);
			syCart.setProjId(0);
			row = this.addCart(syCart);
		}
	
		if(row<1) {
			logger.info("加入购物车失败 ! goodsId=",goodsId);
			throw new CoreServiceException(CartServiceExcepType.INSERT_CART_FAIL,"商品"+syGoods.getGoodsName()+"加入购物车失败!");
		}
		return row;
	}
	/**
	 * @author zy
	 * @param memberId
	 * @param goodsId
	 * @param goodNum
	 * @return
	 * @throws CoreServiceException
	 */
	public CartGoodsBo checkGoods(Integer memberId,Integer goodsId,Integer goodNum,List<Integer> userstoreId) throws CoreServiceException {
		if(ObjectUtils.isEmpty(goodNum)||ObjectUtils.isEmpty(goodsId)||ObjectUtils.isEmpty(memberId)) {
			logger.info("memberId 或goodsId或 goodNum 为空! goodsId={},goodNum={},memberId={}",goodsId,goodNum,memberId);
			throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"memberId 或goodsId或 goodNum 为空!");
		}
		if(goodNum<=0) {
			logger.info(" goodNum 不能小于等于0!goodNum={}",goodNum);
			throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER," goodNum 不能小于等于0!");
		}
		SyGoods goods = syGoodsMapper.selectByPrimaryKey(goodsId);
		if(ObjectUtils.isEmpty(goods)) {
			logger.info("goods 为空! goodsId=",goodsId);
			throw new CoreServiceException(OrderServiceExcepType.GOODS_MISSING,"goodsId:="+goodsId+"goods 为空!");
		}
		Integer goodsCommonid = goods.getGoodsCommonid();
		if(ObjectUtils.isEmpty(goodsCommonid)) {
			logger.info("goodsCommonid 为空! goodsId=",goodsId);
			throw new CoreServiceException(OrderServiceExcepType.GOODS_MISSING,"goodsId:="+goodsId+"的 goodsCommonid 为空!");
		}
	    SyGoodsCommon goodscommon = syGoodsCommonService.getById(goodsCommonid);
	    if(ObjectUtils.isEmpty(goodscommon)) {
			logger.info("goodscommon 为空! goodsCommonid=",goodsCommonid);
			throw new CoreServiceException(OrderServiceExcepType.GOODS_MISSING,"goodsCommonid:="+goodsCommonid+"goodsCommon 为空!");
		}
	    CartGoodsBo cartGoodsBo = this.getCartGoodsBo(goods, goodscommon, memberId, goodNum);
	    String topicStatus = cartGoodsBo.getTopicStatus();
	    Long goodsStorage = goods.getGoodsStorage();
	    String goodsName = goods.getGoodsName();
	    Integer storage = ObjectUtils.isEmpty(goodsStorage)?0:Integer.parseInt(goodsStorage.toString());
	    if(GoodsConstant.TopicStatus.can_buy.equals(topicStatus)) {
	    	storage = cartGoodsBo.getGoodsStorge();
	    	if(storage<goodNum) {
				logger.info("goods 活动库存不足! goodsId=",goodsId);
				throw new CoreServiceException(OrderServiceExcepType.STOCK_COUNT_NOT_ENOUGH_FAIL,"活动商品:"+goodsName+"库存不足,请修改购买数量~");
			}
	    }else {
	    	Byte goodsState = goods.getGoodsState();
			Byte goodsVerify = goods.getGoodsVerify();
	    	if(!goodsState.equals(GoodsConstant.GoodsState.GOODS_STATE1)||
					!goodsVerify.equals(GoodsConstant.GoodsVerify.GOODS_VERIFY1)) {
				logger.info("goods 已下架! goodsId=",goodsId);
				throw new CoreServiceException(OrderServiceExcepType.NO_ONLINE_GOODS,"goodsId:="+goodsId+"已下架!");
			}
	    	if(storage<goodNum) {
				logger.info("goods 库存不足! goodsId=",goodsId);
				throw new CoreServiceException(OrderServiceExcepType.STOCK_COUNT_NOT_ENOUGH_FAIL,"商品:"+goodsName+"库存不足,请修改购买数量~");
			}
	    }
		Integer storeId = goods.getStoreId();
		if(ObjectUtils.isEmpty(storeId)) {
			logger.info("goods 库存不足! goodsId=",goodsId);
			throw new CoreServiceException(GoodsExcepType.STORE_MISSING,"goodsId:="+goodsId+"没有商店!");
		}
		if(!ObjectUtils.isEmpty(userstoreId)) {
			for(Integer sid:userstoreId) {
				if(sid.equals(storeId)) {
					logger.info("不能购买自己的商品! storeId=",storeId);
					throw new CoreServiceException(OrderServiceExcepType.CANNOT_BUY_SELF_GOODS,"不能购买自己的商品~");
				}
				
			}
			
		}
		
		Integer goodsProjectType = cartGoodsBo.getGoodsProjectType();
		if(goodsProjectType.equals(OrderConstant.ProjectType.PROJECT_TYPE_SY_SHOP)) {
			Integer haveBuyNum = cartGoodsBo.getHaveBuyNum();
			Integer maxBuyNum = cartGoodsBo.getMaxBuyNum();
			maxBuyNum =ObjectUtils.isEmpty(maxBuyNum)?0:maxBuyNum;
			if(maxBuyNum !=0&&(haveBuyNum+goodNum>maxBuyNum)) {
				logger.info("善源商场超过最大购买数! 已经购买过：haveBuyNum={},最多购买maxBuyNum= {},现在购买goodNum={}",haveBuyNum,maxBuyNum,goodNum);
				throw new CoreServiceException(OrderServiceExcepType.SYSHOP_MAX_BUYNUM_FAIL,"善源商场超过最大购买数!最多购买"+(maxBuyNum-haveBuyNum));
			}
		}
		return cartGoodsBo;
	}
	/**
	 * 更新购物车
	 * by zy
	 */
	public SyCartBO  updateNewCart(Integer cartId,Integer memberId,Integer goodsNum,String ischeck )throws CoreServiceException {
		if(ObjectUtils.isEmpty(cartId)||ObjectUtils.isEmpty(memberId)) {
			logger.info("cartId 或memberId 为空 ，cartId={},memberId={}",cartId,memberId);
			throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"cartId 或memberId 为空!");
		}
		SyCart cart = syCartMapper.selectByPrimaryKey(cartId);
		if(ObjectUtils.isEmpty(cart)) {
			logger.info("此购物车 为空 ，cartId={},memberId={}",cartId,memberId);
			throw new CoreServiceException(OrderServiceExcepType.CART_EMPTY,"此购物车 为空!");
		}
		if(ObjectUtils.isEmpty(goodsNum)&&ObjectUtils.isEmpty(ischeck)) {
			logger.info("不是编辑数量或者更新选中操作 ，cartId={},memberId={}",cartId,memberId);
			throw new CoreServiceException(CartServiceExcepType.ACTION_ERROR,"不是编辑数量或者更新选中操作");
		}
		goodsNum =ObjectUtils.isEmpty(goodsNum)?1:goodsNum;
		ischeck =ObjectUtils.isEmpty(ischeck)?"0":ischeck;
		if(!"0".equals(ischeck)&&!"1".equals(ischeck)) {
			logger.info("选中状态不正确 ，cartId={},ischeck={}",cartId,ischeck);
			throw new CoreServiceException(CartServiceExcepType.CHECKED_ERROR,"选中状态不正确！");
		}
		Integer goodsId = cart.getGoodsId();
		this.checkGoods(memberId, goodsId, goodsNum, null);
		SyCart record=new SyCart();
		record.setCartId(cartId);
		record.setBuyerId(memberId);
		record.setGoodsNum(goodsNum.shortValue());
		record.setChecked(new Byte(ischeck));
		SyCartBO editCart = this.editCart(record);
		if(ObjectUtils.isEmpty(editCart)) {
			logger.info("更新购物车失败! cart_id",cartId);
			throw new CoreServiceException(CartServiceExcepType.UPDATE_CART_FAIL,"更新购物车失败");
		}
		return editCart;
	}
	public SyCartBO  editCart(SyCart record)throws CoreServiceException {
		Integer cartId = record.getCartId();
		Integer buyerId = record.getBuyerId();
		SyCartBO numCart =null;
		try {
			SyCartExample syCartExample=new SyCartExample();
			syCartExample.createCriteria()
				.andCartIdEqualTo(cartId)
				.andBuyerIdEqualTo(buyerId);
			int  row = syCartMapper.updateByExampleSelective(record, syCartExample);
			if(row>0) {
				numCart = this.getNumCart(record);
			 }else {
				 logger.info("没有这个购物车记录! cart_id",cartId);
				 throw new CoreServiceException(OrderServiceExcepType.CART_EMPTY,"没有这个购物车记录"+cartId);
			 }
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			logger.info("更新购物车失败! cart_id",cartId);
			throw new CoreServiceException(CartServiceExcepType.UPDATE_CART_FAIL,"更新购物车失败");
		}
		
	  return numCart;
  }
	/**
	 * 修改选中状态
	 * @param goodsid
	 * @param buyerid
	 * @param checked
	 * @throws CoreServiceException
	 */
	public void updateChecked(Integer goodsid,Integer buyerid,byte checked)throws CoreServiceException {
		SyCartExample syCartExample=new SyCartExample();
		
		try {
			if(!ObjectUtils.isEmpty(goodsid)&&!ObjectUtils.isEmpty(buyerid)) {
			syCartExample.createCriteria()
				.andGoodsIdEqualTo(goodsid)
				.andBuyerIdEqualTo(buyerid);
			SyCart record = new SyCart();
			checked = ObjectUtils.isEmpty(checked)?(byte)0:checked;
			record.setChecked(checked);
			syCartMapper.updateByExampleSelective(record, syCartExample);
			}
		
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			logger.info("更新购物车失败! goodsid={},buyerid={}",goodsid,buyerid);
			throw new CoreServiceException(CartServiceExcepType.UPDATE_CART_FAIL,"更新商品选中状态失败");
		}
	}
	 public Integer	updateNumAndState(Integer cartId,Integer buyerId,Short goodsNum )throws CoreServiceException{
		int  row = 0;
		try {
			SyCart record =new SyCart();
			record.setCartId(cartId);
			record.setGoodsNum(goodsNum);
			record.setBuyerId(buyerId);
			record.setNewAddState((byte)1);
			row = syCartMapper.updateNumAndState(record);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			logger.info("更新购物车失败! cart_id",cartId);
			throw new CoreServiceException(CartServiceExcepType.UPDATE_CART_FAIL,"更新商品数量失败");
		}
		return row;
	}
	/**
	 * 查询购物车条数
	 */
	public Integer selectCartNum(Integer  buyerId,Byte checked) throws CoreServiceException{
		SyCart cart=new SyCart();
		cart.setBuyerId(buyerId);
		cart.setChecked(checked);
		Integer num = syCartMapper.selectCartNum(cart);
		return num;
	}
	
	//===================================by zy end
	/**
	 * @author 曹勇军
	 * 加入购物车，登录后存入购物车表
	 */
	@Override
	public Integer addCart(SyCart syCart) throws CoreServiceException {
		int result=0;
		try {
			result=syCartMapper.insertSelective(syCart);
		} catch (Exception e) {
			logger.error("addcart_error:",e);
			throw new CoreServiceException(CartServiceExcepType.INSERT_CART_FAIL,"添加购物车失败");
		}
		return result;
	}
	
	/**
	 * @author 曹勇军
	 * 删除购物车某一个单件
	 */
	@Transactional(timeout=36000,rollbackFor=Throwable.class)
	public SyCartBO deleteCartById(Integer cartId,Integer buyerId) throws CoreServiceException {
		SyCartBO syCartBO=null;
		Integer result=0;
		try {
			//需要验证是否本人购物侧，操作是否越权
			SyCartExample cartExample=new SyCartExample();
			cartExample.createCriteria().andCartIdEqualTo(cartId).andBuyerIdEqualTo(buyerId);
			 result=syCartMapper.deleteByExample(cartExample);
			 if(result>0) {
				 SyCart record=new SyCart();
				 record.setBuyerId(buyerId);
				 record.setChecked((byte)1);
				 syCartBO = this.getNumCart(record);
			 }else {
				 logger.info("没有这个购物车记录! cart_id",cartId);
				 throw new CoreServiceException(OrderServiceExcepType.CART_EMPTY,"没有这个购物车记录"+cartId);
			 }
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			logger.info("删除失败! cart_id",cartId);
			throw new CoreServiceException(CartServiceExcepType.DELETE_CART_FAIL,"删除购物车"+cartId);
		}
		return syCartBO;
	}
	/**
	 * @author caoyongjun
	 * @param cartIdList
	 * @param buyerId
	 * @return
	 * @throws CoreServiceException
	 */
	@Override
	public void deleteCartByCartIdList(List<Integer> cartIdList,Integer buyerId) throws CoreServiceException{
		//需要验证是否本人购物侧，操作是否越权
		SyCartExample cartExample=new SyCartExample();
		cartExample.createCriteria().andBuyerIdEqualTo(buyerId).andCartIdIn(cartIdList);
		try {
			syCartMapper.deleteByExample(cartExample);
		} catch (Exception e) {
			logger.error("deleteCartByCartIdList_error:"+buyerId,e);
			logger.info("删除购物车失败 buyerId={},cartIdList={}:",buyerId,cartIdList.toString());
			throw new CoreServiceException(CartServiceExcepType.CLEAR_CART_FAIL,"删除购物车失败",e);
		}
	}
	
	/**
	 * @author 曹勇军
	 * 计算购物车金额
	 */
	@Transactional(timeout=36000,rollbackFor=Throwable.class)
	public  SyCartBO getNumCart(SyCart record) throws CoreServiceException {
		SyCartBO syCartBO=new SyCartBO();
		Integer num=0;
		Integer cartNum=0;
		BigDecimal amount=BigDecimal.ZERO;
    	//获取db中的该用户购买的cart信息
    	SyCart syCart=syCartMapper.selectCartAmountAndNum(record);
    	if(!ObjectUtils.isEmpty(syCart)){
    		num=syCart.getGoodsNum().intValue();
    		amount=syCart.getGoodsPrice();
    		cartNum = syCart.getCartNum();
    	}
    	syCartBO.setGoodsNum(num);
    	syCartBO.setCartNum(cartNum);
    	syCartBO.setMoneyAmount(amount);
		return syCartBO;
	}
	
	public SyGoodsCartBO getGoodsOnlineInfo(Integer goodsId,Short quantity) {
		SyGoodsExample syGoodsExample=new SyGoodsExample();
		syGoodsExample.createCriteria()
			.andGoodsIdEqualTo(goodsId)
			.andGoodsStateEqualTo(GoodsConstant.GoodsState.GOODS_STATE1)//上架
			.andGoodsVerifyEqualTo(GoodsConstant.GoodsVerify.GOODS_VERIFY1);//审核通过
		List<SyGoods> syGoodsList=syGoodsMapper.selectByExample(syGoodsExample);
		
		SyGoodsCartBO syGoodsCartBO=null;
		if(syGoodsList!=null && syGoodsList.size()>0){
			SyGoods syGoods=syGoodsList.get(0);
			
			syGoodsCartBO=new SyGoodsCartBO();
			syGoodsCartBO.setSyGoods(syGoods);
			syGoodsCartBO.setGoodsNum(quantity);
		    syGoodsCartBO.setState(true);
		    if(syGoods.getGoodsStorage()<quantity){
		    	syGoodsCartBO.setStorageState(false);
		    }else{
		    	syGoodsCartBO.setStorageState(true);
		    }
		    //填充必要下标，方便后面统一使用购物车方法与模板
		    //cart_id=goods_id,优惠套装目前只能进购物车,不能立即购买
		    syGoodsCartBO.setCartId(goodsId);
			syGoodsCartBO.setBlId(0);
		}
		
		return syGoodsCartBO;
	}
	
	
	/**
	 * @author caoyongjun
	 * @param syCartExample
	 * 	cart_ids:购物车列表
	 * 	buyer_id:用户id
	 * 	bl_id:0 普通商品
	 * 	order by cart_id desc 降序主键
	 * 
	 * @return List<SyCart>
	 */
	@Override
	public List<SyCart> cartListByMemberId(Integer memberId,Byte checke){
		SyCartExample syCartExample=new SyCartExample();
		syCartExample.createCriteria().andBuyerIdEqualTo(memberId).andCheckedEqualTo(checke);
		return syCartMapper.selectByExample(syCartExample);
		
	}
	
	/**
	 * @author caoyongjun
	 * @param syGoodsCommon
	 * @return
	 */
	public String getSplitOrderKey(SyGoodsCommon syGoodsCommon){
		StringBuilder sb=new StringBuilder();
		sb.append(syGoodsCommon.getStoreId())
			.append("-")
			.append(syGoodsCommon.getPublisherId())
			.append("-")
			.append(syGoodsCommon.getAssistId())
			.append("-")
			.append(syGoodsCommon.getBizOperationMid());
		
		return sb.toString();
	}
	
	
	//@Override
	public GoodsCartBO cartList(Integer memberId,String channel,Integer goodsProjectType) throws CoreServiceException {
		
		GoodsCartBO goodsCartBO=new GoodsCartBO();
		
		//設定項目類型
		List<Integer> supportList=Arrays.asList(ProjectType.SUPPORT_POOR_TYPES);
		List<Integer> projectTypeList=new ArrayList<Integer>();
		if(goodsProjectType==ProjectType.PROJECT_TYPE_B_SUPPORT_POOR_WAREHOUSE){
			projectTypeList.add(ProjectType.PROJECT_TYPE_B_SUPPORT_POOR_WAREHOUSE);
		}else{
			projectTypeList.addAll(supportList);
		}
		
		//获得购物车的金额和数量
		Integer totalCount=0;
		BigDecimal totalAmount=BigDecimal.ZERO;
		SyCartExample syCartExample=new SyCartExample();
		syCartExample.createCriteria().andBuyerIdEqualTo(memberId).andGoodsProjectTypeIn(projectTypeList);
		syCartExample.setOrderByClause("cart_id desc");	
    	List<SyCart> cartList=syCartMapper.selectByExample(syCartExample);
    	if(!ObjectUtils.isEmpty(cartList)){
    		
    		Map<String,Object> resultMap=new HashMap<String,Object>();
    		
    		String storeName=null;
    		//购物车总数
    		totalCount=cartList.size();
    		for(int i=0;i<cartList.size();i++){
    			
    			CartBO cartBO=new CartBO();
    			
    			SyCart cart=cartList.get(i);
    		
    			BigDecimal goodsTotal=cart.getGoodsPrice().multiply(new BigDecimal(cart.getGoodsNum()));
    			totalAmount=totalAmount.add(goodsTotal);//总金额

    			cartBO.setAmount(goodsTotal);
    			cartBO.setCount(cart.getGoodsNum().intValue());
    			cartBO.setCartId(cart.getCartId());
    			
    			//获取店铺信息
    			StoreBo storeBo=syStoreService.getStoreInfo(cart.getStoreId());
    			if(!ObjectUtils.isEmpty(storeBo)){
    				storeName = storeBo.getStoreName();//店铺名
    			}
    			
    			//获取正在售卖的信息
    			SyGoodsCommon syGoodsCommon=syGoodsCommonService.selectCartGoodsInfoByGoodsId(cart.getGoodsId());
    			if(!ObjectUtils.isEmpty(syGoodsCommon)){
    				cartBO.setGoodsName(syGoodsCommon.getGoodsName());
    				if(!ObjectUtils.isEmpty(syGoodsCommon.getGoodsName())){
    					cartBO.setGoodsImage(ImageUtil.cdn_end_point+"/goods/"+syGoodsCommon.getStoreId()+"/"+syGoodsCommon.getGoodsName());
    				}else{
    					cartBO.setGoodsImage("");
    				}
    				
    				if(0==syGoodsCommon.getGoodsState().intValue()){//已下架
    					cartBO.setGoodsStatus(0);
    					cartBO.setGoodsStatusStr("已下架");
    				}else{
    					cartBO.setGoodsStatus(1);
    				}
    				
    				//详情需要判断后给定一个不同的页面参数
    				//拆单后的数据
    				if(supportList.contains(goodsProjectType)){
    					
    					cartBO.setGoodsUrl("/bocm/index.php?act=project&op=project_detail&goods_id="+syGoodsCommon.getGoodsCommonid()+"&goods_project_type="+syGoodsCommon.getGoodsProjectType());
    					
    					String key=getSplitOrderKey(syGoodsCommon);
    					if(ObjectUtils.isEmpty(resultMap.get(key))){
    						List<CartBO> cartBOs=new ArrayList<CartBO>();
    						Map<String,Object> innerMap=new HashMap<String,Object>();
    						cartBOs.add(cartBO);
    						innerMap.put("storeName",storeName);
    						innerMap.put("goodsList",cartBOs);
        	            	resultMap.put(key, innerMap);
        	            }else{
        	            	@SuppressWarnings("unchecked")
							Map<String,Object> innerMap=(Map<String, Object>) resultMap.get(key);
        	            	@SuppressWarnings("unchecked")
							List<CartBO> cartBOs=(List<CartBO>) innerMap.get("goodsList");
        	            	cartBOs.add(cartBO);
        	            	resultMap.put(key, cartBOs);
        	            }
    				} else if(goodsProjectType==ProjectType.PROJECT_TYPE_B_SUPPORT_POOR_WAREHOUSE){
    					
    					cartBO.setGoodsUrl("/bocm/index.php?act=index&op=showvue&channel="+channel+"&appVariant=boc#/mall_detail?goods_id="+syGoodsCommon.getGoodsCommonid()+"&is_share=yes");
    					
    	                //扶贫仓库
        	            if(ObjectUtils.isEmpty(resultMap.get("poorStore"))){
        	            	List<CartBO> cartBOs=new ArrayList<CartBO>();
    						Map<String,Object> innerMap=new HashMap<String,Object>();
    						cartBOs.add(cartBO);
    						innerMap.put("storeName","扶贫仓库");
    						innerMap.put("goodsList",cartBOs);
        	            	resultMap.put("poorStore", innerMap);
        	            }else{
        	            	@SuppressWarnings("unchecked")
							Map<String,Object> innerMap=(Map<String, Object>) resultMap.get("poorStore");
        	            	@SuppressWarnings("unchecked")
							List<CartBO> cartBOs=(List<CartBO>) innerMap.get("goodsList");
        	            	cartBOs.add(cartBO);
        	            	resultMap.put("poorStore", cartBOs);
        	            }
        			}
    			}
    		}
    		goodsCartBO.setTotalCount(totalCount);
    		goodsCartBO.setTotalAmount(totalAmount.toString());
    		goodsCartBO.setObj(resultMap);
    	}
    	
		return goodsCartBO;
	}
	

	/**
	 * 查询购物车中用户所选中的商品数量
	 * @param memberId 用户id
	 * @param checked	选中状态 1选中  0未选中 
	 * @return
	 */
	@Override
	public Map<Integer, Integer> getGoodsNumByMember(Integer memberId, Byte checked) {
		
		HashMap<Integer,Integer> dataMap = new HashMap<>();
		
		SyCartExample cartExample = new SyCartExample();
		cartExample.createCriteria().andBuyerIdEqualTo(memberId).andCheckedEqualTo(checked);
		List<SyCart> example = this.syCartMapper.selectByExample(cartExample);
		
		for (SyCart syCart : example) {
			dataMap.put(syCart.getCartId(), syCart.getGoodsNum().intValue());
		}
		
		return dataMap;
	}
}

	
