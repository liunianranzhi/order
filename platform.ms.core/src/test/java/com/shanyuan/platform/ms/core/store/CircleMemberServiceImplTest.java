package com.shanyuan.platform.ms.core.store;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleMember;

/**
 * 
 * @author 冯志红
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class CircleMemberServiceImplTest {

	@Autowired
	private CircleMemberService circleMemberService;
	
	@Test
	public void TestGetCircleInfoOnlyBocOrg() {
		SyCircleMember circleMemberInfoByMemberId = circleMemberService.getCircleMemberInfoByMemberId(null);
		Assert.assertNotNull(circleMemberInfoByMemberId);
	}
	
	@Test
	public void TestMapplyJoinCircle() {
		boolean mapplyJoinCircle = circleMemberService.mapplyJoinCircle(null,null);
		Assert.assertNotNull(mapplyJoinCircle);
	}
	
	@Test
	public void TestGetCircleMemberInfoByMemberId() {
		SyCircleMember circleMemberInfoByMemberId = circleMemberService.getCircleMemberInfoByMemberId(null);
		Assert.assertNotNull(circleMemberInfoByMemberId);
	}
	
	@Test
	public void TestJoinCircle() {
		boolean joinCircle = circleMemberService.joinCircle(null,null);
		Assert.assertNotNull(joinCircle);
	}
	
	@Test
	public void TestInviteJoinCircle() {
		boolean inviteJoinCircle = circleMemberService.inviteJoinCircle(null, null, null, null);
		Assert.assertNotNull(inviteJoinCircle);
	}
	
}
