package com.shanyuan.platform.ms.facade.statistics;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.ms.facade.TestApplicationFacade;

@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = TestApplicationFacade.class)
public class StatisticsOrderTest {
	
	@Autowired
	private OrderStatisticsFacade orderStatisticsFacade;
	
	@Autowired
	UnionBuyerStatisticsFacade unionBuyerStatisticsFacade;
	
	@Autowired
	UnionSaleStatisticsFacade unionSaleStatisticsFacade;
	
	@Test
	public void createTest(){
		orderStatisticsFacade.createTable("abcdefg");
	}
	
	/**
	 * 将数据加入base主表
	 * @author FZ
	 */
	@Test
	public void getOrderStatisticsBaseDataTest() {
//		orderStatisticsFacade.getOrderStatisticsBaseData(1508309388, 1514359411, 0, 0);
//		orderStatisticsFacade.getOrderStatisticsBaseData(1514445703, 1514445705, 0, 0);
	}
	
	/**
	 * 将base数据加入到union表
	 * @author FZ
	 */
	@Test
	public void insertUnionTableTest() {
//		orderStatisticsFacade.getUnionBuyTableData(1514445703,1514445705);
		orderStatisticsFacade.getAreaTableData(20171227);
	}
	
	@Test
	public void insertPlatFormSaleStatistics() {
//		orderStatisticsFacade.getUnionBuyTableData(1514445703,1514445705);
//		orderStatisticsFacade.platFormSaleStatistics(20160512,20161024);
	}
	@Test
	public void showPovertyOverviewDate() {
//		List<PovertyAllevaitionOverviewDomain> showPovertyOverviewDate = orderStatisticsFacade.showPovertyOverviewDate(20161019, 31, null);
//		for (PovertyAllevaitionOverviewDomain povertyAllevaitionOverviewDomain : showPovertyOverviewDate) {
//			System.err.println(povertyAllevaitionOverviewDomain.getHelpAmount());
//		}
//		orderStatisticsFacade.platFormSaleStatistics(20170808,20170810);
	}
	
	@Test
	public void insertBuyerStatistics() {
		Long time = System.currentTimeMillis();
		unionBuyerStatisticsFacade.insertBuyerStatistics(20180106);
		System.err.println(System.currentTimeMillis() - time);
	}
	
	@Test
	public void insertSaleStatistics() {
		Long time = System.currentTimeMillis();
//		unionSaleStatisticsFacade.insertSaleStatistics(20171011);
		unionSaleStatisticsFacade.insertSaleStatistics(20170924);
		System.err.println(System.currentTimeMillis() - time);
	}
	
	

}
