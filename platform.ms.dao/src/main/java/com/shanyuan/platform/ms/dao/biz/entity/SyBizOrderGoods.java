package com.shanyuan.platform.ms.dao.biz.entity;

import java.math.BigDecimal;

/**
 * 描述:sy_biz_order_goods表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2018-01-04
 */
public class SyBizOrderGoods {
    /**
     * 订单商品表索引id
     */
    private Integer recId;

    /**
     * 订单索引id
     */
    private Integer mainOrderId;

    /**
     * biz_order表主键
     */
    private Integer orderId;

    /**
     * 店铺id
     */
    private Integer refStoreId;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 
     */
    private String goodsName;

    /**
     * 商品价格
     */
    private BigDecimal goodsPrice;

    /**
     * 商品数量
     */
    private Integer goodsNum;

    /**
     * 商品图片
     */
    private String goodsImage;

    /**
     * 包装单位
     */
    private String unit;

    /**
     * 包装规格
     */
    private String unitSpec;

    /**
     * 产品规格
     */
    private String productSpec;

    /**
     * 10:待同意发货;20:待发货;30:已发货
     */
    private String goodsState;

    /**
     * 助理人id
     */
    private Integer assistId;

    /**
     * 发货时间
     */
    private Integer sendTime;

    /**
     * 集采监管人的id
     */
    private Integer publisherId;

    /**
     * 采购价
     */
    private BigDecimal purchasePrice;

    /**
     * 集采运营中心id
     */
    private Integer bizOperationMid;

    /**
     * 商品公共表id
     */
    private Integer goodsCommonid;

    /**
     * 批发详情 retail_price:零售价,wholesale_price:批发价,wholesale_num:批发数量
     */
    private String wholesaleInfo;

    /**
     * 商品规格序列化
     */
    private String goodsSpec;

    /**
     * 订单商品表索引id
     * @return rec_id 订单商品表索引id
     */
    public Integer getRecId() {
        return recId;
    }

    /**
     * 订单商品表索引id
     * @param recId 订单商品表索引id
     */
    public void setRecId(Integer recId) {
        this.recId = recId;
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
     * biz_order表主键
     * @return order_id biz_order表主键
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * biz_order表主键
     * @param orderId biz_order表主键
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 店铺id
     * @return ref_store_id 店铺id
     */
    public Integer getRefStoreId() {
        return refStoreId;
    }

    /**
     * 店铺id
     * @param refStoreId 店铺id
     */
    public void setRefStoreId(Integer refStoreId) {
        this.refStoreId = refStoreId;
    }

    /**
     * 商品id
     * @return goods_id 商品id
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * 商品id
     * @param goodsId 商品id
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 
     * @return goods_name 
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 
     * @param goodsName 
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * 商品价格
     * @return goods_price 商品价格
     */
    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    /**
     * 商品价格
     * @param goodsPrice 商品价格
     */
    public void setGoodsPrice(BigDecimal goodsPrice) {
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
     * 包装单位
     * @return unit 包装单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 包装单位
     * @param unit 包装单位
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * 包装规格
     * @return unit_spec 包装规格
     */
    public String getUnitSpec() {
        return unitSpec;
    }

    /**
     * 包装规格
     * @param unitSpec 包装规格
     */
    public void setUnitSpec(String unitSpec) {
        this.unitSpec = unitSpec == null ? null : unitSpec.trim();
    }

    /**
     * 产品规格
     * @return product_spec 产品规格
     */
    public String getProductSpec() {
        return productSpec;
    }

    /**
     * 产品规格
     * @param productSpec 产品规格
     */
    public void setProductSpec(String productSpec) {
        this.productSpec = productSpec == null ? null : productSpec.trim();
    }

    /**
     * 10:待同意发货;20:待发货;30:已发货
     * @return goods_state 10:待同意发货;20:待发货;30:已发货
     */
    public String getGoodsState() {
        return goodsState;
    }

    /**
     * 10:待同意发货;20:待发货;30:已发货
     * @param goodsState 10:待同意发货;20:待发货;30:已发货
     */
    public void setGoodsState(String goodsState) {
        this.goodsState = goodsState == null ? null : goodsState.trim();
    }

    /**
     * 助理人id
     * @return assist_id 助理人id
     */
    public Integer getAssistId() {
        return assistId;
    }

    /**
     * 助理人id
     * @param assistId 助理人id
     */
    public void setAssistId(Integer assistId) {
        this.assistId = assistId;
    }

    /**
     * 发货时间
     * @return send_time 发货时间
     */
    public Integer getSendTime() {
        return sendTime;
    }

    /**
     * 发货时间
     * @param sendTime 发货时间
     */
    public void setSendTime(Integer sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * 集采监管人的id
     * @return publisher_id 集采监管人的id
     */
    public Integer getPublisherId() {
        return publisherId;
    }

    /**
     * 集采监管人的id
     * @param publisherId 集采监管人的id
     */
    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    /**
     * 采购价
     * @return purchase_price 采购价
     */
    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * 采购价
     * @param purchasePrice 采购价
     */
    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    /**
     * 集采运营中心id
     * @return biz_operation_mid 集采运营中心id
     */
    public Integer getBizOperationMid() {
        return bizOperationMid;
    }

    /**
     * 集采运营中心id
     * @param bizOperationMid 集采运营中心id
     */
    public void setBizOperationMid(Integer bizOperationMid) {
        this.bizOperationMid = bizOperationMid;
    }

    /**
     * 商品公共表id
     * @return goods_commonid 商品公共表id
     */
    public Integer getGoodsCommonid() {
        return goodsCommonid;
    }

    /**
     * 商品公共表id
     * @param goodsCommonid 商品公共表id
     */
    public void setGoodsCommonid(Integer goodsCommonid) {
        this.goodsCommonid = goodsCommonid;
    }

    /**
     * 批发详情 retail_price:零售价,wholesale_price:批发价,wholesale_num:批发数量
     * @return wholesale_info 批发详情 retail_price:零售价,wholesale_price:批发价,wholesale_num:批发数量
     */
    public String getWholesaleInfo() {
        return wholesaleInfo;
    }

    /**
     * 批发详情 retail_price:零售价,wholesale_price:批发价,wholesale_num:批发数量
     * @param wholesaleInfo 批发详情 retail_price:零售价,wholesale_price:批发价,wholesale_num:批发数量
     */
    public void setWholesaleInfo(String wholesaleInfo) {
        this.wholesaleInfo = wholesaleInfo == null ? null : wholesaleInfo.trim();
    }

    /**
     * 商品规格序列化
     * @return goods_spec 商品规格序列化
     */
    public String getGoodsSpec() {
        return goodsSpec;
    }

    /**
     * 商品规格序列化
     * @param goodsSpec 商品规格序列化
     */
    public void setGoodsSpec(String goodsSpec) {
        this.goodsSpec = goodsSpec == null ? null : goodsSpec.trim();
    }
}