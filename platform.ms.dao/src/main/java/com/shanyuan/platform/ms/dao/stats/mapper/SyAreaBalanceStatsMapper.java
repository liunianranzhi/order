package com.shanyuan.platform.ms.dao.stats.mapper;

import com.shanyuan.platform.ms.dao.stats.entity.SyAreaBalanceStats;
import com.shanyuan.platform.ms.dao.stats.entity.SyAreaBalanceStatsExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SyAreaBalanceStatsMapper {
    int countByExample(SyAreaBalanceStatsExample example);

    int deleteByExample(SyAreaBalanceStatsExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SyAreaBalanceStats record);

    int insertSelective(SyAreaBalanceStats record);

    List<SyAreaBalanceStats> selectByExample(SyAreaBalanceStatsExample example);

    SyAreaBalanceStats selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SyAreaBalanceStats record, @Param("example") SyAreaBalanceStatsExample example);

    int updateByExample(@Param("record") SyAreaBalanceStats record, @Param("example") SyAreaBalanceStatsExample example);

    int updateByPrimaryKeySelective(SyAreaBalanceStats record);

    int updateByPrimaryKey(SyAreaBalanceStats record);

	SyAreaBalanceStats selectAreaBalanceStats(Long areaid3);
}