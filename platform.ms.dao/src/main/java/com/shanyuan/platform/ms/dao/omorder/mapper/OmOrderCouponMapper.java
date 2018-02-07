package com.shanyuan.platform.ms.dao.omorder.mapper;

import com.shanyuan.platform.ms.dao.omorder.entity.OmOrderCoupon;
import com.shanyuan.platform.ms.dao.omorder.entity.OmOrderCouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmOrderCouponMapper {
    int countByExample(OmOrderCouponExample example);

    int deleteByExample(OmOrderCouponExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(OmOrderCoupon record);

    int insertSelective(OmOrderCoupon record);

    List<OmOrderCoupon> selectByExample(OmOrderCouponExample example);

    OmOrderCoupon selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") OmOrderCoupon record, @Param("example") OmOrderCouponExample example);

    int updateByExample(@Param("record") OmOrderCoupon record, @Param("example") OmOrderCouponExample example);

    int updateByPrimaryKeySelective(OmOrderCoupon record);

    int updateByPrimaryKey(OmOrderCoupon record);
}