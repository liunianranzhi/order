/**
 * 
 */
package com.shanyuan.platform.ms.core.goods.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shanyuan.platform.ms.core.goods.SyOrgActivityService;
import com.shanyuan.platform.ms.dao.goods.entity.SyOrgActivity;
import com.shanyuan.platform.ms.dao.goods.mapper.SyOrgActivityMapper;

/**
 * @author 曹勇军
 *
 */
@Component
public class SyOrgActivityServiceImpl implements SyOrgActivityService {

	@Autowired
	private SyOrgActivityMapper syOrgActivityMapper;
	@Override
	public List<SyOrgActivity> selectByGoodsId(Integer goodsId) {
		
		return syOrgActivityMapper.selectByGoodsId(goodsId);
		
	}

}
