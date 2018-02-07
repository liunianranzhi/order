package com.shanyuan.platform.ms.core.store.impl.execptype;

import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType;
import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType.ExcepType;

public interface AgentExcepType {
	CoreServiceExcepType NO_MEMBERIDS = new ExcepType("memberId is null");  //订单创建失败

}
