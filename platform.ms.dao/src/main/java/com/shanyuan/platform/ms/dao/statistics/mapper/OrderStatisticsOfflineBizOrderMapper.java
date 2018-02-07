package com.shanyuan.platform.ms.dao.statistics.mapper;

import com.shanyuan.platform.ms.dao.statistics.entity.OfflineStatisticsDomain;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsOfflineBizOrder;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsOfflineBizOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderStatisticsOfflineBizOrderMapper {
	
	List<OfflineStatisticsDomain> getOfflineOrderStatisticsInofs(@Param("cTime") Integer cTime);
	
    int countByExample(OrderStatisticsOfflineBizOrderExample example);

    int deleteByExample(OrderStatisticsOfflineBizOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderStatisticsOfflineBizOrder record);

    int insertSelective(OrderStatisticsOfflineBizOrder record);

    List<OrderStatisticsOfflineBizOrder> selectByExample(OrderStatisticsOfflineBizOrderExample example);

    OrderStatisticsOfflineBizOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderStatisticsOfflineBizOrder record, @Param("example") OrderStatisticsOfflineBizOrderExample example);

    int updateByExample(@Param("record") OrderStatisticsOfflineBizOrder record, @Param("example") OrderStatisticsOfflineBizOrderExample example);

    int updateByPrimaryKeySelective(OrderStatisticsOfflineBizOrder record);

    int updateByPrimaryKey(OrderStatisticsOfflineBizOrder record);
    
    int batchBizOrderInsert(@Param("records") List<OrderStatisticsOfflineBizOrder> records);
}