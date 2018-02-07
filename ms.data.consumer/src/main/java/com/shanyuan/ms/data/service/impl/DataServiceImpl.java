package com.shanyuan.ms.data.service.impl;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.shanyuan.ms.data.domain.DALException;
import com.shanyuan.ms.data.domain.user.MemberInfo;
import com.shanyuan.ms.data.domain.user.api.UserApi;
import com.shanyuan.ms.data.service.DataService;
@Component
public class DataServiceImpl implements DataService{

	@Reference
	private UserApi userApi;
	
	public MemberInfo getMemberInfo(Integer memberId) throws Exception  {
		// TODO Auto-generated method stub
			return this.userApi.getMember(memberId);
	}

}
