package com.shanyuan.platform.ms.dao.order.entity;

public class SyOrderCommonWithBLOBs extends SyOrderCommon {
    /**
     * 发货备注
     */
    private String deliverExplain;

    /**
     * 规格值
     */
    private String specValue;

    /**
     * 商品属性
     */
    private String goodsAttr;

    /**
     * 发货备注
     * @return deliver_explain 发货备注
     */
    public String getDeliverExplain() {
        return deliverExplain;
    }

    /**
     * 发货备注
     * @param deliverExplain 发货备注
     */
    public void setDeliverExplain(String deliverExplain) {
        this.deliverExplain = deliverExplain == null ? null : deliverExplain.trim();
    }

    /**
     * 规格值
     * @return spec_value 规格值
     */
    public String getSpecValue() {
        return specValue;
    }

    /**
     * 规格值
     * @param specValue 规格值
     */
    public void setSpecValue(String specValue) {
        this.specValue = specValue == null ? null : specValue.trim();
    }

    /**
     * 商品属性
     * @return goods_attr 商品属性
     */
    public String getGoodsAttr() {
        return goodsAttr;
    }

    /**
     * 商品属性
     * @param goodsAttr 商品属性
     */
    public void setGoodsAttr(String goodsAttr) {
        this.goodsAttr = goodsAttr == null ? null : goodsAttr.trim();
    }
}