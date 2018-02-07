package com.shanyuan.platform.ms.dao.project.entity;

import java.math.BigDecimal;

/**
 * 描述:sy_project_money_order表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-11-01
 */
public class SyProjectMoneyOrder {
    /**
     * 订单索引id
     */
    private Integer orderId;

    /**
     * 订单编号
     */
    private Long orderSn;

    /**
     * 支付单号
     */
    private Long paySn;

    /**
     * 捐赠者会员id
     */
    private Integer buyerId;

    /**
     * 捐赠者姓名
     */
    private String buyerName;

    /**
     * 订单生成时间
     */
    private Integer addTime;

    /**
     * 支付方式名称代码
     */
    private String paymentCode;

    /**
     * 支付(付款)时间
     */
    private Integer paymentTime;

    /**
     * 订单完成时间
     */
    private Integer finnshedTime;

    /**
     * 订单总价格单位分
     */
    private BigDecimal orderAmount;

    /**
     * 项目id
     */
    private Integer publicProjectId;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 项目主图
     */
    private String projectImage;

    /**
     * 主办方
     */
    private String projectSponsor;

    /**
     * 项目类型
     */
    private Integer goodsProjectType;

    /**
     * 订单状态：0(已取消);1(默认):已创建;10:过期失败;12:支付中;15:已付款;20:未确认/待同意; 25:已审核/待发货;28:待资助者付款;30:已发货;40:已完成;50:退款;60:已删除;70:协商成功;80:协商失败
     */
    private String orderState;

    /**
     * 退款记录ID
     */
    private Integer refundId;

    /**
     * 退款状态:0是无退款,1是部分退款,2是全部退款,10退款中,20商家拒绝,30商家同意,40退款成功,50付款成功未发货 已退款,60申请仲裁
     */
    private Byte refundState;

    /**
     * 平台标识
     */
    private String channel;

    /**
     * 支付宝交易流水号
     */
    private String tradeNo;

    /**
     * 退款金额
     */
    private BigDecimal refundAmount;

    /**
     * 申请退款时间,默认为0
     */
    private Integer refundTime;

    /**
     * 0表示不是 1表示是匿名评价
     */
    private Byte isanonymous;

    /**
     * 发布者id
     */
    private Integer publisherId;

    /**
     * 订单索引id
     * @return order_id 订单索引id
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 订单索引id
     * @param orderId 订单索引id
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 订单编号
     * @return order_sn 订单编号
     */
    public Long getOrderSn() {
        return orderSn;
    }

    /**
     * 订单编号
     * @param orderSn 订单编号
     */
    public void setOrderSn(Long orderSn) {
        this.orderSn = orderSn;
    }

    /**
     * 支付单号
     * @return pay_sn 支付单号
     */
    public Long getPaySn() {
        return paySn;
    }

    /**
     * 支付单号
     * @param paySn 支付单号
     */
    public void setPaySn(Long paySn) {
        this.paySn = paySn;
    }

    /**
     * 捐赠者会员id
     * @return buyer_id 捐赠者会员id
     */
    public Integer getBuyerId() {
        return buyerId;
    }

    /**
     * 捐赠者会员id
     * @param buyerId 捐赠者会员id
     */
    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * 捐赠者姓名
     * @return buyer_name 捐赠者姓名
     */
    public String getBuyerName() {
        return buyerName;
    }

    /**
     * 捐赠者姓名
     * @param buyerName 捐赠者姓名
     */
    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName == null ? null : buyerName.trim();
    }

    /**
     * 订单生成时间
     * @return add_time 订单生成时间
     */
    public Integer getAddTime() {
        return addTime;
    }

    /**
     * 订单生成时间
     * @param addTime 订单生成时间
     */
    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    /**
     * 支付方式名称代码
     * @return payment_code 支付方式名称代码
     */
    public String getPaymentCode() {
        return paymentCode;
    }

    /**
     * 支付方式名称代码
     * @param paymentCode 支付方式名称代码
     */
    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode == null ? null : paymentCode.trim();
    }

    /**
     * 支付(付款)时间
     * @return payment_time 支付(付款)时间
     */
    public Integer getPaymentTime() {
        return paymentTime;
    }

    /**
     * 支付(付款)时间
     * @param paymentTime 支付(付款)时间
     */
    public void setPaymentTime(Integer paymentTime) {
        this.paymentTime = paymentTime;
    }

    /**
     * 订单完成时间
     * @return finnshed_time 订单完成时间
     */
    public Integer getFinnshedTime() {
        return finnshedTime;
    }

    /**
     * 订单完成时间
     * @param finnshedTime 订单完成时间
     */
    public void setFinnshedTime(Integer finnshedTime) {
        this.finnshedTime = finnshedTime;
    }

    /**
     * 订单总价格单位分
     * @return order_amount 订单总价格单位分
     */
    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    /**
     * 订单总价格单位分
     * @param orderAmount 订单总价格单位分
     */
    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * 项目id
     * @return public_project_id 项目id
     */
    public Integer getPublicProjectId() {
        return publicProjectId;
    }

    /**
     * 项目id
     * @param publicProjectId 项目id
     */
    public void setPublicProjectId(Integer publicProjectId) {
        this.publicProjectId = publicProjectId;
    }

    /**
     * 项目名称
     * @return project_name 项目名称
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 项目名称
     * @param projectName 项目名称
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    /**
     * 项目主图
     * @return project_image 项目主图
     */
    public String getProjectImage() {
        return projectImage;
    }

    /**
     * 项目主图
     * @param projectImage 项目主图
     */
    public void setProjectImage(String projectImage) {
        this.projectImage = projectImage == null ? null : projectImage.trim();
    }

    /**
     * 主办方
     * @return project_sponsor 主办方
     */
    public String getProjectSponsor() {
        return projectSponsor;
    }

    /**
     * 主办方
     * @param projectSponsor 主办方
     */
    public void setProjectSponsor(String projectSponsor) {
        this.projectSponsor = projectSponsor == null ? null : projectSponsor.trim();
    }

    /**
     * 项目类型
     * @return goods_project_type 项目类型
     */
    public Integer getGoodsProjectType() {
        return goodsProjectType;
    }

    /**
     * 项目类型
     * @param goodsProjectType 项目类型
     */
    public void setGoodsProjectType(Integer goodsProjectType) {
        this.goodsProjectType = goodsProjectType;
    }

    /**
     * 订单状态：0(已取消);1(默认):已创建;10:过期失败;12:支付中;15:已付款;20:未确认/待同意; 25:已审核/待发货;28:待资助者付款;30:已发货;40:已完成;50:退款;60:已删除;70:协商成功;80:协商失败
     * @return order_state 订单状态：0(已取消);1(默认):已创建;10:过期失败;12:支付中;15:已付款;20:未确认/待同意; 25:已审核/待发货;28:待资助者付款;30:已发货;40:已完成;50:退款;60:已删除;70:协商成功;80:协商失败
     */
    public String getOrderState() {
        return orderState;
    }

    /**
     * 订单状态：0(已取消);1(默认):已创建;10:过期失败;12:支付中;15:已付款;20:未确认/待同意; 25:已审核/待发货;28:待资助者付款;30:已发货;40:已完成;50:退款;60:已删除;70:协商成功;80:协商失败
     * @param orderState 订单状态：0(已取消);1(默认):已创建;10:过期失败;12:支付中;15:已付款;20:未确认/待同意; 25:已审核/待发货;28:待资助者付款;30:已发货;40:已完成;50:退款;60:已删除;70:协商成功;80:协商失败
     */
    public void setOrderState(String orderState) {
        this.orderState = orderState == null ? null : orderState.trim();
    }

    /**
     * 退款记录ID
     * @return refund_id 退款记录ID
     */
    public Integer getRefundId() {
        return refundId;
    }

    /**
     * 退款记录ID
     * @param refundId 退款记录ID
     */
    public void setRefundId(Integer refundId) {
        this.refundId = refundId;
    }

    /**
     * 退款状态:0是无退款,1是部分退款,2是全部退款,10退款中,20商家拒绝,30商家同意,40退款成功,50付款成功未发货 已退款,60申请仲裁
     * @return refund_state 退款状态:0是无退款,1是部分退款,2是全部退款,10退款中,20商家拒绝,30商家同意,40退款成功,50付款成功未发货 已退款,60申请仲裁
     */
    public Byte getRefundState() {
        return refundState;
    }

    /**
     * 退款状态:0是无退款,1是部分退款,2是全部退款,10退款中,20商家拒绝,30商家同意,40退款成功,50付款成功未发货 已退款,60申请仲裁
     * @param refundState 退款状态:0是无退款,1是部分退款,2是全部退款,10退款中,20商家拒绝,30商家同意,40退款成功,50付款成功未发货 已退款,60申请仲裁
     */
    public void setRefundState(Byte refundState) {
        this.refundState = refundState;
    }

    /**
     * 平台标识
     * @return channel 平台标识
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 平台标识
     * @param channel 平台标识
     */
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    /**
     * 支付宝交易流水号
     * @return trade_no 支付宝交易流水号
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * 支付宝交易流水号
     * @param tradeNo 支付宝交易流水号
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    /**
     * 退款金额
     * @return refund_amount 退款金额
     */
    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    /**
     * 退款金额
     * @param refundAmount 退款金额
     */
    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    /**
     * 申请退款时间,默认为0
     * @return refund_time 申请退款时间,默认为0
     */
    public Integer getRefundTime() {
        return refundTime;
    }

    /**
     * 申请退款时间,默认为0
     * @param refundTime 申请退款时间,默认为0
     */
    public void setRefundTime(Integer refundTime) {
        this.refundTime = refundTime;
    }

    /**
     * 0表示不是 1表示是匿名评价
     * @return isanonymous 0表示不是 1表示是匿名评价
     */
    public Byte getIsanonymous() {
        return isanonymous;
    }

    /**
     * 0表示不是 1表示是匿名评价
     * @param isanonymous 0表示不是 1表示是匿名评价
     */
    public void setIsanonymous(Byte isanonymous) {
        this.isanonymous = isanonymous;
    }

    /**
     * 发布者id
     * @return publisher_id 发布者id
     */
    public Integer getPublisherId() {
        return publisherId;
    }

    /**
     * 发布者id
     * @param publisherId 发布者id
     */
    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }
}