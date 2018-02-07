package com.shanyuan.platform.ms.core.user;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.dao.user.entity.SyGuideShowState;

/**
 * 用户引导
 * @author yangjian
 * @date 2017/12/05
 */
public interface SyGuideShowStateService {

	/**
	 * 根据用户id获取
	 * @param memberId
	 * @return
	 * @throws CoreServiceException
	 */
	public SyGuideShowState getGuideShowStateByMember(Integer memberId) throws CoreServiceException;
	
	/**
	 * 根据用户id更新
	 * @param memberId
	 * @return
	 * @throws CoreServiceException
	 */
	public boolean updateAgreement(Integer recId, byte agreement) throws CoreServiceException;
	
}
