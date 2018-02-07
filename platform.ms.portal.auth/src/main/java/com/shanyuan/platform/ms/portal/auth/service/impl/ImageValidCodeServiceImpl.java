package com.shanyuan.platform.ms.portal.auth.service.impl;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.base.common.util.GeneratorUtil;
import com.shanyuan.platform.ms.base.common.util.ImageBase64;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.AuthConstant;
import com.shanyuan.platform.ms.core.constant.ConstantReload;
import com.shanyuan.platform.ms.portal.auth.service.ImageValidCodeService;

@Component
public class ImageValidCodeServiceImpl implements ImageValidCodeService {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private DefaultKaptcha defaultKaptcha;
	
	@Autowired
	private ConstantReload constantReload;
	
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	@Override
	public String getValidCode(String mobile) throws IOException{
		ValueOperations<String, String> opsForValue = stringRedisTemplate.opsForValue();
		String result = "";
		String text = GeneratorUtil.generateImgText();
		opsForValue.set(AuthConstant.RedisKey.VCODE_PRE + mobile, text);
		stringRedisTemplate.expire(AuthConstant.RedisKey.VCODE_PRE + mobile, 5, TimeUnit.MINUTES);
		BufferedImage createImage = defaultKaptcha.createImage(text);
		result = ImageBase64.putImage(createImage);
		return result;
	}

	@Override
	public Boolean checkValidCode(String mobile, String vcode) throws CoreServiceException {
		ValueOperations<String, String> opsForValue = stringRedisTemplate.opsForValue();
		String redisCode = opsForValue.get(AuthConstant.RedisKey.VCODE_PRE + mobile);
//		String expire = opsForValue.get(AuthConstant.RedisKey.VCODE_EXPIRE_PRE + mobile);
//		if(StringUtils.isEmpty(expire)){
//			if(logger.isDebugEnabled()){
//				logger.debug("验证码校验通过, 不需要验证码， 手机号：{}", mobile);
//			}
//			opsForValue.set(AuthConstant.RedisKey.VCODE_EXPIRE_PRE + mobile, DateUtil.getNowInt() + "");
//			stringRedisTemplate.expire(AuthConstant.RedisKey.VCODE_EXPIRE_PRE + mobile, constantReload.validCodeExpire, TimeUnit.DAYS);
//			return true;
//		}
		if(StringUtils.isEmpty(redisCode)){
			logger.info("验证码已过期, 手机号：{}， 验证码：{}", mobile, vcode);
			return false;
		}
		if(vcode.equalsIgnoreCase(redisCode)){
			if(logger.isDebugEnabled()){
				logger.debug("验证码校验通过， 手机号：{}", mobile);
			}
			stringRedisTemplate.delete(AuthConstant.RedisKey.VCODE_PRE + mobile);
			return true;
		}else{
			logger.info("验证码输入错误， 手机号：{}， 验证码：{}", mobile, vcode);
			return false;
		}
		
	}

	private String getVcodeKey (String mobile ){
		return AuthConstant.RedisKey.VCODE_EXPIRE_PRE +"_"+DateUtil.getDays()+":"+ mobile ;
	}

	@Override
	public Boolean needVaidCode(String mobile, String vcode) throws CoreServiceException {
	    String key = getVcodeKey(mobile);
		ValueOperations<String, String> opsForValue = stringRedisTemplate.opsForValue();
		String expire = opsForValue.get(key);
		if(StringUtils.isEmpty(expire)){
			if(logger.isDebugEnabled()){
				logger.debug("验证码校验通过, 不需要验证码， 手机号：{}", mobile);
			}
			opsForValue.set(key, DateUtil.getNowInt() + "");
			stringRedisTemplate.expire(key, constantReload.validCodeExpire, TimeUnit.DAYS);
			return false;
		}
		return true;
	}

}
