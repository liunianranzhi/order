package com.shanyuan.platform.ms.base.common;

/**
 * service基类，封装基本状态码及通用返回方法
 * @author win10
 *
 */
public class BaseService {

	public final static String CODE_SUCCESS = "200";
	public final static String CODE_ERROR = "400";
	
	public ServiceResult buildSuccessResult(Object content){
		ServiceResult serviceResult = new ServiceResult();
		serviceResult.setMessage("success");
		serviceResult.setContent(content);
		serviceResult.setCode(CODE_SUCCESS);
		return serviceResult;
	}
	
	public ServiceResult buildErrorResult(String message){
		ServiceResult serviceResult = new ServiceResult();
		serviceResult.setMessage(message);
		serviceResult.setCode(CODE_ERROR);
		return serviceResult;
	}
	
}
