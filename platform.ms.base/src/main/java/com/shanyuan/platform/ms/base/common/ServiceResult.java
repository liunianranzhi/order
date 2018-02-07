package com.shanyuan.platform.ms.base.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author yangjian 2017/09/27
 *
 */
@ApiModel
public class ServiceResult {

	@ApiModelProperty(value = "返回状态码", required = true)
	public String code;
	@ApiModelProperty(value = "返回信息", required = true)
	public String message;
	@ApiModelProperty(value = "返回正文", required = true)
	public Object content;
	@ApiModelProperty(value = "请求时间", required = true)
	public String time = String.valueOf(System.currentTimeMillis()/1000);
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getContent() {
		return content;
	}
	public void setContent(Object content) {
		this.content = content;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
}
