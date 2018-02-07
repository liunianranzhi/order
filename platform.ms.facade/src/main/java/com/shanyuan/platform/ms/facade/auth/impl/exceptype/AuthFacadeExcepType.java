package com.shanyuan.platform.ms.facade.auth.impl.exceptype;

import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType;

public interface AuthFacadeExcepType extends CoreServiceExcepType {

	/**
	 * 更新联盟失败
	 */
	CoreServiceExcepType JOIN_CIRCIE_ERROR = new ExcepType("join_circle_error");
	
	/**
	 * 加入圈子失败
	 */
	CoreServiceExcepType UPDATE_WEAL_UNION_ERROR = new ExcepType("update_weal_union_error");
	
	/**
	 * 无效的手机号
	 */
	CoreServiceExcepType INVALID_MOBILE = new ExcepType("invalid_mobile");
	
	/**
	 * 短信发送失败
	 */
	CoreServiceExcepType SEND_ERROR = new ExcepType("send_error");
	
	/**
	 * 用户未注册
	 */
	CoreServiceExcepType NOT_REGISTER = new ExcepType("not_register");
	
	/**
	 * 手机号已绑定
	 */
	CoreServiceExcepType HAS_BIND = new ExcepType("has_bind");
	
	/**
	 * 微信未绑定
	 */
	CoreServiceExcepType UN_BIND = new ExcepType("unBind");
	
	/**
	 * 用户信息参数缺失
	 */
	CoreServiceExcepType MISS_USERINFO = new ExcepType("miss_userinfo");
	
	/**
	 * 更新用户信息失败
	 */
	CoreServiceExcepType UPDATE_INFO_ERROR = new ExcepType("update_info_error");
	
}
