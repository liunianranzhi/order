package com.shanyuan.platform.ms.dao.goods.mapper;

import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsClassStaple;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsClassStapleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyGoodsClassStapleMapper {
    int countByExample(SyGoodsClassStapleExample example);

    int deleteByExample(SyGoodsClassStapleExample example);

    int deleteByPrimaryKey(Integer stapleId);

    int insert(SyGoodsClassStaple record);

    int insertSelective(SyGoodsClassStaple record);

    List<SyGoodsClassStaple> selectByExample(SyGoodsClassStapleExample example);

    SyGoodsClassStaple selectByPrimaryKey(Integer stapleId);

    int updateByExampleSelective(@Param("record") SyGoodsClassStaple record, @Param("example") SyGoodsClassStapleExample example);

    int updateByExample(@Param("record") SyGoodsClassStaple record, @Param("example") SyGoodsClassStapleExample example);

    int updateByPrimaryKeySelective(SyGoodsClassStaple record);

    int updateByPrimaryKey(SyGoodsClassStaple record);
}