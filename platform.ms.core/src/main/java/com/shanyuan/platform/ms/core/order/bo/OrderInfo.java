package com.shanyuan.platform.ms.core.order.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.dao.order.entity.SyOrder;

/**
 * 
 * @author zy
 *
 */
public class OrderInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 订单id
	 */
	   private Integer orderId;
	   /**
	    * 项目类型
	    */
	   private Integer  goodsProjectType;
	    /**
	     * 订单状态：0(已取消);1(默认):已创建;10:过期失败;12:支付中;15:已付款;20:未确认/待同意; 25:已审核/待发货;28:待资助者付款;30:已发货;40:已完成;50:退款;60:已删除;70:协商成功;80:协商失败
	     */
	    private String orderState;

	    /**
	     * 买家id
	     */
	    private Integer buyerId;
	    

	    /**
	     * 购物劵支付金额单位分
	     */
	    private BigDecimal couponPay = BigDecimal.ZERO;

	    /**
	     * 实际支付金额单位分
	     */
	    private BigDecimal moneyPay = BigDecimal.ZERO;
	    /**
	     * 满减总金额单位分(平台承担)
	     */
	    private BigDecimal platformPay = BigDecimal.ZERO;
	    /**
	     * 运费
	     */
	    private BigDecimal shippingFee = BigDecimal.ZERO;
	    /**
	     * 满减总金额单位分
	     */
	    private BigDecimal discountAmount = BigDecimal.ZERO;
	    
	    private BigDecimal orderAmount = BigDecimal.ZERO;
	    
	    private BigDecimal goodsAmount = BigDecimal.ZERO;
	    private BigDecimal fundFee = BigDecimal.ZERO;
	    private BigDecimal serviceFee = BigDecimal.ZERO;
	   
	    private Integer publisherId;
	    private Integer storeId;
	    private Integer assistId;
	    private String orderSn;
	    private String finshedTime;
	    
	    /**
	     * 需要的积分
	     */
	    private Integer needPoints =0;
	  //贫困户可获得的总金额
		private BigDecimal poorSupportMoney=BigDecimal.ZERO;
		private Integer buyerGetPoints=0;
		
		public Integer getBuyerGetPoints() {
			return buyerGetPoints;
		}
		public void setBuyerGetPoints(Integer buyerGetPoints) {
			this.buyerGetPoints = buyerGetPoints;
		}
		public BigDecimal getPoorSupportMoney() {
			return poorSupportMoney;
		}
		public void setPoorSupportMoney(BigDecimal poorSupportMoney) {
			this.poorSupportMoney = poorSupportMoney;
		}


		public String getOrderSn() {
			return orderSn;
		}
		public void setOrderSn(String orderSn) {
			this.orderSn = orderSn;
		}


		public BigDecimal getServiceFee() {
			return serviceFee;
		}
		public void setServiceFee(BigDecimal serviceFee) {
			this.serviceFee = serviceFee;
		}


		private String paySn;

	    public OrderInfo() {
			
		}
		//goodsinfo
		public OrderInfo(SyOrder op) {
			String orderState = op.getOrderState();
			
			Long paySn = op.getPaySn();
			
			Integer goodsProjectType = op.getGoodsProjectType();
			BigDecimal fundFee = op.getFundFee();
			BigDecimal couponPay = op.getCouponPay();
			BigDecimal orderAmount = op.getOrderAmount();
			BigDecimal platformPay = op.getPlatformPay();
			BigDecimal discountAmount = op.getDiscountAmount();
			BigDecimal moneyPay = op.getMoneyPay();
			BigDecimal goodsAmount = op.getGoodsAmount();
			BigDecimal shippingFee = op.getShippingFee();
			BigDecimal serviceFee2 = op.getServiceFee();
			Integer buyerId = op.getBuyerId();
			Integer publisherId = op.getPublisherId();
			fundFee = ObjectUtils.isEmpty(fundFee)?BigDecimal.ZERO:fundFee.divide(new BigDecimal("100"),2, BigDecimal.ROUND_UP);
			serviceFee2 = ObjectUtils.isEmpty(serviceFee2)?BigDecimal.ZERO:serviceFee2.divide(new BigDecimal("100"),2, BigDecimal.ROUND_UP);
			couponPay = ObjectUtils.isEmpty(couponPay)?BigDecimal.ZERO:couponPay.divide(new BigDecimal("100"),2, BigDecimal.ROUND_UP);
			moneyPay = ObjectUtils.isEmpty(moneyPay)?BigDecimal.ZERO:moneyPay.divide(new BigDecimal("100"),2, BigDecimal.ROUND_UP);
			orderAmount = ObjectUtils.isEmpty(orderAmount)?BigDecimal.ZERO:orderAmount.divide(new BigDecimal("100"),2, BigDecimal.ROUND_UP);
			goodsAmount = ObjectUtils.isEmpty(goodsAmount)?BigDecimal.ZERO:goodsAmount.divide(new BigDecimal("100"),2, BigDecimal.ROUND_UP);
			platformPay = ObjectUtils.isEmpty(platformPay)?BigDecimal.ZERO:platformPay.divide(new BigDecimal("100"),2, BigDecimal.ROUND_UP);
			discountAmount = ObjectUtils.isEmpty(discountAmount)?BigDecimal.ZERO:discountAmount.divide(new BigDecimal("100"),2, BigDecimal.ROUND_UP);
			shippingFee = ObjectUtils.isEmpty(shippingFee)?BigDecimal.ZERO:shippingFee.divide(new BigDecimal("100"),2, BigDecimal.ROUND_UP);
			Integer assistId = op.getAssistId();
			//已支付
			Integer orderId = op.getOrderId();
			Integer storeId = op.getStoreId();
			Integer finnshedTime = op.getFinnshedTime();
			Long fTime=ObjectUtils.isEmpty(finnshedTime)?0L:finnshedTime;
			String integerToSTime = DateUtil.getIntegerToSTime(fTime);
			this.finshedTime=integerToSTime;
			this.goodsProjectType = goodsProjectType;
			this.fundFee=fundFee;
			this.serviceFee=serviceFee2;
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
			this.assistId = assistId;
			this.publisherId = publisherId;
		}
		
		
		public String getFinshedTime() {
			return finshedTime;
		}
		public void setFinshedTime(String finshedTime) {
			this.finshedTime = finshedTime;
		}
		public void setOrderId(Integer orderId) {
			this.orderId = orderId;
		}
		public void setGoodsProjectType(Integer goodsProjectType) {
			this.goodsProjectType = goodsProjectType;
		}
		public void setOrderState(String orderState) {
			this.orderState = orderState;
		}
		public void setBuyerId(Integer buyerId) {
			this.buyerId = buyerId;
		}
		public void setCouponPay(BigDecimal couponPay) {
			this.couponPay = couponPay;
		}
		public void setMoneyPay(BigDecimal moneyPay) {
			this.moneyPay = moneyPay;
		}
		public void setPlatformPay(BigDecimal platformPay) {
			this.platformPay = platformPay;
		}
		public void setShippingFee(BigDecimal shippingFee) {
			this.shippingFee = shippingFee;
		}
		public void setDiscountAmount(BigDecimal discountAmount) {
			this.discountAmount = discountAmount;
		}
		public void setOrderAmount(BigDecimal orderAmount) {
			this.orderAmount = orderAmount;
		}
		public void setGoodsAmount(BigDecimal goodsAmount) {
			this.goodsAmount = goodsAmount;
		}
		public void setStoreId(Integer storeId) {
			this.storeId = storeId;
		}
		public void setAssistId(Integer assistId) {
			this.assistId = assistId;
		}
		public void setPaySn(String paySn) {
			this.paySn = paySn;
		}
		public Integer getAssistId() {
			return assistId;
		}
		public BigDecimal getFundFee() {
			return fundFee;
		}
		public void setFundFee(BigDecimal fundFee) {
			this.fundFee = fundFee;
		}
		public Integer getNeedPoints() {
			return needPoints;
		}
		public void setNeedPoints(Integer needPoints) {
			this.needPoints = needPoints;
		}
		public Integer getOrderId() {
			return orderId;
		}
		public Integer getGoodsProjectType() {
			return goodsProjectType;
		}
		public String getOrderState() {
			return orderState;
		}
		public Integer getBuyerId() {
			return buyerId;
		}
		public BigDecimal getCouponPay() {
			return couponPay;
		}
		public BigDecimal getMoneyPay() {
			return moneyPay;
		}
		public BigDecimal getPlatformPay() {
			return platformPay;
		}
		public BigDecimal getShippingFee() {
			return shippingFee;
		}
		public BigDecimal getDiscountAmount() {
			return discountAmount;
		}
		public BigDecimal getOrderAmount() {
			return orderAmount;
		}
		public BigDecimal getGoodsAmount() {
			return goodsAmount;
		}
		public Integer getPublisherId() {
			return publisherId;
		}
		public void setPublisherId(Integer publisherId) {
			this.publisherId=publisherId;
		}
		public Integer getStoreId() {
			return storeId;
		}
		public String getPaySn() {
			return paySn;
		}


		private Integer orderGoodsNum;
	    private String publisherName;
	    private String publisherTag;
	    private String topText;
	    private String bottomText;
	    private  List<OrderGoods> orderGoodsList;
	    
	    public Integer getOrderGoodsNum() {
			return orderGoodsNum;
		}
		public void setOrderGoodsNum(Integer orderGoodsNum) {
			this.orderGoodsNum = orderGoodsNum;
		}
		public String getPublisherName() {
			return publisherName;
		}
		public void setPublisherName(String publisherName) {
			this.publisherName = publisherName;
		}
		public String getPublisherTag() {
			return publisherTag;
		}
		public void setPublisherTag(String publisherTag) {
			this.publisherTag = publisherTag;
		}
		public String getTopText() {
			return topText;
		}
		public void setTopText(String topText) {
			this.topText = topText;
		}
		public String getBottomText() {
			return bottomText;
		}
		public void setBottomText(String bottomText) {
			this.bottomText = bottomText;
		}
		public List<OrderGoods> getOrderGoodsList() {
			return orderGoodsList;
		}
		public void setOrderGoodsList(List<OrderGoods> orderGoodsList) {
			this.orderGoodsList = orderGoodsList;
		}
		@Override
		public String toString() {
			return "OrderInfo [orderId=" + orderId + ", goodsProjectType=" + goodsProjectType + ", orderState="
					+ orderState + ", buyerId=" + buyerId + ", couponPay=" + couponPay + ", moneyPay=" + moneyPay
					+ ", platformPay=" + platformPay + ", shippingFee=" + shippingFee + ", discountAmount="
					+ discountAmount + ", orderAmount=" + orderAmount + ", goodsAmount=" + goodsAmount
					+ ", publisherId=" + publisherId + ", storeId=" + storeId + ", paySn=" + paySn + ", orderGoodsNum="
					+ orderGoodsNum + ", publisherName=" + publisherName + ", publisherTag=" + publisherTag
					+ ", topText=" + topText + ", bottomText=" + bottomText + ", orderGoodsList=" + orderGoodsList
					+ "]";
		}
		
		
}
