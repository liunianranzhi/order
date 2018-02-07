package com.shanyuan.platform.ms.dao.biz.entity;

/**
 * 描述:sy_biz_order表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2018-01-03
 */
public class SyBizOrder {
    /**
     * 主键id
     */
    private Integer orderId;

    /**
     * 订单索引id
     */
    private Integer mainOrderId;

    /**
     * 收货信息
     */
    private String reciverInfo;

    /**
     * 主键id
     * @return order_id 主键id
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 主键id
     * @param orderId 主键id
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

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
     * 收货信息
     * @return reciver_info 收货信息
     */
    public String getReciverInfo() {
        return reciverInfo;
    }

    /**
     * 收货信息
     * @param reciverInfo 收货信息
     */
    public void setReciverInfo(String reciverInfo) {
        this.reciverInfo = reciverInfo == null ? null : reciverInfo.trim();
    }
}