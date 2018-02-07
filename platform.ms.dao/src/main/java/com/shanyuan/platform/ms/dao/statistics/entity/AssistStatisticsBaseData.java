package com.shanyuan.platform.ms.dao.statistics.entity;

import java.math.BigDecimal;

/**
 * 描述:assist_statistics_base_data表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2018-01-08
 */
public class AssistStatisticsBaseData {
    /**
     * 主键id
     */
    private Integer recId;

    /**
     * 统计时间
     */
    private Integer cTime;

    /**
     * 联盟id
     */
    private Integer unionId;

    /**
     * 联盟名称
     */
    private String unionName;

    /**
     * 联盟标识
     */
    private String channel;

    /**
     * 员工成交金额
     */
    private BigDecimal employeeDealAmount;

    /**
     * 益客消费金额
     */
    private BigDecimal ykDealAmount;

    /**
     * 新增用户数
     */
    private Long userAddedNum;

    /**
     * 公益人士总数
     */
    private Long userTotalNum;

    /**
     * 邀请益客数
     */
    private Long inviteYkNum;

    /**
     * 注册员工数
     */
    private Long regEmployeeNum;

    /**
     * 主键id
     * @return rec_id 主键id
     */
    public Integer getRecId() {
        return recId;
    }

    /**
     * 主键id
     * @param recId 主键id
     */
    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    /**
     * 统计时间
     * @return c_time 统计时间
     */
    public Integer getcTime() {
        return cTime;
    }

    /**
     * 统计时间
     * @param cTime 统计时间
     */
    public void setcTime(Integer cTime) {
        this.cTime = cTime;
    }

    /**
     * 联盟id
     * @return union_id 联盟id
     */
    public Integer getUnionId() {
        return unionId;
    }

    /**
     * 联盟id
     * @param unionId 联盟id
     */
    public void setUnionId(Integer unionId) {
        this.unionId = unionId;
    }

    /**
     * 联盟名称
     * @return union_name 联盟名称
     */
    public String getUnionName() {
        return unionName;
    }

    /**
     * 联盟名称
     * @param unionName 联盟名称
     */
    public void setUnionName(String unionName) {
        this.unionName = unionName == null ? null : unionName.trim();
    }

    /**
     * 联盟标识
     * @return channel 联盟标识
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 联盟标识
     * @param channel 联盟标识
     */
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    /**
     * 员工成交金额
     * @return employee_deal_amount 员工成交金额
     */
    public BigDecimal getEmployeeDealAmount() {
        return employeeDealAmount;
    }

    /**
     * 员工成交金额
     * @param employeeDealAmount 员工成交金额
     */
    public void setEmployeeDealAmount(BigDecimal employeeDealAmount) {
        this.employeeDealAmount = employeeDealAmount;
    }

    /**
     * 益客消费金额
     * @return yk_deal_amount 益客消费金额
     */
    public BigDecimal getYkDealAmount() {
        return ykDealAmount;
    }

    /**
     * 益客消费金额
     * @param ykDealAmount 益客消费金额
     */
    public void setYkDealAmount(BigDecimal ykDealAmount) {
        this.ykDealAmount = ykDealAmount;
    }

    /**
     * 新增用户数
     * @return user_added_num 新增用户数
     */
    public Long getUserAddedNum() {
        return userAddedNum;
    }

    /**
     * 新增用户数
     * @param userAddedNum 新增用户数
     */
    public void setUserAddedNum(Long userAddedNum) {
        this.userAddedNum = userAddedNum;
    }

    /**
     * 公益人士总数
     * @return user_total_num 公益人士总数
     */
    public Long getUserTotalNum() {
        return userTotalNum;
    }

    /**
     * 公益人士总数
     * @param userTotalNum 公益人士总数
     */
    public void setUserTotalNum(Long userTotalNum) {
        this.userTotalNum = userTotalNum;
    }

    /**
     * 邀请益客数
     * @return invite_yk_num 邀请益客数
     */
    public Long getInviteYkNum() {
        return inviteYkNum;
    }

    /**
     * 邀请益客数
     * @param inviteYkNum 邀请益客数
     */
    public void setInviteYkNum(Long inviteYkNum) {
        this.inviteYkNum = inviteYkNum;
    }

    /**
     * 注册员工数
     * @return reg_employee_num 注册员工数
     */
    public Long getRegEmployeeNum() {
        return regEmployeeNum;
    }

    /**
     * 注册员工数
     * @param regEmployeeNum 注册员工数
     */
    public void setRegEmployeeNum(Long regEmployeeNum) {
        this.regEmployeeNum = regEmployeeNum;
    }

	public AssistStatisticsBaseData(Integer cTime, Integer unionId, String unionName, String channel,
			BigDecimal employeeDealAmount, BigDecimal ykDealAmount, Long userAddedNum, Long userTotalNum,
			Long inviteYkNum, Long regEmployeeNum) {
		super();
		this.cTime = cTime;
		this.unionId = unionId;
		this.unionName = unionName;
		this.channel = channel;
		this.employeeDealAmount = employeeDealAmount;
		this.ykDealAmount = ykDealAmount;
		this.userAddedNum = userAddedNum;
		this.userTotalNum = userTotalNum;
		this.inviteYkNum = inviteYkNum;
		this.regEmployeeNum = regEmployeeNum;
	}

	public AssistStatisticsBaseData() {
		super();
	}
    
}