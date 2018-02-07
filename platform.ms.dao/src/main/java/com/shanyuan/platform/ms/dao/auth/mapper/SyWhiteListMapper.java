package com.shanyuan.platform.ms.dao.auth.mapper;

import com.shanyuan.platform.ms.dao.auth.entity.SyWhiteList;
import com.shanyuan.platform.ms.dao.auth.entity.SyWhiteListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyWhiteListMapper {
    int countByExample(SyWhiteListExample example);

    int deleteByExample(SyWhiteListExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SyWhiteList record);

    int insertSelective(SyWhiteList record);

    List<SyWhiteList> selectByExample(SyWhiteListExample example);

    SyWhiteList selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SyWhiteList record, @Param("example") SyWhiteListExample example);

    int updateByExample(@Param("record") SyWhiteList record, @Param("example") SyWhiteListExample example);

    int updateByPrimaryKeySelective(SyWhiteList record);

    int updateByPrimaryKey(SyWhiteList record);
}