package com.shanyuan.platform.ms.base.rest.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;

import com.alibaba.fastjson.JSONObject;
import com.shanyuan.platform.ms.base.common.ServiceResult;

/**
 * restService接口
 * @author yangjian 2017/09/28
 *
 */
public interface RestService {

	/**
	 * get请求
	 * @param map
	 * @param url
	 * @return
	 */
	public ServiceResult parseGetResult(Map<String, Object> map, String url);
	
	/**
	 * get请求
	 * @param map
	 * @param url
	 * @return
	 */
	public ServiceResult parseGetResult(HashMap<String, Object> map, String url);
	
	/**
	 * 无参或已拼接参数get请求
	 * @param url
	 * @return
	 */
	public ServiceResult parseGetResult(String url);
	
	
	/**
	 * post请求
	 * @param map
	 * @param url
	 * @return
	 */
	public ServiceResult parsePostResult(LinkedMultiValueMap<String, Object> map, String url);
	
	/**
	 * 带有请求头的post请求
	 * @param httpHeader
	 * @param params
	 * @param url
	 * @return
	 */
	public ServiceResult parsePostResultWithHeader(HttpHeaders httpHeader, JSONObject params, String url);
	
}
