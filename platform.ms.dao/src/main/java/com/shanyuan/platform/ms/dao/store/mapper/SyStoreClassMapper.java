package com.shanyuan.platform.ms.dao.store.mapper;

import com.shanyuan.platform.ms.dao.store.entity.SyStoreClass;
import com.shanyuan.platform.ms.dao.store.entity.SyStoreClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyStoreClassMapper {
    int countByExample(SyStoreClassExample example);

    int deleteByExample(SyStoreClassExample example);

    int deleteByPrimaryKey(Integer scId);

    int insert(SyStoreClass record);

    int insertSelective(SyStoreClass record);

    List<SyStoreClass> selectByExample(SyStoreClassExample example);

    SyStoreClass selectByPrimaryKey(Integer scId);

    int updateByExampleSelective(@Param("record") SyStoreClass record, @Param("example") SyStoreClassExample example);

    int updateByExample(@Param("record") SyStoreClass record, @Param("example") SyStoreClassExample example);

    int updateByPrimaryKeySelective(SyStoreClass record);

    int updateByPrimaryKey(SyStoreClass record);
}