package com.shanyuan.platform.ms.facade.order.domain;

import java.math.BigDecimal;

public class DonationDetailVo {
	private String  goodsName;
	private String  orderSn;
	private Integer count;
	private BigDecimal fundFee;
	private BigDecimal poorSupportMoney;
	private BigDecimal allFundFee;
	private BigDecimal allPoorSupportMoney;
	private BigDecimal allMoney;
	private String finshedTime;
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getOrderSn() {
		return orderSn;
	}
	public void setOrderSn(String orderSn) {
		this.orderSn = orderSn;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public BigDecimal getFundFee() {
		return fundFee;
	}
	public void setFundFee(BigDecimal fundFee) {
		this.fundFee = fundFee;
	}
	public BigDecimal getPoorSupportMoney() {
		return poorSupportMoney;
	}
	public void setPoorSupportMoney(BigDecimal poorSupportMoney) {
		this.poorSupportMoney = poorSupportMoney;
	}
	public BigDecimal getAllFundFee() {
		return allFundFee;
	}
	public void setAllFundFee(BigDecimal allFundFee) {
		this.allFundFee = allFundFee;
	}
	public BigDecimal getAllPoorSupportMoney() {
		return allPoorSupportMoney;
	}
	public void setAllPoorSupportMoney(BigDecimal allPoorSupportMoney) {
		this.allPoorSupportMoney = allPoorSupportMoney;
	}
	public BigDecimal getAllMoney() {
		return allMoney;
	}
	public void setAllMoney(BigDecimal allMoney) {
		this.allMoney = allMoney;
	}
	public String getFinshedTime() {
		return finshedTime;
	}
	public void setFinshedTime(String finshedTime) {
		this.finshedTime = finshedTime;
	}
	
}
