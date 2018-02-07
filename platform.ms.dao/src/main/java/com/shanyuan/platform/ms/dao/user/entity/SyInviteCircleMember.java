package com.shanyuan.platform.ms.dao.user.entity;

/**
 * 描述:sy_invite_circle_member表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-10-16
 */
public class SyInviteCircleMember {
    /**
     * 主键
     */
    private Integer recId;

    /**
     * 会员id
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
     * 邀请人的会员id
     */
    private Integer inviteMemberId;

    /**
     * 邀请人的圈子id
     */
    private Integer inviteCircleId;

    /**
     * 单位名称
     */
    private String unitName;

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
     * 邀请人的会员id
     * @return invite_member_id 邀请人的会员id
     */
    public Integer getInviteMemberId() {
        return inviteMemberId;
    }

    /**
     * 邀请人的会员id
     * @param inviteMemberId 邀请人的会员id
     */
    public void setInviteMemberId(Integer inviteMemberId) {
        this.inviteMemberId = inviteMemberId;
    }

    /**
     * 邀请人的圈子id
     * @return invite_circle_id 邀请人的圈子id
     */
    public Integer getInviteCircleId() {
        return inviteCircleId;
    }

    /**
     * 邀请人的圈子id
     * @param inviteCircleId 邀请人的圈子id
     */
    public void setInviteCircleId(Integer inviteCircleId) {
        this.inviteCircleId = inviteCircleId;
    }

    /**
     * 单位名称
     * @return unit_name 单位名称
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * 单位名称
     * @param unitName 单位名称
     */
    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }
}