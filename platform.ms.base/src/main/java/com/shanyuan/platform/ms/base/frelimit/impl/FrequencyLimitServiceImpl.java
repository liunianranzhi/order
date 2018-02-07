package com.shanyuan.platform.ms.base.frelimit.impl;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.stereotype.Component;

import com.shanyuan.platform.ms.base.frelimit.FrequencyLimitService;

/**
 * 
 * 频率限制工具
 * @author yangjian
 * @date 2017/11/14
 *
 */
@Component
public class FrequencyLimitServiceImpl implements FrequencyLimitService {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	/**
	 * 
	 * @param redisKey
	 * @param seconds
	 * @param times
	 * @return
	 */
	public boolean freLimit(String redisKey, Integer seconds, Integer times){
		boolean result = false;
		//定义redis操作
		ZSetOperations<String, String> opsForZSet = stringRedisTemplate.opsForZSet();
		
		Long endTime = System.currentTimeMillis()/1000;
		//设置最后一次发送
		Long startTime = endTime - seconds;
		//移出之前已无效的记录
		//当前redis中有效总条数
		Long count = opsForZSet.count(redisKey, startTime, endTime);
		//如果条数大于或等于条数限制，则抛出异常，发送太多次
		if(count >= times){
			logger.info("规定时间：{}秒内，请求次数：{}过多", seconds, count);
			return result;
		}
		String value = UUID.randomUUID().toString().replaceAll("-", "");
		//向set中添加新纪录
		result = opsForZSet.add(redisKey, value, endTime);
		if(!result){
			logger.info("add redis set error, key:{}, score:{}", opsForZSet, endTime);
			return result;
		}
		//当前有效的总条数
		count = opsForZSet.count(redisKey, startTime, endTime);
		if(count >= times){
			opsForZSet.removeRangeByScore(redisKey, 0, startTime);
			Long rank = opsForZSet.rank(redisKey, value);
			if(rank < times){
				return true;
			}else{
				opsForZSet.remove(redisKey, value);
				return false;
			}
		}
		return result;
	}
	
	
}
