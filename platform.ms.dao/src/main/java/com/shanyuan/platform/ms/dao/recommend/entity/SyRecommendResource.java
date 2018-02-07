package com.shanyuan.platform.ms.dao.recommend.entity;

/**
 * 描述:sy_recommend_resource表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-10-31
 */
public class SyRecommendResource {
    /**
     * 资源id
     */
    private Integer resId;

    /**
     * 商品id(SKU)
     */
    private Integer goodsId;

    /**
     * 资源名称
     */
    private String resTitle;

    /**
     * 资源描述
     */
    private String resDesc;

    /**
     * 资源图片
     */
    private String resImage;

    /**
     * 推荐的时间
     */
    private Integer resAddtime;

    /**
     * 商品分类id
     */
    private Integer gcId;

    /**
     * 排序
     */
    private Byte resSort;

    /**
     * 资源id
     * @return res_id 资源id
     */
    public Integer getResId() {
        return resId;
    }

    /**
     * 资源id
     * @param resId 资源id
     */
    public void setResId(Integer resId) {
        this.resId = resId;
    }

    /**
     * 商品id(SKU)
     * @return goods_id 商品id(SKU)
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * 商品id(SKU)
     * @param goodsId 商品id(SKU)
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 资源名称
     * @return res_title 资源名称
     */
    public String getResTitle() {
        return resTitle;
    }

    /**
     * 资源名称
     * @param resTitle 资源名称
     */
    public void setResTitle(String resTitle) {
        this.resTitle = resTitle == null ? null : resTitle.trim();
    }

    /**
     * 资源描述
     * @return res_desc 资源描述
     */
    public String getResDesc() {
        return resDesc;
    }

    /**
     * 资源描述
     * @param resDesc 资源描述
     */
    public void setResDesc(String resDesc) {
        this.resDesc = resDesc == null ? null : resDesc.trim();
    }

    /**
     * 资源图片
     * @return res_image 资源图片
     */
    public String getResImage() {
        return resImage;
    }

    /**
     * 资源图片
     * @param resImage 资源图片
     */
    public void setResImage(String resImage) {
        this.resImage = resImage == null ? null : resImage.trim();
    }

    /**
     * 推荐的时间
     * @return res_addtime 推荐的时间
     */
    public Integer getResAddtime() {
        return resAddtime;
    }

    /**
     * 推荐的时间
     * @param resAddtime 推荐的时间
     */
    public void setResAddtime(Integer resAddtime) {
        this.resAddtime = resAddtime;
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
     * 排序
     * @return res_sort 排序
     */
    public Byte getResSort() {
        return resSort;
    }

    /**
     * 排序
     * @param resSort 排序
     */
    public void setResSort(Byte resSort) {
        this.resSort = resSort;
    }
}