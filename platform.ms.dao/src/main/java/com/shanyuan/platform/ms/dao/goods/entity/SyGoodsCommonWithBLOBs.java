package com.shanyuan.platform.ms.dao.goods.entity;

public class SyGoodsCommonWithBLOBs extends SyGoodsCommon {
    /**
     * 规格值
     */
    private String specValue;

    /**
     * 商品属性
     */
    private String goodsAttr;

    /**
     * 商品内容
     */
    private String goodsBody;

    /**
     * 规格名称序列化（下标为规格id）
     */
    private String goodsSpecname;

    /**
     * 众筹信息
     */
    private String cfInfo;

    /**
     * 指定地区购买id以,分隔
     */
    private String buyAreaId;

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

    /**
     * 商品内容
     * @return goods_body 商品内容
     */
    public String getGoodsBody() {
        return goodsBody;
    }

    /**
     * 商品内容
     * @param goodsBody 商品内容
     */
    public void setGoodsBody(String goodsBody) {
        this.goodsBody = goodsBody == null ? null : goodsBody.trim();
    }

    /**
     * 规格名称序列化（下标为规格id）
     * @return goods_specname 规格名称序列化（下标为规格id）
     */
    public String getGoodsSpecname() {
        return goodsSpecname;
    }

    /**
     * 规格名称序列化（下标为规格id）
     * @param goodsSpecname 规格名称序列化（下标为规格id）
     */
    public void setGoodsSpecname(String goodsSpecname) {
        this.goodsSpecname = goodsSpecname == null ? null : goodsSpecname.trim();
    }

    /**
     * 众筹信息
     * @return cf_info 众筹信息
     */
    public String getCfInfo() {
        return cfInfo;
    }

    /**
     * 众筹信息
     * @param cfInfo 众筹信息
     */
    public void setCfInfo(String cfInfo) {
        this.cfInfo = cfInfo == null ? null : cfInfo.trim();
    }

    /**
     * 指定地区购买id以,分隔
     * @return buy_area_id 指定地区购买id以,分隔
     */
    public String getBuyAreaId() {
        return buyAreaId;
    }

    /**
     * 指定地区购买id以,分隔
     * @param buyAreaId 指定地区购买id以,分隔
     */
    public void setBuyAreaId(String buyAreaId) {
        this.buyAreaId = buyAreaId == null ? null : buyAreaId.trim();
    }
}