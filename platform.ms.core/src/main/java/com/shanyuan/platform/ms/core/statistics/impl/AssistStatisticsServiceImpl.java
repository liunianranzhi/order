package com.shanyuan.platform.ms.core.statistics.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.shanyuan.platform.ms.core.constant.StatisticsConstant;
import com.shanyuan.platform.ms.core.statistics.AssistStatisticsService;
import com.shanyuan.platform.ms.dao.statistics.entity.AssistStatisticsBaseData;
import com.shanyuan.platform.ms.dao.statistics.entity.AssistStatisticsBaseDataExample;
import com.shanyuan.platform.ms.dao.statistics.mapper.AssistStatisticsBaseDataMapper;

/**
 * 
 * @author yangjian
 * @date 2018/01/08
 *
 */
@Component
public class AssistStatisticsServiceImpl implements AssistStatisticsService {
	
	@Autowired
	private AssistStatisticsBaseDataMapper assistStatisticsBaseDataMapper;

	@Override
	public void batchInsert(List<AssistStatisticsBaseData> records) {
		assistStatisticsBaseDataMapper.batchInsert(records);
	}
	
	@Override
	public Page<AssistStatisticsBaseData> getAssistData(Integer time, Integer unionId, Integer pageNum) {
		AssistStatisticsBaseDataExample example = new AssistStatisticsBaseDataExample();
		if(!ObjectUtils.isEmpty(unionId)) {
			example.createCriteria().andCTimeEqualTo(time).andUnionIdEqualTo(unionId);
		}else {
			example.createCriteria().andCTimeEqualTo(time);
		}
		Page<AssistStatisticsBaseData> startPage;
		if(!ObjectUtils.isEmpty(pageNum)){
			startPage = PageHelper.startPage(pageNum, StatisticsConstant.currentPage.CURRENT_PAGE);
			assistStatisticsBaseDataMapper.selectByExample(example);
		}else{
			int count = assistStatisticsBaseDataMapper.countByExample(example);
			startPage = PageHelper.startPage(1, count);
			assistStatisticsBaseDataMapper.selectByExample(example);
		}
		return startPage;
	}

}
