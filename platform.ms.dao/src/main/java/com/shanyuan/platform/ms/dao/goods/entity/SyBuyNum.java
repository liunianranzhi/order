package com.shanyuan.platform.ms.dao.goods.entity;

/**
 * 描述:sy_buy_num表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-10-20
 */
public class SyBuyNum {
    /**
     * 主键
     */
    private Integer recId;

    /**
     * 买家会员id
     */
    private Integer buyerId;

    /**
     * 支持企业集采的店主会员id
     */
    private Integer goodsId;

    /**
     * 累计购买数量
     */
    private Integer num;

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
     * 买家会员id
     * @return buyer_id 买家会员id
     */
    public Integer getBuyerId() {
        return buyerId;
    }

    /**
     * 买家会员id
     * @param buyerId 买家会员id
     */
    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * 支持企业集采的店主会员id
     * @return goods_id 支持企业集采的店主会员id
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * 支持企业集采的店主会员id
     * @param goodsId 支持企业集采的店主会员id
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 累计购买数量
     * @return num 累计购买数量
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 累计购买数量
     * @param num 累计购买数量
     */
    public void setNum(Integer num) {
        this.num = num;
    }
}