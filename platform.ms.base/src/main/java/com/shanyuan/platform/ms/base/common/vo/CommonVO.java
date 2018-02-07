package com.shanyuan.platform.ms.base.common.vo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.ObjectUtils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * @author zhongying
 *
 */
@ApiModel
public class CommonVO {
	
	@ApiModelProperty(value = "返回状态码", required = true)
	private int code;
	@ApiModelProperty(value = "返回信息", required = true)
	private String message;
	@ApiModelProperty(value = "返回正文", required = true)
	private Map<String,Object> data;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Map<String,Object> getData() {
		if(ObjectUtils.isEmpty(data)){
			return new HashMap<String,Object>();
		}else{
			return data;
		}
	}
	public void setData(Map<String,Object> data) {
		this.data = data;
	}
	
}
