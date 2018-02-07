package com.shanyuan.platform.ms.dao.omorder.entity;

import java.util.Date;

/**
 * 描述:om_order_payment表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-11-13
 */
public class OmOrderPayment {
    /**
     * 支付单id
     */
    private String payId;

    /**
     * 订单id
     */
    private String orderId;

    /**
     * 主订单id
     */
    private String mainId;

    /**
     * 支付网关             boc：中银支付             alipayna:支付宝原生支付             alipayh5:支付宝wap支付             wechatna：微信app支付             wechatmp：微信公众号             
     */
    private String payCenter;

    /**
     * 支付状态             10:待付款             19:付款成功             20:待退款             29:退款成功             
     */
    private Byte payStatus;

    /**
     * 支付金额
     */
    private Integer payFee;

    /**
     * 统一下单id
     */
    private String outtradeId;

    /**
     * 支付流水号
     */
    private String paySerial;

    /**
     * 支付创建时间
     */
    private Date payReqTime;

    /**
     * 支付请求报文
     */
    private String payReqMsg;

    /**
     * 支付通知时间
     */
    private Date payNotifyTime;

    /**
     * 支付通知报文
     */
    private String payNotifyMsg;

    /**
     * 支付对账状态             0:未对账             1:对账成功
     */
    private Byte payCheck;

    /**
     * 退款流水号
     */
    private String refundSerial;

    /**
     * 退款发起时间
     */
    private Date refundReqTime;

    /**
     * 退款请求报文
     */
    private String refundReqMsg;

    /**
     * 退款应答时间
     */
    private Date refundRespTime;

    /**
     * 退款应答报文
     */
    private String refundRespMsg;

    /**
     * 退款对账状态             0:未对账             1:对账成功
     */
    private Byte refundCheck;

    /**
     * 记录创建时间
     */
    private Date createTime;

    /**
     * 记录更新时间
     */
    private Date updateTime;

    /**
     * 支付单id
     * @return pay_id 支付单id
     */
    public String getPayId() {
        return payId;
    }

    /**
     * 支付单id
     * @param payId 支付单id
     */
    public void setPayId(String payId) {
        this.payId = payId == null ? null : payId.trim();
    }

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
     * 支付金额
     * @return pay_fee 支付金额
     */
    public Integer getPayFee() {
        return payFee;
    }

    /**
     * 支付金额
     * @param payFee 支付金额
     */
    public void setPayFee(Integer payFee) {
        this.payFee = payFee;
    }

    /**
     * 统一下单id
     * @return outtrade_id 统一下单id
     */
    public String getOuttradeId() {
        return outtradeId;
    }

    /**
     * 统一下单id
     * @param outtradeId 统一下单id
     */
    public void setOuttradeId(String outtradeId) {
        this.outtradeId = outtradeId == null ? null : outtradeId.trim();
    }

    /**
     * 支付流水号
     * @return pay_serial 支付流水号
     */
    public String getPaySerial() {
        return paySerial;
    }

    /**
     * 支付流水号
     * @param paySerial 支付流水号
     */
    public void setPaySerial(String paySerial) {
        this.paySerial = paySerial == null ? null : paySerial.trim();
    }

    /**
     * 支付创建时间
     * @return pay_req_time 支付创建时间
     */
    public Date getPayReqTime() {
        return payReqTime;
    }

    /**
     * 支付创建时间
     * @param payReqTime 支付创建时间
     */
    public void setPayReqTime(Date payReqTime) {
        this.payReqTime = payReqTime;
    }

    /**
     * 支付请求报文
     * @return pay_req_msg 支付请求报文
     */
    public String getPayReqMsg() {
        return payReqMsg;
    }

    /**
     * 支付请求报文
     * @param payReqMsg 支付请求报文
     */
    public void setPayReqMsg(String payReqMsg) {
        this.payReqMsg = payReqMsg == null ? null : payReqMsg.trim();
    }

    /**
     * 支付通知时间
     * @return pay_notify_time 支付通知时间
     */
    public Date getPayNotifyTime() {
        return payNotifyTime;
    }

    /**
     * 支付通知时间
     * @param payNotifyTime 支付通知时间
     */
    public void setPayNotifyTime(Date payNotifyTime) {
        this.payNotifyTime = payNotifyTime;
    }

    /**
     * 支付通知报文
     * @return pay_notify_msg 支付通知报文
     */
    public String getPayNotifyMsg() {
        return payNotifyMsg;
    }

    /**
     * 支付通知报文
     * @param payNotifyMsg 支付通知报文
     */
    public void setPayNotifyMsg(String payNotifyMsg) {
        this.payNotifyMsg = payNotifyMsg == null ? null : payNotifyMsg.trim();
    }

    /**
     * 支付对账状态             0:未对账             1:对账成功
     * @return pay_check 支付对账状态             0:未对账             1:对账成功
     */
    public Byte getPayCheck() {
        return payCheck;
    }

    /**
     * 支付对账状态             0:未对账             1:对账成功
     * @param payCheck 支付对账状态             0:未对账             1:对账成功
     */
    public void setPayCheck(Byte payCheck) {
        this.payCheck = payCheck;
    }

    /**
     * 退款流水号
     * @return refund_serial 退款流水号
     */
    public String getRefundSerial() {
        return refundSerial;
    }

    /**
     * 退款流水号
     * @param refundSerial 退款流水号
     */
    public void setRefundSerial(String refundSerial) {
        this.refundSerial = refundSerial == null ? null : refundSerial.trim();
    }

    /**
     * 退款发起时间
     * @return refund_req_time 退款发起时间
     */
    public Date getRefundReqTime() {
        return refundReqTime;
    }

    /**
     * 退款发起时间
     * @param refundReqTime 退款发起时间
     */
    public void setRefundReqTime(Date refundReqTime) {
        this.refundReqTime = refundReqTime;
    }

    /**
     * 退款请求报文
     * @return refund_req_msg 退款请求报文
     */
    public String getRefundReqMsg() {
        return refundReqMsg;
    }

    /**
     * 退款请求报文
     * @param refundReqMsg 退款请求报文
     */
    public void setRefundReqMsg(String refundReqMsg) {
        this.refundReqMsg = refundReqMsg == null ? null : refundReqMsg.trim();
    }

    /**
     * 退款应答时间
     * @return refund_resp_time 退款应答时间
     */
    public Date getRefundRespTime() {
        return refundRespTime;
    }

    /**
     * 退款应答时间
     * @param refundRespTime 退款应答时间
     */
    public void setRefundRespTime(Date refundRespTime) {
        this.refundRespTime = refundRespTime;
    }

    /**
     * 退款应答报文
     * @return refund_resp_msg 退款应答报文
     */
    public String getRefundRespMsg() {
        return refundRespMsg;
    }

    /**
     * 退款应答报文
     * @param refundRespMsg 退款应答报文
     */
    public void setRefundRespMsg(String refundRespMsg) {
        this.refundRespMsg = refundRespMsg == null ? null : refundRespMsg.trim();
    }

    /**
     * 退款对账状态             0:未对账             1:对账成功
     * @return refund_check 退款对账状态             0:未对账             1:对账成功
     */
    public Byte getRefundCheck() {
        return refundCheck;
    }

    /**
     * 退款对账状态             0:未对账             1:对账成功
     * @param refundCheck 退款对账状态             0:未对账             1:对账成功
     */
    public void setRefundCheck(Byte refundCheck) {
        this.refundCheck = refundCheck;
    }

    /**
     * 记录创建时间
     * @return create_time 记录创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 记录创建时间
     * @param createTime 记录创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 记录更新时间
     * @return update_time 记录更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 记录更新时间
     * @param updateTime 记录更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}