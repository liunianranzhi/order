package com.shanyuan.platform.ms.remote.mns.impl;

import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.aliyun.mns.client.CloudAccount;
import com.aliyun.mns.client.CloudQueue;
import com.aliyun.mns.client.MNSClient;
import com.aliyun.mns.model.Message;
import com.aliyun.openservices.ons.api.ONSFactory;
import com.aliyun.openservices.ons.api.Producer;
import com.aliyun.openservices.ons.api.PropertyKeyConst;
import com.aliyun.openservices.ons.api.SendResult;
import com.shanyuan.platform.ms.remote.mns.TopicService;
import com.shanyuan.platform.ms.remote.mns.data.SyTopicMessage;
@Component
@Lazy(true)
public class TopicServiceImpl implements TopicService {

	final Logger logger = Logger.getLogger(getClass());
	
	
	private MNSClient mnsClient;
	@Value("${aliyun.mns.accessid}")
	private String accessId;
	@Value("${aliyun.mns.accesskey}")
	private String accessKey;
	@Value("${aliyun.mns.endpoint}")
	private String endPoint;
	@Value("${aliyun.ons.producerid}")
	private String producerId;
	
	
	private Producer producer;
	@PostConstruct
	public void initMNSClient() {
		 Properties properties = new Properties();
	       properties.put(PropertyKeyConst.ProducerId, producerId);
	       properties.put(PropertyKeyConst.AccessKey, accessId);
	       properties.put(PropertyKeyConst.SecretKey, accessKey);
	       //公有云生产环境：http://onsaddr-internal.aliyun.com:8080/rocketmq/nsaddr4client-internal
	       //公有云公测环境：http://onsaddr-internet.aliyun.com/rocketmq/nsaddr4client-internet
	       //杭州金融云环境：http://jbponsaddr-internal.aliyun.com:8080/rocketmq/nsaddr4client-internal
	       //杭州深圳云环境：http://mq4finance-sz.addr.aliyun.com:8080/rocketmq/nsaddr4client-internal
//	       properties.put(PropertyKeyConst.ONSAddr,
//	          "http://onsaddr-internal.aliyun.com:8080/rocketmq/nsaddr4client-internal");//此处以公有云生产环境为例
	       producer = ONSFactory.createProducer(properties);
	       producer.start();
		
		 CloudAccount account = new CloudAccount(accessId, accessKey, endPoint);
		 this.mnsClient=account.getMNSClient();
	}
	@PreDestroy
	public void destoryMNSClient() {
		if(this.mnsClient!=null) {
			mnsClient.close();
		}
		if(this.producer!=null&&producer.isStarted()) {
			producer.shutdown();
		}
	}
	
	public void sendTopicMessage(String topic, String tag, SyTopicMessage<?> message) {
		 
		try {
            String messageStr = JSON.toJSONString(message);
            com.aliyun.openservices.ons.api.Message msg = new com.aliyun.openservices.ons.api.Message(topic,tag,messageStr.getBytes("UTF-8"));
            msg.setKey(message.getSerialNum());
            SendResult sendResult  =this.producer.send(msg); 
            if(logger.isDebugEnabled()) {
            	logger.debug("send message "+messageStr);
            }
        } catch (Exception e) {
           logger.error("sendTopicMessage error "+e.getMessage(),e);
        }
		return ;
		
	}

}
