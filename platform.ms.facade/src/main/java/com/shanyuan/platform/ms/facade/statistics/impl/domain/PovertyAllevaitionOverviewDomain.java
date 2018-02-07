package com.shanyuan.platform.ms.facade.statistics.impl.domain;

import java.math.BigDecimal;

public class PovertyAllevaitionOverviewDomain {

	private Integer cTime;
	private String unionName;
	private String countryName;
	private BigDecimal donateAmount;
	private BigDecimal helpAmount;
	private BigDecimal fundAmount;
	public Integer getcTime() {
		return cTime;
	}
	public void setcTime(Integer cTime) {
		this.cTime = cTime;
	}
	public String getUnionName() {
		return unionName;
	}
	public void setUnionName(String unionName) {
		this.unionName = unionName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public BigDecimal getDonateAmount() {
		return donateAmount;
	}
	public void setDonateAmount(BigDecimal donateAmount) {
		this.donateAmount = donateAmount;
	}
	public BigDecimal getHelpAmount() {
		return helpAmount;
	}
	public void setHelpAmount(BigDecimal helpAmount) {
		this.helpAmount = helpAmount;
	}
	public BigDecimal getFundAmount() {
		return fundAmount;
	}
	public void setFundAmount(BigDecimal fundAmount) {
		this.fundAmount = fundAmount;
	}
	
	
}
