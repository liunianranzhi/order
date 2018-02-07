package com.shanyuan.platform.ms.dao.store.entity;

/**
 * 描述:sy_boc_org表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-10-17
 */
public class SyBocOrg {
    /**
     * 
     */
    private Integer recId;

    /**
     * 单位circle_id
     */
    private Integer circleId;

    /**
     * 单位/部门名称
     */
    private String circleDeptName;

    /**
     * 上级单位/部门名称
     */
    private String parentCircleDeptName;

    /**
     * 标签
     */
    private String orgName;

    /**
     * 组织类型，unit:行政单位, party:党组织关系,org:团组织关系
     */
    private String orgType;

    /**
     * 标识代码
     */
    private String orgCode;

    /**
     * 党组织/团组织对应的部门circle_id
     */
    private Integer deptCircleId;

    /**
     * 渠道标识,默认空
     */
    private String channel;

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
     * 单位circle_id
     * @return circle_id 单位circle_id
     */
    public Integer getCircleId() {
        return circleId;
    }

    /**
     * 单位circle_id
     * @param circleId 单位circle_id
     */
    public void setCircleId(Integer circleId) {
        this.circleId = circleId;
    }

    /**
     * 单位/部门名称
     * @return circle_dept_name 单位/部门名称
     */
    public String getCircleDeptName() {
        return circleDeptName;
    }

    /**
     * 单位/部门名称
     * @param circleDeptName 单位/部门名称
     */
    public void setCircleDeptName(String circleDeptName) {
        this.circleDeptName = circleDeptName == null ? null : circleDeptName.trim();
    }

    /**
     * 上级单位/部门名称
     * @return parent_circle_dept_name 上级单位/部门名称
     */
    public String getParentCircleDeptName() {
        return parentCircleDeptName;
    }

    /**
     * 上级单位/部门名称
     * @param parentCircleDeptName 上级单位/部门名称
     */
    public void setParentCircleDeptName(String parentCircleDeptName) {
        this.parentCircleDeptName = parentCircleDeptName == null ? null : parentCircleDeptName.trim();
    }

    /**
     * 标签
     * @return org_name 标签
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * 标签
     * @param orgName 标签
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    /**
     * 组织类型，unit:行政单位, party:党组织关系,org:团组织关系
     * @return org_type 组织类型，unit:行政单位, party:党组织关系,org:团组织关系
     */
    public String getOrgType() {
        return orgType;
    }

    /**
     * 组织类型，unit:行政单位, party:党组织关系,org:团组织关系
     * @param orgType 组织类型，unit:行政单位, party:党组织关系,org:团组织关系
     */
    public void setOrgType(String orgType) {
        this.orgType = orgType == null ? null : orgType.trim();
    }

    /**
     * 标识代码
     * @return org_code 标识代码
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * 标识代码
     * @param orgCode 标识代码
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    /**
     * 党组织/团组织对应的部门circle_id
     * @return dept_circle_id 党组织/团组织对应的部门circle_id
     */
    public Integer getDeptCircleId() {
        return deptCircleId;
    }

    /**
     * 党组织/团组织对应的部门circle_id
     * @param deptCircleId 党组织/团组织对应的部门circle_id
     */
    public void setDeptCircleId(Integer deptCircleId) {
        this.deptCircleId = deptCircleId;
    }

    /**
     * 渠道标识,默认空
     * @return channel 渠道标识,默认空
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 渠道标识,默认空
     * @param channel 渠道标识,默认空
     */
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }
}