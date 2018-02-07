package com.shanyuan.platform.ms.core.goods.impl;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.core.union.UnionService;
import com.shanyuan.platform.ms.core.user.UserCorrelationService;
import com.shanyuan.platform.ms.core.user.bo.MemberBo;
import com.shanyuan.platform.ms.core.user.bo.MemberRoleInfo;
import com.shanyuan.platform.ms.core.user.bo.UserBaseinfo;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleMember;
import com.shanyuan.platform.ms.dao.user.entity.SyAdminBoc;
import com.shanyuan.platform.ms.dao.user.entity.SyGroupManager;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.dao.user.entity.SyPoor;
import com.shanyuan.platform.ms.dao.user.entity.SyRole;
import com.shanyuan.platform.ms.dao.user.entity.SyShopAccount;

/**
 * 
 * @author 冯志紅
 *
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = TestApplicationCore.class)
public class UserCorrelationServiceTest {

	@Autowired
	private UserCorrelationService userCorrelationService;
	
	@Autowired
	private UnionService unionService;
	
	@Test
	public void TestGetMemberInfo() {
		SyMember memberInfo = userCorrelationService.getMemberInfo(62);
		Assert.assertNotNull(memberInfo);
	}
	@Test
	public void TestSelectMemberByStoreIds() {
		List storeId = new ArrayList<>();
		storeId.add(1);
		storeId.add(44);
		List list = userCorrelationService.selectMemberByStoreIds(storeId);
		System.out.println(list);
	}
	
	
	@Test
	public void TestGetCircleInfoOnlyBocOrg() {
		SyCircleMember circleInfoByMemberId = userCorrelationService.getCircleInfoByMemberId(null);
		System.out.println(circleInfoByMemberId);
	}
	@Test
	public void TestGetPoorInfo() {
		SyPoor poorInfo = userCorrelationService.getPoorInfo(26275);
		Assert.assertNotNull(poorInfo);
	}
	
	@Test
	public void TestGetRoleAgent() {
		SyRole roleAgent = userCorrelationService.getRoleAgent(92057);
		Assert.assertNotNull(roleAgent);
	}
	@Test
	public void TestgetVendor() {
		SyShopAccount vendor = userCorrelationService.getVendor(381058);
		System.out.println(vendor);
	}
	@Test
	public void TestGetAdminBoc() {
		SyAdminBoc adminBoc = userCorrelationService.getAdminBoc(374359);
		System.out.println(adminBoc);
	}
	@Test
	public void TestGetGroupManager() {
		SyGroupManager groupManager = userCorrelationService.getGroupManager(1113);
		System.out.println(groupManager);
			}
	@Test
	public void TestRegister() {
		String userName = "13699179302";
		String passwd = "81b938ab3311493e337b57d0a4681ad1";
		String mobile = "13699179302";
		String trueName = "潘福燕";
		String idValue = "370102197005154521"; 
		String channel = null;
		Byte memberSex = 2;
		SyMember register = userCorrelationService.register(userName, passwd, mobile, trueName, idValue, channel, memberSex);
		System.out.println(register);
	}
	
	@Test
	public void TestGetMemberRoleInfo() {
		MemberRoleInfo memberRoleInfo = userCorrelationService.getMemberRoleInfo(1192);
		System.out.println(memberRoleInfo);
	}
	
	@Test
	public void TestGetCircleInfoByMemberId() {
		SyCircleMember circleInfoByMemberId = userCorrelationService.getCircleInfoByMemberId(1035461);
		System.out.println(circleInfoByMemberId);
	}
	@Test
	public void testGetMemberInfoByMemberName() {
		String memberName = "15934028735";
		SyMember memberInfoByMemberName = userCorrelationService.getMemberInfoByMemberName(memberName);
		System.out.println(memberInfoByMemberName);
	}
	@Test
	public void testGetMemberByToken() {
		SyMember memberByToken = userCorrelationService.getMemberByToken("d3f9035e7e0bc8108d4d2e7c1a418f75");
		Assert.assertNotNull(memberByToken);
	}
	
	@Test
	public void TestGetSyCircleMemberByMemberId() {
		SyCircleMember syCircleMemberByMemberId = unionService.getSyCircleMemberByMemberId(63);
		Assert.assertNotNull(syCircleMemberByMemberId);
	}
	
	@Test
	public void TestGetPoorListBySupportMemberId() {
		List<MemberBo> poorListBySupportMemberId = userCorrelationService.getPoorListBySupportMemberId(50);
		Assert.assertNotNull(poorListBySupportMemberId);
	}
	
	@Test
	public void TestGetBocPointsRankByMemberId() {
		Integer bocPointsRankByMemberId = userCorrelationService.getBocPointsRankByMemberId(60);
		Assert.assertNotNull(bocPointsRankByMemberId);
	}
	
	@Test
	public void TestGetInviteNumByMember() {
		 Integer inviteNumByMember = userCorrelationService.getInviteNumByMember(61);
		Assert.assertNotNull(inviteNumByMember);
	}
	
	@Test
	public void TestGetMemberInfoByWxOpenId() {
		 SyMember memberInfoByWxOpenId = userCorrelationService.getMemberInfoByWxOpenId("oqpZGwCdFnUIOipalPGNpDT0Ychw");
		System.out.println("*********"+ memberInfoByWxOpenId);
	}
	
	@Test
	public void TestGetAgentRoleName() { 
		//case1:产品类型goodsProjectType=24 
		//String agentRoleName = userCorrelationService.getAgentRoleName(24, null, null);
		//case2:产品类型为17
		//String agentRoleName = userCorrelationService.getAgentRoleName(17, 107841, 96395);
		//case3:产品类型为其他时
		String agentRoleName = userCorrelationService.getAgentRoleName(5, 107841, 96395);
		Assert.assertNotNull(agentRoleName);
	}
	
	@Test
	public void TestGetUnpayOrderDetailTopText() {
		//case1:goodsProjectType=17
//		 String unpayOrderDetailTopText = userCorrelationService.getUnpayOrderDetailTopText(17, 109855, 33255);
		//case2:goodsProjectType=24
//		String unpayOrderDetailTopText = userCorrelationService.getUnpayOrderDetailTopText(24, 109855, 33255);
		//case3:其他
		String unpayOrderDetailTopText = userCorrelationService.getUnpayOrderDetailTopText(6, 109855, 33255);
		System.out.println("*********"+ unpayOrderDetailTopText);
	}
	
	@Test
	public void TestGetUnpayOrderDetailBottomText() {
		//case1:goodsProjectType=17
//		 String unpayOrderDetailBottomText = userCorrelationService.getUnpayOrderDetailTopText(17, 109855, 33255);
		//case2:goodsProjectType=24
		String unpayOrderDetailBottomText = userCorrelationService.getUnpayOrderDetailTopText(24, 109855, 33255);
		//case3:其他
		//String unpayOrderDetailBottomText = userCorrelationService.getUnpayOrderDetailBottomText(6, 109855, 33255);
		System.out.println("*********"+ unpayOrderDetailBottomText);
	}
	
	/**
	 * 显示用户真实姓名
	 */
	@Test
	public void TestGetUserTrueName() {
		SyMember member = new SyMember();
		member.setMemberIcId(65);
		member.setMemberType((byte)2);
		String userTrueName = userCorrelationService.getUserTrueName(member);
		System.out.println(userTrueName);
	}
	
	@Test
	public void TestGetMemberInfoByMobile() {
		String mobile = "13439216330";
		SyMember memberInfoByMobile = userCorrelationService.getMemberInfoByMobile(mobile );
		System.out.println(memberInfoByMobile);
	}
	
	/**
	 * 测试用户信息
	 */
	
	@Test
	public void TestGetUserBaseinfo() {
		SyMember member = new SyMember();
		member.setMemberId(1035461);
		member.setMemberType((byte)1);
		String channel = "boc";
		UserBaseinfo userBaseinfo = userCorrelationService.getUserBaseinfo(member, channel);
		System.out.println(userBaseinfo);
	}
	
}
