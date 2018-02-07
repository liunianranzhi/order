package com.shanyuan.platform.ms.core.user;

import java.util.List;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.dao.user.entity.SyRole;

/**
 * @author 曹勇军
 *
 */
public interface RoleService {
	List<SyRole> getSyRoleByMemberIdAndType(Integer memberId,Byte...roleType) throws CoreServiceException;
	
	/**
	 * 获取对应县助理人总数
	 * @author yangjian
	 * @param countryId
	 * @param roleType
	 * @return
	 */
	Integer getAssistTotalNum(Long countryId);
	
	SyRole getRoleInfoByAssistId(Integer assistId);
	
	List<SyRole> getRoleInfo(Long countryId);
}
