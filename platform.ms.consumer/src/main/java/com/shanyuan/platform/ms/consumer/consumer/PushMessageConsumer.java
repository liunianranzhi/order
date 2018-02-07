package com.shanyuan.platform.ms.consumer.consumer;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import com.shanyuan.platform.ms.base.queue.redis.SubService;
import com.shanyuan.platform.ms.base.queue.redis.TaskQueueExecute;
import com.shanyuan.platform.ms.base.queue.redis.bean.Topic;
import com.shanyuan.platform.ms.consumer.execute.PushGloryMessageExecutor;
import com.shanyuan.platform.ms.consumer.execute.PushMessageExecutor;
import com.shanyuan.platform.ms.consumer.execute.PushPointMessageExecutor;
import com.shanyuan.platform.ms.core.constant.TopicConstant;

/**
 * 消息推送消费
 * @author yangjian
 * @date 2017/11/16
 *
 */
@Component
public class PushMessageConsumer {

	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	@Autowired
	private PushPointMessageExecutor pushPointMessageExecutor;
	
	@Autowired
	private PushGloryMessageExecutor pushGloryMessageExecutor;
	
	@Autowired
	private PushMessageExecutor pushMessageExecutor;
	
	private final int poolSize = 5;
	
	@PostConstruct
	public void pushPointMessage(){
		logger.info("pushPointMessage: i am starting");
		Topic t = new Topic(TopicConstant.PointPublish.POINT_TOPIC, TopicConstant.PointPublish.POINT_TAGNAME);
		List<TaskQueueExecute> exes  = new ArrayList<TaskQueueExecute>();
		exes.add(pushPointMessageExecutor);
		SubService subService = new SubService(stringRedisTemplate, t, exes, poolSize, "pushPointMessage");
		subService.start();
	}
	
	@PostConstruct
	public void pushGloryMessage(){
		logger.info("pushGloryMessage: i am starting");
		Topic t = new Topic(TopicConstant.GloryPublish.GLORY_TOPIC, TopicConstant.GloryPublish.GLORY_TAGNAME);
		List<TaskQueueExecute> exes = new ArrayList<TaskQueueExecute>();
		exes.add(pushGloryMessageExecutor);
		SubService subService = new SubService(stringRedisTemplate, t, exes, poolSize, "pushGloryMessage");
		subService.start();
	}
	
	@PostConstruct
	public void pushMessage(){
		logger.info("pushMessage: i am starting");
		Topic t = new Topic(TopicConstant.MessagePublish.MESSAGE_TOPIC, TopicConstant.MessagePublish.MESSAGE_TAGNAME);
		List<TaskQueueExecute> exes = new ArrayList<TaskQueueExecute>();
		exes.add(pushMessageExecutor);
		SubService subService = new SubService(stringRedisTemplate, t, exes, poolSize, "pushMessage");
		subService.start();
	}
	
	@PostConstruct
	public void sendNotify(){
		logger.info("sendNotify: i am starting");
		Topic t = new Topic(TopicConstant.MessagePublish.NOTIFY_TOPIC, TopicConstant.MessagePublish.NOTIFY_TAGNAME);
		List<TaskQueueExecute> exes = new ArrayList<TaskQueueExecute>();
		exes.add(pushMessageExecutor);
		SubService subService = new SubService(stringRedisTemplate, t, exes, poolSize, "sendNotify");
		subService.start();
	}
	
}
