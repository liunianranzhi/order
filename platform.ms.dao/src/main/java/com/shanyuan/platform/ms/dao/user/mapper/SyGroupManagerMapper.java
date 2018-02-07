package com.shanyuan.platform.ms.dao.user.mapper;

import com.shanyuan.platform.ms.dao.user.entity.SyGroupManager;
import com.shanyuan.platform.ms.dao.user.entity.SyGroupManagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyGroupManagerMapper {
    int countByExample(SyGroupManagerExample example);

    int deleteByExample(SyGroupManagerExample example);

    int deleteByPrimaryKey(Integer groupManagerId);

    int insert(SyGroupManager record);

    int insertSelective(SyGroupManager record);

    List<SyGroupManager> selectByExample(SyGroupManagerExample example);

    SyGroupManager selectByPrimaryKey(Integer groupManagerId);

    int updateByExampleSelective(@Param("record") SyGroupManager record, @Param("example") SyGroupManagerExample example);

    int updateByExample(@Param("record") SyGroupManager record, @Param("example") SyGroupManagerExample example);

    int updateByPrimaryKeySelective(SyGroupManager record);

    int updateByPrimaryKey(SyGroupManager record);
}