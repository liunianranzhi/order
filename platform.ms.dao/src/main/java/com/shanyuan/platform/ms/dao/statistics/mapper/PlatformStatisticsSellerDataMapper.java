package com.shanyuan.platform.ms.dao.statistics.mapper;

import com.shanyuan.platform.ms.dao.statistics.entity.PlatformStatisticsSellerData;
import com.shanyuan.platform.ms.dao.statistics.entity.PlatformStatisticsSellerDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlatformStatisticsSellerDataMapper {
	
	PlatformStatisticsSellerData getStatisticsTotalDate(PlatformStatisticsSellerDataExample example);
	
	int batchInsertPlatformSellerData(@Param("records") List<PlatformStatisticsSellerData> records);
	
    int countByExample(PlatformStatisticsSellerDataExample example);

    int deleteByExample(PlatformStatisticsSellerDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PlatformStatisticsSellerData record);

    int insertSelective(PlatformStatisticsSellerData record);

    List<PlatformStatisticsSellerData> selectByExample(PlatformStatisticsSellerDataExample example);

    PlatformStatisticsSellerData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PlatformStatisticsSellerData record, @Param("example") PlatformStatisticsSellerDataExample example);

    int updateByExample(@Param("record") PlatformStatisticsSellerData record, @Param("example") PlatformStatisticsSellerDataExample example);

    int updateByPrimaryKeySelective(PlatformStatisticsSellerData record);

    int updateByPrimaryKey(PlatformStatisticsSellerData record);
}