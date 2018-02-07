package com.shanyuan.platform.ms.core.union.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.shanyuan.platform.ms.core.union.AreaChannelService;
import com.shanyuan.platform.ms.dao.union.entity.SyAreaChannel;
import com.shanyuan.platform.ms.dao.union.entity.SyAreaChannelExample;
import com.shanyuan.platform.ms.dao.union.entity.SyAreaChannelExample.Criteria;
import com.shanyuan.platform.ms.dao.union.mapper.SyAreaChannelMapper;
@Component
public class AreaChannelServiceImpl implements AreaChannelService {

	@Autowired
	SyAreaChannelMapper syAreaChannelMapper;
	
	//modify by yangjian
	@Override
	public List<SyAreaChannel> listAreaChannel(String unionChannel, Byte type) {
		SyAreaChannelExample example=new SyAreaChannelExample();
//		example.createCriteria().andUnionChannelEqualTo(unionChannel).andTypeEqualTo(type);
		Criteria createCriteria = example.createCriteria();
		if(!StringUtils.isEmpty(unionChannel)){
			createCriteria.andUnionChannelEqualTo(unionChannel);
		}
		createCriteria.andTypeEqualTo(type);
		return syAreaChannelMapper.selectByExample(example);
	}

	@Override
	public List<Long> getDistinctAreaId(Byte type) {
		return syAreaChannelMapper.getDistinctAreaId(type);
	}

	@Override
	public List<SyAreaChannel> listAreaByUnionId(Integer unionId, Byte type) {
		SyAreaChannelExample example = new SyAreaChannelExample();
		example.createCriteria().andUnionIdEqualTo(unionId).andTypeEqualTo(type);
		return syAreaChannelMapper.selectByExample(example);
	}

}
