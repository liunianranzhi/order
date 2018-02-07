package com.shanyuan.platform.ms.dao.omorder.mapper;

import com.shanyuan.platform.ms.dao.omorder.entity.OmOrderGoods;
import com.shanyuan.platform.ms.dao.omorder.entity.OmOrderGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmOrderGoodsMapper {
    int countByExample(OmOrderGoodsExample example);

    int deleteByExample(OmOrderGoodsExample example);

    int deleteByPrimaryKey(Integer insId);

    int insert(OmOrderGoods record);

    int insertSelective(OmOrderGoods record);

    List<OmOrderGoods> selectByExample(OmOrderGoodsExample example);

    OmOrderGoods selectByPrimaryKey(Integer insId);

    int updateByExampleSelective(@Param("record") OmOrderGoods record, @Param("example") OmOrderGoodsExample example);

    int updateByExample(@Param("record") OmOrderGoods record, @Param("example") OmOrderGoodsExample example);

    int updateByPrimaryKeySelective(OmOrderGoods record);

    int updateByPrimaryKey(OmOrderGoods record);
}