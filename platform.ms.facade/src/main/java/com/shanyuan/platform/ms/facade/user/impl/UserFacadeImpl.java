package com.shanyuan.platform.ms.facade.user.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.base.common.util.ImageUtil;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.LoginConstant;
import com.shanyuan.platform.ms.core.constant.OrderConstant;
import com.shanyuan.platform.ms.core.constant.UserConstant;
import com.shanyuan.platform.ms.core.order.OrderService;
import com.shanyuan.platform.ms.core.project.ProjectService;
import com.shanyuan.platform.ms.core.union.UnionService;
import com.shanyuan.platform.ms.core.user.UserCorrelationService;
import com.shanyuan.platform.ms.core.user.bo.MemberInfo;
import com.shanyuan.platform.ms.core.user.bo.MemberRoleInfo;
import com.shanyuan.platform.ms.core.user.bo.UserBaseinfo;
import com.shanyuan.platform.ms.dao.union.entity.SyUnion;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.facade.constant.UserFacadeConstant;
import com.shanyuan.platform.ms.facade.user.UserFacade;

/**
 * @author 曹勇军
 *
 */
@Component
public class UserFacadeImpl implements UserFacade{
	
	private final static Logger logger = LoggerFactory.getLogger(UserFacadeImpl.class);
	
	@Autowired
	private UserCorrelationService userCorrelationService;
	
	@Autowired
	private OrderService orderservice;
	
	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private UnionService  unionService;
	
	
	@Override
	public SyMember getMemberByToken(String token){
		return userCorrelationService.getMemberByToken(token);
	}
	
	@Override
	public MemberInfo getUserInfoToHome(Integer memberId, Boolean isLogin, String curChannel) {

		//curChannel 为空
		if(ObjectUtils.isEmpty(curChannel)){
			curChannel = "ykjlb";
		}

		MemberInfo memberInfo = new MemberInfo();
		if (isLogin) {
			logger.info("[登录用户]   memberId={} curChannel={}", memberId,curChannel);
			
			MemberRoleInfo roleInfo = this.userCorrelationService.getMemberRoleInfo(memberId);
			logger.info("[用户角色信息]: roleName={}, code={}", roleInfo.getRoleName(), roleInfo.getCode() );
			
			SyUnion union = unionService.getUnionByUnionChannel(curChannel);
			SyMember member = userCorrelationService.getMemberInfo(memberId);
			
			memberInfo.setIsLogin(isLogin);
			memberInfo.setCurChannel(curChannel);
			memberInfo.setCurChannelText(union.getUnionName());
			memberInfo.setBocPoints(member.getBocPoints().toString());
			if (!ObjectUtils.isEmpty(member.getMemberMobile())) {
				memberInfo.setMobileFourNum(member.getMemberMobile().substring(7));
			}
			memberInfo.setRealAvatar(ImageUtil.getUserHeadImgUrl(member.getMemberAvatar(),member.getMemberSex() ,null));
		
			//普通用户
			if (roleInfo.getCode() == LoginConstant.UserRole.USER_ROLE_COMMON_USER) {
				memberInfo.setMobileFourNum(member.getMemberMobile().substring(7));
				memberInfo.setCode(UserConstant.UserRoleCode.COMMON);
				memberInfo.setCodeFalseUrl(UserFacadeConstant.UserClickUrl.CODE_FALSE_URL);
			}
			
			//用户是员工
			if (roleInfo.getCode() == LoginConstant.UserRole.USER_ROLE_EMPLOYEE_USER) {
				//公益生活天数
				long daySub = DateUtil.getSubDays(Long.parseLong(String.valueOf(member.getMemberTime())), Long.parseLong(String.valueOf(DateUtil.getNowInt())));
				memberInfo.setSupportDay(String.valueOf(daySub));
				//公益排名 
				Integer bocPointsRank = userCorrelationService.getBocPointsRankByMemberId(memberId);
				memberInfo.setDeptRank(bocPointsRank > 10000 ? "未入榜" : String.valueOf(bocPointsRank));
				//公益排名url
				memberInfo.setDeptRankUrl(UserFacadeConstant.UserClickUrl.DEPT_RANK_URL);
				
				//所邀请的益客数量
				memberInfo.setInviteNum(userCorrelationService.getInviteNumByMember(memberId).toString());
				//益客数量为0 去邀请url
				memberInfo.setInviteNumUrl(UserFacadeConstant.UserClickUrl.INVITE_NUM_URL);
				memberInfo.setCode(UserConstant.UserRoleCode.EMP);
				
				if (!ObjectUtils.nullSafeEquals(UserConstant.UnionType.BOC, curChannel)) {
					memberInfo.setBocPointsUrl(UserFacadeConstant.UserClickUrl.BOC_POINTS_URL);
				}
			}
			
			//用户是益客
			if (roleInfo.getCode() == LoginConstant.UserRole.USER_ROLE_CODE_YIKE_USER || roleInfo.getCode() == LoginConstant.UserRole.USER_ROLE_NOCODE_YIKE_USER) {
				//公益生活天数
				long daySub = DateUtil.getSubDays(Long.parseLong(String.valueOf(member.getMemberTime())), Long.parseLong(String.valueOf(DateUtil.getNowInt())));
				memberInfo.setSupportDay(String.valueOf(daySub));
				
				//公益消费次数
				memberInfo.setBuyNum(orderservice.getMemberBuyNum(memberId, OrderConstant.OrderState.ORDER_STATE_SUCCESS).toString());
				//消费次数为0 时，去逛逛url
				memberInfo.setBuyNumUrl(UserFacadeConstant.UserClickUrl.BUY_NUM_URL);
				//参加公益项目的次数
				int wealNum = projectService.getJuanKuanProjectOrderCount(memberId, OrderConstant.OrderState.ORDER_STATE_SUCCESS)
									+ projectService.getBazaarOrderCount(memberId, OrderConstant.OrderState.ORDER_STATE_SUCCESS);
				memberInfo.setWealNum(String.valueOf(wealNum));
				//公益项目为0 时， 去围观url
				memberInfo.setWealNumUrl(UserFacadeConstant.UserClickUrl.WEAL_NUM_URL);
				memberInfo.setCode(UserConstant.UserRoleCode.YIKE);
			}
			
			//不是益客、员工、普通用户时
			if (ObjectUtils.isEmpty(memberInfo.getCode())) {
				memberInfo.setCode(UserConstant.UserRoleCode.OTHER);  //不显示此模块
				//不是益客、员工、普通用户时点击url -->完善用户信息
				//memberInfo.setCodeFalseUrl(UserFacadeConstant.UserClickUrl.CODE_FALSE_URL);
			}
			
			//----> 查询贫困户和联盟（通道）没有关系
			//只有公益中行用户（普通用户、员工、益客、助理人、贫困户），在登录后可看到该模块
			if(ObjectUtils.nullSafeEquals(curChannel, LoginConstant.CircleCode.CODE_BOC)){
				memberInfo.setPoorMemberList(this.userCorrelationService.getPoorListBySupportMemberId(memberId));
				memberInfo.setPoorUrl(UserFacadeConstant.UserClickUrl.POOR_URL);
			}
			return memberInfo;
		
		}else {
			logger.info("未登录用户   memberId={} curChannel={}", memberId,curChannel);
			memberInfo.setIsLogin(isLogin);
			memberInfo.setCurChannel(curChannel);
			
			return memberInfo;
		}
		
	}
	/**
	 * 获取用户基本信息
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return UserBaseinfo
	 * @throws
	 */
	@Override
	public UserBaseinfo getUserBaseinfo(SyMember member, String channel) throws CoreServiceException {
		return this.userCorrelationService.getUserBaseinfo(member, channel);
	}
	
}
