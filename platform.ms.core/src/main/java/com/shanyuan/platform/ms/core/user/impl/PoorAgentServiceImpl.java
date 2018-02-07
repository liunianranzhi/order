package com.shanyuan.platform.ms.core.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.user.PoorAgentService;
import com.shanyuan.platform.ms.dao.user.entity.SyPoorAgent;
import com.shanyuan.platform.ms.dao.user.entity.SyPoorAgentExample;
import com.shanyuan.platform.ms.dao.user.mapper.SyPoorAgentMapper;

/**
 * @author 曹勇军
 *
 */
@Component
public class PoorAgentServiceImpl implements PoorAgentService {

	@Autowired
	SyPoorAgentMapper syPoorAgentMapper;
	
	/**
	 * @author caoyongjun
	 * 通过用户id获取到代理的贫困户id
	 * @param memberId
	 */
	@Override
	public SyPoorAgent getPoorAgentByMemberId(Integer memberId) throws CoreServiceException {
		SyPoorAgentExample example=new SyPoorAgentExample();
		example.createCriteria().andMemberIdEqualTo(memberId);
		List<SyPoorAgent> list=syPoorAgentMapper.selectByExample(example);
		if(ObjectUtils.isEmpty(list)){
			return null;
		}else{
			return list.get(0);
		}
	}

}
