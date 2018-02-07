package com.shanyuan.platform.ms.dao.store.mapper;

import com.shanyuan.platform.ms.dao.store.entity.SyStoreJoinin;
import com.shanyuan.platform.ms.dao.store.entity.SyStoreJoininExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyStoreJoininMapper {
    int countByExample(SyStoreJoininExample example);

    int deleteByExample(SyStoreJoininExample example);

    int deleteByPrimaryKey(Integer memberId);

    int insert(SyStoreJoinin record);

    int insertSelective(SyStoreJoinin record);

    List<SyStoreJoinin> selectByExample(SyStoreJoininExample example);

    SyStoreJoinin selectByPrimaryKey(Integer memberId);

    int updateByExampleSelective(@Param("record") SyStoreJoinin record, @Param("example") SyStoreJoininExample example);

    int updateByExample(@Param("record") SyStoreJoinin record, @Param("example") SyStoreJoininExample example);

    int updateByPrimaryKeySelective(SyStoreJoinin record);

    int updateByPrimaryKey(SyStoreJoinin record);
}