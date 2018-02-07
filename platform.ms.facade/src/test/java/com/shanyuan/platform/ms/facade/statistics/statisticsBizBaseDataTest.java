package com.shanyuan.platform.ms.facade.statistics;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.ms.facade.TestApplicationFacade;

@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = TestApplicationFacade.class)
public class statisticsBizBaseDataTest {

	@Autowired
	private OrderStatisticsFacade orderStatisticsFacade;
	
	@Test
	public void testStatisticsBizBaseData() {
//		orderStatisticsFacade.getBizOrderStatisticsBaseData(1502183571, 1510819044, 0, 100);
//		orderStatisticsFacade.getPlatFormSellerDataPack(20161205, 20170928);
//		orderStatisticsFacade.getBizOrderStatisticsBaseData(1502183571, 1510819044);
//		orderStatisticsFacade.getPlatFormSellerDataPack(20170924);
		orderStatisticsFacade.statisticsBizBaseData(1453882527, 1477556127);
	}
}
