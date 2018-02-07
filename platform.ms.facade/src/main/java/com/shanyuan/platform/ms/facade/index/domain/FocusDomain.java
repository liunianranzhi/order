package com.shanyuan.platform.ms.facade.index.domain;

import java.util.List;

import com.shanyuan.platform.ms.dao.recommend.entity.SyRecommend;

public class FocusDomain {

	private String title;
	private String desc;
	private List<SyRecommend> recommends;
	private List<ButtonImages> buttonImages;
	
	public FocusDomain(String title, String desc, List<SyRecommend> recommends, List<ButtonImages> buttonImages){
		this.title = title;
		this.desc = desc;
		this.recommends = recommends;
		this.buttonImages = buttonImages;
	}
	
	public FocusDomain(){
		super();
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public List<SyRecommend> getRecommends() {
		return recommends;
	}
	public void setRecommends(List<SyRecommend> recommends) {
		this.recommends = recommends;
	}
	public List<ButtonImages> getButtonImages() {
		return buttonImages;
	}
	public void setButtonImages(List<ButtonImages> buttonImages) {
		this.buttonImages = buttonImages;
	}
	
}
