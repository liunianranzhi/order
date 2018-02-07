package com.shanyuan.platform.ms.dao.statistics.mapper;

import com.shanyuan.platform.ms.dao.statistics.entity.OfflineStatisticsDomain;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsOfflineBizOrderGoods;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsOfflineBizOrderGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderStatisticsOfflineBizOrderGoodsMapper {
	
	List<OfflineStatisticsDomain> getPlatFromOfflineOrderGoods(@Param("cTime") Integer cTime);
	
    int countByExample(OrderStatisticsOfflineBizOrderGoodsExample example);

    int deleteByExample(OrderStatisticsOfflineBizOrderGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderStatisticsOfflineBizOrderGoods record);

    int insertSelective(OrderStatisticsOfflineBizOrderGoods record);

    List<OrderStatisticsOfflineBizOrderGoods> selectByExample(OrderStatisticsOfflineBizOrderGoodsExample example);

    OrderStatisticsOfflineBizOrderGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderStatisticsOfflineBizOrderGoods record, @Param("example") OrderStatisticsOfflineBizOrderGoodsExample example);

    int updateByExample(@Param("record") OrderStatisticsOfflineBizOrderGoods record, @Param("example") OrderStatisticsOfflineBizOrderGoodsExample example);

    int updateByPrimaryKeySelective(OrderStatisticsOfflineBizOrderGoods record);

    int updateByPrimaryKey(OrderStatisticsOfflineBizOrderGoods record);
    
    int batchBizOrderGoodsInsert(@Param("records") List<OrderStatisticsOfflineBizOrderGoods> records);
}