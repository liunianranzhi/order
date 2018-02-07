package com.shanyuan.platform.ms.core.auth;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.auth.bo.ValidCodeEnum;

/**
 * 验证码发送接口
 * @author lee
 */
public interface ValidCodeService {

	
	
	
	/**
	 * 根据所选通道发送验证码接口;
	 * @param phone 手机号
	 * @param code 验证码
	 * @param codeType  验证码类型 
	 * @return true ：发送成功。false ：未发送
	 * @throws CoreServiceException 发送失败异常
	 */
	public boolean  sendValidCode(String phone ,String  code ,ValidCodeEnum codeType) throws CoreServiceException ;
	
	
	/**
	 * 校验验证码接口
	 * @param phone 手机号
	 * @param code 验证码
	 * @return true ：验证通过。false ：验证失败
	 * @throws CoreServiceException 
	 */
	public boolean validCode(String phone ,String code) throws CoreServiceException ;
	
	/**
	 * 判断发送短信是否已经冷却
	 * @param seconds 冷却时间
	 * @param redisKey 在redis中存数据的key
	 * @return
	 * @throws CoreServiceException
	 */
	public boolean sendCoolDown(Integer seconds, String redisKey) throws CoreServiceException;
	
	
}
