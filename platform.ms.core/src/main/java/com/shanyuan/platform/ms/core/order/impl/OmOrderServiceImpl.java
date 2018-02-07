package com.shanyuan.platform.ms.core.order.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import com.mysql.jdbc.exceptions.jdbc4.MySQLTransactionRollbackException;
import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.base.common.util.SerializeUtil;
import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.OrderConstant;
import com.shanyuan.platform.ms.core.order.DealOrderService;
import com.shanyuan.platform.ms.core.order.OmOrderService;
import com.shanyuan.platform.ms.core.order.bo.DisOrderGoodsInfo;
import com.shanyuan.platform.ms.core.order.bo.GoodsInfo;
import com.shanyuan.platform.ms.core.order.impl.exceptype.OrderServiceExcepType;
import com.shanyuan.platform.ms.core.user.po.CouponPayInfo;
import com.shanyuan.platform.ms.core.user.po.CouponPayInfo.CouponPay;
import com.shanyuan.platform.ms.dao.omorder.entity.OmOrder;
import com.shanyuan.platform.ms.dao.omorder.entity.OmOrderCoupon;
import com.shanyuan.platform.ms.dao.omorder.entity.OmOrderGoods;
import com.shanyuan.platform.ms.dao.omorder.entity.OmOrderLog;
import com.shanyuan.platform.ms.dao.omorder.entity.OmOrderPayment;
import com.shanyuan.platform.ms.dao.omorder.entity.OmOrderSettlement;
import com.shanyuan.platform.ms.dao.omorder.entity.OmOrderVoucher;
import com.shanyuan.platform.ms.dao.omorder.mapper.OmOrderCouponMapper;
import com.shanyuan.platform.ms.dao.omorder.mapper.OmOrderGoodsMapper;
import com.shanyuan.platform.ms.dao.omorder.mapper.OmOrderLogMapper;
import com.shanyuan.platform.ms.dao.omorder.mapper.OmOrderMapper;
import com.shanyuan.platform.ms.dao.omorder.mapper.OmOrderPaymentMapper;
import com.shanyuan.platform.ms.dao.omorder.mapper.OmOrderSettlementMapper;
import com.shanyuan.platform.ms.dao.omorder.mapper.OmOrderVoucherMapper;
import com.shanyuan.platform.ms.dao.user.entity.SyAddress;

/***
 * 
 * @author zy
 *
 */
@Component
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class) 
@EnableTransactionManagement 
public class OmOrderServiceImpl implements OmOrderService {
	final Logger logger = Logger.getLogger(getClass());
	@Autowired
	private OmOrderMapper omOrderMapper ;
	@Autowired
	private OmOrderGoodsMapper omOrderGoodsMapper ;
	@Autowired
	private OmOrderCouponMapper omOrderCouponMapper ;
	@Autowired
	private OmOrderVoucherMapper omOrderVoucherMapper ;
	@Autowired
	private OmOrderSettlementMapper omOrderSettlementMapper ;
	@Autowired
	private OmOrderLogMapper omOrderShippingMapper ;
	@Autowired
	private OmOrderPaymentMapper omOrderPayMapper ;
	
	@Autowired
	private DealOrderService dealOrderService ;
	
	//seller  pay_type
	@Override
	public String addOmOrder(DisOrderGoodsInfo dis,String type,String paySn,String  orderStatus,Integer memberId) throws CoreServiceException {
		if(ObjectUtils.isEmpty(paySn)||ObjectUtils.isEmpty(dis)||ObjectUtils.isEmpty(memberId)) {
			throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"相关参数为空！");	
		}
		OmOrder omOrder = this.getOmOrder(dis, type, paySn, orderStatus,memberId);
		String orderId ="";
		try {
			 omOrderMapper.insertSelective(omOrder);
			 orderId = omOrder.getOrderId();
			}catch(Exception e) {
				logger.error("insert omorder fail:",e);
				throw new CoreServiceException(OrderServiceExcepType.INSERT_ORDER_FAIL,e.getMessage(),e);
			} 
		return orderId;
	}
	@Override
	public Integer addOmOrderShipping(String mainId,String orderId,SyAddress aressInfo) throws CoreServiceException {
		if(ObjectUtils.isEmpty(mainId)||ObjectUtils.isEmpty(orderId)||ObjectUtils.isEmpty(aressInfo)) {
			throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"相关参数为空！");	
		}
		Integer recId = 0;
		try {
			OmOrderLog orship = new OmOrderLog();
			String trueName = aressInfo.getTrueName();
			String telPhone = aressInfo.getTelPhone();
			Integer addressId = aressInfo.getAddressId();
			String address = aressInfo.getAddress();
			Long areaId = aressInfo.getAreaId();
			Long cityId = aressInfo.getCityId();
			
			trueName = ObjectUtils.isEmpty(trueName)?"":trueName;
			telPhone = ObjectUtils.isEmpty(telPhone)?"":telPhone;
			address = ObjectUtils.isEmpty(address)?"":address;
			Integer aId = ObjectUtils.isEmpty(addressId)?0:addressId;
			Integer sareaId = ObjectUtils.isEmpty(areaId)?0:areaId.intValue();
			Integer scityId = ObjectUtils.isEmpty(cityId)?0:cityId.intValue();
			orship.setOrderId(orderId);
			orship.setMainId(mainId);
			orship.setReciverAddrId(aId);
			orship.setReciverName(trueName);
			orship.setReciverPhone(telPhone);
			orship.setReciverAddrInfo(address);
			orship.setReciverProvId(scityId);//暂时先存市id
			orship.setReciverCityId(scityId);
			orship.setReciverAreaId(sareaId);
		    omOrderShippingMapper.insertSelective(orship);
			recId = orship.getRecId();
			System.out.println("logistid: "+recId);
		}catch(Exception e) {
			logger.error("insert omorderlogist fail: orderId is："+orderId,e);
			throw new CoreServiceException(OrderServiceExcepType.INSERT_ORDER_FAIL,e.getMessage(),e);
		} 
		return recId;
	}
	@Override
	public String addOmOrderPayMent(String mainId,String orderId,DisOrderGoodsInfo dis) throws CoreServiceException {
		if(ObjectUtils.isEmpty(mainId)||ObjectUtils.isEmpty(orderId)||ObjectUtils.isEmpty(dis)) {
			throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"相关参数为空！");	
		}
		String recId = "0";
		try {
			OmOrderPayment orpay = new OmOrderPayment();
			orpay.setOrderId(orderId);
			orpay.setMainId(mainId);
			orpay.setPayId(UUID.randomUUID().toString().replaceAll("-", ""));
			//先默认为中银支付；支付结束之后修改
			orpay.setPayCenter("boc");
			orpay.setPayStatus((byte)10);
			BigDecimal moneyPay = dis.getMoneyPay();
			Integer	payFee=	ObjectUtils.isEmpty(moneyPay)?0:moneyPay.intValue();
			orpay.setPayFee(payFee);
			//先默认为创建时间；支付结束之后
			orpay.setPayReqTime(DateUtil.getNowDate());
			orpay.setPayReqMsg("");
			omOrderPayMapper.insertSelective(orpay);
			recId = orpay.getPayId();
			System.out.println("logistid: "+recId);
		}catch(Exception e) {
			logger.error("insert omorderlogist fail: orderId is："+orderId,e);
			throw new CoreServiceException(OrderServiceExcepType.INSERT_ORDER_FAIL,e.getMessage(),e);
		} 
		return recId;
	}
	//这个怎么存 是支付完成之后存还是支付之前存
	@Override
	public Integer addOrderSettement(DisOrderGoodsInfo dis,String orderId,String mainId)
			throws CoreServiceException {
		OmOrderSettlement settlement =new OmOrderSettlement();
		settlement.setOrderId(orderId);
		settlement.setMainId(mainId);
		BigDecimal rate=new BigDecimal(100);
		//预设 start 根据支付方式不同比例不一样
		BigDecimal helpRate = dis.getHelpRate();
		BigDecimal helpFee = dis.getHelpFee();
		//买家可获得的积分
		BigDecimal buyerGetPoint = dis.getBuyerGetPoint();
		BigDecimal buyerGetRate = dis.getBuyerGetRate();
		Integer buyerGetPoint2=ObjectUtils.isEmpty(buyerGetPoint)?0:buyerGetPoint.intValue();
		Integer buyerGetRate2=ObjectUtils.isEmpty(buyerGetRate)?0:buyerGetRate.intValue();
		//预设 end 
		BigDecimal fundFee = dis.getFundFee();
		BigDecimal fundRate = dis.getFundRate();
		
		Integer helpRate2=ObjectUtils.isEmpty(helpRate)?0:helpRate.intValue();
		Integer helpFee2=ObjectUtils.isEmpty(helpFee)?0:helpFee.multiply(rate).intValue();
		Integer fundFee2=ObjectUtils.isEmpty(fundFee)?0:fundFee.intValue();
		Integer fundRate2=ObjectUtils.isEmpty(fundRate)?0:fundRate.intValue();
		
		settlement.setHelpFee(helpFee2);
		settlement.setHelpRate(helpRate2);
		settlement.setFundFee(fundFee2);
		settlement.setFundRate(fundRate2);
		settlement.setSendPoint(buyerGetPoint2);
		settlement.setSendPointRate(buyerGetRate2);
		int insert = omOrderSettlementMapper.insertSelective(settlement);
		return insert;
	}
	//不知道是哪一种方式的优惠？商品描述？ goods_point goods_amount_point remark 少了买家id
	public Integer addOmOrderGoods(GoodsInfo goodsInfo,  String orderId,String mainId,Integer goodsHelpRate,Integer buyerId,
			Integer sharedMid,Integer sharedGoodsCommonId)throws CoreServiceException { 
		Integer recId=0;
		if(ObjectUtils.isEmpty(orderId)||ObjectUtils.isEmpty(goodsInfo)||ObjectUtils.isEmpty(goodsInfo.getGoodsId())||ObjectUtils.isEmpty(goodsInfo.getGoodsCommonid())) {
			throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"相关参数为空！");	
		}
		OmOrderGoods orderGoods=new OmOrderGoods();
		try {
			orderGoods.setOrderId(orderId);
			orderGoods.setGoodsId(goodsInfo.getGoodsId());
			orderGoods.setMainId(mainId);
			orderGoods.setBuyerId(buyerId);
			orderGoods.setGoodsCommonId(goodsInfo.getGoodsCommonid());
			orderGoods.setGoodsName(goodsInfo.getGoodsName());
			Integer goodsprice=ObjectUtils.isEmpty(goodsInfo.getGoodsPrice())?0:goodsInfo.getGoodsPrice().intValue();
			Integer goodsnum=ObjectUtils.isEmpty(goodsInfo.getGoodsNum())?0:goodsInfo.getGoodsNum();
			Integer goodsAmountPrice = goodsprice*goodsnum;
			String goodsImage=ObjectUtils.isEmpty(goodsInfo.getGoodsImage())?"":goodsInfo.getGoodsImage();
			orderGoods.setGoodsPrice(goodsprice);
			orderGoods.setGoodsImage(goodsImage);
			orderGoods.setGoodsAmountPrice(goodsAmountPrice);
		
			Integer goodsPoint=0;
			Integer needPoint = goodsInfo.getNeedPoint();
			
			goodsPoint = ObjectUtils.isEmpty(needPoint)?0:needPoint;
			Integer goodsAmountPoint=goodsPoint*goodsnum;
			orderGoods.setGoodsAmountPoint(goodsAmountPoint);
			orderGoods.setGoodsPoint(goodsPoint);
			String goodsSpec = orderGoods.getGoodsSpec();
			 Map<String, String> map = SerializeUtil.specUnitUnSerialize(goodsSpec);
			 String spec="";
			 String unit="";
			 if(!ObjectUtils.isEmpty(map)) {
					spec = ObjectUtils.isEmpty(map.get("spec"))?"":map.get("spec").toString();
					unit = ObjectUtils.isEmpty(map.get("unit"))?"":map.get("unit").toString();
			 }
			orderGoods.setGoodsSpec(spec);
			orderGoods.setGoodsUnit(unit);
			if(!ObjectUtils.isEmpty(goodsInfo.getGoodsCommonid())&&goodsInfo.getGoodsCommonid().equals(sharedGoodsCommonId)) {
				
			}else {
				sharedMid = 0;
			}
			
			orderGoods.setGoodsNum(goodsnum);
			orderGoods.setShareId(sharedMid);
			BigDecimal storeDiscount = goodsInfo.getStoreDiscount();
			BigDecimal platDiscount = goodsInfo.getPlatDiscount();
			Integer sDisCount =ObjectUtils.isEmpty(storeDiscount)?0:storeDiscount.intValue();
			Integer pDiscount =ObjectUtils.isEmpty(platDiscount)?0:platDiscount.intValue();
			BigDecimal purchasePrice = goodsInfo.getPurchasePrice();
			Integer pPrice = ObjectUtils.isEmpty(purchasePrice)?0:purchasePrice.intValue();
			orderGoods.setStoreDiscountFee(sDisCount);
			orderGoods.setPlatDiscountFee(pDiscount);
			orderGoods.setPurchasePrice(pPrice);
			orderGoods.setGoodsHelpRate(goodsHelpRate);
			omOrderGoodsMapper.insertSelective(orderGoods);
			recId = orderGoods.getInsId();
		}catch(Exception e) {
			logger.error("insert order_goods fail:",e);
			throw new CoreServiceException(OrderServiceExcepType.INSERT_ORDER_GOODS_FAIL,e.getMessage(),e);
		} 
		return recId;
	}
	//每一单的优惠吗？om_order_voucher 
	@Transactional(timeout=36000,rollbackFor=Throwable.class)
	public Integer addOrderVoucher(OmOrderVoucher voucher)throws CoreServiceException  {
		Integer recId=0;
		try {
			recId = omOrderVoucherMapper.insertSelective(voucher);
		}catch(Exception e) {
			logger.error("insert om_order_goods fail:",e);
			throw new CoreServiceException(OrderServiceExcepType.INSERT_ORDER_GOODS_FAIL,e.getMessage(),e);
		}
		return recId;
	}

	
	@Override
	public Integer addOrderCoupon(String orderId, String mainId,Integer memberId, CouponPayInfo couponPayInfo)
			throws CoreServiceException {
		if(ObjectUtils.isEmpty(memberId)||ObjectUtils.isEmpty(orderId)||ObjectUtils.isEmpty(couponPayInfo)) {
			throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"相关参数为空！");	
		}
		Integer id=0;
		 if(!ObjectUtils.isEmpty(couponPayInfo) && !ObjectUtils.isEmpty(couponPayInfo.getCouponPayList())){
			 
		 List<CouponPay> couponPayList = couponPayInfo.getCouponPayList();
		
		 try {
			for(int i=0;i<couponPayList.size();i++) {
				CouponPay couponPay =couponPayList.get(i);
					OmOrderCoupon orderCoupon=new OmOrderCoupon();
					orderCoupon.setOrderId(orderId);
					orderCoupon.setMainId(mainId);
					orderCoupon.setMemberId(memberId);
					orderCoupon.setCouponId(0);//待查
					String couponCode = couponPay.getCouponCode();
					couponCode = ObjectUtils.isEmpty(couponCode)?"":couponCode;
					Long couponBatchSn = couponPay.getCouponBatchSn();
					couponBatchSn = ObjectUtils.isEmpty(couponBatchSn)?0L:couponBatchSn;
					BigDecimal pay = couponPay.getPay();
					Integer pays = ObjectUtils.isEmpty(pay)?0:pay.intValue();
					orderCoupon.setCouponPrice(pays);
					orderCoupon.setCouponCode(couponCode);
					orderCoupon.setCouponBatchSn(couponBatchSn.toString() );
					id= omOrderCouponMapper.insertSelective(orderCoupon);
					
			}
	
		} catch (Exception e) {
			e.printStackTrace();
			 if(e instanceof CoreServiceException) {
				throw (CoreServiceException)e;
			}else if (e instanceof MySQLTransactionRollbackException) {
				throw new CoreServiceException(OrderServiceExcepType.MYSQL_ROLLBACK_EXCEPTION,e.getMessage(),e);
			}else{
				throw new CoreServiceException(CoreServiceExcepType.DEFAULT_TYPE,e.getMessage(),e);
			}
		 }
	}
		return id;
	}
	
	//没有捐赠费用，没有基金费用吗 怎么区分是 店铺还是平台//单位集采走这里吗？
	public OmOrder  getOmOrder(DisOrderGoodsInfo dis,String type,String paySn,String orderStatus,Integer memberId)throws CoreServiceException {
		if(ObjectUtils.isEmpty(dis)||ObjectUtils.isEmpty(dis.getGoodsInfoList())) {
			throw new CoreServiceException(OrderServiceExcepType.ORDER_EMPTY,"订单为空！");
		}
		OmOrder order=new OmOrder();
		
		order.setOrderId(UUID.randomUUID().toString().replaceAll("-", ""));
		order.setMainId(paySn);
		//暂时这样
		Long orderSn = dis.getOrderSn();
		order.setOrderCode(orderSn);
		 order.setMemberId(memberId);
		
		 Integer storeId=dis.getGoodsInfoList().get(0).getStoreId();
		 Integer publisherId=dis.getGoodsInfoList().get(0).getPublisherId();
		 Integer assistId=dis.getGoodsInfoList().get(0).getAssistId();
		 String ownerType = dis.getGoodsInfoList().get(0).getOwnerType();
		 Integer goodsProjectType = dis.getGoodsInfoList().get(0).getGoodsProjectType();
		 Integer bizOperationMid = dis.getGoodsInfoList().get(0).getBizOperationMid();
		 bizOperationMid = ObjectUtils.isEmpty(bizOperationMid)?0:bizOperationMid;
		 publisherId = ObjectUtils.isEmpty(publisherId)?0:publisherId;
		 goodsProjectType = ObjectUtils.isEmpty(goodsProjectType)?0:goodsProjectType;
		 assistId = ObjectUtils.isEmpty(assistId)?0:assistId;
		 storeId = ObjectUtils.isEmpty(storeId)?0:storeId;
		 order.setStoreId(storeId);
		 //sellerid
		 	BigDecimal rate= new BigDecimal("100");
		 	Byte orderType=new Byte("10");
		 if(OrderConstant.ProjectType.PROJECT_TYPE_SY_SHOP.equals(goodsProjectType)) {
			 orderType = new Byte("20");
		 }else if(assistId>0&&OrderConstant.orderType.order_personal.equals(type)) {
			 orderType =new Byte("31");
		 }else if(assistId>0&&OrderConstant.orderType.order_company.equals(type)){
			 orderType =new Byte("32");
		 }
		 order.setOrderType(orderType);
		 Integer poorId=0;
		 Integer agentId=0;
		 String channel=dis.getGoodsInfoList().get(0).getChannel();
		 channel = ObjectUtils.isEmpty(channel)?"":channel;
		 if(OrderConstant.ownerType.OWNER_TYPE_AGENT.equals(ownerType)) {
			 agentId = publisherId;
		 }else if(OrderConstant.ownerType.OWNER_TYPE_POOR.equals(ownerType)) {
			 poorId = publisherId;
		 }
		 order.setAgentId(agentId);
		 order.setPoorId(poorId);
		 order.setOpeCenterId(bizOperationMid);
		 order.setGoodsProjectType(Byte.parseByte(goodsProjectType.toString()));
		 order.setOrderMessage(dis.getOrderMessage());
		 BigDecimal allGoodsAmount = dis.getAllGoodsAmount();
		 allGoodsAmount = ObjectUtils.isEmpty(allGoodsAmount)?BigDecimal.ZERO:allGoodsAmount.multiply(rate);
		
		 BigDecimal shipFee = dis.getShipFee();
		 shipFee = ObjectUtils.isEmpty(shipFee)?BigDecimal.ZERO:shipFee.multiply(rate);
		 
		 BigDecimal storeDisCount = dis.getStoreDisCount();
		 storeDisCount = ObjectUtils.isEmpty(storeDisCount)?BigDecimal.ZERO:storeDisCount.multiply(rate);
		 
		 BigDecimal platformDiscount = dis.getPlatformDiscount();
		 platformDiscount = ObjectUtils.isEmpty(platformDiscount)?BigDecimal.ZERO:platformDiscount;
		 BigDecimal couponPay = dis.getCouponPay();
		 //集采
		 couponPay = !ObjectUtils.isEmpty(couponPay)&&assistId >0?couponPay.multiply(rate):BigDecimal.ZERO;
		 //订单金额 商品金额加运费 - 店铺优惠
		 BigDecimal orderAmount = dis.getOrderAmount();
		 orderAmount = ObjectUtils.isEmpty(orderAmount)?BigDecimal.ZERO:orderAmount.multiply(rate);
		 BigDecimal moneyPay = dis.getMoneyPay();
		 moneyPay = ObjectUtils.isEmpty(moneyPay)?BigDecimal.ZERO:moneyPay.multiply(rate);
		 Integer allBocPointsUsed = dis.getAllBocPointsUsed();
		 allBocPointsUsed = ObjectUtils.isEmpty(allBocPointsUsed)?0:allBocPointsUsed;
		 order.setOrderGoodsPrice(allGoodsAmount.intValue());
		 Byte status= new Byte("10");
		 Byte payStatus= new Byte("10");
		 if(OrderConstant.OrderState.ORDER_STATE_PAYED.equals(orderStatus)) {
			 status= new Byte("20");
			 payStatus = new Byte("19");
		 }
		 order.setOrderStatus(status);
		 order.setPayStatus(payStatus);
		 Integer sellerId = dis.getGoodsInfoList().get(0).getSellerId();
		 sellerId =ObjectUtils.isEmpty(sellerId)?0:sellerId;
		 order.setSellerId(sellerId);
		 order.setOrderAllPrice(orderAmount.intValue());
		 order.setOrderLogistPrice( shipFee.intValue());
		 order.setOrderCouponPrice(couponPay.intValue());
		 order.setOrderPayFee(moneyPay.intValue());
		 order.setOrderUsedPoint(allBocPointsUsed);
		 order.setOrderVoucherPrice((storeDisCount.add(platformDiscount)).intValue());
		 order.setOrderChannel("app");//默认app
		return order;
	}
}
