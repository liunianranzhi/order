package com.shanyuan.platform.ms.core.statistics.domain;

/**
 * 
 * 积分总览实体类
 * @author yangjian
 * @date 2018/01/19
 *
 */
public class PointDomain {
	
	private Integer unionId;
	private String unionName;
	private Long tag;
	private Integer totalNum;
	private Integer validNum;
	
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
	public Long getTag() {
		return tag;
	}
	public void setTag(Long tag) {
		this.tag = tag;
	}
	public Integer getTotalNum() {
		return totalNum;
	}
	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}
	public Integer getValidNum() {
		return validNum;
	}
	public void setValidNum(Integer validNum) {
		this.validNum = validNum;
	}
	public PointDomain(Integer unionId, String unionName, Long tag, Integer totalNum, Integer validNum) {
		super();
		this.unionId = unionId;
		this.unionName = unionName;
		this.tag = tag;
		this.totalNum = totalNum;
		this.validNum = validNum;
	}
	public PointDomain() {
		super();
	}
	
}
