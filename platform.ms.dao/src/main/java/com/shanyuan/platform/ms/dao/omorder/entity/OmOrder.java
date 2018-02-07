package com.shanyuan.platform.ms.dao.omorder.entity;

import java.util.Date;

/**
 * 描述:om_order表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-11-10
 */
public class OmOrder {
    /**
     * 订单id
     */
    private String orderId;

    /**
     * 主订单id
     */
    private String mainId;

    /**
     * 订单code
     */
    private Long orderCode;

    /**
     * 会员id
     */
    private Integer memberId;

    /**
     * 店铺id
     */
    private Integer storeId;

    /**
     * 销售者id
     */
    private Integer sellerId;

    /**
     * 助理人id
     */
    private Integer agentId;

    /**
     * 贫苦户id
     */
    private Integer poorId;

    /**
     * 集采运营中心id
     */
    private Integer opeCenterId;

    /**
     * 订单类型             10：大爱超市；             20，善源商场；             31：个人集采；             32：单位集采
     */
    private Byte orderType;

    /**
     * 订单渠道信息             app:公益中国；             wechar:微信公众号
     */
    private String orderChannel;

    /**
     * 商品种类             17：大爱超市             24：善源商场             
     */
    private Byte goodsProjectType;

    /**
     * 订单状态             10:订单提交成功；             20:订单待处理；             30:订单处理完成             40:订单成功完成             50:订单取消             
     */
    private Byte orderStatus;

    /**
     * 订单取消原因
     */
    private String orderCancleReason;

    /**
     * 支付类型             10:offline             20:online             
     */
    private Byte payType;

    /**
     * 支付网关             boc：中银支付             alipayna:支付宝原生支付             alipayh5:支付宝wap支付             wechatna：微信app支付             wechatmp：微信公众号             
     */
    private String payCenter;

    /**
     * 支付状态             10:待付款             19:付款成功             20:待退款             29:退款成功             
     */
    private Byte payStatus;

    /**
     * 订单留言
     */
    private String orderMessage;

    /**
     * 售后单状态             0:未提交售后信息             10:提交售后请求             20:待售后发货             29:待卖家确认             30:退货完成             40:退货拒绝
     */
    private Byte custServiceStatus;

    /**
     * 订单全部费用
     */
    private Integer orderAllPrice;

    /**
     * 订单商品费用
     */
    private Integer orderGoodsPrice;

    /**
     * 订单物流费用
     */
    private Integer orderLogistPrice;

    /**
     * 订单优惠券费用
     */
    private Integer orderVoucherPrice;

    /**
     * 订单使用扶贫码费用
     */
    private Integer orderCouponPrice;

    /**
     * 订单使用积分数
     */
    private Integer orderUsedPoint;

    /**
     * 订单支付费用
     */
    private Integer orderPayFee;

    /**
     * 订单创建时间
     */
    private Date orderCreateTime;

    /**
     * 订单支付时间
     */
    private Date orderPayTime;

    /**
     * 订单发货时间
     */
    private Date orderSendTime;

    /**
     * 订单签收时间
     */
    private Date orderCheckTime;

    /**
     * 订单评价状态             0:未评价             10:已经评价             12:超时，默认好评
     */
    private Byte orderEvaStatus;

    /**
     * 订单删除标志位
     */
    private Byte isDelete;

    /**
     * 最近更新时间
     */
    private Date updateTime;

    /**
     * 订单冗余字段1
     */
    private String otherInfo1;

    /**
     * 订单冗余字段2
     */
    private String otherInfo2;

    /**
     * 订单id
     * @return order_id 订单id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 订单id
     * @param orderId 订单id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * 主订单id
     * @return main_id 主订单id
     */
    public String getMainId() {
        return mainId;
    }

    /**
     * 主订单id
     * @param mainId 主订单id
     */
    public void setMainId(String mainId) {
        this.mainId = mainId == null ? null : mainId.trim();
    }

    /**
     * 订单code
     * @return order_code 订单code
     */
    public Long getOrderCode() {
        return orderCode;
    }

    /**
     * 订单code
     * @param orderCode 订单code
     */
    public void setOrderCode(Long orderCode) {
        this.orderCode = orderCode;
    }

    /**
     * 会员id
     * @return member_id 会员id
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 会员id
     * @param memberId 会员id
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 店铺id
     * @return store_id 店铺id
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * 店铺id
     * @param storeId 店铺id
     */
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    /**
     * 销售者id
     * @return seller_id 销售者id
     */
    public Integer getSellerId() {
        return sellerId;
    }

    /**
     * 销售者id
     * @param sellerId 销售者id
     */
    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * 助理人id
     * @return agent_id 助理人id
     */
    public Integer getAgentId() {
        return agentId;
    }

    /**
     * 助理人id
     * @param agentId 助理人id
     */
    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    /**
     * 贫苦户id
     * @return poor_id 贫苦户id
     */
    public Integer getPoorId() {
        return poorId;
    }

    /**
     * 贫苦户id
     * @param poorId 贫苦户id
     */
    public void setPoorId(Integer poorId) {
        this.poorId = poorId;
    }

    /**
     * 集采运营中心id
     * @return ope_center_id 集采运营中心id
     */
    public Integer getOpeCenterId() {
        return opeCenterId;
    }

    /**
     * 集采运营中心id
     * @param opeCenterId 集采运营中心id
     */
    public void setOpeCenterId(Integer opeCenterId) {
        this.opeCenterId = opeCenterId;
    }

    /**
     * 订单类型             10：大爱超市；             20，善源商场；             31：个人集采；             32：单位集采
     * @return order_type 订单类型             10：大爱超市；             20，善源商场；             31：个人集采；             32：单位集采
     */
    public Byte getOrderType() {
        return orderType;
    }

    /**
     * 订单类型             10：大爱超市；             20，善源商场；             31：个人集采；             32：单位集采
     * @param orderType 订单类型             10：大爱超市；             20，善源商场；             31：个人集采；             32：单位集采
     */
    public void setOrderType(Byte orderType) {
        this.orderType = orderType;
    }

    /**
     * 订单渠道信息             app:公益中国；             wechar:微信公众号
     * @return order_channel 订单渠道信息             app:公益中国；             wechar:微信公众号
     */
    public String getOrderChannel() {
        return orderChannel;
    }

    /**
     * 订单渠道信息             app:公益中国；             wechar:微信公众号
     * @param orderChannel 订单渠道信息             app:公益中国；             wechar:微信公众号
     */
    public void setOrderChannel(String orderChannel) {
        this.orderChannel = orderChannel == null ? null : orderChannel.trim();
    }

    /**
     * 商品种类             17：大爱超市             24：善源商场             
     * @return goods_project_type 商品种类             17：大爱超市             24：善源商场             
     */
    public Byte getGoodsProjectType() {
        return goodsProjectType;
    }

    /**
     * 商品种类             17：大爱超市             24：善源商场             
     * @param goodsProjectType 商品种类             17：大爱超市             24：善源商场             
     */
    public void setGoodsProjectType(Byte goodsProjectType) {
        this.goodsProjectType = goodsProjectType;
    }

    /**
     * 订单状态             10:订单提交成功；             20:订单待处理；             30:订单处理完成             40:订单成功完成             50:订单取消             
     * @return order_status 订单状态             10:订单提交成功；             20:订单待处理；             30:订单处理完成             40:订单成功完成             50:订单取消             
     */
    public Byte getOrderStatus() {
        return orderStatus;
    }

    /**
     * 订单状态             10:订单提交成功；             20:订单待处理；             30:订单处理完成             40:订单成功完成             50:订单取消             
     * @param orderStatus 订单状态             10:订单提交成功；             20:订单待处理；             30:订单处理完成             40:订单成功完成             50:订单取消             
     */
    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 订单取消原因
     * @return order_cancle_reason 订单取消原因
     */
    public String getOrderCancleReason() {
        return orderCancleReason;
    }

    /**
     * 订单取消原因
     * @param orderCancleReason 订单取消原因
     */
    public void setOrderCancleReason(String orderCancleReason) {
        this.orderCancleReason = orderCancleReason == null ? null : orderCancleReason.trim();
    }

    /**
     * 支付类型             10:offline             20:online             
     * @return pay_type 支付类型             10:offline             20:online             
     */
    public Byte getPayType() {
        return payType;
    }

    /**
     * 支付类型             10:offline             20:online             
     * @param payType 支付类型             10:offline             20:online             
     */
    public void setPayType(Byte payType) {
        this.payType = payType;
    }

    /**
     * 支付网关             boc：中银支付             alipayna:支付宝原生支付             alipayh5:支付宝wap支付             wechatna：微信app支付             wechatmp：微信公众号             
     * @return pay_center 支付网关             boc：中银支付             alipayna:支付宝原生支付             alipayh5:支付宝wap支付             wechatna：微信app支付             wechatmp：微信公众号             
     */
    public String getPayCenter() {
        return payCenter;
    }

    /**
     * 支付网关             boc：中银支付             alipayna:支付宝原生支付             alipayh5:支付宝wap支付             wechatna：微信app支付             wechatmp：微信公众号             
     * @param payCenter 支付网关             boc：中银支付             alipayna:支付宝原生支付             alipayh5:支付宝wap支付             wechatna：微信app支付             wechatmp：微信公众号             
     */
    public void setPayCenter(String payCenter) {
        this.payCenter = payCenter == null ? null : payCenter.trim();
    }

    /**
     * 支付状态             10:待付款             19:付款成功             20:待退款             29:退款成功             
     * @return pay_status 支付状态             10:待付款             19:付款成功             20:待退款             29:退款成功             
     */
    public Byte getPayStatus() {
        return payStatus;
    }

    /**
     * 支付状态             10:待付款             19:付款成功             20:待退款             29:退款成功             
     * @param payStatus 支付状态             10:待付款             19:付款成功             20:待退款             29:退款成功             
     */
    public void setPayStatus(Byte payStatus) {
        this.payStatus = payStatus;
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
     * 售后单状态             0:未提交售后信息             10:提交售后请求             20:待售后发货             29:待卖家确认             30:退货完成             40:退货拒绝
     * @return cust_service_status 售后单状态             0:未提交售后信息             10:提交售后请求             20:待售后发货             29:待卖家确认             30:退货完成             40:退货拒绝
     */
    public Byte getCustServiceStatus() {
        return custServiceStatus;
    }

    /**
     * 售后单状态             0:未提交售后信息             10:提交售后请求             20:待售后发货             29:待卖家确认             30:退货完成             40:退货拒绝
     * @param custServiceStatus 售后单状态             0:未提交售后信息             10:提交售后请求             20:待售后发货             29:待卖家确认             30:退货完成             40:退货拒绝
     */
    public void setCustServiceStatus(Byte custServiceStatus) {
        this.custServiceStatus = custServiceStatus;
    }

    /**
     * 订单全部费用
     * @return order_all_price 订单全部费用
     */
    public Integer getOrderAllPrice() {
        return orderAllPrice;
    }

    /**
     * 订单全部费用
     * @param orderAllPrice 订单全部费用
     */
    public void setOrderAllPrice(Integer orderAllPrice) {
        this.orderAllPrice = orderAllPrice;
    }

    /**
     * 订单商品费用
     * @return order_goods_price 订单商品费用
     */
    public Integer getOrderGoodsPrice() {
        return orderGoodsPrice;
    }

    /**
     * 订单商品费用
     * @param orderGoodsPrice 订单商品费用
     */
    public void setOrderGoodsPrice(Integer orderGoodsPrice) {
        this.orderGoodsPrice = orderGoodsPrice;
    }

    /**
     * 订单物流费用
     * @return order_logist_price 订单物流费用
     */
    public Integer getOrderLogistPrice() {
        return orderLogistPrice;
    }

    /**
     * 订单物流费用
     * @param orderLogistPrice 订单物流费用
     */
    public void setOrderLogistPrice(Integer orderLogistPrice) {
        this.orderLogistPrice = orderLogistPrice;
    }

    /**
     * 订单优惠券费用
     * @return order_voucher_price 订单优惠券费用
     */
    public Integer getOrderVoucherPrice() {
        return orderVoucherPrice;
    }

    /**
     * 订单优惠券费用
     * @param orderVoucherPrice 订单优惠券费用
     */
    public void setOrderVoucherPrice(Integer orderVoucherPrice) {
        this.orderVoucherPrice = orderVoucherPrice;
    }

    /**
     * 订单使用扶贫码费用
     * @return order_coupon_price 订单使用扶贫码费用
     */
    public Integer getOrderCouponPrice() {
        return orderCouponPrice;
    }

    /**
     * 订单使用扶贫码费用
     * @param orderCouponPrice 订单使用扶贫码费用
     */
    public void setOrderCouponPrice(Integer orderCouponPrice) {
        this.orderCouponPrice = orderCouponPrice;
    }

    /**
     * 订单使用积分数
     * @return order_used_point 订单使用积分数
     */
    public Integer getOrderUsedPoint() {
        return orderUsedPoint;
    }

    /**
     * 订单使用积分数
     * @param orderUsedPoint 订单使用积分数
     */
    public void setOrderUsedPoint(Integer orderUsedPoint) {
        this.orderUsedPoint = orderUsedPoint;
    }

    /**
     * 订单支付费用
     * @return order_pay_fee 订单支付费用
     */
    public Integer getOrderPayFee() {
        return orderPayFee;
    }

    /**
     * 订单支付费用
     * @param orderPayFee 订单支付费用
     */
    public void setOrderPayFee(Integer orderPayFee) {
        this.orderPayFee = orderPayFee;
    }

    /**
     * 订单创建时间
     * @return order_create_time 订单创建时间
     */
    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    /**
     * 订单创建时间
     * @param orderCreateTime 订单创建时间
     */
    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    /**
     * 订单支付时间
     * @return order_pay_time 订单支付时间
     */
    public Date getOrderPayTime() {
        return orderPayTime;
    }

    /**
     * 订单支付时间
     * @param orderPayTime 订单支付时间
     */
    public void setOrderPayTime(Date orderPayTime) {
        this.orderPayTime = orderPayTime;
    }

    /**
     * 订单发货时间
     * @return order_send_time 订单发货时间
     */
    public Date getOrderSendTime() {
        return orderSendTime;
    }

    /**
     * 订单发货时间
     * @param orderSendTime 订单发货时间
     */
    public void setOrderSendTime(Date orderSendTime) {
        this.orderSendTime = orderSendTime;
    }

    /**
     * 订单签收时间
     * @return order_check_time 订单签收时间
     */
    public Date getOrderCheckTime() {
        return orderCheckTime;
    }

    /**
     * 订单签收时间
     * @param orderCheckTime 订单签收时间
     */
    public void setOrderCheckTime(Date orderCheckTime) {
        this.orderCheckTime = orderCheckTime;
    }

    /**
     * 订单评价状态             0:未评价             10:已经评价             12:超时，默认好评
     * @return order_eva_status 订单评价状态             0:未评价             10:已经评价             12:超时，默认好评
     */
    public Byte getOrderEvaStatus() {
        return orderEvaStatus;
    }

    /**
     * 订单评价状态             0:未评价             10:已经评价             12:超时，默认好评
     * @param orderEvaStatus 订单评价状态             0:未评价             10:已经评价             12:超时，默认好评
     */
    public void setOrderEvaStatus(Byte orderEvaStatus) {
        this.orderEvaStatus = orderEvaStatus;
    }

    /**
     * 订单删除标志位
     * @return is_delete 订单删除标志位
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * 订单删除标志位
     * @param isDelete 订单删除标志位
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 最近更新时间
     * @return update_time 最近更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 最近更新时间
     * @param updateTime 最近更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 订单冗余字段1
     * @return other_info1 订单冗余字段1
     */
    public String getOtherInfo1() {
        return otherInfo1;
    }

    /**
     * 订单冗余字段1
     * @param otherInfo1 订单冗余字段1
     */
    public void setOtherInfo1(String otherInfo1) {
        this.otherInfo1 = otherInfo1 == null ? null : otherInfo1.trim();
    }

    /**
     * 订单冗余字段2
     * @return other_info2 订单冗余字段2
     */
    public String getOtherInfo2() {
        return otherInfo2;
    }

    /**
     * 订单冗余字段2
     * @param otherInfo2 订单冗余字段2
     */
    public void setOtherInfo2(String otherInfo2) {
        this.otherInfo2 = otherInfo2 == null ? null : otherInfo2.trim();
    }
}