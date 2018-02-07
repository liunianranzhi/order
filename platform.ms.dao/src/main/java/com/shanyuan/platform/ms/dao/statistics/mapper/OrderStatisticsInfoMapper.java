package com.shanyuan.platform.ms.dao.statistics.mapper;

import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsInfo;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsInfoExample;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsOfflineBizOrder;
import com.shanyuan.platform.ms.dao.statistics.entity.StatisticsTable;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderStatisticsInfoMapper {
	 int countByExample(OrderStatisticsInfoExample example);

	    int deleteByExample(OrderStatisticsInfoExample example);

	    int deleteByPrimaryKey(Integer id);

	    int insert(OrderStatisticsInfo record);

	    int insertSelective(OrderStatisticsInfo record);

	    List<OrderStatisticsInfo> selectByExample(OrderStatisticsInfoExample example);

	    OrderStatisticsInfo selectByPrimaryKey(Integer id);

	    int updateByExampleSelective(@Param("record") OrderStatisticsInfo record, @Param("example") OrderStatisticsInfoExample example);

	    int updateByExample(@Param("record") OrderStatisticsInfo record, @Param("example") OrderStatisticsInfoExample example);

	    int updateByPrimaryKeySelective(OrderStatisticsInfo record);

	    int updateByPrimaryKey(OrderStatisticsInfo record);
	    
	    void batchInsert(@Param("records")List<OrderStatisticsInfo> records, @Param("tableName")String tableName);
	    
	    void batchBizInsert(@Param("records")List<OrderStatisticsOfflineBizOrder> records, @Param("tableName")String tableName);
	    
	    int existTable(StatisticsTable statisticsTable);
}