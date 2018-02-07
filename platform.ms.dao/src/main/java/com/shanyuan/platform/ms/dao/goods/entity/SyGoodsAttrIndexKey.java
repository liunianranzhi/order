package com.shanyuan.platform.ms.dao.goods.entity;

public class SyGoodsAttrIndexKey {
    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 商品分类id
     */
    private Integer gcId;

    /**
     * 属性值id
     */
    private Integer attrValueId;

    /**
     * 商品id
     * @return goods_id 商品id
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * 商品id
     * @param goodsId 商品id
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 商品分类id
     * @return gc_id 商品分类id
     */
    public Integer getGcId() {
        return gcId;
    }

    /**
     * 商品分类id
     * @param gcId 商品分类id
     */
    public void setGcId(Integer gcId) {
        this.gcId = gcId;
    }

    /**
     * 属性值id
     * @return attr_value_id 属性值id
     */
    public Integer getAttrValueId() {
        return attrValueId;
    }

    /**
     * 属性值id
     * @param attrValueId 属性值id
     */
    public void setAttrValueId(Integer attrValueId) {
        this.attrValueId = attrValueId;
    }
}