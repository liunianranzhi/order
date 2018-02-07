package com.shanyuan.platform.ms.core.union.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.util.ObjectUtils;

import com.alibaba.fastjson.JSONObject;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;
import com.shanyuan.platform.ms.dao.user.entity.SyCircle;

/**
 * 
 * @author zhangwd
 *
 */
public class UnionStatisticBo implements Serializable {

	
	private static final long serialVersionUID = -8966978561438961227L;
	
	/**
     * 联盟id
     */
    private Integer unionId;
	
    /**
     * 联盟通道
     */
    private String unionChannel;
	
	/**
     * 联盟名称
     */
    private String unionName;

    /**
     * 联盟累计注册人数 (包括益客)
     */
    private Integer unionEnrollment;
    
    /**
     * 联盟新注册人数
     */
    private Integer unionNewEnrollment;
    
    /**
     * 联盟中人均积分
     */
    private Integer unionPoints;
    
    /**
     * 联盟购买总额
     */
    private Integer unionSpending;
    
    /**
     * 联盟销售总额
     */
    private Integer unionSalesAmount;
    
    /**
     * 联盟详情url
     */
    private String unionInfoUrl;
    
    /**
     * 联盟排行
     */
    private Integer unionRanking;

    /**
     * 用户是否加入
     * @return
     */
    private Boolean isJoin;
    
    /**
     * 联盟排行榜排序
     * @return
     */
    private Integer unionSort;
    
    /**
     * 联盟描述
     * @return
     */
    private String unionDesc;
    
    /**
     * 联盟介绍
     * @return
     */
    private String unionIntroduction;
    
    /**
     * 联盟对应的部门
     * @return
     */
    private Integer circleId;
    
    /**
     * 联盟的圈子数量
     * @return
     */
    private Integer circleCount;
    
    /**
     * 联盟的商品数量(爱心产品数--上线)
     * @return
     */
    private Integer goodsCount;
    
    /**
     * 联盟的代理人数量（脱贫助理人--在线）
     * @return
     */
    private Integer agentCount;
    
    /**
     * 联盟的贫困户总人口数
     * @return
     */
    private Integer poorCount;
    
    /**
     * 联盟的贫困户自营人数
     * @return
     */
    private Integer poorSelfSaleCount;
    
    /**
     * 联盟的贫困户增收额 = 贫困户销售额 *0.986 + 代理人销售额
     * @return
     */
    private BigDecimal moneyTotal;
    
    /**
     * 帮扶金额（代理人销售额）
     * @return
     */
    private BigDecimal helpingMoney;;
    
    /**
     * 联盟捐赠总额（包括捐款）
     * @return
     */
    private BigDecimal unionDonation;
    
    /**
     * 联盟圈子内总订单数
     * @return
     */
    private Integer orderCircleTotal;
    
    /**
     * 购买的爱心商品数
     * @return
     */
    private Integer goodsTotal;
    
    /**
     * 昨天销售最多的4个产品（大爱超市）
     */
    private List<SyGoodsCommon> goodsTopList;
    
    /**
     * 员工最活跃
     * 过去7天新增注册人数最多的单位（10个）
     * @return
     */
    private List<SyCircle> newEnrollTopCircle;
    
    /**
     * 员工最有爱
     * 过去7天人均消费最多的单位（含单位采集）
     * @return
     */
    private List<SyCircle> consumeTopCircleEachMember;
    
    /**
     * 员工最热心
     * 过去7天益客注册最多的单位
     * @return
     */
    private List<SyCircle> inviteNumTopCircle;
    
    /**
     * 联盟邀请的益客数
     * @return
     */
    private Integer  inviteNum;
    
    /**
     * 联盟总人数（不含益客）
     * @return
     */
    private Integer fullTotalMember;
    
    /**
     * 联盟总积分
     * @return
     */
    private Integer fullTotalMemberBocPoints;
    
    /**
     * 创建时间
     * @return
     */
    private Date createTime;
    
    /**
     * 更新时间
     * @return
     */
    private Date updateTime;
    
    
	public Integer getUnionId() {
		return unionId;
	}

	public void setUnionId(Integer unionId) {
		this.unionId = unionId;
	}

	public String getUnionChannel() {
		return unionChannel;
	}

	public void setUnionChannel(String unionChannel) {
		this.unionChannel = unionChannel;
	}

	public String getUnionName() {
		return unionName;
	}

	public void setUnionName(String unionName) {
		this.unionName = unionName;
	}

	public Integer getUnionEnrollment() {
		return unionEnrollment;
	}

	public void setUnionEnrollment(Integer unionEnrollment) {
		this.unionEnrollment = unionEnrollment;
	}

	public Integer getUnionNewEnrollment() {
		return unionNewEnrollment;
	}

	public void setUnionNewEnrollment(Integer unionNewEnrollment) {
		this.unionNewEnrollment = unionNewEnrollment;
	}

	public Integer getUnionPoints() {
		return unionPoints;
	}

	public void setUnionPoints(Integer unionPoints) {
		this.unionPoints = unionPoints;
	}

	public Integer getUnionSpending() {
		return unionSpending;
	}

	public void setUnionSpending(Integer unionSpending) {
		this.unionSpending = unionSpending;
	}

	public Integer getUnionSalesAmount() {
		return unionSalesAmount;
	}

	public void setUnionSalesAmount(Integer unionSalesAmount) {
		this.unionSalesAmount = unionSalesAmount;
	}

	public String getUnionInfoUrl() {
		return unionInfoUrl;
	}

	public void setUnionInfoUrl(String unionInfoUrl) {
		this.unionInfoUrl = unionInfoUrl;
	}

	public Integer getUnionRanking() {
		return unionRanking;
	}

	public void setUnionRanking(Integer unionRanking) {
		this.unionRanking = unionRanking;
	}

	public Boolean getIsJoin() {
		return isJoin;
	}

	public void setIsJoin(Boolean isJoin) {
		this.isJoin = isJoin;
	}

	public Integer getUnionSort() {
		return unionSort;
	}

	public void setUnionSort(Integer unionSort) {
		this.unionSort = unionSort;
	}

	public String getUnionDesc() {
		return unionDesc;
	}

	public void setUnionDesc(String unionDesc) {
		this.unionDesc = unionDesc;
	}

	public String getUnionIntroduction() {
		return unionIntroduction;
	}

	public void setUnionIntroduction(String unionIntroduction) {
		this.unionIntroduction = unionIntroduction;
	}

	public Integer getCircleId() {
		return circleId;
	}

	public void setCircleId(Integer circleId) {
		this.circleId = circleId;
	}

	public Integer getCircleCount() {
		return circleCount;
	}

	public void setCircleCount(Integer circleCount) {
		this.circleCount = circleCount;
	}

	public Integer getGoodsCount() {
		return goodsCount;
	}

	public void setGoodsCount(Integer goodsCount) {
		this.goodsCount = goodsCount;
	}

	public Integer getAgentCount() {
		return agentCount;
	}

	public void setAgentCount(Integer agentCount) {
		this.agentCount = agentCount;
	}

	public Integer getPoorCount() {
		return poorCount;
	}

	public void setPoorCount(Integer poorCount) {
		this.poorCount = poorCount;
	}

	public Integer getPoorSelfSaleCount() {
		return poorSelfSaleCount;
	}

	public void setPoorSelfSaleCount(Integer poorSelfSaleCount) {
		this.poorSelfSaleCount = poorSelfSaleCount;
	}

	public BigDecimal getMoneyTotal() {
		return moneyTotal;
	}

	public void setMoneyTotal(BigDecimal moneyTotal) {
		this.moneyTotal = moneyTotal;
	}

	public BigDecimal getHelpingMoney() {
		return helpingMoney;
	}

	public void setHelpingMoney(BigDecimal helpingMoney) {
		this.helpingMoney = helpingMoney;
	}

	public BigDecimal getUnionDonation() {
		return unionDonation;
	}

	public void setUnionDonation(BigDecimal unionDonation) {
		this.unionDonation = unionDonation;
	}

	public Integer getOrderCircleTotal() {
		return orderCircleTotal;
	}

	public void setOrderCircleTotal(Integer orderCircleTotal) {
		this.orderCircleTotal = orderCircleTotal;
	}

	public Integer getGoodsTotal() {
		return goodsTotal;
	}

	public void setGoodsTotal(Integer goodsTotal) {
		this.goodsTotal = goodsTotal;
	}

	/**
	 * list 以json格式返回
	 * @return
	 */
	public String getGoodsTopList() {
		
		return JSONObject.toJSONString(goodsTopList);
	}

	public void setGoodsTopList(List<SyGoodsCommon> goodsTopList) {
		
		if (ObjectUtils.isEmpty(goodsTopList)) {
			goodsTopList = new ArrayList<>();
		}
		this.goodsTopList = goodsTopList;
	}

	public List<SyCircle> getNewEnrollTopCircle() {
		return newEnrollTopCircle;
	}

	public void setNewEnrollTopCircle(List<SyCircle> newEnrollTopCircle) {
		this.newEnrollTopCircle = newEnrollTopCircle;
	}

	public List<SyCircle> getConsumeTopCircleEachMember() {
		return consumeTopCircleEachMember;
	}

	public void setConsumeTopCircleEachMember(List<SyCircle> consumeTopCircleEachMember) {
		this.consumeTopCircleEachMember = consumeTopCircleEachMember;
	}

	public List<SyCircle> getInviteNumTopCircle() {
		return inviteNumTopCircle;
	}

	public void setInviteNumTopCircle(List<SyCircle> inviteNumTopCircle) {
		this.inviteNumTopCircle = inviteNumTopCircle;
	}

	public Integer getInviteNum() {
		return inviteNum;
	}

	public void setInviteNum(Integer inviteNum) {
		this.inviteNum = inviteNum;
	}

	public Integer getFullTotalMember() {
		return fullTotalMember;
	}

	public void setFullTotalMember(Integer fullTotalMember) {
		this.fullTotalMember = fullTotalMember;
	}

	public Integer getFullTotalMemberBocPoints() {
		return fullTotalMemberBocPoints;
	}

	public void setFullTotalMemberBocPoints(Integer fullTotalMemberBocPoints) {
		this.fullTotalMemberBocPoints = fullTotalMemberBocPoints;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
    
	
}
