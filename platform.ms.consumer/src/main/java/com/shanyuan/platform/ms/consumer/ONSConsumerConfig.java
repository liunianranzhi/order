package com.shanyuan.platform.ms.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.aliyun.openservices.ons.api.MessageListener;
import com.aliyun.openservices.ons.api.PropertyKeyConst;
import com.aliyun.openservices.ons.api.bean.ConsumerBean;
import com.aliyun.openservices.ons.api.bean.Subscription;

@Configuration
public class ONSConsumerConfig {

	@Autowired
	private ONSMessageListener conListener;
	@Autowired
	private ConsumerBean cb;
	
	@Bean
	public ConsumerBean getConsumerBean(@Value("${aliyun.mns.accessid}")String accessId,@Value("${aliyun.mns.accesskey}")String accessKey) {
		 Properties properties = new Properties();
	     properties.put(PropertyKeyConst.ConsumerId, "CID_lee_test_01");
	     properties.put(PropertyKeyConst.AccessKey, accessId);
	     properties.put(PropertyKeyConst.SecretKey, accessKey);
	     ConsumerBean bean = new ConsumerBean();
	     bean.setProperties(properties);
	     Map<Subscription, MessageListener> subscriptionTable = new HashMap<Subscription, MessageListener>();;
	     Subscription sub = new Subscription();
	     sub.setTopic("lee_test_01");
	     sub.setExpression("*");
	     subscriptionTable.put(sub, conListener);
	     bean.setSubscriptionTable(subscriptionTable);
	     bean.start();
	     return bean ;
	}
	@PreDestroy
	public void destory() {
		if(cb!=null &&cb.isStarted()) {
			cb.shutdown();
		}
	}
	
}
