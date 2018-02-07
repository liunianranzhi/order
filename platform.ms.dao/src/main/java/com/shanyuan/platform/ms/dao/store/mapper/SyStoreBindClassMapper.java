package com.shanyuan.platform.ms.dao.store.mapper;

import com.shanyuan.platform.ms.dao.store.entity.SyStoreBindClass;
import com.shanyuan.platform.ms.dao.store.entity.SyStoreBindClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyStoreBindClassMapper {
    int countByExample(SyStoreBindClassExample example);

    int deleteByExample(SyStoreBindClassExample example);

    int deleteByPrimaryKey(Integer bid);

    int insert(SyStoreBindClass record);

    int insertSelective(SyStoreBindClass record);

    List<SyStoreBindClass> selectByExample(SyStoreBindClassExample example);

    SyStoreBindClass selectByPrimaryKey(Integer bid);

    int updateByExampleSelective(@Param("record") SyStoreBindClass record, @Param("example") SyStoreBindClassExample example);

    int updateByExample(@Param("record") SyStoreBindClass record, @Param("example") SyStoreBindClassExample example);

    int updateByPrimaryKeySelective(SyStoreBindClass record);

    int updateByPrimaryKey(SyStoreBindClass record);
}