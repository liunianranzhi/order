package com.shanyuan.platform.ms.core.store.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.store.InviteCircleMemberService;
import com.shanyuan.platform.ms.dao.user.entity.SyInviteCircleMember;
import com.shanyuan.platform.ms.dao.user.entity.SyInviteCircleMemberExample;
import com.shanyuan.platform.ms.dao.user.mapper.SyInviteCircleMemberMapper;

/**
 * 
 * @author yangjian
 * @date 2017/10/19
 *
 */
@Component
public class InviteCircleMemberServiceImpl implements InviteCircleMemberService{

	@Autowired
	private SyInviteCircleMemberMapper syInviteCircleMemberMapper;

	@Override
	public boolean updateByPrimaryKeySelective(SyInviteCircleMember syInviteCircleMember) throws CoreServiceException {
		return syInviteCircleMemberMapper.updateByPrimaryKeySelective(syInviteCircleMember) == 1 ? true : false;
	}

	@Override
	public boolean insertSelective(SyInviteCircleMember syInviteCircleMember) throws CoreServiceException {
		return syInviteCircleMemberMapper.insertSelective(syInviteCircleMember) == 1 ? true : false;
	}

	@Override
	public boolean deleteByMemberId(Integer memberId) throws CoreServiceException {
		SyInviteCircleMemberExample syInviteCircleMemberExample = new SyInviteCircleMemberExample();
		syInviteCircleMemberExample.createCriteria().andMemberIdEqualTo(memberId);
		return syInviteCircleMemberMapper.deleteByExample(syInviteCircleMemberExample) == 1 ? true : false;
	}

	@Override
	public SyInviteCircleMember getInviteCircleMemberByMemberId(Integer memberId) throws CoreServiceException {
		SyInviteCircleMemberExample syInviteCircleMemberExample = new SyInviteCircleMemberExample();
		syInviteCircleMemberExample.createCriteria().andMemberIdEqualTo(memberId);
		List<SyInviteCircleMember> syInviteCircleMembers = syInviteCircleMemberMapper.selectByExample(syInviteCircleMemberExample);
		if(!CollectionUtils.isEmpty(syInviteCircleMembers)){
			return syInviteCircleMembers.get(0);
		}
		return null;
	}

	@Override
	public List<SyInviteCircleMember> getAllInviteCircleMember(Integer time, Integer start, Integer limit) throws CoreServiceException {
		SyInviteCircleMemberExample syInviteCircleMemberExample = new SyInviteCircleMemberExample();
		syInviteCircleMemberExample.createCriteria().andAddTimeLessThanOrEqualTo(time);
		syInviteCircleMemberExample.setOrderByClause("rec_id LIMIT " + start + "," + limit);
		return syInviteCircleMemberMapper.selectByExample(syInviteCircleMemberExample);
	}

}
