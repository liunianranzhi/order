package com.shanyuan.platform.ms.dao.user.mapper;

import com.shanyuan.platform.ms.dao.user.entity.SyInviteCircleLog;
import com.shanyuan.platform.ms.dao.user.entity.SyInviteCircleLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyInviteCircleLogMapper {
    int countByExample(SyInviteCircleLogExample example);

    int deleteByExample(SyInviteCircleLogExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SyInviteCircleLog record);

    int insertSelective(SyInviteCircleLog record);

    List<SyInviteCircleLog> selectByExample(SyInviteCircleLogExample example);

    SyInviteCircleLog selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SyInviteCircleLog record, @Param("example") SyInviteCircleLogExample example);

    int updateByExample(@Param("record") SyInviteCircleLog record, @Param("example") SyInviteCircleLogExample example);

    int updateByPrimaryKeySelective(SyInviteCircleLog record);

    int updateByPrimaryKey(SyInviteCircleLog record);
}