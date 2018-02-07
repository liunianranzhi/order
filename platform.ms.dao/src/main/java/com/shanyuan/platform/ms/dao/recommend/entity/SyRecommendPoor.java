package com.shanyuan.platform.ms.dao.recommend.entity;

/**
 * 描述:sy_recommend_poor表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-10-31
 */
public class SyRecommendPoor {
    /**
     * 主键id
     */
    private Integer recommendPid;

    /**
     * 贫困户id
     */
    private Integer poorMid;

    /**
     * 贫困户姓名
     */
    private String poorName;

    /**
     * 推荐时间
     */
    private Integer recommendTime;

    /**
     * 渠道标识
     */
    private String channel;

    /**
     * 主键id
     * @return recommend_pid 主键id
     */
    public Integer getRecommendPid() {
        return recommendPid;
    }

    /**
     * 主键id
     * @param recommendPid 主键id
     */
    public void setRecommendPid(Integer recommendPid) {
        this.recommendPid = recommendPid;
    }

    /**
     * 贫困户id
     * @return poor_mid 贫困户id
     */
    public Integer getPoorMid() {
        return poorMid;
    }

    /**
     * 贫困户id
     * @param poorMid 贫困户id
     */
    public void setPoorMid(Integer poorMid) {
        this.poorMid = poorMid;
    }

    /**
     * 贫困户姓名
     * @return poor_name 贫困户姓名
     */
    public String getPoorName() {
        return poorName;
    }

    /**
     * 贫困户姓名
     * @param poorName 贫困户姓名
     */
    public void setPoorName(String poorName) {
        this.poorName = poorName == null ? null : poorName.trim();
    }

    /**
     * 推荐时间
     * @return recommend_time 推荐时间
     */
    public Integer getRecommendTime() {
        return recommendTime;
    }

    /**
     * 推荐时间
     * @param recommendTime 推荐时间
     */
    public void setRecommendTime(Integer recommendTime) {
        this.recommendTime = recommendTime;
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
}