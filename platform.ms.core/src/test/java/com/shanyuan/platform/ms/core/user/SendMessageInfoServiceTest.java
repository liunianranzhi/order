package com.shanyuan.platform.ms.core.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class SendMessageInfoServiceTest {

	@Autowired
	private SendMessageInfoService sendMessageInfoService;
	
//	@Test
//	public void sendmessageToMember() {
//		
//		sendMessageInfoService.sendmessageToMember(10000, 10000, "来自1000", "", "", 10000, (byte)1);
//	}
	@Test
	public void sendmessageToMemberTest(){
	Integer memberId=659;
	int fromId= 568388;
	String title="一起善源";
	String body="aaa";
	String pageUrl="链接地址";
	int orderId=271;
	byte messageType=1;
	sendMessageInfoService.sendmessageToMember(memberId, fromId, title, body, pageUrl, orderId, messageType);;
	System.err.println("通过");
	}
}
