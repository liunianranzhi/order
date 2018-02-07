package com.shanyuan.platform.ms.facade.statistics;

import java.util.List;
import java.util.Map;

import com.shanyuan.platform.ms.dao.statistics.entity.ProvideStatisticsBaseData;

/**
 * 供给侧统计
 * @author yangjian
 * @date 2018/01/05
 */
public interface ProvideStatisticsFacade {
	
	/**
	 * 获取要入库的有效数据
	 * @param time
	 * @param limit
	 * @return
	 */
	public List<ProvideStatisticsBaseData> getValidData(Integer time);
	
	/**
	 * 获取拥有上家商品的会员id 
	 * @return
	 */
	public List<Integer> memberHasGoods();
	
	/**
	 * 批量插入
	 * @param list
	 */
	public void batchInsert(List<ProvideStatisticsBaseData> list);
	
	/**
	 * 帮扶侧统计
	 * @param time
	 */
	public void statisticsProvideData(Integer time);
	
	/**
	 * 获取circle——channel
	 * @return
	 */
	public Map<Integer, String> getCircleChannel();

}
