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
import com.shanyuan.platform.ms.core.statistics.UnionBuyerStatisticsService;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsBuyerInfo;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsSale;
import com.shanyuan.platform.ms.dao.statistics.entity.UnionBuyerStatistics;
import com.shanyuan.platform.ms.dao.statistics.entity.UnionBuyerStatisticsExample;
import com.shanyuan.platform.ms.dao.statistics.mapper.OrderStatisticsBuyerInfoMapper;
import com.shanyuan.platform.ms.dao.statistics.mapper.UnionBuyerStatisticsMapper;

@Component
public class UnionBuyerStatisticsServiceImpl implements UnionBuyerStatisticsService{
	
	@Autowired
	private OrderStatisticsBuyerInfoMapper orderStatisticsBuyerInfoMapper;
	
	@Autowired
	private UnionBuyerStatisticsMapper unionBuyerStatisticsMapper;
	
	/**
	 * 获取联盟购买数据
	 */
	@Override
	public List<OrderStatisticsBuyerInfo> unionBuyerStatistics(Integer time, String channel) {
		OrderStatisticsSale info = new OrderStatisticsSale();
		info.setStartTime(time);
		info.setChannel(channel);
		List<OrderStatisticsBuyerInfo> unionBuyer = orderStatisticsBuyerInfoMapper.unionBuyerStatistics(info);
		return unionBuyer;
	}

	@Override
	public Map<String, Object> getBuyerStatistics(Integer startTime, Integer endTime, Integer unionId,
			Integer pageNum, Integer type) {
		Map<String, Object> map = new HashMap<String, Object>();
		UnionBuyerStatisticsExample example = new UnionBuyerStatisticsExample();
		if(!ObjectUtils.isEmpty(unionId)) {
			example.createCriteria().andCTimeBetween(startTime, endTime).andUnionIdEqualTo(unionId);
		}
		if(ObjectUtils.isEmpty(unionId)) {
			example.createCriteria().andCTimeBetween(startTime, endTime);
		}
		UnionBuyerStatistics sum = unionBuyerStatisticsMapper.selectSum(example);
		Page<UnionBuyerStatistics> page;
		example.setOrderByClause("c_time");
		if(type.equals(StatisticsConstant.ReqType.EXPORT)){
			page = PageHelper.startPage(pageNum, StatisticsConstant.currentPage.LIMIT_PAGE);
			unionBuyerStatisticsMapper.selectByExample(example);
		}else{
			page = PageHelper.startPage(pageNum, StatisticsConstant.currentPage.CURRENT_PAGE);
			unionBuyerStatisticsMapper.selectByExample(example);
		}
		map.put("page", page);
		map.put("sum", sum);
		return map;
	}

}
