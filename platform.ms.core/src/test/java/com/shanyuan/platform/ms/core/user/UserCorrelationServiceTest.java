package com.shanyuan.platform.ms.core.user;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSONObject;
import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.core.user.bo.MemberBo;
import com.shanyuan.platform.ms.core.user.bo.MemberRoleInfo;
import com.shanyuan.platform.ms.core.user.bo.UserBaseinfo;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleMember;
import com.shanyuan.platform.ms.dao.user.entity.SyAdminBoc;
import com.shanyuan.platform.ms.dao.user.entity.SyGroupManager;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.dao.user.entity.SyPoor;
import com.shanyuan.platform.ms.dao.user.entity.SyRole;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class UserCorrelationServiceTest {

	@Autowired
	private UserCorrelationService uCorrelationService;
	
	
	/**
	 * @author 获取用户这是姓名
	 */
	@Test
	public void getUserTrueNameTest() {
		SyMember member=uCorrelationService.getMemberInfoByMobile("13801321278");
		String userTrueName = uCorrelationService.getUserTrueName(member);
		System.err.println(userTrueName);
	}
	
	/**
	 * @author Rzm test
	 * 根据商店Id集合查询对应用户集合
	 */
	@Test
	public  void selectMemberByStoreIdsTest() {
		List<Integer> storeId=new ArrayList<>();
		storeId.add(31);
		storeId.add(32);
		List<SyMember> selectMemberByStoreIds = uCorrelationService.selectMemberByStoreIds(storeId);
		System.err.println(selectMemberByStoreIds);
	}
	/**
	 * @author Rzm
	 * 根据Token获取用户id
	 */
	@Test
	public void getMemberRoleInfoTest() {
		Integer memberId=38;
		MemberRoleInfo memberRoleInfo = uCorrelationService.getMemberRoleInfo(memberId);
		System.err.println(memberRoleInfo);
	}
	/**
	 * @author RZM
	 * 根据用户登录token获得用户信息
	 */
	@Test
	public void getMemberByTokenTest(){
		String token="486d2f6cfec26e6b9dc3f7c8922ad522";
		SyMember memberByToken = uCorrelationService.getMemberByToken(token);
		System.err.println(memberByToken);
	}
	/**
	 * @author Rzm
	 * 根据member获取member对应的poorlist,同时返回数据为member
	 */
	@Test
	public void getPoorListBySupportMemberIdTest() {
		String channel="";
		Integer memberId=38;
		uCorrelationService.getPoorListBySupportMemberId(memberId);
	}
	/**
	 * @author Rzm
	 * 根据微信的openId查找对应用户的信息
	 */
	@Test
	public void getMemberInfoByWxOpenIdTest() {
		String wxOpenId="oqpZGwOXf5Fl6ixcyZnLIpra4FrA";
		uCorrelationService.getMemberInfoByWxOpenId(wxOpenId);
	}
	/**
	 * @author Rzm
	 * 获取用户基本信息
	 */
	@Test
	public void getUserBaseinfoTest() {
		SyMember member = uCorrelationService.getMemberInfo(38);
		String channel="";
		UserBaseinfo userBaseinfo = uCorrelationService.getUserBaseinfo(member, channel);
		System.err.println(userBaseinfo);
	}
	
	
	@Test
	public void getMemberInfo() throws Exception {
		
		
		SyMember memberInfo = uCorrelationService.getMemberInfo(2);
		System.err.println(memberInfo);
		
	}
	
	@Test
	public void getCircleInfoOnlyBocOrg() throws Exception {
		
		SyCircleMember bocOrg = uCorrelationService.getCircleInfoOnlyBocOrg(38);
		System.err.println(bocOrg);
	}
	
	@Test
	public void getPoorInfo() throws Exception {
		
		SyPoor poorInfo = uCorrelationService.getPoorInfo(2277);
		System.err.println(poorInfo);
	}
	
	@Test
	public void getRoleAgent() throws Exception {
		
		SyRole roleAgent = uCorrelationService.getRoleAgent(26250);
		System.err.println(roleAgent);
	}
	
	@Test
	public void getAdminBoc() throws Exception {
		
		SyAdminBoc adminBoc = uCorrelationService.getAdminBoc(38);
		System.err.println(adminBoc);
	}
	
	@Test
	public void getGroupManager() throws Exception {
		
		SyGroupManager groupManager = uCorrelationService.getGroupManager(38);
		System.err.println(groupManager);
	}
	
	@Test
	public void getMemberByToken(){
		SyMember syMember = uCorrelationService.getMemberByToken("1d0fc68547253dce068077ef1105ef98");
		System.out.println(syMember);
	}
	
	/**
	 * 获取用户中元积分总排名 
	 */
	@Test
	public void getBocPointsRankByMemberId() {
		
		Integer point = uCorrelationService.getBocPointsRankByMemberId(1);
		
		Assert.assertNotNull(point);
	}
	
	/**
	 * 获取用户邀请的益客人数
	 */
	@Test
	public void getInviteNumByMember() {
		
		Integer num = uCorrelationService.getInviteNumByMember(1);
		
		System.err.println(num);
	}
	
	/**
	 * 获取帮扶人帮助的贫困户列表
	 * @param memberId
	 * @return  List<MemberBo>
	 * @author zhangwd
	 */
	@Test
	public void getPoorListBySupportMemberId() {
	
		List<MemberBo> poorList = this.uCorrelationService.getPoorListBySupportMemberId(2002560);
		
		System.err.println(poorList);
	}
	
	/**
	 * 获取用户角色
	 */
	 @Test
	 public void getMemberRoleInfo() {
		 
		MemberRoleInfo memberRoleInfo = uCorrelationService.getMemberRoleInfo(2002560);
		System.out.println(memberRoleInfo);
		System.err.println("");
	 }
	 /**
	  * 获取用户基本信息
	  * @Author wang chunru
	  * @Description 
	  * @param 
	  * @return void
	  * @throws
	  */
	 @Test
	 public void getUserBaseinfo() {
		SyMember member = new SyMember();
		//member.setMemberId(27748);//贫困户
		member.setMemberId(93129);
		try {
			
			UserBaseinfo info = uCorrelationService.getUserBaseinfo(member, null);
			System.out.println(JSONObject.toJSONString(info));
			System.err.println("");
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }
	 
	 @Test
	 public void register(){
		 SyMember member = uCorrelationService.register("1991911994", "123456", "1991911994", "1991911994", "1991911994", "boc", (byte)0);
		 System.out.println(member.getMemberId());
	 }
	
}
