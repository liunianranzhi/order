package com.shanyuan.platform.ms.core.goods.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.alibaba.druid.util.StringUtils;
import com.aliyun.opensearch.sdk.generated.commons.OpenSearchClientException;
import com.aliyun.opensearch.sdk.generated.commons.OpenSearchException;
import com.shanyuan.platform.ms.base.common.CommonRedisKey.OpenSearchKey;
import com.shanyuan.platform.ms.base.common.model.Page;
import com.shanyuan.platform.ms.base.common.util.ImageUtil;
import com.shanyuan.platform.ms.base.common.util.NumberFormatUtils;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.ConstantReload;
import com.shanyuan.platform.ms.core.constant.OrderConstant.ProjectType;
import com.shanyuan.platform.ms.core.goods.OpenSearchGoodsService;
import com.shanyuan.platform.ms.core.goods.SearchGoodsService;
import com.shanyuan.platform.ms.core.goods.SyGoodsCommonService;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommonQUERY;
import com.shanyuan.platform.ms.dao.goods.mapper.SyGoodsCommonMapper;

/**
 * @author 曹勇军
 *
 */
@Component
public class SearchGoodsServiceImpl implements SearchGoodsService {
	
	private static final Logger logger = LoggerFactory.getLogger(SearchGoodsServiceImpl.class);
	
	@Autowired
	private SyGoodsCommonMapper syGoodsCommonMapper;
	
	@Autowired
	private SyGoodsCommonService syGoodsCommonService;
	
	@Autowired
	private OpenSearchGoodsService openSearchGoodsService;
	
	@Autowired
	private ConstantReload constantReload;
	/**
	 * @author caoyongjun
	 * @param searchQuery	查询内容
	 * @param goodsProjectTypeList	项目类型
	 * @param addressId	地区id
	 * @param goodsCertList	产品认证
	 * @param ownerType	经营者
	 * @param goodsTypeList	商品类型
	 * @param assistId	助理人id
	 * @param gcId	分类
	 * @param supportCountyId	定点扶贫县的id
	 * @param publisherIdList 子联盟时
	 */
	@SuppressWarnings("unchecked")
	@Override
	@Cacheable(value = OpenSearchKey.OPEN_SEARCH_LIST, key = "'"+ OpenSearchKey.OPEN_SEARCH_LIST + "-' + #searchQuery + '-' + #goodsProjectTypeList + '-' + #areaDeep + '-' + #addressId + '-' + #goodsCertList + '-' + #ownerType + '-' + #goodsTypeList + '-' + #assistId + '-' + #sortOrder + '-' + #gcId + '-' + #supportCountyIdList + '-' + #publisherIdList + '-' + #pageNo",unless="#pageNo > 10")
	public Map<String,Object> searchGoodsList(String searchQuery,List<Integer> goodsProjectTypeList,Integer areaDeep,Long addressId,List<String> goodsCertList
			,String ownerType,List<String> goodsTypeList,Integer assistId,String sortOrder,Integer gcId,List<Long> supportCountyIdList,List<Integer> publisherIdList,Integer pageNo) throws CoreServiceException {
		
		Map<String,Object> map=new HashMap<String,Object>();
		List<SyGoodsCommon> goodsCommonList=null;
		
		//设定地址  设定值
		Long areaId1=null,areaId2=null,areaId3=null,areaId4=null,areaId5=null;
		if(!ObjectUtils.isEmpty(areaDeep) && !ObjectUtils.isEmpty(addressId)){
			if(areaDeep.equals(1)){
				areaId1=addressId;
			}else if(areaDeep.equals(2)){
				areaId2=addressId;
			}else if(areaDeep.equals(3)){
				areaId3=addressId;
			}else if(areaDeep.equals(4)){
				areaId4=addressId;
			}else if(areaDeep.equals(5)){
				areaId5=addressId;
			}
		}
		//设定分页
		Page page=new Page();
		page.setPageNo(pageNo);
		page.setPageSize(20);
		
		Integer count=0;
		
		boolean searchMysql=false;
		//查询opensearch搜索引擎
		if(constantReload.isUseOpenSearch()){
			try {
				map=openSearchGoodsService.getHelpGoodsList(page.getStartNo(), page.getPageSize(), sortOrder, gcId, assistId, areaDeep, addressId, searchQuery, ownerType, goodsTypeList, supportCountyIdList,publisherIdList, goodsCertList);
				count=Integer.parseInt(map.get("total").toString());
				goodsCommonList=(List<SyGoodsCommon>) map.get("goodsList");
			} catch (CoreServiceException e1) {
				e1.printStackTrace();
				map.put("hasNext", "N");
		  		map.put("goodsList", new ArrayList<SyGoodsCommon>());
				return map;
			}catch (OpenSearchException e1) {
				e1.printStackTrace();
				searchMysql=true;
			} catch (OpenSearchClientException e1) {
				e1.printStackTrace();
				searchMysql=true;
			}
		}else{
			searchMysql=true;
		}
		
		if(searchMysql){
			SyGoodsCommonQUERY syGoodsCommonQUERY=new SyGoodsCommonQUERY();
			syGoodsCommonQUERY.setPage(page);
			syGoodsCommonQUERY.setSortOrder(sortOrder);
			syGoodsCommonQUERY.setAssistId(assistId);
			syGoodsCommonQUERY.setGcId(gcId);
			syGoodsCommonQUERY.setGoodsProjectTypeList(goodsProjectTypeList);
			syGoodsCommonQUERY.setAreaId1(areaId1);
			syGoodsCommonQUERY.setAreaId2(areaId2);
			syGoodsCommonQUERY.setAreaId3(areaId3);
			syGoodsCommonQUERY.setAreaId4(areaId4);
			syGoodsCommonQUERY.setAreaId5(areaId5);
			syGoodsCommonQUERY.setOwnerType(ownerType);
			syGoodsCommonQUERY.setGoodsTypeList(goodsTypeList);
			syGoodsCommonQUERY.setSupportCountyIdList(supportCountyIdList);
			if(!ObjectUtils.isEmpty(searchQuery)){
				syGoodsCommonQUERY.setSearchQuery("%"+searchQuery+"%");
			}
			
			try {
				//1.1.如果有产品认证时
				if(!ObjectUtils.isEmpty(goodsCertList)){
					syGoodsCommonQUERY.setGoodsCertList(goodsCertList);
					syGoodsCommonQUERY.setHavingCount(goodsCertList.size());
					count=syGoodsCommonMapper.countByGoodsCertType(syGoodsCommonQUERY);
					if(count != null && count>0){
						goodsCommonList=syGoodsCommonMapper.selectByGoodsCertType(syGoodsCommonQUERY);
					}
				}else{
					count=syGoodsCommonMapper.countBySyGoodsByQUERY(syGoodsCommonQUERY);
					if(count != null && count>0){
						goodsCommonList=syGoodsCommonMapper.selectBySyGoodsByQUERY(syGoodsCommonQUERY);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new CoreServiceException("查询报错");
			}
		}
		String hasNext="N";
		//计算是否还有下一页数据
		if(count != null && count>0){
			if(hasNext(page.getPageNo(),page.getPageSize(),count)){
				hasNext="Y";
			}
		}
		
		map.put("hasNext", hasNext);
		
		map.put("goodsList", goodsCommonList);
		
		return map;
	}
	/**
	 * @author caoyongjun
	 * 判断是否有下一页
	 */
	public boolean hasNext(int pageNo,int pageSize,int count){
		double hasNext=Math.ceil((double)count/(pageNo*pageSize));
		if(hasNext>1.0){
			return true;
		}else{
			return false;
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	@Cacheable(value = OpenSearchKey.OPEN_SEARCH_LIST, key = "'"+ OpenSearchKey.OPEN_SEARCH_LIST + "-' + #searchQuery + '-' + #sortOrder + '-' + #gcId + '-' + #pageSize + '-' + #publisherId+ '-' + #pageNo",unless="#pageNo > 10")
	public Map<String, Object> searchSyGoodsList(String searchQuery, String sortOrder, Integer gcId, Integer pageNo,Integer pageSize,Integer publisherId)
			throws CoreServiceException {
		
		//设定返回值
		Map<String,Object> map=new HashMap<String,Object>();
		Integer count=null;
		List<SyGoodsCommon> goodsCommonList=null;
		
		//设定分页
		Page page=new Page();
		page.setPageNo(pageNo);
		if(ObjectUtils.isEmpty(pageSize)){
			page.setPageSize(20);
		}else{
			page.setPageSize(pageSize);
		}
		
		boolean searchMysql=false;
		//查询opensearch搜索引擎
		if(constantReload.isUseOpenSearch()){
			try {
				map=openSearchGoodsService.getSyGoodsList(page.getStartNo(), page.getPageSize(), sortOrder, searchQuery, gcId,publisherId);
				count=Integer.parseInt(map.get("total").toString());
				goodsCommonList=(List<SyGoodsCommon>) map.get("goodsList");
			} catch (CoreServiceException e1) {
				e1.printStackTrace();
				map.put("hasNext", "N");
		  		map.put("goodsList", new ArrayList<SyGoodsCommon>());
				return map;
			}catch (OpenSearchException e1) {
				e1.printStackTrace();
				searchMysql=true;
			} catch (OpenSearchClientException e1) {
				e1.printStackTrace();
				searchMysql=true;
			}
		}else{
			searchMysql=true;
		}
		//搜索数据库
		if(searchMysql){
			SyGoodsCommonQUERY syGoodsCommonQUERY=new SyGoodsCommonQUERY();
			syGoodsCommonQUERY.setPage(page);
			syGoodsCommonQUERY.setGoodsProjectType(ProjectType.PROJECT_TYPE_SY_SHOP);
			if(!ObjectUtils.isEmpty(searchQuery)){
	    		syGoodsCommonQUERY.setSearchQuery("%"+searchQuery+"%");
	    	}
			if(!ObjectUtils.isEmpty(sortOrder)){
	    		syGoodsCommonQUERY.setSortOrder(sortOrder);
	    	}
			if(!ObjectUtils.isEmpty(gcId)){
				syGoodsCommonQUERY.setGcId(gcId);
			}
			if(!ObjectUtils.isEmpty(publisherId)){
				syGoodsCommonQUERY.setPublisherId(publisherId);
			}
			
			try{
				//综合排序
			    if("favorable".equals(sortOrder)){
			    	syGoodsCommonQUERY.setSortOrder("discount_rate DESC");//优惠力度降序
			    	syGoodsCommonQUERY.setGtGoodsPrice(1);//设置金额大于0条件
			    }else if("a.goods_price DESC".equals(sortOrder) || "a.goods_price".equals(sortOrder)){//最多优惠时找库存大于0的
			    	syGoodsCommonQUERY.setGtGoodsStorage(1);
			    }
			    count=syGoodsCommonMapper.countBySyGoodsByQUERY(syGoodsCommonQUERY);
				if(count != null && count>0){
					goodsCommonList=syGoodsCommonMapper.selectBySyGoodsByQUERY(syGoodsCommonQUERY);
				}
			} catch (Exception e) {
				logger.error(e.getMessage(),e);
				throw new CoreServiceException("查询商品时报错");
			}
		}
		String hasNext="N";
		//计算是否还有下一页数据
		if(count != null && count>0){
			if(hasNext(page.getPageNo(),page.getPageSize(),count)){
				hasNext="Y";
			}
		}
		
		map.put("hasNext", hasNext);
  		
  		map.put("goodsList", goodsCommonList);
		
		return map;
	}
	
	@Override
	public List<SyGoodsCommon> syGoodsTopList(Map<String,Object> paramMap) throws CoreServiceException {
		return syGoodsCommonMapper.syGoodsTypeTopList(paramMap);
	}
	
	@Override
	@Cacheable(value = OpenSearchKey.OPEN_SEARCH_LIST, key = "'"+ OpenSearchKey.OPEN_SEARCH_LIST + "-' + #searchQuery + '-' + #sortOrder + '-' + #goodsType + '-' + #pageSize + '-' + #pageNo",unless="#pageNo > 10")
	public Map<String, Object> searchBizBuyGoodsList(String searchQuery, String sortOrder, String goodsType, Integer pageNo, 
			Integer pageSize ) throws CoreServiceException {

		//设定返回值
		Integer count = null;   // 商品的总条数
		List<SyGoodsCommon> goodsCommonList = new ArrayList<SyGoodsCommon>();
		String title = "集中采购";
		Integer[] gcIds = null;
		Map<String,Object> resultData = new HashMap<String,Object>();
	    List<Map<String,Object>> resultList = new ArrayList<Map<String,Object>>();
		
		// 设定分页
		Page page = new Page();
		page.setPageNo(pageNo);
		if(ObjectUtils.isEmpty(pageSize)){
			page.setPageSize(20);
		}else{
			page.setPageSize(pageSize);
		}
		
		// 设定分类  goods_type=1774:苹果
        if(!ObjectUtils.isEmpty(goodsType)){
        	String goodsTypes[] = goodsType.split(":");
            if(!ObjectUtils.isEmpty(goodsTypes) && goodsTypes.length>=2) {
            	gcIds = syGoodsCommonService.getFullBizGoodsClass(Integer.valueOf(goodsTypes[0]));
                title = goodsTypes[1];
            }
        }
        
        if(!StringUtils.isEmpty(sortOrder) && !"overall_sort".equals(sortOrder)){
        	sortOrder="a."+sortOrder;
        }
		
		boolean searchMysql=false;
		//查询opensearch搜索引擎
		if(constantReload.isUseOpenSearch()){
			try {
				resultData=openSearchGoodsService.getBizGoodsList(page.getStartNo(), page.getPageSize(), searchQuery, sortOrder, gcIds);
				count=Integer.parseInt(resultData.get("total").toString());
				goodsCommonList=(List<SyGoodsCommon>) resultData.get("goodsList");
			} catch (CoreServiceException e1) {
				e1.printStackTrace();
				resultData.put("hasNext", "N");
				resultData.put("goodsList", new ArrayList<SyGoodsCommon>());
				return resultData;
			}catch (OpenSearchException e1) {
				e1.printStackTrace();
				searchMysql=true;
			} catch (OpenSearchClientException e1) {
				e1.printStackTrace();
				searchMysql=true;
			}
		}else{
			searchMysql=true;
		}
		
		if(searchMysql){
			
			// 设定查询的条件
			SyGoodsCommonQUERY syGoodsCommonQUERY = new SyGoodsCommonQUERY();
			syGoodsCommonQUERY.setPage(page);
			syGoodsCommonQUERY.setGoodsProjectType(ProjectType.PROJECT_TYPE_DA_SHOP);
			syGoodsCommonQUERY.setHasAssistId("Y");
			
			if(!ObjectUtils.isEmpty(searchQuery)){
	    		syGoodsCommonQUERY.setSearchQuery("%"+searchQuery+"%");
	    	}
			if(!ObjectUtils.isEmpty(sortOrder)){
	    		syGoodsCommonQUERY.setSortOrder(sortOrder);
	    	}
			if(!ObjectUtils.isEmpty(gcIds)){
	    		syGoodsCommonQUERY.setGcIds(gcIds);
	    	}
			count = syGoodsCommonMapper.countBizGoodsByQUERY(syGoodsCommonQUERY);
			if(count != null && count>0){
				goodsCommonList = syGoodsCommonMapper.selectBizGoodsByQUERY(syGoodsCommonQUERY);
			}
		}
		
		if(ObjectUtils.isEmpty(goodsCommonList)) {
			logger.info("没有查询到符合条件的商品  searchQuery={},sortOrder={},goodsType={},pageNo={}",searchQuery,sortOrder,goodsType,pageNo);
		}else {
			for (SyGoodsCommon goodsCommon : goodsCommonList) {
				Map<String, Object> resultMap = new HashMap<String, Object>();
				if(!ObjectUtils.isEmpty(goodsCommon.getGoodsImage()) && !ObjectUtils.isEmpty(goodsCommon.getStoreId())){
					resultMap.put("goodsImage", ImageUtil.cdn_end_point+"/goods/" + goodsCommon.getStoreId() + "/" + goodsCommon.getGoodsImage());
				}else{
					resultMap.put("goodsImage", "");
				}
				resultMap.put("touchUrl", "/bocm/index.php?act=project&op=project_detail&gc_id="+ goodsCommon.getGoodsCommonid()
					+"&goods_project_type="+goodsCommon.getGoodsProjectType()+"&publisher_id="+goodsCommon.getPublisherId());
				
				resultMap.put("goodsPrice", "￥"+goodsCommon.getGoodsPrice().toString());
				
				resultMap.put("goodsName", goodsCommon.getGoodsName()); 
				
				if (!ObjectUtils.isEmpty(goodsCommon.getShippingFee()) && goodsCommon.getShippingFee().compareTo(BigDecimal.ZERO) > 0) {// 有运费需要显示
					resultMap.put("shippingFee", "运费："+NumberFormatUtils.getBigDecimalFormatString(goodsCommon.getShippingFee()));// 运费金额
				} else {// 无运费
					resultMap.put("shippingFee", "免运费");// 运费金额
				}
				resultList.add(resultMap);
			}
		}
		resultData.put("goodsList", ObjectUtils.isEmpty(resultList) ? new ArrayList<Map<String,Object>>():resultList );

		resultData.put("title", title);
		
		String hasNext="N";
		//计算是否还有下一页数据
		if(count != null && count>0){
			if(hasNext(page.getPageNo(),page.getPageSize(),count)){
				hasNext="Y";
			}
		}
		resultData.put("hasNext", hasNext);
		return resultData;
	}

}
