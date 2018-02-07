package com.shanyuan.platform.ms.core.goods.bo;

import java.io.Serializable;
import java.util.List;

/** 
 * @author  wang chunru 
 * @date    2017年11月1日 下午12:16:54 
 * @Description   
 */
@SuppressWarnings("serial")
public class SyGoodsClassBo implements Serializable {
	
	private Integer gcId;
	private String gcName;
	private String gcImage;
	private Short gcSort;
	private Integer gcParentId;
	private String url;
	private List<SyGoodsClassBo> subDeepList;
	
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
	public String getGcImage() {
		return gcImage;
	}
	public void setGcImage(String gcImage) {
		this.gcImage = gcImage;
	}
	public Short getGcSort() {
		return gcSort;
	}
	public void setGcSort(Short gcSort) {
		this.gcSort = gcSort;
	}
	public Integer getGcParentId() {
		return gcParentId;
	}
	public void setGcParentId(Integer gcParentId) {
		this.gcParentId = gcParentId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<SyGoodsClassBo> getSubDeepList() {
		return subDeepList;
	}
	public void setSubDeepList(List<SyGoodsClassBo> subDeepList) {
		this.subDeepList = subDeepList;
	}
	
}
