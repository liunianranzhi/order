package com.shanyuan.platform.ms.core.member.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.core.member.MemberService;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.dao.user.entity.SyMemberWithBLOBs;


/**
 * 
 * @author 冯志红
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class MemberServiceImplTest {

	@Autowired
	private MemberService memberService;
	@Test
	public void TestUpdateByPrimaryKeySelective() {
		SyMemberWithBLOBs syMemberWithBlobs = new SyMemberWithBLOBs();
		syMemberWithBlobs.setMemberId(38);
		syMemberWithBlobs.setAvailableGiftdeposit(new BigDecimal(100));
		Integer updateByPrimaryKeySelective = memberService.updateByPrimaryKeySelective(syMemberWithBlobs);
		if(updateByPrimaryKeySelective!=null) {
			syMemberWithBlobs.setMemberId(38);
			syMemberWithBlobs.setAvailableGiftdeposit(new BigDecimal(0));
			memberService.updateByPrimaryKeySelective(syMemberWithBlobs);
		}
		Assert.assertNotNull(updateByPrimaryKeySelective);
	}
	
	@Test
	public void TestGetUserDispMobile() {
		String userDispMobile = memberService.getUserDispMobile("18352468562");
		System.out.println(userDispMobile);
	}
	
	@Test
	public void TestInsertSelective() {
		SyMemberWithBLOBs bloBs = new SyMemberWithBLOBs();
		bloBs.setSyId(0);
		bloBs.setMemberId(37);
		bloBs.setMemberName("张三");
		bloBs.setMemberIdType((byte)3);
		bloBs.setMemberParentId(1);
		bloBs.setMemberPasswd("15156156");
		bloBs.setMemberMobile("151515616");
		bloBs.setMemberEmail("1511@qq.com");
		bloBs.setMemberLoginNum(1);
		bloBs.setMemberTime("44254");
		bloBs.setMemberLoginTime("4444245");
		bloBs.setMemberOldLoginTime("41545622");
		bloBs.setMemberPoints(0);
		bloBs.setMemberType((byte)2);
		bloBs.setAvailablePredeposit(new BigDecimal(23));
		bloBs.setFreezePredeposit(new BigDecimal(0));
		bloBs.setInformAllow((byte)3);
		bloBs.setIsBuy((byte)6);
		bloBs.setIsAllowtalk((byte)3);
		bloBs.setMemberState((byte)4);
		bloBs.setMemberCredit(3);
		bloBs.setMemberSnsvisitnum(7);
		bloBs.setMemberContributeSyNum(3);
		bloBs.setMemberUsedSyNum(45);
		bloBs.setMemberContributeMoney(new BigDecimal(12));
		bloBs.setShowGoodsDonationAgreement((byte)23);
		bloBs.setSyPoints((long)123);
		bloBs.setSyPointsUsed((long)3454);
		bloBs.setLuckyDrawNumUsed(56);
		bloBs.setMemberFamilyId(1);
		bloBs.setCmLevel(2);
		bloBs.setBocPoints((long)3);
		bloBs.setBocPointsUsed((long)6);
		bloBs.setBocPointsDeptRank(4);
		bloBs.setBocPointsDeptRank(3);
		bloBs.setBocLevel(3);
		bloBs.setBocLevelTime("4514515");
		bloBs.setMemberIdBackImage("551");
		bloBs.setAvailableGiftdeposit(new BigDecimal(23));
		bloBs.setBocPointsRank(4);
		bloBs.setExtraLuckyDrawNum(23);
		boolean insertSelective = memberService.insertSelective(bloBs);
	}
	
	@Test
	public void TestGetMemberInfoByIds() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1180);
		list.add(1181);
		List<SyMember> memberInfoByIds = memberService.getMemberInfoByIds(list);
		Assert.assertNotNull(memberInfoByIds);
	}
	
	@Test
	public void TestGetMemberMapByIds() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1180);
		list.add(1181);
		Map<Integer, SyMember> memberMapByIds = memberService.getMemberMapByIds(list);
		Assert.assertNotNull(memberMapByIds);
	}
}
