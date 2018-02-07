package com.shanyuan.platform.ms.core.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.dao.user.entity.SyGuideShowState;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class SyGuideShowStateServiceTest {

	@Autowired
	private SyGuideShowStateService guideShowStateService;

	
	/**
	 * @author Rzm
	 * 根据用户Id获取引导
	 */
	@Test
	public void getGuideShowStateByMemberTest() {
		Integer memberId=38;
		SyGuideShowState guideShowStateByMember = guideShowStateService.getGuideShowStateByMember(memberId);
		System.err.println(guideShowStateByMember);
	}
	
	/**
	 * @author RZM
	 * 根据sy_guide_Show_States更新对象。
	 */
	@Test
	public void updateAgreementTest() {
		byte agreement=0;
		Integer recId=64;
		guideShowStateService.updateAgreement(recId, agreement);
	}
	
	
	
	
//	@Test
//	public void TestGetGuideShowStateByMember() {
//		SyGuideShowState guideShowStateByMember = guideShowStateService.getGuideShowStateByMember(22560);
//		Assert.assertNotNull(guideShowStateByMember);
//	}
}
