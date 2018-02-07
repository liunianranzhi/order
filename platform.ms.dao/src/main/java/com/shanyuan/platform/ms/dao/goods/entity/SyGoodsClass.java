package com.shanyuan.platform.ms.dao.goods.entity;

/**
 * 描述:sy_goods_class表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-10-16
 */
public class SyGoodsClass {
    /**
     * 索引ID
     */
    private Integer gcId;

    /**
     * 分类名称
     */
    private String gcName;

    /**
     * 类型id
     */
    private Integer typeId;

    /**
     * 类型名称
     */
    private String typeName;

    /**
     * 父ID
     */
    private Integer gcParentId;

    /**
     * 排序
     */
    private Short gcSort;

    /**
     * 名称
     */
    private String gcTitle;

    /**
     * 关键词
     */
    private String gcKeywords;

    /**
     * 描述
     */
    private String gcDescription;

    /**
     * 分类标识
     */
    private String gcCode;

    /**
     * 资源标题样式模板
     */
    private String goodsNameTemplate;

    /**
     * 项目类型(1基金会捐物/2基金会捐款/3基金会活动/4个人实物/5个人时间/6个人技能/7个人空间)
     */
    private Integer goodsProjectType;

    /**
     * 折旧率
     */
    private Float depreciationRate;

    /**
     * 接口状态0禁用1启用
     */
    private String showState;
    /**
     * 所属模块(1大爱超市分类/2集采分类/3善源商场分类)
     */
    private Integer module;
    /**
     * 分类图片
     */
    private String gcImage;

    /**
     * 索引ID
     * @return gc_id 索引ID
     */
    public Integer getGcId() {
        return gcId;
    }

    /**
     * 索引ID
     * @param gcId 索引ID
     */
    public void setGcId(Integer gcId) {
        this.gcId = gcId;
    }

    /**
     * 分类名称
     * @return gc_name 分类名称
     */
    public String getGcName() {
        return gcName;
    }

    /**
     * 分类名称
     * @param gcName 分类名称
     */
    public void setGcName(String gcName) {
        this.gcName = gcName == null ? null : gcName.trim();
    }

    /**
     * 类型id
     * @return type_id 类型id
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * 类型id
     * @param typeId 类型id
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * 类型名称
     * @return type_name 类型名称
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 类型名称
     * @param typeName 类型名称
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    /**
     * 父ID
     * @return gc_parent_id 父ID
     */
    public Integer getGcParentId() {
        return gcParentId;
    }

    /**
     * 父ID
     * @param gcParentId 父ID
     */
    public void setGcParentId(Integer gcParentId) {
        this.gcParentId = gcParentId;
    }

    /**
     * 排序
     * @return gc_sort 排序
     */
    public Short getGcSort() {
        return gcSort;
    }

    /**
     * 排序
     * @param gcSort 排序
     */
    public void setGcSort(Short gcSort) {
        this.gcSort = gcSort;
    }

    /**
     * 名称
     * @return gc_title 名称
     */
    public String getGcTitle() {
        return gcTitle;
    }

    /**
     * 名称
     * @param gcTitle 名称
     */
    public void setGcTitle(String gcTitle) {
        this.gcTitle = gcTitle == null ? null : gcTitle.trim();
    }

    /**
     * 关键词
     * @return gc_keywords 关键词
     */
    public String getGcKeywords() {
        return gcKeywords;
    }

    /**
     * 关键词
     * @param gcKeywords 关键词
     */
    public void setGcKeywords(String gcKeywords) {
        this.gcKeywords = gcKeywords == null ? null : gcKeywords.trim();
    }

    /**
     * 描述
     * @return gc_description 描述
     */
    public String getGcDescription() {
        return gcDescription;
    }

    /**
     * 描述
     * @param gcDescription 描述
     */
    public void setGcDescription(String gcDescription) {
        this.gcDescription = gcDescription == null ? null : gcDescription.trim();
    }

    /**
     * 分类标识
     * @return gc_code 分类标识
     */
    public String getGcCode() {
        return gcCode;
    }

    /**
     * 分类标识
     * @param gcCode 分类标识
     */
    public void setGcCode(String gcCode) {
        this.gcCode = gcCode == null ? null : gcCode.trim();
    }

    /**
     * 资源标题样式模板
     * @return goods_name_template 资源标题样式模板
     */
    public String getGoodsNameTemplate() {
        return goodsNameTemplate;
    }

    /**
     * 资源标题样式模板
     * @param goodsNameTemplate 资源标题样式模板
     */
    public void setGoodsNameTemplate(String goodsNameTemplate) {
        this.goodsNameTemplate = goodsNameTemplate == null ? null : goodsNameTemplate.trim();
    }

    /**
     * 项目类型(1基金会捐物/2基金会捐款/3基金会活动/4个人实物/5个人时间/6个人技能/7个人空间)
     * @return goods_project_type 项目类型(1基金会捐物/2基金会捐款/3基金会活动/4个人实物/5个人时间/6个人技能/7个人空间)
     */
    public Integer getGoodsProjectType() {
        return goodsProjectType;
    }

    /**
     * 项目类型(1基金会捐物/2基金会捐款/3基金会活动/4个人实物/5个人时间/6个人技能/7个人空间)
     * @param goodsProjectType 项目类型(1基金会捐物/2基金会捐款/3基金会活动/4个人实物/5个人时间/6个人技能/7个人空间)
     */
    public void setGoodsProjectType(Integer goodsProjectType) {
        this.goodsProjectType = goodsProjectType;
    }

    /**
     * 折旧率
     * @return depreciation_rate 折旧率
     */
    public Float getDepreciationRate() {
        return depreciationRate;
    }

    /**
     * 折旧率
     * @param depreciationRate 折旧率
     */
    public void setDepreciationRate(Float depreciationRate) {
        this.depreciationRate = depreciationRate;
    }

    /**
     * 接口状态0禁用1启用
     * @return show_state 接口状态0禁用1启用
     */
    public String getShowState() {
        return showState;
    }

    /**
     * 接口状态0禁用1启用
     * @param showState 接口状态0禁用1启用
     */
    public void setShowState(String showState) {
        this.showState = showState == null ? null : showState.trim();
    }
    /**
     * @Description 获取分类所属模块
     * @return module 模块值
     */
	public Integer getModule() {
		return module;
	}
	/**
	 * @Description 设置分类所属模块
	 * @param module 模块值
	 */
	public void setModule(Integer module) {
		this.module = module;
	}
	/**
	 * @Description 获取分类图片
	 * @return gcImage 分类图片
	 */
	public String getGcImage() {
		return gcImage;
	}
	/**
	 * @Description 设置分类图片
	 * @param gcImage 分类图片
	 */
	public void setGcImage(String gcImage) {
		this.gcImage = gcImage;
	}
    
}