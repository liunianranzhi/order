package com.shanyuan.platform.ms.dao.recommend.entity;

import java.math.BigDecimal;

import com.shanyuan.platform.ms.base.common.util.ImageUtil;

/**
 * 集采推荐商品Bo
 * @author zhangwd
 *
 */
public class RecommendGoodsBo {
	/**
     * 索引id
     */
    private Integer recId;

    /**
     * 模块id
     */
    private Integer moduleId;

    /**
     * 图片地址
     */
    private String imgUrl;

    /**
     * 推荐名称
     */
    private String recommendName;

    /**
     * 推荐描述
     */
    private String recommendDesc;

    /**
     * 推荐类型分别为商品（大爱超市），公益项目，文章，贫困户，助理人，志愿队活动，专题，志愿队，站外链接
     */
    private String type;

    /**
     * 推荐的项目id
     */
    private Integer itemId;

    /**
     * 状态：0：不可用，1：可用
     */
    private Byte status;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 创建时间
     */
    private Integer createTime;

    /**
     * 落地页面地址，与item_id互斥
     */
    private String touchUrl;

    /**
     * 适配联盟
     */
    private String channel;

    /**
     * 更新时间
     */
    private Integer updateTime;

    /**
     * 广告所属banner 1-6 AD1-AD6
     */
    private Byte bannerId;

    /**
     * 广告排期开始时间
     */
    private Integer startTime;

    /**
     * 广告排期结束时间
     */
    private Integer endTime;
	
	/**
	 * 推荐商品id
	 */
	private Integer goodsCommonid;
	
	/**
	 * 推荐商品名称
	 */
	private String goodsName;
	
	/**
	 * 推荐商品图片
	 */
	private String goodsImage;
	
	/**
	 * 推荐商品price
	 */
	private BigDecimal goodsPrice;
	
	/**
	 * 店铺id
	 */
	private Integer storeId;

	/**
	 * 真实图片路径
	 * @return
	 */
	private String realImageurl;
	
	
	
	public String getRealImageurl() {
		return realImageurl;
	}

	public void setRealImageurl(String realImageurl) {
		this.realImageurl = realImageurl;
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

	public String getGoodsImage() {
		return goodsImage;
	}

	public void setGoodsImage(String goodsImage) {
		this.goodsImage = goodsImage;
	}

	public BigDecimal getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(BigDecimal goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public Integer getRecId() {
		return recId;
	}

	public void setRecId(Integer recId) {
		this.recId = recId;
	}

	public Integer getModuleId() {
		return moduleId;
	}

	public void setModuleId(Integer moduleId) {
		this.moduleId = moduleId;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getRecommendName() {
		return recommendName;
	}

	public void setRecommendName(String recommendName) {
		this.recommendName = recommendName;
	}

	public String getRecommendDesc() {
		return recommendDesc;
	}

	public void setRecommendDesc(String recommendDesc) {
		this.recommendDesc = recommendDesc;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

	public String getTouchUrl() {
		return touchUrl;
	}

	public void setTouchUrl(String touchUrl) {
		this.touchUrl = touchUrl;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Integer getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Integer updateTime) {
		this.updateTime = updateTime;
	}

	public Byte getBannerId() {
		return bannerId;
	}

	public void setBannerId(Byte bannerId) {
		this.bannerId = bannerId;
	}

	public Integer getStartTime() {
		return startTime;
	}

	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
	}

	public Integer getEndTime() {
		return endTime;
	}

	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "RecommendGoodsBo [recId=" + recId + ", moduleId=" + moduleId + ", imgUrl=" + imgUrl + ", recommendName="
				+ recommendName + ", recommendDesc=" + recommendDesc + ", type=" + type + ", itemId=" + itemId
				+ ", status=" + status + ", sort=" + sort + ", createTime=" + createTime + ", touchUrl=" + touchUrl
				+ ", channel=" + channel + ", updateTime=" + updateTime + ", bannerId=" + bannerId + ", startTime="
				+ startTime + ", endTime=" + endTime + ", goodsCommonid=" + goodsCommonid + ", goodsName=" + goodsName
				+ ", goodsImage=" + goodsImage + ", goodsPrice=" + goodsPrice + ", storeId=" + storeId + "]";
	}
	
	
}
