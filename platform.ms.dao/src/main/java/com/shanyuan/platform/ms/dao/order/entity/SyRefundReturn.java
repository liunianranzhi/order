package com.shanyuan.platform.ms.dao.order.entity;

import java.math.BigDecimal;

/**
 * 描述:sy_refund_return表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-10-30
 */
public class SyRefundReturn {
    /**
     * 记录ID
     */
    private Integer refundId;
    /**
     * 数量
     */
    private Integer num;
    /**
     * 订单ID
     */
    private Integer orderId;

    /**
     * 订单编号
     */
    private String orderSn;

    /**
     * 申请编号
     */
    private String refundSn;

    /**
     * 店铺ID
     */
    private Integer storeId;

    /**
     * 店铺名称
     */
    private String storeName;

    /**
     * 买家ID
     */
    private Integer buyerId;

    /**
     * 买家会员名
     */
    private String buyerName;

    /**
     * 商品ID,全部退款是0
     */
    private Integer goodsId;

    /**
     * 订单商品ID,全部退款是0
     */
    private Integer orderGoodsId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品数量
     */
    private Integer goodsNum;

    /**
     * 退款金额
     */
    private BigDecimal refundAmount;

    /**
     * 商品图片
     */
    private String goodsImage;

    /**
     * 订单商品类型:1默认2团购商品3限时折扣商品4组合套装
     */
    private Byte orderGoodsType;

    /**
     * 申请类型:1为退款,2为退货,默认为1
     */
    private Byte refundType;

    /**
     * 卖家处理状态:1为待审核,2为同意,3为不同意,默认为1
     */
    private Byte sellerState;

    /**
     * 申请状态:1为处理中,2为待管理员处理,3为已完成,4为退款中,5为申请仲裁，默认为1
     */
    private Byte refundState;

    /**
     * 退货类型:1为不用退货,2为需要退货,默认为1
     */
    private Byte returnType;

    /**
     * 订单锁定类型:1为不用锁定,2为需要锁定,默认为1
     */
    private Byte orderLock;

    /**
     * 物流状态:1为待发货,2为待收货,3为未收到,4为已收货,默认为1
     */
    private Byte goodsState;

    /**
     * 添加时间
     */
    private Integer addTime;

    /**
     * 卖家处理时间
     */
    private Integer sellerTime;

    /**
     * 管理员处理时间,默认为0
     */
    private Integer adminTime;

    /**
     * 申请原因
     */
    private String buyerMessage;

    /**
     * 退款原因：1、不想买了2、产品或规格选错了3、送货地址写错了4、发货太慢5、无理由退货6、其它
     */
    private Byte refundReason;

    /**
     * 卖家备注
     */
    private String sellerMessage;

    /**
     * 管理员备注
     */
    private String adminMessage;

    /**
     * 物流公司编号
     */
    private Byte expressId;

    /**
     * 物流单号
     */
    private String invoiceNo;

    /**
     * 发货时间,默认为0
     */
    private Integer shipTime;

    /**
     * 收货延迟时间,默认为0
     */
    private Integer delayTime;

    /**
     * 收货时间,默认为0
     */
    private Integer receiveTime;

    /**
     * 收货备注
     */
    private String receiveMessage;

    /**
     * 佣金比例
     */
    private Short commisRate;

    /**
     * 商家是否同意退款的操作者的id
     */
    private Integer operatorId;

    /**
     * 处理完成时间
     */
    private Integer finnshedTime;

    /**
     * 支付方式名称代码
     */
    private String paymentCode;

    /**
     * 仲裁状态:1是仲裁通过,2是仲裁失败,默认是0
     */
    private Byte consultState;

    /**
     * 仲裁时间,默认为0
     */
    private Integer consultTime;

    /**
     * 申请仲裁的member_id,默认为0
     */
    private Integer applyConsultMId;

    /**
     * 退款备注
     */
    private String remark;

    /**
     * 退款单沟通状态
     */
    private Byte communicationStatus;

    /**
     * 记录ID
     * @return refund_id 记录ID
     */
    public Integer getRefundId() {
        return refundId;
    }

    /**
     * 记录ID
     * @param refundId 记录ID
     */
    public void setRefundId(Integer refundId) {
        this.refundId = refundId;
    }

    /**
     * 订单ID
     * @return order_id 订单ID
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 订单ID
     * @param orderId 订单ID
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 订单编号
     * @return order_sn 订单编号
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * 订单编号
     * @param orderSn 订单编号
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    /**
     * 申请编号
     * @return refund_sn 申请编号
     */
    public String getRefundSn() {
        return refundSn;
    }

    /**
     * 申请编号
     * @param refundSn 申请编号
     */
    public void setRefundSn(String refundSn) {
        this.refundSn = refundSn == null ? null : refundSn.trim();
    }

    /**
     * 店铺ID
     * @return store_id 店铺ID
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * 店铺ID
     * @param storeId 店铺ID
     */
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    /**
     * 店铺名称
     * @return store_name 店铺名称
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * 店铺名称
     * @param storeName 店铺名称
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    /**
     * 买家ID
     * @return buyer_id 买家ID
     */
    public Integer getBuyerId() {
        return buyerId;
    }

    /**
     * 买家ID
     * @param buyerId 买家ID
     */
    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * 买家会员名
     * @return buyer_name 买家会员名
     */
    public String getBuyerName() {
        return buyerName;
    }

    /**
     * 买家会员名
     * @param buyerName 买家会员名
     */
    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName == null ? null : buyerName.trim();
    }

    /**
     * 商品ID,全部退款是0
     * @return goods_id 商品ID,全部退款是0
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * 商品ID,全部退款是0
     * @param goodsId 商品ID,全部退款是0
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 订单商品ID,全部退款是0
     * @return order_goods_id 订单商品ID,全部退款是0
     */
    public Integer getOrderGoodsId() {
        return orderGoodsId;
    }

    /**
     * 订单商品ID,全部退款是0
     * @param orderGoodsId 订单商品ID,全部退款是0
     */
    public void setOrderGoodsId(Integer orderGoodsId) {
        this.orderGoodsId = orderGoodsId;
    }

    /**
     * 商品名称
     * @return goods_name 商品名称
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 商品名称
     * @param goodsName 商品名称
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * 商品数量
     * @return goods_num 商品数量
     */
    public Integer getGoodsNum() {
        return goodsNum;
    }

    /**
     * 商品数量
     * @param goodsNum 商品数量
     */
    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
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
     * 商品图片
     * @return goods_image 商品图片
     */
    public String getGoodsImage() {
        return goodsImage;
    }

    /**
     * 商品图片
     * @param goodsImage 商品图片
     */
    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage == null ? null : goodsImage.trim();
    }

    /**
     * 订单商品类型:1默认2团购商品3限时折扣商品4组合套装
     * @return order_goods_type 订单商品类型:1默认2团购商品3限时折扣商品4组合套装
     */
    public Byte getOrderGoodsType() {
        return orderGoodsType;
    }

    /**
     * 订单商品类型:1默认2团购商品3限时折扣商品4组合套装
     * @param orderGoodsType 订单商品类型:1默认2团购商品3限时折扣商品4组合套装
     */
    public void setOrderGoodsType(Byte orderGoodsType) {
        this.orderGoodsType = orderGoodsType;
    }

    /**
     * 申请类型:1为退款,2为退货,默认为1
     * @return refund_type 申请类型:1为退款,2为退货,默认为1
     */
    public Byte getRefundType() {
        return refundType;
    }

    /**
     * 申请类型:1为退款,2为退货,默认为1
     * @param refundType 申请类型:1为退款,2为退货,默认为1
     */
    public void setRefundType(Byte refundType) {
        this.refundType = refundType;
    }

    /**
     * 卖家处理状态:1为待审核,2为同意,3为不同意,默认为1
     * @return seller_state 卖家处理状态:1为待审核,2为同意,3为不同意,默认为1
     */
    public Byte getSellerState() {
        return sellerState;
    }

    /**
     * 卖家处理状态:1为待审核,2为同意,3为不同意,默认为1
     * @param sellerState 卖家处理状态:1为待审核,2为同意,3为不同意,默认为1
     */
    public void setSellerState(Byte sellerState) {
        this.sellerState = sellerState;
    }

    /**
     * 申请状态:1为处理中,2为待管理员处理,3为已完成,4为退款中,5为申请仲裁，默认为1
     * @return refund_state 申请状态:1为处理中,2为待管理员处理,3为已完成,4为退款中,5为申请仲裁，默认为1
     */
    public Byte getRefundState() {
        return refundState;
    }

    /**
     * 申请状态:1为处理中,2为待管理员处理,3为已完成,4为退款中,5为申请仲裁，默认为1
     * @param refundState 申请状态:1为处理中,2为待管理员处理,3为已完成,4为退款中,5为申请仲裁，默认为1
     */
    public void setRefundState(Byte refundState) {
        this.refundState = refundState;
    }

    /**
     * 退货类型:1为不用退货,2为需要退货,默认为1
     * @return return_type 退货类型:1为不用退货,2为需要退货,默认为1
     */
    public Byte getReturnType() {
        return returnType;
    }

    /**
     * 退货类型:1为不用退货,2为需要退货,默认为1
     * @param returnType 退货类型:1为不用退货,2为需要退货,默认为1
     */
    public void setReturnType(Byte returnType) {
        this.returnType = returnType;
    }

    /**
     * 订单锁定类型:1为不用锁定,2为需要锁定,默认为1
     * @return order_lock 订单锁定类型:1为不用锁定,2为需要锁定,默认为1
     */
    public Byte getOrderLock() {
        return orderLock;
    }

    /**
     * 订单锁定类型:1为不用锁定,2为需要锁定,默认为1
     * @param orderLock 订单锁定类型:1为不用锁定,2为需要锁定,默认为1
     */
    public void setOrderLock(Byte orderLock) {
        this.orderLock = orderLock;
    }

    /**
     * 物流状态:1为待发货,2为待收货,3为未收到,4为已收货,默认为1
     * @return goods_state 物流状态:1为待发货,2为待收货,3为未收到,4为已收货,默认为1
     */
    public Byte getGoodsState() {
        return goodsState;
    }

    /**
     * 物流状态:1为待发货,2为待收货,3为未收到,4为已收货,默认为1
     * @param goodsState 物流状态:1为待发货,2为待收货,3为未收到,4为已收货,默认为1
     */
    public void setGoodsState(Byte goodsState) {
        this.goodsState = goodsState;
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
     * 卖家处理时间
     * @return seller_time 卖家处理时间
     */
    public Integer getSellerTime() {
        return sellerTime;
    }

    /**
     * 卖家处理时间
     * @param sellerTime 卖家处理时间
     */
    public void setSellerTime(Integer sellerTime) {
        this.sellerTime = sellerTime;
    }

    /**
     * 管理员处理时间,默认为0
     * @return admin_time 管理员处理时间,默认为0
     */
    public Integer getAdminTime() {
        return adminTime;
    }

    /**
     * 管理员处理时间,默认为0
     * @param adminTime 管理员处理时间,默认为0
     */
    public void setAdminTime(Integer adminTime) {
        this.adminTime = adminTime;
    }

    /**
     * 申请原因
     * @return buyer_message 申请原因
     */
    public String getBuyerMessage() {
        return buyerMessage;
    }

    /**
     * 申请原因
     * @param buyerMessage 申请原因
     */
    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage == null ? null : buyerMessage.trim();
    }

    /**
     * 退款原因：1、不想买了2、产品或规格选错了3、送货地址写错了4、发货太慢5、无理由退货6、其它
     * @return refund_reason 退款原因：1、不想买了2、产品或规格选错了3、送货地址写错了4、发货太慢5、无理由退货6、其它
     */
    public Byte getRefundReason() {
        return refundReason;
    }

    /**
     * 退款原因：1、不想买了2、产品或规格选错了3、送货地址写错了4、发货太慢5、无理由退货6、其它
     * @param refundReason 退款原因：1、不想买了2、产品或规格选错了3、送货地址写错了4、发货太慢5、无理由退货6、其它
     */
    public void setRefundReason(Byte refundReason) {
        this.refundReason = refundReason;
    }

    /**
     * 卖家备注
     * @return seller_message 卖家备注
     */
    public String getSellerMessage() {
        return sellerMessage;
    }

    /**
     * 卖家备注
     * @param sellerMessage 卖家备注
     */
    public void setSellerMessage(String sellerMessage) {
        this.sellerMessage = sellerMessage == null ? null : sellerMessage.trim();
    }

    /**
     * 管理员备注
     * @return admin_message 管理员备注
     */
    public String getAdminMessage() {
        return adminMessage;
    }

    /**
     * 管理员备注
     * @param adminMessage 管理员备注
     */
    public void setAdminMessage(String adminMessage) {
        this.adminMessage = adminMessage == null ? null : adminMessage.trim();
    }

    /**
     * 物流公司编号
     * @return express_id 物流公司编号
     */
    public Byte getExpressId() {
        return expressId;
    }

    /**
     * 物流公司编号
     * @param expressId 物流公司编号
     */
    public void setExpressId(Byte expressId) {
        this.expressId = expressId;
    }

    /**
     * 物流单号
     * @return invoice_no 物流单号
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * 物流单号
     * @param invoiceNo 物流单号
     */
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo == null ? null : invoiceNo.trim();
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
     * 收货延迟时间,默认为0
     * @return delay_time 收货延迟时间,默认为0
     */
    public Integer getDelayTime() {
        return delayTime;
    }

    /**
     * 收货延迟时间,默认为0
     * @param delayTime 收货延迟时间,默认为0
     */
    public void setDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
    }

    /**
     * 收货时间,默认为0
     * @return receive_time 收货时间,默认为0
     */
    public Integer getReceiveTime() {
        return receiveTime;
    }

    /**
     * 收货时间,默认为0
     * @param receiveTime 收货时间,默认为0
     */
    public void setReceiveTime(Integer receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * 收货备注
     * @return receive_message 收货备注
     */
    public String getReceiveMessage() {
        return receiveMessage;
    }

    /**
     * 收货备注
     * @param receiveMessage 收货备注
     */
    public void setReceiveMessage(String receiveMessage) {
        this.receiveMessage = receiveMessage == null ? null : receiveMessage.trim();
    }

    /**
     * 佣金比例
     * @return commis_rate 佣金比例
     */
    public Short getCommisRate() {
        return commisRate;
    }

    /**
     * 佣金比例
     * @param commisRate 佣金比例
     */
    public void setCommisRate(Short commisRate) {
        this.commisRate = commisRate;
    }

    /**
     * 商家是否同意退款的操作者的id
     * @return operator_id 商家是否同意退款的操作者的id
     */
    public Integer getOperatorId() {
        return operatorId;
    }

    /**
     * 商家是否同意退款的操作者的id
     * @param operatorId 商家是否同意退款的操作者的id
     */
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * 处理完成时间
     * @return finnshed_time 处理完成时间
     */
    public Integer getFinnshedTime() {
        return finnshedTime;
    }

    /**
     * 处理完成时间
     * @param finnshedTime 处理完成时间
     */
    public void setFinnshedTime(Integer finnshedTime) {
        this.finnshedTime = finnshedTime;
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
     * 仲裁状态:1是仲裁通过,2是仲裁失败,默认是0
     * @return consult_state 仲裁状态:1是仲裁通过,2是仲裁失败,默认是0
     */
    public Byte getConsultState() {
        return consultState;
    }

    /**
     * 仲裁状态:1是仲裁通过,2是仲裁失败,默认是0
     * @param consultState 仲裁状态:1是仲裁通过,2是仲裁失败,默认是0
     */
    public void setConsultState(Byte consultState) {
        this.consultState = consultState;
    }

    /**
     * 仲裁时间,默认为0
     * @return consult_time 仲裁时间,默认为0
     */
    public Integer getConsultTime() {
        return consultTime;
    }

    /**
     * 仲裁时间,默认为0
     * @param consultTime 仲裁时间,默认为0
     */
    public void setConsultTime(Integer consultTime) {
        this.consultTime = consultTime;
    }

    /**
     * 申请仲裁的member_id,默认为0
     * @return apply_consult_m_id 申请仲裁的member_id,默认为0
     */
    public Integer getApplyConsultMId() {
        return applyConsultMId;
    }

    /**
     * 申请仲裁的member_id,默认为0
     * @param applyConsultMId 申请仲裁的member_id,默认为0
     */
    public void setApplyConsultMId(Integer applyConsultMId) {
        this.applyConsultMId = applyConsultMId;
    }

    public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	/**
     * 退款备注
     * @return remark 退款备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 退款备注
     * @param remark 退款备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 退款单沟通状态
     * @return communication_status 退款单沟通状态
     */
    public Byte getCommunicationStatus() {
        return communicationStatus;
    }

    /**
     * 退款单沟通状态
     * @param communicationStatus 退款单沟通状态
     */
    public void setCommunicationStatus(Byte communicationStatus) {
        this.communicationStatus = communicationStatus;
    }
}