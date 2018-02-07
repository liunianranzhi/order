package com.shanyuan.platform.ms.core.user;

public interface SendMessageInfoService {

	/**
	 * 发送站内消息
	 * @param memberId
	 * @param points
	 * @param token
	 */
	void sendmessageToMember(Integer memberId ,int fromId ,String title ,String body,String pageUrl,int orderId,byte messageType);
	
	
	
}
