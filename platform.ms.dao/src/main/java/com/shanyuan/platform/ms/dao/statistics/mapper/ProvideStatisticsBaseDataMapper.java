package com.shanyuan.platform.ms.dao.statistics.mapper;

import com.shanyuan.platform.ms.dao.statistics.entity.ProvideStatisticsBaseData;
import com.shanyuan.platform.ms.dao.statistics.entity.ProvideStatisticsBaseDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProvideStatisticsBaseDataMapper {
    int countByExample(ProvideStatisticsBaseDataExample example);

    int deleteByExample(ProvideStatisticsBaseDataExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(ProvideStatisticsBaseData record);

    int insertSelective(ProvideStatisticsBaseData record);

    List<ProvideStatisticsBaseData> selectByExample(ProvideStatisticsBaseDataExample example);

    ProvideStatisticsBaseData selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") ProvideStatisticsBaseData record, @Param("example") ProvideStatisticsBaseDataExample example);

    int updateByExample(@Param("record") ProvideStatisticsBaseData record, @Param("example") ProvideStatisticsBaseDataExample example);

    int updateByPrimaryKeySelective(ProvideStatisticsBaseData record);

    int updateByPrimaryKey(ProvideStatisticsBaseData record);
    
    void batchInsert(@Param("records") List<ProvideStatisticsBaseData> records);
}