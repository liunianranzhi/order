package com.shanyuan.platform.ms.dao.order.entity;

import java.math.BigDecimal;

/**
 * 描述:sy_order_common表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-10-18
 */
public class SyOrderCommon {
    /**
     * 订单索引id
     */
    private Integer orderId;

    /**
     * 店铺ID
     */
    private Integer storeId;

    /**
     * 配送时间
     */
    private Integer shippingTime;

    /**
     * 配送公司ID
     */
    private Byte shippingExpressId;

    /**
     * 评价时间
     */
    private Integer evaluationTime;

    /**
     * 卖家是否已评价买家
     */
    private String evalsellerState;

    /**
     * 卖家评价买家的时间
     */
    private Integer evalsellerTime;

    /**
     * 订单留言
     */
    private String orderMessage;

    /**
     * 订单赠送积分
     */
    private Integer orderPointscount;

    /**
     * 代金券面额
     */
    private Integer voucherPrice;

    /**
     * 代金券编码
     */
    private String voucherCode;

    /**
     * 发货地址ID
     */
    private Integer daddressId;

    /**
     * 收货人姓名
     */
    private String reciverName;

    /**
     * 收货人其它信息
     */
    private String reciverInfo;

    /**
     * 收货人省级ID
     */
    private Integer reciverProvinceId;

    /**
     * 发票信息
     */
    private String invoiceInfo;

    /**
     * 促销信息备注
     */
    private String promotionInfo;

    /**
     * 规格名称
     */
    private String specName;

    /**
     * 图书书名
     */
    private String goodsTitle;

    /**
     * 实物类捐赠的物流信息（邮寄费用）
     */
    private String goodsDeliveryInfo;

    /**
     * 实物类捐赠的物流信息（邮寄费用）
     */
    private String orderDeliveryInfo;

    /**
     * 渠道信息
     */
    private String chnlInfo;

    /**
     * 物品重量
     */
    private BigDecimal weight;

    /**
     * 物流方式（1自己送  2 上门取件）
     */
    private Byte transportType;

    /**
     * 快递单图片
     */
    private String expressImage;

    /**
     * 购买理由
     */
    private String purchaseReason;

    /**
     * 贫困户类型
     */
    private Byte poorType;

    /**
     * 订单发货报警备注
     */
    private String remark;

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
     * 配送时间
     * @return shipping_time 配送时间
     */
    public Integer getShippingTime() {
        return shippingTime;
    }

    /**
     * 配送时间
     * @param shippingTime 配送时间
     */
    public void setShippingTime(Integer shippingTime) {
        this.shippingTime = shippingTime;
    }

    /**
     * 配送公司ID
     * @return shipping_express_id 配送公司ID
     */
    public Byte getShippingExpressId() {
        return shippingExpressId;
    }

    /**
     * 配送公司ID
     * @param shippingExpressId 配送公司ID
     */
    public void setShippingExpressId(Byte shippingExpressId) {
        this.shippingExpressId = shippingExpressId;
    }

    /**
     * 评价时间
     * @return evaluation_time 评价时间
     */
    public Integer getEvaluationTime() {
        return evaluationTime;
    }

    /**
     * 评价时间
     * @param evaluationTime 评价时间
     */
    public void setEvaluationTime(Integer evaluationTime) {
        this.evaluationTime = evaluationTime;
    }

    /**
     * 卖家是否已评价买家
     * @return evalseller_state 卖家是否已评价买家
     */
    public String getEvalsellerState() {
        return evalsellerState;
    }

    /**
     * 卖家是否已评价买家
     * @param evalsellerState 卖家是否已评价买家
     */
    public void setEvalsellerState(String evalsellerState) {
        this.evalsellerState = evalsellerState == null ? null : evalsellerState.trim();
    }

    /**
     * 卖家评价买家的时间
     * @return evalseller_time 卖家评价买家的时间
     */
    public Integer getEvalsellerTime() {
        return evalsellerTime;
    }

    /**
     * 卖家评价买家的时间
     * @param evalsellerTime 卖家评价买家的时间
     */
    public void setEvalsellerTime(Integer evalsellerTime) {
        this.evalsellerTime = evalsellerTime;
    }

    /**
     * 订单留言
     * @return order_message 订单留言
     */
    public String getOrderMessage() {
        return orderMessage;
    }

    /**
     * 订单留言
     * @param orderMessage 订单留言
     */
    public void setOrderMessage(String orderMessage) {
        this.orderMessage = orderMessage == null ? null : orderMessage.trim();
    }

    /**
     * 订单赠送积分
     * @return order_pointscount 订单赠送积分
     */
    public Integer getOrderPointscount() {
        return orderPointscount;
    }

    /**
     * 订单赠送积分
     * @param orderPointscount 订单赠送积分
     */
    public void setOrderPointscount(Integer orderPointscount) {
        this.orderPointscount = orderPointscount;
    }

    /**
     * 代金券面额
     * @return voucher_price 代金券面额
     */
    public Integer getVoucherPrice() {
        return voucherPrice;
    }

    /**
     * 代金券面额
     * @param voucherPrice 代金券面额
     */
    public void setVoucherPrice(Integer voucherPrice) {
        this.voucherPrice = voucherPrice;
    }

    /**
     * 代金券编码
     * @return voucher_code 代金券编码
     */
    public String getVoucherCode() {
        return voucherCode;
    }

    /**
     * 代金券编码
     * @param voucherCode 代金券编码
     */
    public void setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode == null ? null : voucherCode.trim();
    }

    /**
     * 发货地址ID
     * @return daddress_id 发货地址ID
     */
    public Integer getDaddressId() {
        return daddressId;
    }

    /**
     * 发货地址ID
     * @param daddressId 发货地址ID
     */
    public void setDaddressId(Integer daddressId) {
        this.daddressId = daddressId;
    }

    /**
     * 收货人姓名
     * @return reciver_name 收货人姓名
     */
    public String getReciverName() {
        return reciverName;
    }

    /**
     * 收货人姓名
     * @param reciverName 收货人姓名
     */
    public void setReciverName(String reciverName) {
        this.reciverName = reciverName == null ? null : reciverName.trim();
    }

    /**
     * 收货人其它信息
     * @return reciver_info 收货人其它信息
     */
    public String getReciverInfo() {
        return reciverInfo;
    }

    /**
     * 收货人其它信息
     * @param reciverInfo 收货人其它信息
     */
    public void setReciverInfo(String reciverInfo) {
        this.reciverInfo = reciverInfo == null ? null : reciverInfo.trim();
    }

    /**
     * 收货人省级ID
     * @return reciver_province_id 收货人省级ID
     */
    public Integer getReciverProvinceId() {
        return reciverProvinceId;
    }

    /**
     * 收货人省级ID
     * @param reciverProvinceId 收货人省级ID
     */
    public void setReciverProvinceId(Integer reciverProvinceId) {
        this.reciverProvinceId = reciverProvinceId;
    }

    /**
     * 发票信息
     * @return invoice_info 发票信息
     */
    public String getInvoiceInfo() {
        return invoiceInfo;
    }

    /**
     * 发票信息
     * @param invoiceInfo 发票信息
     */
    public void setInvoiceInfo(String invoiceInfo) {
        this.invoiceInfo = invoiceInfo == null ? null : invoiceInfo.trim();
    }

    /**
     * 促销信息备注
     * @return promotion_info 促销信息备注
     */
    public String getPromotionInfo() {
        return promotionInfo;
    }

    /**
     * 促销信息备注
     * @param promotionInfo 促销信息备注
     */
    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo == null ? null : promotionInfo.trim();
    }

    /**
     * 规格名称
     * @return spec_name 规格名称
     */
    public String getSpecName() {
        return specName;
    }

    /**
     * 规格名称
     * @param specName 规格名称
     */
    public void setSpecName(String specName) {
        this.specName = specName == null ? null : specName.trim();
    }

    /**
     * 图书书名
     * @return goods_title 图书书名
     */
    public String getGoodsTitle() {
        return goodsTitle;
    }

    /**
     * 图书书名
     * @param goodsTitle 图书书名
     */
    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle == null ? null : goodsTitle.trim();
    }

    /**
     * 实物类捐赠的物流信息（邮寄费用）
     * @return goods_delivery_info 实物类捐赠的物流信息（邮寄费用）
     */
    public String getGoodsDeliveryInfo() {
        return goodsDeliveryInfo;
    }

    /**
     * 实物类捐赠的物流信息（邮寄费用）
     * @param goodsDeliveryInfo 实物类捐赠的物流信息（邮寄费用）
     */
    public void setGoodsDeliveryInfo(String goodsDeliveryInfo) {
        this.goodsDeliveryInfo = goodsDeliveryInfo == null ? null : goodsDeliveryInfo.trim();
    }

    /**
     * 实物类捐赠的物流信息（邮寄费用）
     * @return order_delivery_info 实物类捐赠的物流信息（邮寄费用）
     */
    public String getOrderDeliveryInfo() {
        return orderDeliveryInfo;
    }

    /**
     * 实物类捐赠的物流信息（邮寄费用）
     * @param orderDeliveryInfo 实物类捐赠的物流信息（邮寄费用）
     */
    public void setOrderDeliveryInfo(String orderDeliveryInfo) {
        this.orderDeliveryInfo = orderDeliveryInfo == null ? null : orderDeliveryInfo.trim();
    }

    /**
     * 渠道信息
     * @return chnl_info 渠道信息
     */
    public String getChnlInfo() {
        return chnlInfo;
    }

    /**
     * 渠道信息
     * @param chnlInfo 渠道信息
     */
    public void setChnlInfo(String chnlInfo) {
        this.chnlInfo = chnlInfo == null ? null : chnlInfo.trim();
    }

    /**
     * 物品重量
     * @return weight 物品重量
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * 物品重量
     * @param weight 物品重量
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * 物流方式（1自己送  2 上门取件）
     * @return transport_type 物流方式（1自己送  2 上门取件）
     */
    public Byte getTransportType() {
        return transportType;
    }

    /**
     * 物流方式（1自己送  2 上门取件）
     * @param transportType 物流方式（1自己送  2 上门取件）
     */
    public void setTransportType(Byte transportType) {
        this.transportType = transportType;
    }

    /**
     * 快递单图片
     * @return express_image 快递单图片
     */
    public String getExpressImage() {
        return expressImage;
    }

    /**
     * 快递单图片
     * @param expressImage 快递单图片
     */
    public void setExpressImage(String expressImage) {
        this.expressImage = expressImage == null ? null : expressImage.trim();
    }

    /**
     * 购买理由
     * @return purchase_reason 购买理由
     */
    public String getPurchaseReason() {
        return purchaseReason;
    }

    /**
     * 购买理由
     * @param purchaseReason 购买理由
     */
    public void setPurchaseReason(String purchaseReason) {
        this.purchaseReason = purchaseReason == null ? null : purchaseReason.trim();
    }

    /**
     * 贫困户类型
     * @return poor_type 贫困户类型
     */
    public Byte getPoorType() {
        return poorType;
    }

    /**
     * 贫困户类型
     * @param poorType 贫困户类型
     */
    public void setPoorType(Byte poorType) {
        this.poorType = poorType;
    }

    /**
     * 订单发货报警备注
     * @return remark 订单发货报警备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 订单发货报警备注
     * @param remark 订单发货报警备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}