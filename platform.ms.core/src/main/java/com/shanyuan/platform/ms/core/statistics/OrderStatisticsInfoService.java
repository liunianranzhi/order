package com.shanyuan.platform.ms.core.statistics;

import java.util.List;

import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsInfo;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsOfflineBizOrder;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsOfflineBizOrderGoods;
import com.shanyuan.platform.ms.dao.statistics.entity.PlatformStatisticsSellerData;
import com.shanyuan.platform.ms.dao.statistics.entity.UnionBuyerStatistics;
import com.shanyuan.platform.ms.dao.statistics.entity.UnionSaleStatistics;

/**
 * 
 * @author yangjian
 * @date 2017/12/29
 */
public interface OrderStatisticsInfoService {
	
	public PlatformStatisticsSellerData getPlatformStatisticsDate(Integer startTime,Integer endTime);

	/**
	 * 根据创建时间获取基础数据
	 * @param cTime
	 * @return
	 */
	List<OrderStatisticsInfo> getBaseData(Integer cTime);
	
	/**
	 * 根据开始时间和结束时间获取基础数据
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	List<OrderStatisticsInfo> getBaseData(Integer startTime, Integer endTime);
	
	/**
	 * 批量插入
	 * @param tableName
	 * @param records
	 */
	void batchInsert(String tableName, List<OrderStatisticsInfo> records);
	
	/**
	 * 批量插入集采订单统计表
	 * @param records
	 */
	public void bizOrderInsert(List<OrderStatisticsOfflineBizOrder> records);
	
	/**
	 * 批量插入集采订单商品表
	 * @param records
	 */
	public void bizOrderGoodsInsert(List<OrderStatisticsOfflineBizOrderGoods> records);
	
	/**
	 * 根据表名和时间查询
	 * @author yangjian
	 * @param cTime
	 * @param tableName
	 * @return
	 */
	public List<OrderStatisticsInfo> getBaseDataFromTableByCtime(Integer cTime, String tableName, Long countryId, Integer start, Integer limit);
	
	
	/**
	 * 获取联盟购买订单
	 * @param cTime
	 * @param tableName
	 * @param unionId
	 * @return
	 */
	public List<OrderStatisticsInfo> getBaseDataFromTableByUnion(Integer cTime, String tableName, String channel, List<Long> countryIds, Integer start, Integer limit);
	
	public List<OrderStatisticsInfo> getBaseDataForYkFromTableByUnion(Integer cTime, String tableName, Integer start, Integer limit);
	
	public Integer unionSaleBatchInsert(List<UnionSaleStatistics> records);
	
	public Integer unionBuyerBatchInsert(List<UnionBuyerStatistics> records);
}
