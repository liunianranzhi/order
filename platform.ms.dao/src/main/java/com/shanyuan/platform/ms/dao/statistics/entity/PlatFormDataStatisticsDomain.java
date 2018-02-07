package com.shanyuan.platform.ms.dao.statistics.entity;

import java.math.BigDecimal;

public class PlatFormDataStatisticsDomain {

	 	private BigDecimal orderAmount;

	    private Integer goodsNum;

	    private BigDecimal helpAmount;
	    
	    private BigDecimal fundFee;
	    
	    private Integer orderNum;

	    private Integer cTime;
	    
	    private Integer goodsProjectType;
	    
	    private Integer sellerType;
	    
	    private Integer assistId;
	    
	    

		public BigDecimal getFundFee() {
			return fundFee;
		}

		public void setFundFee(BigDecimal fundFee) {
			this.fundFee = fundFee;
		}

		public BigDecimal getOrderAmount() {
			return orderAmount;
		}

		public void setOrderAmount(BigDecimal orderAmount) {
			this.orderAmount = orderAmount;
		}

		public Integer getGoodsNum() {
			return goodsNum;
		}

		public void setGoodsNum(Integer goodsNum) {
			this.goodsNum = goodsNum;
		}

		public BigDecimal getHelpAmount() {
			return helpAmount;
		}

		public void setHelpAmount(BigDecimal helpAmount) {
			this.helpAmount = helpAmount;
		}

		public Integer getOrderNum() {
			return orderNum;
		}

		public void setOrderNum(Integer orderNum) {
			this.orderNum = orderNum;
		}

		public Integer getcTime() {
			return cTime;
		}

		public void setcTime(Integer cTime) {
			this.cTime = cTime;
		}

		public Integer getGoodsProjectType() {
			return goodsProjectType;
		}

		public void setGoodsProjectType(Integer goodsProjectType) {
			this.goodsProjectType = goodsProjectType;
		}

		public Integer getSellerType() {
			return sellerType;
		}

		public void setSellerType(Integer sellerType) {
			this.sellerType = sellerType;
		}

		public Integer getAssistId() {
			return assistId;
		}

		public void setAssistId(Integer assistId) {
			this.assistId = assistId;
		}
	  
	    

}
