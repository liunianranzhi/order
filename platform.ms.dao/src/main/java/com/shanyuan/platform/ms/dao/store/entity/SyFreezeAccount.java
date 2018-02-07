package com.shanyuan.platform.ms.dao.store.entity;

/**
 * 描述:sy_freeze_account表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-11-02
 */
public class SyFreezeAccount {
    /**
     * 主键id
     */
    private Integer recId;

    /**
     * 会员id
     */
    private Integer memberId;

    /**
     * 添加时间
     */
    private Integer addTime;

    /**
     * 操作者的id
     */
    private Integer operatorId;

    /**
     * 被冻结的小时数
     */
    private Integer freezeDuration;

    /**
     * 主键id
     * @return rec_id 主键id
     */
    public Integer getRecId() {
        return recId;
    }

    /**
     * 主键id
     * @param recId 主键id
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
     * 操作者的id
     * @return operator_id 操作者的id
     */
    public Integer getOperatorId() {
        return operatorId;
    }

    /**
     * 操作者的id
     * @param operatorId 操作者的id
     */
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * 被冻结的小时数
     * @return freeze_duration 被冻结的小时数
     */
    public Integer getFreezeDuration() {
        return freezeDuration;
    }

    /**
     * 被冻结的小时数
     * @param freezeDuration 被冻结的小时数
     */
    public void setFreezeDuration(Integer freezeDuration) {
        this.freezeDuration = freezeDuration;
    }
}