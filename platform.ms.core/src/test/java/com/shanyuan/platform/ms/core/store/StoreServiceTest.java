package com.shanyuan.platform.ms.core.store;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.store.bo.AlbumClassBo;
import com.shanyuan.platform.ms.core.store.bo.StoreBo;
import com.shanyuan.platform.ms.dao.store.entity.SyStore;
import com.shanyuan.platform.ms.dao.store.entity.SyStoreExample;
import com.shanyuan.platform.ms.dao.store.entity.SyStoreJoinin;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class StoreServiceTest {

	@Autowired
	private SyStoreService  syStoreService;
	
	//@Test
	public void getStoreInfo () {
		SyStoreExample sse = new SyStoreExample();
		sse.createCriteria().andStoreIdEqualTo(107);
		Integer  storeId=107;
		StoreBo getStore = syStoreService.getStoreInfo(storeId);
		System.err.println(JSON.toJSONString(getStore));
	}
	
	//@Test
	public void createSeller() {
		SyStoreJoinin ssj = new SyStoreJoinin();
		ssj.setSellerName("孙");
		ssj.setMemberId(1230);
		SyStore ss = new SyStore();
		ss.setStoreId(1209);
		int n = syStoreService.createSeller(ssj, ss);
		System.err.println(n);
	}
	
	public void createAlbum() {
		AlbumClassBo ac = new AlbumClassBo();
		ac.setAclassDes("");
		ac.setAclassCover("");
		ac.setAclassSort(255);
		ac.setIsDefault((byte)1);
		System.err.println(ac.getAclassSort());
		try {
			syStoreService.createAlbum(1002);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 创建店铺
	 */
	@Test
	public void createStore() {
		try {
			syStoreService.createStore(1761016666, "测试", "测");;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
