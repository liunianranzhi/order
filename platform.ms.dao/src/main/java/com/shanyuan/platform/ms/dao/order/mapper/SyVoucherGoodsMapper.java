package com.shanyuan.platform.ms.dao.order.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.shanyuan.platform.ms.dao.user.entity.SyVoucherGoods;
import com.shanyuan.platform.ms.dao.user.entity.SyVoucherGoodsExample;

public interface SyVoucherGoodsMapper {
    int countByExample(SyVoucherGoodsExample example);

    int deleteByExample(SyVoucherGoodsExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SyVoucherGoods record);

    int insertSelective(SyVoucherGoods record);

    List<SyVoucherGoods> selectByExample(SyVoucherGoodsExample example);

    SyVoucherGoods selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SyVoucherGoods record, @Param("example") SyVoucherGoodsExample example);

    int updateByExample(@Param("record") SyVoucherGoods record, @Param("example") SyVoucherGoodsExample example);

    int updateByPrimaryKeySelective(SyVoucherGoods record);

    int updateByPrimaryKey(SyVoucherGoods record);
}