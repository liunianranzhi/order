package com.shanyuan.platform.ms.dao.union.entity;

/**
 * 描述:sy_union_item_agent表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-11-30
 */
public class SyUnionItemAgent {
    /**
     * 主键
     */
    private Integer itemAgentId;

    /**
     * 子联盟id
     */
    private Integer unionItemId;

    /**
     * 助理人的会员id
     */
    private Integer memberId;

    /**
     * 添加的用户id
     */
    private Integer createMemberId;

    /**
     * 添加时间
     */
    private Integer createTime;

    /**
     * 主键
     * @return item_agent_id 主键
     */
    public Integer getItemAgentId() {
        return itemAgentId;
    }

    /**
     * 主键
     * @param itemAgentId 主键
     */
    public void setItemAgentId(Integer itemAgentId) {
        this.itemAgentId = itemAgentId;
    }

    /**
     * 子联盟id
     * @return union_item_id 子联盟id
     */
    public Integer getUnionItemId() {
        return unionItemId;
    }

    /**
     * 子联盟id
     * @param unionItemId 子联盟id
     */
    public void setUnionItemId(Integer unionItemId) {
        this.unionItemId = unionItemId;
    }

    /**
     * 助理人的会员id
     * @return member_id 助理人的会员id
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 助理人的会员id
     * @param memberId 助理人的会员id
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 添加的用户id
     * @return create_member_id 添加的用户id
     */
    public Integer getCreateMemberId() {
        return createMemberId;
    }

    /**
     * 添加的用户id
     * @param createMemberId 添加的用户id
     */
    public void setCreateMemberId(Integer createMemberId) {
        this.createMemberId = createMemberId;
    }

    /**
     * 添加时间
     * @return create_time 添加时间
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * 添加时间
     * @param createTime 添加时间
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
}