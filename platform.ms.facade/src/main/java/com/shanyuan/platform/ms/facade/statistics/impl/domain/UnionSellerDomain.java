package com.shanyuan.platform.ms.facade.statistics.impl.domain;

import java.math.BigDecimal;

public class UnionSellerDomain {

	private Integer type;
	private Integer orderNums;
	private Integer goodsNums;
	private BigDecimal totalAmount;
	private BigDecimal helpPrice;
	private BigDecimal selfHelpPrice;

	
	public UnionSellerDomain() {
		super();
	}
	
	
	public UnionSellerDomain(Integer type, Integer orderNums, Integer goodsNums, BigDecimal totalAmount,
			BigDecimal helpPrice, BigDecimal selfHelpPrice) {
		super();
		this.type = type;
		this.orderNums = orderNums;
		this.goodsNums = goodsNums;
		this.totalAmount = totalAmount;
		this.helpPrice = helpPrice;
		this.selfHelpPrice = selfHelpPrice;
	}


	public Integer getType() {
		return type;
	}


	public void setType(Integer type) {
		this.type = type;
	}


	public Integer getOrderNums() {
		return orderNums;
	}


	public void setOrderNums(Integer orderNums) {
		this.orderNums = orderNums;
	}


	public Integer getGoodsNums() {
		return goodsNums;
	}


	public void setGoodsNums(Integer goodsNums) {
		this.goodsNums = goodsNums;
	}


	public BigDecimal getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}


	public BigDecimal getHelpPrice() {
		return helpPrice;
	}


	public void setHelpPrice(BigDecimal helpPrice) {
		this.helpPrice = helpPrice;
	}


	public BigDecimal getSelfHelpPrice() {
		return selfHelpPrice;
	}


	public void setSelfHelpPrice(BigDecimal selfHelpPrice) {
		this.selfHelpPrice = selfHelpPrice;
	}
	
	
}
