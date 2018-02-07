package com.shanyuan.platform.ms.core.user.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shanyuan.platform.ms.core.user.SendMessageInfoService;
import com.shanyuan.platform.ms.dao.user.entity.SyMessage;
import com.shanyuan.platform.ms.dao.user.mapper.SyMessageMapper;



@Component
public class SendMessageInfoServiceImpl implements SendMessageInfoService {

	private final Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	private SyMessageMapper  syMessageMapper;
	
	/**
	 * 发送站内消息
	 * @param memberId
	 * @param points
	 * @param token
	 */
	public void sendmessageToMember(Integer memberId ,int fromId ,String title ,String body,String pageUrl,int orderId,byte messageType) {
		int ntime = (int) (System.currentTimeMillis()/1000);
		
		SyMessage message = new SyMessage();
		message.setMessageTitle(title);
		message.setMessageBody(body);
		message.setMessageLink(pageUrl);
		message.setMessageType(messageType);
		message.setFromMemberId(fromId);
		message.setToMemberId(memberId+"");
		message.setMessageTime(ntime+"");
		message.setMessageState((byte) 40);
		message.setOrderId(orderId);
		message.setMessageParentId(0);
		
		this.syMessageMapper.insertSelective(message);
	}
}
