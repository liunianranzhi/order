package com.shanyuan.platform.ms.base.frelimit;

/**
 * 
 * 限流算法
 * @author 杨健
 * @date 2017/11/14
 *
 */
public interface FrequencyLimitService {
	
	public boolean freLimit(String redisKey, Integer seconds, Integer times);

}
