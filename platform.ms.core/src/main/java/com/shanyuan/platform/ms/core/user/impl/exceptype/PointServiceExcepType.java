package com.shanyuan.platform.ms.core.user.impl.exceptype;

import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType;

public interface PointServiceExcepType extends CoreServiceExcepType{
	
	/**
	 * 积分错误
	 */
	CoreServiceExcepType POINT_FAIL = new ExcepType("point_fail");
	
	/**
	 * 积分日志错误
	 */
	CoreServiceExcepType POINT_LOG_FAIL = new ExcepType("point_log_fail");
	CoreServiceExcepType SEND_SMS_FAIL = new ExcepType("SEND_SMS_FAIL");
	
	/**
	 * 编码转换异常
	 */
	CoreServiceExcepType UNSUPPORTED_ENCODING = new ExcepType("Unsupported_Encoding_Exception");
	
}
