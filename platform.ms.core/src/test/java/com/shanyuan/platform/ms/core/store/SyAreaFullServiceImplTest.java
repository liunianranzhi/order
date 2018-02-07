package com.shanyuan.platform.ms.core.store;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.dao.store.entity.SyAreaFull;
/**
 * 
 * @author 冯志红
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class SyAreaFullServiceImplTest {

	@Autowired
	private SyAreaFullService areaFullService;
	
	@Test
	public void TestGetSyAreaFullById() {
		SyAreaFull syAreaFullById = areaFullService.getSyAreaFullById((long)110);
		Assert.assertNotNull(syAreaFullById);
	}
	
	@Test
	public void TestGetProvinceList() {
		List<SyAreaFull> syAreaFullByParentId = areaFullService.getSyAreaFullByParentId((long)0);
		Assert.assertNotNull(syAreaFullByParentId);
	}
	
	@Test
	public void TestGetSyAreaFullByParentId() {
		List<SyAreaFull> syAreaFullByParentId = areaFullService.getSyAreaFullByParentId((long)0);
		Assert.assertNotNull(syAreaFullByParentId);
	}
}
