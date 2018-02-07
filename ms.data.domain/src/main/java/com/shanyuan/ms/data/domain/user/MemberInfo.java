package com.shanyuan.ms.data.domain.user;

import java.io.Serializable;

public class MemberInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 641624787262493653L;

	private String memberName ;
	private String memberId ;
	private String phone ;
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
