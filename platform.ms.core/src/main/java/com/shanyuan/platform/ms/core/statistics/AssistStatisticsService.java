package com.shanyuan.platform.ms.core.statistics;

import java.util.List;

import com.github.pagehelper.Page;
import com.shanyuan.platform.ms.dao.statistics.entity.AssistStatisticsBaseData;

/**
 * 帮扶侧统计
 * @author yangjian
 * @date 2018/01/05
 *
 */
public interface AssistStatisticsService {
	
	public void batchInsert(List<AssistStatisticsBaseData> records);
	
	public Page<AssistStatisticsBaseData> getAssistData(Integer time,Integer unionId, Integer pageNum);

}
