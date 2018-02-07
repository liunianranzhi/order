package com.shanyuan.platform.ms.dao.cart.entity;

import java.math.BigDecimal;
import java.util.List;

import com.shanyuan.platform.ms.dao.goods.entity.SyOrgActivity;
import com.shanyuan.platform.ms.dao.project.entity.SyProject;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;

/**
 * 描述:sy_cart表的实体类
 * @version
 * @author:  caoyongjun
 * @创建时间: 2017-10-18
 */
public class SyCart {
    /**
     * 购物车id
     */
    private Integer cartId;

    /**
     * 买家id
     */
    private Integer buyerId;

    /**
     * 店铺id
     */
    private Integer storeId;

    /**
     * 店铺名称
     */
    private String storeName;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品价格
     */
    private BigDecimal goodsPrice;

    /**
     * 购买商品数量
     */
    private Short goodsNum;

    /**
     * 商品图片
     */
    private String goodsImage;

    /**
     * 组合套装ID
     */
    private Integer blId;

    /**
     * 项目类型(1基金会捐物/2基金会捐款/3基金会活动/4个人实物/5个人时间/6个人技能/7个人空间/18企业扶贫仓库)
     */
    private Integer goodsProjectType;

    /**
     * 项目id
     */
    private Integer projId;
    /**
     * 购物车数量
     */
    private Integer cartNum;

    /**
     * 是否已经选中  1选中  0未选中
     */
    private Byte checked;

    /**
     * 新加入标记默认是0,如果已经看过则为1
     */
    private Byte newAddState;
    
    private BigDecimal goodsTotal;
    
    private List<SyOrgActivity> activityList;
    
    private List<SyProject> projectList;

    private SyMember poorInfo;
    
    
    public Integer getCartNum() {
		return cartNum;
	}

	public void setCartNum(Integer cartNum) {
		this.cartNum = cartNum;
	}

	/**
     * 购物车id
     * @return cart_id 购物车id
     */
    public Integer getCartId() {
        return cartId;
    }

    /**
     * 购物车id
     * @param cartId 购物车id
     */
    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    /**
     * 买家id
     * @return buyer_id 买家id
     */
    public Integer getBuyerId() {
        return buyerId;
    }

    /**
     * 买家id
     * @param buyerId 买家id
     */
    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * 店铺id
     * @return store_id 店铺id
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * 店铺id
     * @param storeId 店铺id
     */
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    /**
     * 店铺名称
     * @return store_name 店铺名称
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * 店铺名称
     * @param storeName 店铺名称
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    /**
     * 商品id
     * @return goods_id 商品id
     */
    public Integer getGoodsId() {
        return goodsId;
    }
    /**
     * 商品id
     * @param goodsId 商品id
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 商品名称
     * @return goods_name 商品名称
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 商品名称
     * @param goodsName 商品名称
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * 商品价格
     * @return goods_price 商品价格
     */
    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    /**
     * 商品价格
     * @param goodsPrice 商品价格
     */
    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    /**
     * 购买商品数量
     * @return goods_num 购买商品数量
     */
    public Short getGoodsNum() {
        return goodsNum;
    }

    /**
     * 购买商品数量
     * @param goodsNum 购买商品数量
     */
    public void setGoodsNum(Short goodsNum) {
        this.goodsNum = goodsNum;
    }

    /**
     * 商品图片
     * @return goods_image 商品图片
     */
    public String getGoodsImage() {
        return goodsImage;
    }

    /**
     * 商品图片
     * @param goodsImage 商品图片
     */
    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage == null ? null : goodsImage.trim();
    }

    /**
     * 组合套装ID
     * @return bl_id 组合套装ID
     */
    public Integer getBlId() {
        return blId;
    }

    /**
     * 组合套装ID
     * @param blId 组合套装ID
     */
    public void setBlId(Integer blId) {
        this.blId = blId;
    }

    /**
     * 项目类型(1基金会捐物/2基金会捐款/3基金会活动/4个人实物/5个人时间/6个人技能/7个人空间/18企业扶贫仓库)
     * @return goods_project_type 项目类型(1基金会捐物/2基金会捐款/3基金会活动/4个人实物/5个人时间/6个人技能/7个人空间/18企业扶贫仓库)
     */
    public Integer getGoodsProjectType() {
        return goodsProjectType;
    }

    /**
     * 项目类型(1基金会捐物/2基金会捐款/3基金会活动/4个人实物/5个人时间/6个人技能/7个人空间/18企业扶贫仓库)
     * @param goodsProjectType 项目类型(1基金会捐物/2基金会捐款/3基金会活动/4个人实物/5个人时间/6个人技能/7个人空间/18企业扶贫仓库)
     */
    public void setGoodsProjectType(Integer goodsProjectType) {
        this.goodsProjectType = goodsProjectType;
    }

    /**
     * 项目id
     * @return proj_id 项目id
     */
    public Integer getProjId() {
        return projId;
    }

    /**
     * 项目id
     * @param projId 项目id
     */
    public void setProjId(Integer projId) {
        this.projId = projId;
    }

    /**
     * 是否已经选中  1选中  0未选中
     * @return checked 是否已经选中  1选中  0未选中
     */
    public Byte getChecked() {
        return checked;
    }

    /**
     * 是否已经选中  1选中  0未选中
     * @param checked 是否已经选中  1选中  0未选中
     */
    public void setChecked(Byte checked) {
        this.checked = checked;
    }

    /**
     * 新加入标记默认是0,如果已经看过则为1
     * @return new_add_state 新加入标记默认是0,如果已经看过则为1
     */
    public Byte getNewAddState() {
        return newAddState;
    }

    /**
     * 新加入标记默认是0,如果已经看过则为1
     * @param newAddState 新加入标记默认是0,如果已经看过则为1
     */
    public void setNewAddState(Byte newAddState) {
        this.newAddState = newAddState;
    }

	public BigDecimal getGoodsTotal() {
		return goodsTotal;
	}

	public void setGoodsTotal(BigDecimal goodsTotal) {
		this.goodsTotal = goodsTotal;
	}

	public List<SyOrgActivity> getActivityList() {
		return activityList;
	}

	public void setActivityList(List<SyOrgActivity> activityList) {
		this.activityList = activityList;
	}

	public List<SyProject> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<SyProject> projectList) {
		this.projectList = projectList;
	}

	public SyMember getPoorInfo() {
		return poorInfo;
	}

	public void setPoorInfo(SyMember poorInfo) {
		this.poorInfo = poorInfo;
	}
    
    
}