package com.shanyuan.platform.ms.core.topic.impl.exceptype;

import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType;

public interface SyTopicServiceExcepType extends CoreServiceExcepType{
	
	CoreServiceExcepType topic_status_error = new ExcepType("topic_status_error");
	CoreServiceExcepType topic_info_error = new ExcepType("topic_info_error");
	CoreServiceExcepType topic_floor_error = new ExcepType("topic_floor_error");
	CoreServiceExcepType params_error = new ExcepType("params_error");
	CoreServiceExcepType topic_storage_error = new ExcepType("topic_storage_error");
	CoreServiceExcepType update_topic_error = new ExcepType("update_topic_error");
}
