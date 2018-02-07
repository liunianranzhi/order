package com.shanyuan.platform.ms.facade.statistics.impl.domain;

import java.math.BigDecimal;

public class ProvideStatisticsDomain {
	private Integer time;
	private Long areaId;
	private String areaName;
	private BigDecimal dacsAssistSellerAmount;
	private BigDecimal dacsAssistHelpPrice;
	private BigDecimal syzxAssistSellerAmount;
	private BigDecimal syzxAssistSelfPrice;
	private Integer assistTotalNum;
	private Integer selfEmpPoorTotalFamily;
	private Integer poorTotalFamily;
	private Integer poorTotalNum;
	private Long assistGoodsTotalNum;
	private Long poorGoodsTotalNum;
	
	public ProvideStatisticsDomain() {
		super();
	}
	
	public ProvideStatisticsDomain(Integer time, Long areaId, String areaName, BigDecimal dacsAssistSellerAmount,
			BigDecimal dacsAssistHelpPrice, BigDecimal syzxAssistSellerAmount, BigDecimal syzxAssistSelfPrice,
			Integer assistTotalNum, Integer selfEmpPoorTotalFamily, Integer poorTotalFamily, Integer poorTotalNum,
			Long assistGoodsTotalNum, Long poorGoodsTotalNum) {
		super();
		this.time = time;
		this.areaId = areaId;
		this.areaName = areaName;
		this.dacsAssistSellerAmount = dacsAssistSellerAmount;
		this.dacsAssistHelpPrice = dacsAssistHelpPrice;
		this.syzxAssistSellerAmount = syzxAssistSellerAmount;
		this.syzxAssistSelfPrice = syzxAssistSelfPrice;
		this.assistTotalNum = assistTotalNum;
		this.selfEmpPoorTotalFamily = selfEmpPoorTotalFamily;
		this.poorTotalFamily = poorTotalFamily;
		this.poorTotalNum = poorTotalNum;
		this.assistGoodsTotalNum = assistGoodsTotalNum;
		this.poorGoodsTotalNum = poorGoodsTotalNum;
	}

	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public Integer getTime() {
		return time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public BigDecimal getDacsAssistSellerAmount() {
		return dacsAssistSellerAmount;
	}

	public void setDacsAssistSellerAmount(BigDecimal dacsAssistSellerAmount) {
		this.dacsAssistSellerAmount = dacsAssistSellerAmount;
	}

	public BigDecimal getDacsAssistHelpPrice() {
		return dacsAssistHelpPrice;
	}

	public void setDacsAssistHelpPrice(BigDecimal dacsAssistHelpPrice) {
		this.dacsAssistHelpPrice = dacsAssistHelpPrice;
	}

	public BigDecimal getSyzxAssistSellerAmount() {
		return syzxAssistSellerAmount;
	}

	public void setSyzxAssistSellerAmount(BigDecimal syzxAssistSellerAmount) {
		this.syzxAssistSellerAmount = syzxAssistSellerAmount;
	}

	public BigDecimal getSyzxAssistSelfPrice() {
		return syzxAssistSelfPrice;
	}

	public void setSyzxAssistSelfPrice(BigDecimal syzxAssistSelfPrice) {
		this.syzxAssistSelfPrice = syzxAssistSelfPrice;
	}

	public Integer getSelfEmpPoorTotalFamily() {
		return selfEmpPoorTotalFamily;
	}

	public void setSelfEmpPoorTotalFamily(Integer selfEmpPoorTotalFamily) {
		this.selfEmpPoorTotalFamily = selfEmpPoorTotalFamily;
	}

	public Integer getPoorTotalFamily() {
		return poorTotalFamily;
	}

	public void setPoorTotalFamily(Integer poorTotalFamily) {
		this.poorTotalFamily = poorTotalFamily;
	}

	public Integer getPoorTotalNum() {
		return poorTotalNum;
	}

	public void setPoorTotalNum(Integer poorTotalNum) {
		this.poorTotalNum = poorTotalNum;
	}

	public Integer getAssistTotalNum() {
		return assistTotalNum;
	}

	public void setAssistTotalNum(Integer assistTotalNum) {
		this.assistTotalNum = assistTotalNum;
	}

	public Long getAssistGoodsTotalNum() {
		return assistGoodsTotalNum;
	}

	public void setAssistGoodsTotalNum(Long assistGoodsTotalNum) {
		this.assistGoodsTotalNum = assistGoodsTotalNum;
	}

	public Long getPoorGoodsTotalNum() {
		return poorGoodsTotalNum;
	}

	public void setPoorGoodsTotalNum(Long poorGoodsTotalNum) {
		this.poorGoodsTotalNum = poorGoodsTotalNum;
	}
	
}
