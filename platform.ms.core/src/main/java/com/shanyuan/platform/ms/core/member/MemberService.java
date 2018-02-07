package com.shanyuan.platform.ms.core.member;

import java.util.List;
import java.util.Map;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.dao.user.entity.SyMemberWithBLOBs;

/**
 * 会员service，会员简单逻辑
 * @author yangjian
 * @date 2017/10/19
 *
 */
public interface MemberService {
	
	Integer updateByPrimaryKeySelective(SyMemberWithBLOBs syMemberWithBlobs);
	
	String getUserDispMobile(String mobile);
	
	boolean insertSelective(SyMemberWithBLOBs syMemberWithBLOBs);
	/**
	 * 获得member info
	 * by zy 2017-10-30
	 * @param memberIds
	 * @return
	 * @throws CoreServiceException
	 */
	List<SyMember> getMemberInfoByIds(List<Integer> memberIds) throws CoreServiceException;
	/**
	 * 获得member info
	 * by zy 2017-10-30
	 * @param memberIds
	 * @return
	 * @throws CoreServiceException
	 */
	public Map<Integer,SyMember> getMemberMapByIds(List<Integer> memberIds) throws CoreServiceException;
	
}
