package com.shanyuan.platform.ms.dao.statistics.mapper;

import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsBaseData;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsBaseDataExample;
import com.shanyuan.platform.ms.dao.statistics.entity.PlatFormDataStatisticsDomain;
import com.shanyuan.platform.ms.dao.statistics.entity.StatisticsTable;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderStatisticsBaseDataMapper {
	int countByExample(OrderStatisticsBaseDataExample example);

    int deleteByExample(OrderStatisticsBaseDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderStatisticsBaseData record);

    int insertSelective(OrderStatisticsBaseData record);

    List<OrderStatisticsBaseData> selectByExample(OrderStatisticsBaseDataExample example);

    OrderStatisticsBaseData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderStatisticsBaseData record, @Param("example") OrderStatisticsBaseDataExample example);

    int updateByExample(@Param("record") OrderStatisticsBaseData record, @Param("example") OrderStatisticsBaseDataExample example);

    int updateByPrimaryKeySelective(OrderStatisticsBaseData record);

    int updateByPrimaryKey(OrderStatisticsBaseData record);
    
    void createNewTable(StatisticsTable tableName);
    
    void insertSelectiveByTableName(String tableName,OrderStatisticsBaseData baseData);
    
    List<PlatFormDataStatisticsDomain> selectPlatformStatisticsInfo(@Param("cTime") Integer cTime);
}