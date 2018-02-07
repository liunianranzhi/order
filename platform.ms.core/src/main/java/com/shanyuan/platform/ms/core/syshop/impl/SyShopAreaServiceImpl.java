package com.shanyuan.platform.ms.core.syshop.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shanyuan.platform.ms.core.syshop.SyShopAreaService;
import com.shanyuan.platform.ms.dao.syshop.entity.SyshopArea;
import com.shanyuan.platform.ms.dao.syshop.entity.SyshopAreaExample;
import com.shanyuan.platform.ms.dao.syshop.mapper.SyshopAreaMapper;

/**
 * 
 * @author yangjian
 * @date 2017/12/08
 *
 */
@Component
public class SyShopAreaServiceImpl implements SyShopAreaService {

	@Autowired
	private SyshopAreaMapper syShopAreaMapper;
	
	@Override
	public List<SyshopArea> getShopAreaList() {
		SyshopAreaExample syshopAreaExample = new SyshopAreaExample();
		syshopAreaExample.createCriteria().andAreaStateEqualTo((byte) 1).andAreaSortGreaterThan(0);
		syshopAreaExample.setOrderByClause("area_sort asc");
		List<SyshopArea> list = this.syShopAreaMapper.selectByExample(syshopAreaExample);
		return list;
	}

}
