package com.shanyuan.platform.ms.core.syshop;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.dao.syshop.entity.SyCompanyInfo;
import com.shanyuan.platform.ms.dao.syshop.entity.SyshopArea;
import com.shanyuan.platform.ms.dao.user.entity.SyShopAccount;
/**
 * 
 * @author 冯志红
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class SyShopServiceTest {

	@Autowired
	private SyShopService service;
	
	@Test
	public void TestGetShopAreaList() {
		List<SyshopArea> shopAreaList = service.getShopAreaList();
		Assert.assertNotNull(shopAreaList);
	}
	
	@Test
	public void TestGetShopAccountList() {
		List<SyShopAccount> shopAccountList = service.getShopAccountList();
		Assert.assertNotNull(shopAccountList);
	}
	
	@Test
	public void TestGetSyCompanyInfo() {
		List<SyCompanyInfo> syCompanyInfo = service.getSyCompanyInfo();
		Assert.assertNotNull(syCompanyInfo);
	}
}
