package com.shanyuan.platform.ms.core.auth.bo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.dao.user.entity.SyPoor;
import com.shanyuan.platform.ms.dao.user.entity.SyRole;

/**
 * @author lee
 * 认证服务相关对象
 */
public class AuthInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4311580115429950042L;

	/**
	 * 
	 */
	private SyMember memeberInfo ;
	/**
	 * 微信id
	 */
	private String wxOpenId;
	/**
	 * 第三方平台id
	 */
	private String corpId;
	private Map<String ,String> sessionData = new HashMap<String,String>();
	private Map<String ,Object> resultData = new HashMap<String,Object>();
	
	private  Map<String,String>  addCookies = new  HashMap<String,String> ();

	/**
	 * 机构圈子代码
	 */
	private Integer bocCircleId ;
	
	/**
	 * 贫困户信息
	 */
	private SyPoor poor ;
	/**
	 * 助理人角色信息
	 */
	private SyRole role ;
	
	/**
	 * 是否新注册用户
	 */
	private boolean isRegister = false;
	
	
	public String getWxOpenId() {
		return wxOpenId;
	}

	public void setWxOpenId(String wxOpenId) {
		this.wxOpenId = wxOpenId;
	}

	public String getCorpId() {
		return corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public SyRole getRole() {
		return role;
	}

	public void setRole(SyRole role) {
		this.role = role;
	}

	public SyPoor getPoor() {
		return poor;
	}

	public void setPoor(SyPoor poor) {
		this.poor = poor;
	}

	public Integer getBocCircleId() {
		return bocCircleId;
	}

	public void setBocCircleId(Integer bocCircleId) {
		this.bocCircleId = bocCircleId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * 用户的登录token
	 */
	private String userToken ;
	
	/**
	 * redis 中存储session信息的key
	 */
	private String sessionRedisKey ;
	public Map<String, Object> getResultData() {
		return resultData;
	}

	public void setResultData(Map<String, Object> resultData) {
		this.resultData = resultData;
	}

	public  Map<String,String> getAddCookies() {
		return addCookies;
	}

	public void setAddCookies( Map<String,String> addCookies) {
		this.addCookies = addCookies;
	}

	public String getUserToken() {
		return userToken;
	}

	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}

	public String getSessionRedisKey() {
		return sessionRedisKey;
	}

	public void setSessionRedisKey(String sessionRedisKey) {
		this.sessionRedisKey = sessionRedisKey;
	}

	public SyMember getMemeberInfo() {
		return memeberInfo;
	}

	public void setMemeberInfo(SyMember memeberInfo) {
		this.memeberInfo = memeberInfo;
	}

	public Map<String, String> getSessionData() {
		return sessionData;
	}

	public void setSessionData(Map<String, String> sessionData) {
		this.sessionData = sessionData;
	}
	public void putSessionData(String key ,String value ) {
		this.sessionData.put(key, value);
	}

	public boolean isRegister() {
		return isRegister;
	}

	public void setRegister(boolean isRegister) {
		this.isRegister = isRegister;
	}

}
