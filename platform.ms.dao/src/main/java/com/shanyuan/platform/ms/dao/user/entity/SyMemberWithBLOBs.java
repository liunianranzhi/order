package com.shanyuan.platform.ms.dao.user.entity;

public class SyMemberWithBLOBs extends SyMember {
    /**
     * qq账号相关信息
     */
    private String memberQqinfo;

    /**
     * 新浪账号相关信息序列化值
     */
    private String memberSinainfo;

    /**
     * 隐私设定
     */
    private String memberPrivacy;

    /**
     * qq账号相关信息
     * @return member_qqinfo qq账号相关信息
     */
    public String getMemberQqinfo() {
        return memberQqinfo;
    }

    /**
     * qq账号相关信息
     * @param memberQqinfo qq账号相关信息
     */
    public void setMemberQqinfo(String memberQqinfo) {
        this.memberQqinfo = memberQqinfo == null ? null : memberQqinfo.trim();
    }

    /**
     * 新浪账号相关信息序列化值
     * @return member_sinainfo 新浪账号相关信息序列化值
     */
    public String getMemberSinainfo() {
        return memberSinainfo;
    }

    /**
     * 新浪账号相关信息序列化值
     * @param memberSinainfo 新浪账号相关信息序列化值
     */
    public void setMemberSinainfo(String memberSinainfo) {
        this.memberSinainfo = memberSinainfo == null ? null : memberSinainfo.trim();
    }

    /**
     * 隐私设定
     * @return member_privacy 隐私设定
     */
    public String getMemberPrivacy() {
        return memberPrivacy;
    }

    /**
     * 隐私设定
     * @param memberPrivacy 隐私设定
     */
    public void setMemberPrivacy(String memberPrivacy) {
        this.memberPrivacy = memberPrivacy == null ? null : memberPrivacy.trim();
    }
}