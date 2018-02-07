/**
 * 
 */
package com.shanyuan.platform.ms.core.user;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.dao.user.entity.SyPoorAgent;

/**
 * @author 曹勇军
 *
 */
public interface PoorAgentService {
	/**
	 * @author caoyongjun
	 * 通过用户id获取到代理的贫困户id
	 * @param memberId 
	 */
	SyPoorAgent getPoorAgentByMemberId(Integer memberId)throws CoreServiceException; 
}
