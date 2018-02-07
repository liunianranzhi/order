package com.shanyuan.platform.ms.core.goods.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.alibaba.fastjson.JSONArray;
import com.aliyun.opensearch.DocumentClient;
import com.aliyun.opensearch.OpenSearchClient;
import com.aliyun.opensearch.SearcherClient;
import com.aliyun.opensearch.sdk.dependencies.com.google.common.collect.Lists;
import com.aliyun.opensearch.sdk.dependencies.com.google.common.collect.Maps;
import com.aliyun.opensearch.sdk.dependencies.org.json.JSONObject;
import com.aliyun.opensearch.sdk.generated.OpenSearch;
import com.aliyun.opensearch.sdk.generated.commons.OpenSearchClientException;
import com.aliyun.opensearch.sdk.generated.commons.OpenSearchException;
import com.aliyun.opensearch.sdk.generated.commons.OpenSearchResult;
import com.aliyun.opensearch.sdk.generated.document.Command;
import com.aliyun.opensearch.sdk.generated.document.DocumentConstants;
import com.aliyun.opensearch.sdk.generated.search.Config;
import com.aliyun.opensearch.sdk.generated.search.Order;
import com.aliyun.opensearch.sdk.generated.search.SearchFormat;
import com.aliyun.opensearch.sdk.generated.search.SearchParams;
import com.aliyun.opensearch.sdk.generated.search.Sort;
import com.aliyun.opensearch.sdk.generated.search.SortField;
import com.aliyun.opensearch.sdk.generated.search.Suggest;
import com.aliyun.opensearch.sdk.generated.search.general.SearchResult;
import com.aliyun.opensearch.search.SearchParamsBuilder;
import com.aliyun.opensearch.search.SearchResultDebug;
import com.shanyuan.platform.ms.base.common.model.Page;
import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.ConstantReload;
import com.shanyuan.platform.ms.core.constant.GoodsConstant.CompareGoodsPrice;
import com.shanyuan.platform.ms.core.constant.GoodsConstant.UpdateOpenSearchType;
import com.shanyuan.platform.ms.core.constant.OrderConstant.ProjectType;
import com.shanyuan.platform.ms.core.goods.OpenSearchGoodsService;
import com.shanyuan.platform.ms.dao.goods.entity.OpenGoods;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;
import com.shanyuan.platform.ms.dao.goods.mapper.SyGoodsCommonMapper;
import com.shanyuan.platform.ms.dao.store.entity.SyOpenSearchParams;

@Component
public class OpenSearchGoodsServiceImpl implements OpenSearchGoodsService {
	
	private static final Logger logger = LoggerFactory.getLogger(OpenSearchGoodsServiceImpl.class);
	
	private static final String MAIN_TABLE_NAME="sy_goods_common";
	
	private static final String  SUGGEST_NAME="goodsname";
	
	private static final String TRANSPORT_TABLE_NAME="sy_transport_extend";
	
	@Autowired
	private SyGoodsCommonMapper syGoodsCommonMapper;
	
	@Autowired
	private ConstantReload constantReload;
	
	//设定返回值
	private static final List<String> getFetchFields(){
		return Lists.newArrayList(
				"goods_commonid","discount_money","discount_rate","unit","unit_spec","store_id","boc_point_plus","sale_num"
				,"goods_image","goods_price","goods_name","goods_storage","goods_marketprice","owner_type","publisher_truename"
				,"goods_project_type","sprice","publisher_id","product_spec","goods_type","gc_id"
		);
	}
	// 定义Config对象，用于设定config子句参数，分页或数据返回格式，指定应用名等等
	private Config getMyConfig(Integer startNo,Integer pageSize){
		Config config = new Config(Lists.newArrayList(constantReload.getOpenSearchAppName()));
		if(startNo!=null && pageSize!=null){
			config.setStart(startNo);
			config.setHits(pageSize);
		}
		config.setSearchFormat(SearchFormat.JSON);
		config.setFetchFields(getFetchFields());//设定返回值
		return config;
	}
	
	//初始化搜索客户端
	private OpenSearchClient initSearchClient(){
		// 创建并构造OpenSearch对象
		OpenSearch openSearch = new OpenSearch(constantReload.getOpenSearchAccesskey(), constantReload.getOpenSearchSecret(), constantReload.getOpenSearchHost());
		// 创建OpenSearchClient对象，并以OpenSearch对象作为构造参数
		return new OpenSearchClient(openSearch);
		
	}
	
	private StringBuilder addAndStr(StringBuilder str){
		if(StringUtils.isNotBlank(str)){
			str.append(" AND ");
		}
		return str;
	}
	
	/**
	 * 把循环的条件设定为查询条件
	 * @author caoyongjun
	 * @param query			build类
	 * @param expression	AND 或者 OR 表达式
	 * @param queryList		查询列表
	 * @param index    		要查询的索引
	 * @return
	 */
	private StringBuilder foreachListBuildQuery(StringBuilder query,String expression,List queryList,String index){
		if(!ObjectUtils.isEmpty(queryList)){
			query=addAndStr(query).append("(");
			for(int i=0;i<queryList.size();i++){
				query.append(index).append(":\"").append(queryList.get(i)).append("\"");
				if(i!=queryList.size()-1){
					query.append(" ").append(expression).append(" ");
				}
			}
			query.append(")");
		}
		return query;
	}
	
	/**
	 * 设置查询参数
	 * @author caoyongjun
	 * @param goodsProjectType
	 * @param gcId
	 * @param assistId
	 * @param areaDeep
	 * @param areaId
	 * @param searchQuery
	 * @param ownerType
	 * @param goodsTypeList
	 * @param supportCountyIdList
	 * @param goodsCertList
	 * @return
	 */
	private String buildSearchQuery(SyOpenSearchParams syOpenSearchParams){
		
		StringBuilder query=new StringBuilder();
		//关键词
		if(!ObjectUtils.isEmpty(syOpenSearchParams.getSearchQuery())){//单引号分词   双引号不分词
			query.append("default:'").append(syOpenSearchParams.getSearchQuery()).append("'");
		}
		//项目类型判断
		if(!ObjectUtils.isEmpty(syOpenSearchParams.getGoodsProjectType())){//单引号分词   双引号不分词
			addAndStr(query).append("goods_project_id:\"").append(syOpenSearchParams.getGoodsProjectType()).append("\"");
		}
		//助理人id
		if(!ObjectUtils.isEmpty(syOpenSearchParams.getAssistId())){
			addAndStr(query).append("assist_id:\"").append(syOpenSearchParams.getAssistId()).append("\"");
		}
		//区域等级 来判断id
		if(!ObjectUtils.isEmpty(syOpenSearchParams.getAreaDeep()) && !ObjectUtils.isEmpty(syOpenSearchParams.getAreaId())){
			addAndStr(query).append("areaid_").append(syOpenSearchParams.getAreaDeep()).append(":\"").append(syOpenSearchParams.getAreaId()).append("\"");
		}
		//分类id
		if(!ObjectUtils.isEmpty(syOpenSearchParams.getGcId())){
			addAndStr(query).append("gc_id:\"").append(syOpenSearchParams.getGcId()).append("\"");
		}
		//产品拥有者
		if(!ObjectUtils.isEmpty(syOpenSearchParams.getOwerType()) && !"all".equals(syOpenSearchParams.getOwerType())){
			addAndStr(query).append("owner_type:\"").append(syOpenSearchParams.getOwerType()).append("\"");
		}
		//产品发布者
		if(!ObjectUtils.isEmpty(syOpenSearchParams.getPublisherId())){
			addAndStr(query).append("publisher_id:\"").append(syOpenSearchParams.getPublisherId()).append("\"");
		}
		
		//产品显示 10
		if(!ObjectUtils.isEmpty(syOpenSearchParams.getShowState())){
			addAndStr(query).append("show_state:\"").append(syOpenSearchParams.getShowState()).append("\"");
		}
		
		//商品类型不为空时
		query=foreachListBuildQuery(query,"OR",syOpenSearchParams.getGoodsTypeList(),"goods_type");
		
		//帮扶县
		query=foreachListBuildQuery(query,"OR",syOpenSearchParams.getSupportCountyIdList(),"support_county_id");
		
		//分类类型
		query=foreachListBuildQuery(query,"OR",syOpenSearchParams.getGcIds(),"gc_id");
		
		//子联盟的发布者们
		query=foreachListBuildQuery(query,"OR",syOpenSearchParams.getPublisherIdList(),"publisher_id");
		
		//产品认证
		query=foreachListBuildQuery(query,"AND",syOpenSearchParams.getGoodsCertList(),"cert");
		
		addAndStr(query).append("goods_state:\"1\"");
		
		return query.toString();
	}
	
	private String buildFilter(List<String> filters){
		if(ObjectUtils.isEmpty(filters)){
			return null;
		}
		
		StringBuilder filter=new StringBuilder();
		for(int i=0;i<filters.size();i++){
			filter.append(filters.get(i));
			if(i!=filters.size()-1){
				filter.append(" AND ");
			}
		}
		
		return filter.toString();
	}
	
	/**
	 * 大爱超市检索
	 * @author caoyongjun
	 * @param startNo
	 * @param pageSize
	 * @param sortOrder
	 * @param gcId
	 * @param assistId
	 * @param areaDeep
	 * @param areaId
	 * @param searchQuery
	 * @param ownerType
	 * @param supportCountyIdList	扶贫县
	 * @param goodsCertList		认证
	 * @return
	 * @throws OpenSearchClientException 
	 * @throws OpenSearchException 
	 * @throws CoreServiceException 
	 */
	public Map<String,Object> getHelpGoodsList(Integer startNo,Integer pageSize,String sortOrder,Integer gcId,Integer assistId,Integer areaDeep,Long areaId,String searchQuery,String ownerType,
			List<String> goodsTypeList,List<Long> supportCountyIdList,List<Integer> publisherIdList,List<String> goodsCertList) throws CoreServiceException, OpenSearchException, OpenSearchClientException{
		SyOpenSearchParams openSearchParams =new SyOpenSearchParams();
		openSearchParams.setGcId(gcId);
		openSearchParams.setAssistId(assistId);
		openSearchParams.setAreaDeep(areaDeep);
		openSearchParams.setAreaId(areaId);
		openSearchParams.setSearchQuery(searchQuery);
		openSearchParams.setOwerType(ownerType);
		openSearchParams.setGoodsTypeList(goodsTypeList);
		openSearchParams.setSupportCountyIdList(supportCountyIdList);
		openSearchParams.setGoodsCertList(goodsCertList);
		openSearchParams.setGoodsProjectType(ProjectType.PROJECT_TYPE_DA_SHOP);
		openSearchParams.setPublisherIdList(publisherIdList);
		Sort sort=new Sort();
		
		if("overall_sort".equals(sortOrder)){
			sort.addToSortFields(new SortField("overall_sort", Order.INCREASE));
		}else{
			//怕因为是多个排序方式所以先去截取
			String[] sortOrders=sortOrder.split("\\,");
			for(String order:sortOrders){
				//判断排序规则
				if("a.goods_price".equals(order)){
					sort.addToSortFields(new SortField("goods_price", Order.INCREASE));
				}else if("a.goods_price DESC".equals(order)){	
					sort.addToSortFields(new SortField("goods_price", Order.DECREASE));
				}else if("a.goods_edittime DESC".equals(order)){
					sort.addToSortFields(new SortField("goods_edittime", Order.DECREASE));
				}else if("a.sale_num DESC".equals(order)){
					sort.addToSortFields(new SortField("sale_num", Order.DECREASE));
				}
			}
		}
		return getGoodsList( startNo, pageSize, sort, openSearchParams,null);
	}
	
	/**
	 * 善源商场检索
	 * @author caoyongjun
	 * @param startNo
	 * @param pageSize
	 * @param sortOrder		排序字段
	 * @param searchQuery	检索关键词
	 * @param gcId			分类id
	 * @return
	 * @throws OpenSearchClientException 
	 * @throws OpenSearchException 
	 * @throws CoreServiceException 
	 */
	public Map<String,Object> getSyGoodsList(Integer startNo,Integer pageSize, String sortOrder,String searchQuery,Integer gcId,Integer publisherId) throws CoreServiceException, OpenSearchException, OpenSearchClientException{
		SyOpenSearchParams syOpenSearchParams = new SyOpenSearchParams();
		syOpenSearchParams.setSearchQuery(searchQuery);
		syOpenSearchParams.setGcId(gcId);
		syOpenSearchParams.setPublisherId(publisherId);
		syOpenSearchParams.setGoodsProjectType(ProjectType.PROJECT_TYPE_SY_SHOP);
		List<String> filters=null;
		Sort sort=null;
		if(!StringUtils.isBlank(sortOrder)){
			
			filters=new ArrayList<String>();
			
			sort=new Sort();
			//怕因为是多个排序方式所以先去截取
			String[] sortOrders=sortOrder.split("\\,");
			for(String order:sortOrders){
				//判断排序规则
				if("favorable".equals(order)){
					filters.add("goods_price>0");
					sort.addToSortFields(new SortField("discount_rate", Order.DECREASE));//优惠力度降序
				}else if("a.goods_price DESC".equals(order) || "a.goods_price".equals(order)){
					filters.add("goods_storage>0");
					if("a.goods_price".equals(order)){
						sort.addToSortFields(new SortField("goods_price", Order.INCREASE));
					}else{
						sort.addToSortFields(new SortField("goods_price", Order.DECREASE));
					}
				}else if("a.goods_addtime DESC".equals(order)){
					sort.addToSortFields(new SortField("goods_addtime", Order.DECREASE));
				}else if("a.goods_addtime".equals(order)){
					sort.addToSortFields(new SortField("goods_addtime", Order.INCREASE));
				}else if("a.sale_num DESC".equals(order)){
					sort.addToSortFields(new SortField("sale_num", Order.DECREASE));
				}else if("a.sale_num".equals(order)){
					sort.addToSortFields(new SortField("sale_num", Order.INCREASE));
				}
			}
		}
		
		return getGoodsList( startNo, pageSize, sort, syOpenSearchParams,filters);
	}
	
	/**
	 * 善源top商品检索
	 * @author caoyongjun
	 * @param startNo
	 * @param pageSize
	 * @param sortOrder		排序字段
	 * @param searchQuery	检索关键词
	 * @param gcId			分类id
	 * @return
	 * @throws OpenSearchClientException 
	 * @throws OpenSearchException 
	 * @throws CoreServiceException 
	 */
	public Map<String,Object> getSyGoodsTopList(int limit,String sortOrder,Integer compareGoodsPriceFlag,List<SyGoodsCommon> notInGoodsList) throws CoreServiceException, OpenSearchException, OpenSearchClientException{
		SyOpenSearchParams openSearchParams = new SyOpenSearchParams();
		openSearchParams.setGoodsProjectType(ProjectType.PROJECT_TYPE_SY_SHOP);
		Sort sort = new Sort();
		//判断排序规则
		if("a.goods_price".equals(sortOrder)){
			sort.addToSortFields(new SortField("goods_price", Order.INCREASE));
		}else if("a.goods_addtime DESC".equals(sortOrder)){
			sort.addToSortFields(new SortField("goods_addtime", Order.DECREASE));
		}else if("a.sale_num DESC".equals(sortOrder)){
			sort.addToSortFields(new SortField("sale_num", Order.DECREASE));
		}else if("discount_rate DESC".equals(sortOrder)){
			sort.addToSortFields(new SortField("discount_rate",Order.DECREASE));
		}
		
		//设定比较的金额
		List<String> filters=new ArrayList<String>();
		if(compareGoodsPriceFlag==CompareGoodsPrice.GT_PRICE){
			filters.add("goods_price > 0");
		}else if(compareGoodsPriceFlag==CompareGoodsPrice.EQ_PRICE){
			filters.add("goods_price = 0");
		}else if(compareGoodsPriceFlag==CompareGoodsPrice.LT_PRICE){
			filters.add("goods_price < 0");
		}
		
		filters.add("goods_storage > 0");
		
		//不找在此id中的东西物品
		if(!ObjectUtils.isEmpty(notInGoodsList)){
			StringBuilder sb=new StringBuilder("notin(goods_commonid,\"");
			for(int i=0;i<notInGoodsList.size();i++){
				sb.append(notInGoodsList.get(i).getGoodsCommonid());
				if(i!=notInGoodsList.size()-1){
					sb.append("|");
				}
			}
			sb.append("\")");
			filters.add(sb.toString());
		}
		return getGoodsList(0, limit, sort, openSearchParams,filters);
	}
	
	//解析数据到list列表中
	private List<SyGoodsCommon> parsingJsonData(JSONObject itemData){
		JSONArray jsonarr = JSONArray.parseArray(itemData.get("items").toString());
		List<SyGoodsCommon> resultList=null;
		if(!ObjectUtils.isEmpty(jsonarr)){
    		resultList=new ArrayList<SyGoodsCommon>();
    		for(int i=0;i<jsonarr.size();i++){
    			
    			SyGoodsCommon goods=new SyGoodsCommon();
    			goods.setPublisherId(jsonarr.getJSONObject(i).getInteger("publisher_id"));
    			goods.setProductSpec(jsonarr.getJSONObject(i).getString("product_spec"));
    			goods.setGoodsType(jsonarr.getJSONObject(i).getString("goods_type"));
    			goods.setOwnerType(jsonarr.getJSONObject(i).getString("owner_type"));
    			goods.setGcId(jsonarr.getJSONObject(i).getInteger("gc_id"));
    			goods.setPublisherTruename(jsonarr.getJSONObject(i).getString("publisher_truename"));
    			goods.setSaleNum(jsonarr.getJSONObject(i).getInteger("sale_num"));
    			goods.setGoodsCommonid(jsonarr.getJSONObject(i).getInteger("goods_commonid"));
    			goods.setGoodsName(jsonarr.getJSONObject(i).getString("goods_name"));
    			goods.setGoodsProjectType(jsonarr.getJSONObject(i).getInteger("goods_project_type"));
    			goods.setGoodsImage(jsonarr.getJSONObject(i).getString("goods_image"));
    			goods.setGoodsPrice(jsonarr.getJSONObject(i).getBigDecimal("goods_price"));
    			goods.setUnit(jsonarr.getJSONObject(i).getString("unit"));
    			goods.setUnitSpec(jsonarr.getJSONObject(i).getString("unit_spec"));
    			goods.setStoreId(jsonarr.getJSONObject(i).getInteger("store_id"));
    			goods.setSpecName(jsonarr.getJSONObject(i).getString("spec_name"));
    			goods.setGoodsStorage(jsonarr.getJSONObject(i).getLong("goods_storage"));
    			goods.setGoodsMarketprice(jsonarr.getJSONObject(i).getBigDecimal("goods_marketprice"));
    			goods.setDiscountMoney(jsonarr.getJSONObject(i).getBigDecimal("discount_money"));
    			goods.setDiscountRate(jsonarr.getJSONObject(i).getBigDecimal("discount_rate"));
    			goods.setShippingFee(jsonarr.getJSONObject(i).getBigDecimal("sprice"));

				BigDecimal bocPointPlus=jsonarr.getJSONObject(i).getBigDecimal("boc_point_plus");
				BigDecimal bocPointPrice=BigDecimal.ZERO;
				if(bocPointPlus!=null && bocPointPlus.compareTo(BigDecimal.ZERO)>0){
					bocPointPrice=bocPointPlus.divide(new BigDecimal(100),2,BigDecimal.ROUND_UP);
				}
				goods.setBocPointsPrice(bocPointPrice);
    			

    			resultList.add(goods);
    		}
    	}
		return resultList;
	}
	
	@SuppressWarnings("unchecked")
	private List<Integer> getNormalData(){
		
		List<Integer> dataSet=null;
		
		SyOpenSearchParams syOpenSearchParams=new SyOpenSearchParams();
		
		try {
			Map<String,Object> dataMap=getGoodsList(null,null,null,syOpenSearchParams,null);
			
			List<SyGoodsCommon> goodsList=(List<SyGoodsCommon>) dataMap.get("goodsList");
			if(!ObjectUtils.isEmpty(goodsList)){
				dataSet=new ArrayList<Integer>(Integer.parseInt(dataMap.get("total").toString()));
				for(SyGoodsCommon goodsCommon:goodsList){
					dataSet.add(goodsCommon.getGoodsCommonid());
				}
			}
		} catch (CoreServiceException e) {
			e.printStackTrace();
		} catch (OpenSearchException e) {
			e.printStackTrace();
		} catch (OpenSearchClientException e) {
			e.printStackTrace();
		}
		
		return dataSet;
	}
	
	/**
	 * @author caoyongjun
	 * 大方法
	 */
	private Map<String,Object> getGoodsList(Integer startNo,Integer pageSize,Sort sort,SyOpenSearchParams syOpenSearchParams,List<String> filters) throws CoreServiceException,OpenSearchException,OpenSearchClientException {
		
		Map<String,Object> resultMap=new HashMap<String,Object>();
		
		SearcherClient searchClient=new SearcherClient(initSearchClient());
		SearchParams searchParams = new SearchParams(getMyConfig(startNo,pageSize));
		
		// 设置查询子句，若需多个索引组合查询，需要setQuery处合并，否则若设置多个setQuery后面的会替换前面查询
		String query=buildSearchQuery(syOpenSearchParams);
		if(StringUtils.isNotBlank(query)){
			searchParams.setQuery(query);
		}
		//设置排序
		if(!ObjectUtils.isEmpty(sort)){
			searchParams.setSort(sort);
		}
	
		//设定过滤条件
		SearchParamsBuilder paramsBuilder = SearchParamsBuilder.create(searchParams);
		String filter=buildFilter(filters);
		if(!ObjectUtils.isEmpty(filter)){
			paramsBuilder.addFilter(filter);
		}
		
		//查询的总数用于之后分页用
		int total=0;
		
		try {
			// 执行返回查询结果
			SearchResult searchResult = searchClient.execute(searchParams);
			String result = searchResult.getResult();
			JSONObject obj = new JSONObject(result);
			
			logger.info("output:"+obj);
			
			
			SearchResultDebug srd = searchClient.executeDebug(searchParams);
            logger.info("requestURL:"+srd.getRequestUrl().toString());
			
			//判断执行返回是否成功，如果报错执行下面代码，否者输出正确查询内容
            if(obj.get("errors").toString().length()>2){
                JSONArray jsonarr = JSONArray.parseArray(obj.get("errors").toString());
                logger.info("error code:"+jsonarr.getJSONObject(0).get("code")+"  error message:"+jsonarr.getJSONObject(0).get("message"));
                
                throw new CoreServiceException(CoreServiceExcepType.OPEN_SEARCH_QUERY_ERROR,"<<<<<<<<<<<< opensearch query error >>>>>>>>>>>>");
                
            }else{
            	JSONObject itemData=obj.getJSONObject("result");
//            	logger.info("<<<<<<<<<<<<<items:"+itemData);
            
            	total=itemData.getInt("total");
            	
            	List<SyGoodsCommon> goodsList=parsingJsonData(itemData);
            	if(ObjectUtils.isEmpty(goodsList)){
            		goodsList=Lists.newArrayList();
            	}
        		resultMap.put("goodsList", goodsList);
            	resultMap.put("total", total);
            }
		} catch (OpenSearchException e) {
			e.printStackTrace();
			throw new OpenSearchException();
		} catch (OpenSearchClientException e2) {
			e2.printStackTrace();
			throw new OpenSearchClientException();
		}
		return resultMap;
	}
	//删除opensearch的信息
	private void deleteOpenSearchGoods(List<Integer> list,Set<Integer> dataSet){
		if(list!=null && list.size()>0 && dataSet!=null && dataSet.size()>0){
			com.aliyun.opensearch.sdk.dependencies.org.json.JSONArray docsJsonArr = new com.aliyun.opensearch.sdk.dependencies.org.json.JSONArray();
			
			boolean deleteFlag=false;
			
			for(Integer id:list){
				//opensearch中没有的id  在数据库中不存在的话就要删除了
				if(!dataSet.contains(id)){
					
					deleteFlag=true;
					
					Map<String, Object> doc = Maps.newLinkedHashMap();
					doc.put("goods_commonid", id);
					
					JSONObject json1 = new JSONObject();
					json1.put(DocumentConstants.DOC_KEY_CMD, Command.DELETE.toString());
					json1.put(DocumentConstants.DOC_KEY_FIELDS, doc);
					
					docsJsonArr.put(json1);
				}
			}
			
			if(deleteFlag){
				String docsJson = docsJsonArr.toString();
				
				// 创建并构造OpenSearch对象
				DocumentClient documentClient = new DocumentClient(initSearchClient());
				try {
					// 执行推送操作
					OpenSearchResult osr = documentClient.push(docsJson, constantReload.getOpenSearchAppName(), MAIN_TABLE_NAME);
					// 判断数据是否推送成功，主要通过判断2处，第一处判断用户方推送是否成功，第二处是应用控制台中有无报错日志
					// 用户方推送成功后，也有可能在应用端执行失败，此错误会直接在应用控制台错误日志中生成，比如字段内容转换失败
					if (osr.getResult().equalsIgnoreCase("true")) {
						logger.info("用户方推送无报错！\n以下为getTraceInfo推送请求Id:" + osr.getTraceInfo().getRequestId());
					} else {
						logger.info("用户方推送报错！" + osr.getTraceInfo());
					}
				} catch (OpenSearchException e) {
					e.printStackTrace();
				} catch (OpenSearchClientException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
	
	/**
	 * @author caoyongjun
	 * 推送新文档数据
	 * @param list
	 */
	private Set<Integer> pushOpenSearchGoods(List<OpenGoods> list,int updateOpenSearchType,Set<Integer> dataSet){
		
		com.aliyun.opensearch.sdk.dependencies.org.json.JSONArray docsJsonArr = new com.aliyun.opensearch.sdk.dependencies.org.json.JSONArray();
		
		com.aliyun.opensearch.sdk.dependencies.org.json.JSONArray updateTransportJsonArr = new com.aliyun.opensearch.sdk.dependencies.org.json.JSONArray();
		
		for(OpenGoods openGoods:list){
			Integer goodsCommonid=openGoods.getGoodsCommonid();
			dataSet.add(goodsCommonid);//记录所查询出来的数据
			String showState=openGoods.getShowState();
			Long areaid1=openGoods.getAreaid1();
			Long areaid2=openGoods.getAreaid2();
			Long areaid3=openGoods.getAreaid3();
			BigDecimal discountRate=openGoods.getSyGoodsList().get(0).getDiscountRate(); 
			BigDecimal sprice=openGoods.getSprice();
			BigDecimal bocPointPrice=openGoods.getBocPointsPrice();
			Integer tId=openGoods.gettId();
			Long goodsStorage=openGoods.getSyGoodsList().get(0).getGoodsStorage();
			
			List<String> goodsCertTypes=openGoods.getGoodsCertTypes();
			
			Map<String, Object> doc1 = Maps.newLinkedHashMap();
			doc1.put("goods_commonid", goodsCommonid);
			//热数据更新
			doc1.put("goods_storage", goodsStorage);
			
			doc1.put("goods_state", 1);
			if(updateOpenSearchType==UpdateOpenSearchType.COLD_DATA){
				doc1.put("areaid_1", areaid1);
				doc1.put("areaid_2", areaid2);
				doc1.put("areaid_3", areaid3);
				if(discountRate!=null){
					doc1.put("discount_rate", discountRate.multiply(new BigDecimal(1000)).intValue());
				}else{
					doc1.put("discount_rate", 0);
				}
				if(bocPointPrice!=null && bocPointPrice.compareTo(BigDecimal.ZERO)>0){
					BigDecimal bocPointPlus=bocPointPrice.multiply(new BigDecimal(100));
					doc1.put("boc_point_plus", bocPointPlus.intValue());
				}else{
					doc1.put("boc_point_plus", 0);
				}
				if(StringUtils.isNotBlank(showState)){
					doc1.put("show_state", Integer.parseInt(showState));
				}
				if(!ObjectUtils.isEmpty(goodsCertTypes)){
					String[] cert = new String[goodsCertTypes.size()];
					for(int i=0;i<goodsCertTypes.size();i++){
						cert[i]=goodsCertTypes.get(i);
					}
					doc1.put("cert", cert);
				}

                    doc1.put("transport_id", openGoods.getTrId());

				//有运费时
////				doc1.put("transport_id", tId);
                Map<String, Object> docTransport = Maps.newLinkedHashMap();
                    if(tId!=null && tId >0){
                        docTransport.put("transport_id_2", openGoods.getTrId());
                        docTransport.put("sprice", sprice);
                    }

					
					JSONObject json2 = new JSONObject();
					json2.put(DocumentConstants.DOC_KEY_CMD, Command.UPDATE.toString());
					json2.put(DocumentConstants.DOC_KEY_FIELDS, docTransport);
					updateTransportJsonArr.put(json2);

			}
			JSONObject json1 = new JSONObject();
			json1.put(DocumentConstants.DOC_KEY_CMD, Command.UPDATE.toString());
			json1.put(DocumentConstants.DOC_KEY_FIELDS, doc1);
			
			docsJsonArr.put(json1);
		}
		
		String docsJson = docsJsonArr.toString();
		// 创建并构造OpenSearch对象
		DocumentClient documentClient = new DocumentClient(initSearchClient());
		try {
			// 执行推送操作
			OpenSearchResult osr = documentClient.push(docsJson, constantReload.getOpenSearchAppName(), MAIN_TABLE_NAME);
			// 判断数据是否推送成功，主要通过判断2处，第一处判断用户方推送是否成功，第二处是应用控制台中有无报错日志
			// 用户方推送成功后，也有可能在应用端执行失败，此错误会直接在应用控制台错误日志中生成，比如字段内容转换失败
			if (osr.getResult().equalsIgnoreCase("true")) {
				logger.info("用户方推送无报错！\n以下为getTraceInfo推送请求Id:" + osr.getTraceInfo().getRequestId());
			} else {
				logger.info("用户方推送报错！" + osr.getTraceInfo());
			}
		} catch (OpenSearchException e) {
			e.printStackTrace();
		} catch (OpenSearchClientException e) {
			e.printStackTrace();
		}
		
		if(updateTransportJsonArr.length()>0){
			String docsJson2 = updateTransportJsonArr.toString();
			// 创建并构造OpenSearch对象
			try {
				// 执行推送操作
				OpenSearchResult osr = documentClient.push(docsJson2, constantReload.getOpenSearchAppName(), TRANSPORT_TABLE_NAME);
				// 判断数据是否推送成功，主要通过判断2处，第一处判断用户方推送是否成功，第二处是应用控制台中有无报错日志
				// 用户方推送成功后，也有可能在应用端执行失败，此错误会直接在应用控制台错误日志中生成，比如字段内容转换失败
				if (osr.getResult().equalsIgnoreCase("true")) {
					logger.info(TRANSPORT_TABLE_NAME+"用户方推送无报错！\n以下为getTraceInfo推送请求Id:" + osr.getTraceInfo().getRequestId());
				} else {
					logger.info(TRANSPORT_TABLE_NAME+"用户方推送报错！" + osr.getTraceInfo());
				}
			} catch (OpenSearchException e) {
				e.printStackTrace();
			} catch (OpenSearchClientException e) {
				e.printStackTrace();
			}
		}
		
		return dataSet;
	}
	@Override
	public int updateOpenSearchField(int updateOpenSearchType,Integer goodsCommonid) {
		Map<String, Object> param=Maps.newHashMap();
		param.put("goodsState", 1);
		
		if(goodsCommonid!=null && goodsCommonid>0){
			param.put("goodsCommonid", goodsCommonid);
		}
		
		Integer count=syGoodsCommonMapper.countOpenGoodsByBatch(param);
		
		Set<Integer> dataSet=null;//为了之后把opensearch的数据删除
		int all=0;
		if(count!=null && count>0){
			all=count;
			dataSet=new HashSet<Integer>(all);
			int pageSize=1000;
			int pageNo=0;
			while(count>0){
				count=count-pageSize;
				
				Page page=new Page();
				page.setPageNo(++pageNo);
				page.setPageSize(pageSize);
				
				param.put("page", page);
				
				List<OpenGoods> list=syGoodsCommonMapper.selectOpenGoodsByBatch(param);
				dataSet=pushOpenSearchGoods(list,updateOpenSearchType,dataSet);
			}
			//获取opensearch中的data
			List<Integer> openSearchList=getNormalData();
			//刪除
			deleteOpenSearchGoods(openSearchList,dataSet);
		}
		return all;
	}
	
	@Override
	public Map<String, Object> getBizGoodsList(Integer startNo, Integer pageSize, String searchQuery,
			String sortOrder, Integer[] gcIds)  throws CoreServiceException,OpenSearchException,OpenSearchClientException{
		
		SyOpenSearchParams openSearchParams = new SyOpenSearchParams();
		openSearchParams.setSearchQuery(searchQuery);
		List<Integer> gcIdList=null;
		if(gcIds!=null && gcIds.length>0){
			gcIdList=Arrays.asList(gcIds);
			openSearchParams.setGcIds(gcIdList);
		}
		openSearchParams.setGoodsProjectType(ProjectType.PROJECT_TYPE_DA_SHOP);
		
		//判断排序规则
		Sort sort=new Sort();
		if("a.goods_price".equals(sortOrder)){
			sort.addToSortFields(new SortField("goods_price", Order.INCREASE));
		}else if("a.goods_price DESC".equals(sortOrder)){	
			sort.addToSortFields(new SortField("goods_price", Order.DECREASE));
		}else if("a.goods_edittime DESC".equals(sortOrder)){
			sort.addToSortFields(new SortField("goods_edittime", Order.DECREASE));
		}else if("a.goods_edittime".equals(sortOrder)){
			sort.addToSortFields(new SortField("goods_edittime", Order.INCREASE));
		}else if("a.sale_num DESC".equals(sortOrder)){
			sort.addToSortFields(new SortField("sale_num", Order.DECREASE));
		}else if("a.sale_num".equals(sortOrder)){
			sort.addToSortFields(new SortField("sale_num", Order.INCREASE));
		}else if("overall_sort".equals(sortOrder)){
			sort.addToSortFields(new SortField("overall_sort", Order.INCREASE));
		}
		
		List<String> filters=new ArrayList<String>();
		filters.add("assist_id > 0");
		
		return getGoodsList( startNo, pageSize, sort, openSearchParams ,filters);
	}
	
	//解析推荐词list
	private List<String> parsingSuggestJsonData(JSONObject itemData){
		JSONArray jsonarr = JSONArray.parseArray(itemData.get("suggestions").toString());
		List<String> resultList=null;
		if(!ObjectUtils.isEmpty(jsonarr)){
    		resultList=new ArrayList<String>();
    		for(int i=0;i<jsonarr.size();i++){
    			resultList.add(jsonarr.getJSONObject(i).getString("suggestion"));
    		}
    	}
		return resultList;
	}
	
	
	@Override
	public List<String> getSuggestList(String searchQuery, Integer pageSize) throws OpenSearchException, OpenSearchClientException {

		SearcherClient searcherClient = new SearcherClient(initSearchClient());
		SearchParams searchParams = new SearchParams(getMyConfig(0,pageSize));
		// 设置查询子句，若需多个索引组合查询，需要setQuery处合并，否则若设置多个setQuery后面的会替换前面查询
		Suggest sug = new Suggest();
		sug.setSuggestName(SUGGEST_NAME);
		searchParams.setSuggest(sug);// searchParams对象添加下拉对象
		searchParams.setQuery(searchQuery);
		// SearchParams的工具类，提供了更为便捷的操作
		SearchParamsBuilder paramsBuilder = SearchParamsBuilder.create(searchParams);
		// 执行返回查询结果
		SearchResult searchResult;
		List<String> returnList=null;
		try {
			searchResult = searcherClient.execute(paramsBuilder);
			String result = searchResult.getResult();
			JSONObject obj = new JSONObject(result);
			
			// 判断执行返回是否成功，如果报错执行下面代码，否者输出正确查询内容
			if (obj.has("errors")) {
				JSONArray jsonarr = JSONArray.parseArray(obj.get("errors").toString());
				logger.info("error code:" + jsonarr.getJSONObject(0).get("code")+"  error message:" + jsonarr.getJSONObject(0).get("message"));
			} else {
				// 输出查询结果
				logger.info("output:" + obj.toString());
				returnList=parsingSuggestJsonData(obj);
			}
		} catch (OpenSearchException e) {
			e.printStackTrace();
		} catch (OpenSearchClientException e) {
			e.printStackTrace();
		}
		
		return returnList;
	}

}
