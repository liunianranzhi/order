package com.shanyuan.platform.ms.core.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;

/**
 * 益客相关 测试
 * @author zhangwd
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class YIKECorrelationServiceTest {

	@Autowired
	private YIKECorrelationService yikeCorrelationService;
	/**
	 * @author Rzm
	 * 加入为益客
	 */
	@Test
	public void becomeInviteCircleMember() {
		Integer memberId= 373091;
		Integer circleId=12310;
		Integer inviteMemberId=363482;
		Integer inviteCircleId=90;
		Boolean becomeInviteCircleMember = yikeCorrelationService.becomeInviteCircleMember(memberId, circleId, inviteMemberId, inviteCircleId);
		System.err.println(becomeInviteCircleMember);
	}
	
}
