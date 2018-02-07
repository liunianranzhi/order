package com.shanyuan.platform.ms.facade.goods.domain;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsClassInfo;

/**
 * 产品分类返回结果封装
 * @author yangjian
 *
 */
public class GoodsClassInfo {
	
	/**
	 * 二级分类
	 */
	private SyGoodsClassInfo syGoodsClass;
	/**
	 * 三级分类
	 */
	private List<SyGoodsClassInfo> childClass;
	
	public SyGoodsClassInfo getSyGoodsClass() {
		return syGoodsClass;
	}
	public void setSyGoodsClass(SyGoodsClassInfo syGoodsClass) {
		this.syGoodsClass = syGoodsClass;
	}
	public List<SyGoodsClassInfo> getChildClass() {
		return childClass;
	}
	public void setChildClass(List<SyGoodsClassInfo> childClass) {
		this.childClass = childClass;
	}
	
	public String toJsonString(GoodsClassInfo classInfo){
		return JSONObject.toJSONString(classInfo);
	}
	
}
