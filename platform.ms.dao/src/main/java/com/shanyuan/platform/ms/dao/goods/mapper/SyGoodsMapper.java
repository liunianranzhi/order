package com.shanyuan.platform.ms.dao.goods.mapper;

import com.shanyuan.platform.ms.dao.goods.entity.SyGoods;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyGoodsMapper {
    int countByExample(SyGoodsExample example);

    int deleteByExample(SyGoodsExample example);

    int deleteByPrimaryKey(Integer goodsId);

    int insert(SyGoods record);

    int insertSelective(SyGoods record);

    List<SyGoods> selectByExampleWithBLOBs(SyGoodsExample example);

    List<SyGoods> selectByExample(SyGoodsExample example);

    SyGoods selectByPrimaryKey(Integer goodsId);

    int updateByExampleSelective(@Param("record") SyGoods record, @Param("example") SyGoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") SyGoods record, @Param("example") SyGoodsExample example);

    int updateByExample(@Param("record") SyGoods record, @Param("example") SyGoodsExample example);

    int updateByPrimaryKeySelective(SyGoods record);

    int updateByPrimaryKeyWithBLOBs(SyGoods record);

    int updateByPrimaryKey(SyGoods record);
    
    int updateSaleCountAndStockCount(SyGoods record);
    int updateSaleCount(SyGoods record);
}