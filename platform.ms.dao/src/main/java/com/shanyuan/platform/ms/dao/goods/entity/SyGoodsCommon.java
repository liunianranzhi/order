package com.shanyuan.platform.ms.dao.goods.entity;


import java.math.BigDecimal;

/**
 * 描述:sy_goods_common表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-10-25
 */
public class SyGoodsCommon {
    /**
     * 商品公共表id
     */
    private Integer goodsCommonid;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 图书书名
     */
    private String goodsTitle;

    /**
     * 商品广告词
     */
    private String goodsJingle;

    /**
     * 商品分类
     */
    private Integer gcId;

    /**
     * 商品分类
     */
    private String gcName;

    /**
     * 店铺id
     */
    private Integer storeId;

    /**
     * 店铺名称
     */
    private String storeName;

    /**
     * 规格名称
     */
    private String specName;

    /**
     * 品牌id
     */
    private Integer brandId;

    /**
     * 品牌名称
     */
    private String brandName;

    /**
     * 类型id
     */
    private Integer typeId;

    /**
     * 商品主图
     */
    private String goodsImage;

    /**
     * 商品状态 0下架，1正常，10违规（禁售）
     */
    private Byte goodsState;

    /**
     * 违规原因
     */
    private String goodsStateremark;

    /**
     * 商品审核 1通过，0未通过，10审核中
     */
    private Byte goodsVerify;

    /**
     * 审核失败原因
     */
    private String goodsVerifyremark;

    /**
     * 商品锁定 0未锁，1已锁
     */
    private Byte goodsLock;

    /**
     * 商品添加时间
     */
    private Integer goodsAddtime;

    /**
     * 上架时间
     */
    private Integer goodsSelltime;

    /**
     * 商品价格
     */
    private BigDecimal goodsPrice;
    
    /**
     * 快递运费
     */
    private BigDecimal shippingFee;

    /**
     * 市场价
     */
    private BigDecimal goodsMarketprice;

    /**
     * 成本价
     */
    private BigDecimal goodsCostprice;
    
    private BigDecimal discountRate;

    /**
     * 折扣
     */
    private Float goodsDiscount;

    /**
     * 商家编号
     */
    private String goodsSerial;

    /**
     * 运费模板
     */
    private Integer transportId;
    
    /**
     * 运费模板名称
     */
    private String transportTitle;

    /**
     * 商品推荐 1是，0否，默认为0
     */
    private Byte goodsCommend;
    /**
     *批发设置 1批发兼零售，0仅零售，默认为0
     */
    private Byte wholesaleType;
    /**
     * 起批数量
     */
    private Integer wholesaleNum;

    /**
     * 运费 0为免运费
     */
    private BigDecimal goodsFreight;

    /**
     * 是否开具增值税发票 1是，0否
     */
    private Byte goodsVat;

    /**
     * 一级地区id
     */
    private Long areaid1;

    /**
     * 二级地区id
     */
    private Long areaid2;

    /**
     * 三级地区id
     */
    private Long areaid3;

    /**
     * 店铺分类id 首尾用,隔开
     */
    private String goodsStcids;

    /**
     * 顶部关联板式
     */
    private Integer plateidTop;

    /**
     * 底部关联板式
     */
    private Integer plateidBottom;

    /**
     * 商品开始时间
     */
    private Integer goodsStartime;

    /**
     * 商品结束时间
     */
    private Integer goodsEndtime;

    /**
     * 所属地区
     */
    private String goodsAreainfo;

    /**
     * 实物资源的物流信息
     */
    private String goodsDeliveryInfo;

    /**
     * 时间资源或者能力资源的服务开始时间
     */
    private Integer serviceStartime;

    /**
     * 时间资源或者能力资源的服务结束时间
     */
    private Integer serviceEndtime;

    /**
     * 时间资源或者能力资源的固定时间模式
     */
    private String serviceFixtimePattern;
    
    /**
     * goods_price*(1-(m_fee_rate/1000))
     */
    private BigDecimal poorGetFee;

    /**
     * 时间资源或者能力资源的其他服务信息
     */
    private String serviceInfo;

    /**
     * 时间能力空间资源可用时间的模式，1：自由协商2：固定时间3：一段时间内。可复选
     */
    private String serviceTimemode;

    /**
     * 0:已删除,1:已发布,10:已过期,20:待同意,30:待完成,40:已完结
     */
    private String goodsOrderState;

    /**
     * 募捐目标数量
     */
    private Long goodsStorageTarget;

    /**
     * 募捐活动id
     */
    private Integer goodsActivityId;

    /**
     * 项目类型(1基金会捐物/2基金会捐款/3基金会活动/4个人实物/5个人时间/6个人技能/7个人空间)
     */
    private Integer goodsProjectType;

    /**
     * 代收地址
     */
    private String receiverAddress;

    /**
     * 代收人姓名
     */
    private String receiverName;

    /**
     * 代收人联系电话
     */
    private String receiverMobile;

    /**
     * 代收地址邮编
     */
    private String receiverPostcode;

    /**
     * 募捐活动名称
     */
    private String goodsActivityName;

    /**
     * 技能id，多个id用|分隔
     */
    private String skillId;

    /**
     * 项目详情页样式模板
     */
    private String goodsTemplate;

    /**
     * 活动取消理由
     */
    private String goodsComment;

    /**
     * 包装单位
     */
    private String unit;

    /**
     * 产品图片1
     */
    private String image1;

    /**
     * 产品图片2
     */
    private String image2;

    /**
     * 产品图片3
     */
    private String image3;

    /**
     * 包装规格
     */
    private String unitSpec;

    /**
     * 商品编辑时间
     */
    private Integer goodsEdittime;

    /**
     * 发布者的id
     */
    private Integer publisherId;

    /**
     * 发布者真实姓名
     */
    private String publisherTruename;

    /**
     * 管理费的比例，实际比例为该值除以1000
     */
    private Short mFeeRate;

    /**
     * 扩展活动类型:如活动下的讲座类型
     */
    private String extendType;

    /**
     * 产品规格
     */
    private String productSpec;

    /**
     * 商品销售数量
     */
    private Integer saleNum;

    /**
     * 综合排序
     */
    private BigDecimal overallSort;

    /**
     * 四级地区id
     */
    private Long areaid4;

    /**
     * 五级地区id
     */
    private Long areaid5;

    /**
     * 产品认证
     */
    private String goodsCert;

    /**
     * 产品图片4
     */
    private String image4;

    /**
     * 产品图片5
     */
    private String image5;

    /**
     * 指定购买的地区
     */
    private String buyArea;

    /**
     * 产品所有者类型 agent代理人产品 poor贫困户产品
     */
    private String ownerType;

    /**
     * bizbuy 支持企业集采,self_goods自产 replace_goods代销
     */
    private String goodsType;

    /**
     * 助理人id
     */
    private Integer assistId;

    /**
     * 贫困户类型
     */
    private Byte poorType;

    /**
     * 产品所属贫困户id
     */
    private Integer poorMid;

    /**
     * 渠道标识
     */
    private String channel;

    /**
     * 产品价格参考网址
     */
    private String priceRefer;

    /**
     * 特产馆排序
     */
    private BigDecimal specialitySort;

    /**
     * 同类商品排序
     */
    private BigDecimal sameGcSort;

    /**
     * pt普通商品,qkys全款预售商品
     */
    private String tradeMode;

    /**
     * 预售时间
     */
    private Integer presellTime;

    /**
     * 最需帮扶排序
     */
    private BigDecimal mostNeedSort;

    /**
     * 定点扶贫县的id
     */
    private Long supportCountyId;

    /**
     * 集采运营中心id
     */
    private Integer bizOperationMid;
    /**
     * 商品规格序列化
     */
    private String goodsSpec;
    
    private String specValue;
	private String goodsAttr;
	
	private BigDecimal bocPointsPrice;
	private BigDecimal discountMoney;
	private Long  goodsStorage;
	
	private BigDecimal sprice;
	
    public String getSpecValue() {
		return specValue;
	}

	public void setSpecValue(String specValue) {
		this.specValue = specValue;
	}

	
	public String getGoodsSpec() {
		return goodsSpec;
	}

	public void setGoodsSpec(String goodsSpec) {
		this.goodsSpec = goodsSpec;
	}

	public Byte getWholesaleType() {
		return wholesaleType;
	}

	public void setWholesaleType(Byte wholesaleType) {
		this.wholesaleType = wholesaleType;
	}

	public Integer getWholesaleNum() {
		return wholesaleNum;
	}

	public void setWholesaleNum(Integer wholesaleNum) {
		this.wholesaleNum = wholesaleNum;
	}

	public String getGoodsAttr() {
		return goodsAttr;
	}

	public void setGoodsAttr(String goodsAttr) {
		this.goodsAttr = goodsAttr;
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
     * 图书书名
     * @return goods_title 图书书名
     */
    public String getGoodsTitle() {
        return goodsTitle;
    }

    /**
     * 图书书名
     * @param goodsTitle 图书书名
     */
    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle == null ? null : goodsTitle.trim();
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
     * 商品分类
     * @return gc_id 商品分类
     */
    public Integer getGcId() {
        return gcId;
    }

    /**
     * 商品分类
     * @param gcId 商品分类
     */
    public void setGcId(Integer gcId) {
        this.gcId = gcId;
    }

    /**
     * 商品分类
     * @return gc_name 商品分类
     */
    public String getGcName() {
        return gcName;
    }

    /**
     * 商品分类
     * @param gcName 商品分类
     */
    public void setGcName(String gcName) {
        this.gcName = gcName == null ? null : gcName.trim();
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
     * 规格名称
     * @return spec_name 规格名称
     */
    public String getSpecName() {
        return specName;
    }

    /**
     * 规格名称
     * @param specName 规格名称
     */
    public void setSpecName(String specName) {
        this.specName = specName == null ? null : specName.trim();
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

    /**
     * 品牌名称
     * @return brand_name 品牌名称
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * 品牌名称
     * @param brandName 品牌名称
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    /**
     * 类型id
     * @return type_id 类型id
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * 类型id
     * @param typeId 类型id
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
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
     * 违规原因
     * @return goods_stateremark 违规原因
     */
    public String getGoodsStateremark() {
        return goodsStateremark;
    }

    /**
     * 违规原因
     * @param goodsStateremark 违规原因
     */
    public void setGoodsStateremark(String goodsStateremark) {
        this.goodsStateremark = goodsStateremark == null ? null : goodsStateremark.trim();
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
     * 审核失败原因
     * @return goods_verifyremark 审核失败原因
     */
    public String getGoodsVerifyremark() {
        return goodsVerifyremark;
    }

    /**
     * 审核失败原因
     * @param goodsVerifyremark 审核失败原因
     */
    public void setGoodsVerifyremark(String goodsVerifyremark) {
        this.goodsVerifyremark = goodsVerifyremark == null ? null : goodsVerifyremark.trim();
    }

    /**
     * 商品锁定 0未锁，1已锁
     * @return goods_lock 商品锁定 0未锁，1已锁
     */
    public Byte getGoodsLock() {
        return goodsLock;
    }

    /**
     * 商品锁定 0未锁，1已锁
     * @param goodsLock 商品锁定 0未锁，1已锁
     */
    public void setGoodsLock(Byte goodsLock) {
        this.goodsLock = goodsLock;
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
     * 上架时间
     * @return goods_selltime 上架时间
     */
    public Integer getGoodsSelltime() {
        return goodsSelltime;
    }

    /**
     * 上架时间
     * @param goodsSelltime 上架时间
     */
    public void setGoodsSelltime(Integer goodsSelltime) {
        this.goodsSelltime = goodsSelltime;
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
     * 成本价
     * @return goods_costprice 成本价
     */
    public BigDecimal getGoodsCostprice() {
        return goodsCostprice;
    }

    /**
     * 成本价
     * @param goodsCostprice 成本价
     */
    public void setGoodsCostprice(BigDecimal goodsCostprice) {
        this.goodsCostprice = goodsCostprice;
    }

    /**
     * 折扣
     * @return goods_discount 折扣
     */
    public Float getGoodsDiscount() {
        return goodsDiscount;
    }

    /**
     * 折扣
     * @param goodsDiscount 折扣
     */
    public void setGoodsDiscount(Float goodsDiscount) {
        this.goodsDiscount = goodsDiscount;
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
     * 运费模板
     * @return transport_id 运费模板
     */
    public Integer getTransportId() {
        return transportId;
    }

    /**
     * 运费模板
     * @param transportId 运费模板
     */
    public void setTransportId(Integer transportId) {
        this.transportId = transportId;
    }

    /**
     * 运费模板名称
     * @return transport_title 运费模板名称
     */
    public String getTransportTitle() {
        return transportTitle;
    }

    /**
     * 运费模板名称
     * @param transportTitle 运费模板名称
     */
    public void setTransportTitle(String transportTitle) {
        this.transportTitle = transportTitle == null ? null : transportTitle.trim();
    }

    /**
     * 商品推荐 1是，0否，默认为0
     * @return goods_commend 商品推荐 1是，0否，默认为0
     */
    public Byte getGoodsCommend() {
        return goodsCommend;
    }

    /**
     * 商品推荐 1是，0否，默认为0
     * @param goodsCommend 商品推荐 1是，0否，默认为0
     */
    public void setGoodsCommend(Byte goodsCommend) {
        this.goodsCommend = goodsCommend;
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
     * 一级地区id
     * @return areaid_1 一级地区id
     */
    public Long getAreaid1() {
        return areaid1;
    }

    /**
     * 一级地区id
     * @param areaid1 一级地区id
     */
    public void setAreaid1(Long areaid1) {
        this.areaid1 = areaid1;
    }

    /**
     * 二级地区id
     * @return areaid_2 二级地区id
     */
    public Long getAreaid2() {
        return areaid2;
    }

    /**
     * 二级地区id
     * @param areaid2 二级地区id
     */
    public void setAreaid2(Long areaid2) {
        this.areaid2 = areaid2;
    }

    /**
     * 三级地区id
     * @return areaid_3 三级地区id
     */
    public Long getAreaid3() {
        return areaid3;
    }

    /**
     * 三级地区id
     * @param areaid3 三级地区id
     */
    public void setAreaid3(Long areaid3) {
        this.areaid3 = areaid3;
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
     * 顶部关联板式
     * @return plateid_top 顶部关联板式
     */
    public Integer getPlateidTop() {
        return plateidTop;
    }

    /**
     * 顶部关联板式
     * @param plateidTop 顶部关联板式
     */
    public void setPlateidTop(Integer plateidTop) {
        this.plateidTop = plateidTop;
    }

    /**
     * 底部关联板式
     * @return plateid_bottom 底部关联板式
     */
    public Integer getPlateidBottom() {
        return plateidBottom;
    }

    /**
     * 底部关联板式
     * @param plateidBottom 底部关联板式
     */
    public void setPlateidBottom(Integer plateidBottom) {
        this.plateidBottom = plateidBottom;
    }

    /**
     * 商品开始时间
     * @return goods_startime 商品开始时间
     */
    public Integer getGoodsStartime() {
        return goodsStartime;
    }

    /**
     * 商品开始时间
     * @param goodsStartime 商品开始时间
     */
    public void setGoodsStartime(Integer goodsStartime) {
        this.goodsStartime = goodsStartime;
    }

    /**
     * 商品结束时间
     * @return goods_endtime 商品结束时间
     */
    public Integer getGoodsEndtime() {
        return goodsEndtime;
    }

    /**
     * 商品结束时间
     * @param goodsEndtime 商品结束时间
     */
    public void setGoodsEndtime(Integer goodsEndtime) {
        this.goodsEndtime = goodsEndtime;
    }

    /**
     * 所属地区
     * @return goods_areainfo 所属地区
     */
    public String getGoodsAreainfo() {
        return goodsAreainfo;
    }

    /**
     * 所属地区
     * @param goodsAreainfo 所属地区
     */
    public void setGoodsAreainfo(String goodsAreainfo) {
        this.goodsAreainfo = goodsAreainfo == null ? null : goodsAreainfo.trim();
    }

    /**
     * 实物资源的物流信息
     * @return goods_delivery_info 实物资源的物流信息
     */
    public String getGoodsDeliveryInfo() {
        return goodsDeliveryInfo;
    }

    /**
     * 实物资源的物流信息
     * @param goodsDeliveryInfo 实物资源的物流信息
     */
    public void setGoodsDeliveryInfo(String goodsDeliveryInfo) {
        this.goodsDeliveryInfo = goodsDeliveryInfo == null ? null : goodsDeliveryInfo.trim();
    }

    /**
     * 时间资源或者能力资源的服务开始时间
     * @return service_startime 时间资源或者能力资源的服务开始时间
     */
    public Integer getServiceStartime() {
        return serviceStartime;
    }

    /**
     * 时间资源或者能力资源的服务开始时间
     * @param serviceStartime 时间资源或者能力资源的服务开始时间
     */
    public void setServiceStartime(Integer serviceStartime) {
        this.serviceStartime = serviceStartime;
    }

    /**
     * 时间资源或者能力资源的服务结束时间
     * @return service_endtime 时间资源或者能力资源的服务结束时间
     */
    public Integer getServiceEndtime() {
        return serviceEndtime;
    }

    /**
     * 时间资源或者能力资源的服务结束时间
     * @param serviceEndtime 时间资源或者能力资源的服务结束时间
     */
    public void setServiceEndtime(Integer serviceEndtime) {
        this.serviceEndtime = serviceEndtime;
    }

    /**
     * 时间资源或者能力资源的固定时间模式
     * @return service_fixtime_pattern 时间资源或者能力资源的固定时间模式
     */
    public String getServiceFixtimePattern() {
        return serviceFixtimePattern;
    }

    /**
     * 时间资源或者能力资源的固定时间模式
     * @param serviceFixtimePattern 时间资源或者能力资源的固定时间模式
     */
    public void setServiceFixtimePattern(String serviceFixtimePattern) {
        this.serviceFixtimePattern = serviceFixtimePattern == null ? null : serviceFixtimePattern.trim();
    }

    /**
     * 时间资源或者能力资源的其他服务信息
     * @return service_info 时间资源或者能力资源的其他服务信息
     */
    public String getServiceInfo() {
        return serviceInfo;
    }

    /**
     * 时间资源或者能力资源的其他服务信息
     * @param serviceInfo 时间资源或者能力资源的其他服务信息
     */
    public void setServiceInfo(String serviceInfo) {
        this.serviceInfo = serviceInfo == null ? null : serviceInfo.trim();
    }

    /**
     * 时间能力空间资源可用时间的模式，1：自由协商2：固定时间3：一段时间内。可复选
     * @return service_timemode 时间能力空间资源可用时间的模式，1：自由协商2：固定时间3：一段时间内。可复选
     */
    public String getServiceTimemode() {
        return serviceTimemode;
    }

    /**
     * 时间能力空间资源可用时间的模式，1：自由协商2：固定时间3：一段时间内。可复选
     * @param serviceTimemode 时间能力空间资源可用时间的模式，1：自由协商2：固定时间3：一段时间内。可复选
     */
    public void setServiceTimemode(String serviceTimemode) {
        this.serviceTimemode = serviceTimemode == null ? null : serviceTimemode.trim();
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
     * 募捐目标数量
     * @return goods_storage_target 募捐目标数量
     */
    public Long getGoodsStorageTarget() {
        return goodsStorageTarget;
    }

    /**
     * 募捐目标数量
     * @param goodsStorageTarget 募捐目标数量
     */
    public void setGoodsStorageTarget(Long goodsStorageTarget) {
        this.goodsStorageTarget = goodsStorageTarget;
    }

    /**
     * 募捐活动id
     * @return goods_activity_id 募捐活动id
     */
    public Integer getGoodsActivityId() {
        return goodsActivityId;
    }

    /**
     * 募捐活动id
     * @param goodsActivityId 募捐活动id
     */
    public void setGoodsActivityId(Integer goodsActivityId) {
        this.goodsActivityId = goodsActivityId;
    }

    /**
     * 项目类型(1基金会捐物/2基金会捐款/3基金会活动/4个人实物/5个人时间/6个人技能/7个人空间)
     * @return goods_project_type 项目类型(1基金会捐物/2基金会捐款/3基金会活动/4个人实物/5个人时间/6个人技能/7个人空间)
     */
    public Integer getGoodsProjectType() {
        return goodsProjectType;
    }

    /**
     * 项目类型(1基金会捐物/2基金会捐款/3基金会活动/4个人实物/5个人时间/6个人技能/7个人空间)
     * @param goodsProjectType 项目类型(1基金会捐物/2基金会捐款/3基金会活动/4个人实物/5个人时间/6个人技能/7个人空间)
     */
    public void setGoodsProjectType(Integer goodsProjectType) {
        this.goodsProjectType = goodsProjectType;
    }

    /**
     * 代收地址
     * @return receiver_address 代收地址
     */
    public String getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * 代收地址
     * @param receiverAddress 代收地址
     */
    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress == null ? null : receiverAddress.trim();
    }

    /**
     * 代收人姓名
     * @return receiver_name 代收人姓名
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * 代收人姓名
     * @param receiverName 代收人姓名
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    /**
     * 代收人联系电话
     * @return receiver_mobile 代收人联系电话
     */
    public String getReceiverMobile() {
        return receiverMobile;
    }

    /**
     * 代收人联系电话
     * @param receiverMobile 代收人联系电话
     */
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile == null ? null : receiverMobile.trim();
    }

    /**
     * 代收地址邮编
     * @return receiver_postcode 代收地址邮编
     */
    public String getReceiverPostcode() {
        return receiverPostcode;
    }

    /**
     * 代收地址邮编
     * @param receiverPostcode 代收地址邮编
     */
    public void setReceiverPostcode(String receiverPostcode) {
        this.receiverPostcode = receiverPostcode == null ? null : receiverPostcode.trim();
    }

    /**
     * 募捐活动名称
     * @return goods_activity_name 募捐活动名称
     */
    public String getGoodsActivityName() {
        return goodsActivityName;
    }

    /**
     * 募捐活动名称
     * @param goodsActivityName 募捐活动名称
     */
    public void setGoodsActivityName(String goodsActivityName) {
        this.goodsActivityName = goodsActivityName == null ? null : goodsActivityName.trim();
    }

    /**
     * 技能id，多个id用|分隔
     * @return skill_id 技能id，多个id用|分隔
     */
    public String getSkillId() {
        return skillId;
    }

    /**
     * 技能id，多个id用|分隔
     * @param skillId 技能id，多个id用|分隔
     */
    public void setSkillId(String skillId) {
        this.skillId = skillId == null ? null : skillId.trim();
    }

    /**
     * 项目详情页样式模板
     * @return goods_template 项目详情页样式模板
     */
    public String getGoodsTemplate() {
        return goodsTemplate;
    }

    /**
     * 项目详情页样式模板
     * @param goodsTemplate 项目详情页样式模板
     */
    public void setGoodsTemplate(String goodsTemplate) {
        this.goodsTemplate = goodsTemplate == null ? null : goodsTemplate.trim();
    }

    /**
     * 活动取消理由
     * @return goods_comment 活动取消理由
     */
    public String getGoodsComment() {
        return goodsComment;
    }

    /**
     * 活动取消理由
     * @param goodsComment 活动取消理由
     */
    public void setGoodsComment(String goodsComment) {
        this.goodsComment = goodsComment == null ? null : goodsComment.trim();
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
     * 产品图片1
     * @return image1 产品图片1
     */
    public String getImage1() {
        return image1;
    }

    /**
     * 产品图片1
     * @param image1 产品图片1
     */
    public void setImage1(String image1) {
        this.image1 = image1 == null ? null : image1.trim();
    }

    /**
     * 产品图片2
     * @return image2 产品图片2
     */
    public String getImage2() {
        return image2;
    }

    /**
     * 产品图片2
     * @param image2 产品图片2
     */
    public void setImage2(String image2) {
        this.image2 = image2 == null ? null : image2.trim();
    }

    /**
     * 产品图片3
     * @return image3 产品图片3
     */
    public String getImage3() {
        return image3;
    }

    /**
     * 产品图片3
     * @param image3 产品图片3
     */
    public void setImage3(String image3) {
        this.image3 = image3 == null ? null : image3.trim();
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
     * 管理费的比例，实际比例为该值除以1000
     * @return m_fee_rate 管理费的比例，实际比例为该值除以1000
     */
    public Short getmFeeRate() {
        return mFeeRate;
    }

    /**
     * 管理费的比例，实际比例为该值除以1000
     * @param mFeeRate 管理费的比例，实际比例为该值除以1000
     */
    public void setmFeeRate(Short mFeeRate) {
        this.mFeeRate = mFeeRate;
    }

    /**
     * 扩展活动类型:如活动下的讲座类型
     * @return extend_type 扩展活动类型:如活动下的讲座类型
     */
    public String getExtendType() {
        return extendType;
    }

    /**
     * 扩展活动类型:如活动下的讲座类型
     * @param extendType 扩展活动类型:如活动下的讲座类型
     */
    public void setExtendType(String extendType) {
        this.extendType = extendType == null ? null : extendType.trim();
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
     * 商品销售数量
     * @return sale_num 商品销售数量
     */
    public Integer getSaleNum() {
        return saleNum;
    }

    /**
     * 商品销售数量
     * @param saleNum 商品销售数量
     */
    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    /**
     * 综合排序
     * @return overall_sort 综合排序
     */
    public BigDecimal getOverallSort() {
        return overallSort;
    }

    /**
     * 综合排序
     * @param overallSort 综合排序
     */
    public void setOverallSort(BigDecimal overallSort) {
        this.overallSort = overallSort;
    }

    /**
     * 四级地区id
     * @return areaid_4 四级地区id
     */
    public Long getAreaid4() {
        return areaid4;
    }

    /**
     * 四级地区id
     * @param areaid4 四级地区id
     */
    public void setAreaid4(Long areaid4) {
        this.areaid4 = areaid4;
    }

    /**
     * 五级地区id
     * @return areaid_5 五级地区id
     */
    public Long getAreaid5() {
        return areaid5;
    }

    /**
     * 五级地区id
     * @param areaid5 五级地区id
     */
    public void setAreaid5(Long areaid5) {
        this.areaid5 = areaid5;
    }

    /**
     * 产品认证
     * @return goods_cert 产品认证
     */
    public String getGoodsCert() {
        return goodsCert;
    }

    /**
     * 产品认证
     * @param goodsCert 产品认证
     */
    public void setGoodsCert(String goodsCert) {
        this.goodsCert = goodsCert == null ? null : goodsCert.trim();
    }

    /**
     * 产品图片4
     * @return image4 产品图片4
     */
    public String getImage4() {
        return image4;
    }

    /**
     * 产品图片4
     * @param image4 产品图片4
     */
    public void setImage4(String image4) {
        this.image4 = image4 == null ? null : image4.trim();
    }

    /**
     * 产品图片5
     * @return image5 产品图片5
     */
    public String getImage5() {
        return image5;
    }

    /**
     * 产品图片5
     * @param image5 产品图片5
     */
    public void setImage5(String image5) {
        this.image5 = image5 == null ? null : image5.trim();
    }

    /**
     * 指定购买的地区
     * @return buy_area 指定购买的地区
     */
    public String getBuyArea() {
        return buyArea;
    }

    /**
     * 指定购买的地区
     * @param buyArea 指定购买的地区
     */
    public void setBuyArea(String buyArea) {
        this.buyArea = buyArea == null ? null : buyArea.trim();
    }

    /**
     * 产品所有者类型 agent代理人产品 poor贫困户产品
     * @return owner_type 产品所有者类型 agent代理人产品 poor贫困户产品
     */
    public String getOwnerType() {
        return ownerType;
    }

    /**
     * 产品所有者类型 agent代理人产品 poor贫困户产品
     * @param ownerType 产品所有者类型 agent代理人产品 poor贫困户产品
     */
    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType == null ? null : ownerType.trim();
    }

    /**
     * bizbuy 支持企业集采,self_goods自产 replace_goods代销
     * @return goods_type bizbuy 支持企业集采,self_goods自产 replace_goods代销
     */
    public String getGoodsType() {
        return goodsType;
    }

    /**
     * bizbuy 支持企业集采,self_goods自产 replace_goods代销
     * @param goodsType bizbuy 支持企业集采,self_goods自产 replace_goods代销
     */
    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType == null ? null : goodsType.trim();
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
     * 贫困户类型
     * @return poor_type 贫困户类型
     */
    public Byte getPoorType() {
        return poorType;
    }

    /**
     * 贫困户类型
     * @param poorType 贫困户类型
     */
    public void setPoorType(Byte poorType) {
        this.poorType = poorType;
    }

    /**
     * 产品所属贫困户id
     * @return poor_mid 产品所属贫困户id
     */
    public Integer getPoorMid() {
        return poorMid;
    }

    /**
     * 产品所属贫困户id
     * @param poorMid 产品所属贫困户id
     */
    public void setPoorMid(Integer poorMid) {
        this.poorMid = poorMid;
    }

    /**
     * 渠道标识
     * @return channel 渠道标识
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 渠道标识
     * @param channel 渠道标识
     */
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    /**
     * 产品价格参考网址
     * @return price_refer 产品价格参考网址
     */
    public String getPriceRefer() {
        return priceRefer;
    }

    /**
     * 产品价格参考网址
     * @param priceRefer 产品价格参考网址
     */
    public void setPriceRefer(String priceRefer) {
        this.priceRefer = priceRefer == null ? null : priceRefer.trim();
    }

    /**
     * 特产馆排序
     * @return speciality_sort 特产馆排序
     */
    public BigDecimal getSpecialitySort() {
        return specialitySort;
    }

    /**
     * 特产馆排序
     * @param specialitySort 特产馆排序
     */
    public void setSpecialitySort(BigDecimal specialitySort) {
        this.specialitySort = specialitySort;
    }

    /**
     * 同类商品排序
     * @return same_gc_sort 同类商品排序
     */
    public BigDecimal getSameGcSort() {
        return sameGcSort;
    }

    /**
     * 同类商品排序
     * @param sameGcSort 同类商品排序
     */
    public void setSameGcSort(BigDecimal sameGcSort) {
        this.sameGcSort = sameGcSort;
    }

    /**
     * pt普通商品,qkys全款预售商品
     * @return trade_mode pt普通商品,qkys全款预售商品
     */
    public String getTradeMode() {
        return tradeMode;
    }

    /**
     * pt普通商品,qkys全款预售商品
     * @param tradeMode pt普通商品,qkys全款预售商品
     */
    public void setTradeMode(String tradeMode) {
        this.tradeMode = tradeMode == null ? null : tradeMode.trim();
    }

    /**
     * 预售时间
     * @return presell_time 预售时间
     */
    public Integer getPresellTime() {
        return presellTime;
    }

    /**
     * 预售时间
     * @param presellTime 预售时间
     */
    public void setPresellTime(Integer presellTime) {
        this.presellTime = presellTime;
    }

    /**
     * 最需帮扶排序
     * @return most_need_sort 最需帮扶排序
     */
    public BigDecimal getMostNeedSort() {
        return mostNeedSort;
    }

    /**
     * 最需帮扶排序
     * @param mostNeedSort 最需帮扶排序
     */
    public void setMostNeedSort(BigDecimal mostNeedSort) {
        this.mostNeedSort = mostNeedSort;
    }

    /**
     * 定点扶贫县的id
     * @return support_county_id 定点扶贫县的id
     */
    public Long getSupportCountyId() {
        return supportCountyId;
    }

    /**
     * 定点扶贫县的id
     * @param supportCountyId 定点扶贫县的id
     */
    public void setSupportCountyId(Long supportCountyId) {
        this.supportCountyId = supportCountyId;
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

	public BigDecimal getShippingFee() {
		return shippingFee;
	}

	public void setShippingFee(BigDecimal shippingFee) {
		this.shippingFee = shippingFee;
	}

	public BigDecimal getPoorGetFee() {
		return poorGetFee;
	}

	public void setPoorGetFee(BigDecimal poorGetFee) {
		this.poorGetFee = poorGetFee;
	}

	public BigDecimal getBocPointsPrice() {
		return bocPointsPrice;
	}

	public void setBocPointsPrice(BigDecimal bocPointsPrice) {
		this.bocPointsPrice = bocPointsPrice;
	}

	public BigDecimal getDiscountMoney() {
		return discountMoney;
	}

	public void setDiscountMoney(BigDecimal discountMoney) {
		this.discountMoney = discountMoney;
	}

	public Long getGoodsStorage() {
		return goodsStorage;
	}

	public void setGoodsStorage(Long goodsStorage) {
		this.goodsStorage = goodsStorage;
	}
	
	//商品详情其他值
	private String pulisherAreaName;
	private Double refundRate;
	private Double complainRate;
	private Integer onlineGoodsCount;
	private Integer sendSpeed;
	private String isFresh;
	private String sendSpeedDesc;
	private String refundRateDesc;
	private String complainRateDesc;
	private Integer maxNum;
	private Integer storage;

	public String getPulisherAreaName() {
		return pulisherAreaName;
	}

	public void setPulisherAreaName(String pulisherAreaName) {
		this.pulisherAreaName = pulisherAreaName;
	}

	public Double getRefundRate() {
		return refundRate;
	}

	public void setRefundRate(Double refundRate) {
		this.refundRate = refundRate;
	}

	public Double getComplainRate() {
		return complainRate;
	}

	public void setComplainRate(Double complainRate) {
		this.complainRate = complainRate;
	}

	public Integer getOnlineGoodsCount() {
		return onlineGoodsCount;
	}

	public void setOnlineGoodsCount(Integer onlineGoodsCount) {
		this.onlineGoodsCount = onlineGoodsCount;
	}
	
	public Integer getSendSpeed() {
		return sendSpeed;
	}

	public void setSendSpeed(Integer sendSpeed) {
		this.sendSpeed = sendSpeed;
	}

	public String getIsFresh() {
		return isFresh;
	}

	public void setIsFresh(String isFresh) {
		this.isFresh = isFresh;
	}

	public String getSendSpeedDesc() {
		return sendSpeedDesc;
	}

	public void setSendSpeedDesc(String sendSpeedDesc) {
		this.sendSpeedDesc = sendSpeedDesc;
	}

	public String getRefundRateDesc() {
		return refundRateDesc;
	}

	public void setRefundRateDesc(String refundRateDesc) {
		this.refundRateDesc = refundRateDesc;
	}

	public String getComplainRateDesc() {
		return complainRateDesc;
	}

	public void setComplainRateDesc(String complainRateDesc) {
		this.complainRateDesc = complainRateDesc;
	}

	public Integer getMaxNum() {
		return maxNum;
	}

	public void setMaxNum(Integer maxNum) {
		this.maxNum = maxNum;
	}

	public Integer getStorage() {
		return storage;
	}

	public void setStorage(Integer storage) {
		this.storage = storage;
	}

	public BigDecimal getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(BigDecimal discountRate) {
		this.discountRate = discountRate;
	}

	public BigDecimal getSprice() {
		return sprice;
	}

	public void setSprice(BigDecimal sprice) {
		this.sprice = sprice;
	}
	
	
}