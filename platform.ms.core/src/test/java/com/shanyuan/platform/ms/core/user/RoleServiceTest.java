package com.shanyuan.platform.ms.core.user;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.dao.user.entity.SyRole;
/**
 * 
 * @author 冯志红
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=TestApplicationCore.class)
public class RoleServiceTest {

	@Autowired
	private RoleService roleService;
	@Test
	public void TestGetSyRoleByMemberIdAndType() {
		List<SyRole> list = roleService.getSyRoleByMemberIdAndType(50075,(byte)1,(byte)3);
		Assert.assertNotNull(list);
	}
}
