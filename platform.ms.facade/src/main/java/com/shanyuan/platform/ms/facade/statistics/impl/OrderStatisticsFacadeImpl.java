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
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.base.common.util.PointsUtils;
import com.shanyuan.platform.ms.base.common.util.StatisticsUtils;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.LoginConstant.RoleType;
import com.shanyuan.platform.ms.core.constant.OrderConstant;
import com.shanyuan.platform.ms.core.constant.StatisticsConstant;
import com.shanyuan.platform.ms.core.constant.UnionConstant;
import com.shanyuan.platform.ms.core.constant.enums.SellerType;
import com.shanyuan.platform.ms.core.goods.SyGoodsCommonService;
import com.shanyuan.platform.ms.core.goods.SySupportAreaService;
import com.shanyuan.platform.ms.core.statistics.AssistStatisticsService;
import com.shanyuan.platform.ms.core.statistics.OrderStatisticsInfoService;
import com.shanyuan.platform.ms.core.statistics.OrderStatisticsOfflineBizOrderService;
import com.shanyuan.platform.ms.core.statistics.OrderStatisticsService;
import com.shanyuan.platform.ms.core.statistics.PointsStatisticsService;
import com.shanyuan.platform.ms.core.statistics.ProvideStatisticsService;
import com.shanyuan.platform.ms.core.store.CircleMemberService;
import com.shanyuan.platform.ms.core.store.SyAreaFullService;
import com.shanyuan.platform.ms.core.union.AreaChannelService;
import com.shanyuan.platform.ms.core.union.UnionService;
import com.shanyuan.platform.ms.core.user.RoleService;
import com.shanyuan.platform.ms.core.user.SyPoorService;
import com.shanyuan.platform.ms.core.user.UserCorrelationService;
import com.shanyuan.platform.ms.dao.biz.entity.SyBizMainOrder;
import com.shanyuan.platform.ms.dao.biz.entity.SyBizOrderGoods;
import com.shanyuan.platform.ms.dao.goods.entity.SySupportArea;
import com.shanyuan.platform.ms.dao.order.entity.SyOrder;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderGoods;
import com.shanyuan.platform.ms.dao.project.entity.SyProjectMoneyOrder;
import com.shanyuan.platform.ms.dao.statistics.entity.AssistStatisticsBaseData;
import com.shanyuan.platform.ms.dao.statistics.entity.MemberPointsNum;
import com.shanyuan.platform.ms.dao.statistics.entity.OfflineStatisticsDomain;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsBaseData;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsInfo;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsOfflineBizOrder;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsOfflineBizOrderGoods;
import com.shanyuan.platform.ms.dao.statistics.entity.PlatFormDataStatisticsDomain;
import com.shanyuan.platform.ms.dao.statistics.entity.PlatformStatisticsSellerData;
import com.shanyuan.platform.ms.dao.statistics.entity.PointDetailsTag;
import com.shanyuan.platform.ms.dao.statistics.entity.PovertyAlleviationOverview;
import com.shanyuan.platform.ms.dao.statistics.entity.ProvideStatisticsBaseData;
import com.shanyuan.platform.ms.dao.statistics.entity.StatisticsTable;
import com.shanyuan.platform.ms.dao.store.entity.SyAreaFull;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleMember;
import com.shanyuan.platform.ms.dao.store.mapper.SyAreaFullMapper;
import com.shanyuan.platform.ms.dao.union.entity.SyAreaChannel;
import com.shanyuan.platform.ms.dao.union.entity.SyUnion;
import com.shanyuan.platform.ms.dao.user.entity.SyCircle;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.dao.user.entity.SyPointsLog;
import com.shanyuan.platform.ms.dao.user.entity.SyPoor;
import com.shanyuan.platform.ms.dao.user.entity.SyRole;
import com.shanyuan.platform.ms.facade.statistics.OrderStatisticsCircleFacade;
import com.shanyuan.platform.ms.facade.statistics.OrderStatisticsFacade;
import com.shanyuan.platform.ms.facade.statistics.PointStatisticsFacade;
import com.shanyuan.platform.ms.facade.statistics.impl.domain.AssistStatisticsDomain;
import com.shanyuan.platform.ms.facade.statistics.impl.domain.MemberPointDomain;
import com.shanyuan.platform.ms.facade.statistics.impl.domain.MemberPointsNumDomain;
import com.shanyuan.platform.ms.facade.statistics.impl.domain.PlatFormSellerInfoDomain;
import com.shanyuan.platform.ms.facade.statistics.impl.domain.PlatFormTotalDomain;
import com.shanyuan.platform.ms.facade.statistics.impl.domain.PointsLogDomain;
import com.shanyuan.platform.ms.facade.statistics.impl.domain.PovertyAllevaitionOverviewDomain;
import com.shanyuan.platform.ms.facade.statistics.impl.domain.ProvideStatisticsDomain;
import com.shanyuan.platform.ms.facade.statistics.impl.domain.StatCircleInfoDomain;
import com.shanyuan.platform.ms.facade.union.UnionFacade;


/**
 * 订单统计
 * @author yangjian
 * @date 2017/12/25
 *
 */
@Component
public class OrderStatisticsFacadeImpl implements OrderStatisticsFacade {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	
	@Autowired
	private OrderStatisticsService orderStatisticsService;
	
	@Autowired
	private UserCorrelationService userCorrelationService;
	
	@Autowired
	private CircleMemberService circleMemberService;
	
	@Autowired
	private OrderStatisticsCircleFacade orderStatisticsCircleFacade;
	
	@Autowired
	OrderStatisticsInfoService orderStatisticsInfoService;
	
	@Autowired
	UnionFacade unionFacade;
	
	@Autowired
	SyPoorService syPoorService;
	
	@Autowired
	RoleService roleService;
	
	@Autowired
	SyAreaFullService syAreaFullService;
	
	@Autowired
	SyGoodsCommonService syGoosCommonService;
	
	@Autowired
	private AreaChannelService areaChannelService;
	
	@Autowired
	private SySupportAreaService sySupportAreaService;
	
	@Autowired
	private PointsStatisticsService pointsStatisticsService;
	
	@Autowired
	private OrderStatisticsFacade orderStatisticsFacade;
	
	@Autowired
	OrderStatisticsOfflineBizOrderService orderStatisticsOfflineBizOrderService;
	
	@Autowired
	SyAreaFullMapper syAreaFullMapper;
	
	@Autowired
	private ProvideStatisticsService provideStatisticsService;
	
	@Autowired
	private AssistStatisticsService assistStatisticsService;
	
	@Autowired
	private UnionService unionService;
	
	@Autowired
	private PointStatisticsFacade pointStatisticsFacade;
	
	@Override
	public void createTable(String tableName) {
		StatisticsTable table = new StatisticsTable();
		table.setTableName(tableName);
		orderStatisticsService.createTable(table);
	}
	
	
	/**
	 * @author fzh
	 * 根据积分段pointsTag获取会员详细信息
	 * name:累计积分人数或者可用积分人数的字段名
	 */
	public JSONObject getUserDetailInfos(Long pointTag,String name,Integer unionId,String phone,String trueName,Integer currentPage, Integer type) {
		JSONObject jsonObject = new JSONObject();
		Page<PointDetailsTag> userDetailsInfos = pointsStatisticsService.getUserDetailsInfos(pointTag,name,unionId,phone,trueName,currentPage, type);
		jsonObject.put("pointsDetailsList", userDetailsInfos.getResult());
		jsonObject.put("currentPage", currentPage);
		jsonObject.put("totalPageNum", userDetailsInfos.getPages());
		return jsonObject;
	}
	
	/**
	 * @author fzh
	 * 利用积分日志表获取积分使用信息
	 */
	public JSONObject getPointsInfos(Integer memberId,Integer pageNum, Integer type) {
		JSONObject jsonObject = new JSONObject();
		List<PointsLogDomain> list = new ArrayList<PointsLogDomain>();
		Page<SyPointsLog> pointsInfosService = pointsStatisticsService.getPointsInfosService(memberId, pageNum, type);
		for (SyPointsLog syPointsLog : pointsInfosService.getResult()) {
			PointsLogDomain log = new PointsLogDomain();
			DateUtil.getIntegerToSdf(Long.valueOf(syPointsLog.getPlAddtime().toString()));
			log.setPointsAddTime(DateUtil.getIntegerToSdf(Long.valueOf(syPointsLog.getPlAddtime().toString())));
			log.setPoints(syPointsLog.getPlPoints());
			log.setDesc(syPointsLog.getPlDesc());
			list.add(log);
		}
		jsonObject.put("totalPage", pointsInfosService.getPages());
		jsonObject.put("pageNum", pageNum);
		jsonObject.put("pointDesc", list);
		return jsonObject;
	}
	
	/**
	 * @author fzh
	 * 获取用户积分统计--批量插入数据
	 */
	@Override
	public void getUserPointsStatistics(Integer limit) {
		
		logger.info("point stat start, time:{}", DateUtil.getNowInt());
		//创建临时表
		StatisticsTable statisticsTable = new StatisticsTable();
		String tableName = StatisticsConstant.TableName.POINT_DETAILS_TAG_TEMP;
		statisticsTable.setTableName(tableName);
		pointsStatisticsService.createPointTempTable(statisticsTable);
		
		List<SyMember> allValidMemberInfo = new ArrayList<SyMember>();
		Integer start = 0;
		do {
			logger.info("point stat, start:{}", start);
			allValidMemberInfo = pointsStatisticsService.getAllValidMemberInfo(start, limit);
			this.dealPointData(allValidMemberInfo);
			start += limit;
		} while (limit.equals(allValidMemberInfo.size()));
		//删除原来的point_details_tag表
		statisticsTable.setTableName(StatisticsConstant.TableName.POINT_DETAILS_TAG);
		pointsStatisticsService.dropTempTableService(statisticsTable);
		//将临时表重新修改为point_details_tag表
		pointsStatisticsService.alterTempTableService(statisticsTable);
		pointStatisticsFacade.dealPointDetailCount();
		logger.info("point stat end, time:{}", DateUtil.getNowInt());
	}
	
	private Boolean dealPointData(List<SyMember> members){
		boolean result = true;
		List<PointDetailsTag> pointsList = new ArrayList<PointDetailsTag>();
		for (SyMember syMember : members) {
			PointDetailsTag pointDetailsTag = new PointDetailsTag();
			Integer memberId = syMember.getMemberId();
			pointDetailsTag.setMemberId(memberId);
			String channel = unionFacade.getChannelByMemberId(memberId);
			SyUnion union = (SyUnion) StatisticsUtils.getStatisticsUtils().getChannelUnion().get(channel);
		    if(!ObjectUtils.isEmpty(union)) {
		    	pointDetailsTag.setUnionId(union.getUnionId());
			    pointDetailsTag.setChannel(union.getUnionChannel());
			    pointDetailsTag.setUnionName(union.getUnionName());
		    }else{
		    	pointDetailsTag.setUnionId(0);
			    pointDetailsTag.setChannel("");
			    pointDetailsTag.setUnionName("");
		    }
		    pointDetailsTag.setMemberDispName(syMember.getMemberDispName());
		    pointDetailsTag.setTotalPoint(syMember.getBocPoints());
		    pointDetailsTag.setMemberMobile(syMember.getMemberMobile());
		    pointDetailsTag.setMemberName(syMember.getMemberName());
		    pointDetailsTag.setMemberTruename(syMember.getMemberTruename());
		    pointDetailsTag.setTotalPointTag(PointsUtils.getPointSection(syMember.getBocPoints()));
		    Long validPoints = syMember.getBocPoints()-syMember.getBocPointsUsed();
		    pointDetailsTag.setValidPointTag(PointsUtils.getPointSection(validPoints));
		    pointDetailsTag.setValidPoint(validPoints);
		    if(!pointsList.contains(pointDetailsTag)){
		    	pointsList.add(pointDetailsTag);
		    }
		}
		if(!CollectionUtils.isEmpty(pointsList)) {
			//临时表获取数据
			result = pointsStatisticsService.batchInsertServiceImpl(pointsList) == 1 ? true : false;
		}
		return result;
	}
	
	/**
	 * @author fzh
	 * 扶贫成果总览
	 */
	public JSONObject showPovertyOverviewDate(Integer time,Integer unionId,Long countryId,Integer currentPage) {
		
		//返回类型
		JSONObject jsonObject = new JSONObject(); 
		//参数
		ArrayList<PovertyAllevaitionOverviewDomain> list = new ArrayList<PovertyAllevaitionOverviewDomain>();
		PovertyAlleviationOverview alleviationOverview = new PovertyAlleviationOverview();
		alleviationOverview.setcTime(time);
		alleviationOverview.setUnionId(unionId);
		alleviationOverview.setCountryId(countryId);
		BigDecimal temp = new BigDecimal("0.00");
		
		//将单位“分”转换为元
		BigDecimal fen = new BigDecimal(100.00);
		//获取数据
		Page<PovertyAlleviationOverview> povertyOverviewList = orderStatisticsService.getPovertyOverviewService(alleviationOverview,currentPage);
		for (PovertyAlleviationOverview povertyAlleviationOverview : povertyOverviewList.getResult()) {
			PovertyAllevaitionOverviewDomain result = new PovertyAllevaitionOverviewDomain();
			result.setCountryName(povertyAlleviationOverview.getCountryName()==null?"":povertyAlleviationOverview.getCountryName());
			result.setcTime(povertyAlleviationOverview.getcTime()==null?0:povertyAlleviationOverview.getcTime());
			result.setDonateAmount(povertyAlleviationOverview.getDonateAmount()==null?temp:povertyAlleviationOverview.getDonateAmount().divide(fen).setScale(2, RoundingMode.DOWN));
			result.setFundAmount(povertyAlleviationOverview.getFundAmount()==null?temp:povertyAlleviationOverview.getFundAmount().divide(fen).setScale(2, RoundingMode.DOWN));
			result.setHelpAmount(povertyAlleviationOverview.getHelpAmount()==null?temp:povertyAlleviationOverview.getHelpAmount().divide(fen).setScale(2, RoundingMode.DOWN));
			result.setUnionName(povertyAlleviationOverview.getUnionName()==null?"":povertyAlleviationOverview.getUnionName());
			list.add(result);
		}
		
		jsonObject.put("povertyDatalist", list);
		jsonObject.put("currentPage", currentPage);
		jsonObject.put("totalPageNum", povertyOverviewList.getPages());
		return jsonObject;
	}
	
	/**
	 * @author fzh
	 * 扶贫成果总览(买家)  根据时间定时更新扶贫成果总览数据
	 */
	@Override
	public void getPovertyOverviewDate(Integer time) {
		
		List<PovertyAlleviationOverview> alleviationOverviewList = new ArrayList<PovertyAlleviationOverview>();
		List<SyUnion> allUnion = unionService.getAllUnion();
		for (SyUnion syUnion : allUnion) {
			List<SyAreaChannel> listAreaChannel = areaChannelService.listAreaChannel(syUnion.getUnionChannel(), UnionConstant.UnionSupportType.SUPPORT);
			for (SyAreaChannel syAreaChannel : listAreaChannel) {
				
				PovertyAlleviationOverview alleviationOverview = new PovertyAlleviationOverview();
				Integer unionId = syAreaChannel.getUnionId();
				String channel = syAreaChannel.getUnionChannel();
				//县id
				Long countryId = syAreaChannel.getAreaId();
				String countryName = syAreaChannel.getAreaName();
				//获取当前县所在的联盟信息
				SyUnion union = (SyUnion) StatisticsUtils.getStatisticsUtils().getChannelUnion().get(channel);
				String unionName;
				if(ObjectUtils.isEmpty(union)){
					logger.info("no union, channel: {}", channel);
					unionName = "";
				}else{
					unionName = union.getUnionName();
				}
				
				//根据县id获取省市
				SySupportArea supportArea = sySupportAreaService.getSupportAreaByCountryId(countryId);
				Long provinceId = supportArea.getAreaid1();
				String provinceName = supportArea.getAreaname1();
				Long cityId = supportArea.getAreaid2();
				String cityName = supportArea.getAreaname2();
				//根据时间，县id获取相应的数据
				Map<String, BigDecimal> povertyOverviewMap = this.getPovertyOverviewStatisticsAmount(time, union, countryId);
				BigDecimal fundAmount = povertyOverviewMap.get("fundAmount");
				BigDecimal helpAmount = povertyOverviewMap.get("helpAmount");
				BigDecimal donateAmount = povertyOverviewMap.get("donateAmount");
				alleviationOverview.setChannel(channel);
				alleviationOverview.setCityId(cityId);
				alleviationOverview.setCityName(cityName);
				alleviationOverview.setCountryId(countryId);
				alleviationOverview.setCountryName(countryName);
				alleviationOverview.setcTime(time);
				alleviationOverview.setDonateAmount(donateAmount);
				alleviationOverview.setFundAmount(fundAmount);
				alleviationOverview.setHelpAmount(helpAmount);
				alleviationOverview.setProvinceId(provinceId);
				alleviationOverview.setProvinceName(provinceName);
				alleviationOverview.setUnionId(unionId);
				alleviationOverview.setUnionName(unionName);
				alleviationOverviewList.add(alleviationOverview);
			}
		}
		if(!ObjectUtils.isEmpty(alleviationOverviewList)) {
			//批量插入数据
			orderStatisticsService.batchInsertPovertyOverviewTable(alleviationOverviewList);
		}else{
			logger.info("批量插入数据失败，无数据。表名：proverty_overview");
		}
	}
	
	/**
	 * @author fzh
	 * 获取扶贫成果之联盟帮扶、公益基金统计数据
	 */
	public Map<String,BigDecimal> getPovertyOverviewStatisticsAmount(Integer time, SyUnion union, Long countryId) {
		Map<String,BigDecimal> map = new HashMap<>();
		BigDecimal fundAmount = new BigDecimal("0.00");
		BigDecimal helpAmount = new BigDecimal("0.00");
		BigDecimal donateAmount = new BigDecimal("0.00");
		Integer start = 0;
		Integer limit = 10000;
		List<OrderStatisticsBaseData> list = new ArrayList<OrderStatisticsBaseData>();
		do {
			list = orderStatisticsService.getPovertyDataByBase(time, union.getUnionId(), countryId, start, limit);
			if(!ObjectUtils.isEmpty(list)) {
				for (OrderStatisticsBaseData orderStatisticsBaseData : list) {
					//帮扶总额
					if(orderStatisticsBaseData.getUnionId().equals(orderStatisticsBaseData.getsUnionId())) {
						helpAmount = helpAmount.add(orderStatisticsBaseData.getHelpPrice());
					}
					//公益基金单位分
					fundAmount = fundAmount.add(orderStatisticsBaseData.getHelpPrice());
					orderStatisticsBaseData.setTownshipId(orderStatisticsBaseData.getTownshipId());
					orderStatisticsBaseData.setTownshipName(orderStatisticsBaseData.getTownshipName());
					orderStatisticsBaseData.setVillageId(orderStatisticsBaseData.getVillageId());
					orderStatisticsBaseData.setVillageName(orderStatisticsBaseData.getVillageName());
				}
			}
			start += limit;
		} while (list.size() == limit);
		Integer endTime = DateUtil.getEndTimeOfDay(DateUtil.getDateFormInt(time));
		//公益捐赠总额
		Map<String, BigDecimal> welfareDonation = this.getWelfareDonation(endTime, union.getUnionChannel());
		donateAmount = welfareDonation.get("donateAmount").add(donateAmount);
		map.put("fundAmount", fundAmount);
		map.put("helpAmount", helpAmount);
		map.put("donateAmount", donateAmount);
		return map;
	}
	
	/**
	 * @author fzh
	 * 获取扶贫总览中公益捐赠
	 */
	public Map<String,BigDecimal> getWelfareDonation(Integer time,String channel) {
		BigDecimal donateAmount = new BigDecimal("0.00");
		Map<String,BigDecimal> map = new HashMap<>();
		List<SyProjectMoneyOrder> welfareDonationService = orderStatisticsService.getWelfareDonationService(time, channel);
		if(!ObjectUtils.isEmpty(welfareDonationService)) {
			for (SyProjectMoneyOrder syProjectMoneyOrder : welfareDonationService) {
				donateAmount = donateAmount.add(syProjectMoneyOrder.getOrderAmount());
			}
		}
		map.put("donateAmount", donateAmount);
		return map;
	}
	/**
	 * 获取base数据
	 */
	@Override
	public List<OrderStatisticsInfo> getOrderStatisticsBaseData(Integer startTime, Integer endTime, Integer start, Integer limit){
		logger.info("get basedata start, time:{}", DateUtil.getNowInt());
		List<OrderStatisticsInfo> hasStatData = orderStatisticsInfoService.getBaseData(Integer.valueOf(DateUtil.getIntegerYearMonthDay(startTime)));
		List<OrderStatisticsInfo> result = new ArrayList<OrderStatisticsInfo>();
		JSONObject channelUnion = StatisticsUtils.getStatisticsUtils().getChannelUnion();
		List<SyOrder> syOrderList = orderStatisticsService.getValidOrder(startTime, endTime, start, limit);
		for(SyOrder syOrder : syOrderList) {
			Integer goodsNum = 0;
			BigDecimal help_price = new BigDecimal("0");
			OrderStatisticsInfo baseData = new OrderStatisticsInfo();
			List<SyOrderGoods> goodsDetailList = orderStatisticsService.getGoodsDetail(syOrder.getOrderId());
			//通过getGoodsProjectType以及ownerType计算goodsNum 大爱超市助理人的帮扶金额
			if(syOrder.getGoodsProjectType().equals(OrderConstant.ProjectType.PROJECT_TYPE_DA_SHOP)) {
				for (SyOrderGoods syOrderGoods2 : goodsDetailList) {
					if(syOrderGoods2.getOwnerType().equals("agent")) {
						syOrder.getOrderAmount();
						BigDecimal discountMoney = syOrderGoods2.getDiscountMoney();
						BigDecimal cost = (syOrderGoods2.getGoodsPrice().subtract(discountMoney)).multiply(new BigDecimal(syOrderGoods2.getGoodsNum()));
						Integer rate =1- Integer.valueOf(syOrderGoods2.getmFeeRate()/1000);
						help_price = help_price.add(cost.multiply(new BigDecimal(rate)));
					}else {
						help_price = new BigDecimal("0");
					}
				}
			}
			String buyerChannel = syOrder.getBuyerChannel();
			if(!StringUtils.isEmpty(buyerChannel)){
				SyUnion union = (SyUnion) channelUnion.get(buyerChannel);
				if(ObjectUtils.isEmpty(union)){
					baseData.setUnionId(0);
					baseData.setUnionName("");
					baseData.setChannel("");
				}else{
					baseData.setUnionId(union.getUnionId());
					baseData.setUnionName(union.getUnionName());
					baseData.setChannel(buyerChannel);
				}
			}else{
				baseData.setUnionId(0);
				baseData.setUnionName("");
				baseData.setChannel("");
			}
			baseData.setHelpPrice(help_price);
			Integer orderId = syOrder.getOrderId();
			baseData.setOrderId(orderId);//订单id
			baseData.setFinishedTime(syOrder.getFinnshedTime());//完成时间
			baseData.setOrderAmount(syOrder.getOrderAmount());//订单总金额
			baseData.setGoodsAmount(syOrder.getGoodsAmount());//商品总金额
			baseData.setPdAmount(syOrder.getPdAmount());//预存款支付金额
			baseData.setOrderFrom(syOrder.getOrderFrom());//订单来源
			Integer publishId = syOrder.getPublisherId();//卖家id
			baseData.setSellerId(publishId);//卖家id
			baseData.setSellerName("");//卖家名称
			baseData.setStoreId(syOrder.getStoreId());//店铺id
			baseData.setBuyerId(syOrder.getBuyerId());
			baseData.setBuyerName(syOrder.getBuyerName());
			baseData.setGoodsProjectType(syOrder.getGoodsProjectType());
			baseData.setSyPoints(syOrder.getSyPoints());
			baseData.setChannel(syOrder.getChannel());
			baseData.setCouponPay(syOrder.getCouponPay());
			baseData.setMoneyPay(syOrder.getMoneyPay());
			baseData.setAssistId(syOrder.getAssistId());
			baseData.setAppVariant(syOrder.getAppVariant());
			baseData.setSupportCountyId(syOrder.getSupportCountyId());
			baseData.setDiscountAmount(syOrder.getDiscountAmount());
			baseData.setBizOperationMid(syOrder.getBizOperationMid());
			baseData.setPlatformPay(syOrder.getPlatformPay());
			baseData.setServiceFeeRate(syOrder.getServiceFeeRate());
			baseData.setServiceFee(syOrder.getServiceFee());
			baseData.setAgentFee(syOrder.getAgentFee());
			baseData.setFundFeeRate(syOrder.getFundFeeRate());
			baseData.setFundFee(syOrder.getFundFee());
			baseData.setStoreId(syOrder.getStoreId());
			baseData.setTableName(StatisticsConstant.TableName.BASE_DATA_TABLE_NAME);
			
			//获取卖家信息
			String channel = unionFacade.getChannelByMemberId(syOrder.getPublisherId());
			baseData.setsUnionChannel(StringUtils.isEmpty(channel) ? "" : channel);
			if(!StringUtils.isEmpty(channel)){
				SyUnion union = (SyUnion) channelUnion.get(channel);
				if(!ObjectUtils.isEmpty(union)){
					baseData.setsUnionId(union.getUnionId());
					baseData.setsUnionName(union.getUnionName());
				}else{
					baseData.setsUnionId(0);
					baseData.setsUnionName("");
				}
			}else {
				baseData.setsUnionId(0);
				baseData.setsUnionName("");
			}
			for (SyOrderGoods syOrderGoods : goodsDetailList) {
				goodsNum += syOrderGoods.getGoodsNum();
			}
			baseData.setGoodsNum(goodsNum);
			//卖家类型
			Integer type = syOrder.getGoodsProjectType();
			if(type.equals(OrderConstant.ProjectType.PROJECT_TYPE_DA_SHOP) && syOrder.getAssistId() > 0) {
			//线上集采的帮扶金额
				baseData.setSellerType(SellerType.onlineBiz.getCode());
				BigDecimal cost = syOrder.getGoodsAmount().subtract(syOrder.getDiscountAmount()).subtract(syOrder.getServiceFee()).subtract(syOrder.getFundFee());
				cost.setScale(0, RoundingMode.UP);
				if(ObjectUtils.isEmpty(cost)){
					cost = new BigDecimal(0);
				}
				baseData.setHelpPrice((cost.multiply(new BigDecimal(0.1).setScale(1, RoundingMode.UP)).setScale(0, RoundingMode.UP)));
			}else if(type.equals(OrderConstant.ProjectType.PROJECT_TYPE_DA_SHOP) && !ObjectUtils.isEmpty(userCorrelationService.getRoleAgent(publishId))){
				baseData.setSellerType(SellerType.agent.getCode());
				//卖家地区——助理人
				SyRole syRole = roleService.getSyRoleByMemberIdAndType(publishId, RoleType.ROLE_TYPE_COOP,RoleType.ROLE_TYPE_WS,RoleType.ROLE_TYPE_GOV,RoleType.ROLE_TYPE_INDUSTRY).get(0);
				Long areaId1 = Long.valueOf(syRole.getAreaid1().toString());
				Long areaId2 = Long.valueOf(syRole.getAreaid2().toString());
				Long areaId3 = Long.valueOf(syRole.getAreaid3().toString());
				baseData.setProvinceId(areaId1);
				baseData.setCityId(areaId2);
				baseData.setCountryId(areaId3);
				if(!areaId1.equals(0L)) {
					SyAreaFull provinceInfo = (SyAreaFull)StatisticsUtils.getStatisticsUtils().getAreaInfo().get(areaId1.toString());
					baseData.setProvinceName(ObjectUtils.isEmpty(provinceInfo) ? "" : provinceInfo.getAreaName());
				}
				if(!areaId2.equals(0L)) {
					SyAreaFull cityInfo = (SyAreaFull)StatisticsUtils.getStatisticsUtils().getAreaInfo().get(areaId2.toString());
					baseData.setCityName(ObjectUtils.isEmpty(cityInfo) ? "" : cityInfo.getAreaName());
				}
				if(!areaId3.equals(0L)) {
					SyAreaFull countryInfo = (SyAreaFull)StatisticsUtils.getStatisticsUtils().getAreaInfo().get(areaId3.toString());
					baseData.setCountryName(ObjectUtils.isEmpty(countryInfo) ? "" : countryInfo.getAreaName());
				}

			}else if(type.equals(OrderConstant.ProjectType.PROJECT_TYPE_DA_SHOP) && !ObjectUtils.isEmpty(userCorrelationService.getPoorInfo(publishId))) {
				baseData.setSellerType(SellerType.poor.getCode());
				//大爱超市贫困户的帮扶金额
				BigDecimal cost = syOrder.getGoodsAmount().add(syOrder.getShippingFee()).subtract(syOrder.getServiceFee()).subtract(syOrder.getFundFee());
				cost.setScale(0, RoundingMode.UP);
				if(ObjectUtils.isEmpty(cost)){
					cost = new BigDecimal(0);
				}
				baseData.setHelpPrice(cost.setScale(1, RoundingMode.UP));
				//卖家地区——贫困户
				SyPoor syPoor = syPoorService.getSyPoorByMemberId(publishId);
				baseData.setProvinceId(Long.valueOf(syPoor.getAreaid1().toString()));
				baseData.setCityId(Long.valueOf(syPoor.getAreaid2().toString()));
				baseData.setCountryId(Long.valueOf(syPoor.getAreaid3().toString()));
				baseData.setProvinceName(syPoor.getpAddr1());
				baseData.setCityName(syPoor.getpAddr2());
				baseData.setCountryName(syPoor.getpAddr3());
			}else if(type.equals(OrderConstant.ProjectType.PROJECT_TYPE_SY_SHOP)) {
				baseData.setSellerType(SellerType.syshop.getCode());
				baseData.setHelpPrice(syOrder.getFundFee());
			}else {
				baseData.setSellerType(SellerType.offlineBiz.getCode());
				BigDecimal rate = new BigDecimal("0.1");
				rate.setScale(2, RoundingMode.DOWN);
				baseData.setHelpPrice(syOrder.getOrderAmount().multiply(rate));
			}
			//circle相关信息
			StatCircleInfoDomain statCircleInfoDomain = this.getCircleInfo(syOrder.getBuyerId());
			baseData.setCircleIdDeep1(statCircleInfoDomain.getCircleIdDeep1());
			baseData.setCircleIdDeep2(statCircleInfoDomain.getCircleIdDeep2());
			baseData.setCircleIdDeep3(statCircleInfoDomain.getCircleIdDeep3());
			baseData.setCircleIdDeep4(statCircleInfoDomain.getCircleIdDeep4());
			baseData.setCircleIdDeep5(statCircleInfoDomain.getCircleIdDeep5());
			baseData.setCircleIdDeep6(statCircleInfoDomain.getCircleIdDeep6());
			baseData.setCircleIdDeep7(statCircleInfoDomain.getCircleIdDeep7());
			baseData.setCircleName(StringUtils.isEmpty(statCircleInfoDomain.getCircleName()) ? "" : statCircleInfoDomain.getCircleName()) ;
			StatCircleInfoDomain circleInfoDomain = this.getCircleInfo(syOrder.getPublisherId());
			baseData.setsCircleIdDeep1(circleInfoDomain.getCircleIdDeep1());
			baseData.setsCircleIdDeep2(circleInfoDomain.getCircleIdDeep2());
			baseData.setsCircleIdDeep3(circleInfoDomain.getCircleIdDeep3());
			baseData.setsCircleIdDeep4(circleInfoDomain.getCircleIdDeep4());
			baseData.setsCircleIdDeep5(circleInfoDomain.getCircleIdDeep5());
			baseData.setsCircleIdDeep6(circleInfoDomain.getCircleIdDeep6());
			baseData.setsCircleIdDeep7(circleInfoDomain.getCircleIdDeep7());
			baseData.setsCircleName(StringUtils.isEmpty(circleInfoDomain.getCircleName()) ? "" : circleInfoDomain.getCircleName());
			baseData.setcTime(Integer.valueOf(DateUtil.getIntegerYearMonthDay(syOrder.getFinnshedTime())));
			if(!hasStatData.contains(baseData)){
				result.add(baseData);
			}
		}
		logger.info("get basedata end, time:{}", DateUtil.getNowInt());
		return result;
	}

	/**
	 * 从base中获取联盟买家分表数据
	 * @author FZ
	 */
	
	@Override
	public List<OrderStatisticsInfo> getUnionBuyTableData(Integer cTime) {
		List<OrderStatisticsInfo> baseDatas = orderStatisticsInfoService.getBaseData(cTime);
		for(OrderStatisticsInfo baseData : baseDatas) {
			String tableName = StatisticsConstant.TableName.UNION_DATA_TABLE_NAME_BUYER + baseData.getCircleIdDeep1()%10 + "_" + DateUtil.getIntegerYearMonth(baseData.getFinishedTime());
			baseData.setTableName(tableName);
		}
		return baseDatas;
	}
	
	/**
	 * 从base中获取联盟卖家分表数据
	 * @author FZ
	 */
	
	@Override
	public List<OrderStatisticsInfo> getUnionSellerTableData(Integer cTime) {
		List<OrderStatisticsInfo> baseDatas = orderStatisticsInfoService.getBaseData(cTime);
		for(OrderStatisticsInfo baseData : baseDatas) {
			String tableName = StatisticsConstant.TableName.UNION_DATA_TABLE_NAME_SELLER + baseData.getCircleIdDeep1() % 10 + "_" + DateUtil.getIntegerYearMonth(baseData.getFinishedTime());
			baseData.setTableName(tableName);
		}
		return baseDatas;
	}

	
	/**
	 * 从base中获取地区分表数据
	 * @author 冯志红
	 */
	@Override
	public List<OrderStatisticsInfo> getAreaTableData(Integer cTime) {
		List<OrderStatisticsInfo> baseDatas = orderStatisticsInfoService.getBaseData(cTime);
		for(OrderStatisticsInfo baseData : baseDatas) {
			String tableName = StatisticsConstant.TableName.AREA_DATA_TABLE_NAME + baseData.getProvinceId()+ "_" + DateUtil.getIntegerYearMonth(baseData.getFinishedTime());
			baseData.setTableName(tableName);
		}
		
		return baseDatas;
	}

	@Override
	public void insertByTableName(OrderStatisticsInfo orderStatisticsInfo) {
		orderStatisticsService.insertByTableName(orderStatisticsInfo);
	}

	@Override
	public StatCircleInfoDomain getCircleInfo(Integer buyerId) {
		SyCircleMember circleMemberInfo = circleMemberService.getCircleMemberInfoByMemberId(buyerId);
		StatCircleInfoDomain result = new StatCircleInfoDomain();
		if(ObjectUtils.isEmpty(circleMemberInfo)){
			if(logger.isDebugEnabled()){
				logger.debug("用户未加入circle， memberid：{}", buyerId);
			}
			return result;
		}
		result = orderStatisticsCircleFacade.getBuyerCircleInfoByMap(circleMemberInfo.getCircleId());
		return result;
	}

	/**
	 * @author fzh
	 */
	@Override
	public JSONObject getAllCircleInfos() {
		JSONObject map = new JSONObject();
		List<SyCircle> circleInfoList = circleMemberService.getAllCircleInfo();
		for (SyCircle syCircle : circleInfoList) {
			map.put(syCircle.getCircleId() + "", syCircle);
		}
		return map;
	}

	@Override
	public void statisticsBaseData(Integer startTime, Integer endTime, Integer limit) {
//		List<OrderStatisticsInfo> areaTableDatas = new ArrayList<OrderStatisticsInfo>();
//		Map<String,List<OrderStatisticsInfo>> batchMap = new HashMap<String,List<OrderStatisticsInfo>>();
//		List<String> tableNamesList = new ArrayList<String>();
		int beginTime = DateUtil.getNowInt();
		logger.info("startTime:{}", beginTime);
		int start = 0;
		List<OrderStatisticsInfo> baseDatas = new ArrayList<OrderStatisticsInfo>();
		do{
			logger.info("start stat base data, time: {}", DateUtil.getNowInt());
			baseDatas = this.getOrderStatisticsBaseData(startTime, endTime, start ,limit);
			if(CollectionUtils.isEmpty(baseDatas)) {
				logger.info("basedata is empty, do not insert");
				break;
			}
			orderStatisticsInfoService.batchInsert(StatisticsConstant.TableName.BASE_DATA_TABLE_NAME, baseDatas);
			start += limit;
			logger.info("end stat base data, time: {}, start:{}", DateUtil.getNowInt(), start);
			//分表插入， 不需要
//			areaTableDatas.addAll(baseDatas);
//			for(OrderStatisticsInfo areaTableData : areaTableDatas) {
//				//省份订单数据的批量插入
//				String tableName = null;
//				if(!ObjectUtils.isEmpty(areaTableData.getProvinceId())) {
//					 tableName = StatisticsConstant.TableName.AREA_DATA_TABLE_NAME + areaTableData.getProvinceId() + "_" + areaTableData.getcTime().toString().substring(0, 6);
//					 this.batchInsertPack(batchMap, tableName, areaTableData, tableNamesList);
//				}
//
//				tableName = StatisticsConstant.TableName.UNION_DATA_TABLE_NAME_BUYER + areaTableData.getUnionId()%10 + "_" + areaTableData.getcTime().toString().substring(0, 6);
//				this.batchInsertPack(batchMap, tableName, areaTableData, tableNamesList);
//				//卖家订单数据的批量插入
//				tableName = StatisticsConstant.TableName.UNION_DATA_TABLE_NAME_SELLER + areaTableData.getsUnionId() % 10 + "_" + areaTableData.getcTime().toString().substring(0, 6);
//				this.batchInsertPack(batchMap, tableName, areaTableData, tableNamesList);
//			}
//			for (String tableName : tableNamesList) {
//				 List<OrderStatisticsInfo> list = batchMap.get(tableName);
//				if(!CollectionUtils.isEmpty(list)){
//					orderStatisticsInfoService.batchInsert(tableName, list);
//				}else{
//					if(logger.isDebugEnabled()){
//						logger.debug("no data for table, table:{}", tableName);
//					}
//				}
//			}
//			batchMap.clear();
//			areaTableDatas.clear();
		}while(baseDatas.size() == limit);
		logger.info("use time : {}", DateUtil.getNowInt() - beginTime);
	}
	
	/**
	 * @author 冯志红
	 * @return
	 * 初始化area信息
	 */
	public JSONObject getAreaInfos() {
		JSONObject map = new JSONObject();
		List<SyAreaFull> initAreaIds = orderStatisticsService.initAreaIds();
		for (SyAreaFull syAreaFull : initAreaIds) {
			map.put(syAreaFull.getAreaId()+"", syAreaFull);
		}
		return map;
	}
	
	
	
	/**
	 * @author fzh
	 * 平台销量统计
	 */
	public JSONObject platFormSaleStatistics(Integer startTime,Integer endTime,Integer currentPage) {
		JSONObject jsonObject = new JSONObject();
		List<PlatFormSellerInfoDomain> formSellerInfoDomainList = new ArrayList<PlatFormSellerInfoDomain>();
		//从新建的平台销量表中获取数据
		Page<PlatformStatisticsSellerData> platformSellerPageDataList = orderStatisticsService.getPlatformSellerPageData(startTime, endTime, currentPage);
		PlatformStatisticsSellerData platformStatisticsDate = orderStatisticsInfoService.getPlatformStatisticsDate(startTime, endTime);
		List<PlatformStatisticsSellerData> platformDateList = platformSellerPageDataList.getResult();
			//大爱超市 助理人
			Integer assistTotalOrderNums = 0;
			Integer assistTotalGoodsNums = 0;	
			BigDecimal assistTotalOrderAmount = new BigDecimal("0.00");
			BigDecimal assistTotalHelpPrice = new BigDecimal("0.00");
			//大爱超市    贫困户
			 Integer poorTotalOrderNums = 0;
			 Integer poorTotalGoodsNums = 0;
			 BigDecimal poorTotalOrderAmount = new BigDecimal("0.00");
			 //线上集采
			 Integer onlineTotalOrderNums = 0;
			 Integer onlineTotalGoodsNums = 0;
			 BigDecimal onlineTotalOrderAmount = new BigDecimal("0.00");
			 BigDecimal onlineTotalHelpPrice = new BigDecimal("0.00");
			 //线下集采
			 Integer offlineTotalOrderNums = 0;
			 Integer offlineTotalGoodsNums = 0;
			 BigDecimal offlineTotalOrderAmount = new BigDecimal("0.00");
			 BigDecimal offlineTotalHelpPrice = new BigDecimal("0.00");
			 //善缘商场
			 Integer syTotalOrderNums = 0;
			  Integer syTotalGoodsNums = 0;
			  BigDecimal syTotalOrderAmount = new BigDecimal("0.00");
			  BigDecimal syFundFee = new BigDecimal("0.00");
			
			for (PlatformStatisticsSellerData platFormSellerInfoDomain :platformDateList) {
					//大爱超市助理人
					assistTotalGoodsNums += platFormSellerInfoDomain.getAssistGoodsNum();
					assistTotalHelpPrice = platFormSellerInfoDomain.getAssitHelpPrice().add(assistTotalHelpPrice);
					assistTotalOrderAmount = platFormSellerInfoDomain.getAssistOrderAmount().add(assistTotalOrderAmount);
					assistTotalOrderNums += platFormSellerInfoDomain.getAssistOrderNum();
					//大爱超市贫困户
					poorTotalOrderNums += platFormSellerInfoDomain.getPoorOrderNum();//订单量
					poorTotalOrderAmount = platFormSellerInfoDomain.getPoorOrderAmount().add(poorTotalOrderAmount);//销售量
					poorTotalGoodsNums += platFormSellerInfoDomain.getPoorGoodsNum();//销售量
				    //善缘甄选  线上
					onlineTotalGoodsNums += platFormSellerInfoDomain.getOnlineGoodsNum();
					onlineTotalHelpPrice = platFormSellerInfoDomain.getOnlineHelpPrice().add(onlineTotalHelpPrice);
					onlineTotalOrderAmount = platFormSellerInfoDomain.getOnlineOrderAmount().add(onlineTotalOrderAmount);
					onlineTotalOrderNums += platFormSellerInfoDomain.getOnlineOrderNum();
				    //善缘甄选 线下
					offlineTotalGoodsNums += platFormSellerInfoDomain.getOfflineGoodsNum();
					offlineTotalHelpPrice = platFormSellerInfoDomain.getOfflineHelpPrice().add(offlineTotalHelpPrice);
					offlineTotalOrderAmount = platFormSellerInfoDomain.getOfflineOrderAmount().add(offlineTotalOrderAmount);
					offlineTotalOrderNums += platFormSellerInfoDomain.getOfflineOrderNum();
				    //善缘商场
					 syTotalOrderNums += platFormSellerInfoDomain.getSyOrderNum();
					 syTotalGoodsNums += platFormSellerInfoDomain.getSyGoodsNum();
					 syTotalOrderAmount = platFormSellerInfoDomain.getSyOrderAmount().add(syTotalOrderAmount);
					 syFundFee = platFormSellerInfoDomain.getSyDonationAmount().add(syFundFee);
					}
		//将单位“分”转换为元
		BigDecimal fen = new BigDecimal(100.00);
		//每天数据的累计统计
		PlatFormSellerInfoDomain formSellerInfoDomain = new PlatFormSellerInfoDomain(0,platformStatisticsDate.getAssistOrderNum(), platformStatisticsDate.getAssistGoodsNum(),
				platformStatisticsDate.getAssistOrderAmount().divide(fen).setScale(2, RoundingMode.DOWN), platformStatisticsDate.getAssitHelpPrice().divide(fen).setScale(2, RoundingMode.DOWN), 
				platformStatisticsDate.getPoorOrderNum(), platformStatisticsDate.getPoorGoodsNum(), platformStatisticsDate.getPoorOrderAmount().divide(fen).setScale(2, RoundingMode.DOWN), 
				platformStatisticsDate.getOnlineOrderNum(), platformStatisticsDate.getOnlineGoodsNum(), platformStatisticsDate.getOnlineOrderAmount().divide(fen).setScale(2, RoundingMode.DOWN), 
				platformStatisticsDate.getOnlineHelpPrice().divide(fen).setScale(2, RoundingMode.DOWN), platformStatisticsDate.getOfflineOrderNum(),
				platformStatisticsDate.getOfflineGoodsNum(), platformStatisticsDate.getOfflineOrderAmount().divide(fen).setScale(2, RoundingMode.DOWN), 
				platformStatisticsDate.getOfflineHelpPrice().divide(fen).setScale(2, RoundingMode.DOWN), platformStatisticsDate.getSyOrderNum(), platformStatisticsDate.getSyGoodsNum(), 
				platformStatisticsDate.getSyOrderAmount().divide(fen).setScale(2, RoundingMode.DOWN), platformStatisticsDate.getSyDonationAmount().divide(fen).setScale(2, RoundingMode.DOWN));
		formSellerInfoDomainList.add(formSellerInfoDomain);
		//大爱超市总的数据进行统计
		PlatFormTotalDomain daDomian = new PlatFormTotalDomain();
		daDomian.setTotalGoodsNums(formSellerInfoDomain.getAssistTotalGoodsNums()+formSellerInfoDomain.getPoorTotalGoodsNums());
		daDomian.setTotalHelpPrice(formSellerInfoDomain.getAssistTotalHelpPrice());
		daDomian.setTotalOrderAmount((formSellerInfoDomain.getAssistTotalOrderAmount().add(formSellerInfoDomain.getPoorTotalOrderAmount())));
		daDomian.setTotalOrderNums(formSellerInfoDomain.getAssistTotalOrderNums()+formSellerInfoDomain.getPoorTotalOrderNums());
		daDomian.setFundFee(new BigDecimal("0.00"));
		//集采
		PlatFormTotalDomain syzxDomian = new PlatFormTotalDomain();
		syzxDomian.setTotalGoodsNums(formSellerInfoDomain.getOnlineTotalGoodsNums()+formSellerInfoDomain.getOfflineTotalGoodsNums());
		syzxDomian.setTotalHelpPrice((formSellerInfoDomain.getOnlineTotalHelpPrice().add(formSellerInfoDomain.getOfflineTotalHelpPrice())));
		syzxDomian.setTotalOrderAmount((formSellerInfoDomain.getOnlineTotalOrderAmount().add(formSellerInfoDomain.getOfflineTotalOrderAmount())));
		syzxDomian.setTotalOrderNums(formSellerInfoDomain.getOnlineTotalOrderNums()+formSellerInfoDomain.getOfflineTotalOrderNums());
		syzxDomian.setFundFee(new BigDecimal("0.00"));
		//平台销量总统计
		PlatFormTotalDomain platFormDomian = new PlatFormTotalDomain();
		platFormDomian.setTotalGoodsNums(daDomian.getTotalGoodsNums()+syzxDomian.getTotalGoodsNums()+formSellerInfoDomain.getSyTotalGoodsNums());
		platFormDomian.setTotalHelpPrice(daDomian.getTotalHelpPrice().add(syzxDomian.getTotalHelpPrice()));
		platFormDomian.setTotalOrderAmount((daDomian.getTotalOrderAmount().add(syzxDomian.getTotalOrderAmount())));
		platFormDomian.setTotalOrderNums(daDomian.getTotalOrderNums()+syzxDomian.getTotalOrderNums());
		platFormDomian.setFundFee(formSellerInfoDomain.getSyDonationAmount());
		jsonObject.put("platFormDailyDate", platformSellerPageDataList);
		jsonObject.put("statisticsDailyDate", formSellerInfoDomainList);
		jsonObject.put("daTotal", daDomian);
		jsonObject.put("syzxTotal", syzxDomian);
		jsonObject.put("platformTotal", platFormDomian);
		jsonObject.put("totalPageNum",platformSellerPageDataList.getPages());
		jsonObject.put("currentPage", currentPage);
		return jsonObject;
	}
	
	/**
	 * @author fzh
	 * 联盟销售数据封装--保证数据库每天都有数据
	 */
	@Override
	public void getPlatFormSellerDataPack(Integer startTime){
		
		List<PlatformStatisticsSellerData> platFormtList = new ArrayList<PlatformStatisticsSellerData>();
		List<PlatFormDataStatisticsDomain> PlatFormDataList = orderStatisticsService.selectPlatFormOrderBaseStatistics(startTime);
		
		Map<String, List<OfflineStatisticsDomain>> platformOfflineOrderStatistics2 = this.getPlatformOfflineOrderStatistics(startTime);
		List<OfflineStatisticsDomain> list = platformOfflineOrderStatistics2.get("offline");
			//大爱超市 助理人
			BigDecimal daAgentOrderAmount = new BigDecimal("0.00");
			Integer daAgentGoodsNum = 0;
			Integer daAgentOrderNum = 0;
			BigDecimal daAgentHelpPrice = new BigDecimal("0.00");
			//大爱超市 贫困户
			BigDecimal daPoorOrderAmount = new BigDecimal("0.00");
			Integer daPoorGoodsNum = 0;
			Integer daPoorOrderNum = 0;
			//善源甄选	线上
			BigDecimal onlineOrderAmount = new BigDecimal("0.00");
			Integer onlineGoodsNum = 0;
			Integer onlineOrderNum = 0;
			BigDecimal onlineHelpPrice = new BigDecimal("0.00");
			//善源商场
			BigDecimal syOrderAmount = new BigDecimal("0.00");
			Integer syGoodsNum = 0;
			Integer syOrderNum = 0;
			BigDecimal syFundFee = new BigDecimal("0.00");
			//线下集采
			BigDecimal offlineOrderAmount = new BigDecimal("0.00");
			Integer offlineGoodsNum = 0;
			Integer offlineOrderNum = 0;
			BigDecimal offlineHelpPrice = new BigDecimal("0.00");
			if(!CollectionUtils.isEmpty(PlatFormDataList)) {
				for (PlatFormDataStatisticsDomain info : PlatFormDataList) {
					//大爱超市	助理人
					if(info.getGoodsProjectType().equals(OrderConstant.ProjectType.PROJECT_TYPE_DA_SHOP) && info.getAssistId().equals(StatisticsConstant.AssistId.ASSIST_ID_0) && info.getSellerType().equals(SellerType.agent.getCode())) {
							daAgentOrderAmount = daAgentOrderAmount.add(info.getOrderAmount());
							daAgentHelpPrice = daAgentHelpPrice.add(info.getHelpAmount());
							daAgentOrderNum += info.getOrderNum();
							daAgentGoodsNum += info.getGoodsNum();
					}
					//大爱超市 贫困户
					if(info.getGoodsProjectType().equals(OrderConstant.ProjectType.PROJECT_TYPE_DA_SHOP) && info.getAssistId().equals(StatisticsConstant.AssistId.ASSIST_ID_0) && info.getSellerType().equals(SellerType.poor.getCode())) {
						daPoorOrderAmount = daPoorOrderAmount.add(info.getOrderAmount());
						daPoorOrderNum += info.getOrderNum();
						daPoorGoodsNum += info.getGoodsNum();
					}
					//善源甄选	线上
					if(info.getGoodsProjectType().equals(OrderConstant.ProjectType.PROJECT_TYPE_DA_SHOP) && info.getAssistId().compareTo(StatisticsConstant.AssistId.ASSIST_ID_0) ==1) {
						onlineOrderAmount = onlineOrderAmount.add(info.getOrderAmount());
						onlineOrderNum += info.getOrderNum();
						onlineGoodsNum += info.getGoodsNum();
						onlineHelpPrice = onlineHelpPrice.add(info.getHelpAmount());
					}
					//善缘商场
					if(info.getGoodsProjectType().equals(OrderConstant.ProjectType.PROJECT_TYPE_SY_SHOP)) {
						syOrderAmount = syOrderAmount.add(info.getOrderAmount());
						syOrderNum += info.getOrderNum();
						syGoodsNum += info.getGoodsNum();
						syFundFee = syFundFee.add(info.getFundFee());
					}
				}
			}
			//线下集采
			if(CollectionUtils.isEmpty(list)) {
				for (OfflineStatisticsDomain offlineStatisticsDomain : list) {
					if(offlineStatisticsDomain.getcTime().equals(startTime)) {
						offlineOrderAmount = offlineStatisticsDomain.getOrderAmount();
						offlineGoodsNum = offlineStatisticsDomain.getGoodsNum();
						offlineOrderNum = offlineStatisticsDomain.getOrderNum();
						offlineHelpPrice = offlineStatisticsDomain.getHelpPrice();
					}
				}
			}
			
			PlatformStatisticsSellerData records = new PlatformStatisticsSellerData();
			records.setcTime(startTime);
			records.setAssistGoodsNum(daAgentGoodsNum);
			records.setAssistOrderAmount(daAgentOrderAmount);
			records.setAssistOrderNum(daAgentOrderNum);
			records.setAssitHelpPrice(daAgentHelpPrice);
			records.setPoorGoodsNum(daPoorGoodsNum);
			records.setPoorOrderAmount(daPoorOrderAmount);
			records.setPoorOrderNum(daPoorOrderNum);
			records.setOnlineGoodsNum(onlineGoodsNum);
			records.setOnlineHelpPrice(onlineHelpPrice);
			records.setOnlineOrderAmount(onlineOrderAmount);
			records.setOnlineOrderNum(onlineOrderNum);
			records.setOfflineGoodsNum(offlineGoodsNum);
			records.setOfflineHelpPrice(offlineHelpPrice);
			records.setOfflineOrderAmount(offlineOrderAmount);
			records.setOfflineOrderNum(offlineOrderNum);
			records.setSyDonationAmount(syFundFee);
			records.setSyGoodsNum( syGoodsNum);
			records.setSyOrderNum(syOrderNum);
			records.setSyOrderAmount(syOrderAmount);
			platFormtList.add(records);
		//批量插入
		if(!ObjectUtils.isEmpty(platFormtList)) {
			//批量插入数据
			orderStatisticsService.batchInsertPlatformDataService(platFormtList);
		}else{
			logger.info("批量插入数据失败，无数据。表名：statistics_platform_seller_data");
		}
		
	}
	
	/**
	 * @author fzh
	 * 平台销量数据:线下集采数据统计
	 */
	@Override
	public Map<String,List<OfflineStatisticsDomain>> getPlatformOfflineOrderStatistics(Integer time) {
		
		Map<String,List<OfflineStatisticsDomain>> map = new HashMap<String,List<OfflineStatisticsDomain>>();
		List<OfflineStatisticsDomain> list = new ArrayList<OfflineStatisticsDomain>();
		//获取每天帮扶金额  销售额
		List<OfflineStatisticsDomain> orderList = orderStatisticsService.getOffLineOrderinfos(time);
		//获取每天订单量   销量	 
		List<OfflineStatisticsDomain> orderGoodsList = orderStatisticsService.getOffLineOrderGoodsinfos(time);
		BigDecimal helpPrice = new BigDecimal("0.00");
		BigDecimal orderAmount = new BigDecimal("0.00");
		Integer orderNum = 0;
		Integer goodsNum = 0;
		for (int i = 0; i < orderGoodsList.size(); i++) {
			OfflineStatisticsDomain domain = new OfflineStatisticsDomain();
			OfflineStatisticsDomain offlineStatisticsDomain = orderList.get(i);
			OfflineStatisticsDomain offlineStatisticsDomain2 = orderGoodsList.get(i);
			domain.setcTime(offlineStatisticsDomain.getcTime());
			domain.setHelpPrice(ObjectUtils.isEmpty(offlineStatisticsDomain.getHelpPrice())?helpPrice:offlineStatisticsDomain.getHelpPrice());
			domain.setOrderAmount((ObjectUtils.isEmpty(offlineStatisticsDomain.getOrderAmount())?orderAmount:offlineStatisticsDomain.getOrderAmount()));
			domain.setGoodsNum(ObjectUtils.isEmpty(offlineStatisticsDomain2.getGoodsNum())?goodsNum:offlineStatisticsDomain2.getGoodsNum());
			domain.setOrderNum(ObjectUtils.isEmpty(offlineStatisticsDomain2.getOrderNum())?orderNum:offlineStatisticsDomain2.getOrderNum());
			list.add(domain);
		}
		
		map.put("offline", list);
		return map;
	}
	
	/**
	 * 从指定的地区数据分表中查询数据
	 * @author FZ
	 * @throws ParseException 
	 */
	@Override
	public List<OrderStatisticsInfo> getAreaDataFromTable(Integer startTime,Integer endTime,Long areaid){
		List<OrderStatisticsInfo> orderInfo = new ArrayList<OrderStatisticsInfo>();
		List<String> date = DateUtil.getBetweenYearMonth(startTime.toString().substring(0, 6), endTime.toString().substring(0, 6));
		for(String str : date) {
			String tableName = StatisticsConstant.TableName.AREA_DATA_TABLE_NAME + areaid.toString().substring(0, 3) + "_" + str;
			List<OrderStatisticsInfo> list = null;
			if(str.equals(date.get(0)) && str.equals(date.get(date.size()-1))) {
				list = orderStatisticsService.selectByBetweenTableName(tableName,startTime,endTime);
			}else if(str.equals(date.get(0)) && !str.equals(date.get(date.size()-1))) {
				list = orderStatisticsService.selectByFirstTableName(tableName,startTime);
			}else if(!str.equals(date.get(0)) && str.equals(date.get(date.size()-1))){
				list = orderStatisticsService.selectByEndTableName(tableName,endTime);
			}else {
				list = orderStatisticsService.selectByTableName(tableName);
			}
			for(OrderStatisticsInfo info : list) {
				orderInfo.add(info);
			}
		}
		return orderInfo;
	}

	@Override
	public List<OrderStatisticsInfo> getBaseDataByCtime(Integer cTime) {
		List<OrderStatisticsInfo> baseDatas = orderStatisticsInfoService.getBaseData(cTime);
		return baseDatas;
	}

	/**
	 * @author fzh
	 * 线下集采订单信息
	 */
	@Override
	public List<OrderStatisticsOfflineBizOrder> getBizOrderStatisticsBaseData(Integer startTime, Integer endTime) {
		List<OrderStatisticsOfflineBizOrder> result = new ArrayList<OrderStatisticsOfflineBizOrder>();
		List<SyBizMainOrder> validBizOrders = orderStatisticsService.getValidBizOrder(startTime, endTime);
		for(SyBizMainOrder syBizOrder : validBizOrders) {
			OrderStatisticsOfflineBizOrder baseData = new OrderStatisticsOfflineBizOrder();
			baseData.setMainOrderId(syBizOrder.getMainOrderId());
			baseData.setFinishedTime(syBizOrder.getFinnshedTime());//完成时间
			BigDecimal orderAmount = syBizOrder.getOrderAmount();
			baseData.setOrderAmount(orderAmount);//订单总金额
			BigDecimal rate = new BigDecimal("0.10");
			rate.setScale(1, RoundingMode.DOWN);
			baseData.setHelpPrice(orderAmount.multiply(rate));
			Integer buyerId = syBizOrder.getBuyerId();
			baseData.setBuyerId(buyerId);
			baseData.setBuyerName(syBizOrder.getBuyerName());
			baseData.setOrderType(syBizOrder.getOrderType());
			baseData.setPayState(syBizOrder.getPayState());
			//circle相关信息
			StatCircleInfoDomain statCircleInfoDomain = this.getCircleInfo(buyerId);
			baseData.setCircleIdDeep1(statCircleInfoDomain.getCircleIdDeep1());
			baseData.setCircleIdDeep2(statCircleInfoDomain.getCircleIdDeep2());
			baseData.setCircleIdDeep3(statCircleInfoDomain.getCircleIdDeep3());
			baseData.setCircleIdDeep4(statCircleInfoDomain.getCircleIdDeep4());
			baseData.setCircleIdDeep5(statCircleInfoDomain.getCircleIdDeep5());
			baseData.setCircleIdDeep6(statCircleInfoDomain.getCircleIdDeep6());
			baseData.setCircleIdDeep7(statCircleInfoDomain.getCircleIdDeep7());
			String channel = unionFacade.getChannelByMemberId(syBizOrder.getBuyerId());
			baseData.setChannel(channel);
			baseData.setCircleName(StringUtils.isEmpty(statCircleInfoDomain.getCircleName()) ? "" : statCircleInfoDomain.getCircleName()) ;
			baseData.setcTime(Integer.valueOf(DateUtil.getIntegerYearMonthDay(syBizOrder.getReceiveTime())));
			result.add(baseData);
		}
		return result;
	}
	
	/**
	 * @author fzh
	 * 线下集采订单详情信息
	 */
	@Override
	public List<OrderStatisticsOfflineBizOrderGoods> getBizOrderGoodsStatisticsBaseData(List<Integer> mainOrderIds) {
		List<OrderStatisticsOfflineBizOrderGoods> result = new ArrayList<OrderStatisticsOfflineBizOrderGoods>();
		for (Integer mainOrderId : mainOrderIds) {
			List<SyBizOrderGoods> bizOrderGoodsList = orderStatisticsService.getValidBizOrderGoods(mainOrderId);
			OrderStatisticsOfflineBizOrderGoods baseOrderGoods = new OrderStatisticsOfflineBizOrderGoods();
			for (SyBizOrderGoods syBizOrderGoods : bizOrderGoodsList) {
				Integer assistId = syBizOrderGoods.getAssistId();
				baseOrderGoods.setAssistId(assistId);
				baseOrderGoods.setGoodsNum(syBizOrderGoods.getGoodsNum());
				baseOrderGoods.setGoodsId(syBizOrderGoods.getGoodsId());
				baseOrderGoods.setGoodsPrice(syBizOrderGoods.getGoodsPrice());
				baseOrderGoods.setMainOrderId(syBizOrderGoods.getMainOrderId());
				baseOrderGoods.setPubisherId(syBizOrderGoods.getPublisherId());
				StatCircleInfoDomain statCircleInfoDomain = this.getCircleInfo(assistId);
				baseOrderGoods.setsCircleIdDeep1(statCircleInfoDomain.getCircleIdDeep1());
				baseOrderGoods.setsCircleIdDeep2(statCircleInfoDomain.getCircleIdDeep2());
				baseOrderGoods.setsCircleIdDeep3(statCircleInfoDomain.getCircleIdDeep3());
				baseOrderGoods.setsCircleIdDeep4(statCircleInfoDomain.getCircleIdDeep4());
				baseOrderGoods.setsCircleIdDeep5(statCircleInfoDomain.getCircleIdDeep5());
				baseOrderGoods.setsCircleIdDeep6(statCircleInfoDomain.getCircleIdDeep6());
				baseOrderGoods.setsCircleIdDeep7(statCircleInfoDomain.getCircleIdDeep7());
				String circleName = statCircleInfoDomain.getCircleName();
				if(ObjectUtils.isEmpty(circleName)) {
					circleName = "";
				}
				baseOrderGoods.setsCircleName(circleName);
				SyRole syRole = roleService.getSyRoleByMemberIdAndType(assistId, RoleType.ROLE_TYPE_COOP,RoleType.ROLE_TYPE_WS,RoleType.ROLE_TYPE_GOV,RoleType.ROLE_TYPE_INDUSTRY).get(0);
				Long areaId1 = Long.valueOf(syRole.getAreaid1().toString());
				Long areaId2 = Long.valueOf(syRole.getAreaid2().toString());
				Long areaId3 = Long.valueOf(syRole.getAreaid3().toString());
				if(!areaId1.equals(0L)) {
					SyAreaFull provinceInfo = (SyAreaFull)StatisticsUtils.getStatisticsUtils().getAreaInfo().get(areaId1.toString());
					baseOrderGoods.setProvinceId(areaId1);
					baseOrderGoods.setPrivinceName(ObjectUtils.isEmpty(provinceInfo) ? "" : provinceInfo.getAreaName());
				}
				if(!areaId2.equals(0L)) {
					SyAreaFull provinceInfo = (SyAreaFull)StatisticsUtils.getStatisticsUtils().getAreaInfo().get(areaId2.toString());
					baseOrderGoods.setProvinceId(areaId2);
					baseOrderGoods.setPrivinceName(ObjectUtils.isEmpty(provinceInfo) ? "" : provinceInfo.getAreaName());
				}
				if(!areaId3.equals(0L)) {
					SyAreaFull provinceInfo = (SyAreaFull)StatisticsUtils.getStatisticsUtils().getAreaInfo().get(areaId3.toString());
					baseOrderGoods.setProvinceId(areaId3);
					baseOrderGoods.setPrivinceName(ObjectUtils.isEmpty(provinceInfo) ? "" : provinceInfo.getAreaName());
				}
				result.add(baseOrderGoods);
				
			}
		}
		return result;
	}
	
	/**
	 * @author fzh
	 * 线下集采订单数据额批量插入
	 */
	public void statisticsBizBaseData(Integer startTime, Integer endTime) {
		if(ObjectUtils.isEmpty(StatisticsUtils.getStatisticsUtils().getAreaInfo())){
			StatisticsUtils.getStatisticsUtils().setAreaInfo(orderStatisticsFacade.getAreaInfos());
		}
		List<OrderStatisticsOfflineBizOrder> bizOrderStatisticsBaseData = this.getBizOrderStatisticsBaseData(startTime, endTime);
		List<Integer> orderIds = new ArrayList<Integer>();
		for (OrderStatisticsOfflineBizOrder orderStatisticsOfflineBizOrder : bizOrderStatisticsBaseData) {
			orderIds.add(orderStatisticsOfflineBizOrder.getMainOrderId());
		}
		orderStatisticsInfoService.bizOrderInsert(bizOrderStatisticsBaseData);
		List<OrderStatisticsOfflineBizOrderGoods> bizOrderGoodsStatisticsBaseData = this.getBizOrderGoodsStatisticsBaseData(orderIds);
		orderStatisticsInfoService.bizOrderGoodsInsert(bizOrderGoodsStatisticsBaseData);
	}
	
	/**
	 * @author fzh
	 * 批量插入方法的封装
	 */
	@SuppressWarnings("unused")
	private void batchInsertPack(Map<String,List<OrderStatisticsInfo>> batchMap,String tableName,OrderStatisticsInfo areaTableData,List<String> tableNamesList) {
		if(batchMap.containsKey(tableName)) {
			List<OrderStatisticsInfo> list = batchMap.get(tableName);
			list.add(areaTableData);
		}else {
			List<OrderStatisticsInfo> list = new ArrayList<OrderStatisticsInfo>();
			list.add(areaTableData);
			batchMap.put(tableName, list);
			StatisticsTable statisticsTable = new StatisticsTable(tableName);
			orderStatisticsService.isCreateTable(statisticsTable);
		}
		if(!tableNamesList.contains(tableName)) {
			tableNamesList.add(tableName);
		}
	}
	
	/**
	 * 供给侧统计
	 * @author FZ
	 */
	@Override
	public JSONObject getProvideStatistics(Integer time, Long countryId,Integer pageNum, Integer unionId) {
		List<SyAreaChannel> areas = new ArrayList<SyAreaChannel>();
		if(!ObjectUtils.isEmpty(unionId)) {
			areas = areaChannelService.listAreaByUnionId(unionId, UnionConstant.UnionSupportType.GAVE);
		}
		List<Long> countryIds = new ArrayList<Long>();
		for (SyAreaChannel syAreaChannel : areas) {
			countryIds.add(syAreaChannel.getAreaId());
		}
		List<ProvideStatisticsDomain> domainList = new ArrayList<ProvideStatisticsDomain>();
		Page<ProvideStatisticsBaseData> datas = provideStatisticsService.getList(time, countryId, countryIds,pageNum);
		JSONObject jsonObject = new JSONObject();
		BigDecimal range = new BigDecimal("100.00");
		if(!ObjectUtils.isEmpty(datas)) {
			for(ProvideStatisticsBaseData data : datas.getResult()) {
				ProvideStatisticsDomain domain = new ProvideStatisticsDomain(
						data.getcTime(),
						data.getCountryId(),
						data.getCountryName(),data.getAssistSellDa().divide(range, 2, RoundingMode.DOWN), 
						data.getAssistSellZx().divide(range, 2, RoundingMode.DOWN), 
						data.getAssistBuyDa().divide(range, 2, RoundingMode.DOWN), 
						data.getAssistBuyZx().divide(range, 2, RoundingMode.DOWN),
						data.getAssistTotalNum(), 
						data.getSelfEmpPoorTotalFamily(), 
						data.getPoorTotalFamily(),
						data.getPoorTotalNum(),  
						data.getAssistGoodsTotalNum(), 
						data.getPoorGoodsTotalNum());
				domainList.add(domain);
			}
		}
		jsonObject.put("data", domainList);
		jsonObject.put("totalPage", datas.getPages());
		jsonObject.put("pageNum", pageNum);
		return jsonObject;
	}

	/**
	 * 帮扶侧统计数据
	 * @author FZ
	 */
	@Override
	public JSONObject getAssistStatistics(Integer time, Integer unionId,Integer pageNum) throws CoreServiceException {
		JSONObject jsonObject = new JSONObject();
		if(time.toString().length() != 8) {
			logger.info("日期格式不符，time:{}", time);
		}
		List<AssistStatisticsDomain> baseDatasList = new ArrayList<>();
		//获取帮扶侧数据
		Page<AssistStatisticsBaseData> data = assistStatisticsService.getAssistData(time, unionId,pageNum);
		BigDecimal range = new BigDecimal("100.00");
		if(!ObjectUtils.isEmpty(data)) {
			for(AssistStatisticsBaseData assistData : data.getResult()) {
				AssistStatisticsDomain domain = new AssistStatisticsDomain(
						time, 
						assistData.getUnionId(),
						assistData.getUnionName(), 
						assistData.getEmployeeDealAmount().divide(range, 2, RoundingMode.DOWN),
						assistData.getYkDealAmount().divide(range, 2, RoundingMode.DOWN), 
						assistData.getUserAddedNum(), 
						assistData.getUserTotalNum(), 
						assistData.getInviteYkNum(),
						assistData.getRegEmployeeNum());
				baseDatasList.add(domain);
			}
		}
		jsonObject.put("totalPage", data.getPages());
		jsonObject.put("pageNum", pageNum);
		jsonObject.put("assistStatistics", baseDatasList);
		return jsonObject;
	}
	
	/**
	 * 根据联盟、手机号、姓名查询用户积分明细
	 * @author FZ
	 */
	@Override
	public Map<String, Object> getPointDetailsTag(Integer unionId,String memberMobile,String memberName) {
		JSONObject jsonObject = new JSONObject();
		List<MemberPointDomain> listDomain = new ArrayList<MemberPointDomain>();
		//根据联盟、手机号、姓名查询用户积分明细统计表
		List<PointDetailsTag> pointDetails = orderStatisticsService.getPointDetailsTag(unionId,memberMobile,memberName);
		if(!ObjectUtils.isEmpty(pointDetails)) {
			for(PointDetailsTag point : pointDetails) {
				MemberPointDomain domain = new MemberPointDomain(point.getUnionId(),point.getMemberId(),point.getUnionName(), point.getMemberMobile(), point.getMemberTruename(), point.getTotalPoint(), point.getValidPoint());
				listDomain.add(domain);
			}
		}
		jsonObject.put("memberPoint", listDomain);
		return jsonObject;
	}
	
	/**
	 * 根据联盟获取累计积分人数和可用积分人数
	 * @author FZ
	 */
	public JSONObject getMemberPointsNum(Integer unionId, Integer pageNum){
		JSONObject jsonObject = new JSONObject();
		Map<String, String> map = new MemberPointsNumDomain().getMemberPointNum();
		Map<String, String> map2 = new MemberPointsNumDomain().getMemberPointNum();
		Page<MemberPointsNum> totalPointsNum = pointsStatisticsService.getTotalPointsNum(unionId, pageNum);
		Page<MemberPointsNum> validPointsNum = pointsStatisticsService.getValidPointsNum(unionId, pageNum);
		map.put("unionId", unionId == null ? "" : unionId.toString());
		map2.put("unionId", unionId == null ? "" : unionId.toString());
		if(!ObjectUtils.isEmpty(unionId)) {
			if(!ObjectUtils.isEmpty(totalPointsNum) && !ObjectUtils.isEmpty(validPointsNum)) {
				map.put("unionName", totalPointsNum.get(0).getUnionName());
				map2.put("unionName", validPointsNum.get(0).getUnionName());
			}else {
				map.put("unionName", "此联盟不存在");
				map2.put("unionName", "此联盟不存在");
			}
		}
		if(!ObjectUtils.isEmpty(totalPointsNum)) {
			for(MemberPointsNum num : totalPointsNum) {
				map.put(num.getTotalPointTag() + "分", num.getTotalPointNum().toString());
			}
		}
		if(!ObjectUtils.isEmpty(validPointsNum)) {
			for(MemberPointsNum num : validPointsNum) {
				map2.put(num.getValidPointTag() + "分", num.getValidPointNum().toString());
			}
		}
		jsonObject.put("totalPointsNum", map.toString());
		jsonObject.put("validPointsNum", map2.toString());
		jsonObject.put("totalPage", totalPointsNum.getPages());
		jsonObject.put("currentPage", totalPointsNum.getPageNum());
		return jsonObject;
	}
	
}
