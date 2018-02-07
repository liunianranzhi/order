package com.shanyuan.platform.ms.dao.goods;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.Maps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationDao;
import com.shanyuan.platform.ms.dao.goods.entity.OpenGoods;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoods;
import com.shanyuan.platform.ms.dao.goods.mapper.SyGoodsCommonMapper;

/**
 * 
 * @author caoyongjun
 *
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = TestApplicationDao.class)  
public class TestSyGoodsCommon {

	@Autowired
	SyGoodsCommonMapper syGoodsCommonMapper;
	
	@Test
	public void testSelectOpenGoodsByBatch(){
		Map<String,Object> map= Maps.newHashMap();
		map.put("goodsCommonid", 967429);
		List<OpenGoods> openGoodsList=syGoodsCommonMapper.selectOpenGoodsByBatch(map);
		for(OpenGoods goods:openGoodsList){
			List<SyGoods> goodsList=goods.getSyGoodsList();
			System.out.println(" storage:"+goodsList.get(0).getGoodsStorage()+" discountRate:"+goodsList.get(0).getDiscountRate());
			List<String> certTypeList=goods.getGoodsCertTypes();
			for(String cert:certTypeList){
				System.out.println(" cert:"+cert);
			}
		}
		
	}
}
