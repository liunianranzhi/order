package com.shanyuan.platform.ms.dao.order.mapper;

import com.shanyuan.platform.ms.dao.order.entity.SyOrderCoupon;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderCouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyOrderCouponMapper {
    int countByExample(SyOrderCouponExample example);

    int deleteByExample(SyOrderCouponExample example);

    int deleteByPrimaryKey(Integer ocId);

    int insert(SyOrderCoupon record);

    int insertSelective(SyOrderCoupon record);

    List<SyOrderCoupon> selectByExample(SyOrderCouponExample example);

    SyOrderCoupon selectByPrimaryKey(Integer ocId);

    int updateByExampleSelective(@Param("record") SyOrderCoupon record, @Param("example") SyOrderCouponExample example);

    int updateByExample(@Param("record") SyOrderCoupon record, @Param("example") SyOrderCouponExample example);

    int updateByPrimaryKeySelective(SyOrderCoupon record);

    int updateByPrimaryKey(SyOrderCoupon record);
}