package com.shanyuan.platform.ms.dao.union.entity;

/**
 * 描述:sy_union_item表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-11-30
 */
public class SyUnionItem {
    /**
     * 子联盟id
     */
    private Integer unionItemId;

    /**
     * 子联盟名称（后台显示用）
     */
    private String unionItemName;

    /**
     * 所属的联盟标识
     */
    private String unionCode;

    /**
     * 创建者id
     */
    private Integer createMemberId;

    /**
     * 创建时间
     */
    private Integer createTime;

    /**
     * 所属的部门id
     */
    private Integer circleId;

    /**
     * 显示标题文案（可以为空）
     */
    private String indexTag;

    /**
     * 产品详情页文案(必填)
     */
    private String showpageTag;

    /**
     * 排序id
     */
    private Integer sortNum;

    /**
     * 是否启用 1 启用 0 不启用
     */
    private Byte isEnabled;

    /**
     * 最后编辑用户的id
     */
    private Integer updateMemberId;

    /**
     * 最后更新时间
     */
    private Integer updateTime;

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
     * 子联盟名称（后台显示用）
     * @return union_item_name 子联盟名称（后台显示用）
     */
    public String getUnionItemName() {
        return unionItemName;
    }

    /**
     * 子联盟名称（后台显示用）
     * @param unionItemName 子联盟名称（后台显示用）
     */
    public void setUnionItemName(String unionItemName) {
        this.unionItemName = unionItemName == null ? null : unionItemName.trim();
    }

    /**
     * 所属的联盟标识
     * @return union_code 所属的联盟标识
     */
    public String getUnionCode() {
        return unionCode;
    }

    /**
     * 所属的联盟标识
     * @param unionCode 所属的联盟标识
     */
    public void setUnionCode(String unionCode) {
        this.unionCode = unionCode == null ? null : unionCode.trim();
    }

    /**
     * 创建者id
     * @return create_member_id 创建者id
     */
    public Integer getCreateMemberId() {
        return createMemberId;
    }

    /**
     * 创建者id
     * @param createMemberId 创建者id
     */
    public void setCreateMemberId(Integer createMemberId) {
        this.createMemberId = createMemberId;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * 所属的部门id
     * @return circle_id 所属的部门id
     */
    public Integer getCircleId() {
        return circleId;
    }

    /**
     * 所属的部门id
     * @param circleId 所属的部门id
     */
    public void setCircleId(Integer circleId) {
        this.circleId = circleId;
    }

    /**
     * 显示标题文案（可以为空）
     * @return index_tag 显示标题文案（可以为空）
     */
    public String getIndexTag() {
        return indexTag;
    }

    /**
     * 显示标题文案（可以为空）
     * @param indexTag 显示标题文案（可以为空）
     */
    public void setIndexTag(String indexTag) {
        this.indexTag = indexTag == null ? null : indexTag.trim();
    }

    /**
     * 产品详情页文案(必填)
     * @return showpage_tag 产品详情页文案(必填)
     */
    public String getShowpageTag() {
        return showpageTag;
    }

    /**
     * 产品详情页文案(必填)
     * @param showpageTag 产品详情页文案(必填)
     */
    public void setShowpageTag(String showpageTag) {
        this.showpageTag = showpageTag == null ? null : showpageTag.trim();
    }

    /**
     * 排序id
     * @return sort_num 排序id
     */
    public Integer getSortNum() {
        return sortNum;
    }

    /**
     * 排序id
     * @param sortNum 排序id
     */
    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    /**
     * 是否启用 1 启用 0 不启用
     * @return is_enabled 是否启用 1 启用 0 不启用
     */
    public Byte getIsEnabled() {
        return isEnabled;
    }

    /**
     * 是否启用 1 启用 0 不启用
     * @param isEnabled 是否启用 1 启用 0 不启用
     */
    public void setIsEnabled(Byte isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     * 最后编辑用户的id
     * @return update_member_id 最后编辑用户的id
     */
    public Integer getUpdateMemberId() {
        return updateMemberId;
    }

    /**
     * 最后编辑用户的id
     * @param updateMemberId 最后编辑用户的id
     */
    public void setUpdateMemberId(Integer updateMemberId) {
        this.updateMemberId = updateMemberId;
    }

    /**
     * 最后更新时间
     * @return update_time 最后更新时间
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * 最后更新时间
     * @param updateTime 最后更新时间
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }
}