package com.shanyuan.platform.ms.dao.goods.mapper;

import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsDelayMessage;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsDelayMessageExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SyGoodsDelayMessageMapper {
    int countByExample(SyGoodsDelayMessageExample example);

    int deleteByExample(SyGoodsDelayMessageExample example);

    int deleteByPrimaryKey(Integer delayId);

    int insert(SyGoodsDelayMessage record);

    int insertSelective(SyGoodsDelayMessage record);

    List<SyGoodsDelayMessage> selectByExample(SyGoodsDelayMessageExample example);

    SyGoodsDelayMessage selectByPrimaryKey(Integer delayId);

    int updateByExampleSelective(@Param("record") SyGoodsDelayMessage record, @Param("example") SyGoodsDelayMessageExample example);

    int updateByExample(@Param("record") SyGoodsDelayMessage record, @Param("example") SyGoodsDelayMessageExample example);

    int updateByPrimaryKeySelective(SyGoodsDelayMessage record);

    int updateByPrimaryKey(SyGoodsDelayMessage record);

	SyGoodsDelayMessage selectGoodsDelayMessage(Integer goodsCommonId);
}