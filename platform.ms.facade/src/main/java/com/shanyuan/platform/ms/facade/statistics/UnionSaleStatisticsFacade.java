package com.shanyuan.platform.ms.facade.statistics;

import java.util.Map;

public interface UnionSaleStatisticsFacade {

	/**
	 * 从指定的联盟销售数据分表中查询数据
	 * @param tableName
	 * @return
	 */
	public void insertSaleStatistics(Integer startTime);
	
	public Map<String, Object> getSaleStatistics(Integer startTime,Integer endTime,Integer unionId,Long areaId,Integer pageNum, Integer type);
}
