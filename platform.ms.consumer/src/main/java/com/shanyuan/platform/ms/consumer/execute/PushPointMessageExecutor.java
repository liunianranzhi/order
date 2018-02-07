package com.shanyuan.platform.ms.consumer.execute;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.base.queue.redis.TaskQueueExecute;
import com.shanyuan.platform.ms.base.queue.redis.bean.BaseMessage;
import com.shanyuan.platform.ms.core.user.PointManageService;

/**
 * 消息推送实现
 * @author yangjian
 *
 */
@Component
public class PushPointMessageExecutor implements TaskQueueExecute {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private PointManageService pointManageService;

	@Override
	public void executeTask(BaseMessage data) throws CoreServiceException {
		JSONObject jsonData = JSONObject.parseObject(data.getJsonData());
		pointManageService.sendMessageForPoint(jsonData.getInteger("memberId"), jsonData.getInteger("points"));
		logger.info("send point message success, memberId:{}, points: {}", jsonData.get("memberId"), jsonData.get("points"));
	}

	@Override
	public void fallbackTask(BaseMessage data) throws CoreServiceException {
		logger.info("pushMessageExecutor exec error, fallback, time: {}", DateUtil.getTime());
	}
	
	
}
