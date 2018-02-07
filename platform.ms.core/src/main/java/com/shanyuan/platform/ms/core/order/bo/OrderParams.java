package com.shanyuan.platform.ms.core.order.bo;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.core.constant.OrderConstant;
import com.shanyuan.platform.ms.dao.order.entity.SyOrder;

public class OrderParams {
	private Long paySn ;
	@NotNull
	private Integer memberId ;
	
	private Integer orderPayId ;
	
	private String memberName ;
	private String memberTruename ;
	private String appVariant ;
	private String buyerChannel ;
	private Integer sharedMid ;
	private Integer sharedGoodsCommonId ;
	private DisOrderGoodsInfo disogInfo;
	
	private String ownerType;
	private String channel;
	private Integer goodsProjectType;
	private Integer publisherId;
	private Integer assistId;
	
	private Integer bizOperationMid ;
	//最初入口
	private Integer addressId;
	private String ifcart;
	private String idsAndNum;
	private String payName;
	
	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getIfcart() {
		return ifcart;
	}

	public void setIfcart(String ifcart) {
		this.ifcart = ifcart;
	}

	public String getIdsAndNum() {
		return idsAndNum;
	}
	public void setIdsAndNum(String idsAndNum) {
		this.idsAndNum = idsAndNum;
	}

	public String getPayName() {
		return payName;
	}

	public void setPayName(String payName) {
		this.payName = payName;
	}

	public Integer getOrderPayId() {
		return orderPayId;
	}

	public SyOrder getSyOrder( ) {
		SyOrder order=new SyOrder();
		BigDecimal defaultmoney= new BigDecimal("0.00");
		BigDecimal defaultFee= new BigDecimal("0.00");
		Byte defaultByte= new Byte("0");
		
		order.setPaySn(paySn);
		 BigDecimal rate= new BigDecimal("100");
		this.appVariant = ObjectUtils.isEmpty(this.appVariant)?"":this.appVariant;
		 BigDecimal storeDisCount = ObjectUtils.isEmpty(this.disogInfo.getStoreDisCount())?defaultmoney:this.disogInfo.getStoreDisCount().multiply(rate);
		 BigDecimal platformDiscount = ObjectUtils.isEmpty(this.disogInfo.getPlatformDiscount())?defaultmoney:this.disogInfo.getPlatformDiscount().multiply(rate);
		 Integer storeId=this.disogInfo.getGoodsInfoList().get(0).getStoreId();
		 Integer publisherId=this.disogInfo.getGoodsInfoList().get(0).getPublisherId();
		 Integer assistId=this.disogInfo.getGoodsInfoList().get(0).getAssistId();
		 String storeName=this.disogInfo.getGoodsInfoList().get(0).getStoreName();
		 storeName = ObjectUtils.isEmpty(storeName)?"":storeName;
		 publisherId = ObjectUtils.isEmpty(publisherId)?0:publisherId;
		 assistId = ObjectUtils.isEmpty(assistId)?0:assistId;
		 storeId = ObjectUtils.isEmpty(storeId)?0:storeId;
		 String channel=this.disogInfo.getGoodsInfoList().get(0).getChannel();
		 channel = ObjectUtils.isEmpty(channel)?"":channel;
		 
		 Byte poorType=this.disogInfo.getGoodsInfoList().get(0).getPoorType();
		 Integer goodsProjectType = this.disogInfo.getGoodsInfoList().get(0).getGoodsProjectType();
		 goodsProjectType = ObjectUtils.isEmpty(goodsProjectType)?0:goodsProjectType;
		 Long supportCountyId=this.disogInfo.getGoodsInfoList().get(0).getSupportCountyId();
		 supportCountyId = ObjectUtils.isEmpty(supportCountyId)?0L:supportCountyId;
		 Integer time=DateUtil.getNowInt();
		 order.setStoreId(storeId);
		 order.setPublisherId(publisherId);
		 order.setAssistId(assistId);
		 order.setStoreName(storeName);
		 order.setBuyerId(this.memberId);
	
		 order.setBuyerName(this.memberTruename);
		 order.setAddTime(time);
		 order.setPaymentCode("online");
		 order.setGoodsProjectType(goodsProjectType);
		 order.setChannel(channel);
		 order.setBuyerChannel(this.buyerChannel);
		 order.setAppVariant(this.appVariant);
		 order.setFinnshedTime(0);
		 order.setBuyerEmail("");
		 order.setPdAmount(defaultmoney);
		 order.setOrderState("1");
		 order.setOrderFrom("1");
		 order.setApplyerId(0);
		 order.setAgentFee(defaultFee);
		 order.setRefundId(0);
		 order.setWarnLevel(defaultByte);
		 order.setCommunicationStatus(new Byte("1"));
		 order.setDelayedDeliveryState("0");
		 order.setDiscountAmount(storeDisCount);
		 order.setPlatformPay(platformDiscount);
		 order.setSupportCountyId(supportCountyId);
		 order.setRefundId(0);
		 order.setShippingFee(this.disogInfo.getShipFee().multiply(rate));
		 String tradeMode = this.disogInfo.getGoodsInfoList().get(0).getTradeMode();
		 //订单金额 =商品总金额+运费-店铺优惠
		 BigDecimal orderAmount=(disogInfo.getOrderAmount()).multiply(rate);
		 System.out.println("orderAmount"+orderAmount);
		 //实际支付金额 money_pay：订单总金额-平台优惠-扶贫码支付
		 BigDecimal paymoney= orderAmount.subtract(platformDiscount);
		if(orderAmount.compareTo(defaultmoney)== -1) {
			orderAmount=defaultmoney;
		}
		if(paymoney.compareTo(defaultmoney)== -1) {
			paymoney=defaultmoney;
		}
		 System.out.println("paymoney"+paymoney);
		 order.setOrderAmount(orderAmount);
		//商品总金额
		 order.setGoodsAmount(this.disogInfo.getAllGoodsAmount().multiply(rate)); 
		 String tradeModeQkys =  OrderConstant.TradeType.TRADE_MODE_QKYS;
		 if(tradeModeQkys.equals(tradeMode)) {
			 order.setTradeMode(tradeModeQkys);
			 order.setPresellTime(this.disogInfo.getGoodsInfoList().get(0).getPresellTime()); 
		 }else {
			 order.setTradeMode(OrderConstant.TradeType.TRADE_MODE_PT);
			 order.setPresellTime(0); 
		 }
		 //集采
		 if(assistId>0) {
			 if(this.disogInfo.getCouponPayInfo()!=null) {
				 BigDecimal couponPay = this.disogInfo.getCouponPayInfo().getTotalCouponMoney().multiply(rate);
				 order.setCouponPay(couponPay);
			 }else{
				 order.setCouponPay(defaultmoney);
			 }
			 order.setAssistId(assistId);
			//减扶贫码支付
			 order.setMoneyPay(paymoney.subtract(order.getCouponPay())); 
		 }else {
			 order.setCouponPay(defaultmoney);
			 order.setAssistId(0);
			 order.setMoneyPay(paymoney);
		 }
		 if(poorType>0) {
			 order.setVer(new Byte("1"));
		 }else {
			 order.setVer(new Byte("0"));
		 }
		
		return order;
	}
	
	
   


	public void setAssistId(Integer assistId) {
		this.assistId = assistId;
	}


	public Long getPaySn() {
		return paySn;
	}
	public void setPaySn(Long paySn) {
		this.paySn = paySn;
	}
	public Integer getMemberId() {
		return memberId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	public Integer getBizOperationMid() {
		Integer bizOperationMid=this.disogInfo.getGoodsInfoList().get(0).getBizOperationMid();
		bizOperationMid = ObjectUtils.isEmpty(bizOperationMid)?0:bizOperationMid;
		return this.bizOperationMid=bizOperationMid ;
	}
	public void setBizOperationMid(Integer bizOperationMid) {
		this.bizOperationMid = bizOperationMid;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberTruename() {
		
		return memberTruename;
	}
	public void setMemberTruename(String memberTruename) {
		 memberTruename = ObjectUtils.isEmpty(memberTruename)?"":memberTruename;
		this.memberTruename = memberTruename;
	}
	public String getAppVariant() {
		return appVariant;
	}
	
	public void setAppVariant(String appVariant) {
		this.appVariant = appVariant;
	}
	public String getBuyerChannel() {
		return buyerChannel;
	}
	public void setBuyerChannel(String buyerChannel) {
		buyerChannel=ObjectUtils.isEmpty(buyerChannel)?"":buyerChannel;
		this.buyerChannel = buyerChannel;
	}
	public Integer getSharedMid() {
		return sharedMid;
	}
	public void setSharedMid(Integer sharedMid) {
		this.sharedMid = sharedMid;
	}
	public Integer getSharedGoodsCommonId() {
		return sharedGoodsCommonId;
	}
	public void setSharedGoodsCommonId(Integer sharedGoodsCommonId) {
		this.sharedGoodsCommonId = sharedGoodsCommonId;
	}
	public BigDecimal getStoreDisCount() {
		return this.disogInfo.getStoreDisCount();
	}
	public BigDecimal getPlatformDiscount() {
		return this.disogInfo.getPlatformDiscount();
	}
	public DisOrderGoodsInfo getDisogInfo() {
		return disogInfo;
	}
	public void setDisogInfo(DisOrderGoodsInfo disogInfo) {
		this.disogInfo = disogInfo;
	}
	public String getOwnerType() {
		return this.disogInfo.getGoodsInfoList().get(0).getOwnerType();
	}
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}
	 public void setOrderPayId(Integer orderPayId) {
			this.orderPayId = orderPayId;
	}


	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getChannel() {
		 String channel=this.disogInfo.getGoodsInfoList().get(0).getChannel();
		 channel = ObjectUtils.isEmpty(channel)?"":channel;
		return this.channel = channel;
	}
	public Integer getGoodsProjectType() {
		Integer goodsProjectType=this.disogInfo.getGoodsInfoList().get(0).getGoodsProjectType();
		goodsProjectType = ObjectUtils.isEmpty(goodsProjectType)?0:goodsProjectType;
		return this.goodsProjectType=goodsProjectType ;
	}

	public Integer getAssistId() {
		Integer assistId=this.disogInfo.getGoodsInfoList().get(0).getAssistId();
		assistId = ObjectUtils.isEmpty(assistId)?0:assistId;
		return this.assistId=assistId;
	}
	public void setGoodsProjectType(Integer goodsProjectType) {
			this.goodsProjectType = goodsProjectType;
	}
	public Integer getPublisherId() {
		Integer publisherId=this.disogInfo.getGoodsInfoList().get(0).getPublisherId();
		publisherId = ObjectUtils.isEmpty(publisherId)?0:publisherId;
		return this.publisherId=publisherId;
	}

	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
	}
}
