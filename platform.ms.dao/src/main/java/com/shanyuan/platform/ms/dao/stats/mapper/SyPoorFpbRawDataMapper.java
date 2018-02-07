package com.shanyuan.platform.ms.dao.stats.mapper;

import com.shanyuan.platform.ms.dao.stats.entity.SyPoorFpbRawData;
import com.shanyuan.platform.ms.dao.stats.entity.SyPoorFpbRawDataExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SyPoorFpbRawDataMapper {
    int countByExample(SyPoorFpbRawDataExample example);

    int deleteByExample(SyPoorFpbRawDataExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SyPoorFpbRawData record);

    int insertSelective(SyPoorFpbRawData record);

    List<SyPoorFpbRawData> selectByExample(SyPoorFpbRawDataExample example);

    SyPoorFpbRawData selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SyPoorFpbRawData record, @Param("example") SyPoorFpbRawDataExample example);

    int updateByExample(@Param("record") SyPoorFpbRawData record, @Param("example") SyPoorFpbRawDataExample example);

    int updateByPrimaryKeySelective(SyPoorFpbRawData record);

    int updateByPrimaryKey(SyPoorFpbRawData record);

	int selectPoorNum(Long areaId3);
}