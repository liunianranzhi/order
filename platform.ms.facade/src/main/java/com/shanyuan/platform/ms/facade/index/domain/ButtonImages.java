package com.shanyuan.platform.ms.facade.index.domain;

public class ButtonImages {

	private String name;
	private String imgUrl;
	private String touchUrl;
	
	public ButtonImages( String name, String imgUrl, String touchUrl){
		this.name = name;
		this.imgUrl = imgUrl;
		this.touchUrl = touchUrl;
	}
	
	public ButtonImages(){
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
