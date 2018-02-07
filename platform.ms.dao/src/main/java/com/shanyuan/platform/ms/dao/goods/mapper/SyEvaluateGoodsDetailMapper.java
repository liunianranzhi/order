package com.shanyuan.platform.ms.dao.goods.mapper;

import com.shanyuan.platform.ms.dao.goods.entity.SyEvaluateGoodsDetail;
import com.shanyuan.platform.ms.dao.goods.entity.SyEvaluateGoodsDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyEvaluateGoodsDetailMapper {
    int countByExample(SyEvaluateGoodsDetailExample example);

    int deleteByExample(SyEvaluateGoodsDetailExample example);

    int deleteByPrimaryKey(Integer gevalDetailId);

    int insert(SyEvaluateGoodsDetail record);

    int insertSelective(SyEvaluateGoodsDetail record);

    List<SyEvaluateGoodsDetail> selectByExample(SyEvaluateGoodsDetailExample example);

    SyEvaluateGoodsDetail selectByPrimaryKey(Integer gevalDetailId);

    int updateByExampleSelective(@Param("record") SyEvaluateGoodsDetail record, @Param("example") SyEvaluateGoodsDetailExample example);

    int updateByExample(@Param("record") SyEvaluateGoodsDetail record, @Param("example") SyEvaluateGoodsDetailExample example);

    int updateByPrimaryKeySelective(SyEvaluateGoodsDetail record);

    int updateByPrimaryKey(SyEvaluateGoodsDetail record);
}