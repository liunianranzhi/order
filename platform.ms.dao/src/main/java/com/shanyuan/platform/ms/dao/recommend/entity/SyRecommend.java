package com.shanyuan.platform.ms.dao.recommend.entity;

/**
 * 描述:sy_recommend表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-11-21
 */
public class SyRecommend {
    /**
     * 索引id
     */
    private Integer recId;

    /**
     * 模块id
     */
    private Integer moduleId;

    /**
     * 图片地址
     */
    private String imgUrl;

    /**
     * 推荐名称
     */
    private String recommendName;

    /**
     * 推荐描述
     */
    private String recommendDesc;

    /**
     * 推荐类型分别为商品（大爱超市），公益项目，文章，贫困户，助理人，志愿队活动，专题，志愿队，站外链接
     */
    private String type;

    /**
     * 推荐的项目id
     */
    private Integer itemId;

    /**
     * 状态：0：不可用，1：可用
     */
    private Byte status;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 创建时间
     */
    private Integer createTime;

    /**
     * 落地页面地址，与item_id互斥
     */
    private String touchUrl;

    /**
     * 适配联盟
     */
    private String channel;

    /**
     * 更新时间
     */
    private Integer updateTime;

    /**
     * 广告所属banner 1-6 AD1-AD6
     */
    private Byte bannerId;

    /**
     * 广告排期开始时间
     */
    private Integer startTime;

    /**
     * 广告排期结束时间
     */
    private Integer endTime;

    /**
     * 索引id
     * @return rec_id 索引id
     */
    public Integer getRecId() {
        return recId;
    }

    /**
     * 索引id
     * @param recId 索引id
     */
    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    /**
     * 模块id
     * @return module_id 模块id
     */
    public Integer getModuleId() {
        return moduleId;
    }

    /**
     * 模块id
     * @param moduleId 模块id
     */
    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * 图片地址
     * @return img_url 图片地址
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * 图片地址
     * @param imgUrl 图片地址
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    /**
     * 推荐名称
     * @return recommend_name 推荐名称
     */
    public String getRecommendName() {
        return recommendName;
    }

    /**
     * 推荐名称
     * @param recommendName 推荐名称
     */
    public void setRecommendName(String recommendName) {
        this.recommendName = recommendName == null ? null : recommendName.trim();
    }

    /**
     * 推荐描述
     * @return recommend_desc 推荐描述
     */
    public String getRecommendDesc() {
        return recommendDesc;
    }

    /**
     * 推荐描述
     * @param recommendDesc 推荐描述
     */
    public void setRecommendDesc(String recommendDesc) {
        this.recommendDesc = recommendDesc == null ? null : recommendDesc.trim();
    }

    /**
     * 推荐类型分别为商品（大爱超市），公益项目，文章，贫困户，助理人，志愿队活动，专题，志愿队，站外链接
     * @return type 推荐类型分别为商品（大爱超市），公益项目，文章，贫困户，助理人，志愿队活动，专题，志愿队，站外链接
     */
    public String getType() {
        return type;
    }

    /**
     * 推荐类型分别为商品（大爱超市），公益项目，文章，贫困户，助理人，志愿队活动，专题，志愿队，站外链接
     * @param type 推荐类型分别为商品（大爱超市），公益项目，文章，贫困户，助理人，志愿队活动，专题，志愿队，站外链接
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 推荐的项目id
     * @return item_id 推荐的项目id
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * 推荐的项目id
     * @param itemId 推荐的项目id
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * 状态：0：不可用，1：可用
     * @return status 状态：0：不可用，1：可用
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 状态：0：不可用，1：可用
     * @param status 状态：0：不可用，1：可用
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 排序
     * @return sort 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 排序
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * 落地页面地址，与item_id互斥
     * @return touch_url 落地页面地址，与item_id互斥
     */
    public String getTouchUrl() {
        return touchUrl;
    }

    /**
     * 落地页面地址，与item_id互斥
     * @param touchUrl 落地页面地址，与item_id互斥
     */
    public void setTouchUrl(String touchUrl) {
        this.touchUrl = touchUrl == null ? null : touchUrl.trim();
    }

    /**
     * 适配联盟
     * @return channel 适配联盟
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 适配联盟
     * @param channel 适配联盟
     */
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    /**
     * 更新时间
     * @return update_time 更新时间
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 广告所属banner 1-6 AD1-AD6
     * @return banner_id 广告所属banner 1-6 AD1-AD6
     */
    public Byte getBannerId() {
        return bannerId;
    }

    /**
     * 广告所属banner 1-6 AD1-AD6
     * @param bannerId 广告所属banner 1-6 AD1-AD6
     */
    public void setBannerId(Byte bannerId) {
        this.bannerId = bannerId;
    }

    /**
     * 广告排期开始时间
     * @return start_time 广告排期开始时间
     */
    public Integer getStartTime() {
        return startTime;
    }

    /**
     * 广告排期开始时间
     * @param startTime 广告排期开始时间
     */
    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    /**
     * 广告排期结束时间
     * @return end_time 广告排期结束时间
     */
    public Integer getEndTime() {
        return endTime;
    }

    /**
     * 广告排期结束时间
     * @param endTime 广告排期结束时间
     */
    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }
}