package com.shanyuan.platform.ms.facade.push;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.ms.core.constant.enums.MessageType;
import com.shanyuan.platform.ms.facade.TestApplicationFacade;

/**
 * 
 * @author yangjian
 * @date 2017/12/14
 *
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = TestApplicationFacade.class)
public class PushMessageFacadeTest {
	
	@Autowired
	private PushMessageFacade pushMessageFacade;
	
	@Test
	public void pushMessageTest(){
		Boolean pushMessage = this.pushMessageFacade.pushMessage("c7e9029c30f1841877ef1df67d071693", 0, "推送", "推送", 0, MessageType.MESSAGE_TYPE_POINTS.getCode());
		System.out.println(pushMessage);
	}

}
