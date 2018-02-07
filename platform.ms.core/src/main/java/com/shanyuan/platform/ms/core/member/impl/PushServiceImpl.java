package com.shanyuan.platform.ms.core.member.impl;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.alibaba.druid.util.StringUtils;
import com.shanyuan.platform.ms.core.constant.ConstantReload;
import com.shanyuan.platform.ms.core.member.PushService;
import com.yunpian.sdk.YunpianClient;
import com.yunpian.sdk.model.Result;
import com.yunpian.sdk.model.SmsSingleSend;

import push.AndroidNotification;
import push.PushClient;
import push.android.AndroidCustomizedcast;
import push.ios.IOSCustomizedcast;
@Component
public class PushServiceImpl  implements PushService{

	final Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	private PushClient client; 
	
	@Autowired
	private ConstantReload constantReload;
	
	@Autowired
	private YunpianClient yunpianClient;
	
	@Bean
	public YunpianClient getYunpianClient() {
		YunpianClient clnt = new YunpianClient(constantReload.smsApiKey).init();
		return clnt;
	}
	@Bean
	public PushClient getPushClient() {
		PushClient clnt = new PushClient();
		return clnt;
	}
	
	public boolean sendNotifyByTokenUmeng(String type, String token, String ticker, String title, String text,
			Map<String, String> extra) {
		if("android".equalsIgnoreCase(type)) {
			try {
				AndroidCustomizedcast broadcast = new AndroidCustomizedcast( constantReload.Android_appkey,constantReload.Android_appMasterSecret);
				broadcast.setTicker( ticker);
				broadcast.setTitle( title);
				broadcast.setText( text);
				broadcast.setAlias(token, "token");
				broadcast.goAppAfterOpen();
				broadcast.setDisplayType(AndroidNotification.DisplayType.NOTIFICATION);
				broadcast.setProductionMode();
				// Set customized fields
				if(extra!=null) {
					for(Map.Entry<String, String> entry :extra.entrySet()) {
						broadcast.setExtraField(entry.getKey(),entry.getValue());
					}
				}
				
				return client.send(broadcast);
			} catch (Exception e) {
				e.printStackTrace();
				logger.error(e.getMessage(),e);
			}
		}else if("ios".equalsIgnoreCase(type)) {
			try {
				IOSCustomizedcast  broadcast  = new IOSCustomizedcast( constantReload.Ios_appkey,constantReload.Ios_appMasterSecret);
				broadcast.setAlias(token, "token");
				broadcast.setAlert(text);
				broadcast.setDescription(title);
				broadcast.setProductionMode();
				if(extra!=null && extra.get("loadUrl")!=null &&!StringUtils.isEmpty(extra.get("loadUrl"))) {
					broadcast.setCustomizedField("loadUrl", extra.get("loadUrl"));
				}
				return client.send(broadcast);
			} catch (Exception e) {
				e.printStackTrace();
				logger.error(e.getMessage(),e);
			}
		}
		return false;
	}

	public boolean sendSMS(String phone, String text, int channelType) {
		if(channelType==1) {
			Map<String, String> param = this.yunpianClient.newParam(2);
			param.put(YunpianClient.MOBILE, phone);
			param.put(YunpianClient.TEXT, text);
			Result<SmsSingleSend> r = yunpianClient.sms().single_send(param);
			if(r.getCode()==0) {
				logger.info("短信发送成功 "+phone +" "+text );
				return true;
			}else {
				logger.error("短信发送失败 "+r.getMsg() + " "+phone +" "+text );
				return false;
			}
		}
		return false;
	}

}
