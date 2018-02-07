package com.shanyuan.platform.ms.dao.order.mapper;

import com.shanyuan.platform.ms.dao.order.entity.SyOrderPay;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderPayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyOrderPayMapper {
    int countByExample(SyOrderPayExample example);

    int deleteByExample(SyOrderPayExample example);

    int deleteByPrimaryKey(Integer payId);

    int insert(SyOrderPay record);

    int insertSelective(SyOrderPay record);

    List<SyOrderPay> selectByExample(SyOrderPayExample example);

    SyOrderPay selectByPrimaryKey(Integer payId);

    int updateByExampleSelective(@Param("record") SyOrderPay record, @Param("example") SyOrderPayExample example);

    int updateByExample(@Param("record") SyOrderPay record, @Param("example") SyOrderPayExample example);

    int updateByPrimaryKeySelective(SyOrderPay record);

    int updateByPrimaryKey(SyOrderPay record);
}