package com.shanyuan.platform.ms.dao.stats.entity;

import java.math.BigDecimal;

/**
 * 描述:sy_agent_stats表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-11-13
 */
public class SyAgentStats {
    /**
     * 统计助理人数据id
     */
    private Integer recId;

    /**
     * 助理人id
     */
    private Integer memberId;

    /**
     * 助理人承担的目标帮扶金额单位元
     */
    private Integer targetMoney;

    /**
     * 已完成的帮扶金额单位元
     */
    private Integer finishedMoney;

    /**
     * 助理人上架产品数量
     */
    private Integer onlineGoodsCount;

    /**
     * 添加时间
     */
    private Integer addTime;

    /**
     * 退款率
     */
    private BigDecimal refundRate;

    /**
     * 投诉率
     */
    private BigDecimal complainRate;

    /**
     * 发货速度单位小时
     */
    private BigDecimal sendSpeed;

    /**
     * 描述相符均值
     */
    private BigDecimal avgDesccredit;

    /**
     * 描述相符差评率
     */
    private BigDecimal negEvalRate;

    /**
     * 服务态度均值
     */
    private BigDecimal avgServicecredit;

    /**
     * 物流服务均值
     */
    private BigDecimal avgDeliverycredit;

    /**
     * 渠道标识
     */
    private String channel;

    /**
     * 近期退款率
     */
    private BigDecimal latestRefundRate;

    /**
     * 近期投诉率
     */
    private BigDecimal latestComplainRate;

    /**
     * 发货速度单位小时
     */
    private BigDecimal latestSendSpeed;

    /**
     * 统计助理人数据id
     * @return rec_id 统计助理人数据id
     */
    public Integer getRecId() {
        return recId;
    }

    /**
     * 统计助理人数据id
     * @param recId 统计助理人数据id
     */
    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    /**
     * 助理人id
     * @return member_id 助理人id
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 助理人id
     * @param memberId 助理人id
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 助理人承担的目标帮扶金额单位元
     * @return target_money 助理人承担的目标帮扶金额单位元
     */
    public Integer getTargetMoney() {
        return targetMoney;
    }

    /**
     * 助理人承担的目标帮扶金额单位元
     * @param targetMoney 助理人承担的目标帮扶金额单位元
     */
    public void setTargetMoney(Integer targetMoney) {
        this.targetMoney = targetMoney;
    }

    /**
     * 已完成的帮扶金额单位元
     * @return finished_money 已完成的帮扶金额单位元
     */
    public Integer getFinishedMoney() {
        return finishedMoney;
    }

    /**
     * 已完成的帮扶金额单位元
     * @param finishedMoney 已完成的帮扶金额单位元
     */
    public void setFinishedMoney(Integer finishedMoney) {
        this.finishedMoney = finishedMoney;
    }

    /**
     * 助理人上架产品数量
     * @return online_goods_count 助理人上架产品数量
     */
    public Integer getOnlineGoodsCount() {
        return onlineGoodsCount;
    }

    /**
     * 助理人上架产品数量
     * @param onlineGoodsCount 助理人上架产品数量
     */
    public void setOnlineGoodsCount(Integer onlineGoodsCount) {
        this.onlineGoodsCount = onlineGoodsCount;
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
     * 退款率
     * @return refund_rate 退款率
     */
    public BigDecimal getRefundRate() {
        return refundRate;
    }

    /**
     * 退款率
     * @param refundRate 退款率
     */
    public void setRefundRate(BigDecimal refundRate) {
        this.refundRate = refundRate;
    }

    /**
     * 投诉率
     * @return complain_rate 投诉率
     */
    public BigDecimal getComplainRate() {
        return complainRate;
    }

    /**
     * 投诉率
     * @param complainRate 投诉率
     */
    public void setComplainRate(BigDecimal complainRate) {
        this.complainRate = complainRate;
    }

    /**
     * 发货速度单位小时
     * @return send_speed 发货速度单位小时
     */
    public BigDecimal getSendSpeed() {
        return sendSpeed;
    }

    /**
     * 发货速度单位小时
     * @param sendSpeed 发货速度单位小时
     */
    public void setSendSpeed(BigDecimal sendSpeed) {
        this.sendSpeed = sendSpeed;
    }

    /**
     * 描述相符均值
     * @return avg_desccredit 描述相符均值
     */
    public BigDecimal getAvgDesccredit() {
        return avgDesccredit;
    }

    /**
     * 描述相符均值
     * @param avgDesccredit 描述相符均值
     */
    public void setAvgDesccredit(BigDecimal avgDesccredit) {
        this.avgDesccredit = avgDesccredit;
    }

    /**
     * 描述相符差评率
     * @return neg_eval_rate 描述相符差评率
     */
    public BigDecimal getNegEvalRate() {
        return negEvalRate;
    }

    /**
     * 描述相符差评率
     * @param negEvalRate 描述相符差评率
     */
    public void setNegEvalRate(BigDecimal negEvalRate) {
        this.negEvalRate = negEvalRate;
    }

    /**
     * 服务态度均值
     * @return avg_servicecredit 服务态度均值
     */
    public BigDecimal getAvgServicecredit() {
        return avgServicecredit;
    }

    /**
     * 服务态度均值
     * @param avgServicecredit 服务态度均值
     */
    public void setAvgServicecredit(BigDecimal avgServicecredit) {
        this.avgServicecredit = avgServicecredit;
    }

    /**
     * 物流服务均值
     * @return avg_deliverycredit 物流服务均值
     */
    public BigDecimal getAvgDeliverycredit() {
        return avgDeliverycredit;
    }

    /**
     * 物流服务均值
     * @param avgDeliverycredit 物流服务均值
     */
    public void setAvgDeliverycredit(BigDecimal avgDeliverycredit) {
        this.avgDeliverycredit = avgDeliverycredit;
    }

    /**
     * 渠道标识
     * @return channel 渠道标识
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 渠道标识
     * @param channel 渠道标识
     */
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
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
     * 发货速度单位小时
     * @return latest_send_speed 发货速度单位小时
     */
    public BigDecimal getLatestSendSpeed() {
        return latestSendSpeed;
    }

    /**
     * 发货速度单位小时
     * @param latestSendSpeed 发货速度单位小时
     */
    public void setLatestSendSpeed(BigDecimal latestSendSpeed) {
        this.latestSendSpeed = latestSendSpeed;
    }
}