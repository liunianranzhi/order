/**
 * 
 */
package com.shanyuan.platform.ms.core.user.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.base.common.util.StatisticsUtils;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.LoginConstant.RoleType;
import com.shanyuan.platform.ms.core.user.RoleService;
import com.shanyuan.platform.ms.dao.user.entity.SyRole;
import com.shanyuan.platform.ms.dao.user.entity.SyRoleExample;
import com.shanyuan.platform.ms.dao.user.mapper.SyRoleMapper;

/**
 * @author 曹勇军
 *
 */
@Component
public class RoleServiceImpl implements RoleService {

	@Autowired
	private SyRoleMapper syRoleMapper;
	
	/**
	 * @author caoyongjun
	 * 按照用户id和角色类型来查找
	 */
	@Override
	public List<SyRole> getSyRoleByMemberIdAndType(Integer memberId, Byte... roleType) throws CoreServiceException {
		List<Byte> list=null;
		if(!ObjectUtils.isEmpty(roleType)){
			list=new ArrayList<Byte>();
			list.addAll(Arrays.asList(roleType));
		}
		SyRoleExample example=new SyRoleExample();
		example.createCriteria().andMemberIdEqualTo(memberId).andRoleTypeIn(list);
		return syRoleMapper.selectByExample(example);
	}

	@Override
	public Integer getAssistTotalNum(Long countryId) {
		Integer result = 0;
		SyRoleExample example = new SyRoleExample();
		List<Byte> list = new ArrayList<Byte>();
		list.add(RoleType.ROLE_TYPE_COOP);
		list.add(RoleType.ROLE_TYPE_WS);
		list.add(RoleType.ROLE_TYPE_GOV);
		list.add(RoleType.ROLE_TYPE_INDUSTRY);
		example.createCriteria().andAreaid3EqualTo(countryId).andRoleTypeIn(list);
		List<SyRole> selectByExample = syRoleMapper.selectByExample(example);
		List<Integer> memberHasGoods = StatisticsUtils.getStatisticsUtils().getMemberHasGoods();
		for (SyRole syRole : selectByExample) {
			if(memberHasGoods.contains(syRole.getMemberId())){
				result += 1;
			}
		}
		return result;
	}

	@Override
	public SyRole getRoleInfoByAssistId(Integer assistId) {
		SyRoleExample example = new SyRoleExample();
		example.createCriteria().andMemberIdEqualTo(assistId);
		List<SyRole> selectByExample = syRoleMapper.selectByExample(example);
		if(!CollectionUtils.isEmpty(selectByExample)) {
			return selectByExample.get(0);
		}
		return null;
	}

	@Override
	public List<SyRole> getRoleInfo(Long countryId) {
		SyRoleExample example = new SyRoleExample();
		example.createCriteria().andAreaid3EqualTo(countryId);
		List<SyRole> selectByExample = syRoleMapper.selectByExample(example);
		if(!CollectionUtils.isEmpty(selectByExample)) {
			return selectByExample;
		}
		return null;
	}
	
	

}
