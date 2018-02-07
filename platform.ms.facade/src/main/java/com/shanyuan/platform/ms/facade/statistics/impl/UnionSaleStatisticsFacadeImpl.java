package com.shanyuan.platform.ms.facade.statistics.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import com.github.pagehelper.Page;
import com.shanyuan.platform.ms.core.constant.OrderConstant;
import com.shanyuan.platform.ms.core.constant.StatisticsConstant;
import com.shanyuan.platform.ms.core.constant.UnionConstant;
import com.shanyuan.platform.ms.core.constant.enums.SellerType;
import com.shanyuan.platform.ms.core.statistics.OrderStatisticsInfoService;
import com.shanyuan.platform.ms.core.statistics.UnionSaleStatisticsService;
import com.shanyuan.platform.ms.core.union.AreaChannelService;
import com.shanyuan.platform.ms.core.union.UnionService;
import com.shanyuan.platform.ms.core.user.RoleService;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsBuyerInfo;
import com.shanyuan.platform.ms.dao.statistics.entity.UnionSaleStatistics;
import com.shanyuan.platform.ms.dao.union.entity.SyAreaChannel;
import com.shanyuan.platform.ms.dao.union.entity.SyUnion;
import com.shanyuan.platform.ms.dao.user.entity.SyRole;
import com.shanyuan.platform.ms.facade.statistics.UnionSaleStatisticsFacade;
import com.shanyuan.platform.ms.facade.statistics.impl.domain.UnionSellerDomain;

/**
 * 联盟销售统计
 * @author FengZuo
 *
 */
@Component
public class UnionSaleStatisticsFacadeImpl implements UnionSaleStatisticsFacade{
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private OrderStatisticsInfoService orderStatisticsInfoService;
	
	@Autowired
	private UnionSaleStatisticsService unionSaleStatisticsService;
	
	@Autowired
	private UnionService unionService;
	
	@Autowired
	private AreaChannelService areaChannelService;
	
	@Autowired
	private RoleService roleService;
	
	/**
	 * 统计数据，插入联盟销售统计表中
	 * @author FZ
	 * @throws ParseException 
	 */

	@Override
	public void insertSaleStatistics(Integer time){
		List<UnionSaleStatistics> sales = new ArrayList<UnionSaleStatistics>();
		List<SyUnion> allUnionList = unionService.getAllUnion();
		BigDecimal range = new BigDecimal("100.00");
		//遍历联盟
		if(!ObjectUtils.isEmpty(allUnionList)) {
			for (SyUnion union : allUnionList) {
				Integer unionid = union.getUnionId();
				String channel = union.getUnionChannel();
				String unionName = union.getUnionName();
				if(!ObjectUtils.isEmpty(channel)) {
					List<SyAreaChannel> listAreaChannel = areaChannelService.listAreaChannel(channel, UnionConstant.UnionSupportType.SUPPORT);
					if(!ObjectUtils.isEmpty(listAreaChannel)) {
						for (SyAreaChannel syAreaChannel : listAreaChannel) {
							//获取地区
							Long countryid = syAreaChannel.getAreaId();
							String areaName = syAreaChannel.getAreaName();
							
							List<OrderStatisticsBuyerInfo> list = unionSaleStatisticsService.unionSaleStatistics(time,unionid,countryid);
							List<OrderStatisticsBuyerInfo> selfHelp = unionSaleStatisticsService.unionSelfHelpStatistics(time,unionid,countryid);
							
							//定义订单量、销售量、销售额、帮扶金、自帮扶（四组）
							Integer assistOrderNums = 0;
							Integer assistGoodsNums = 0;
							BigDecimal assistTotalAmount = new BigDecimal(0);
							BigDecimal assistHelpPrice = new BigDecimal(0);
							BigDecimal assistSelfHelpPrice = new BigDecimal(0);
							
							Integer poorOrderNums = 0;
							Integer poorGoodsNums = 0;
							BigDecimal poorTotalAmount = new BigDecimal(0);
							BigDecimal poorSelfHelpPrice = new BigDecimal(0);
							
							Integer onlineOrderNums = 0;
							Integer onlineGoodsNums = 0;
							BigDecimal onlineTotalAmount = new BigDecimal(0);
							BigDecimal onlineHelpPrice = new BigDecimal(0);
							BigDecimal onlineSelfHelpPrice = new BigDecimal(0);
							
							Integer offlineOrderNums = 0;
							Integer offlineGoodsNums = 0;
							BigDecimal offlineTotalAmount = new BigDecimal(0);
							BigDecimal offlineHelpPrice = new BigDecimal(0);
							BigDecimal offlineSelfHelpPrice = new BigDecimal(0);
							if(!CollectionUtils.isEmpty(list)) {
								for(int i = 0 ; i < list.size() ; i++) {
									//大爱超市	助理人
									if(list.get(i).getGoodsProjectType().equals(OrderConstant.ProjectType.PROJECT_TYPE_DA_SHOP) && list.get(i).getAssistId().equals(StatisticsConstant.AssistId.ASSIST_ID_0) && list.get(i).getSellerType().equals(SellerType.agent.getCode())) {
										assistOrderNums += list.get(i).getOrderNum();
										assistGoodsNums += list.get(i).getGoodsNum();
										assistTotalAmount = assistTotalAmount.add(list.get(i).getOrderAmount());
										assistHelpPrice = assistHelpPrice.add(list.get(i).getHelpPrice());
										if(!CollectionUtils.isEmpty(selfHelp)) {
											for(OrderStatisticsBuyerInfo info : selfHelp) {
												if(info.getGoodsProjectType().equals(OrderConstant.ProjectType.PROJECT_TYPE_DA_SHOP) && info.getAssistId().equals(StatisticsConstant.AssistId.ASSIST_ID_0) && info.getSellerType().equals(SellerType.agent.getCode())) {
													assistSelfHelpPrice = assistSelfHelpPrice.add(info.getHelpPrice() == null ? new BigDecimal(0) : info.getHelpPrice());
												}
											}
										}
									}
									//大爱超市	贫困户
									if(list.get(i).getGoodsProjectType().equals(OrderConstant.ProjectType.PROJECT_TYPE_DA_SHOP) && list.get(i).getAssistId().equals(StatisticsConstant.AssistId.ASSIST_ID_0) && list.get(i).getSellerType().equals(SellerType.poor.getCode())) {
										poorOrderNums += list.get(i).getOrderNum();
										poorGoodsNums += list.get(i).getGoodsNum();
										poorTotalAmount = poorTotalAmount.add(list.get(i).getOrderAmount()==null?new BigDecimal(0):list.get(i).getOrderAmount());
										if(!CollectionUtils.isEmpty(selfHelp)) {
											for(OrderStatisticsBuyerInfo info : selfHelp) {
												if(info.getGoodsProjectType().equals(OrderConstant.ProjectType.PROJECT_TYPE_DA_SHOP) && info.getAssistId().equals(StatisticsConstant.AssistId.ASSIST_ID_0) && info.getSellerType().equals(SellerType.poor.getCode())) {
													poorSelfHelpPrice = poorSelfHelpPrice.add(info.getHelpPrice() == null ? new BigDecimal(0) : info.getHelpPrice());
												}
											}
										}
									}
									//善源甄选	线上
									if(list.get(i).getGoodsProjectType().equals(OrderConstant.ProjectType.PROJECT_TYPE_DA_SHOP) && list.get(i).getAssistId() > StatisticsConstant.AssistId.ASSIST_ID_0) {
										onlineOrderNums += list.get(i).getOrderNum();
										onlineGoodsNums += list.get(i).getGoodsNum();
										onlineTotalAmount = onlineTotalAmount.add(list.get(i).getOrderAmount()==null?new BigDecimal(0):list.get(i).getOrderAmount());
										onlineHelpPrice = onlineHelpPrice.add(list.get(i).getHelpPrice()==null?new BigDecimal(0):list.get(i).getHelpPrice());
										if(!CollectionUtils.isEmpty(selfHelp)) {
											for(OrderStatisticsBuyerInfo info : selfHelp) {
												if(info.getGoodsProjectType().equals(OrderConstant.ProjectType.PROJECT_TYPE_DA_SHOP) && info.getAssistId().equals(StatisticsConstant.AssistId.ASSIST_ID_0)) {
													onlineSelfHelpPrice = onlineSelfHelpPrice.add(info.getHelpPrice() == null ? new BigDecimal(0) : info.getHelpPrice());
												}
											}
										}
									}
									if(!ObjectUtils.isEmpty(countryid)) {
										List<SyRole> roleInfo = roleService.getRoleInfo(countryid);
										if(!ObjectUtils.isEmpty(roleInfo)) {
											for(SyRole role : roleInfo) {
												Integer assistid = role.getMemberId();
												if(!ObjectUtils.isEmpty(assistid)) {
													//善源甄选	线下	信息
													List<OrderStatisticsBuyerInfo> offline = unionSaleStatisticsService.selectFromOfflineInfo(time,assistid,countryid);
													//善源甄选	线下	数量
													List<OrderStatisticsBuyerInfo> goodsNum = unionSaleStatisticsService.selectFromOfflineGoodsNum(time,assistid,countryid);
													//善源甄选	线下	自帮扶
													List<OrderStatisticsBuyerInfo> selfPrice = unionSaleStatisticsService.selectSelfPrice(time,assistid,countryid);
													//善源甄选	线下
													if(!ObjectUtils.isEmpty(offline)) {
														for(OrderStatisticsBuyerInfo info : offline) {
															offlineOrderNums ++;
															offlineTotalAmount = offlineTotalAmount.add(info.getOrderAmount()==null?new BigDecimal(0):info.getOrderAmount());
															offlineHelpPrice = offlineHelpPrice.add(info.getHelpPrice()==null?new BigDecimal(0):info.getHelpPrice());
														}
													}
													if(!ObjectUtils.isEmpty(goodsNum)) {
														for(OrderStatisticsBuyerInfo info : goodsNum) {
															offlineGoodsNums += info.getGoodsNum();
														}
													}
													if(!ObjectUtils.isEmpty(selfPrice)) {
														for(OrderStatisticsBuyerInfo info : selfPrice) {
															offlineSelfHelpPrice = offlineSelfHelpPrice.add(info.getSelfHelpPrice()==null?new BigDecimal(0):info.getSelfHelpPrice());
														}
													}
												}
											}
										}
									}
								}
								UnionSaleStatistics sale = new UnionSaleStatistics();
								sale.setAreaId(countryid);
								sale.setAreaName(areaName);
								sale.setcTime(time);
								sale.setAssistHelpPrice(assistHelpPrice.divide(range, 2, RoundingMode.DOWN));
								sale.setAssistOrderNum(assistOrderNums);
								sale.setAssistSaleAmount(assistTotalAmount.divide(range, 2, RoundingMode.DOWN));
								sale.setAssistSaleNum(assistGoodsNums);
								sale.setAssistSelfHelpPrice(assistSelfHelpPrice.divide(range, 2, RoundingMode.DOWN));
								sale.setPoorOrderNum(poorOrderNums);
								sale.setPoorSaleAmount(poorTotalAmount.divide(range, 2, RoundingMode.DOWN));
								sale.setPoorSaleNum(poorGoodsNums);
								sale.setPoorSelfHelpPrice(poorSelfHelpPrice.divide(range, 2, RoundingMode.DOWN));
								sale.setSyzxOfflineHelpPrice(offlineHelpPrice.divide(range, 2, RoundingMode.DOWN));
								sale.setSyzxOfflineOrderNum(offlineOrderNums);
								sale.setSyzxOfflineSaleAmount(offlineTotalAmount.divide(range, 2, RoundingMode.DOWN));
								sale.setSyzxOfflineSaleNum(offlineGoodsNums);
								sale.setSyzxOfflineSelfHelpPrice(offlineSelfHelpPrice.divide(range, 2, RoundingMode.DOWN));
								sale.setSyzxOnlineHelpPrice(onlineHelpPrice.divide(range, 2, RoundingMode.DOWN));
								sale.setSyzxOnlineOrderNum(onlineOrderNums);
								sale.setSyzxOnlineSaleAmount(onlineTotalAmount.divide(range, 2, RoundingMode.DOWN));
								sale.setSyzxOnlineSaleNum(onlineGoodsNums);
								sale.setSyzxOnlineSelfHelpPrice(onlineSelfHelpPrice.divide(range, 2, RoundingMode.DOWN));
								sale.setUnionId(unionid);
								sale.setUnionName(unionName);
								sale.setChannel(channel);
								sales.add(sale);
							}else {
								UnionSaleStatistics sale = new UnionSaleStatistics();
								sale.setAreaId(countryid);
								sale.setAreaName(areaName);
								sale.setcTime(time);
								sale.setAssistHelpPrice(new BigDecimal(0));
								sale.setAssistOrderNum(0);
								sale.setAssistSaleAmount(new BigDecimal(0));
								sale.setAssistSaleNum(0);
								sale.setAssistSelfHelpPrice(new BigDecimal(0));
								sale.setPoorOrderNum(0);
								sale.setPoorSaleAmount(new BigDecimal(0));
								sale.setPoorSaleNum(0);
								sale.setPoorSelfHelpPrice(new BigDecimal(0));
								sale.setSyzxOfflineHelpPrice(new BigDecimal(0));
								sale.setSyzxOfflineOrderNum(0);
								sale.setSyzxOfflineSaleAmount(new BigDecimal(0));
								sale.setSyzxOfflineSaleNum(0);
								sale.setSyzxOfflineSelfHelpPrice(new BigDecimal(0));
								sale.setSyzxOnlineHelpPrice(new BigDecimal(0));
								sale.setSyzxOnlineOrderNum(0);
								sale.setSyzxOnlineSaleAmount(new BigDecimal(0));
								sale.setSyzxOnlineSaleNum(0);
								sale.setSyzxOnlineSelfHelpPrice(new BigDecimal(0));
								sale.setUnionId(unionid);
								sale.setUnionName(unionName);
								sale.setChannel(channel);
								sales.add(sale);
							}
						}
					}
				}
			}
		}
		Integer result = orderStatisticsInfoService.unionSaleBatchInsert(sales);
		if(result == 0) {
			logger.info("联盟销售数据插入失败");
		}else {
			logger.info("联盟销售数据插入成功"); 
		}
	}
	
	/**
	 * 获取联盟销售统计表数据
	 * @author FengZuo
	 */
	@Override
	public Map<String, Object> getSaleStatistics(Integer startTime,Integer endTime,Integer unionId,Long areaId,Integer pageNum, Integer type) {
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> saleStatistics = unionSaleStatisticsService.getSaleStatistics(startTime, endTime, unionId, areaId,pageNum, type);
		@SuppressWarnings("unchecked")
		Page<UnionSaleStatistics> page = (Page<UnionSaleStatistics>)saleStatistics.get("page");
		UnionSaleStatistics result = (UnionSaleStatistics)saleStatistics.get("sum");
		
		UnionSellerDomain assistDetails = new UnionSellerDomain();
		UnionSellerDomain poorDetails = new UnionSellerDomain();
		UnionSellerDomain onlineDetails = new UnionSellerDomain();
		UnionSellerDomain offlineDetails = new UnionSellerDomain();
		UnionSellerDomain dacsDetails = new UnionSellerDomain();
		UnionSellerDomain syzxDetails = new UnionSellerDomain();
		UnionSellerDomain totalDetails = new UnionSellerDomain();
		
		//定义订单量、销售量、销售额、帮扶金、自帮扶（七组）
		Integer assistOrderNums = 0;
		Integer assistGoodsNums = 0;
		BigDecimal assistTotalAmount = new BigDecimal(0);
		BigDecimal assistHelpPrice = new BigDecimal(0);
		BigDecimal assistSelfHelpPrice = new BigDecimal(0);
		
		Integer poorOrderNums = 0;
		Integer poorGoodsNums = 0;
		BigDecimal poorTotalAmount = new BigDecimal(0);
		BigDecimal poorSelfHelpPrice = new BigDecimal(0);
		
		Integer onlineOrderNums = 0;
		Integer onlineGoodsNums = 0;
		BigDecimal onlineTotalAmount = new BigDecimal(0);
		BigDecimal onlineHelpPrice = new BigDecimal(0);
		BigDecimal onlineSelfHelpPrice = new BigDecimal(0);
		
		Integer offlineOrderNums = 0;
		Integer offlineGoodsNums = 0;
		BigDecimal offlineTotalAmount = new BigDecimal(0);
		BigDecimal offlineHelpPrice = new BigDecimal(0);
		BigDecimal offlineSelfHelpPrice = new BigDecimal(0);
		
		Integer dacsOrderNums = 0;
		Integer dacsSaleNums = 0;
		BigDecimal dacsSaleAmount = new BigDecimal(0);
		BigDecimal dacsHelpPrice = new BigDecimal(0);
		BigDecimal dacsSelfHelpPrice = new BigDecimal(0);
		
		Integer syzxOrderNums = 0;
		Integer syzxGoodsNums = 0;
		BigDecimal syzxTotalAmount = new BigDecimal(0);
		BigDecimal syzxHelpPrice = new BigDecimal(0);
		BigDecimal syzxSelfHelpPrice = new BigDecimal(0);
		
		Integer totalOrderNums = 0;
		Integer totalGoodsNums = 0;
		BigDecimal totalTotalAmount = new BigDecimal(0);
		BigDecimal totalHelpPrice = new BigDecimal(0);
		BigDecimal totalSelfHelpPrice = new BigDecimal(0);
		if(!ObjectUtils.isEmpty(result)) {
			
			assistOrderNums = result.getAssistOrderNum();
			assistGoodsNums = result.getAssistSaleNum();
			assistTotalAmount = assistTotalAmount.add(result.getAssistSaleAmount());
			assistHelpPrice = assistHelpPrice.add(result.getAssistHelpPrice());
			assistSelfHelpPrice = assistSelfHelpPrice.add(result.getAssistSelfHelpPrice());
			
			poorOrderNums = result.getPoorOrderNum();
			poorGoodsNums = result.getPoorSaleNum();
			poorTotalAmount = poorTotalAmount.add(result.getPoorSaleAmount());
			poorSelfHelpPrice = poorSelfHelpPrice.add(result.getPoorSelfHelpPrice());
			
			onlineOrderNums = result.getSyzxOnlineOrderNum();
			onlineGoodsNums = result.getSyzxOnlineSaleNum();
			onlineTotalAmount = onlineTotalAmount.add(result.getSyzxOnlineSaleAmount());
			onlineHelpPrice = onlineHelpPrice.add(result.getSyzxOnlineHelpPrice());
			onlineSelfHelpPrice = onlineSelfHelpPrice.add(result.getSyzxOnlineSelfHelpPrice());
			
			offlineOrderNums = result.getSyzxOfflineOrderNum();
			offlineGoodsNums = result.getSyzxOfflineSaleNum();
			offlineTotalAmount = offlineTotalAmount.add(result.getSyzxOfflineSaleAmount());
			offlineHelpPrice = offlineHelpPrice.add(result.getSyzxOfflineSelfHelpPrice());
			offlineSelfHelpPrice = offlineSelfHelpPrice.add(result.getSyzxOfflineSelfHelpPrice());
		}
		
		dacsOrderNums = assistOrderNums + poorOrderNums;
		dacsSaleNums = assistGoodsNums + poorGoodsNums;
		dacsSaleAmount = dacsSaleAmount.add(assistTotalAmount).add(poorTotalAmount);
		dacsHelpPrice = dacsHelpPrice.add(assistHelpPrice);
		dacsSelfHelpPrice = dacsSelfHelpPrice.add(assistSelfHelpPrice).add(poorSelfHelpPrice);
		
		syzxOrderNums = onlineOrderNums + offlineOrderNums;
		syzxGoodsNums = onlineGoodsNums + offlineGoodsNums;
		syzxTotalAmount = syzxTotalAmount.add(onlineTotalAmount).add(offlineTotalAmount);
		syzxHelpPrice = syzxHelpPrice.add(onlineHelpPrice).add(offlineHelpPrice);
		syzxSelfHelpPrice = syzxSelfHelpPrice.add(onlineSelfHelpPrice).add(offlineSelfHelpPrice);
		
		totalOrderNums = assistOrderNums + poorOrderNums + onlineOrderNums + offlineOrderNums;
		totalGoodsNums = assistGoodsNums + poorGoodsNums + onlineGoodsNums + offlineGoodsNums;
		totalTotalAmount = totalTotalAmount.add(assistTotalAmount).add(poorTotalAmount).add(onlineTotalAmount).add(offlineTotalAmount);
		totalHelpPrice = totalHelpPrice.add(assistHelpPrice).add(onlineHelpPrice).add(offlineHelpPrice);
		totalSelfHelpPrice = totalSelfHelpPrice.add(assistSelfHelpPrice).add(poorSelfHelpPrice).add(onlineSelfHelpPrice).add(offlineSelfHelpPrice);
		
		//实体类保存结果(七组)
		assistDetails.setType(10);
		assistDetails.setGoodsNums(assistGoodsNums);
		assistDetails.setOrderNums(assistOrderNums);
		assistDetails.setTotalAmount(assistTotalAmount);
		assistDetails.setHelpPrice(assistHelpPrice);
		assistDetails.setSelfHelpPrice(assistSelfHelpPrice);
		
		poorDetails.setType(20);
		poorDetails.setGoodsNums(poorGoodsNums);
		poorDetails.setOrderNums(poorOrderNums);
		poorDetails.setTotalAmount(poorTotalAmount);
		poorDetails.setHelpPrice(new BigDecimal(0));
		poorDetails.setSelfHelpPrice(poorSelfHelpPrice);
		
		onlineDetails.setType(30);
		onlineDetails.setGoodsNums(onlineGoodsNums);
		onlineDetails.setOrderNums(onlineOrderNums);
		onlineDetails.setTotalAmount(onlineTotalAmount);
		onlineDetails.setHelpPrice(onlineHelpPrice);
		onlineDetails.setSelfHelpPrice(onlineSelfHelpPrice);
		
		offlineDetails.setType(40);
		offlineDetails.setGoodsNums(offlineGoodsNums);
		offlineDetails.setOrderNums(offlineOrderNums);
		offlineDetails.setTotalAmount(offlineTotalAmount);
		offlineDetails.setHelpPrice(offlineHelpPrice);
		offlineDetails.setSelfHelpPrice(offlineSelfHelpPrice);
		
		dacsDetails.setType(50);
		dacsDetails.setGoodsNums(dacsSaleNums);
		dacsDetails.setOrderNums(dacsOrderNums);
		dacsDetails.setTotalAmount(dacsSaleAmount);
		dacsDetails.setHelpPrice(dacsHelpPrice);
		dacsDetails.setSelfHelpPrice(dacsSelfHelpPrice);
		
		syzxDetails.setType(60);
		syzxDetails.setGoodsNums(syzxGoodsNums);
		syzxDetails.setOrderNums(syzxOrderNums);
		syzxDetails.setTotalAmount(syzxTotalAmount);
		syzxDetails.setHelpPrice(syzxHelpPrice);
		syzxDetails.setSelfHelpPrice(syzxSelfHelpPrice);
		
		totalDetails.setType(70);
		totalDetails.setGoodsNums(totalGoodsNums);
		totalDetails.setOrderNums(totalOrderNums);
		totalDetails.setTotalAmount(totalTotalAmount);
		totalDetails.setHelpPrice(totalHelpPrice);
		totalDetails.setSelfHelpPrice(totalSelfHelpPrice);
		
		map.put("unionSaleStatistics", page.getResult());
		map.put("totalPage", page.getPages());
		map.put("pageNum", pageNum);
		map.put("assist", assistDetails);
		map.put("poor", poorDetails);
		map.put("online", onlineDetails);
		map.put("offline", offlineDetails);
		map.put("dacs", dacsDetails);
		map.put("syzx", syzxDetails);
		map.put("total", totalDetails);
		return map;
	}
	
}
