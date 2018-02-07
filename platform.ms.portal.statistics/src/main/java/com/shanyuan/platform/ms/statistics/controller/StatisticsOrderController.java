//package com.shanyuan.platform.ms.statistics.controller;
//
//import java.util.List;
//import java.util.Map;
//
//import javax.annotation.PostConstruct;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.data.redis.core.ValueOperations;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.alibaba.fastjson.JSONObject;
//import com.shanyuan.platform.ms.base.common.util.StatisticsUtils;
//import com.shanyuan.platform.ms.base.common.util.VerifyCodeUtils;
//import com.shanyuan.platform.ms.core.constant.StatisticsConstant;
//import com.shanyuan.platform.ms.facade.statistics.AssistStatisticsFacade;
//import com.shanyuan.platform.ms.facade.statistics.OrderStatisticsCircleFacade;
//import com.shanyuan.platform.ms.facade.statistics.OrderStatisticsFacade;
//import com.shanyuan.platform.ms.facade.statistics.ProvideStatisticsFacade;
//
///**
// * 手动操作数据
// * @author yangjian
// * @date 2017/12/29
// *
// */
//@Controller
//@RequestMapping("/stat-order")
//public class StatisticsOrderController {
//	
//	protected Logger logger = LoggerFactory.getLogger(getClass());
//	
//	@Autowired
//	private OrderStatisticsFacade orderStatisticsFacade;
//	
//	@Autowired
//	private ProvideStatisticsFacade provideStatisticsFacade;
//	
//	@Autowired
//	private AssistStatisticsFacade assistStatisticsFacade;
//	
//	@Autowired
//	private OrderStatisticsCircleFacade orderStatisticsCircleFacade;
//	
//	@Autowired
//	private StringRedisTemplate stringRedisTemplate;
//	
//
//	@GetMapping(value = "/ops-for-base")
//	public void opfForBase(@RequestParam(value = "startTime", required = true) Integer startTime,
//			@RequestParam(value = "endTime", required = true) Integer endTime,
//			@RequestParam(value = "limit", required = true) Integer limit){
//		orderStatisticsFacade.statisticsBaseData(startTime, endTime, limit);
//	}
//	
//	@GetMapping(value = "/ops-for-provide")
//	public void opsForProvide(@RequestParam(value = "time", required = true) Integer time){
//		provideStatisticsFacade.statisticsProvideData(time);
//	}
//	
//	@GetMapping(value = "/ops-for-points")
//	public void opsForPoint(@RequestParam(value = "limit", required = true) Integer limit){
//		orderStatisticsFacade.getUserPointsStatistics(limit);
//	}
//	
//	@GetMapping(value = "/ops-for-assist")
//	public void pofForAssist(@RequestParam(value = "time", required = true) Integer time){
//		assistStatisticsFacade.statisticsData(time);
//	}
//	
//	@PostConstruct
//	public void initCircleInfo(){
//		StatisticsUtils.getStatisticsUtils().setCircleInfo(orderStatisticsFacade.getAllCircleInfos()); 
//	}
//	
//	@PostConstruct
//	public void initAreaInfo() {
//		JSONObject areaInfos = orderStatisticsFacade.getAreaInfos();
//		StatisticsUtils.getStatisticsUtils().setAreaInfo(areaInfos);
//	}
//	
//	@PostConstruct
//	public void initMemberHasGoods(){
//		List<Integer> memberHasGoods = provideStatisticsFacade.memberHasGoods();
//		StatisticsUtils.getStatisticsUtils().setMemberHasGoods(memberHasGoods);
//	}
//	
//	@PostConstruct
//	public void initCircleChannel(){
//		Map<Integer, String> circleChannel = provideStatisticsFacade.getCircleChannel();
//		StatisticsUtils.getStatisticsUtils().setCircleChannel(circleChannel);
//	}
//	
//	@PostConstruct
//	public void initChannelUnion(){
//		StatisticsUtils.getStatisticsUtils().setChannelUnion(orderStatisticsCircleFacade.getChannelUnion());
//	}
//	
//	@PostConstruct
//	public void genReqKey(){
//		ValueOperations<String, String> opsForValue = stringRedisTemplate.opsForValue();
//		opsForValue.set(StatisticsConstant.RedisKey.STATISTICS_REQUEST_KEY, VerifyCodeUtils.generateVerifyCode(8));
//	}
//	
//
//}
