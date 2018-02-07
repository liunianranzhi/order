package com.shanyuan.platform.ms.dao.biz.entity;

import java.math.BigDecimal;

/**
 * 描述:sy_biz_main_order表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2018-01-04
 */
public class SyBizMainOrder {
    /**
     * 订单索引id
     */
    private Integer mainOrderId;

    /**
     * 订单编号
     */
    private Long orderSn;

    /**
     * 购物劵生成批次号
     */
    private Long couponBatchSn;

    /**
     * 买家id
     */
    private Integer buyerId;

    /**
     * 买家姓名
     */
    private String buyerName;

    /**
     * 订单生成时间
     */
    private Integer addTime;

    /**
     * 支付(付款)时间
     */
    private Integer paymentTime;

    /**
     * 发货时间,默认为0
     */
    private Integer shipTime;

    /**
     * 订单完成时间
     */
    private Integer finnshedTime;

    /**
     * 订单总价格单位分
     */
    private BigDecimal orderAmount;

    /**
     * 购物劵每张金额单位分
     */
    private BigDecimal couponValue;

    /**
     * 购物劵张数
     */
    private Integer couponNum;

    /**
     * 发卡人姓名
     */
    private String couponCreator;

    /**
     * 发票信息
     */
    private String invInfo;

    /**
     * 圈子id
     */
    private Integer circleId;

    /**
     * 如果没有可选部门,用户可申请一个部门
     */
    private String applyCircleName;

    /**
     * 是否需要纸质合同:是,否
     */
    private String paperContract;

    /**
     * 支付角色:个人,支付角色:企业
     */
    private String paymentRole;

    /**
     * 转账模式:立即转账支付,收到发票后转账支付,货物和发票收到后转账支付
     */
    private String paymentModel;

    /**
     * 订单类型biz_have_goods:购买集采已有产品,biz_intention_goods:集采意向产品,coupon:购买扶贫卡
     */
    private String orderType;

    /**
     * 1显示,2隐藏
     */
    private String orderState;

    /**
     * 发票状态：10:未开发票;20:已开发票;30:发票已收
     */
    private String invState;

    /**
     * 支付状态：10:未支付;20:买家确认支付;30:卖家确认支付
     */
    private String payState;

    /**
     * 发货状态：10:待同意发货;20:待发货;30:已发货40:已全部发货:50已收货
     */
    private String goodsState;

    /**
     * 是否已加积分
     */
    private String pointsState;

    /**
     * 备注
     */
    private String mark;

    /**
     * 扶贫码启用时间
     */
    private Integer startTime;

    /**
     * 扶贫码过期时间
     */
    private Integer expiredTime;

    /**
     * 是否取消订单
     */
    private String cancleState;

    /**
     * 同意发货时间,默认为0
     */
    private Integer agreeShipTime;

    /**
     * 已全部发货时间,默认为0
     */
    private Integer allShipedTime;

    /**
     * 已收货时间,默认为0
     */
    private Integer receiveTime;

    /**
     * 订单索引id
     * @return main_order_id 订单索引id
     */
    public Integer getMainOrderId() {
        return mainOrderId;
    }

    /**
     * 订单索引id
     * @param mainOrderId 订单索引id
     */
    public void setMainOrderId(Integer mainOrderId) {
        this.mainOrderId = mainOrderId;
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
     * 购物劵生成批次号
     * @return coupon_batch_sn 购物劵生成批次号
     */
    public Long getCouponBatchSn() {
        return couponBatchSn;
    }

    /**
     * 购物劵生成批次号
     * @param couponBatchSn 购物劵生成批次号
     */
    public void setCouponBatchSn(Long couponBatchSn) {
        this.couponBatchSn = couponBatchSn;
    }

    /**
     * 买家id
     * @return buyer_id 买家id
     */
    public Integer getBuyerId() {
        return buyerId;
    }

    /**
     * 买家id
     * @param buyerId 买家id
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
     * 发货时间,默认为0
     * @return ship_time 发货时间,默认为0
     */
    public Integer getShipTime() {
        return shipTime;
    }

    /**
     * 发货时间,默认为0
     * @param shipTime 发货时间,默认为0
     */
    public void setShipTime(Integer shipTime) {
        this.shipTime = shipTime;
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
     * 购物劵每张金额单位分
     * @return coupon_value 购物劵每张金额单位分
     */
    public BigDecimal getCouponValue() {
        return couponValue;
    }

    /**
     * 购物劵每张金额单位分
     * @param couponValue 购物劵每张金额单位分
     */
    public void setCouponValue(BigDecimal couponValue) {
        this.couponValue = couponValue;
    }

    /**
     * 购物劵张数
     * @return coupon_num 购物劵张数
     */
    public Integer getCouponNum() {
        return couponNum;
    }

    /**
     * 购物劵张数
     * @param couponNum 购物劵张数
     */
    public void setCouponNum(Integer couponNum) {
        this.couponNum = couponNum;
    }

    /**
     * 发卡人姓名
     * @return coupon_creator 发卡人姓名
     */
    public String getCouponCreator() {
        return couponCreator;
    }

    /**
     * 发卡人姓名
     * @param couponCreator 发卡人姓名
     */
    public void setCouponCreator(String couponCreator) {
        this.couponCreator = couponCreator == null ? null : couponCreator.trim();
    }

    /**
     * 发票信息
     * @return inv_info 发票信息
     */
    public String getInvInfo() {
        return invInfo;
    }

    /**
     * 发票信息
     * @param invInfo 发票信息
     */
    public void setInvInfo(String invInfo) {
        this.invInfo = invInfo == null ? null : invInfo.trim();
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
     * 如果没有可选部门,用户可申请一个部门
     * @return apply_circle_name 如果没有可选部门,用户可申请一个部门
     */
    public String getApplyCircleName() {
        return applyCircleName;
    }

    /**
     * 如果没有可选部门,用户可申请一个部门
     * @param applyCircleName 如果没有可选部门,用户可申请一个部门
     */
    public void setApplyCircleName(String applyCircleName) {
        this.applyCircleName = applyCircleName == null ? null : applyCircleName.trim();
    }

    /**
     * 是否需要纸质合同:是,否
     * @return paper_contract 是否需要纸质合同:是,否
     */
    public String getPaperContract() {
        return paperContract;
    }

    /**
     * 是否需要纸质合同:是,否
     * @param paperContract 是否需要纸质合同:是,否
     */
    public void setPaperContract(String paperContract) {
        this.paperContract = paperContract == null ? null : paperContract.trim();
    }

    /**
     * 支付角色:个人,支付角色:企业
     * @return payment_role 支付角色:个人,支付角色:企业
     */
    public String getPaymentRole() {
        return paymentRole;
    }

    /**
     * 支付角色:个人,支付角色:企业
     * @param paymentRole 支付角色:个人,支付角色:企业
     */
    public void setPaymentRole(String paymentRole) {
        this.paymentRole = paymentRole == null ? null : paymentRole.trim();
    }

    /**
     * 转账模式:立即转账支付,收到发票后转账支付,货物和发票收到后转账支付
     * @return payment_model 转账模式:立即转账支付,收到发票后转账支付,货物和发票收到后转账支付
     */
    public String getPaymentModel() {
        return paymentModel;
    }

    /**
     * 转账模式:立即转账支付,收到发票后转账支付,货物和发票收到后转账支付
     * @param paymentModel 转账模式:立即转账支付,收到发票后转账支付,货物和发票收到后转账支付
     */
    public void setPaymentModel(String paymentModel) {
        this.paymentModel = paymentModel == null ? null : paymentModel.trim();
    }

    /**
     * 订单类型biz_have_goods:购买集采已有产品,biz_intention_goods:集采意向产品,coupon:购买扶贫卡
     * @return order_type 订单类型biz_have_goods:购买集采已有产品,biz_intention_goods:集采意向产品,coupon:购买扶贫卡
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * 订单类型biz_have_goods:购买集采已有产品,biz_intention_goods:集采意向产品,coupon:购买扶贫卡
     * @param orderType 订单类型biz_have_goods:购买集采已有产品,biz_intention_goods:集采意向产品,coupon:购买扶贫卡
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    /**
     * 1显示,2隐藏
     * @return order_state 1显示,2隐藏
     */
    public String getOrderState() {
        return orderState;
    }

    /**
     * 1显示,2隐藏
     * @param orderState 1显示,2隐藏
     */
    public void setOrderState(String orderState) {
        this.orderState = orderState == null ? null : orderState.trim();
    }

    /**
     * 发票状态：10:未开发票;20:已开发票;30:发票已收
     * @return inv_state 发票状态：10:未开发票;20:已开发票;30:发票已收
     */
    public String getInvState() {
        return invState;
    }

    /**
     * 发票状态：10:未开发票;20:已开发票;30:发票已收
     * @param invState 发票状态：10:未开发票;20:已开发票;30:发票已收
     */
    public void setInvState(String invState) {
        this.invState = invState == null ? null : invState.trim();
    }

    /**
     * 支付状态：10:未支付;20:买家确认支付;30:卖家确认支付
     * @return pay_state 支付状态：10:未支付;20:买家确认支付;30:卖家确认支付
     */
    public String getPayState() {
        return payState;
    }

    /**
     * 支付状态：10:未支付;20:买家确认支付;30:卖家确认支付
     * @param payState 支付状态：10:未支付;20:买家确认支付;30:卖家确认支付
     */
    public void setPayState(String payState) {
        this.payState = payState == null ? null : payState.trim();
    }

    /**
     * 发货状态：10:待同意发货;20:待发货;30:已发货40:已全部发货:50已收货
     * @return goods_state 发货状态：10:待同意发货;20:待发货;30:已发货40:已全部发货:50已收货
     */
    public String getGoodsState() {
        return goodsState;
    }

    /**
     * 发货状态：10:待同意发货;20:待发货;30:已发货40:已全部发货:50已收货
     * @param goodsState 发货状态：10:待同意发货;20:待发货;30:已发货40:已全部发货:50已收货
     */
    public void setGoodsState(String goodsState) {
        this.goodsState = goodsState == null ? null : goodsState.trim();
    }

    /**
     * 是否已加积分
     * @return points_state 是否已加积分
     */
    public String getPointsState() {
        return pointsState;
    }

    /**
     * 是否已加积分
     * @param pointsState 是否已加积分
     */
    public void setPointsState(String pointsState) {
        this.pointsState = pointsState == null ? null : pointsState.trim();
    }

    /**
     * 备注
     * @return mark 备注
     */
    public String getMark() {
        return mark;
    }

    /**
     * 备注
     * @param mark 备注
     */
    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    /**
     * 扶贫码启用时间
     * @return start_time 扶贫码启用时间
     */
    public Integer getStartTime() {
        return startTime;
    }

    /**
     * 扶贫码启用时间
     * @param startTime 扶贫码启用时间
     */
    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    /**
     * 扶贫码过期时间
     * @return expired_time 扶贫码过期时间
     */
    public Integer getExpiredTime() {
        return expiredTime;
    }

    /**
     * 扶贫码过期时间
     * @param expiredTime 扶贫码过期时间
     */
    public void setExpiredTime(Integer expiredTime) {
        this.expiredTime = expiredTime;
    }

    /**
     * 是否取消订单
     * @return cancle_state 是否取消订单
     */
    public String getCancleState() {
        return cancleState;
    }

    /**
     * 是否取消订单
     * @param cancleState 是否取消订单
     */
    public void setCancleState(String cancleState) {
        this.cancleState = cancleState == null ? null : cancleState.trim();
    }

    /**
     * 同意发货时间,默认为0
     * @return agree_ship_time 同意发货时间,默认为0
     */
    public Integer getAgreeShipTime() {
        return agreeShipTime;
    }

    /**
     * 同意发货时间,默认为0
     * @param agreeShipTime 同意发货时间,默认为0
     */
    public void setAgreeShipTime(Integer agreeShipTime) {
        this.agreeShipTime = agreeShipTime;
    }

    /**
     * 已全部发货时间,默认为0
     * @return all_shiped_time 已全部发货时间,默认为0
     */
    public Integer getAllShipedTime() {
        return allShipedTime;
    }

    /**
     * 已全部发货时间,默认为0
     * @param allShipedTime 已全部发货时间,默认为0
     */
    public void setAllShipedTime(Integer allShipedTime) {
        this.allShipedTime = allShipedTime;
    }

    /**
     * 已收货时间,默认为0
     * @return receive_time 已收货时间,默认为0
     */
    public Integer getReceiveTime() {
        return receiveTime;
    }

    /**
     * 已收货时间,默认为0
     * @param receiveTime 已收货时间,默认为0
     */
    public void setReceiveTime(Integer receiveTime) {
        this.receiveTime = receiveTime;
    }
}