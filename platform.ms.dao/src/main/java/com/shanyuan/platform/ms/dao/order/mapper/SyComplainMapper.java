package com.shanyuan.platform.ms.dao.order.mapper;

import com.shanyuan.platform.ms.dao.order.entity.SyComplain;
import com.shanyuan.platform.ms.dao.order.entity.SyComplainExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SyComplainMapper {
    int countByExample(SyComplainExample example);

    int deleteByExample(SyComplainExample example);

    int deleteByPrimaryKey(Integer complainId);

    int insert(SyComplain record);

    int insertSelective(SyComplain record);

    List<SyComplain> selectByExample(SyComplainExample example);

    SyComplain selectByPrimaryKey(Integer complainId);

    int updateByExampleSelective(@Param("record") SyComplain record, @Param("example") SyComplainExample example);

    int updateByExample(@Param("record") SyComplain record, @Param("example") SyComplainExample example);

    int updateByPrimaryKeySelective(SyComplain record);

    int updateByPrimaryKey(SyComplain record);

	int selectComplainCount(@Param("memberId")Integer memberId, @Param("startTime")Long startTime, @Param("endTime")Long endTime);
}