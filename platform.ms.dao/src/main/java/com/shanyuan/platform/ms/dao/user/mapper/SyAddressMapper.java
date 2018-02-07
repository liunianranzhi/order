package com.shanyuan.platform.ms.dao.user.mapper;

import com.shanyuan.platform.ms.dao.user.entity.SyAddress;
import com.shanyuan.platform.ms.dao.user.entity.SyAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyAddressMapper {
    int countByExample(SyAddressExample example);

    int deleteByExample(SyAddressExample example);

    int deleteByPrimaryKey(Integer addressId);

    int insert(SyAddress record);

    int insertSelective(SyAddress record);

    List<SyAddress> selectByExample(SyAddressExample example);

    SyAddress selectByPrimaryKey(Integer addressId);

    int updateByExampleSelective(@Param("record") SyAddress record, @Param("example") SyAddressExample example);

    int updateByExample(@Param("record") SyAddress record, @Param("example") SyAddressExample example);

    int updateByPrimaryKeySelective(SyAddress record);

    int updateByPrimaryKey(SyAddress record);
}