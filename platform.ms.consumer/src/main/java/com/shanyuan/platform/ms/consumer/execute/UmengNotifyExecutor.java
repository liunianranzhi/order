package com.shanyuan.platform.ms.consumer.execute;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.base.common.util.JsonUtils;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.base.queue.redis.TaskQueueExecute;
import com.shanyuan.platform.ms.base.queue.redis.bean.BaseMessage;
import com.shanyuan.platform.ms.core.member.PushService;
import com.shanyuan.platform.ms.facade.push.domain.UmengPushDomain;

@Component 
public class UmengNotifyExecutor implements TaskQueueExecute {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private PushService pushService;

	@Override
	public void executeTask(BaseMessage data) throws CoreServiceException {
		try{
			UmengPushDomain umengPushDOmain = JsonUtils.jsonToPojo(data.getJsonData(), UmengPushDomain.class);
			boolean result = pushService.sendNotifyByTokenUmeng(umengPushDOmain.getType(), umengPushDOmain.getToken(), umengPushDOmain.getTicker(), 
					umengPushDOmain.getTitle(), umengPushDOmain.getText(), umengPushDOmain.getExtra());
			if(logger.isDebugEnabled()){
				logger.debug("UmengNotifyExecutor exec success, time: {}", DateUtil.getNowDate());
			}
			if(result){
				logger.info("消息推送成功！消息内容：{}", data.getJsonData());
			}else{
				logger.error("消息推送失败，消息内容：{}", data.getJsonData());
			}
		}catch(Exception e){
			logger.info("推送通知失败，消息内容：{}", data.getJsonData());
		}
	}

	@Override
	public void fallbackTask(BaseMessage data) throws CoreServiceException {
		logger.info("UmengNotifyExecutor exec error, fallback, time: {}", DateUtil.getNowDate());
	}

}
