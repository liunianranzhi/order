package com.shanyuan.platform.ms.core.statistics;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.dao.statistics.entity.PlatformStatisticsSellerData;
import com.shanyuan.platform.ms.dao.statistics.entity.StatisticsTable;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class TestPointsStatisticsService {

	@Autowired
	private PointsStatisticsService pointsStatisticsService;
	@Autowired
	OrderStatisticsInfoService orderStatisticsInfoService;
	@Test
	public void test() {
//		StatisticsTable statisticsTable = new StatisticsTable();
//		String tableName = "point_details_tag_temp";
//		statisticsTable.setTableName(tableName);
//		pointsStatisticsService.createPointTempTable(statisticsTable);
//		pointsStatisticsService.dropTempTableService();
//		pointsStatisticsService.alterTempTableService();
		PlatformStatisticsSellerData platformStatisticsDate = orderStatisticsInfoService.getPlatformStatisticsDate(20161001,20161203);
		System.err.println(platformStatisticsDate.getAssistGoodsNum());
	}
	
}
