package com.shanyuan.platform.ms.dao.store.mapper;

import com.shanyuan.platform.ms.dao.store.entity.SyStoreExtend;
import com.shanyuan.platform.ms.dao.store.entity.SyStoreExtendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyStoreExtendMapper {
    int countByExample(SyStoreExtendExample example);

    int deleteByExample(SyStoreExtendExample example);

    int deleteByPrimaryKey(Integer storeId);

    int insert(SyStoreExtend record);

    int insertSelective(SyStoreExtend record);

    List<SyStoreExtend> selectByExampleWithBLOBs(SyStoreExtendExample example);

    List<SyStoreExtend> selectByExample(SyStoreExtendExample example);

    SyStoreExtend selectByPrimaryKey(Integer storeId);

    int updateByExampleSelective(@Param("record") SyStoreExtend record, @Param("example") SyStoreExtendExample example);

    int updateByExampleWithBLOBs(@Param("record") SyStoreExtend record, @Param("example") SyStoreExtendExample example);

    int updateByExample(@Param("record") SyStoreExtend record, @Param("example") SyStoreExtendExample example);

    int updateByPrimaryKeySelective(SyStoreExtend record);

    int updateByPrimaryKeyWithBLOBs(SyStoreExtend record);
}