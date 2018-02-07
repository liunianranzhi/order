package com.shanyuan.platform.ms.facade.statistics.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shanyuan.platform.ms.core.constant.GoodsConstant;
import com.shanyuan.platform.ms.core.constant.OrderConstant;
import com.shanyuan.platform.ms.core.constant.StatisticsConstant;
import com.shanyuan.platform.ms.core.constant.UnionConstant;
import com.shanyuan.platform.ms.core.constant.enums.SellerType;
import com.shanyuan.platform.ms.core.goods.SyGoodsCommonService;
import com.shanyuan.platform.ms.core.goods.SySupportAreaService;
import com.shanyuan.platform.ms.core.statistics.OrderStatisticsInfoService;
import com.shanyuan.platform.ms.core.statistics.OrderStatisticsOfflineBizOrderService;
import com.shanyuan.platform.ms.core.statistics.ProvideStatisticsService;
import com.shanyuan.platform.ms.core.store.CircleService;
import com.shanyuan.platform.ms.core.union.AreaChannelService;
import com.shanyuan.platform.ms.core.user.RoleService;
import com.shanyuan.platform.ms.core.user.SyPoorService;
import com.shanyuan.platform.ms.dao.goods.entity.SySupportArea;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsInfo;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsOfflineBizOrder;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsOfflineBizOrderGoods;
import com.shanyuan.platform.ms.dao.statistics.entity.ProvideStatisticsBaseData;
import com.shanyuan.platform.ms.dao.user.entity.SyCircle;
import com.shanyuan.platform.ms.facade.statistics.ProvideStatisticsFacade;

@Component
public class ProvideStatisticsFacadeImpl implements ProvideStatisticsFacade {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private AreaChannelService areaChannelService;
	
	@Autowired
	private SySupportAreaService sySupportAreaService;
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private SyPoorService poorService;
	
	@Autowired
	private SyGoodsCommonService syGoodsCommonService;
	
	@Autowired
	private OrderStatisticsInfoService orderStatisticsInfoService;
	
	@Autowired
	private ProvideStatisticsService provideStatisticsService;
	
	@Autowired
	private OrderStatisticsOfflineBizOrderService orderStatisticsOfflineBizOrderService;
	
	@Autowired
	private CircleService circleService;
	
	@Override
	public List<ProvideStatisticsBaseData> getValidData(Integer time) {
		List<ProvideStatisticsBaseData> result = new ArrayList<ProvideStatisticsBaseData>();
		List<Long> areaIds = areaChannelService.getDistinctAreaId(UnionConstant.UnionSupportType.GAVE);
		for (Long areaId : areaIds) {
			Map<String, BigDecimal> sellAmount = getSellAmount(time, areaId);
			BigDecimal offlineTotalAmount = getOfflineTotalAmount(time, areaId);
			BigDecimal assistSellDa = sellAmount.get("assistSellDa");
			BigDecimal assistSellZx = sellAmount.get("assistSellZx").add(getOfflineTotalAmount(time, areaId));
			BigDecimal assistHelpDa = sellAmount.get("assistHelpDa");
			BigDecimal assistHelpZx = sellAmount.get("assistSellZx").add(offlineTotalAmount.multiply(new BigDecimal("0.1")));
			SySupportArea supportArea = sySupportAreaService.getSupportAreaByCountryId(areaId);
			ProvideStatisticsBaseData baseData = new ProvideStatisticsBaseData(
					time , supportArea.getAreaid1(), supportArea.getAreaname1(),
					supportArea.getAreaid2(), supportArea.getAreaname2(), areaId, supportArea.getAreaname3(), 
					null, null, null, null, 
					assistSellDa, assistSellZx, 
					assistHelpDa, assistHelpZx, 
					getAssistTotalNum(supportArea.getAreaid3()), 
					getSelfEmpPoorTotalFamily(supportArea.getAreaid3()), 
					getPoorTotalFamily(supportArea.getAreaid3()), getPoorTotalNum(supportArea.getAreaid3()), 
					getAssistGoodsTotalNum(supportArea.getAreaid3()), getPoorGoodsTotalNum(supportArea.getAreaid3()));
			result.add(baseData);
		}
		return result;
	}
	
	/**
	 * 大爱超市和线上集采助理人销售额
	 * @param list
	 * @return
	 */
	private Map<String, BigDecimal> getSellAmount(Integer time, Long areaId){
		List<OrderStatisticsInfo> list = new ArrayList<OrderStatisticsInfo>();
		String tableName = StatisticsConstant.TableName.BASE_DATA_TABLE_NAME;
		Integer start = 0;
		Integer limit = 10000;
		BigDecimal assistSellDa = new BigDecimal("0");
		BigDecimal assistSellZx = new BigDecimal("0");
		BigDecimal assistHelpDa = new BigDecimal("0");
		BigDecimal assistHelpZx = new BigDecimal("0");
		do {
			list = orderStatisticsInfoService.getBaseDataFromTableByCtime(time, tableName, areaId, start, limit);
			for (OrderStatisticsInfo orderStatisticsInfo : list) {
				if(orderStatisticsInfo.getGoodsProjectType().equals(OrderConstant.ProjectType.PROJECT_TYPE_DA_SHOP)
						&& orderStatisticsInfo.getSellerType().equals(SellerType.agent.getCode()) && orderStatisticsInfo.getAssistId() > 0){
					assistSellZx = assistSellZx.add(orderStatisticsInfo.getOrderAmount());
					assistHelpDa = assistHelpZx.add(orderStatisticsInfo.getHelpPrice());
				}
				if(orderStatisticsInfo.getGoodsProjectType().equals(OrderConstant.ProjectType.PROJECT_TYPE_DA_SHOP) 
						&& orderStatisticsInfo.getSellerType().equals(SellerType.agent.getCode()) && orderStatisticsInfo.getAssistId().equals(0)){
					assistSellDa = assistSellDa.add(orderStatisticsInfo.getOrderAmount());
					assistHelpDa = assistHelpDa.add(orderStatisticsInfo.getHelpPrice());
				}
			}
			start += limit;
		} while (list.size() == limit);
		Map<String, BigDecimal> result = new HashMap<String, BigDecimal>();
		result.put("assistSellDa", assistSellDa);
		result.put("assistSellZx", assistSellZx);
		result.put("assistHelpDa", assistHelpDa);
		result.put("assistHelpDa", assistHelpDa);
		return result;
	}
	
	
	/**
	 * 获取脱贫助理人总数
	 * @return
	 */
	private Integer getAssistTotalNum(Long countryId){
		return roleService.getAssistTotalNum(countryId);
	}
	/**
	 * 获取自营贫困户总户数
	 * @return
	 */
	private Integer getSelfEmpPoorTotalFamily(Long countryId){
		return poorService.getSelfEmpPoorTotalFamily(countryId);
	}
	
	/**
	 * 获取贫困户户数
	 * @return
	 */
	private Integer getPoorTotalFamily(Long countryId){
		return poorService.getPoorTotalCount(countryId);
	}
	
	/**
	 * 获取贫困户人数
	 * @return
	 */
	private Integer getPoorTotalNum(Long countryId){
		return poorService.getPoorTotalPeopleNum(countryId);
	}
	
	/**
	 * 获取助理人上线商品总数
	 * @return
	 */
	private Long getAssistGoodsTotalNum(Long countryId){
		return (long) syGoodsCommonService.getGoodsNum(countryId, GoodsConstant.OwnerType.OWNER_TYPE_AGENT);
	}
	
	/**
	 * 获取贫困户上线商品总数
	 * @return
	 */
	private Long getPoorGoodsTotalNum(Long countryId){
		return (long) syGoodsCommonService.getGoodsNum(countryId, GoodsConstant.OwnerType.OWNER_TYPE_POOR);
	}

	@Override
	public List<Integer> memberHasGoods() {
		return syGoodsCommonService.memberHasGoods();
	}

	@Override
	public void batchInsert(List<ProvideStatisticsBaseData> list) {
		provideStatisticsService.batchInsert(list);
	}

	@Override
	public void statisticsProvideData(Integer time) {
		logger.info("start insert provideStatisticsBaseData");
		this.batchInsert(this.getValidData(time));
		logger.info("end insert provideStatisticsBaseData");
	}
	
	private BigDecimal getOfflineTotalAmount(Integer time, Long countryId){
		BigDecimal result = new BigDecimal("0.00");
		List<OrderStatisticsOfflineBizOrder> validOrder = orderStatisticsOfflineBizOrderService.getValidOrder(time);
		for (OrderStatisticsOfflineBizOrder orderStatisticsOfflineBizOrder : validOrder) {
			List<OrderStatisticsOfflineBizOrderGoods> bizOrderGoods = orderStatisticsOfflineBizOrderService.getBizOrderGoods(orderStatisticsOfflineBizOrder.getMainOrderId());
			if(CollectionUtils.isEmpty(bizOrderGoods)){
				logger.info("该订单下没有物品，订单号：{}", orderStatisticsOfflineBizOrder.getMainOrderId());
				break;
			}
			for (OrderStatisticsOfflineBizOrderGoods orderStatisticsOfflineBizOrderGoods : bizOrderGoods) {
				if(countryId.equals(orderStatisticsOfflineBizOrderGoods.getProvinceId())){
					result = result.add(orderStatisticsOfflineBizOrderGoods.getGoodsPrice());
				}
			}
		}
		return result;
	}

	@Override
	public Map<Integer, String> getCircleChannel() {
		Map<Integer, String> result = new HashMap<Integer, String>();
		List<SyCircle> allCircle = circleService.getAllCircle();
		for (SyCircle syCircle : allCircle) {
			result.put(syCircle.getCircleId(), syCircle.getChannel());
		}
		return result;
	}

}
