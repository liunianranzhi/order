package com.shanyuan.platform.ms.core.store;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;

import com.shanyuan.platform.ms.dao.user.entity.SyMember;



public interface SyStoreJoininService {

	/**
	 * 更新开店的状态
	 * @param member
	 * @param memberId
	 * @throws CoreServiceException
	 */
	public void updateStoreJoin(SyMember member,Integer memberId) throws CoreServiceException;
	
	
	
	

}