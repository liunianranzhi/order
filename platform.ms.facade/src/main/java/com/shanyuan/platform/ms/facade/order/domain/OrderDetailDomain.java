package com.shanyuan.platform.ms.facade.order.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.core.constant.OrderConstant;
import com.shanyuan.platform.ms.core.order.bo.OrderInfo;

public class OrderDetailDomain implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//订单总金额商品总价加总运费
	private BigDecimal allOrderAmount=BigDecimal.ZERO;
	//订单实际支付总价
	private BigDecimal allPayMoney=BigDecimal.ZERO;
	//订单总金额总运费
	private BigDecimal allShipFee=BigDecimal.ZERO;
	//可以获得的积分
	private BigDecimal allCanToPoints=BigDecimal.ZERO;
	//可以获得的积分
	private BigDecimal allGoodsAmount=BigDecimal.ZERO;
	//可以获得的积分
	private BigDecimal allCanGetPoints=BigDecimal.ZERO;
	//优惠的总金额
	private BigDecimal allPlatformMoney=BigDecimal.ZERO;
	private BigDecimal allDiscountMoney=BigDecimal.ZERO;
	//扶贫码支付的金额
	private BigDecimal allCouponMoney=BigDecimal.ZERO;
	//贫困户可获得的总金额
	private BigDecimal allPoorSupportMoney=BigDecimal.ZERO;
	//公益捐赠的总和
	private BigDecimal allFundTotalMoney=BigDecimal.ZERO;
	//非善源商场总共的捐赠的基金金额
	private BigDecimal normalFundFee=BigDecimal.ZERO;
	//需要支付的积分 总积分
	private Integer allNeedPoints=0;
	//总商品数
	private Integer allGoodsNum=0;
	//地址信息
	private Map<String,Object> addressInfo;
	    List<OrderInfo> orderList=new ArrayList<OrderInfo>();
	    
	    List<Map<String,Object>> syshopList=new ArrayList<Map<String,Object>>();
	    public void addSyshop(Map<String,Object> order) {
	    	syshopList.add(order);
	    }
	    public void addOrderInfo(OrderInfo order) {
	    	Integer goodsProjectType = order.getGoodsProjectType();
			BigDecimal orderAmount = order.getOrderAmount();
			BigDecimal moneyPay = order.getMoneyPay();
			BigDecimal couponPay = order.getCouponPay();
			BigDecimal discountAmount = order.getDiscountAmount();
			BigDecimal platformPay = order.getPlatformPay();
			BigDecimal goodsAmount = order.getGoodsAmount();
			BigDecimal shippingFee = order.getShippingFee();
			Integer needPoints = order.getNeedPoints();
			BigDecimal poorSupportMoney = order.getPoorSupportMoney();
			Integer orderGoodsNum = order.getOrderGoodsNum();
			orderGoodsNum = ObjectUtils.isEmpty(orderGoodsNum)?0:orderGoodsNum;
			needPoints = ObjectUtils.isEmpty(needPoints)?0:needPoints;
			orderAmount = ObjectUtils.isEmpty(orderAmount)?BigDecimal.ZERO:orderAmount;
			moneyPay = ObjectUtils.isEmpty(moneyPay)?BigDecimal.ZERO:moneyPay;
			couponPay = ObjectUtils.isEmpty(couponPay)?BigDecimal.ZERO:couponPay;
			discountAmount = ObjectUtils.isEmpty(discountAmount)?BigDecimal.ZERO:discountAmount;
			platformPay = ObjectUtils.isEmpty(platformPay)?BigDecimal.ZERO:platformPay;
			goodsAmount = ObjectUtils.isEmpty(goodsAmount)?BigDecimal.ZERO:goodsAmount;
			shippingFee = ObjectUtils.isEmpty(shippingFee)?BigDecimal.ZERO:shippingFee;
			poorSupportMoney = ObjectUtils.isEmpty(poorSupportMoney)?BigDecimal.ZERO:poorSupportMoney;
			this.allNeedPoints += needPoints;
			this.allOrderAmount = this.allOrderAmount.add(orderAmount);
			this.allPayMoney = this.allPayMoney.add(moneyPay);
			this.allGoodsAmount = this.allGoodsAmount.add(goodsAmount);
			this.allCouponMoney = this.allCouponMoney.add(couponPay);
			this.allPlatformMoney = this.allPlatformMoney.add(platformPay);
			this.allDiscountMoney = this.allDiscountMoney.add(discountAmount);
			this.allPoorSupportMoney =this.allPoorSupportMoney.add(poorSupportMoney);
			this.allShipFee= this.allShipFee.add(shippingFee);
			if(!ObjectUtils.isEmpty(goodsProjectType)&&!goodsProjectType.equals(OrderConstant.ProjectType.PROJECT_TYPE_SY_SHOP)) {
				//不是善源商场+运费 才有获得积分 非善源商场：商品金额+运费-店铺优惠-平台优惠
				this.allCanToPoints = this.allCanToPoints.add(orderAmount).subtract(platformPay) ;
			}
			this.allGoodsNum += orderGoodsNum;
	    	this.orderList.add(order);
	    }
		public BigDecimal getAllCanGetPoints() {
			return allCanGetPoints;
		}
		public void setAllCanGetPoints() {
			this.allCanGetPoints =this.allCanToPoints.multiply(OrderConstant.FeeRate.BOC_POINT_RATE);
		}
		public BigDecimal getAllPoorSupportMoney() {
			return allPoorSupportMoney;
		}
		public void setAllPoorSupportMoney(BigDecimal allPoorSupportMoney) {
			this.allPoorSupportMoney = allPoorSupportMoney;
		}
		public BigDecimal getAllFundTotalMoney() {
			return allFundTotalMoney;
		}
		public BigDecimal getAllOrderAmount() {
			return allOrderAmount;
		}
		public void setAllOrderAmount(BigDecimal allOrderAmount) {
			this.allOrderAmount = allOrderAmount;
		}
		public BigDecimal getAllPayMoney() {
			return allPayMoney;
		}
		public void setAllPayMoney(BigDecimal allPayMoney) {
			this.allPayMoney = allPayMoney;
		}
		public BigDecimal getAllShipFee() {
			return allShipFee;
		}
		public void setAllShipFee(BigDecimal allShipFee) {
			this.allShipFee = allShipFee;
		}
		public BigDecimal getAllCanToPoints() {
			return allCanToPoints;
		}
		public void setAllCanToPoints(BigDecimal allCanToPoints) {
			this.allCanToPoints = allCanToPoints;
		}
		public BigDecimal getAllGoodsAmount() {
			return allGoodsAmount;
		}
		public void setAllGoodsAmount(BigDecimal allGoodsAmount) {
			this.allGoodsAmount = allGoodsAmount;
		}
		public BigDecimal getAllPlatformMoney() {
			return allPlatformMoney;
		}
		public void setAllPlatformMoney(BigDecimal allPlatformMoney) {
			this.allPlatformMoney = allPlatformMoney;
		}
		public BigDecimal getAllDiscountMoney() {
			return allDiscountMoney;
		}
		public void setAllDiscountMoney(BigDecimal allDiscountMoney) {
			this.allDiscountMoney = allDiscountMoney;
		}
		public BigDecimal getAllCouponMoney() {
			return allCouponMoney;
		}
		public void setAllCouponMoney(BigDecimal allCouponMoney) {
			this.allCouponMoney = allCouponMoney;
		}
		public Integer getAllNeedPoints() {
			return allNeedPoints;
		}
		public void setAllNeedPoints(Integer allNeedPoints) {
			this.allNeedPoints = allNeedPoints;
		}
		public Integer getAllGoodsNum() {
			return allGoodsNum;
		}
		public void setAllGoodsNum(Integer allGoodsNum) {
			this.allGoodsNum = allGoodsNum;
		}
		public List<OrderInfo> getOrderList() {
			return orderList;
		}
		public void setOrderList(List<OrderInfo> orderList) {
			this.orderList = orderList;
		}
		public List<Map<String, Object>> getSyshopList() {
			return syshopList;
		}
		public void setSyshopList(List<Map<String, Object>> syshopList) {
			this.syshopList = syshopList;
		}
		public void setAllCanGetPoints(BigDecimal allCanGetPoints) {
			this.allCanGetPoints = allCanGetPoints;
		}
		public void setAllFundTotalMoney(BigDecimal allFundTotalMoney) {
			this.allFundTotalMoney = allFundTotalMoney;
		}
		public Map<String,Object> getAddressInfo() {
			return addressInfo;
		}
		public void setAddressInfo(Map<String,Object> addressInfo) {
			this.addressInfo = addressInfo;
		}
		public BigDecimal getNormalFundFee() {
			return normalFundFee;
		}
		public void setNormalFundFee(BigDecimal normalFundFee) {
			this.normalFundFee = normalFundFee;
		}
		
		@Override
		public String toString() {
			return "OrderDetailVo [allOrderAmount=" + allOrderAmount + ", allPayMoney=" + allPayMoney + ", allShipFee="
					+ allShipFee + ", allCanToPoints=" + allCanToPoints + ", allCanGetPoints=" + allCanGetPoints
					+ ", allPlatformMoney=" + allPlatformMoney + ", allDiscountMoney=" + allDiscountMoney
					+ ", allCouponMoney=" + allCouponMoney + ", allPoorSupportMoney=" + allPoorSupportMoney
					+ ", allFundTotalMoney=" + allFundTotalMoney + ", normalFundFee=" + normalFundFee
					+ ", allNeedPoints=" + allNeedPoints + ", allGoodsNum=" + allGoodsNum + ", addressInfo="
					+ addressInfo + ", orderList=" + orderList + ", syshopList=" + syshopList + "]";
		}
	    
}
