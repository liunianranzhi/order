package com.shanyuan.platform.ms.dao.order.mapper;

import com.shanyuan.platform.ms.dao.order.entity.SyOrderLog;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyOrderLogMapper {
    int countByExample(SyOrderLogExample example);

    int deleteByExample(SyOrderLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(SyOrderLog record);

    int insertSelective(SyOrderLog record);

    List<SyOrderLog> selectByExample(SyOrderLogExample example);

    SyOrderLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") SyOrderLog record, @Param("example") SyOrderLogExample example);

    int updateByExample(@Param("record") SyOrderLog record, @Param("example") SyOrderLogExample example);

    int updateByPrimaryKeySelective(SyOrderLog record);

    int updateByPrimaryKey(SyOrderLog record);
}