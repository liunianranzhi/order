package com.shanyuan.platform.ms.facade.address;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.shanyuan.platform.ms.core.user.bo.AddressBo;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsClassInfo;
import com.shanyuan.platform.ms.facade.TestApplicationFacade;
import com.shanyuan.platform.ms.facade.goods.BizBuyFacade;

/**
 * 
 * @author 钟颖
 * @date 2017/11/17
 *
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = TestApplicationFacade.class)
public class AddressFacadeTest {

	
	@Autowired
	private AddressFacade addressFacade;
	@Autowired
	private BizBuyFacade bizBuyFacade;
	
	@Test
	public void getee(){
		 List<SyGoodsClassInfo> bizGoodsClass = bizBuyFacade.getBizGoodsClass();
		 System.out.println("========="+JSON.toJSONString(bizGoodsClass));
	}
	//@Test
	public void editAddress(){
		String type ="edit";
		Integer memberId =8474;
		Integer addressId =2002573;
		Long areaId =360926000000L;
		String	trueName ="wowoo";
		String	telPhone ="13718725963";
		String	address ="1243545";
		String	isDefault ="0";
		Map<String, Object> editAddress = addressFacade.editAddress(memberId, addressId, areaId, trueName, address, telPhone, type ,isDefault);
	System.out.println("======="+JSON.toJSONString(editAddress));
	}
	//@Test
	public void delOrSetAddress(){
		String type ="edit";
		Integer memberId =8474;
		Integer addressId =2002572;
		Long areaId =360924000000L;
		String	trueName ="HAHA";
		String	telPhone ="13718725963";
		String	address ="1243545";
		addressFacade.delAddress(memberId, addressId,"del");
	}
	
	//@Test
		public void delOrSetAddress2(){
			String type ="setDefult";
			Integer memberId =8474;
			Integer addressId =2002568;
			Long areaId =360924000000L;
			String	trueName ="HAHA";
			String	telPhone ="13718725963";
			String	address ="1243545";
			 addressFacade.delAddress(memberId, addressId,"del");
		}
	//@Test
	public void get(){
		List<AddressBo> addressList = addressFacade.getAddressList(8474);
		//CommonVO donationDetailList = orderFacade.getDonationDetailList(2224,null,null);
		 String jsonString = JSON.toJSONString(addressList);
		 System.out.println("==="+jsonString);
	  }
	
}
