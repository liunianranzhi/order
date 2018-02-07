package com.shanyuan.platform.ms.core.constant.enums;

public enum MessageType {
	
	MESSAGE_TYPE_ORDER("订单消息", (byte) 100),
	MESSAGE_TYPE_NOTIFY("通知消息", (byte) 101),
	MESSAGE_TYPE_SERVICE("服务消息", (byte) 102),
	MESSAGE_TYPE_BAZAAR("市场消息", (byte) 103),
	MESSAGE_TYPE_DONATION("捐款消息", (byte) 104),
	MESSAGE_TYPE_POINTS("积分消息", (byte) 105),
	MESSAGE_TYPE_SYSTEM("系统消息", (byte) 106),
	MESSAGE_TYPE_GLORY("勋章消息", (byte) 107),
	MESSAGE_TYPE_WALLETFREEZE("公益钱包冻结通知", (byte) 108),
	MESSAGE_TYPE_WALLETGIFT("公益钱包奖励通知", (byte) 109),
	MESSAGE_TYPE_VOUCHER("优惠券消息", (byte) 110),
	MESSAGE_TYPE_VOL_COMMENT_REPLY("志愿队评价回复消息", (byte) 111),
	MESSAGE_TYPE_VOL_ORG("志愿队志愿组织", (byte) 112),
	MESSAGE_TYPE_VOL_RECRUIT("志愿队招募", (byte) 113),
	MESSAGE_TYPE_VOL_SERVICE_TIME("志愿队服务时长", (byte) 114);
	;

	private Byte code;
	private String message;
	private MessageType(String message, Byte code) {
		this.code = code;
		this.message = message;
	}
	public Byte getCode() {
		return code;
	}
	public String getMessage() {
		return message;
	}
}
