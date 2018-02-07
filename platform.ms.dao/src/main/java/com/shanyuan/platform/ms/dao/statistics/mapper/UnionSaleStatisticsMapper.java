package com.shanyuan.platform.ms.dao.statistics.mapper;

import com.shanyuan.platform.ms.dao.statistics.entity.UnionSaleStatistics;
import com.shanyuan.platform.ms.dao.statistics.entity.UnionSaleStatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnionSaleStatisticsMapper {
    int countByExample(UnionSaleStatisticsExample example);

    int deleteByExample(UnionSaleStatisticsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UnionSaleStatistics record);

    int insertSelective(UnionSaleStatistics record);

    List<UnionSaleStatistics> selectByExample(UnionSaleStatisticsExample example);

    UnionSaleStatistics selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UnionSaleStatistics record, @Param("example") UnionSaleStatisticsExample example);

    int updateByExample(@Param("record") UnionSaleStatistics record, @Param("example") UnionSaleStatisticsExample example);

    int updateByPrimaryKeySelective(UnionSaleStatistics record);

    int updateByPrimaryKey(UnionSaleStatistics record);
    
    int batchInsert(@Param("records") List<UnionSaleStatistics> records);
    
    UnionSaleStatistics selectSum(UnionSaleStatisticsExample example);
}