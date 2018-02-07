package com.shanyuan.platform.ms.core.goods;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.core.goods.bo.AreaBo;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleArea;

/**
 * 
 * @author 冯祚
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class ConditionServiceTest {
	@Autowired
	private ConditionService conditionService;
	/**
	 * 获取用户角色的查询条件测试用例
	 */
	@Test
	public void getQueryConditionForMemberTest() {
		Integer circleId = null;
		String channel = null;
		List<Long> areaIds = conditionService.getQueryConditionForMember(circleId, channel);
		Assert.assertNotNull(areaIds);
		System.err.println(areaIds);
	}
	/**
	 * 获取通过渠道id获取联盟特产馆列表 测试用例
	 */
	@Test
	public void getSpecialtyStoresByUnionChannelTest() {
		String channel = "gd";
		List<AreaBo> result = conditionService.getSpecialtyStoresByUnionChannel(channel);
		System.err.println(result);
	}
	/**
	 * 获取县的测试用例
	 */
	@Test
	public void getAreaidTest() {
		Integer circleId = 7758;
		SyCircleArea scae = conditionService.getAreaid(circleId);
		System.err.println(scae);
	}
}
