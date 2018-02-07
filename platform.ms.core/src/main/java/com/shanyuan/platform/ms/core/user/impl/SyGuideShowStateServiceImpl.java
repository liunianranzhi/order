package com.shanyuan.platform.ms.core.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.IndexConstant;
import com.shanyuan.platform.ms.core.user.SyGuideShowStateService;
import com.shanyuan.platform.ms.dao.user.entity.SyGuideShowState;
import com.shanyuan.platform.ms.dao.user.entity.SyGuideShowStateExample;
import com.shanyuan.platform.ms.dao.user.mapper.SyGuideShowStateMapper;

@Component
public class SyGuideShowStateServiceImpl implements SyGuideShowStateService {
	
	@Autowired
	private SyGuideShowStateMapper syGuideShowStateMapper;

	@Override
	public SyGuideShowState getGuideShowStateByMember(Integer memberId) throws CoreServiceException {
		SyGuideShowStateExample guideShowStateExample = new SyGuideShowStateExample();
		guideShowStateExample.createCriteria().andMemberIdEqualTo(memberId);
		List<SyGuideShowState> selectByExample = this.syGuideShowStateMapper.selectByExample(guideShowStateExample);
		if(!CollectionUtils.isEmpty(selectByExample)){
			return selectByExample.get(0);
		}
		return null;
	}

	@Override
	public boolean updateAgreement(Integer recId, byte agreement) throws CoreServiceException {
		SyGuideShowState info = this.syGuideShowStateMapper.selectByPrimaryKey(recId);
		info.setUserAgreement(agreement);
		boolean result = this.syGuideShowStateMapper.updateByPrimaryKey(info) == 1 ? true : false;
		return result;
	}

}
