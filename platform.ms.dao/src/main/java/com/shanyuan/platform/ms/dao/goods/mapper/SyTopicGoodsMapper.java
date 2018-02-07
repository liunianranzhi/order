package com.shanyuan.platform.ms.dao.goods.mapper;

import com.shanyuan.platform.ms.dao.goods.entity.SyTopicGoods;
import com.shanyuan.platform.ms.dao.goods.entity.SyTopicGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyTopicGoodsMapper {
    int countByExample(SyTopicGoodsExample example);

    int deleteByExample(SyTopicGoodsExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SyTopicGoods record);

    int insertSelective(SyTopicGoods record);

    List<SyTopicGoods> selectByExample(SyTopicGoodsExample example);

    SyTopicGoods selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SyTopicGoods record, @Param("example") SyTopicGoodsExample example);

    int updateByExample(@Param("record") SyTopicGoods record, @Param("example") SyTopicGoodsExample example);

    int updateByPrimaryKeySelective(SyTopicGoods record);

    int updateByPrimaryKey(SyTopicGoods record);

    /**
     * @auther by zy
     * @param record
     * @return
     */
    int updateMoreNum(SyTopicGoods record);
    int updateLessNum(SyTopicGoods record);
}