package com.shanyuan.platform.ms.dao.user.mapper;

import com.shanyuan.platform.ms.dao.user.entity.SyManagerBoc;
import com.shanyuan.platform.ms.dao.user.entity.SyManagerBocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyManagerBocMapper {
    int countByExample(SyManagerBocExample example);

    int deleteByExample(SyManagerBocExample example);

    int deleteByPrimaryKey(Integer managerId);

    int insert(SyManagerBoc record);

    int insertSelective(SyManagerBoc record);

    List<SyManagerBoc> selectByExample(SyManagerBocExample example);

    SyManagerBoc selectByPrimaryKey(Integer managerId);

    int updateByExampleSelective(@Param("record") SyManagerBoc record, @Param("example") SyManagerBocExample example);

    int updateByExample(@Param("record") SyManagerBoc record, @Param("example") SyManagerBocExample example);

    int updateByPrimaryKeySelective(SyManagerBoc record);

    int updateByPrimaryKey(SyManagerBoc record);
}