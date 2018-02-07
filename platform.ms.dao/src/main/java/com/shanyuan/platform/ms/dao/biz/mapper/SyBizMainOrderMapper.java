package com.shanyuan.platform.ms.dao.biz.mapper;

import com.shanyuan.platform.ms.dao.biz.entity.SyBizMainOrder;
import com.shanyuan.platform.ms.dao.biz.entity.SyBizMainOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyBizMainOrderMapper {
    int countByExample(SyBizMainOrderExample example);

    int deleteByExample(SyBizMainOrderExample example);

    int deleteByPrimaryKey(Integer mainOrderId);

    int insert(SyBizMainOrder record);

    int insertSelective(SyBizMainOrder record);

    List<SyBizMainOrder> selectByExample(SyBizMainOrderExample example);

    SyBizMainOrder selectByPrimaryKey(Integer mainOrderId);

    int updateByExampleSelective(@Param("record") SyBizMainOrder record, @Param("example") SyBizMainOrderExample example);

    int updateByExample(@Param("record") SyBizMainOrder record, @Param("example") SyBizMainOrderExample example);

    int updateByPrimaryKeySelective(SyBizMainOrder record);

    int updateByPrimaryKey(SyBizMainOrder record);
}