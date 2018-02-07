package com.shanyuan.platform.ms.dao.user.entity;

/**
 * 描述:sy_glory_user_list表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-10-18
 */
public class SyGloryUserList {
    /**
     * 
     */
    private Integer gloryMemberId;

    /**
     * 勋章id
     */
    private Integer gloryId;

    /**
     * 用户id
     */
    private Integer memberId;

    /**
     * 状态：0:失效1:有效
     */
    private Integer enableState;

    /**
     * 
     * @return glory_member_id 
     */
    public Integer getGloryMemberId() {
        return gloryMemberId;
    }

    /**
     * 
     * @param gloryMemberId 
     */
    public void setGloryMemberId(Integer gloryMemberId) {
        this.gloryMemberId = gloryMemberId;
    }

    /**
     * 勋章id
     * @return glory_id 勋章id
     */
    public Integer getGloryId() {
        return gloryId;
    }

    /**
     * 勋章id
     * @param gloryId 勋章id
     */
    public void setGloryId(Integer gloryId) {
        this.gloryId = gloryId;
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
     * 状态：0:失效1:有效
     * @return enable_state 状态：0:失效1:有效
     */
    public Integer getEnableState() {
        return enableState;
    }

    /**
     * 状态：0:失效1:有效
     * @param enableState 状态：0:失效1:有效
     */
    public void setEnableState(Integer enableState) {
        this.enableState = enableState;
    }
}