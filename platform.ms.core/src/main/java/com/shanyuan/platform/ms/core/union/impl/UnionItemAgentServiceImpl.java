package com.shanyuan.platform.ms.core.union.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shanyuan.platform.ms.core.union.UnionItemAgentService;
import com.shanyuan.platform.ms.dao.union.entity.SyUnionItemAgent;
import com.shanyuan.platform.ms.dao.union.entity.SyUnionItemAgentExample;
import com.shanyuan.platform.ms.dao.union.mapper.SyUnionItemAgentMapper;

@Component
public class UnionItemAgentServiceImpl implements UnionItemAgentService {
	@Autowired
	SyUnionItemAgentMapper syUnionItemAgentMapper;
	
	@Override
	public List<SyUnionItemAgent> selectSyUnionItemAgentByUnionId(Integer unionId){
		SyUnionItemAgentExample example=new SyUnionItemAgentExample();
		example.createCriteria().andUnionItemIdEqualTo(unionId);
		return syUnionItemAgentMapper.selectByExample(example);
	}
}
