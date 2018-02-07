package com.shanyuan.platform.ms.facade.push.domain;

/**
 * 站内通知实体类
 * @author yangjian
 * @date 2017/12/13
 *
 */
public class MessageDomain {

	/**
	 * 会员id
	 */
	private Integer memberId;
	/**
	 * 来源id
	 */
	private Integer fromId;
	/**
	 * 消息主题
	 */
	private String title;
	/**
	 * 消息正文
	 */
	private String body;
	/**
	 * 连接地址
	 */
	private String pageUrl;
	/**
	 * 订单id
	 */
	private Integer orderId;
	/**
	 * 消息类型
	 */
	private Byte messageType;
	
	public MessageDomain(){
		super();
	}
	
	public MessageDomain(Integer memberId, Integer fromId, String title, String body, String pageUrl, Integer orderId,
			Byte messageType) {
		super();
		this.memberId = memberId;
		this.fromId = fromId;
		this.title = title;
		this.body = body;
		this.pageUrl = pageUrl;
		this.orderId = orderId;
		this.messageType = messageType;
	}

	public Integer getMemberId() {
		return memberId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	public Integer getFromId() {
		return fromId;
	}
	public void setFromId(Integer fromId) {
		this.fromId = fromId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getPageUrl() {
		return pageUrl;
	}
	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Byte getMessageType() {
		return messageType;
	}
	public void setMessageType(Byte messageType) {
		this.messageType = messageType;
	}
	
}
