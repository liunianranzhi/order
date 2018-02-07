package com.shanyuan.platform.ms.dao.biz.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.shanyuan.platform.ms.dao.biz.entity.SyBizOrder;
import com.shanyuan.platform.ms.dao.biz.entity.SyBizOrderExample;

public interface SyBizOrderMapper {
    int countByExample(SyBizOrderExample example);

    int deleteByExample(SyBizOrderExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(SyBizOrder record);

    int insertSelective(SyBizOrder record);

    List<SyBizOrder> selectByExample(SyBizOrderExample example);

    SyBizOrder selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") SyBizOrder record, @Param("example") SyBizOrderExample example);

    int updateByExample(@Param("record") SyBizOrder record, @Param("example") SyBizOrderExample example);

    int updateByPrimaryKeySelective(SyBizOrder record);

    int updateByPrimaryKey(SyBizOrder record);
}