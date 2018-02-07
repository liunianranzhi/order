package com.shanyuan.platform.ms.facade.push.domain;

import java.util.Map;

/**
 * umeng推送实体
 * @author yangjian
 * @date 2017/12/13
 *
 */
public class UmengPushDomain {
	
	/**
	 * Android/iOS
	 */
	private String type;
	/**
	 * 会员token
	 */
	private String token;
	/**
	 * 通知主题
	 */
	private String ticker;
	/**
	 * 消息标题
	 */
	private String title;
	/**
	 * 消息正文
	 */
	private String text;
	
	private Map<String, String> extra;
	
	public UmengPushDomain() {
		super();
	}
	
	public UmengPushDomain(String type, String token, String ticker, String title, String text,
			Map<String, String> extra) {
		super();
		this.type = type;
		this.token = token;
		this.ticker = ticker;
		this.title = title;
		this.text = text;
		this.extra = extra;
	}

	public String getToken() {
		return token;
	}
	public void setTOken(String token) {
		this.token = token;
	}
	public String getTicker() {
		return ticker;
	}
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Map<String, String> getExtra() {
		return extra;
	}
	public void setExtra(Map<String, String> extra) {
		this.extra = extra;
	}
	

}
