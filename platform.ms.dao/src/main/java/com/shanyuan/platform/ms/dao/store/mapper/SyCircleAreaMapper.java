package com.shanyuan.platform.ms.dao.store.mapper;

import com.shanyuan.platform.ms.dao.store.entity.SyCircleArea;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyCircleAreaMapper {
    int countByExample(SyCircleAreaExample example);

    int deleteByExample(SyCircleAreaExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SyCircleArea record);

    int insertSelective(SyCircleArea record);

    List<SyCircleArea> selectByExampleWithBLOBs(SyCircleAreaExample example);

    List<SyCircleArea> selectByExample(SyCircleAreaExample example);

    SyCircleArea selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SyCircleArea record, @Param("example") SyCircleAreaExample example);

    int updateByExampleWithBLOBs(@Param("record") SyCircleArea record, @Param("example") SyCircleAreaExample example);

    int updateByExample(@Param("record") SyCircleArea record, @Param("example") SyCircleAreaExample example);

    int updateByPrimaryKeySelective(SyCircleArea record);

    int updateByPrimaryKeyWithBLOBs(SyCircleArea record);

    int updateByPrimaryKey(SyCircleArea record);
}