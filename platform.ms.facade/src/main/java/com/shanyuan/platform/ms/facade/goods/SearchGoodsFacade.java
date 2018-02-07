package com.shanyuan.platform.ms.facade.goods;

import java.util.List;
import java.util.Map;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;

/**
 * @author 曹勇军
 *
 */
public interface SearchGoodsFacade {
	
	/**
	 * @author caoyongjun  大爱超市
	 * @param memberId	用户id
	 * @param searchQuery	关键词查询
	 * @param sortOrder	判断排序类型
						time_desc：上架时间倒序
						time_asc：上架时间顺序
						price_desc:价格倒序
						price_asc:价格顺序
						sale_desc:销量倒序
						sale_asc:销量顺序
						overall_sort:综合排序
	 * @param villageId	乡村id
	 * @param townId	城镇id
	 * @param areaId	区域id
	 * @param cityId	城市id
	 * @param provinceId	省id
	 * @param goodsType	产品类型
	 * @param goodsCert 产品认证  多选
	 * 					eu:欧盟认证 
	 * 					organic:有机认证 
	 * 					green:绿色认证 
	 * 					wgh:无公害认证
	 * @param ownerType		产品经营者 单选
	 * 					all:全部
	 * 					poor:贫困户自营
	 * 					agent:助理人助理
	 * @param pageNo	当前页
	 * @param unionItemId 子联盟id
	 * @param unionId 公益
	 */
	Map<String,Object> searchGoodsList(Integer memberId,String searchQuery, String sortOrder, Long villageId, Long townId,Long areaId, Long cityId, Long provinceId, Integer goodsType, String goodsCert, String ownerType,Integer pageNo,Integer unionItemId,Integer unionId) throws CoreServiceException;
	
	/**
	 * @author caoyongjun
	 * @param searchQuery	关键词
	 * @param sortOrder	排序
	 * 			time_desc：上架时间倒序	
     *          time_asc：上架时间顺序
     *          price_desc:价格倒序
     *          price_asc:价格顺序
     *          sale_desc:销量倒序
     *          sale_asc:销量顺序
     *          favorable:最多优惠
	 * @param goodsType	分类
	 * @param pageNo	当前页
	 */
	Map<String, Object> searchSyGoodsList(String searchQuery, String sortOrder, Integer goodsType, Integer pageNo) throws CoreServiceException;
	
	/**
	 * @author caoyongjun
	 * 愛心特惠
	 * 查询最多优惠	最新上架			最多销量的列表
	 * goodsPrice   goodsAddTime	saleNum
	 */
	Map<String,Object> syGoodsTopList() throws CoreServiceException;
	
	Map<String,Object> setDataMap(Map<String,Object> dataMap,SyGoodsCommon syGoodsCommon);
	/**
	 * @author sunyue
	 * @param searchQuery  搜索
	 * 			goods_name  商品的名字
	 * 			gc_name  分类的名字
	 * 			publisher_truename  发布者的姓名
	 * @param sortOrder  排序
	 * 			time_desc：上架时间倒序	
     *          time_asc：上架时间顺序
     *          price_desc:价格倒序
     *          price_asc:价格顺序
     *          sale_desc:销量倒序
     *          sale_asc:销量顺序
	 * @param pageNo   当前页
	 * @return
	 * @throws CoreServiceException
	 */
	Map<String,Object> searchBizGoodsList(String searchQuery, String sortOrder, String goodsType, Integer pageNo) throws CoreServiceException;
	
	List<String> getSuggestList(String searchQuery,Integer pageSize);
}
