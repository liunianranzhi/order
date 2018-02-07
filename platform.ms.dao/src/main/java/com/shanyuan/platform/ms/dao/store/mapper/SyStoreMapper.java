package com.shanyuan.platform.ms.dao.store.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shanyuan.platform.ms.dao.store.entity.SyStore;
import com.shanyuan.platform.ms.dao.store.entity.SyStoreExample;
import com.shanyuan.platform.ms.dao.store.entity.SyStoreWithBLOBs;

public interface SyStoreMapper {
    int countByExample(SyStoreExample example);

    int deleteByExample(SyStoreExample example);

    int deleteByPrimaryKey(Integer storeId);

    int insert(SyStoreWithBLOBs record);

    int insertSelective(SyStoreWithBLOBs record);

    List<SyStoreWithBLOBs> selectByExampleWithBLOBs(SyStoreExample example);

    List<SyStore> selectByExample(SyStoreExample example);

    SyStoreWithBLOBs selectByPrimaryKey(Integer storeId);

    int updateByExampleSelective(@Param("record") SyStoreWithBLOBs record, @Param("example") SyStoreExample example);

    int updateByExampleWithBLOBs(@Param("record") SyStoreWithBLOBs record, @Param("example") SyStoreExample example);

    int updateByExample(@Param("record") SyStore record, @Param("example") SyStoreExample example);

    int updateByPrimaryKeySelective(SyStoreWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SyStoreWithBLOBs record);

    int updateByPrimaryKey(SyStore record);
}