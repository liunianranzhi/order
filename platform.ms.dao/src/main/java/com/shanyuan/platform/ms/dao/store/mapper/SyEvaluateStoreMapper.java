package com.shanyuan.platform.ms.dao.store.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shanyuan.platform.ms.dao.store.entity.SyEvaluateStore;
import com.shanyuan.platform.ms.dao.store.entity.SyEvaluateStoreExample;

public interface SyEvaluateStoreMapper {
    int countByExample(SyEvaluateStoreExample example);

    int deleteByExample(SyEvaluateStoreExample example);

    int deleteByPrimaryKey(Integer sevalId);

    int insert(SyEvaluateStore record);

    int insertSelective(SyEvaluateStore record);

    List<SyEvaluateStore> selectByExample(SyEvaluateStoreExample example);

    SyEvaluateStore selectByPrimaryKey(Integer sevalId);

    int updateByExampleSelective(@Param("record") SyEvaluateStore record, @Param("example") SyEvaluateStoreExample example);

    int updateByExample(@Param("record") SyEvaluateStore record, @Param("example") SyEvaluateStoreExample example);

    int updateByPrimaryKeySelective(SyEvaluateStore record);

    int updateByPrimaryKey(SyEvaluateStore record);
    
    SyEvaluateStore selectGetEvaluateStoreScore(Integer memberid);
}