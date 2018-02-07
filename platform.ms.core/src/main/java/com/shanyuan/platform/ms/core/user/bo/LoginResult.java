package com.shanyuan.platform.ms.core.user.bo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.shanyuan.platform.ms.base.common.ServiceResult;


public class LoginResult extends ServiceResult implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9105034369715435708L;

	private Map<String ,Object> resultData = new HashMap<String,Object>();
	
	private  Map<String,String>  addCookies = new  HashMap<String,String> ();
	
	private String redirect;

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

	public String getRedirect() {
		return redirect;
	}

	public void setRedirect(String redirect) {
		this.redirect = redirect;
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

	public LoginResult() {
		super();
	}
	
	
}
