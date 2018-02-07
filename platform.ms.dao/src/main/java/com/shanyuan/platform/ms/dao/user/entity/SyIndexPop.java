package com.shanyuan.platform.ms.dao.user.entity;

/**
 * 描述:sy_index_pop表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-11-16
 */
public class SyIndexPop {
    /**
     * 弹窗id
     */
    private Integer popId;

    /**
     * 图片地址
     */
    private String imgUrl;

    /**
     * 点击跳转地址
     */
    private String touchUrl;

    /**
     * 状态1：未发布，2：发布中，3：已下线
     */
    private Byte status;

    /**
     * 创建时间
     */
    private Integer createTime;

    /**
     * 下线时间
     */
    private Integer offlineTime;

    /**
     * 联盟渠道
     */
    private String channel;

    /**
     * 弹窗id
     * @return pop_id 弹窗id
     */
    public Integer getPopId() {
        return popId;
    }

    /**
     * 弹窗id
     * @param popId 弹窗id
     */
    public void setPopId(Integer popId) {
        this.popId = popId;
    }

    /**
     * 图片地址
     * @return img_url 图片地址
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * 图片地址
     * @param imgUrl 图片地址
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    /**
     * 点击跳转地址
     * @return touch_url 点击跳转地址
     */
    public String getTouchUrl() {
        return touchUrl;
    }

    /**
     * 点击跳转地址
     * @param touchUrl 点击跳转地址
     */
    public void setTouchUrl(String touchUrl) {
        this.touchUrl = touchUrl == null ? null : touchUrl.trim();
    }

    /**
     * 状态1：未发布，2：发布中，3：已下线
     * @return status 状态1：未发布，2：发布中，3：已下线
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 状态1：未发布，2：发布中，3：已下线
     * @param status 状态1：未发布，2：发布中，3：已下线
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * 下线时间
     * @return offline_time 下线时间
     */
    public Integer getOfflineTime() {
        return offlineTime;
    }

    /**
     * 下线时间
     * @param offlineTime 下线时间
     */
    public void setOfflineTime(Integer offlineTime) {
        this.offlineTime = offlineTime;
    }

    /**
     * 联盟渠道
     * @return channel 联盟渠道
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 联盟渠道
     * @param channel 联盟渠道
     */
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }
}