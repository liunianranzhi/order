package com.shanyuan.platform.ms.core.member;

import java.util.Map;

/**
 * @author lee
 * 发送消息接口
 * 主要提供 发送短信服务和发送友盟的推送消息服务
 * 
 */
public interface PushService {
	
	
	/**
	 * 发送友盟 推送消息
	 * @param type 终端类型   android or ios
	 * @param token 终端alias token 
	 * @param ticker 
	 * @param title
	 * @param text
	 * @param extra 主要包含loadUrl
	 * @return 发送是否成功
	 */
	public boolean  sendNotifyByTokenUmeng(String type ,String token,String ticker ,String title ,String text ,Map<String,String> extra   ) ;
	
	/**
	 * 发送短息
	 * @param phone
	 * @param text
	 * @param channelType 短信发送通道 1:yunpian 当前只支持1
	 * @return 发送是否成功
	 */
	public boolean sendSMS(String phone ,String text ,int channelType);
}
