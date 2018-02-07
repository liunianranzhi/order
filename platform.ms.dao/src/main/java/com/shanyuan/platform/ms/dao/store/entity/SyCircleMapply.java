package com.shanyuan.platform.ms.dao.store.entity;

/**
 * 描述:sy_circle_mapply表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-10-17
 */
public class SyCircleMapply {
    /**
     * 申请id
     */
    private Integer mapplyId;

    /**
     * 圈子id
     */
    private Integer circleId;

    /**
     * 成员id
     */
    private Integer memberId;

    /**
     * 申请理由
     */
    private String mapplyReason;

    /**
     * 申请时间
     */
    private String mapplyTime;

    /**
     * 申请id
     * @return mapply_id 申请id
     */
    public Integer getMapplyId() {
        return mapplyId;
    }

    /**
     * 申请id
     * @param mapplyId 申请id
     */
    public void setMapplyId(Integer mapplyId) {
        this.mapplyId = mapplyId;
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
     * 成员id
     * @return member_id 成员id
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 成员id
     * @param memberId 成员id
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 申请理由
     * @return mapply_reason 申请理由
     */
    public String getMapplyReason() {
        return mapplyReason;
    }

    /**
     * 申请理由
     * @param mapplyReason 申请理由
     */
    public void setMapplyReason(String mapplyReason) {
        this.mapplyReason = mapplyReason == null ? null : mapplyReason.trim();
    }

    /**
     * 申请时间
     * @return mapply_time 申请时间
     */
    public String getMapplyTime() {
        return mapplyTime;
    }

    /**
     * 申请时间
     * @param mapplyTime 申请时间
     */
    public void setMapplyTime(String mapplyTime) {
        this.mapplyTime = mapplyTime == null ? null : mapplyTime.trim();
    }
}