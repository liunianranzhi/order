package com.shanyuan.platform.ms.dao.statistics.mapper;

import com.shanyuan.platform.ms.dao.statistics.entity.PovertyAlleviationOverview;
import com.shanyuan.platform.ms.dao.statistics.entity.PovertyAlleviationOverviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PovertyAlleviationOverviewMapper {
    int countByExample(PovertyAlleviationOverviewExample example);

    int deleteByExample(PovertyAlleviationOverviewExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(PovertyAlleviationOverview record);

    int insertSelective(PovertyAlleviationOverview record);

    List<PovertyAlleviationOverview> selectByExample(PovertyAlleviationOverviewExample example);

    PovertyAlleviationOverview selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") PovertyAlleviationOverview record, @Param("example") PovertyAlleviationOverviewExample example);

    int updateByExample(@Param("record") PovertyAlleviationOverview record, @Param("example") PovertyAlleviationOverviewExample example);

    int updateByPrimaryKeySelective(PovertyAlleviationOverview record);

    int updateByPrimaryKey(PovertyAlleviationOverview record);
    
    int batchPovertyOverviewInsert(@Param("records") List<PovertyAlleviationOverview> records);
    
    List<PovertyAlleviationOverview> selectDateByCondition(PovertyAlleviationOverview alleviationOverview);
}