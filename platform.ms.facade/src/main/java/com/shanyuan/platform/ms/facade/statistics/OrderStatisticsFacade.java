package com.shanyuan.platform.ms.facade.statistics;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.shanyuan.platform.ms.dao.statistics.entity.OfflineStatisticsDomain;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsInfo;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsOfflineBizOrder;
import com.shanyuan.platform.ms.dao.statistics.entity.OrderStatisticsOfflineBizOrderGoods;
import com.shanyuan.platform.ms.facade.statistics.impl.domain.StatCircleInfoDomain;

/**
 * 订单统计
 * @author yangjian
 * @date 2017/12/25
 *
 */
public interface OrderStatisticsFacade {
	
	public JSONObject platFormSaleStatistics(Integer startTime,Integer endTime,Integer pageNum);
	
	public void getPlatFormSellerDataPack(Integer startTime);
	
	Map<String,List<OfflineStatisticsDomain>> getPlatformOfflineOrderStatistics(Integer startTime);
	
	public JSONObject getUserDetailInfos(Long pointTag,String name,Integer unionId,String phone,String trueName,Integer currentPage, Integer type);
	
	public JSONObject getPointsInfos(Integer memberId,Integer pageNum, Integer type);
	
	public void getUserPointsStatistics(Integer limit);
	
	public JSONObject showPovertyOverviewDate(Integer time,Integer unionId,Long countryId,Integer currentPage);
	
	public void getPovertyOverviewDate(Integer time);
	
	public void createTable(String tableName);
	
	
	/**
	 * 从base中获取联盟分表数据
	 * @author FZ
	 */
	public List<OrderStatisticsInfo> getUnionBuyTableData(Integer cTime);
	
	/**
	 * 分批获取数据
	 * @param startTime 起始时间
	 * @param endTime 结束时间
	 * @param start 起始位置
	 * @param end 结束位置
	 * @return
	 * 获取base表数据
	 * @param startTime
	 * @param endTime
	 */
	public List<OrderStatisticsInfo> getOrderStatisticsBaseData(Integer startTime, Integer endTime, Integer start, Integer limit);
	
	public List<OrderStatisticsOfflineBizOrder> getBizOrderStatisticsBaseData(Integer startTime, Integer endTime);
	
	/**
	 * 从base中获取地区分表数据
	 */
	public List<OrderStatisticsInfo> getAreaTableData(Integer cTime);
	
	/**
	 * 通过指定表名插入数据
	 * @param orderStatisticsInfo
	 */
	public void insertByTableName(OrderStatisticsInfo orderStatisticsInfo);
	
	public StatCircleInfoDomain getCircleInfo(Integer buyerId);

	public List<OrderStatisticsInfo> getUnionSellerTableData(Integer cTime);
	/**
	 * @author fzh
	 * @param buyId
	 * @return map
	 * 获取circleId以及对应的parentId
	 */
	JSONObject getAllCircleInfos();
	
	public void statisticsBaseData(Integer startTime, Integer endTime, Integer limit);
	
	public JSONObject getAreaInfos();
	
	/**
	 * 从指定的地区数据分表中查询数据
	 * @param startTime
	 * @param endTime
	 * @param area
	 * @return
	 */
	
	public List<OrderStatisticsInfo> getBaseDataByCtime(Integer cTime);
	
	public List<OrderStatisticsInfo> getAreaDataFromTable(Integer startTime,Integer endTime,Long areaid);
	
	public List<OrderStatisticsOfflineBizOrderGoods> getBizOrderGoodsStatisticsBaseData(List<Integer> mainOrderIds);
	
	public void statisticsBizBaseData(Integer startTime, Integer endTime);
	
	/**
	 * 获取供给侧统计数据
	 * @author FZ
	 * @param time
	 * @param areaid
	 * @return
	 */
	public JSONObject getProvideStatistics(Integer time,Long areaid,Integer pageNum, Integer unionId);
	
	/**
	 * 获取帮扶侧统计数据
	 * @author FZ
	 * @param time
	 * @param areaid
	 * @return
	 */
	public JSONObject getAssistStatistics(Integer time,Integer unionId,Integer pageNum);
	
	/**
	 * 用户积分明细统计
	 */
	public Map<String, Object> getPointDetailsTag(Integer unionId,String memberMobile,String memberName);
	
	public JSONObject getMemberPointsNum(Integer unionId, Integer pageNum);
}
