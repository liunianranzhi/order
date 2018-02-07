package com.shanyuan.platform.ms.core.store;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;



public interface JoinOrgService {
	
	/**
	 * 加入组织
	 * @param member  会员信息
	 * @param orgId
	 * @throws CoreServiceException
	 */
	public void joinOrg(SyMember member ,Integer orgId) throws CoreServiceException;

}
