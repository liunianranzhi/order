package com.shanyuan.platform.ms.core.store;

import java.util.List;

import com.shanyuan.platform.ms.dao.store.entity.SyCircleMember;
import com.shanyuan.platform.ms.dao.user.entity.SyCircle;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;

/**
 * 
 * @author yangjian
 * @date 2017/10/19
 *
 */
public interface CircleMemberService {

	/**
	 * 获取组织圈子
	 * @param memberId
	 * @return
	 */
	SyCircleMember getCircleInfoOnlyBocOrg(Integer memberId);
	
	/**
	 * 申请加入圈子
	 * @param syMember
	 * @param circleId
	 * @return
	 */
	boolean mapplyJoinCircle(SyMember syMember, Integer circleId);
	
	/**
	 * 根据用户id获取用户圈子信息
	 * @param memberId
	 * @return
	 */
	SyCircleMember getCircleMemberInfoByMemberId(Integer memberId);
	
	/**
	 * 加入圈子
	 * @param member
	 * @param circleId
	 * @return
	 */
	boolean joinCircle(SyMember member, Integer circleId);
	
	/**
	 * 邀请加入圈子
	 * @param member 当前会员
	 * @param circleId 圈子id
	 * @param invMid 邀请人id
	 * @param invCid 邀请人圈子
	 * @return
	 */
	boolean inviteJoinCircle(SyMember member, Integer circleId, Integer invMid, Integer invCid);
	
	/**
	 * @author fzh
	 * 通过buyId获取circleId
	 */
	List<SyCircle> getAllCircleInfo();
	
	/**
	 * 根据联盟查总条数
	 * @param channel
	 * @return
	 */
	Long countByChannel(String channel, Integer time);
	
	/**
	 * 获取益客邀请增加数
	 * @param channel
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	Long addNum(String channel, Integer startTime, Integer endTime);
	
	Long getNoInvYkCount(Integer time);
	
}
