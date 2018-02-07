package com.shanyuan.platform.ms.dao.user.entity;

import java.math.BigDecimal;

/**
 * 描述:sy_voucher表的实体类
 * @version
 * @author:  曹勇军
 * @创建时间: 2017-10-17
 */
public class SyVoucher {
    /**
     * 代金券编号
     */
    private Integer voucherId;
    /**
     * 店主id
     */
    private Integer memberId;
    private Integer voucherTstoreId;
    private Byte voucherTcreatorType;
    private String voucherTtitle;
    private String voucherTdesc;
    
    private String voucherStoreType;
    

    
    
   

	/**
     * 代金券编码
     */
    private String voucherCode;

    /**
     * 代金券模版编号
     */
    private Integer voucherTId;

    /**
     * 代金券标题
     */
    private String voucherTitle;

    /**
     * 代金券描述
     */
    private String voucherDesc;

    /**
     * 代金券有效期开始时间
     */
    private Integer voucherStartDate;

    /**
     * 代金券有效期结束时间
     */
    private Integer voucherEndDate;

    /**
     * 代金券面额
     */
    private Integer voucherPrice;

    /**
     * 代金券使用时的订单限额
     */
    private BigDecimal voucherLimit;

    /**
     * 代金券的店铺id
     */
    private Integer voucherStoreId;

    /**
     * 代金券状态(1-未用,2-已用,3-过期,4-收回)
     */
    private Byte voucherState;

    /**
     * 代金券发放日期
     */
    private Integer voucherActiveDate;

    /**
     * 代金券使用日期
     */
    private Integer voucherUsedDate;

    /**
     * 代金券类别
     */
    private Byte voucherType;
    

    public String getVoucherTtitle() {
		return voucherTtitle;
	}


	public String getVoucherStoreType() {
		return voucherStoreType;
	}


	public void setVoucherStoreType(String voucherStoreType) {
		this.voucherStoreType = voucherStoreType;
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

	/**
     * 代金券所有者id
     */
    private Integer voucherOwnerId;

    /**
     * 代金券所有者名称
     */
    private String voucherOwnerName;

    /**
     * 使用该代金券的订单编号
     */
    private Integer voucherOrderId;

    /**
     * 优惠券类别（1、无限制；2、满减）
     */
    private Byte voucherTType;

    /**
     * 代金券所有者手机号码
     */
    private String voucherOwnerMobile;
    
    /**
     * 代金券模版编号
     */
    private Integer voucherTActivityId;
    
    /**
     * 费用承担方式（1、平台；2、商家）
     */
    private Byte voucherTCostMode;
    
    public Byte getVoucherTcreatorType() {
		return voucherTcreatorType;
	}


	public void setVoucherTcreatorType(Byte voucherTcreatorType) {
		this.voucherTcreatorType = voucherTcreatorType;
	}
    /**
     * 代金券编号
     * @return voucher_id 代金券编号
     */
    public Integer getVoucherId() {
        return voucherId;
    }

    
    public Integer getVoucherTstoreId() {
		return voucherTstoreId;
	}


	public void setVoucherTstoreId(Integer voucherTstoreId) {
		this.voucherTstoreId = voucherTstoreId;
	}






	/**
     * 代金券编号
     * @param voucherId 代金券编号
     */
    public void setVoucherId(Integer voucherId) {
        this.voucherId = voucherId;
    }

    /**
     * 代金券编码
     * @return voucher_code 代金券编码
     */
    public String getVoucherCode() {
        return voucherCode;
    }

    /**
     * 代金券编码
     * @param voucherCode 代金券编码
     */
    public void setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode == null ? null : voucherCode.trim();
    }

    /**
     * 代金券模版编号
     * @return voucher_t_id 代金券模版编号
     */
    public Integer getVoucherTId() {
        return voucherTId;
    }

    /**
     * 代金券模版编号
     * @param voucherTId 代金券模版编号
     */
    public void setVoucherTId(Integer voucherTId) {
        this.voucherTId = voucherTId;
    }
    

    /**
     * 代金券标题
     * @return voucher_title 代金券标题
     */
    public String getVoucherTitle() {
        return voucherTitle;
    }

    /**
     * 代金券标题
     * @param voucherTitle 代金券标题
     */
    public void setVoucherTitle(String voucherTitle) {
        this.voucherTitle = voucherTitle == null ? null : voucherTitle.trim();
    }

    /**
     * 代金券描述
     * @return voucher_desc 代金券描述
     */
    public String getVoucherDesc() {
        return voucherDesc;
    }

    /**
     * 代金券描述
     * @param voucherDesc 代金券描述
     */
    public void setVoucherDesc(String voucherDesc) {
        this.voucherDesc = voucherDesc == null ? null : voucherDesc.trim();
    }

    /**
     * 代金券有效期开始时间
     * @return voucher_start_date 代金券有效期开始时间
     */
    public Integer getVoucherStartDate() {
        return voucherStartDate;
    }

    /**
     * 代金券有效期开始时间
     * @param voucherStartDate 代金券有效期开始时间
     */
    public void setVoucherStartDate(Integer voucherStartDate) {
        this.voucherStartDate = voucherStartDate;
    }

    /**
     * 代金券有效期结束时间
     * @return voucher_end_date 代金券有效期结束时间
     */
    public Integer getVoucherEndDate() {
        return voucherEndDate;
    }

    /**
     * 代金券有效期结束时间
     * @param voucherEndDate 代金券有效期结束时间
     */
    public void setVoucherEndDate(Integer voucherEndDate) {
        this.voucherEndDate = voucherEndDate;
    }

    /**
     * 代金券面额
     * @return voucher_price 代金券面额
     */
    public Integer getVoucherPrice() {
        return voucherPrice;
    }

    /**
     * 代金券面额
     * @param voucherPrice 代金券面额
     */
    public void setVoucherPrice(Integer voucherPrice) {
        this.voucherPrice = voucherPrice;
    }

    /**
     * 代金券使用时的订单限额
     * @return voucher_limit 代金券使用时的订单限额
     */
    public BigDecimal getVoucherLimit() {
        return voucherLimit;
    }

    /**
     * 代金券使用时的订单限额
     * @param voucherLimit 代金券使用时的订单限额
     */
    public void setVoucherLimit(BigDecimal voucherLimit) {
        this.voucherLimit = voucherLimit;
    }

    /**
     * 代金券的店铺id
     * @return voucher_store_id 代金券的店铺id
     */
    public Integer getVoucherStoreId() {
        return voucherStoreId;
    }

    /**
     * 代金券的店铺id
     * @param voucherStoreId 代金券的店铺id
     */
    public void setVoucherStoreId(Integer voucherStoreId) {
        this.voucherStoreId = voucherStoreId;
    }

    /**
     * 代金券状态(1-未用,2-已用,3-过期,4-收回)
     * @return voucher_state 代金券状态(1-未用,2-已用,3-过期,4-收回)
     */
    public Byte getVoucherState() {
        return voucherState;
    }

    /**
     * 代金券状态(1-未用,2-已用,3-过期,4-收回)
     * @param voucherState 代金券状态(1-未用,2-已用,3-过期,4-收回)
     */
    public void setVoucherState(Byte voucherState) {
        this.voucherState = voucherState;
    }

    /**
     * 代金券发放日期
     * @return voucher_active_date 代金券发放日期
     */
    public Integer getVoucherActiveDate() {
        return voucherActiveDate;
    }

    /**
     * 代金券发放日期
     * @param voucherActiveDate 代金券发放日期
     */
    public void setVoucherActiveDate(Integer voucherActiveDate) {
        this.voucherActiveDate = voucherActiveDate;
    }

    /**
     * 代金券使用日期
     * @return voucher_used_date 代金券使用日期
     */
    public Integer getVoucherUsedDate() {
        return voucherUsedDate;
    }

    /**
     * 代金券使用日期
     * @param voucherUsedDate 代金券使用日期
     */
    public void setVoucherUsedDate(Integer voucherUsedDate) {
        this.voucherUsedDate = voucherUsedDate;
    }

    /**
     * 代金券类别
     * @return voucher_type 代金券类别
     */
    public Byte getVoucherType() {
        return voucherType;
    }

    /**
     * 代金券类别
     * @param voucherType 代金券类别
     */
    public void setVoucherType(Byte voucherType) {
        this.voucherType = voucherType;
    }

    /**
     * 代金券所有者id
     * @return voucher_owner_id 代金券所有者id
     */
    public Integer getVoucherOwnerId() {
        return voucherOwnerId;
    }

    /**
     * 代金券所有者id
     * @param voucherOwnerId 代金券所有者id
     */
    public void setVoucherOwnerId(Integer voucherOwnerId) {
        this.voucherOwnerId = voucherOwnerId;
    }

    /**
     * 代金券所有者名称
     * @return voucher_owner_name 代金券所有者名称
     */
    public String getVoucherOwnerName() {
        return voucherOwnerName;
    }

    /**
     * 代金券所有者名称
     * @param voucherOwnerName 代金券所有者名称
     */
    public void setVoucherOwnerName(String voucherOwnerName) {
        this.voucherOwnerName = voucherOwnerName == null ? null : voucherOwnerName.trim();
    }

    /**
     * 使用该代金券的订单编号
     * @return voucher_order_id 使用该代金券的订单编号
     */
    public Integer getVoucherOrderId() {
        return voucherOrderId;
    }

    /**
     * 使用该代金券的订单编号
     * @param voucherOrderId 使用该代金券的订单编号
     */
    public void setVoucherOrderId(Integer voucherOrderId) {
        this.voucherOrderId = voucherOrderId;
    }

    public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	/**
     * 优惠券类别（1、无限制；2、满减）
     * @return voucher_t_type 优惠券类别（1、无限制；2、满减）
     */
    public Byte getVoucherTType() {
        return voucherTType;
    }

    /**
     * 优惠券类别（1、无限制；2、满减）
     * @param voucherTType 优惠券类别（1、无限制；2、满减）
     */
    public void setVoucherTType(Byte voucherTType) {
        this.voucherTType = voucherTType;
    }

    /**
     * 代金券所有者手机号码
     * @return voucher_owner_mobile 代金券所有者手机号码
     */
    public String getVoucherOwnerMobile() {
        return voucherOwnerMobile;
    }

    /**
     * 代金券所有者手机号码
     * @param voucherOwnerMobile 代金券所有者手机号码
     */
    public void setVoucherOwnerMobile(String voucherOwnerMobile) {
        this.voucherOwnerMobile = voucherOwnerMobile == null ? null : voucherOwnerMobile.trim();
    }

	public Integer getVoucherTActivityId() {
		return voucherTActivityId;
	}

	public void setVoucherTActivityId(Integer voucherTActivityId) {
		this.voucherTActivityId = voucherTActivityId;
	}

	public Byte getVoucherTCostMode() {
		return voucherTCostMode;
	}

	public void setVoucherTCostMode(Byte voucherTCostMode) {
		this.voucherTCostMode = voucherTCostMode;
	}
    
    
}