package com.shanyuan.platform.ms.portal.auth.service;

import java.io.IOException;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;

public interface ImageValidCodeService {
	
	/**
	 * 获取图形验证码
	 * @param mobile
	 * @return
	 * @throws IOException
	 */
	public String getValidCode(String mobile) throws IOException;
	
	/**
	 * 校验验证码
	 * @param vcode
	 * @return
	 * @throws CoreServiceException
	 */
	public Boolean checkValidCode(String mobile, String vcode) throws CoreServiceException;
	
	/**
	 * 校验是否需要验证码
	 * @param mobile
	 * @param vcode
	 * @return
	 * @throws CoreServiceException
	 */
	public Boolean needVaidCode(String mobile, String vcode) throws CoreServiceException;
	

}
