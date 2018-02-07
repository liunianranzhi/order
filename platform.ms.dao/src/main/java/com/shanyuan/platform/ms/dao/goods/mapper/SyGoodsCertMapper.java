package com.shanyuan.platform.ms.dao.goods.mapper;

import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCert;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCertExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyGoodsCertMapper {
    int countByExample(SyGoodsCertExample example);

    int deleteByExample(SyGoodsCertExample example);

    int deleteByPrimaryKey(Integer goodsCertId);

    int insert(SyGoodsCert record);

    int insertSelective(SyGoodsCert record);

    List<SyGoodsCert> selectByExample(SyGoodsCertExample example);

    SyGoodsCert selectByPrimaryKey(Integer goodsCertId);

    int updateByExampleSelective(@Param("record") SyGoodsCert record, @Param("example") SyGoodsCertExample example);

    int updateByExample(@Param("record") SyGoodsCert record, @Param("example") SyGoodsCertExample example);

    int updateByPrimaryKeySelective(SyGoodsCert record);

    int updateByPrimaryKey(SyGoodsCert record);
}