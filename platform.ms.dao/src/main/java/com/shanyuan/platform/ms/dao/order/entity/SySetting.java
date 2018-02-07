package com.shanyuan.platform.ms.dao.order.entity;

/**
 * 描述:sy_setting表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-10-17
 */
public class SySetting {
    /**
     * 名称
     */
    private String name;

    /**
     * 值
     */
    private String value;

    /**
     * 名称
     * @return name 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 名称
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 值
     * @return value 值
     */
    public String getValue() {
        return value;
    }

    /**
     * 值
     * @param value 值
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}