package com.shanyuan.platform.ms.core.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.IndexConstant;
import com.shanyuan.platform.ms.core.user.IndexPopService;
import com.shanyuan.platform.ms.dao.user.entity.SyIndexPop;
import com.shanyuan.platform.ms.dao.user.entity.SyIndexPopExample;
import com.shanyuan.platform.ms.dao.user.mapper.SyIndexPopMapper;

@Component
public class IndexPopServiceImpl implements IndexPopService {
	
	@Autowired
	private SyIndexPopMapper syIndexPopMapper;

	@Override
	public SyIndexPop getIndexPopByChannel(String channel) throws CoreServiceException {
		SyIndexPopExample indexPopExample = new SyIndexPopExample();
		indexPopExample.createCriteria().andChannelEqualTo(channel).andStatusEqualTo((byte) 2);
		List<SyIndexPop> indexPops = this.syIndexPopMapper.selectByExample(indexPopExample);
		if(CollectionUtils.isEmpty(indexPops)&&!IndexConstant.Channels.ALLUNION.equalsIgnoreCase(channel)){
			indexPopExample.clear();
			indexPopExample.createCriteria().andChannelEqualTo(IndexConstant.Channels.ALLUNION).andStatusEqualTo((byte) 2);
			indexPops = this.syIndexPopMapper.selectByExample(indexPopExample);
			if(!CollectionUtils.isEmpty(indexPops)){
				return indexPops.get(0);
			}else{
				return null;
			}
		}
		return indexPops.get(0);
	}

}
