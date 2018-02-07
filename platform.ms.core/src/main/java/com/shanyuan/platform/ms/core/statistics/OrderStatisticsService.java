package com.shanyuan.platform.ms.core.statistics;

import java.util.List;

import com.github.pagehelper.Page;
import com.alibaba.fastjson.JSONObject;
import com.shanyuan.platform.ms.dao.biz.entity.SyBizMainOrder;
import com.shanyuan.platform.ms.dao.biz.entity.SyBizOrderGoods;
import com.shanyuan.platform.ms.dao.order.entity.SyOrder;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderGoods;
import com.shanyuan.platform.ms.dao.project.entity.SyProjectMoneyOrder;
import com.shanyuan.platform.ms.dao.statistics.entity.OfflineStatisticsDomain;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsBaseData;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsBuyerInfo;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsInfo;
import com.shanyuan.platform.ms.dao.statistics.entity.PlatFormDataStatisticsDomain;
import com.shanyuan.platform.ms.dao.statistics.entity.PlatformStatisticsSellerData;
import com.shanyuan.platform.ms.dao.statistics.entity.PointDetailsTag;
import com.shanyuan.platform.ms.dao.statistics.entity.PovertyAlleviationOverview;
import com.shanyuan.platform.ms.dao.statistics.entity.StatisticsTable;
import com.shanyuan.platform.ms.dao.store.entity.SyAreaFull;
import com.shanyuan.platform.ms.dao.user.entity.SyPointsLog;

/**
 * 订单统计
 * @author yangjian
 * @date 2017/12/25
 *
 */
public interface OrderStatisticsService {
	
	public Page<PovertyAlleviationOverview> getPovertyOverviewService(PovertyAlleviationOverview alleviationOverview,Integer currentPage);
	
	public Page<PlatformStatisticsSellerData> getPlatformSellerPageData(Integer startTime,Integer endTime,Integer currentPage);
	
	public Integer batchInsertPlatformDataService(List<PlatformStatisticsSellerData> records);
	
	public List<PlatFormDataStatisticsDomain> selectPlatFormOrderBaseStatistics(Integer startTime);
	
	public List<OfflineStatisticsDomain> getOffLineOrderGoodsinfos(Integer startTime);
	
	public List<OfflineStatisticsDomain> getOffLineOrderinfos(Integer startTime);
	
	public List<SyProjectMoneyOrder> getWelfareDonationService(Integer buyId,String channel);
	
	
	/**
	 * @author fzh
	 * 扶贫成果总览
	 */
	public List<OrderStatisticsBaseData> getPovertyDataByBase(Integer cTime,Integer unionId,Long countryId, Integer start, Integer limit);
	
//	public List<OrderStatisticsBaseData> selectPlatSellerStatistics(Integer cTime, Integer endTime);
	
	public OrderStatisticsBuyerInfo getPlatformSelfhelpPrice(Integer cTime,Integer goodsProjectType,Integer unionid,Integer assistId,Integer sellerType);
	
	public int batchInsertPovertyOverviewTable(List<PovertyAlleviationOverview> record);
	
	public void createTable(StatisticsTable tableName);
	
	/**
	 * 获取有效订单信息
	 * @author FZ
	 * Integer orderId 订单id
	 */
	public List<SyOrder> getValidOrder(Integer startTime, Integer endTime);
	
	/**
	 * @author yangjian
	 * @date 2017/12/27
	 * @param startTime 开始时间
	 * @param endTime 结束时间
	 * @param start 起始位置
	 * @param end 结束位置
	 * @return
	 */
	public List<SyOrder> getValidOrder(Integer startTime, Integer endTime, Integer start, Integer limit);
	
	/**
	 * 获取有效集采订单
	 * @param start
	 * @param endTime
	 * @param start
	 * @param limit
	 * @return
	 */
	public List<SyBizMainOrder> getValidBizOrder(Integer startTime, Integer endTime);
	
	/**
	 * @author 冯志红
	 * 获取订单详情信息
	 */
	List<SyOrderGoods> getGoodsDetail(Integer orderId);
	/**
	 * 将数据插入到指定的表中
	 * @author FZ
	 */
	public void insertSelectiveByTableName(String tableName,OrderStatisticsBaseData baseData);
	
	/**
	 * 将数据插入指定表中
	 * @param info
	 */
	public boolean insertByTableName(OrderStatisticsInfo info);
	
	/**
	 * 查询base表
	 * @author FZ
	 */
	public List<OrderStatisticsInfo> selectByExampleFromBase(Integer cTime);
	
	/**
	 * 将数据插入到base表中
	 * @author FZ
	 */
	public void insertSelective(OrderStatisticsBaseData baseData);

	/**
	 * @author fzh
	 * 订单基本表插入数据
	 */
	public int insertBaseDataService(OrderStatisticsBaseData record);
	
	public List<SyAreaFull> initAreaIds();
	
	/**
	 * 查询指定表的数据
	 * @param tableName 查询的数据表的表名
	 */
	public List<OrderStatisticsInfo> selectByTableName(String tableName);
	
	public List<OrderStatisticsInfo> selectByFirstTableName(String tableName,Integer startTime);
	
	public List<OrderStatisticsInfo> selectByEndTableName(String tableName,Integer endTime);
	
	public List<OrderStatisticsInfo> selectByBetweenTableName(String tableName,Integer startTime,Integer endTime);
	
	/**
	 * 联盟统计信息
	 * @author FZ
	 * @param cTime
	 * @param goodsProjectType
	 * @param unionid
	 * @param assistId
	 * @param sellerType
	 * @return
	 */
	public List<OrderStatisticsBuyerInfo> selectStatisticsInfo(Integer startTime,Integer andTime,Integer goodsProjectType,Integer unionid,Integer assistId,Integer sellerType,Long areaid);
	
	public OrderStatisticsBuyerInfo getSelfhelpPrice(Integer cTime,Integer goodsProjectType,Integer unionid,Integer assistId,Integer sellerType,String areaName);

	/**
	 * @author fzh
	 * 获取线下集采订单详情信息
	 */
	
	public List<SyBizOrderGoods> getValidBizOrderGoods(Integer mainOrderId);
	
	/**
	 * 获取供给侧统计数据
	 * @author FZ
	 */
	public JSONObject getProvideData(Integer time,Long areaid,Integer pageNum);
	
	public void isCreateTable(StatisticsTable statisticsTable);
	
	public Boolean tableExists(String tableName);
	
	public List<OrderStatisticsBuyerInfo> unionSelfHelpStatistics(Integer startTime,Integer endTime,Integer unionid,Long areaid);
	
	/**
	 * 获取用户积分明细
	 * @author FZ
	 */
	public List<PointDetailsTag> getPointDetailsTag(Integer unionId,String memberMobile,String memberName);
	
	public List<OrderStatisticsBuyerInfo> selectFromBuyerInfo(Integer cTime, Integer goodsProjectType);
	
	/**
	 * 获取积分描述
	 * @author FZ
	 */
	public List<SyPointsLog> getPointDescribe(Integer memberId);
	
}

