package com.shanyuan.platform.ms.core.goods;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderGoods;
import com.shanyuan.platform.ms.dao.store.entity.SyEvaluateStore;

/**
 * 
 * @author 冯祚
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class EvaluateStoreTest {
	@Autowired
	private EvaluateStore evaluateStore;
	/**
	 * 获得店铺评价单条测试用例
	 */
	@Test
	public void getStoreEvaluateByOidTest() {
		Integer orderid = 5348;
		List<SyEvaluateStore> example = evaluateStore.getStoreEvaluateByOid(orderid);
		System.err.println(example);
	}
	/**
	 * 添加店铺评价测试用例
	 */
	@Test
	public void addStoreEvaluateTest() {
		int n = 0;
		SyEvaluateStore record = new SyEvaluateStore();
		n = evaluateStore.addStoreEvaluate(record);
		System.err.println(n);
	}
	/**
	 * 测试用例
	 */
	@Test
	public void insertStoreEvaluateTest() {
		int row = 0;
		SyOrderGoods syOrderGoods = new SyOrderGoods();
		syOrderGoods.setOrderId(4962);
		Integer orderId = 1;
		Integer memberId = 107232;
		String memberName = "张堃";
		Integer servicescores = 5;
		Integer deliveryscores = 2;
		row = evaluateStore.insertStoreEvaluate(syOrderGoods, orderId, memberId, memberName, servicescores, deliveryscores);
		System.err.println(row);
	}
}
