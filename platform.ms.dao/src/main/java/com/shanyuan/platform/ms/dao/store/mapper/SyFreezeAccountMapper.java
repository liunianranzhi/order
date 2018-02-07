package com.shanyuan.platform.ms.dao.store.mapper;

import com.shanyuan.platform.ms.dao.store.entity.SyFreezeAccount;
import com.shanyuan.platform.ms.dao.store.entity.SyFreezeAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyFreezeAccountMapper {
    int countByExample(SyFreezeAccountExample example);

    int deleteByExample(SyFreezeAccountExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SyFreezeAccount record);

    int insertSelective(SyFreezeAccount record);

    List<SyFreezeAccount> selectByExample(SyFreezeAccountExample example);

    SyFreezeAccount selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SyFreezeAccount record, @Param("example") SyFreezeAccountExample example);

    int updateByExample(@Param("record") SyFreezeAccount record, @Param("example") SyFreezeAccountExample example);

    int updateByPrimaryKeySelective(SyFreezeAccount record);

    int updateByPrimaryKey(SyFreezeAccount record);
}