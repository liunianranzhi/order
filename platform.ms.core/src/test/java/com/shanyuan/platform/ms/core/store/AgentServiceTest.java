package com.shanyuan.platform.ms.core.store;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.dao.user.entity.AgentBo;
/**
 * 
 * @author 冯祚
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class AgentServiceTest {
	@Autowired
	AgentService agentService;
	/**
	 * 优秀助理人
	 */
	@Test
	public void getAgentListTest() {
		List<Long> areaid3 = new ArrayList<>();
		Long num = (long) 3.0;
		areaid3.add(num);
		List<AgentBo> list = agentService.getAgentList(areaid3);
		System.out.println(list);
	}
}
