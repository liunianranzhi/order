package com.shanyuan.platform.ms.facade.auth;

import java.util.List;
import java.util.Map;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.user.bo.LoginInfo;
import com.shanyuan.platform.ms.facade.auth.domain.CircleInfoDomain;
import com.shanyuan.platform.ms.facade.auth.domain.SelectCircleDomain;
import com.shanyuan.platform.ms.facade.auth.domain.UnionDomain;

public interface AuthFacade {
	
	/**
	 * 发送短信验证码
	 * @param phone 登录信息
	 * @return
	 * @throws CoreServiceException
	 */
	public Map<String, Object> sendValidSmsCode(String phone) throws CoreServiceException;
	
	/**
	 * 根据范围发送短信
	 * @param mobile
	 * @param range
	 * @return
	 * @throws CoreServiceException
	 */
	public Map<String, Object> sendValidSmsCodeByRange(String mobile, String range) throws CoreServiceException;
	
	/**
	 * 登录操作
	 * @param loginInfo 
	 * @return
	 * @throws CoreServiceException
	 */
	public Map<String, Object> doLogin(LoginInfo loginInfo) throws CoreServiceException;

	/**
	 * 完善用户信息
	 * @param memberId 用户id
	 * @param memberName 用户名称
	 * @param memberAvatar 用户头像
	 * @param memberSex 用户性别
	 * @param inviteCode 邀请码
	 * @param circleId 要加入圈子id
	 * @return
	 * @throws CoreServiceException
	 */
	public Map<String, Object> improveInfo(Integer memberId, String memberName, String memberAvatar, Byte memberSex, String inviteCode, Integer circleId) throws CoreServiceException;
	
	/**
	 * 获取完善信息联盟列表
	 * @return
	 * @throws CoreServiceException
	 */
	public UnionDomain getAllUnion() throws CoreServiceException;
	
	/**
	 * 根据联盟id获取其子部门信息
	 * @param circleId
	 * @return
	 * @throws CoreServiceException
	 */
	public CircleInfoDomain getSubCircleInfo(Integer circleId) throws CoreServiceException;
	
	public List<SelectCircleDomain> selectCircleInfo(String circleName, String channel) throws CoreServiceException;
	
}
