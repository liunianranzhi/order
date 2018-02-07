package com.shanyuan.platform.ms.dao.statistics.entity;

public class MemberPointsNum {
	private Integer unionId;
	private String unionName;
	private Long totalPointTag;
	private Long validPointTag;
	private Integer totalPointNum;
	private Integer validPointNum;
	
	public Long getValidPointTag() {
		return validPointTag;
	}
	public void setValidPointTag(Long validPointTag) {
		this.validPointTag = validPointTag;
	}
	public Integer getUnionId() {
		return unionId;
	}
	public void setUnionId(Integer unionId) {
		this.unionId = unionId;
	}
	public String getUnionName() {
		return unionName;
	}
	public void setUnionName(String unionName) {
		this.unionName = unionName;
	}
	public Long getTotalPointTag() {
		return totalPointTag;
	}
	public void setTotalPointTag(Long totalPointTag) {
		this.totalPointTag = totalPointTag;
	}
	public Integer getTotalPointNum() {
		return totalPointNum;
	}
	public void setTotalPointNum(Integer totalPointNum) {
		this.totalPointNum = totalPointNum;
	}
	public Integer getValidPointNum() {
		return validPointNum;
	}
	public void setValidPointNum(Integer validPointNum) {
		this.validPointNum = validPointNum;
	}
	
}
