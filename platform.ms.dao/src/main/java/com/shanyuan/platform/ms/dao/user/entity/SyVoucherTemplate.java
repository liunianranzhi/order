package com.shanyuan.platform.ms.dao.user.entity;

import java.math.BigDecimal;

/**
 * 描述:sy_voucher_template表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-10-17
 */
public class SyVoucherTemplate {
    /**
     * 代金券模版编号
     */
    private Integer voucherTId;

    /**
     * 代金券模版名称
     */
    private String voucherTTitle;

    /**
     * 代金券模版描述说明
     */
    private String voucherTDesc;

    /**
     * 优惠券类别（1、无限制；2、满减）
     */
    private Byte voucherTType;

    /**
     * 代金券模版有效期开始时间
     */
    private Integer voucherTStartDate;

    /**
     * 代金券模版有效期结束时间
     */
    private Integer voucherTEndDate;

    /**
     * 代金券模版面额
     */
    private Integer voucherTPrice;

    /**
     * 代金券使用时的订单限额
     */
    private BigDecimal voucherTLimit;

    /**
     * 代金券模版的店铺id
     */
    private Integer voucherTStoreId;

    /**
     * 店铺名称
     */
    private String voucherTStorename;

    /**
     * 代金券模版的创建者id
     */
    private Integer voucherTCreatorId;

    /**
     * 代金券模版状态(1-有效,2-失效)
     */
    private Byte voucherTState;

    /**
     * 模版可发放的代金券总数
     */
    private Integer voucherTTotal;

    /**
     * 模版已发放的代金券数量
     */
    private Integer voucherTGiveout;

    /**
     * 模版已经使用过的代金券
     */
    private Integer voucherTUsed;

    /**
     * 模版的创建时间
     */
    private Integer voucherTAddDate;

    /**
     * 套餐编号
     */
    private Integer voucherTQuotaid;

    /**
     * 兑换所需积分
     */
    private Integer voucherTPoints;

    /**
     * 优惠券参与商品范围（1、所有商品；2、指定活动商品）
     */
    private Byte voucherTGoodsType;

    /**
     * 每人限领张数
     */
    private Integer voucherTEachlimit;

    /**
     * 限领方式（1、当前活动；2、每日）
     */
    private Byte voucherTLimitType;

    /**
     * 样式模版图片
     */
    private String voucherTStyleimg;

    /**
     * 自定义代金券模板图片
     */
    private String voucherTCustomimg;

    /**
     * 费用承担方式（1、平台；2、商家）
     */
    private Byte voucherTCostMode;

    /**
     * 优惠券参与活动ID
     */
    private Integer voucherTActivityId;

    /**
     * 优惠券显示状态（0、正常；1、隐藏）
     */
    private Byte voucherTShowState;

    /**
     * 优惠券跳转链接
     */
    private String voucherTJumpUrl;
    
    private Integer storeId;
    private String storeLabel;
    private String storeName;
    private String storeDomain;

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
     * 代金券模版名称
     * @return voucher_t_title 代金券模版名称
     */
    public String getVoucherTTitle() {
        return voucherTTitle;
    }

    /**
     * 代金券模版名称
     * @param voucherTTitle 代金券模版名称
     */
    public void setVoucherTTitle(String voucherTTitle) {
        this.voucherTTitle = voucherTTitle == null ? null : voucherTTitle.trim();
    }

    /**
     * 代金券模版描述说明
     * @return voucher_t_desc 代金券模版描述说明
     */
    public String getVoucherTDesc() {
        return voucherTDesc;
    }

    /**
     * 代金券模版描述说明
     * @param voucherTDesc 代金券模版描述说明
     */
    public void setVoucherTDesc(String voucherTDesc) {
        this.voucherTDesc = voucherTDesc == null ? null : voucherTDesc.trim();
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
     * 代金券模版有效期开始时间
     * @return voucher_t_start_date 代金券模版有效期开始时间
     */
    public Integer getVoucherTStartDate() {
        return voucherTStartDate;
    }

    /**
     * 代金券模版有效期开始时间
     * @param voucherTStartDate 代金券模版有效期开始时间
     */
    public void setVoucherTStartDate(Integer voucherTStartDate) {
        this.voucherTStartDate = voucherTStartDate;
    }

    /**
     * 代金券模版有效期结束时间
     * @return voucher_t_end_date 代金券模版有效期结束时间
     */
    public Integer getVoucherTEndDate() {
        return voucherTEndDate;
    }

    /**
     * 代金券模版有效期结束时间
     * @param voucherTEndDate 代金券模版有效期结束时间
     */
    public void setVoucherTEndDate(Integer voucherTEndDate) {
        this.voucherTEndDate = voucherTEndDate;
    }

    /**
     * 代金券模版面额
     * @return voucher_t_price 代金券模版面额
     */
    public Integer getVoucherTPrice() {
        return voucherTPrice;
    }

    /**
     * 代金券模版面额
     * @param voucherTPrice 代金券模版面额
     */
    public void setVoucherTPrice(Integer voucherTPrice) {
        this.voucherTPrice = voucherTPrice;
    }

    /**
     * 代金券使用时的订单限额
     * @return voucher_t_limit 代金券使用时的订单限额
     */
    public BigDecimal getVoucherTLimit() {
        return voucherTLimit;
    }

    /**
     * 代金券使用时的订单限额
     * @param voucherTLimit 代金券使用时的订单限额
     */
    public void setVoucherTLimit(BigDecimal voucherTLimit) {
        this.voucherTLimit = voucherTLimit;
    }

    /**
     * 代金券模版的店铺id
     * @return voucher_t_store_id 代金券模版的店铺id
     */
    public Integer getVoucherTStoreId() {
        return voucherTStoreId;
    }

    /**
     * 代金券模版的店铺id
     * @param voucherTStoreId 代金券模版的店铺id
     */
    public void setVoucherTStoreId(Integer voucherTStoreId) {
        this.voucherTStoreId = voucherTStoreId;
    }

    /**
     * 店铺名称
     * @return voucher_t_storename 店铺名称
     */
    public String getVoucherTStorename() {
        return voucherTStorename;
    }

    /**
     * 店铺名称
     * @param voucherTStorename 店铺名称
     */
    public void setVoucherTStorename(String voucherTStorename) {
        this.voucherTStorename = voucherTStorename == null ? null : voucherTStorename.trim();
    }

    /**
     * 代金券模版的创建者id
     * @return voucher_t_creator_id 代金券模版的创建者id
     */
    public Integer getVoucherTCreatorId() {
        return voucherTCreatorId;
    }

    /**
     * 代金券模版的创建者id
     * @param voucherTCreatorId 代金券模版的创建者id
     */
    public void setVoucherTCreatorId(Integer voucherTCreatorId) {
        this.voucherTCreatorId = voucherTCreatorId;
    }

    /**
     * 代金券模版状态(1-有效,2-失效)
     * @return voucher_t_state 代金券模版状态(1-有效,2-失效)
     */
    public Byte getVoucherTState() {
        return voucherTState;
    }

    /**
     * 代金券模版状态(1-有效,2-失效)
     * @param voucherTState 代金券模版状态(1-有效,2-失效)
     */
    public void setVoucherTState(Byte voucherTState) {
        this.voucherTState = voucherTState;
    }

    /**
     * 模版可发放的代金券总数
     * @return voucher_t_total 模版可发放的代金券总数
     */
    public Integer getVoucherTTotal() {
        return voucherTTotal;
    }

    /**
     * 模版可发放的代金券总数
     * @param voucherTTotal 模版可发放的代金券总数
     */
    public void setVoucherTTotal(Integer voucherTTotal) {
        this.voucherTTotal = voucherTTotal;
    }

    /**
     * 模版已发放的代金券数量
     * @return voucher_t_giveout 模版已发放的代金券数量
     */
    public Integer getVoucherTGiveout() {
        return voucherTGiveout;
    }

    /**
     * 模版已发放的代金券数量
     * @param voucherTGiveout 模版已发放的代金券数量
     */
    public void setVoucherTGiveout(Integer voucherTGiveout) {
        this.voucherTGiveout = voucherTGiveout;
    }

    /**
     * 模版已经使用过的代金券
     * @return voucher_t_used 模版已经使用过的代金券
     */
    public Integer getVoucherTUsed() {
        return voucherTUsed;
    }

    /**
     * 模版已经使用过的代金券
     * @param voucherTUsed 模版已经使用过的代金券
     */
    public void setVoucherTUsed(Integer voucherTUsed) {
        this.voucherTUsed = voucherTUsed;
    }

    /**
     * 模版的创建时间
     * @return voucher_t_add_date 模版的创建时间
     */
    public Integer getVoucherTAddDate() {
        return voucherTAddDate;
    }

    /**
     * 模版的创建时间
     * @param voucherTAddDate 模版的创建时间
     */
    public void setVoucherTAddDate(Integer voucherTAddDate) {
        this.voucherTAddDate = voucherTAddDate;
    }

    /**
     * 套餐编号
     * @return voucher_t_quotaid 套餐编号
     */
    public Integer getVoucherTQuotaid() {
        return voucherTQuotaid;
    }

    /**
     * 套餐编号
     * @param voucherTQuotaid 套餐编号
     */
    public void setVoucherTQuotaid(Integer voucherTQuotaid) {
        this.voucherTQuotaid = voucherTQuotaid;
    }

    /**
     * 兑换所需积分
     * @return voucher_t_points 兑换所需积分
     */
    public Integer getVoucherTPoints() {
        return voucherTPoints;
    }

    /**
     * 兑换所需积分
     * @param voucherTPoints 兑换所需积分
     */
    public void setVoucherTPoints(Integer voucherTPoints) {
        this.voucherTPoints = voucherTPoints;
    }

    /**
     * 优惠券参与商品范围（1、所有商品；2、指定活动商品）
     * @return voucher_t_goods_type 优惠券参与商品范围（1、所有商品；2、指定活动商品）
     */
    public Byte getVoucherTGoodsType() {
        return voucherTGoodsType;
    }

    /**
     * 优惠券参与商品范围（1、所有商品；2、指定活动商品）
     * @param voucherTGoodsType 优惠券参与商品范围（1、所有商品；2、指定活动商品）
     */
    public void setVoucherTGoodsType(Byte voucherTGoodsType) {
        this.voucherTGoodsType = voucherTGoodsType;
    }

    /**
     * 每人限领张数
     * @return voucher_t_eachlimit 每人限领张数
     */
    public Integer getVoucherTEachlimit() {
        return voucherTEachlimit;
    }

    /**
     * 每人限领张数
     * @param voucherTEachlimit 每人限领张数
     */
    public void setVoucherTEachlimit(Integer voucherTEachlimit) {
        this.voucherTEachlimit = voucherTEachlimit;
    }

    /**
     * 限领方式（1、当前活动；2、每日）
     * @return voucher_t_limit_type 限领方式（1、当前活动；2、每日）
     */
    public Byte getVoucherTLimitType() {
        return voucherTLimitType;
    }

    /**
     * 限领方式（1、当前活动；2、每日）
     * @param voucherTLimitType 限领方式（1、当前活动；2、每日）
     */
    public void setVoucherTLimitType(Byte voucherTLimitType) {
        this.voucherTLimitType = voucherTLimitType;
    }

    /**
     * 样式模版图片
     * @return voucher_t_styleimg 样式模版图片
     */
    public String getVoucherTStyleimg() {
        return voucherTStyleimg;
    }

    /**
     * 样式模版图片
     * @param voucherTStyleimg 样式模版图片
     */
    public void setVoucherTStyleimg(String voucherTStyleimg) {
        this.voucherTStyleimg = voucherTStyleimg == null ? null : voucherTStyleimg.trim();
    }

    /**
     * 自定义代金券模板图片
     * @return voucher_t_customimg 自定义代金券模板图片
     */
    public String getVoucherTCustomimg() {
        return voucherTCustomimg;
    }

    /**
     * 自定义代金券模板图片
     * @param voucherTCustomimg 自定义代金券模板图片
     */
    public void setVoucherTCustomimg(String voucherTCustomimg) {
        this.voucherTCustomimg = voucherTCustomimg == null ? null : voucherTCustomimg.trim();
    }

    /**
     * 费用承担方式（1、平台；2、商家）
     * @return voucher_t_cost_mode 费用承担方式（1、平台；2、商家）
     */
    public Byte getVoucherTCostMode() {
        return voucherTCostMode;
    }

    /**
     * 费用承担方式（1、平台；2、商家）
     * @param voucherTCostMode 费用承担方式（1、平台；2、商家）
     */
    public void setVoucherTCostMode(Byte voucherTCostMode) {
        this.voucherTCostMode = voucherTCostMode;
    }

    /**
     * 优惠券参与活动ID
     * @return voucher_t_activity_id 优惠券参与活动ID
     */
    public Integer getVoucherTActivityId() {
        return voucherTActivityId;
    }

    /**
     * 优惠券参与活动ID
     * @param voucherTActivityId 优惠券参与活动ID
     */
    public void setVoucherTActivityId(Integer voucherTActivityId) {
        this.voucherTActivityId = voucherTActivityId;
    }

    /**
     * 优惠券显示状态（0、正常；1、隐藏）
     * @return voucher_t_show_state 优惠券显示状态（0、正常；1、隐藏）
     */
    public Byte getVoucherTShowState() {
        return voucherTShowState;
    }

    /**
     * 优惠券显示状态（0、正常；1、隐藏）
     * @param voucherTShowState 优惠券显示状态（0、正常；1、隐藏）
     */
    public void setVoucherTShowState(Byte voucherTShowState) {
        this.voucherTShowState = voucherTShowState;
    }

    /**
     * 优惠券跳转链接
     * @return voucher_t_jump_url 优惠券跳转链接
     */
    public String getVoucherTJumpUrl() {
        return voucherTJumpUrl;
    }

    /**
     * 优惠券跳转链接
     * @param voucherTJumpUrl 优惠券跳转链接
     */
    public void setVoucherTJumpUrl(String voucherTJumpUrl) {
        this.voucherTJumpUrl = voucherTJumpUrl == null ? null : voucherTJumpUrl.trim();
    }

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public String getStoreLabel() {
		return storeLabel;
	}

	public void setStoreLabel(String storeLabel) {
		this.storeLabel = storeLabel;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreDomain() {
		return storeDomain;
	}

	public void setStoreDomain(String storeDomain) {
		this.storeDomain = storeDomain;
	}
    
}