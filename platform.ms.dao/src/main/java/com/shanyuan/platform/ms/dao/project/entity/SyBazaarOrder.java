package com.shanyuan.platform.ms.dao.project.entity;

import java.math.BigDecimal;

/**
 * 描述:sy_bazaar_order表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-11-01
 */
public class SyBazaarOrder {
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
     * 资助者id
     */
    private Integer applyerId;

    /**
     * 买家姓名
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
     * 订单总价格
     */
    private BigDecimal orderAmount;

    /**
     * 运费
     */
    private BigDecimal shippingFee;

    /**
     * 订单状态：0(已取消);1(默认):已创建;10:过期失败;12:支付中;15:已付款;20:未确认/待同意; 25:已审核/待发货;28:待资助者付款;30:已发货;40:已完成;50:退款;60:已删除;70:协商成功;80:协商失败
     */
    private String orderState;

    /**
     * 退款状态:0是无退款,1是部分退款,2是全部退款,10退款中,20商家拒绝,30商家同意,40退款成功,50付款成功未发货 已退款,60申请仲裁
     */
    private Byte refundState;

    /**
     * 退款记录ID
     */
    private Integer refundId;

    /**
     * 仲裁状态:1是仲裁通过,2是仲裁失败,默认是0
     */
    private Byte lastConsultState;

    /**
     * 退款金额，单位是元
     */
    private BigDecimal refundAmount;

    /**
     * 延迟时间,默认为0
     */
    private Integer delayTime;

    /**
     * 物流单号
     */
    private String shippingCode;

    /**
     * 25.义卖项目
     */
    private Integer goodsProjectType;

    /**
     * 发货人id
     */
    private Integer senderId;

    /**
     * 发货时间,默认为0
     */
    private Integer shipTime;

    /**
     * 仲裁时间,默认为0
     */
    private Integer lastConsultTime;

    /**
     * 申请退款时间,默认为0
     */
    private Integer refundTime;

    /**
     * 支付宝交易流水号
     */
    private String tradeNo;

    /**
     * 发布者id
     */
    private Integer publisherId;

    /**
     * 义卖项目id,订单创建时填充
     */
    private Integer bazaarId;

    /**
     * 该订单获取到的公益币
     */
    private Long syPoints;

    /**
     * 平台标识
     */
    private String channel;

    /**
     * 版本号用来区分是哪个时期的订单
     */
    private Byte ver;

    /**
     * APP标识
     */
    private String appVariant;

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
     * 退款金额，单位是元
     * @return refund_amount 退款金额，单位是元
     */
    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    /**
     * 退款金额，单位是元
     * @param refundAmount 退款金额，单位是元
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
     * 25.义卖项目
     * @return goods_project_type 25.义卖项目
     */
    public Integer getGoodsProjectType() {
        return goodsProjectType;
    }

    /**
     * 25.义卖项目
     * @param goodsProjectType 25.义卖项目
     */
    public void setGoodsProjectType(Integer goodsProjectType) {
        this.goodsProjectType = goodsProjectType;
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
     * 义卖项目id,订单创建时填充
     * @return bazaar_id 义卖项目id,订单创建时填充
     */
    public Integer getBazaarId() {
        return bazaarId;
    }

    /**
     * 义卖项目id,订单创建时填充
     * @param bazaarId 义卖项目id,订单创建时填充
     */
    public void setBazaarId(Integer bazaarId) {
        this.bazaarId = bazaarId;
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
     * 版本号用来区分是哪个时期的订单
     * @return ver 版本号用来区分是哪个时期的订单
     */
    public Byte getVer() {
        return ver;
    }

    /**
     * 版本号用来区分是哪个时期的订单
     * @param ver 版本号用来区分是哪个时期的订单
     */
    public void setVer(Byte ver) {
        this.ver = ver;
    }

    /**
     * APP标识
     * @return app_variant APP标识
     */
    public String getAppVariant() {
        return appVariant;
    }

    /**
     * APP标识
     * @param appVariant APP标识
     */
    public void setAppVariant(String appVariant) {
        this.appVariant = appVariant == null ? null : appVariant.trim();
    }
}