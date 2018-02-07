package com.shanyuan.platform.ms.core.user;


/**
 * 益客相关接口
 * @author zhangwd
 *
 */
public interface YIKECorrelationService {


	/**
	 * 加入为益客
	 * @param memberId  用户id
	 * @param circleId	用户所在圈子id
	 * @param inviteMemberId	邀请人id
	 * @param inviteCircleId	邀请人所在圈子id
	 * @return
	 */
	Boolean becomeInviteCircleMember(Integer memberId, Integer circleId, Integer inviteMemberId, Integer inviteCircleId );
	
}
