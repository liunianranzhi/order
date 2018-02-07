package com.shanyuan.platform.ms.core.order.bo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.core.user.po.CouponPayInfo;


public class DisOrderGoodsInfo {
	//订单金额要重新处理
	private BigDecimal allGoodsAmount=BigDecimal.ZERO;
	private String disOrderKey;
	private String OrderMessage="";
	private Integer orderId;
	private BigDecimal storeDisCount ;//店铺优惠券 优惠金额
	private BigDecimal platformDiscount ;//平台优惠  优惠金额
	private CouponPayInfo couponPayInfo;
	//需要支付的积分 总积分
	private Integer allBocPointsUsed=0;
	private BigDecimal orderAmount=BigDecimal.ZERO;
	private BigDecimal shipFee=BigDecimal.ZERO;
	private BigDecimal couponPay=BigDecimal.ZERO;
	//实际支付金额
	private BigDecimal moneyPay=BigDecimal.ZERO;
	//可以获得的积分
	 private 	BigDecimal buyerGetRate=BigDecimal.ZERO;
	 private 	BigDecimal buyerGetPoint=BigDecimal.ZERO;
	//贫困户可获得的金额
	 private 	BigDecimal helpRate=BigDecimal.ZERO;
	//贫困户可获得的金额
	 private 	BigDecimal helpFee=BigDecimal.ZERO;
	//公益捐赠的总和
    private 	BigDecimal fundFee=BigDecimal.ZERO;
	//公益捐赠费率
    private 	BigDecimal fundRate=BigDecimal.ZERO;
	//预设服务（手续）费
    private 	BigDecimal serviceFee=BigDecimal.ZERO;
	//预设服务费（手续）率
    private 	BigDecimal serviceRate=BigDecimal.ZERO; 
	 private 	BigDecimal needRate=BigDecimal.ZERO;
	 private 	Long orderSn;
	//==================start
	 
	public BigDecimal getServiceFee() {
		return serviceFee;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Long getOrderSn() {
		return orderSn;
	}
	public void setOrderSn(Long orderSn) {
		this.orderSn = orderSn;
	}
	public BigDecimal getBuyerGetRate() {
		return buyerGetRate;
	}
	public void setBuyerGetRate(BigDecimal buyerGetRate) {
		this.buyerGetRate = buyerGetRate;
	}
	public BigDecimal getBuyerGetPoint() {
		return buyerGetPoint;
	}
	public void setBuyerGetPoint(BigDecimal buyerGetPoint) {
		this.buyerGetPoint = buyerGetPoint;
	}
	public void setServiceFee(BigDecimal serviceFee) {
		this.serviceFee = serviceFee;
	}
	public BigDecimal getServiceRate() {
		return serviceRate;
	}
	public void setServiceRate(BigDecimal serviceRate) {
		this.serviceRate = serviceRate;
	}
	public BigDecimal getCouponPay() {
		return couponPay;
	}
	public void setCouponPay(BigDecimal couponPay) {
		this.couponPay = couponPay;
	}
	public BigDecimal getHelpRate() {
		return helpRate;
	}
	public void setHelpRate(BigDecimal helpRate) {
		this.helpRate = helpRate;
	}
	public BigDecimal getHelpFee() {
		return helpFee;
	}
	public void setHelpFee(BigDecimal helpFee) {
		this.helpFee = helpFee;
	}
	public BigDecimal getFundFee() {
		return fundFee;
	}
	public void setFundFee(BigDecimal fundFee) {
		this.fundFee = fundFee;
	}
	public BigDecimal getFundRate() {
		return fundRate;
	}
	public void setFundRate(BigDecimal fundRate) {
		this.fundRate = fundRate;
	}
	public BigDecimal getNeedRate() {
		return needRate;
	}
	public void setNeedRate(BigDecimal needRate) {
		this.needRate = needRate;
	}
	public void setAllBocPointsUsed(Integer allBocPointsUsed) {
		this.allBocPointsUsed = allBocPointsUsed;
	}
	public void setGoodsInfoList(List<GoodsInfo> goodsInfoList) {
		this.goodsInfoList = goodsInfoList;
	}
	//=================================== end 
	
	List<GoodsInfo> goodsInfoList=new ArrayList<GoodsInfo>();
	
	public DisOrderGoodsInfo(String disOrderKey) {
		this.disOrderKey=disOrderKey;
	}
	public DisOrderGoodsInfo() {
	}
	public void addGoodsInfo(GoodsInfo goodsInfo) {
		goodsInfoList.add(goodsInfo);
		/*BigDecimal goodsMoneyTotal = goodsInfo.getGoodsMoneyTotal();
		goodsMoneyTotal =ObjectUtils.isEmpty(goodsMoneyTotal)?new BigDecimal("0.00"):goodsMoneyTotal;
		allGoodsAmount =allGoodsAmount.add(goodsMoneyTotal);
		if(goodsInfo.getGoodsProjectType().compareTo(OrderConstant.ProjectType.PROJECT_TYPE_SY_SHOP)==0) {
			BigDecimal bocprice = goodsInfo.getBocPointsPrice();
			bocprice =ObjectUtils.isEmpty(bocprice)?BigDecimal.ZERO:bocprice;
			Integer goodsPoint =bocprice.multiply(OrderUtil.getBocPointsRate()).setScale(2, BigDecimal.ROUND_UP).intValue();
			Integer goodsNum = goodsInfo.getGoodsNum();
			goodsNum = ObjectUtils.isEmpty(goodsNum)?0:goodsNum;
			allBocPointsUsed += goodsPoint*goodsNum;
		}*/
	}
	public List<GoodsInfo> getGoodsInfoList(){
		return this.goodsInfoList;
	}
	public BigDecimal getAllGoodsAmount() {
		return allGoodsAmount;
	}
	public void setAllGoodsAmount(BigDecimal allGoodsAmount) {
		this.allGoodsAmount = allGoodsAmount;
	}
	public CouponPayInfo getCouponPayInfo() {
		return couponPayInfo;
	}
	public void setCouponPayInfo(CouponPayInfo couponPayInfo) {
		this.couponPayInfo = couponPayInfo;
	}
	public BigDecimal getShipFee() {
		return shipFee;
	}
	public void setShipFee(BigDecimal shipFee) {
		if(ObjectUtils.isEmpty(shipFee)) {
			shipFee=new BigDecimal(0.0);
		}
		this.shipFee = shipFee;
	}
	
	public BigDecimal getMoneyPay() {
		return moneyPay;
	}
	public void setMoneyPay(BigDecimal moneyPay) {
		this.moneyPay = moneyPay;
	}
	public BigDecimal getOrderAmount() {
		return this.orderAmount;
	}
	
	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getOrderMessage() {
		return OrderMessage;
	}
	public void setOrderMessage(String orderMessage) {
		OrderMessage = orderMessage;
	}
	public Integer getAllBocPointsUsed() {
		return allBocPointsUsed;
	}
	public BigDecimal getStoreDisCount() {
		return storeDisCount;
	}
	public void setStoreDisCount(BigDecimal storeDisCount) {
		this.storeDisCount = storeDisCount;
	}
	public BigDecimal getPlatformDiscount() {
		return platformDiscount;
	}
	public void setPlatformDiscount(BigDecimal platformDiscount) {
		this.platformDiscount = platformDiscount;
	}
	
	public String getDisOrderKey() {
		return disOrderKey;
	}
	public void setDisOrderKey(String disOrderKey) {
		this.disOrderKey = disOrderKey;
	}
	@Override
	public String toString() {
		return "DisOrderGoodsInfo [allGoodsAmount=" + allGoodsAmount + ", disOrderKey=" + disOrderKey
				+ ", OrderMessage=" + OrderMessage + ", storeDisCount=" + storeDisCount + ", platformDiscount="
				+ platformDiscount + ", couponPayInfo=" + couponPayInfo + ", allBocPointsUsed=" + allBocPointsUsed
				+ ", orderAmount=" + orderAmount + ", shipFee=" + shipFee + ", couponPay=" + couponPay + ", moneyPay="
				+ moneyPay + ", buyerGetRate=" + buyerGetRate + ", buyerGetPoint=" + buyerGetPoint + ", helpRate="
				+ helpRate + ", helpFee=" + helpFee + ", fundFee=" + fundFee + ", fundRate=" + fundRate
				+ ", serviceFee=" + serviceFee + ", serviceRate=" + serviceRate + ", needRate=" + needRate
				+ ", goodsInfoList=" + goodsInfoList + "]";
	}
	

}
