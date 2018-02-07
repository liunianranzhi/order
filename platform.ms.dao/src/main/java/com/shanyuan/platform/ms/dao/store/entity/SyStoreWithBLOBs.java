package com.shanyuan.platform.ms.dao.store.entity;

public class SyStoreWithBLOBs extends SyStore {
    /**
     * 店铺简介
     */
    private String description;

    /**
     * 主营商品
     */
    private String storeZy;

    /**
     * 店铺幻灯片
     */
    private String storeSlide;

    /**
     * 店铺幻灯片链接
     */
    private String storeSlideUrl;

    /**
     * 售前客服
     */
    private String storePresales;

    /**
     * 售后客服
     */
    private String storeAftersales;

    /**
     * 店铺简介
     * @return description 店铺简介
     */
    public String getDescription() {
        return description;
    }

    /**
     * 店铺简介
     * @param description 店铺简介
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 主营商品
     * @return store_zy 主营商品
     */
    public String getStoreZy() {
        return storeZy;
    }

    /**
     * 主营商品
     * @param storeZy 主营商品
     */
    public void setStoreZy(String storeZy) {
        this.storeZy = storeZy == null ? null : storeZy.trim();
    }

    /**
     * 店铺幻灯片
     * @return store_slide 店铺幻灯片
     */
    public String getStoreSlide() {
        return storeSlide;
    }

    /**
     * 店铺幻灯片
     * @param storeSlide 店铺幻灯片
     */
    public void setStoreSlide(String storeSlide) {
        this.storeSlide = storeSlide == null ? null : storeSlide.trim();
    }

    /**
     * 店铺幻灯片链接
     * @return store_slide_url 店铺幻灯片链接
     */
    public String getStoreSlideUrl() {
        return storeSlideUrl;
    }

    /**
     * 店铺幻灯片链接
     * @param storeSlideUrl 店铺幻灯片链接
     */
    public void setStoreSlideUrl(String storeSlideUrl) {
        this.storeSlideUrl = storeSlideUrl == null ? null : storeSlideUrl.trim();
    }

    /**
     * 售前客服
     * @return store_presales 售前客服
     */
    public String getStorePresales() {
        return storePresales;
    }

    /**
     * 售前客服
     * @param storePresales 售前客服
     */
    public void setStorePresales(String storePresales) {
        this.storePresales = storePresales == null ? null : storePresales.trim();
    }

    /**
     * 售后客服
     * @return store_aftersales 售后客服
     */
    public String getStoreAftersales() {
        return storeAftersales;
    }

    /**
     * 售后客服
     * @param storeAftersales 售后客服
     */
    public void setStoreAftersales(String storeAftersales) {
        this.storeAftersales = storeAftersales == null ? null : storeAftersales.trim();
    }
}