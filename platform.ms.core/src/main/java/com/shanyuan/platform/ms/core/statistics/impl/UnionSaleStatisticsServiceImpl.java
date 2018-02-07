package com.shanyuan.platform.ms.core.statistics.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.shanyuan.platform.ms.core.constant.StatisticsConstant;
import com.shanyuan.platform.ms.core.statistics.UnionSaleStatisticsService;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsBuyerInfo;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsSale;
import com.shanyuan.platform.ms.dao.statistics.entity.UnionSaleStatistics;
import com.shanyuan.platform.ms.dao.statistics.entity.UnionSaleStatisticsExample;
import com.shanyuan.platform.ms.dao.statistics.mapper.OrderStatisticsBuyerInfoMapper;
import com.shanyuan.platform.ms.dao.statistics.mapper.UnionSaleStatisticsMapper;

@Component
public class UnionSaleStatisticsServiceImpl implements UnionSaleStatisticsService{
	
	@Autowired
	private OrderStatisticsBuyerInfoMapper orderStatisticsBuyerInfoMapper;
	
	@Autowired
	UnionSaleStatisticsMapper unionSaleStatisticsMapper;

	/**
	 * 联盟销售统计
	 */
	@Override
	public List<OrderStatisticsBuyerInfo> unionSaleStatistics(Integer time,Integer unionid,Long countryid) {
		OrderStatisticsSale info = new OrderStatisticsSale();
		info.setStartTime(time);
		info.setUnionid(unionid);
		info.setCountryId(countryid);
		List<OrderStatisticsBuyerInfo> selectByBuyer = orderStatisticsBuyerInfoMapper.unionSaleStatistics(info);
		return selectByBuyer;
	}
	
	@Override
	public List<OrderStatisticsBuyerInfo> unionSelfHelpStatistics(Integer time,Integer unionid,Long countryid) {
		OrderStatisticsSale info = new OrderStatisticsSale();
		info.setStartTime(time);
		info.setUnionid(unionid);
		info.setCountryId(countryid);
		List<OrderStatisticsBuyerInfo> selectByBuyer = orderStatisticsBuyerInfoMapper.unionSelfHelpStatistics(info);
		return selectByBuyer;
	}
	
	/**
	 * 获取线下集采信息
	 * @author FZ
	 */
	@Override
	public List<OrderStatisticsBuyerInfo> selectFromOfflineInfo(Integer time,Integer assistid,Long countryid) {
		OrderStatisticsSale info = new OrderStatisticsSale();
		info.setStartTime(time);
		info.setAssistId(assistid);
		info.setCountryId(countryid);
		List<OrderStatisticsBuyerInfo> selectByBuyer = orderStatisticsBuyerInfoMapper.selectFromOfflineInfo(info);
		return selectByBuyer;
	}
	
	@Override
	public List<OrderStatisticsBuyerInfo> selectFromOfflineGoodsNum(Integer time,Integer assistid,Long countryid) {
		OrderStatisticsSale info = new OrderStatisticsSale();
		info.setStartTime(time);
		info.setAssistId(assistid);
		info.setCountryId(countryid);
		List<OrderStatisticsBuyerInfo> selectByBuyer = orderStatisticsBuyerInfoMapper.selectFromOfflineGoodsNum(info);
		return selectByBuyer;
	}
	
	@Override
	public List<OrderStatisticsBuyerInfo> selectSelfPrice(Integer time,Integer assistid,Long countryid) {
		OrderStatisticsSale info = new OrderStatisticsSale();
		info.setStartTime(time);
		info.setAssistId(assistid);
		info.setCountryId(countryid);
		List<OrderStatisticsBuyerInfo> selectByBuyer = orderStatisticsBuyerInfoMapper.selectSelfPrice(info);
		return selectByBuyer;
	}
	
	@Override
	public Map<String, Object> getSaleStatistics(Integer startTime,Integer endTime,Integer unionId,Long areaId,Integer pageNum, Integer type){
		Map<String, Object> map = new HashMap<String, Object>();
		UnionSaleStatisticsExample example = new UnionSaleStatisticsExample();
		if(ObjectUtils.isEmpty(unionId) && ObjectUtils.isEmpty(areaId)) {
			example.createCriteria().andCTimeBetween(startTime, endTime);
		}
		if(!ObjectUtils.isEmpty(unionId) && ObjectUtils.isEmpty(areaId)) {
			example.createCriteria().andCTimeBetween(startTime, endTime).andUnionIdEqualTo(unionId);
		}
		if(!ObjectUtils.isEmpty(unionId) && !ObjectUtils.isEmpty(areaId)) {
			example.createCriteria().andCTimeBetween(startTime, endTime).andAreaIdEqualTo(areaId).andUnionIdEqualTo(unionId);
		}
		if(ObjectUtils.isEmpty(unionId) && !ObjectUtils.isEmpty(areaId)){
			example.createCriteria().andCTimeBetween(startTime, endTime).andAreaIdEqualTo(areaId);
		}
		example.setOrderByClause("c_time");
		UnionSaleStatistics sum = unionSaleStatisticsMapper.selectSum(example);
		Page<UnionSaleStatistics> page;
		if(type.equals(StatisticsConstant.ReqType.EXPORT)){
			page = PageHelper.startPage(pageNum, StatisticsConstant.currentPage.LIMIT_PAGE);
			unionSaleStatisticsMapper.selectByExample(example);
		}else{
			page = PageHelper.startPage(pageNum, StatisticsConstant.currentPage.CURRENT_PAGE);
			unionSaleStatisticsMapper.selectByExample(example);
		}
		
		map.put("page", page);
		map.put("sum", sum);
		return map;
	}
	
}
