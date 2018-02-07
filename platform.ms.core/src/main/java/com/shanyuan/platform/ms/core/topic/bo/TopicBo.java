package com.shanyuan.platform.ms.core.topic.bo;

import java.io.Serializable;
import java.math.BigDecimal;


public class TopicBo implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    private Integer topicId;
    private Integer goodsId;
    private Integer goodsCommonid;

	private String dailyLimited;
	private String saleStartTime;
	private String floorType;
	private String floorSort;
	private String floorImageUrl;
	private String ShowUrl;
	private Integer startTime;
	private String goodsStatus;
	private Integer actStorage;//实际库存

	public String getGoodsStatus() {
		return goodsStatus;
	}

	public Integer getStartTime() {
		return startTime;
	}

	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
	}

	public void setGoodsStatus(String goodsStatus) {
		this.goodsStatus = goodsStatus;
	}

	public Integer getActStorage() {
		return actStorage;
	}

	public void setActStorage(Integer actStorage) {
		this.actStorage = actStorage;
	}

	public Integer getTopicId() {
		return topicId;
	}

	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public Integer getGoodsCommonid() {
		return goodsCommonid;
	}

	public void setGoodsCommonid(Integer goodsCommonid) {
		this.goodsCommonid = goodsCommonid;
	}

	public String getDailyLimited() {
		return dailyLimited;
	}

	public void setDailyLimited(String dailyLimited) {
		this.dailyLimited = dailyLimited;
	}

	public String getSaleStartTime() {
		return saleStartTime;
	}

	public void setSaleStartTime(String saleStartTime) {
		this.saleStartTime = saleStartTime;
	}

	public String getFloorType() {
		return floorType;
	}

	public void setFloorType(String floorType) {
		this.floorType = floorType;
	}

	public String getFloorSort() {
		return floorSort;
	}

	public void setFloorSort(String floorSort) {
		this.floorSort = floorSort;
	}

	public String getFloorImageUrl() {
		return floorImageUrl;
	}

	public void setFloorImageUrl(String floorImageUrl) {
		this.floorImageUrl = floorImageUrl;
	}

	public String getShowUrl() {
		return ShowUrl;
	}

	public void setShowUrl(String showUrl) {
		ShowUrl = showUrl;
	}

	@Override
	public String toString() {
		return "TopicBo{" +
				"topicId=" + topicId +
				", goodsId=" + goodsId +
				", goodsCommonid=" + goodsCommonid +
				", dailyLimited='" + dailyLimited + '\'' +
				", saleStartTime='" + saleStartTime + '\'' +
				", floorType='" + floorType + '\'' +
				", floorSort='" + floorSort + '\'' +
				", floorImageUrl='" + floorImageUrl + '\'' +
				", ShowUrl='" + ShowUrl + '\'' +
				", startTime=" + startTime +
				", goodsStatus='" + goodsStatus + '\'' +
				", actStorage=" + actStorage +
				'}';
	}
}
