package com.shanyuan.platform.ms.dao.statistics.mapper;

import com.shanyuan.platform.ms.dao.statistics.entity.UnionBuyerStatistics;
import com.shanyuan.platform.ms.dao.statistics.entity.UnionBuyerStatisticsExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnionBuyerStatisticsMapper {
    int countByExample(UnionBuyerStatisticsExample example);

    int deleteByExample(UnionBuyerStatisticsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UnionBuyerStatistics record);

    int insertSelective(UnionBuyerStatistics record);

    List<UnionBuyerStatistics> selectByExample(UnionBuyerStatisticsExample example);

    UnionBuyerStatistics selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UnionBuyerStatistics record, @Param("example") UnionBuyerStatisticsExample example);

    int updateByExample(@Param("record") UnionBuyerStatistics record, @Param("example") UnionBuyerStatisticsExample example);

    int updateByPrimaryKeySelective(UnionBuyerStatistics record);

    int updateByPrimaryKey(UnionBuyerStatistics record);
    
    int batchInsert(@Param("records") List<UnionBuyerStatistics> records);
    
    UnionBuyerStatistics selectSum(UnionBuyerStatisticsExample example);
}