package com.shanyuan.platform.ms.dao.order.entity;
/**
 * 描述:sy_order_pay表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-10-18
 */
public class SyOrderPay {
    /**
     * 
     */
    private Integer payId;

    /**
     * 支付单号
     */
    private Long paySn;

    /**
     * 买家ID
     */
    private Integer buyerId;

    /**
     * 0默认未支付1已支付(只有第三方支付接口通知到时才会更改此状态)
     */
    private String apiPayState;

    /**
     * 
     * @return pay_id 
     */
    public Integer getPayId() {
        return payId;
    }

    /**
     * 
     * @param payId 
     */
    public void setPayId(Integer payId) {
        this.payId = payId;
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
     * 0默认未支付1已支付(只有第三方支付接口通知到时才会更改此状态)
     * @return api_pay_state 0默认未支付1已支付(只有第三方支付接口通知到时才会更改此状态)
     */
    public String getApiPayState() {
        return apiPayState;
    }

    /**
     * 0默认未支付1已支付(只有第三方支付接口通知到时才会更改此状态)
     * @param apiPayState 0默认未支付1已支付(只有第三方支付接口通知到时才会更改此状态)
     */
    public void setApiPayState(String apiPayState) {
        this.apiPayState = apiPayState == null ? null : apiPayState.trim();
    }
}