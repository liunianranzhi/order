package com.shanyuan.platform.ms.core.store;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.dao.user.entity.SyInviteCircleLog;



/**
 * 
 * @author 冯志红
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class InviteLogServiceTest {

	@Autowired
	private InviteLogService inviteLogService;
	
	@Test
	public void TestUpdateByPrimaryKeySelective() {
		SyInviteCircleLog syInviteCircleLog = new SyInviteCircleLog();
		syInviteCircleLog.setRecId(1);
		syInviteCircleLog.setMemberId(375442);
		boolean updateByPrimaryKeySelective = inviteLogService.updateByPrimaryKeySelective(syInviteCircleLog);
		if(updateByPrimaryKeySelective == true) {
			syInviteCircleLog.setMemberId(375443);
			updateByPrimaryKeySelective = inviteLogService.updateByPrimaryKeySelective(syInviteCircleLog);
		}
		Assert.assertNotNull(updateByPrimaryKeySelective);
	}
	
	@Test
	public void TestGetLog() {
		SyInviteCircleLog log = inviteLogService.getLog(375443, 12310);
		System.out.println(log.getMemberId());
	}
}
