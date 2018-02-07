package com.shanyuan.platform.ms.dao.user.mapper;

import com.shanyuan.platform.ms.dao.user.entity.SyIndexPop;
import com.shanyuan.platform.ms.dao.user.entity.SyIndexPopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyIndexPopMapper {
    int countByExample(SyIndexPopExample example);

    int deleteByExample(SyIndexPopExample example);

    int deleteByPrimaryKey(Integer popId);

    int insert(SyIndexPop record);

    int insertSelective(SyIndexPop record);

    List<SyIndexPop> selectByExample(SyIndexPopExample example);

    SyIndexPop selectByPrimaryKey(Integer popId);

    int updateByExampleSelective(@Param("record") SyIndexPop record, @Param("example") SyIndexPopExample example);

    int updateByExample(@Param("record") SyIndexPop record, @Param("example") SyIndexPopExample example);

    int updateByPrimaryKeySelective(SyIndexPop record);

    int updateByPrimaryKey(SyIndexPop record);
}