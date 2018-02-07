package com.shanyuan.platform.ms.core.statistics;

import java.util.List;

import com.github.pagehelper.Page;
import com.shanyuan.platform.ms.dao.statistics.entity.ProvideStatisticsBaseData;

/**
 * 帮扶侧统计
 * @author yangjian
 * @date 2018/01/05
 */
public interface ProvideStatisticsService {
	
	/**
	 * 批量插入数据库
	 * @author yangjian
	 * @param datas
	 */
	public void batchInsert(List<ProvideStatisticsBaseData> datas);
	
	public Page<ProvideStatisticsBaseData> getList(Integer cTime, Long countryId, List<Long> countryIds,Integer pageNum);

}
