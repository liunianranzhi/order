package com.shanyuan.platform.ms.base.rest.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;

import com.alibaba.fastjson.JSONObject;
import com.shanyuan.platform.ms.base.common.ServiceResult;

/**
 * 异步rest请求接口
 * @author win10
 *
 */
public interface AsyncRestService {
	
	/**
	 * get请求
	 * @param map
	 * @param url
	 * @return
	 */
	public ServiceResult parseGetResult(Map<String, Object> map, String url);
	
	/**
	 * get请求
	 * @param url
	 * @return
	 */
	public ServiceResult parseGetResult(String url);
	
	/**
	 * get请求
	 * @param map
	 * @param url
	 * @return
	 */
	public ServiceResult parseGetResult(HashMap<String, Object> map, String url);
	
	/**
	 * post请求
	 * @param map
	 * @param url
	 * @return
	 */
	public ServiceResult parsePostResult(LinkedMultiValueMap<String, Object> map, String url);
	
	/**
	 * 带header的http请求
	 * @param headers
	 * @param params
	 * @param url
	 * @return
	 */
	public ServiceResult parsePostResultWithHeader(HttpHeaders headers, JSONObject params, String url);
	
}
