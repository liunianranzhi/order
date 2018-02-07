package com.shanyuan.platform.ms.remote.mns;

import com.shanyuan.platform.ms.remote.mns.data.SyTopicMessage;

public interface TopicService {

	
	/**
	 * ons 发送消息 验证通过
	 * @param topic
	 * @param tag
	 * @param message
	 */
	public void sendTopicMessage(String topic,String tag,SyTopicMessage<?> message );
	
 
}
