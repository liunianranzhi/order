package com.shanyuan.platform.ms.core.goods;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class SearchGoodsServiceTest {

    @Autowired
    private SearchGoodsService searchGoodsService;

    @Test
    public void testSearchSyGoodsList() {
        //case1:测试查询语句
		/*
		String searchQuery = "苹果";
		String sortOrder = null;
		Integer gcId = null;
		Integer pageNo = null;
		Integer pageSize = null;
		Integer publisherId = null;
		*/
        //case2:测试字段排序结果
		/*
		String searchQuery = null;
		String sortOrder = "goods_selltime";
		Integer gcId = null;
		Integer pageNo = null;
		Integer pageSize = null;
		Integer publisherId = null;
		*/

        //case3:测试商品分类ID
		/*
		String searchQuery = null;
		String sortOrder = null;
		Integer gcId = 2;
		Integer pageNo = null;
		Integer pageSize = null;
		Integer publisherId = null;
		*/
        //case4:测试分页
		/*
		String searchQuery = null;
		String sortOrder = null;
		Integer gcId = null;
		Integer pageNo = 10;
		Integer pageSize = 25;
		Integer publisherId = null;
		*/

        //case5:测试发布者ID
        String searchQuery = null;
        String sortOrder = null;
        Integer gcId = null;
        Integer pageNo = null;
        Integer pageSize = null;
        Integer publisherId = 34;
        Map<String, Object> searchSyGoodsList = searchGoodsService.searchSyGoodsList(searchQuery, sortOrder, gcId, pageNo, pageSize, publisherId);
        Assert.assertNotNull(searchSyGoodsList);




    }

    @Test
    public void testSearchGoodsList() {

        //case1 有关键词的时候
		/*
		String searchQuery="苹果";
		List<Integer> goodsProjectTypeList=null;
		Integer areaDeep=null;
		Long addressId=null;
		List<String> goodsCertList=null;
		String ownerType=null;
		List<String> goodsTypeList=null;
		Integer assistId=null;
		String sortOrder=null;
		Integer gcId=null;
		List<Long> supportCountyIdList=null;
		Integer pageNo=null;
		 */

        //case2 查询有分页时
		/*
		String searchQuery=null;
		List<Integer> goodsProjectTypeList=null;
		Integer areaDeep=null;
		Long addressId=null;
		List<String> goodsCertList=null;
		String ownerType=null;
		List<String> goodsTypeList=null;
		Integer assistId=null;
		String sortOrder=null;
		Integer gcId=null;
		List<Long> supportCountyIdList=null;
		Integer pageNo=25;
		 */

        //case3  测试项目类型
		/*
				String searchQuery=null;
				List<Integer> goodsProjectTypeList=new ArrayList<>();
				goodsProjectTypeList.add(1);
				goodsProjectTypeList.add(2);
				goodsProjectTypeList.add(3);
				goodsProjectTypeList.add(4);
				goodsProjectTypeList.add(5);
				goodsProjectTypeList.add(6);
				goodsProjectTypeList.add(7);
				Integer areaDeep=null;
				Long addressId=null;
				List<String> goodsCertList=null;
				String ownerType=null;
				List<String> goodsTypeList=null;
				Integer assistId=null;
				String sortOrder=null;
				Integer gcId=null;
				List<Long> supportCountyIdList=null;
				Integer pageNo=null;
		 */
        //case 4: 测试地区
		/*
		String searchQuery=null;
		List<Integer> goodsProjectTypeList = null;
//		Integer areaDeep=1;
		Integer areaDeep=2;
//		Integer areaDeep=3;
//		Integer areaDeep=4;
//		Integer areaDeep=5;
		Long addressId=null;
		List<String> goodsCertList=null;
		String ownerType=null;
		List<String> goodsTypeList=null;
		Integer assistId=null;
		String sortOrder=null;
		Integer gcId=null;
		List<Long> supportCountyIdList=null;
		Integer pageNo=null;
		 */

        //case5:测试产品认证
		/*
		String searchQuery=null;
		List<Integer> goodsProjectTypeList=null;
		Integer areaDeep=null;
		Long addressId=null;
		List<String> goodsCertList=null;
		String ownerType=null;
		List<String> goodsTypeList=null;
		Integer assistId=null;
		String sortOrder=null;
		Integer gcId=null;
		List<Long> supportCountyIdList=null;
		Integer pageNo=null;
		 */

        //case6:测试产品所有者类型
		/*
		String searchQuery=null;
		List<Integer> goodsProjectTypeList=null;
		Integer areaDeep=null;
		Long addressId=null;
		List<String> goodsCertList=null;
//		String ownerType="all";
//		String ownerType="agent";
		String ownerType="poor";
		List<String> goodsTypeList=null;
		Integer assistId=null;
		String sortOrder=null;
		Integer gcId=null;
		List<Long> supportCountyIdList=null;
		Integer pageNo=null;
		 */
        //case7:测试产品类型
		/*
		String searchQuery=null;
		List<Integer> goodsProjectTypeList=null;
		Integer areaDeep=null;
		Long addressId=null;
		List<String> goodsCertList=null;
		String ownerType=null;
		List<String> goodsTypeList=new ArrayList<>();
		goodsTypeList.add("bizbuy");
		goodsTypeList.add("self_goods");
		goodsTypeList.add("replace_goods");
		Integer assistId=null;
		String sortOrder=null;
		Integer gcId=null;
		List<Long> supportCountyIdList=null;
		Integer pageNo=null;
		 */
        //case7:测试主理人ID
		/*
				String searchQuery=null;
				List<Integer> goodsProjectTypeList=null;
				Integer areaDeep=null;
				Long addressId=null;
				List<String> goodsCertList=null;
				String ownerType=null;
				List<String> goodsTypeList=null;
				Integer assistId=1;
				String sortOrder=null;
				Integer gcId=null;
				List<Long> supportCountyIdList=null;
				Integer pageNo=null;
		 */
        //case7:测试字段排序的结果
		/*
				String searchQuery=null;
				List<Integer> goodsProjectTypeList=null;
				Integer areaDeep=null;
				Long addressId=null;
				List<String> goodsCertList=null;
				String ownerType=null;
				List<String> goodsTypeList=null;
				Integer assistId=1;
				String sortOrder="goods_price";
				Integer gcId=null;
				List<Long> supportCountyIdList=null;
				Integer pageNo=null;
		 */
        //case7:测试产品类别ID
		/*
		String searchQuery=null;
		List<Integer> goodsProjectTypeList=null;
		Integer areaDeep=null;
		Long addressId=null;
		List<String> goodsCertList=null;
		String ownerType=null;
		List<String> goodsTypeList=null;
		Integer assistId=1;
		String sortOrder="goods_price";
		Integer gcId=1165;
		List<Long> supportCountyIdList=null;
		Integer pageNo=null;
		*/

        //case8:定点扶贫县的ID
        String searchQuery=null;
        List<Integer> goodsProjectTypeList=null;
        Integer areaDeep=null;
        Long addressId=null;
        List<String> goodsCertList=null;
        String ownerType=null;
        List<String> goodsTypeList=null;
        Integer assistId=1;
        String sortOrder=null;
        Integer gcId=null;
        List<Long> supportCountyIdList=new ArrayList();
        long num = 0;
        supportCountyIdList.add(num);
        Integer pageNo=null;
        Map<String,Object> resultMap=searchGoodsService.searchGoodsList(searchQuery, goodsProjectTypeList, areaDeep, addressId, goodsCertList, ownerType, goodsTypeList, assistId, sortOrder, gcId, supportCountyIdList,null, pageNo);

        Assert.assertNotNull(resultMap);
    }

   	@Test
    public void testSyGoodsTopList() {
        Map<String,Object> paramMap=new HashMap<String,Object>();
        paramMap.put("orderByStr", "discount_rate");
        paramMap.put("limit", 6);
        paramMap.put("gtGoodsPrice", 1);
        paramMap.put("notInGoodsIds", null);
        List<SyGoodsCommon> resultList=searchGoodsService.syGoodsTopList(paramMap);
        Assert.assertNotNull(resultList);
    }
}
