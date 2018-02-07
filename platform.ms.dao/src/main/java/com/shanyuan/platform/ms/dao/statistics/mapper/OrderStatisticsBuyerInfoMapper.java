package com.shanyuan.platform.ms.dao.statistics.mapper;

import java.util.List;

import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsBuyerInfo;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsInfo;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsSale;

public interface OrderStatisticsBuyerInfoMapper {
    
	/**
	 * 获取联盟统计信息
	 * @param orderStatisticsInfo
	 * @return
	 */
	List<OrderStatisticsBuyerInfo> selectStatisticsInfo(OrderStatisticsSale orderStatisticsInfo);
    
    /**
     * 获取线下采集信息
     * @param orderStatisticsInfo
     * @return
     */
    List<OrderStatisticsBuyerInfo> selectFromOfflineInfo(OrderStatisticsSale orderStatisticsInfo);

    List<OrderStatisticsBuyerInfo> selectFromOfflineGoodsNum(OrderStatisticsSale orderStatisticsInfo);

    List<OrderStatisticsBuyerInfo> selectSelfPrice(OrderStatisticsSale orderStatisticsInfo);
    
    OrderStatisticsBuyerInfo getSelfhelpPrice(OrderStatisticsInfo orderStatisticsInfo);
    
    OrderStatisticsBuyerInfo selectPlatformStatisticsInfo(OrderStatisticsInfo orderStatisticsInfo);
    
    OrderStatisticsBuyerInfo getPlatformSelfhelpPrice(OrderStatisticsInfo orderStatisticsInfo);
    
    /**
     * 联盟销售统计
     * @param orderStatisticsInfo
     * @return
     */
    List<OrderStatisticsBuyerInfo> unionSaleStatistics(OrderStatisticsSale orderStatisticsInfo);
    
    List<OrderStatisticsBuyerInfo> unionSelfHelpStatistics(OrderStatisticsSale orderStatisticsInfo);
    
    List<OrderStatisticsBuyerInfo> unionBuyerStatistics(OrderStatisticsSale orderStatisticsInfo);
}