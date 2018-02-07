package com.shanyuan.platform.ms.facade.statistics.impl;

import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.StatisticsConstant;
import com.shanyuan.platform.ms.facade.statistics.StatisticsResultFacade;
import com.shanyuan.platform.ms.facade.statistics.impl.exceptype.StatisticsFacadeExcepType;

/**
 * 
 * @author yangjian
 * @date 2018/01/21
 *
 */
@Component
public class StatisticsResultFacadeImpl implements StatisticsResultFacade {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Override
	public JSONObject getStatisticsLastTime() {
		ValueOperations<String, String> opsForValue = stringRedisTemplate.opsForValue();
		JSONObject result = new JSONObject();
		String assistLastTime = opsForValue.get(StatisticsConstant.RedisKey.ASSIST_LAST_TIME);
		result.put("assistLastTime", assistLastTime);
		String overLastTime = opsForValue.get(StatisticsConstant.RedisKey.OVERVIEW_LAST_TIME);
		result.put("overLastTime", overLastTime);
		String platformLastTime = opsForValue.get(StatisticsConstant.RedisKey.PLATFORM_LAST_TIME);
		result.put("platformLastTime", platformLastTime);
		String pointLastTime = opsForValue.get(StatisticsConstant.RedisKey.POINT_LAST_TIME);
		result.put("pointLastTime", pointLastTime);
		String provideLastTime = opsForValue.get(StatisticsConstant.RedisKey.PROVIDE_LAST_TIME);
		result.put("provideLastTime", provideLastTime);
		String unionBuyLastTime = opsForValue.get(StatisticsConstant.RedisKey.UNION_BUY_LAST_TIME);
		result.put("unionBuyLastTime", unionBuyLastTime);
		String unionSaleLastTime = opsForValue.get(StatisticsConstant.RedisKey.UNION_SELL_LAST_TIME);
		result.put("unionSaleLastTime", unionSaleLastTime);
		return result;
	}

	@Override
	public JSONObject getAllStatusByType(Integer start, Integer end) throws CoreServiceException {
		if(!checkDate(start, end)){
			logger.info("起始时间或者结束时间不正确，start:{}, end:{}", start, end);
			throw new CoreServiceException(StatisticsFacadeExcepType.PARAM_ERROR);
			
		}
		ZSetOperations<String, String> opsForZSet = stringRedisTemplate.opsForZSet();
		List<Integer> betweenYearMonthDay = DateUtil.getBetweenYearMonthDay(start, end);
		Integer size = betweenYearMonthDay.size();
		if(size > 30){
			List<Integer> subList = betweenYearMonthDay.subList(size - 30, size);
			start = subList.get(0);
		}
		JSONObject result = new JSONObject();
		Set<String> assistResultSet = opsForZSet.rangeByScore(StatisticsConstant.RedisKey.ASSIST_RESULT_SET, start, end);
		result.put("assistResultSet", assistResultSet);
		Set<String> overviewResultSet = opsForZSet.rangeByScore(StatisticsConstant.RedisKey.OVERVIEW_SET, start, end);
		result.put("overviewResultSet", overviewResultSet);
		Set<String> platformResultSet = opsForZSet.rangeByScore(StatisticsConstant.RedisKey.PLATFORM_SET, start, end);
		result.put("platformResultSet", platformResultSet);
		Set<String> pointResultSet = opsForZSet.rangeByScore(StatisticsConstant.RedisKey.POINT_SET, start, end);
		result.put("pointResultSet", pointResultSet);
		Set<String> porvideResultSet = opsForZSet.rangeByScore(StatisticsConstant.RedisKey.PROVIDE_RESULT_SET, start, end);
		result.put("provideResultSet", porvideResultSet);
		Set<String> unionBuyResultSet = opsForZSet.rangeByScore(StatisticsConstant.RedisKey.UNION_BUY_RESULT_SET, start, end);
		result.put("unionBuyResultSet", unionBuyResultSet);
		Set<String> unionSaleResultSet = opsForZSet.rangeByScore(StatisticsConstant.RedisKey.UNION_SELL_SET, start, end);
		result.put("unionSaleResultSet", unionSaleResultSet);
		return result;
	}
	
	private Boolean checkDate(Integer start, Integer end){
		Integer smallest = 20161001;
		Integer biggest = DateUtil.getYYYYMMDDByDate(DateUtil.getBeforeDate());
		if(start < smallest || end > biggest){
			return false;
		}else{
			return true;
		}
	}

}
