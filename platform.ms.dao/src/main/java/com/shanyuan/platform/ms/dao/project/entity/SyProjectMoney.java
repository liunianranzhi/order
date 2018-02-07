package com.shanyuan.platform.ms.dao.project.entity;

import java.math.BigDecimal;

/**
 * 描述:sy_project_money表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-11-01
 */
public class SyProjectMoney {
    /**
     * 主键id
     */
    private Integer projectId;

    /**
     * 目标金额单位元
     */
    private BigDecimal targetMoney;

    /**
     * 每1元多少积分
     */
    private Integer pointsMoney;

    /**
     * 已完成金额
     */
    private BigDecimal finishedMoney;

    /**
     * 参与人数
     */
    private Integer number;

    /**
     * 参与人次
     */
    private Integer personTime;

    /**
     * 主键id
     * @return project_id 主键id
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * 主键id
     * @param projectId 主键id
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * 目标金额单位元
     * @return target_money 目标金额单位元
     */
    public BigDecimal getTargetMoney() {
        return targetMoney;
    }

    /**
     * 目标金额单位元
     * @param targetMoney 目标金额单位元
     */
    public void setTargetMoney(BigDecimal targetMoney) {
        this.targetMoney = targetMoney;
    }

    /**
     * 每1元多少积分
     * @return points_money 每1元多少积分
     */
    public Integer getPointsMoney() {
        return pointsMoney;
    }

    /**
     * 每1元多少积分
     * @param pointsMoney 每1元多少积分
     */
    public void setPointsMoney(Integer pointsMoney) {
        this.pointsMoney = pointsMoney;
    }

    /**
     * 已完成金额
     * @return finished_money 已完成金额
     */
    public BigDecimal getFinishedMoney() {
        return finishedMoney;
    }

    /**
     * 已完成金额
     * @param finishedMoney 已完成金额
     */
    public void setFinishedMoney(BigDecimal finishedMoney) {
        this.finishedMoney = finishedMoney;
    }

    /**
     * 参与人数
     * @return number 参与人数
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 参与人数
     * @param number 参与人数
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 参与人次
     * @return person_time 参与人次
     */
    public Integer getPersonTime() {
        return personTime;
    }

    /**
     * 参与人次
     * @param personTime 参与人次
     */
    public void setPersonTime(Integer personTime) {
        this.personTime = personTime;
    }
}