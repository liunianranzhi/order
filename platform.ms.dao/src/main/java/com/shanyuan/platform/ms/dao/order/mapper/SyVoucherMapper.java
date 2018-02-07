package com.shanyuan.platform.ms.dao.order.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.shanyuan.platform.ms.dao.user.entity.SyVoucher;
import com.shanyuan.platform.ms.dao.user.entity.SyVoucherExample;

public interface SyVoucherMapper {
    int countByExample(SyVoucherExample example);

    int deleteByExample(SyVoucherExample example);

    int deleteByPrimaryKey(Integer voucherId);

    int insert(SyVoucher record);

    int insertSelective(SyVoucher record);

    List<SyVoucher> selectByExample(SyVoucherExample example);

    SyVoucher selectByPrimaryKey(Integer voucherId);

    int updateByExampleSelective(@Param("record") SyVoucher record, @Param("example") SyVoucherExample example);

    int updateByExample(@Param("record") SyVoucher record, @Param("example") SyVoucherExample example);

    int updateByPrimaryKeySelective(SyVoucher record);

    int updateByPrimaryKey(SyVoucher record);

    void updateByTused(SyVoucher record);
    List<SyVoucher> selectByParam(SyVoucher record);
    List<SyVoucher> selectByVid(SyVoucher record);
}