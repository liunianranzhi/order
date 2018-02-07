package com.shanyuan.platform.ms.dao.recommend.entity;

/**
 * 描述:sy_recommend_module表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-10-31
 */
public class SyRecommendModule {
    /**
     * 索引id
     */
    private Integer recId;

    /**
     * 父id
     */
    private Integer parentId;

    /**
     * 模块标识符
     */
    private String moduleCode;

    /**
     * 模块名称
     */
    private String moduleName;

    /**
     * 模块描述
     */
    private String moduleDesc;

    /**
     * 模块小图标地址
     */
    private String icon;

    /**
     * 索引id
     * @return rec_id 索引id
     */
    public Integer getRecId() {
        return recId;
    }

    /**
     * 索引id
     * @param recId 索引id
     */
    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    /**
     * 父id
     * @return parent_id 父id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 父id
     * @param parentId 父id
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 模块标识符
     * @return module_code 模块标识符
     */
    public String getModuleCode() {
        return moduleCode;
    }

    /**
     * 模块标识符
     * @param moduleCode 模块标识符
     */
    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode == null ? null : moduleCode.trim();
    }

    /**
     * 模块名称
     * @return module_name 模块名称
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * 模块名称
     * @param moduleName 模块名称
     */
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    /**
     * 模块描述
     * @return module_desc 模块描述
     */
    public String getModuleDesc() {
        return moduleDesc;
    }

    /**
     * 模块描述
     * @param moduleDesc 模块描述
     */
    public void setModuleDesc(String moduleDesc) {
        this.moduleDesc = moduleDesc == null ? null : moduleDesc.trim();
    }

    /**
     * 模块小图标地址
     * @return icon 模块小图标地址
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 模块小图标地址
     * @param icon 模块小图标地址
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }
}