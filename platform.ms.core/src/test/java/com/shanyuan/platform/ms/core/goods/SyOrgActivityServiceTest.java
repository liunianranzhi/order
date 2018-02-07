package com.shanyuan.platform.ms.core.goods;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.dao.goods.entity.SyOrgActivity;
/**
 * 
 * @author 冯祚
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class SyOrgActivityServiceTest {
	@Autowired
	private SyOrgActivityService syOrgActivityService;
	@Test
	public void selectByGoodsIdTest() {
		
		//case1:不传参数
	//	List<SyOrgActivity> list = syOrgActivityService.selectByGoodsId(null);
		
		//case2：传递参数
		List<SyOrgActivity> list = syOrgActivityService.selectByGoodsId(100288);
		
		System.err.println(list.get(0));
	}
	
}
