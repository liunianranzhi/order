package com.shanyuan.platform.ms.dao.statistics.entity;

import java.math.BigDecimal;

public class OrderStatisticsBuyerInfo {
	
	private Integer id;
	
	private Integer orderNum;
	
	private Integer goodsNum;
	
	private BigDecimal orderAmount;
	
	private BigDecimal helpPrice;
	
	private Integer cTime;
	
	private String channelName;
	
	private BigDecimal selfHelpPrice;

	private BigDecimal fundFee;
	
	private Integer goodsProjectType;
	
	private Integer assistId;
	
	private Integer sellerType;
	
	private String areaName;
	
	private Integer saleUnionId;
	
	private String sUnionName;
	
	private Long areaId;
	
	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public String getsUnionName() {
		return sUnionName;
	}

	public void setsUnionName(String sUnionName) {
		this.sUnionName = sUnionName;
	}

	public Integer getSaleUnionId() {
		return saleUnionId;
	}

	public void setSaleUnionId(Integer saleUnionId) {
		this.saleUnionId = saleUnionId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Integer getGoodsProjectType() {
		return goodsProjectType;
	}

	public void setGoodsProjectType(Integer goodsProjectType) {
		this.goodsProjectType = goodsProjectType;
	}

	public Integer getAssistId() {
		return assistId;
	}

	public void setAssistId(Integer assistId) {
		this.assistId = assistId;
	}

	public Integer getSellerType() {
		return sellerType;
	}

	public void setSellerType(Integer sellerType) {
		this.sellerType = sellerType;
	}

	public BigDecimal getFundFee() {
		return fundFee;
	}

	public void setFundFee(BigDecimal fundFee) {
		this.fundFee = fundFee;
	}

	public BigDecimal getSelfHelpPrice() {
		return selfHelpPrice;
	}

	public void setSelfHelpPrice(BigDecimal selfHelpPrice) {
		this.selfHelpPrice = selfHelpPrice;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	public Integer getGoodsNum() {
		return goodsNum;
	}

	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}

	public BigDecimal getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}

	public BigDecimal getHelpPrice() {
		return helpPrice;
	}

	public void setHelpPrice(BigDecimal helpPrice) {
		this.helpPrice = helpPrice;
	}

	public Integer getcTime() {
		return cTime;
	}

	public void setcTime(Integer cTime) {
		this.cTime = cTime;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
}
