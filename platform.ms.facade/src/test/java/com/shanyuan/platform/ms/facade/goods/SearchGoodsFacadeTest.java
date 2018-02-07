
/**
 * 
 */
package com.shanyuan.platform.ms.facade.goods;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.ms.facade.TestApplicationFacade;

/**
 * @author 曹勇军
 *
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = TestApplicationFacade.class)
public class SearchGoodsFacadeTest {
	
	@Autowired
	private SearchGoodsFacade searchGoodsFacade;
	
	@Test
	public void testSearchGoodsList(){
		
		Map<String,Object> resultData=null;
		
		//case1=游客查询时
		Integer memberId=26248; 
		Integer circleId=null; 
		String channel=null; 
		String searchQuery=null; 
		String sortOrder=null; 
		Long villageId=null; 
		Long townId=null; 
		Long areaId=null; 
		Long cityId=null; 
		Long provinceId=null; 
		Integer goodsType=null; 
		String goodsCert="wgh"; 
		String ownerType=null; 
		Integer pageNo=1;
		resultData=searchGoodsFacade.searchGoodsList(memberId, searchQuery, sortOrder, villageId, townId, areaId, cityId, provinceId, goodsType, goodsCert, ownerType, pageNo,null,null);
		
		/* case2=游客查询条件 是贫困户 有关键词 分类 排序时
		Integer memberId=null; 
		Integer circleId=null; 
		String channel=null; 
		String searchQuery="产"; 
		String sortOrder="price_asc"; 
//		110
//		110100000000
//		110101000000
//		110101001000
//		110101001001
		Long provinceId=610L; 
		Long cityId=null; 
		Long areaId=null; 
		Long townId=null; 
		Long villageId=null; 
		Integer goodsType=1174; 
		String goodsCert=null; //"绿色产品,有机产品"
		String ownerType="poor"; 
		String listType=null; 
		Integer pageNo=1;
		resultData=searchGoodsFacade.searchGoodsList(memberId, circleId, channel, searchQuery, sortOrder, villageId, townId, areaId, cityId, provinceId, goodsType, goodsCert, ownerType,  pageNo);
		*/
		
		/* case3=用户登录时	是贫困户 有关键词 分类 排序时
		Integer memberId=1; //96571抛出协议异常的代理人
		Integer circleId=null;
		String channel=null; 
		String searchQuery="产"; 
		String sortOrder="price_asc"; 
		Long provinceId=610L; 
		Long cityId=null; 
		Long areaId=null; 
		Long townId=null; 
		Long villageId=null; 
		Integer goodsType=1174; 
		String goodsCert=null; //"绿色产品,有机产品"
		String ownerType="poor"; 
		String listType=null; 
		Integer pageNo=1;
		resultData=searchGoodsFacade.searchGoodsList(memberId, circleId, channel, searchQuery, sortOrder, villageId, townId, areaId, cityId, provinceId, goodsType, goodsCert, ownerType,  pageNo);
*/
		
		
		//System.out.println(resultData);
		//Assert.assertNotNull(resultData);
	}
	
	
	//@Test
	public void testSearchSyGoodsList(){
		String searchQuery=null;
		String sortOrder=null;
		Integer goodsType=null;
		Integer pageNo=null;
		searchGoodsFacade.searchSyGoodsList(searchQuery, sortOrder, goodsType, pageNo);
	}
	
	@Test
	public void testSyGoodsTopList(){
		Map<String,Object> resultMap=searchGoodsFacade.syGoodsTopList();
		System.out.println(resultMap);
	}
	
	@Test
	public void testBizBuyGoodsList() {
		Map<String,Object> resultMap=searchGoodsFacade.searchBizGoodsList(null, null, null,null);
		System.out.println(resultMap);
	}
}
