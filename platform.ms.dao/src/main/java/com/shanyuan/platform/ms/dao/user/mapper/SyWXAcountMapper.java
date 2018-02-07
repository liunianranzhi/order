package com.shanyuan.platform.ms.dao.user.mapper;

import com.shanyuan.platform.ms.dao.user.entity.SyWXAcount;
import com.shanyuan.platform.ms.dao.user.entity.SyWXAcountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyWXAcountMapper {
    int countByExample(SyWXAcountExample example);

    int deleteByExample(SyWXAcountExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SyWXAcount record);

    int insertSelective(SyWXAcount record);

    List<SyWXAcount> selectByExample(SyWXAcountExample example);

    SyWXAcount selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SyWXAcount record, @Param("example") SyWXAcountExample example);

    int updateByExample(@Param("record") SyWXAcount record, @Param("example") SyWXAcountExample example);

    int updateByPrimaryKeySelective(SyWXAcount record);

    int updateByPrimaryKey(SyWXAcount record);
}