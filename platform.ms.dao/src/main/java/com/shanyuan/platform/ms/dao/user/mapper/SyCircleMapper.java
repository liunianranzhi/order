package com.shanyuan.platform.ms.dao.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shanyuan.platform.ms.dao.user.entity.SyCircle;
import com.shanyuan.platform.ms.dao.user.entity.SyCircleExample;

public interface SyCircleMapper {
    int countByExample(SyCircleExample example);

    int deleteByExample(SyCircleExample example);

    int deleteByPrimaryKey(Integer circleId);

    int insert(SyCircle record);

    int insertSelective(SyCircle record);

    List<SyCircle> selectByExample(SyCircleExample example);

    SyCircle selectByPrimaryKey(Integer circleId);

    int updateByExampleSelective(@Param("record") SyCircle record, @Param("example") SyCircleExample example);

    int updateByExample(@Param("record") SyCircle record, @Param("example") SyCircleExample example);

    int updateByPrimaryKeySelective(SyCircle record);

    int updateByPrimaryKey(SyCircle record);
}