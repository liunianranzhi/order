package com.shanyuan.platform.ms.core.order.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.dao.order.entity.SyOrder;

public class OrderRecordInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 需要的积分
	 */
	private Integer totalPoints;

    /**
     * 支付单号
     */
    private String paySn;
    /**
     * 产品类型
     */
    private String ownerType;

    /**
     * 卖家店铺id
     */
    private Integer storeId;
    /**
     * orderid
     */
    private Integer orderId;
    /**
     * 商品总件数
     */
    private Integer goodsNum;
    /**
     * 总单数
     */
    private Integer orderNum;

    /**
     * 订单状态：0(已取消);1(默认):已创建;10:过期失败;12:支付中;15:已付款;20:未确认/待同意; 25:已审核/待发货;28:待资助者付款;30:已发货;40:已完成;50:退款;60:已删除;70:协商成功;80:协商失败
     */
    private String orderState;

    /**
     * 买家id
     */
    private Integer buyerId;
    
    /**
     * 退款记录ID
     */
    private Integer refundId;

    /**
     * 购物劵支付金额单位分
     */
    private BigDecimal couponPay;

    /**
     * 实际支付金额单位分
     */
    private BigDecimal moneyPay;
    /**
     * 满减总金额单位分(平台承担)
     */
    private BigDecimal platformPay;
    /**
     * 运费
     */
    private BigDecimal shippingFee;
    /**
     * 满减总金额单位分
     */
    private BigDecimal discountAmount;
    
    private BigDecimal orderAmount;
    
    private BigDecimal goodsAmount;
    private  List<OrderGoods> orderGoodsList;
    
    //被卖家拒绝次数
    private Integer refundCount;
    //申请退款
    private Integer complainId;
    private String tel;
    private String evaluateStatus;
    
    public OrderRecordInfo() {
		
	}
    
    
	//goodsinfo
	public OrderRecordInfo(SyOrder op) {
		String orderState = op.getOrderState();
		Long paySn = op.getPaySn();
		BigDecimal couponPay = op.getCouponPay();
		BigDecimal orderAmount = op.getOrderAmount();
		BigDecimal platformPay = op.getPlatformPay();
		BigDecimal discountAmount = op.getDiscountAmount();
		BigDecimal moneyPay = op.getMoneyPay();
		BigDecimal goodsAmount = op.getGoodsAmount();
		BigDecimal shippingFee = op.getShippingFee();
		Integer buyerId = op.getBuyerId();
		Integer orderNum = op.getOrderNum();
		orderNum =ObjectUtils.isEmpty(orderNum)?0:orderNum;
		couponPay = ObjectUtils.isEmpty(couponPay)?BigDecimal.ZERO:couponPay.divide(new BigDecimal("100"),2, BigDecimal.ROUND_UP);
		moneyPay = ObjectUtils.isEmpty(moneyPay)?BigDecimal.ZERO:moneyPay.divide(new BigDecimal("100"),2, BigDecimal.ROUND_UP);
		orderAmount = ObjectUtils.isEmpty(orderAmount)?BigDecimal.ZERO:orderAmount.divide(new BigDecimal("100"),2, BigDecimal.ROUND_UP);
		goodsAmount = ObjectUtils.isEmpty(goodsAmount)?BigDecimal.ZERO:goodsAmount.divide(new BigDecimal("100"),2, BigDecimal.ROUND_UP);
		platformPay = ObjectUtils.isEmpty(platformPay)?BigDecimal.ZERO:platformPay.divide(new BigDecimal("100"),2, BigDecimal.ROUND_UP);
		discountAmount = ObjectUtils.isEmpty(discountAmount)?BigDecimal.ZERO:discountAmount.divide(new BigDecimal("100"),2, BigDecimal.ROUND_UP);
		shippingFee = ObjectUtils.isEmpty(shippingFee)?BigDecimal.ZERO:shippingFee.divide(new BigDecimal("100"),2, BigDecimal.ROUND_UP);
		//已支付
		Integer orderId = op.getOrderId();
		Integer storeId = op.getStoreId();
		this.moneyPay = moneyPay;
		this.orderId = orderId;
		this.storeId = storeId;
		this.orderState = orderState;
		this.paySn = paySn.toString();
		this.couponPay = couponPay;
		this.orderAmount = orderAmount;
		this.goodsAmount = goodsAmount;
		this.platformPay = platformPay;
		this.shippingFee = shippingFee;
		this.discountAmount = discountAmount;
		this.buyerId = buyerId;
		this.orderNum = orderNum;
		
	}
    
    public String getPaySn() {
		return paySn;
	}
	public void setPaySn(String paySn) {
		this.paySn = paySn;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	public String getOrderState() {
		return orderState;
	}
	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}
	public Integer getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}
	public Integer getRefundId() {
		return refundId;
	}
	public void setRefundId(Integer refundId) {
		this.refundId = refundId;
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
	public BigDecimal getPlatformPay() {
		return platformPay;
	}
	public void setPlatformPay(BigDecimal platformPay) {
		this.platformPay = platformPay;
	}
	public BigDecimal getShippingFee() {
		return shippingFee;
	}
	public void setShippingFee(BigDecimal shippingFee) {
		this.shippingFee = shippingFee;
	}
	public BigDecimal getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}
	public BigDecimal getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}
	public BigDecimal getGoodsAmount() {
		return goodsAmount;
	}
	public void setGoodsAmount(BigDecimal goodsAmount) {
		this.goodsAmount = goodsAmount;
	}
	public Integer getRefundCount() {
		return refundCount;
	}

	public void setRefundCount(Integer refundCount) {
		this.refundCount = refundCount;
	}

	public Integer getComplainId() {
		return complainId;
	}

	public void setComplainId(Integer complainId) {
		this.complainId = complainId;
	}

	private String  publisherName;
    
    public String getOwnerType() {
		return ownerType;
	}


	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}


	public String getPublisherName() {
		return publisherName;
	}


	public String publisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEvaluateStatus() {
		return evaluateStatus;
	}

	public void setEvaluateStatus(String evaluateStatus) {
		this.evaluateStatus= evaluateStatus;
	}

	public List<OrderGoods> getOrderGoodsList() {
		return orderGoodsList;
	}

	public void setOrderGoodsList(List<OrderGoods> orderGoodsList) {
		this.orderGoodsList = orderGoodsList;
	}
	//从order_goods表中来的
	public Integer getTotalPoints() {
		return totalPoints;
	}
	public void setTotalPoints(Integer totalPoints) {
		this.totalPoints = totalPoints;
	}
	public Integer getStoreId() {
		return storeId;
	}
	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}
	public Integer getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}
	//从order_goods表中来的
	@Override
	public String toString() {
		return "OrderRecordInfo [totalPoints=" + totalPoints + ", paySn=" + paySn + ", storeId=" + storeId
				+ ", orderId=" + orderId + ", goodsNum=" + goodsNum + ", orderNum=" + orderNum + ", orderState="
				+ orderState + ", buyerId=" + buyerId + ", refundId=" + refundId + ", couponPay=" + couponPay
				+ ", moneyPay=" + moneyPay + ", shippingFee =" + shippingFee + ", platformPay=" + platformPay + ", discountAmount=" + discountAmount
				+ ", orderAmount=" + orderAmount + ", goodsAmount=" + goodsAmount + ", orderGoodsList=" + orderGoodsList
				+ ", refundCount=" + refundCount + ", complainId=" + complainId + ", tel=" + tel + ", evaluateStatus="
				+ evaluateStatus + ", publisherInfo=" + publisherName + "]";
	}
	




}
