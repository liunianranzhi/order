package com.shanyuan.platform.ms.dao.user.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 描述:sy_glory_type_list表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-10-18
 */
@ApiModel(value="glory对象",description="勋章对象")
public class SyGloryTypeList {
    /**
     * 主键
     */
    private Integer gloryId;

    /**
     * 勋章名称
     */
    @ApiModelProperty(value="勋章名称",required=true)
    private String gloryName;

    /**
     * 
     */
    @ApiModelProperty(value="勋章编号",required=true)
    private String gloryCode;

    /**
     * 勋章显示顺序
     */
    @ApiModelProperty(value="勋章显示顺序",required=true)
    private Integer gloryShowIndex;

    /**
     * 点亮图片
     */
    @ApiModelProperty(value="勋章点亮图片",required=true)
    private String gloryShowImgHilighted;

    /**
     * 灰色尚未点亮图片
     */
    @ApiModelProperty(value="勋章原图片",required=true)
    private String gloryShowImgGary;

    /**
     * 
     */
    @ApiModelProperty(value="勋章描述",required=true)
    private String gloryDescription;

    /**
     * 可见范围（默认全部可见)
     */
    private String channelRange;

    /**
     * 用户状态范围（默认全部可见)
     */
    private String custTypeRange;

    /**
     * 其他条件
     */
    private String extraCondition1;

    /**
     * 其他条件
     */
    private String extraCondition2;

    /**
     * 勋章上线状态，0:未上线1:上线中
     */
    @ApiModelProperty(value="勋章上线状态：0-未上线，1-上线中",required=true)
    private Integer onlineState;

    /**
     * 主键
     * @return glory_id 主键
     */
    public Integer getGloryId() {
        return gloryId;
    }

    /**
     * 主键
     * @param gloryId 主键
     */
    public void setGloryId(Integer gloryId) {
        this.gloryId = gloryId;
    }

    /**
     * 勋章名称
     * @return glory_name 勋章名称
     */
    public String getGloryName() {
        return gloryName;
    }

    /**
     * 勋章名称
     * @param gloryName 勋章名称
     */
    public void setGloryName(String gloryName) {
        this.gloryName = gloryName == null ? null : gloryName.trim();
    }

    /**
     * 
     * @return glory_code 
     */
    public String getGloryCode() {
        return gloryCode;
    }

    /**
     * 
     * @param gloryCode 
     */
    public void setGloryCode(String gloryCode) {
        this.gloryCode = gloryCode == null ? null : gloryCode.trim();
    }

    /**
     * 勋章显示顺序
     * @return glory_show_index 勋章显示顺序
     */
    public Integer getGloryShowIndex() {
        return gloryShowIndex;
    }

    /**
     * 勋章显示顺序
     * @param gloryShowIndex 勋章显示顺序
     */
    public void setGloryShowIndex(Integer gloryShowIndex) {
        this.gloryShowIndex = gloryShowIndex;
    }

    /**
     * 点亮图片
     * @return glory_show_img_hilighted 点亮图片
     */
    public String getGloryShowImgHilighted() {
        return gloryShowImgHilighted;
    }

    /**
     * 点亮图片
     * @param gloryShowImgHilighted 点亮图片
     */
    public void setGloryShowImgHilighted(String gloryShowImgHilighted) {
        this.gloryShowImgHilighted = gloryShowImgHilighted == null ? null : gloryShowImgHilighted.trim();
    }

    /**
     * 灰色尚未点亮图片
     * @return glory_show_img_gary 灰色尚未点亮图片
     */
    public String getGloryShowImgGary() {
        return gloryShowImgGary;
    }

    /**
     * 灰色尚未点亮图片
     * @param gloryShowImgGary 灰色尚未点亮图片
     */
    public void setGloryShowImgGary(String gloryShowImgGary) {
        this.gloryShowImgGary = gloryShowImgGary == null ? null : gloryShowImgGary.trim();
    }

    /**
     * 
     * @return glory_description 
     */
    public String getGloryDescription() {
        return gloryDescription;
    }

    /**
     * 
     * @param gloryDescription 
     */
    public void setGloryDescription(String gloryDescription) {
        this.gloryDescription = gloryDescription == null ? null : gloryDescription.trim();
    }

    /**
     * 可见范围（默认全部可见)
     * @return channel_range 可见范围（默认全部可见)
     */
    public String getChannelRange() {
        return channelRange;
    }

    /**
     * 可见范围（默认全部可见)
     * @param channelRange 可见范围（默认全部可见)
     */
    public void setChannelRange(String channelRange) {
        this.channelRange = channelRange == null ? null : channelRange.trim();
    }

    /**
     * 用户状态范围（默认全部可见)
     * @return cust_type_range 用户状态范围（默认全部可见)
     */
    public String getCustTypeRange() {
        return custTypeRange;
    }

    /**
     * 用户状态范围（默认全部可见)
     * @param custTypeRange 用户状态范围（默认全部可见)
     */
    public void setCustTypeRange(String custTypeRange) {
        this.custTypeRange = custTypeRange == null ? null : custTypeRange.trim();
    }

    /**
     * 其他条件
     * @return extra_condition1 其他条件
     */
    public String getExtraCondition1() {
        return extraCondition1;
    }

    /**
     * 其他条件
     * @param extraCondition1 其他条件
     */
    public void setExtraCondition1(String extraCondition1) {
        this.extraCondition1 = extraCondition1 == null ? null : extraCondition1.trim();
    }

    /**
     * 其他条件
     * @return extra_condition2 其他条件
     */
    public String getExtraCondition2() {
        return extraCondition2;
    }

    /**
     * 其他条件
     * @param extraCondition2 其他条件
     */
    public void setExtraCondition2(String extraCondition2) {
        this.extraCondition2 = extraCondition2 == null ? null : extraCondition2.trim();
    }

    /**
     * 勋章上线状态，0:未上线1:上线中
     * @return online_state 勋章上线状态，0:未上线1:上线中
     */
    public Integer getOnlineState() {
        return onlineState;
    }

    /**
     * 勋章上线状态，0:未上线1:上线中
     * @param onlineState 勋章上线状态，0:未上线1:上线中
     */
    public void setOnlineState(Integer onlineState) {
        this.onlineState = onlineState;
    }
}