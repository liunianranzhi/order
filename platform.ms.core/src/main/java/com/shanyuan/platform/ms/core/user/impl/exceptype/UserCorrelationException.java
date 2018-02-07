package com.shanyuan.platform.ms.core.user.impl.exceptype;

import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType;

public interface UserCorrelationException extends CoreServiceExcepType{

	
	/**
     * 用户注册失败
     */
    CoreServiceExcepType USER_REGISTER_FAILED = new ExcepType("user_register_failed");

    //没有该用户信息
    CoreServiceExcepType USER_NOT_EXIST = new ExcepType("user_not_exist");
    CoreServiceExcepType OTHER_LOGINING = new ExcepType("OTHER_LOGINING");
}
