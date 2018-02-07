package com.shanyuan.platform.ms.dao.cart.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shanyuan.platform.ms.dao.cart.entity.SyCart;
import com.shanyuan.platform.ms.dao.cart.entity.SyCartExample;

public interface SyCartMapper {
    int countByExample(SyCartExample example);

    int deleteByExample(SyCartExample example);

    int deleteByPrimaryKey(Integer cartId);

    int insert(SyCart record);

    int insertSelective(SyCart record);

    List<SyCart> selectByExample(SyCartExample example);

    SyCart selectByPrimaryKey(Integer cartId);

    int updateByExampleSelective(@Param("record") SyCart record, @Param("example") SyCartExample example);

    int updateByExample(@Param("record") SyCart record, @Param("example") SyCartExample example);

    int updateByPrimaryKeySelective(SyCart record);

    int updateByPrimaryKey(SyCart record);
    int updateNumAndState(SyCart record);
    
    SyCart selectCartAmountAndNum(SyCart record);
    Integer selectCartNum(SyCart record);
}