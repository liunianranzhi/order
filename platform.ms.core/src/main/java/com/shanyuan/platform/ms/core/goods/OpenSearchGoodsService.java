package com.shanyuan.platform.ms.core.goods;

import java.util.List;
import java.util.Map;

import com.aliyun.opensearch.sdk.generated.commons.OpenSearchClientException;
import com.aliyun.opensearch.sdk.generated.commons.OpenSearchException;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;

public interface OpenSearchGoodsService {
	
	/**
	 * @author caoyongjun
	 * 获取大爱超市的搜索引擎列表
	 * @param startNo
	 * @param pageSize
	 * @param sortOrder
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
	 * @throws CoreServiceException
	 * @throws OpenSearchException
	 * @throws OpenSearchClientException
	 */
	Map<String,Object> getHelpGoodsList(Integer startNo,Integer pageSize,String sortOrder,Integer gcId,Integer assistId,Integer areaDeep,Long areaId,String searchQuery,String ownerType,
			List<String> goodsTypeList,List<Long> supportCountyIdList,List<Integer> publisherIdList,List<String> goodsCertList) throws CoreServiceException, OpenSearchException, OpenSearchClientException;

	/**
	 * @author caoyongjun
	 * 获取善源商场的搜索引擎列表
	 * @param startNo
	 * @param pageSize
	 * @param sortOrder
	 * @param searchQuery
	 * @param gcId
	 * @return
	 * @throws CoreServiceException
	 * @throws OpenSearchException
	 * @throws OpenSearchClientException
	 */
	Map<String,Object> getSyGoodsList(Integer startNo,Integer pageSize, String sortOrder,String searchQuery, Integer gcId, Integer publisherId) throws CoreServiceException, OpenSearchException, OpenSearchClientException;
	
	/**
	 * @author caoyongjun
	 * 获取善源top商品的搜索引擎列表
	 * @param limit
	 * @param sortOrder
	 * @param compareGoodsPriceFlag
	 * @param notInGoodsList
	 * @return
	 * @throws CoreServiceException
	 * @throws OpenSearchException
	 * @throws OpenSearchClientException
	 */
    Map<String,Object> getSyGoodsTopList(int limit,String sortOrder,Integer compareGoodsPriceFlag,List<SyGoodsCommon> notInGoodsList) throws CoreServiceException, OpenSearchException, OpenSearchClientException;
    
    /**
     * @author caoyongjun
     * 更新opensearch的数据
     * @return 执行总数
     */
    int updateOpenSearchField(int updateOpenSearchType,Integer goodsCommonid);
    
    /**
     *  @author caoyongjun
     *  查詢单位集采
     * @param startNo
     * @param pageSize
     * @param searchQuery
     * @param sortOrder
     * @param gcIds
     * @return
     */
    Map<String,Object> getBizGoodsList(Integer startNo,Integer pageSize,String searchQuery, String sortOrder, Integer[] gcIds) throws CoreServiceException,OpenSearchException,OpenSearchClientException;
    
    /**
     * @author caoyongjun
     * 获取推荐词
     * @param query
     * @return
     * @throws OpenSearchException
     * @throws OpenSearchClientException
     */
    List<String> getSuggestList(String searchQuery,Integer pageSize) throws OpenSearchException,OpenSearchClientException;
}		