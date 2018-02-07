package com.shanyuan.platform.ms.facade.push;

/**
 * 推送消息
 * @author yangjian
 * @date 2017/12/11
 *
 */
public interface PushMessageFacade {
	
	/**
	 * @author yangjian
	 * 向用户发送站内信
	 * @param token
	 * @param fromId
	 * @param title
	 * @param body
	 * @param orderId
	 * @return
	 */
	public Boolean pushMessage(String token, Integer fromId, String title, String body, Integer orderId, Byte type);
	
	/**
	 * @author yangjian
	 * 向用户推送消息
	 * @param token
	 * @param ticker
	 * @param title
	 * @param text
	 * @param loadUrl
	 * @return
	 */
	public Boolean sendUmengNotify(String token  ,String ticker ,String title ,String text ,String loadUrl);

}
