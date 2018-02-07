package com.shanyuan.platform.ms.facade;

import java.util.Map;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;

public interface ServiceExceptionResolver {

	
	public Map<String,Object> parseException(CoreServiceException e);
}
