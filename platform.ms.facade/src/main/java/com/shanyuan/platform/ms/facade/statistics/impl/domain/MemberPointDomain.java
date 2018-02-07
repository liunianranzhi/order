package com.shanyuan.platform.ms.facade.statistics.impl.domain;

public class MemberPointDomain {
	
	private Integer unionId;
	private Integer memberId;
	private String unionName;
	private String memberMobile;
	private String memberName;
	private Long totalPoint;
	private Long validPoint;
	
	public MemberPointDomain() {
		super();
	}

	public MemberPointDomain(Integer unionId, Integer memberId, String unionName, String memberMobile,
			String memberName, Long totalPoint, Long validPoint) {
		super();
		this.unionId = unionId;
		this.memberId = memberId;
		this.unionName = unionName;
		this.memberMobile = memberMobile;
		this.memberName = memberName;
		this.totalPoint = totalPoint;
		this.validPoint = validPoint;
	}

	public Integer getUnionId() {
		return unionId;
	}

	public void setUnionId(Integer unionId) {
		this.unionId = unionId;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public String getUnionName() {
		return unionName;
	}
	public void setUnionName(String unionName) {
		this.unionName = unionName;
	}
	public String getMemberMobile() {
		return memberMobile;
	}
	public void setMemberMobile(String memberMobile) {
		this.memberMobile = memberMobile;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public Long getTotalPoint() {
		return totalPoint;
	}
	public void setTotalPoint(Long totalPoint) {
		this.totalPoint = totalPoint;
	}
	public Long getValidPoint() {
		return validPoint;
	}
	public void setValidPoint(Long validPoint) {
		this.validPoint = validPoint;
	}
	
	
	
}
