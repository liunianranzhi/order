package com.shanyuan.platform.ms.dao.order.mapper;

import com.shanyuan.platform.ms.dao.order.entity.SyOrder;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderExample;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderGoods;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyOrderGoodsMapper {
    int countByExample(SyOrderGoodsExample example);

    int deleteByExample(SyOrderGoodsExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SyOrderGoods record);

    int insertSelective(SyOrderGoods record);

    List<SyOrderGoods> selectByExampleWithBLOBs(SyOrderGoodsExample example);
    /**
     * @author zhongying
     * @param gevalIds
     * @return
     */
    List<SyOrderGoods> selectOrderGoodsListByEids(List<Integer> gevalIds);
    /**
     * @author zhongying
     * @param example
     * @return
     */
    List<SyOrderGoods> selectByExample(SyOrderGoodsExample example);

    SyOrderGoods selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SyOrderGoods record, @Param("example") SyOrderGoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") SyOrderGoods record, @Param("example") SyOrderGoodsExample example);

    int updateByExample(@Param("record") SyOrderGoods record, @Param("example") SyOrderGoodsExample example);

    int updateByPrimaryKeySelective(SyOrderGoods record);

    int updateByPrimaryKeyWithBLOBs(SyOrderGoods record);

    int updateByPrimaryKey(SyOrderGoods record);
    /**
     * @author zhongying
     * @param syorder
     * @return
     */
    List<SyOrderGoods> selectOrderGoodsInfo(SyOrder syorder);
    /**
     * @author zhongying
     * @param list
     * @return
     */
    List<SyOrderGoods> selectOrderGoodsByOrderIds(List<Integer> list);
    /**根据gooodsid获得商品订单信息
     * @author zhongying
     * @param list
     * @return
     */
    List<SyOrderGoods> selectOrderGoodsByGIds(@Param("orderId") Integer orderId, @Param("goodIds") List<Integer> goodIds );
}