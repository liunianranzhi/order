package com.shanyuan.platform.ms.dao.user.entity;

/**
 * 描述:sy_glory_detials表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-10-18
 */
public class SyGloryDetails {
    /**
     * 主键
     */
    private Integer gloryDetialId;

    /**
     * 勋章-用户关系表主键
     */
    private Integer gloryUserId;

    /**
     * 勋章主键
     */
    private Integer gloryIdD;

    /**
     * 获得状态0，未获得1，已获得
     */
    private Integer achieveState;

    /**
     * 共需多少
     */
    private Integer totalProgressStep;

    /**
     * 进度
     */
    private Integer progressStep;

    /**
     * 第几个获取的人
     */
    private Integer achieveCountIndex;

    /**
     * 获取时间
     */
    private Integer achieveTime;

    /**
     * 是否出现闪屏图0，不出现，1出现
     */
    private String splashFlag;

    /**
     * 其他
     */
    private String extraInfo;

    /**
     * 主键
     * @return glory_detial_id 主键
     */
    public Integer getGloryDetialId() {
        return gloryDetialId;
    }

    /**
     * 主键
     * @param gloryDetialId 主键
     */
    public void setGloryDetialId(Integer gloryDetialId) {
        this.gloryDetialId = gloryDetialId;
    }

    /**
     * 勋章-用户关系表主键
     * @return glory_user_id 勋章-用户关系表主键
     */
    public Integer getGloryUserId() {
        return gloryUserId;
    }

    /**
     * 勋章-用户关系表主键
     * @param gloryUserId 勋章-用户关系表主键
     */
    public void setGloryUserId(Integer gloryUserId) {
        this.gloryUserId = gloryUserId;
    }

    /**
     * 勋章主键
     * @return glory_id_d 勋章主键
     */
    public Integer getGloryIdD() {
        return gloryIdD;
    }

    /**
     * 勋章主键
     * @param gloryIdD 勋章主键
     */
    public void setGloryIdD(Integer gloryIdD) {
        this.gloryIdD = gloryIdD;
    }

    /**
     * 获得状态0，未获得1，已获得
     * @return achieve_state 获得状态0，未获得1，已获得
     */
    public Integer getAchieveState() {
        return achieveState;
    }

    /**
     * 获得状态0，未获得1，已获得
     * @param achieveState 获得状态0，未获得1，已获得
     */
    public void setAchieveState(Integer achieveState) {
        this.achieveState = achieveState;
    }

    /**
     * 共需多少
     * @return total_progress_step 共需多少
     */
    public Integer getTotalProgressStep() {
        return totalProgressStep;
    }

    /**
     * 共需多少
     * @param totalProgressStep 共需多少
     */
    public void setTotalProgressStep(Integer totalProgressStep) {
        this.totalProgressStep = totalProgressStep;
    }

    /**
     * 进度
     * @return progress_step 进度
     */
    public Integer getProgressStep() {
        return progressStep;
    }

    /**
     * 进度
     * @param progressStep 进度
     */
    public void setProgressStep(Integer progressStep) {
        this.progressStep = progressStep;
    }

    /**
     * 第几个获取的人
     * @return achieve_count_index 第几个获取的人
     */
    public Integer getAchieveCountIndex() {
        return achieveCountIndex;
    }

    /**
     * 第几个获取的人
     * @param achieveCountIndex 第几个获取的人
     */
    public void setAchieveCountIndex(Integer achieveCountIndex) {
        this.achieveCountIndex = achieveCountIndex;
    }

    /**
     * 获取时间
     * @return achieve_time 获取时间
     */
    public Integer getAchieveTime() {
        return achieveTime;
    }

    /**
     * 获取时间
     * @param achieveTime 获取时间
     */
    public void setAchieveTime(Integer achieveTime) {
        this.achieveTime = achieveTime;
    }

    /**
     * 是否出现闪屏图0，不出现，1出现
     * @return splash_flag 是否出现闪屏图0，不出现，1出现
     */
    public String getSplashFlag() {
        return splashFlag;
    }

    /**
     * 是否出现闪屏图0，不出现，1出现
     * @param splashFlag 是否出现闪屏图0，不出现，1出现
     */
    public void setSplashFlag(String splashFlag) {
        this.splashFlag = splashFlag == null ? null : splashFlag.trim();
    }

    /**
     * 其他
     * @return extra_info 其他
     */
    public String getExtraInfo() {
        return extraInfo;
    }

    /**
     * 其他
     * @param extraInfo 其他
     */
    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo == null ? null : extraInfo.trim();
    }
}