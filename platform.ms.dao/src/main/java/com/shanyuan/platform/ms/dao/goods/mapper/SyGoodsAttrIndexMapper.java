package com.shanyuan.platform.ms.dao.goods.mapper;

import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsAttrIndex;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsAttrIndexExample;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsAttrIndexKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyGoodsAttrIndexMapper {
    int countByExample(SyGoodsAttrIndexExample example);

    int deleteByExample(SyGoodsAttrIndexExample example);

    int deleteByPrimaryKey(SyGoodsAttrIndexKey key);

    int insert(SyGoodsAttrIndex record);

    int insertSelective(SyGoodsAttrIndex record);

    List<SyGoodsAttrIndex> selectByExample(SyGoodsAttrIndexExample example);

    SyGoodsAttrIndex selectByPrimaryKey(SyGoodsAttrIndexKey key);

    int updateByExampleSelective(@Param("record") SyGoodsAttrIndex record, @Param("example") SyGoodsAttrIndexExample example);

    int updateByExample(@Param("record") SyGoodsAttrIndex record, @Param("example") SyGoodsAttrIndexExample example);

    int updateByPrimaryKeySelective(SyGoodsAttrIndex record);

    int updateByPrimaryKey(SyGoodsAttrIndex record);
}