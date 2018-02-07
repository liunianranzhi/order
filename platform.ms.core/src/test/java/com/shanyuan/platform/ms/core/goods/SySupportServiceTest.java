package com.shanyuan.platform.ms.core.goods;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.dao.goods.entity.SySupportArea;

/**
 * 
 * @author yangjian
 * @date 2017/11/02
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class SySupportServiceTest {
	
	@Autowired
	private SySupportAreaService sySupportAreaService;
	
	@Test
	public void areaTest(){
		List<SySupportArea> sySupportArea = this.sySupportAreaService.getProvince("boc");
		System.out.println(sySupportArea.toString());
	}

}
