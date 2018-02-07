package com.shanyuan.platform.ms.dao.biz.mapper;

import com.shanyuan.platform.ms.dao.biz.entity.SyBizOrderGoods;
import com.shanyuan.platform.ms.dao.biz.entity.SyBizOrderGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyBizOrderGoodsMapper {
    int countByExample(SyBizOrderGoodsExample example);

    int deleteByExample(SyBizOrderGoodsExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SyBizOrderGoods record);

    int insertSelective(SyBizOrderGoods record);

    List<SyBizOrderGoods> selectByExampleWithBLOBs(SyBizOrderGoodsExample example);

    List<SyBizOrderGoods> selectByExample(SyBizOrderGoodsExample example);

    SyBizOrderGoods selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SyBizOrderGoods record, @Param("example") SyBizOrderGoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") SyBizOrderGoods record, @Param("example") SyBizOrderGoodsExample example);

    int updateByExample(@Param("record") SyBizOrderGoods record, @Param("example") SyBizOrderGoodsExample example);

    int updateByPrimaryKeySelective(SyBizOrderGoods record);

    int updateByPrimaryKeyWithBLOBs(SyBizOrderGoods record);

    int updateByPrimaryKey(SyBizOrderGoods record);
}