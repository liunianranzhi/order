package com.shanyuan.platform.ms.core.constant.enums;

public enum SellerType {

	poor(1, "贫困户"),
	agent(2, "助理人"),
	onlineBiz(3, "线上集采"),
	offlineBiz(4, "线下集采"),
	syshop(5, "善源商场"),
	dacs(6, "大爱超市");

	private Integer code;
	private String message;
	private SellerType(Integer code, String message) {
		this.code = code;
		this.message = message;
	}
	public Integer getCode() {
		return code;
	}
	public String getMessage() {
		return message;
	}
}
