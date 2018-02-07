package com.shanyuan.platform.ms.dao.order.entity;

import java.math.BigDecimal;

/**
 * 描述:sy_transport_extend表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-10-16
 */
public class SyTransportExtend {
    /**
     * 运费模板扩展ID
     */
    private Integer id;

    /**
     * 首件数量
     */
    private Integer snum;

    /**
     * 首件运费
     */
    private BigDecimal sprice;

    /**
     * 续件数量
     */
    private Integer xnum;

    /**
     * 续件运费
     */
    private BigDecimal xprice;

    /**
     * 是否默认运费1是2否
     */
    private String isDefault;

    /**
     * 运费模板ID
     */
    private Integer transportId;

    /**
     * 运费模板
     */
    private String transportTitle;

    /**
     * 运费模板扩展ID
     * @return id 运费模板扩展ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 运费模板扩展ID
     * @param id 运费模板扩展ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 首件数量
     * @return snum 首件数量
     */
    public Integer getSnum() {
        return snum;
    }

    /**
     * 首件数量
     * @param snum 首件数量
     */
    public void setSnum(Integer snum) {
        this.snum = snum;
    }

    /**
     * 首件运费
     * @return sprice 首件运费
     */
    public BigDecimal getSprice() {
        return sprice;
    }

    /**
     * 首件运费
     * @param sprice 首件运费
     */
    public void setSprice(BigDecimal sprice) {
        this.sprice = sprice;
    }

    /**
     * 续件数量
     * @return xnum 续件数量
     */
    public Integer getXnum() {
        return xnum;
    }

    /**
     * 续件数量
     * @param xnum 续件数量
     */
    public void setXnum(Integer xnum) {
        this.xnum = xnum;
    }

    /**
     * 续件运费
     * @return xprice 续件运费
     */
    public BigDecimal getXprice() {
        return xprice;
    }

    /**
     * 续件运费
     * @param xprice 续件运费
     */
    public void setXprice(BigDecimal xprice) {
        this.xprice = xprice;
    }

    /**
     * 是否默认运费1是2否
     * @return is_default 是否默认运费1是2否
     */
    public String getIsDefault() {
        return isDefault;
    }

    /**
     * 是否默认运费1是2否
     * @param isDefault 是否默认运费1是2否
     */
    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault == null ? null : isDefault.trim();
    }

    /**
     * 运费模板ID
     * @return transport_id 运费模板ID
     */
    public Integer getTransportId() {
        return transportId;
    }

    /**
     * 运费模板ID
     * @param transportId 运费模板ID
     */
    public void setTransportId(Integer transportId) {
        this.transportId = transportId;
    }

    /**
     * 运费模板
     * @return transport_title 运费模板
     */
    public String getTransportTitle() {
        return transportTitle;
    }

    /**
     * 运费模板
     * @param transportTitle 运费模板
     */
    public void setTransportTitle(String transportTitle) {
        this.transportTitle = transportTitle == null ? null : transportTitle.trim();
    }
}