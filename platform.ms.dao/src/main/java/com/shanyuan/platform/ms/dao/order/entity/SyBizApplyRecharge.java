package com.shanyuan.platform.ms.dao.order.entity;

import java.math.BigDecimal;

/**
 * 描述:sy_biz_apply_recharge表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-11-02
 */
public class SyBizApplyRecharge {
    /**
     * 
     */
    private Integer recId;

    /**
     * 会员id
     */
    private Integer memberId;

    /**
     * 集采监管id
     */
    private Integer bizMid;

    /**
     * 圈子id
     */
    private Integer circleId;

    /**
     * 单位元
     */
    private BigDecimal amount;

    /**
     * 添加时间
     */
    private Integer addTime;

    /**
     * 积分
     */
    private Long bocPoints;

    /**
     * 
     * @return rec_id 
     */
    public Integer getRecId() {
        return recId;
    }

    /**
     * 
     * @param recId 
     */
    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    /**
     * 会员id
     * @return member_id 会员id
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 会员id
     * @param memberId 会员id
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 集采监管id
     * @return biz_mid 集采监管id
     */
    public Integer getBizMid() {
        return bizMid;
    }

    /**
     * 集采监管id
     * @param bizMid 集采监管id
     */
    public void setBizMid(Integer bizMid) {
        this.bizMid = bizMid;
    }

    /**
     * 圈子id
     * @return circle_id 圈子id
     */
    public Integer getCircleId() {
        return circleId;
    }

    /**
     * 圈子id
     * @param circleId 圈子id
     */
    public void setCircleId(Integer circleId) {
        this.circleId = circleId;
    }

    /**
     * 单位元
     * @return amount 单位元
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 单位元
     * @param amount 单位元
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 添加时间
     * @return add_time 添加时间
     */
    public Integer getAddTime() {
        return addTime;
    }

    /**
     * 添加时间
     * @param addTime 添加时间
     */
    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    /**
     * 积分
     * @return boc_points 积分
     */
    public Long getBocPoints() {
        return bocPoints;
    }

    /**
     * 积分
     * @param bocPoints 积分
     */
    public void setBocPoints(Long bocPoints) {
        this.bocPoints = bocPoints;
    }
}