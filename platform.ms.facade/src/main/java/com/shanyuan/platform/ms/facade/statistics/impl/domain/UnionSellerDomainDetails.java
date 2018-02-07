package com.shanyuan.platform.ms.facade.statistics.impl.domain;

import java.math.BigDecimal;

public class UnionSellerDomainDetails {
	
	private Integer cTime;
	private Integer unionId;
	private String unionName;
	private String areaId;
	private String areaName;
	
	public Integer getUnionId() {
		return unionId;
	}

	public void setUnionId(Integer unionId) {
		this.unionId = unionId;
	}

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	private Integer assistOrderNums;
	private Integer assistGoodsNums;
	private BigDecimal assistTotalAmount;
	private BigDecimal assistHelpPrice;
	private BigDecimal assistSelfHelpPrice;
	
	private Integer poorOrderNums;
	private Integer poorGoodsNums;
	private BigDecimal poorTotalAmount;
	private BigDecimal poorSelfHelpPrice;
	
	private Integer onlineOrderNums;
	private Integer onlineGoodsNums;
	private BigDecimal onlineTotalAmount;
	private BigDecimal onlineHelpPrice;
	private BigDecimal onlineSelfHelpPrice;
	
	private Integer offlineOrderNums;
	private Integer offlineGoodsNums;
	private BigDecimal offlineTotalAmount;
	private BigDecimal offlineHelpPrice;
	private BigDecimal offlineSelfHelpPrice;
	
	public UnionSellerDomainDetails() {
		super();
	}

	public UnionSellerDomainDetails(Integer cTime, Integer unionId, String unionName, String areaId, String areaName,
			Integer assistOrderNums, Integer assistGoodsNums, BigDecimal assistTotalAmount, BigDecimal assistHelpPrice,
			BigDecimal assistSelfHelpPrice, Integer poorOrderNums, Integer poorGoodsNums, BigDecimal poorTotalAmount,
			BigDecimal poorSelfHelpPrice, Integer onlineOrderNums, Integer onlineGoodsNums,
			BigDecimal onlineTotalAmount, BigDecimal onlineHelpPrice, BigDecimal onlineSelfHelpPrice,
			Integer offlineOrderNums, Integer offlineGoodsNums, BigDecimal offlineTotalAmount,
			BigDecimal offlineHelpPrice, BigDecimal offlineSelfHelpPrice) {
		super();
		this.cTime = cTime;
		this.unionId = unionId;
		this.unionName = unionName;
		this.areaId = areaId;
		this.areaName = areaName;
		this.assistOrderNums = assistOrderNums;
		this.assistGoodsNums = assistGoodsNums;
		this.assistTotalAmount = assistTotalAmount;
		this.assistHelpPrice = assistHelpPrice;
		this.assistSelfHelpPrice = assistSelfHelpPrice;
		this.poorOrderNums = poorOrderNums;
		this.poorGoodsNums = poorGoodsNums;
		this.poorTotalAmount = poorTotalAmount;
		this.poorSelfHelpPrice = poorSelfHelpPrice;
		this.onlineOrderNums = onlineOrderNums;
		this.onlineGoodsNums = onlineGoodsNums;
		this.onlineTotalAmount = onlineTotalAmount;
		this.onlineHelpPrice = onlineHelpPrice;
		this.onlineSelfHelpPrice = onlineSelfHelpPrice;
		this.offlineOrderNums = offlineOrderNums;
		this.offlineGoodsNums = offlineGoodsNums;
		this.offlineTotalAmount = offlineTotalAmount;
		this.offlineHelpPrice = offlineHelpPrice;
		this.offlineSelfHelpPrice = offlineSelfHelpPrice;
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

	public Integer getAssistOrderNums() {
		return assistOrderNums;
	}

	public void setAssistOrderNums(Integer assistOrderNums) {
		this.assistOrderNums = assistOrderNums;
	}

	public Integer getAssistGoodsNums() {
		return assistGoodsNums;
	}

	public void setAssistGoodsNums(Integer assistGoodsNums) {
		this.assistGoodsNums = assistGoodsNums;
	}

	public BigDecimal getAssistTotalAmount() {
		return assistTotalAmount;
	}

	public void setAssistTotalAmount(BigDecimal assistTotalAmount) {
		this.assistTotalAmount = assistTotalAmount;
	}

	public BigDecimal getAssistHelpPrice() {
		return assistHelpPrice;
	}

	public void setAssistHelpPrice(BigDecimal assistHelpPrice) {
		this.assistHelpPrice = assistHelpPrice;
	}

	public BigDecimal getAssistSelfHelpPrice() {
		return assistSelfHelpPrice;
	}

	public void setAssistSelfHelpPrice(BigDecimal assistSelfHelpPrice) {
		this.assistSelfHelpPrice = assistSelfHelpPrice;
	}

	public Integer getPoorOrderNums() {
		return poorOrderNums;
	}

	public void setPoorOrderNums(Integer poorOrderNums) {
		this.poorOrderNums = poorOrderNums;
	}

	public Integer getPoorGoodsNums() {
		return poorGoodsNums;
	}

	public void setPoorGoodsNums(Integer poorGoodsNums) {
		this.poorGoodsNums = poorGoodsNums;
	}

	public BigDecimal getPoorTotalAmount() {
		return poorTotalAmount;
	}

	public void setPoorTotalAmount(BigDecimal poorTotalAmount) {
		this.poorTotalAmount = poorTotalAmount;
	}

	public BigDecimal getPoorSelfHelpPrice() {
		return poorSelfHelpPrice;
	}

	public void setPoorSelfHelpPrice(BigDecimal poorSelfHelpPrice) {
		this.poorSelfHelpPrice = poorSelfHelpPrice;
	}

	public Integer getOnlineOrderNums() {
		return onlineOrderNums;
	}

	public void setOnlineOrderNums(Integer onlineOrderNums) {
		this.onlineOrderNums = onlineOrderNums;
	}

	public Integer getOnlineGoodsNums() {
		return onlineGoodsNums;
	}

	public void setOnlineGoodsNums(Integer onlineGoodsNums) {
		this.onlineGoodsNums = onlineGoodsNums;
	}

	public BigDecimal getOnlineTotalAmount() {
		return onlineTotalAmount;
	}

	public void setOnlineTotalAmount(BigDecimal onlineTotalAmount) {
		this.onlineTotalAmount = onlineTotalAmount;
	}

	public BigDecimal getOnlineHelpPrice() {
		return onlineHelpPrice;
	}

	public void setOnlineHelpPrice(BigDecimal onlineHelpPrice) {
		this.onlineHelpPrice = onlineHelpPrice;
	}

	public BigDecimal getOnlineSelfHelpPrice() {
		return onlineSelfHelpPrice;
	}

	public void setOnlineSelfHelpPrice(BigDecimal onlineSelfHelpPrice) {
		this.onlineSelfHelpPrice = onlineSelfHelpPrice;
	}

	public Integer getOfflineOrderNums() {
		return offlineOrderNums;
	}

	public void setOfflineOrderNums(Integer offlineOrderNums) {
		this.offlineOrderNums = offlineOrderNums;
	}

	public Integer getOfflineGoodsNums() {
		return offlineGoodsNums;
	}

	public void setOfflineGoodsNums(Integer offlineGoodsNums) {
		this.offlineGoodsNums = offlineGoodsNums;
	}

	public BigDecimal getOfflineTotalAmount() {
		return offlineTotalAmount;
	}

	public void setOfflineTotalAmount(BigDecimal offlineTotalAmount) {
		this.offlineTotalAmount = offlineTotalAmount;
	}

	public BigDecimal getOfflineHelpPrice() {
		return offlineHelpPrice;
	}

	public void setOfflineHelpPrice(BigDecimal offlineHelpPrice) {
		this.offlineHelpPrice = offlineHelpPrice;
	}

	public BigDecimal getOfflineSelfHelpPrice() {
		return offlineSelfHelpPrice;
	}

	public void setOfflineSelfHelpPrice(BigDecimal offlineSelfHelpPrice) {
		this.offlineSelfHelpPrice = offlineSelfHelpPrice;
	}
	
}
