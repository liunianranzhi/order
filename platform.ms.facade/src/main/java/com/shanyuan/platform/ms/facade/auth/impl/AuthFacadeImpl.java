package com.shanyuan.platform.ms.facade.auth.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.shanyuan.platform.ms.base.common.CommonRedisKey;
import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.base.common.util.ValidUtil;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.auth.AuthService;
import com.shanyuan.platform.ms.core.auth.ValidCodeService;
import com.shanyuan.platform.ms.core.auth.bo.AuthInfo;
import com.shanyuan.platform.ms.core.auth.bo.ValidCodeEnum;
import com.shanyuan.platform.ms.core.constant.AuthConstant;
import com.shanyuan.platform.ms.core.constant.CircleConstant;
import com.shanyuan.platform.ms.core.constant.ConstantReload;
import com.shanyuan.platform.ms.core.constant.LoginConstant;
import com.shanyuan.platform.ms.core.constant.PointConstant;
import com.shanyuan.platform.ms.core.constant.UnionConstant;
import com.shanyuan.platform.ms.core.member.MemberService;
import com.shanyuan.platform.ms.core.store.CircleMemberService;
import com.shanyuan.platform.ms.core.store.CircleService;
import com.shanyuan.platform.ms.core.union.UnionService;
import com.shanyuan.platform.ms.core.user.BindThirdPlatformIDService;
import com.shanyuan.platform.ms.core.user.PointManageService;
import com.shanyuan.platform.ms.core.user.UserCorrelationService;
import com.shanyuan.platform.ms.core.user.bo.LoginInfo;
import com.shanyuan.platform.ms.core.user.impl.exceptype.BindThirdPlatformIDException;
import com.shanyuan.platform.ms.dao.auth.entity.SyMbUserToken;
import com.shanyuan.platform.ms.dao.union.entity.SyBocMemberStats;
import com.shanyuan.platform.ms.dao.union.entity.SyUnion;
import com.shanyuan.platform.ms.dao.user.entity.SyCircle;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.dao.user.entity.SyMemberWithBLOBs;
import com.shanyuan.platform.ms.dao.user.entity.SyPointsLog;
import com.shanyuan.platform.ms.dao.user.entity.SyWXAcount;
import com.shanyuan.platform.ms.facade.auth.AuthFacade;
import com.shanyuan.platform.ms.facade.auth.domain.CircleInfo;
import com.shanyuan.platform.ms.facade.auth.domain.CircleInfoDomain;
import com.shanyuan.platform.ms.facade.auth.domain.SelectCircleDomain;
import com.shanyuan.platform.ms.facade.auth.domain.UnionDomain;
import com.shanyuan.platform.ms.facade.auth.domain.UnionInfo;
import com.shanyuan.platform.ms.facade.auth.impl.exceptype.AuthFacadeExcepType;


/**
 * 
 * @author 
 *
 */
@Component
public class AuthFacadeImpl implements AuthFacade{

	@Autowired
	private ValidCodeService validCodeService ;
	
	@Autowired
	private ConstantReload constantReload;
	
	@Autowired
	private AuthService authService;
	
	@Autowired
	private BindThirdPlatformIDService bindThirdPlatformIDService;
	
	@Autowired
	private UserCorrelationService userCorrelationService;
	
	@Autowired
	private CircleMemberService circleMemberService;
	
	@Autowired
	private CircleService circleService;
	
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private PointManageService pointManagerService;
	
	@Autowired
	private UnionService unionService;
	
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
	public Map<String, Object> sendValidSmsCode(String phone) throws CoreServiceException {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		if(!ValidUtil.validPhone(phone)) {
			throw new CoreServiceException(AuthFacadeExcepType.INVALID_MOBILE);
		}
		String code = RandomUtils.nextInt(100001,999999)+"";
		boolean result = this.validCodeService.sendValidCode(phone, code, ValidCodeEnum.SmsValidCode);
		if(result){
			resultMap.put("result", "验证码发送成功");
		}else{
			throw new CoreServiceException(AuthFacadeExcepType.SEND_ERROR);
		}
		return resultMap;
	}

	@Override
	public Map<String, Object> doLogin(LoginInfo loginInfo) throws CoreServiceException {
		AuthInfo authInfo = null;
		Map<String, Object> resultMap = new HashMap<String, Object>();
		//判断参数
		if((StringUtils.isEmpty(loginInfo.getMobile()) || StringUtils.isEmpty(loginInfo.getMcode())) && StringUtils.isEmpty(loginInfo.getWxOpenid())){
			logger.info("loss params, logininfo json: {}", JSONObject.toJSON(loginInfo));
			resultMap.put("result", "参数不完整，登录失败！");
			resultMap.put("status", false);
			return resultMap;
		}
		//判断登录类型
		if(LoginConstant.LoginType.PWD_LOGIN.equalsIgnoreCase(loginInfo.getLoginType())){
			authInfo = this.doLoginByPwd(loginInfo);
		}else if(LoginConstant.LoginType.CODE_LOGIN.equalsIgnoreCase(loginInfo.getLoginType())){
			authInfo = this.doLoginByCode(loginInfo);
		}else if(LoginConstant.LoginType.WX_LOGIN.equalsIgnoreCase(loginInfo.getLoginType())){
			authInfo = this.doLoginByWx(loginInfo);
		}
		//封装结果
		if(!ObjectUtils.isEmpty(authInfo)){
			resultMap.put("sessionRedisKey", authInfo.getSessionRedisKey());
			resultMap.put("userToken", authInfo.getUserToken());
			resultMap.put("isRegister", authInfo.isRegister());
			resultMap.put("status", true);
			//用户信息写入redis
			if(this.constantReload.useRedisOpsData){
				writeUserinfoToredis(authInfo);
			}
			/**
			 * 单点登录，设置redis内容
			 */

			return resultMap;
		}else{
			logger.info("invalid mobile or mcode, mobile: {}, mcode: {}", loginInfo.getMobile(), loginInfo.getMcode());
			resultMap.put("result", "用户名或者密码错误！");
			resultMap.put("status", false);
			return resultMap;
		}
		
	}
	
	/**
	 * 登录成功后将用户信息写入redis 
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return void
	 * @throws
	 */
	private void writeUserinfoToredis(AuthInfo authInfo) {
		String currKey = "";
		SetOperations<String, String> set = null;
		try {
			SyMember member = authInfo.getMemeberInfo();
			set = stringRedisTemplate.opsForSet();
			Set<String> keys = set.members(CommonRedisKey.UserInfoRedisKey.USER_INFO_SET);
			currKey = CommonRedisKey.UserInfoRedisKey.USER_INFO_PRE +  + member.getMemberId();
			boolean exit = keys.contains(currKey);
			if(!exit){//
				//将用户信息key存入redis的uiset
				set.add(CommonRedisKey.UserInfoRedisKey.USER_INFO_SET, 
						CommonRedisKey.UserInfoRedisKey.USER_INFO_PRE + member.getMemberId());
				
			}
			//将用户信息存入redis的hash中，key为ui_memberid
			HashOperations<String, String, String> map = stringRedisTemplate.opsForHash();
			map.put(currKey, "memberId", StringUtils.isEmpty(member.getMemberId()) ? "" : member.getMemberId() + "");
			map.put(currKey, "name", StringUtils.isEmpty(member.getMemberName()) ? "" : member.getMemberName());
			map.put(currKey, "truename", StringUtils.isEmpty(member.getMemberTruename()) ? "" : member.getMemberTruename());
			map.put(currKey, "idType", StringUtils.isEmpty(member.getMemberIdType()) ? "" : member.getMemberIdType()+"");
			map.put(currKey, "idValue", StringUtils.isEmpty(member.getMemberIdValue()) ? "" : member.getMemberIdValue());
			map.put(currKey, "mobile", StringUtils.isEmpty(member.getMemberMobile()) ? "" : member.getMemberMobile());
			map.put(currKey, "avatar", StringUtils.isEmpty(member.getMemberAvatar()) ? "" : member.getMemberAvatar());
			map.put(currKey, "gender", StringUtils.isEmpty(member.getMemberSex()) ? "" : member.getMemberSex()+"");
			map.put(currKey, "registTime", StringUtils.isEmpty(member.getMemberTime()) ? "" : member.getMemberTime());
			map.put(currKey, "bocPoints", StringUtils.isEmpty(member.getBocPoints()) ? "" : member.getBocPoints()+"");
			map.put(currKey, "bocUsedPoints", StringUtils.isEmpty(member.getBocPointsUsed()) ? "" : member.getBocPointsUsed()+"");
			map.put(currKey, "authType", StringUtils.isEmpty(member.getMemberIdType()) ? "" : member.getMemberIdType()+"");
			//结对贫困户map.put(currKey, "pairPoor", "");
			//勋章列表map.put(currKey, "gloryList", member.get);
			//帮扶金额map.put(currKey, "helpAmount", member.get);
			//用户平台map.put(currKey, "userPlat", member.getMe);
			//用户组map.put(currKey, "userGroup", member.);
			//用户角色map.put(currKey, "userRole", "");
			//部门类型map.put(currKey, "deptType", member.getmember);
			//部门ID map.put(currKey, "deptId", member.getmember);
			//部门信息map.put(currKey, "deptInfo", member.getmember);
			//装机渠道map.put(currKey, "installCode", member.getmember);
			//用户注册来源map.put(currKey, "registFrom", member.getmember);
			//积分排行map.put(currKey, "pointIdx", member.getmember);
			//帮扶排名map.put(currKey, "helpIdx", member.getmember);
			//邀请人ID map.put(currKey, "invitedId", member.getmember);
//			stringRedisTemplate.expire(CommonRedisKey.UserInfoRedisKey.USER_INFO_PRE + member.getMemberId(), 
//					1, TimeUnit.HOURS);
		} catch (Exception e) {
			e.printStackTrace();
			if(!ObjectUtils.isEmpty(set)){
				set.remove("uiset", currKey);
			}
			logger.info("用户 {} 的信息写入redis失败" , authInfo.getMemeberInfo().getMemberMobile());
		}
		
	}
	/**
	 * 验证码登录
	 * @param loginInfo
	 * @return
	 * @throws CoreServiceException
	 */
	private AuthInfo doLoginByCode(LoginInfo loginInfo) throws CoreServiceException{
		SyMember member = this.authService.validCode(loginInfo.getMobile().trim(), loginInfo.getMcode().trim());
		if(!ObjectUtils.isEmpty(member)){
			return this.rlogin(loginInfo, member);
		}else{
			return this.doRegister(loginInfo);
		}
	}
	
	/**
	 * 微信登录
	 * @param loginInfo
	 * @return
	 * @throws CoreServiceException
	 */
	private AuthInfo doLoginByWx(LoginInfo loginInfo) throws CoreServiceException{
		String wxOpenID = loginInfo.getWxOpenid().trim();
		SyMember member = userCorrelationService.getMemberInfoByWxOpenId(wxOpenID);
		if(!ObjectUtils.isEmpty(member)){
			return this.rlogin(loginInfo, member);
		}else{
			logger.info("there is no member for this wxOpenId: {}", wxOpenID);
			throw new CoreServiceException(AuthFacadeExcepType.UN_BIND);
		}
	}
	
	/**
	 * 密码登录
	 * @param loginInfo
	 * @return
	 * @throws CoreServiceException
	 */
	private AuthInfo doLoginByPwd(LoginInfo loginInfo) throws CoreServiceException{
		SyMember member = authService.validPSW(loginInfo.getMobile().trim(), loginInfo.getMcode().trim());
		if(!ObjectUtils.isEmpty(member)) {
			return rlogin(loginInfo,member);
		} 
		return null;
	}
	
	/**
	 * 登录方法
	 * @param loginInfo
	 * @param member
	 * @return
	 * @throws CoreServiceException
	 */
	@Transactional(timeout=36000,rollbackFor=Throwable.class,isolation=Isolation.READ_COMMITTED)
	public AuthInfo rlogin(LoginInfo loginInfo, SyMember member) throws CoreServiceException {
		AuthInfo loginResult = new AuthInfo();
		boolean saveResult = false;
		SyMbUserToken token = authService.updateUserToken(member, loginInfo.getClient());
		loginResult =  authService.createAuthInfo(member, member.getMemberWxopenid(), token);
		member.setMemberLoginIp(loginInfo.getRealIP());
		loginResult.setMemeberInfo(member);
		loginResult.setRegister(loginInfo.getIsRegister());
		loginResult = authService.createSession(loginResult);
		//绑定微信
		if(!StringUtils.isEmpty(loginInfo.getWxOpenid())){
			saveResult = bindThirdPlatformIDService.bindWxOpenidV1(member.getMemberId(), loginInfo.getWxOpenid());
			if(!saveResult){
				logger.info("bindWxOpenId failed, memberId:{}, wxOpenId:{}", member.getMemberId(), loginInfo.getWxOpenid());
				throw new CoreServiceException(BindThirdPlatformIDException.BIND_WX_FAILED);
			}
		}
		//绑定第三方平台
		if(!StringUtils.isEmpty(loginInfo.getCorpUid())){
			String ch = StringUtils.isEmpty(loginInfo.getChannel()) ? this.constantReload.chnlIdAppBoc : loginInfo.getChannel();
			saveResult = bindThirdPlatformIDService.bindCorpUid(ch, member.getMemberId(), loginInfo.getCorpUid().trim());
			if(!saveResult){
				logger.info("bindThirdPlatform failed,channel:{}, memberId:{}, corpUid:{}", ch, member.getMemberId(), loginInfo.getCorpUid().trim());
				throw new CoreServiceException(BindThirdPlatformIDException.BIND_THIRD_FAILED);
			}
		}
		//更新联盟圈子信息
		if(!StringUtils.isEmpty(loginInfo.getInviteCode()) && loginInfo.getIsRegister()){
//			SyCircleMember sycircleMember = this.circleMemberService.getCircleMemberInfoByMemberId(member.getMemberId());
//			if(!ObjectUtils.isEmpty(sycircleMember)){
				String[] inviteInfo = loginInfo.getInviteCode().split("-");
				Integer invMid = Integer.parseInt(inviteInfo[0]);
				Integer invCid = Integer.parseInt(inviteInfo[1]);
				//判断是否是山西分行
				Integer circleId = this.constantReload.CIRCLE_ID_WEAL_CLUB;
//				circleId = this.validShanxi(invCid);
				saveResult = this.updateWealUnionCircle(member, circleId, invMid, invCid);
				if(!saveResult){
					logger.info("updateWealUnionCircle failed, memberId:{}, inviteMemberId:{}, inviteCircleId:{}", member.getMemberId(), invMid, invCid);
					throw new CoreServiceException(AuthFacadeExcepType.UPDATE_WEAL_UNION_ERROR);
				}
//			}
		}else if(!ObjectUtils.isEmpty(loginInfo.getCircleId())){
			Integer circleId = loginInfo.getCircleId();
			//加入圈子
			saveResult = this.joinCircle(member, circleId, null, null);
			if(!saveResult){
				logger.info("join circle failed, memberId:{}, circleId:{}", member.getMemberId(), loginInfo.getCircleId());
				throw new CoreServiceException(AuthFacadeExcepType.JOIN_CIRCIE_ERROR);
			}
		}
//		else if(StringUtils.isEmpty(loginInfo.getInviteCode()) && loginInfo.getIsRegister()){
//			Integer circleId = this.constantReload.CIRCLE_ID_WEAL_CLUB;
//			saveResult = this.joinCircle(member, circleId, null, null);
//			if(!saveResult){
//				logger.info("join ykjlb failed, memberId:{}", member.getMemberId());
//				throw new CoreServiceException(AuthFacadeExcepType.JOIN_CIRCIE_ERROR);
//			}
//		}
		loginResult = checkResult(loginResult,loginInfo,member);
		return loginResult ;
	}

	/**
	 *  注册方法
	 * @param loginInfo
	 * @return
	 * @throws CoreServiceException
	 */
	public AuthInfo doRegister(LoginInfo loginInfo) throws CoreServiceException {
		AuthInfo result =new AuthInfo();
		SyMember member = null ;
		member = userCorrelationService.register(loginInfo.getMobile(), loginInfo.getMcode(), loginInfo.getMobile(), null, null, loginInfo.getChannel(), null);
		if(!ObjectUtils.isEmpty(member)) {
			
			ValueOperations<String, String> ops = this.stringRedisTemplate.opsForValue();
			ops.increment(LoginConstant.RedisKey.ALL_PLATFORM_USERS, 1);
			result.getResultData().put(LoginConstant.FacadeContants.ISREGISTER, true);
			result.setMemeberInfo(member);
			
			//用户信息写入缓存redis
			if(this.constantReload.useRedisOpsData){
				writeUserinfoToredis(result);
			}
			
			//如果有邀请码的话，为邀请者和被邀请者加积分
			String inviteCode = loginInfo.getInviteCode();
			if(!StringUtils.isEmpty(inviteCode) && ValidUtil.validInviteCode(inviteCode)){
				String inviteInfo[] = inviteCode.split("-");
				Integer invMid = Integer.parseInt(inviteInfo[0]);
				if(this.constantReload.useRedisOpsData){
					Boolean hasMember = stringRedisTemplate.hasKey(CommonRedisKey.UserInfoRedisKey.USER_INFO_PRE + member.getMemberId());
					Boolean hasInvMember = stringRedisTemplate.hasKey(CommonRedisKey.UserInfoRedisKey.USER_INFO_PRE + invMid);
					if(!hasMember || !hasInvMember){
						this.addPoint(member.getMemberId(), invMid, loginInfo.getChannel(), this.constantReload.sharePoints);
					}else{
						this.addCachePoint(member.getMemberId(), invMid, loginInfo.getChannel(), this.constantReload.sharePoints);
					}
				}else{
					this.addPoint(member.getMemberId(), invMid, loginInfo.getChannel(), this.constantReload.sharePoints);
				}
			}
			loginInfo.setIsRegister(true);
			result = this.rlogin(loginInfo, member); 
		}
		return result ;
	}
	
	/**
	 * 
	 * 处理登录结果 持久化session
	 * @param result
	 * @param loginInfo
	 * @param member
	 * @return
	 */
	private AuthInfo checkResult(AuthInfo result,LoginInfo loginInfo,SyMember member) {
		JSONObject session = JSONObject.parseObject(JSON.toJSONString(result.getSessionData()));
		if(ObjectUtils.isEmpty(session)) {
			session = new JSONObject();
			result.getResultData().put(LoginConstant.FacadeContants.SESSION, session);
		}
		for(Map.Entry<String, Object> entry : session.entrySet()) {
			if(ObjectUtils.isEmpty(entry.getValue())) {
				entry.setValue("");
			}
		}
		HashOperations<String, String, Object> opsForHash = this.stringRedisTemplate.opsForHash();
		opsForHash.putAll(result.getSessionRedisKey(), session);
		result.getResultData().clear();
		return result ;
	}
	
	/**
	 * 更新公益联盟circle信息
	 * @param syMember
	 * @param unionCircleId 联盟id
	 * @param invMid 邀请人id
	 * @param invCid 邀请人圈子
	 * @param authInfo 登录信息
	 */
	private boolean updateWealUnionCircle (SyMember syMember, Integer unionCircleId, Integer invMid, Integer invCid) {
		boolean result = false;
		if(constantReload.CIRCLE_ID_WEAL_CLUB == unionCircleId){//益客俱乐部
			//判断邀请码是否有效
			SyMember invMember = this.userCorrelationService.getMemberInfo(invMid);
			SyCircle syCircle = circleService.selectByPrimaryKey(invCid);
			if(ObjectUtils.isEmpty(invMember) || ObjectUtils.isEmpty(syCircle)){
				logger.error("邀请码信息错误，错误邀请码为：{}", invMid + "-" + invCid);
				return result;
			}
		}else if(constantReload.CIRCLE_ID_WEAL_ENTERPRISE == unionCircleId){//公益联盟
			invMid = 0;
		}
		result = this.joinCircle(syMember, unionCircleId, invMid, invCid);
		return result;
	}
	
	/**
	 * 加入或者邀请加入 圈子圈子
	 * @param syMember 会员
	 * @param circleId 要加入的圈子id
	 * @param invMid 邀请人会员id
	 * @param invCid 邀请人圈子id
	 * @param authInfo
	 * @return
	 */
	private boolean joinCircle(SyMember syMember, Integer circleId,Integer invMid, Integer invCid){
		boolean result = false;
		if(!ObjectUtils.isEmpty(invMid) && !ObjectUtils.isEmpty(invCid)){
			result = this.circleMemberService.inviteJoinCircle(syMember, circleId, invMid, invCid);
		}else{
			result = this.circleMemberService.joinCircle(syMember, circleId);
		}
		return result;
	}
	
	/**
	 * 增加积分
	 * @param memberId 会员id
	 * @param invMid 邀请人id
	 * @param channel 渠道
	 * @param points 积分
	 * @return
	 */
	private boolean addPoint(Integer memberId, Integer invMid, String channel, Integer points){
		boolean addResult = false;
		SyPointsLog syPointsLog = new SyPointsLog();
		SyMember syMember  = userCorrelationService.getMemberInfo(invMid);
		if(ObjectUtils.isEmpty(syMember)){
			logger.info("there is no user for this memberId:{}", memberId);
			return addResult;
		}
		if(pointManagerService.inviteValidatePoint(memberId)){
			//给分享者加积分
			syPointsLog.setChannel(channel);
			syPointsLog.setPlMemberid(invMid);
			syPointsLog.setPlMemberid2(memberId);
			syPointsLog.setPlStage(PointConstant.PointStage.SHARED_RGEGIST);
			syPointsLog.setPlPoints(points);
			syPointsLog.setPlDesc("好友注册");
			syPointsLog.setPlMembername(syMember.getMemberName());
			syPointsLog.setPlMemberTruename(syMember.getMemberTruename());
			syPointsLog.setPlMemberIdcard(syMember.getMemberIdValue());
			syPointsLog.setPlAddtime((int) DateUtil.getNowLong());
			syMember = userCorrelationService.getMemberInfo(memberId);
			addResult = pointManagerService.addPoints(memberId, points, syPointsLog, PointConstant.PointType.BOC_TYPE);
			if(addResult){
				//给被分享者加积分
//
				syMember = userCorrelationService.getMemberInfo(memberId);
				syPointsLog.setPlMemberid(memberId);
				syPointsLog.setPlMemberid2(invMid);
				syPointsLog.setPlDesc("通过分享(邀请)注册");
				syPointsLog.setPlStage(PointConstant.PointStage.REGIST_BY_SHARE);
				syPointsLog.setPlMembername(syMember.getMemberName());
				syPointsLog.setPlMemberTruename(syMember.getMemberTruename());
				syPointsLog.setPlMemberIdcard(syMember.getMemberIdValue());
				syPointsLog.setPlAddtime((int) DateUtil.getNowLong());
				addResult = pointManagerService.addPoints(invMid, points, syPointsLog, PointConstant.PointType.BOC_TYPE);
			}
		}
		return addResult;
	}
	
	private boolean addCachePoint(Integer memberId, Integer invMid, String channel, Integer points){
		boolean addResult = false;
		//给分享者加积分
		SyMember syMember = this.userCorrelationService.getMemberInfo(invMid);
		addResult = this.pointManagerService.addCachePoints(syMember, points, invMid, channel, PointConstant.PointStage.SHARED_RGEGIST, "好友注册");
		if(!addResult){
			logger.info("add point for inviter failed, memberId:{}", invMid);
			return addResult;
		}
		//给被分享者加积分
		syMember = this.userCorrelationService.getMemberInfo(memberId);
		addResult = this.pointManagerService.addCachePoints(syMember, points, invMid, channel, PointConstant.PointStage.REGIST_BY_SHARE, "通过分享(邀请)注册");
		if(!addResult){
			logger.info("add point for the member be invited failed, memberId:{}", memberId);
			return addResult;
		}
		return addResult;
	}
	
	/**
	 * 判断圈子是否是山西省分行及子分行，如果是，则返回公益山西圈子id
	 * @param circleId
	 * @return
	 */
	private Integer validShanxi(Integer circleId){
//		SyCircle gysxCircle = this.circleService.selectByNameAndCode("公益山西", "shanxi1").get(0);
//		SyCircle circle = this.circleService.selectByPrimaryKey(circleId);
//		if("山西省分行".equals(circle.getCircleName())){
//			logger.info("change circle to gysx, circleId:{}", circleId);
//			circleId = gysxCircle.getCircleId();
//			return circleId;
//		}else{
//			circle = this.circleService.selectByPrimaryKey(circle.getParentCircleId());
//			if("山西省分行".equals(circle.getCircleName())){
//				logger.info("change circle to gysx, circleId:{}", circleId);
//				circleId = gysxCircle.getCircleId();
//				return circleId;
//			}
//		}
		return this.constantReload.CIRCLE_ID_WEAL_CLUB;
	}

	@Override
	public Map<String, Object> sendValidSmsCodeByRange(String mobile, String range) throws CoreServiceException {
		range = StringUtils.isEmpty(range) ? AuthConstant.SmsRange.ALL : range;
		SyMember syMember = null ;
		Map<String, Object> resultMap = null;
		switch (range) {
		case AuthConstant.SmsRange.HAS:
		    syMember = this.userCorrelationService.getMemberInfoByMobile(mobile);
			if(!ObjectUtils.isEmpty(syMember)){
				resultMap = this.sendValidSmsCode(mobile);
			}else{
				logger.info("手机号未注册：{}", mobile);
				throw new CoreServiceException(AuthFacadeExcepType.NOT_REGISTER);
			}
			break;
		case AuthConstant.SmsRange.ALL:
			resultMap = this.sendValidSmsCode(mobile);
			break;
		case AuthConstant.SmsRange.UNBIND:
		    syMember = this.userCorrelationService.getMemberInfoByMobile(mobile);
			if(!ObjectUtils.isEmpty(syMember)){
				List<SyWXAcount> wxAccounts = bindThirdPlatformIDService.wxAccounts(syMember.getMemberId());
				if(!CollectionUtils.isEmpty(wxAccounts)){
					logger.info("用户已绑定微信:{}", mobile);
					throw new CoreServiceException(AuthFacadeExcepType.HAS_BIND);
				}
			}
			resultMap = this.sendValidSmsCode(mobile);
			break;
		default:
			resultMap = this.sendValidSmsCode(mobile);
			break;
		}
		return resultMap;
	}

	@Override
	public Map<String, Object> improveInfo(Integer memberId, String memberName, String memberAvatar, Byte memberSex, String inviteCode, Integer circleId) throws CoreServiceException {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		SyMember syMember = this.userCorrelationService.getMemberInfo(memberId);
		if(ObjectUtils.isEmpty(memberId) && StringUtils.isEmpty(memberName) && StringUtils.isEmpty(memberAvatar) && ObjectUtils.isEmpty(memberSex) && StringUtils.isEmpty(inviteCode) && ObjectUtils.isEmpty(circleId)){
			logger.info("miss userinfo");
			throw new CoreServiceException(AuthFacadeExcepType.MISS_USERINFO);
		}
		if(!StringUtils.isEmpty(memberAvatar) && !ObjectUtils.isEmpty(memberSex) && !StringUtils.isEmpty(memberName)){
			SyMemberWithBLOBs syMemberWithBlobs = new SyMemberWithBLOBs();
			syMemberWithBlobs.setMemberId(memberId);
			syMemberWithBlobs.setMemberAvatar(memberAvatar);
			syMemberWithBlobs.setMemberSex(memberSex);
			syMemberWithBlobs.setMemberTruename(memberName);
			syMemberWithBlobs.setMemberDispName(memberName);
			boolean result = this.memberService.updateByPrimaryKeySelective(syMemberWithBlobs) == 1 ? true : false;
			if(!result){
				logger.info("update user info failed, memberId:{}", memberId);
				throw new CoreServiceException(AuthFacadeExcepType.UPDATE_INFO_ERROR);
			}
			resultMap.put("msg", "用户信息保存成功");
			return resultMap;
		}else if(!ObjectUtils.isEmpty(circleId)){
			if(circleId == this.constantReload.CIRCLE_ID_WEAL_CLUB && !StringUtils.isEmpty(inviteCode) && ValidUtil.validInviteCode(inviteCode)){
				String[] inviteInfo = inviteCode.split("-");
				Integer invMid = Integer.valueOf(inviteInfo[0]);
				Integer invCid = Integer.valueOf(inviteInfo[1]);
				circleId = this.validShanxi(invCid);
				boolean result = this.updateWealUnionCircle(syMember, circleId, invMid, invCid);
				if(!result){
					logger.info("update weal union circle failed, memberId:{}", memberId);
					throw new CoreServiceException(AuthFacadeExcepType.UPDATE_WEAL_UNION_ERROR);
				}
				resultMap.put("msg", "用户加入益客成功");
				return resultMap;
			}else{
				boolean result = this.joinCircle(syMember, circleId, null, null);
				if(!result){
					logger.info("join circle failed, memberId:{}, circleId:{}", memberId, circleId);
					throw new CoreServiceException(AuthFacadeExcepType.JOIN_CIRCIE_ERROR);
				}
				resultMap.put("msg", "用户加入联盟成功");
				return resultMap;
			}
		}
		return resultMap;
	}

	@Override
	public UnionDomain getAllUnion() throws CoreServiceException {
		List<SyUnion> unionList = this.unionService.getAllValidUnionList();
		List<UnionInfo> allUnion = new ArrayList<UnionInfo>();
		List<UnionInfo> comUnion = new ArrayList<UnionInfo>();
		List<UnionInfo> govUnion = new ArrayList<UnionInfo>();
		for (SyUnion syUnion : unionList) {
			UnionInfo unionInfo = new UnionInfo();
			BeanUtils.copyProperties(syUnion, unionInfo);
			SyCircle circle = this.circleService.selectByCode(unionInfo.getUnionChannel(), CircleConstant.CommonCircleId.BOC_ORG_ID, unionInfo.getUnionChannel());
			List<Integer> circleIds = new ArrayList<Integer>();
			if(!ObjectUtils.isEmpty(circle)){
				circleIds.add(circle.getCircleId());
			}
			if(CollectionUtils.isEmpty(circleIds)){
				continue;
			}
			SyBocMemberStats statInfo = this.unionService.getStatInfo(circleIds).get(0);
			unionInfo.setTotalPeople(statInfo.getFullTotalMember() + "人");
			unionInfo.setCircleId(circle.getCircleId());
			if(unionInfo.getUnionType() == UnionConstant.UnionType.GOVERNMENT_UNION){
				govUnion.add(unionInfo);
			}
			if(unionInfo.getUnionType() == UnionConstant.UnionType.ENTERPRISE_UNION){
				comUnion.add(unionInfo);
			}
			allUnion.add(unionInfo);
		}
		UnionDomain unionDomain = new UnionDomain(allUnion, govUnion, comUnion);
		return unionDomain;
	}

	@Override
	public CircleInfoDomain getSubCircleInfo(Integer circleId) throws CoreServiceException {
		if(!ObjectUtils.isEmpty(circleId)){
			return this.getAllCircleInfo(circleId);
		}else{
			logger.info("miss parameter circleId!");
			throw new CoreServiceException(AuthFacadeExcepType.MISS_PARAMETER);
		}
	}
	
	private CircleInfoDomain getAllCircleInfo(Integer circleId){
		CircleInfoDomain result = new CircleInfoDomain();
		result.setHasChild(false);
		SyCircle circle = this.circleService.selectByPrimaryKey(circleId);
		CircleInfo parentCircle = new CircleInfo();
		BeanUtils.copyProperties(circle, parentCircle);
		parentCircle.setTotalPeople(ObjectUtils.isEmpty(this.unionService.getStatInfo(circleId)) ? "0" : this.unionService.getStatInfo(circleId).getFullTotalMember() + "人");
		List<SyCircle> childTreeNodes = this.circleService.selectByParentId(circleId);
		List<Integer> circleIds = new ArrayList<Integer>();
		if(!CollectionUtils.isEmpty(childTreeNodes)){
			List<CircleInfoDomain> childDomain = new ArrayList<CircleInfoDomain>();
			for (SyCircle syCircle : childTreeNodes) {
				circleIds.add(syCircle.getCircleId());
				CircleInfo childCircle = new CircleInfo();
				BeanUtils.copyProperties(syCircle, childCircle);
				CircleInfoDomain circleInfoDomain = new CircleInfoDomain();
				BeanUtils.copyProperties(syCircle, circleInfoDomain);
				List<SyCircle> circles = this.circleService.selectByParentId(syCircle.getCircleId());
				if(!CollectionUtils.isEmpty(circles)){
					circleInfoDomain.setHasChild(true);
				}else{
					circleInfoDomain.setHasChild(false);
				}
				circleInfoDomain.setCircleInfo(childCircle);
				childDomain.add(circleInfoDomain);
			}
			
			List<SyBocMemberStats> stats = this.unionService.getStatInfo(circleIds);
			
			for (SyBocMemberStats syBocMemberStats : stats) {
				for (CircleInfoDomain circleInfoDomain : childDomain) {
					if(syBocMemberStats.getCircleId().equals(circleInfoDomain.getCircleInfo().getCircleId())){
						if(StringUtils.isEmpty(circleInfoDomain.getCircleInfo().getTotalPeople())){
							circleInfoDomain.getCircleInfo().setTotalPeople(syBocMemberStats.getFullTotalMember() + "人");
						}else{
							continue;
						}
					}
				}
			}
			result.setChildCircle(childDomain);
			result.setHasChild(true);
		}
		result.setCircleInfo(parentCircle);
		return result;
	}

	@Override
	public List<SelectCircleDomain> selectCircleInfo(String circleName, String channel) throws CoreServiceException {
		List<SyCircle> circle = this.circleService.selectByNameAndCode(circleName, channel);
		List<SelectCircleDomain> result = new ArrayList<SelectCircleDomain>();
		for (SyCircle syCircle : circle) {
			SelectCircleDomain node = null;
			List<SyCircle> subCircle = this.circleService.selectByParentId(syCircle.getCircleId());
			if(!CollectionUtils.isEmpty(subCircle)){
				continue;
			}
			SelectCircleDomain leastCircle = new SelectCircleDomain();
			BeanUtils.copyProperties(syCircle, leastCircle);
			Integer circleMasterId = syCircle.getCircleMasterid();
			for(int i = 10; i > 0; i--){
				SyCircle pCircle = this.circleService.selectByPrimaryKey(syCircle.getParentCircleId());
				if(!ObjectUtils.isEmpty(pCircle)){
					if(pCircle.getCircleId().equals(circleMasterId) ){
						break;
					}
					if(pCircle.getCircleName().equals("扶贫联盟")){
						break;
					}
					SelectCircleDomain cNode = new SelectCircleDomain();
					cNode = (!ObjectUtils.isEmpty(node)) ? node : leastCircle;
					node = new SelectCircleDomain();
					node.setChildCircle(cNode);
					node.setCircleId(pCircle.getCircleId());
					node.setCircleName(pCircle.getCircleName());
					syCircle = pCircle;
				}else{
					break;
				}
			}
			result.add(node);
		}
		return result;
	}
	
	
}
