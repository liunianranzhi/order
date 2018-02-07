package com.shanyuan.platform.ms.dao.omorder.entity;

import java.util.Date;

/**
 * 描述:om_order_goods表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-11-11
 */
public class OmOrderGoods {
    /**
     * 实例id
     */
    private Integer insId;

    /**
     * 订单id
     */
    private String orderId;

    /**
     * 买家id
     */
    private Integer buyerId;

    /**
     * 主订单id
     */
    private String mainId;

    /**
     * 商品id
     */
    private Integer goodsCommonId;

    /**
     * skuid
     */
    private Integer goodsId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品需要积分数量
     */
    private Integer goodsPoint;

    /**
     * 商品单价
     */
    private Integer goodsPrice;

    /**
     * 商品数量
     */
    private Integer goodsNum;

    /**
     * 商品图片
     */
    private String goodsImage;

    /**
     * 商品总价
     */
    private Integer goodsAmountPrice;

    /**
     * 商品总需积分数量
     */
    private Integer goodsAmountPoint;

    /**
     * 商品捐助比率 除以1000
     */
    private Integer goodsHelpRate;

    /**
     * 分享人id
     */
    private Integer shareId;

    /**
     * 商品规格
     */
    private String goodsSpec;

    /**
     * 商品单位
     */
    private String goodsUnit;

    /**
     * 店铺折减金额
     */
    private Integer storeDiscountFee;

    /**
     * 平台折减金额
     */
    private Integer platDiscountFee;

    /**
     * 商品采购价
     */
    private Integer purchasePrice;

    /**
     * 商品描述
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
     * 实例id
     * @return ins_id 实例id
     */
    public Integer getInsId() {
        return insId;
    }

    /**
     * 实例id
     * @param insId 实例id
     */
    public void setInsId(Integer insId) {
        this.insId = insId;
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
     * 买家id
     * @return buyer_id 买家id
     */
    public Integer getBuyerId() {
        return buyerId;
    }

    /**
     * 买家id
     * @param buyerId 买家id
     */
    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
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
     * 商品id
     * @return goods_common_id 商品id
     */
    public Integer getGoodsCommonId() {
        return goodsCommonId;
    }

    /**
     * 商品id
     * @param goodsCommonId 商品id
     */
    public void setGoodsCommonId(Integer goodsCommonId) {
        this.goodsCommonId = goodsCommonId;
    }

    /**
     * skuid
     * @return goods_id skuid
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * skuid
     * @param goodsId skuid
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 商品名称
     * @return goods_name 商品名称
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 商品名称
     * @param goodsName 商品名称
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * 商品需要积分数量
     * @return goods_point 商品需要积分数量
     */
    public Integer getGoodsPoint() {
        return goodsPoint;
    }

    /**
     * 商品需要积分数量
     * @param goodsPoint 商品需要积分数量
     */
    public void setGoodsPoint(Integer goodsPoint) {
        this.goodsPoint = goodsPoint;
    }

    /**
     * 商品单价
     * @return goods_price 商品单价
     */
    public Integer getGoodsPrice() {
        return goodsPrice;
    }

    /**
     * 商品单价
     * @param goodsPrice 商品单价
     */
    public void setGoodsPrice(Integer goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    /**
     * 商品数量
     * @return goods_num 商品数量
     */
    public Integer getGoodsNum() {
        return goodsNum;
    }

    /**
     * 商品数量
     * @param goodsNum 商品数量
     */
    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    /**
     * 商品图片
     * @return goods_image 商品图片
     */
    public String getGoodsImage() {
        return goodsImage;
    }

    /**
     * 商品图片
     * @param goodsImage 商品图片
     */
    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage == null ? null : goodsImage.trim();
    }

    /**
     * 商品总价
     * @return goods_amount_price 商品总价
     */
    public Integer getGoodsAmountPrice() {
        return goodsAmountPrice;
    }

    /**
     * 商品总价
     * @param goodsAmountPrice 商品总价
     */
    public void setGoodsAmountPrice(Integer goodsAmountPrice) {
        this.goodsAmountPrice = goodsAmountPrice;
    }

    /**
     * 商品总需积分数量
     * @return goods_amount_point 商品总需积分数量
     */
    public Integer getGoodsAmountPoint() {
        return goodsAmountPoint;
    }

    /**
     * 商品总需积分数量
     * @param goodsAmountPoint 商品总需积分数量
     */
    public void setGoodsAmountPoint(Integer goodsAmountPoint) {
        this.goodsAmountPoint = goodsAmountPoint;
    }

    /**
     * 商品捐助比率 除以1000
     * @return goods_help_rate 商品捐助比率 除以1000
     */
    public Integer getGoodsHelpRate() {
        return goodsHelpRate;
    }

    /**
     * 商品捐助比率 除以1000
     * @param goodsHelpRate 商品捐助比率 除以1000
     */
    public void setGoodsHelpRate(Integer goodsHelpRate) {
        this.goodsHelpRate = goodsHelpRate;
    }

    /**
     * 分享人id
     * @return share_id 分享人id
     */
    public Integer getShareId() {
        return shareId;
    }

    /**
     * 分享人id
     * @param shareId 分享人id
     */
    public void setShareId(Integer shareId) {
        this.shareId = shareId;
    }

    /**
     * 商品规格
     * @return goods_spec 商品规格
     */
    public String getGoodsSpec() {
        return goodsSpec;
    }

    /**
     * 商品规格
     * @param goodsSpec 商品规格
     */
    public void setGoodsSpec(String goodsSpec) {
        this.goodsSpec = goodsSpec == null ? null : goodsSpec.trim();
    }

    /**
     * 商品单位
     * @return goods_unit 商品单位
     */
    public String getGoodsUnit() {
        return goodsUnit;
    }

    /**
     * 商品单位
     * @param goodsUnit 商品单位
     */
    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit == null ? null : goodsUnit.trim();
    }

    /**
     * 店铺折减金额
     * @return store_discount_fee 店铺折减金额
     */
    public Integer getStoreDiscountFee() {
        return storeDiscountFee;
    }

    /**
     * 店铺折减金额
     * @param storeDiscountFee 店铺折减金额
     */
    public void setStoreDiscountFee(Integer storeDiscountFee) {
        this.storeDiscountFee = storeDiscountFee;
    }

    /**
     * 平台折减金额
     * @return plat_discount_fee 平台折减金额
     */
    public Integer getPlatDiscountFee() {
        return platDiscountFee;
    }

    /**
     * 平台折减金额
     * @param platDiscountFee 平台折减金额
     */
    public void setPlatDiscountFee(Integer platDiscountFee) {
        this.platDiscountFee = platDiscountFee;
    }

    /**
     * 商品采购价
     * @return purchase_price 商品采购价
     */
    public Integer getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * 商品采购价
     * @param purchasePrice 商品采购价
     */
    public void setPurchasePrice(Integer purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    /**
     * 商品描述
     * @return remark 商品描述
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 商品描述
     * @param remark 商品描述
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