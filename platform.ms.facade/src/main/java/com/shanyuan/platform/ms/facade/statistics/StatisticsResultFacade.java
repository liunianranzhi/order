package com.shanyuan.platform.ms.facade.statistics;

import com.alibaba.fastjson.JSONObject;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;

/**
 * 统计结果查看
 * @author yangjian
 * @date 2018/01/21
 *
 */
public interface StatisticsResultFacade {
	
	/**
	 * 获取所有统计上次统计时间
	 * @return
	 */
	public JSONObject getStatisticsLastTime();
	
	public JSONObject getAllStatusByType(Integer start, Integer end) throws CoreServiceException;

}
