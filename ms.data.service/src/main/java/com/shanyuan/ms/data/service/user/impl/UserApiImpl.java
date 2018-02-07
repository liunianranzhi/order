package com.shanyuan.ms.data.service.user.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.shanyuan.ms.data.domain.DALException;
import com.shanyuan.ms.data.domain.user.MemberInfo;
import com.shanyuan.ms.data.domain.user.api.UserApi;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.dao.user.mapper.SyMemberMapper;
@Component
@Service()
public class UserApiImpl implements UserApi {

	@Autowired
	private SyMemberMapper memberMapper ;
 
	public MemberInfo getMember( Integer memberId) throws DALException {
		SyMember member = this.memberMapper.selectByPrimaryKey(memberId);
		if(member!=null) {
			MemberInfo mi = new MemberInfo();
			mi.setMemberId(member.getMemberId()+"");
			mi.setMemberName(member.getMemberName());
			mi.setPhone(member.getMemberMobile());
			return mi;
		} 
		return null;
	}

}
