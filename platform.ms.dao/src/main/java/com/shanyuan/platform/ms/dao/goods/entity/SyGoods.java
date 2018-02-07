package com.shanyuan.platform.ms.dao.goods.entity;

import java.math.BigDecimal;

/**
 * 描述:sy_goods表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-10-16
 */
public class SyGoods {
    /**
     * 商品id(SKU)
     */
    private Integer goodsId;

    /**
     * 商品公共表id
     */
    private Integer goodsCommonid;

    /**
     * 商品名称（+规格名称）
     */
    private String goodsName;

    /**
     * 商品广告词
     */
    private String goodsJingle;

    /**
     * 店铺id
     */
    private Integer storeId;

    /**
     * 店铺名称
     */
    private String storeName;

    /**
     * 商品分类id
     */
    private Integer gcId;

    /**
     * 品牌id
     */
    private Integer brandId;

    /**
     * 商品价格
     */
    private BigDecimal goodsPrice;
    
    /**
     * 批发价格
     */
    private BigDecimal wholesalePrice;

    /**
     * 市场价
     */
    private BigDecimal goodsMarketprice;

    /**
     * 商家编号
     */
    private String goodsSerial;

    /**
     * 商品点击数量
     */
    private Integer goodsClick;

    /**
     * 销售数量
     */
    private Integer goodsSalenum;
    
    private BigDecimal discountRate;

    /**
     * 收藏数量
     */
    private Integer goodsCollect;

    /**
     * 商品库存
     */
    private Long goodsStorage;

    /**
     * 商品主图
     */
    private String goodsImage;

    /**
     * 商品状态 0下架，1正常，10违规（禁售）
     */
    private Byte goodsState;

    /**
     * 商品审核 1通过，0未通过，10审核中
     */
    private Byte goodsVerify;

    /**
     * 商品添加时间
     */
    private Integer goodsAddtime;

    /**
     * 商品编辑时间
     */
    private Integer goodsEdittime;

    /**
     * 一级地区id
     */
    private Integer areaid1;

    /**
     * 二级地区id
     */
    private Integer areaid2;

    /**
     * 颜色规格id
     */
    private Integer colorId;

    /**
     * 运费模板id
     */
    private Integer transportId;

    /**
     * 运费 0为免运费
     */
    private BigDecimal goodsFreight;

    /**
     * 是否开具增值税发票 1是，0否
     */
    private Byte goodsVat;

    /**
     * 商品推荐 1是，0否 默认0
     */
    private Byte goodsCommend;

    /**
     * 店铺分类id 首尾用,隔开
     */
    private String goodsStcids;

    /**
     * 好评星级
     */
    private Byte evaluationGoodStar;

    /**
     * 评价数
     */
    private Integer evaluationCount;

    /**
     * 申请次数
     */
    private Integer goodsApplynum;

    /**
     * 0:已删除,1:已发布,10:已过期,20:待同意,30:待完成,40:已完结
     */
    private String goodsOrderState;

    /**
     * 中元可支付金额
     */
    private BigDecimal bocPointsPrice;

    /**
     * 指定角色可买
     */
    private String buyerType;

    /**
     * 商品编码
     */
    private String goodsCode;

    /**
     * 每人最大购买商品数量0为无限制
     */
    private Integer maxBuyNum;

    /**
     * 渠道标识,默认空
     */
    private String channel;

    /**
     * 优惠金额
     */
    private BigDecimal discountMoney;

    /**
     * 10:显示,20:不显示
     */
    private String showState;

    /**
     * 采购价
     */
    private BigDecimal purchasePrice;

    /**
     * 商品规格序列化
     */
    private String goodsSpec;
    
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
     * 商品名称（+规格名称）
     * @return goods_name 商品名称（+规格名称）
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 商品名称（+规格名称）
     * @param goodsName 商品名称（+规格名称）
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * 商品广告词
     * @return goods_jingle 商品广告词
     */
    public String getGoodsJingle() {
        return goodsJingle;
    }

    /**
     * 商品广告词
     * @param goodsJingle 商品广告词
     */
    public void setGoodsJingle(String goodsJingle) {
        this.goodsJingle = goodsJingle == null ? null : goodsJingle.trim();
    }

    /**
     * 店铺id
     * @return store_id 店铺id
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * 店铺id
     * @param storeId 店铺id
     */
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    /**
     * 店铺名称
     * @return store_name 店铺名称
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * 店铺名称
     * @param storeName 店铺名称
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    /**
     * 商品分类id
     * @return gc_id 商品分类id
     */
    public Integer getGcId() {
        return gcId;
    }

    /**
     * 商品分类id
     * @param gcId 商品分类id
     */
    public void setGcId(Integer gcId) {
        this.gcId = gcId;
    }

    /**
     * 品牌id
     * @return brand_id 品牌id
     */
    public Integer getBrandId() {
        return brandId;
    }

    /**
     * 品牌id
     * @param brandId 品牌id
     */
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public BigDecimal getWholesalePrice() {
		return wholesalePrice;
	}

	public void setWholesalePrice(BigDecimal wholesalePrice) {
		this.wholesalePrice = wholesalePrice;
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
     * 市场价
     * @return goods_marketprice 市场价
     */
    public BigDecimal getGoodsMarketprice() {
        return goodsMarketprice;
    }

    /**
     * 市场价
     * @param goodsMarketprice 市场价
     */
    public void setGoodsMarketprice(BigDecimal goodsMarketprice) {
        this.goodsMarketprice = goodsMarketprice;
    }

    /**
     * 商家编号
     * @return goods_serial 商家编号
     */
    public String getGoodsSerial() {
        return goodsSerial;
    }

    /**
     * 商家编号
     * @param goodsSerial 商家编号
     */
    public void setGoodsSerial(String goodsSerial) {
        this.goodsSerial = goodsSerial == null ? null : goodsSerial.trim();
    }

    /**
     * 商品点击数量
     * @return goods_click 商品点击数量
     */
    public Integer getGoodsClick() {
        return goodsClick;
    }

    /**
     * 商品点击数量
     * @param goodsClick 商品点击数量
     */
    public void setGoodsClick(Integer goodsClick) {
        this.goodsClick = goodsClick;
    }

    /**
     * 销售数量
     * @return goods_salenum 销售数量
     */
    public Integer getGoodsSalenum() {
        return goodsSalenum;
    }

    /**
     * 销售数量
     * @param goodsSalenum 销售数量
     */
    public void setGoodsSalenum(Integer goodsSalenum) {
        this.goodsSalenum = goodsSalenum;
    }

    /**
     * 收藏数量
     * @return goods_collect 收藏数量
     */
    public Integer getGoodsCollect() {
        return goodsCollect;
    }

    /**
     * 收藏数量
     * @param goodsCollect 收藏数量
     */
    public void setGoodsCollect(Integer goodsCollect) {
        this.goodsCollect = goodsCollect;
    }

    /**
     * 商品库存
     * @return goods_storage 商品库存
     */
    public Long getGoodsStorage() {
        return goodsStorage;
    }

    /**
     * 商品库存
     * @param goodsStorage 商品库存
     */
    public void setGoodsStorage(Long goodsStorage) {
        this.goodsStorage = goodsStorage;
    }

    /**
     * 商品主图
     * @return goods_image 商品主图
     */
    public String getGoodsImage() {
        return goodsImage;
    }

    /**
     * 商品主图
     * @param goodsImage 商品主图
     */
    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage == null ? null : goodsImage.trim();
    }

    /**
     * 商品状态 0下架，1正常，10违规（禁售）
     * @return goods_state 商品状态 0下架，1正常，10违规（禁售）
     */
    public Byte getGoodsState() {
        return goodsState;
    }

    /**
     * 商品状态 0下架，1正常，10违规（禁售）
     * @param goodsState 商品状态 0下架，1正常，10违规（禁售）
     */
    public void setGoodsState(Byte goodsState) {
        this.goodsState = goodsState;
    }

    /**
     * 商品审核 1通过，0未通过，10审核中
     * @return goods_verify 商品审核 1通过，0未通过，10审核中
     */
    public Byte getGoodsVerify() {
        return goodsVerify;
    }

    /**
     * 商品审核 1通过，0未通过，10审核中
     * @param goodsVerify 商品审核 1通过，0未通过，10审核中
     */
    public void setGoodsVerify(Byte goodsVerify) {
        this.goodsVerify = goodsVerify;
    }

    /**
     * 商品添加时间
     * @return goods_addtime 商品添加时间
     */
    public Integer getGoodsAddtime() {
        return goodsAddtime;
    }

    /**
     * 商品添加时间
     * @param goodsAddtime 商品添加时间
     */
    public void setGoodsAddtime(Integer goodsAddtime) {
        this.goodsAddtime = goodsAddtime;
    }

    /**
     * 商品编辑时间
     * @return goods_edittime 商品编辑时间
     */
    public Integer getGoodsEdittime() {
        return goodsEdittime;
    }

    /**
     * 商品编辑时间
     * @param goodsEdittime 商品编辑时间
     */
    public void setGoodsEdittime(Integer goodsEdittime) {
        this.goodsEdittime = goodsEdittime;
    }

    /**
     * 一级地区id
     * @return areaid_1 一级地区id
     */
    public Integer getAreaid1() {
        return areaid1;
    }

    /**
     * 一级地区id
     * @param areaid1 一级地区id
     */
    public void setAreaid1(Integer areaid1) {
        this.areaid1 = areaid1;
    }

    /**
     * 二级地区id
     * @return areaid_2 二级地区id
     */
    public Integer getAreaid2() {
        return areaid2;
    }

    /**
     * 二级地区id
     * @param areaid2 二级地区id
     */
    public void setAreaid2(Integer areaid2) {
        this.areaid2 = areaid2;
    }

    /**
     * 颜色规格id
     * @return color_id 颜色规格id
     */
    public Integer getColorId() {
        return colorId;
    }

    /**
     * 颜色规格id
     * @param colorId 颜色规格id
     */
    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    /**
     * 运费模板id
     * @return transport_id 运费模板id
     */
    public Integer getTransportId() {
        return transportId;
    }

    /**
     * 运费模板id
     * @param transportId 运费模板id
     */
    public void setTransportId(Integer transportId) {
        this.transportId = transportId;
    }

    /**
     * 运费 0为免运费
     * @return goods_freight 运费 0为免运费
     */
    public BigDecimal getGoodsFreight() {
        return goodsFreight;
    }

    /**
     * 运费 0为免运费
     * @param goodsFreight 运费 0为免运费
     */
    public void setGoodsFreight(BigDecimal goodsFreight) {
        this.goodsFreight = goodsFreight;
    }

    /**
     * 是否开具增值税发票 1是，0否
     * @return goods_vat 是否开具增值税发票 1是，0否
     */
    public Byte getGoodsVat() {
        return goodsVat;
    }

    /**
     * 是否开具增值税发票 1是，0否
     * @param goodsVat 是否开具增值税发票 1是，0否
     */
    public void setGoodsVat(Byte goodsVat) {
        this.goodsVat = goodsVat;
    }

    /**
     * 商品推荐 1是，0否 默认0
     * @return goods_commend 商品推荐 1是，0否 默认0
     */
    public Byte getGoodsCommend() {
        return goodsCommend;
    }

    /**
     * 商品推荐 1是，0否 默认0
     * @param goodsCommend 商品推荐 1是，0否 默认0
     */
    public void setGoodsCommend(Byte goodsCommend) {
        this.goodsCommend = goodsCommend;
    }

    /**
     * 店铺分类id 首尾用,隔开
     * @return goods_stcids 店铺分类id 首尾用,隔开
     */
    public String getGoodsStcids() {
        return goodsStcids;
    }

    /**
     * 店铺分类id 首尾用,隔开
     * @param goodsStcids 店铺分类id 首尾用,隔开
     */
    public void setGoodsStcids(String goodsStcids) {
        this.goodsStcids = goodsStcids == null ? null : goodsStcids.trim();
    }

    /**
     * 好评星级
     * @return evaluation_good_star 好评星级
     */
    public Byte getEvaluationGoodStar() {
        return evaluationGoodStar;
    }

    /**
     * 好评星级
     * @param evaluationGoodStar 好评星级
     */
    public void setEvaluationGoodStar(Byte evaluationGoodStar) {
        this.evaluationGoodStar = evaluationGoodStar;
    }

    /**
     * 评价数
     * @return evaluation_count 评价数
     */
    public Integer getEvaluationCount() {
        return evaluationCount;
    }

    /**
     * 评价数
     * @param evaluationCount 评价数
     */
    public void setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
    }

    /**
     * 申请次数
     * @return goods_applynum 申请次数
     */
    public Integer getGoodsApplynum() {
        return goodsApplynum;
    }

    /**
     * 申请次数
     * @param goodsApplynum 申请次数
     */
    public void setGoodsApplynum(Integer goodsApplynum) {
        this.goodsApplynum = goodsApplynum;
    }

    /**
     * 0:已删除,1:已发布,10:已过期,20:待同意,30:待完成,40:已完结
     * @return goods_order_state 0:已删除,1:已发布,10:已过期,20:待同意,30:待完成,40:已完结
     */
    public String getGoodsOrderState() {
        return goodsOrderState;
    }

    /**
     * 0:已删除,1:已发布,10:已过期,20:待同意,30:待完成,40:已完结
     * @param goodsOrderState 0:已删除,1:已发布,10:已过期,20:待同意,30:待完成,40:已完结
     */
    public void setGoodsOrderState(String goodsOrderState) {
        this.goodsOrderState = goodsOrderState == null ? null : goodsOrderState.trim();
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
     * 指定角色可买
     * @return buyer_type 指定角色可买
     */
    public String getBuyerType() {
        return buyerType;
    }

    /**
     * 指定角色可买
     * @param buyerType 指定角色可买
     */
    public void setBuyerType(String buyerType) {
        this.buyerType = buyerType == null ? null : buyerType.trim();
    }

    /**
     * 商品编码
     * @return goods_code 商品编码
     */
    public String getGoodsCode() {
        return goodsCode;
    }

    /**
     * 商品编码
     * @param goodsCode 商品编码
     */
    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode == null ? null : goodsCode.trim();
    }

    /**
     * 每人最大购买商品数量0为无限制
     * @return max_buy_num 每人最大购买商品数量0为无限制
     */
    public Integer getMaxBuyNum() {
        return maxBuyNum;
    }

    /**
     * 每人最大购买商品数量0为无限制
     * @param maxBuyNum 每人最大购买商品数量0为无限制
     */
    public void setMaxBuyNum(Integer maxBuyNum) {
        this.maxBuyNum = maxBuyNum;
    }

    /**
     * 渠道标识,默认空
     * @return channel 渠道标识,默认空
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 渠道标识,默认空
     * @param channel 渠道标识,默认空
     */
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    /**
     * 优惠金额
     * @return discount_money 优惠金额
     */
    public BigDecimal getDiscountMoney() {
        return discountMoney;
    }

    /**
     * 优惠金额
     * @param discountMoney 优惠金额
     */
    public void setDiscountMoney(BigDecimal discountMoney) {
        this.discountMoney = discountMoney;
    }

    /**
     * 10:显示,20:不显示
     * @return show_state 10:显示,20:不显示
     */
    public String getShowState() {
        return showState;
    }

    /**
     * 10:显示,20:不显示
     * @param showState 10:显示,20:不显示
     */
    public void setShowState(String showState) {
        this.showState = showState == null ? null : showState.trim();
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

	public BigDecimal getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(BigDecimal discountRate) {
		this.discountRate = discountRate;
	}
    
    
}