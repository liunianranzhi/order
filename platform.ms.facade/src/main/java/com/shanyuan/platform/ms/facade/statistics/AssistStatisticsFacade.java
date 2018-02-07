package com.shanyuan.platform.ms.facade.statistics;

import java.util.List;

import com.shanyuan.platform.ms.dao.statistics.entity.AssistStatisticsBaseData;

/**
 * 帮扶侧统计
 * @author yangjian
 * @date 2018/01/08
 *
 */
public interface AssistStatisticsFacade {
	
	/**
	 * 获取要插入的数据
	 * @author yangjian
	 * @param time
	 * @return
	 */
	public List<AssistStatisticsBaseData> getValidData(Integer time);
	
	public void batchInsert(List<AssistStatisticsBaseData> records);
	
	public void statisticsData(Integer time);

}
