package com.shanyuan.platform.ms.core.user;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.dao.user.entity.SyGloryTypeList;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class GloryDealServiceTest {

	@Autowired
	private GloryDealService gloryDealService;

//	// @Test
//	public void checkGlory() {
//
//		gloryDealService.checkGlory(38);
//	}
//
//	@Test
//	public void checkCacheGlory() {
//		List<SyGloryTypeList> list = gloryDealService.getAllGloryTypeList();
//		for (SyGloryTypeList glory : list) {
//			System.out.println("gloryName : " + glory.getGloryName() + "; gloryCode : " + glory.getGloryCode());
//		}
//	}
	/**
	 * @author 获取所有平台的勋章列表
	 */
	@Test
	public void getAllGloryTypeListTest() {
		List<SyGloryTypeList> allGloryTypeList = gloryDealService.getAllGloryTypeList(1);
		System.out.println(allGloryTypeList);
	}
	
	/**
	 * @author RZM
	 */
	@Test
	public void checkGloryTest() {
		Integer memberId=38;
		gloryDealService.checkGlory(memberId);
	}
	/**
	 * @author Rzm
	 */
	@Test

	public void checkCacheGlory(){
		List<SyGloryTypeList> list = gloryDealService.getAllGloryTypeList(1);
		for (SyGloryTypeList glory : list) {
			System.out.println("gloryName : " + glory.getGloryName() 
					+ "; gloryCode : " + glory.getGloryCode());
		}
	}
	@Test
	public void sendMessageForGloryTest() {
		gloryDealService.sendMessageForGlory(38);

	}
	
	@Test
	public void deleteGloryTest() {
		
	}
	
}
