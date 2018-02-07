package com.shanyuan.platform.ms.dao.user.entity;

/**
 * 描述:sy_wx_account表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-10-16
 */
public class SyWXAcount {
    /**
     * 主键
     */
    private Integer recId;

    /**
     * 用户id
     */
    private Integer memberId;

    /**
     * 微信openid
     */
    private String memberWxopenid;

    /**
     * 添加时间
     */
    private String addTime;

    /**
     * 主键
     * @return rec_id 主键
     */
    public Integer getRecId() {
        return recId;
    }

    /**
     * 主键
     * @param recId 主键
     */
    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    /**
     * 用户id
     * @return member_id 用户id
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 用户id
     * @param memberId 用户id
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 微信openid
     * @return member_wxopenid 微信openid
     */
    public String getMemberWxopenid() {
        return memberWxopenid;
    }

    /**
     * 微信openid
     * @param memberWxopenid 微信openid
     */
    public void setMemberWxopenid(String memberWxopenid) {
        this.memberWxopenid = memberWxopenid == null ? null : memberWxopenid.trim();
    }

    /**
     * 添加时间
     * @return add_time 添加时间
     */
    public String getAddTime() {
        return addTime;
    }

    /**
     * 添加时间
     * @param addTime 添加时间
     */
    public void setAddTime(String addTime) {
        this.addTime = addTime == null ? null : addTime.trim();
    }
}