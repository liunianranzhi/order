package com.shanyuan.platform.ms.core.project.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.core.project.ProjectService;
import com.shanyuan.platform.ms.dao.goods.entity.SyOrgActivity;
import com.shanyuan.platform.ms.dao.project.entity.SyBazaarOrderExample;
import com.shanyuan.platform.ms.dao.project.entity.SyProject;
import com.shanyuan.platform.ms.dao.project.entity.SyProjectExample;
import com.shanyuan.platform.ms.dao.project.entity.SyProjectMoneyOrderExample;
import com.shanyuan.platform.ms.dao.project.mapper.SyBazaarOrderMapper;
import com.shanyuan.platform.ms.dao.project.mapper.SyProjectMapper;
import com.shanyuan.platform.ms.dao.project.mapper.SyProjectMoneyMapper;
import com.shanyuan.platform.ms.dao.project.mapper.SyProjectMoneyOrderMapper;

/**
 * @author 曹勇军
 *
 */
@Component
public class ProjectServiceIml implements ProjectService {

	@Autowired
	private SyProjectMapper syProjectMapper;
	
	@Autowired
	private SyBazaarOrderMapper syBazaarOrderMapper;

	@Autowired
	private SyProjectMoneyOrderMapper syProjectMoneyOrderMapper;
	
	@Autowired
	private SyProjectMoneyMapper syProjectMoneyMapper;
	
	public SyProject selectProjectAndStoreByPrimaryKey(Integer projId) {
		return syProjectMapper.selectProjectAndStoreByPrimaryKey(projId);
	}
	
	@Override
	public Integer getBazaarOrderCount(Integer memberId, String orderStateSuccess) {
	
		SyBazaarOrderExample bazaarOrderExample = new SyBazaarOrderExample();
		bazaarOrderExample.createCriteria().andBuyerIdEqualTo(memberId).andOrderStateEqualTo(orderStateSuccess);
		
		return syBazaarOrderMapper.countByExample(bazaarOrderExample);
	}
	
	@Override
	public Integer getJuanKuanProjectOrderCount(Integer memberId, String orderStateSuccess) {
		
		SyProjectMoneyOrderExample moneyOrderExample = new SyProjectMoneyOrderExample();
		moneyOrderExample.createCriteria().andBuyerIdEqualTo(memberId).andOrderStateEqualTo(orderStateSuccess);
		
		return syProjectMoneyOrderMapper.countByExample(moneyOrderExample);
	}
	
	
	@Override
	public Integer getBazaarOrderSumMoney() {
		
		Double bosm = syBazaarOrderMapper.selectBazaarOrderSumMoney();
		if (ObjectUtils.isEmpty(bosm)) {
			return 0;
		}else {
			return bosm.intValue();
		}
	}
	
	@Override
	public Integer getJuanKuanOrderSumMoney() {
		Double jkosm = syProjectMoneyMapper.selectJuanKuanOrderSumMoney();
		if (ObjectUtils.isEmpty(jkosm)) {
			return 0;
		}else {
			return jkosm.intValue();
		}
	}

	@Override
	public List<SyProject> selectByActivityIds(List<SyOrgActivity> list) {
		
		SyProjectExample example=new SyProjectExample();
		if(!ObjectUtils.isEmpty(list)){
			List<Integer> ids=new ArrayList<Integer>();
			for(SyOrgActivity a:list){
				ids.add(a.getActivityId());
			}
			example.createCriteria().andActivityIdIn(ids);
		}
		
		return syProjectMapper.selectByExample(example);
	}
}
