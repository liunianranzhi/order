package com.shanyuan.platform.ms.dao.user;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationDao;
import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderGoods;
import com.shanyuan.platform.ms.dao.order.mapper.SyOrderGoodsMapper;
import com.shanyuan.platform.ms.dao.order.mapper.SyVoucherMapper;
import com.shanyuan.platform.ms.dao.user.entity.SyVoucher;

/**
 * @author 曹勇军
 *
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = TestApplicationDao.class)  
public class TestSyVoucherMapper {
	@Autowired
	private SyVoucherMapper syVoucherMapper;
	@Autowired
	private SyOrderGoodsMapper syOrderGoodsMapper;
	//selectRefundCount
	@Test
	public void testorderMapper() {
		Integer memberId=559857;
		List<Integer> list=new ArrayList<Integer>();
		list.add(1231);
		list.add(1111);
		List<SyOrderGoods> selectRefundCount = syOrderGoodsMapper.selectOrderGoodsByGIds(12313,list);
		System.out.println("wwwww:"+selectRefundCount);
	}
	
	//@Test
	public void testMemberMapper() {
		
		Integer currDts=DateUtil.getNowInt();
		Integer voucherOwnerId=2129;
		
		SyVoucher record=new SyVoucher();
		record.setVoucherOwnerId(voucherOwnerId);
		record.setVoucherState((byte)1);//可用的
		record.setVoucherStartDate(currDts);
		record.setVoucherEndDate(currDts);
		
		List<SyVoucher> list=syVoucherMapper.selectByParam(record);
		
		Assert.assertNotNull(list);
		System.out.println("==============="+list.size());
		
	}
	
	
}