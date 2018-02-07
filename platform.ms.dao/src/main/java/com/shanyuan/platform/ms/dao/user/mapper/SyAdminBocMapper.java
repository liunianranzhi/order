package com.shanyuan.platform.ms.dao.user.mapper;

import com.shanyuan.platform.ms.dao.user.entity.SyAdminBoc;
import com.shanyuan.platform.ms.dao.user.entity.SyAdminBocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyAdminBocMapper {
    int countByExample(SyAdminBocExample example);

    int deleteByExample(SyAdminBocExample example);

    int deleteByPrimaryKey(Integer adminId);

    int insert(SyAdminBoc record);

    int insertSelective(SyAdminBoc record);

    List<SyAdminBoc> selectByExample(SyAdminBocExample example);

    SyAdminBoc selectByPrimaryKey(Integer adminId);

    int updateByExampleSelective(@Param("record") SyAdminBoc record, @Param("example") SyAdminBocExample example);

    int updateByExample(@Param("record") SyAdminBoc record, @Param("example") SyAdminBocExample example);

    int updateByPrimaryKeySelective(SyAdminBoc record);

    int updateByPrimaryKey(SyAdminBoc record);
}