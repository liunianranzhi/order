package com.shanyuan.platform.ms.core.user.bo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

/**
 * 登录信息入参封装
 * @author 
 *
 */
public class LoginInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7919932798823154343L;
	
	/**
	 * 真实ip
	 */
	private String realIP ;
	/**
	 * 登录类型
	 */
	@NotNull
	private String loginType ;
	/**
	 * 手机号
	 */
	@NotNull
	private String mobile ;
	/**
	 * 验证码或密码
	 */
	@NotNull
	private String mcode ;
	/**
	 *   第三方平台用户id $corp_uid
	 */
	private String corpUid ;
	/**
	 * 微信openid
	 */
	private String wxOpenid ;
	/**
	 * 渠道
	 */
	private String channel;
	/**
	 * 邀请码
	 */
	private String inviteCode;
	/**
	 * 客户端
	 */
	private String client ;
	/**
	 * 圈子id 
	 */
	private Integer circleId;
	
	private String deviceId;
	
	private Boolean isRegister = false;
	
	public Integer getCircleId() {
		return circleId;
	}
	public void setCircleId(Integer circleId) {
		this.circleId = circleId;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getLoginType() {
		return loginType;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMcode() {
		return mcode;
	}
	
	public String getCorpUid() {
		return corpUid;
	}
	public void setCorpUid(String corpUid) {
		this.corpUid = corpUid;
	}
	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}
	public void setWxOpenid(String wxOpenid) {
		this.wxOpenid = wxOpenid;
	}
	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode;
	}
	public void setMcode(String mcode) {
		this.mcode = mcode;
	}
	public String getWxOpenid() {
		return wxOpenid;
	}
	public String getInviteCode() {
		return inviteCode;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getRealIP() {
		return realIP;
	}
	public void setRealIP(String realIP) {
		this.realIP = realIP;
	}
	public Boolean getIsRegister() {
		return isRegister;
	}
	public void setIsRegister(Boolean isRegister) {
		this.isRegister = isRegister;
	}
	
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public LoginInfo(String realIP, String loginType, String mobile, String mcode, 
			String corpUid, String wxOpenid, String inviteCode, String client, String channel, Integer circleId,
			String deviceId) {
		super();
		this.realIP = realIP;
		this.loginType = loginType;
		this.mobile = mobile;
		this.mcode = mcode;
		this.corpUid = corpUid;
		this.wxOpenid = wxOpenid;
		this.inviteCode = inviteCode;
		this.client = client;
		this.channel = channel;
		this.circleId = circleId;
		this.deviceId = deviceId;
	}
	public LoginInfo() {
		super();
	}
	
}

