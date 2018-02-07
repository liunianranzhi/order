package com.shanyuan.platform.ms.core.statistics.impl;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shanyuan.platform.ms.core.constant.StatisticsConstant;
import com.shanyuan.platform.ms.core.statistics.OrderStatisticsInfoService;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsInfo;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsInfoExample;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsInfoExample.Criteria;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsOfflineBizOrder;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsOfflineBizOrderGoods;
import com.shanyuan.platform.ms.dao.statistics.entity.PlatformStatisticsSellerData;
import com.shanyuan.platform.ms.dao.statistics.entity.PlatformStatisticsSellerDataExample;
import com.shanyuan.platform.ms.dao.statistics.entity.UnionBuyerStatistics;
import com.shanyuan.platform.ms.dao.statistics.entity.UnionSaleStatistics;
import com.shanyuan.platform.ms.dao.statistics.mapper.OrderStatisticsInfoMapper;
import com.shanyuan.platform.ms.dao.statistics.mapper.OrderStatisticsOfflineBizOrderGoodsMapper;
import com.shanyuan.platform.ms.dao.statistics.mapper.OrderStatisticsOfflineBizOrderMapper;
import com.shanyuan.platform.ms.dao.statistics.mapper.PlatformStatisticsSellerDataMapper;
import com.shanyuan.platform.ms.dao.statistics.mapper.UnionBuyerStatisticsMapper;
import com.shanyuan.platform.ms.dao.statistics.mapper.UnionSaleStatisticsMapper;

@Component
public class OrderStatisticsInfoServiceImpl implements OrderStatisticsInfoService {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private OrderStatisticsInfoMapper orderStatisticsInfoMapper;
	
	@Autowired
	private OrderStatisticsOfflineBizOrderMapper orderStatisticsOfflineBizOrderMapper;
	
	@Autowired
	private OrderStatisticsOfflineBizOrderGoodsMapper orderStatisticsOfflineBizOrderGoodsMapper;
	
	@Autowired
	private UnionSaleStatisticsMapper unionSaleStatisticsMapper;
	
	@Autowired
	UnionBuyerStatisticsMapper unionBuyerStatisticsMapper;
	
	@Autowired
	PlatformStatisticsSellerDataMapper platformStatisticsSellerDataMapper;
	
	public PlatformStatisticsSellerData getPlatformStatisticsDate(Integer startTime,Integer endTime) {
		PlatformStatisticsSellerDataExample example = new PlatformStatisticsSellerDataExample();
		example.createCriteria().andCTimeBetween(startTime, endTime);
		PlatformStatisticsSellerData statisticsTotalDate = platformStatisticsSellerDataMapper.getStatisticsTotalDate(example);
		return statisticsTotalDate;
	}
	@Override
	public List<OrderStatisticsInfo> getBaseData(Integer cTime) {
		OrderStatisticsInfoExample orderStatisticsInfoExample = new OrderStatisticsInfoExample();
		orderStatisticsInfoExample.setTableName(StatisticsConstant.TableName.BASE_DATA_TABLE_NAME);
		orderStatisticsInfoExample.createCriteria().andCTimeEqualTo(cTime);
		return orderStatisticsInfoMapper.selectByExample(orderStatisticsInfoExample);
	}

	@Override
	public void batchInsert(String tableName, List<OrderStatisticsInfo> records) {
		if(CollectionUtils.isEmpty(records)){
			logger.info("批量插入到表：{}， 数据为空，不插入", tableName);
		}
		orderStatisticsInfoMapper.batchInsert(records, tableName);
	}
	
	@Override
	public void bizOrderInsert(List<OrderStatisticsOfflineBizOrder> records) {
		if(CollectionUtils.isEmpty(records)){
			logger.info("批量插入到表 biz_order， 数据为空，不插入");
			return;
		}
		orderStatisticsOfflineBizOrderMapper.batchBizOrderInsert(records);
	}

	@Override
	public List<OrderStatisticsInfo> getBaseData(Integer startTime, Integer endTime) {
		OrderStatisticsInfoExample example = new OrderStatisticsInfoExample();
		example.createCriteria().andFinishedTimeGreaterThanOrEqualTo(startTime).andFinishedTimeLessThan(endTime);
		return orderStatisticsInfoMapper.selectByExample(example);
	}

	@Override
	public void bizOrderGoodsInsert(List<OrderStatisticsOfflineBizOrderGoods> records) {
		if(CollectionUtils.isEmpty(records)){
			logger.info("批量插入到表 biz_order_goods， 数据为空，不插入");
			return;
		}
		orderStatisticsOfflineBizOrderGoodsMapper.batchBizOrderGoodsInsert(records);
		
	}

	@Override
	public List<OrderStatisticsInfo> getBaseDataFromTableByCtime(Integer cTime, String tableName, Long countryId, Integer start, Integer limit) {
		OrderStatisticsInfoExample example = new OrderStatisticsInfoExample();
		example.setTableName(tableName);
		example.setOrderByClause("id LIMIT " + start + "," + limit);
		example.createCriteria().andCTimeLessThan(cTime).andCountryIdEqualTo(countryId);
		List<OrderStatisticsInfo> list = orderStatisticsInfoMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<OrderStatisticsInfo> getBaseDataFromTableByUnion(Integer cTime, String tableName, String channel, List<Long> countryIds, Integer start, Integer limit) {
		OrderStatisticsInfoExample example = new OrderStatisticsInfoExample();
		example.setOrderByClause("id LIMIT " + start + "," + limit);
		example.setTableName(tableName);
		Criteria andUnionIdEqualTo = example.createCriteria().andChannelEqualTo(channel).andCTimeLessThanOrEqualTo(cTime);
		if(!CollectionUtils.isEmpty(countryIds)){
			andUnionIdEqualTo.andCountryIdIn(countryIds);
		}
 		List<OrderStatisticsInfo> list = orderStatisticsInfoMapper.selectByExample(example);
		return list;
	}

	@Override
	public Integer unionSaleBatchInsert(List<UnionSaleStatistics> records) {
		int result = unionSaleStatisticsMapper.batchInsert(records);
		return result;
	}
	
	@Override
	public Integer unionBuyerBatchInsert(List<UnionBuyerStatistics> records) {
		int result = unionBuyerStatisticsMapper.batchInsert(records);
		return result;
	}

	@Override
	public List<OrderStatisticsInfo> getBaseDataForYkFromTableByUnion(Integer cTime, String tableName, Integer start,
			Integer limit) {
		OrderStatisticsInfoExample example = new OrderStatisticsInfoExample();
		example.setOrderByClause("id LIMIT " + start + "," + limit);
		example.setTableName(tableName);
		example.createCriteria().andChannelEqualTo("").andCTimeEqualTo(cTime);
 		List<OrderStatisticsInfo> list = orderStatisticsInfoMapper.selectByExample(example);
		return list;
	}

}
