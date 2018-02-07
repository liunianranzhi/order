package com.shanyuan.platform.ms.dao.stats.entity;

import java.math.BigDecimal;

/**
 * 描述:sy_area_balance_stats表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-11-10
 */
public class SyAreaBalanceStats {
    /**
     * 统计地区数据id
     */
    private Integer recId;

    /**
     * 一级地区id
     */
    private Long areaid1;

    /**
     * 二级地区id
     */
    private Long areaid2;

    /**
     * 三级地区id
     */
    private Long areaid3;

    /**
     * 地区目标帮扶金额单位元
     */
    private BigDecimal targetMoney;

    /**
     * 地区已完成的帮扶金额单位元
     */
    private BigDecimal finishedMoney;

    /**
     * 添加时间
     */
    private Integer addTime;

    /**
     * 统计地区数据id
     * @return rec_id 统计地区数据id
     */
    public Integer getRecId() {
        return recId;
    }

    /**
     * 统计地区数据id
     * @param recId 统计地区数据id
     */
    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    /**
     * 一级地区id
     * @return areaid_1 一级地区id
     */
    public Long getAreaid1() {
        return areaid1;
    }

    /**
     * 一级地区id
     * @param areaid1 一级地区id
     */
    public void setAreaid1(Long areaid1) {
        this.areaid1 = areaid1;
    }

    /**
     * 二级地区id
     * @return areaid_2 二级地区id
     */
    public Long getAreaid2() {
        return areaid2;
    }

    /**
     * 二级地区id
     * @param areaid2 二级地区id
     */
    public void setAreaid2(Long areaid2) {
        this.areaid2 = areaid2;
    }

    /**
     * 三级地区id
     * @return areaid_3 三级地区id
     */
    public Long getAreaid3() {
        return areaid3;
    }

    /**
     * 三级地区id
     * @param areaid3 三级地区id
     */
    public void setAreaid3(Long areaid3) {
        this.areaid3 = areaid3;
    }

    /**
     * 地区目标帮扶金额单位元
     * @return target_money 地区目标帮扶金额单位元
     */
    public BigDecimal getTargetMoney() {
        return targetMoney;
    }

    /**
     * 地区目标帮扶金额单位元
     * @param targetMoney 地区目标帮扶金额单位元
     */
    public void setTargetMoney(BigDecimal targetMoney) {
        this.targetMoney = targetMoney;
    }

    /**
     * 地区已完成的帮扶金额单位元
     * @return finished_money 地区已完成的帮扶金额单位元
     */
    public BigDecimal getFinishedMoney() {
        return finishedMoney;
    }

    /**
     * 地区已完成的帮扶金额单位元
     * @param finishedMoney 地区已完成的帮扶金额单位元
     */
    public void setFinishedMoney(BigDecimal finishedMoney) {
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