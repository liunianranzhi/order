package com.shanyuan.platform.ms.dao.user.mapper;

import com.shanyuan.platform.ms.dao.user.entity.SyRole;
import com.shanyuan.platform.ms.dao.user.entity.SyRoleExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SyRoleMapper {
    int countByExample(SyRoleExample example);

    int deleteByExample(SyRoleExample example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(SyRole record);

    int insertSelective(SyRole record);

    List<SyRole> selectByExample(SyRoleExample example);

    SyRole selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") SyRole record, @Param("example") SyRoleExample example);

    int updateByExample(@Param("record") SyRole record, @Param("example") SyRoleExample example);

    int updateByPrimaryKeySelective(SyRole record);

    int updateByPrimaryKey(SyRole record);

	SyRole selectRoleInfo(Integer publisherId);


	List<SyRole> selectRoleList();
	
	List<SyRole> selectRole();

}