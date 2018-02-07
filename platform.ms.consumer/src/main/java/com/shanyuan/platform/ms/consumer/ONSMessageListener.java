package com.shanyuan.platform.ms.consumer;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.aliyun.openservices.ons.api.Action;
import com.aliyun.openservices.ons.api.ConsumeContext;
import com.aliyun.openservices.ons.api.Message;
import com.aliyun.openservices.ons.api.MessageListener;
import com.shanyuan.platform.ms.remote.mns.data.SyTopicMessage;
@Component
public class ONSMessageListener implements MessageListener {

	public Action consume(Message message, ConsumeContext context) {
		try {
			String body = new String(message.getBody(),"UTF-8");
			System.out.println("============"+body);
			SyTopicMessage topicMessage = JSON.parseObject(body, SyTopicMessage.class);
			System.out.println(topicMessage.getClassName());
			Map obj = (Map) topicMessage.getData();
			System.out.println(obj);
					
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		return Action.CommitMessage;
	}

}
