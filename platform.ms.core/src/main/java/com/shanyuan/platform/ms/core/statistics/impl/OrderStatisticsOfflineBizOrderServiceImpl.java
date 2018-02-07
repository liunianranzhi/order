package com.shanyuan.platform.ms.core.statistics.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.shanyuan.platform.ms.base.common.CommonRedisKey;
import com.shanyuan.platform.ms.core.statistics.OrderStatisticsOfflineBizOrderService;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsOfflineBizOrder;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsOfflineBizOrderExample;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsOfflineBizOrderGoods;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsOfflineBizOrderGoodsExample;
import com.shanyuan.platform.ms.dao.statistics.mapper.OrderStatisticsOfflineBizOrderGoodsMapper;
import com.shanyuan.platform.ms.dao.statistics.mapper.OrderStatisticsOfflineBizOrderMapper;

/**
 * 
 * @author yangjian
 * @date 2018/01/06
 */
@Component
public class OrderStatisticsOfflineBizOrderServiceImpl implements OrderStatisticsOfflineBizOrderService {
	
	@Autowired
	private OrderStatisticsOfflineBizOrderMapper orderStatisticsOfflineBizOrderMapper;
	
	@Autowired
	private OrderStatisticsOfflineBizOrderGoodsMapper orderStatisticsOfflineBizOrderGoodsMapper;

	@Override
	@Cacheable(value = CommonRedisKey.OrderStatistics.STATISTICS_BIZ_ORDER_SET, key = "'"+ CommonRedisKey.OrderStatistics.STATISTICS_BIZ_ORDER +"' + #time", unless = "#result == null")
	public List<OrderStatisticsOfflineBizOrder> getValidOrder(Integer time) {
		OrderStatisticsOfflineBizOrderExample example = new OrderStatisticsOfflineBizOrderExample();
		example.createCriteria().andCTimeLessThan(time);
		List<OrderStatisticsOfflineBizOrder> selectByExample = orderStatisticsOfflineBizOrderMapper.selectByExample(example);
		return selectByExample;
	}

	@Override
	@Cacheable(value = CommonRedisKey.OrderStatistics.STATISTICS_BIZ_ORDER_GOODS_SET, key = "'"+ CommonRedisKey.OrderStatistics.STATISTICS_BIZ_ORDER_GOODS +"' + #orderId", unless = "#result == null")
	public List<OrderStatisticsOfflineBizOrderGoods> getBizOrderGoods(Integer orderId) {
		OrderStatisticsOfflineBizOrderGoodsExample example = new OrderStatisticsOfflineBizOrderGoodsExample();
		example.createCriteria().andMainOrderIdEqualTo(orderId);
		List<OrderStatisticsOfflineBizOrderGoods> selectByExample = orderStatisticsOfflineBizOrderGoodsMapper.selectByExample(example);
		return selectByExample;
	}
	
	@Override
	public List<OrderStatisticsOfflineBizOrder> unionBuyerOfflineInfo(Integer cTime, String channel) {
		OrderStatisticsOfflineBizOrderExample example = new OrderStatisticsOfflineBizOrderExample();
		example.createCriteria().andCTimeEqualTo(cTime).andChannelEqualTo(channel);
		List<OrderStatisticsOfflineBizOrder> selectByExample = orderStatisticsOfflineBizOrderMapper.selectByExample(example);
		return selectByExample;
	}
	
	@Override
	public List<OrderStatisticsOfflineBizOrderGoods> unionBuyerOfflineInfo(Integer mainOrderId) {
		OrderStatisticsOfflineBizOrderGoodsExample example = new OrderStatisticsOfflineBizOrderGoodsExample();
		example.createCriteria().andMainOrderIdEqualTo(mainOrderId);
		List<OrderStatisticsOfflineBizOrderGoods> selectByExample = orderStatisticsOfflineBizOrderGoodsMapper.selectByExample(example);
		return selectByExample;
	}

}
