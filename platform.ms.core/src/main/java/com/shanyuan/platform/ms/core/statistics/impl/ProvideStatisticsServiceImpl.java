package com.shanyuan.platform.ms.core.statistics.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.shanyuan.platform.ms.core.constant.StatisticsConstant;
import com.shanyuan.platform.ms.core.statistics.ProvideStatisticsService;
import com.shanyuan.platform.ms.dao.statistics.entity.ProvideStatisticsBaseData;
import com.shanyuan.platform.ms.dao.statistics.entity.ProvideStatisticsBaseDataExample;
import com.shanyuan.platform.ms.dao.statistics.entity.ProvideStatisticsBaseDataExample.Criteria;
import com.shanyuan.platform.ms.dao.statistics.mapper.ProvideStatisticsBaseDataMapper;

@Component
public class ProvideStatisticsServiceImpl implements ProvideStatisticsService {
	
	@Autowired
	private ProvideStatisticsBaseDataMapper provideStatisticsBaseDataMapper;
	
	@Override
	public void batchInsert(List<ProvideStatisticsBaseData> datas) {
		provideStatisticsBaseDataMapper.batchInsert(datas);
	}

	@Override
	public Page<ProvideStatisticsBaseData> getList(Integer cTime, Long countryId, List<Long> countryIds,Integer pageNum) {
		ProvideStatisticsBaseDataExample baseDataExample = new ProvideStatisticsBaseDataExample();
		Criteria createCriteria = baseDataExample.createCriteria();
		createCriteria.andCTimeEqualTo(cTime);
		if(!ObjectUtils.isEmpty(countryId)) {
			createCriteria.andCountryIdEqualTo(countryId);
		}
		if(!CollectionUtils.isEmpty(countryIds)) {
			createCriteria.andCountryIdIn(countryIds);
		}
		Page<ProvideStatisticsBaseData> startPage;
		if(!ObjectUtils.isEmpty(pageNum)){
			startPage = PageHelper.startPage(pageNum, StatisticsConstant.currentPage.CURRENT_PAGE);
			provideStatisticsBaseDataMapper.selectByExample(baseDataExample);
		}else{
			int countByExample = provideStatisticsBaseDataMapper.countByExample(baseDataExample);
			startPage = PageHelper.startPage(1, countByExample);
			provideStatisticsBaseDataMapper.selectByExample(baseDataExample);
		}
		return startPage;
	}

}
