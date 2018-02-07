package com.shanyuan.platform.ms.core.statistics;

import java.util.List;

import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsOfflineBizOrder;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsOfflineBizOrderGoods;

/**
 * 
 * @author yangjian
 * @date 2018/01/06
 */
public interface OrderStatisticsOfflineBizOrderService {
	
	public List<OrderStatisticsOfflineBizOrder> getValidOrder(Integer time);
	
	public List<OrderStatisticsOfflineBizOrderGoods> getBizOrderGoods(Integer orderId);
	
	public List<OrderStatisticsOfflineBizOrder> unionBuyerOfflineInfo(Integer cTime,String channel);

	public List<OrderStatisticsOfflineBizOrderGoods> unionBuyerOfflineInfo(Integer mainOrderId);
}
