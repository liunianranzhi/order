package com.shanyuan.platform.ms.facade.order.impl;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import com.shanyuan.platform.ms.core.topic.SyTopicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import com.aliyun.openservices.shade.com.alibaba.fastjson.JSON;
import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.base.common.util.EmojiFilter;
import com.shanyuan.platform.ms.base.common.util.OrderUtil;
import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType.OrderUpError;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.base.queue.redis.PublishService;
import com.shanyuan.platform.ms.core.cart.CartService;
import com.shanyuan.platform.ms.core.constant.ConstantReload;
import com.shanyuan.platform.ms.core.constant.OrderConstant;
import com.shanyuan.platform.ms.core.constant.OrderConstant.ProjectType;
import com.shanyuan.platform.ms.core.constant.OrderConstant.orderType;
import com.shanyuan.platform.ms.core.constant.PointConstant;
import com.shanyuan.platform.ms.core.goods.GoodsListService;
import com.shanyuan.platform.ms.core.goods.SaleNumService;
import com.shanyuan.platform.ms.core.goods.SyEvaluateGoodsService;
import com.shanyuan.platform.ms.core.goods.SyGoodsCommonService;
import com.shanyuan.platform.ms.core.goods.SyGoodsService;
import com.shanyuan.platform.ms.core.member.MemberService;
import com.shanyuan.platform.ms.core.order.DealOrderService;
import com.shanyuan.platform.ms.core.order.QueryOrderService;
import com.shanyuan.platform.ms.core.order.bo.DisOrderGoodsInfo;
import com.shanyuan.platform.ms.core.order.bo.GoodsInfo;
import com.shanyuan.platform.ms.core.order.bo.OrderGoods;
import com.shanyuan.platform.ms.core.order.bo.OrderInfo;
import com.shanyuan.platform.ms.core.order.bo.OrderListInfo;
import com.shanyuan.platform.ms.core.order.bo.OrderRecordInfo;
import com.shanyuan.platform.ms.core.order.impl.exceptype.OrderServiceExcepType;
import com.shanyuan.platform.ms.core.store.SyStoreService;
import com.shanyuan.platform.ms.core.syshop.SyShopAccountService;
import com.shanyuan.platform.ms.core.user.AddressManagerService;
import com.shanyuan.platform.ms.core.user.CouponService;
import com.shanyuan.platform.ms.core.user.PointManageService;
import com.shanyuan.platform.ms.core.user.UserCorrelationService;
import com.shanyuan.platform.ms.core.user.VoucherService;
import com.shanyuan.platform.ms.core.user.bo.VoucherBo;
import com.shanyuan.platform.ms.dao.cart.entity.SyCart;
import com.shanyuan.platform.ms.dao.order.entity.SyOrder;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderCommon;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderLog;
import com.shanyuan.platform.ms.dao.store.entity.SyStore;
import com.shanyuan.platform.ms.dao.user.entity.SyAddress;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.dao.user.entity.SyShopAccount;
import com.shanyuan.platform.ms.dao.user.entity.SyVoucher;
import com.shanyuan.platform.ms.dao.user.entity.SyVoucherOrder;
import com.shanyuan.platform.ms.facade.constant.OrderFacadeConstant;
import com.shanyuan.platform.ms.facade.constant.OrderFacadeConstant.PublishType;
import com.shanyuan.platform.ms.facade.order.OrderFacade;
import com.shanyuan.platform.ms.facade.order.domain.OrderDetailDomain;
import com.shanyuan.platform.ms.facade.order.domain.PayedOrderDomain;

import de.ailis.pherialize.MixedArray;
import de.ailis.pherialize.Pherialize;


/**
 * 
 * @author 曹勇军
 * 
 */
@Component
public class OrderFacadeImpl implements OrderFacade{
	
	private static final Logger logger = LoggerFactory.getLogger(OrderFacadeImpl.class);
	
	@Autowired
	private CartService cartService;
	@Autowired
	private SyShopAccountService syshopService;
	
	@Autowired
	private DealOrderService dealOrderService;
    @Autowired
    private  SyTopicService syTopicService;
	
	@Autowired
	private SyGoodsCommonService syGoodsCommonService;
	
	@Autowired
	private PointManageService pointManageService;
	@Autowired
	private UserCorrelationService userService;
	
	@Autowired
	private CouponService couponService;
	
	@Autowired
	private AddressManagerService addressManagerService;
	
	@Autowired
	private VoucherService voucherService;
	@Autowired
	private SyShopAccountService shopAccountService;
	
	@Autowired
	private SyGoodsService syGoodsService;
	
	@Autowired
	private GoodsListService goodsListService;
	
	@Autowired
	private SaleNumService saleNumService;
	@Autowired
	private QueryOrderService queryOrderService;
	@Autowired
	private MemberService memberService;
	@Autowired
	private SyStoreService storeService;
	@Autowired
	private SyEvaluateGoodsService evaluateGoodsService;
	
	@Autowired
	private PublishService publishService;
	
	
	@Autowired
	private ConstantReload constantReload;
	

	static  OrderFacade orderfacade;

	@PostConstruct
	private void setThis(){
		orderfacade = this;
	}
	
	/**
	 * @author caoyongjun
	 * @param addressId=地址
	 * @param ifcart=1:来源购物车
	 * @param memberId=用户id
	 * @param goodsId=来源不是购物车时有值，商品的id
	 * @param goodsNum=来源不是购物车时有值，商品的数量
	 * @param memberName=用户名
	 * @param memberTruename=用户真实姓名
	 * @param bocPoints=中元积分
	 * @param bocPointsUsed=已使用积分
	 * @param sharedMid=分享人id
	 * @param sharedGoodsGommonid=分享人分享的商品id
	 * @param buyerChannel=用户channel
	 * @param userWords=Map  用户对订单的留言
	 * @return
	 * @throws CoreServiceException
	 */
    @Transactional(timeout=36000,rollbackFor=Throwable.class,isolation=Isolation.READ_COMMITTED)
	public Map<String,Object> submitOrder(Integer addressId,Integer ifcart,Integer memberId,
			Integer goodsId,Integer goodsNum,
			String memberName,String memberTruename,
			Integer bocPoints,Integer bocPointsUsed,
			Integer sharedMid,Integer sharedGoodsCommonid,Integer voucherId,Map<String,String> userWords) throws CoreServiceException{
		
		Map<String,Object> dataInfo = new HashMap<String,Object>();
		//1.1.查询收货地址
		SyAddress syAddress = addressManagerService.getAddressByIdAndUserId(addressId, memberId,null,null);
		if(ObjectUtils.isEmpty(syAddress) || ObjectUtils.isEmpty(syAddress.getCityId())){
				throw new CoreServiceException(OrderServiceExcepType.ADDRESS_EMPTY,"请填写收货地址哦~！");	
		}
		//校验 留言
		if(!ObjectUtils.isEmpty(userWords)){
			for(String key:userWords.keySet()) {
				String str = userWords.get(key);
				String filterEmoji="";
				if(!ObjectUtils.isEmpty(str)){
					str  = str.trim();
					filterEmoji = EmojiFilter.filterEmoji(str);
				}
				if(!ObjectUtils.isEmpty(filterEmoji)&&filterEmoji.length()>250) {
					throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"留言请不要超过250字哦~！");
				}
				userWords.put(key, filterEmoji);
			}
		}
			List<Integer> goodsIdList=new ArrayList<Integer>();
			List<Integer> cartIdList=null;
			Map<Integer,Integer> goodsIdMap=new HashMap<Integer,Integer>();
			//2.获取购物车商品信息或者指定商品信息
			if(!ObjectUtils.isEmpty(ifcart) && ifcart==1){
				cartIdList=new ArrayList<Integer>();
				List<SyCart> syCartList=cartService.cartListByMemberId(memberId,OrderFacadeConstant.CartCheckedType.CHECKED);
				if(!ObjectUtils.isEmpty(syCartList)){
					for(SyCart cart:syCartList){
						 Short goodsNum2 = cart.getGoodsNum();
						 cartIdList.add(cart.getCartId());
						Integer znum=ObjectUtils.isEmpty(goodsNum2)?0:goodsNum2.intValue();
						if(!ObjectUtils.isEmpty(goodsIdMap.get(cart.getGoodsId()))) {
							Integer cnum = goodsIdMap.get(cart.getGoodsId());
							znum += cnum;
						}
						goodsIdMap.put(cart.getGoodsId(),znum);
						goodsIdList.add(cart.getGoodsId());
					}
				}else{
					throw new CoreServiceException(OrderServiceExcepType.CART_EMPTY,"购物车里的商品为空！");	
				}
			}else{//2.1.来源是直接购买
				if(!ObjectUtils.isEmpty(goodsId) && !ObjectUtils.isEmpty(goodsNum)){
					goodsIdList.add(goodsId);
					goodsIdMap.put(goodsId,goodsNum);
				}else{
					logger.info("直接购买参数为空 goodsId={}, goodsNum={}", goodsId, goodsNum);
					throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"goodsid或goodsnum 为空！");
				}
			}
			//3.商品列表  3.1.校验库存  3.2.校验单次购买最大数量和库存
			//List<GoodsInfo> goodsInfoList=goodsListService.getGoodsInfoList(goodsIdMap,goodsIdList, memberId,syAddress);
		List<GoodsInfo> goodsInfoList=goodsListService.getGoodsList(goodsIdMap,goodsIdList, memberId,syAddress);
			//4.商品拆单
			Map<String,DisOrderGoodsInfo> splitToOrder=dealOrderService.splitToOrder(goodsInfoList);

			//6.处理商品列表信息  6.1.计算扶贫码  
			//6.2.获取运费信息 	 6.3.计算优惠券 6.4.匹配留言信息
			// by zy Map<String,Object> splitOrder=dealOrderService.dealOrder(splitToOrder, userWords, syAddress.getCityId(), memberId);
			Map<String,Object> splitOrder=dealOrderService.calOrder(splitToOrder, userWords, syAddress.getCityId(), memberId, voucherId);
			String resultKey = (String)splitOrder.get("cost_mode");
			//8.校验积分
			Integer needPoints=(Integer)splitOrder.get("needPoints");
			if(needPoints!=null && needPoints>0){
				pointManageService.validatePoint(needPoints, bocPoints, bocPointsUsed);
			}
			
			BigDecimal  allPayMoney =(BigDecimal)splitOrder.get("allPayMoney");
			BigDecimal  allHelpFee =(BigDecimal)splitOrder.get("allHelpFee");
			BigDecimal  allFundFee =(BigDecimal)splitOrder.get("allFundFee");
			Integer  allCanGetPoints =(Integer)splitOrder.get("allCanGetPoints");
			String orderStatus= OrderConstant.OrderState.ORDER_STATE_NEW;
			if(BigDecimal.ZERO.compareTo(allPayMoney) == 0) {
				orderStatus= OrderConstant.OrderState.ORDER_STATE_PAYED;
			}
			
			Map<String,DisOrderGoodsInfo> newDisOrderGoodsInfoMap=(Map<String, DisOrderGoodsInfo>) splitOrder.get("store_cart_map");
			Map<Integer,BigDecimal> vourchGoods = (Map<Integer, BigDecimal>) splitOrder.get("voucher_goods_amount_map");
			Long paySn=dealOrderService.getPaySn(memberId);
			
			SyVoucher voucherInfo=(SyVoucher)splitOrder.get("vourchInfo");
			//单独的一个提交订单的逻辑  统一放到一个方法事务里面
			orderfacade.switchDealOrder(paySn, voucherInfo, newDisOrderGoodsInfoMap, memberId, memberName, memberTruename, syAddress, resultKey, vourchGoods, sharedMid, sharedGoodsCommonid, needPoints, orderStatus,goodsInfoList,goodsIdMap);
			//如果已支付 更新逻辑
			if(OrderConstant.OrderState.ORDER_STATE_PAYED.equals(orderStatus)) {
				List<Integer> publisherIds =new ArrayList<Integer>();
				for(String orderKey:newDisOrderGoodsInfoMap.keySet()){
					DisOrderGoodsInfo ds = newDisOrderGoodsInfoMap.get(orderKey);
					List<GoodsInfo> goodsInfoList2 = ds.getGoodsInfoList();
                    GoodsInfo goodsInfo = goodsInfoList2.get(0);
					Integer goodsprojecttype=0;
					if(!ObjectUtils.isEmpty(goodsInfo)) {
						goodsprojecttype =goodsInfo.getGoodsProjectType();
						Integer publisherId = goodsInfo.getPublisherId();
						if(OrderConstant.ProjectType.PROJECT_TYPE_SY_SHOP.equals(goodsprojecttype)
								&&!publisherIds.contains(publisherId)) {
							publisherIds.add(publisherId);
						}
					}
				}
				Map<Integer, SyShopAccount> syshopInfo = shopAccountService.getSyshopInfo(publisherIds);
				if(logger.isDebugEnabled()){
					logger.info("ordersubmit syshopInfo"+JSON.toJSONString(syshopInfo));
				}
				Map<Integer, SyMember> memberMap = userService.getMemberMap(publisherIds);
				if(logger.isDebugEnabled()){
					logger.info("ordersubmit memberMap"+JSON.toJSONString(memberMap));
				}
				orderfacade.payOrder(newDisOrderGoodsInfoMap,memberId,paySn,orderStatus,syshopInfo,memberMap);
				
			}
			dataInfo.put("paySn", paySn.toString());
			dataInfo.put("allPayMoney", allPayMoney);
			dataInfo.put("allHelpFee", allHelpFee);
			dataInfo.put("allFundFee", allFundFee);
			dataInfo.put("allCanGetPoints", allCanGetPoints);
			dataInfo.put("orderStatus", orderStatus);
			//14.更新购物车相关
			if(!ObjectUtils.isEmpty(cartIdList)) {
			cartService.deleteCartByCartIdList(cartIdList, memberId);
			}
			
		return dataInfo;
	}
	@Transactional(timeout=36000,rollbackFor=Throwable.class,isolation=Isolation.READ_COMMITTED)
	public void payOrder(Map<String,DisOrderGoodsInfo> newDisOrderGoodsInfoMap,Integer memberId,
			Long paySn,String orderStatus,Map<Integer, SyShopAccount> syshopInfo,Map<Integer, SyMember> memberMap)throws CoreServiceException {
		//更新orderpay
		dealOrderService.updatePayInfo(paySn, memberId);
		DisOrderGoodsInfo ds=null;
		for(String orderKey:newDisOrderGoodsInfoMap.keySet()){
			ds=newDisOrderGoodsInfoMap.get(orderKey);
			//更新order
			 dealOrderService.updateOrderPay(ds, memberId);
			List<GoodsInfo> goodsInfoList = ds.getGoodsInfoList();
			BigDecimal orderAmount = ds.getOrderAmount();
            Integer orderid = ds.getOrderId();
            dealOrderService.updateRedisInfo(orderAmount, orderid);
			Integer publisherId=0;
			Integer goodsProjectType=0;
			Integer goodsnum=0;
			String ownertype ="";
			String goodsname="";
			
			if(!ObjectUtils.isEmpty(goodsInfoList)) {
				if(!ObjectUtils.isEmpty(goodsInfoList.get(0))) {
					GoodsInfo goodsInfo = goodsInfoList.get(0);
					publisherId = goodsInfo.getPublisherId();
					goodsProjectType = goodsInfo.getGoodsProjectType();
					ownertype = goodsInfo.getOwnerType();
					goodsname = goodsInfoList.size()>1?goodsInfo.getGoodsName()+"等":goodsInfo.getGoodsName();
					for(GoodsInfo gs:goodsInfoList) {
						Integer goodsNum2 = gs.getGoodsNum();
						goodsNum2 =ObjectUtils.isEmpty(goodsNum2)?0:goodsNum2;
						goodsnum +=goodsNum2;
						Integer goodsCommonid = gs.getGoodsCommonid();
						//更新帮扶次数
						syGoodsCommonService.updateSaleNum(goodsCommonid);
					}
				}
			}
		
			dealOrderService.sendMessageForOrder(publisherId, orderid, ownertype);
			if(OrderConstant.ProjectType.PROJECT_TYPE_SY_SHOP.equals(goodsProjectType)) {
				SyShopAccount syShopAccount = syshopInfo.get(publisherId);
				String companyName = syShopAccount.getCompanyName();
				SyMember syMember = memberMap.get(publisherId);
				String phone = syMember.getMemberMobile();
				dealOrderService.sendSMS(companyName, goodsname, phone, goodsnum);
			}

			dealOrderService.addPayOrderLog(orderid, "买家", "完成了付款", "15");
		}
	}
/**
 * 处理事务
 * @param paySn
 * @param voucherInfo
 * @param newDisOrderGoodsInfoMap
 * @param memberId
 * @param memberName
 * @param memberTruename
 * @param syAddress
 * @param resultKey
 * @param vourchGoods
 * @param sharedMid
 * @param sharedGoodsCommonid
 * @param needPoints
 * @param orderStatus
 * @param goodsInfoList
 * @param goodsIdMap
 * @throws CoreServiceException
 */
	@Transactional(timeout=36000,rollbackFor=Throwable.class,isolation=Isolation.READ_COMMITTED)
	public void submitOrderTransaction(Long paySn,SyVoucher voucherInfo,Map<String,DisOrderGoodsInfo> newDisOrderGoodsInfoMap,Integer memberId,String memberName,String memberTruename
			,SyAddress syAddress,String resultKey,Map<Integer,BigDecimal> vourchGoods,Integer sharedMid,Integer sharedGoodsCommonid,Integer needPoints,String orderStatus,List<GoodsInfo> goodsInfoList,Map<Integer,Integer> goodsIdMap) throws CoreServiceException {
		int nowIntDts=DateUtil.getNowInt();
		//7.获取支付单号码
		
		Integer orderPayId=dealOrderService.addOrderPay(paySn, memberId);
		DisOrderGoodsInfo disOrderGoodsInfo=null;
		SyVoucherOrder syVoucherOrder=null;
		for(String orderKey:newDisOrderGoodsInfoMap.keySet()){
			disOrderGoodsInfo=newDisOrderGoodsInfoMap.get(orderKey);
			//9.下单预留
			//默认写死boc渠道
			Integer orderId = dealOrderService.addOrder(disOrderGoodsInfo, paySn, orderStatus, OrderConstant.OrderChannelType.BOC, "pwcn", orderPayId, memberId, memberTruename);
			disOrderGoodsInfo.setOrderId(orderId);
			//10.创建order_common
			GoodsInfo goodsInfo = disOrderGoodsInfo.getGoodsInfoList().get(0);
			Integer storeId = 0;
			if(!ObjectUtils.isEmpty(goodsInfo)) {
				storeId = disOrderGoodsInfo.getGoodsInfoList().get(0).getStoreId();
				storeId =ObjectUtils.isEmpty(storeId)?0:storeId;
			}
			dealOrderService.addOrderCommon(orderId,storeId,"", disOrderGoodsInfo.getOrderMessage(), BigDecimal.ZERO, new Byte("0"), goodsInfo, syAddress);
//			if(true){
//                throw new CoreServiceException("123");
//            }


            //10.1.插入日志
			dealOrderService.addOrderLog(orderId);
			//添加order_goods by zy==================
			List<GoodsInfo> goodsInfoList2 = disOrderGoodsInfo.getGoodsInfoList();
			for(GoodsInfo ginfo: goodsInfoList2) {
				dealOrderService.addOrderGoods(ginfo, "pwcn", orderId, memberId, sharedMid, sharedGoodsCommonid);
				//更新善源商场购买数量
				if(OrderConstant.ProjectType.PROJECT_TYPE_SY_SHOP.equals(ginfo.getGoodsProjectType())) {
					syGoodsCommonService.updateSyshopBuyNum(memberId,ginfo.getGoodsId(),ginfo.getGoodsNum()); 
				}
			}
			
			//10.2.使用优惠券 插入与订单匹配的表
			if(!ObjectUtils.isEmpty(voucherInfo) && !ObjectUtils.isEmpty(vourchGoods)){
				try {
					for(GoodsInfo gInfo:disOrderGoodsInfo.getGoodsInfoList()){
						if(!ObjectUtils.isEmpty(vourchGoods.get(gInfo.getGoodsId()))) {
							syVoucherOrder=new SyVoucherOrder();
							syVoucherOrder.setOrderId(orderId);
							syVoucherOrder.setGoodsId(gInfo.getGoodsId());
							syVoucherOrder.setUseTime(nowIntDts);
							syVoucherOrder.setBuyerId(memberId);
							syVoucherOrder.setVoucherCode(voucherInfo.getVoucherCode());
							syVoucherOrder.setAmount(vourchGoods.get(gInfo.getGoodsId()));
							syVoucherOrder.setVoucherTId(voucherInfo.getVoucherTId());
							voucherService.useVoucher(syVoucherOrder);
						}
						
					}
				} catch (Exception e) {
					e.printStackTrace();
					logger.info("     添加订单使用优惠券失败 voucherCode={},vourchGoods={}",voucherInfo.getVoucherCode(),vourchGoods.toString());
					throw new CoreServiceException(OrderUpError.ORDER_ADD_VOURCHER_CODE, "添加订单使用", e);
				}
				
			}
			
			//11.更新扶贫码
			if(!ObjectUtils.isEmpty(disOrderGoodsInfo.getCouponPayInfo())){
				try {
					couponService.addOrderCoupon(orderId,memberId,disOrderGoodsInfo.getCouponPayInfo());
				} catch (Exception e) {
					e.printStackTrace();
					logger.info("     更新扶贫码失败");
					throw new CoreServiceException(OrderUpError.ORDER_UP_POOR_CODE, "更新扶贫码失败", e);
				}
			}
			
			//12.添加积分日志
			if(disOrderGoodsInfo.getAllBocPointsUsed()!=null && disOrderGoodsInfo.getAllBocPointsUsed()>0){
				try {
					SyMember syMember =new SyMember();
					syMember.setMemberTruename(memberTruename);
					syMember.setMemberId(memberId);
					syMember.setMemberName(memberName);
					Integer bocPoints = disOrderGoodsInfo.getAllBocPointsUsed();
					bocPoints = ObjectUtils.isEmpty(bocPoints)?0:bocPoints;
					pointManageService.addPointLog(syMember, orderId,null,null,0-bocPoints,"购买善源商场产品(积分支付)", PointConstant.PointStage.ORDER_POINTS,0,OrderConstant.OrderChannelType.BOC);
				} catch (Exception e) {
					logger.error(e.getMessage(),e);
					logger.info("     添加积分失败 memberId={}, memberName={}, memberTruename={}, allBocPointsUsed={}, orderId={}, channelType={}",memberId, memberName, memberTruename, disOrderGoodsInfo.getAllBocPointsUsed(), orderId, OrderConstant.OrderChannelType.BOC);
					throw new CoreServiceException(OrderUpError.ORDER_UP_POINTS, "添加积分失败", e);
				}
			}
		}
		
		//13.扣减积分
		if(needPoints!=null && needPoints>0){
			try {
				pointManageService.usePoint(memberId, needPoints);
			} catch (Exception e) {
				logger.error(e.getMessage(),e);
				logger.info("     扣减积分失败 memberId={}, needPoints={}",memberId, needPoints);
				throw new CoreServiceException(OrderUpError.ORDER_UP_POINTS, "添加积分失败", e);
			}
		}
		//14.更新优惠卷状态
		if(!ObjectUtils.isEmpty(voucherInfo)){
			try {
				voucherService.updateVoucherStatus(voucherInfo.getVoucherCode());
				voucherService.updateVouchertused(voucherInfo);
			} catch (Exception e) {
				logger.error(e.getMessage(),e);
				logger.info("     更新优惠卷状态 voucherCode={}",voucherInfo.getVoucherCode());
				throw new CoreServiceException(OrderUpError.ORDER_UP_VOURCHER_CODE, "更新优惠卷状态", e);
			}
		}
		
        //15.更新库存和销量  by zy
		orderfacade.updateNewSaleNum(goodsInfoList,goodsIdMap);
		/*for(Integer goodsIdKey:goodsIdMap.keySet()){
			try {
				syGoodsService.updateSaleCountAndStockCount(goodsIdKey,goodsIdMap.get(goodsIdKey));
			} catch (Exception e) {
				logger.error(e.getMessage(),e);
				logger.info("     更新库存和销量失败 goodsIdKey={},count={}",goodsIdKey,goodsIdMap.get(goodsIdKey));
				throw new CoreServiceException(OrderUpError.ORDER_UP_STORE_COUNT, "更新库存和销量失败", e);
			}
		}*/

		//16.更新销量表 sy_salenum
		if(!ObjectUtils.isEmpty(goodsInfoList)){

			try {
				saleNumService.updateSaleNum(goodsInfoList);
			} catch (Exception e) {
				logger.error(e.getMessage(),e);
				logger.info("     更新销量表失败 goodsInfoList={}",goodsInfoList.toString());
			}
		}
	}

    /**
     * @auther zy
     * @param goodsInfoList
     * @param goodsIdMap
     * @throws CoreServiceException
     */

    @Transactional(timeout=36000,rollbackFor=Throwable.class,isolation=Isolation.READ_COMMITTED)
	public void  updateNewSaleNum(List<GoodsInfo> goodsInfoList,Map<Integer,Integer> goodsIdMap)throws CoreServiceException{
            for(GoodsInfo gf:goodsInfoList){
                String gtype=gf.getGoodsType();
                Integer goodsId = gf.getGoodsId();
                Integer goodsnum = goodsIdMap.get(goodsId);
                try {
                    if("6".equals(gtype)){
                        syTopicService.updateTopicGoodsSaleNum(goodsId,goodsnum);
                        syGoodsService.updateTopicSaleNum(goodsId,goodsnum);
                    }else{
                        syGoodsService.updateSaleCountAndStockCount(goodsId,goodsnum);
                    }
                } catch (Exception e) {
                    logger.error(e.getMessage(),e);
                    logger.info("     更新库存和销量失败 goodsIds={},count={}",goodsId,goodsnum);
                    throw new CoreServiceException(OrderUpError.ORDER_UP_STORE_COUNT, "更新库存和销量失败", e);
                }
            }
	}

	  /***
	   *  @author zhongying
		 * @param ifcart=1:来源购物车
		 * @param memberId=用户id
		 * @param goodsId=来源不是购物车时有值，商品的id
		 * @param goodsNum=来源不是购物车时有值，商品的数量
		 * @param bocPoints=中元积分
		 * @param bocPointsUsed=已使用积分
		 * @return 
		 * @throws CoreServiceException
	   */
	@Override
	public OrderListInfo getOrderPreSubmit(Integer addressId, Integer ifcart, Integer memberId, Integer goodsId,
			Integer goodsNum, Integer bocPoints,Integer bocPointsUsed ) throws CoreServiceException {
		OrderListInfo  orderInfo=new  OrderListInfo();
		try {
			SyAddress syAddress =new SyAddress();
			//1.1.查询收货地址
			if(ObjectUtils.isEmpty(addressId)){
				syAddress = addressManagerService.getAddressByIdAndUserId(null, memberId,"1",new Byte("0"));
			}else{
				syAddress = addressManagerService.getAddressByIdAndUserId(addressId, memberId,null,new Byte("0"));
			}
			if(!ObjectUtils.isEmpty(ifcart) && ifcart==1){
				
			}else {
				if(goodsNum!=null && goodsNum.intValue()<=0){
	                logger.info("商品数量不正确, goodsNum={}", goodsNum);
	                throw new CoreServiceException(OrderServiceExcepType.GOODS_MISSING,"商品数量不对~");
				}
			}
		
			if(ObjectUtils.isEmpty(syAddress) || ObjectUtils.isEmpty(syAddress.getCityId())){
				logger.info("默认收获地址为空, memberId={}", memberId);
				throw new CoreServiceException(OrderServiceExcepType.ADDRESS_EMPTY,"地址为空！");
			}
			
			List<Integer> goodsIdList=new ArrayList<Integer>();
			List<Integer> cartIdList=null;
			Map<Integer,Integer> goodsIdMap=new HashMap<Integer,Integer>();
			//2.获取购物车商品信息或者指定商品信息
			if(!ObjectUtils.isEmpty(ifcart) && ifcart==1){
				cartIdList=new ArrayList<Integer>();
				List<SyCart> syCartList=cartService.cartListByMemberId(memberId,OrderFacadeConstant.CartCheckedType.CHECKED);
				if(!ObjectUtils.isEmpty(syCartList)){
					for(SyCart cart:syCartList){
						cartIdList.add(cart.getCartId());
						Integer goodsId2 = cart.getGoodsId();
						Short goodsNum2 = cart.getGoodsNum();
						Integer cnum =ObjectUtils.isEmpty(goodsNum2)?0:goodsNum2.intValue();
						if(!ObjectUtils.isEmpty(goodsIdMap.get(goodsId2))) {
							Integer num = goodsIdMap.get(goodsId2);
							Integer newnum =cnum+num;
							goodsIdMap.put(goodsId2,newnum);
						}else {
							goodsIdMap.put(goodsId2,cnum);
						}
						goodsIdList.add(cart.getGoodsId());
					}
				}else{
					throw new CoreServiceException(OrderServiceExcepType.CART_EMPTY,"购物车里的商品为空！");
				}
			}else{//2.1.来源是直接购买
				if(!ObjectUtils.isEmpty(goodsId) && !ObjectUtils.isEmpty(goodsNum)){
					goodsIdList.add(goodsId);
					goodsIdMap.put(goodsId,goodsNum);
				}else{
					throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"goodsId 或 goodsNum 为空！");
				}
			}
			//3.商品列表  3.1.校验库存  3.2.校验单次购买最大数量和库存
			//List<GoodsInfo> goodsInfoList=goodsListService.getGoodsInfoList(goodsIdMap,goodsIdList, memberId,null);
			List<GoodsInfo> goodsInfoList=goodsListService.getGoodsList(goodsIdMap,goodsIdList, memberId,null);
			//4.商品拆单
			Map<String,DisOrderGoodsInfo> splitToOrder=dealOrderService.splitToOrder(goodsInfoList);

			//6.处理商品列表信息  6.1.计算扶贫码  
			Map<String,Object> splitOrder=dealOrderService.calOrder(splitToOrder, null, syAddress.getCityId(), memberId,null);
			@SuppressWarnings("unchecked")
			List<VoucherBo> actualVoucherList =(List<VoucherBo>)splitOrder.get("actualVoucherList");
			//8.校验积分
			Integer needPoints=(Integer)splitOrder.get("needPoints");
			if(needPoints!=null && needPoints>0){
				pointManageService.validatePoint(needPoints, bocPoints, bocPointsUsed);
			}
			@SuppressWarnings("unchecked")
			Map<String,DisOrderGoodsInfo> disOrderGoods=(Map<String, DisOrderGoodsInfo>) splitOrder.get("store_cart_map");
			SyVoucher voucherInfo=(SyVoucher)splitOrder.get("vourchInfo");
			orderInfo = queryOrderService.getOrderListInfo(disOrderGoods);
			orderInfo.setSyAddress(syAddress);
			orderInfo.setActualVoucherList(actualVoucherList);
			orderInfo.setVoucherInfo(voucherInfo);
		} catch (CoreServiceException e) {
			logger.error(e.getMessage(),e);
			throw new CoreServiceException(e.getExcepType(),e.getMessage(),e);
		}
		return orderInfo;
	}
	 /**
	    * 查询个人购买记录  BY ZY 
	    */
		@Override
		public Map<String, Object> getOrderRecoderList(Integer memberId,  String  orderState,Integer pageSize,Integer currentpage) throws CoreServiceException {
			//获得待支付的支付记录 包括 支付的金额，所需的积分，优惠，扶贫码，
		Map<String, Object> result=new HashMap<String,Object>();
		 List<OrderRecordInfo>  orderInfoList = new ArrayList<OrderRecordInfo>();
				if(ObjectUtils.isEmpty(memberId)) {
					logger.info("orderRecoder memberId :"+memberId);
					throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"相关参数为空！");
				}
			
				Byte deleted = new Byte("0");
				pageSize = ObjectUtils.isEmpty(pageSize)?20:pageSize;
				currentpage = ObjectUtils.isEmpty(currentpage)?1:currentpage;
				if(ObjectUtils.isEmpty(orderState)||OrderConstant.OrderState.ORDER_STATE_NEW.equals(orderState)) {
					//全部过来的和待支付的
					orderInfoList = queryOrderService.doUnPayOrder(memberId,deleted, "1");
					if(logger.isDebugEnabled()) {
						logger.info("orderRecoder orderInfoList:"+JSON.toJSONString(orderInfoList));
					}
				}
				
			if(ObjectUtils.isEmpty(orderState)||!OrderConstant.OrderState.ORDER_STATE_NEW.equals(orderState)) {
				//获得已支付订单列表 以order为维度
				ArrayList<Integer> publisherIds = new ArrayList<Integer>();
				ArrayList<Integer> syshopIds = new ArrayList<Integer>();
				ArrayList<Integer> porderIds = new ArrayList<Integer>();
				Integer payedCount = queryOrderService.getPayedInfoCount(memberId, orderState, deleted);
				if(logger.isDebugEnabled()) {
					logger.info("orderRecoder payedCount:"+JSON.toJSONString(payedCount));
				}
				List<SyOrder> payedOrderInfo=new ArrayList<SyOrder>();
				if(!ObjectUtils.isEmpty(payedCount)&&payedCount>0) {
					payedOrderInfo = queryOrderService.getPayedInfo(memberId, orderState,deleted, null, pageSize, currentpage,"record");
					if(logger.isDebugEnabled()) {
						logger.info("orderRecoder payedOrderInfo:"+JSON.toJSONString(payedOrderInfo));
					}
				}
				//获取相应的publisherIds，porderIds
				for(SyOrder ypayed:payedOrderInfo) {
					Integer publisherId = ypayed.getPublisherId();
					Integer orderId = ypayed.getOrderId();
					Integer assistId = ypayed.getAssistId();
					assistId =ObjectUtils.isEmpty(assistId)?0:assistId;
					Integer goodsProjectType = ypayed.getGoodsProjectType();
					goodsProjectType =ObjectUtils.isEmpty(goodsProjectType)?0:goodsProjectType;
					if(!ObjectUtils.isEmpty(publisherId)&&publisherId != 0&&!publisherIds.contains(publisherId)) {
						//大爱超市
						if(assistId==0&&goodsProjectType.equals(ProjectType.PROJECT_TYPE_DA_SHOP)) {
							publisherIds.add(publisherId);
						}else if(goodsProjectType.equals(ProjectType.PROJECT_TYPE_SY_SHOP)) {
							syshopIds.add(publisherId);
						}
					}
					if(!ObjectUtils.isEmpty(orderId)&&!porderIds.contains(orderId)) {
						porderIds.add(orderId);
					}
				}
				//获取相应的ordergoods
				orderInfoList = orderfacade.getHavePayedList(orderInfoList,  payedOrderInfo, publisherIds,syshopIds, porderIds);
			
				if(OrderUtil.hasNext(currentpage, pageSize, payedCount)) {
					result.put("hasNext", "Y");
				}else {
					result.put("hasNext", "N");
				}
				
			}
			result.put("orderInfoList", orderInfoList);
		return result;
		
	 }


		/**
		 * 帮扶明细
		 * @param memberId
		 * @return
		 * @throws CoreServiceException
		 */
		@Override
		public Map<String ,Object> getDonationDetailList(Integer memberId,Integer pageSize,Integer currentpage)throws CoreServiceException {
			Map<String ,Object> data= new HashMap<String ,Object>();
				List<SyOrder> payedInfo = queryOrderService.getPayedInfo(memberId, OrderConstant.OrderState.ORDER_STATE_SUCCESS,new Byte("0") , "finnshed_time DESC",
						pageSize, currentpage, "donation");
				List<Integer> orderIds=new ArrayList<Integer>();
				for(SyOrder or:payedInfo) {
					Integer orderId = or.getOrderId();
					if(!ObjectUtils.isEmpty(orderId)&&!orderIds.contains(orderId)) {
						orderIds.add(orderId);
					}
				}
				if(ObjectUtils.isEmpty(orderIds)) {
					throw new CoreServiceException("订单帮扶明细为空！");
				}
				List<OrderInfo> moneyInfo = queryOrderService.getMoneyInfo(payedInfo, orderIds);
				BigDecimal allMoney=BigDecimal.ZERO;
				BigDecimal allPoorSupportMoney=BigDecimal.ZERO;
				BigDecimal allFundFee=BigDecimal.ZERO;
				
				List<Map<String ,Object>> orderlist=new ArrayList<Map<String ,Object>>();
				for(OrderInfo or:moneyInfo) {
					Map<String ,Object> order = new HashMap<String ,Object>();
					List<OrderGoods> orderGoodsList = or.getOrderGoodsList();
					Integer count=0;
					String goodsName="";
				
					if(!ObjectUtils.isEmpty(orderGoodsList)) {
						count=orderGoodsList.size();
						goodsName = orderGoodsList.get(0).getGoodsName();
					}
					BigDecimal fundFee = or.getFundFee();
					fundFee =ObjectUtils.isEmpty(fundFee)?BigDecimal.ZERO:fundFee;
					BigDecimal poorSupportMoney = or.getPoorSupportMoney();
					poorSupportMoney =ObjectUtils.isEmpty(poorSupportMoney)?BigDecimal.ZERO:poorSupportMoney;
					String finshedTime = or.getFinshedTime();
					String orderSn = or.getOrderSn();
					order.put("fundFee", fundFee);
					order.put("finshedTime", finshedTime);
					order.put("poorSupportMoney", poorSupportMoney);
					order.put("goodsName", goodsName);
					order.put("count", count);
					order.put("orderSn", orderSn);
					order.put("finshedTime", finshedTime);
					allPoorSupportMoney =allPoorSupportMoney.add(poorSupportMoney);
					allFundFee =allFundFee.add(fundFee);
					orderlist.add(order);
				}
				String hasNext ="N";
				List<Map<String ,Object>> sorderlist=new ArrayList<Map<String ,Object>>();
				if(!ObjectUtils.isEmpty(orderlist)) {
					Integer size = orderlist.size();
					hasNext =size<(pageSize)*currentpage?"N":"Y";
					Integer showcount=size<(pageSize)*currentpage?size:(pageSize)*currentpage;
					sorderlist=orderlist.subList((currentpage-1)*pageSize, showcount);
				}
				allMoney = allPoorSupportMoney.add(allFundFee);
				data.put("allPoorSupportMoney", allPoorSupportMoney);
				data.put("hasNext", hasNext);
				data.put("allMoney", allMoney);
				data.put("allFundFee", allFundFee);
				data.put("orderList", sorderlist);
			return data;
		}
		/**
		 * 查询已支付的订单
		 * @param orderInfoList
		 * @param havePayedimages
		 * @param payedOrderInfo
		 * @param publisherIds
		 * @param porderIds
		 * @return
		 */
		public List<OrderRecordInfo> getHavePayedList(List<OrderRecordInfo> orderInfoList,
				List<SyOrder> payedOrderInfo,List<Integer> publisherIds,List<Integer> syshopids,List<Integer> porderIds)throws CoreServiceException  {
			
			if(ObjectUtils.isEmpty(orderInfoList)) {
				orderInfoList = new ArrayList<OrderRecordInfo>();
			}
			//List<SyMember> memberInfoByIds = new ArrayList<SyMember>();
			List<SyStore> storeInfos = new ArrayList<SyStore>();
			List<Integer> orderEvaluateIds = new ArrayList<Integer>();
			Map<Integer, Integer> refundReturnIds = new HashMap<Integer,Integer>();
			Map<Integer, SyShopAccount> syshopInfo = new HashMap<Integer, SyShopAccount>();
			Map<Integer, SyMember> memberMapByIds = new HashMap<Integer, SyMember>();
			Map<Integer, OrderRecordInfo> orderGoodsMap=	new HashMap<Integer, OrderRecordInfo>();
			Map<Integer, Integer> complainIds = new HashMap<Integer,Integer>();
			if(!ObjectUtils.isEmpty(publisherIds)) {
				//查询发布者信息
				//memberInfoByIds = memberService.getMemberInfoByIds(publisherIds);
				 memberMapByIds = memberService.getMemberMapByIds(publisherIds);
				if(logger.isDebugEnabled()) {
					logger.info("orderRecord memberInfo"+JSON.toJSONString(memberMapByIds));
				}
				
				//查询店铺信息
				storeInfos = storeService.getStoreInfoByMid(publisherIds);
				if(logger.isDebugEnabled()) {
					logger.info("orderRecord memberInfo"+JSON.toJSONString(memberMapByIds));
				}
			}
			if(!ObjectUtils.isEmpty(syshopids)) {
				syshopInfo = syshopService.getSyshopInfo(syshopids);
			}
			if(!ObjectUtils.isEmpty(porderIds)) {
				//goodsinfo
				orderGoodsMap = queryOrderService.getOrderGoodsMapByOrderIds(porderIds);
				if(logger.isDebugEnabled()) {
					logger.info("orderRecord orderGoodsMap"+JSON.toJSONString(orderGoodsMap));
				}
				//查询评价信息
				orderEvaluateIds = evaluateGoodsService.getOrderEvaluate(porderIds);
				if(logger.isDebugEnabled()) {
					logger.info("orderRecord orderEvaluateIds"+JSON.toJSONString(orderEvaluateIds));
				}
				//被卖家拒绝次数list
				refundReturnIds = queryOrderService.getRefundReturnIds(porderIds);
				if(logger.isDebugEnabled()) {
					logger.info("orderRecord refundReturnIds"+JSON.toJSONString(refundReturnIds));
				}
				//申请退款list
				complainIds = queryOrderService.getComplainIds(porderIds);
				if(logger.isDebugEnabled()) {
					logger.info("orderRecord complainIds"+JSON.toJSONString(complainIds));
				}
			}
			orderInfoList =orderfacade.dealOrderRecordInfo(orderInfoList,payedOrderInfo, storeInfos, memberMapByIds, syshopInfo ,orderEvaluateIds,
					refundReturnIds, complainIds, orderGoodsMap);
			if(logger.isDebugEnabled()) {
				logger.info("orderRecord orderInfoList:"+JSON.toJSONString(orderInfoList));
			}
			return orderInfoList;
		}

	/**
	 * 处理订单记录数据
	 * @param orderInfoList
	 * @param payedOrderInfo
	 * @param storeInfos
	 * @param memberInfoByIds
	 * @param orderEvaluateIds
	 * @param refundReturnIds
	 * @param complainIds
	 * @param orderGoodsMap
	 * @return
	 * @throws CoreServiceException
	 */
	@Override
		public List<OrderRecordInfo>  dealOrderRecordInfo(List<OrderRecordInfo> orderInfoList,List<SyOrder> payedOrderInfo
				,List<SyStore> storeInfos	,Map<Integer, SyMember>  memberInfoByIds,Map<Integer, SyShopAccount> syshopInfo,List<Integer> orderEvaluateIds,Map<Integer,Integer> refundReturnIds
				,Map<Integer,Integer> complainIds,Map<Integer,OrderRecordInfo> orderGoodsMap) throws CoreServiceException{
			if(CollectionUtils.isEmpty(orderInfoList)) {
				orderInfoList = new ArrayList<OrderRecordInfo>();
			}
			if(!ObjectUtils.isEmpty(payedOrderInfo)) {
				for(SyOrder ypayed:payedOrderInfo) {
					OrderRecordInfo orderRecordInfo = new OrderRecordInfo(ypayed);
					Integer publisherId = ypayed.getPublisherId();
					Integer orderId = ypayed.getOrderId();
					Integer finnshedTime = ypayed.getFinnshedTime();
					String yorderState = ypayed.getOrderState();
					Integer goodsProjectType =ypayed.getGoodsProjectType();
					Integer assistId = ypayed.getAssistId();
					for(SyStore store:storeInfos) {
						Integer smid = store.getMemberId();
						if(!ObjectUtils.isEmpty(smid)&&publisherId.equals(smid)) {
							String storeTel = store.getStoreTel();
							if(!ObjectUtils.isEmpty(storeTel)) {
								orderRecordInfo.setTel(storeTel);;
							}
						}
					}
					
					//评价信息
					String evaluateStatus = evaluateGoodsService.getEvaluateStatus(orderEvaluateIds, orderId, finnshedTime, yorderState);
					orderRecordInfo.setEvaluateStatus(evaluateStatus);
					//查询已经进行的申请退款并被卖家拒绝的次数
					Integer refundCount = refundReturnIds.get(orderId);
					Integer complainId = complainIds.get(orderId);
					refundCount = ObjectUtils.isEmpty(refundCount)?0:refundCount;
					orderRecordInfo.setRefundCount(refundCount);
					if(!ObjectUtils.isEmpty(complainId)) {
						orderRecordInfo.setComplainId(complainId);
					}
					Integer goodsNum=0;
					Integer total=0;
					List<OrderGoods> orderglist =new ArrayList<OrderGoods>();
					//已商品信息
					if(!ObjectUtils.isEmpty(orderGoodsMap)) {
						OrderRecordInfo order2 = orderGoodsMap.get(orderId);
						if(!ObjectUtils.isEmpty(order2)) {
							goodsNum = order2.getGoodsNum();
							total =  order2.getTotalPoints();
							orderglist = order2.getOrderGoodsList();
							
						}
					}
					String goodsOwnerType ="";
					if(!ObjectUtils.isEmpty(orderglist)) {
						OrderGoods orderGoods = orderglist.get(0);
						String ownerType = orderGoods.getOwnerType();
						goodsOwnerType = goodsListService.getGoodsOwnerType(goodsProjectType, assistId, ownerType);
						
					}
					String publishername="";
					SyMember syMember = memberInfoByIds.get(publisherId);
					if(!ObjectUtils.isEmpty(orderRecordInfo.getTel())) {
						orderRecordInfo.setTel(syMember.getMemberMobile());
					}
					if(goodsOwnerType.equals(orderType.order_agent)||goodsOwnerType.equals(orderType.order_poor)) {
						//查发布者信息
						String userTrueName = userService.getUserTrueName(syMember);
						userTrueName =ObjectUtils.isEmpty(userTrueName)?"":userTrueName;
							if(goodsOwnerType.equals(orderType.order_agent)) {
								publishername ="助理人";
							}else {
								publishername ="贫困户";
							}
						   publishername = publishername+userTrueName;
					}else if(goodsOwnerType.equals(orderType.order_syshop)) {
						SyShopAccount syinfo = syshopInfo.get(publisherId);
                    	String companyAbbreviation = syinfo.getCompanyAbbreviation();
                    	String companyName = syinfo.getCompanyName();
                    	publishername =ObjectUtils.isEmpty(companyAbbreviation)?companyName:companyAbbreviation;
                    	publishername ="善企"+publishername;
					 }else if(OrderConstant.orderType.order_biz.equals(goodsOwnerType)) {
						 publishername ="善源甄选";
		              }
					orderRecordInfo.setPublisherName(publishername);
					orderRecordInfo.setOwnerType(goodsOwnerType);
					orderRecordInfo.setOwnerType(goodsOwnerType);
					orderRecordInfo.setOrderGoodsList(orderglist);
					orderRecordInfo.setGoodsNum(goodsNum);
					orderRecordInfo.setTotalPoints(total);
					
					orderInfoList.add(orderRecordInfo);
					
				}//end 循环
			}
			return orderInfoList;
			
		}
	/**
	 * @author caoyongjun
	 * 选择同步或者异步处理订单
	 * @param paySn
	 * @param voucherInfo
	 * @param newDisOrderGoodsInfoMap
	 * @param memberId
	 * @param memberName
	 * @param memberTruename
	 * @param syAddress
	 * @param resultKey
	 * @param vourchGoods
	 * @param sharedMid
	 * @param sharedGoodsCommonid
	 * @param needPoints
	 * @param orderStatus
	 * @param goodsInfoList
	 * @param goodsIdMap
	 */
	public void switchDealOrder(Long paySn,SyVoucher voucherInfo,Map<String,DisOrderGoodsInfo> newDisOrderGoodsInfoMap,Integer memberId,String memberName,String memberTruename
			,SyAddress syAddress,String resultKey,Map<Integer,BigDecimal> vourchGoods,Integer sharedMid,Integer sharedGoodsCommonid,Integer needPoints,String orderStatus,List<GoodsInfo> goodsInfoList,Map<Integer,Integer> goodsIdMap){
		boolean asyncFlag=constantReload.submitOrderAsync;
		
		if(asyncFlag){
			Map<String,Object> data=new HashMap<String,Object>();
			data.put("paySn", paySn);
			data.put("voucherInfo", voucherInfo);
			data.put("disOrderGoodsInfo", newDisOrderGoodsInfoMap);
			data.put("memberId", memberId);
			data.put("memberName", memberName);
			data.put("memberTruename", memberTruename);
			data.put("syAddress", syAddress);
			data.put("resultKey", resultKey);
			data.put("vourchGoods", vourchGoods);
			data.put("sharedMid", sharedMid);
			data.put("sharedGoodsCommonid", sharedGoodsCommonid);
			data.put("needPoints", needPoints);
			data.put("orderStatus", orderStatus);
			
			data.put("goodsInfoList",goodsInfoList);
			data.put("goodsIdMap", goodsIdMap);
			
			publishService.publishStringMessage(PublishType.ORDER_TOPIC, PublishType.ORDER_TAGNAME, JSON.toJSONString(data), "", "");
		}else{//同步
			 dealOrder(paySn, voucherInfo, newDisOrderGoodsInfoMap, memberId, memberName, memberTruename, syAddress, resultKey, vourchGoods, sharedMid, sharedGoodsCommonid, needPoints, orderStatus,goodsInfoList,goodsIdMap);
		}
	}

	@Override
	public void dealOrder(Long paySn,SyVoucher voucherInfo,Map<String,DisOrderGoodsInfo> newDisOrderGoodsInfoMap,Integer memberId,String memberName,String memberTruename
			,SyAddress syAddress,String resultKey,Map<Integer,BigDecimal> vourchGoods,Integer sharedMid,Integer sharedGoodsCommonid,Integer needPoints,String orderStatus,List<GoodsInfo> goodsInfoList,Map<Integer,Integer> goodsIdMap) throws CoreServiceException{
		//1.先插入旧数据库中
		boolean insertNewDB=false;
		try {
			 submitOrderTransaction(paySn, voucherInfo, newDisOrderGoodsInfoMap, memberId, memberName, memberTruename,
					syAddress, resultKey, vourchGoods, sharedMid, sharedGoodsCommonid, needPoints, orderStatus,goodsInfoList,goodsIdMap);
			insertNewDB=true;
		} catch (Exception e) {
			e.printStackTrace();
			if(e instanceof CoreServiceException){
				CoreServiceException ex=(CoreServiceException) e;
				String status=null;
			    String name=ex.getExcepType().getName();
			    	
				if(OrderUpError.ORDER_ADD_POINTS.getName().equals(name) ||
						OrderUpError.ORDER_UP_POINTS.getName().equals(name) ||
						OrderUpError.ORDER_UP_POOR_CODE.getName().equals(name) || 
						OrderUpError.ORDER_ADD_VOURCHER_CODE.getName().equals(name) ||
						OrderUpError.ORDER_UP_VOURCHER_CODE.getName().equals(name) ||
						OrderUpError.ORDER_UP_STORE_COUNT.getName().equals(name) ){
					status="0";
				}else{
					throw new CoreServiceException(e.getMessage());
				}
				if(status!=null){
					//插入一条失败数据
					String key=newDisOrderGoodsInfoMap.keySet().iterator().next();
					dealOrderService.addOrder(newDisOrderGoodsInfoMap.get(key), paySn, status, OrderConstant.OrderChannelType.BOC, "pwcn", dealOrderService.addOrderPay(paySn, memberId), memberId, memberTruename);
				}
			}else{
				logger.info("     插入数据库失败       ");
				throw new CoreServiceException(e.getMessage());
			}
		}
		/*
		if(insertNewDB){
			//2.插入到新数据库
			try {
				newOrderFacade.submitOmOrder(paySn, voucherInfo, newDisOrderGoodsInfoMap, memberId, memberName, memberTruename,
						vourchGoods, sharedMid, sharedGoodsCommonid, orderStatus, syAddress);
			} catch (Exception e) {
				e.printStackTrace();
				logger.info("    async insert new db is error:paySn={},voucherInfo={}, newDisOrderGoodsInfoMap={}, memberId={}, memberName={}, memberTruename={},vourchGoods={}, sharedMid={}, sharedGoodsCommonid={}, orderStatus={}, syAddress={}",
						paySn, voucherInfo, newDisOrderGoodsInfoMap, memberId, memberName, memberTruename,vourchGoods, sharedMid, sharedGoodsCommonid, orderStatus, syAddress);
			}
		}*/
	}
	
    /**
	 * 获得未支付订单的详情
	 * @author zy
	 * @return
	 */
    @Override
	public OrderDetailDomain getUnPayOrderDetail(Long paySn)throws CoreServiceException {
		OrderDetailDomain orderDetail=new OrderDetailDomain();
			if(ObjectUtils.isEmpty(paySn)) {
				logger.info("支付编号为空:paySn");
				throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"支付编号为空,订单详情查询失败！");
			}
			Integer orderId=0;
			List<Integer> syOrderIds=new ArrayList<Integer>();
			BigDecimal normalFundFee=BigDecimal.ZERO;
			List<OrderInfo> unPayOrderListDetail = queryOrderService.getUnPayOrderListDetail(paySn);
			for(OrderInfo orderinfo:unPayOrderListDetail){
				orderId = orderinfo.getOrderId();
				Integer goodsProjectType = orderinfo.getGoodsProjectType();
				if(OrderConstant.ProjectType.PROJECT_TYPE_SY_SHOP.equals(goodsProjectType)) {
					//善源商场的
					syOrderIds.add(orderId);
				}else if(!OrderConstant.ProjectType.PROJECT_TYPE_SY_SHOP.equals(goodsProjectType)) {
					BigDecimal fundFee = orderinfo.getFundFee();
					normalFundFee = normalFundFee.add(fundFee);
				}
				//发布者信息
				orderfacade.getPublisherInfo(orderinfo,goodsProjectType);
				orderDetail.addOrderInfo(orderinfo);
			}
			orderDetail.setNormalFundFee(normalFundFee);
			orderDetail.setAllCanGetPoints();
			//善源商场的fundfee
			List<Map<String, Object>> syShopList = orderfacade.getSyShopList(syOrderIds);
			orderDetail.setSyshopList(syShopList);
			//地址信息
			Map<String, Object> addressInfo = orderfacade.getAddressInfo(orderId);
			orderDetail.setAddressInfo(addressInfo);
		return orderDetail;
	}
    /**
     * 获得已支付订单详情
     * @param orderid
     * @param memberid
     * @return
     * @throws CoreServiceException
     */
	public PayedOrderDomain getPayedOrderDetail(Integer orderid,Integer memberid)throws CoreServiceException{
        if(ObjectUtils.isEmpty(orderid)||ObjectUtils.isEmpty(memberid)){
            logger.info("PayedOrderDetail orderid :"+orderid+" memberid :"+memberid+"为空!");
            throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"相关参数为空！");
        }
		SyOrder order=queryOrderService.selectByPrimaryKey(orderid);
        if(ObjectUtils.isEmpty(order)||ObjectUtils.isEmpty(order.getBuyerId())){
            logger.info("PayedOrderDetail orderid :"+orderid+" 的订单为空!");
            throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"相关参数为空！");
        }
        if(!memberid.equals(order.getBuyerId())){
            logger.info("PayedOrderDetail orderid :"+orderid+" 的订单不是用户："+memberid+"的");
            throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"不是该用户的订单~");
        }
        Integer  publisherId= order.getPublisherId();
        Integer storeid = order.getStoreId();
        SyMember member = userService.getMemberInfo(publisherId);//tel 发布者的店铺的电话，发布者的电话
        SyMember member2 = userService.getMemberInfo(storeid);//tel 店主名
        String trueName = userService.getUserTrueName(member2);
        //所属产品的所有者，商品的店铺的店主的姓名
        List<Integer> publisherIds=new ArrayList<Integer>();
        publisherIds.add(publisherId);
        //查询店铺信息
        List<SyStore> storeInfos = storeService.getStoreInfoByMid(publisherIds);
        SyStore store=null;
        if( !ObjectUtils.isEmpty(storeInfos)){
            store=storeInfos.get(0);
        }
        if(logger.isDebugEnabled()) {
            logger.info("orderRecord memberInfo"+JSON.toJSONString(storeInfos));

        }
        List<Integer> list=new ArrayList<Integer>();
        List<SyOrder> orderlist=new ArrayList<SyOrder>();

        list.add(orderid);
        orderlist.add(order);
        List<OrderInfo> orderslist = queryOrderService.getMoneyInfo(orderlist, list);
        List<SyOrderLog> orderLogs = queryOrderService.getOrderLogs(orderid, "order");
        Map<String, Object> addressInfo = orderfacade.getAddressInfo(orderid);
        PayedOrderDomain orderDomain = orderfacade.getOrderGoods(orderslist, order,orderLogs,addressInfo,member,store);
        orderDomain.setSellerName(trueName);
        return orderDomain;
	}
  @Override
	public  PayedOrderDomain  getOrderGoods( List<OrderInfo> orderslist,SyOrder order,List<SyOrderLog> logs, Map<String, Object> addressInfo,SyMember member,SyStore store) throws CoreServiceException{
        PayedOrderDomain orders= new PayedOrderDomain();
        try {
        	 if(!CollectionUtils.isEmpty(orderslist)) {
    			 OrderInfo orderInfo = orderslist.get(0);
    			 List<OrderGoods> orderGoodsList = orderInfo.getOrderGoodsList();
    			 Iterator<OrderGoods> iterator = orderGoodsList.iterator();
                 List<Map<String,String>> goodslist= new ArrayList<Map<String,String>>();
    			 while(iterator.hasNext()) {
    				 OrderGoods next = iterator.next();
    				 Map<String,String> goods= new HashMap<String,String>();
    				 goods.put("goodsName",next.getGoodsName());
    				 goods.put("goodsSpec",next.getGoodsImage());
    				 goods.put("goodsImage",next.getGoodsImage());
    				 goods.put("goodsNum",next.getGoodsNum().toString());
    				 goods.put("needPoints", next.getBocPointsPrice().toString());
    				 goods.put("goodsPrice", next.getGoodsPrice().toString());
                     goodslist.add(goods);
    			 }
                 orders.setAllNum(orderInfo.getOrderGoodsNum());
                 orders.setGoodslist(goodslist);
                 orders.setAllGoodsMoney(orderInfo.getGoodsAmount());
                 orders.setAllCouponPay(orderInfo.getCouponPay());
                 orders.setAllShippingFee(orderInfo.getShippingFee());
                 BigDecimal dis= orderInfo.getDiscountAmount();
                 dis= ObjectUtils.isEmpty(dis)?BigDecimal.ZERO:dis;
                 BigDecimal platform= orderInfo.getPlatformPay();
                 platform= ObjectUtils.isEmpty(platform)?BigDecimal.ZERO:platform;
                 orders.setAllVoucherPay(dis.add(platform));
                 orders.setAllNeedPoints(orderInfo.getNeedPoints());
				Integer points= orderInfo.getBuyerGetPoints();
                 orders.setAllCanGetPoints(points);
                 orders.setAllPayMoney(orderInfo.getMoneyPay());
                Long orderSn= order.getOrderSn();
                 String orderSn1= ObjectUtils.isEmpty(orderSn)?"":orderSn.toString();
                 orders.setOrderSn(orderSn1);
    		 }
            List<Map<String,String>> nlogs= new ArrayList<Map<String,String>>();
            for(SyOrderLog log:logs){
                String logMsg = log.getLogMsg();
                Integer logTime = log.getLogTime();
                String time = DateUtil.getIntegerToSdf(logTime.longValue());
                logMsg= ObjectUtils.isEmpty(logMsg)?"":logMsg;
                Map<String,String> map=new HashMap<String,String>();
                map.put("time",time);
                map.put("logMsg",logMsg);
                nlogs.add(map);
            }
            orders.setLogList(nlogs);
           String reciverName= (String)addressInfo.get("reciverName");
           String address= (String)addressInfo.get("address");
           String orderMessage= (String)addressInfo.get("orderMessage");
           String phone= (String)addressInfo.get("phone");
            orders.setAddress(address);
            orders.setReceiverName(reciverName);
            orders.setReceiverTel(phone);
            orders.setMessage(orderMessage);
            String  TelPhone = member.getMemberMobile();
            String qq=member.getMemberQq();
            String tel="";
            if( !ObjectUtils.isEmpty(store)){
                String storeTel = store.getStoreTel();
                tel = ObjectUtils.isEmpty(storeTel)?TelPhone:storeTel;
            }
            orders.setSellerTel(tel);
            orders.setPublisherQQ(qq);
		} catch (Exception e) {
			logger.error("query_payed_order_fail",e);
			throw new CoreServiceException(OrderServiceExcepType.QUERY_ORDER_FAIL,"查询已支付订单失败订单~");
		}
		
		return orders;
	}
	/**
	 * 发布者信息
	 * @param orderinfo
	 * @param goodsProjectType
	 */
	public  void  getPublisherInfo(OrderInfo orderinfo,Integer goodsProjectType) throws CoreServiceException {
		Integer publisherId = orderinfo.getPublisherId();
		Integer assistId = orderinfo.getAssistId();
		SyMember member = userService.getMemberInfo(publisherId);
		String publisherName = userService.getUserTrueName(member);
		String publisherTag = userService.getAgentRoleName(goodsProjectType, assistId, publisherId);
		String topText = userService.getUnpayOrderDetailTopText(goodsProjectType, assistId, publisherId);
		String bottomText = userService.getUnpayOrderDetailBottomText(goodsProjectType, assistId, publisherId);
		orderinfo.setBottomText(bottomText);
		orderinfo.setPublisherName(publisherName);
		orderinfo.setPublisherTag(publisherTag);
		orderinfo.setTopText(topText);
	}
	/**
	 * 善源商场的fundfee
	 * @param syOrderIds
	 * @return
	 * @throws CoreServiceException
	 */
	public  List<Map<String,Object>> getSyShopList(List<Integer> syOrderIds) throws CoreServiceException{
		List<Map<String,Object>> syshopList=new ArrayList<Map<String,Object>>();
		if(!ObjectUtils.isEmpty(syOrderIds)) {
			List<SyOrder> syfundFeelist = queryOrderService.getFundFeeByOrderId(syOrderIds, 24);
			if(!ObjectUtils.isEmpty(syfundFeelist)) {
				for(SyOrder syorder:syfundFeelist) {
					Integer publisherId = syorder.getPublisherId();
					Integer goodsProjectType = syorder.getGoodsProjectType();
					Integer assistId = syorder.getAssistId();
					SyMember member = userService.getMemberInfo(publisherId);
					String publisherName = userService.getUserTrueName(member);
					String publisherTag = userService.getAgentRoleName(goodsProjectType, assistId, publisherId);
					publisherName = publisherTag+publisherName;
					BigDecimal fundFee = syorder.getFundFee();
					fundFee = ObjectUtils.isEmpty(fundFee)?BigDecimal.ZERO:fundFee.divide(new BigDecimal("100"),2, BigDecimal.ROUND_HALF_UP);
					Map<String ,Object> ors=new HashMap<String ,Object>();
					ors.put("publisherName", publisherName);
					ors.put("fundFee", fundFee);
					syshopList.add(ors);
				}
			}
		}
		return syshopList;
	}

	/**
	 * 获得地址信息
	 * @param orderId
	 * @return
	 * @throws CoreServiceException
	 */
	public Map<String ,Object> getAddressInfo(Integer orderId) throws CoreServiceException{
		SyOrderCommon orderCommonInfo = queryOrderService.getOrderCommonInfo(orderId);
		Map<String ,Object> addressInfo=new HashMap<String ,Object>();
		if(!ObjectUtils.isEmpty(orderCommonInfo)) {
			String reciverInfo = orderCommonInfo.getReciverInfo();
			if(!ObjectUtils.isEmpty(reciverInfo)) {
				MixedArray info;
				info = Pherialize.unserialize(reciverInfo).toArray();
				if(!ObjectUtils.isEmpty(info.get("address"))) {
					addressInfo.put("address", info.get("address").toString());
				}
				if(!ObjectUtils.isEmpty(info.get("phone"))) {
					addressInfo.put("phone", info.get("phone").toString());
				}
			}
            String orderMessage = orderCommonInfo.getOrderMessage();
             orderMessage =ObjectUtils.isEmpty(orderMessage) ?"":orderMessage;
            addressInfo.put("orderMessage",orderMessage);
            String reciverName = orderCommonInfo.getReciverName();
			addressInfo.put("reciverName", reciverName);
		}
		return addressInfo;
	}

}
