package com.shanyuan.platform.ms.dao.store.mapper;

import com.shanyuan.platform.ms.dao.store.entity.SyCircleMember;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleMemberExample;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleMemberKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyCircleMemberMapper {
    int countByExample(SyCircleMemberExample example);

    int deleteByExample(SyCircleMemberExample example);

    int deleteByPrimaryKey(SyCircleMemberKey key);

    int insert(SyCircleMember record);

    int insertSelective(SyCircleMember record);

    List<SyCircleMember> selectByExample(SyCircleMemberExample example);

    SyCircleMember selectByPrimaryKey(SyCircleMemberKey key);

    int updateByExampleSelective(@Param("record") SyCircleMember record, @Param("example") SyCircleMemberExample example);

    int updateByExample(@Param("record") SyCircleMember record, @Param("example") SyCircleMemberExample example);

    int updateByPrimaryKeySelective(SyCircleMember record);

    int updateByPrimaryKey(SyCircleMember record);
}