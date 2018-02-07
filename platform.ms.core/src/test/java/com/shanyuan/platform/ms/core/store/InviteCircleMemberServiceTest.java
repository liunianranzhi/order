package com.shanyuan.platform.ms.core.store;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.dao.user.entity.SyInviteCircleMember;
import com.shanyuan.platform.ms.dao.user.mapper.SyInviteCircleMemberMapper;

/**
 * 
 * @author 冯志红
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class InviteCircleMemberServiceTest {

	@Autowired
	private InviteCircleMemberService circleMemberService;
	private boolean updateByPrimaryKeySelective;

	@Test
	public void TestGetInviteCircleMemberByMemberId() {
		SyInviteCircleMember inviteCircleMemberByMemberId = circleMemberService.getInviteCircleMemberByMemberId(373336);
		Assert.assertNotNull(inviteCircleMemberByMemberId);
	}

	@Test
	public void TestUpdateByPrimaryKeySelective() {
		SyInviteCircleMember syInviteCircleMember = new SyInviteCircleMember();
		syInviteCircleMember.setRecId(5);
		syInviteCircleMember.setCircleId(12311);
		boolean updateByPrimaryKeySelective2 = circleMemberService.updateByPrimaryKeySelective(syInviteCircleMember);
		if(updateByPrimaryKeySelective2 == true) {
			syInviteCircleMember.setCircleId(12310);
			updateByPrimaryKeySelective2 = circleMemberService.updateByPrimaryKeySelective(syInviteCircleMember);
		}
		Assert.assertNotNull(updateByPrimaryKeySelective2);
	}

	@Test
	public void TestInsertSelective() {
		SyInviteCircleMember syInviteCircleMember = new SyInviteCircleMember();
		syInviteCircleMember.setMemberId(2);
		syInviteCircleMember.setCircleId(1);
		syInviteCircleMember.setAddTime(1492016979);
		syInviteCircleMember.setInviteCircleId(91);
		syInviteCircleMember.setInviteMemberId(363482);
		boolean insertSelective = circleMemberService.insertSelective(syInviteCircleMember);
		boolean deleteByMemberId = false;
		if(insertSelective == true) {
			deleteByMemberId = circleMemberService.deleteByMemberId(1);
		}
		Assert.assertNotNull(deleteByMemberId);
	}
}
