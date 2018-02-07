package com.shanyuan.platform.ms.core.goods;


import com.alibaba.fastjson.JSONArray;
import com.aliyun.opensearch.OpenSearchClient;
import com.aliyun.opensearch.SearcherClient;
import com.aliyun.opensearch.sdk.dependencies.com.google.common.collect.Lists;
import com.aliyun.opensearch.sdk.dependencies.org.json.JSONObject;
import com.aliyun.opensearch.sdk.generated.OpenSearch;
import com.aliyun.opensearch.sdk.generated.commons.OpenSearchClientException;
import com.aliyun.opensearch.sdk.generated.commons.OpenSearchException;
import com.aliyun.opensearch.sdk.generated.search.*;
import com.aliyun.opensearch.sdk.generated.search.general.SearchResult;
import com.aliyun.opensearch.search.SearchParamsBuilder;
import com.aliyun.opensearch.search.SearchResultDebug;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.springframework.util.ObjectUtils;

public class TestSuggest {
	
	private static String appName = "pwcn_t2";
	private static String accesskey = "LTAI808S82Wcx3so";
	private static String secret = "5gKetLRxSSWYpqf9nTNHjxA6jr7GqA";
	private static String host = "http://opensearch-cn-beijing.aliyuncs.com";

	public static void main(String[] args) {
		// 查看文件和默认编码格式
		System.out.println(String.format("file.encoding: %s", System.getProperty("file.encoding")));
		System.out.println(String.format("defaultCharset: %s", Charset.defaultCharset().name()));
		// 创建并构造OpenSearch对象
		OpenSearch openSearch = new OpenSearch(accesskey, secret, host);
		// 创建OpenSearchClient对象，并以OpenSearch对象作为构造参数
		OpenSearchClient serviceClient = new OpenSearchClient(openSearch);
		// 创建SearcherClient对象，并以OpenSearchClient对象作为构造参数
		SearcherClient searcherClient = new SearcherClient(serviceClient);
		// 定义Config对象，用于设定config子句参数，分页或数据返回格式，指定应用名等等
		Config config = new Config(Lists.newArrayList(appName));
		config.setStart(0);
		config.setHits(10);
		// 设置返回格式为json，3.1.2
		// sdk只支持返回xml和json格式，暂不支持返回fulljson类型，3.1.3版本支持fulljson
		config.setSearchFormat(SearchFormat.JSON);
		// 创建参数对象
		SearchParams searchParams = new SearchParams(config);
		// 设置查询子句，若需多个索引组合查询，需要setQuery处合并，否则若设置多个setQuery后面的会替换前面查询
		Suggest sug = new Suggest();
		sug.setSuggestName("goodsname");
		searchParams.setSuggest(sug);// searchParams对象添加下拉对象
		searchParams.setQuery("山");// 在控制台中下拉列表中如果能搜出"nihao"，这里也能够搜出
		// SearchParams的工具类，提供了更为便捷的操作
		SearchParamsBuilder paramsBuilder = SearchParamsBuilder.create(searchParams);
		// 执行返回查询结果
		SearchResult searchResult;
		try {
			searchResult = searcherClient.execute(paramsBuilder);
			String result = searchResult.getResult();
			JSONObject obj = new JSONObject(result);
			
			
			JSONArray jsonarr2 = JSONArray.parseArray(obj.get("suggestions").toString());
			List<String> resultList=null;
			if(!ObjectUtils.isEmpty(jsonarr2)){
	    		resultList=new ArrayList<String>();
	    		for(int i=0;i<jsonarr2.size();i++){
	    			
	    			System.out.println("error message:" + jsonarr2.getJSONObject(i).get("suggestion"));
//	    			resultList.add(goods);
	    		}
	    	}
			
			
			
			// 判断执行返回是否成功，如果报错执行下面代码，否者输出正确查询内容
			if (obj.has("errors")) {
				JSONArray jsonarr = JSONArray.parseArray(obj.get("errors").toString());
				System.out.println("error code:" + jsonarr.getJSONObject(0).get("code"));
				System.out.println("error message:" + jsonarr.getJSONObject(0).get("message"));
			} else {
				// 输出查询结果
				System.out.println("output:" + obj.toString());
				// 个别用户可能需要debug请求地址信息
				SearchResultDebug srd = searcherClient.executeDebug(searchParams);
				System.out.println(srd.getRequestUrl().toString());
			}
		} catch (OpenSearchException e) {
			e.printStackTrace();
		} catch (OpenSearchClientException e) {
			e.printStackTrace();
		}
	}
}
