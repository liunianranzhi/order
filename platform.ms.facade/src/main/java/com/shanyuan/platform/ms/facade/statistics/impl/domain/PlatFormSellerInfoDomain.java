package com.shanyuan.platform.ms.facade.statistics.impl.domain;

import java.math.BigDecimal;

public class PlatFormSellerInfoDomain {

	private Integer cTime;
	private Integer assistTotalOrderNums;
	private Integer assistTotalGoodsNums;
	private BigDecimal assistTotalOrderAmount;
	private BigDecimal assistTotalHelpPrice;
	
	private Integer poorTotalOrderNums;
	private Integer poorTotalGoodsNums;
	private BigDecimal poorTotalOrderAmount;
	
	private Integer onlineTotalOrderNums;
	private Integer onlineTotalGoodsNums;
	private BigDecimal onlineTotalOrderAmount;
	private BigDecimal onlineTotalHelpPrice;
	
	private Integer offlineTotalOrderNums;
	private Integer offlineTotalGoodsNums;
	private BigDecimal offlineTotalOrderAmount;
	private BigDecimal offlineTotalHelpPrice;
	
	private Integer syTotalOrderNums;
	private Integer syTotalGoodsNums;
	private BigDecimal syTotalOrderAmount;
	private BigDecimal syDonationAmount;
	
	
	public PlatFormSellerInfoDomain() {
		super();
	}
	
	public PlatFormSellerInfoDomain(Integer cTime, Integer assistTotalOrderNums, Integer assistTotalGoodsNums,
			BigDecimal assistTotalOrderAmount, BigDecimal assistTotalHelpPrice, Integer poorTotalOrderNums,
			Integer poorTotalGoodsNums, BigDecimal poorTotalOrderAmount, Integer onlineTotalOrderNums,
			Integer onlineTotalGoodsNums, BigDecimal onlineTotalOrderAmount, BigDecimal onlineTotalHelpPrice,
			Integer offlineTotalOrderNums, Integer offlineTotalGoodsNums, BigDecimal offlineTotalOrderAmount,
			BigDecimal offlineTotalHelpPrice, Integer syTotalOrderNums, Integer syTotalGoodsNums,
			BigDecimal syTotalOrderAmount, BigDecimal syDonationAmount) {
		super();
		this.cTime = cTime;
		this.assistTotalOrderNums = assistTotalOrderNums;
		this.assistTotalGoodsNums = assistTotalGoodsNums;
		this.assistTotalOrderAmount = assistTotalOrderAmount;
		this.assistTotalHelpPrice = assistTotalHelpPrice;
		this.poorTotalOrderNums = poorTotalOrderNums;
		this.poorTotalGoodsNums = poorTotalGoodsNums;
		this.poorTotalOrderAmount = poorTotalOrderAmount;
		this.onlineTotalOrderNums = onlineTotalOrderNums;
		this.onlineTotalGoodsNums = onlineTotalGoodsNums;
		this.onlineTotalOrderAmount = onlineTotalOrderAmount;
		this.onlineTotalHelpPrice = onlineTotalHelpPrice;
		this.offlineTotalOrderNums = offlineTotalOrderNums;
		this.offlineTotalGoodsNums = offlineTotalGoodsNums;
		this.offlineTotalOrderAmount = offlineTotalOrderAmount;
		this.offlineTotalHelpPrice = offlineTotalHelpPrice;
		this.syTotalOrderNums = syTotalOrderNums;
		this.syTotalGoodsNums = syTotalGoodsNums;
		this.syTotalOrderAmount = syTotalOrderAmount;
		this.syDonationAmount = syDonationAmount;
	}





	public Integer getcTime() {
		return cTime;
	}


	public void setcTime(Integer cTime) {
		this.cTime = cTime;
	}


	public Integer getAssistTotalOrderNums() {
		return assistTotalOrderNums;
	}
	public void setAssistTotalOrderNums(Integer assistTotalOrderNums) {
		this.assistTotalOrderNums = assistTotalOrderNums;
	}
	public Integer getAssistTotalGoodsNums() {
		return assistTotalGoodsNums;
	}
	public void setAssistTotalGoodsNums(Integer assistTotalGoodsNums) {
		this.assistTotalGoodsNums = assistTotalGoodsNums;
	}
	public BigDecimal getAssistTotalOrderAmount() {
		return assistTotalOrderAmount;
	}
	public void setAssistTotalOrderAmount(BigDecimal assistTotalOrderAmount) {
		this.assistTotalOrderAmount = assistTotalOrderAmount;
	}
	public BigDecimal getAssistTotalHelpPrice() {
		return assistTotalHelpPrice;
	}
	public void setAssistTotalHelpPrice(BigDecimal assistTotalHelpPrice) {
		this.assistTotalHelpPrice = assistTotalHelpPrice;
	}
	public Integer getPoorTotalOrderNums() {
		return poorTotalOrderNums;
	}
	public void setPoorTotalOrderNums(Integer poorTotalOrderNums) {
		this.poorTotalOrderNums = poorTotalOrderNums;
	}
	public Integer getPoorTotalGoodsNums() {
		return poorTotalGoodsNums;
	}
	public void setPoorTotalGoodsNums(Integer poorTotalGoodsNums) {
		this.poorTotalGoodsNums = poorTotalGoodsNums;
	}
	public BigDecimal getPoorTotalOrderAmount() {
		return poorTotalOrderAmount;
	}
	public void setPoorTotalOrderAmount(BigDecimal poorTotalOrderAmount) {
		this.poorTotalOrderAmount = poorTotalOrderAmount;
	}
	public Integer getOnlineTotalOrderNums() {
		return onlineTotalOrderNums;
	}
	public void setOnlineTotalOrderNums(Integer onlineTotalOrderNums) {
		this.onlineTotalOrderNums = onlineTotalOrderNums;
	}
	public Integer getOnlineTotalGoodsNums() {
		return onlineTotalGoodsNums;
	}
	public void setOnlineTotalGoodsNums(Integer onlineTotalGoodsNums) {
		this.onlineTotalGoodsNums = onlineTotalGoodsNums;
	}
	public BigDecimal getOnlineTotalOrderAmount() {
		return onlineTotalOrderAmount;
	}
	public void setOnlineTotalOrderAmount(BigDecimal onlineTotalOrderAmount) {
		this.onlineTotalOrderAmount = onlineTotalOrderAmount;
	}
	public BigDecimal getOnlineTotalHelpPrice() {
		return onlineTotalHelpPrice;
	}
	public void setOnlineTotalHelpPrice(BigDecimal onlineTotalHelpPrice) {
		this.onlineTotalHelpPrice = onlineTotalHelpPrice;
	}
	public Integer getOfflineTotalOrderNums() {
		return offlineTotalOrderNums;
	}
	public void setOfflineTotalOrderNums(Integer offlineTotalOrderNums) {
		this.offlineTotalOrderNums = offlineTotalOrderNums;
	}
	public Integer getOfflineTotalGoodsNums() {
		return offlineTotalGoodsNums;
	}
	public void setOfflineTotalGoodsNums(Integer offlineTotalGoodsNums) {
		this.offlineTotalGoodsNums = offlineTotalGoodsNums;
	}
	public BigDecimal getOfflineTotalOrderAmount() {
		return offlineTotalOrderAmount;
	}
	public void setOfflineTotalOrderAmount(BigDecimal offlineTotalOrderAmount) {
		this.offlineTotalOrderAmount = offlineTotalOrderAmount;
	}
	public BigDecimal getOfflineTotalHelpPrice() {
		return offlineTotalHelpPrice;
	}
	public void setOfflineTotalHelpPrice(BigDecimal offlineTotalHelpPrice) {
		this.offlineTotalHelpPrice = offlineTotalHelpPrice;
	}
	public Integer getSyTotalOrderNums() {
		return syTotalOrderNums;
	}
	public void setSyTotalOrderNums(Integer syTotalOrderNums) {
		this.syTotalOrderNums = syTotalOrderNums;
	}
	public Integer getSyTotalGoodsNums() {
		return syTotalGoodsNums;
	}
	public void setSyTotalGoodsNums(Integer syTotalGoodsNums) {
		this.syTotalGoodsNums = syTotalGoodsNums;
	}
	public BigDecimal getSyTotalOrderAmount() {
		return syTotalOrderAmount;
	}
	public void setSyTotalOrderAmount(BigDecimal syTotalOrderAmount) {
		this.syTotalOrderAmount = syTotalOrderAmount;
	}
	public BigDecimal getSyDonationAmount() {
		return syDonationAmount;
	}
	public void setSyDonationAmount(BigDecimal syDonationAmount) {
		this.syDonationAmount = syDonationAmount;
	}

	@Override
	public String toString() {
		return "PlatFormSellerInfoDomain [cTime=" + cTime + ", assistTotalOrderNums=" + assistTotalOrderNums
				+ ", assistTotalGoodsNums=" + assistTotalGoodsNums + ", assistTotalOrderAmount="
				+ assistTotalOrderAmount + ", assistTotalHelpPrice=" + assistTotalHelpPrice + ", poorTotalOrderNums="
				+ poorTotalOrderNums + ", poorTotalGoodsNums=" + poorTotalGoodsNums + ", poorTotalOrderAmount="
				+ poorTotalOrderAmount + ", onlineTotalOrderNums=" + onlineTotalOrderNums + ", onlineTotalGoodsNums="
				+ onlineTotalGoodsNums + ", onlineTotalOrderAmount=" + onlineTotalOrderAmount
				+ ", onlineTotalHelpPrice=" + onlineTotalHelpPrice + ", offlineTotalOrderNums=" + offlineTotalOrderNums
				+ ", offlineTotalGoodsNums=" + offlineTotalGoodsNums + ", offlineTotalOrderAmount="
				+ offlineTotalOrderAmount + ", offlineTotalHelpPrice=" + offlineTotalHelpPrice + ", syTotalOrderNums="
				+ syTotalOrderNums + ", syTotalGoodsNums=" + syTotalGoodsNums + ", syTotalOrderAmount="
				+ syTotalOrderAmount + ", syDonationAmount=" + syDonationAmount + "]";
	}
	
	
}
