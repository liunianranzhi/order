package com.shanyuan.platform.ms.core.goods.impl;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.core.goods.ConditionService;
import com.shanyuan.platform.ms.core.goods.bo.AreaBo;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleArea;

/**
 * 
 * 
 * @author 冯志红
 *
 */

@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = TestApplicationCore.class)
public class ConditionServiceImplTest {

	@Autowired
	private ConditionService conditionService;
	
	@Test
	public void testGetQueryConditionForMember() {
		/**
		 * 测试circleId
		 */
		//List<Long> queryConditionForMember = conditionService.getQueryConditionForMember(11, null);
		/**
		 * 测试channel
		 */
		List<Long> queryConditionForMember1 = conditionService.getQueryConditionForMember(null, "传统捐书");
		Assert.assertNotNull(queryConditionForMember1);
	}
	
	@Test
	public void testGetAreaid() {
		SyCircleArea areaid = conditionService.getAreaid(7751);
		Assert.assertNotNull(areaid);
	}
	
	@Test
	public void testGetSpecialtyStoresByUnionChannel() {
		String channel = "liaoning";
		List<AreaBo> specialtyStoresByUnionChannel = conditionService.getSpecialtyStoresByUnionChannel(channel);
		System.err.println(specialtyStoresByUnionChannel);
	}
}
