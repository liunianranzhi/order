package com.shanyuan.platform.ms.core.goods;

import com.aliyun.opensearch.DocumentClient;
import com.aliyun.opensearch.OpenSearchClient;
import com.aliyun.opensearch.SearcherClient;
import com.aliyun.opensearch.sdk.dependencies.com.google.common.collect.Lists;
import com.aliyun.opensearch.sdk.dependencies.com.google.common.collect.Maps;
import com.aliyun.opensearch.sdk.dependencies.org.json.JSONArray;
import com.aliyun.opensearch.sdk.dependencies.org.json.JSONObject;
import com.aliyun.opensearch.sdk.generated.OpenSearch;
import com.aliyun.opensearch.sdk.generated.commons.OpenSearchClientException;
import com.aliyun.opensearch.sdk.generated.commons.OpenSearchException;
import com.aliyun.opensearch.sdk.generated.commons.OpenSearchResult;
import com.aliyun.opensearch.sdk.generated.document.Command;
import com.aliyun.opensearch.sdk.generated.document.DocumentConstants;
import com.aliyun.opensearch.sdk.generated.search.*;
import com.aliyun.opensearch.sdk.generated.search.general.SearchResult;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Map;

public class TestPushOpenSearch {
	private static String appName = "pwcn_t2";
	private static String accesskey = "LTAI808S82Wcx3so";
	private static String secret = "5gKetLRxSSWYpqf9nTNHjxA6jr7GqA";
	private static String host = "http://opensearch-cn-beijing.aliyuncs.com";

	public static void main2(String[] args) {
		// 查看文件和默认编码格式
		System.out.println(String.format("file.encoding: %s", System.getProperty("file.encoding")));
		System.out.println(String.format("defaultCharset: %s", Charset.defaultCharset().name()));
		// -------------数据推送示例代码-----------------
		// 生成随机数，作为主键值
		int goodsCommonid = 967440;
		
		// 定义Map对象存储上传文档数据,此为文档1
		Map<String, Object> doc1 = Maps.newLinkedHashMap();
		doc1.put("goods_commonid", goodsCommonid);
//		String title_string = "新增数据Push方式文档1";// utf-8
//		byte[] bytes;
//		try {
//			bytes = title_string.getBytes("utf-8");
//			String utf8_string = new String(bytes, "utf-8");
//			doc1.put("name", utf8_string);
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		} 
		String[] cert = { "organic", "wgh" };
		doc1.put("cert", cert);
		// 新增及更新都设为ADD，不支持update，当已存在相同主键值文档时做更新，否则新增，此处作为新增  【源朴】散养无公害芦花鸡蛋40枚顺丰空运破损包赔
		JSONObject json1 = new JSONObject();
		json1.put(DocumentConstants.DOC_KEY_CMD, Command.ADD.toString());
		json1.put(DocumentConstants.DOC_KEY_FIELDS, doc1);
		
		/* 定义Map对象测试更新文档数据,此为文档4，删除文档只需要设置需删除文档主键值即可，此处测试删除文档1
		Map<String, Object> doc4 = Maps.newLinkedHashMap();
		doc4.put("id", value1);
		// 此处设置删除文档处理
		JSONObject json4 = new JSONObject();
		json4.put(DocumentConstants.DOC_KEY_CMD, Command.DELETE.toString());
		json4.put(DocumentConstants.DOC_KEY_FIELDS, doc4);
		*/
		JSONArray docsJsonArr = new JSONArray();
		docsJsonArr.put(json1);// 新增文档1
		String docsJson = docsJsonArr.toString();
		// 创建并构造OpenSearch对象
		OpenSearch openSearch = new OpenSearch(accesskey, secret, host);
		// 创建OpenSearchClient对象，并以OpenSearch对象作为构造参数
		OpenSearchClient serviceClient = new OpenSearchClient(openSearch);
		// 定义DocumentClient对象添加json格式doc数据批量提交
		DocumentClient documentClient = new DocumentClient(serviceClient);
		try {
			// 执行推送操作
			OpenSearchResult osr = documentClient.push(docsJson, appName, "sy_goods_common");
			// 判断数据是否推送成功，主要通过判断2处，第一处判断用户方推送是否成功，第二处是应用控制台中有无报错日志
			// 用户方推送成功后，也有可能在应用端执行失败，此错误会直接在应用控制台错误日志中生成，比如字段内容转换失败
			if (osr.getResult().equalsIgnoreCase("true")) {
				System.out.println("用户方推送无报错！\n以下为getTraceInfo推送请求Id:" + osr.getTraceInfo().getRequestId());
			} else {
				System.out.println("用户方推送报错！" + osr.getTraceInfo());
			}
		} catch (OpenSearchException e) {
			e.printStackTrace();
		} catch (OpenSearchClientException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(1500);// 休眠1秒
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// -------------查询上面push的文档-----------------
		// 创建SearcherClient对象，并以OpenSearchClient对象作为构造参数
		SearcherClient searcherClient = new SearcherClient(serviceClient);
		// 定义Config对象，用于设定config子句参数，用于分页或设置数据返回格式
		Config config = new Config(Lists.newArrayList(appName));
		config.setStart(0);
		config.setHits(30);
		// 设置返回格式为json,目前只支持返回xml和json格式，暂不支持返回fulljson类型
		config.setSearchFormat(SearchFormat.JSON);
		// 设置搜索结果返回应用中哪些字段
		config.setFetchFields(
				Lists.newArrayList("goods_commonid","cert"));
		// 创建参数对象
		SearchParams searchParams = new SearchParams(config);
		// 设置查询子句，若需多个索引组合查询，需要setQuery处合并，否则若设置多个setQuery后面的会替换前面查询
		searchParams.setQuery("id:'" + goodsCommonid +"' AND cert:'organic' AND cert:'twgh'");
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
	
	
	public static void main1(String[] args) {
		// 查看文件和默认编码格式
		System.out.println(String.format("file.encoding: %s", System.getProperty("file.encoding")));
		System.out.println(String.format("defaultCharset: %s", Charset.defaultCharset().name()));
		// -------------数据推送示例代码-----------------
		// 生成随机数，作为主键值
		int transport_id = 463;
		
		// 定义Map对象存储上传文档数据,此为文档1
		Map<String, Object> doc1 = Maps.newLinkedHashMap();
		doc1.put("id", 2264);
//		doc1.put("transport_id", transport_id);
		doc1.put("sprice", 8);
		// 新增及更新都设为ADD，不支持update，当已存在相同主键值文档时做更新，否则新增，此处作为新增  【源朴】散养无公害芦花鸡蛋40枚顺丰空运破损包赔
		JSONObject json1 = new JSONObject();
		json1.put(DocumentConstants.DOC_KEY_CMD, Command.UPDATE.toString());
		json1.put(DocumentConstants.DOC_KEY_FIELDS, doc1);
		
		JSONArray docsJsonArr = new JSONArray();
		docsJsonArr.put(json1);// 新增文档1
		String docsJson = docsJsonArr.toString();
		// 创建并构造OpenSearch对象
		OpenSearch openSearch = new OpenSearch(accesskey, secret, host);
		// 创建OpenSearchClient对象，并以OpenSearch对象作为构造参数
		OpenSearchClient serviceClient = new OpenSearchClient(openSearch);
		// 定义DocumentClient对象添加json格式doc数据批量提交
		DocumentClient documentClient = new DocumentClient(serviceClient);
		try {
			// 执行推送操作
			OpenSearchResult osr = documentClient.push(docsJson, appName, "sy_transport_extend");
			// 判断数据是否推送成功，主要通过判断2处，第一处判断用户方推送是否成功，第二处是应用控制台中有无报错日志
			// 用户方推送成功后，也有可能在应用端执行失败，此错误会直接在应用控制台错误日志中生成，比如字段内容转换失败
			if (osr.getResult().equalsIgnoreCase("true")) {
				System.out.println("用户方推送无报错！\n以下为getTraceInfo推送请求Id:" + osr.getTraceInfo().getRequestId());
			} else {
				System.out.println("用户方推送报错！" + osr.getTraceInfo());
			}
		} catch (OpenSearchException e) {
			e.printStackTrace();
		} catch (OpenSearchClientException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// 查看文件和默认编码格式
		System.out.println(String.format("file.encoding: %s", System.getProperty("file.encoding")));
		System.out.println(String.format("defaultCharset: %s", Charset.defaultCharset().name()));
		// -------------数据推送示例代码-----------------
		// 生成随机数，作为主键值
		int goodsCommonid = 967767;
		
		// 定义Map对象存储上传文档数据,此为文档1
		Map<String, Object> doc1 = Maps.newLinkedHashMap();
//		doc1.put("id", goodsCommonid);
		doc1.put("goods_commonid", goodsCommonid);
//		doc1.put("gc_id", 1178);
		// 新增及更新都设为ADD，不支持update，当已存在相同主键值文档时做更新，否则新增，此处作为新增  【源朴】散养无公害芦花鸡蛋40枚顺丰空运破损包赔
		JSONObject json1 = new JSONObject();
		json1.put(DocumentConstants.DOC_KEY_CMD, Command.UPDATE.toString());
		json1.put(DocumentConstants.DOC_KEY_FIELDS, doc1);
		
		JSONArray docsJsonArr = new JSONArray();
		docsJsonArr.put(json1);// 新增文档1
		String docsJson = docsJsonArr.toString();
		// 创建并构造OpenSearch对象
		OpenSearch openSearch = new OpenSearch(accesskey, secret, host);
		// 创建OpenSearchClient对象，并以OpenSearch对象作为构造参数
		OpenSearchClient serviceClient = new OpenSearchClient(openSearch);
		// 定义DocumentClient对象添加json格式doc数据批量提交
		DocumentClient documentClient = new DocumentClient(serviceClient);
		try {
			// 执行推送操作
			OpenSearchResult osr = documentClient.push(docsJson, appName, "sy_goods_common");
			// 判断数据是否推送成功，主要通过判断2处，第一处判断用户方推送是否成功，第二处是应用控制台中有无报错日志
			// 用户方推送成功后，也有可能在应用端执行失败，此错误会直接在应用控制台错误日志中生成，比如字段内容转换失败
			if (osr.getResult().equalsIgnoreCase("true")) {
				System.out.println("用户方推送无报错！\n以下为getTraceInfo推送请求Id:" + osr.getTraceInfo().getRequestId());
			} else {
				System.out.println("用户方推送报错！" + osr.getTraceInfo());
			}
		} catch (OpenSearchException e) {
			e.printStackTrace();
		} catch (OpenSearchClientException e) {
			e.printStackTrace();
		}
	}
}
