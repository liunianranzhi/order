package com.shanyuan.platform.ms.dao.user.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.shanyuan.platform.ms.dao.user.entity.SyCoupon;
import com.shanyuan.platform.ms.dao.user.entity.SyCouponExample;

public interface SyCouponMapper {
    int countByExample(SyCouponExample example);

    int deleteByExample(SyCouponExample example);

    int deleteByPrimaryKey(Integer couponId);

    int insert(SyCoupon record);

    int insertSelective(SyCoupon record);

    List<SyCoupon> selectByExample(SyCouponExample example);

    SyCoupon selectByPrimaryKey(Integer couponId);

    int updateByExampleSelective(@Param("record") SyCoupon record, @Param("example") SyCouponExample example);

    int updateByExample(@Param("record") SyCoupon record, @Param("example") SyCouponExample example);

    int updateByPrimaryKeySelective(SyCoupon record);

    int updateByPrimaryKey(SyCoupon record);
    
    int updateBlance(SyCoupon record);

    /**
     * 冲正扶贫码
     * @author zhangwd
     */
	int updateChongzhengCoupon(SyCoupon sycoupon);
}