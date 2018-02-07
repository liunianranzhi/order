package com.shanyuan.platform.ms.dao.goods.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.ObjectUtils;


/**
 * 
 * @author yangj
 *
 */
public class SyGoodsClassInfo {

    /**
     * 索引ID
     */
    private Integer gcId;

    /**
     * 分类名称
     */
    private String gcName = "";
    
    /**
     * 父ID
     */
    private Integer gcParentId;
    
    /**
     * 分类图片
     * @return
     */
    private String gcImage = "";

    /**
     * 集采后台推荐图片
     * @return
     */
    private String img = "";
    
    /**
     * 推荐图片点击url
     * @return
     */
    private String imgTouchUrl = "";
    
    /**
     * 集采下一级分类
     * @return
     */
    private List<SyGoodsClassInfo> subGoodsClassList = new ArrayList<SyGoodsClassInfo>();
    
	public Integer getGcId() {
		return gcId;
	}

	public void setGcId(Integer gcId) {
		this.gcId = gcId;
	}

	public String getGcName() {
		return gcName;
	}

	public void setGcName(String gcName) {
		this.gcName = gcName;
	}

	public Integer getGcParentId() {
		return gcParentId;
	}

	public void setGcParentId(Integer gcParentId) {
		this.gcParentId = gcParentId;
	}

	public String getGcImage() {
		return gcImage;
	}

	public void setGcImage(String gcImage) {
		this.gcImage = gcImage;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getImgTouchUrl() {
		return imgTouchUrl;
	}

	public void setImgTouchUrl(String imgTouchUrl) {
		this.imgTouchUrl = imgTouchUrl;
	}

	public List<SyGoodsClassInfo> getSubGoodsClassList() {
		if (ObjectUtils.isEmpty(subGoodsClassList)) {
			subGoodsClassList = new  ArrayList<SyGoodsClassInfo>();
		}
		return subGoodsClassList;
	}

	public void setSubGoodsClassList(List<SyGoodsClassInfo> subGoodsClassList) {
		
		this.subGoodsClassList = subGoodsClassList;
	}
	
	

}
