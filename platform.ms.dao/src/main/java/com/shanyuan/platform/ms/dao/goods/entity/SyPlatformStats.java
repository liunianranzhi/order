package com.shanyuan.platform.ms.dao.goods.entity;

import java.math.BigDecimal;

/**
 * 描述:sy_platform_stats表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-11-07
 */
public class SyPlatformStats {
    /**
     * 主键
     */
    private Integer recId;

    /**
     * 近期退款率
     */
    private BigDecimal latestRefundRate;

    /**
     * 近期投诉率
     */
    private BigDecimal latestComplainRate;

    /**
     * 统计时间(当天零点)
     */
    private Integer statsTime;

    /**
     * 平台最近30天平均发货速度
     */
    private BigDecimal latestSendSpeed;

    /**
     * 大爱超市当日销售总额
     */
    private BigDecimal daaiOrderAmount;

    /**
     * 大爱超市当日订单总量
     */
    private Integer daaiOrderCount;

    /**
     * 大爱超市当日退款订单总量
     */
    private Integer daaiRefundCount;

    /**
     * 大爱超市当日投诉订单总量
     */
    private Integer daaiComplainCount;

    /**
     * 集采当日销售总额
     */
    private BigDecimal jicaiOrderAmount;

    /**
     * 集采当日订单总量
     */
    private Integer jicaiOrderCount;

    /**
     * 集采当日退款订单总量
     */
    private Integer jicaiRefundCount;

    /**
     * 集采当日投诉订单总量
     */
    private Integer jicaiComplainCount;

    /**
     * 善源商场当日销售总额
     */
    private BigDecimal syshopOrderAmount;

    /**
     * 善源商场当日订单总量
     */
    private Integer syshopOrderCount;

    /**
     * 善源商场当日退款订单总量
     */
    private Integer syshopRefundCount;

    /**
     * 善源商场当日投诉订单总量
     */
    private Integer syshopComplainCount;

    /**
     * 中行新增人数
     */
    private Integer increaseMemberCount;

    /**
     * 中行新增益客人数
     */
    private Integer increaseInviteMemberCount;

    /**
     * 中行累计总人数
     */
    private Integer memberCount;

    /**
     * 中行累计益客总人数
     */
    private Integer inviteMemberCount;

    /**
     * 非中行新增人数
     */
    private Integer otherIncreaseMemberCount;

    /**
     * 非中行新增益客人数
     */
    private Integer otherIncreaseInviteMemberCount;

    /**
     * 非中行累计总人数
     */
    private Integer otherMemberCount;

    /**
     * 非中行累计益客总人数
     */
    private Integer otherInviteMemberCount;

    /**
     * 平台注册总人数
     */
    private Integer allMemberRegistCount;

    /**
     * 添加时间
     */
    private Integer addTime;

    /**
     * 平台仅消费总人数
     */
    private Integer memberOnlySpending;

    /**
     * 平台仅捐款总人数
     */
    private Integer memberOnlyDonative;

    /**
     * 平台消费同时捐款总人数
     */
    private Integer memberSpendingAndDonative;

    /**
     * 平台有消费/捐款总人数
     */
    private Integer memberSpendingOrDonative;

    /**
     * 平台未捐款、消费总人数
     */
    private Integer memberNone;

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
     * 近期退款率
     * @return latest_refund_rate 近期退款率
     */
    public BigDecimal getLatestRefundRate() {
        return latestRefundRate;
    }

    /**
     * 近期退款率
     * @param latestRefundRate 近期退款率
     */
    public void setLatestRefundRate(BigDecimal latestRefundRate) {
        this.latestRefundRate = latestRefundRate;
    }

    /**
     * 近期投诉率
     * @return latest_complain_rate 近期投诉率
     */
    public BigDecimal getLatestComplainRate() {
        return latestComplainRate;
    }

    /**
     * 近期投诉率
     * @param latestComplainRate 近期投诉率
     */
    public void setLatestComplainRate(BigDecimal latestComplainRate) {
        this.latestComplainRate = latestComplainRate;
    }

    /**
     * 统计时间(当天零点)
     * @return stats_time 统计时间(当天零点)
     */
    public Integer getStatsTime() {
        return statsTime;
    }

    /**
     * 统计时间(当天零点)
     * @param statsTime 统计时间(当天零点)
     */
    public void setStatsTime(Integer statsTime) {
        this.statsTime = statsTime;
    }

    /**
     * 平台最近30天平均发货速度
     * @return latest_send_speed 平台最近30天平均发货速度
     */
    public BigDecimal getLatestSendSpeed() {
        return latestSendSpeed;
    }

    /**
     * 平台最近30天平均发货速度
     * @param latestSendSpeed 平台最近30天平均发货速度
     */
    public void setLatestSendSpeed(BigDecimal latestSendSpeed) {
        this.latestSendSpeed = latestSendSpeed;
    }

    /**
     * 大爱超市当日销售总额
     * @return daai_order_amount 大爱超市当日销售总额
     */
    public BigDecimal getDaaiOrderAmount() {
        return daaiOrderAmount;
    }

    /**
     * 大爱超市当日销售总额
     * @param daaiOrderAmount 大爱超市当日销售总额
     */
    public void setDaaiOrderAmount(BigDecimal daaiOrderAmount) {
        this.daaiOrderAmount = daaiOrderAmount;
    }

    /**
     * 大爱超市当日订单总量
     * @return daai_order_count 大爱超市当日订单总量
     */
    public Integer getDaaiOrderCount() {
        return daaiOrderCount;
    }

    /**
     * 大爱超市当日订单总量
     * @param daaiOrderCount 大爱超市当日订单总量
     */
    public void setDaaiOrderCount(Integer daaiOrderCount) {
        this.daaiOrderCount = daaiOrderCount;
    }

    /**
     * 大爱超市当日退款订单总量
     * @return daai_refund_count 大爱超市当日退款订单总量
     */
    public Integer getDaaiRefundCount() {
        return daaiRefundCount;
    }

    /**
     * 大爱超市当日退款订单总量
     * @param daaiRefundCount 大爱超市当日退款订单总量
     */
    public void setDaaiRefundCount(Integer daaiRefundCount) {
        this.daaiRefundCount = daaiRefundCount;
    }

    /**
     * 大爱超市当日投诉订单总量
     * @return daai_complain_count 大爱超市当日投诉订单总量
     */
    public Integer getDaaiComplainCount() {
        return daaiComplainCount;
    }

    /**
     * 大爱超市当日投诉订单总量
     * @param daaiComplainCount 大爱超市当日投诉订单总量
     */
    public void setDaaiComplainCount(Integer daaiComplainCount) {
        this.daaiComplainCount = daaiComplainCount;
    }

    /**
     * 集采当日销售总额
     * @return jicai_order_amount 集采当日销售总额
     */
    public BigDecimal getJicaiOrderAmount() {
        return jicaiOrderAmount;
    }

    /**
     * 集采当日销售总额
     * @param jicaiOrderAmount 集采当日销售总额
     */
    public void setJicaiOrderAmount(BigDecimal jicaiOrderAmount) {
        this.jicaiOrderAmount = jicaiOrderAmount;
    }

    /**
     * 集采当日订单总量
     * @return jicai_order_count 集采当日订单总量
     */
    public Integer getJicaiOrderCount() {
        return jicaiOrderCount;
    }

    /**
     * 集采当日订单总量
     * @param jicaiOrderCount 集采当日订单总量
     */
    public void setJicaiOrderCount(Integer jicaiOrderCount) {
        this.jicaiOrderCount = jicaiOrderCount;
    }

    /**
     * 集采当日退款订单总量
     * @return jicai_refund_count 集采当日退款订单总量
     */
    public Integer getJicaiRefundCount() {
        return jicaiRefundCount;
    }

    /**
     * 集采当日退款订单总量
     * @param jicaiRefundCount 集采当日退款订单总量
     */
    public void setJicaiRefundCount(Integer jicaiRefundCount) {
        this.jicaiRefundCount = jicaiRefundCount;
    }

    /**
     * 集采当日投诉订单总量
     * @return jicai_complain_count 集采当日投诉订单总量
     */
    public Integer getJicaiComplainCount() {
        return jicaiComplainCount;
    }

    /**
     * 集采当日投诉订单总量
     * @param jicaiComplainCount 集采当日投诉订单总量
     */
    public void setJicaiComplainCount(Integer jicaiComplainCount) {
        this.jicaiComplainCount = jicaiComplainCount;
    }

    /**
     * 善源商场当日销售总额
     * @return syshop_order_amount 善源商场当日销售总额
     */
    public BigDecimal getSyshopOrderAmount() {
        return syshopOrderAmount;
    }

    /**
     * 善源商场当日销售总额
     * @param syshopOrderAmount 善源商场当日销售总额
     */
    public void setSyshopOrderAmount(BigDecimal syshopOrderAmount) {
        this.syshopOrderAmount = syshopOrderAmount;
    }

    /**
     * 善源商场当日订单总量
     * @return syshop_order_count 善源商场当日订单总量
     */
    public Integer getSyshopOrderCount() {
        return syshopOrderCount;
    }

    /**
     * 善源商场当日订单总量
     * @param syshopOrderCount 善源商场当日订单总量
     */
    public void setSyshopOrderCount(Integer syshopOrderCount) {
        this.syshopOrderCount = syshopOrderCount;
    }

    /**
     * 善源商场当日退款订单总量
     * @return syshop_refund_count 善源商场当日退款订单总量
     */
    public Integer getSyshopRefundCount() {
        return syshopRefundCount;
    }

    /**
     * 善源商场当日退款订单总量
     * @param syshopRefundCount 善源商场当日退款订单总量
     */
    public void setSyshopRefundCount(Integer syshopRefundCount) {
        this.syshopRefundCount = syshopRefundCount;
    }

    /**
     * 善源商场当日投诉订单总量
     * @return syshop_complain_count 善源商场当日投诉订单总量
     */
    public Integer getSyshopComplainCount() {
        return syshopComplainCount;
    }

    /**
     * 善源商场当日投诉订单总量
     * @param syshopComplainCount 善源商场当日投诉订单总量
     */
    public void setSyshopComplainCount(Integer syshopComplainCount) {
        this.syshopComplainCount = syshopComplainCount;
    }

    /**
     * 中行新增人数
     * @return increase_member_count 中行新增人数
     */
    public Integer getIncreaseMemberCount() {
        return increaseMemberCount;
    }

    /**
     * 中行新增人数
     * @param increaseMemberCount 中行新增人数
     */
    public void setIncreaseMemberCount(Integer increaseMemberCount) {
        this.increaseMemberCount = increaseMemberCount;
    }

    /**
     * 中行新增益客人数
     * @return increase_invite_member_count 中行新增益客人数
     */
    public Integer getIncreaseInviteMemberCount() {
        return increaseInviteMemberCount;
    }

    /**
     * 中行新增益客人数
     * @param increaseInviteMemberCount 中行新增益客人数
     */
    public void setIncreaseInviteMemberCount(Integer increaseInviteMemberCount) {
        this.increaseInviteMemberCount = increaseInviteMemberCount;
    }

    /**
     * 中行累计总人数
     * @return member_count 中行累计总人数
     */
    public Integer getMemberCount() {
        return memberCount;
    }

    /**
     * 中行累计总人数
     * @param memberCount 中行累计总人数
     */
    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    /**
     * 中行累计益客总人数
     * @return invite_member_count 中行累计益客总人数
     */
    public Integer getInviteMemberCount() {
        return inviteMemberCount;
    }

    /**
     * 中行累计益客总人数
     * @param inviteMemberCount 中行累计益客总人数
     */
    public void setInviteMemberCount(Integer inviteMemberCount) {
        this.inviteMemberCount = inviteMemberCount;
    }

    /**
     * 非中行新增人数
     * @return other_increase_member_count 非中行新增人数
     */
    public Integer getOtherIncreaseMemberCount() {
        return otherIncreaseMemberCount;
    }

    /**
     * 非中行新增人数
     * @param otherIncreaseMemberCount 非中行新增人数
     */
    public void setOtherIncreaseMemberCount(Integer otherIncreaseMemberCount) {
        this.otherIncreaseMemberCount = otherIncreaseMemberCount;
    }

    /**
     * 非中行新增益客人数
     * @return other_increase_invite_member_count 非中行新增益客人数
     */
    public Integer getOtherIncreaseInviteMemberCount() {
        return otherIncreaseInviteMemberCount;
    }

    /**
     * 非中行新增益客人数
     * @param otherIncreaseInviteMemberCount 非中行新增益客人数
     */
    public void setOtherIncreaseInviteMemberCount(Integer otherIncreaseInviteMemberCount) {
        this.otherIncreaseInviteMemberCount = otherIncreaseInviteMemberCount;
    }

    /**
     * 非中行累计总人数
     * @return other_member_count 非中行累计总人数
     */
    public Integer getOtherMemberCount() {
        return otherMemberCount;
    }

    /**
     * 非中行累计总人数
     * @param otherMemberCount 非中行累计总人数
     */
    public void setOtherMemberCount(Integer otherMemberCount) {
        this.otherMemberCount = otherMemberCount;
    }

    /**
     * 非中行累计益客总人数
     * @return other_invite_member_count 非中行累计益客总人数
     */
    public Integer getOtherInviteMemberCount() {
        return otherInviteMemberCount;
    }

    /**
     * 非中行累计益客总人数
     * @param otherInviteMemberCount 非中行累计益客总人数
     */
    public void setOtherInviteMemberCount(Integer otherInviteMemberCount) {
        this.otherInviteMemberCount = otherInviteMemberCount;
    }

    /**
     * 平台注册总人数
     * @return all_member_regist_count 平台注册总人数
     */
    public Integer getAllMemberRegistCount() {
        return allMemberRegistCount;
    }

    /**
     * 平台注册总人数
     * @param allMemberRegistCount 平台注册总人数
     */
    public void setAllMemberRegistCount(Integer allMemberRegistCount) {
        this.allMemberRegistCount = allMemberRegistCount;
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
     * 平台仅消费总人数
     * @return member_only_spending 平台仅消费总人数
     */
    public Integer getMemberOnlySpending() {
        return memberOnlySpending;
    }

    /**
     * 平台仅消费总人数
     * @param memberOnlySpending 平台仅消费总人数
     */
    public void setMemberOnlySpending(Integer memberOnlySpending) {
        this.memberOnlySpending = memberOnlySpending;
    }

    /**
     * 平台仅捐款总人数
     * @return member_only_donative 平台仅捐款总人数
     */
    public Integer getMemberOnlyDonative() {
        return memberOnlyDonative;
    }

    /**
     * 平台仅捐款总人数
     * @param memberOnlyDonative 平台仅捐款总人数
     */
    public void setMemberOnlyDonative(Integer memberOnlyDonative) {
        this.memberOnlyDonative = memberOnlyDonative;
    }

    /**
     * 平台消费同时捐款总人数
     * @return member_spending_and_donative 平台消费同时捐款总人数
     */
    public Integer getMemberSpendingAndDonative() {
        return memberSpendingAndDonative;
    }

    /**
     * 平台消费同时捐款总人数
     * @param memberSpendingAndDonative 平台消费同时捐款总人数
     */
    public void setMemberSpendingAndDonative(Integer memberSpendingAndDonative) {
        this.memberSpendingAndDonative = memberSpendingAndDonative;
    }

    /**
     * 平台有消费/捐款总人数
     * @return member_spending_or_donative 平台有消费/捐款总人数
     */
    public Integer getMemberSpendingOrDonative() {
        return memberSpendingOrDonative;
    }

    /**
     * 平台有消费/捐款总人数
     * @param memberSpendingOrDonative 平台有消费/捐款总人数
     */
    public void setMemberSpendingOrDonative(Integer memberSpendingOrDonative) {
        this.memberSpendingOrDonative = memberSpendingOrDonative;
    }

    /**
     * 平台未捐款、消费总人数
     * @return member_none 平台未捐款、消费总人数
     */
    public Integer getMemberNone() {
        return memberNone;
    }

    /**
     * 平台未捐款、消费总人数
     * @param memberNone 平台未捐款、消费总人数
     */
    public void setMemberNone(Integer memberNone) {
        this.memberNone = memberNone;
    }
}