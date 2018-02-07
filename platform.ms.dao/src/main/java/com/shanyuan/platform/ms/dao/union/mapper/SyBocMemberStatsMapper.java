package com.shanyuan.platform.ms.dao.union.mapper;

import com.shanyuan.platform.ms.dao.union.entity.SyBocMemberStats;
import com.shanyuan.platform.ms.dao.union.entity.SyBocMemberStatsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyBocMemberStatsMapper {
    int countByExample(SyBocMemberStatsExample example);

    int deleteByExample(SyBocMemberStatsExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SyBocMemberStats record);

    int insertSelective(SyBocMemberStats record);

    List<SyBocMemberStats> selectByExample(SyBocMemberStatsExample example);

    SyBocMemberStats selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SyBocMemberStats record, @Param("example") SyBocMemberStatsExample example);

    int updateByExample(@Param("record") SyBocMemberStats record, @Param("example") SyBocMemberStatsExample example);

    int updateByPrimaryKeySelective(SyBocMemberStats record);

    int updateByPrimaryKey(SyBocMemberStats record);
    
}