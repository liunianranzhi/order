package com.shanyuan.platform.ms.core.auth.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.shanyuan.platform.ms.base.common.util.AuthUtils;
import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.base.common.util.MD5Util;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.auth.AuthService;
import com.shanyuan.platform.ms.core.auth.ValidCodeService;
import com.shanyuan.platform.ms.core.auth.bo.AuthInfo;
import com.shanyuan.platform.ms.core.auth.impl.exceptype.AuthServiceExcepType;
import com.shanyuan.platform.ms.core.constant.AuthConstant;
import com.shanyuan.platform.ms.core.constant.ConstantReload;
import com.shanyuan.platform.ms.core.user.UserCorrelationService;
import com.shanyuan.platform.ms.core.user.bo.LoginInfo;
import com.shanyuan.platform.ms.core.user.bo.LoginResult;
import com.shanyuan.platform.ms.dao.auth.entity.SyMbUserToken;
import com.shanyuan.platform.ms.dao.auth.entity.SyMbUserTokenExample;
import com.shanyuan.platform.ms.dao.auth.entity.SyWhiteListExample;
import com.shanyuan.platform.ms.dao.auth.mapper.SyMbUserTokenMapper;
import com.shanyuan.platform.ms.dao.auth.mapper.SyWhiteListMapper;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleMember;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.dao.user.entity.SyMemberExample;
import com.shanyuan.platform.ms.dao.user.entity.SyMemberWithBLOBs;
import com.shanyuan.platform.ms.dao.user.entity.SyPoor;
import com.shanyuan.platform.ms.dao.user.entity.SyRole;
import com.shanyuan.platform.ms.dao.user.mapper.SyMemberMapper;




@Component
public class AuthServiceImpl implements AuthService{

	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private ValidCodeService validCodeService;
	
	@Autowired
	private SyMemberMapper memberMapper ;

	@Autowired
	private SyWhiteListMapper whiteMapper ;
	@Autowired
	private SyMbUserTokenMapper tokenMapper;
	
	@Autowired
	private ConstantReload constantReload;
	@Autowired
	private UserCorrelationService userService;
	
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	@Override
	public SyMember validCode(String userName, String pwd) throws CoreServiceException {
		if(this.validCodeService.validCode(userName, pwd)) {
			SyMemberExample smme = new SyMemberExample();
			smme.createCriteria().andMemberNameEqualTo(userName);
			List<SyMember> members = this.memberMapper.selectByExample(smme);
			if(!members.isEmpty()) {
				return members.get(0);
			} 
		}else if(this.constantReload.getMAGIC_MCODE().equals(pwd)) {
			if(constantReload.useWhite&&isInWhiteList(userName,"app")) {
				SyMemberExample smme = new SyMemberExample();
				smme.createCriteria().andMemberNameEqualTo(userName);
				List<SyMember> members = this.memberMapper.selectByExample(smme);
				if(!members.isEmpty()) {
					return members.get(0);
				} 
			}else if(!constantReload.useWhite ) {
			    SyMemberExample smme = new SyMemberExample();
                smme.createCriteria().andMemberNameEqualTo(userName);
                List<SyMember> members = this.memberMapper.selectByExample(smme);
                if(!members.isEmpty()) {
                    return members.get(0);
                } 
			}
			throw new CoreServiceException(AuthServiceExcepType.NOT_IN_WHITELIST);
		}else {
		    throw new CoreServiceException(AuthServiceExcepType.VALID_CODE_ERROR);
		}
		return null;
	}
	@Override
	public SyMember validPSW(String userName, String pwd) throws CoreServiceException {
		SyMember member = null;
		SyMemberExample nsme = new SyMemberExample();
		nsme.createCriteria().andMemberNameEqualTo(userName);
		List<SyMember> members = this.memberMapper.selectByExample(nsme);
		if(!members.isEmpty()) {
		  member = members.get(0);
		}else {
			return null ;
		}
		
		if(this.constantReload.MAGIC_MCODE_PC.equals(pwd)) {
			if(constantReload.useWhite&&isInWhiteList(userName,"pc")) {
				return member ; 
			} 
		}
		else {
			String npwd = MD5Util.getMD5LowerCase(pwd);
			if(npwd.equalsIgnoreCase(member.getMemberPasswd())) {
				return member ;
			}
		}
		return null;
	}
	@Override
	public boolean isInWhiteList(String userName,String type ) {
		SyWhiteListExample nsle = new SyWhiteListExample();
		nsle.createCriteria().andMemberNameEqualTo(userName).andLoginTypeEqualTo(type);
		return !this.whiteMapper.selectByExample(nsle).isEmpty() ; 
	}
	@Override
	public AuthInfo createSession(AuthInfo authInfo) throws CoreServiceException {
		SyMember member = authInfo.getMemeberInfo();
		Map<String ,String> sessionMap = new HashMap<String,String>();
		sessionMap.put(AuthConstant.SessionKEY.IS_LOGIN, "1");
		sessionMap.put(AuthConstant.SessionKEY.MEMBER_ID, member.getMemberId().toString());
		sessionMap.put(AuthConstant.SessionKEY.MEMBER_NAME,member.getMemberName());
		sessionMap.put(AuthConstant.SessionKEY.MEMBER_TRUENAME,member.getMemberTruename()==null?member.getMemberName():member.getMemberTruename());
		sessionMap.put(AuthConstant.SessionKEY.MEMBER_SEX,member.getMemberSex()==null?"":member.getMemberSex().toString());
		sessionMap.put(AuthConstant.SessionKEY.MEMBER_MOBILE , member.getMemberMobile());
		sessionMap.put(AuthConstant.SessionKEY.MEMBER_EMAIL,member.getMemberEmail());
		sessionMap.put(AuthConstant.SessionKEY.MEMBRT_AVATAR , member.getMemberAvatar());
		sessionMap.put(AuthConstant.SessionKEY.MEMBER_TYPE , member.getMemberType().toString());
		sessionMap.put(AuthConstant.SessionKEY.MEMBER_STATE ,member.getMemberState().toString());
		sessionMap.put(AuthConstant.SessionKEY.IS_REGISTER, String.valueOf(authInfo.isRegister()));
		sessionMap.put(AuthConstant.SessionKEY.TOKEN,authInfo.getUserToken());
		if(authInfo.getBocCircleId()!=null) {
			sessionMap.put(AuthConstant.SessionKEY.CIRCLE_ID, authInfo.getBocCircleId().toString());
		}
		if(authInfo.getPoor()!=null) {
			sessionMap.put(AuthConstant.SessionKEY.IS_POOR, "yes");
			sessionMap.put(AuthConstant.SessionKEY.SAVE_CHANNEL, "yes");
			sessionMap.put(AuthConstant.SessionKEY.CHANNEL, authInfo.getPoor().getChannel());
		}else {
			if(authInfo.getRole()!=null) {
				sessionMap.put(AuthConstant.SessionKEY.IS_AGENT, "yes");
				sessionMap.put(AuthConstant.SessionKEY.SAVE_CHANNEL, "yes");
				sessionMap.put(AuthConstant.SessionKEY.CHANNEL, authInfo.getRole().getChannel());
			}
		}
		if(!StringUtils.isEmpty(authInfo.getWxOpenId())) {
			sessionMap.put(AuthConstant.SessionKEY.WX_OPENID,authInfo.getWxOpenId());
		}
		String userSessionTokenSuf = UUID.randomUUID().toString().replaceAll("-", "").trim();
		String redisSessionKey = AuthConstant.RedisKey.USER_SESSION_TOKEN_PRE + userSessionTokenSuf;
		authInfo.setSessionRedisKey(redisSessionKey);
		authInfo.setSessionData(sessionMap);
		updateLoginTime(authInfo);
		return authInfo;
	}

	@Override
	public SyMbUserToken updateUserToken(SyMember member,String client) throws CoreServiceException {
		SyMbUserTokenExample nsmte = new  SyMbUserTokenExample();
		nsmte.createCriteria().andMemberIdEqualTo(member.getMemberId());
		List<SyMbUserToken> tokens = this.tokenMapper.selectByExample(nsmte);
		if(CollectionUtils.isEmpty(tokens)) {
			//创建登录认证信息
			SyMbUserToken newToken = new SyMbUserToken();
			newToken.setMemberId(member.getMemberId());
			newToken.setMemberName(member.getMemberName());
			String nt = AuthUtils.generateToken(member.getMemberName());
			newToken.setToken(nt);
			newToken.setLoginTime(DateUtil.getNowInt());
			if(!StringUtils.isEmpty(client)&&
					(AuthConstant.ClientType.ANDROID.equalsIgnoreCase(client)
							||AuthConstant.ClientType.IOS.equalsIgnoreCase(client)
							)
					) {
				newToken.setClientType(client);
			}
		 
			newToken.setAppVariant(this.constantReload.getChnlIdAppBoc());
		    this.tokenMapper.insertSelective(newToken);
		    return newToken ;
			
		}else {
			SyMbUserToken token = tokens.get(0);
			try {
				if(!StringUtils.isEmpty(client)&&
						(AuthConstant.ClientType.ANDROID.equalsIgnoreCase(client)
								||AuthConstant.ClientType.IOS.equalsIgnoreCase(client)
								)
						&&!client.equalsIgnoreCase(token.getToken())) {
					SyMbUserToken ntoken = new SyMbUserToken();
					ntoken.setTokenId(token.getTokenId());
					ntoken.setClientType(client);
					token.setClientType(client);
					token.setAppVariant(this.constantReload.getChnlIdAppBoc());
					ntoken.setAppVariant(constantReload.getChnlIdAppBoc());
					this.tokenMapper.updateByPrimaryKeySelective(ntoken);
				}
			}catch(Exception e) {
				logger.info(e.getMessage(), e);
			}
			return token;
			
		}
	}
	/**
	 * 创建AuthInfo信息
	 * 			添加  	member 
	 * 				poor 贫困户信息
	 * 				role agentRole 
	 * 				wxopenId 微信openid
	 * 				bocCircleId 组织机构的圈子id;
	 * 				userToken 用户登录的token
	 * @param member
	 * @param wxOpenId
	 * @return
	 */
	@Override
	public AuthInfo createAuthInfo(SyMember member, String wxOpenId,SyMbUserToken userToken) throws CoreServiceException {
		if(ObjectUtils.isEmpty(member) || ObjectUtils.isEmpty(userToken)) {
			return null ;
		}
		AuthInfo authInfo = new AuthInfo();
		authInfo.setWxOpenId(wxOpenId);
		authInfo.setMemeberInfo(member);
		authInfo.setUserToken(userToken.getToken());
		try {
			SyCircleMember cirmem = this.userService.getCircleInfoOnlyBocOrg(member.getMemberId());
			if (!ObjectUtils.isEmpty(cirmem)) {
				authInfo.setBocCircleId(cirmem.getCircleId());
			} 
		} catch (Exception e) {
			logger.error("get bocCircle error ！ "+e.getMessage(),e);
		}
		try {
			SyRole role = this.userService.getRoleAgent(member.getMemberId());
			if(!ObjectUtils.isEmpty(role)) {
				authInfo.setRole(role);
			}
		} catch (Exception e) {
			logger.error("get agentRole error ！ "+e.getMessage(),e);
		}
		try {
			SyPoor poor = this.userService.getPoorInfo(member.getMemberId());
			if(!ObjectUtils.isEmpty(poor)) {
				authInfo.setPoor(poor);
			}
		} catch (Exception e) {
			logger.error("get poor error ！ "+e.getMessage(),e);
		}
		return authInfo;
	}

	@Override
	@Deprecated
	public LoginResult chargeToGo(LoginResult result, LoginInfo loginInfo, SyMember member) throws CoreServiceException {
		return null;
	}

	@Override
	public SyMbUserToken getUserToken(Integer memberId) {
		SyMbUserTokenExample example = new SyMbUserTokenExample();
		example.createCriteria().andMemberIdEqualTo(memberId);
		List<SyMbUserToken> tokens = tokenMapper.selectByExample(example);
		if(!CollectionUtils.isEmpty(tokens)){
			return tokens.get(0);
		}
		return null;
	}
	
	private void updateLoginTime(AuthInfo loginInfo) {
		String nip = loginInfo.getMemeberInfo().getMemberLoginIp();
		SyMember memberInfo = loginInfo.getMemeberInfo();
		int ntime = (int) (System.currentTimeMillis()/1000);
		SyMemberWithBLOBs newMem = new SyMemberWithBLOBs();
		newMem.setMemberId(memberInfo.getMemberId());
		newMem.setMemberLoginNum(ObjectUtils.isEmpty(memberInfo.getMemberLoginNum()) ? 1 : memberInfo.getMemberLoginNum()+1);
		newMem.setMemberOldLoginIp(memberInfo.getMemberLoginIp());
		newMem.setMemberOldLoginTime(memberInfo.getMemberLoginTime());
		newMem.setMemberLoginIp(nip);
		newMem.setMemberLoginTime(ntime+"");
		this.memberMapper.updateByPrimaryKeySelective(newMem);
	}
	@Override
	public boolean validMcode(String mobile, String mcode) throws CoreServiceException {
		boolean result = false;
		result = this.validCodeService.validCode(mobile, mcode);
		if(!result && mcode.equals(this.constantReload.MAGIC_MCODE)){
			if(isInWhiteList(mobile, "app") && this.constantReload.useWhite){
				logger.info("用户使用白名单登录,用户手机：{}", mobile);
				result = true;
			}else{
				throw new CoreServiceException(AuthServiceExcepType.NOT_IN_WHITELIST);
			}
		}
		return result;
	}
	@Override
	public Boolean checkLogin(String token, String did) {
		boolean result = true;
		if(!StringUtils.isEmpty(token) && !StringUtils.isEmpty(did)){
			String redisKey = AuthConstant.RedisKey.TOKEN_HASH_PRE + token;
			HashOperations<String, String, String> opsForHash = stringRedisTemplate.opsForHash();
			String redisDid = opsForHash.get(redisKey, "did");
			if(logger.isDebugEnabled()){
				logger.debug("did:{}, redisDid:{}", did, redisDid);
				logger.debug("登录是否有效：{}", did.equalsIgnoreCase(redisDid));
			}
			if(!did.equalsIgnoreCase(redisDid)){
				result = false;
			}
		}
		return result;
	}

}
