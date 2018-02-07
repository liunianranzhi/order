package com.shanyuan.platform.ms.facade.order.domain;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class PayedOrderDomain {
    private  String receiverName;
    private  String receiverTel;
    private  String address;
    private  String sellerName;//店主name
    private  String sellerTel;//卖家电话，没有则是发布者电话
    private  String publisherQQ;//发布者qq
    private  String message;
    private  String orderSn;
    private BigDecimal allGoodsMoney;
    private BigDecimal allCouponPay;
    private BigDecimal allVoucherPay;
    private BigDecimal allShippingFee;
    private BigDecimal allPayMoney;
    private  Integer allNeedPoints;
    private  Integer allCanGetPoints;
    private  Integer allNum;
    private List<Map<String,String>> logList;
    private  List<Map<String,String>> goodslist;
    
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getReceiverTel() {
		return receiverTel;
	}
	public void setReceiverTel(String receiverTel) {
		this.receiverTel = receiverTel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getSellerTel() {
		return sellerTel;
	}
	public void setSellerTel(String sellerTel) {
		this.sellerTel = sellerTel;
	}
	public String getPublisherQQ() {
		return publisherQQ;
	}
	public void setPublisherQQ(String publisherQQ) {
		this.publisherQQ = publisherQQ;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getOrderSn() {
		return orderSn;
	}
	public void setOrderSn(String orderSn) {
		this.orderSn = orderSn;
	}
	public BigDecimal getAllGoodsMoney() {
		return allGoodsMoney;
	}
	public void setAllGoodsMoney(BigDecimal allGoodsMoney) {
		this.allGoodsMoney = allGoodsMoney;
	}
	public BigDecimal getAllCouponPay() {
		return allCouponPay;
	}
	public void setAllCouponPay(BigDecimal allCouponPay) {
		this.allCouponPay = allCouponPay;
	}
	public BigDecimal getAllVoucherPay() {
		return allVoucherPay;
	}
	public void setAllVoucherPay(BigDecimal allVoucherPay) {
		this.allVoucherPay = allVoucherPay;
	}
	public BigDecimal getAllShippingFee() {
		return allShippingFee;
	}
	public void setAllShippingFee(BigDecimal allShippingFee) {
		this.allShippingFee = allShippingFee;
	}
	public BigDecimal getAllPayMoney() {
		return allPayMoney;
	}
	public void setAllPayMoney(BigDecimal allPayMoney) {
		this.allPayMoney = allPayMoney;
	}
	public Integer getAllNeedPoints() {
		return allNeedPoints;
	}
	public void setAllNeedPoints(Integer allNeedPoints) {
		this.allNeedPoints = allNeedPoints;
	}
	public Integer getAllCanGetPoints() {
		return allCanGetPoints;
	}
	public void setAllCanGetPoints(Integer allCanGetPoints) {
		this.allCanGetPoints = allCanGetPoints;
	}
	public Integer getAllNum() {
		return allNum;
	}
	public void setAllNum(Integer allNum) {
		this.allNum = allNum;
	}
	public List<Map<String, String>> getLogList() {
		return logList;
	}
	public void setLogList(List<Map<String, String>> logList) {
		this.logList = logList;
	}
	public List<Map<String, String>> getGoodslist() {
		return goodslist;
	}
	public void setGoodslist(List<Map<String, String>> goodslist) {
		this.goodslist = goodslist;
	}
    



}