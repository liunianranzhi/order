package com.shanyuan.platform.ms.core.goods;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aliyun.opensearch.DocumentClient;
import com.aliyun.opensearch.OpenSearchClient;
import com.aliyun.opensearch.SearcherClient;
import com.aliyun.opensearch.sdk.dependencies.com.google.common.collect.Lists;
import com.aliyun.opensearch.sdk.dependencies.org.json.JSONObject;
import com.aliyun.opensearch.sdk.generated.OpenSearch;
import com.aliyun.opensearch.sdk.generated.commons.OpenSearchClientException;
import com.aliyun.opensearch.sdk.generated.commons.OpenSearchException;
import com.aliyun.opensearch.sdk.generated.search.Config;
import com.aliyun.opensearch.sdk.generated.search.SearchFormat;
import com.aliyun.opensearch.sdk.generated.search.SearchParams;
import com.aliyun.opensearch.sdk.generated.search.general.SearchResult;
import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;

/**
 * 
 * @author caoyongjun
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class OpenSearchGoodsServiceTest {

	@Autowired
	OpenSearchGoodsService openSearchGoodsService;

	private static String appName = "pwcn_test";
	private static String accesskey = "LTAI808S82Wcx3so";
	private static String secret = "5gKetLRxSSWYpqf9nTNHjxA6jr7GqA";
	private static String host = "http://opensearch-cn-beijing.aliyuncs.com";
	
	@Test
	public void testGetHelpGoodsList(){
		
		OpenSearch openSearch1 = new OpenSearch(accesskey, secret, host);
		// 创建OpenSearchClient对象，并以OpenSearch对象作为构造参数
		OpenSearchClient serviceClient1 = new OpenSearchClient(openSearch1);
		
		SearcherClient searcherClient = new SearcherClient(serviceClient1);
		Config config = new Config(Lists.newArrayList(appName));
		config.setStart(0);
		config.setHits(30);
		// 设置返回格式为json,目前只支持返回xml和json格式，暂不支持返回fulljson类型
		config.setSearchFormat(SearchFormat.JSON);
		// 设置搜索结果返回应用中哪些字段
		config.setFetchFields(
				Lists.newArrayList("goods_commonid","goods_state","goods_name","cert","goods_storage"));
		// 创建参数对象
		SearchParams searchParams = new SearchParams(config);
		// 设置查询子句，若需多个索引组合查询，需要setQuery处合并，否则若设置多个setQuery后面的会替换前面查询
		searchParams.setQuery("goods_type:\"bizbuy\"");
		// 执行返回查询结果
		SearchResult searchResult;
		try {
			searchResult = searcherClient.execute(searchParams);
			String result = searchResult.getResult();
			JSONObject obj = new JSONObject(result);
			// 输出查询结果
			System.out.println(obj.toString());
		} catch (OpenSearchException e) {
			e.printStackTrace();
		} catch (OpenSearchClientException e) {
			e.printStackTrace();
		}
	}
	
//	@Test
	public void testGetSyGoodsList(){
		
	}
	
	
//	@Test
	public void testGetSyGoodsTopList(){
		
		//TODO 还差goods_storage discount_rate
		//查詢爱心特惠
		List<SyGoodsCommon> allList=Lists.newArrayList();
		int limit = 7;
		int compareGoodsPriceFlag=0;
		String sortOrder="a.goods_price";
		Map<String,Object> resultMap=null;
		try {
			resultMap=openSearchGoodsService.getSyGoodsTopList(limit, sortOrder, compareGoodsPriceFlag, allList);
			
			System.out.println(resultMap.toString());
		} catch (CoreServiceException e) {
			e.printStackTrace();
		} catch (OpenSearchException e) {
			e.printStackTrace();
		} catch (OpenSearchClientException e) {
			e.printStackTrace();
		}
	}
	
}
