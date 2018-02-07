package com.shanyuan.platform.ms.dao.omorder.entity;

/**
 * 描述:om_order_settlement表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-11-10
 */
public class OmOrderSettlement {
    /**
     * 订单id
     */
    private String orderId;

    /**
     * 主订单id
     */
    private String mainId;

    /**
     * 支付网关费率 千分位
     */
    private Integer handingRate;

    /**
     * 支付手续费
     */
    private Integer handingFee;

    /**
     * 捐赠基数 分
     */
    private Integer baseFee;

    /**
     * 赠送积分比率
     */
    private Integer sendPointRate;

    /**
     * 赠送分数量
     */
    private Integer sendPoint;

    /**
     * 贫困户帮扶费率 千分位
     */
    private Integer helpRate;

    /**
     * 贫困户帮扶金额
     */
    private Integer helpFee;

    /**
     * 公益基金会费率 千分位
     */
    private Integer fundRate;

    /**
     * 公益基金会捐献金额
     */
    private Integer fundFee;

    /**
     * 卖家获得费用 f分
     */
    private Integer sellerIncome;

    /**
     * 
     */
    private String column13;

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
     * 支付网关费率 千分位
     * @return handing_rate 支付网关费率 千分位
     */
    public Integer getHandingRate() {
        return handingRate;
    }

    /**
     * 支付网关费率 千分位
     * @param handingRate 支付网关费率 千分位
     */
    public void setHandingRate(Integer handingRate) {
        this.handingRate = handingRate;
    }

    /**
     * 支付手续费
     * @return handing_fee 支付手续费
     */
    public Integer getHandingFee() {
        return handingFee;
    }

    /**
     * 支付手续费
     * @param handingFee 支付手续费
     */
    public void setHandingFee(Integer handingFee) {
        this.handingFee = handingFee;
    }

    /**
     * 捐赠基数 分
     * @return base_fee 捐赠基数 分
     */
    public Integer getBaseFee() {
        return baseFee;
    }

    /**
     * 捐赠基数 分
     * @param baseFee 捐赠基数 分
     */
    public void setBaseFee(Integer baseFee) {
        this.baseFee = baseFee;
    }

    /**
     * 赠送积分比率
     * @return send_point_rate 赠送积分比率
     */
    public Integer getSendPointRate() {
        return sendPointRate;
    }

    /**
     * 赠送积分比率
     * @param sendPointRate 赠送积分比率
     */
    public void setSendPointRate(Integer sendPointRate) {
        this.sendPointRate = sendPointRate;
    }

    /**
     * 赠送分数量
     * @return send_point 赠送分数量
     */
    public Integer getSendPoint() {
        return sendPoint;
    }

    /**
     * 赠送分数量
     * @param sendPoint 赠送分数量
     */
    public void setSendPoint(Integer sendPoint) {
        this.sendPoint = sendPoint;
    }

    /**
     * 贫困户帮扶费率 千分位
     * @return help_rate 贫困户帮扶费率 千分位
     */
    public Integer getHelpRate() {
        return helpRate;
    }

    /**
     * 贫困户帮扶费率 千分位
     * @param helpRate 贫困户帮扶费率 千分位
     */
    public void setHelpRate(Integer helpRate) {
        this.helpRate = helpRate;
    }

    /**
     * 贫困户帮扶金额
     * @return help_fee 贫困户帮扶金额
     */
    public Integer getHelpFee() {
        return helpFee;
    }

    /**
     * 贫困户帮扶金额
     * @param helpFee 贫困户帮扶金额
     */
    public void setHelpFee(Integer helpFee) {
        this.helpFee = helpFee;
    }

    /**
     * 公益基金会费率 千分位
     * @return fund_rate 公益基金会费率 千分位
     */
    public Integer getFundRate() {
        return fundRate;
    }

    /**
     * 公益基金会费率 千分位
     * @param fundRate 公益基金会费率 千分位
     */
    public void setFundRate(Integer fundRate) {
        this.fundRate = fundRate;
    }

    /**
     * 公益基金会捐献金额
     * @return fund_fee 公益基金会捐献金额
     */
    public Integer getFundFee() {
        return fundFee;
    }

    /**
     * 公益基金会捐献金额
     * @param fundFee 公益基金会捐献金额
     */
    public void setFundFee(Integer fundFee) {
        this.fundFee = fundFee;
    }

    /**
     * 卖家获得费用 f分
     * @return seller_income 卖家获得费用 f分
     */
    public Integer getSellerIncome() {
        return sellerIncome;
    }

    /**
     * 卖家获得费用 f分
     * @param sellerIncome 卖家获得费用 f分
     */
    public void setSellerIncome(Integer sellerIncome) {
        this.sellerIncome = sellerIncome;
    }

    /**
     * 
     * @return Column_13 
     */
    public String getColumn13() {
        return column13;
    }

    /**
     * 
     * @param column13 
     */
    public void setColumn13(String column13) {
        this.column13 = column13 == null ? null : column13.trim();
    }
}