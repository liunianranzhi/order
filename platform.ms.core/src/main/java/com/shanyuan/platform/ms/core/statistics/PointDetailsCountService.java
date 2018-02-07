package com.shanyuan.platform.ms.core.statistics;

import java.util.List;

import com.shanyuan.platform.ms.dao.statistics.entity.PointDetailsCount;

/**
 * 积分明细统计
 * @author yangjian
 * @date 2018/01/23
 *
 */
public interface PointDetailsCountService {
	
	int batchInsert(List<PointDetailsCount> records);
	
	List<PointDetailsCount> getDetailsByTime(Integer time, Integer unionId);

}
