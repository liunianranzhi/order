package com.shanyuan.platform.ms.dao.user.entity;

/**
 * 描述:sy_poor_agent表的实体类
 * @version
 * @author:  caoyongjun
 * @创建时间: 2017-10-31
 */
public class SyPoorAgent {
    /**
     * 主键id
     */
    private Integer recId;

    /**
     * 贫困户id
     */
    private Integer poorId;

    /**
     * 代理人的member_id
     */
    private Integer memberId;

    /**
     * 代理模式，0后付费，1预付费
     */
    private Byte poorType;

    /**
     * 更新时间
     */
    private Integer updateTime;

    /**
     * 主键id
     * @return rec_id 主键id
     */
    public Integer getRecId() {
        return recId;
    }

    /**
     * 主键id
     * @param recId 主键id
     */
    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    /**
     * 贫困户id
     * @return poor_id 贫困户id
     */
    public Integer getPoorId() {
        return poorId;
    }

    /**
     * 贫困户id
     * @param poorId 贫困户id
     */
    public void setPoorId(Integer poorId) {
        this.poorId = poorId;
    }

    /**
     * 代理人的member_id
     * @return member_id 代理人的member_id
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 代理人的member_id
     * @param memberId 代理人的member_id
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 代理模式，0后付费，1预付费
     * @return poor_type 代理模式，0后付费，1预付费
     */
    public Byte getPoorType() {
        return poorType;
    }

    /**
     * 代理模式，0后付费，1预付费
     * @param poorType 代理模式，0后付费，1预付费
     */
    public void setPoorType(Byte poorType) {
        this.poorType = poorType;
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
}