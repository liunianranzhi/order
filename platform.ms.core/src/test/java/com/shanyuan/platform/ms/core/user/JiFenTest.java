package com.shanyuan.platform.ms.core.user;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.ObjectUtils;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.core.constant.OrderConstant;
import com.shanyuan.platform.ms.core.constant.PointConstant;
import com.shanyuan.platform.ms.core.user.bo.PointsLogBo;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.dao.user.entity.SyPointsLog;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class JiFenTest {
 
	@Autowired
	private PointManageService pms;

	@Autowired
	private UserCorrelationService userCorrelationService;

	/**
	 * @author Rzm 获取积分详情
	 */
	@Test
	public void getPointDetailTest() {
		Integer memberId = 21272;
		List<String> plStages = null;
		String orderBy = null;
		Integer pageSize = 10;
		Integer currentPage = 1;
		String type = "detail";
		List<PointsLogBo> pointDetail = pms.getPointDetail(memberId, plStages, orderBy, pageSize, currentPage, type);
		System.err.println(pointDetail);
	}

	/**
	 * @author Rzm 查看是否可以使用积分
	 */
	@Test
	public void validatePointTest() {
		Integer needPoints = 500;
		Integer bocPoints = 17200;
		Integer bocPointsUsed = 17000;
		pms.validatePoint(needPoints, bocPoints, bocPointsUsed);
	}

	/**
	 * @author Rzm 根据member_id判断该用户是否可以增加积分
	 */
	@Test
	public void inviteValidatePointTest() {
		Integer memberId = 1036522;
		boolean inviteValidatePoint = pms.inviteValidatePoint(memberId);
		System.err.println(inviteValidatePoint);
	}

	/**
	 * @author Rzm 根据type更新member_id用户对应的积分
	 */
	@Test
	public void correctPointTest() {
		Integer buyerId = 38;
		Integer points = 5;
		Integer type = 2;
		pms.correctPoint(buyerId, points, type);
	}

	/**
	 * @author Rzm member_id使用积分
	 */
	@Test
	public void usePointTest() {
		Integer buyerId = 38;
		Integer bocPoints = 10;
		pms.usePoint(buyerId, bocPoints);
	}

	/**
	 * @author Rzm 获取操作阶段
	 */
	@Test
	public void getFromTypeTest() {
		String plStage = "donate_money";
		String plDesc = "";
		String fromType = pms.getFromType(plStage, plDesc);
		System.err.println(fromType);
	}

	/**
	 * @author Rzm 增加一条会员日志的记录
	 */
	@Test
	public void addPointLogTest() {
		SyMember syMember = userCorrelationService.getMemberInfo(38);
		Integer orderId = 10000;
		Integer adminId = 10001;
		String adminName = "Rzm";
		Integer bocPoints = 10;
		String desc = "啥也没有";
		String stage = "donate_money";
		Integer memberId2 = 10001010;
		String channel = "xian";
		boolean addPointLog = pms.addPointLog(syMember, orderId, adminId, adminName, bocPoints, desc, stage, memberId2,
				channel);
		System.err.println(addPointLog);
	}

	/**
	 * @author Rzm 查询用户积分列表
	 */
	@Test
	public void selectUserPointListTest() {
		Integer memberId = 38;
		PageInfo<SyPointsLog> pageinfo = null;
		PageInfo<SyPointsLog> selectUserPointList = pms.selectUserPointList(pageinfo, memberId);
		System.err.println(selectUserPointList.getSize());
	}
	
	
	/**
	 * @author Rzm
	 */
	@Test
	public void addYikePointsTest() {
		SyPointsLog syPointsLog=new SyPointsLog();
		syPointsLog.setPlStage("donate_money");
		Integer points=10;
		Integer memberId=38;
		pms.addYikePoints(memberId, points, syPointsLog);	
	}
//	/**
//	 * @author Rzm
//	 */
//	@Test
//	public void addCachePointsTest() {
//		SyMember syMember=userCorrelationService.getMemberInfo(38);
//		Integer points=10;
//		Integer invMid=0;
//		String channel="web";
//		String stage="login";
//		String desc = null;
//		pms.addCachePoints(syMember, points, invMid, channel, stage, desc);
//	}
	@Test
	public void getPointDetail() {
		List<PointsLogBo> pointDetail = pms.getPointDetail(102412, null, null, null, null, "detail");
		// Integer memberId ,Integer inviteId ,Integer points ,String stage ,String
		// channel ,String desc,int defaultNum,Integer type)
		System.out.println(JSON.toJSONString(pointDetail));
	}
	

	// @Test
	public void testvalidatePoint() {
		pms.validatePoint(1, 2, 3);
	}

	@Test
	public void addPoint() {
		SyMember syMember = new SyMember();
		syMember.setMemberTruename("zhonghua");
		syMember.setMemberId(8474);
		syMember.setMemberName("13718756965");
		Integer bocPoints = 100;
		bocPoints = ObjectUtils.isEmpty(bocPoints) ? 0 : bocPoints;
		pms.addPointLog(syMember, 1234, null, null, 0 - bocPoints, "购买善源商场产品(积分支付)",
				PointConstant.PointStage.ORDER_POINTS, 0, OrderConstant.OrderChannelType.BOC);
	}
	/**
	 * @author Rzm
	 */
	@Test
	public void updateDbPointsTest() {
		Integer type=1;
		Integer points=10;
		Integer memberId=38;
		pms.updateDbPoints(memberId, points, type);
	}
	
	/**
	 * @author Rzm
	 */
	@Test
	public void sendMessageForPointTest() {
		Integer points=10;
		Integer memberId=38;
		pms.sendMessageForPoint(memberId, points);
	}
	// @Test
	public void testcorrectPoint() {
		// Integer buyerId,Integer points,Integer type
		pms.correctPoint(52, 20, 1);
	}

	// @Test
	public void testusePoint() {
		// Integer buyerId,String memberName,String buyerTrueName,Integer
		// bocPoints,Integer orderId,String BuyerChannel
		// pms.usePoint(52, "13699179302", "潘福燕", 22, 631, "");
	}

	// @Test
	public void isRepeatAddPoints() {
		// Integer memberId, Integer inviteMemberId, String type
		pms.isRepeatAddPoints(52, 21, "");
	}
}
