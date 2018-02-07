package com.shanyuan.platform.ms.facade.statistics.impl.domain;

import java.math.BigDecimal;

public class UnionBuyerDomainDetails {
	
	private Integer cTime;
	private String unionName;
	private Integer dacsOrderNums;
	private Integer dacsGoodsNums;
	private BigDecimal dacsTotalAmount;
	private BigDecimal dacsHelpPrice;
	
	private Integer syscOrderNums;
	private Integer syscGoodsNums;
	private BigDecimal syscTotalAmount;
	private BigDecimal syscHelpPrice;
	
	private Integer syzxOrderNums;
	private Integer syzxGoodsNums;
	private BigDecimal syzxTotalAmount;
	private BigDecimal syzxHelpPrice;
	
	
	public UnionBuyerDomainDetails(Integer cTime, String unionName, Integer dacsOrderNums, Integer dacsGoodsNums,
			BigDecimal dacsTotalAmount, BigDecimal dacsHelpPrice, Integer syscOrderNums, Integer syscGoodsNums,
			BigDecimal syscTotalAmount, BigDecimal syscHelpPrice, Integer syzxOrderNums, Integer syzxGoodsNums,
			BigDecimal syzxTotalAmount, BigDecimal syzxHelpPrice) {
		super();
		this.cTime = cTime;
		this.unionName = unionName;
		this.dacsOrderNums = dacsOrderNums;
		this.dacsGoodsNums = dacsGoodsNums;
		this.dacsTotalAmount = dacsTotalAmount;
		this.dacsHelpPrice = dacsHelpPrice;
		this.syscOrderNums = syscOrderNums;
		this.syscGoodsNums = syscGoodsNums;
		this.syscTotalAmount = syscTotalAmount;
		this.syscHelpPrice = syscHelpPrice;
		this.syzxOrderNums = syzxOrderNums;
		this.syzxGoodsNums = syzxGoodsNums;
		this.syzxTotalAmount = syzxTotalAmount;
		this.syzxHelpPrice = syzxHelpPrice;
	}
	
	public UnionBuyerDomainDetails() {
		super();
	}


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
	public Integer getDacsOrderNums() {
		return dacsOrderNums;
	}
	public void setDacsOrderNums(Integer dacsOrderNums) {
		this.dacsOrderNums = dacsOrderNums;
	}
	public Integer getDacsGoodsNums() {
		return dacsGoodsNums;
	}
	public void setDacsGoodsNums(Integer dacsGoodsNums) {
		this.dacsGoodsNums = dacsGoodsNums;
	}
	public BigDecimal getDacsTotalAmount() {
		return dacsTotalAmount;
	}
	public void setDacsTotalAmount(BigDecimal dacsTotalAmount) {
		this.dacsTotalAmount = dacsTotalAmount;
	}
	public BigDecimal getDacsHelpPrice() {
		return dacsHelpPrice;
	}
	public void setDacsHelpPrice(BigDecimal dacsHelpPrice) {
		this.dacsHelpPrice = dacsHelpPrice;
	}
	public Integer getSyscOrderNums() {
		return syscOrderNums;
	}
	public void setSyscOrderNums(Integer syscOrderNums) {
		this.syscOrderNums = syscOrderNums;
	}
	public Integer getSyscGoodsNums() {
		return syscGoodsNums;
	}
	public void setSyscGoodsNums(Integer syscGoodsNums) {
		this.syscGoodsNums = syscGoodsNums;
	}
	public BigDecimal getSyscTotalAmount() {
		return syscTotalAmount;
	}
	public void setSyscTotalAmount(BigDecimal syscTotalAmount) {
		this.syscTotalAmount = syscTotalAmount;
	}
	public BigDecimal getSyscHelpPrice() {
		return syscHelpPrice;
	}
	public void setSyscHelpPrice(BigDecimal syscHelpPrice) {
		this.syscHelpPrice = syscHelpPrice;
	}
	public Integer getSyzxOrderNums() {
		return syzxOrderNums;
	}
	public void setSyzxOrderNums(Integer syzxOrderNums) {
		this.syzxOrderNums = syzxOrderNums;
	}
	public Integer getSyzxGoodsNums() {
		return syzxGoodsNums;
	}
	public void setSyzxGoodsNums(Integer syzxGoodsNums) {
		this.syzxGoodsNums = syzxGoodsNums;
	}
	public BigDecimal getSyzxTotalAmount() {
		return syzxTotalAmount;
	}
	public void setSyzxTotalAmount(BigDecimal syzxTotalAmount) {
		this.syzxTotalAmount = syzxTotalAmount;
	}
	public BigDecimal getSyzxHelpPrice() {
		return syzxHelpPrice;
	}
	public void setSyzxHelpPrice(BigDecimal syzxHelpPrice) {
		this.syzxHelpPrice = syzxHelpPrice;
	}

}
