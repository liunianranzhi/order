package com.shanyuan.platform.ms.core.statistics.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.shanyuan.platform.ms.core.constant.BizOrderConstant;
import com.shanyuan.platform.ms.core.constant.OrderConstant;
import com.alibaba.fastjson.JSONObject;
import com.shanyuan.platform.ms.core.constant.StatisticsConstant;
import com.shanyuan.platform.ms.core.statistics.OrderStatisticsInfoService;
import com.shanyuan.platform.ms.core.statistics.OrderStatisticsService;
import com.shanyuan.platform.ms.dao.biz.entity.SyBizMainOrder;
import com.shanyuan.platform.ms.dao.biz.entity.SyBizMainOrderExample;
import com.shanyuan.platform.ms.dao.biz.entity.SyBizOrderGoods;
import com.shanyuan.platform.ms.dao.biz.entity.SyBizOrderGoodsExample;
import com.shanyuan.platform.ms.dao.biz.mapper.SyBizMainOrderMapper;
import com.shanyuan.platform.ms.dao.biz.mapper.SyBizOrderGoodsMapper;
import com.shanyuan.platform.ms.dao.order.entity.SyOrder;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderExample;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderGoods;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderGoodsExample;
import com.shanyuan.platform.ms.dao.order.mapper.SyOrderGoodsMapper;
import com.shanyuan.platform.ms.dao.order.mapper.SyOrderMapper;
import com.shanyuan.platform.ms.dao.project.entity.SyProjectMoneyOrder;
import com.shanyuan.platform.ms.dao.project.entity.SyProjectMoneyOrderExample;
import com.shanyuan.platform.ms.dao.project.mapper.SyProjectMoneyOrderMapper;
import com.shanyuan.platform.ms.dao.statistics.entity.OfflineStatisticsDomain;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsBaseData;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsBaseDataExample;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsBuyerInfo;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsInfo;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsInfoExample;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsSale;
import com.shanyuan.platform.ms.dao.statistics.entity.PlatFormDataStatisticsDomain;
import com.shanyuan.platform.ms.dao.statistics.entity.PlatformStatisticsSellerData;
import com.shanyuan.platform.ms.dao.statistics.entity.PlatformStatisticsSellerDataExample;
import com.shanyuan.platform.ms.dao.statistics.entity.PointDetailsTag;
import com.shanyuan.platform.ms.dao.statistics.entity.PointDetailsTagExample;
import com.shanyuan.platform.ms.dao.statistics.entity.PovertyAlleviationOverview;
import com.shanyuan.platform.ms.dao.statistics.entity.PovertyAlleviationOverviewExample;
import com.shanyuan.platform.ms.dao.statistics.entity.ProvideStatisticsBaseData;
import com.shanyuan.platform.ms.dao.statistics.entity.ProvideStatisticsBaseDataExample;
import com.shanyuan.platform.ms.dao.statistics.entity.StatisticsTable;
import com.shanyuan.platform.ms.dao.statistics.mapper.OrderStatisticsBaseDataMapper;
import com.shanyuan.platform.ms.dao.statistics.mapper.OrderStatisticsBuyerInfoMapper;
import com.shanyuan.platform.ms.dao.statistics.mapper.OrderStatisticsInfoMapper;
import com.shanyuan.platform.ms.dao.statistics.mapper.OrderStatisticsOfflineBizOrderGoodsMapper;
import com.shanyuan.platform.ms.dao.statistics.mapper.OrderStatisticsOfflineBizOrderMapper;
import com.shanyuan.platform.ms.dao.statistics.mapper.PlatformStatisticsSellerDataMapper;
import com.shanyuan.platform.ms.dao.statistics.mapper.PointDetailsTagMapper;
import com.shanyuan.platform.ms.dao.statistics.mapper.PovertyAlleviationOverviewMapper;
import com.shanyuan.platform.ms.dao.statistics.mapper.ProvideStatisticsBaseDataMapper;
import com.shanyuan.platform.ms.dao.store.entity.SyAreaFull;
import com.shanyuan.platform.ms.dao.store.entity.SyAreaFullExample;
import com.shanyuan.platform.ms.dao.store.mapper.SyAreaFullMapper;
import com.shanyuan.platform.ms.dao.user.entity.SyPointsLog;
import com.shanyuan.platform.ms.dao.user.entity.SyPointsLogExample;
import com.shanyuan.platform.ms.dao.user.mapper.SyPointsLogMapper;

/**
 * 订单统计
 * @author yangjian
 * @param <PlatFormTotalDomain>
 * @date 2017/12/25
 *
 */
@Component
public class OrderStatisticsServiceImpl<PlatFormTotalDomain> implements OrderStatisticsService {
	
	@Autowired
	private OrderStatisticsBaseDataMapper orderStatisticsBaseDataMapper;
	
	@Autowired
	private SyOrderMapper syOrderMapper;
	
	@Autowired
	private SyOrderGoodsMapper syOrderGoodsMapper;
	
	@Autowired
	private OrderStatisticsInfoMapper orderStatisticsInfoMapper;
	
	@Autowired
	OrderStatisticsBuyerInfoMapper orderStatisticsBuyerInfoMapper;
	
	@Autowired
	OrderStatisticsInfoService orderStatisticsInfoService;
	
	@Autowired
	private SyBizMainOrderMapper syBizMainOrderMapper;
	
	@Autowired
	private SyBizOrderGoodsMapper syBizOrderGoodsMapper;
	
	@Autowired
	private SyAreaFullMapper syAreaFullMapper;
	
	@Autowired
	private PovertyAlleviationOverviewMapper povertyAlleviationOverviewMapper; 
	
	@Autowired
	private ProvideStatisticsBaseDataMapper provideStatisticsBaseDataMapper;
	
	@Autowired
	private PointDetailsTagMapper pointDetailsTagMapper;
	
	@Autowired
	private SyPointsLogMapper syPointsLogMapper;
	
	@Autowired
	private SyProjectMoneyOrderMapper projectMoneyOrderMapper;
	
	@Autowired
	private OrderStatisticsOfflineBizOrderMapper offlineBizOrderMapper;
	
	@Autowired
	private OrderStatisticsOfflineBizOrderGoodsMapper offlineBizOrderGoodsMapper;
	
	@Autowired
	private PlatformStatisticsSellerDataMapper platformStatisticsSellerDataMapper;
	
	/**
	 * @author fzh
	 * 获取公益捐赠
	 */
	public List<SyProjectMoneyOrder> getWelfareDonationService(Integer time,String channel) {
		SyProjectMoneyOrderExample syProjectMoneyOrderExample = new SyProjectMoneyOrderExample();
		syProjectMoneyOrderExample.createCriteria().andFinnshedTimeLessThanOrEqualTo(time).andChannelEqualTo(channel).andOrderStateEqualTo(OrderConstant.OrderState.ORDER_STATE_SUCCESS);
		List<SyProjectMoneyOrder> projectMoneyOrderList = projectMoneyOrderMapper.selectByExample(syProjectMoneyOrderExample);
		return projectMoneyOrderList;
	}
	
	/**
	 * @author fzh
	 * 展示扶贫成果数据总览
	 */
	public Page<PovertyAlleviationOverview> getPovertyOverviewService(PovertyAlleviationOverview alleviationOverview,Integer currentPage){
		Page<PovertyAlleviationOverview> startPage;
		if(ObjectUtils.isEmpty(currentPage)){
			startPage = PageHelper.startPage(StatisticsConstant.currentPage.FIRST_PAGE, povertyAlleviationOverviewMapper.countByExample(new PovertyAlleviationOverviewExample()));
			povertyAlleviationOverviewMapper.selectDateByCondition(alleviationOverview);
		}else{
			startPage = PageHelper.startPage(currentPage, StatisticsConstant.currentPage.CURRENT_PAGE);
			povertyAlleviationOverviewMapper.selectDateByCondition(alleviationOverview);
		}
		
		return startPage;
	}
	
	/**
	 * @author fzh
	 * 扶贫数据的批量插入
	 */
	public int batchInsertPovertyOverviewTable(List<PovertyAlleviationOverview> record) {
		int batchPovertyOverviewInsert = povertyAlleviationOverviewMapper.batchPovertyOverviewInsert(record);
		return batchPovertyOverviewInsert;
	}
	
	/**
	 * @author fzh
	 * 从base表中获取扶贫成果总览
	 */
	@Override
	public List<OrderStatisticsBaseData> getPovertyDataByBase(Integer cTime, Integer unionId, Long countryId, Integer start, Integer limit) {
		OrderStatisticsBaseDataExample example = new OrderStatisticsBaseDataExample();
		example.createCriteria().andCTimeLessThanOrEqualTo(cTime).andUnionIdEqualTo(unionId).andCountryIdEqualTo(countryId);
		example.setOrderByClause("id LIMIT " + start + "," + limit);
		List<OrderStatisticsBaseData> selectByExample = orderStatisticsBaseDataMapper.selectByExample(example);
		return selectByExample;
	}
	
	@Override
	public void createTable(StatisticsTable tableName) {
		orderStatisticsBaseDataMapper.createNewTable(tableName);
	}
	
	/**
	 * 获取有效订单信息
	 * @author FZ
	 * Integer orderId 订单id
	 */
	@Override
	public List<SyOrder> getValidOrder(Integer startTime, Integer endTime) {
		SyOrderExample example = new SyOrderExample();
		example.createCriteria().andFinnshedTimeGreaterThanOrEqualTo(startTime).andFinnshedTimeLessThan(endTime).andOrderStateEqualTo(OrderConstant.OrderState.ORDER_STATE_SUCCESS);
		List<SyOrder> syOrder = syOrderMapper.selectByExample(example);
		return syOrder;
	}
	

	
	/**
	 * @author 冯志红
	 * 获取订单详情信息
	 */
	@Override
	public List<SyOrderGoods> getGoodsDetail(Integer orderId) {
		SyOrderGoodsExample example = new SyOrderGoodsExample();
		example.createCriteria().andOrderIdEqualTo(orderId);
		List<SyOrderGoods> orderGoodsList = syOrderGoodsMapper.selectByExample(example);
		return orderGoodsList;
	}
	/**
	 * 将数据插入到指定的表中
	 * @author fzh
	 */
	@Override
	public void insertSelectiveByTableName(String tableName,OrderStatisticsBaseData baseData) {
		orderStatisticsBaseDataMapper.insertSelectiveByTableName(tableName, baseData);
	}
	
	/**
	 * 将数据插入到base表中
	 * @author FZ
	 */
	@Override
	public void insertSelective(OrderStatisticsBaseData baseData) {
		OrderStatisticsBaseData data = baseData;
		orderStatisticsBaseDataMapper.insertSelective(data);
	}
	
	/**
	 * 查询base表
	 * @author FZ
	 */
	@Override
	public List<OrderStatisticsInfo> selectByExampleFromBase(Integer cTime) {
		List<OrderStatisticsInfo> baseData = orderStatisticsInfoService.getBaseData(cTime);
		if(ObjectUtils.isEmpty(baseData)) {
			return null;
		}else {
			return baseData;
		}
	}


	@Override
	public int insertBaseDataService(OrderStatisticsBaseData record) {
		int result = orderStatisticsBaseDataMapper.insert(record);
		return result;
	}
	
	
	public boolean insertByTableName(OrderStatisticsInfo info) {
		StatisticsTable statisticsTable = new StatisticsTable(info.getTableName());
		if(orderStatisticsInfoMapper.existTable(statisticsTable) == 0){
			orderStatisticsBaseDataMapper.createNewTable(statisticsTable);
		}
		return orderStatisticsInfoMapper.insert(info) == 1 ? true : false;
	}

	/**
	 * @author fzh
	 * 获取订单详情信息
	 */
	@Override
	public List<SyOrder> getValidOrder(Integer startTime, Integer endTime, Integer start, Integer limit) {
		SyOrderExample example = new SyOrderExample();
		example.createCriteria().andFinnshedTimeGreaterThanOrEqualTo(startTime).andFinnshedTimeLessThan(endTime).andOrderStateEqualTo(OrderConstant.OrderState.ORDER_STATE_SUCCESS);
		example.setOrderByClause("order_id LIMIT " + start + "," + limit);
		List<SyOrder> syOrder = syOrderMapper.selectByExample(example);
		return syOrder;
	}
	
	/**
	 * @author fzh
	 * 初始化地区信息
	 */
	public List<SyAreaFull> initAreaIds() {
		
		SyAreaFullExample example = new SyAreaFullExample();
		example.createCriteria().andAreaDeepLessThan((byte)4);
		List<SyAreaFull> areaInfos = syAreaFullMapper.selectByExample(example);
		return areaInfos;
	}
	
	/**
	 * 根据指定表名查询数据
	 * @author FZ
	 */
	@Override
	public List<OrderStatisticsInfo> selectByTableName(String tableName){
		OrderStatisticsInfoExample infoExample = new OrderStatisticsInfoExample();
		infoExample.setTableName(tableName);
		List<OrderStatisticsInfo> list = orderStatisticsInfoMapper.selectByExample(infoExample);
		return list;
	}
	
	/**
	 * 根据指定表名查询指定时间以后的数据
	 * @author FZ
	 */
	@Override
	public List<OrderStatisticsInfo> selectByFirstTableName(String tableName,Integer startTime){
		OrderStatisticsInfoExample infoExample = new OrderStatisticsInfoExample();
		infoExample.setTableName(tableName);
		infoExample.createCriteria().andCTimeGreaterThanOrEqualTo(startTime);
		List<OrderStatisticsInfo> list = orderStatisticsInfoMapper.selectByExample(infoExample);
		return list;
	}
	
	/**
	 * 根据指定表名查询指定时间以前的数据
	 * @author FZ
	 */
	@Override
	public List<OrderStatisticsInfo> selectByEndTableName(String tableName,Integer endTime){
		OrderStatisticsInfoExample infoExample = new OrderStatisticsInfoExample();
		infoExample.setTableName(tableName);
		infoExample.createCriteria().andCTimeLessThanOrEqualTo(endTime);
		List<OrderStatisticsInfo> list = orderStatisticsInfoMapper.selectByExample(infoExample);
		return list;
	}
	
	/**
	 * 根据指定表名查询指定时间之间的数据
	 * @author FZ
	 */
	@Override
	public List<OrderStatisticsInfo> selectByBetweenTableName(String tableName,Integer startTime,Integer endTime){
		OrderStatisticsInfoExample infoExample = new OrderStatisticsInfoExample();
		infoExample.setTableName(tableName);
		infoExample.createCriteria().andCTimeBetween(startTime, endTime);
		List<OrderStatisticsInfo> list = orderStatisticsInfoMapper.selectByExample(infoExample);
		return list;
	}

	/**
	 * @author fzh
	 * 线下集采订单信息
	 */
	@Override
	public List<SyBizMainOrder> getValidBizOrder(Integer startTime, Integer endTime) {
		SyBizMainOrderExample bizMainOrderExample = new SyBizMainOrderExample();
		bizMainOrderExample.createCriteria().
		andReceiveTimeGreaterThanOrEqualTo(startTime)
		.andReceiveTimeLessThan(endTime)
		.andPayStateEqualTo(BizOrderConstant.PayStatus.SELLER_SURE).andGoodsStateEqualTo(BizOrderConstant.GoodsState.TAKE_DELIVERY)
		.andOrderTypeBetween(BizOrderConstant.OrderType.BIZ_HAVE_GOODS, BizOrderConstant.OrderType.BIZ_INTENTION_GOODS);
		List<SyBizMainOrder> orders = syBizMainOrderMapper.selectByExample(bizMainOrderExample);
		return orders;
	}
	
	/**
	 * 获取帮扶金额
	 */
	@Override
	public OrderStatisticsBuyerInfo getSelfhelpPrice(Integer cTime,Integer goodsProjectType,Integer unionid,Integer assistId,Integer sellerType,String areaName) {
		OrderStatisticsInfo info = new OrderStatisticsInfo();
		info.setcTime(cTime);
		info.setGoodsProjectType(goodsProjectType);
		info.setsUnionId(unionid);
		info.setAssistId(assistId);
		info.setSellerType(sellerType);
		info.setCountryName(areaName);
		OrderStatisticsBuyerInfo selectByBuyer = orderStatisticsBuyerInfoMapper.getSelfhelpPrice(info);
		return selectByBuyer;
	}

	/**
	 * 平台销售数据的帮扶金额
	 */

	public OrderStatisticsBuyerInfo getPlatformSelfhelpPrice(Integer cTime,Integer goodsProjectType,Integer unionid,Integer assistId,Integer sellerType) {
		OrderStatisticsInfo info = new OrderStatisticsInfo();
		info.setcTime(cTime);
		info.setGoodsProjectType(goodsProjectType);
		info.setCircleIdDeep1(unionid);
		info.setAssistId(assistId);
		info.setSellerType(sellerType);
		OrderStatisticsBuyerInfo platformSelfhelpPrice = orderStatisticsBuyerInfoMapper.getPlatformSelfhelpPrice(info);
		return platformSelfhelpPrice;
	}

	@Override
	public List<OrderStatisticsBuyerInfo> selectFromBuyerInfo(Integer cTime, Integer goodsProjectType) {
		OrderStatisticsSale info = new OrderStatisticsSale();
		info.setStartTime(cTime);
		info.setEndTime(cTime);
		info.setGoodsProjectType(goodsProjectType);
		List<OrderStatisticsBuyerInfo> selectByBuyer = orderStatisticsBuyerInfoMapper.selectStatisticsInfo(info);
		return selectByBuyer;
	}

	@Override
	public List<OrderStatisticsBuyerInfo> selectStatisticsInfo(Integer startTime, Integer endTime,Integer goodsProjectType, Integer unionid,
			Integer assistId, Integer sellerType, Long areaid) {
		OrderStatisticsSale info = new OrderStatisticsSale();
		info.setStartTime(startTime);
		info.setEndTime(endTime);
		info.setGoodsProjectType(goodsProjectType);
		info.setCircleIdDeep1(unionid);
		info.setAssistId(assistId);
		info.setSellerType(sellerType);
		info.setCountryId(areaid);
		List<OrderStatisticsBuyerInfo> selectByBuyer = orderStatisticsBuyerInfoMapper.selectStatisticsInfo(info);
		return selectByBuyer;
	}
	/**
	 * @author fzh
	 * 根据时间段获取平台销量分页数据
	 */
	public Page<PlatformStatisticsSellerData> getPlatformSellerPageData(Integer startTime,Integer endTime,Integer currentPage){
		Page<PlatformStatisticsSellerData> startPage = PageHelper.startPage(currentPage, StatisticsConstant.currentPage.CURRENT_PAGE);
		PlatformStatisticsSellerDataExample example = new PlatformStatisticsSellerDataExample();
		example.createCriteria().andCTimeGreaterThanOrEqualTo(startTime).andCTimeLessThanOrEqualTo(endTime);
		platformStatisticsSellerDataMapper.selectByExample(example);
		return startPage;
	}
	
	/**
	 * 获取平台销量的所有统计数据(表头)
	 */
	
	/**
	 * @author fzh
	 * 平台销量的数据批量插入
	 */
	public Integer batchInsertPlatformDataService(List<PlatformStatisticsSellerData> records) {
		int result = platformStatisticsSellerDataMapper.batchInsertPlatformSellerData(records);
		return result;
	}
	/**
	 * @author fzh
	 * 平台销售数据:线下集采订单信息
	 */
	public List<OfflineStatisticsDomain> getOffLineOrderinfos(Integer startTime) {
		List<OfflineStatisticsDomain> offlineOrderStatisticsInofs = offlineBizOrderMapper.getOfflineOrderStatisticsInofs(startTime);
		return offlineOrderStatisticsInofs;
	}
	/**
	 * @author fzh
	 * 平台销售数据:线下集采订单详情信息
	 */
	public List<OfflineStatisticsDomain> getOffLineOrderGoodsinfos(Integer startTime) {
		List<OfflineStatisticsDomain> platFromOfflineOrderGoods = offlineBizOrderGoodsMapper.getPlatFromOfflineOrderGoods(startTime);
		return platFromOfflineOrderGoods;
	}
	/**
	 * @author fzh
	 */
	@Override
	public List<PlatFormDataStatisticsDomain> selectPlatFormOrderBaseStatistics(Integer startTime) {
		List<PlatFormDataStatisticsDomain> list = orderStatisticsBaseDataMapper.selectPlatformStatisticsInfo(startTime);
		return list;
	}
	
	
	/**
	 * @author fzh
	 * 线下集采订单详情信息
	 */
	public List<SyBizOrderGoods> getValidBizOrderGoods(Integer mainOrderId) {
		SyBizOrderGoodsExample example = new SyBizOrderGoodsExample();
		example.createCriteria().andMainOrderIdEqualTo(mainOrderId);
		List<SyBizOrderGoods> bizOrderGoodsList = syBizOrderGoodsMapper.selectByExample(example);
		return bizOrderGoodsList;
	}
	
	/**
	 * @author fzh
	 * 批量插入方法的封装
	 */
	public void isCreateTable(StatisticsTable statisticsTable) {
		if(orderStatisticsInfoMapper.existTable(statisticsTable) == 0){
			orderStatisticsBaseDataMapper.createNewTable(statisticsTable);
		}
	}

	/**
	 * 获取供给侧统计数据
	 * @author FZ
	 */
	@Override
	public JSONObject getProvideData(Integer time, Long areaid,Integer pageNum) {
		JSONObject jsonObject = new JSONObject();
		ProvideStatisticsBaseDataExample example = new ProvideStatisticsBaseDataExample();
		if(!ObjectUtils.isEmpty(areaid)) {
			example.createCriteria().andCTimeEqualTo(time).andCountryIdEqualTo(areaid);
		}else {
			example.createCriteria().andCTimeEqualTo(time);
		}
		PageHelper.startPage(pageNum, StatisticsConstant.currentPage.CURRENT_PAGE);
		List<ProvideStatisticsBaseData> baseDatas = provideStatisticsBaseDataMapper.selectByExample(example);
		Integer count = provideStatisticsBaseDataMapper.countByExample(example);
		jsonObject.put("count", count);
		jsonObject.put("data", baseDatas);
		return jsonObject;
	}



	@Override
	public Boolean tableExists(String tableName) {
		return orderStatisticsInfoMapper.existTable(new StatisticsTable(tableName)) == 1 ? true : false;
	}

	@Override
	public List<OrderStatisticsBuyerInfo> unionSelfHelpStatistics(Integer startTime, Integer endTime,Integer unionid,Long areaid) {
		OrderStatisticsSale info = new OrderStatisticsSale();
		info.setStartTime(startTime);
		info.setEndTime(endTime);
		info.setAreaid(areaid);
		info.setUnionid(unionid);
		List<OrderStatisticsBuyerInfo> selectByBuyer = orderStatisticsBuyerInfoMapper.unionSelfHelpStatistics(info);
		return selectByBuyer;
	}
	
	/**
	 * 获取用户积分明细
	 * @author FZ
	 */
	@Override
	public List<PointDetailsTag> getPointDetailsTag(Integer unionId,String memberMobile,String memberName) {
		PointDetailsTagExample example = new PointDetailsTagExample();
		if(!ObjectUtils.isEmpty(unionId)) {
			example.createCriteria().andUnionIdEqualTo(unionId);
		}
		if(!ObjectUtils.isEmpty(memberMobile)) {
			example.createCriteria().andMemberMobileEqualTo(memberMobile);
		}
		if(!ObjectUtils.isEmpty(memberName)) {
			example.createCriteria().andMemberTruenameEqualTo(memberName);
		}
		List<PointDetailsTag> pointDetails = pointDetailsTagMapper.selectByExample(example);
		return pointDetails;
	}
	
	/**
	 * 获取积分描述
	 * @author FZ
	 */
	@Override
	public List<SyPointsLog> getPointDescribe(Integer memberId) {
		SyPointsLogExample example = new SyPointsLogExample();
		example.createCriteria().andPlMemberidEqualTo(memberId);
		List<SyPointsLog> pointsLog = syPointsLogMapper.selectByExample(example);
		return pointsLog;
	}

}
