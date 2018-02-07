
package com.shanyuan.platform.ms.core.store.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.store.CircleService;
import com.shanyuan.platform.ms.dao.user.entity.SyCircle;
import com.shanyuan.platform.ms.dao.user.entity.SyCircleExample;
import com.shanyuan.platform.ms.dao.user.mapper.SyCircleMapper;

/**
 * 
 * @author yangjian
 * @date 2017/10/19
 *
 */
@Component
public class CircleServiceImpl implements CircleService {

	@Autowired
	private SyCircleMapper syCircleMapper;

	
	@Override
	public SyCircle selectByPrimaryKey(Integer circleId) throws CoreServiceException{
		
		return syCircleMapper.selectByPrimaryKey(circleId);
	}


	@Override
	public List<SyCircle> selectByNameAndCode(String name, String code) throws CoreServiceException {
		SyCircleExample circleExample = new SyCircleExample();
		circleExample.createCriteria().andCodeEqualTo(code).andCircleNameLike(name);
		List<SyCircle> selectByExample = this.syCircleMapper.selectByExample(circleExample);
		if(!CollectionUtils.isEmpty(selectByExample)){
			return selectByExample;
		}
		return null;
	}


	@Override
	public SyCircle selectByCode(String code, Integer parentCircleId, String channel) throws CoreServiceException {
		SyCircleExample syCircleExample = new SyCircleExample();
		syCircleExample.createCriteria().andCodeEqualTo(code).andCircleStatusEqualTo((byte) 1)
		.andParentCircleIdEqualTo(parentCircleId).andChannelEqualTo(channel);
		List<SyCircle> circles = this.syCircleMapper.selectByExample(syCircleExample);
		if(!CollectionUtils.isEmpty(circles)){
			return circles.get(0);
		}
		return null;
	}


	@Override
	public List<SyCircle> selectByParentId(Integer parentCircleId) throws CoreServiceException {
		SyCircleExample syCircleExample = new SyCircleExample();
		syCircleExample.createCriteria().andParentCircleIdEqualTo(parentCircleId);
		List<SyCircle> circles = this.syCircleMapper.selectByExample(syCircleExample);
		if(!CollectionUtils.isEmpty(circles)){
			return circles;
		}
		return null;
	}


	@Override
	public List<SyCircle> getAllCircle() throws CoreServiceException {
		SyCircleExample syCircleExample = new SyCircleExample();
		List<SyCircle> circles = this.syCircleMapper.selectByExample(syCircleExample);
		return circles;
	}


	
}
