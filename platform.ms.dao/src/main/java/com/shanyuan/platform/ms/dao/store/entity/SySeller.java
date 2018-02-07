package com.shanyuan.platform.ms.dao.store.entity;

/**
 * 描述:sy_seller表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-10-17
 */
public class SySeller {
    /**
     * 卖家编号
     */
    private Integer sellerId;

    /**
     * 卖家用户名
     */
    private String sellerName;

    /**
     * 用户编号
     */
    private Integer memberId;

    /**
     * 卖家组编号
     */
    private Integer sellerGroupId;

    /**
     * 店铺编号
     */
    private Integer storeId;

    /**
     * 是否管理员(0-不是 1-是)
     */
    private Byte isAdmin;

    /**
     * 卖家快捷操作
     */
    private String sellerQuicklink;

    /**
     * 最后登录时间
     */
    private Integer lastLoginTime;

    /**
     * 卖家编号
     * @return seller_id 卖家编号
     */
    public Integer getSellerId() {
        return sellerId;
    }

    /**
     * 卖家编号
     * @param sellerId 卖家编号
     */
    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * 卖家用户名
     * @return seller_name 卖家用户名
     */
    public String getSellerName() {
        return sellerName;
    }

    /**
     * 卖家用户名
     * @param sellerName 卖家用户名
     */
    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }

    /**
     * 用户编号
     * @return member_id 用户编号
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 用户编号
     * @param memberId 用户编号
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 卖家组编号
     * @return seller_group_id 卖家组编号
     */
    public Integer getSellerGroupId() {
        return sellerGroupId;
    }

    /**
     * 卖家组编号
     * @param sellerGroupId 卖家组编号
     */
    public void setSellerGroupId(Integer sellerGroupId) {
        this.sellerGroupId = sellerGroupId;
    }

    /**
     * 店铺编号
     * @return store_id 店铺编号
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * 店铺编号
     * @param storeId 店铺编号
     */
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    /**
     * 是否管理员(0-不是 1-是)
     * @return is_admin 是否管理员(0-不是 1-是)
     */
    public Byte getIsAdmin() {
        return isAdmin;
    }

    /**
     * 是否管理员(0-不是 1-是)
     * @param isAdmin 是否管理员(0-不是 1-是)
     */
    public void setIsAdmin(Byte isAdmin) {
        this.isAdmin = isAdmin;
    }

    /**
     * 卖家快捷操作
     * @return seller_quicklink 卖家快捷操作
     */
    public String getSellerQuicklink() {
        return sellerQuicklink;
    }

    /**
     * 卖家快捷操作
     * @param sellerQuicklink 卖家快捷操作
     */
    public void setSellerQuicklink(String sellerQuicklink) {
        this.sellerQuicklink = sellerQuicklink == null ? null : sellerQuicklink.trim();
    }

    /**
     * 最后登录时间
     * @return last_login_time 最后登录时间
     */
    public Integer getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 最后登录时间
     * @param lastLoginTime 最后登录时间
     */
    public void setLastLoginTime(Integer lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}