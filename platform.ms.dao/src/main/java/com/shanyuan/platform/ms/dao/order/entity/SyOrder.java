package com.shanyuan.platform.ms.dao.order.entity;

import java.math.BigDecimal;

/**
 * 描述:sy_order表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-10-18
 */
public class SyOrder {
    /**
     * 订单索引id
     */
    private Integer orderId;

    /**
     * 订单编号
     */
    private Long orderSn;
    
    

	private Integer orderNum;
	
    /**
     * 支付单号
     */
    private Long paySn;

    /**
     * 卖家店铺id
     */
    private Integer storeId;

    /**
     * 卖家店铺名称
     */
    private String storeName;

    /**
     * 买家id
     */
    private Integer buyerId;

    /**
     * 买家姓名
     */
    private String buyerName;

    /**
     * 买家电子邮箱
     */
    private String buyerEmail;

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
     * 商品总价格
     */
    private BigDecimal goodsAmount;

    /**
     * 订单总价格
     */
    private BigDecimal orderAmount;

    /**
     * 预存款支付金额
     */
    private BigDecimal pdAmount;

    /**
     * 运费
     */
    private BigDecimal shippingFee;

    /**
     * 评价状态 0未评价，1已评价
     */
    private String evaluationState;

    /**
     * 订单状态：0(已取消);1(默认):已创建;10:过期失败;12:支付中;15:已付款;20:未确认/待同意; 25:已审核/待发货;28:待资助者付款;30:已发货;40:已完成;50:退款;60:已删除;70:协商成功;80:协商失败
     */
    private String orderState;

    /**
     * 退款状态:0是无退款,1是部分退款,2是全部退款,10退款中,20商家拒绝,30退款成功
     */
    private Byte refundState;

    /**
     * 锁定状态:0是正常,大于0是锁定,默认是0
     */
    private Byte lockState;

    /**
     * 退款金额
     */
    private BigDecimal refundAmount;

    /**
     * 延迟时间,默认为0
     */
    private Integer delayTime;

    /**
     * 1WEB2mobile
     */
    private String orderFrom;

    /**
     * 物流单号
     */
    private String shippingCode;

    /**
     * 项目类型(1基金会捐物/2基金会捐款/3基金会活动/4个人实物/5个人时间/6个人技能/7个人空间)
     */
    private Integer goodsProjectType;

    /**
     * 时间能力资源申请开始时间
     */
    private Integer orderServiceStartime;

    /**
     * 时间能力资源申请结束时间
     */
    private Integer orderServiceEndtime;

    /**
     * 时间能力资源申请时间信息
     */
    private String orderServiceInfo;

    /**
     * 众筹模式：是否需要回报：1是/0否
     */
    private Byte reward;

    /**
     * 资助者id
     */
    private Integer applyerId;

    /**
     * 总汇率，实际比例为该值除以1000
     */
    private Short serviceFeeRate;

    /**
     * 平台管理费
     */
    private BigDecimal serviceFee;

    /**
     * 代理人代理费
     */
    private BigDecimal agentFee;

    /**
     * 发货人id
     */
    private Integer senderId;

    /**
     * 发货时间,默认为0
     */
    private Integer shipTime;

    /**
     * 申请退款时间,默认为0
     */
    private Integer refundTime;

    /**
     * 支付宝交易流水号
     */
    private String tradeNo;

    /**
     * 卖家记录已经查看过的订单状态
     */
    private Byte storeLookedOrderState;

    /**
     * 卖家记录已经查看过的退款状态
     */
    private Byte storeLookedRefundState;

    /**
     * 买家记录已经查看过的订单状态
     */
    private Byte buyerLookedOrderState;

    /**
     * 买家记录已经查看过的退款状态
     */
    private Byte buyerLookedRefundState;

    /**
     * 发布者id
     */
    private Integer publisherId;

    /**
     * 该订单获取到的公益币
     */
    private Long syPoints;

    /**
     * 渠道标识
     */
    private String channel;

    /**
     * 扩展类型:如活动下的讲座类型
     */
    private String extendType;

    /**
     * 基金会费用的比例，实际比例为该值除以1000
     */
    private Short fundFeeRate;

    /**
     * 基金会收取的费用
     */
    private BigDecimal fundFee;

    /**
     * 仲裁时间,默认为0
     */
    private Integer lastConsultTime;

    /**
     * 卖家提醒买家收货时间,默认为0
     */
    private Integer remindBuyerTime;

    /**
     * 仲裁状态:1是仲裁通过,2是仲裁失败,默认是0
     */
    private Byte lastConsultState;

    /**
     * 退款记录ID
     */
    private Integer refundId;

    /**
     * 购物劵支付金额单位分
     */
    private BigDecimal couponPay;

    /**
     * 实际支付金额单位分
     */
    private BigDecimal moneyPay;

    /**
     * 助理人id
     */
    private Integer assistId;

    /**
     * 版本号用来区分是哪个版本的订单
     */
    private Byte ver;

    /**
     * 配额分配状态 0为未分配  1为已分配  默认为0
     */
    private Byte balanceState;

    /**
     * 买家提醒卖家发货时间,默认为0
     */
    private Integer remindSellerTime;

    /**
     * 订单发货报警等级
     */
    private Byte warnLevel;

    /**
     * 订单发货报警交流状态
     */
    private Byte communicationStatus;

    /**
     * 延迟发货的状态0正常1延迟 默认为0
     */
    private String delayedDeliveryState;

    /**
     * 买家延迟收货的时长,默认为0
     */
    private Integer delayedReceiveDuration;

    /**
     * app渠道标识,默认空
     */
    private String appVariant;

    /**
     * pt普通订单,qkys全款预售订单
     */
    private String tradeMode;

    /**
     * 预售时间
     */
    private Integer presellTime;

    /**
     * 定点扶贫县的id
     */
    private Long supportCountyId;

    /**
     * 买家标识
     */
    private String buyerChannel;

    /**
     * 满减总金额单位分
     */
    private BigDecimal discountAmount;

    /**
     * 删除状态:0是正常,1是删除,默认是0
     */
    private Byte deleted;

    /**
     * 集采运营中心id
     */
    private Integer bizOperationMid;

    /**
     * 满减总金额单位分(平台承担)
     */
    private BigDecimal platformPay;

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
     * 卖家店铺id
     * @return store_id 卖家店铺id
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * 卖家店铺id
     * @param storeId 卖家店铺id
     */
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    /**
     * 卖家店铺名称
     * @return store_name 卖家店铺名称
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * 卖家店铺名称
     * @param storeName 卖家店铺名称
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
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
     * 买家电子邮箱
     * @return buyer_email 买家电子邮箱
     */
    public String getBuyerEmail() {
        return buyerEmail;
    }

    /**
     * 买家电子邮箱
     * @param buyerEmail 买家电子邮箱
     */
    public void setBuyerEmail(String buyerEmail) {
        this.buyerEmail = buyerEmail == null ? null : buyerEmail.trim();
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
     * 商品总价格
     * @return goods_amount 商品总价格
     */
    public BigDecimal getGoodsAmount() {
        return goodsAmount;
    }

    /**
     * 商品总价格
     * @param goodsAmount 商品总价格
     */
    public void setGoodsAmount(BigDecimal goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    /**
     * 订单总价格
     * @return order_amount 订单总价格
     */
    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    /**
     * 订单总价格
     * @param orderAmount 订单总价格
     */
    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * 预存款支付金额
     * @return pd_amount 预存款支付金额
     */
    public BigDecimal getPdAmount() {
        return pdAmount;
    }

    /**
     * 预存款支付金额
     * @param pdAmount 预存款支付金额
     */
    public void setPdAmount(BigDecimal pdAmount) {
        this.pdAmount = pdAmount;
    }

    /**
     * 运费
     * @return shipping_fee 运费
     */
    public BigDecimal getShippingFee() {
        return shippingFee;
    }

    /**
     * 运费
     * @param shippingFee 运费
     */
    public void setShippingFee(BigDecimal shippingFee) {
        this.shippingFee = shippingFee;
    }

    /**
     * 评价状态 0未评价，1已评价
     * @return evaluation_state 评价状态 0未评价，1已评价
     */
    public String getEvaluationState() {
        return evaluationState;
    }

    /**
     * 评价状态 0未评价，1已评价
     * @param evaluationState 评价状态 0未评价，1已评价
     */
    public void setEvaluationState(String evaluationState) {
        this.evaluationState = evaluationState == null ? null : evaluationState.trim();
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
     * 退款状态:0是无退款,1是部分退款,2是全部退款,10退款中,20商家拒绝,30退款成功
     * @return refund_state 退款状态:0是无退款,1是部分退款,2是全部退款,10退款中,20商家拒绝,30退款成功
     */
    public Byte getRefundState() {
        return refundState;
    }

    /**
     * 退款状态:0是无退款,1是部分退款,2是全部退款,10退款中,20商家拒绝,30退款成功
     * @param refundState 退款状态:0是无退款,1是部分退款,2是全部退款,10退款中,20商家拒绝,30退款成功
     */
    public void setRefundState(Byte refundState) {
        this.refundState = refundState;
    }

    /**
     * 锁定状态:0是正常,大于0是锁定,默认是0
     * @return lock_state 锁定状态:0是正常,大于0是锁定,默认是0
     */
    public Byte getLockState() {
        return lockState;
    }

    /**
     * 锁定状态:0是正常,大于0是锁定,默认是0
     * @param lockState 锁定状态:0是正常,大于0是锁定,默认是0
     */
    public void setLockState(Byte lockState) {
        this.lockState = lockState;
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
     * 延迟时间,默认为0
     * @return delay_time 延迟时间,默认为0
     */
    public Integer getDelayTime() {
        return delayTime;
    }

    /**
     * 延迟时间,默认为0
     * @param delayTime 延迟时间,默认为0
     */
    public void setDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
    }

    /**
     * 1WEB2mobile
     * @return order_from 1WEB2mobile
     */
    public String getOrderFrom() {
        return orderFrom;
    }

    /**
     * 1WEB2mobile
     * @param orderFrom 1WEB2mobile
     */
    public void setOrderFrom(String orderFrom) {
        this.orderFrom = orderFrom == null ? null : orderFrom.trim();
    }

    /**
     * 物流单号
     * @return shipping_code 物流单号
     */
    public String getShippingCode() {
        return shippingCode;
    }

    /**
     * 物流单号
     * @param shippingCode 物流单号
     */
    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode == null ? null : shippingCode.trim();
    }

    /**
     * 项目类型(1基金会捐物/2基金会捐款/3基金会活动/4个人实物/5个人时间/6个人技能/7个人空间)
     * @return goods_project_type 项目类型(1基金会捐物/2基金会捐款/3基金会活动/4个人实物/5个人时间/6个人技能/7个人空间)
     */
    public Integer getGoodsProjectType() {
        return goodsProjectType;
    }

    /**
     * 项目类型(1基金会捐物/2基金会捐款/3基金会活动/4个人实物/5个人时间/6个人技能/7个人空间)
     * @param goodsProjectType 项目类型(1基金会捐物/2基金会捐款/3基金会活动/4个人实物/5个人时间/6个人技能/7个人空间)
     */
    public void setGoodsProjectType(Integer goodsProjectType) {
        this.goodsProjectType = goodsProjectType;
    }

    /**
     * 时间能力资源申请开始时间
     * @return order_service_startime 时间能力资源申请开始时间
     */
    public Integer getOrderServiceStartime() {
        return orderServiceStartime;
    }

    /**
     * 时间能力资源申请开始时间
     * @param orderServiceStartime 时间能力资源申请开始时间
     */
    public void setOrderServiceStartime(Integer orderServiceStartime) {
        this.orderServiceStartime = orderServiceStartime;
    }

    /**
     * 时间能力资源申请结束时间
     * @return order_service_endtime 时间能力资源申请结束时间
     */
    public Integer getOrderServiceEndtime() {
        return orderServiceEndtime;
    }

    /**
     * 时间能力资源申请结束时间
     * @param orderServiceEndtime 时间能力资源申请结束时间
     */
    public void setOrderServiceEndtime(Integer orderServiceEndtime) {
        this.orderServiceEndtime = orderServiceEndtime;
    }

    /**
     * 时间能力资源申请时间信息
     * @return order_service_info 时间能力资源申请时间信息
     */
    public String getOrderServiceInfo() {
        return orderServiceInfo;
    }

    /**
     * 时间能力资源申请时间信息
     * @param orderServiceInfo 时间能力资源申请时间信息
     */
    public void setOrderServiceInfo(String orderServiceInfo) {
        this.orderServiceInfo = orderServiceInfo == null ? null : orderServiceInfo.trim();
    }

    /**
     * 众筹模式：是否需要回报：1是/0否
     * @return reward 众筹模式：是否需要回报：1是/0否
     */
    public Byte getReward() {
        return reward;
    }

    /**
     * 众筹模式：是否需要回报：1是/0否
     * @param reward 众筹模式：是否需要回报：1是/0否
     */
    public void setReward(Byte reward) {
        this.reward = reward;
    }

    /**
     * 资助者id
     * @return applyer_id 资助者id
     */
    public Integer getApplyerId() {
        return applyerId;
    }

    /**
     * 资助者id
     * @param applyerId 资助者id
     */
    public void setApplyerId(Integer applyerId) {
        this.applyerId = applyerId;
    }

    /**
     * 总汇率，实际比例为该值除以1000
     * @return service_fee_rate 总汇率，实际比例为该值除以1000
     */
    public Short getServiceFeeRate() {
        return serviceFeeRate;
    }

    /**
     * 总汇率，实际比例为该值除以1000
     * @param serviceFeeRate 总汇率，实际比例为该值除以1000
     */
    public void setServiceFeeRate(Short serviceFeeRate) {
        this.serviceFeeRate = serviceFeeRate;
    }

    /**
     * 平台管理费
     * @return service_fee 平台管理费
     */
    public BigDecimal getServiceFee() {
        return serviceFee;
    }

    /**
     * 平台管理费
     * @param serviceFee 平台管理费
     */
    public void setServiceFee(BigDecimal serviceFee) {
        this.serviceFee = serviceFee;
    }

    /**
     * 代理人代理费
     * @return agent_fee 代理人代理费
     */
    public BigDecimal getAgentFee() {
        return agentFee;
    }

    /**
     * 代理人代理费
     * @param agentFee 代理人代理费
     */
    public void setAgentFee(BigDecimal agentFee) {
        this.agentFee = agentFee;
    }

    /**
     * 发货人id
     * @return sender_id 发货人id
     */
    public Integer getSenderId() {
        return senderId;
    }

    /**
     * 发货人id
     * @param senderId 发货人id
     */
    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
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
     * 卖家记录已经查看过的订单状态
     * @return store_looked_order_state 卖家记录已经查看过的订单状态
     */
    public Byte getStoreLookedOrderState() {
        return storeLookedOrderState;
    }

    /**
     * 卖家记录已经查看过的订单状态
     * @param storeLookedOrderState 卖家记录已经查看过的订单状态
     */
    public void setStoreLookedOrderState(Byte storeLookedOrderState) {
        this.storeLookedOrderState = storeLookedOrderState;
    }

    /**
     * 卖家记录已经查看过的退款状态
     * @return store_looked_refund_state 卖家记录已经查看过的退款状态
     */
    public Byte getStoreLookedRefundState() {
        return storeLookedRefundState;
    }

    /**
     * 卖家记录已经查看过的退款状态
     * @param storeLookedRefundState 卖家记录已经查看过的退款状态
     */
    public void setStoreLookedRefundState(Byte storeLookedRefundState) {
        this.storeLookedRefundState = storeLookedRefundState;
    }

    /**
     * 买家记录已经查看过的订单状态
     * @return buyer_looked_order_state 买家记录已经查看过的订单状态
     */
    public Byte getBuyerLookedOrderState() {
        return buyerLookedOrderState;
    }

    /**
     * 买家记录已经查看过的订单状态
     * @param buyerLookedOrderState 买家记录已经查看过的订单状态
     */
    public void setBuyerLookedOrderState(Byte buyerLookedOrderState) {
        this.buyerLookedOrderState = buyerLookedOrderState;
    }

    /**
     * 买家记录已经查看过的退款状态
     * @return buyer_looked_refund_state 买家记录已经查看过的退款状态
     */
    public Byte getBuyerLookedRefundState() {
        return buyerLookedRefundState;
    }

    /**
     * 买家记录已经查看过的退款状态
     * @param buyerLookedRefundState 买家记录已经查看过的退款状态
     */
    public void setBuyerLookedRefundState(Byte buyerLookedRefundState) {
        this.buyerLookedRefundState = buyerLookedRefundState;
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

    /**
     * 该订单获取到的公益币
     * @return sy_points 该订单获取到的公益币
     */
    public Long getSyPoints() {
        return syPoints;
    }

    /**
     * 该订单获取到的公益币
     * @param syPoints 该订单获取到的公益币
     */
    public void setSyPoints(Long syPoints) {
        this.syPoints = syPoints;
    }

    /**
     * 渠道标识
     * @return channel 渠道标识
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 渠道标识
     * @param channel 渠道标识
     */
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    /**
     * 扩展类型:如活动下的讲座类型
     * @return extend_type 扩展类型:如活动下的讲座类型
     */
    public String getExtendType() {
        return extendType;
    }

    /**
     * 扩展类型:如活动下的讲座类型
     * @param extendType 扩展类型:如活动下的讲座类型
     */
    public void setExtendType(String extendType) {
        this.extendType = extendType == null ? null : extendType.trim();
    }

    /**
     * 基金会费用的比例，实际比例为该值除以1000
     * @return fund_fee_rate 基金会费用的比例，实际比例为该值除以1000
     */
    public Short getFundFeeRate() {
        return fundFeeRate;
    }

    /**
     * 基金会费用的比例，实际比例为该值除以1000
     * @param fundFeeRate 基金会费用的比例，实际比例为该值除以1000
     */
    public void setFundFeeRate(Short fundFeeRate) {
        this.fundFeeRate = fundFeeRate;
    }

    /**
     * 基金会收取的费用
     * @return fund_fee 基金会收取的费用
     */
    public BigDecimal getFundFee() {
        return fundFee;
    }

    /**
     * 基金会收取的费用
     * @param fundFee 基金会收取的费用
     */
    public void setFundFee(BigDecimal fundFee) {
        this.fundFee = fundFee;
    }

    /**
     * 仲裁时间,默认为0
     * @return last_consult_time 仲裁时间,默认为0
     */
    public Integer getLastConsultTime() {
        return lastConsultTime;
    }

    /**
     * 仲裁时间,默认为0
     * @param lastConsultTime 仲裁时间,默认为0
     */
    public void setLastConsultTime(Integer lastConsultTime) {
        this.lastConsultTime = lastConsultTime;
    }

    /**
     * 卖家提醒买家收货时间,默认为0
     * @return remind_buyer_time 卖家提醒买家收货时间,默认为0
     */
    public Integer getRemindBuyerTime() {
        return remindBuyerTime;
    }

    /**
     * 卖家提醒买家收货时间,默认为0
     * @param remindBuyerTime 卖家提醒买家收货时间,默认为0
     */
    public void setRemindBuyerTime(Integer remindBuyerTime) {
        this.remindBuyerTime = remindBuyerTime;
    }

    /**
     * 仲裁状态:1是仲裁通过,2是仲裁失败,默认是0
     * @return last_consult_state 仲裁状态:1是仲裁通过,2是仲裁失败,默认是0
     */
    public Byte getLastConsultState() {
        return lastConsultState;
    }

    /**
     * 仲裁状态:1是仲裁通过,2是仲裁失败,默认是0
     * @param lastConsultState 仲裁状态:1是仲裁通过,2是仲裁失败,默认是0
     */
    public void setLastConsultState(Byte lastConsultState) {
        this.lastConsultState = lastConsultState;
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
     * 购物劵支付金额单位分
     * @return coupon_pay 购物劵支付金额单位分
     */
    public BigDecimal getCouponPay() {
        return couponPay;
    }

    /**
     * 购物劵支付金额单位分
     * @param couponPay 购物劵支付金额单位分
     */
    public void setCouponPay(BigDecimal couponPay) {
        this.couponPay = couponPay;
    }

    /**
     * 实际支付金额单位分
     * @return money_pay 实际支付金额单位分
     */
    public BigDecimal getMoneyPay() {
        return moneyPay;
    }

    /**
     * 实际支付金额单位分
     * @param moneyPay 实际支付金额单位分
     */
    public void setMoneyPay(BigDecimal moneyPay) {
        this.moneyPay = moneyPay;
    }

    /**
     * 助理人id
     * @return assist_id 助理人id
     */
    public Integer getAssistId() {
        return assistId;
    }

    /**
     * 助理人id
     * @param assistId 助理人id
     */
    public void setAssistId(Integer assistId) {
        this.assistId = assistId;
    }

    /**
     * 版本号用来区分是哪个版本的订单
     * @return ver 版本号用来区分是哪个版本的订单
     */
    public Byte getVer() {
        return ver;
    }

    /**
     * 版本号用来区分是哪个版本的订单
     * @param ver 版本号用来区分是哪个版本的订单
     */
    public void setVer(Byte ver) {
        this.ver = ver;
    }

    /**
     * 配额分配状态 0为未分配  1为已分配  默认为0
     * @return balance_state 配额分配状态 0为未分配  1为已分配  默认为0
     */
    public Byte getBalanceState() {
        return balanceState;
    }

    /**
     * 配额分配状态 0为未分配  1为已分配  默认为0
     * @param balanceState 配额分配状态 0为未分配  1为已分配  默认为0
     */
    public void setBalanceState(Byte balanceState) {
        this.balanceState = balanceState;
    }

    /**
     * 买家提醒卖家发货时间,默认为0
     * @return remind_seller_time 买家提醒卖家发货时间,默认为0
     */
    public Integer getRemindSellerTime() {
        return remindSellerTime;
    }

    /**
     * 买家提醒卖家发货时间,默认为0
     * @param remindSellerTime 买家提醒卖家发货时间,默认为0
     */
    public void setRemindSellerTime(Integer remindSellerTime) {
        this.remindSellerTime = remindSellerTime;
    }

    /**
     * 订单发货报警等级
     * @return warn_level 订单发货报警等级
     */
    public Byte getWarnLevel() {
        return warnLevel;
    }

    /**
     * 订单发货报警等级
     * @param warnLevel 订单发货报警等级
     */
    public void setWarnLevel(Byte warnLevel) {
        this.warnLevel = warnLevel;
    }

    /**
     * 订单发货报警交流状态
     * @return communication_status 订单发货报警交流状态
     */
    public Byte getCommunicationStatus() {
        return communicationStatus;
    }

    /**
     * 订单发货报警交流状态
     * @param communicationStatus 订单发货报警交流状态
     */
    public void setCommunicationStatus(Byte communicationStatus) {
        this.communicationStatus = communicationStatus;
    }

    /**
     * 延迟发货的状态0正常1延迟 默认为0
     * @return delayed_delivery_state 延迟发货的状态0正常1延迟 默认为0
     */
    public String getDelayedDeliveryState() {
        return delayedDeliveryState;
    }

    /**
     * 延迟发货的状态0正常1延迟 默认为0
     * @param delayedDeliveryState 延迟发货的状态0正常1延迟 默认为0
     */
    public void setDelayedDeliveryState(String delayedDeliveryState) {
        this.delayedDeliveryState = delayedDeliveryState == null ? null : delayedDeliveryState.trim();
    }

    /**
     * 买家延迟收货的时长,默认为0
     * @return delayed_receive_duration 买家延迟收货的时长,默认为0
     */
    public Integer getDelayedReceiveDuration() {
        return delayedReceiveDuration;
    }

    /**
     * 买家延迟收货的时长,默认为0
     * @param delayedReceiveDuration 买家延迟收货的时长,默认为0
     */
    public void setDelayedReceiveDuration(Integer delayedReceiveDuration) {
        this.delayedReceiveDuration = delayedReceiveDuration;
    }

    /**
     * app渠道标识,默认空
     * @return app_variant app渠道标识,默认空
     */
    public String getAppVariant() {
        return appVariant;
    }

    /**
     * app渠道标识,默认空
     * @param appVariant app渠道标识,默认空
     */
    public void setAppVariant(String appVariant) {
        this.appVariant = appVariant == null ? null : appVariant.trim();
    }

    /**
     * pt普通订单,qkys全款预售订单
     * @return trade_mode pt普通订单,qkys全款预售订单
     */
    public String getTradeMode() {
        return tradeMode;
    }

    /**
     * pt普通订单,qkys全款预售订单
     * @param tradeMode pt普通订单,qkys全款预售订单
     */
    public void setTradeMode(String tradeMode) {
        this.tradeMode = tradeMode == null ? null : tradeMode.trim();
    }

    /**
     * 预售时间
     * @return presell_time 预售时间
     */
    public Integer getPresellTime() {
        return presellTime;
    }

    /**
     * 预售时间
     * @param presellTime 预售时间
     */
    public void setPresellTime(Integer presellTime) {
        this.presellTime = presellTime;
    }

    /**
     * 定点扶贫县的id
     * @return support_county_id 定点扶贫县的id
     */
    public Long getSupportCountyId() {
        return supportCountyId;
    }

    /**
     * 定点扶贫县的id
     * @param supportCountyId 定点扶贫县的id
     */
    public void setSupportCountyId(Long supportCountyId) {
        this.supportCountyId = supportCountyId;
    }

    /**
     * 买家标识
     * @return buyer_channel 买家标识
     */
    public String getBuyerChannel() {
        return buyerChannel;
    }

    /**
     * 买家标识
     * @param buyerChannel 买家标识
     */
    public void setBuyerChannel(String buyerChannel) {
        this.buyerChannel = buyerChannel == null ? null : buyerChannel.trim();
    }

    /**
     * 满减总金额单位分
     * @return discount_amount 满减总金额单位分
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    /**
     * 满减总金额单位分
     * @param discountAmount 满减总金额单位分
     */
    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * 删除状态:0是正常,1是删除,默认是0
     * @return deleted 删除状态:0是正常,1是删除,默认是0
     */
    public Byte getDeleted() {
        return deleted;
    }

    /**
     * 删除状态:0是正常,1是删除,默认是0
     * @param deleted 删除状态:0是正常,1是删除,默认是0
     */
    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    /**
     * 集采运营中心id
     * @return biz_operation_mid 集采运营中心id
     */
    public Integer getBizOperationMid() {
        return bizOperationMid;
    }

    /**
     * 集采运营中心id
     * @param bizOperationMid 集采运营中心id
     */
    public void setBizOperationMid(Integer bizOperationMid) {
        this.bizOperationMid = bizOperationMid;
    }

    /**
     * 满减总金额单位分(平台承担)
     * @return platform_pay 满减总金额单位分(平台承担)
     */
    public BigDecimal getPlatformPay() {
        return platformPay;
    }

    /**
     * 满减总金额单位分(平台承担)
     * @param platformPay 满减总金额单位分(平台承担)
     */
    public void setPlatformPay(BigDecimal platformPay) {
        this.platformPay = platformPay;
    }
    public Integer getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	@Override
	public String toString() {
		return "SyOrder [orderId=" + orderId + ", orderSn=" + orderSn + ", orderNum=" + orderNum + ", paySn=" + paySn
				+ ", storeId=" + storeId + ", storeName=" + storeName + ", buyerId=" + buyerId + ", buyerName="
				+ buyerName + ", buyerEmail=" + buyerEmail + ", addTime=" + addTime + ", paymentCode=" + paymentCode
				+ ", paymentTime=" + paymentTime + ", finnshedTime=" + finnshedTime + ", goodsAmount=" + goodsAmount
				+ ", orderAmount=" + orderAmount + ", pdAmount=" + pdAmount + ", shippingFee=" + shippingFee
				+ ", evaluationState=" + evaluationState + ", orderState=" + orderState + ", refundState=" + refundState
				+ ", lockState=" + lockState + ", refundAmount=" + refundAmount + ", delayTime=" + delayTime
				+ ", orderFrom=" + orderFrom + ", shippingCode=" + shippingCode + ", goodsProjectType="
				+ goodsProjectType + ", orderServiceStartime=" + orderServiceStartime + ", orderServiceEndtime="
				+ orderServiceEndtime + ", orderServiceInfo=" + orderServiceInfo + ", reward=" + reward + ", applyerId="
				+ applyerId + ", serviceFeeRate=" + serviceFeeRate + ", serviceFee=" + serviceFee + ", agentFee="
				+ agentFee + ", senderId=" + senderId + ", shipTime=" + shipTime + ", refundTime=" + refundTime
				+ ", tradeNo=" + tradeNo + ", storeLookedOrderState=" + storeLookedOrderState
				+ ", storeLookedRefundState=" + storeLookedRefundState + ", buyerLookedOrderState="
				+ buyerLookedOrderState + ", buyerLookedRefundState=" + buyerLookedRefundState + ", publisherId="
				+ publisherId + ", syPoints=" + syPoints + ", channel=" + channel + ", extendType=" + extendType
				+ ", fundFeeRate=" + fundFeeRate + ", fundFee=" + fundFee + ", lastConsultTime=" + lastConsultTime
				+ ", remindBuyerTime=" + remindBuyerTime + ", lastConsultState=" + lastConsultState + ", refundId="
				+ refundId + ", couponPay=" + couponPay + ", moneyPay=" + moneyPay + ", assistId=" + assistId + ", ver="
				+ ver + ", balanceState=" + balanceState + ", remindSellerTime=" + remindSellerTime + ", warnLevel="
				+ warnLevel + ", communicationStatus=" + communicationStatus + ", delayedDeliveryState="
				+ delayedDeliveryState + ", delayedReceiveDuration=" + delayedReceiveDuration + ", appVariant="
				+ appVariant + ", tradeMode=" + tradeMode + ", presellTime=" + presellTime + ", supportCountyId="
				+ supportCountyId + ", buyerChannel=" + buyerChannel + ", discountAmount=" + discountAmount
				+ ", deleted=" + deleted + ", bizOperationMid=" + bizOperationMid + ", platformPay=" + platformPay
				+ "]";
	}
	
	
}