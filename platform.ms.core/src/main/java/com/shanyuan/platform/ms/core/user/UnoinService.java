package com.shanyuan.platform.ms.core.user;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;

public interface UnoinService {
	
	/**
	 * 校验channel   by sunyue
	 * @param channel
	 * @return
	 * @throws CoreServiceException
	 */
	public String ValidChannel(String channel) throws CoreServiceException;
	

}
