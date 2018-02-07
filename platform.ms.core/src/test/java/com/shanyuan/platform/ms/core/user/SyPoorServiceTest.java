package com.shanyuan.platform.ms.core.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.dao.user.entity.SyPoor;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class SyPoorServiceTest {
	
	@Autowired
	private SyPoorService syPoorService;
	/**
	 * @author Rzm
	 * 根据memberId，获取对应贫困户的信息
	 */
	@Test
	public void getSyPoorByMemberIdTest() {
		Integer memberId=26248;
		SyPoor syPoorByMemberId = syPoorService.getSyPoorByMemberId(memberId);
		System.err.println(syPoorByMemberId);
		
	}
}
