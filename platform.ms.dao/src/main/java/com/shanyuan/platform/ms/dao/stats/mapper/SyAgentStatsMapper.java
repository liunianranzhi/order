package com.shanyuan.platform.ms.dao.stats.mapper;

import com.shanyuan.platform.ms.dao.stats.entity.AgentStatsBo;
import com.shanyuan.platform.ms.dao.stats.entity.SyAgentStats;
import com.shanyuan.platform.ms.dao.stats.entity.SyAgentStatsExample;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SyAgentStatsMapper {
    int countByExample(SyAgentStatsExample example);

    int deleteByExample(SyAgentStatsExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SyAgentStats record);

    int insertSelective(SyAgentStats record);

    List<SyAgentStats> selectByExample(SyAgentStatsExample example);

    SyAgentStats selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SyAgentStats record, @Param("example") SyAgentStatsExample example);

    int updateByExample(@Param("record") SyAgentStats record, @Param("example") SyAgentStatsExample example);

    int updateByPrimaryKeySelective(SyAgentStats record);

    int updateByPrimaryKey(SyAgentStats record);

	SyAgentStats selectAgentStats(@Param("memberId")Integer memberId, @Param("nowTime")Long nowTime);
	
	
	List<AgentStatsBo> scores (@Param("memberIds") List<Integer> memberIds);
}