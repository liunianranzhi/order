package com.shanyuan.platform.ms.dao.user.mapper;

import com.shanyuan.platform.ms.dao.user.entity.SyInviteCircleMember;
import com.shanyuan.platform.ms.dao.user.entity.SyInviteCircleMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyInviteCircleMemberMapper {
    int countByExample(SyInviteCircleMemberExample example);

    int deleteByExample(SyInviteCircleMemberExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SyInviteCircleMember record);

    int insertSelective(SyInviteCircleMember record);

    List<SyInviteCircleMember> selectByExample(SyInviteCircleMemberExample example);

    SyInviteCircleMember selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SyInviteCircleMember record, @Param("example") SyInviteCircleMemberExample example);

    int updateByExample(@Param("record") SyInviteCircleMember record, @Param("example") SyInviteCircleMemberExample example);

    int updateByPrimaryKeySelective(SyInviteCircleMember record);

    int updateByPrimaryKey(SyInviteCircleMember record);
}