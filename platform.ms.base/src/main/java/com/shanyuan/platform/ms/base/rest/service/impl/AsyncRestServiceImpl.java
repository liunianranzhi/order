package com.shanyuan.platform.ms.base.rest.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import org.springframework.web.client.AsyncRestTemplate;

import com.alibaba.fastjson.JSONObject;
import com.shanyuan.platform.ms.base.common.BaseService;
import com.shanyuan.platform.ms.base.common.ServiceResult;
import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.base.rest.service.AsyncRestService;

/**
 * 
 * @author yangjian 2017/09/28
 *
 */
@Service
public class AsyncRestServiceImpl extends BaseService implements AsyncRestService {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private AsyncRestTemplate restTemplate;
	
	/**
	 * 发送get请求
	 * @param map  参数map
	 * @param url  请求地址，参数拼接在链接中，用通配符代表
	 * 示例 :
	 * Map<String, Object> map = new HashMap<String, Object>;
	 * map.put("channel", 1);
	 * map.put("goodsId", 2);
	 * String url = "http://localhost:8083/goods/goodsIndex?channel={channel}&goods_id={goodsId}";
	 * 根据实际情况自己添加参数
	 * @return 
	 */
	@Override
	public ServiceResult parseGetResult(Map<String, Object> map, String url) {
		
		ServiceResult result = new ServiceResult();
		ListenableFuture<ResponseEntity<String>> forEntity = restTemplate.getForEntity(url, String.class, map);
		forEntity.addCallback(new ListenableFutureCallback<ResponseEntity<String>>() {
            public void onSuccess(ResponseEntity<String> resp) {
                String sResult = resp.getBody();
                if(!StringUtils.isEmpty(sResult)){
                	JSONObject jResult = JSONObject.parseObject(sResult);
                	result.setContent(jResult);
                	result.setCode(CODE_SUCCESS);
                	result.setMessage("success");
                	logger.info("url:{}, map:{} 请求成功", url, map);
                }else{
                	this.onFailure(new Throwable(new CoreServiceException(CoreServiceExcepType.REQUEST_CODE, "请求结果为空")));
                }
            }
            public void onFailure(Throwable t) {
            	result.setMessage(t.getMessage());
            	result.setCode(CODE_ERROR);
            	t.printStackTrace();
            	logger.info("url:{}, map:{} 请求失败", url, map);
            }
		});
		
		return result;
	}
	
	/**
	 * 发送get请求
	 * @param url 请求地址
	 * 请求为纯字符串，可以是无参数的get请求，也可以是将参数的K V都拼接好传入
	 * 示例
	 * 1、http://localhost:8083/goods/goodsIndex
	 * 2、http://localhost:8083/goods/goodsIndex?channel=1&goods_id=2
	 * 以上两种方式都支持
	 * @return
	 * 
	 */
	@Override
	public ServiceResult parseGetResult(String url) {
		ServiceResult result = new ServiceResult();
		ListenableFuture<ResponseEntity<String>> forEntity = restTemplate.getForEntity(url, String.class);
		forEntity.addCallback(new ListenableFutureCallback<ResponseEntity<String>>() {
			public void onSuccess(ResponseEntity<String> resp) {
                String sResult = resp.getBody();
                if(!StringUtils.isEmpty(sResult)){
                	JSONObject jResult = JSONObject.parseObject(sResult);
                	result.setContent(jResult);
                	result.setCode(CODE_SUCCESS);
                	result.setMessage("success");
                	logger.info("url:{} 请求成功", url);
                }else{
                	this.onFailure(new Throwable(new CoreServiceException(CoreServiceExcepType.REQUEST_CODE, "请求结果为空")));
                }
            }
            public void onFailure(Throwable t) {
            	result.setMessage(t.getMessage());
            	result.setCode(CODE_ERROR);
            	t.printStackTrace();
            	logger.info("url:{} 请求失败", url);
            }
		});
		
		return result;
	}

	/**
	 * 发送get请求
	 * @param map  参数map	
	 * @param url  请求地址，地址中不需要拼接参数，在方法中处理
	 * 示例 :
	 * HashMap<String, Object> map = new HashMap<String, Object>;
	 * map.put("channel", 1);
	 * map.put("goodsId", 2);
	 * String url = "http://localhost:8083/goods/goodsIndex";
	 * 根据实际情况自己添加参数
	 * @return
	 */
	@Override
	public ServiceResult parseGetResult(HashMap<String, Object> map, String url) {
		StringBuilder sb = new StringBuilder();
		sb.append(url);
		if(!CollectionUtils.isEmpty(map)){
			Set<String> keys = map.keySet();
			sb.append("?");
			for (String string : keys) {
				sb.append(string);
				sb.append("=");
				sb.append(map.get(string).toString());
				sb.append("&");
			}
		}
		String finalUrl = sb.toString();
		if(finalUrl.endsWith("&")){
			finalUrl = finalUrl.substring(0, finalUrl.length() - 1);
		}
		ServiceResult result = this.parseGetResult(finalUrl);
		return result;
	}

	/**
	 * 发送post请求
	 * @param map 请求参数集合
	 * @param 请求地址
	 * 示例：
	 * MultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
	 * map.add("channel", 1);
	 * map.add("goods_id", 2);
	 * String url = "http://localhost:8083/goods/goodsIndex";
	 * 根据实际情况自己添加参数
	 * @return 
	 */
	@Override
	public ServiceResult parsePostResult(LinkedMultiValueMap<String, Object> map, String url) {
		ServiceResult result = new ServiceResult();
		String header = "";
		HttpEntity<String> httpEntity = new HttpEntity<String>(header);
		ListenableFuture<ResponseEntity<String>> forEntity = restTemplate.postForEntity(url, httpEntity, String.class, map);
		forEntity.addCallback(new ListenableFutureCallback<ResponseEntity<String>>() {
			public void onSuccess(ResponseEntity<String> resp) {
                String sResult = resp.getBody();
                if(!StringUtils.isEmpty(sResult)){
                	JSONObject jResult = JSONObject.parseObject(sResult);
                	result.setContent(jResult);
                	result.setCode(CODE_SUCCESS);
                	result.setMessage("success");
                	logger.info("url:{}, map:{} 请求成功", url, map);
                }else{
                	this.onFailure(new Throwable(new CoreServiceException(CoreServiceExcepType.REQUEST_CODE, "请求结果为空")));
                }
            }
            public void onFailure(Throwable t) {
            	result.setMessage(t.getMessage());
            	result.setCode(CODE_ERROR);
            	t.printStackTrace();
            	logger.info("url:{}, map:{} 请求失败", url, map);
            }
		});
		return result;
	}

	@Override
	public ServiceResult parsePostResultWithHeader(HttpHeaders headers, JSONObject params, String url) {
		ServiceResult result = new ServiceResult();
		HttpEntity<String> httpEntity = new HttpEntity<String>(headers);
		ListenableFuture<ResponseEntity<String>> forEntity = restTemplate.postForEntity(url, httpEntity, String.class, params);
		forEntity.addCallback(new ListenableFutureCallback<ResponseEntity<String>>() {
			public void onSuccess(ResponseEntity<String> resp) {
                String sResult = resp.getBody();
                if(!StringUtils.isEmpty(sResult)){
                	JSONObject jResult = JSONObject.parseObject(sResult);
                	result.setContent(jResult);
                	result.setCode(CODE_SUCCESS);
                	result.setMessage("success");
                	logger.info("url:{}, map:{} 请求成功", url, params);
                }else{
                	this.onFailure(new Throwable(new CoreServiceException(CoreServiceExcepType.REQUEST_CODE, "请求结果为空")));
                }
            }
            public void onFailure(Throwable t) {
            	result.setMessage(t.getMessage());
            	result.setCode(CODE_ERROR);
            	t.printStackTrace();
            	logger.info("url:{}, map:{} 请求失败", url, params);
            }
		});
		return result;
	}

}
