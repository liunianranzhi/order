package com.shanyuan.platform.ms.core.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.shanyuan.platform.ms.core.user.ManagerBocService;
import com.shanyuan.platform.ms.dao.user.entity.SyManagerBoc;
import com.shanyuan.platform.ms.dao.user.entity.SyManagerBocExample;
import com.shanyuan.platform.ms.dao.user.mapper.SyManagerBocMapper;

/**
 * 
 * @author yangjian
 * @date 2017/10/19
 *
 */
@Component
public class ManagerBocServiceImpl implements ManagerBocService {
	
	@Autowired
	private SyManagerBocMapper syManagerBocMapper;

	@Override
	public List<SyManagerBoc> selectManagerBoc(Integer memberId) {
		SyManagerBocExample example = new SyManagerBocExample();
		example.createCriteria().andMemberIdEqualTo(memberId);
		List<SyManagerBoc> managerBocs = syManagerBocMapper.selectByExample(example);
		if(!CollectionUtils.isEmpty(managerBocs)){
			return managerBocs;
		}
		return null;
	}

}
