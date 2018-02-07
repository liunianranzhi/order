package com.shanyuan.platform.ms.facade.statistics.impl.domain;

import java.math.BigDecimal;

public class AssistStatisticsDomain {

	//统计时间
	private Integer cTime;
	//联盟id
	private Integer unionId;
	//联盟名称
	private String unionName;
	//员工成交金额
	private BigDecimal employeeDealAmount;
	//益客消费金额
	private BigDecimal ykDealAmount;
	//新增用户数
	private Long userAddedNum;
	//公益人士总人数
	private Long userTotalNum;
	//邀请益客数
	private Long inviteYkNum;
	//注册员工数
	private Long regEmployeeNum;
	
	public AssistStatisticsDomain() {
		super();
	}
	
	public AssistStatisticsDomain(Integer cTime, Integer unionId, String unionName, BigDecimal employeeDealAmount,
			BigDecimal ykDealAmount, Long userAddedNum, Long userTotalNum, Long inviteYkNum, Long regEmployeeNum) {
		super();
		this.cTime = cTime;
		this.unionId = unionId;
		this.unionName = unionName;
		this.employeeDealAmount = employeeDealAmount;
		this.ykDealAmount = ykDealAmount;
		this.userAddedNum = userAddedNum;
		this.userTotalNum = userTotalNum;
		this.inviteYkNum = inviteYkNum;
		this.regEmployeeNum = regEmployeeNum;
	}

	public Integer getUnionId() {
		return unionId;
	}

	public void setUnionId(Integer unionId) {
		this.unionId = unionId;
	}

	public Integer getcTime() {
		return cTime;
	}

	public void setcTime(Integer cTime) {
		this.cTime = cTime;
	}

	public String getUnionName() {
		return unionName;
	}

	public void setUnionName(String unionName) {
		this.unionName = unionName;
	}

	public BigDecimal getEmployeeDealAmount() {
		return employeeDealAmount;
	}

	public void setEmployeeDealAmount(BigDecimal employeeDealAmount) {
		this.employeeDealAmount = employeeDealAmount;
	}

	public BigDecimal getYkDealAmount() {
		return ykDealAmount;
	}

	public void setYkDealAmount(BigDecimal ykDealAmount) {
		this.ykDealAmount = ykDealAmount;
	}

	public Long getUserAddedNum() {
		return userAddedNum;
	}

	public void setUserAddedNum(Long userAddedNum) {
		this.userAddedNum = userAddedNum;
	}

	public Long getUserTotalNum() {
		return userTotalNum;
	}

	public void setUserTotalNum(Long userTotalNum) {
		this.userTotalNum = userTotalNum;
	}

	public Long getInviteYkNum() {
		return inviteYkNum;
	}

	public void setInviteYkNum(Long inviteYkNum) {
		this.inviteYkNum = inviteYkNum;
	}

	public Long getRegEmployeeNum() {
		return regEmployeeNum;
	}

	public void setRegEmployeeNum(Long regEmployeeNum) {
		this.regEmployeeNum = regEmployeeNum;
	}
	
}
