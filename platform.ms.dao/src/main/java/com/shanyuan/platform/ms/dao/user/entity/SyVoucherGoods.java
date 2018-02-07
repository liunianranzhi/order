package com.shanyuan.platform.ms.dao.user.entity;

/**
 * 描述:sy_voucher_goods表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-10-18
 */
public class SyVoucherGoods {
    /**
     * 主键ID
     */
    private Integer recId;

    /**
     * 活动ID
     */
    private Integer activityId;

    /**
     * 商品ID
     */
    private Integer goodsCommonid;

    /**
     * 主键ID
     * @return rec_id 主键ID
     */
    public Integer getRecId() {
        return recId;
    }

    /**
     * 主键ID
     * @param recId 主键ID
     */
    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    /**
     * 活动ID
     * @return activity_id 活动ID
     */
    public Integer getActivityId() {
        return activityId;
    }

    /**
     * 活动ID
     * @param activityId 活动ID
     */
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    /**
     * 商品ID
     * @return goods_commonid 商品ID
     */
    public Integer getGoodsCommonid() {
        return goodsCommonid;
    }

    /**
     * 商品ID
     * @param goodsCommonid 商品ID
     */
    public void setGoodsCommonid(Integer goodsCommonid) {
        this.goodsCommonid = goodsCommonid;
    }
}