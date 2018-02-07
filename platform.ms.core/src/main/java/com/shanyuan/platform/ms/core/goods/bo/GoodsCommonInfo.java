package com.shanyuan.platform.ms.core.goods.bo;

import java.math.BigDecimal;

public class GoodsCommonInfo {
	
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
     * 商品图片的真实路径
     */
    private String realGoodsImage;
    
    /**
     * 图片的点击路径
     */
   private String touchUrl;
   
   
   
   
   

	public String getTouchUrl() {
		return touchUrl;
	}

	public void setTouchUrl(String touchUrl) {
		this.touchUrl = touchUrl;
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

	public String getRealGoodsImage() {
		return realGoodsImage;
	}

	public void setRealGoodsImage(String realGoodsImage) {
		this.realGoodsImage = realGoodsImage;
	}

	
    
    
    
    
    

}
