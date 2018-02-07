package com.shanyuan.platform.ms.dao.statistics.entity;

import java.math.BigDecimal;

/**
 * 描述:order_statistics_offline_biz_order表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2018-01-04
 */
public class OrderStatisticsOfflineBizOrder {
    /**
     * 
     */
    private Integer id;

    /**
     * 集采订单索引
     */
    private Integer mainOrderId;

    /**
     * 
     */
    private Integer buyerId;

    /**
     * 买家姓名
     */
    private String buyerName;

    /**
     * 完成时间
     */
    private Integer finishedTime;

    /**
     * 订单总价 单位分
     */
    private BigDecimal orderAmount;

    /**
     * 买家部门id
     */
    private Integer circleIdDeep1;

    /**
     * 
     */
    private Integer circleIdDeep2;

    /**
     * 
     */
    private Integer circleIdDeep3;

    /**
     * 
     */
    private Integer circleIdDeep4;

    /**
     * 
     */
    private Integer circleIdDeep5;

    /**
     * 
     */
    private Integer circleIdDeep6;

    /**
     * 
     */
    private Integer circleIdDeep7;

    /**
     * 买家部门名称，拼接方式circle1,circle2,circle3...
     */
    private String circleName;

    /**
     * 联盟渠道标识
     */
    private String channel;

    /**
     * 订单类型 biz_have_goods：购买集采已有产品  biz_intention_goods：集采意向产品
     */
    private String orderType;

    /**
     * 支付状态 10：未支付  20：买家确认支付  30：卖家确认支付
     */
    private String payState;

    /**
     * 订单完成时间 格式yyyyMMdd
     */
    private Integer cTime;

    /**
     * 帮扶金额
     */
    private BigDecimal helpPrice;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 集采订单索引
     * @return main_order_id 集采订单索引
     */
    public Integer getMainOrderId() {
        return mainOrderId;
    }

    /**
     * 集采订单索引
     * @param mainOrderId 集采订单索引
     */
    public void setMainOrderId(Integer mainOrderId) {
        this.mainOrderId = mainOrderId;
    }

    /**
     * 
     * @return buyer_id 
     */
    public Integer getBuyerId() {
        return buyerId;
    }

    /**
     * 
     * @param buyerId 
     */
    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * 买家姓名
     * @return buyer_name 买家姓名
     */
    public String getBuyerName() {
        return buyerName;
    }

    /**
     * 买家姓名
     * @param buyerName 买家姓名
     */
    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName == null ? null : buyerName.trim();
    }

    /**
     * 完成时间
     * @return finished_time 完成时间
     */
    public Integer getFinishedTime() {
        return finishedTime;
    }

    /**
     * 完成时间
     * @param finishedTime 完成时间
     */
    public void setFinishedTime(Integer finishedTime) {
        this.finishedTime = finishedTime;
    }

    /**
     * 订单总价 单位分
     * @return order_amount 订单总价 单位分
     */
    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    /**
     * 订单总价 单位分
     * @param orderAmount 订单总价 单位分
     */
    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * 买家部门id
     * @return circle_id_deep_1 买家部门id
     */
    public Integer getCircleIdDeep1() {
        return circleIdDeep1;
    }

    /**
     * 买家部门id
     * @param circleIdDeep1 买家部门id
     */
    public void setCircleIdDeep1(Integer circleIdDeep1) {
        this.circleIdDeep1 = circleIdDeep1;
    }

    /**
     * 
     * @return circle_id_deep_2 
     */
    public Integer getCircleIdDeep2() {
        return circleIdDeep2;
    }

    /**
     * 
     * @param circleIdDeep2 
     */
    public void setCircleIdDeep2(Integer circleIdDeep2) {
        this.circleIdDeep2 = circleIdDeep2;
    }

    /**
     * 
     * @return circle_id_deep_3 
     */
    public Integer getCircleIdDeep3() {
        return circleIdDeep3;
    }

    /**
     * 
     * @param circleIdDeep3 
     */
    public void setCircleIdDeep3(Integer circleIdDeep3) {
        this.circleIdDeep3 = circleIdDeep3;
    }

    /**
     * 
     * @return circle_id_deep_4 
     */
    public Integer getCircleIdDeep4() {
        return circleIdDeep4;
    }

    /**
     * 
     * @param circleIdDeep4 
     */
    public void setCircleIdDeep4(Integer circleIdDeep4) {
        this.circleIdDeep4 = circleIdDeep4;
    }

    /**
     * 
     * @return circle_id_deep_5 
     */
    public Integer getCircleIdDeep5() {
        return circleIdDeep5;
    }

    /**
     * 
     * @param circleIdDeep5 
     */
    public void setCircleIdDeep5(Integer circleIdDeep5) {
        this.circleIdDeep5 = circleIdDeep5;
    }

    /**
     * 
     * @return circle_id_deep_6 
     */
    public Integer getCircleIdDeep6() {
        return circleIdDeep6;
    }

    /**
     * 
     * @param circleIdDeep6 
     */
    public void setCircleIdDeep6(Integer circleIdDeep6) {
        this.circleIdDeep6 = circleIdDeep6;
    }

    /**
     * 
     * @return circle_id_deep_7 
     */
    public Integer getCircleIdDeep7() {
        return circleIdDeep7;
    }

    /**
     * 
     * @param circleIdDeep7 
     */
    public void setCircleIdDeep7(Integer circleIdDeep7) {
        this.circleIdDeep7 = circleIdDeep7;
    }

    /**
     * 买家部门名称，拼接方式circle1,circle2,circle3...
     * @return circle_name 买家部门名称，拼接方式circle1,circle2,circle3...
     */
    public String getCircleName() {
        return circleName;
    }

    /**
     * 买家部门名称，拼接方式circle1,circle2,circle3...
     * @param circleName 买家部门名称，拼接方式circle1,circle2,circle3...
     */
    public void setCircleName(String circleName) {
        this.circleName = circleName == null ? null : circleName.trim();
    }

    /**
     * 联盟渠道标识
     * @return channel 联盟渠道标识
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 联盟渠道标识
     * @param channel 联盟渠道标识
     */
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    /**
     * 订单类型 biz_have_goods：购买集采已有产品  biz_intention_goods：集采意向产品
     * @return order_type 订单类型 biz_have_goods：购买集采已有产品  biz_intention_goods：集采意向产品
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * 订单类型 biz_have_goods：购买集采已有产品  biz_intention_goods：集采意向产品
     * @param orderType 订单类型 biz_have_goods：购买集采已有产品  biz_intention_goods：集采意向产品
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    /**
     * 支付状态 10：未支付  20：买家确认支付  30：卖家确认支付
     * @return pay_state 支付状态 10：未支付  20：买家确认支付  30：卖家确认支付
     */
    public String getPayState() {
        return payState;
    }

    /**
     * 支付状态 10：未支付  20：买家确认支付  30：卖家确认支付
     * @param payState 支付状态 10：未支付  20：买家确认支付  30：卖家确认支付
     */
    public void setPayState(String payState) {
        this.payState = payState == null ? null : payState.trim();
    }

    /**
     * 订单完成时间 格式yyyyMMdd
     * @return c_time 订单完成时间 格式yyyyMMdd
     */
    public Integer getcTime() {
        return cTime;
    }

    /**
     * 订单完成时间 格式yyyyMMdd
     * @param cTime 订单完成时间 格式yyyyMMdd
     */
    public void setcTime(Integer cTime) {
        this.cTime = cTime;
    }

    /**
     * 帮扶金额
     * @return help_price 帮扶金额
     */
    public BigDecimal getHelpPrice() {
        return helpPrice;
    }

    /**
     * 帮扶金额
     * @param helpPrice 帮扶金额
     */
    public void setHelpPrice(BigDecimal helpPrice) {
        this.helpPrice = helpPrice;
    }
}