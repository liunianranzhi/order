package com.shanyuan.platform.ms.facade.common.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.core.auth.AuthService;
import com.shanyuan.platform.ms.core.user.UserCorrelationService;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.facade.common.CommonFacade;
import com.shanyuan.platform.ms.facade.union.UnionFacade;

@Component
public class CommonFacadeImpl implements CommonFacade {
	
	@Autowired
	private UserCorrelationService userCorrelationService;
	
	@Autowired
	private UnionFacade unionFacade;
	
	@Autowired
	private AuthService authService;
	
	protected Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public String getChannelForUser(String channel, String token, String did) {
		boolean checkLogin = authService.checkLogin(token, did);
		if(!checkLogin){
			return channel;
		}
		if(!ObjectUtils.isEmpty(token)){
			SyMember syMember = userCorrelationService.getMemberByToken(token);
			// 判断是否为没登录或者没有值
			if (!ObjectUtils.isEmpty(syMember)) {
				channel = unionFacade.getChannelByMemberId(syMember.getMemberId());
				if(logger.isDebugEnabled()){
					logger.debug("该用户已登录, channel: {}",channel);
				}
			}else{
				if(logger.isDebugEnabled()){
					logger.debug("该用户未登录, 返回 channel: {}", channel);
				}
			}
		}
		return channel;
	}

//	@Override
	public boolean checkLogin(String token, String did) {
		return authService.checkLogin(token, did);
	}

//	@Override
	public String checkToken(String token, String did) {
		if(authService.checkLogin(token, did)){
			return token;
		}
		return "";
	}

}
