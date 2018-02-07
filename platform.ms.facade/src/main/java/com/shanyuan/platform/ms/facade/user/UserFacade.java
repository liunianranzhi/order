package com.shanyuan.platform.ms.facade.user;


import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.user.bo.MemberInfo;
import com.shanyuan.platform.ms.core.user.bo.UserBaseinfo;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;

/**
 * @author 曹勇军
 *
 */
public interface UserFacade {
	SyMember getMemberByToken(String token);
	
	/**
	 * 获取用户在首页的相关信息
	 * @param memberId  用户id
	 * @param isLogin 是否登录
	 * @param curChannel  当前通道
	 * @return
	 * @author zhangwd
	 */
	MemberInfo getUserInfoToHome(Integer memberId, Boolean isLogin, String curChannel);
	/**
	 * @param channel 
	 * 获取用户基本信息
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return UserBaseinfo
	 * @throws
	 */
	UserBaseinfo getUserBaseinfo(SyMember member, String channel) throws CoreServiceException;
}
