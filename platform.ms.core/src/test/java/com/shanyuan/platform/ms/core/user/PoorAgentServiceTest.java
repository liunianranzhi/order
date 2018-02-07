package com.shanyuan.platform.ms.core.user;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.dao.user.entity.SyPoorAgent;
/**
 * 
 * @author 冯志红
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class PoorAgentServiceTest{

	@Autowired
	private PoorAgentService poorAgentService;
	
	@Test
	public void TestGetPoorAgentByMemberId() {
		SyPoorAgent poorAgentByMemberId = poorAgentService.getPoorAgentByMemberId(56984);
		Assert.assertNotNull(poorAgentByMemberId);
	}
}
