package com.shanyuan.platform.ms.dao.goods.entity;

/**
 * 描述:sy_goods_delay_message表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-11-07
 */
public class SyGoodsDelayMessage {
    /**
     * 主键
     */
    private Integer delayId;

    /**
     * goods_common表id
     */
    private Integer goodsCommonid;

    /**
     * 发布者id
     */
    private Integer publisherId;

    /**
     * 延迟发货原因
     */
    private String delayReason;

    /**
     * 延迟发货时间
     */
    private Integer delayTime;

    /**
     * 添加时间
     */
    private Integer addtime;

    /**
     * 最近的修改时间
     */
    private Integer latestTime;

    /**
     * 通知的状态：1发布，2取消
     */
    private Byte delayState;

    /**
     * 主键
     * @return delay_id 主键
     */
    public Integer getDelayId() {
        return delayId;
    }

    /**
     * 主键
     * @param delayId 主键
     */
    public void setDelayId(Integer delayId) {
        this.delayId = delayId;
    }

    /**
     * goods_common表id
     * @return goods_commonid goods_common表id
     */
    public Integer getGoodsCommonid() {
        return goodsCommonid;
    }

    /**
     * goods_common表id
     * @param goodsCommonid goods_common表id
     */
    public void setGoodsCommonid(Integer goodsCommonid) {
        this.goodsCommonid = goodsCommonid;
    }

    /**
     * 发布者id
     * @return publisher_id 发布者id
     */
    public Integer getPublisherId() {
        return publisherId;
    }

    /**
     * 发布者id
     * @param publisherId 发布者id
     */
    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    /**
     * 延迟发货原因
     * @return delay_reason 延迟发货原因
     */
    public String getDelayReason() {
        return delayReason;
    }

    /**
     * 延迟发货原因
     * @param delayReason 延迟发货原因
     */
    public void setDelayReason(String delayReason) {
        this.delayReason = delayReason == null ? null : delayReason.trim();
    }

    /**
     * 延迟发货时间
     * @return delay_time 延迟发货时间
     */
    public Integer getDelayTime() {
        return delayTime;
    }

    /**
     * 延迟发货时间
     * @param delayTime 延迟发货时间
     */
    public void setDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
    }

    /**
     * 添加时间
     * @return addtime 添加时间
     */
    public Integer getAddtime() {
        return addtime;
    }

    /**
     * 添加时间
     * @param addtime 添加时间
     */
    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    /**
     * 最近的修改时间
     * @return latest_time 最近的修改时间
     */
    public Integer getLatestTime() {
        return latestTime;
    }

    /**
     * 最近的修改时间
     * @param latestTime 最近的修改时间
     */
    public void setLatestTime(Integer latestTime) {
        this.latestTime = latestTime;
    }

    /**
     * 通知的状态：1发布，2取消
     * @return delay_state 通知的状态：1发布，2取消
     */
    public Byte getDelayState() {
        return delayState;
    }

    /**
     * 通知的状态：1发布，2取消
     * @param delayState 通知的状态：1发布，2取消
     */
    public void setDelayState(Byte delayState) {
        this.delayState = delayState;
    }
}