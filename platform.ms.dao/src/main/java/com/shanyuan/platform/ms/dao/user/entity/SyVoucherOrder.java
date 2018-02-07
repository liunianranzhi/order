package com.shanyuan.platform.ms.dao.user.entity;

import java.math.BigDecimal;

/**
 * 描述:sy_voucher_order表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-10-17
 */
public class SyVoucherOrder {
    /**
     * 主键ID
     */
    private Integer recId;

    /**
     * 订单ID
     */
    private Integer orderId;

    /**
     * 商品ID
     */
    private Integer goodsId;

    /**
     * 优惠券编码
     */
    private String voucherCode;

    /**
     * 使用时间
     */
    private Integer useTime;

    /**
     * 优惠券使用金额
     */
    private BigDecimal amount;

    /**
     * 买家ID
     */
    private Integer buyerId;
    
    /**
     * 代金券模板id
     */
    private Integer voucherTId;

    /**
     * 主键ID
     * @return rec_id 主键ID
     */
    public Integer getRecId() {
        return recId;
    }

    /**
     * 主键ID
     * @param recId 主键ID
     */
    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    /**
     * 订单ID
     * @return order_id 订单ID
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 订单ID
     * @param orderId 订单ID
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 商品ID
     * @return goods_id 商品ID
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * 商品ID
     * @param goodsId 商品ID
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 优惠券编码
     * @return voucher_code 优惠券编码
     */
    public String getVoucherCode() {
        return voucherCode;
    }

    /**
     * 优惠券编码
     * @param voucherCode 优惠券编码
     */
    public void setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode == null ? null : voucherCode.trim();
    }

    /**
     * 使用时间
     * @return use_time 使用时间
     */
    public Integer getUseTime() {
        return useTime;
    }

    /**
     * 使用时间
     * @param useTime 使用时间
     */
    public void setUseTime(Integer useTime) {
        this.useTime = useTime;
    }

    /**
     * 优惠券使用金额
     * @return amount 优惠券使用金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 优惠券使用金额
     * @param amount 优惠券使用金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 买家ID
     * @return buyer_id 买家ID
     */
    public Integer getBuyerId() {
        return buyerId;
    }

    /**
     * 买家ID
     * @param buyerId 买家ID
     */
    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

	public Integer getVoucherTId() {
		return voucherTId;
	}

	public void setVoucherTId(Integer voucherTId) {
		this.voucherTId = voucherTId;
	}
    
    
}