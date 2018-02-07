package com.shanyuan.platform.ms.core.store.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.store.SyAreaFullService;
import com.shanyuan.platform.ms.dao.store.entity.SyAreaFull;
import com.shanyuan.platform.ms.dao.store.entity.SyAreaFullExample;
import com.shanyuan.platform.ms.dao.store.mapper.SyAreaFullMapper;

/**
 * @author 曹勇军
 *
 */
@Component
public class SyAreaFullServiceImpl implements SyAreaFullService {

	@Autowired
	private SyAreaFullMapper syAreaFullMapper;
	
	@Override
	public SyAreaFull getSyAreaFullById(Long areaId) {
		return syAreaFullMapper.selectByPrimaryKey(areaId);
	}

	/**
	 * 获取所有省份
	 * @author yangjian 
	 * @return
	 */
	@Override
	public List<SyAreaFull> getProvinceList() throws CoreServiceException {
		SyAreaFullExample syAreaFullExample = new SyAreaFullExample();
		syAreaFullExample.createCriteria().andAreaDeepEqualTo((byte) 1);
		List<SyAreaFull> provinceList = this.syAreaFullMapper.selectByExample(syAreaFullExample);
		return provinceList;
	}

	/**
	 * 根据父id查询列表
	 * @author yangjian
	 * @param parentId
	 * @return
	 * @throws CoreServiceException
	 */
	@Override
	public List<SyAreaFull> getSyAreaFullByParentId(Long parentId) throws CoreServiceException {
		SyAreaFullExample syAreaFullExample = new SyAreaFullExample();
		syAreaFullExample.createCriteria().andAreaParentIdEqualTo(parentId);
		syAreaFullExample.setOrderByClause("area_sort DESC");
		List<SyAreaFull> provinceList = this.syAreaFullMapper.selectByExample(syAreaFullExample);
		return provinceList;
	}

}
