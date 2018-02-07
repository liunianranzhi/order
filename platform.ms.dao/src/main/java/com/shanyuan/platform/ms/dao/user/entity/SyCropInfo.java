package com.shanyuan.platform.ms.dao.user.entity;

/**
 * 描述:sy_corp_info表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-10-17
 */
public class SyCropInfo {
    /**
     * 记录id
     */
    private Integer recId;

    /**
     * 会员id
     */
    private Integer memberId;

    /**
     * 渠道id
     */
    private String chnlId;

    /**
     * 第三方用户标识符
     */
    private String corpUid;

    /**
     * 上次更新时间
     */
    private Integer lastUpdate;

    /**
     * 绑定时间
     */
    private Integer bindTime;

    /**
     * 最后绑定时间，退出登录后重置为0
     */
    private Integer lastBindTime;

    /**
     * 记录id
     * @return rec_id 记录id
     */
    public Integer getRecId() {
        return recId;
    }

    /**
     * 记录id
     * @param recId 记录id
     */
    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    /**
     * 会员id
     * @return member_id 会员id
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 会员id
     * @param memberId 会员id
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 渠道id
     * @return chnl_id 渠道id
     */
    public String getChnlId() {
        return chnlId;
    }

    /**
     * 渠道id
     * @param chnlId 渠道id
     */
    public void setChnlId(String chnlId) {
        this.chnlId = chnlId == null ? null : chnlId.trim();
    }

    /**
     * 第三方用户标识符
     * @return corp_uid 第三方用户标识符
     */
    public String getCorpUid() {
        return corpUid;
    }

    /**
     * 第三方用户标识符
     * @param corpUid 第三方用户标识符
     */
    public void setCorpUid(String corpUid) {
        this.corpUid = corpUid == null ? null : corpUid.trim();
    }

    /**
     * 上次更新时间
     * @return last_update 上次更新时间
     */
    public Integer getLastUpdate() {
        return lastUpdate;
    }

    /**
     * 上次更新时间
     * @param lastUpdate 上次更新时间
     */
    public void setLastUpdate(Integer lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     * 绑定时间
     * @return bind_time 绑定时间
     */
    public Integer getBindTime() {
        return bindTime;
    }

    /**
     * 绑定时间
     * @param bindTime 绑定时间
     */
    public void setBindTime(Integer bindTime) {
        this.bindTime = bindTime;
    }

    /**
     * 最后绑定时间，退出登录后重置为0
     * @return last_bind_time 最后绑定时间，退出登录后重置为0
     */
    public Integer getLastBindTime() {
        return lastBindTime;
    }

    /**
     * 最后绑定时间，退出登录后重置为0
     * @param lastBindTime 最后绑定时间，退出登录后重置为0
     */
    public void setLastBindTime(Integer lastBindTime) {
        this.lastBindTime = lastBindTime;
    }
}