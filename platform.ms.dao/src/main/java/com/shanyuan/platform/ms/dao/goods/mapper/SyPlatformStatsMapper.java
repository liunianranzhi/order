package com.shanyuan.platform.ms.dao.goods.mapper;

import com.shanyuan.platform.ms.dao.goods.entity.SyPlatformStats;
import com.shanyuan.platform.ms.dao.goods.entity.SyPlatformStatsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyPlatformStatsMapper {
    int countByExample(SyPlatformStatsExample example);

    int deleteByExample(SyPlatformStatsExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SyPlatformStats record);

    int insertSelective(SyPlatformStats record);

    List<SyPlatformStats> selectByExample(SyPlatformStatsExample example);

    SyPlatformStats selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SyPlatformStats record, @Param("example") SyPlatformStatsExample example);

    int updateByExample(@Param("record") SyPlatformStats record, @Param("example") SyPlatformStatsExample example);

    int updateByPrimaryKeySelective(SyPlatformStats record);

    int updateByPrimaryKey(SyPlatformStats record);

	SyPlatformStats selectPlatformInfo();
}