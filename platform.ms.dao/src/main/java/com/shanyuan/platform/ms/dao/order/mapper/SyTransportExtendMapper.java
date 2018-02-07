package com.shanyuan.platform.ms.dao.order.mapper;

import com.shanyuan.platform.ms.dao.order.entity.SyTransportExtend;
import com.shanyuan.platform.ms.dao.order.entity.SyTransportExtendExample;
import com.shanyuan.platform.ms.dao.order.entity.SyTransportExtendWithBLOBs;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SyTransportExtendMapper {
    int countByExample(SyTransportExtendExample example);

    int deleteByExample(SyTransportExtendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SyTransportExtendWithBLOBs record);

    int insertSelective(SyTransportExtendWithBLOBs record);

    List<SyTransportExtendWithBLOBs> selectByExampleWithBLOBs(SyTransportExtendExample example);

    List<SyTransportExtend> selectByExample(SyTransportExtendExample example);

    SyTransportExtendWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SyTransportExtendWithBLOBs record, @Param("example") SyTransportExtendExample example);

    int updateByExampleWithBLOBs(@Param("record") SyTransportExtendWithBLOBs record, @Param("example") SyTransportExtendExample example);

    int updateByExample(@Param("record") SyTransportExtend record, @Param("example") SyTransportExtendExample example);

    int updateByPrimaryKeySelective(SyTransportExtendWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SyTransportExtendWithBLOBs record);

    int updateByPrimaryKey(SyTransportExtend record);

	SyTransportExtend selectTransportInfo(Integer transportId);
}