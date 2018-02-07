package com.shanyuan.platform.ms.dao.store.entity;

/**
 * 描述:sy_store_extend表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-10-19
 */
public class SyStoreExtend {
    /**
     * 店铺ID
     */
    private Integer storeId;

    /**
     * 快递公司ID的组合
     */
    private String express;

    /**
     * 店铺ID
     * @return store_id 店铺ID
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * 店铺ID
     * @param storeId 店铺ID
     */
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    /**
     * 快递公司ID的组合
     * @return express 快递公司ID的组合
     */
    public String getExpress() {
        return express;
    }

    /**
     * 快递公司ID的组合
     * @param express 快递公司ID的组合
     */
    public void setExpress(String express) {
        this.express = express == null ? null : express.trim();
    }
}