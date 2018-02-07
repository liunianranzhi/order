package com.shanyuan.platform.ms.dao.user.entity;

/**
 * 描述:sy_group_manager表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-10-17
 */
public class SyGroupManager {
    /**
     * 主键id
     */
    private Integer groupManagerId;

    /**
     * 用户的id
     */
    private Integer memberId;

    /**
     * 部门id
     */
    private Integer circleId;

    /**
     * 主键id
     * @return group_manager_id 主键id
     */
    public Integer getGroupManagerId() {
        return groupManagerId;
    }

    /**
     * 主键id
     * @param groupManagerId 主键id
     */
    public void setGroupManagerId(Integer groupManagerId) {
        this.groupManagerId = groupManagerId;
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

	@Override
	public String toString() {
		return "SyGroupManager [groupManagerId=" + groupManagerId + ", memberId=" + memberId + ", circleId=" + circleId
				+ "]";
	}
    
}