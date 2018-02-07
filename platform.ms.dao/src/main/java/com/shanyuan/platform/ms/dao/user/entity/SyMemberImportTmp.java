package com.shanyuan.platform.ms.dao.user.entity;

/**
 * 描述:sy_member_import_tmp表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-10-19
 */
public class SyMemberImportTmp {
    /**
     * 
     */
    private String memberMobile;

    /**
     * 
     */
    private String memberTruename;

    /**
     * 
     */
    private Byte memberSex;

    /**
     * 
     */
    private Integer circleId;

    /**
     * 
     */
    private String channel;

    /**
     * 
     */
    private Integer createTime;

    /**
     * 
     * @return member_mobile 
     */
    public String getMemberMobile() {
        return memberMobile;
    }

    /**
     * 
     * @param memberMobile 
     */
    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile == null ? null : memberMobile.trim();
    }

    /**
     * 
     * @return member_truename 
     */
    public String getMemberTruename() {
        return memberTruename;
    }

    /**
     * 
     * @param memberTruename 
     */
    public void setMemberTruename(String memberTruename) {
        this.memberTruename = memberTruename == null ? null : memberTruename.trim();
    }

    /**
     * 
     * @return member_sex 
     */
    public Byte getMemberSex() {
        return memberSex;
    }

    /**
     * 
     * @param memberSex 
     */
    public void setMemberSex(Byte memberSex) {
        this.memberSex = memberSex;
    }

    /**
     * 
     * @return circle_id 
     */
    public Integer getCircleId() {
        return circleId;
    }

    /**
     * 
     * @param circleId 
     */
    public void setCircleId(Integer circleId) {
        this.circleId = circleId;
    }

    /**
     * 
     * @return channel 
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 
     * @param channel 
     */
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    /**
     * 
     * @return create_time 
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * 
     * @param createTime 
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
}