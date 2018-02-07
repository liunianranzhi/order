package com.shanyuan.platform.ms.core.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.LoginConstant;
import com.shanyuan.platform.ms.core.user.UnoinService;
import com.shanyuan.platform.ms.dao.union.mapper.SyUnionMapper;


@Component
public class UnoinServiceImpl implements UnoinService{
	
	@Autowired
	private SyUnionMapper  syUnionMapper;

	/**
	 * 校验channel   by sunyue
	 * @param channel
	 * @return
	 * @throws CoreServiceException
	 */
	@Override
	public String ValidChannel(String channel) throws CoreServiceException {
		List<String> allAppChannels = this.syUnionMapper.selectUnionChannel();
		allAppChannels.add(LoginConstant.CircleCode.CODE_YKJLB);
		if(!ObjectUtils.isEmpty(allAppChannels) && allAppChannels.contains(channel)) {
			return channel;  
		 }
		return null;
	
	}

	

}
