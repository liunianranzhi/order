package com.shanyuan.platform.ms.core.goods.impl;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import com.alibaba.fastjson.JSON;
import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.OrderConstant;
import com.shanyuan.platform.ms.core.constant.ConstantReload;
import com.shanyuan.platform.ms.core.constant.EvaluateConstant;
import com.shanyuan.platform.ms.core.constant.EvaluateConstant.evalType;
import com.shanyuan.platform.ms.core.goods.SyEvaluateGoodsService;
import com.shanyuan.platform.ms.core.goods.bo.SyEvaluateGoodsBo;
import com.shanyuan.platform.ms.core.goods.impl.exceptype.EvaluateExcepType;
import com.shanyuan.platform.ms.core.order.QueryOrderService;
import com.shanyuan.platform.ms.core.order.impl.exceptype.OrderServiceExcepType;
import com.shanyuan.platform.ms.core.user.InviteInfoDealService;
import com.shanyuan.platform.ms.core.user.impl.exceptype.PointServiceExcepType;
import com.shanyuan.platform.ms.dao.goods.entity.SyEvaluateGoods;
import com.shanyuan.platform.ms.dao.goods.entity.SyEvaluateGoodsDetail;
import com.shanyuan.platform.ms.dao.goods.entity.SyEvaluateGoodsDetailExample;
import com.shanyuan.platform.ms.dao.goods.entity.SyEvaluateGoodsExample;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;
import com.shanyuan.platform.ms.dao.goods.mapper.SyEvaluateGoodsDetailMapper;
import com.shanyuan.platform.ms.dao.goods.mapper.SyEvaluateGoodsMapper;
import com.shanyuan.platform.ms.dao.order.entity.SyOrder;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderGoods;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderGoodsExample;
import com.shanyuan.platform.ms.dao.order.mapper.SyOrderGoodsMapper;

@Component
public class SyEvaluateGoodsServiceImpl implements SyEvaluateGoodsService {
	
	private static final Logger logger = LoggerFactory.getLogger(SyEvaluateGoodsServiceImpl.class);

	@Autowired
	private SyEvaluateGoodsMapper syEvaluateGoodsMapper;
	@Autowired
	private InviteInfoDealService inviteInfoDealService;
	@Autowired
	private ConstantReload constantReload;
	@Autowired
	private SyOrderGoodsMapper orderGoodsMapper;
	@Autowired
	private SyEvaluateGoodsDetailMapper  syEvaluateGoodsDetailMapper;
	
	
	
	@Transactional(timeout=36000,rollbackFor=Throwable.class)
	@Override
	public int addEditEvaluate(Map<Integer, SyOrderGoods> selectOrderGoods,Integer orderId,Integer memberId,
			String memberName,Map<Integer,Map<String,String>> data,Byte isanonymous
			,Byte gevalType,String doType) throws CoreServiceException{
		int row=0;
		try {
		
			for(Integer key:selectOrderGoods.keySet()) {
				SyOrderGoods goods = selectOrderGoods.get(key);
				SyEvaluateGoods segb=new SyEvaluateGoods();
				segb.setGevalOrderno(goods.getOrderSn());
				int	publisherid = goods.getPublisherId();
				segb.setPublisherId(publisherid);
				Integer goodsId = goods.getGoodsId();
				segb.setGevalGoodsid(goodsId);
				segb.setGevalOrdergoodsid(goodsId);
				BigDecimal goodsPrice = goods.getGoodsPrice();
				segb.setGevalGoodsprice(goodsPrice);
				String goodsName = goods.getGoodsName();
				goodsName = ObjectUtils.isEmpty(goodsName)?"":goodsName;
				segb.setGevalGoodsname(goodsName);
				Map<String, String> map = data.get(goodsId);
				String scores = map.get("scores");
				Byte gscores =ObjectUtils.isEmpty(scores)?new Byte("0"):new Byte(scores);
				String content = map.get("content");
				String image = map.get("image");
				String image2 = map.get("image2");
				String image3 = map.get("image3");
				content =ObjectUtils.isEmpty(content)?"":content;
				image =ObjectUtils.isEmpty(image)?"":image;
				image2 =ObjectUtils.isEmpty(image2)?"":image2;
				image3 =ObjectUtils.isEmpty(image3)?"":image3;
				segb.setGevalScores(gscores);
				segb.setGevalOrderid(orderId);
				segb.setGevalContent(content);
				segb.setGevalIsanonymous(isanonymous);
				segb.setGevalAddtime(DateUtil.getNowInt());
				Integer storeId = goods.getStoreId();
				storeId =ObjectUtils.isEmpty(storeId)?0:storeId;
				segb.setGevalStoreid(storeId);
				segb.setGevalStorename(storeId.toString());
				segb.setGevalFrommemberid(memberId);
				segb.setGevalFrommembername(memberName);
				segb.setGevalType(gevalType);
				segb.setGevalImage(image);
				segb.setGevalImage2(image2);
				segb.setGevalImage3(image3);
				Integer gevalId = goods.getGevalId();
				//目前只能添加一条评论 还不能 追加评论用gevalId是否为空限制、删除评论
				if((ObjectUtils.isEmpty(gevalId)||gevalId.equals(0))&&doType.equals(EvaluateConstant.doType.add)) {
					row = this.addEvaluateGoods(segb, null);
				}else if(doType.equals(EvaluateConstant.doType.edit)){
					// 编辑
					String ogevalId=map.get("gevalId");
					if(ObjectUtils.isEmpty(ogevalId)) {
						logger.info("evaluate gevalId 不能为空！");
						throw new CoreServiceException(EvaluateExcepType.PARAM_EMPTY,"编辑时，评价id不能为空！");
					}
					gevalId =Integer.parseInt(ogevalId) ;
					row = this.editEvaluateGoods(segb, gevalId);
				}
				if(gscores.intValue()<3) {
					//差评发送通知
					this.sendMessageForEvaluate(publisherid, goodsName, scores);
				}
			}
		} catch (CoreServiceException e) {
			logger.error(e.getMessage(),e);
			logger.info("evaluate 新增评论失败！");
			throw new CoreServiceException(EvaluateExcepType.INSERT_EVALUATE,"更新或新增评论失败！",e);
		}
		
		return row;
	}
	
	/**
	 * 评价的发送消息
	 * @author 钟颖
	 * @param memberId
	 * @param goodsName
	 * @param score
	 * @return
	 */
	@Override
	public boolean sendMessageForEvaluate(Integer memberId, String goodsName,String score) {
		try{
			String pageUrl = this.constantReload.getShopSiteApiUrl() + "/index.php?act=evaluate&op=store_evaluate_manager";
			String loadUrl = this.constantReload.getShopSiteApiUrl() + "/index.php?act=index&op=notify_page&page_url=" + URLEncoder.encode(pageUrl, "UTF-8");
			//发送推送消息
			this.inviteInfoDealService.sendNotifyToMemberForIncPoints(memberId, "评价", "评价", "买家对您的：" + goodsName+"做出了"+score+"心评价", loadUrl);
		}catch (UnsupportedEncodingException e){
			logger.info(e.getMessage(), new CoreServiceException(PointServiceExcepType.UNSUPPORTED_ENCODING));
		}
		return false;
	}
	public SyEvaluateGoodsBo info(Integer id) {
		SyEvaluateGoods syEvaluateGoods = syEvaluateGoodsMapper.selectByPrimaryKey(id);
		SyEvaluateGoodsBo bo = new SyEvaluateGoodsBo();
		BeanUtils.copyProperties(syEvaluateGoods, bo);
		return bo;
	}

	public List<SyEvaluateGoodsBo> list(SyEvaluateGoodsExample syEvaluateGoodsExample) {
		List<SyEvaluateGoods> list = syEvaluateGoodsMapper.selectByExample(syEvaluateGoodsExample);
		List<SyEvaluateGoodsBo> bos = new ArrayList<SyEvaluateGoodsBo>();
		for (SyEvaluateGoods syEvaluateGoods : list) {
			SyEvaluateGoodsBo bo = new SyEvaluateGoodsBo();
			BeanUtils.copyProperties(syEvaluateGoods, bo);
			bos.add(bo);
		}
		if(!CollectionUtils.isEmpty(bos)){
			return bos;
		}
		return null;
	}
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
	@Override
	public List<SyEvaluateGoodsBo> getEvaluateGoodsInfoList(Integer goodsCommonId,Integer gevalOrderId,Integer gFMemberid,
			String orderBy,String type,Integer pageSize,Integer currentPage) throws CoreServiceException {
		List<SyEvaluateGoods> valuateGoodsList =new ArrayList<SyEvaluateGoods>();
		//评价列表
		valuateGoodsList = this.getEvaluateList(goodsCommonId, gevalOrderId, gFMemberid, orderBy, type, pageSize, currentPage)	;
		List<SyEvaluateGoodsBo> bos = new ArrayList<SyEvaluateGoodsBo>();
		List<Integer> gevalIds = new ArrayList<Integer>();
		if(ObjectUtils.isEmpty(valuateGoodsList)) {
			return bos;
		}
		for (SyEvaluateGoods syEvaluateGoods : valuateGoodsList) {
			SyEvaluateGoodsBo bo = new SyEvaluateGoodsBo();
			BeanUtils.copyProperties(syEvaluateGoods, bo);
			bos.add(bo);
			gevalIds.add(syEvaluateGoods.getGevalId());	
		}
		// 查询回复的
		
		SyEvaluateGoodsDetailExample segse = new SyEvaluateGoodsDetailExample();
		segse.createCriteria().andStateEqualTo((byte)0).andGevalIdIn(gevalIds);
		List<SyEvaluateGoodsDetail> replyList = syEvaluateGoodsDetailMapper.selectByExample(segse);
		for(SyEvaluateGoodsBo syGood : bos) {
			Integer gevalId = syGood.getGevalId();
			List<SyEvaluateGoodsDetail> rlist =new   ArrayList<SyEvaluateGoodsDetail>(); 
			for(SyEvaluateGoodsDetail ry:replyList) {
				Integer gevalId2 = ry.getGevalId();
				if(!ObjectUtils.isEmpty(gevalId)&&gevalId.equals(gevalId2)) {
					Integer addtime = ry.getAddtime();
					Long atime =ObjectUtils.isEmpty(addtime)?0L:addtime;
					String replayTime = DateUtil.getIntegerToNyr(atime);
					ry.setReplayTime(replayTime);
					rlist.add(ry);
				}
				
			}//end replyList
			syGood.setReplyList(rlist);
		}
		return bos;
	}
	/**
	 * 评价列表
	 */
	public List<SyEvaluateGoods> getEvaluateList(Integer goodsCommonId,Integer gevalOrderId,Integer gFMemberid,
			String orderBy,String type,Integer pageSize,Integer currentPage) throws CoreServiceException {
		List<SyEvaluateGoods> valuateGoodsList =new ArrayList<SyEvaluateGoods>();
		SyEvaluateGoodsExample sege=new SyEvaluateGoodsExample();
		pageSize = ObjectUtils.isEmpty(pageSize)?20:pageSize;
		currentPage = ObjectUtils.isEmpty(currentPage)?1:currentPage;
		Integer sizeStart= (currentPage-1)*pageSize;
		
		if(evalType.order.equals(type)) {
			if(ObjectUtils.isEmpty(gevalOrderId)||ObjectUtils.isEmpty(gFMemberid)) {
				logger.info("evaluate orderid或 memberid为空！");
				throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"orderid或 memberid为空！");
				
			}
			sege.createCriteria().andGevalFrommemberidEqualTo(gFMemberid).andGevalOrderidEqualTo(gevalOrderId)
			.andGevalStateEqualTo((byte)0);
		}else if(evalType.all.equals(type)||evalType.goods.equals(type)){//商品的评论
			if(ObjectUtils.isEmpty(goodsCommonId)) {
				throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"goodsCommonId为空！");
				
			}
			sege.createCriteria().andGoodsCommonidEqualTo(goodsCommonId)
			.andGevalStateEqualTo((byte)0);
		}else if(evalType.well.equals(type)) {
			if(ObjectUtils.isEmpty(goodsCommonId)) {
				throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"goodsCommonId为空！");
			}
			sege.createCriteria().andGoodsCommonidEqualTo(goodsCommonId).andGevalScoresGreaterThan((byte)3)
			.andGevalStateEqualTo((byte)0);
		}else if(evalType.middle.equals(type)) {
			if(ObjectUtils.isEmpty(goodsCommonId)) {
				throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"goodsCommonId为空！");
			}
			sege.createCriteria().andGoodsCommonidEqualTo(goodsCommonId).andGevalScoresEqualTo((byte)3)
			.andGevalStateEqualTo((byte)0);
		}else if(evalType.negative.equals(type)) {
			if(ObjectUtils.isEmpty(goodsCommonId)) {
				throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"goodsCommonId为空！");
			}
			sege.createCriteria().andGoodsCommonidEqualTo(goodsCommonId).andGevalScoresLessThan((byte)3)
			
			.andGevalStateEqualTo((byte)0);
		}else if(evalType.picture.equals(type)) {
			if(ObjectUtils.isEmpty(goodsCommonId)) {
				throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"goodsCommonId为空！");
			}
			orderBy = ObjectUtils.isEmpty(orderBy)?" geval_addtime DESC LIMIT "+sizeStart+" , "+pageSize:orderBy+" LIMIT "+sizeStart+" , "+pageSize;
			Map<String,Object> map=new HashMap<String,Object>();
			map.put("goodsCommonid",goodsCommonId);
			map.put("orderByClause", orderBy);
			valuateGoodsList = syEvaluateGoodsMapper.selectByPicture(map);
		}
		if(!evalType.picture.equals(type)) {
			orderBy = ObjectUtils.isEmpty(orderBy)?" geval_addtime DESC LIMIT "+sizeStart+" , "+pageSize:orderBy+" LIMIT "+sizeStart+" , "+pageSize;
			sege.setOrderByClause(orderBy);	
			valuateGoodsList = this.syEvaluateGoodsMapper.selectByExample(sege);
		}
	return valuateGoodsList;
	} 
	/**
	 * 商品的评价列表    by sunyue
	 * @param sgc
	 * @param OrderByClause   order by OrderByClause
	 * @return
	 * @throws CoreServiceException
	 */
	public List<SyEvaluateGoodsBo> getEvaluateGoodsList(SyGoodsCommon sgc,String OrderByClause) throws CoreServiceException {
		SyEvaluateGoodsExample sege=new SyEvaluateGoodsExample();
		sege.createCriteria().andGevalStateEqualTo((byte)0).andGoodsCommonidEqualTo(sgc.getGoodsCommonid());
		sege.setOrderByClause(OrderByClause);
		List<SyEvaluateGoods> valuateGoodsList=this.syEvaluateGoodsMapper.selectByExample(sege);
		List<SyEvaluateGoodsBo> bos = new ArrayList<SyEvaluateGoodsBo>();
		List<Integer> gevalIds = new ArrayList<Integer>();
		for (SyEvaluateGoods syEvaluateGoods : valuateGoodsList) {
			SyEvaluateGoodsBo bo = new SyEvaluateGoodsBo();
			BeanUtils.copyProperties(syEvaluateGoods, bo);
			bos.add(bo);
			gevalIds.add(syEvaluateGoods.getGevalId());	
		}
		// 查询回复的
		SyEvaluateGoodsDetailExample segse = new SyEvaluateGoodsDetailExample();
		segse.createCriteria().andStateEqualTo((byte)0).andGevalIdIn(gevalIds);
		List<SyEvaluateGoodsDetail> replyList = syEvaluateGoodsDetailMapper.selectByExample(segse);
		SyEvaluateGoodsBo segb = new SyEvaluateGoodsBo();
		segb.setReplyList(replyList);
		bos.add(segb);
		if(CollectionUtils.isEmpty(bos)){
			return null;
		}
		return bos;
	}

	

	/**
	 * 发布商品评价  by zy 2017-11-30
	 * @param segb
	 * @param geval_id
	 * @return
	 * @throws CoreServiceException
	 */
	public int addEvaluateGoods(SyEvaluateGoods segb, Integer gevalid) throws CoreServiceException  {
		try {
				int insert = this.syEvaluateGoodsMapper.insertSelective(segb);
				if(insert<1) {
					logger.info("insert_evaluate_fail！"+JSON.toJSONString(segb));
					throw new CoreServiceException(EvaluateExcepType.INSERT_EVALUATE,"更新或新增评论失败！");
				}
				gevalid=segb.getGevalId();
				Integer orderId=segb.getGevalOrderid();
				Integer goodsId=segb.getGevalGoodsid();
				if(!ObjectUtils.isEmpty(orderId) && !ObjectUtils.isEmpty(goodsId)) {
					SyOrderGoods record = new SyOrderGoods();
					record.setGevalId(gevalid);
					SyOrderGoodsExample example =new SyOrderGoodsExample();
					example.createCriteria().andOrderIdEqualTo(orderId).andGoodsIdEqualTo(goodsId);
					insert = this.orderGoodsMapper.updateByExampleSelective(record, example);
					if(insert<1) {
						logger.info("更新order_goods失败！orderId={},goodsId={}",orderId,goodsId);
						throw new CoreServiceException(EvaluateExcepType.UPDATE_OREDER_GOODS,"更新order_goods失败！");
					}
				}
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			logger.info("更新或新增评论失败！");
			throw new CoreServiceException(EvaluateExcepType.INSERT_EVALUATE,"更新或新增评论失败！",e);
		}
		
		return gevalid;
	}
	/**
	 * 更新评论
	 */
	public int editEvaluateGoods(SyEvaluateGoods segb, Integer gevalid) throws CoreServiceException  {
		int row=0;
		try {
			SyEvaluateGoodsExample sege = new SyEvaluateGoodsExample();
			sege.createCriteria().andGevalIdEqualTo(gevalid);
			row=this.syEvaluateGoodsMapper.updateByExampleSelective(segb, sege);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			logger.info("更新评论失败！");
			throw new CoreServiceException(EvaluateExcepType.UPDATE_EVALUATE,"更新评论失败！",e);
		}
		return row;
	}
	/**
	 * by zy
	 * @param orderIds
	 * @return
	 * @throws CoreServiceException
	 */
	@Override
	public List<Integer> getOrderEvaluate(List<Integer> orderIds) throws CoreServiceException  {
		List<Integer> haveEvaluateIds =new ArrayList<Integer>();
		List<SyEvaluateGoods> egoodslist = syEvaluateGoodsMapper.selectEvaluateList(orderIds);
			for(SyEvaluateGoods sy:egoodslist) {
				Integer gevalOrderid = sy.getGevalOrderid();
				Integer num = sy.getNum();
				//如果orderIds 包含 gevalOrderid 并且 有评价
				if(orderIds.contains(gevalOrderid)&&!ObjectUtils.isEmpty(num)&&num>0) {
					haveEvaluateIds.add(gevalOrderid);
				}
			}
		return haveEvaluateIds;
	}
	

	/**
	 * 评价状态
	 */
	@Override
	public String  getEvaluateStatus(List<Integer> orderEvaluateIds,Integer orderId,Integer finnshedTime,String orderStatus) {
		String  status="can_eval";
		//已评价
		if(ObjectUtils.isEmpty(orderEvaluateIds)&&orderEvaluateIds.contains(orderId)) {
			status = "evaluated";
		}else {
			if(!ObjectUtils.isEmpty(finnshedTime)&&!OrderConstant.OrderState.ORDER_STATE_SUCCESS.equals(orderStatus)){
				//未评价
				status = "order_no_finish";
			}else {
				//评价已过期
				if(!ObjectUtils.isEmpty(finnshedTime)) {
					 Integer subDays = DateUtil.getSubDays(finnshedTime,0);
					 if(subDays> 30) {
						 status = "out_time";
					 }
				}
				
			}
		}
		return status;
	}

	/**
	 * 获取好差评的评论数
	 * @param sy
	 * @return
	 */
	public Integer selectNumByParam(SyEvaluateGoods sy)throws CoreServiceException{
		Integer selectNumByParam = syEvaluateGoodsMapper.selectNumByParam(sy);
		return selectNumByParam;
		
	}


}
