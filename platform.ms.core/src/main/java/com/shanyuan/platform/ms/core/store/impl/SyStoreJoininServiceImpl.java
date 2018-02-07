package com.shanyuan.platform.ms.core.store.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.LoginConstant;
import com.shanyuan.platform.ms.core.constant.StoreConstant;
import com.shanyuan.platform.ms.core.store.SyStoreJoininService;
import com.shanyuan.platform.ms.dao.store.entity.SyStoreJoinin;
import com.shanyuan.platform.ms.dao.store.entity.SyStoreJoininExample;
import com.shanyuan.platform.ms.dao.store.mapper.SyStoreJoininMapper;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;




@Component
public class SyStoreJoininServiceImpl implements SyStoreJoininService{
	
	@Autowired
	private SyStoreJoininMapper syStoreJoininMapper;
	

	/**
	 * 更新开店的状态   by sunyue
	 * @param member
	 * @param memberId
	 * @throws CoreServiceException
	 */
	public void updateStoreJoin(SyMember member,Integer memberId)throws CoreServiceException {
		if(!ObjectUtils.isEmpty(member) && member.getMemberType()==( LoginConstant.UserType.USER_C)) {
			SyStoreJoininExample ssje = new SyStoreJoininExample();
			ssje.createCriteria().andMemberIdEqualTo(memberId);
			SyStoreJoinin upd = new SyStoreJoinin();
			upd.setJoininState(StoreConstant.StoreStatus.STORE_JOIN_STATE_FINAL+"");;
			syStoreJoininMapper.updateByExampleSelective(upd, ssje);
		}
	}
	

}
