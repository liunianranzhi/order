package com.shanyuan.platform.ms.core.cart.bo;

import com.shanyuan.platform.ms.dao.goods.entity.SyGoods;
import com.shanyuan.platform.ms.dao.project.entity.SyProject;

/**
 * @author:  曹勇军
 * @创建时间: 2017-10-18
 */
public class SyGoodsCartBO {
	
	private SyGoods syGoods;
	private SyProject syProject;
    
    private Short goodsNum;
    private Boolean state;
    private Boolean storageState;
    private Integer cartId;
    private Integer blId;
    private String goodsProjectType;
	public SyGoods getSyGoods() {
		return syGoods;
	}
	public void setSyGoods(SyGoods syGoods) {
		this.syGoods = syGoods;
	}
	
	public SyProject getSyProject() {
		return syProject;
	}
	public void setSyProject(SyProject syProject) {
		this.syProject = syProject;
	}
	public Short getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(Short goodsNum) {
		this.goodsNum = goodsNum;
	}
	public Boolean getState() {
		return state;
	}
	public void setState(Boolean state) {
		this.state = state;
	}
	public Boolean getStorageState() {
		return storageState;
	}
	public void setStorageState(Boolean storageState) {
		this.storageState = storageState;
	}
	public Integer getCartId() {
		return cartId;
	}
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	public Integer getBlId() {
		return blId;
	}
	public void setBlId(Integer blId) {
		this.blId = blId;
	}
	public String getGoodsProjectType() {
		return goodsProjectType;
	}
	public void setGoodsProjectType(String goodsProjectType) {
		this.goodsProjectType = goodsProjectType;
	}

    
    
}