package com.shanyuan.platform.ms.dao.goods.entity;

import java.util.Date;

/**
 * 描述:sy_biz_goods_class_manager表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-12-25
 */
public class BizGoodsClassManager {
    /**
     * 一级分类id
     */
    private Integer gcId;

    /**
     * 分类名称
     */
    private String gcName;

    /**
     * 推荐图片
     */
    private String classRecommendImage;

    /**
     * 落地链接
     */
    private String recommendImageTouchUrl;

    /**
     * 分类状态：0默认，1上线，2下线
     */
    private Byte classState;

    /**
     * 更新者
     */
    private String updateAuthor;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 一级分类id
     * @return gc_id 一级分类id
     */
    public Integer getGcId() {
        return gcId;
    }

    /**
     * 一级分类id
     * @param gcId 一级分类id
     */
    public void setGcId(Integer gcId) {
        this.gcId = gcId;
    }

    /**
     * 分类名称
     * @return gc_name 分类名称
     */
    public String getGcName() {
        return gcName;
    }

    /**
     * 分类名称
     * @param gcName 分类名称
     */
    public void setGcName(String gcName) {
        this.gcName = gcName == null ? null : gcName.trim();
    }

    /**
     * 推荐图片
     * @return class_recommend_image 推荐图片
     */
    public String getClassRecommendImage() {
        return classRecommendImage;
    }

    /**
     * 推荐图片
     * @param classRecommendImage 推荐图片
     */
    public void setClassRecommendImage(String classRecommendImage) {
        this.classRecommendImage = classRecommendImage == null ? null : classRecommendImage.trim();
    }

    /**
     * 落地链接
     * @return recommend_image_touch_url 落地链接
     */
    public String getRecommendImageTouchUrl() {
        return recommendImageTouchUrl;
    }

    /**
     * 落地链接
     * @param recommendImageTouchUrl 落地链接
     */
    public void setRecommendImageTouchUrl(String recommendImageTouchUrl) {
        this.recommendImageTouchUrl = recommendImageTouchUrl == null ? null : recommendImageTouchUrl.trim();
    }

    /**
     * 分类状态：0默认，1上线，2下线
     * @return class_state 分类状态：0默认，1上线，2下线
     */
    public Byte getClassState() {
        return classState;
    }

    /**
     * 分类状态：0默认，1上线，2下线
     * @param classState 分类状态：0默认，1上线，2下线
     */
    public void setClassState(Byte classState) {
        this.classState = classState;
    }

    /**
     * 更新者
     * @return update_author 更新者
     */
    public String getUpdateAuthor() {
        return updateAuthor;
    }

    /**
     * 更新者
     * @param updateAuthor 更新者
     */
    public void setUpdateAuthor(String updateAuthor) {
        this.updateAuthor = updateAuthor == null ? null : updateAuthor.trim();
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     * @return update_time 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}