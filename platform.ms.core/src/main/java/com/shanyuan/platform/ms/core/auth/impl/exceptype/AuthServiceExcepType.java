package com.shanyuan.platform.ms.core.auth.impl.exceptype;

import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType;

public interface AuthServiceExcepType extends CoreServiceExcepType{
	
	CoreServiceExcepType SEND_CODE_ERROR = new ExcepType("send_code_error");
	
	CoreServiceExcepType VALID_CODE_ERROR = new ExcepType("valid_code_error");
	
	CoreServiceExcepType NOT_IN_WHITELIST = new ExcepType("not_in_whitelist");
	
	CoreServiceExcepType TOO_MANY_TIMES = new ExcepType("too_many_times"); 
	
	CoreServiceExcepType INTERVAL_TOO_BRIEF = new ExcepType("interval_too_brief");
	
	CoreServiceExcepType REDIS_ERROR = new ExcepType("redis_error");
	
}
