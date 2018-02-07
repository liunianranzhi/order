package com.shanyuan.platform.ms.core.user.impl.exceptype;

import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType;

/**
 * 绑定第三方异常类型
 * @author zhangwd
 *
 */
public interface BindThirdPlatformIDException extends CoreServiceExcepType {

	/**
     * 绑定微信失败
     */
    CoreServiceExcepType BIND_WX_FAILED = new ExcepType("bind_wx_failed");
	
    /**
     * 绑定第三方平台失败
     */
    CoreServiceExcepType BIND_THIRD_FAILED = new ExcepType("bind_third_failed");
}
