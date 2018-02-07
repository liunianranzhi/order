package com.shanyuan.platform.ms.dao.user.entity;

/**
 * 描述:sy_invite_circle_log表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-10-16
 */
public class SyInviteCircleLog {
    /**
     * 主键
     */
    private Integer recId;

    /**
     * 邀请人会员id
     */
    private Integer invMemberId;

    /**
     * 被邀请人会员id
     */
    private Integer memberId;

    /**
     * 圈子id
     */
    private Integer circleId;

    /**
     * 添加时间
     */
    private Integer addTime;

    /**
     * 分组编辑时间
     */
    private Integer groupEditTime;

    /**
     * 备注
     */
    private String mark;

    /**
     * 分组id
     */
    private Integer groupId;

    /**
     * 主键
     * @return rec_id 主键
     */
    public Integer getRecId() {
        return recId;
    }

    /**
     * 主键
     * @param recId 主键
     */
    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    /**
     * 邀请人会员id
     * @return inv_member_id 邀请人会员id
     */
    public Integer getInvMemberId() {
        return invMemberId;
    }

    /**
     * 邀请人会员id
     * @param invMemberId 邀请人会员id
     */
    public void setInvMemberId(Integer invMemberId) {
        this.invMemberId = invMemberId;
    }

    /**
     * 被邀请人会员id
     * @return member_id 被邀请人会员id
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 被邀请人会员id
     * @param memberId 被邀请人会员id
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
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
     * 分组编辑时间
     * @return group_edit_time 分组编辑时间
     */
    public Integer getGroupEditTime() {
        return groupEditTime;
    }

    /**
     * 分组编辑时间
     * @param groupEditTime 分组编辑时间
     */
    public void setGroupEditTime(Integer groupEditTime) {
        this.groupEditTime = groupEditTime;
    }

    /**
     * 备注
     * @return mark 备注
     */
    public String getMark() {
        return mark;
    }

    /**
     * 备注
     * @param mark 备注
     */
    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    /**
     * 分组id
     * @return group_id 分组id
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * 分组id
     * @param groupId 分组id
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }
}