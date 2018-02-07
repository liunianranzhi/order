package com.shanyuan.platform.ms.dao.user.entity;

/**
 * 描述:sy_poor_supporter表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-11-13
 */
public class SyPoorSupporter {
    /**
     * 主键id
     */
    private Integer recId;

    /**
     * 贫困户id
     */
    private Integer poorId;

    /**
     * 帮扶人会员id
     */
    private Integer memberId;

    /**
     * 新发布的商品id,goods_common表主键
     */
    private String newGoodsCommonIds;

    /**
     * goods_id更新时间
     */
    private String updateTime;

    /**
     * 渠道标识
     */
    private String channel;

    /**
     * 主键id
     * @return rec_id 主键id
     */
    public Integer getRecId() {
        return recId;
    }

    /**
     * 主键id
     * @param recId 主键id
     */
    public void setRecId(Integer recId) {
        this.recId = recId;
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
     * 帮扶人会员id
     * @return member_id 帮扶人会员id
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 帮扶人会员id
     * @param memberId 帮扶人会员id
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 新发布的商品id,goods_common表主键
     * @return new_goods_common_ids 新发布的商品id,goods_common表主键
     */
    public String getNewGoodsCommonIds() {
        return newGoodsCommonIds;
    }

    /**
     * 新发布的商品id,goods_common表主键
     * @param newGoodsCommonIds 新发布的商品id,goods_common表主键
     */
    public void setNewGoodsCommonIds(String newGoodsCommonIds) {
        this.newGoodsCommonIds = newGoodsCommonIds == null ? null : newGoodsCommonIds.trim();
    }

    /**
     * goods_id更新时间
     * @return update_time goods_id更新时间
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * goods_id更新时间
     * @param updateTime goods_id更新时间
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
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