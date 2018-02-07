package com.shanyuan.platform.ms.facade.evaluate.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;


import com.aliyun.openservices.shade.com.alibaba.fastjson.JSON;
import com.shanyuan.platform.ms.base.common.util.OrderUtil;
import com.shanyuan.platform.ms.base.common.util.ValidUtil;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.EvaluateConstant;
import com.shanyuan.platform.ms.core.constant.OrderConstant;
import com.shanyuan.platform.ms.core.constant.EvaluateConstant.evalType;
import com.shanyuan.platform.ms.core.goods.EvaluateStore;
import com.shanyuan.platform.ms.core.goods.SyEvaluateGoodsService;
import com.shanyuan.platform.ms.core.goods.bo.EvaluataGoodsBo;
import com.shanyuan.platform.ms.core.goods.bo.SyEvaluateGoodsBo;
import com.shanyuan.platform.ms.core.goods.impl.exceptype.EvaluateExcepType;
import com.shanyuan.platform.ms.core.member.MemberService;
import com.shanyuan.platform.ms.core.order.QueryOrderService;
import com.shanyuan.platform.ms.core.user.UserCorrelationService;
import com.shanyuan.platform.ms.dao.goods.entity.SyEvaluateGoods;
import com.shanyuan.platform.ms.dao.order.entity.SyOrder;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderGoods;
import com.shanyuan.platform.ms.dao.store.entity.SyEvaluateStore;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.facade.evaluate.EvaluateFacade;
/**
 * 
 * @author 钟颖
 *
 */
@Component
public class EvaluateFacadeImpl implements EvaluateFacade {
	
	private static final Logger logger = LoggerFactory.getLogger(EvaluateFacadeImpl.class);
	@Autowired
	private SyEvaluateGoodsService evaluateGoods;
	@Autowired
	private EvaluateStore evaluateStore;
	@Autowired
	private QueryOrderService queryOrder;
	@Autowired
	private MemberService memberService;
	@Autowired
	private UserCorrelationService userService;
	
	
	/**
	 * 
	 * @param gevalOrderId
	 * @param memberId
	 * @param pageSize
	 * @param currentPage
	 * @return
	 * @throws CoreServiceException
	 */
	public Map<String ,Object> getEvaluateGoodsManagerList(Integer gevalOrderId,Integer goodscommonId,Integer memberId ,Integer pageSize,Integer currentPage,String type)
			throws CoreServiceException{
		Map<String ,Object> data= new HashMap<String ,Object>();
			if(!this.checkEvalType(type)) {
				logger.info("evaluate type={}",type);
				throw new CoreServiceException(EvaluateExcepType.PARAM_ERROR,"type 参数错误！");
			}
			List<SyEvaluateGoodsBo> evaluateGoodsInfo = evaluateGoods.getEvaluateGoodsInfoList(goodscommonId, gevalOrderId, memberId, null, type, pageSize, currentPage);
			if(logger.isDebugEnabled()) {
				logger.info("evaluateGoodsInfo"+JSON.toJSONString(evaluateGoodsInfo));
			}
			if(CollectionUtils.isEmpty(evaluateGoodsInfo)) {
				data.put("evaluateList", "");
			}else {
				data = this.getEnum(type, goodscommonId, gevalOrderId, memberId, pageSize, currentPage);
				if(logger.isDebugEnabled()) {
					logger.info("evaluate getEnum"+JSON.toJSONString(data));
				}
				List<EvaluataGoodsBo> evlist = this.getEvaluateGoods(evaluateGoodsInfo);
				data.put("evaluateList", evlist);
			}
		return data;
	}
	/***
	 * 一键好评
	 * @author 钟颖
	 * @param orderId
	 * @param memberId
	 * @param memberName
	 * @return
	 * @throws CoreServiceException
	 */
	public void onePraise(Integer orderId,Integer memberId,String memberName) throws CoreServiceException{
		if(ObjectUtils.isEmpty(orderId)||ObjectUtils.isEmpty(memberId)) {
			logger.info("相关参数为空, orderId={} memberId={}", orderId,memberId);
			throw new CoreServiceException(EvaluateExcepType.PARAM_EMPTY,"orderId或memberId为空！");
		}
		SyOrder syorder= new SyOrder();
		syorder.setOrderId(orderId);
		syorder.setDeleted((byte)0);
		syorder.setBuyerId(memberId);
		syorder.setOrderState(OrderConstant.OrderState.ORDER_STATE_SUCCESS);
		 Map<Integer, SyOrderGoods> selectOrderGoodsMap = queryOrder.selectOrderGoodsMap(syorder);
		if(logger.isDebugEnabled()) {
			logger.info("oneEvaluate selectOrderGoodsInfo:"+JSON.toJSONString(selectOrderGoodsMap));
		}
		if(ObjectUtils.isEmpty(selectOrderGoodsMap)) {
			logger.info("该用户没有这个订单, orderId={} memberId={}", orderId,memberId);
			throw new CoreServiceException(EvaluateExcepType.PARAM_ERROR,"该用户没有这个订单，参数错误！");
		}
		Map<Integer,Map<String,String>> data=new HashMap<Integer,Map<String,String>>();
		Integer goodsId=0;
		for(Integer key:selectOrderGoodsMap.keySet()) {
			SyOrderGoods goods = selectOrderGoodsMap.get(key);
			goodsId = goods.getGoodsId();
			Map<String,String>  info=new HashMap<String,String>();
			info.put("scores", "5");
			info.put("content", "好评");
			data.put(goodsId, info);
		}
		List<SyEvaluateStore> storeEvaluate= evaluateStore.getStoreEvaluateByOid(orderId);
		//判断是否要对店铺进行评价 以前没有评价的才能进行 
		boolean tostore=false;
		if(CollectionUtils.isEmpty(storeEvaluate)) {
			tostore =true;
		}
		//增加评论
		this.insertEvaluate(tostore, goodsId, selectOrderGoodsMap, orderId, memberId, memberName, data,(byte)1, (byte)1,
				5, 5, EvaluateConstant.doType.add);
	}
	/**
	 * 评价或编辑
	 * @author 钟颖
	 * @param goodsMap
	 * @param orderId
	 * @param memberId
	 * @param memberName
	 * @throws CoreServiceException
	 */
	@SuppressWarnings("unchecked")
	public void addEvaluate(String goodsMaps,Integer memberId,Integer orderid,
			Integer servicescores,Integer deliveryscores,String memberName,String isanonymous,String doType) throws CoreServiceException{
		if(ObjectUtils.isEmpty(goodsMaps)||ObjectUtils.isEmpty(memberId)||ObjectUtils.isEmpty(servicescores)||ObjectUtils.isEmpty(deliveryscores)) {
			logger.info("add evaluate goodsMap={},memberId={},servicescores={},deliveryscores={}",goodsMaps,memberId,servicescores,deliveryscores);
			throw new CoreServiceException(EvaluateExcepType.PARAM_EMPTY,"评价内容或会员id或服务评分或物流评分为空！");
		}
		Map<String,Map<String,String>> ogoodsMap=new HashMap<String, Map<String,String>>();
		
		if(!ObjectUtils.isEmpty(goodsMaps)){
			try {
				ogoodsMap=(Map<String,Map<String,String>>) JSON.parse(goodsMaps);
			} catch (Exception e) {
				logger.error(e.getMessage(),e);
				logger.info("add evaluate goodsMap={} 参数格式不正确",goodsMaps);
				throw new CoreServiceException(EvaluateExcepType.PARAM_ERROR,"商品评论信息的参数格式不对！");
			}
		}
		ArrayList<Integer> gidList = new ArrayList<Integer>();
		Integer onegoodid=0;
		Map<Integer,Map<String,String>> goodsMap=new HashMap<Integer, Map<String,String>>();
		try {
			for(String key :ogoodsMap.keySet()) {
				 onegoodid = Integer.parseInt(key);
				 Map<String, String> map1 = ogoodsMap.get(key);
				 gidList.add(onegoodid);
				 goodsMap.put(onegoodid, map1);
			}
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			logger.info("add evaluate goodsMap={}参数格式不正确",goodsMaps);
			throw new CoreServiceException(EvaluateExcepType.PARAM_ERROR,"商品评论信息的参数格式不对！");
		}
	    Map<Integer, SyOrderGoods> orderGoodsMap = queryOrder.getOrderGoodsByGids(orderid,gidList);
	    isanonymous =ObjectUtils.isEmpty(isanonymous)?"1":isanonymous;
	    //校验相关
		this.checkEvauate(goodsMap, orderGoodsMap,isanonymous,servicescores,deliveryscores,doType);
		List<SyEvaluateStore> storeEvaluate= evaluateStore.getStoreEvaluateByOid(orderid);
		//判断是否要对店铺进行评价 以前没有评价的才能进行 
		boolean tostore=false;
		if(CollectionUtils.isEmpty(storeEvaluate)) {
			tostore =true;
		}
		//添加相关 事务控制
		this.insertEvaluate(tostore, onegoodid, orderGoodsMap, orderid, memberId, memberName, goodsMap, new Byte(isanonymous), (byte)1, servicescores, deliveryscores,doType);
		
	}
	/**
	 * 
	 * @throws CoreServiceException
	 */
	@Transactional(timeout=36000,rollbackFor=Throwable.class,isolation=Isolation.READ_COMMITTED)
	private  void insertEvaluate(boolean tostore ,Integer onegoodid ,Map<Integer, SyOrderGoods> 
	selectOrderGoods,Integer orderId,Integer memberId,
			String memberName,Map<Integer,Map<String,String>> data,Byte isanonymous
			,Byte gevalType,Integer servicescores,Integer deliveryscores,String doType)throws CoreServiceException{
		//添加评价
		Integer row = evaluateGoods.addEditEvaluate(selectOrderGoods, orderId, memberId, memberName, data, new Byte(isanonymous),new Byte("1"),doType);
		if(row>0&&tostore) {
			//添加店铺评价
			SyOrderGoods syOrderGoods = selectOrderGoods.get(onegoodid);
			row = evaluateStore.insertStoreEvaluate(syOrderGoods, orderId, memberId, memberName,
          servicescores, deliveryscores);
		}
		if(row <0) {
			logger.info("evaluate insertEvaluate 新增评论失败！");
			throw new CoreServiceException(EvaluateExcepType.INSERT_EVALUATE,"新增评论失败！");
		}
	}
	/**
	 * 校验评价参数
	 * @param goodsMap
	 * @param orderGoodsMap
	 * @param isanonymous
	 * @param servicescore
	 * @param descore
	 * @throws CoreServiceException
	 */
	private  void checkEvauate(Map<Integer,Map<String, String>> goodsMap, Map<Integer, SyOrderGoods> orderGoodsMap
			,String isanonymous,Integer servicescore,Integer descore,String doType)throws CoreServiceException {
		if(!"1".equals(isanonymous)&&!"0".equals(isanonymous)) {
			logger.info("add evaluate isanonymous={}参数错误！",isanonymous);
			throw new CoreServiceException(EvaluateExcepType.PARAM_ERROR,"isanonymous 参数格式不对！");
		}
		if(logger.isDebugEnabled()) {
			logger.info("add evaluate orderGoodsByGids={}",JSON.toJSONString(orderGoodsMap));
		}
		
		if(servicescore<=0||servicescore>5||descore<=0||descore>5) {
			logger.info("add evaluate servicescore={},descore={}  ！",servicescore,descore);
			throw new CoreServiceException(EvaluateExcepType.SCORES_ERROR,"服务评分："+servicescore+"或物流评分："+descore +"不正确！");
		}
		if(ObjectUtils.isEmpty(orderGoodsMap)) {
			logger.info("add evaluate orderGoods={}为空！");
			throw new CoreServiceException(EvaluateExcepType.PARAM_ERROR,"没有相关商品，参数错误！");
		}
		for(Integer key :goodsMap.keySet()) {
			SyOrderGoods syOrderGoods = orderGoodsMap.get(key);
			if(ObjectUtils.isEmpty(syOrderGoods)) {
				logger.info("add evaluate goodsid={}的ordergood 不存在！",key);
				throw new CoreServiceException(EvaluateExcepType.PARAM_ERROR,"没有该goodsid的商品,参数错误！");
			}
			Map<String, String> map = goodsMap.get(key);
			String scores = map.get("scores");
			String content = map.get("content");
			if(doType.equals(EvaluateConstant.doType.edit)) {
				String gevalId =map.get("gevalId");
				if(ObjectUtils.isEmpty(gevalId)) {
					logger.info("evaluate gevalId 不能为空！");
					throw new CoreServiceException(EvaluateExcepType.PARAM_EMPTY,"编辑时，评价id不能为空！");
				}
				try {
					Integer.parseInt(gevalId);
				} catch (Exception e) {
					logger.error(e.getMessage(),e);
					logger.info("evaluate gevalId 格式不正确！");
					throw new CoreServiceException(EvaluateExcepType.PARAM_ERROR,"编辑时，gevalId 格式不正确！");
				}
			}
			int iscore = 0;
			try {
				iscore = Integer.parseInt(scores);
			} catch (Exception e) {
				logger.info("add evaluate servicescore={},descore={} 参数 格式不对！");
				throw new CoreServiceException(EvaluateExcepType.SCORES_ERROR,"分数格式不对！");
			}
			
			if(ObjectUtils.isEmpty(scores)||ObjectUtils.isEmpty(content)) {
				logger.info("add evaluate scores={}，content={} 为空！",scores,content);
				throw new CoreServiceException(EvaluateExcepType.SCORES_OR_CONTENT_EMPT,"评分为空或者评价内容为空！");
			}
			String goodsName = syOrderGoods.getGoodsName();
			if(iscore<=0||iscore>5) {
				logger.info("add evaluate scores={}  ！",scores,content);
				throw new CoreServiceException(EvaluateExcepType.SCORES_ERROR,"商品："+goodsName+"的评分不正确！");
			}
			if(iscore<=2&&content.length()<=10 ){
				logger.info("add evaluate scores={} , content={}！差评，评价内容必须多于十个字符",scores,content);
				throw new CoreServiceException(EvaluateExcepType.CONTENT_ONT_ENOUGHT,"商品："+goodsName+"为差评，评价内容必须多于十个字符！");
			}
		}
	}
	
	/**
	 * 是否有下一页 的相关信息
	 * @param type
	 * @param goodsCommonid
	 * @param gevalOrderId
	 * @param gFMemberid
	 * @param pageSize
	 * @param currentPage
	 * @return
	 * @throws CoreServiceException
	 */
	private Map<String ,Object> getEnum(String type,Integer goodsCommonid,Integer gevalOrderId,Integer gFMemberid 
			,Integer pageSize,Integer currentPage)throws CoreServiceException{
		pageSize =ObjectUtils.isEmpty(pageSize)?0:pageSize;
		currentPage =ObjectUtils.isEmpty(currentPage)?1:currentPage;
		Map<String ,Object> dataInfo=new HashMap<String ,Object>();
		try {
			if(evalType.order.equals(type)) {
				SyEvaluateGoods sy=new SyEvaluateGoods();
				sy.setEvalType(type);
				sy.setGevalFrommemberid(gFMemberid);
				sy.setGevalOrderid(gevalOrderId);
				Integer allNum = evaluateGoods.selectNumByParam(sy);
				boolean hasNext = OrderUtil.hasNext(currentPage, pageSize, allNum);
				String next="Y";
				if(!hasNext) {
					next="N";
				}
				dataInfo.put("hasNext", next);
			}else if(evalType.goods.equals(type)) {
				SyEvaluateGoods sy=new SyEvaluateGoods();
				sy.setEvalType(type);
				sy.setGoodsCommonid(goodsCommonid);
				Integer allNum = evaluateGoods.selectNumByParam(sy);
				dataInfo.put("allNum", allNum);
			}else if(evalType.all.equals(type)) {
				SyEvaluateGoods sy=new SyEvaluateGoods();
				sy.setEvalType(type);
				sy.setGoodsCommonid(goodsCommonid);
				Integer allNum = evaluateGoods.selectNumByParam(sy);
				sy.setEvalType(evalType.well);
				Integer wellNum = evaluateGoods.selectNumByParam(sy);
				sy.setEvalType(evalType.middle);
				Integer middleNum = evaluateGoods.selectNumByParam(sy);
				sy.setEvalType(evalType.negative);
				Integer negativeNum = evaluateGoods.selectNumByParam(sy);
				sy.setEvalType(evalType.picture);
				Integer pictureNum = evaluateGoods.selectNumByParam(sy);
				boolean hasNext = OrderUtil.hasNext(currentPage, pageSize, allNum);
				String next="Y";
				if(!hasNext) {
					next="N";
				}
				dataInfo.put("hasNext", next);
				dataInfo.put("wellNum", wellNum);
				dataInfo.put("middleNum", middleNum);
				dataInfo.put("negativeNum", negativeNum);
				dataInfo.put("pictureNum", pictureNum);
			}else  {//其他的评价类型
				SyEvaluateGoods sy=new SyEvaluateGoods();
				sy.setEvalType(type);
				sy.setGoodsCommonid(goodsCommonid);
				Integer wellNum = evaluateGoods.selectNumByParam(sy);
				boolean hasNext = OrderUtil.hasNext(currentPage, pageSize, wellNum);
				String next="Y";
				if(!hasNext) {
					next="N";
				}
				dataInfo.put("hasNext", next);
			}
		}catch (CoreServiceException e) {
			logger.error(e.getMessage(),e);
			throw new CoreServiceException(EvaluateExcepType.QUERY_ERROR,"查询评论失败");
		}
		
		return dataInfo;
	}
	/**
	 * 判断评价类型
	 * @param type
	 * @return
	 */
	private   Boolean checkEvalType(String type) {
		Boolean flag=false;
		List<String> evalTypelist =new ArrayList<String>();
		evalTypelist.add(evalType.all);
		evalTypelist.add(evalType.goods);
		evalTypelist.add(evalType.well);
		evalTypelist.add(evalType.middle);
		evalTypelist.add(evalType.negative);
		evalTypelist.add(evalType.picture);
		evalTypelist.add(evalType.order);
		if(evalTypelist.contains(type)) {
			flag =true;
		}
		return flag;
	}
	/**
	 * 评价的扩展信息
	 * @param evaluateGoodsInfo
	 * @return
	 * @throws CoreServiceException
	 */
	private List<EvaluataGoodsBo> getEvaluateGoods(List<SyEvaluateGoodsBo> evaluateGoodsInfo )throws CoreServiceException{
		List<EvaluataGoodsBo> evlist= new ArrayList<EvaluataGoodsBo>();
		if(!ObjectUtils.isEmpty(evaluateGoodsInfo)) {
			List<Integer> gevalIds = new ArrayList<Integer>();
			List<Integer> orderIds = new ArrayList<Integer>();
			List<Integer> frommemberids = new ArrayList<Integer>();
			for(SyEvaluateGoodsBo bo :evaluateGoodsInfo) {
				Integer gevalId = bo.getGevalId();
				Integer gOrderId = bo.getGevalOrderid();
				Integer gevalFrommemberid = bo.getGevalFrommemberid();
				if(!ObjectUtils.isEmpty(gevalId)&&!gevalIds.contains(gevalId)) {
					gevalIds.add(gevalId);
				}
				if(!ObjectUtils.isEmpty(gOrderId)&&!orderIds.contains(gOrderId)) {
					orderIds.add(gOrderId);
				}
				if(!ObjectUtils.isEmpty(gevalFrommemberid)&&!frommemberids.contains(gevalFrommemberid)) {
					frommemberids.add(gevalFrommemberid);
				}
			}
			Map<Integer, SyOrder> orderMapByIds = queryOrder.getOrderMapByIds(orderIds);
			if(logger.isDebugEnabled()) {
				logger.info("evaluate ordermap:"+JSON.toJSONString(orderMapByIds));
			}
			Map<Integer, SyOrderGoods> orderGoodsMapByEids = queryOrder.getOrderGoodsMapByEids(gevalIds);
			if(logger.isDebugEnabled()) {
				logger.info("evaluate orderGoodsmap:"+JSON.toJSONString(orderGoodsMapByEids));
			}
			Map<Integer, SyMember> memberMapByIds = memberService.getMemberMapByIds(frommemberids);
			if(logger.isDebugEnabled()) {
				logger.info("evaluate membermap:"+JSON.toJSONString(memberMapByIds));
			}
			if(ObjectUtils.isEmpty(orderMapByIds)||ObjectUtils.isEmpty(orderGoodsMapByEids)||ObjectUtils.isEmpty(memberMapByIds)) {
				logger.info("orderMap"+orderMapByIds+"orderGoods"+orderGoodsMapByEids+"memberMap"+memberMapByIds);
				throw new CoreServiceException(EvaluateExcepType.PARAM_ERROR,"orderMap:"+orderMapByIds+"orderGoods:"+orderGoodsMapByEids+"memberMap:"+memberMapByIds+"为空！");
			}
			for(SyEvaluateGoodsBo eo:evaluateGoodsInfo) {
				Integer gevalOrderid= eo.getGevalOrderid();
				Integer gevalId = eo.getGevalId();
				Integer gevalFromid = eo.getGevalFrommemberid();
				EvaluataGoodsBo bo = new EvaluataGoodsBo(eo,memberMapByIds.get(gevalFromid),orderMapByIds.get(gevalOrderid)
						,orderGoodsMapByEids.get(gevalId));
				//showName
				SyMember syMember =memberMapByIds.get(gevalFromid);
			    String showName = userService.getUserTrueName(syMember);
			    if(logger.isDebugEnabled()) {
					logger.info("evaluate showName:"+JSON.toJSONString(showName));
				}
				Byte gevalIsanonymous = eo.getGevalIsanonymous();
				if(!ObjectUtils.isEmpty(gevalIsanonymous)&&gevalIsanonymous==1) {
					//匿名评价不显示全名
					if(!ObjectUtils.isEmpty(showName)&&!ValidUtil.validPhone(showName)&&!showName.contains("*")) {
						showName =showName.substring(0, 1)+"**";
					}
				}
				bo.setShowName(showName);
				evlist.add(bo);
			}
		}
		if(logger.isDebugEnabled()) {
			logger.info("evaluate List<EvaluataGoodsBo>:"+JSON.toJSONString(evlist));
		}
		return evlist;
	}
	
}
