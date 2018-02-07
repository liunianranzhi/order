package com.shanyuan.platform.ms.core.store;

import java.util.List;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.dao.user.entity.SyInviteCircleMember;

/**
 * 
 * @author yangjian
 * @date 2017/10/19
 *
 */
public interface InviteCircleMemberService {
	
	boolean deleteByMemberId(Integer memberId) throws CoreServiceException;
	
	boolean updateByPrimaryKeySelective(SyInviteCircleMember syInviteCircleMember) throws CoreServiceException;
	
	boolean insertSelective(SyInviteCircleMember syInviteCircleMember) throws CoreServiceException;
	
	SyInviteCircleMember getInviteCircleMemberByMemberId(Integer memberId) throws CoreServiceException;
	
	List<SyInviteCircleMember> getAllInviteCircleMember(Integer time, Integer start, Integer limit) throws CoreServiceException;
	
}
