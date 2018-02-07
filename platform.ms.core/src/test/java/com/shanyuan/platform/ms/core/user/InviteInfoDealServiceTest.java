package com.shanyuan.platform.ms.core.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class InviteInfoDealServiceTest {

	
	@Autowired
	private InviteInfoDealService infoDealService;
	
	@Test
	public void sendMessageToMemberForIncPoints() {
		
		infoDealService.sendMessageToMemberForIncPoints(10000000,1000000000);
		
	}
	
	@Test
	public void sendmessageToMember() {
		
		infoDealService.sendmessageToMember(10000, 10000, "来自1000", "", "", 10000, (byte)1);
	}
	
	/*@Test
	public void sendNotifyToMemberForIncPoints() {
		
		infoDealService.sendNotifyToMemberForIncPoints(10000, "", "积分变更", "", "");
	}*/
	
	@Test
	public void sendNotifyToMemberForIncPoints() {
		
		infoDealService.sendMessageToMemberForIncPoints(10000, 112121321);
	}
	/**
	 * @author Rzm
	 */
	@Test
	public void sendNotifyToMemberForIncPointsTest() {
		infoDealService.sendNotifyToMemberForIncPoints(38, "aaa", "aaa", "aaa", "aa");
	}
}
