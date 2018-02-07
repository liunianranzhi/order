package com.shanyuan.platform.ms.dao.user.entity;

/**
 * 描述:sy_manager_boc表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-10-19
 */
public class SyManagerBoc {
    /**
     * 
     */
    private Integer managerId;

    /**
     * 用户的id
     */
    private Integer memberId;

    /**
     * 部门id
     */
    private Integer circleId;

    /**
     * 0：不是一把手；1：是一把手
     */
    private String isBoss;

    /**
     * 
     * @return manager_id 
     */
    public Integer getManagerId() {
        return managerId;
    }

    /**
     * 
     * @param managerId 
     */
    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    /**
     * 用户的id
     * @return member_id 用户的id
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 用户的id
     * @param memberId 用户的id
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 部门id
     * @return circle_id 部门id
     */
    public Integer getCircleId() {
        return circleId;
    }

    /**
     * 部门id
     * @param circleId 部门id
     */
    public void setCircleId(Integer circleId) {
        this.circleId = circleId;
    }

    /**
     * 0：不是一把手；1：是一把手
     * @return is_boss 0：不是一把手；1：是一把手
     */
    public String getIsBoss() {
        return isBoss;
    }

    /**
     * 0：不是一把手；1：是一把手
     * @param isBoss 0：不是一把手；1：是一把手
     */
    public void setIsBoss(String isBoss) {
        this.isBoss = isBoss == null ? null : isBoss.trim();
    }
}