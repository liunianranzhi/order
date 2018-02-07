package com.shanyuan.platform.ms.facade.cart;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aliyun.openservices.shade.com.alibaba.fastjson.JSON;
import com.shanyuan.platform.ms.facade.TestApplicationFacade;

/**
 * 
 * @author 钟颖
 * @date 2017/11/17
 *
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = TestApplicationFacade.class)
public class CartFacadeTest {

	
	@Autowired
	private CartFacade cartFacade;
	
	
	///@Test
	public void cartList(){
		
		 Map<String, Object> cartListByMid = cartFacade.cartListByMid(8474, null, null);
	System.out.println("1 ======="+JSON.toJSONString(cartListByMid));
	}
	@Test
	public void addCart(){
		
		Map<String, Object>  addCart= cartFacade.addNewCart(8474,106255,3);
	System.out.println("2 ======="+JSON.toJSONString(addCart));
	}
	//@Test
	public void delCart(){
		
		Map<String, Object>  delCart= cartFacade.delCart(8474,34730);
	System.out.println("3 ======="+JSON.toJSONString(delCart));
	}
	@Test
	public void editCart(){
		Map<String, Object> updateCart = cartFacade.updateCart(8474, 34788, 0, "0");
	System.out.println("3 ======="+JSON.toJSONString(updateCart));
	}
	
}
