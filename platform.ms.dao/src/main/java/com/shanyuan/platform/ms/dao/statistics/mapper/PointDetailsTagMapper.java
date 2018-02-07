package com.shanyuan.platform.ms.dao.statistics.mapper;

import com.shanyuan.platform.ms.dao.statistics.entity.PointDetailsTag;
import com.shanyuan.platform.ms.dao.statistics.entity.PointDetailsTagExample;
import com.shanyuan.platform.ms.dao.statistics.entity.StatisticsTable;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PointDetailsTagMapper {
	int countByExample(PointDetailsTagExample example);

    int deleteByExample(PointDetailsTagExample example);

    int deleteByPrimaryKey(Integer memberId);

    int insert(PointDetailsTag record);

    int insertSelective(PointDetailsTag record);

    List<PointDetailsTag> selectByExample(PointDetailsTagExample example);

    PointDetailsTag selectByPrimaryKey(Integer memberId);

    int updateByExampleSelective(@Param("record") PointDetailsTag record, @Param("example") PointDetailsTagExample example);

    int updateByExample(@Param("record") PointDetailsTag record, @Param("example") PointDetailsTagExample example);

    int updateByPrimaryKeySelective(PointDetailsTag record);

    int updateByPrimaryKey(PointDetailsTag record);
    
    int batchInsert(@Param("records") List<PointDetailsTag> records);
    
    List<PointDetailsTag> selectPointsByUnionId(Integer unionId);
    
    int createNewTable(StatisticsTable statisticsTable);
    
    int alterTempTable(StatisticsTable statisticsTable);
    
    int dropTempTable(StatisticsTable statisticsTable);
    
    List<PointDetailsTag> selectAllInfosByConditoin(PointDetailsTag record);
    
    
}