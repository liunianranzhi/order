package com.shanyuan.platform.ms.facade.statistics.impl.domain;

import java.math.BigDecimal;

import org.springframework.util.ObjectUtils;

public class PlatFormTotalDomain {

	private Integer totalOrderNums;
	private Integer totalGoodsNums;
	private BigDecimal totalOrderAmount;
	private BigDecimal totalHelpPrice;
	private BigDecimal fundFee ;
	
	public BigDecimal getFundFee() {
		return fundFee;
	}
	public void setFundFee(BigDecimal fundFee) {
		this.fundFee = fundFee;
	}
	public PlatFormTotalDomain() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PlatFormTotalDomain(Integer totalOrderNums, Integer totalGoodsNums, BigDecimal totalOrderAmount,
			BigDecimal totalHelpPrice) {
		super();
		this.totalOrderNums = totalOrderNums;
		this.totalGoodsNums = totalGoodsNums;
		this.totalOrderAmount = totalOrderAmount;
		this.totalHelpPrice = totalHelpPrice;
	}
	public Integer getTotalOrderNums() {
		return totalOrderNums;
	}
	public void setTotalOrderNums(Integer totalOrderNums) {
		this.totalOrderNums = totalOrderNums;
	}
	public Integer getTotalGoodsNums() {
		return totalGoodsNums;
	}
	public void setTotalGoodsNums(Integer totalGoodsNums) {
		this.totalGoodsNums = totalGoodsNums;
	}
	public BigDecimal getTotalOrderAmount() {
		return totalOrderAmount;
	}
	public void setTotalOrderAmount(BigDecimal totalOrderAmount) {
		this.totalOrderAmount = totalOrderAmount;
	}
	public BigDecimal getTotalHelpPrice() {
		return totalHelpPrice;
	}
	public void setTotalHelpPrice(BigDecimal totalHelpPrice) {
		this.totalHelpPrice = totalHelpPrice;
	}
	
}
