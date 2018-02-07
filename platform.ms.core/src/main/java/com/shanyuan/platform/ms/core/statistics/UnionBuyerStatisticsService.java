package com.shanyuan.platform.ms.core.statistics;

import java.util.List;
import java.util.Map;

import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsBuyerInfo;

public interface UnionBuyerStatisticsService {
	
	public List<OrderStatisticsBuyerInfo> unionBuyerStatistics(Integer time, String channel);
	
	public Map<String, Object> getBuyerStatistics(Integer startTime,Integer endTime,Integer unionId,Integer pageNum, Integer type);

}
