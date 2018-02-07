package com.shanyuan.platform.ms.dao.omorder.entity;

import java.util.Date;

/**
 * 描述:om_order_coupon表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-11-10
 */
public class OmOrderCoupon {
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
     * 扶贫码id
     */
    private Integer couponId;

    /**
     * 扶贫码code
     */
    private String couponCode;

    /**
     * 扶贫码用户id
     */
    private Integer memberId;

    /**
     * 扶贫码使用金额
     */
    private Integer couponPrice;

    /**
     * 扶贫码批次号
     */
    private String couponBatchSn;

    /**
     * 使用时间
     */
    private Date useTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 是否删除 0 未删除             1 删除
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
     * 扶贫码id
     * @return coupon_id 扶贫码id
     */
    public Integer getCouponId() {
        return couponId;
    }

    /**
     * 扶贫码id
     * @param couponId 扶贫码id
     */
    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    /**
     * 扶贫码code
     * @return coupon_code 扶贫码code
     */
    public String getCouponCode() {
        return couponCode;
    }

    /**
     * 扶贫码code
     * @param couponCode 扶贫码code
     */
    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode == null ? null : couponCode.trim();
    }

    /**
     * 扶贫码用户id
     * @return member_id 扶贫码用户id
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 扶贫码用户id
     * @param memberId 扶贫码用户id
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 扶贫码使用金额
     * @return coupon_price 扶贫码使用金额
     */
    public Integer getCouponPrice() {
        return couponPrice;
    }

    /**
     * 扶贫码使用金额
     * @param couponPrice 扶贫码使用金额
     */
    public void setCouponPrice(Integer couponPrice) {
        this.couponPrice = couponPrice;
    }

    /**
     * 扶贫码批次号
     * @return coupon_batch_sn 扶贫码批次号
     */
    public String getCouponBatchSn() {
        return couponBatchSn;
    }

    /**
     * 扶贫码批次号
     * @param couponBatchSn 扶贫码批次号
     */
    public void setCouponBatchSn(String couponBatchSn) {
        this.couponBatchSn = couponBatchSn == null ? null : couponBatchSn.trim();
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
     * 是否删除 0 未删除             1 删除
     * @return is_delete 是否删除 0 未删除             1 删除
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * 是否删除 0 未删除             1 删除
     * @param isDelete 是否删除 0 未删除             1 删除
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