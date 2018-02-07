package com.shanyuan.platform.ms.dao.order.entity;

import java.math.BigDecimal;

/**
 * 描述:sy_order_coupon表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-10-16
 */
public class SyOrderCoupon {
    /**
     * šłĽťĒģ
     */
    private Integer ocId;

    /**
     * ŤģĘŚćēid
     */
    private Integer orderId;

    /**
     * Ťī≠šĻįšļļid
     */
    private Integer buyerId;

    /**
     * Ťī≠ÁČ©ŚäĶÁĒĶŚ≠źÁ†Ā
     */
    private String couponCode;

    /**
     * Ťī≠ÁČ©ŚäĶśĒĮšĽėťáĎťĘĚŚćēšĹćŚąÜ
     */
    private BigDecimal pay;

    /**
     * Ťī≠ÁČ©ŚäĶÁĒüśąźśČĻś¨°ŚŹ∑
     */
    private Long couponBatchSn;

    /**
     * ś∑ĽŚä†śó∂ťóī
     */
    private Integer addtime;

    /**
     * šłĽťĒģ
     * @return oc_id šłĽťĒģ
     */
    public Integer getOcId() {
        return ocId;
    }

    /**
     * šłĽťĒģ
     * @param ocId šłĽťĒģ
     */
    public void setOcId(Integer ocId) {
        this.ocId = ocId;
    }

    /**
     * ŤģĘŚćēid
     * @return order_id ŤģĘŚćēid
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * ŤģĘŚćēid
     * @param orderId ŤģĘŚćēid
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * Ťī≠šĻįšļļid
     * @return buyer_id Ťī≠šĻįšļļid
     */
    public Integer getBuyerId() {
        return buyerId;
    }

    /**
     * Ťī≠šĻįšļļid
     * @param buyerId Ťī≠šĻįšļļid
     */
    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * Ťī≠ÁČ©ŚäĶÁĒĶŚ≠źÁ†Ā
     * @return coupon_code Ťī≠ÁČ©ŚäĶÁĒĶŚ≠źÁ†Ā
     */
    public String getCouponCode() {
        return couponCode;
    }

    /**
     * Ťī≠ÁČ©ŚäĶÁĒĶŚ≠źÁ†Ā
     * @param couponCode Ťī≠ÁČ©ŚäĶÁĒĶŚ≠źÁ†Ā
     */
    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode == null ? null : couponCode.trim();
    }

    /**
     * Ťī≠ÁČ©ŚäĶśĒĮšĽėťáĎťĘĚŚćēšĹćŚąÜ
     * @return pay Ťī≠ÁČ©ŚäĶśĒĮšĽėťáĎťĘĚŚćēšĹćŚąÜ
     */
    public BigDecimal getPay() {
        return pay;
    }

    /**
     * Ťī≠ÁČ©ŚäĶśĒĮšĽėťáĎťĘĚŚćēšĹćŚąÜ
     * @param pay Ťī≠ÁČ©ŚäĶśĒĮšĽėťáĎťĘĚŚćēšĹćŚąÜ
     */
    public void setPay(BigDecimal pay) {
        this.pay = pay;
    }

    /**
     * Ťī≠ÁČ©ŚäĶÁĒüśąźśČĻś¨°ŚŹ∑
     * @return coupon_batch_sn Ťī≠ÁČ©ŚäĶÁĒüśąźśČĻś¨°ŚŹ∑
     */
    public Long getCouponBatchSn() {
        return couponBatchSn;
    }

    /**
     * Ťī≠ÁČ©ŚäĶÁĒüśąźśČĻś¨°ŚŹ∑
     * @param couponBatchSn Ťī≠ÁČ©ŚäĶÁĒüśąźśČĻś¨°ŚŹ∑
     */
    public void setCouponBatchSn(Long couponBatchSn) {
        this.couponBatchSn = couponBatchSn;
    }

    /**
     * ś∑ĽŚä†śó∂ťóī
     * @return addtime ś∑ĽŚä†śó∂ťóī
     */
    public Integer getAddtime() {
        return addtime;
    }

    /**
     * ś∑ĽŚä†śó∂ťóī
     * @param addtime ś∑ĽŚä†śó∂ťóī
     */
    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }
}