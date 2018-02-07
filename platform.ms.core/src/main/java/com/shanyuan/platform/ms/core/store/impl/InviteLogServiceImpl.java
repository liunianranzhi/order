package com.shanyuan.platform.ms.core.store.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.store.InviteLogService;
import com.shanyuan.platform.ms.dao.user.entity.SyInviteCircleLog;
import com.shanyuan.platform.ms.dao.user.entity.SyInviteCircleLogExample;
import com.shanyuan.platform.ms.dao.user.mapper.SyInviteCircleLogMapper;

/**
 * 
 * @author yangjian
 * @date 2017/10/19
 *
 */
@Component
public class InviteLogServiceImpl implements InviteLogService {

	@Autowired
	private SyInviteCircleLogMapper syInviteCircleLogMapper;

	@Override
	public boolean insertSelective(SyInviteCircleLog syInviteCircleLog) throws CoreServiceException {
		return syInviteCircleLogMapper.insertSelective(syInviteCircleLog) == 1 ? true : false;
	}

	@Override
	public boolean updateByPrimaryKeySelective(SyInviteCircleLog syInviteCircleLog) throws CoreServiceException {
		return syInviteCircleLogMapper.updateByPrimaryKeySelective(syInviteCircleLog) == 1 ? true : false;
	}

	@Override
	public SyInviteCircleLog getLog(Integer memberId, Integer circleId) throws CoreServiceException {
		SyInviteCircleLogExample syInviteCircleLogExample = new SyInviteCircleLogExample();
		syInviteCircleLogExample.createCriteria().andMemberIdEqualTo(memberId).andCircleIdEqualTo(circleId);
		List<SyInviteCircleLog> syInviteCircleLogs = syInviteCircleLogMapper.selectByExample(syInviteCircleLogExample);
		if(!ObjectUtils.isEmpty(syInviteCircleLogs)){
			return syInviteCircleLogs.get(0);
		}
		return null;
	}

	@Override
	public SyInviteCircleLog getLogByMemberId(Integer memberId) throws CoreServiceException {
		SyInviteCircleLogExample syInviteCircleLogExample = new SyInviteCircleLogExample();
		syInviteCircleLogExample.createCriteria().andMemberIdEqualTo(memberId);
		List<SyInviteCircleLog> syInviteCircleLogs = syInviteCircleLogMapper.selectByExample(syInviteCircleLogExample);
		if(!ObjectUtils.isEmpty(syInviteCircleLogs)){
			return syInviteCircleLogs.get(0);
		}
		return null;
	}

	@Override
	public List<SyInviteCircleLog> getAllLog() throws CoreServiceException {
		SyInviteCircleLogExample example = new SyInviteCircleLogExample();
		List<SyInviteCircleLog> selectByExample = syInviteCircleLogMapper.selectByExample(example);
		return selectByExample;
	}

}
