package com.shanyuan.platform.ms.base.queue.redis;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.base.queue.redis.bean.BaseMessage;

public interface TaskQueueExecute {

	/**
	 * 任务执行方法
	 * @param key
	 * @param jsonData
	 * @throws CoreServiceException
	 */
	public void executeTask(BaseMessage data) throws CoreServiceException ;
	
	/**
	 * 任务回滚方法
	 * @param key
	 * @param jsonData
	 * @throws CoreServiceException
	 */
	public void fallbackTask(BaseMessage data) throws CoreServiceException;
	
	
}
