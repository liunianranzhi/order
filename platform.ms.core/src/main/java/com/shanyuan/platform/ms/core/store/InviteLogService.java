package com.shanyuan.platform.ms.core.store;

import java.util.List;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.dao.user.entity.SyInviteCircleLog;

/**
 * 
 * @author yangjian
 * @date 2017/10/19
 *
 */
public interface InviteLogService {

	SyInviteCircleLog getLog(Integer memberId, Integer circleId) throws CoreServiceException;
	
	boolean insertSelective(SyInviteCircleLog syInviteCircleLog) throws CoreServiceException;
	
	boolean updateByPrimaryKeySelective(SyInviteCircleLog syInviteCircleLog) throws CoreServiceException;
	
	SyInviteCircleLog getLogByMemberId(Integer memberId) throws CoreServiceException;
	
	List<SyInviteCircleLog> getAllLog() throws CoreServiceException;
	
}
