package com.shanyuan.platform.ms.dao.goods.entity;

/**
 * 描述:sy_org_activity表的实体类
 * @version
 * @author:  caoyongjun
 * @创建时间: 2017-11-10
 */
public class SyOrgActivity {
    /**
     * id
     */
    private Integer activityId;

    /**
     * 标题
     */
    private String activityTitle;

    /**
     * 项目类型,取值同goods_project_type,多个值之间用|分隔
     */
    private String activityType;

    /**
     * 活动横幅大图片
     */
    private String activityBanner;

    /**
     * 创建时间
     */
    private Integer activityAddtime;

    /**
     * 结束时间
     */
    private Integer activityEdittime;

    /**
     * 排序
     */
    private Integer activitySort;

    /**
     * 活动状态 0为关闭 1为开启
     */
    private Byte activityState;

    /**
     * 创建者会员id
     */
    private Integer activityOwnerId;

    /**
     * 所属上层专题id
     */
    private Integer parentActivityId;

    /**
     * 活动图片
     */
    private String activityImage;

    /**
     * 专题简介
     */
    private String activityIntro;

    /**
     * 专题页样式模板
     */
    private String activityTemplate;

    /**
     * 描述
     */
    private String activityDesc;

    /**
     * id
     * @return activity_id id
     */
    public Integer getActivityId() {
        return activityId;
    }

    /**
     * id
     * @param activityId id
     */
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    /**
     * 标题
     * @return activity_title 标题
     */
    public String getActivityTitle() {
        return activityTitle;
    }

    /**
     * 标题
     * @param activityTitle 标题
     */
    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle == null ? null : activityTitle.trim();
    }

    /**
     * 项目类型,取值同goods_project_type,多个值之间用|分隔
     * @return activity_type 项目类型,取值同goods_project_type,多个值之间用|分隔
     */
    public String getActivityType() {
        return activityType;
    }

    /**
     * 项目类型,取值同goods_project_type,多个值之间用|分隔
     * @param activityType 项目类型,取值同goods_project_type,多个值之间用|分隔
     */
    public void setActivityType(String activityType) {
        this.activityType = activityType == null ? null : activityType.trim();
    }

    /**
     * 活动横幅大图片
     * @return activity_banner 活动横幅大图片
     */
    public String getActivityBanner() {
        return activityBanner;
    }

    /**
     * 活动横幅大图片
     * @param activityBanner 活动横幅大图片
     */
    public void setActivityBanner(String activityBanner) {
        this.activityBanner = activityBanner == null ? null : activityBanner.trim();
    }

    /**
     * 创建时间
     * @return activity_addtime 创建时间
     */
    public Integer getActivityAddtime() {
        return activityAddtime;
    }

    /**
     * 创建时间
     * @param activityAddtime 创建时间
     */
    public void setActivityAddtime(Integer activityAddtime) {
        this.activityAddtime = activityAddtime;
    }

    /**
     * 结束时间
     * @return activity_edittime 结束时间
     */
    public Integer getActivityEdittime() {
        return activityEdittime;
    }

    /**
     * 结束时间
     * @param activityEdittime 结束时间
     */
    public void setActivityEdittime(Integer activityEdittime) {
        this.activityEdittime = activityEdittime;
    }

    /**
     * 排序
     * @return activity_sort 排序
     */
    public Integer getActivitySort() {
        return activitySort;
    }

    /**
     * 排序
     * @param activitySort 排序
     */
    public void setActivitySort(Integer activitySort) {
        this.activitySort = activitySort;
    }

    /**
     * 活动状态 0为关闭 1为开启
     * @return activity_state 活动状态 0为关闭 1为开启
     */
    public Byte getActivityState() {
        return activityState;
    }

    /**
     * 活动状态 0为关闭 1为开启
     * @param activityState 活动状态 0为关闭 1为开启
     */
    public void setActivityState(Byte activityState) {
        this.activityState = activityState;
    }

    /**
     * 创建者会员id
     * @return activity_owner_id 创建者会员id
     */
    public Integer getActivityOwnerId() {
        return activityOwnerId;
    }

    /**
     * 创建者会员id
     * @param activityOwnerId 创建者会员id
     */
    public void setActivityOwnerId(Integer activityOwnerId) {
        this.activityOwnerId = activityOwnerId;
    }

    /**
     * 所属上层专题id
     * @return parent_activity_id 所属上层专题id
     */
    public Integer getParentActivityId() {
        return parentActivityId;
    }

    /**
     * 所属上层专题id
     * @param parentActivityId 所属上层专题id
     */
    public void setParentActivityId(Integer parentActivityId) {
        this.parentActivityId = parentActivityId;
    }

    /**
     * 活动图片
     * @return activity_image 活动图片
     */
    public String getActivityImage() {
        return activityImage;
    }

    /**
     * 活动图片
     * @param activityImage 活动图片
     */
    public void setActivityImage(String activityImage) {
        this.activityImage = activityImage == null ? null : activityImage.trim();
    }

    /**
     * 专题简介
     * @return activity_intro 专题简介
     */
    public String getActivityIntro() {
        return activityIntro;
    }

    /**
     * 专题简介
     * @param activityIntro 专题简介
     */
    public void setActivityIntro(String activityIntro) {
        this.activityIntro = activityIntro == null ? null : activityIntro.trim();
    }

    /**
     * 专题页样式模板
     * @return activity_template 专题页样式模板
     */
    public String getActivityTemplate() {
        return activityTemplate;
    }

    /**
     * 专题页样式模板
     * @param activityTemplate 专题页样式模板
     */
    public void setActivityTemplate(String activityTemplate) {
        this.activityTemplate = activityTemplate == null ? null : activityTemplate.trim();
    }

    /**
     * 描述
     * @return activity_desc 描述
     */
    public String getActivityDesc() {
        return activityDesc;
    }

    /**
     * 描述
     * @param activityDesc 描述
     */
    public void setActivityDesc(String activityDesc) {
        this.activityDesc = activityDesc == null ? null : activityDesc.trim();
    }
}