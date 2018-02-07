package com.shanyuan.platform.ms.dao.auth.entity;

/**
 * 描述:sy_mb_user_token表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-10-16
 */
public class SyMbUserToken {
    /**
     * 令牌编号
     */
    private Integer tokenId;

    /**
     * 用户编号
     */
    private Integer memberId;

    /**
     * 用户名
     */
    private String memberName;

    /**
     * 真实姓名
     */
    private String memberTruename;

    /**
     * 登录令牌
     */
    private String token;

    /**
     * 登录时间
     */
    private Integer loginTime;

    /**
     * 客户端类型 android wap wechat ios web
     */
    private String clientType;

    /**
     * 注册渠道id
     */
    private String registerChannel;

    /**
     * 推广员编号
     */
    private Integer promotionIdx;

    /**
     * app渠道标识,默认空
     */
    private String appVariant;

    /**
     * 令牌编号
     * @return token_id 令牌编号
     */
    public Integer getTokenId() {
        return tokenId;
    }

    /**
     * 令牌编号
     * @param tokenId 令牌编号
     */
    public void setTokenId(Integer tokenId) {
        this.tokenId = tokenId;
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
     * 用户名
     * @return member_name 用户名
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * 用户名
     * @param memberName 用户名
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    /**
     * 真实姓名
     * @return member_truename 真实姓名
     */
    public String getMemberTruename() {
        return memberTruename;
    }

    /**
     * 真实姓名
     * @param memberTruename 真实姓名
     */
    public void setMemberTruename(String memberTruename) {
        this.memberTruename = memberTruename == null ? null : memberTruename.trim();
    }

    /**
     * 登录令牌
     * @return token 登录令牌
     */
    public String getToken() {
        return token;
    }

    /**
     * 登录令牌
     * @param token 登录令牌
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * 登录时间
     * @return login_time 登录时间
     */
    public Integer getLoginTime() {
        return loginTime;
    }

    /**
     * 登录时间
     * @param loginTime 登录时间
     */
    public void setLoginTime(Integer loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * 客户端类型 android wap wechat ios web
     * @return client_type 客户端类型 android wap wechat ios web
     */
    public String getClientType() {
        return clientType;
    }

    /**
     * 客户端类型 android wap wechat ios web
     * @param clientType 客户端类型 android wap wechat ios web
     */
    public void setClientType(String clientType) {
        this.clientType = clientType == null ? null : clientType.trim();
    }

    /**
     * 注册渠道id
     * @return register_channel 注册渠道id
     */
    public String getRegisterChannel() {
        return registerChannel;
    }

    /**
     * 注册渠道id
     * @param registerChannel 注册渠道id
     */
    public void setRegisterChannel(String registerChannel) {
        this.registerChannel = registerChannel == null ? null : registerChannel.trim();
    }

    /**
     * 推广员编号
     * @return promotion_idx 推广员编号
     */
    public Integer getPromotionIdx() {
        return promotionIdx;
    }

    /**
     * 推广员编号
     * @param promotionIdx 推广员编号
     */
    public void setPromotionIdx(Integer promotionIdx) {
        this.promotionIdx = promotionIdx;
    }

    /**
     * app渠道标识,默认空
     * @return app_variant app渠道标识,默认空
     */
    public String getAppVariant() {
        return appVariant;
    }

    /**
     * app渠道标识,默认空
     * @param appVariant app渠道标识,默认空
     */
    public void setAppVariant(String appVariant) {
        this.appVariant = appVariant == null ? null : appVariant.trim();
    }
}