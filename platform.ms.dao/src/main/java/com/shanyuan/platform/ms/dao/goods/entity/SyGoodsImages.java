package com.shanyuan.platform.ms.dao.goods.entity;

/**
 * 描述:sy_goods_images表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-10-16
 */
public class SyGoodsImages {
    /**
     * 商品图片id
     */
    private Integer goodsImageId;

    /**
     * 商品公共内容id
     */
    private Integer goodsCommonid;

    /**
     * 店铺id
     */
    private Integer storeId;

    /**
     * 颜色规格值id
     */
    private Integer colorId;

    /**
     * 商品图片
     */
    private String goodsImage;

    /**
     * 排序
     */
    private Byte goodsImageSort;

    /**
     * 默认主题，1是，0否
     */
    private Byte isDefault;

    /**
     * 商品图片id
     * @return goods_image_id 商品图片id
     */
    public Integer getGoodsImageId() {
        return goodsImageId;
    }

    /**
     * 商品图片id
     * @param goodsImageId 商品图片id
     */
    public void setGoodsImageId(Integer goodsImageId) {
        this.goodsImageId = goodsImageId;
    }

    /**
     * 商品公共内容id
     * @return goods_commonid 商品公共内容id
     */
    public Integer getGoodsCommonid() {
        return goodsCommonid;
    }

    /**
     * 商品公共内容id
     * @param goodsCommonid 商品公共内容id
     */
    public void setGoodsCommonid(Integer goodsCommonid) {
        this.goodsCommonid = goodsCommonid;
    }

    /**
     * 店铺id
     * @return store_id 店铺id
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * 店铺id
     * @param storeId 店铺id
     */
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    /**
     * 颜色规格值id
     * @return color_id 颜色规格值id
     */
    public Integer getColorId() {
        return colorId;
    }

    /**
     * 颜色规格值id
     * @param colorId 颜色规格值id
     */
    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    /**
     * 商品图片
     * @return goods_image 商品图片
     */
    public String getGoodsImage() {
        return goodsImage;
    }

    /**
     * 商品图片
     * @param goodsImage 商品图片
     */
    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage == null ? null : goodsImage.trim();
    }

    /**
     * 排序
     * @return goods_image_sort 排序
     */
    public Byte getGoodsImageSort() {
        return goodsImageSort;
    }

    /**
     * 排序
     * @param goodsImageSort 排序
     */
    public void setGoodsImageSort(Byte goodsImageSort) {
        this.goodsImageSort = goodsImageSort;
    }

    /**
     * 默认主题，1是，0否
     * @return is_default 默认主题，1是，0否
     */
    public Byte getIsDefault() {
        return isDefault;
    }

    /**
     * 默认主题，1是，0否
     * @param isDefault 默认主题，1是，0否
     */
    public void setIsDefault(Byte isDefault) {
        this.isDefault = isDefault;
    }
}