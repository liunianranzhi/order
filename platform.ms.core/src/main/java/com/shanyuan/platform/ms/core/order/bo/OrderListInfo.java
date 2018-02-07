package com.shanyuan.platform.ms.core.order.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.shanyuan.platform.ms.core.user.bo.VoucherBo;
import com.shanyuan.platform.ms.dao.user.entity.SyAddress;
import com.shanyuan.platform.ms.dao.user.entity.SyVoucher;

public class OrderListInfo implements Serializable{
	private static final long serialVersionUID = 1L;

		//地址信息
		 private  SyAddress syAddress;
		 private  SyVoucher voucherInfo;
	 
		private BigDecimal allGoodsAmount=BigDecimal.ZERO;
		private BigDecimal storeDisCount =BigDecimal.ZERO; ;//店铺优惠券 优惠金额
		private BigDecimal platformDiscount =BigDecimal.ZERO; ;//平台优惠  优惠金额
		//需要支付的积分 总积分
		private Integer allBocPointsUsed=0;
		private BigDecimal orderAmount=BigDecimal.ZERO;
		private BigDecimal shipFee=BigDecimal.ZERO;
		private BigDecimal couponPay=BigDecimal.ZERO;
		//实际支付金额
		private BigDecimal moneyPay=BigDecimal.ZERO;
		//可以获得的积分
		 private 	Integer buyerGetPoint=0;
		//贫困户可获得的金额
		 private 	BigDecimal helpFee=BigDecimal.ZERO;
		//公益捐赠的总和
	    private 	BigDecimal fundFee=BigDecimal.ZERO;
		//预设服务（手续）费
	    private 	BigDecimal serviceFee=BigDecimal.ZERO;
		//预设服务费（手续）率
	    private 	BigDecimal serviceRate=BigDecimal.ZERO; 
	 
	 //订单列表
	 private  List<OrderShowInfo> orderShowInfo;
	 private  List<VoucherBo> actualVoucherList;

	public SyAddress getSyAddress() {
		return syAddress;
	}

	public void setSyAddress(SyAddress syAddress) {
		this.syAddress = syAddress;
	}

	public BigDecimal getAllGoodsAmount() {
		return allGoodsAmount;
	}

	public SyVoucher getVoucherInfo() {
		return voucherInfo;
	}

	public void setVoucherInfo(SyVoucher voucherInfo) {
		this.voucherInfo = voucherInfo;
	}

	public void setAllGoodsAmount(BigDecimal allGoodsAmount) {
		this.allGoodsAmount = allGoodsAmount;
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

	public Integer getAllBocPointsUsed() {
		return allBocPointsUsed;
	}

	public void setAllBocPointsUsed(Integer allBocPointsUsed) {
		this.allBocPointsUsed = allBocPointsUsed;
	}

	public BigDecimal getOrderAmount() {
		return orderAmount;
	}

	public List<VoucherBo> getActualVoucherList() {
		return actualVoucherList;
	}

	public void setActualVoucherList(List<VoucherBo> actualVoucherList) {
		this.actualVoucherList = actualVoucherList;
	}

	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}

	public BigDecimal getShipFee() {
		return shipFee;
	}

	public void setShipFee(BigDecimal shipFee) {
		this.shipFee = shipFee;
	}

	public BigDecimal getCouponPay() {
		return couponPay;
	}

	public void setCouponPay(BigDecimal couponPay) {
		this.couponPay = couponPay;
	}

	public BigDecimal getMoneyPay() {
		return moneyPay;
	}

	public void setMoneyPay(BigDecimal moneyPay) {
		this.moneyPay = moneyPay;
	}


	public Integer getBuyerGetPoint() {
		return buyerGetPoint;
	}

	public void setBuyerGetPoint(Integer buyerGetPoint) {
		this.buyerGetPoint = buyerGetPoint;
	}


	public BigDecimal getFundFee() {
		return fundFee;
	}

	public void setFundFee(BigDecimal fundFee) {
		this.fundFee = fundFee;
	}

	public BigDecimal getServiceFee() {
		return serviceFee;
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

	public List<OrderShowInfo> getOrderShowInfo() {
		return orderShowInfo;
	}

	public void setOrderShowInfo(List<OrderShowInfo> orderShowInfo) {
		this.orderShowInfo = orderShowInfo;
	}

	public BigDecimal getHelpFee() {
		return helpFee;
	}

	public void setHelpFee(BigDecimal helpFee) {
		this.helpFee = helpFee;
	}

	@Override
	public String toString() {
		return "OrderListInfo [syAddress=" + syAddress + ", allGoodsAmount=" + allGoodsAmount + ", storeDisCount="
				+ storeDisCount + ", platformDiscount=" + platformDiscount + ", allBocPointsUsed=" + allBocPointsUsed
				+ ", orderAmount=" + orderAmount + ", shipFee=" + shipFee + ", couponPay=" + couponPay + ", moneyPay="
				+ moneyPay + ", buyerGetPoint=" + buyerGetPoint + ", helpFee=" + helpFee + ", fundFee=" + fundFee
				+ ", serviceFee=" + serviceFee + ", serviceRate=" + serviceRate + ", orderShowInfo=" + orderShowInfo
				+ "]";
	}

	 
}
