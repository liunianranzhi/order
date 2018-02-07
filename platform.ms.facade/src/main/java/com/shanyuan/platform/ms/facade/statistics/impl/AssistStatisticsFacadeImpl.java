package com.shanyuan.platform.ms.facade.statistics.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.base.common.util.StatisticsUtils;
import com.shanyuan.platform.ms.core.constant.StatisticsConstant;
import com.shanyuan.platform.ms.core.constant.UnionConstant;
import com.shanyuan.platform.ms.core.statistics.AssistStatisticsService;
import com.shanyuan.platform.ms.core.statistics.OrderStatisticsInfoService;
import com.shanyuan.platform.ms.core.statistics.OrderStatisticsOfflineBizOrderService;
import com.shanyuan.platform.ms.core.store.CircleMemberService;
import com.shanyuan.platform.ms.core.store.InviteCircleMemberService;
import com.shanyuan.platform.ms.core.union.AreaChannelService;
import com.shanyuan.platform.ms.core.union.UnionService;
import com.shanyuan.platform.ms.dao.statistics.entity.AssistStatisticsBaseData;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsInfo;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsOfflineBizOrder;
import com.shanyuan.platform.ms.dao.union.entity.SyAreaChannel;
import com.shanyuan.platform.ms.dao.union.entity.SyUnion;
import com.shanyuan.platform.ms.dao.user.entity.SyInviteCircleMember;
import com.shanyuan.platform.ms.facade.statistics.AssistStatisticsFacade;
import com.shanyuan.platform.ms.facade.union.UnionFacade;

/**
 * 
 * @author yangjian
 * @date 2018/01/08
 */
@Component
public class AssistStatisticsFacadeImpl implements AssistStatisticsFacade {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UnionService unionService;
	
	@Autowired
	private AreaChannelService areaChannelService;
	
	@Autowired
	private OrderStatisticsInfoService orderStatisticsInfoService;
	
	@Autowired
	private OrderStatisticsOfflineBizOrderService orderStatisticsOfflineBizOrderService;
	
	@Autowired
	private InviteCircleMemberService inviteCircleMemberService;
	
	@Autowired
	private UnionFacade unionFacade;
	
	@Autowired
	private CircleMemberService circleMemberService;
	
	@Autowired
	private AssistStatisticsService assistStatisticsService;
	
	@Override
	public List<AssistStatisticsBaseData> getValidData(Integer time) {
		Date dateFormInt = DateUtil.getDateFormInt(time);
		Integer endTime = DateUtil.getEndTimeOfDay(dateFormInt);
		List<AssistStatisticsBaseData> result = new ArrayList<AssistStatisticsBaseData>();
		List<SyUnion> allValidUnionList = unionService.getAllUnion();
		Map<String, BigDecimal> ykDealAmount = getYkDealAmount(time);
		Map<String, BigDecimal> empBizDealAmount = getEmpBizOrderAmount(endTime);
		Map<String, Long> inviteYkNum = getInviteYkNum(endTime);
		for (SyUnion union : allValidUnionList) {
			String channel = union.getUnionChannel();
			if(channel.equals(UnionConstant.OrgCode.CODE_YKJLB)){
				channel = "";
			}
			List<SyAreaChannel> listAreaChannel = areaChannelService.listAreaChannel(channel, UnionConstant.UnionSupportType.SUPPORT);
			List<Long> countryIds = new ArrayList<Long>();
			for (SyAreaChannel syAreaChannel : listAreaChannel) {
				countryIds.add(syAreaChannel.getAreaId());
			}
			if(CollectionUtils.isEmpty(countryIds)){
				continue;
			}
			Long regEmpNum = getRegEmployeeNum(channel, endTime);
			Long invYkNum = ObjectUtils.isEmpty(inviteYkNum.get(channel)) ? 0L : inviteYkNum.get(channel);
			Long userTotal;
//			if(union.getUnionChannel().equals(UnionConstant.OrgCode.CODE_BOC)){
//				userTotal = regEmpNum + invYkNum + getNoInvYkNum(endTime);
//			}else{
			userTotal = regEmpNum + invYkNum;
//			}
			BigDecimal empDealAmount = new BigDecimal("0.00");
			if(!ObjectUtils.isEmpty(empBizDealAmount.get(channel))){
				empDealAmount = getEmployeeDealAmount(time, channel, countryIds).add(empBizDealAmount.get(channel));
			}else{
				empDealAmount = getEmployeeDealAmount(time, channel, countryIds);
			}
			AssistStatisticsBaseData data = new AssistStatisticsBaseData(time, union.getUnionId(), union.getUnionName(), channel, 
					empDealAmount, ObjectUtils.isEmpty(ykDealAmount.get(channel)) ? new BigDecimal("0.00") : ykDealAmount.get(channel),
					getUserAddedNum(channel, time),userTotal, invYkNum, regEmpNum) ;
			result.add(data);
		}
		return result;
	}
	
	/**
	 * 计算员工交易金额
	 * @param list
	 * @return
	 */
	private BigDecimal getEmployeeDealAmount(Integer time, String channel, List<Long> countryIds){
		Integer limit = 10000;
		Integer start = 0;
		List<OrderStatisticsInfo> validOrder = new ArrayList<OrderStatisticsInfo>();
		BigDecimal employeeDealAmount = new BigDecimal("0.00");
		do {
			validOrder = orderStatisticsInfoService.getBaseDataFromTableByUnion(time, StatisticsConstant.TableName.BASE_DATA_TABLE_NAME, channel, countryIds, start, limit);
			for (OrderStatisticsInfo orderStatisticsInfo : validOrder) {
				if(StringUtils.isEmpty(channel)){
					SyInviteCircleMember inviteCircleMemberByMemberId = inviteCircleMemberService.getInviteCircleMemberByMemberId(orderStatisticsInfo.getBuyerId());
					if(!ObjectUtils.isEmpty(inviteCircleMemberByMemberId)){
						continue;
					}
				}else{
					employeeDealAmount = employeeDealAmount.add(orderStatisticsInfo.getOrderAmount());
				}
			}
			start += limit;
		} while (validOrder.size() == limit);
		return employeeDealAmount;
	}
	
	private Long getUserAddedNum(String channel, Integer time){
		Date date = DateUtil.getDateFormInt(time);
		Integer startTime = DateUtil.getStartTimeOfDay(date);
		Integer endTime = DateUtil.getEndTimeOfDay(date);
		Long addNum = circleMemberService.addNum(channel, startTime, endTime);
		return addNum;
	}
	
	private Map<String, BigDecimal> getEmpBizOrderAmount(Integer time){
		Map<String, BigDecimal> result = new HashMap<String, BigDecimal>();
		List<OrderStatisticsOfflineBizOrder> validOrder = orderStatisticsOfflineBizOrderService.getValidOrder(time);
		for (OrderStatisticsOfflineBizOrder orderStatisticsOfflineBizOrder : validOrder) {
			String channel = orderStatisticsOfflineBizOrder.getChannel();
			if(channel.equals(UnionConstant.OrgCode.CODE_YKJLB)){
				SyInviteCircleMember inviteCircleMemberByMemberId = inviteCircleMemberService.getInviteCircleMemberByMemberId(orderStatisticsOfflineBizOrder.getBuyerId());
				if(!ObjectUtils.isEmpty(inviteCircleMemberByMemberId)){
					continue;
				}
			}
			if(orderStatisticsOfflineBizOrder.getChannel().equals(channel)){
				if(!ObjectUtils.isEmpty(result.get(channel))){
					result.put(channel, result.get(channel).add(orderStatisticsOfflineBizOrder.getOrderAmount()));
				}else{
					result.put(channel, orderStatisticsOfflineBizOrder.getOrderAmount());
				}
			}
		}
		return result;
	}
	
	private Map<String, Long> getInviteYkNum(Integer time){
		Map<String, Long> result = new HashMap<String, Long>();
		Integer start = 0;
		Integer limit = 10000;
		List<SyInviteCircleMember> allInviteCircleMember = new ArrayList<SyInviteCircleMember>();
		do {
			allInviteCircleMember = inviteCircleMemberService.getAllInviteCircleMember(time, start, limit);
			for (SyInviteCircleMember circleMemver : allInviteCircleMember) {
				Long ykNum = 0L;
				Integer circle = circleMemver.getInviteCircleId();
				String channel = StatisticsUtils.getStatisticsUtils().getCircleChannel().get(circle);
				if(!ObjectUtils.isEmpty(result.get(channel))){
					ykNum = result.get(channel) + 1;
				}else{
					ykNum ++;
				}
				result.put(channel, ykNum);
			}
			start += limit;
		} while (allInviteCircleMember.size() == limit);
		return result;
	}
	
	private Long getRegEmployeeNum(String channel, Integer time){
		Long countByChannel = circleMemberService.countByChannel(channel, time);
		return ObjectUtils.isEmpty(countByChannel) ? 0 : countByChannel;
	}
	
//	private Long getNoInvYkNum(Integer time){
//		Long noInvYkCount = circleMemberService.getNoInvYkCount(time);
//		return noInvYkCount;
//	}
	
	private Map<String, BigDecimal> getYkDealAmount(Integer time){
		Map<String, BigDecimal> result = new HashMap<String, BigDecimal>();
		List<OrderStatisticsInfo> validOrder = new ArrayList<OrderStatisticsInfo>();
		Integer start = 0; 
		Integer limit = 10000;
		do {
			validOrder = orderStatisticsInfoService.getBaseDataFromTableByUnion(time, StatisticsConstant.TableName.BASE_DATA_TABLE_NAME, "", null, start, limit);
			for (OrderStatisticsInfo orderStatisticsInfo : validOrder) {
				BigDecimal amount = orderStatisticsInfo.getOrderAmount();
				SyInviteCircleMember inviteCircleMemberByMemberId = inviteCircleMemberService.getInviteCircleMemberByMemberId(orderStatisticsInfo.getBuyerId());
				if(!ObjectUtils.isEmpty(inviteCircleMemberByMemberId)){
					Integer invMemberId = inviteCircleMemberByMemberId.getInviteMemberId();
					String channel = unionFacade.getChannelByMemberId(invMemberId);
					if(!ObjectUtils.isEmpty(result.get(channel))){
						amount = amount.add(result.get(channel));
					}
					result.put(channel, amount);
				}
				
			}
			start += limit;
		} while (validOrder.size() == 10000);
		return result;
	}

	@Override
	public void batchInsert(List<AssistStatisticsBaseData> records) {
		assistStatisticsService.batchInsert(records);
	}

	@Override
	public void statisticsData(Integer time) {
		logger.info("start insert assistStatisticsBaseData");
		this.batchInsert(this.getValidData(time));
		logger.info("end insert assistStatisticsBaseData");
	}

}
