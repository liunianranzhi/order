package com.shanyuan.platform.ms.core.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.core.user.YIKECorrelationService;
import com.shanyuan.platform.ms.dao.user.entity.SyInviteCircleLog;
import com.shanyuan.platform.ms.dao.user.entity.SyInviteCircleMember;
import com.shanyuan.platform.ms.dao.user.entity.SyInviteCircleMemberExample;
import com.shanyuan.platform.ms.dao.user.mapper.SyInviteCircleLogMapper;
import com.shanyuan.platform.ms.dao.user.mapper.SyInviteCircleMemberMapper;
/**
 *  益客相关接口实现
 * @author zhangwd
 *
 */
@Component
public class YIKECorrelationServiceImpl implements YIKECorrelationService {

	
	@Autowired
	private SyInviteCircleMemberMapper syInviteCircleMemberMapper;
	
	@Autowired
	private SyInviteCircleLogMapper syInviteCircleLogMapper;
	
	/**
	 * 加入为益客
	 * @param memberId  用户id
	 * @param circleId	用户所在圈子id
	 * @param inviteMemberId	邀请人id
	 * @param inviteCircleId	邀请人所在圈子id
	 * @return
	 */
	@Override
	public Boolean becomeInviteCircleMember( Integer memberId, Integer circleId, Integer inviteMemberId,
														  Integer inviteCircleId) {
	
		
		SyInviteCircleMemberExample inviteCircleMemberExample = new SyInviteCircleMemberExample();
		inviteCircleMemberExample.createCriteria().andMemberIdEqualTo(memberId)
											   .andCircleIdEqualTo(circleId)
											   .andInviteMemberIdEqualTo(inviteMemberId)
											   .andInviteCircleIdEqualTo(inviteCircleId);
		
		List<SyInviteCircleMember> selectByExample = syInviteCircleMemberMapper.selectByExample(inviteCircleMemberExample);
		
		Boolean flag = false;
		//需要判断是否重复处理
		if (CollectionUtils.isEmpty(selectByExample)) {
			
			SyInviteCircleMember icMember = new SyInviteCircleMember();
			
			icMember.setMemberId(memberId);
			icMember.setCircleId(circleId);
			icMember.setInviteCircleId(inviteCircleId);
			icMember.setInviteMemberId(inviteMemberId);
			icMember.setAddTime(DateUtil.getNowInt());
			
			int insert = syInviteCircleMemberMapper.insertSelective(icMember);
			
			flag = insert > 0 ? true : false;
			
			//添加日志数据
			SyInviteCircleLog inviteCircleLog = new SyInviteCircleLog();
			inviteCircleLog.setMemberId(memberId);
			inviteCircleLog.setCircleId(circleId);
			inviteCircleLog.setInvMemberId(inviteMemberId);
			inviteCircleLog.setAddTime(DateUtil.getNowInt());
			
			syInviteCircleLogMapper.insertSelective(inviteCircleLog);
		
		}else {
			
			return flag;  
		}
		
		return flag;
	}

}
