package com.shanyuan.platform.ms.dao.goods.entity;

import java.math.BigDecimal;

public class AvgGoodsStoreScore {
	
	private Integer publisherId;
	
    /**
     * 商品的评价的平均分
     */
    private BigDecimal goodsScoreAvg;
    
    /**
     * 店铺的数量
     */
    private Integer storeEvaluateCount;
    
    /**
     * 服务态度平均分
     */
    private BigDecimal servicecreditAvg;
    
    
    
    public Integer getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
	}
	/**
     * 发货速度平均分
     */
    private BigDecimal sevaldeliverycreditAvg;
	public BigDecimal getGoodsScoreAvg() {
		return goodsScoreAvg;
	}
	public void setGoodsScoreAvg(BigDecimal goodsScoreAvg) {
		this.goodsScoreAvg = goodsScoreAvg;
	}
	public Integer getStoreEvaluateCount() {
		return storeEvaluateCount;
	}
	public void setStoreEvaluateCount(Integer storeEvaluateCount) {
		this.storeEvaluateCount = storeEvaluateCount;
	}
	public BigDecimal getServicecreditAvg() {
		return servicecreditAvg;
	}
	public void setServicecreditAvg(BigDecimal servicecreditAvg) {
		this.servicecreditAvg = servicecreditAvg;
	}
	public BigDecimal getSevaldeliverycreditAvg() {
		return sevaldeliverycreditAvg;
	}
	public void setSevaldeliverycreditAvg(BigDecimal sevaldeliverycreditAvg) {
		this.sevaldeliverycreditAvg = sevaldeliverycreditAvg;
	}
    
    
    

}
