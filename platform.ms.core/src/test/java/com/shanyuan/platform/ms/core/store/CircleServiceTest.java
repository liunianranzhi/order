package com.shanyuan.platform.ms.core.store;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.dao.user.entity.SyCircle;
/**
 * 
 * @author 冯志红
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class CircleServiceTest {

	@Autowired
	private CircleService circleService;
	
	@Test
	public void TestSelectByPrimaryKey() {
		SyCircle selectByPrimaryKey = circleService.selectByPrimaryKey(4);
		Assert.assertNotNull(selectByPrimaryKey);
	}
	
	@Test
	public void TestSelectByNameAndCode() {
		List<SyCircle> selectByNameAndCode = circleService.selectByNameAndCode("长乐支行第八党支部","boc");
		Assert.assertNotNull(selectByNameAndCode);
	}
	
	@Test
	public void TestSelectByCode() {
		SyCircle selectByCode = circleService.selectByCode("boc", 12234, "boc");
		Assert.assertNotNull(selectByCode);
	}
	
	@Test
	public void TestSelectByParentId() {
		List<SyCircle> selectByParentId = circleService.selectByParentId(12234);
		Assert.assertNotNull(selectByParentId);
	}
}
