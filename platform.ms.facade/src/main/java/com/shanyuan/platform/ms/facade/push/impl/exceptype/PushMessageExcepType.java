package com.shanyuan.platform.ms.facade.push.impl.exceptype;

import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType;

/**
 * 推送消息异常
 * @author yangjian
 * @date 2017/12/11
 *
 */
public interface PushMessageExcepType extends CoreServiceExcepType {
	
	CoreServiceExcepType PUSH_FAILED = new ExcepType("push_failed");

}
