package com.shanyuan.platform.ms.dao.union.entity;

import java.math.BigDecimal;
import java.util.List;

public class SyUnionItemGoodsList {
	
	 /**
     * 商品公共表id
     */
    private Integer goodsCommonid;

    /**
     * 商品名称
     */
    private String goodsName;
    
    /**
     * 商品价格
     */
    private BigDecimal goodsPrice;

    /**
     * 发布者的id
     */
    private Integer publisherId;
    
    private Integer storeId;
    
    private String touchUrl;

    /**
     * 项目类型(1基金会捐物/2基金会捐款/3基金会活动/4个人实物/5个人时间/6个人技能/7个人空间)
     */
    private Integer goodsProjectType;
    
    /**
     * 商品主图
     */
    private String realGooodsImage;
    

	public String getTouchUrl() {
		return touchUrl;
	}

	public void setTouchUrl(String touchUrl) {
		this.touchUrl = touchUrl;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public Integer getGoodsCommonid() {
		return goodsCommonid;
	}

	public void setGoodsCommonid(Integer goodsCommonid) {
		this.goodsCommonid = goodsCommonid;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public BigDecimal getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(BigDecimal goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public Integer getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
	}

	public Integer getGoodsProjectType() {
		return goodsProjectType;
	}

	public void setGoodsProjectType(Integer goodsProjectType) {
		this.goodsProjectType = goodsProjectType;
	}

	public String getRealGooodsImage() {
		return realGooodsImage;
	}

	public void setRealGooodsImage(String realGooodsImage) {
		this.realGooodsImage = realGooodsImage;
	}



	


    
    

}
