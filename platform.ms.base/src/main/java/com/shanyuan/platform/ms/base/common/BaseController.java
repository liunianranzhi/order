package com.shanyuan.platform.ms.base.common;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.base.common.vo.CommonVO;

public class BaseController {

	public final static Integer CODE_SUCCESS = 200;
	public final static Integer CODE_ERROR = 500;
	public final static Integer CODE_IMAGE_VCODE_ERROR = 402;
	
	public CommonVO buildSuccessResp(Map<String, Object> data){
		CommonVO commonVO = new CommonVO();
		String message = "success";
		if(!CollectionUtils.isEmpty(data)){
			message = ObjectUtils.isEmpty(data.get("msg")) ? message : data.get("msg").toString();
		}
		commonVO.setMessage(message);
		commonVO.setData(data);
		commonVO.setCode(CODE_SUCCESS);
		return commonVO;
	}
	
	public CommonVO buildErrorResp(Map<String, Object> map){
		CommonVO commonVO = new CommonVO();
		String message = "error";
		if(!CollectionUtils.isEmpty(map)){
			message = ObjectUtils.isEmpty(map.get("msg")) ? message : map.get("msg").toString();
		}
		commonVO.setMessage(message);
		commonVO.setData(new HashMap<String, Object>());
		commonVO.setCode(CODE_ERROR);
		return commonVO;
	}
	
	public CommonVO buildErrorResp(){
		CommonVO commonVO = new CommonVO();
		commonVO.setMessage("error");
		commonVO.setCode(CODE_ERROR);
		return commonVO;
	}
	
	public CommonVO buildSuccessResp(Map<String, Object> data, String message){
		CommonVO commonVO = new CommonVO();
		commonVO.setData(data);
		commonVO.setMessage(message);
		commonVO.setCode(CODE_SUCCESS);
		return commonVO;
	}
	
	public CommonVO buildResp(Map<String, Object> data, Integer code, String message){
		CommonVO commonVo = new CommonVO();
		commonVo.setCode(code);
		commonVo.setMessage(message);
		commonVo.setData(data);
		return commonVo;
	}

	public CommonVO buildResp(String message, Integer code){
		CommonVO commonVo = new CommonVO();
		commonVo.setCode(code);
		commonVo.setMessage(message);
		return commonVo;
	}
	
}
