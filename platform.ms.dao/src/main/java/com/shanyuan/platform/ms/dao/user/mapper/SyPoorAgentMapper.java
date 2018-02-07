package com.shanyuan.platform.ms.dao.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shanyuan.platform.ms.dao.user.entity.SyPoorAgent;
import com.shanyuan.platform.ms.dao.user.entity.SyPoorAgentExample;

public interface SyPoorAgentMapper {
    int countByExample(SyPoorAgentExample example);

    int deleteByExample(SyPoorAgentExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SyPoorAgent record);

    int insertSelective(SyPoorAgent record);

    List<SyPoorAgent> selectByExample(SyPoorAgentExample example);

    SyPoorAgent selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SyPoorAgent record, @Param("example") SyPoorAgentExample example);

    int updateByExample(@Param("record") SyPoorAgent record, @Param("example") SyPoorAgentExample example);

    int updateByPrimaryKeySelective(SyPoorAgent record);

    int updateByPrimaryKey(SyPoorAgent record);

	List<SyPoorAgent> selectPoorAgentList(Integer memberId);
	

	
	
	
	
}