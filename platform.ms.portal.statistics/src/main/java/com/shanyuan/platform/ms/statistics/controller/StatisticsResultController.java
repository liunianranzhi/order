package com.shanyuan.platform.ms.statistics.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.shanyuan.platform.ms.base.common.BaseController;
import com.shanyuan.platform.ms.base.common.vo.CommonVO;
import com.shanyuan.platform.ms.facade.statistics.StatisticsResultFacade;

/**
 * 查看统计结果
 * @author yangjian
 * @date 2018/01/21
 *
 */
@RestController
@RequestMapping("/stat-result")
public class StatisticsResultController extends BaseController {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private StatisticsResultFacade statisticsResultFacade;
	
	@GetMapping("/stat-last-time")
	public CommonVO getStatLastTime(){
		try {
			JSONObject statisticsLastTime = statisticsResultFacade.getStatisticsLastTime();
			return buildSuccessResp(statisticsLastTime);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			logger.info("error");
			return buildResp("获取上次执行时间失败", CODE_ERROR);
		}
	}
	
	@GetMapping("/stat-result")
	public CommonVO getStatisticsResultTime(
			@RequestParam(value = "start", required = true) Integer start,
			@RequestParam(value = "end", required = true) Integer end){
		try {
			JSONObject allStatusByType = statisticsResultFacade.getAllStatusByType(start, end);
			return buildSuccessResp(allStatusByType);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			logger.info("error");
			return buildResp("获取上次执行时间失败", CODE_ERROR);
		}
	}
	
}
