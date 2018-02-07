package com.shanyuan.platform.ms.core.union.impl;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.base.common.util.ImageUtil;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.LoginConstant;
import com.shanyuan.platform.ms.core.constant.UnionConstant;
import com.shanyuan.platform.ms.core.project.ProjectService;
import com.shanyuan.platform.ms.core.union.UnionService;
import com.shanyuan.platform.ms.core.union.bo.UnionBo;
import com.shanyuan.platform.ms.core.union.bo.UnionStatisticBo;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommonExample;
import com.shanyuan.platform.ms.dao.goods.mapper.SyGoodsCommonMapper;
import com.shanyuan.platform.ms.dao.order.mapper.SyBizApplyRechargeMapper;
import com.shanyuan.platform.ms.dao.order.mapper.SyOrderMapper;
import com.shanyuan.platform.ms.dao.stats.entity.SyPoorFpbRawDataExample;
import com.shanyuan.platform.ms.dao.stats.mapper.SyPoorFpbRawDataMapper;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleMember;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleMemberExample;
import com.shanyuan.platform.ms.dao.store.mapper.SyCircleMemberMapper;
import com.shanyuan.platform.ms.dao.union.entity.SyAreaChannel;
import com.shanyuan.platform.ms.dao.union.entity.SyAreaChannelExample;
import com.shanyuan.platform.ms.dao.union.entity.SyBocMemberStats;
import com.shanyuan.platform.ms.dao.union.entity.SyBocMemberStatsExample;
import com.shanyuan.platform.ms.dao.union.entity.SyUnion;
import com.shanyuan.platform.ms.dao.union.entity.SyUnionExample;
import com.shanyuan.platform.ms.dao.union.entity.SyUnionExample.Criteria;
import com.shanyuan.platform.ms.dao.union.entity.SyUnionItem;
import com.shanyuan.platform.ms.dao.union.entity.SyUnionItemExample;
import com.shanyuan.platform.ms.dao.union.mapper.SyAreaChannelMapper;
import com.shanyuan.platform.ms.dao.union.mapper.SyBocMemberStatsMapper;
import com.shanyuan.platform.ms.dao.union.mapper.SyUnionItemMapper;
import com.shanyuan.platform.ms.dao.union.mapper.SyUnionMapper;
import com.shanyuan.platform.ms.dao.user.entity.SyCircle;
import com.shanyuan.platform.ms.dao.user.entity.SyCircleExample;
import com.shanyuan.platform.ms.dao.user.mapper.SyCircleMapper;
import com.shanyuan.platform.ms.dao.user.mapper.SyPoorMapper;


/**
 * 联盟接口实现
 * @author zhangwd
 */
@Component
public class UnionServiceImpl implements UnionService {

	
	private final Logger logger = Logger.getLogger(getClass());
	@Autowired
	private SyUnionMapper syUnionMapper;
	
	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	@Autowired
	private SyOrderMapper syOrderMapper;
	
	@Autowired
	private SyBizApplyRechargeMapper  syBizApplyRechargeMapper;
	
	@Autowired
	private SyCircleMemberMapper  syCircleMemberMapper;
	
	@Autowired
	private SyAreaChannelMapper syAreaChannelMapper;
	
	@Autowired
	private SyCircleMapper syCircleMapper;
	
	@Autowired
	private SyBocMemberStatsMapper syBocMemberStatsMapper;

	@Autowired
	private SyGoodsCommonMapper syGoodsCommonMapper;
	
	@Autowired
	private SyPoorFpbRawDataMapper syPoorFpbRawDataMapper;
	
	@Autowired
	private SyPoorMapper syPoorMapper;
	
	@Autowired
	private SyUnionItemMapper  syUnionItemMapper;
	
	@Override
	public List<UnionBo> selectUnion( Byte unionType, Integer unionSort, Integer count) {
		
		List<UnionBo> unionBos = null;
		UnionBo unionBo = null;
		SyUnionExample unionExample = new SyUnionExample();
		Criteria criteria = unionExample.createCriteria();
		String orderByClause = ObjectUtils.nullSafeEquals(count, null) ? "union_sort ASC" : "union_sort ASC LIMIT " + count;
		
		if (ObjectUtils.isEmpty(unionType)) {
			criteria.andUnionSortBetween(1, 2);
		} 
		if (!ObjectUtils.isEmpty(unionType)) {
			criteria.andUnionTypeEqualTo(unionType);
		}
		if (!ObjectUtils.isEmpty(unionSort)) {
			criteria.andUnionSortGreaterThan(unionSort);
		}
		
		criteria.andUnionHiddenEqualTo(UnionConstant.UnionHidden.UNION_SHOW)
				.andUnionDelEqualTo(UnionConstant.UnionDel.UNION_NORMAL);
		unionExample.setOrderByClause(orderByClause);
		
		List<SyUnion> byExample = syUnionMapper.selectByExample(unionExample);
		
		//结果处理
		if (!CollectionUtils.isEmpty(byExample)) {
			unionBos = new ArrayList<>();
				for (SyUnion union : byExample) {
					//联盟图片路径处理
					String unionImage = union.getUnionImage();
					String unionDisImage = union.getUnionDisImage();
					if (!ObjectUtils.isEmpty(unionImage) && unionImage.contains("oss_")) {
						union.setUnionImage(ImageUtil.cdn_end_point + "/union/icon/"+ unionImage);
					}
					if (!ObjectUtils.isEmpty(unionDisImage) && unionDisImage.contains("oss_")) {
						union.setUnionDisImage(ImageUtil.cdn_end_point + "/union/icon/"+ unionDisImage);
					}
					unionBo = new UnionBo();
					try {
						BeanUtils.copyProperties(unionBo, union);
						unionBos.add(unionBo);
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						e.printStackTrace();
					}
			}
		}
		
		return unionBos;
	}

	@HystrixCommand(fallbackMethod = "fallbackGetUnionTopList")
	@Override
	public Map<String, Object> getUnionTopList(String channel ) throws Exception  {
		try {
			Integer unionId = null;
			JSONObject userUnionInfo = null;
			//LinkedList<JSONObject> topUnionList = new LinkedList<>();
			LinkedList<JSONObject> topUnionInfo = new LinkedList<>();
			Map<String, Object> dataMap = new HashMap<>();
			
			//从redis缓存中取得
			ValueOperations<String, String> opsForValue = stringRedisTemplate.opsForValue();
			//java 定时任务
			/*String unionTop = opsForValue.get(UnionConstant.UnionRedisKey.SY_UNION_SORT_BYNEWENROLL);
			JSONObject unionTopList = (JSONObject)JSONObject.parse(unionTop);
			// 用户登录且 不是益客(加入联盟)
			if (!UnionConstant.OrgCode.CODE_YKJLB.equals(channel) && !ObjectUtils.nullSafeEquals(channel, null)) {
				unionId = this.getChannelIdByChannel(channel);
				//用户所在的联盟
				userUnionInfo = (JSONObject) unionTopList.get(channel + "_" + unionId);
				userUnionInfo.fluentPut("isJoin", true);
			}
			
			//遍历取前三甲
			Iterator<String> it = unionTopList.keySet().iterator();
			int i = 1; //循环控制
			while (it.hasNext()) {
				//如果用户所在联盟不在前三甲，第一个显示用户所在联盟
				//益客直接显示前三甲
				String next = it.next();
				JSONObject unionInfo = (JSONObject)unionTopList.get(next);
				if (!UnionConstant.OrgCode.CODE_YKJLB.equals(channel) && !ObjectUtils.nullSafeEquals(channel, null)) { //用户登录且 不是益客(加入联盟)
						if ( next.equals(userUnionInfo.get("unionChannel") + "_" + userUnionInfo.get("unionId") )) { //用户加入联盟
							i++;
							continue;
						}
				}
				if (i > 3) {
					break;
				}
				
				//未登录或是益客  未加入联盟设置
				unionInfo.fluentPut("isJoin", false);
				
				topUnionList.add(unionInfo);
				i++; 
			}
			if (!ObjectUtils.isEmpty(userUnionInfo)) {
				topUnionList.addFirst(userUnionInfo); //将用户所在的联盟添加到第一个
			}
			dataMap.put("topThreeList", topUnionList);*/
			
			//从php 定时任务redis中获取
			String string = opsForValue.get("sy_union_top_list");
			//LinkedHashMap parseObject = JSON.parseObject(string, LinkedHashMap.class);
			
			@SuppressWarnings("rawtypes")
			HashMap m=  JSON.parseObject(string,LinkedHashMap.class,Feature.OrderedField); //有序解析
			JSONObject top_list = (JSONObject) m.get("top_list");
			JSONObject unionTopList = (JSONObject) top_list.get("enrollment");
			
			/*JSONObject parse = (JSONObject) JSONObject.parse(string);
			JSONObject top_list = (JSONObject) parse.get("top_list");
			JSONObject unionTopList = (JSONObject) top_list.get("enrollment");*/
			
			if (!UnionConstant.OrgCode.CODE_YKJLB.equals(channel) && !ObjectUtils.nullSafeEquals(channel, null)) {
				unionId = this.getChannelIdByChannel(channel);
				//用户所在的联盟
				userUnionInfo = (JSONObject) unionTopList.get(channel + "_" + unionId);
				if (!ObjectUtils.isEmpty(userUnionInfo)){
					userUnionInfo.fluentPut("isJoin", true);
					//联盟点击url 处理
					String unionInfoUrl = (String) userUnionInfo.get("union_info_url");
					unionInfoUrl = unionInfoUrl.substring(unionInfoUrl.indexOf(".com") + 4);
					userUnionInfo.fluentPut("union_info_url", unionInfoUrl);
				}
			}
			//遍历取前三甲
			Iterator<String> it = unionTopList.keySet().iterator();
			int i = 1; //循环控制
			while (it.hasNext()) {
				//如果用户所在联盟不在前三甲，第一个显示用户所在联盟
				//益客直接显示前三甲
				String next = it.next();
				JSONObject unionInfo = (JSONObject)unionTopList.get(next);
				if (!UnionConstant.OrgCode.CODE_YKJLB.equals(channel) && !ObjectUtils.nullSafeEquals(channel, null)) { //用户登录且 不是益客(加入联盟)
					if (!ObjectUtils.isEmpty(userUnionInfo)){
						if ( next.equals(userUnionInfo.get("union_channel") + "_" + userUnionInfo.get("union_id") )) { //用户加入联盟
							i++;
							continue;
						}
					}
				}
				if (i > 3) {
					break;
				}
				
				//未登录或是益客  未加入联盟设置
				unionInfo.fluentPut("isJoin", false);
				//联盟点击url 处理
				String unionInfoUrl = (String) unionInfo.get("union_info_url");
				unionInfoUrl = unionInfoUrl.substring(unionInfoUrl.indexOf(".com") + 4);
				unionInfo.fluentPut("union_info_url", unionInfoUrl);

				topUnionInfo.addLast(unionInfo);
				i++; 
			}
			if (!ObjectUtils.isEmpty(userUnionInfo)) {
				topUnionInfo.addFirst(userUnionInfo); //将用户所在的联盟添加到第一个
			}
			dataMap.put("topThreeList", topUnionInfo);
			
			return dataMap;
			
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw e;
		}
	}
	
	
	
	@Override
	public Integer getChannelIdByChannel(String channel) {
		
		SyUnionExample unionExample = new SyUnionExample();
		unionExample.createCriteria().andUnionChannelEqualTo(channel);
		List<SyUnion> example = this.syUnionMapper.selectByExample(unionExample);
		return example.get(0).getUnionId();
	}
	
	@HystrixCommand(fallbackMethod = "fallbackGetMemberCountWithoutPoor")
	@Override
	public Integer getMemberCountWithoutPoor() throws Exception {
		
		//从redis缓存中取得
		ValueOperations<String, String> opsForValue = stringRedisTemplate.opsForValue();
		String str = opsForValue.get("sy_platform_member_count");
		Integer countWithoutPoor = null;
		if (!ObjectUtils.isEmpty(str)) {
			countWithoutPoor = Integer.parseInt(str);
		}else {
			throw new NullPointerException(); //redis 為空 ，取虚拟数据
		}
		if (ObjectUtils.isEmpty(countWithoutPoor)) {
			if(logger.isDebugEnabled()) {
				logger.debug("cache has no data , get data from MySQL！");
			}
			countWithoutPoor = this.syUnionMapper.selectMemberCountWithoutPoor();
		}
		return countWithoutPoor < 0 ? 0 : countWithoutPoor;
	}
	
	/**
	 * 首页top 公益人士虚拟数据
	 * @return
	 */
	@SuppressWarnings("unused")
	private Integer fallbackGetMemberCountWithoutPoor() {
		logger.error("fallback getMemberCountWithoutPoor start:");
		return 1619954;
	}
	
	@HystrixCommand(fallbackMethod = "fallbackGetPlatformDonationAmount")
	@Override
	public Integer getPlatformDonationAmount() throws Exception{
		
		ValueOperations<String, String> opsForValue = stringRedisTemplate.opsForValue();
		String str = opsForValue.get("sy_platform_donation_amount");
		Double parseDouble = 0.0;
		if (!ObjectUtils.isEmpty(str)) {
			 parseDouble = Double.parseDouble(str);
		}else {
			throw new NullPointerException(); //redis 為空 ，取虚拟数据
		}
		Integer donationAmount = parseDouble.intValue();
		if (ObjectUtils.isEmpty(donationAmount)|| ObjectUtils.nullSafeEquals(donationAmount, 0)) {
			if(logger.isDebugEnabled()) {
				logger.debug("cache has no data , get data from MySQL！");
			}
			//义卖交易金额  分
			Integer boSum = projectService.getBazaarOrderSumMoney() / 100 ;
			//捐款交易金额  元
			Integer jkoSum = projectService.getJuanKuanOrderSumMoney();
			donationAmount = boSum.intValue() + jkoSum;
		}
		return donationAmount;
	}
	
	/**
	 * 首页top 公益捐赠虚拟数据
	 * @return
	 */
	@SuppressWarnings("unused")
	private Integer fallbackGetPlatformDonationAmount() {
		logger.error("fallback getPlatformDonationAmount start:");
		return 971523;
	}
	
	@HystrixCommand(fallbackMethod = "fallbackGetOrderAmount")
	@Override
	public Integer  getOrderAmount() throws Exception{
		
		ValueOperations<String, String> opsForValue = stringRedisTemplate.opsForValue();
		String str = opsForValue.get("sy_platform_order_amount");
		Double parseDouble = 0.0;
		if (!ObjectUtils.isEmpty(str)) {
			 parseDouble = Double.parseDouble(str);
		}else {
			throw new NullPointerException(); //redis 為空 ，取虚拟数据
		}
		Integer orderAmount = parseDouble.intValue();
		if (ObjectUtils.isEmpty(orderAmount) || ObjectUtils.nullSafeEquals(orderAmount, 0)) {
			if(logger.isDebugEnabled()) {
				logger.debug("cache has no data , get data from MySQL！");
			}
			//订单总金额
			Double orderA = syOrderMapper.selectOrderAmount();
			Integer orderAm = orderA == null ? 0 : orderA.intValue();
			//采集的总金额
			BigDecimal bara = syBizApplyRechargeMapper.selectBizApplyRechargeAmount();
			Integer bizApplyRechargeAmount = bara == null ? 0 : bara.intValue();
			orderAmount = orderAm + bizApplyRechargeAmount;
		}
		return orderAmount;
	}

	/**
	 * 首页top 公益消费虚拟数据
	 * @return
	 */
	@SuppressWarnings("unused")
	private Integer fallbackGetOrderAmount() {
		logger.error("fallback getOrderAmount start:");
		return 90947901;
	}

	/**
	 * 校验channel   by sunyue
	 * @param channel
	 * @return
	 * @throws CoreServiceException
	 */
	@Override
	@Deprecated
	public String ValidChannel(String channel) throws CoreServiceException {
		List<String> allAppChannels = this.syUnionMapper.selectUnionChannel();
		allAppChannels.add(LoginConstant.CircleCode.CODE_YKJLB);
		if(!ObjectUtils.isEmpty(allAppChannels) && allAppChannels.contains(channel)) {
			return channel;  
		 }
		return null;
	
	}

	/**
	 * @author caoyongjun
	 * 为了获取到code和circleId
	 */
	@Override
	public SyCircleMember getSyCircleMemberByMemberId(Integer memberId) {
		
		SyCircleMemberExample example=new SyCircleMemberExample();
		example.createCriteria().andMemberIdEqualTo(memberId).andCodeIsNotNull().andCodeNotEqualTo("");
		example.setOrderByClause("circle_id desc ");
		List<SyCircleMember> list=syCircleMemberMapper.selectByExample(example);
		if(ObjectUtils.isEmpty(list)){
			return null;
		}else{
			return list.get(0);
		}
	}
	
	@Override
	public List<SyUnion> getUnionList() {
		
		SyUnionExample unionExample = new SyUnionExample();
		//添加时间大于24小时
		unionExample.createCriteria().andAddTimeLessThan(DateUtil.getNowInt() - 3600 * 24)
									 .andUnionTopListFlagEqualTo(UnionConstant.TopListFlag.YES)
									 .andUnionFreeEqualTo(UnionConstant.UnionFree.UNION_USABLE)
									 .andUnionDelEqualTo(UnionConstant.UnionDel.UNION_NORMAL);
		return syUnionMapper.selectByExample(unionExample);
	}

	@Override
	public UnionStatisticBo getUnionCountInfo(SyUnion union) {
		
		//获取今天0点的时间
		Long longTime = (System.currentTimeMillis()/(1000*3600*24)*(1000*3600*24) - TimeZone.getDefault().getRawOffset()) / 1000;
		int intTime = longTime.intValue();
		//昨天开始时间
		Integer yestStartTime = intTime - 3600 * 24 + 1;
		//昨天结束时间
		Integer yestEndTime = intTime - 1;
		
		UnionStatisticBo usBo = new UnionStatisticBo();
		//获取联盟对应的圈子
		SyCircle circle = this.getCircleInfoByUnion(union.getUnionChannel());
		//通过圈子获取统计信息
		SyBocMemberStats bmStats = this.getBocMemberStatsByCircle(circle.getCircleId(), null, null );
		
		//1.注册人数
		usBo.setUnionEnrollment(bmStats.getFullTotalMember() + bmStats.getInviteNum());
		
		//2.新注册人数 = 今日统计注册人数-昨日统计注册人数
			//今日统计数据
		   SyBocMemberStats bmStatsToday = this.getBocMemberStatsByCircle(circle.getCircleId(), intTime  , intTime + 86400 -1 );
		   //昨日统计数据
		   SyBocMemberStats bmStatsYest = this.getBocMemberStatsByCircle(circle.getCircleId(), intTime - 3600 * 24, intTime - 1);
		
		if (ObjectUtils.isEmpty(bmStatsToday)) { //今天没有人注册
			
			usBo.setUnionNewEnrollment(0); 
			
		}else if (ObjectUtils.isEmpty(bmStatsYest) && !ObjectUtils.isEmpty(bmStatsToday)) { //昨天没有人注册
			
			usBo.setUnionNewEnrollment(bmStatsToday.getFullTotalMember() + bmStatsToday.getInviteNum());
			
		}else if (!ObjectUtils.isEmpty(bmStatsYest) && !ObjectUtils.isEmpty(bmStatsToday)) { //今昨两天都有注册
			
			int unionNewEnro = bmStatsToday.getFullTotalMember() + bmStatsToday.getInviteNum() -  bmStatsYest.getFullTotalMember() - bmStatsYest.getInviteNum();
			usBo.setUnionNewEnrollment(unionNewEnro < 0  ? 0 : unionNewEnro); 
		} 
		
		//3.人均积分
		if (bmStats.getFullTotalMember() != 0) {
			usBo.setUnionPoints(bmStats.getFullTotalMemberBocPoints().intValue() / bmStats.getFullTotalMember());
		}else {
			usBo.setUnionPoints(0);
		}
		
		//4.购买金额
		Long fullTotalPayOrderAmount = bmStats.getFullTotalPayOrderAmount() / 100;
		usBo.setUnionSpending(fullTotalPayOrderAmount.intValue());
		
		//5.销售总额
		Long intValue = (bmStats.getFullTotalSupportCountyAmount() / 100);
		usBo.setUnionSalesAmount( intValue.intValue()  );
		
		//6.联盟排行榜详情页url    暂时跳转到php
		usBo.setUnionInfoUrl("/bocm/index.php?act=union&op=index&union_id=" + union.getUnionId() + "&union_channel=" + union.getUnionChannel() );
		
		//7.联盟描述unionDesc
		usBo.setUnionDesc(union.getUnionDesc());
		
		//8.联盟介绍 unionIntroduction
		usBo.setUnionIntroduction(union.getUnionIntroduction());
		
		//9.联盟对应的圈子circleId
		usBo.setCircleId(circle.getCircleId());
		
		//10.联盟内的圈子数量circleCount
		SyCircleExample circleEx = new SyCircleExample();
		circleEx.createCriteria().andChannelEqualTo(union.getUnionChannel()).andDeptLevelEqualTo(union.getUnionCircleLevel());
		usBo.setCircleCount( this.syCircleMapper.countByExample(circleEx) );
		
		//11.联盟内的上架商品数量 goodsCount(爱心产品上线)
			//联盟帮扶侧信息
		Map<String, List<Long>> unionArea = this.getUnionArea(union.getUnionId(), union.getUnionChannel());
		SyGoodsCommonExample goodsCommonEx = new SyGoodsCommonExample();
		goodsCommonEx.createCriteria().andSupportCountyIdIn(unionArea.get("source")).andGoodsStateEqualTo((byte)1);	
		usBo.setGoodsCount(this.syGoodsCommonMapper.countByExample(goodsCommonEx));
		
		//12.联盟内的助理人数量agentCount'
		usBo.setAgentCount(this.syUnionMapper.selectUnionAgentCount(unionArea.get("source")));
		
		//13.联盟内的贫困户的数量poorCount
		usBo.setPoorCount(this.getPoorNumByUnion(union.getUnionChannel()));
		
		//14.联盟中贫困户自营的商品数量poorSelfSaleCount
		usBo.setPoorSelfSaleCount(this.syGoodsCommonMapper.selectPoorSelfSaleCount(unionArea.get("support")));
		
		//15.联盟的贫困户增收额 moneyTotal =  贫困户销售额 * 0.986 + 助理人的销售额    # 贫困户增收 =》 销售额（联盟订单金额）
			//贫困户销售额
			BigDecimal poorSaleMoney = this.syPoorMapper.selectPoorSaleMoney(unionArea.get("support"));
			poorSaleMoney = poorSaleMoney == null ? BigDecimal.valueOf(0.0) : poorSaleMoney;
			//助理人销售额
			BigDecimal agentSaleMoney = this.syPoorMapper.selectAgentSaleMoney(unionArea.get("support"));
			agentSaleMoney = agentSaleMoney == null ? BigDecimal.valueOf(0.0) : agentSaleMoney;
		usBo.setMoneyTotal(poorSaleMoney.multiply(BigDecimal.valueOf(0.986)).add(agentSaleMoney));
		
		//16.帮扶金额 helpingMoney
		usBo.setHelpingMoney(agentSaleMoney);
		
		//17.联盟捐赠金额unionDonation
			//捐款金额
			BigDecimal juanKuan =  this.syUnionMapper.selectJuanKuanOrderAmount(union.getUnionChannel());
			juanKuan = juanKuan == null ? BigDecimal.valueOf(0.0) : juanKuan; 
			//义卖金额
			BigDecimal bazaar = this.syUnionMapper.selectBazaarOrderAmount(union.getUnionChannel());
			bazaar = bazaar == null ? BigDecimal.valueOf(0.0) : bazaar; 
		usBo.setUnionDonation(juanKuan.add(bazaar));
		
		//18.联盟圈子内总订单数orderCircleTotal
		usBo.setOrderCircleTotal(this.syUnionMapper.selectOrderCircleTotal(union.getUnionChannel()));
		
		//19.购买的爱心商品数goodsTotal
		Integer goodsTotal = this.syUnionMapper.selectGoodsTotalByUnion(union.getUnionChannel());
		goodsTotal = goodsTotal == null ? 0 :  goodsTotal;
		usBo.setGoodsTotal(goodsTotal);
		
		//20.昨天销售最多的4个产品（大爱超市）goodsTopList
		List<SyGoodsCommon> goodsTopList = this.getGoodsTopList(yestStartTime, yestEndTime, unionArea.get("source"));
		usBo.setGoodsTopList(goodsTopList);
		
		//21.过去7天新增注册人数最多的单位（10个）newEnrollTopCircle;
		Map<String, Object> circleData = new HashMap<>();
		circleData.put("yestStartTime", intTime - 3600 * 24 * 7);
		circleData.put("yestEndTime", intTime);
		circleData.put("channel", union.getUnionChannel());
		circleData.put("deptLevel", circle.getDeptLevel());
		//Map<String, Object> circleTop = this.syUnionMapper.selectNewEnrollTopCircle(circleData);
		
		return usBo;
	}

	@Override
	public List<SyGoodsCommon> getGoodsTopList(Integer yestStartTime, Integer yestEndTime, List<Long> areaId3){
		
		List<SyGoodsCommon> goodsOtherTopList = new ArrayList<>();
		List<SyGoodsCommon> goodsTopList = new ArrayList<>();
		HashMap<String, Object> dataMap = new HashMap<>();
		dataMap.put("yestStart", yestStartTime);
		dataMap.put("yestEnd", yestEndTime);
		dataMap.put("source", areaId3);
		
		//top4每件商品id 和相对应的数量
		Map<Integer, Integer> goodsCommonIdsTotal = this.syUnionMapper.selectGoodsCommonIdsTotal(dataMap);
		if (ObjectUtils.isEmpty(goodsCommonIdsTotal)) {
			goodsCommonIdsTotal = new HashMap<>();
		}
		//top4商品ids
		ArrayList<Integer> goodsCommonIds = new ArrayList<Integer>( goodsCommonIdsTotal.keySet());
		
			//昨天产品不足4个 是再查几个其他商品  补足4个
		if ( goodsCommonIds.size() < 4) {
			
			SyGoodsCommonExample gcEx1 = new SyGoodsCommonExample();
			com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommonExample.Criteria criteria = gcEx1.createCriteria();
			
			String orderByClause = " goods_commonid DESC LIMIT " + (4 - goodsCommonIds.size()) ;
			
			if (!ObjectUtils.isEmpty(goodsCommonIds)) {
				criteria.andGoodsCommonidNotIn(goodsCommonIds);
			}
			criteria.andSupportCountyIdIn(areaId3) 
				    .andGoodsStateEqualTo((byte)1) //上架
				    .andTradeModeEqualTo("pt")	//普通商品
				    .andGoodsProjectTypeEqualTo(17) //贫困户产品
				    .andAssistIdEqualTo(0);
			gcEx1.setOrderByClause(orderByClause);
			
			goodsOtherTopList = this.syGoodsCommonMapper.selectByExample(gcEx1);
		}
		
		//有top4商品时，获取商品信息
		if (!ObjectUtils.isEmpty(goodsCommonIdsTotal)) {
			SyGoodsCommonExample gcEx2 = new SyGoodsCommonExample();
			if (!ObjectUtils.isEmpty(goodsCommonIds)) {
				gcEx2.createCriteria().andGoodsCommonidIn(goodsCommonIds);
			}
			 goodsTopList = this.syGoodsCommonMapper.selectByExample(gcEx2);
		}
		
		goodsTopList.addAll(goodsOtherTopList);
		// TODO 商品数据处理
		
		return goodsTopList;
	}
	
	
	@Override
	public Integer getPoorNumByUnion(String unionChannel) {
		
		SyPoorFpbRawDataExample pfdEX = new SyPoorFpbRawDataExample();
		pfdEX.createCriteria().andChannelEqualTo(unionChannel);
		int poorCount = this.syPoorFpbRawDataMapper.countByExample(pfdEX);
		
		//中行长武县单独处理
		if (UnionConstant.OrgCode.CODE_BOC.equals(unionChannel)) {
			
			int changwuPoorCount = this.syPoorMapper.selectPoorNum(UnionConstant.UnionArea.ChangwuArea);
			poorCount = poorCount + changwuPoorCount;
		}
		return poorCount;
	}

	@Override
	public SyCircle getCircleInfoByUnion(String unionChannel) {
		
		SyCircleExample circleExample = new SyCircleExample();
		circleExample.createCriteria().andCodeEqualTo(unionChannel)
					 .andParentCircleIdEqualTo(UnionConstant.ParentCircle.PARENT_CIRCLE_ID); //所属圈子--扶贫联盟
		
		return syCircleMapper.selectByExample(circleExample).get(0);
	}
	
	@Override
	public SyBocMemberStats getBocMemberStatsByCircle(Integer circleId, Integer startAddTime, Integer  endAddTime){
		
		String orderByClause = "add_time DESC LIMIT 1"; //获取统计结果的第一条数据
		SyBocMemberStatsExample bmsExample = new SyBocMemberStatsExample();
		bmsExample.setOrderByClause(orderByClause);
		if (!ObjectUtils.isEmpty(startAddTime) && !ObjectUtils.isEmpty(endAddTime)) {
			bmsExample.createCriteria().andCircleIdEqualTo(circleId).andAddTimeBetween(startAddTime, endAddTime);
		}else {
			bmsExample.createCriteria().andCircleIdEqualTo(circleId);
		}
		List<SyBocMemberStats> bStats = this.syBocMemberStatsMapper.selectByExample(bmsExample);
		if (!CollectionUtils.isEmpty(bStats)) {
			return bStats.get(0);
		}
		return null;
	}
	
	@Override
	public SyUnion getUnionByUnionChannel(String code) {
		
		if (!ObjectUtils.isEmpty(code)) {
			
			SyUnionExample unionExample = new SyUnionExample();
			unionExample.createCriteria().andUnionChannelEqualTo(code);
			
			List<SyUnion> unions = this.syUnionMapper.selectByExample(unionExample);
			if (!CollectionUtils.isEmpty(unions)) {
				return unions.get(0);
			}
		}
		return null;
	}
	
	@Override
	public Map<String, List<Long>> getUnionArea(Integer unionId, String unionChannel){
		
		Map<String, List<Long>> hashMap = new HashMap<>();
		List<Long> source = new ArrayList<>();
		List<Long> support = new ArrayList<>();
		SyAreaChannelExample areaChannelEx = new SyAreaChannelExample();
		areaChannelEx.createCriteria().andUnionIdEqualTo(unionId)
									  .andUnionChannelEqualTo(unionChannel);
		 List<SyAreaChannel> areaChannels = this.syAreaChannelMapper.selectByExample(areaChannelEx);
		 for (SyAreaChannel areaChannel : areaChannels) {
			//1供给侧,2帮扶侧
			 if (areaChannel.getType() == 1) {
				 support.add(areaChannel.getAreaId());
			 }else {
				source.add(areaChannel.getAreaId());
			}
		 }
		 hashMap.put("support", support);
		 hashMap.put("source", source);
		return hashMap;
	}

	@Override
	public List<SyUnion> getAllValidUnionList() throws CoreServiceException {
		SyUnionExample unionExample = new SyUnionExample();
		//添加时间大于24小时
		unionExample.createCriteria().andAddTimeLessThan(DateUtil.getNowInt() - 3600 * 24)
									 .andUnionFreeEqualTo(UnionConstant.UnionFree.UNION_USABLE)
									 .andUnionDelEqualTo(UnionConstant.UnionDel.UNION_NORMAL)
									 .andUnionHiddenEqualTo(UnionConstant.UnionHidden.UNION_SHOW);
		unionExample.setOrderByClause("union_sort ASC");
		return syUnionMapper.selectByExample(unionExample);
	}

	@Override
	public List<SyBocMemberStats> getStatInfo(List<Integer> circleIds) throws CoreServiceException {
		
		SyBocMemberStatsExample example = new SyBocMemberStatsExample();
		example.createCriteria().andCircleIdIn(circleIds);
		example.setOrderByClause("add_time DESC LIMIT " + circleIds.size());
		List<SyBocMemberStats> stats = this.syBocMemberStatsMapper.selectByExample(example);
		if(!CollectionUtils.isEmpty(stats)){
			return stats;
		}
		return null;
	}

	@Override
	public SyBocMemberStats getStatInfo(Integer circleId) throws CoreServiceException {
		SyBocMemberStatsExample example = new SyBocMemberStatsExample();
		example.createCriteria().andCircleIdEqualTo(circleId);
		example.setOrderByClause("add_time DESC LIMIT 1");
		List<SyBocMemberStats> stats = this.syBocMemberStatsMapper.selectByExample(example);
		if(!CollectionUtils.isEmpty(stats)){
			return stats.get(0);
		}
		return null;
	}

	
	
	@SuppressWarnings("unused")
	private Map<String , Object> fallbackGetUnionTopList(String channel){
		
		logger.error("fallback getUnionTopList start:");
		
		HashMap<String , Object> unionMap = new HashMap<>();	
		ArrayList<JSONObject> unionList = new ArrayList<>();
		//中行虚拟数据
		JSONObject bocJOSN = new JSONObject();
		bocJOSN.fluentPut("isJoin", true);
		bocJOSN.fluentPut("union_name", "公益中行");
		bocJOSN.fluentPut("union_sales_amount", "47054006");
		bocJOSN.fluentPut("union_ranking", 1);
		bocJOSN.fluentPut("union_id", "1");
		bocJOSN.fluentPut("union_info_url", "/bocm/index.php?act=union&op=index&union_id=1&channel=boc");
		bocJOSN.fluentPut("union_channel", "boc");
		bocJOSN.fluentPut("union_enrollment", 1120029);
		bocJOSN.fluentPut("union_new_enrollment", 0);
		bocJOSN.fluentPut("union_donation", "583073");
		bocJOSN.fluentPut("union_points", "3336");
		bocJOSN.fluentPut("union_spending", "86991074");
		
		//国电虚拟数据
		JSONObject gdJOSN = new JSONObject();
		gdJOSN.fluentPut("isJoin", false);
		gdJOSN.fluentPut("union_name", "公益国电");
		gdJOSN.fluentPut("union_sales_amount", "712501");
		gdJOSN.fluentPut("union_ranking", 2);
		gdJOSN.fluentPut("union_id", "2");
		gdJOSN.fluentPut("union_info_url", "/bocm/index.php?act=union&op=index&union_id=2&channel=gd");
		gdJOSN.fluentPut("union_channel", "gd");
		gdJOSN.fluentPut("union_enrollment", 102408);
		gdJOSN.fluentPut("union_new_enrollment", 0);
		gdJOSN.fluentPut("union_donation", "33572");
		gdJOSN.fluentPut("union_points", "143");
		gdJOSN.fluentPut("union_spending", "318027");
		
		//山西虚拟数据
		JSONObject shanxi1JOSN = new JSONObject();
		shanxi1JOSN.fluentPut("isJoin", false);
		shanxi1JOSN.fluentPut("union_name", "公益山西");
		shanxi1JOSN.fluentPut("union_sales_amount", "4027949");
		shanxi1JOSN.fluentPut("union_ranking", 3);
		shanxi1JOSN.fluentPut("union_id", "11");
		shanxi1JOSN.fluentPut("union_info_url", "/bocm/index.php?act=union&op=index&union_id=11&channel=shanxi1");
		shanxi1JOSN.fluentPut("union_channel", "shanxi1");
		shanxi1JOSN.fluentPut("union_enrollment", 195497);
		shanxi1JOSN.fluentPut("union_new_enrollment", 0);
		shanxi1JOSN.fluentPut("union_donation", "33572");
		shanxi1JOSN.fluentPut("union_points", "143");
		shanxi1JOSN.fluentPut("union_spending", "43691");
		
		unionList.add(bocJOSN);
		unionList.add(gdJOSN);
		unionList.add(shanxi1JOSN);
		unionMap.put("topThreeList", JSONObject.toJSON(unionList));
		return unionMap;
	}

	@Override
	public SyUnionItem getUnionItemGoods(String unionCode) throws CoreServiceException {
		SyUnionItemExample suie = new SyUnionItemExample();
		if(!StringUtils.isEmpty(unionCode)) {
			suie.createCriteria().andIsEnabledEqualTo((byte)1).andUnionCodeEqualTo(unionCode);
			suie.setOrderByClause("sort_num DESC LIMIT 1 ");
			List<SyUnionItem> unionItem = syUnionItemMapper.selectByExample(suie);
			if(!ObjectUtils.isEmpty(unionItem)) {
				return unionItem.get(0);
			}
		}
		return null;
	}

	@Override
	public SyUnionItem getUnionItemById(Integer unionId) throws CoreServiceException {
		return syUnionItemMapper.selectByPrimaryKey(unionId);
	}

	@Override
	public SyUnion getUnionById(Integer unionId) throws CoreServiceException {
		return syUnionMapper.selectByPrimaryKey(unionId);
	}

	@Override
	public List<SyUnion> getAllUnion() throws CoreServiceException {
		SyUnionExample unionExample = new SyUnionExample();
		//添加时间大于24小时
		return syUnionMapper.selectByExample(unionExample);
	}
	
}

