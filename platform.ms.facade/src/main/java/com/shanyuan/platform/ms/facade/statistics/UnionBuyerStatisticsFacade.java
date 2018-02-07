package com.shanyuan.platform.ms.facade.statistics;

import java.util.Map;

public interface UnionBuyerStatisticsFacade {

	/**
	 * 从指定的联盟购买数据分表中查询销售联盟数据
	 */
	public void insertBuyerStatistics(Integer time);
	
	public Map<String, Object> getBuyerStatistics(Integer startTime,Integer endTime,Integer unionId,Integer pageNum, Integer type);
	
}
