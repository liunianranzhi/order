package com.shanyuan.platform.ms.dao.omorder.entity;

import java.util.Date;

/**
 * 描述:om_order_logist表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-11-10
 */
public class OmOrderLog {
    /**
     * 记录id
     */
    private Integer recId;

    /**
     * 订单id
     */
    private String orderId;

    /**
     * 主订单id
     */
    private String mainId;

    /**
     * 地址id
     */
    private Integer reciverAddrId;

    /**
     * 收货人姓名
     */
    private String reciverName;

    /**
     * 收货人手机号
     */
    private String reciverPhone;

    /**
     * 收货省份
     */
    private Integer reciverProvId;

    /**
     * 收货城市
     */
    private Integer reciverCityId;

    /**
     * 收货区县
     */
    private Integer reciverAreaId;

    /**
     * 收获地址明细
     */
    private String reciverAddrInfo;

    /**
     * 发货地址id
     */
    private Integer deliverAddrId;

    /**
     * 发货备注
     */
    private String deliverMsg;

    /**
     * 发货时间
     */
    private Date deliverTime;

    /**
     * 配送公司
     */
    private String shippingId;

    /**
     * 物流单号
     */
    private String shippingSn;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 记录id
     * @return rec_id 记录id
     */
    public Integer getRecId() {
        return recId;
    }

    /**
     * 记录id
     * @param recId 记录id
     */
    public void setRecId(Integer recId) {
        this.recId = recId;
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
     * 地址id
     * @return reciver_addr_id 地址id
     */
    public Integer getReciverAddrId() {
        return reciverAddrId;
    }

    /**
     * 地址id
     * @param reciverAddrId 地址id
     */
    public void setReciverAddrId(Integer reciverAddrId) {
        this.reciverAddrId = reciverAddrId;
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
     * 收货人手机号
     * @return reciver_phone 收货人手机号
     */
    public String getReciverPhone() {
        return reciverPhone;
    }

    /**
     * 收货人手机号
     * @param reciverPhone 收货人手机号
     */
    public void setReciverPhone(String reciverPhone) {
        this.reciverPhone = reciverPhone == null ? null : reciverPhone.trim();
    }

    /**
     * 收货省份
     * @return reciver_prov_id 收货省份
     */
    public Integer getReciverProvId() {
        return reciverProvId;
    }

    /**
     * 收货省份
     * @param reciverProvId 收货省份
     */
    public void setReciverProvId(Integer reciverProvId) {
        this.reciverProvId = reciverProvId;
    }

    /**
     * 收货城市
     * @return reciver_city_id 收货城市
     */
    public Integer getReciverCityId() {
        return reciverCityId;
    }

    /**
     * 收货城市
     * @param reciverCityId 收货城市
     */
    public void setReciverCityId(Integer reciverCityId) {
        this.reciverCityId = reciverCityId;
    }

    /**
     * 收货区县
     * @return reciver_area_id 收货区县
     */
    public Integer getReciverAreaId() {
        return reciverAreaId;
    }

    /**
     * 收货区县
     * @param reciverAreaId 收货区县
     */
    public void setReciverAreaId(Integer reciverAreaId) {
        this.reciverAreaId = reciverAreaId;
    }

    /**
     * 收获地址明细
     * @return reciver_addr_info 收获地址明细
     */
    public String getReciverAddrInfo() {
        return reciverAddrInfo;
    }

    /**
     * 收获地址明细
     * @param reciverAddrInfo 收获地址明细
     */
    public void setReciverAddrInfo(String reciverAddrInfo) {
        this.reciverAddrInfo = reciverAddrInfo == null ? null : reciverAddrInfo.trim();
    }

    /**
     * 发货地址id
     * @return deliver_addr_id 发货地址id
     */
    public Integer getDeliverAddrId() {
        return deliverAddrId;
    }

    /**
     * 发货地址id
     * @param deliverAddrId 发货地址id
     */
    public void setDeliverAddrId(Integer deliverAddrId) {
        this.deliverAddrId = deliverAddrId;
    }

    /**
     * 发货备注
     * @return deliver_msg 发货备注
     */
    public String getDeliverMsg() {
        return deliverMsg;
    }

    /**
     * 发货备注
     * @param deliverMsg 发货备注
     */
    public void setDeliverMsg(String deliverMsg) {
        this.deliverMsg = deliverMsg == null ? null : deliverMsg.trim();
    }

    /**
     * 发货时间
     * @return deliver_time 发货时间
     */
    public Date getDeliverTime() {
        return deliverTime;
    }

    /**
     * 发货时间
     * @param deliverTime 发货时间
     */
    public void setDeliverTime(Date deliverTime) {
        this.deliverTime = deliverTime;
    }

    /**
     * 配送公司
     * @return shipping_id 配送公司
     */
    public String getShippingId() {
        return shippingId;
    }

    /**
     * 配送公司
     * @param shippingId 配送公司
     */
    public void setShippingId(String shippingId) {
        this.shippingId = shippingId == null ? null : shippingId.trim();
    }

    /**
     * 物流单号
     * @return shipping_sn 物流单号
     */
    public String getShippingSn() {
        return shippingSn;
    }

    /**
     * 物流单号
     * @param shippingSn 物流单号
     */
    public void setShippingSn(String shippingSn) {
        this.shippingSn = shippingSn == null ? null : shippingSn.trim();
    }

    /**
     * 备注
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改时间
     * @return update_time 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 修改时间
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}