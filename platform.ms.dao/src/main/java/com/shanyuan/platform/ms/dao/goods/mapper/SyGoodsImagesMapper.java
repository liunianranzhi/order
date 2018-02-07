package com.shanyuan.platform.ms.dao.goods.mapper;

import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsImages;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsImagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyGoodsImagesMapper {
    int countByExample(SyGoodsImagesExample example);

    int deleteByExample(SyGoodsImagesExample example);

    int deleteByPrimaryKey(Integer goodsImageId);

    int insert(SyGoodsImages record);

    int insertSelective(SyGoodsImages record);

    List<SyGoodsImages> selectByExample(SyGoodsImagesExample example);

    SyGoodsImages selectByPrimaryKey(Integer goodsImageId);

    int updateByExampleSelective(@Param("record") SyGoodsImages record, @Param("example") SyGoodsImagesExample example);

    int updateByExample(@Param("record") SyGoodsImages record, @Param("example") SyGoodsImagesExample example);

    int updateByPrimaryKeySelective(SyGoodsImages record);

    int updateByPrimaryKey(SyGoodsImages record);
}