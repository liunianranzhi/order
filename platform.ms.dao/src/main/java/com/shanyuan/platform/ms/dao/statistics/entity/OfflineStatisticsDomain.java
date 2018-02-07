package com.shanyuan.platform.ms.dao.statistics.entity;

import java.math.BigDecimal;

public class OfflineStatisticsDomain {
	
	private Integer cTime;
	private BigDecimal orderAmount;
	private BigDecimal helpPrice;
	private Integer goodsNum;
	private Integer orderNum;
	
	
	public Integer getcTime() {
		return cTime;
	}
	public void setcTime(Integer cTime) {
		this.cTime = cTime;
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
	public Integer getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}
	public Integer getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	
}
