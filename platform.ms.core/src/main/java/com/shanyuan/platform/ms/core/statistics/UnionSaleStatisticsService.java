package com.shanyuan.platform.ms.core.statistics;

import java.util.List;
import java.util.Map;

import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsBuyerInfo;

public interface UnionSaleStatisticsService {
	
	/**
	 * 联盟销售统计
	 * @param cTime
	 * @param goodsProjectType
	 * @param unionid
	 * @param assistId
	 * @param sellerType
	 * @param areaid
	 * @return
	 */
	public List<OrderStatisticsBuyerInfo> unionSaleStatistics(Integer time,Integer unionid,Long countryid);
	
	public List<OrderStatisticsBuyerInfo> unionSelfHelpStatistics(Integer time,Integer unionid,Long countryid);
	
	/**
	 * 获取线下集采信息
	 * @return
	 */
	public List<OrderStatisticsBuyerInfo> selectFromOfflineInfo(Integer time,Integer assistid,Long countryid);
	
	public List<OrderStatisticsBuyerInfo> selectFromOfflineGoodsNum(Integer time,Integer assistid,Long countryid);
	
	public List<OrderStatisticsBuyerInfo> selectSelfPrice(Integer time,Integer assistid,Long countryid);
	
	public Map<String, Object> getSaleStatistics(Integer startTime,Integer endTime,Integer unionId,Long areaId,Integer pageNum, Integer type);

}
