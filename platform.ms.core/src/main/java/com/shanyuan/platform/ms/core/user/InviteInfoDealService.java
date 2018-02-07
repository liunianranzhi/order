package com.shanyuan.platform.ms.core.user;

/**
 * 邀请信息 处理 接口
 * @author zhangwd
 *
 */
public interface InviteInfoDealService {

	/**
	 * 生成积分增加站内信
	 * @param memberId
	 * @param points
	 * @param token
	 */
	void sendMessageToMemberForIncPoints(Integer memberId ,Integer points);
	
	/**
	 * 生成邀请成功站内信
	 * @param memberId
	 * @param fromId
	 * @param title
	 * @param body
	 * @param pageUrl
	 * @param orderId
	 * @param messageType
	 */
	void sendmessageToMember(Integer memberId ,int fromId ,String title ,String body,String pageUrl,int orderId,byte messageType);

	/**
	 * 发送邀请推送消息
	 * @param memberId
	 * @param ticker
	 * @param title
	 * @param text
	 * @param loadUrl
	 */
	void sendNotifyToMemberForIncPoints(Integer memberId  ,String ticker ,String title ,String text ,String loadUrl);

	/**
	 * 生成积分增加推送
	 * @param memberId
	 * @param points
	 */
	void sendNotifyToMemberForIncPoints(Integer memberId ,Integer points );
}
