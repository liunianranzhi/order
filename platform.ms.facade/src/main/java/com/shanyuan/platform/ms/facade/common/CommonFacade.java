package com.shanyuan.platform.ms.facade.common;

/**
 * 通用方法
 * @author yangjian
 * @date 2017/12/07
 */
public interface CommonFacade {

	/**
	 * @author yangjian
	 * 根据 token获取channel code
	 * @param token
	 * @return
	 */
	public String getChannelForUser(String channel, String token, String did);
	
	/**
	 * @author yangjian 
	 * 判断是否登录
	 * @param token
	 * @param did
	 * @return
	 */
//	public boolean checkLogin(String token, String did);
	
	/**
	 * @author yangjian
	 * 判断是否登录
	 * @param token
	 * @param did
	 * @return
	 */
//	public String checkToken(String token, String did);
	
}
