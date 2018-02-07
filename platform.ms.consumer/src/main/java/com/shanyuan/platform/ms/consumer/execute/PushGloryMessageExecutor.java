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
import com.shanyuan.platform.ms.core.user.GloryDealService;

@Component
public class PushGloryMessageExecutor implements TaskQueueExecute {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private GloryDealService gloryDealService;

	@Override
	public void executeTask(BaseMessage data) throws CoreServiceException {
		JSONObject jsonData = JSONObject.parseObject(data.getJsonData());
		gloryDealService.sendMessageForGlory(jsonData.getInteger("memberId"));
		logger.info("send glory message success, memberId: {}", jsonData.get("memberId"));
	}

	@Override
	public void fallbackTask(BaseMessage data) throws CoreServiceException {
		logger.info("pushGloryMessage exec error, fallback, time: {}", DateUtil.getTime());
	}


}
