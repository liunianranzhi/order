package com.shanyuan.platform.ms.dao.project.entity;

import java.math.BigDecimal;

/**
 * 描述:sy_project表的实体类
 * @version
 * @author:  caoyongjun
 * @创建时间: 2017-10-18
 */
public class SyProject {
    /**
     * 项目id
     */
    private Integer projId;

    /**
     * 项目名称
     */
    private String projTitle;

    /**
     * 项目介绍
     */
    private String projIntro;

    /**
     * 项目链接
     */
    private String projUrl;

    /**
     * 项目默认图片
     */
    private String projImage;

    /**
     * 赞助企业
     */
    private String projSponsor;

    /**
     * 赞助企业介绍
     */
    private String projSponsorIntro;

    /**
     * 专题id
     */
    private Integer activityId;

    /**
     * 目标善元
     */
    private Integer targetSyb;

    /**
     * 项目类型，含义同goods_project_type
     */
    private String projType;

    /**
     * 发布者id
     */
    private Integer projOwnerId;

    /**
     * 受助者id
     */
    private Integer bfId;

    /**
     * 项目状态 10已发布|20待审核|30有效（审核通过）|40已结束
     */
    private Byte projState;

    /**
     * 项目创建时间
     */
    private Integer addTime;

    /**
     * 资助类型（1捐物|2捐款|3义工|4善元）
     */
    private String donationType;

    /**
     * 排序
     */
    private Integer projSort;

    /**
     * 审核结果备注
     */
    private String auditComment;

    /**
     * 认证机构id
     */
    private Integer projAuditorId;

    /**
     * 赞助方图片
     */
    private String projSponsorImage;

    /**
     * 受助方名称
     */
    private String projBfName;

    /**
     * 受助方图片
     */
    private String projBfImage;

    /**
     * 商品单价
     */
    private BigDecimal goodsPrice;

    /**
     * 计量单位
     */
    private String unit;

    /**
     * 项目描述
     */
    private String projDesc;
    
    private Integer storeId;
    private String storeName;

    /**
     * 项目id
     * @return proj_id 项目id
     */
    public Integer getProjId() {
        return projId;
    }

    /**
     * 项目id
     * @param projId 项目id
     */
    public void setProjId(Integer projId) {
        this.projId = projId;
    }

    /**
     * 项目名称
     * @return proj_title 项目名称
     */
    public String getProjTitle() {
        return projTitle;
    }

    /**
     * 项目名称
     * @param projTitle 项目名称
     */
    public void setProjTitle(String projTitle) {
        this.projTitle = projTitle == null ? null : projTitle.trim();
    }

    /**
     * 项目介绍
     * @return proj_intro 项目介绍
     */
    public String getProjIntro() {
        return projIntro;
    }

    /**
     * 项目介绍
     * @param projIntro 项目介绍
     */
    public void setProjIntro(String projIntro) {
        this.projIntro = projIntro == null ? null : projIntro.trim();
    }

    /**
     * 项目链接
     * @return proj_url 项目链接
     */
    public String getProjUrl() {
        return projUrl;
    }

    /**
     * 项目链接
     * @param projUrl 项目链接
     */
    public void setProjUrl(String projUrl) {
        this.projUrl = projUrl == null ? null : projUrl.trim();
    }

    /**
     * 项目默认图片
     * @return proj_image 项目默认图片
     */
    public String getProjImage() {
        return projImage;
    }

    /**
     * 项目默认图片
     * @param projImage 项目默认图片
     */
    public void setProjImage(String projImage) {
        this.projImage = projImage == null ? null : projImage.trim();
    }

    /**
     * 赞助企业
     * @return proj_sponsor 赞助企业
     */
    public String getProjSponsor() {
        return projSponsor;
    }

    /**
     * 赞助企业
     * @param projSponsor 赞助企业
     */
    public void setProjSponsor(String projSponsor) {
        this.projSponsor = projSponsor == null ? null : projSponsor.trim();
    }

    /**
     * 赞助企业介绍
     * @return proj_sponsor_intro 赞助企业介绍
     */
    public String getProjSponsorIntro() {
        return projSponsorIntro;
    }

    /**
     * 赞助企业介绍
     * @param projSponsorIntro 赞助企业介绍
     */
    public void setProjSponsorIntro(String projSponsorIntro) {
        this.projSponsorIntro = projSponsorIntro == null ? null : projSponsorIntro.trim();
    }

    /**
     * 专题id
     * @return activity_id 专题id
     */
    public Integer getActivityId() {
        return activityId;
    }

    /**
     * 专题id
     * @param activityId 专题id
     */
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    /**
     * 目标善元
     * @return target_syb 目标善元
     */
    public Integer getTargetSyb() {
        return targetSyb;
    }

    /**
     * 目标善元
     * @param targetSyb 目标善元
     */
    public void setTargetSyb(Integer targetSyb) {
        this.targetSyb = targetSyb;
    }

    /**
     * 项目类型，含义同goods_project_type
     * @return proj_type 项目类型，含义同goods_project_type
     */
    public String getProjType() {
        return projType;
    }

    /**
     * 项目类型，含义同goods_project_type
     * @param projType 项目类型，含义同goods_project_type
     */
    public void setProjType(String projType) {
        this.projType = projType == null ? null : projType.trim();
    }

    /**
     * 发布者id
     * @return proj_owner_id 发布者id
     */
    public Integer getProjOwnerId() {
        return projOwnerId;
    }

    /**
     * 发布者id
     * @param projOwnerId 发布者id
     */
    public void setProjOwnerId(Integer projOwnerId) {
        this.projOwnerId = projOwnerId;
    }

    /**
     * 受助者id
     * @return bf_id 受助者id
     */
    public Integer getBfId() {
        return bfId;
    }

    /**
     * 受助者id
     * @param bfId 受助者id
     */
    public void setBfId(Integer bfId) {
        this.bfId = bfId;
    }

    /**
     * 项目状态 10已发布|20待审核|30有效（审核通过）|40已结束
     * @return proj_state 项目状态 10已发布|20待审核|30有效（审核通过）|40已结束
     */
    public Byte getProjState() {
        return projState;
    }

    /**
     * 项目状态 10已发布|20待审核|30有效（审核通过）|40已结束
     * @param projState 项目状态 10已发布|20待审核|30有效（审核通过）|40已结束
     */
    public void setProjState(Byte projState) {
        this.projState = projState;
    }

    /**
     * 项目创建时间
     * @return add_time 项目创建时间
     */
    public Integer getAddTime() {
        return addTime;
    }

    /**
     * 项目创建时间
     * @param addTime 项目创建时间
     */
    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    /**
     * 资助类型（1捐物|2捐款|3义工|4善元）
     * @return donation_type 资助类型（1捐物|2捐款|3义工|4善元）
     */
    public String getDonationType() {
        return donationType;
    }

    /**
     * 资助类型（1捐物|2捐款|3义工|4善元）
     * @param donationType 资助类型（1捐物|2捐款|3义工|4善元）
     */
    public void setDonationType(String donationType) {
        this.donationType = donationType == null ? null : donationType.trim();
    }

    /**
     * 排序
     * @return proj_sort 排序
     */
    public Integer getProjSort() {
        return projSort;
    }

    /**
     * 排序
     * @param projSort 排序
     */
    public void setProjSort(Integer projSort) {
        this.projSort = projSort;
    }

    /**
     * 审核结果备注
     * @return audit_comment 审核结果备注
     */
    public String getAuditComment() {
        return auditComment;
    }

    /**
     * 审核结果备注
     * @param auditComment 审核结果备注
     */
    public void setAuditComment(String auditComment) {
        this.auditComment = auditComment == null ? null : auditComment.trim();
    }

    /**
     * 认证机构id
     * @return proj_auditor_id 认证机构id
     */
    public Integer getProjAuditorId() {
        return projAuditorId;
    }

    /**
     * 认证机构id
     * @param projAuditorId 认证机构id
     */
    public void setProjAuditorId(Integer projAuditorId) {
        this.projAuditorId = projAuditorId;
    }

    /**
     * 赞助方图片
     * @return proj_sponsor_image 赞助方图片
     */
    public String getProjSponsorImage() {
        return projSponsorImage;
    }

    /**
     * 赞助方图片
     * @param projSponsorImage 赞助方图片
     */
    public void setProjSponsorImage(String projSponsorImage) {
        this.projSponsorImage = projSponsorImage == null ? null : projSponsorImage.trim();
    }

    /**
     * 受助方名称
     * @return proj_bf_name 受助方名称
     */
    public String getProjBfName() {
        return projBfName;
    }

    /**
     * 受助方名称
     * @param projBfName 受助方名称
     */
    public void setProjBfName(String projBfName) {
        this.projBfName = projBfName == null ? null : projBfName.trim();
    }

    /**
     * 受助方图片
     * @return proj_bf_image 受助方图片
     */
    public String getProjBfImage() {
        return projBfImage;
    }

    /**
     * 受助方图片
     * @param projBfImage 受助方图片
     */
    public void setProjBfImage(String projBfImage) {
        this.projBfImage = projBfImage == null ? null : projBfImage.trim();
    }

    /**
     * 商品单价
     * @return goods_price 商品单价
     */
    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    /**
     * 商品单价
     * @param goodsPrice 商品单价
     */
    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    /**
     * 计量单位
     * @return unit 计量单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 计量单位
     * @param unit 计量单位
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * 项目描述
     * @return proj_desc 项目描述
     */
    public String getProjDesc() {
        return projDesc;
    }

    /**
     * 项目描述
     * @param projDesc 项目描述
     */
    public void setProjDesc(String projDesc) {
        this.projDesc = projDesc == null ? null : projDesc.trim();
    }

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
    
    
}