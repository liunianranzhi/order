package com.shanyuan.platform.ms.core.topic.bo;

import java.io.Serializable;


public class TopicListBo implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    private Integer id;
	private String topicTitle;
	private String beginTime;
	private String endTime;
	private String status;
	private boolean initFlag;
	private String shareTitle;
	private String shareSubtitle;
	private String shareIcon;
    private String downGuide;
    private String shareIconUrl;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getShareIconUrl() {
		return shareIconUrl;
	}

	public void setShareIconUrl(String shareIconUrl) {
		this.shareIconUrl = shareIconUrl;
	}

	public String getTopicTitle() {
		return topicTitle;
	}

	public void setTopicTitle(String topicTitle) {
		this.topicTitle = topicTitle;
	}

	public String getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isInitFlag() {
		return initFlag;
	}

	public void setInitFlag(boolean initFlag) {
		this.initFlag = initFlag;
	}

	public String getShareTitle() {
		return shareTitle;
	}

	public void setShareTitle(String shareTitle) {
		this.shareTitle = shareTitle;
	}

	public String getShareSubtitle() {
		return shareSubtitle;
	}

	public void setShareSubtitle(String shareSubtitle) {
		this.shareSubtitle = shareSubtitle;
	}

	public String getShareIcon() {
		return shareIcon;
	}

	public void setShareIcon(String shareIcon) {
		this.shareIcon = shareIcon;
	}

	public String getDownGuide() {
		return downGuide;
	}

	public void setDownGuide(String downGuide) {
		this.downGuide = downGuide;
	}

	@Override
	public String toString() {
		return "TopicListBo{" +
				"id=" + id +
				", topicTitle='" + topicTitle + '\'' +
				", beginTime='" + beginTime + '\'' +
				", endTime='" + endTime + '\'' +
				", status='" + status + '\'' +
				", initFlag=" + initFlag +
				", shareTitle='" + shareTitle + '\'' +
				", shareSubtitle='" + shareSubtitle + '\'' +
				", shareIcon='" + shareIcon + '\'' +
				", downGuide='" + downGuide + '\'' +
				", shareIconUrl='" + shareIconUrl + '\'' +
				'}';
	}
}

