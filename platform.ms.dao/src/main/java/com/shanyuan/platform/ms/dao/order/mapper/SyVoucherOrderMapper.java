package com.shanyuan.platform.ms.dao.order.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.shanyuan.platform.ms.dao.user.entity.SyVoucherOrder;
import com.shanyuan.platform.ms.dao.user.entity.SyVoucherOrderExample;

public interface SyVoucherOrderMapper {
    int countByExample(SyVoucherOrderExample example);

    int deleteByExample(SyVoucherOrderExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SyVoucherOrder record);

    int insertSelective(SyVoucherOrder record);

    List<SyVoucherOrder> selectByExample(SyVoucherOrderExample example);

    SyVoucherOrder selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SyVoucherOrder record, @Param("example") SyVoucherOrderExample example);

    int updateByExample(@Param("record") SyVoucherOrder record, @Param("example") SyVoucherOrderExample example);

    int updateByPrimaryKeySelective(SyVoucherOrder record);

    int updateByPrimaryKey(SyVoucherOrder record);
}