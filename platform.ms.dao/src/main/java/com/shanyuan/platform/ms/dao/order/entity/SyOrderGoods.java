package com.shanyuan.platform.ms.dao.order.entity;

import java.math.BigDecimal;

/**
 * 描述:sy_order_goods表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-10-18
 */
public class SyOrderGoods {
	//====订单表
	 /**
	     * 支付单号
	     */
	private Long paySn;
	
    /**
     *批发设置 1批发，0仅零售，默认为0
     */
    private Byte wholesaleType;
    /**
     *批发详情 retail_price:零售价,wholesale_price:批发价,wholesale_num:批发数量
     */
    private String wholesaleInfo;
	  /**
	     * 项目类型(1基金会捐物/2基金会捐款/3基金会活动/4个人实物/5个人时间/6个人技能/7个人空间)
	     */
	 private Integer goodsProjectType;
	 
	    public Long getPaySn() {
			return paySn;
		}

		public void setPaySn(Long paySn) {
			this.paySn = paySn;
		}

		public Integer getGoodsProjectType() {
			return goodsProjectType;
		}

		public void setGoodsProjectType(Integer goodsProjectType) {
			this.goodsProjectType = goodsProjectType;
		}
	//====订单表 end
    /**
     * 订单商品表索引id
     */
    private Integer recId;



	/**
     * 订单id
     */
    private Integer orderId;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 商品名称
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
     * 商品实际成交价
     */
    private BigDecimal goodsPayPrice;

    /**
     * 店铺ID
     */
    private Integer storeId;

    /**
     * 买家ID
     */
    private Integer buyerId;
    /**
     * 订单编号
     */
    private Long orderSn;
    /**
     * 发布者id
     */
    private Integer publisherId;
    //======order 中

    /**
     * 1默认2团购商品3限时折扣商品4组合套装5赠品
     */
    private String goodsType;

    /**
     * 促销活动ID（团购ID/限时折扣ID/优惠套装ID）与goods_type搭配使用
     */
    private Integer promotionsId;

    /**
     * 佣金比例
     */
    private Short commisRate;

    /**
     * 商品库存
     */
    private Long goodsStorage;

    /**
     * 代理人管理费的比例，实际比例为该值除以1000
     */
    private Short mFeeRate;

    /**
     * 备份代理人管理费的比例，实际比例为该值除以1000
     */
    private Short mFeeRate2;

    /**
     * 商品评价id
     */
    private Integer gevalId;

    /**
     * 分享人id
     */
    private Integer sharedMid;

    /**
     * 产品所有者类型 agent代理人产品 poor贫困户产品
     */
    private String ownerType;

    /**
     * 中元积分支付价格单位元
     */
    private BigDecimal bocPointsPrice;

    /**
     * 积分比例
     */
    private Integer bocPointRate;

    /**
     * 商品编码
     */
    private String goodsCode;

    /**
     * 贫困户类型
     */
    private Byte poorType;

    /**
     * 产品所属贫困户id
     */
    private Integer poorMid;

    /**
     * 商品公共表id
     */
    private Integer goodsCommonid;

    /**
     * 包裹编号
     */
    private Long packageNum;

    /**
     * 物流单号
     */
    private String shippingCode;

    /**
     * 配送公司ID
     */
    private Byte shippingExpressId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 渠道标识
     */
    private String channel;

    /**
     * app渠道标识,默认空
     */
    private String appVariant;

    /**
     * 满减总金额单位元
     */
    private BigDecimal discountMoney;

    /**
     * 采购价
     */
    private BigDecimal purchasePrice;

    /**
     * 满减总金额单位元(平台承担)
     */
    private BigDecimal platformPayMoney;

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
     * 订单id
     * @return order_id 订单id
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 订单id
     * @param orderId 订单id
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    
    public Byte getWholesaleType() {
		return wholesaleType;
	}

	public void setWholesaleType(Byte wholesaleType) {
		this.wholesaleType = wholesaleType;
	}


	public String getWholesaleInfo() {
		return wholesaleInfo;
	}

	public void setWholesaleInfo(String wholesaleInfo) {
		this.wholesaleInfo = wholesaleInfo;
	}
	

	public Long getOrderSn() {
		return orderSn;
	}

	public void setOrderSn(Long orderSn) {
		this.orderSn = orderSn;
	}

	public Integer getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
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
     * 商品实际成交价
     * @return goods_pay_price 商品实际成交价
     */
    public BigDecimal getGoodsPayPrice() {
        return goodsPayPrice;
    }

    /**
     * 商品实际成交价
     * @param goodsPayPrice 商品实际成交价
     */
    public void setGoodsPayPrice(BigDecimal goodsPayPrice) {
        this.goodsPayPrice = goodsPayPrice;
    }

    /**
     * 店铺ID
     * @return store_id 店铺ID
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * 店铺ID
     * @param storeId 店铺ID
     */
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    /**
     * 买家ID
     * @return buyer_id 买家ID
     */
    public Integer getBuyerId() {
        return buyerId;
    }

    /**
     * 买家ID
     * @param buyerId 买家ID
     */
    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * 1默认2团购商品3限时折扣商品4组合套装5赠品
     * @return goods_type 1默认2团购商品3限时折扣商品4组合套装5赠品
     */
    public String getGoodsType() {
        return goodsType;
    }

    /**
     * 1默认2团购商品3限时折扣商品4组合套装5赠品
     * @param goodsType 1默认2团购商品3限时折扣商品4组合套装5赠品
     */
    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType == null ? null : goodsType.trim();
    }

    /**
     * 促销活动ID（团购ID/限时折扣ID/优惠套装ID）与goods_type搭配使用
     * @return promotions_id 促销活动ID（团购ID/限时折扣ID/优惠套装ID）与goods_type搭配使用
     */
    public Integer getPromotionsId() {
        return promotionsId;
    }

    /**
     * 促销活动ID（团购ID/限时折扣ID/优惠套装ID）与goods_type搭配使用
     * @param promotionsId 促销活动ID（团购ID/限时折扣ID/优惠套装ID）与goods_type搭配使用
     */
    public void setPromotionsId(Integer promotionsId) {
        this.promotionsId = promotionsId;
    }

    /**
     * 佣金比例
     * @return commis_rate 佣金比例
     */
    public Short getCommisRate() {
        return commisRate;
    }

    /**
     * 佣金比例
     * @param commisRate 佣金比例
     */
    public void setCommisRate(Short commisRate) {
        this.commisRate = commisRate;
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
     * 代理人管理费的比例，实际比例为该值除以1000
     * @return m_fee_rate 代理人管理费的比例，实际比例为该值除以1000
     */
    public Short getmFeeRate() {
        return mFeeRate;
    }

    /**
     * 代理人管理费的比例，实际比例为该值除以1000
     * @param mFeeRate 代理人管理费的比例，实际比例为该值除以1000
     */
    public void setmFeeRate(Short mFeeRate) {
        this.mFeeRate = mFeeRate;
    }

    /**
     * 备份代理人管理费的比例，实际比例为该值除以1000
     * @return m_fee_rate2 备份代理人管理费的比例，实际比例为该值除以1000
     */
    public Short getmFeeRate2() {
        return mFeeRate2;
    }

    /**
     * 备份代理人管理费的比例，实际比例为该值除以1000
     * @param mFeeRate2 备份代理人管理费的比例，实际比例为该值除以1000
     */
    public void setmFeeRate2(Short mFeeRate2) {
        this.mFeeRate2 = mFeeRate2;
    }

    /**
     * 商品评价id
     * @return geval_id 商品评价id
     */
    public Integer getGevalId() {
        return gevalId;
    }

    /**
     * 商品评价id
     * @param gevalId 商品评价id
     */
    public void setGevalId(Integer gevalId) {
        this.gevalId = gevalId;
    }

    /**
     * 分享人id
     * @return shared_mid 分享人id
     */
    public Integer getSharedMid() {
        return sharedMid;
    }

    /**
     * 分享人id
     * @param sharedMid 分享人id
     */
    public void setSharedMid(Integer sharedMid) {
        this.sharedMid = sharedMid;
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
     * 中元积分支付价格单位元
     * @return boc_points_price 中元积分支付价格单位元
     */
    public BigDecimal getBocPointsPrice() {
        return bocPointsPrice;
    }

    /**
     * 中元积分支付价格单位元
     * @param bocPointsPrice 中元积分支付价格单位元
     */
    public void setBocPointsPrice(BigDecimal bocPointsPrice) {
        this.bocPointsPrice = bocPointsPrice;
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
     * 包裹编号
     * @return package_num 包裹编号
     */
    public Long getPackageNum() {
        return packageNum;
    }

    /**
     * 包裹编号
     * @param packageNum 包裹编号
     */
    public void setPackageNum(Long packageNum) {
        this.packageNum = packageNum;
    }

    /**
     * 物流单号
     * @return shipping_code 物流单号
     */
    public String getShippingCode() {
        return shippingCode;
    }

    /**
     * 物流单号
     * @param shippingCode 物流单号
     */
    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode == null ? null : shippingCode.trim();
    }

    /**
     * 配送公司ID
     * @return shipping_express_id 配送公司ID
     */
    public Byte getShippingExpressId() {
        return shippingExpressId;
    }

    /**
     * 配送公司ID
     * @param shippingExpressId 配送公司ID
     */
    public void setShippingExpressId(Byte shippingExpressId) {
        this.shippingExpressId = shippingExpressId;
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
     * app渠道标识,默认空
     * @return app_variant app渠道标识,默认空
     */
    public String getAppVariant() {
        return appVariant;
    }

    /**
     * app渠道标识,默认空
     * @param appVariant app渠道标识,默认空
     */
    public void setAppVariant(String appVariant) {
        this.appVariant = appVariant == null ? null : appVariant.trim();
    }

    /**
     * 满减总金额单位元
     * @return discount_money 满减总金额单位元
     */
    public BigDecimal getDiscountMoney() {
        return discountMoney;
    }

    /**
     * 满减总金额单位元
     * @param discountMoney 满减总金额单位元
     */
    public void setDiscountMoney(BigDecimal discountMoney) {
        this.discountMoney = discountMoney;
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
     * 满减总金额单位元(平台承担)
     * @return platform_pay_money 满减总金额单位元(平台承担)
     */
    public BigDecimal getPlatformPayMoney() {
        return platformPayMoney;
    }

    /**
     * 满减总金额单位元(平台承担)
     * @param platformPayMoney 满减总金额单位元(平台承担)
     */
    public void setPlatformPayMoney(BigDecimal platformPayMoney) {
        this.platformPayMoney = platformPayMoney;
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

	@Override
	public String toString() {
		return "SyOrderGoods [paySn=" + paySn + ", goodsProjectType=" + goodsProjectType + ", recId=" + recId
				+ ", orderId=" + orderId + ", goodsId=" + goodsId + ", goodsName=" + goodsName + ", goodsPrice="
				+ goodsPrice + ", goodsNum=" + goodsNum + ", goodsImage=" + goodsImage + ", goodsPayPrice="
				+ goodsPayPrice + ", storeId=" + storeId + ", buyerId=" + buyerId + ", goodsType=" + goodsType
				+ ", promotionsId=" + promotionsId + ", commisRate=" + commisRate + ", goodsStorage=" + goodsStorage
				+ ", mFeeRate=" + mFeeRate + ", mFeeRate2=" + mFeeRate2 + ", gevalId=" + gevalId + ", sharedMid="
				+ sharedMid + ", ownerType=" + ownerType + ", bocPointsPrice=" + bocPointsPrice + ", bocPointRate="
				+ bocPointRate + ", goodsCode=" + goodsCode + ", poorType=" + poorType + ", poorMid=" + poorMid
				+ ", goodsCommonid=" + goodsCommonid + ", packageNum=" + packageNum + ", shippingCode=" + shippingCode
				+ ", shippingExpressId=" + shippingExpressId + ", remark=" + remark + ", channel=" + channel
				+ ", appVariant=" + appVariant + ", discountMoney=" + discountMoney + ", purchasePrice=" + purchasePrice
				+ ", platformPayMoney=" + platformPayMoney + ", goodsSpec=" + goodsSpec + "]";
	}
    
    
    
}