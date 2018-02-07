package com.shanyuan.platform.ms.dao.omorder.entity;

import java.util.Date;

/**
 * 描述:om_order_voucher表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-11-10
 */
public class OmOrderVoucher {
    /**
     * 记录id
     */
    private Integer recId;

    /**
     * 订单id
     */
    private String orderId;

    /**
     * 主订单id
     */
    private String mainId;

    /**
     * 优惠券id
     */
    private Integer voucherId;

    /**
     * 优惠券编码
     */
    private String voucherCode;

    /**
     * 使用时间
     */
    private Date useTime;

    /**
     * 使用金额
     */
    private Integer voucherPrice;

    /**
     * 拥有者id
     */
    private Integer memberId;

    /**
     * 代金券模板id
     */
    private Integer voucherTplId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 是否删除
     */
    private Byte isDelete;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 记录id
     * @return rec_id 记录id
     */
    public Integer getRecId() {
        return recId;
    }

    /**
     * 记录id
     * @param recId 记录id
     */
    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    /**
     * 订单id
     * @return order_id 订单id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 订单id
     * @param orderId 订单id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * 主订单id
     * @return main_id 主订单id
     */
    public String getMainId() {
        return mainId;
    }

    /**
     * 主订单id
     * @param mainId 主订单id
     */
    public void setMainId(String mainId) {
        this.mainId = mainId == null ? null : mainId.trim();
    }

    /**
     * 优惠券id
     * @return voucher_id 优惠券id
     */
    public Integer getVoucherId() {
        return voucherId;
    }

    /**
     * 优惠券id
     * @param voucherId 优惠券id
     */
    public void setVoucherId(Integer voucherId) {
        this.voucherId = voucherId;
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
    public Date getUseTime() {
        return useTime;
    }

    /**
     * 使用时间
     * @param useTime 使用时间
     */
    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    /**
     * 使用金额
     * @return voucher_price 使用金额
     */
    public Integer getVoucherPrice() {
        return voucherPrice;
    }

    /**
     * 使用金额
     * @param voucherPrice 使用金额
     */
    public void setVoucherPrice(Integer voucherPrice) {
        this.voucherPrice = voucherPrice;
    }

    /**
     * 拥有者id
     * @return member_id 拥有者id
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 拥有者id
     * @param memberId 拥有者id
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 代金券模板id
     * @return voucher_tpl_id 代金券模板id
     */
    public Integer getVoucherTplId() {
        return voucherTplId;
    }

    /**
     * 代金券模板id
     * @param voucherTplId 代金券模板id
     */
    public void setVoucherTplId(Integer voucherTplId) {
        this.voucherTplId = voucherTplId;
    }

    /**
     * 备注
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 是否删除
     * @return is_delete 是否删除
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * 是否删除
     * @param isDelete 是否删除
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 更新时间
     * @return update_time 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}