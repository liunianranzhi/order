package com.shanyuan.platform.ms.core.goods;

import java.util.List;
import java.util.Map;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.goods.bo.SyEvaluateGoodsBo;
import com.shanyuan.platform.ms.dao.goods.entity.SyEvaluateGoods;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderGoods;

public interface SyEvaluateGoodsService {
	/**
	 * @author 钟颖
	 * @param goodsCommonId
	 * @param gevalOrderId
	 * @param gFMemberid
	 * @param orderBy
	 * @param type
	 * @param pageSize
	 * @param currentPage
	 * @return
	 * @throws CoreServiceException
	 */
	public List<SyEvaluateGoodsBo> getEvaluateGoodsInfoList(Integer goodsCommonId,Integer gevalOrderId,Integer gFMemberid,
			String orderBy,String type,Integer pageSize,Integer currentPage) throws CoreServiceException ;

	/**
	 * @author 钟颖 不含回复
	 * @param goodsCommonId
	 * @param gevalOrderId
	 * @param gFMemberid
	 * @param orderBy
	 * @param type
	 * @param pageSize
	 * @param currentPage
	 * @return
	 * @throws CoreServiceException
	 */
	List<SyEvaluateGoods> getEvaluateList(Integer goodsCommonId,Integer gevalOrderId,Integer gFMemberid,
			String orderBy,String type,Integer pageSize,Integer currentPage) throws CoreServiceException;
	//public SyEvaluateGoodsBo info(Integer id);
	
	//public List<SyEvaluateGoodsBo> list(SyEvaluateGoodsExample syEvaluateGoodsExample);
	/**
	 * 增加评论
	 * @param selectOrderGoods
	 * @param orderId
	 * @param memberId
	 * @param memberName
	 * @param scores
	 * @param content
	 * @param isanonymous
	 * @param gevalType
	 * @param String doType 操作类型，添加 add ，追加 more，编辑 edit
	 * @return
	 * @throws CoreServiceException
	 */
	int addEditEvaluate(Map<Integer, SyOrderGoods> selectOrderGoods,Integer orderId,Integer memberId,
			String memberName,Map<Integer,Map<String,String>> data,Byte isanonymous
			,Byte gevalType,String doType) throws CoreServiceException;
	/**
	 * 差评给卖家发送通知
	 * @author 钟颖
	 * @param memberId
	 * @param goodsName
	 * @param score
	 * @return
	 */
	boolean sendMessageForEvaluate(Integer memberId, String goodsName,String score);
	/**
	 * 商品的评价列表  by sunyue
	 * @param sgc
	 * @param OrderByClause
	 * @return
	 * @throws CoreServiceException
	 */
	public List<SyEvaluateGoodsBo> getEvaluateGoodsList(SyGoodsCommon sgc,String OrderByClause) throws CoreServiceException;
	
	/**
	 * 发布商品评价   by sunyue
	 * @param segb
	 * @param geval_id
	 * @throws CoreServiceException
	 */
	public int editEvaluateGoods(SyEvaluateGoods segb,Integer geval_id) throws CoreServiceException;

	/**
     * 获得订单的评价列表
     * @author zy 2017-10-30
     * @param orderIds 订单ids
     * @return List<SyEvaluateGoods>
     * @throws CoreServiceException
     */
	List<Integer> getOrderEvaluate(List<Integer> orderIds) throws CoreServiceException;
	/**
	 * 获得评价状态
	 * @param orderEvaluateIds 已评价的id
	 * @param orderId 订单id
	 * @param finnshedTime 订单完成时间
	 * @param orderStatus 订单状态
	 * @return
	 */
	String  getEvaluateStatus(List<Integer> orderEvaluateIds,Integer orderId,Integer finnshedTime,String orderStatus) ;
	Integer selectNumByParam(SyEvaluateGoods sy)throws CoreServiceException;
}
