package com.shanyuan.platform.ms.dao.goods.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 描述:sy_topic_goods表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-12-11
 */
public class SyTopicGoods {
    /**
     * 主键索引id
     */
    private Integer recId;

    /**
     * 专题活动id
     */
    private Integer topicId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品公共表id
     */
    private Integer goodsCommonid;

    /**
     * 商品id(SKU)
     */
    private Integer goodsId;

    /**
     * 商品规格序列化
     */
    private String goodsSpec;

    /**
     * 活动价格
     */
    private BigDecimal actGoodsPrice;

    /**
     * 活动商品库存
     */
    private Long actGoodsStorage;

    /**
     * 活动商品销量
     */
    private Long actSaleNum;

    /**
     * 中元可支付金额
     */
    private BigDecimal bocPointsPrice;

    /**
     * 采购价
     */
    private BigDecimal purchasePrice;

    /**
     * 积分比例
     */
    private Integer bocPointRate;

    /**
     * 发布者的id
     */
    private Integer publisherId;

    /**
     * 发布者真实姓名
     */
    private String publisherTruename;

    /**
     * 商品活动展示图片
     */
    private String activityImage;

    /**
     * 商品最近销售数量
     */
    private Integer latestSalenum;

    /**
     * 1:大爱超市2:集采3:善源商场
     */
    private Byte goodsModuleType;

    /**
     * 10:未入选20:已入选
     */
    private Byte status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 主键索引id
     * @return rec_id 主键索引id
     */
    public Integer getRecId() {
        return recId;
    }

    /**
     * 主键索引id
     * @param recId 主键索引id
     */
    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    /**
     * 专题活动id
     * @return topic_id 专题活动id
     */
    public Integer getTopicId() {
        return topicId;
    }

    /**
     * 专题活动id
     * @param topicId 专题活动id
     */
    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
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
     * 商品id(SKU)
     * @return goods_id 商品id(SKU)
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * 商品id(SKU)
     * @param goodsId 商品id(SKU)
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
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

    /**
     * 活动价格
     * @return act_goods_price 活动价格
     */
    public BigDecimal getActGoodsPrice() {
        return actGoodsPrice;
    }

    /**
     * 活动价格
     * @param actGoodsPrice 活动价格
     */
    public void setActGoodsPrice(BigDecimal actGoodsPrice) {
        this.actGoodsPrice = actGoodsPrice;
    }

    /**
     * 活动商品库存
     * @return act_goods_storage 活动商品库存
     */
    public Long getActGoodsStorage() {
        return actGoodsStorage;
    }

    /**
     * 活动商品库存
     * @param actGoodsStorage 活动商品库存
     */
    public void setActGoodsStorage(Long actGoodsStorage) {
        this.actGoodsStorage = actGoodsStorage;
    }

    /**
     * 活动商品销量
     * @return act_sale_num 活动商品销量
     */
    public Long getActSaleNum() {
        return actSaleNum;
    }

    /**
     * 活动商品销量
     * @param actSaleNum 活动商品销量
     */
    public void setActSaleNum(Long actSaleNum) {
        this.actSaleNum = actSaleNum;
    }

    /**
     * 中元可支付金额
     * @return boc_points_price 中元可支付金额
     */
    public BigDecimal getBocPointsPrice() {
        return bocPointsPrice;
    }

    /**
     * 中元可支付金额
     * @param bocPointsPrice 中元可支付金额
     */
    public void setBocPointsPrice(BigDecimal bocPointsPrice) {
        this.bocPointsPrice = bocPointsPrice;
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
     * 积分比例
     * @return boc_point_rate 积分比例
     */
    public Integer getBocPointRate() {
        return bocPointRate;
    }

    /**
     * 积分比例
     * @param bocPointRate 积分比例
     */
    public void setBocPointRate(Integer bocPointRate) {
        this.bocPointRate = bocPointRate;
    }

    /**
     * 发布者的id
     * @return publisher_id 发布者的id
     */
    public Integer getPublisherId() {
        return publisherId;
    }

    /**
     * 发布者的id
     * @param publisherId 发布者的id
     */
    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    /**
     * 发布者真实姓名
     * @return publisher_truename 发布者真实姓名
     */
    public String getPublisherTruename() {
        return publisherTruename;
    }

    /**
     * 发布者真实姓名
     * @param publisherTruename 发布者真实姓名
     */
    public void setPublisherTruename(String publisherTruename) {
        this.publisherTruename = publisherTruename == null ? null : publisherTruename.trim();
    }

    /**
     * 商品活动展示图片
     * @return activity_image 商品活动展示图片
     */
    public String getActivityImage() {
        return activityImage;
    }

    /**
     * 商品活动展示图片
     * @param activityImage 商品活动展示图片
     */
    public void setActivityImage(String activityImage) {
        this.activityImage = activityImage == null ? null : activityImage.trim();
    }

    /**
     * 商品最近销售数量
     * @return latest_salenum 商品最近销售数量
     */
    public Integer getLatestSalenum() {
        return latestSalenum;
    }

    /**
     * 商品最近销售数量
     * @param latestSalenum 商品最近销售数量
     */
    public void setLatestSalenum(Integer latestSalenum) {
        this.latestSalenum = latestSalenum;
    }

    /**
     * 1:大爱超市2:集采3:善源商场
     * @return goods_module_type 1:大爱超市2:集采3:善源商场
     */
    public Byte getGoodsModuleType() {
        return goodsModuleType;
    }

    /**
     * 1:大爱超市2:集采3:善源商场
     * @param goodsModuleType 1:大爱超市2:集采3:善源商场
     */
    public void setGoodsModuleType(Byte goodsModuleType) {
        this.goodsModuleType = goodsModuleType;
    }

    /**
     * 10:未入选20:已入选
     * @return status 10:未入选20:已入选
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 10:未入选20:已入选
     * @param status 10:未入选20:已入选
     */
    public void setStatus(Byte status) {
        this.status = status;
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
     * 更新时间
     * @return update_time 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}