package com.shanyuan.platform.ms.core.order;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.core.order.bo.DisOrderGoodsInfo;
/**
 * 计算费率接口测试
 * @author 冯祚
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class CalculateFeeServiceTest {
	@Autowired
	private CalculateFeeService calculateFeeService;
	/**
	 * 获得服务费测试
	 * @return 
	 */
	@Test
	public void getServiceFeeRateTest() {
		Integer goodsProjectType = 200;
		Integer member_id = 40;
		String channel = "";
		Integer assistId = 50;
		BigDecimal bigDecimal = calculateFeeService.getServiceFeeRate(goodsProjectType, member_id, channel, assistId);
		System.out.println("服务费：" + bigDecimal + "元");
	}
	/**
	 * 预提交的费用测试
	 */
	@Test
	public void getPreSumbitOrderMoneyTest() {
		Integer goodsProjectType = 200;
		Integer member_id = 40;
		String channel = "";
		Integer assistId = 50;
		BigDecimal bigDecimal = calculateFeeService.getServiceFeeRate(goodsProjectType, member_id, channel, assistId);
		DisOrderGoodsInfo disOrderGoodsInfo = new DisOrderGoodsInfo();
		System.out.println();
		calculateFeeService.getPreSumbitOrderMoney(disOrderGoodsInfo);
	}
	/**
	 * 计算公益 基金比例测试
	 */
	@Test
	public void getFundFeeRateTest() {
		Integer goodsProjectType = 300;
		Integer publisherId = 50;
		String channel = "";
		Integer assistId = 0;
		String ownerType = "";
		BigDecimal bigDecimal = calculateFeeService.getFundFeeRate(goodsProjectType, publisherId, channel, assistId, ownerType);
		System.out.println(bigDecimal);
	}
	
}
