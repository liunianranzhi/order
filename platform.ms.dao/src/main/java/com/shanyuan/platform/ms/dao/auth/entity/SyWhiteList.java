package com.shanyuan.platform.ms.dao.auth.entity;

/**
 * 描述:sy_white_list表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-10-16
 */
public class SyWhiteList {
    /**
     * 
     */
    private Integer recId;

    /**
     * 登录名
     */
    private String memberName;

    /**
     * 登录端标识，app：app客户端登录，pc：pc管理端登录
     */
    private String loginType;

    /**
     * 白名单添加时间
     */
    private Integer addTime;

    /**
     * 添加该记录的管理员名字
     */
    private String adminMemberName;

    /**
     * 添加该记录的管理员member_id
     */
    private Integer adminMemberId;

    /**
     * 
     * @return rec_id 
     */
    public Integer getRecId() {
        return recId;
    }

    /**
     * 
     * @param recId 
     */
    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    /**
     * 登录名
     * @return member_name 登录名
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * 登录名
     * @param memberName 登录名
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    /**
     * 登录端标识，app：app客户端登录，pc：pc管理端登录
     * @return login_type 登录端标识，app：app客户端登录，pc：pc管理端登录
     */
    public String getLoginType() {
        return loginType;
    }

    /**
     * 登录端标识，app：app客户端登录，pc：pc管理端登录
     * @param loginType 登录端标识，app：app客户端登录，pc：pc管理端登录
     */
    public void setLoginType(String loginType) {
        this.loginType = loginType == null ? null : loginType.trim();
    }

    /**
     * 白名单添加时间
     * @return add_time 白名单添加时间
     */
    public Integer getAddTime() {
        return addTime;
    }

    /**
     * 白名单添加时间
     * @param addTime 白名单添加时间
     */
    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    /**
     * 添加该记录的管理员名字
     * @return admin_member_name 添加该记录的管理员名字
     */
    public String getAdminMemberName() {
        return adminMemberName;
    }

    /**
     * 添加该记录的管理员名字
     * @param adminMemberName 添加该记录的管理员名字
     */
    public void setAdminMemberName(String adminMemberName) {
        this.adminMemberName = adminMemberName == null ? null : adminMemberName.trim();
    }

    /**
     * 添加该记录的管理员member_id
     * @return admin_member_id 添加该记录的管理员member_id
     */
    public Integer getAdminMemberId() {
        return adminMemberId;
    }

    /**
     * 添加该记录的管理员member_id
     * @param adminMemberId 添加该记录的管理员member_id
     */
    public void setAdminMemberId(Integer adminMemberId) {
        this.adminMemberId = adminMemberId;
    }
}