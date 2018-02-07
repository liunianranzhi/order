package com.shanyuan.platform.ms.facade.statistics.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.shanyuan.platform.ms.core.constant.OrderConstant;
import com.shanyuan.platform.ms.core.constant.StatisticsConstant;
import com.shanyuan.platform.ms.core.constant.UnionConstant;
import com.shanyuan.platform.ms.core.statistics.OrderStatisticsInfoService;
import com.shanyuan.platform.ms.core.statistics.OrderStatisticsOfflineBizOrderService;
import com.shanyuan.platform.ms.core.statistics.UnionBuyerStatisticsService;
import com.shanyuan.platform.ms.core.store.InviteCircleMemberService;
import com.shanyuan.platform.ms.core.union.UnionService;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsBuyerInfo;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsInfo;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsOfflineBizOrder;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsOfflineBizOrderGoods;
import com.shanyuan.platform.ms.dao.statistics.entity.UnionBuyerStatistics;
import com.shanyuan.platform.ms.dao.union.entity.SyUnion;
import com.shanyuan.platform.ms.dao.user.entity.SyInviteCircleMember;
import com.shanyuan.platform.ms.facade.statistics.UnionBuyerStatisticsFacade;
import com.shanyuan.platform.ms.facade.statistics.impl.domain.UnionBuyerDomain;
import com.shanyuan.platform.ms.facade.union.UnionFacade;

/**
 * 联盟购买统计
 * @author FengZuo
 *
 */
@Component
public class UnionBuyerStatisticsFacadeImpl implements UnionBuyerStatisticsFacade{
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UnionBuyerStatisticsService unionBuyerStatisticsService;
	
	@Autowired
	private OrderStatisticsOfflineBizOrderService orderStatisticsOfflineBizOrderService;
	
	@Autowired
	private OrderStatisticsInfoService orderStatisticsInfoService;
	
	@Autowired
	private UnionService unionService;
	
	@Autowired
	private InviteCircleMemberService inviteCircleMemberService;
	
	@Autowired
	private UnionFacade unionFacade;
	
	/**
	 * 从base表中统计联盟购买数据插入联盟购买统计表中
	 * @author FZ
	 * @throws ParseException 
	 */

	@Override
	public void insertBuyerStatistics(Integer time){
		List<UnionBuyerStatistics> buyers = new ArrayList<UnionBuyerStatistics>();
		List<SyUnion> allUnionList = unionService.getAllUnion();
		BigDecimal range = new BigDecimal("100.00");
		Map<String, JSONObject> ykDealAmount = this.getYkDealAmount(time);
		Map<String, JSONObject> bizYkDealAmount = this.getBizYkDealAmount(time);
		if(!ObjectUtils.isEmpty(allUnionList)) {
			for (SyUnion union : allUnionList) {
				Integer unionid = union.getUnionId();
				String channel = union.getUnionChannel();
				JSONObject ydDealAmount = ykDealAmount.get(channel);
				if(ObjectUtils.isEmpty(ydDealAmount)) {
					ydDealAmount = new JSONObject();
					ydDealAmount.put("dacsOrderNum", 0);
					ydDealAmount.put("dacsGoodsNum", 0);
					ydDealAmount.put("dacsYkDeal", new BigDecimal("0.00"));
					ydDealAmount.put("dacsYkHelp", new BigDecimal("0.00"));
					ydDealAmount.put("syzxOrderNum", 0);
					ydDealAmount.put("syzxGoodsNum", 0);
					ydDealAmount.put("syzxYkDeal", new BigDecimal("0.00"));
					ydDealAmount.put("syzxYkHelp", new BigDecimal("0.00"));
					ydDealAmount.put("syscOrderNum", 0);
					ydDealAmount.put("syscGoodsNum", 0);
					ydDealAmount.put("syscYkDeal", new BigDecimal("0.00"));
					ydDealAmount.put("syscYkHelp", new BigDecimal("0.00"));
				}
				String unionName = union.getUnionName();
				Integer daOrderNums = 0;
				Integer daGoodsNums = 0;
				BigDecimal daTotalAmount = new BigDecimal(0);
				BigDecimal daHelpPrice = new BigDecimal(0);
				Integer syzxOnlineOrderNums = 0;
				Integer syzxOnlineGoodsNums = 0;
				BigDecimal syzxOnlineTotalAmount = new BigDecimal(0);
				BigDecimal syzxOnlineHelpPrice = new BigDecimal(0);
				Integer syzxOfflineOrderNums = 0;
				Integer syzxOfflineGoodsNums = 0;
				BigDecimal syzxOfflineTotalAmount = new BigDecimal(0);
				BigDecimal syzxOfflineHelpPrice = new BigDecimal(0);
				Integer syscOrderNums = 0;
				Integer syscGoodsNums = 0;
				BigDecimal syscTotalAmount = new BigDecimal(0);
				BigDecimal syscHelpPrice = new BigDecimal(0);
				
				List<OrderStatisticsBuyerInfo> list = unionBuyerStatisticsService.unionBuyerStatistics(time,channel);
				List<OrderStatisticsOfflineBizOrder> syzxOffline = orderStatisticsOfflineBizOrderService.unionBuyerOfflineInfo(time,channel);
				if(UnionConstant.OrgCode.CODE_YKJLB.equals(channel)) {
					UnionBuyerStatistics unionBuyerStatistics = new UnionBuyerStatistics(
							ObjectUtils.isEmpty(ydDealAmount.getInteger("dacsOrderNum")) ? 0 : ydDealAmount.getInteger("dacsOrderNum"), 
							ObjectUtils.isEmpty(ydDealAmount.getInteger("dacsGoodsNum")) ? 0 : ydDealAmount.getInteger("dacsGoodsNum"), 
							ObjectUtils.isEmpty(ydDealAmount.getBigDecimal("dacsYkDeal")) ? new BigDecimal("0.00") : ydDealAmount.getBigDecimal("dacsYkDeal"),
							ObjectUtils.isEmpty(ydDealAmount.getBigDecimal("dacsYkHelp")) ? new BigDecimal("0.00") : ydDealAmount.getBigDecimal("dacsYkHelp"),
							ObjectUtils.isEmpty(ydDealAmount.getInteger("syzxOrderNum")) ? 0 : ydDealAmount.getInteger("syzxOrderNum"),
							ObjectUtils.isEmpty(ydDealAmount.getInteger("syzxGoodsNum")) ? 0 : ydDealAmount.getInteger("syzxGoodsNum"),
							ObjectUtils.isEmpty(ydDealAmount.getBigDecimal("syzxYkDeal")) ? new BigDecimal("0.00") : ydDealAmount.getBigDecimal("syzxYkDeal"),
							ObjectUtils.isEmpty(ydDealAmount.getBigDecimal("syzxYkHelp")) ? new BigDecimal("0.00") : ydDealAmount.getBigDecimal("syzxYkHelp"),
							ObjectUtils.isEmpty(ydDealAmount.getInteger("syscOrderNum")) ? 0 : ydDealAmount.getInteger("syscOrderNum"), 
							ObjectUtils.isEmpty(ydDealAmount.getInteger("syscGoodsNum")) ? 0 : ydDealAmount.getInteger("syscGoodsNum"), 
							ObjectUtils.isEmpty(ydDealAmount.getBigDecimal("syscYkDeal")) ? new BigDecimal("0.00") : ydDealAmount.getBigDecimal("syscYkDeal"),
							ObjectUtils.isEmpty(ydDealAmount.getBigDecimal("syscYkHelp")) ? new BigDecimal("0.00") : ydDealAmount.getBigDecimal("syscYkHelp"),
							time, unionid, unionName, channel);
					buyers.add(unionBuyerStatistics);
					continue;
				}
				Integer ykBizOrderNum = 0;
				Integer ykBizOrderGoodsNum = 0;
				BigDecimal ykHelpPrice = new BigDecimal("0.00");
				BigDecimal ykOrderAmount = new BigDecimal("0.00");
				JSONObject jsonObject = bizYkDealAmount.get(channel);
				if(!ObjectUtils.isEmpty(jsonObject)) {
					if(!ObjectUtils.isEmpty(jsonObject.get("orderNum"))) {
						ykBizOrderNum = jsonObject.getInteger("orderNum");
					}
					if(!ObjectUtils.isEmpty(jsonObject.get("goodsNum"))) {
						ykBizOrderGoodsNum = jsonObject.getInteger("goodsNum");
					}
					if(!ObjectUtils.isEmpty(jsonObject.get("helpPrice"))) {
						ykHelpPrice = jsonObject.getBigDecimal("ykHelpPrice");
					}
					if(!ObjectUtils.isEmpty(jsonObject.get("orderAmount"))) {
						ykOrderAmount = jsonObject.getBigDecimal("ykOrderAmount");
					}
				}
				if(!ObjectUtils.isEmpty(list)) {
					for(int i = 0 ; i < list.size() ; i++) {
						//大爱超市
						if(list.get(i).getGoodsProjectType().equals(OrderConstant.ProjectType.PROJECT_TYPE_DA_SHOP) && list.get(i).getAssistId() == 0) {
							if(!ObjectUtils.isEmpty(ydDealAmount) && !ObjectUtils.isEmpty(ydDealAmount.getIntValue("dacsOrderNum"))) {
								daOrderNums = daOrderNums + list.get(i).getOrderNum() + ydDealAmount.getIntValue("dacsOrderNum");
							}else {
								daOrderNums = daOrderNums + list.get(i).getOrderNum();
							}
							if(!ObjectUtils.isEmpty(ydDealAmount) && !ObjectUtils.isEmpty(ydDealAmount.getIntValue("dacsGoodsNum"))) {
								daGoodsNums = daGoodsNums + list.get(i).getGoodsNum() + ydDealAmount.getIntValue("dacsGoodsNum");
							}else {
								daGoodsNums = daGoodsNums + list.get(i).getGoodsNum();
							}
							if(!ObjectUtils.isEmpty(ydDealAmount) && !ObjectUtils.isEmpty(ydDealAmount.getBigDecimal("dacsYkDeal"))) {
								daTotalAmount = daTotalAmount.add(list.get(i).getOrderAmount()).add(ydDealAmount.getBigDecimal("dacsYkDeal"));
							}else {
								daTotalAmount = daTotalAmount.add(list.get(i).getOrderAmount());
							}
							if(!ObjectUtils.isEmpty(ydDealAmount) && !ObjectUtils.isEmpty(ydDealAmount.getBigDecimal("dacsYkHelp"))) {
								daHelpPrice = daHelpPrice.add(list.get(i).getHelpPrice()).add(ydDealAmount.getBigDecimal("dacsYkHelp"));
							}else {
								daHelpPrice = daHelpPrice.add(list.get(i).getHelpPrice());
							}
						}
						//善源商场
						if(list.get(i).getGoodsProjectType().equals(OrderConstant.ProjectType.PROJECT_TYPE_SY_SHOP)) {
							if(!ObjectUtils.isEmpty(ydDealAmount) && !ObjectUtils.isEmpty(ydDealAmount.getIntValue("syscOrderNum"))) {
								syscOrderNums = syscOrderNums + list.get(i).getOrderNum() + ydDealAmount.getIntValue("syscOrderNum");
							}else {
								syscOrderNums += list.get(i).getOrderNum();
							}
							if(!ObjectUtils.isEmpty(ydDealAmount) && !ObjectUtils.isEmpty(ydDealAmount.getIntValue("syscGoodsNum"))) {
								syscGoodsNums = syscGoodsNums + list.get(i).getGoodsNum() + ydDealAmount.getIntValue("syscGoodsNum");
							}else {
								syscGoodsNums = syscGoodsNums + list.get(i).getGoodsNum();
							}
							if(!ObjectUtils.isEmpty(ydDealAmount) && !ObjectUtils.isEmpty(ydDealAmount.getBigDecimal("syscYkDeal"))) {
								syscTotalAmount = syscTotalAmount.add(list.get(i).getOrderAmount()).add(ydDealAmount.getBigDecimal("syscYkDeal"));
							}else {
								syscTotalAmount = syscTotalAmount.add(list.get(i).getOrderAmount());
							}
							if(!ObjectUtils.isEmpty(ydDealAmount) && !ObjectUtils.isEmpty(ydDealAmount.getBigDecimal("syscYkHelp"))) {
								syscHelpPrice = syscHelpPrice.add(list.get(i).getHelpPrice()).add(ydDealAmount.getBigDecimal("syscYkHelp"));
							}else {
								syscHelpPrice = syscHelpPrice.add(list.get(i).getHelpPrice());
							}
						}
						//善源甄选		线上
						if(list.get(i).getGoodsProjectType().equals(OrderConstant.ProjectType.PROJECT_TYPE_DA_SHOP) && list.get(i).getAssistId() > 0) {
							if(!ObjectUtils.isEmpty(ydDealAmount) && !ObjectUtils.isEmpty(ydDealAmount.getIntValue("syzxOrderNum"))) {
								syzxOnlineOrderNums = syzxOnlineOrderNums + list.get(i).getOrderNum() + ydDealAmount.getIntValue("syzxOrderNum");
							}else {
								syzxOnlineOrderNums += list.get(i).getOrderNum();
							}
							if(!ObjectUtils.isEmpty(ydDealAmount) && !ObjectUtils.isEmpty(ydDealAmount.getIntValue("syzxGoodsNum"))) {
								syzxOnlineGoodsNums = syzxOnlineGoodsNums + list.get(i).getGoodsNum() + ydDealAmount.getIntValue("syzxGoodsNum");
							}else {
								syzxOnlineGoodsNums = syzxOnlineGoodsNums + list.get(i).getGoodsNum();
							}
							if(!ObjectUtils.isEmpty(ydDealAmount) && !ObjectUtils.isEmpty(ydDealAmount.getBigDecimal("syzxYkDeal"))) {
								syzxOnlineTotalAmount = syzxOnlineTotalAmount.add(list.get(i).getOrderAmount()).add(ydDealAmount.getBigDecimal("syzxYkDeal"));
							}else {
								syzxOnlineTotalAmount = syzxOnlineTotalAmount.add(list.get(i).getOrderAmount());
							}
							if(!ObjectUtils.isEmpty(ydDealAmount) && !ObjectUtils.isEmpty(ydDealAmount.getBigDecimal("syzxYkHelp"))) {
								syzxOnlineHelpPrice = syzxOnlineHelpPrice.add(list.get(i).getHelpPrice()).add(ydDealAmount.getBigDecimal("syzxYkHelp"));
							}else {
								syzxOnlineHelpPrice = syzxOnlineHelpPrice.add(list.get(i).getHelpPrice());
							}
						}
						//善源甄选		线下
						if(!ObjectUtils.isEmpty(syzxOffline)) {
							for(OrderStatisticsOfflineBizOrder info : syzxOffline) {
								syzxOfflineTotalAmount = syzxOfflineTotalAmount.add(info.getOrderAmount()==null ? new BigDecimal(0) : info.getOrderAmount()).add(ykOrderAmount);
								syzxOfflineHelpPrice = syzxOfflineHelpPrice.add(info.getHelpPrice()==null ? new BigDecimal(0) : info.getHelpPrice()).add(ykHelpPrice);
								List<OrderStatisticsOfflineBizOrderGoods> syzxOfflineGOodsNumber = orderStatisticsOfflineBizOrderService.unionBuyerOfflineInfo(info.getMainOrderId());
								if(!CollectionUtils.isEmpty(syzxOfflineGOodsNumber)) {
									for(OrderStatisticsOfflineBizOrderGoods goodsNumber : syzxOfflineGOodsNumber) {
										syzxOfflineGoodsNums = syzxOfflineGoodsNums + goodsNumber.getGoodsNum() + ykBizOrderGoodsNum;
									}
								}
							}
							syzxOfflineOrderNums = syzxOfflineOrderNums + syzxOffline.size() + ykBizOrderNum; 
						}
					}
					UnionBuyerStatistics buyer = new UnionBuyerStatistics();
					buyer.setChannel(channel);
					buyer.setcTime(time);
					buyer.setDacsGoodsAmount(daTotalAmount.divide(range, 2, RoundingMode.DOWN));
					buyer.setDacsGoodsNum(daGoodsNums);
					buyer.setDacsHelpPrice(daHelpPrice.divide(range, 2, RoundingMode.DOWN));
					buyer.setDacsOrderNum(daOrderNums);
					buyer.setSyscGoodsAmount(syscTotalAmount.divide(range, 2, RoundingMode.DOWN));
					buyer.setSyscGoodsNum(syscGoodsNums);
					buyer.setSyscHelpPrice(syscHelpPrice.divide(range, 2, RoundingMode.DOWN));
					buyer.setSyscOrderNum(syscOrderNums);
					buyer.setSyzxGoodsAmount(syzxOnlineTotalAmount.add(syzxOfflineTotalAmount).divide(range, 2, RoundingMode.DOWN));
					buyer.setSyzxGoodsNum(syzxOnlineGoodsNums + syzxOfflineGoodsNums);
					buyer.setSyzxHelpPrice(syzxOnlineHelpPrice.add(syzxOfflineHelpPrice).divide(range, 2, RoundingMode.DOWN));
					buyer.setSyzxOrderNum(syzxOnlineOrderNums + syzxOfflineOrderNums);
					buyer.setUnionId(unionid);
					buyer.setUnionName(unionName);
					buyers.add(buyer);
				}else {
					UnionBuyerStatistics buyer = new UnionBuyerStatistics();
					buyer.setChannel(channel);
					buyer.setcTime(time);
					buyer.setDacsGoodsAmount(new BigDecimal(0));
					buyer.setDacsGoodsNum(0);
					buyer.setDacsHelpPrice(new BigDecimal(0));
					buyer.setDacsOrderNum(0);
					buyer.setSyscGoodsAmount(new BigDecimal(0));
					buyer.setSyscGoodsNum(0);
					buyer.setSyscHelpPrice(new BigDecimal(0));
					buyer.setSyscOrderNum(0);
					buyer.setSyzxGoodsAmount(new BigDecimal(0));
					buyer.setSyzxGoodsNum(0);
					buyer.setSyzxHelpPrice(new BigDecimal(0));
					buyer.setSyzxOrderNum(0);
					buyer.setUnionId(unionid);
					buyer.setUnionName(unionName);
					buyers.add(buyer);
				}
			}
		}
		Integer result = orderStatisticsInfoService.unionBuyerBatchInsert(buyers);
		if(result.equals(0)) {
			logger.info("联盟购买数据插入失败");
		}else {
			logger.info("联盟购买数据插入成功");
		}
	}
	
	/**
	 * 获取联盟购买统计数据
	 */
	@Override
	public Map<String, Object> getBuyerStatistics(Integer startTime, Integer endTime, Integer unionId,
			Integer pageNum, Integer type) {
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> buyerStatistics = unionBuyerStatisticsService.getBuyerStatistics(startTime, endTime, unionId, pageNum, type);
		@SuppressWarnings("unchecked")
		Page<UnionBuyerStatistics> page = (Page<UnionBuyerStatistics>)buyerStatistics.get("page");
		UnionBuyerStatistics sum = (UnionBuyerStatistics)buyerStatistics.get("sum");
		
		UnionBuyerDomain dacsDetails = new UnionBuyerDomain();
		UnionBuyerDomain syzxDetails = new UnionBuyerDomain();
		UnionBuyerDomain syscDetails = new UnionBuyerDomain();
		UnionBuyerDomain totalDetails = new UnionBuyerDomain();
		
		dacsDetails.setType(OrderConstant.ProjectType.PROJECT_TYPE_DA_SHOP);
		dacsDetails.setGoodsNums(sum.getDacsGoodsNum());
		dacsDetails.setOrderNums(sum.getDacsOrderNum());
		dacsDetails.setTotalAmount(sum.getDacsGoodsAmount());
		dacsDetails.setHelpPrice(sum.getDacsHelpPrice());
		
		syscDetails.setType(OrderConstant.ProjectType.PROJECT_TYPE_SY_SHOP);
		syscDetails.setGoodsNums(sum.getSyscGoodsNum());
		syscDetails.setOrderNums(sum.getSyscOrderNum());
		syscDetails.setTotalAmount(sum.getSyscGoodsAmount());
		syscDetails.setHelpPrice(sum.getSyscHelpPrice());
		
		syzxDetails.setType(30);
		syzxDetails.setGoodsNums(sum.getSyzxGoodsNum());
		syzxDetails.setOrderNums(sum.getSyzxOrderNum());
		syzxDetails.setTotalAmount(sum.getSyzxGoodsAmount());
		syzxDetails.setHelpPrice(sum.getSyzxHelpPrice());
		
		totalDetails.setType(40);
		totalDetails.setGoodsNums(sum.getDacsGoodsNum() + sum.getSyscGoodsNum() + sum.getSyzxGoodsNum());
		totalDetails.setOrderNums(sum.getDacsOrderNum() + sum.getSyscOrderNum() + sum.getSyzxOrderNum());
		totalDetails.setTotalAmount(sum.getDacsGoodsAmount().add(sum.getSyscGoodsAmount()).add(sum.getSyzxGoodsAmount()));
		totalDetails.setHelpPrice(sum.getDacsHelpPrice().add(sum.getSyscHelpPrice()).add(sum.getSyzxHelpPrice()));
		
		map.put("unionSaleStatistics", page.getResult());
		map.put("totalPage", page.getPages());
		map.put("pageNum", pageNum);
		map.put("dacs", dacsDetails);
		map.put("sysc", syscDetails);
		map.put("syzx", syzxDetails);
		map.put("total", totalDetails);
		return map;
	}
	
	private Map<String, JSONObject> getYkDealAmount(Integer time){
		Map<String, JSONObject> result = new HashMap<String, JSONObject>();
		Integer limit = 10000;
		Integer start = 0;
		List<OrderStatisticsInfo> validOrder = new ArrayList<OrderStatisticsInfo>();
		do {
			BigDecimal dacsYkDeal = new BigDecimal("0.00");
			BigDecimal syzxYkDeal = new BigDecimal("0.00");
			BigDecimal syscYkDeal = new BigDecimal("0.00");
			BigDecimal dacsYkHelp = new BigDecimal("0.00");
			BigDecimal syzxYkHelp = new BigDecimal("0.00");
			BigDecimal syscYkHelp = new BigDecimal("0.00");
			Integer dacsOrderNum = 0;
			Integer syzxOrderNum = 0;
			Integer syscOrderNum = 0;
			Integer dacsGoodsNum = 0;
			Integer syzxGoodsNum = 0;
			Integer syscGoodsNum = 0;
			validOrder = orderStatisticsInfoService.getBaseDataForYkFromTableByUnion(time, StatisticsConstant.TableName.BASE_DATA_TABLE_NAME, start, limit);
			for (OrderStatisticsInfo orderStatisticsInfo : validOrder) {
				SyInviteCircleMember inviteCircleMemberByMemberId = inviteCircleMemberService.getInviteCircleMemberByMemberId(orderStatisticsInfo.getBuyerId());
				if(!ObjectUtils.isEmpty(inviteCircleMemberByMemberId)){
					Integer invMemberId = inviteCircleMemberByMemberId.getInviteMemberId();
					String channel = unionFacade.getChannelByMemberId(invMemberId);
					JSONObject ykDealAmount = new JSONObject();
					if(!ObjectUtils.isEmpty(result.get(channel))) {
						ykDealAmount = result.get(channel);
						if(!ObjectUtils.isEmpty(ykDealAmount.get("dacsYkDeal"))) {
							dacsYkDeal = ykDealAmount.getBigDecimal("dacsYkDeal");
						}
						if(!ObjectUtils.isEmpty(ykDealAmount.get("dacsYkHelp"))) {
							dacsYkHelp = ykDealAmount.getBigDecimal("dacsYkHelp");
						}
						if(!ObjectUtils.isEmpty(ykDealAmount.get("dacsOrderNum"))) {
							dacsOrderNum = ykDealAmount.getInteger("dacsOrderNum");
						}
						if(!ObjectUtils.isEmpty(ykDealAmount.get("dacsGoodsNum"))) {
							dacsGoodsNum = ykDealAmount.getInteger("dacsGoodsNum");
						}
						
						
						if(!ObjectUtils.isEmpty(ykDealAmount.get("syzxYkDeal"))) {
							syzxYkDeal = ykDealAmount.getBigDecimal("syzxYkDeal");
						}
						if(!ObjectUtils.isEmpty(ykDealAmount.get("syzxYkHelp"))) {
							syzxYkHelp = ykDealAmount.getBigDecimal("syzxYkHelp");
						}
						if(!ObjectUtils.isEmpty(ykDealAmount.get("syzxOrderNum"))) {
							syzxOrderNum = ykDealAmount.getInteger("syzxOrderNum");
						}
						if (!ObjectUtils.isEmpty(ykDealAmount.get("syzxGoodsNum"))) {
							syzxGoodsNum = ykDealAmount.getInteger("syzxGoodsNum");
						}
						
						
						if(!ObjectUtils.isEmpty(ykDealAmount.get("syscYkDeal"))) {
							syscYkDeal = ykDealAmount.getBigDecimal("syscYkDeal");
						}
						if(!ObjectUtils.isEmpty(ykDealAmount.get("syscYkHelp"))) {
							syscYkHelp = ykDealAmount.getBigDecimal("syscYkHelp");
						}
						if(!ObjectUtils.isEmpty(ykDealAmount.get("syscOrderNum"))) {
							syscOrderNum = ykDealAmount.getInteger("syscOrderNum");
						}
						if(!ObjectUtils.isEmpty(ykDealAmount.get("syzxGoodsNum"))) {
							syscGoodsNum = ykDealAmount.getInteger("syzxGoodsNum");
						}
						
					}
					if(orderStatisticsInfo.getGoodsProjectType().equals(OrderConstant.ProjectType.PROJECT_TYPE_DA_SHOP) && orderStatisticsInfo.getAssistId() == 0) {
						dacsYkDeal = dacsYkDeal.add(orderStatisticsInfo.getOrderAmount());
						dacsYkHelp = dacsYkHelp.add(orderStatisticsInfo.getHelpPrice());
						dacsOrderNum += 1;
						dacsGoodsNum += orderStatisticsInfo.getGoodsNum();
						ykDealAmount.put("dacsYkDeal", dacsYkDeal);
						ykDealAmount.put("dacsYkHelp", dacsYkHelp);
						ykDealAmount.put("dacsOrderNum", dacsOrderNum);
						ykDealAmount.put("dacsGoodsNum", dacsGoodsNum);
					}
					if(orderStatisticsInfo.getGoodsProjectType().equals(OrderConstant.ProjectType.PROJECT_TYPE_SY_SHOP)){
						syscYkDeal = syscYkDeal.add(orderStatisticsInfo.getOrderAmount());
						syscYkHelp = syscYkHelp.add(orderStatisticsInfo.getHelpPrice());
						syscOrderNum += 1;
						syscGoodsNum += orderStatisticsInfo.getGoodsNum();
						ykDealAmount.put("syscYkDeal", syscYkDeal);
						ykDealAmount.put("syscYkHelp", syscYkHelp);
						ykDealAmount.put("syscOrderNum", syscOrderNum);
						ykDealAmount.put("syscGoodsNum", syscGoodsNum);
					}
					if(orderStatisticsInfo.getGoodsProjectType().equals(OrderConstant.ProjectType.PROJECT_TYPE_DA_SHOP) && orderStatisticsInfo.getAssistId() > 0) {
						syzxYkDeal = syzxYkDeal.add(orderStatisticsInfo.getOrderAmount());
						syzxYkHelp = syzxYkHelp.add(orderStatisticsInfo.getHelpPrice());
						syzxOrderNum += 1;
						syzxGoodsNum += orderStatisticsInfo.getGoodsNum();
						ykDealAmount.put("syzxYkDeal", syzxYkDeal);
						ykDealAmount.put("syzxYkHelp", syzxYkHelp);
						ykDealAmount.put("syzxOrderNum", syzxOrderNum);
						ykDealAmount.put("syzxGoodsNum", syzxGoodsNum);
					}
					result.put(channel, ykDealAmount);
				}else {
					JSONObject ykDealAmount = result.get(UnionConstant.OrgCode.CODE_YKJLB);
					if(!ObjectUtils.isEmpty(ykDealAmount)) {
						if(!ObjectUtils.isEmpty(ykDealAmount)) {
							if(!ObjectUtils.isEmpty(ykDealAmount.get("dacsYkDeal"))) {
								dacsYkDeal = ykDealAmount.getBigDecimal("dacsYkDeal");
							}
							if(!ObjectUtils.isEmpty(ykDealAmount.get("dacsYkHelp"))) {
								dacsYkHelp = ykDealAmount.getBigDecimal("dacsYkHelp");
							}
							if(!ObjectUtils.isEmpty(ykDealAmount.get("dacsOrderNum"))) {
								dacsOrderNum = ykDealAmount.getInteger("dacsOrderNum");
							}
							if(!ObjectUtils.isEmpty(ykDealAmount.get("dacsGoodsNum"))) {
								dacsGoodsNum = ykDealAmount.getInteger("dacsGoodsNum");
							}
							
							
							if(!ObjectUtils.isEmpty(ykDealAmount.get("syzxYkDeal"))) {
								syzxYkDeal = ykDealAmount.getBigDecimal("syzxYkDeal");
							}
							if(!ObjectUtils.isEmpty(ykDealAmount.get("syzxYkHelp"))) {
								syzxYkHelp = ykDealAmount.getBigDecimal("syzxYkHelp");
							}
							if(!ObjectUtils.isEmpty(ykDealAmount.get("syzxOrderNum"))) {
								syzxOrderNum = ykDealAmount.getInteger("syzxOrderNum");
							}
							if (!ObjectUtils.isEmpty(ykDealAmount.get("syzxGoodsNum"))) {
								syzxGoodsNum = ykDealAmount.getInteger("syzxGoodsNum");
							}
							
							
							if(!ObjectUtils.isEmpty(ykDealAmount.get("syscYkDeal"))) {
								syscYkDeal = ykDealAmount.getBigDecimal("syscYkDeal");
							}
							if(!ObjectUtils.isEmpty(ykDealAmount.get("syscYkHelp"))) {
								syscYkHelp = ykDealAmount.getBigDecimal("syscYkHelp");
							}
							if(!ObjectUtils.isEmpty(ykDealAmount.get("syscOrderNum"))) {
								syscOrderNum = ykDealAmount.getInteger("syscOrderNum");
							}
							if(!ObjectUtils.isEmpty(ykDealAmount.get("syzxGoodsNum"))) {
								syscGoodsNum = ykDealAmount.getInteger("syzxGoodsNum");
							}
						}
						if(orderStatisticsInfo.getGoodsProjectType().equals(OrderConstant.ProjectType.PROJECT_TYPE_DA_SHOP) && orderStatisticsInfo.getAssistId() == 0) {
							dacsYkDeal = dacsYkDeal.add(orderStatisticsInfo.getOrderAmount());
							dacsYkHelp = dacsYkHelp.add(orderStatisticsInfo.getHelpPrice());
							dacsOrderNum += 1;
							dacsGoodsNum += orderStatisticsInfo.getGoodsNum();
							ykDealAmount.put("dacsYkDeal", dacsYkDeal);
							ykDealAmount.put("dacsYkHelp", dacsYkHelp);
							ykDealAmount.put("dacsOrderNum", dacsOrderNum);
							ykDealAmount.put("dacsGoodsNum", dacsGoodsNum);
						}
						if(orderStatisticsInfo.getGoodsProjectType().equals(OrderConstant.ProjectType.PROJECT_TYPE_SY_SHOP)){
							syscYkDeal = syscYkDeal.add(orderStatisticsInfo.getOrderAmount());
							syscYkHelp = syscYkHelp.add(orderStatisticsInfo.getHelpPrice());
							syscOrderNum += 1;
							syscGoodsNum += orderStatisticsInfo.getGoodsNum();
							ykDealAmount.put("syscYkDeal", syscYkDeal);
							ykDealAmount.put("syscYkHelp", syscYkHelp);
							ykDealAmount.put("syscOrderNum", syscOrderNum);
							ykDealAmount.put("syscGoodsNum", syscGoodsNum);
						}
						if(orderStatisticsInfo.getGoodsProjectType().equals(OrderConstant.ProjectType.PROJECT_TYPE_DA_SHOP) && orderStatisticsInfo.getAssistId() > 0) {
							syzxYkDeal = syzxYkDeal.add(orderStatisticsInfo.getOrderAmount());
							syzxYkHelp = syzxYkHelp.add(orderStatisticsInfo.getHelpPrice());
							syzxOrderNum += 1;
							syzxGoodsNum += orderStatisticsInfo.getGoodsNum();
							ykDealAmount.put("syzxYkDeal", syzxYkDeal);
							ykDealAmount.put("syzxYkHelp", syzxYkHelp);
							ykDealAmount.put("syzxOrderNum", syzxOrderNum);
							ykDealAmount.put("syzxGoodsNum", syzxGoodsNum);
						}
					}
					result.put(UnionConstant.OrgCode.CODE_YKJLB, ykDealAmount);
				}
			}
			start += limit;
		} while (validOrder.size() == limit);
		return result;
	}
	
	private Map<String, JSONObject> getBizYkDealAmount(Integer time){
		Map<String, JSONObject> result = new HashMap<String, JSONObject>();
		List<OrderStatisticsOfflineBizOrder> unionBuyerOfflineInfo = orderStatisticsOfflineBizOrderService.unionBuyerOfflineInfo(time, UnionConstant.OrgCode.CODE_YKJLB);
		for (OrderStatisticsOfflineBizOrder orderStatisticsOfflineBizOrder : unionBuyerOfflineInfo) {
			SyInviteCircleMember inviteCircleMemberByMemberId = inviteCircleMemberService.getInviteCircleMemberByMemberId(orderStatisticsOfflineBizOrder.getBuyerId());
			BigDecimal orderAmount = orderStatisticsOfflineBizOrder.getOrderAmount();
			BigDecimal helpPrice = orderStatisticsOfflineBizOrder.getHelpPrice();
			Integer goodsNum = this.getGoodsNum(orderStatisticsOfflineBizOrder.getMainOrderId());
			Integer orderNum = 0;
			JSONObject jsonObject = new JSONObject();
			if(!ObjectUtils.isEmpty(inviteCircleMemberByMemberId)) {
				Integer invMemberId = inviteCircleMemberByMemberId.getInviteMemberId();
				String channel = unionFacade.getChannelByMemberId(invMemberId);
				jsonObject = result.get(channel);
				if(!ObjectUtils.isEmpty(jsonObject.get("orderNum"))) {
					orderNum += jsonObject.getInteger("orderNum");
				}else {
					orderNum += 1;
				}
				if(!ObjectUtils.isEmpty(jsonObject.get("goodsNum"))) {
					goodsNum += jsonObject.getInteger("goodsNum");
				}
				if(!ObjectUtils.isEmpty(jsonObject.get("helpPrice"))) {
					helpPrice = jsonObject.getBigDecimal("helpPrice").add(helpPrice);
				}
				if(!ObjectUtils.isEmpty(result.get(channel).get("orderAmount"))) {
					orderAmount = jsonObject.getBigDecimal("orderAmount").add(orderAmount);
				}
				jsonObject.put("orderNum", orderNum);
				jsonObject.put("goodsNum", goodsNum);
				jsonObject.put("helpPrice", helpPrice);
				jsonObject.put("orderAmount", orderAmount);
				result.put(channel, jsonObject);
			}else {
				if(!ObjectUtils.isEmpty(result.get(UnionConstant.OrgCode.CODE_YKJLB).get("orderNum"))) {
					orderNum += ((JSONObject) result.get(UnionConstant.OrgCode.CODE_YKJLB)).getInteger("orderNum");
				}else {
					orderNum += 1;
				}
				if(!ObjectUtils.isEmpty(result.get(UnionConstant.OrgCode.CODE_YKJLB).get("goodsNum"))) {
					goodsNum += ((JSONObject) result.get(UnionConstant.OrgCode.CODE_YKJLB)).getInteger("goodsNum");
				}
				if(!ObjectUtils.isEmpty(result.get(UnionConstant.OrgCode.CODE_YKJLB).get("helpPrice"))) {
					helpPrice = ((JSONObject) result.get(UnionConstant.OrgCode.CODE_YKJLB)).getBigDecimal("helpPrice").add(helpPrice);
				}
				if(!ObjectUtils.isEmpty(result.get(UnionConstant.OrgCode.CODE_YKJLB).get("orderAmount"))) {
					orderAmount = ((JSONObject) result.get(UnionConstant.OrgCode.CODE_YKJLB)).getBigDecimal("orderAmount").add(orderAmount);
				}
				jsonObject.put("orderNum", orderNum);
				jsonObject.put("goodsNum", goodsNum);
				jsonObject.put("helpPrice", helpPrice);
				jsonObject.put("orderAmount", orderAmount);
				result.put(UnionConstant.OrgCode.CODE_YKJLB, jsonObject);
			}
		}
		return result;
	}
	
	private Integer getGoodsNum(Integer orderId) {
		Integer goodsNum = 0;
		List<OrderStatisticsOfflineBizOrderGoods> bizOrderGoods = orderStatisticsOfflineBizOrderService.getBizOrderGoods(orderId);
		for (OrderStatisticsOfflineBizOrderGoods orderStatisticsOfflineBizOrderGoods : bizOrderGoods) {
			goodsNum += orderStatisticsOfflineBizOrderGoods.getGoodsNum();
		}
		return goodsNum;
	}
	
}
