package com.shanyuan.platform.ms.core.union;

import java.util.List;
import java.util.Map;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.union.bo.UnionBo;
import com.shanyuan.platform.ms.core.union.bo.UnionStatisticBo;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleMember;
import com.shanyuan.platform.ms.dao.union.entity.SyBocMemberStats;
import com.shanyuan.platform.ms.dao.union.entity.SyUnion;
import com.shanyuan.platform.ms.dao.union.entity.SyUnionItem;
import com.shanyuan.platform.ms.dao.user.entity.SyCircle;

/**
 *联盟相关接口 
 * @author zhangwd
 */
public interface UnionService {

	/**
	 * 查询 首页选择联盟政企  
	 * @param unionType 联盟类型
	 * @param unionSort 联盟排序
	 * @param count  查询条数
	 * @return
	 * @author zhangwd
	 */
	List<UnionBo> selectUnion( Byte unionType,Integer unionSort, Integer count);

	/**
	 * 首页联盟排行榜信息
	 * @param channel 通道
	 * @return
	 * @author zhangwd
	 */
	Map<String, Object> getUnionTopList(String channel) throws Exception ;

	/**
	 * 通过联盟通道获取联盟id
	 * @param channel  sy_union 中的字段 union_channel 
	 * @return
	 * @author zhangwd
	 */
	Integer getChannelIdByChannel(String channel);
	
	/**
	 * 获取平台公益人士总数(除去贫困户)
	 * @return
	 * @author zhangwd
	 */
	Integer getMemberCountWithoutPoor() throws Exception;
	
	/**
	 * 平台交易总金额   捐款 + 义卖/100
	 *  @author zhangwd
	 */
	Integer getPlatformDonationAmount() throws Exception;
	
	/**
	 * 公益消费在活跃 --交易总金额
	 * @author zhangwd
	 */
	Integer getOrderAmount() throws Exception;
	
	/**
	 * 校验channel   by sunyue
	 * @param channel
	 * @return
	 * @throws CoreServiceException
	 */
	public String ValidChannel(String channel) throws CoreServiceException;
	
	/**
	 * 
	 * @param memberId
	 * @return
	 */
	SyCircleMember getSyCircleMemberByMemberId(Integer memberId);
	
	/**
	 * 获取联盟列表
	 * @return
	 * @author zhangwd
	 */
	List<SyUnion> getUnionList();

	/**
	 * 获取联盟统计信息
	 * @param union 联盟实例
	 * @return
	 * @author zhangwd
	 */
	UnionStatisticBo getUnionCountInfo(SyUnion union);

	/**
	 * 查询联盟对应部门
	 * @param unionChannel 联盟编号（通道）
	 * @return
	 * @author zhangwd
	 */
	SyCircle getCircleInfoByUnion(String unionChannel);

	/**
	 * 获取统计用户数据 通过circleId   并按(add_time)添加时间 降序排序    
	 * 结果取第一条数据
	 * @param circleId  圈子id
	 * @param startAddTime 开始添加的时间
	 * @param endAddTime  结束添加时间
	 * @return
	 * @author zhangwd
	 */
	SyBocMemberStats getBocMemberStatsByCircle(Integer circleId, Integer startAddTime, Integer  endAddTime );

	/**
	 * 通过联盟code(union_channel) 获取联盟
	 * @param code
	 * @return
	 * @author zhangwd
	 */
	SyUnion getUnionByUnionChannel(String code);

	/**
	 * 获取联盟帮扶侧及供给侧信息
	 * @param unionChannel 通道
	 * @param unionId	联盟id
	 * @return
	 * @author zhangwd
	 */
	Map<String, List<Long>> getUnionArea(Integer unionId, String unionChannel);

	/**
	 * 获取联盟中贫困户人数
	 * @param unionChannel 通道
	 * @return
	 * @author zhangwd
	 */
	Integer getPoorNumByUnion(String unionChannel);

	/**
	 * 查询昨天销售最多的4个产品(大爱超市)
	 * @param yestStartTime 昨天开始时间
	 * @param yestEndTime 昨天结束时间
	 * @param areaId3  
	 * @return
	 */
	List<SyGoodsCommon> getGoodsTopList(Integer yestStartTime, Integer yestEndTime, List<Long> areaId3);
	
	/**
	 * 获取所有有效联盟
	 * @return
	 * @throws CoreServiceException
	 */
	List<SyUnion> getAllValidUnionList() throws CoreServiceException;
	
	/**
	 * 获取所有有效联盟，包括不显示
	 * @return
	 * @throws CoreServiceException
	 */
	List<SyUnion> getAllUnion() throws CoreServiceException;
	
	/**
	 * 获取多条圈子统计信息
	 * @param circleIds
	 * @return
	 * @throws CoreServiceException
	 */
	List<SyBocMemberStats> getStatInfo(List<Integer> circleIds) throws CoreServiceException;
	
	/**
	 * 获取单条圈子统计信息
	 * @author sunyue
	 * @param circleId
	 * @return
	 * @throws CoreServiceException
	 */
	SyBocMemberStats getStatInfo(Integer circleId) throws CoreServiceException;
	
	/**
	 * 根据channel获得子联盟id
	 * @param unionCode
	 * @return
	 * @throws CoreServiceException
	 */
	SyUnionItem getUnionItemGoods(String unionCode) throws CoreServiceException ;
	
	SyUnionItem getUnionItemById(Integer unionItemId)  throws CoreServiceException ;
	
	SyUnion getUnionById(Integer unionId)  throws CoreServiceException;
	
}
