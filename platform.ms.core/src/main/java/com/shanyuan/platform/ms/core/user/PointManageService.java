package com.shanyuan.platform.ms.core.user;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.user.bo.PointsLogBo;
import com.shanyuan.platform.ms.dao.user.entity.PointLogParam;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.dao.user.entity.SyPointsLog;

/**
 * @author qy
 *
 */


public interface PointManageService {
	/**
	 * @author 钟颖
	 * @param memberId
	 * @param plStages 操作阶段
	 * @param orderBy  排序
	 * @param pageSize 每页显示数
	 * @param currentPage 当前页数
	 * @param type  detail: 积分详情的时候 其他预留
	 * @return
	 * @throws CoreServiceException
	 */
	public List<PointsLogBo> getPointDetail(Integer memberId,List<String>plStages,String orderBy,Integer pageSize,Integer currentPage,String type) throws CoreServiceException;

	/**
	 * @param needPoints 需要用的积分
	 * @param bocPoints  现在的积分数
	 * @param bocPointsUsed 已经用的积分数
	 * @return
	 */
	public void validatePoint(Integer needPoints,Integer bocPoints,Integer bocPointsUsed);
	
	/**
	 * 校验是否能增加积分
	 * @param memberId
	 * @return
	 * @throws CoreServiceException
	 */
	public boolean inviteValidatePoint(Integer memberId) throws CoreServiceException;
	/**
	 * @param buyerId 会员ID
	 * @param points　冲正积分
	 * @param type　　　冲正积分类型
	 */
	public void correctPoint(Integer buyerId,Integer points,Integer type);
	/**
	 * @author zy 钟颖
	 * @param buyerId       会员ID
	 * @param bocPoints     积分
	 * @param bocPointsEarly 原来的积分
	 */
	public void usePoint(Integer buyerId,Integer bocPoints) ;
	/**
	 * @author zy 钟颖
	 * @param plStage 操作阶段
	 * @param plDesc  操作描述
	 * @return
	 */
	public  String getFromType(String plStage,String plDesc);
	
	//public void addPointLog(Integer buyerId,String memberName,String buyerTrueName,Integer bocPoints,Integer orderId,String BuyerChannel) ;
	
	/**
	 * 
	 * @param syMember 要家积分的会员
	 * @param orderId 产生积分变化的订单
	 * @param adminId 管理员id
	 * @param adminName 管理员姓名
	 * @param bocPoints 产生变化的积分
	 * @param desc 描述
	 * @param stage 操作阶段
	 * @param memberId2 若为邀请人家积分，则为被邀请人；若为被邀请人加积分，则为邀请人
	 * @param channel 加积分用户渠道
	 */
	public boolean addPointLog(SyMember syMember, Integer orderId, Integer adminId, String adminName, 
			Integer bocPoints, String desc, String stage, Integer memberId2, String channel)  
					throws CoreServiceException;
	/**
	 * 是否重复添加积分
	 * @param memberId     会员ID
	 * @param inviteMemberId邀请ID
	 * @param type          类型
	 * @return
	 */
	public boolean isRepeatAddPoints(Integer memberId ,Integer inviteMemberId,String type) ;
	
	/**
	 * 添加积分   by sunyue
	 * @param memberId  要增加积分的会员id
	 * @param sp   积分日志
	 * @return
	 * @throws CoreServiceException
	 */
	public boolean addPoints(Integer memberId, Integer points, SyPointsLog sp, Integer type) throws CoreServiceException;
	
	/**
	 * 给益客邀请人加积分
	 * @param memberId
	 * @param points
	 * @param syPointsLog
	 * @return
	 * @throws CoreServiceException
	 */
	public boolean addYikePoints(Integer memberId, Integer points, SyPointsLog syPointsLog) throws CoreServiceException;
	
	/**
	 * 更新缓存中用户积分
	 * @param syMember
	 * @param points
	 * @param invMid
	 * @param channel
	 * @param stage
	 * @param desc
	 * @return
	 */
	public boolean addCachePoints(SyMember syMember, Integer points, Integer invMid, String channel, String stage, String desc);
	
	/**
	 * 更新会员积分
	 * @param memberId
	 * @param points
	 * @param type 加积分类型 1 ：加会员积分 2： 加会员和中元积分 3:加中元积分
	 * @return
	 */
	public boolean updateDbPoints(Integer memberId, Integer points, Integer type) throws CoreServiceException;
	
	/**
	 * 发送站内通知
	 * @param memberId
	 * @param points 积分变更
	 * @return
	 */
	public boolean sendMessageForPoint(Integer memberId, Integer points);
	/**
	 * 查询用户积分列表
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return PageInfo<SyPointsLog>
	 * @throws
	 */
	public PageInfo<SyPointsLog> selectUserPointList(
			PageInfo<SyPointsLog> pageinfo, Integer memberId) throws CoreServiceException;
	/**
	 * 增加积分日志
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return int
	 * @throws
	 */
	public int savePointLog(SyPointsLog pointLog) throws CoreServiceException;
	/**
	 * 查询积分列表
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return PageInfo<SyPointsLog>
	 * @throws
	 */
	public PageInfo<SyPointsLog> selectPointList(
			PageInfo<SyPointsLog> pageinfo, PointLogParam params) throws CoreServiceException;
	/**
	 * 修改积分日志
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return int
	 * @throws
	 */
	public int updatePoint(SyPointsLog pointLog) throws CoreServiceException;
	/**
	 * 删除积分日志
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return int
	 * @throws
	 */
	public int deletePointLog(Integer pointLogId) throws CoreServiceException;
	
}
