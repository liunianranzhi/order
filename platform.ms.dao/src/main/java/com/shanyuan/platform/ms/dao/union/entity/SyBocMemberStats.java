package com.shanyuan.platform.ms.dao.union.entity;

import java.math.BigDecimal;

/**
 * 描述:sy_boc_member_stats表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-11-08
 */
public class SyBocMemberStats {
    /**
     * 
     */
    private Integer recId;

    /**
     * 圈子id
     */
    private Integer circleId;

    /**
     * 圈子名称
     */
    private String circleName;

    /**
     * 党员帮扶总金额
     */
    private Integer partyTotalOrderAmount;

    /**
     * 党员结对子人数
     */
    private Integer partyTotalPaired;

    /**
     * 党员总人数
     */
    private Integer partyTotalMember;

    /**
     * 全辖帮扶总金额,益客+员工 +集采（单位+个人）已完成
     */
    private Long fullTotalOrderAmount;

    /**
     * 全辖结对子人数
     */
    private Integer fullTotalPaired;

    /**
     * 全辖总人数
     */
    private Integer fullTotalMember;

    /**
     * 全辖党员帮扶总金额
     */
    private Integer fullPartyTotalOrderAmount;

    /**
     * 全辖党员结对子人数
     */
    private Integer fullPartyTotalPaired;

    /**
     * 全辖党员总人数
     */
    private Integer fullPartyTotalMember;

    /**
     * 添加时间
     */
    private Integer addTime;

    /**
     * 所属圈子id
     */
    private Integer parentCircleId;

    /**
     * 全辖购买总金额 支付***使用
     */
    private Long fullTotalPayOrderAmount;

    /**
     * 集采线下帮扶总额单位分
     */
    private Integer bizOfflineAmount;

    /**
     * 全辖总积分
     */
    private Long fullTotalMemberBocPoints;

    /**
     * 通过线下集采获取的积分
     */
    private Long bizOfflinePoints;

    /**
     * 该部门每日订单金额
     */
    private BigDecimal dayOrderAmount;

    /**
     * 该部门每日订单数量
     */
    private Integer dayOrderNum;

    /**
     * 邀请加入公益联盟获取的金额 益客
     */
    private Long inviteAmount;

    /**
     * 邀请加入公益联盟获取的积分 益客
     */
    private Long inviteBocPoints;

    /**
     * 线上集采
     */
    private BigDecimal bizOnlineAmount;

    /**
     * 集采购买总金额包含扶贫码和线下订单（状态为已收货+已完成）
     */
    private Long bizAllAmount;

    /**
     * 邀请的益客数量
     */
    private Integer inviteNum;

    /**
     * 渠道标识
     */
    private String code;

    /**
     * 联盟定点县产品大爱超市销售总金额
     */
    private Long fullTotalSupportCountyAmount;

    /**
     * 部门人数
     */
    private Long staffsAmount;

    /**
     * 
     * @return rec_id 
     */
    public Integer getRecId() {
        return recId;
    }

    /**
     * 
     * @param recId 
     */
    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    /**
     * 圈子id
     * @return circle_id 圈子id
     */
    public Integer getCircleId() {
        return circleId;
    }

    /**
     * 圈子id
     * @param circleId 圈子id
     */
    public void setCircleId(Integer circleId) {
        this.circleId = circleId;
    }

    /**
     * 圈子名称
     * @return circle_name 圈子名称
     */
    public String getCircleName() {
        return circleName;
    }

    /**
     * 圈子名称
     * @param circleName 圈子名称
     */
    public void setCircleName(String circleName) {
        this.circleName = circleName == null ? null : circleName.trim();
    }

    /**
     * 党员帮扶总金额
     * @return party_total_order_amount 党员帮扶总金额
     */
    public Integer getPartyTotalOrderAmount() {
        return partyTotalOrderAmount;
    }

    /**
     * 党员帮扶总金额
     * @param partyTotalOrderAmount 党员帮扶总金额
     */
    public void setPartyTotalOrderAmount(Integer partyTotalOrderAmount) {
        this.partyTotalOrderAmount = partyTotalOrderAmount;
    }

    /**
     * 党员结对子人数
     * @return party_total_paired 党员结对子人数
     */
    public Integer getPartyTotalPaired() {
        return partyTotalPaired;
    }

    /**
     * 党员结对子人数
     * @param partyTotalPaired 党员结对子人数
     */
    public void setPartyTotalPaired(Integer partyTotalPaired) {
        this.partyTotalPaired = partyTotalPaired;
    }

    /**
     * 党员总人数
     * @return party_total_member 党员总人数
     */
    public Integer getPartyTotalMember() {
        return partyTotalMember;
    }

    /**
     * 党员总人数
     * @param partyTotalMember 党员总人数
     */
    public void setPartyTotalMember(Integer partyTotalMember) {
        this.partyTotalMember = partyTotalMember;
    }

    /**
     * 全辖帮扶总金额,益客+员工 +集采（单位+个人）已完成
     * @return full_total_order_amount 全辖帮扶总金额,益客+员工 +集采（单位+个人）已完成
     */
    public Long getFullTotalOrderAmount() {
        return fullTotalOrderAmount;
    }

    /**
     * 全辖帮扶总金额,益客+员工 +集采（单位+个人）已完成
     * @param fullTotalOrderAmount 全辖帮扶总金额,益客+员工 +集采（单位+个人）已完成
     */
    public void setFullTotalOrderAmount(Long fullTotalOrderAmount) {
        this.fullTotalOrderAmount = fullTotalOrderAmount;
    }

    /**
     * 全辖结对子人数
     * @return full_total_paired 全辖结对子人数
     */
    public Integer getFullTotalPaired() {
        return fullTotalPaired;
    }

    /**
     * 全辖结对子人数
     * @param fullTotalPaired 全辖结对子人数
     */
    public void setFullTotalPaired(Integer fullTotalPaired) {
        this.fullTotalPaired = fullTotalPaired;
    }

    /**
     * 全辖总人数
     * @return full_total_member 全辖总人数
     */
    public Integer getFullTotalMember() {
        return fullTotalMember;
    }

    /**
     * 全辖总人数
     * @param fullTotalMember 全辖总人数
     */
    public void setFullTotalMember(Integer fullTotalMember) {
        this.fullTotalMember = fullTotalMember;
    }

    /**
     * 全辖党员帮扶总金额
     * @return full_party_total_order_amount 全辖党员帮扶总金额
     */
    public Integer getFullPartyTotalOrderAmount() {
        return fullPartyTotalOrderAmount;
    }

    /**
     * 全辖党员帮扶总金额
     * @param fullPartyTotalOrderAmount 全辖党员帮扶总金额
     */
    public void setFullPartyTotalOrderAmount(Integer fullPartyTotalOrderAmount) {
        this.fullPartyTotalOrderAmount = fullPartyTotalOrderAmount;
    }

    /**
     * 全辖党员结对子人数
     * @return full_party_total_paired 全辖党员结对子人数
     */
    public Integer getFullPartyTotalPaired() {
        return fullPartyTotalPaired;
    }

    /**
     * 全辖党员结对子人数
     * @param fullPartyTotalPaired 全辖党员结对子人数
     */
    public void setFullPartyTotalPaired(Integer fullPartyTotalPaired) {
        this.fullPartyTotalPaired = fullPartyTotalPaired;
    }

    /**
     * 全辖党员总人数
     * @return full_party_total_member 全辖党员总人数
     */
    public Integer getFullPartyTotalMember() {
        return fullPartyTotalMember;
    }

    /**
     * 全辖党员总人数
     * @param fullPartyTotalMember 全辖党员总人数
     */
    public void setFullPartyTotalMember(Integer fullPartyTotalMember) {
        this.fullPartyTotalMember = fullPartyTotalMember;
    }

    /**
     * 添加时间
     * @return add_time 添加时间
     */
    public Integer getAddTime() {
        return addTime;
    }

    /**
     * 添加时间
     * @param addTime 添加时间
     */
    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    /**
     * 所属圈子id
     * @return parent_circle_id 所属圈子id
     */
    public Integer getParentCircleId() {
        return parentCircleId;
    }

    /**
     * 所属圈子id
     * @param parentCircleId 所属圈子id
     */
    public void setParentCircleId(Integer parentCircleId) {
        this.parentCircleId = parentCircleId;
    }

    /**
     * 全辖购买总金额 支付***使用
     * @return full_total_pay_order_amount 全辖购买总金额 支付***使用
     */
    public Long getFullTotalPayOrderAmount() {
        return fullTotalPayOrderAmount;
    }

    /**
     * 全辖购买总金额 支付***使用
     * @param fullTotalPayOrderAmount 全辖购买总金额 支付***使用
     */
    public void setFullTotalPayOrderAmount(Long fullTotalPayOrderAmount) {
        this.fullTotalPayOrderAmount = fullTotalPayOrderAmount;
    }

    /**
     * 集采线下帮扶总额单位分
     * @return biz_offline_amount 集采线下帮扶总额单位分
     */
    public Integer getBizOfflineAmount() {
        return bizOfflineAmount;
    }

    /**
     * 集采线下帮扶总额单位分
     * @param bizOfflineAmount 集采线下帮扶总额单位分
     */
    public void setBizOfflineAmount(Integer bizOfflineAmount) {
        this.bizOfflineAmount = bizOfflineAmount;
    }

    /**
     * 全辖总积分
     * @return full_total_member_boc_points 全辖总积分
     */
    public Long getFullTotalMemberBocPoints() {
        return fullTotalMemberBocPoints;
    }

    /**
     * 全辖总积分
     * @param fullTotalMemberBocPoints 全辖总积分
     */
    public void setFullTotalMemberBocPoints(Long fullTotalMemberBocPoints) {
        this.fullTotalMemberBocPoints = fullTotalMemberBocPoints;
    }

    /**
     * 通过线下集采获取的积分
     * @return biz_offline_points 通过线下集采获取的积分
     */
    public Long getBizOfflinePoints() {
        return bizOfflinePoints;
    }

    /**
     * 通过线下集采获取的积分
     * @param bizOfflinePoints 通过线下集采获取的积分
     */
    public void setBizOfflinePoints(Long bizOfflinePoints) {
        this.bizOfflinePoints = bizOfflinePoints;
    }

    /**
     * 该部门每日订单金额
     * @return day_order_amount 该部门每日订单金额
     */
    public BigDecimal getDayOrderAmount() {
        return dayOrderAmount;
    }

    /**
     * 该部门每日订单金额
     * @param dayOrderAmount 该部门每日订单金额
     */
    public void setDayOrderAmount(BigDecimal dayOrderAmount) {
        this.dayOrderAmount = dayOrderAmount;
    }

    /**
     * 该部门每日订单数量
     * @return day_order_num 该部门每日订单数量
     */
    public Integer getDayOrderNum() {
        return dayOrderNum;
    }

    /**
     * 该部门每日订单数量
     * @param dayOrderNum 该部门每日订单数量
     */
    public void setDayOrderNum(Integer dayOrderNum) {
        this.dayOrderNum = dayOrderNum;
    }

    /**
     * 邀请加入公益联盟获取的金额 益客
     * @return invite_amount 邀请加入公益联盟获取的金额 益客
     */
    public Long getInviteAmount() {
        return inviteAmount;
    }

    /**
     * 邀请加入公益联盟获取的金额 益客
     * @param inviteAmount 邀请加入公益联盟获取的金额 益客
     */
    public void setInviteAmount(Long inviteAmount) {
        this.inviteAmount = inviteAmount;
    }

    /**
     * 邀请加入公益联盟获取的积分 益客
     * @return invite_boc_points 邀请加入公益联盟获取的积分 益客
     */
    public Long getInviteBocPoints() {
        return inviteBocPoints;
    }

    /**
     * 邀请加入公益联盟获取的积分 益客
     * @param inviteBocPoints 邀请加入公益联盟获取的积分 益客
     */
    public void setInviteBocPoints(Long inviteBocPoints) {
        this.inviteBocPoints = inviteBocPoints;
    }

    /**
     * 线上集采
     * @return biz_online_amount 线上集采
     */
    public BigDecimal getBizOnlineAmount() {
        return bizOnlineAmount;
    }

    /**
     * 线上集采
     * @param bizOnlineAmount 线上集采
     */
    public void setBizOnlineAmount(BigDecimal bizOnlineAmount) {
        this.bizOnlineAmount = bizOnlineAmount;
    }

    /**
     * 集采购买总金额包含扶贫码和线下订单（状态为已收货+已完成）
     * @return biz_all_amount 集采购买总金额包含扶贫码和线下订单（状态为已收货+已完成）
     */
    public Long getBizAllAmount() {
        return bizAllAmount;
    }

    /**
     * 集采购买总金额包含扶贫码和线下订单（状态为已收货+已完成）
     * @param bizAllAmount 集采购买总金额包含扶贫码和线下订单（状态为已收货+已完成）
     */
    public void setBizAllAmount(Long bizAllAmount) {
        this.bizAllAmount = bizAllAmount;
    }

    /**
     * 邀请的益客数量
     * @return invite_num 邀请的益客数量
     */
    public Integer getInviteNum() {
        return inviteNum;
    }

    /**
     * 邀请的益客数量
     * @param inviteNum 邀请的益客数量
     */
    public void setInviteNum(Integer inviteNum) {
        this.inviteNum = inviteNum;
    }

    /**
     * 渠道标识
     * @return code 渠道标识
     */
    public String getCode() {
        return code;
    }

    /**
     * 渠道标识
     * @param code 渠道标识
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 联盟定点县产品大爱超市销售总金额
     * @return full_total_support_county_amount 联盟定点县产品大爱超市销售总金额
     */
    public Long getFullTotalSupportCountyAmount() {
        return fullTotalSupportCountyAmount;
    }

    /**
     * 联盟定点县产品大爱超市销售总金额
     * @param fullTotalSupportCountyAmount 联盟定点县产品大爱超市销售总金额
     */
    public void setFullTotalSupportCountyAmount(Long fullTotalSupportCountyAmount) {
        this.fullTotalSupportCountyAmount = fullTotalSupportCountyAmount;
    }

    /**
     * 部门人数
     * @return staffs_amount 部门人数
     */
    public Long getStaffsAmount() {
        return staffsAmount;
    }

    /**
     * 部门人数
     * @param staffsAmount 部门人数
     */
    public void setStaffsAmount(Long staffsAmount) {
        this.staffsAmount = staffsAmount;
    }
}