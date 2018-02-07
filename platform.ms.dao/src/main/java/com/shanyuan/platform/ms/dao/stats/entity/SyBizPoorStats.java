package com.shanyuan.platform.ms.dao.stats.entity;

/**
 * 描述:sy_biz_poor_stats表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-11-13
 */
public class SyBizPoorStats {
    /**
     * 主键id
     */
    private Integer statsId;

    /**
     * 代理人id
     */
    private Integer agentMid;

    /**
     * 贫困户id
     */
    private Integer poorId;

    /**
     * 贫困户会员id
     */
    private Integer poorMid;

    /**
     * 集采分配的完成配额单位元
     */
    private Integer finishedMoney;

    /**
     * 添加时间
     */
    private Integer addTime;

    /**
     * 主键id
     * @return stats_id 主键id
     */
    public Integer getStatsId() {
        return statsId;
    }

    /**
     * 主键id
     * @param statsId 主键id
     */
    public void setStatsId(Integer statsId) {
        this.statsId = statsId;
    }

    /**
     * 代理人id
     * @return agent_mid 代理人id
     */
    public Integer getAgentMid() {
        return agentMid;
    }

    /**
     * 代理人id
     * @param agentMid 代理人id
     */
    public void setAgentMid(Integer agentMid) {
        this.agentMid = agentMid;
    }

    /**
     * 贫困户id
     * @return poor_id 贫困户id
     */
    public Integer getPoorId() {
        return poorId;
    }

    /**
     * 贫困户id
     * @param poorId 贫困户id
     */
    public void setPoorId(Integer poorId) {
        this.poorId = poorId;
    }

    /**
     * 贫困户会员id
     * @return poor_mid 贫困户会员id
     */
    public Integer getPoorMid() {
        return poorMid;
    }

    /**
     * 贫困户会员id
     * @param poorMid 贫困户会员id
     */
    public void setPoorMid(Integer poorMid) {
        this.poorMid = poorMid;
    }

    /**
     * 集采分配的完成配额单位元
     * @return finished_money 集采分配的完成配额单位元
     */
    public Integer getFinishedMoney() {
        return finishedMoney;
    }

    /**
     * 集采分配的完成配额单位元
     * @param finishedMoney 集采分配的完成配额单位元
     */
    public void setFinishedMoney(Integer finishedMoney) {
        this.finishedMoney = finishedMoney;
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
}