package com.shanyuan.platform.ms.dao.statistics.mapper;

import com.shanyuan.platform.ms.dao.statistics.entity.AssistStatisticsBaseData;
import com.shanyuan.platform.ms.dao.statistics.entity.AssistStatisticsBaseDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssistStatisticsBaseDataMapper {
    int countByExample(AssistStatisticsBaseDataExample example);

    int deleteByExample(AssistStatisticsBaseDataExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(AssistStatisticsBaseData record);

    int insertSelective(AssistStatisticsBaseData record);

    List<AssistStatisticsBaseData> selectByExample(AssistStatisticsBaseDataExample example);

    AssistStatisticsBaseData selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") AssistStatisticsBaseData record, @Param("example") AssistStatisticsBaseDataExample example);

    int updateByExample(@Param("record") AssistStatisticsBaseData record, @Param("example") AssistStatisticsBaseDataExample example);

    int updateByPrimaryKeySelective(AssistStatisticsBaseData record);

    int updateByPrimaryKey(AssistStatisticsBaseData record);
    
    int batchInsert(@Param("records") List<AssistStatisticsBaseData> records);
}