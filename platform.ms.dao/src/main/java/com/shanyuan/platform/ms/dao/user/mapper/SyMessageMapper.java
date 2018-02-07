package com.shanyuan.platform.ms.dao.user.mapper;

import com.shanyuan.platform.ms.dao.user.entity.SyMessage;
import com.shanyuan.platform.ms.dao.user.entity.SyMessageExample;
import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

@Component
public interface SyMessageMapper {
    int countByExample(SyMessageExample example);

    int deleteByExample(SyMessageExample example);

    int deleteByPrimaryKey(Integer messageId);

    int insert(SyMessage record);

    int insertSelective(SyMessage record);

    List<SyMessage> selectByExample(SyMessageExample example);

    SyMessage selectByPrimaryKey(Integer messageId);

    int updateByExampleSelective(@Param("record") SyMessage record, @Param("example") SyMessageExample example);

    int updateByExample(@Param("record") SyMessage record, @Param("example") SyMessageExample example);

    int updateByPrimaryKeySelective(SyMessage record);

    int updateByPrimaryKey(SyMessage record);   
}