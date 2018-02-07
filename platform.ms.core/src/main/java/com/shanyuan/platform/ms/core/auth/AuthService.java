package com.shanyuan.platform.ms.core.auth;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.auth.bo.AuthInfo;
import com.shanyuan.platform.ms.core.user.bo.LoginInfo;
import com.shanyuan.platform.ms.core.user.bo.LoginResult;
import com.shanyuan.platform.ms.dao.auth.entity.SyMbUserToken;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;

/**
 * @author lee
 * 登录认证的服务
 */
public interface AuthService {
	
	
	
	/**
	 * 验证用户的验证码
	 * @param userName
	 * @param pwd
	 * @return
	 * @throws CoreServiceException
	 */
	public SyMember validCode(String userName ,String pwd) throws CoreServiceException ;
	
	public boolean validMcode(String mobile, String mcode) throws CoreServiceException;
	
	/**
	 * 验证用户的登录密码
	 * @param userName
	 * @param pwd
	 * @return 验证通过的话 ，返回登录用户信息，否则返回null 或者抛出异常
	 * @throws CoreServiceException
	 */
	public SyMember validPSW(String userName ,String pwd) throws CoreServiceException ;
	
	/**
	 * @param userName memberName
	 * @param type app 或者 pc
	 * @return 在白名单中 返回true ，否则返回false;
	 */
	public boolean isInWhiteList(String userName,String type) ;
	
	
	
	/**
	 * 创建AuthInfo信息
	 * 			添加  	member 
	 * 				poor 贫困户信息
	 * 				role agentRole 
	 * 				wxopenId 微信openid
	 * 				bocCircleId 组织机构的圈子id;
	 * 				userToken 用户登录的token
	 * @param member
	 * @param wxOpenId
	 * @param userToken 用户的登录token信息
	 * @return
	 */
	public AuthInfo createAuthInfo(SyMember member ,String wxOpenId,SyMbUserToken userToken ) throws CoreServiceException;
	
	/**
	 * 创建session信息
	 * @param AuthInfo 认证信息 
	 * 				需要计算添加过member 
	 * 				poor 贫困户信息
	 * 				role agentRole 
	 * 				wxopenId 微信openid
	 * 				bocCircleId 组织机构的圈子id;
	 * 				userToken 用户登录的token
	 * 
	 * @param token 登录token记录
	 * @param wxOpenId 微信openId
	 * @return 返回封装好的AuthInfo信息
	 * 			添加sessionMap 
	 * 			添加redisSessionKey
	 * @throws CoreServiceException
	 */
	public AuthInfo createSession(AuthInfo authInfo   ) throws CoreServiceException;
	
	 
	
	/**
	 * @param authInfo
	 * @return 封装authInfo的redirect数据
	 * @throws CoreServiceException
	 */
	@Deprecated
	public LoginResult chargeToGo(LoginResult result ,LoginInfo loginInfo ,SyMember member) throws CoreServiceException ;
	
	
	
	/**
	 * 获取用户的登录token
	 * @param member
	 * @param client android 或者 ios
	 * @return
	 * @throws CoreServiceException
	 */
	public SyMbUserToken updateUserToken(SyMember member ,String client) throws CoreServiceException ;
	
	public SyMbUserToken getUserToken(Integer memberId);
	
	/**
	 * 检查登录是否有效
	 * @param token
	 * @param did
	 * @return
	 */
	public Boolean checkLogin(String token, String did);
	
}
