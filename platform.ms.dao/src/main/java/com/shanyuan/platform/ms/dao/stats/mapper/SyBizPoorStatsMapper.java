package com.shanyuan.platform.ms.dao.stats.mapper;

import com.shanyuan.platform.ms.dao.stats.entity.SyBizPoorStats;
import com.shanyuan.platform.ms.dao.stats.entity.SyBizPoorStatsExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SyBizPoorStatsMapper {
    int countByExample(SyBizPoorStatsExample example);

    int deleteByExample(SyBizPoorStatsExample example);

    int deleteByPrimaryKey(Integer statsId);

    int insert(SyBizPoorStats record);

    int insertSelective(SyBizPoorStats record);

    List<SyBizPoorStats> selectByExample(SyBizPoorStatsExample example);

    SyBizPoorStats selectByPrimaryKey(Integer statsId);

    int updateByExampleSelective(@Param("record") SyBizPoorStats record, @Param("example") SyBizPoorStatsExample example);

    int updateByExample(@Param("record") SyBizPoorStats record, @Param("example") SyBizPoorStatsExample example);

    int updateByPrimaryKeySelective(SyBizPoorStats record);

    int updateByPrimaryKey(SyBizPoorStats record);

	double selectJicaiMoneyByMenberId(Integer memberId);
}