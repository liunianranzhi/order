package com.shanyuan.platform.ms.core.goods.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.goods.SySupportAreaService;
import com.shanyuan.platform.ms.dao.goods.entity.SySupportArea;
import com.shanyuan.platform.ms.dao.goods.entity.SySupportAreaExample;
import com.shanyuan.platform.ms.dao.goods.mapper.SySupportAreaMapper;

/**
 * 
 * @author yangjian
 * @date 2017/11/02
 *
 */
@Component
public class SySupportAreaServiceImpl implements SySupportAreaService {
	
	@Autowired
	private SySupportAreaMapper sySupportAreaMapper;

	@Override
	public List<SySupportArea> getProvince(String channel) throws CoreServiceException {
		List<SySupportArea> sySupportArea = this.sySupportAreaMapper.selectProvince(channel);
		return sySupportArea;
	}

	@Override
	public List<SySupportArea> getSupportAreaInfo(Map<String, Object> map) throws CoreServiceException {
		List<SySupportArea> sySupportArea = this.sySupportAreaMapper.selectSupportAreaInfo(map);
		return sySupportArea;
	}

	@Override
	public List<SySupportArea> getAllSupportArea() throws CoreServiceException {
		return this.sySupportAreaMapper.selectByExample(null);
	}

	@Override
	public SySupportArea getSupportAreaByCountryId(Long CountryId) {
		SySupportAreaExample example = new SySupportAreaExample();
		example.createCriteria().andAreaid3EqualTo(CountryId);
		List<SySupportArea> selectByExample = sySupportAreaMapper.selectByExample(example);
		if(!CollectionUtils.isEmpty(selectByExample)){
			return selectByExample.get(0);
		}
		return null;
	}

}
