package com.shanyuan.platform.ms.core.user.bo;

import java.math.BigDecimal;

public class Coupon {
	  /**
     * 主键
     */
    private Integer couponId;

    /**
     * 使用者id
     */
    private Integer memberId;

    /**
     * 使用时间
     */
    private Integer usedTime;

    /**
     * 购买劵电子码
     */
    private String couponCode;

    /**
     * 生成时间
     */
    private Integer createTime;

    /**
     * 过期时间
     */
    private Integer expiredTime;

    /**
     * 面值
     */
    private BigDecimal value;

    /**
     * 余额
     */
    private BigDecimal balance;

    /**
     * 发票id
     */
    private Integer invId;

    /**
     * 购物劵生成批次号
     */
    private Long couponBatchSn;

    /**
     * 发卡人姓名
     */
    private String couponCreator;

    /**
     * 购物劵创建人id
     */
    private Integer creatorId;

    /**
     * 操作者id
     */
    private Integer operatorId;

    /**
     * 扶贫码启用时间
     */
    private Integer startTime;

    /**
     * 主键
     * @return coupon_id 主键
     */
    public Integer getCouponId() {
        return couponId;
    }

    /**
     * 主键
     * @param couponId 主键
     */
    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    /**
     * 使用者id
     * @return member_id 使用者id
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 使用者id
     * @param memberId 使用者id
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 使用时间
     * @return used_time 使用时间
     */
    public Integer getUsedTime() {
        return usedTime;
    }

    /**
     * 使用时间
     * @param usedTime 使用时间
     */
    public void setUsedTime(Integer usedTime) {
        this.usedTime = usedTime;
    }

    /**
     * 购买劵电子码
     * @return coupon_code 购买劵电子码
     */
    public String getCouponCode() {
        return couponCode;
    }

    /**
     * 购买劵电子码
     * @param couponCode 购买劵电子码
     */
    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode == null ? null : couponCode.trim();
    }

    /**
     * 生成时间
     * @return create_time 生成时间
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * 生成时间
     * @param createTime 生成时间
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * 过期时间
     * @return expired_time 过期时间
     */
    public Integer getExpiredTime() {
        return expiredTime;
    }

    /**
     * 过期时间
     * @param expiredTime 过期时间
     */
    public void setExpiredTime(Integer expiredTime) {
        this.expiredTime = expiredTime;
    }

    /**
     * 面值
     * @return value 面值
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * 面值
     * @param value 面值
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * 余额
     * @return balance 余额
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * 余额
     * @param balance 余额
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * 发票id
     * @return inv_id 发票id
     */
    public Integer getInvId() {
        return invId;
    }

    /**
     * 发票id
     * @param invId 发票id
     */
    public void setInvId(Integer invId) {
        this.invId = invId;
    }

    /**
     * 购物劵生成批次号
     * @return coupon_batch_sn 购物劵生成批次号
     */
    public Long getCouponBatchSn() {
        return couponBatchSn;
    }

    /**
     * 购物劵生成批次号
     * @param couponBatchSn 购物劵生成批次号
     */
    public void setCouponBatchSn(Long couponBatchSn) {
        this.couponBatchSn = couponBatchSn;
    }

    /**
     * 发卡人姓名
     * @return coupon_creator 发卡人姓名
     */
    public String getCouponCreator() {
        return couponCreator;
    }

    /**
     * 发卡人姓名
     * @param couponCreator 发卡人姓名
     */
    public void setCouponCreator(String couponCreator) {
        this.couponCreator = couponCreator == null ? null : couponCreator.trim();
    }

    /**
     * 购物劵创建人id
     * @return creator_id 购物劵创建人id
     */
    public Integer getCreatorId() {
        return creatorId;
    }

    /**
     * 购物劵创建人id
     * @param creatorId 购物劵创建人id
     */
    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * 操作者id
     * @return operator_id 操作者id
     */
    public Integer getOperatorId() {
        return operatorId;
    }

    /**
     * 操作者id
     * @param operatorId 操作者id
     */
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * 扶贫码启用时间
     * @return start_time 扶贫码启用时间
     */
    public Integer getStartTime() {
        return startTime;
    }

    /**
     * 扶贫码启用时间
     * @param startTime 扶贫码启用时间
     */
    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }
}
