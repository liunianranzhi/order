package com.shanyuan.platform.ms.core.user.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.base.common.util.StatisticsUtils;
import com.shanyuan.platform.ms.core.user.SyPoorService;
import com.shanyuan.platform.ms.dao.user.entity.SyPoor;
import com.shanyuan.platform.ms.dao.user.entity.SyPoorExample;
import com.shanyuan.platform.ms.dao.user.mapper.SyPoorMapper;

/**
 * @author 曹勇军
 *
 */
@Component
public class SyPoorServiceImpl implements SyPoorService {
	
	@Autowired
	private SyPoorMapper syPoorMapper;

	@Override
	public SyPoor getSyPoorByMemberId(Integer memberId) {
		SyPoorExample example=new SyPoorExample();
		example.createCriteria().andMemberIdEqualTo(memberId);
		List<SyPoor> list=syPoorMapper.selectByExample(example);
		if(ObjectUtils.isEmpty(list)){
			return null;
		}else{
			return list.get(0);
		}
	}

	@Override
	public Integer getSelfEmpPoorTotalFamily(Long countryId) {
		SyPoorExample example = new SyPoorExample();
		Integer count = 0;
		example.createCriteria().andAreaid3EqualTo(countryId);
		List<SyPoor> list = syPoorMapper.selectByExample(example);
		for (SyPoor syPoor : list) {
			if(StatisticsUtils.getStatisticsUtils().getMemberHasGoods().contains(syPoor.getMemberId())){
				count ++;
			}
		}
		return count;
	}

	@Override
	public Integer getPoorTotalPeopleNum(Long countryId) {
		Integer result = 0;
		SyPoorExample example = new SyPoorExample();
		example.createCriteria().andAreaid3EqualTo(countryId);
		List<SyPoor> selectByExample = syPoorMapper.selectByExample(example);
		for (SyPoor syPoor : selectByExample) {
			result += (int) syPoor.getFamilyMemberNum();
		}
		return result;
	}

	@Override
	public Integer getPoorTotalCount(Long countryId) {
		SyPoorExample example = new SyPoorExample();
		example.createCriteria().andAreaid3EqualTo(countryId);
		Integer countByExample = syPoorMapper.countByExample(example);
		return countByExample;
	}

}
