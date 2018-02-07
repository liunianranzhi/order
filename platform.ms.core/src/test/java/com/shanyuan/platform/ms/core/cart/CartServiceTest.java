/**
 * 
 */
package com.shanyuan.platform.ms.core.cart;

import java.util.Iterator;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.core.cart.bo.CartGoodsBo;
import com.shanyuan.platform.ms.core.cart.bo.SyCartBO;

/**
 * @author 曹勇军
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class CartServiceTest {
	
	@Autowired
	private CartService cartService;
	
	
//	@Test
	public void testDeletCartById(){
		Integer cartId=1951;
		Integer buyerId=38;
		SyCartBO deleteCartById = cartService.deleteCartById(cartId, buyerId);
		Assert.assertNotNull(deleteCartById);
		
		System.out.println(deleteCartById+"   ");
		
	}
	@Test
	public void getCartBo(){
		 CartGoodsBo checkGoods = cartService.checkGoods(559857, 978165, 1, null);
		Assert.assertNotNull(checkGoods);
		
		System.out.println("========"+checkGoods);
		
	}
	
	
//	@Test
	public void getGoodsNumByMember() {
		
		Map<Integer, Integer> mem = this.cartService.getGoodsNumByMember(21272, (byte)1);
		
		for (Iterator iterator = mem.keySet().iterator(); iterator.hasNext();) {
			
			Integer goodsId = (Integer)iterator.next();
			
			System.err.println("goodsId:   " + goodsId + "======" + "goodsNum:   " + mem.get(goodsId));
			
		}
	}
	
}
