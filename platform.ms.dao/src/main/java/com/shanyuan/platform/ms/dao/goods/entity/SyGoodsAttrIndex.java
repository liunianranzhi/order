package com.shanyuan.platform.ms.dao.goods.entity;

/**
 * 描述:sy_goods_attr_index表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-10-16
 */
public class SyGoodsAttrIndex extends SyGoodsAttrIndexKey {
    /**
     * 商品公共表id
     */
    private Integer goodsCommonid;

    /**
     * 类型id
     */
    private Integer typeId;

    /**
     * 属性id
     */
    private Integer attrId;

    /**
     * 商品公共表id
     * @return goods_commonid 商品公共表id
     */
    public Integer getGoodsCommonid() {
        return goodsCommonid;
    }

    /**
     * 商品公共表id
     * @param goodsCommonid 商品公共表id
     */
    public void setGoodsCommonid(Integer goodsCommonid) {
        this.goodsCommonid = goodsCommonid;
    }

    /**
     * 类型id
     * @return type_id 类型id
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * 类型id
     * @param typeId 类型id
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * 属性id
     * @return attr_id 属性id
     */
    public Integer getAttrId() {
        return attrId;
    }

    /**
     * 属性id
     * @param attrId 属性id
     */
    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }
}