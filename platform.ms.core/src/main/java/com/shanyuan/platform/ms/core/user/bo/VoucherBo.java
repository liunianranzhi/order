package com.shanyuan.platform.ms.core.user.bo;

import java.math.BigDecimal;

public class VoucherBo {
    /**
     * 代金券编号
     */
    private Integer voucherId;
    private Integer voucherTstoreId;
    private Byte voucherTcreatorType;
    private String voucherTtitle;
    private String voucherTdesc;
    private String voucherCode;
    private String voucherStoreType;
    public String getVoucherStoreType() {
		return voucherStoreType;
	}

	public void setVoucherStoreType(String voucherStoreType) {
		this.voucherStoreType = voucherStoreType;
	}

	private String ischeck;
    /**
     * 代金券使用时的订单限额
     */
    private BigDecimal voucherLimit;
    /**
     * 代金券面额
     */
    private Integer voucherPrice;

    /**
     * 代金券模版编号
     */
    private Integer voucherTId;
    
    /**
     * 代金券有效期开始时间
     */
    private String voucherStartDate;

    /**
     * 代金券有效期结束时间
     */
    private String voucherEndDate;

    /**
     * 优惠券类别（1、无限制；2、满减）
     */
    private Byte voucherTType;
    

    public String getIscheck() {
		return ischeck;
	}

	public void setIscheck(String ischeck) {
		this.ischeck = ischeck;
	}

	/**
     * 费用承担方式（1、平台；2、商家）
     */
    private Byte voucherTCostMode;

	public Integer getVoucherId() {
		return voucherId;
	}

	public void setVoucherId(Integer voucherId) {
		this.voucherId = voucherId;
	}

	public Integer getVoucherTstoreId() {
		return voucherTstoreId;
	}

	public void setVoucherTstoreId(Integer voucherTstoreId) {
		this.voucherTstoreId = voucherTstoreId;
	}

	public Byte getVoucherTcreatorType() {
		return voucherTcreatorType;
	}

	public void setVoucherTcreatorType(Byte voucherTcreatorType) {
		this.voucherTcreatorType = voucherTcreatorType;
	}

	public String getVoucherTtitle() {
		return voucherTtitle;
	}

	public void setVoucherTtitle(String voucherTtitle) {
		this.voucherTtitle = voucherTtitle;
	}

	public String getVoucherTdesc() {
		return voucherTdesc;
	}

	public void setVoucherTdesc(String voucherTdesc) {
		this.voucherTdesc = voucherTdesc;
	}

	public String getVoucherCode() {
		return voucherCode;
	}

	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}

	public BigDecimal getVoucherLimit() {
		return voucherLimit;
	}

	public void setVoucherLimit(BigDecimal voucherLimit) {
		this.voucherLimit = voucherLimit;
	}

	public Integer getVoucherPrice() {
		return voucherPrice;
	}

	public void setVoucherPrice(Integer voucherPrice) {
		this.voucherPrice = voucherPrice;
	}

	public Integer getVoucherTId() {
		return voucherTId;
	}

	public void setVoucherTId(Integer voucherTId) {
		this.voucherTId = voucherTId;
	}

	public String getVoucherStartDate() {
		return voucherStartDate;
	}

	public void setVoucherStartDate(String voucherStartDate) {
		this.voucherStartDate = voucherStartDate;
	}

	public String getVoucherEndDate() {
		return voucherEndDate;
	}

	public void setVoucherEndDate(String voucherEndDate) {
		this.voucherEndDate = voucherEndDate;
	}

	public Byte getVoucherTType() {
		return voucherTType;
	}

	public void setVoucherTType(Byte voucherTType) {
		this.voucherTType = voucherTType;
	}

	public Byte getVoucherTCostMode() {
		return voucherTCostMode;
	}

	public void setVoucherTCostMode(Byte voucherTCostMode) {
		this.voucherTCostMode = voucherTCostMode;
	}
    
    
    
}
