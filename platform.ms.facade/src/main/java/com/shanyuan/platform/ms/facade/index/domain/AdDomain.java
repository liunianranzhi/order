package com.shanyuan.platform.ms.facade.index.domain;

/**
 * 广告实体类
 * @author yangjian
 * @date 2017/11/21
 *
 */
public class AdDomain {

	private Byte bannerId;
	private String imgUrl = "";
	private String touchUrl = "";
	public Byte getBannerId() {
		return bannerId;
	}
	
	public AdDomain(Byte bannerId){
		this.bannerId = bannerId;
	}
	
	public AdDomain(){
		super();
	}
	
	public void setBannerId(Byte bannerId) {
		this.bannerId = bannerId;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getTouchUrl() {
		return touchUrl;
	}
	public void setTouchUrl(String touchUrl) {
		this.touchUrl = touchUrl;
	}


}
