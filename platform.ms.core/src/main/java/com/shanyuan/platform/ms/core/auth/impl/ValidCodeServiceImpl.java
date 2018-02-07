package com.shanyuan.platform.ms.core.auth.impl;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.shanyuan.platform.ms.base.common.util.ValidUtil;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.base.frelimit.impl.FrequencyLimitServiceImpl;
import com.shanyuan.platform.ms.core.auth.ValidCodeService;
import com.shanyuan.platform.ms.core.auth.bo.ValidCodeEnum;
import com.shanyuan.platform.ms.core.auth.impl.exceptype.AuthServiceExcepType;
import com.shanyuan.platform.ms.core.constant.AuthConstant;
import com.shanyuan.platform.ms.core.constant.ConstantReload;
import com.shanyuan.platform.ms.core.member.PushService;

@Component
public class ValidCodeServiceImpl implements ValidCodeService{

	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private StringRedisTemplate stringRedisTemplate ;
	@Autowired
	private ConstantReload constantReload;
	@Autowired
	private PushService pushService;
	@Autowired
	private FrequencyLimitServiceImpl freLimitService;
	
	@Override
	public boolean  sendValidCode(String phone, String code, ValidCodeEnum codeType) throws CoreServiceException {
		boolean couldSend = false;
		String sendKey = AuthConstant.RedisKey.PHONE_SEND_PRE + phone;
		String sendSetKey = AuthConstant.RedisKey.SEND_TIMES_ZSET_PRE + phone;
		couldSend = this.sendCoolDown(60, sendKey);
		if(!couldSend){
			logger.info("connot send code, there is code in redis.key:{}" + sendKey);
			throw new CoreServiceException(AuthServiceExcepType.INTERVAL_TOO_BRIEF);
		}
		couldSend = freLimitService.freLimit(sendSetKey, 60 * 30, 3);
		if(couldSend){
			String key = AuthConstant.RedisKey.PHONE_MCODE_PRE + phone ;
			ValueOperations<String, String> ops = this.stringRedisTemplate.opsForValue();
			ops.set(key, code);
			this.stringRedisTemplate.expire(key, 60 * 5, TimeUnit.SECONDS);
			try {
				//发送信息
				switch(codeType) {
					case  SmsValidCode:
					return 	this.sendSmsCode(phone, code);
					case EmailValidCode:
						break;
					case TestValidCode:
						break ;
					case CallValidCode:
						break ;
					default:
						break ;
				} 
			}catch(Exception e) {
				logger.error("send code error! delete redis key:"+key,e);
				this.stringRedisTemplate.delete(key);
				throw new CoreServiceException( AuthServiceExcepType.SEND_CODE_ERROR,e.getMessage(),e);
			}
		}else{
			throw new CoreServiceException(AuthServiceExcepType.TOO_MANY_TIMES);
		}
		return false ;
	}
	@Override
	public boolean validCode(String phone, String code) throws CoreServiceException {
	    if(this.constantReload.isDegug) {
	        return true ;
	    }
		String key = AuthConstant.RedisKey.PHONE_MCODE_PRE+phone ;
		ValueOperations<String, String> ops = this.stringRedisTemplate.opsForValue();
		String redisCode = ops.get(key);
		if(!StringUtils.isEmpty(redisCode)) {
			return redisCode.equalsIgnoreCase(code);
		}
		
		return false;
	}
	
	private boolean  sendSmsCode(String phone ,String mcode ) throws CoreServiceException {
		if(!ValidUtil.validPhone(phone)) {
			return false ;
		}
		String msg = constantReload.smsSign + "您的验证码是" + mcode;
		if(!this.constantReload.isDegug) {
			return  this.pushService.sendSMS(phone, msg,1);
		}else {
			if(logger.isDebugEnabled()) {
				logger.debug("debug mode has started, your mobile:{} ,code: {}", phone, mcode);
			}
			return true ;
		}
	}
	
	@Override
	public boolean sendCoolDown(Integer seconds, String redisKey) throws CoreServiceException {
		boolean result = false;
		ValueOperations<String, String> ops = this.stringRedisTemplate.opsForValue();
		Long time = System.currentTimeMillis()/1000;
		result = ops.setIfAbsent(redisKey, String.valueOf(time));
		if(result){
			this.stringRedisTemplate.expire(redisKey, seconds, TimeUnit.SECONDS);
		}
		return result;
	}

}
