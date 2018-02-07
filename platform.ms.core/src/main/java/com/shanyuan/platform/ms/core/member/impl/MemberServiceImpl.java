package com.shanyuan.platform.ms.core.member.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.member.MemberService;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.dao.user.entity.SyMemberExample;
import com.shanyuan.platform.ms.dao.user.entity.SyMemberWithBLOBs;
import com.shanyuan.platform.ms.dao.user.mapper.SyMemberMapper;

/**
 * 
 * @author yangjian
 * @date 2017/10/19
 *
 */
@Component
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private SyMemberMapper syMemberMapper;

	@Override
	public Integer updateByPrimaryKeySelective(SyMemberWithBLOBs syMemberWithBlobs) {
		return syMemberMapper.updateByPrimaryKeySelective(syMemberWithBlobs);
	}

	@Override
	public String getUserDispMobile(String mobile) {
		return mobile.substring(0, 3)+"**"+mobile.substring(mobile.length()-4);
	}

	@Override
	public boolean insertSelective(SyMemberWithBLOBs syMemberWithBLOBs) {
		return syMemberMapper.insert(syMemberWithBLOBs) == 1 ? true : false;
	}
    /**
     * 根据ids获得多个memberinfo
     */
	@Override
	public List<SyMember> getMemberInfoByIds(List<Integer> memberIds) throws CoreServiceException {
		SyMemberExample example = new SyMemberExample();
		example.createCriteria().andMemberIdIn(memberIds);
		List<SyMember> selectByExamples = syMemberMapper.selectByExample(example);
		return selectByExamples;
	}
	/**
	 * 返回member map
	 * @param memberIds
	 * @return
	 * @throws CoreServiceException
	 */
	@Override
	public Map<Integer,SyMember> getMemberMapByIds(List<Integer> memberIds) throws CoreServiceException {
		Map<Integer,SyMember> member=new HashMap<Integer,SyMember>();
		if(ObjectUtils.isEmpty(memberIds)) {
			return member;
		}
		List<SyMember> memberInfoByIds = this.getMemberInfoByIds(memberIds);
		if(ObjectUtils.isEmpty(memberInfoByIds)) {
			return member;
		}
		for(SyMember mb:memberInfoByIds) {
			Integer memberId = mb.getMemberId();
			if(!ObjectUtils.isEmpty(memberId)) {
				member.put(memberId, mb);
			}
		}
		return member;
	}
}
