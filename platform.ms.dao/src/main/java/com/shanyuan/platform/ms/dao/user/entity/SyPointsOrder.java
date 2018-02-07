package com.shanyuan.platform.ms.dao.user.entity;

import java.math.BigDecimal;

/**
 * 描述:sy_points_order表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-10-17
 */
public class SyPointsOrder {
    /**
     * 兑换订单编号
     */
    private Integer pointOrderid;

    /**
     * 兑换订单编号
     */
    private String pointOrdersn;

    /**
     * 兑换会员id
     */
    private Integer pointBuyerid;

    /**
     * 兑换会员姓名
     */
    private String pointBuyername;

    /**
     * 兑换会员email
     */
    private String pointBuyeremail;

    /**
     * 兑换订单生成时间
     */
    private Integer pointAddtime;

    /**
     * 支付方式id
     */
    private Integer pointPaymentid;

    /**
     * 支付方式名称
     */
    private String pointPaymentname;

    /**
     * 支付方式名称代码
     */
    private String pointPaymentcode;

    /**
     * 支付类型:1是即时到帐,2是但保交易
     */
    private Byte pointPaymentdirect;

    /**
     * 订单编号，外部支付时使用，有些外部支付系统要求特定的订单编号
     */
    private String pointOutsn;

    /**
     * 支付(付款)时间
     */
    private Integer pointPaymenttime;

    /**
     * 支付留言
     */
    private String pointPaymessage;

    /**
     * 配送时间
     */
    private Integer pointShippingtime;

    /**
     * 物流单号
     */
    private String pointShippingcode;

    /**
     * 发货描述
     */
    private String pointShippingdesc;

    /**
     * 外部交易平台单独使用的标识字符串
     */
    private String pointOutpaymentcode;

    /**
     * 订单完成时间
     */
    private Integer pointFinnshedtime;

    /**
     * 兑换总积分
     */
    private Integer pointAllpoint;

    /**
     * 兑换订单总金额
     */
    private BigDecimal pointOrderamount;

    /**
     * 运费承担方式 0表示卖家 1表示买家
     */
    private Byte pointShippingcharge;

    /**
     * 运费金额
     */
    private BigDecimal pointShippingfee;

    /**
     * 订单留言
     */
    private String pointOrdermessage;

    /**
     * 订单状态：10(默认):未付款;11已付款;20:确认付款;30:已发货;40:已收货;50已完成;2已取消
     */
    private Integer pointOrderstate;

    /**
     * 兑换订单编号
     * @return point_orderid 兑换订单编号
     */
    public Integer getPointOrderid() {
        return pointOrderid;
    }

    /**
     * 兑换订单编号
     * @param pointOrderid 兑换订单编号
     */
    public void setPointOrderid(Integer pointOrderid) {
        this.pointOrderid = pointOrderid;
    }

    /**
     * 兑换订单编号
     * @return point_ordersn 兑换订单编号
     */
    public String getPointOrdersn() {
        return pointOrdersn;
    }

    /**
     * 兑换订单编号
     * @param pointOrdersn 兑换订单编号
     */
    public void setPointOrdersn(String pointOrdersn) {
        this.pointOrdersn = pointOrdersn == null ? null : pointOrdersn.trim();
    }

    /**
     * 兑换会员id
     * @return point_buyerid 兑换会员id
     */
    public Integer getPointBuyerid() {
        return pointBuyerid;
    }

    /**
     * 兑换会员id
     * @param pointBuyerid 兑换会员id
     */
    public void setPointBuyerid(Integer pointBuyerid) {
        this.pointBuyerid = pointBuyerid;
    }

    /**
     * 兑换会员姓名
     * @return point_buyername 兑换会员姓名
     */
    public String getPointBuyername() {
        return pointBuyername;
    }

    /**
     * 兑换会员姓名
     * @param pointBuyername 兑换会员姓名
     */
    public void setPointBuyername(String pointBuyername) {
        this.pointBuyername = pointBuyername == null ? null : pointBuyername.trim();
    }

    /**
     * 兑换会员email
     * @return point_buyeremail 兑换会员email
     */
    public String getPointBuyeremail() {
        return pointBuyeremail;
    }

    /**
     * 兑换会员email
     * @param pointBuyeremail 兑换会员email
     */
    public void setPointBuyeremail(String pointBuyeremail) {
        this.pointBuyeremail = pointBuyeremail == null ? null : pointBuyeremail.trim();
    }

    /**
     * 兑换订单生成时间
     * @return point_addtime 兑换订单生成时间
     */
    public Integer getPointAddtime() {
        return pointAddtime;
    }

    /**
     * 兑换订单生成时间
     * @param pointAddtime 兑换订单生成时间
     */
    public void setPointAddtime(Integer pointAddtime) {
        this.pointAddtime = pointAddtime;
    }

    /**
     * 支付方式id
     * @return point_paymentid 支付方式id
     */
    public Integer getPointPaymentid() {
        return pointPaymentid;
    }

    /**
     * 支付方式id
     * @param pointPaymentid 支付方式id
     */
    public void setPointPaymentid(Integer pointPaymentid) {
        this.pointPaymentid = pointPaymentid;
    }

    /**
     * 支付方式名称
     * @return point_paymentname 支付方式名称
     */
    public String getPointPaymentname() {
        return pointPaymentname;
    }

    /**
     * 支付方式名称
     * @param pointPaymentname 支付方式名称
     */
    public void setPointPaymentname(String pointPaymentname) {
        this.pointPaymentname = pointPaymentname == null ? null : pointPaymentname.trim();
    }

    /**
     * 支付方式名称代码
     * @return point_paymentcode 支付方式名称代码
     */
    public String getPointPaymentcode() {
        return pointPaymentcode;
    }

    /**
     * 支付方式名称代码
     * @param pointPaymentcode 支付方式名称代码
     */
    public void setPointPaymentcode(String pointPaymentcode) {
        this.pointPaymentcode = pointPaymentcode == null ? null : pointPaymentcode.trim();
    }

    /**
     * 支付类型:1是即时到帐,2是但保交易
     * @return point_paymentdirect 支付类型:1是即时到帐,2是但保交易
     */
    public Byte getPointPaymentdirect() {
        return pointPaymentdirect;
    }

    /**
     * 支付类型:1是即时到帐,2是但保交易
     * @param pointPaymentdirect 支付类型:1是即时到帐,2是但保交易
     */
    public void setPointPaymentdirect(Byte pointPaymentdirect) {
        this.pointPaymentdirect = pointPaymentdirect;
    }

    /**
     * 订单编号，外部支付时使用，有些外部支付系统要求特定的订单编号
     * @return point_outsn 订单编号，外部支付时使用，有些外部支付系统要求特定的订单编号
     */
    public String getPointOutsn() {
        return pointOutsn;
    }

    /**
     * 订单编号，外部支付时使用，有些外部支付系统要求特定的订单编号
     * @param pointOutsn 订单编号，外部支付时使用，有些外部支付系统要求特定的订单编号
     */
    public void setPointOutsn(String pointOutsn) {
        this.pointOutsn = pointOutsn == null ? null : pointOutsn.trim();
    }

    /**
     * 支付(付款)时间
     * @return point_paymenttime 支付(付款)时间
     */
    public Integer getPointPaymenttime() {
        return pointPaymenttime;
    }

    /**
     * 支付(付款)时间
     * @param pointPaymenttime 支付(付款)时间
     */
    public void setPointPaymenttime(Integer pointPaymenttime) {
        this.pointPaymenttime = pointPaymenttime;
    }

    /**
     * 支付留言
     * @return point_paymessage 支付留言
     */
    public String getPointPaymessage() {
        return pointPaymessage;
    }

    /**
     * 支付留言
     * @param pointPaymessage 支付留言
     */
    public void setPointPaymessage(String pointPaymessage) {
        this.pointPaymessage = pointPaymessage == null ? null : pointPaymessage.trim();
    }

    /**
     * 配送时间
     * @return point_shippingtime 配送时间
     */
    public Integer getPointShippingtime() {
        return pointShippingtime;
    }

    /**
     * 配送时间
     * @param pointShippingtime 配送时间
     */
    public void setPointShippingtime(Integer pointShippingtime) {
        this.pointShippingtime = pointShippingtime;
    }

    /**
     * 物流单号
     * @return point_shippingcode 物流单号
     */
    public String getPointShippingcode() {
        return pointShippingcode;
    }

    /**
     * 物流单号
     * @param pointShippingcode 物流单号
     */
    public void setPointShippingcode(String pointShippingcode) {
        this.pointShippingcode = pointShippingcode == null ? null : pointShippingcode.trim();
    }

    /**
     * 发货描述
     * @return point_shippingdesc 发货描述
     */
    public String getPointShippingdesc() {
        return pointShippingdesc;
    }

    /**
     * 发货描述
     * @param pointShippingdesc 发货描述
     */
    public void setPointShippingdesc(String pointShippingdesc) {
        this.pointShippingdesc = pointShippingdesc == null ? null : pointShippingdesc.trim();
    }

    /**
     * 外部交易平台单独使用的标识字符串
     * @return point_outpaymentcode 外部交易平台单独使用的标识字符串
     */
    public String getPointOutpaymentcode() {
        return pointOutpaymentcode;
    }

    /**
     * 外部交易平台单独使用的标识字符串
     * @param pointOutpaymentcode 外部交易平台单独使用的标识字符串
     */
    public void setPointOutpaymentcode(String pointOutpaymentcode) {
        this.pointOutpaymentcode = pointOutpaymentcode == null ? null : pointOutpaymentcode.trim();
    }

    /**
     * 订单完成时间
     * @return point_finnshedtime 订单完成时间
     */
    public Integer getPointFinnshedtime() {
        return pointFinnshedtime;
    }

    /**
     * 订单完成时间
     * @param pointFinnshedtime 订单完成时间
     */
    public void setPointFinnshedtime(Integer pointFinnshedtime) {
        this.pointFinnshedtime = pointFinnshedtime;
    }

    /**
     * 兑换总积分
     * @return point_allpoint 兑换总积分
     */
    public Integer getPointAllpoint() {
        return pointAllpoint;
    }

    /**
     * 兑换总积分
     * @param pointAllpoint 兑换总积分
     */
    public void setPointAllpoint(Integer pointAllpoint) {
        this.pointAllpoint = pointAllpoint;
    }

    /**
     * 兑换订单总金额
     * @return point_orderamount 兑换订单总金额
     */
    public BigDecimal getPointOrderamount() {
        return pointOrderamount;
    }

    /**
     * 兑换订单总金额
     * @param pointOrderamount 兑换订单总金额
     */
    public void setPointOrderamount(BigDecimal pointOrderamount) {
        this.pointOrderamount = pointOrderamount;
    }

    /**
     * 运费承担方式 0表示卖家 1表示买家
     * @return point_shippingcharge 运费承担方式 0表示卖家 1表示买家
     */
    public Byte getPointShippingcharge() {
        return pointShippingcharge;
    }

    /**
     * 运费承担方式 0表示卖家 1表示买家
     * @param pointShippingcharge 运费承担方式 0表示卖家 1表示买家
     */
    public void setPointShippingcharge(Byte pointShippingcharge) {
        this.pointShippingcharge = pointShippingcharge;
    }

    /**
     * 运费金额
     * @return point_shippingfee 运费金额
     */
    public BigDecimal getPointShippingfee() {
        return pointShippingfee;
    }

    /**
     * 运费金额
     * @param pointShippingfee 运费金额
     */
    public void setPointShippingfee(BigDecimal pointShippingfee) {
        this.pointShippingfee = pointShippingfee;
    }

    /**
     * 订单留言
     * @return point_ordermessage 订单留言
     */
    public String getPointOrdermessage() {
        return pointOrdermessage;
    }

    /**
     * 订单留言
     * @param pointOrdermessage 订单留言
     */
    public void setPointOrdermessage(String pointOrdermessage) {
        this.pointOrdermessage = pointOrdermessage == null ? null : pointOrdermessage.trim();
    }

    /**
     * 订单状态：10(默认):未付款;11已付款;20:确认付款;30:已发货;40:已收货;50已完成;2已取消
     * @return point_orderstate 订单状态：10(默认):未付款;11已付款;20:确认付款;30:已发货;40:已收货;50已完成;2已取消
     */
    public Integer getPointOrderstate() {
        return pointOrderstate;
    }

    /**
     * 订单状态：10(默认):未付款;11已付款;20:确认付款;30:已发货;40:已收货;50已完成;2已取消
     * @param pointOrderstate 订单状态：10(默认):未付款;11已付款;20:确认付款;30:已发货;40:已收货;50已完成;2已取消
     */
    public void setPointOrderstate(Integer pointOrderstate) {
        this.pointOrderstate = pointOrderstate;
    }
}