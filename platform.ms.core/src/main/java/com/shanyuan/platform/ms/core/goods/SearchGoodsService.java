package com.shanyuan.platform.ms.core.goods;

import java.util.List;
import java.util.Map;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;

/**
 * @author 曹勇军
 *
 */
public interface SearchGoodsService {
	
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
	 * @param pageNo	当前页
	 */
	Map<String,Object> searchGoodsList(String searchQuery,List<Integer> goodsProjectTypeList,Integer areaDeep,Long addressId,List<String> goodsCertList,String ownerType,List<String> goodsTypeList,Integer assistId,String sortOrder,Integer gcId,List<Long> supportCountyIdList,List<Integer> publisherIdList,Integer pageNo) throws CoreServiceException;
	
	/**
	 * @author caoyongjun
	 * 善源商场物品
	 * @param searchQuery
	 * @param sortOrder
	 * @param gcId
	 * @param pageNo
	 * @param pageSize
	 * @throws CoreServiceException
	 */
	Map<String,Object> searchSyGoodsList(String searchQuery,String sortOrder,Integer gcId,Integer pageNo,Integer pageSize,Integer publisherId) throws CoreServiceException;
	
	/**
	 * @author caoyongjun
	 */
	List<SyGoodsCommon> syGoodsTopList(Map<String,Object> paramMap) throws CoreServiceException;
	
	/**
	 * @author sunyue
	 * 单位集采
	 * @param searchQuery  搜索
	 * @param sortOrder  排序
	 * @param gcId 
	 * @param pageNo  当前页
	 * @param pageSize  一共多少页
	 * @param publisherId  发布者id
	 * @return
	 * @throws CoreServiceException
	 */
	Map<String,Object> searchBizBuyGoodsList(String searchQuery, String sortOrder, String goodsType, Integer pageNo, 
			Integer pageSize ) throws CoreServiceException;
	
}
