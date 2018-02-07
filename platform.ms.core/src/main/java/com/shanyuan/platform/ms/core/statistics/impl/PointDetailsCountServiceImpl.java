package com.shanyuan.platform.ms.core.statistics.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.shanyuan.platform.ms.base.common.util.PointsUtils;
import com.shanyuan.platform.ms.core.statistics.PointDetailsCountService;
import com.shanyuan.platform.ms.dao.statistics.entity.PointDetailsCount;
import com.shanyuan.platform.ms.dao.statistics.entity.PointDetailsCountExample;
import com.shanyuan.platform.ms.dao.statistics.mapper.PointDetailsCountMapper;

@Component
public class PointDetailsCountServiceImpl implements PointDetailsCountService {
	
	@Autowired
	private PointDetailsCountMapper pointDetailsCountMapper;

	@Override
	public int batchInsert(List<PointDetailsCount> records) {
		return pointDetailsCountMapper.batchInsert(records);
	}

	@Override
	public List<PointDetailsCount> getDetailsByTime(Integer time, Integer unionId) {
		PointDetailsCountExample example = new PointDetailsCountExample();
		example.createCriteria().andCTimeEqualTo(time).andUnionIdEqualTo(unionId);
		List<PointDetailsCount> selectByExample = pointDetailsCountMapper.selectByExample(example);
		if(CollectionUtils.isEmpty(selectByExample)){
			
			example.clear();
			example.createCriteria().andUnionIdEqualTo(unionId);
			example.setOrderByClause("tag, c_time desc limit " + PointsUtils.getTags().size());
			example.setGroupByClause("tag");
			selectByExample = pointDetailsCountMapper.selectByExample(example);
		}
		return selectByExample;
	}

}
