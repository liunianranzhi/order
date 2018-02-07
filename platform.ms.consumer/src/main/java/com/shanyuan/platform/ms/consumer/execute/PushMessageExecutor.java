package com.shanyuan.platform.ms.consumer.execute;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.base.common.util.JsonUtils;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.base.queue.redis.TaskQueueExecute;
import com.shanyuan.platform.ms.base.queue.redis.bean.BaseMessage;
import com.shanyuan.platform.ms.core.user.SendMessageInfoService;
import com.shanyuan.platform.ms.facade.push.domain.MessageDomain;

/**
 * 站内信推送执行方法
 * @author yangjian
 * @date 2017/12/11
 *
 */
@Component
public class PushMessageExecutor implements TaskQueueExecute {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private SendMessageInfoService sendMessageInfoService;
	
	@Override
	public void executeTask(BaseMessage data) throws CoreServiceException {
		try{
//			MessageDomain message = (MessageDomain) JSON.parse(data.getJsonData());
			MessageDomain message = JsonUtils.jsonToPojo(data.getJsonData(), MessageDomain.class);
			sendMessageInfoService.sendmessageToMember(message.getMemberId(), message.getFromId(), message.getTitle(), message.getBody(), message.getPageUrl(), message.getOrderId(), message.getMessageType());
			if(logger.isDebugEnabled()){
				logger.debug("PushMessageExecutor exec success, time: {}", DateUtil.getNowDate());
			}
		}catch(Exception e){
			logger.info("消息发送失败，消息内容：{}", data.getJsonData());
			logger.error(e.getMessage(), e);
		}
	}

	@Override
	public void fallbackTask(BaseMessage data) throws CoreServiceException {
		logger.info("PushMessageExecutor exec error, time: {}", DateUtil.getNowDate());
	}

}
