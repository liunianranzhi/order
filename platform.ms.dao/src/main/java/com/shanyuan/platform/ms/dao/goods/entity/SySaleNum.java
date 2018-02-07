package com.shanyuan.platform.ms.dao.goods.entity;

/**
 * 描述:sy_salenum表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-10-20
 */
public class SySaleNum {
    /**
     * 销售日期
     */
    private Integer date;

    /**
     * 销量
     */
    private Integer salenum;

    /**
     * 商品ID
     */
    private Integer goodsId;

    /**
     * 店铺ID
     */
    private Integer storeId;

    /**
     * 销售日期
     * @return date 销售日期
     */
    public Integer getDate() {
        return date;
    }

    /**
     * 销售日期
     * @param date 销售日期
     */
    public void setDate(Integer date) {
        this.date = date;
    }

    /**
     * 销量
     * @return salenum 销量
     */
    public Integer getSalenum() {
        return salenum;
    }

    /**
     * 销量
     * @param salenum 销量
     */
    public void setSalenum(Integer salenum) {
        this.salenum = salenum;
    }

    /**
     * 商品ID
     * @return goods_id 商品ID
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * 商品ID
     * @param goodsId 商品ID
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 店铺ID
     * @return store_id 店铺ID
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * 店铺ID
     * @param storeId 店铺ID
     */
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }
}