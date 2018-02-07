package com.shanyuan.platform.ms.dao.order.mapper;

import com.shanyuan.platform.ms.dao.order.entity.SyOrderCommon;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderCommonExample;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderCommonWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyOrderCommonMapper {
    int countByExample(SyOrderCommonExample example);

    int deleteByExample(SyOrderCommonExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(SyOrderCommonWithBLOBs record);

    int insertSelective(SyOrderCommonWithBLOBs record);

    List<SyOrderCommonWithBLOBs> selectByExampleWithBLOBs(SyOrderCommonExample example);

    List<SyOrderCommon> selectByExample(SyOrderCommonExample example);

    SyOrderCommonWithBLOBs selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") SyOrderCommonWithBLOBs record, @Param("example") SyOrderCommonExample example);

    int updateByExampleWithBLOBs(@Param("record") SyOrderCommonWithBLOBs record, @Param("example") SyOrderCommonExample example);

    int updateByExample(@Param("record") SyOrderCommon record, @Param("example") SyOrderCommonExample example);

    int updateByPrimaryKeySelective(SyOrderCommonWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SyOrderCommonWithBLOBs record);

    int updateByPrimaryKey(SyOrderCommon record);
}