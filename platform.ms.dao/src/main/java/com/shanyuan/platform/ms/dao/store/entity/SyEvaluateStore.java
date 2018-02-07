
package com.shanyuan.platform.ms.dao.store.entity;

import java.math.BigDecimal;

/**
 * 描述:sy_evaluate_store表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-10-16
 */
public class SyEvaluateStore {
    /**
     * 评价ID
     */
    private Integer sevalId;

    /**
     * 订单ID
     */
    private Integer sevalOrderid;

    /**
     * 订单编号
     */
    private String sevalOrderno;

    /**
     * 评价时间
     */
    private Integer sevalAddtime;

    /**
     * 店铺编号
     */
    private Integer sevalStoreid;

    /**
     * 店铺名称
     */
    private String sevalStorename;

    /**
     * 买家编号
     */
    private Integer sevalMemberid;

    /**
     * 买家名称
     */
    private String sevalMembername;

    /**
     * 描述相符评分
     */
    private Byte sevalDesccredit;

    /**
     * 服务态度评分
     */
    private Byte sevalServicecredit;

    /**
     * 发货速度评分
     */
    private Byte sevalDeliverycredit;

    /**
     * 发布者id
     */
    private Integer publisherId;

    /**
     * 评价类型0:系统自动评价1:手动评价
     */
    private Byte sevalType;
    
    /**
     * 店铺的数量
     */
    private Integer storeEvaluateCount;
    
    /**
     * 服务态度平均分
     */
    private BigDecimal servicecreditAvg;
    /**
     * 发货速度平均分
     */
    private BigDecimal sevaldeliverycreditAvg;
    
    



	public Integer getStoreEvaluateCount() {
		return storeEvaluateCount;
	}

	public void setStoreEvaluateCount(Integer storeEvaluateCount) {
		this.storeEvaluateCount = storeEvaluateCount;
	}

	public BigDecimal getServicecreditAvg() {
		return servicecreditAvg;
	}

	public void setServicecreditAvg(BigDecimal servicecreditAvg) {
		this.servicecreditAvg = servicecreditAvg;
	}

	public BigDecimal getSevaldeliverycreditAvg() {
		return sevaldeliverycreditAvg;
	}

	public void setSevaldeliverycreditAvg(BigDecimal sevaldeliverycreditAvg) {
		this.sevaldeliverycreditAvg = sevaldeliverycreditAvg;
	}

	/**
     * 评价ID
     * @return seval_id 评价ID
     */
    public Integer getSevalId() {
        return sevalId;
    }

    /**
     * 评价ID
     * @param sevalId 评价ID
     */
    public void setSevalId(Integer sevalId) {
        this.sevalId = sevalId;
    }

    /**
     * 订单ID
     * @return seval_orderid 订单ID
     */
    public Integer getSevalOrderid() {
        return sevalOrderid;
    }

    /**
     * 订单ID
     * @param sevalOrderid 订单ID
     */
    public void setSevalOrderid(Integer sevalOrderid) {
        this.sevalOrderid = sevalOrderid;
    }

    /**
     * 订单编号
     * @return seval_orderno 订单编号
     */
    public String getSevalOrderno() {
        return sevalOrderno;
    }

    /**
     * 订单编号
     * @param sevalOrderno 订单编号
     */
    public void setSevalOrderno(String sevalOrderno) {
        this.sevalOrderno = sevalOrderno == null ? null : sevalOrderno.trim();
    }

    /**
     * 评价时间
     * @return seval_addtime 评价时间
     */
    public Integer getSevalAddtime() {
        return sevalAddtime;
    }

    /**
     * 评价时间
     * @param sevalAddtime 评价时间
     */
    public void setSevalAddtime(Integer sevalAddtime) {
        this.sevalAddtime = sevalAddtime;
    }

    /**
     * 店铺编号
     * @return seval_storeid 店铺编号
     */
    public Integer getSevalStoreid() {
        return sevalStoreid;
    }

    /**
     * 店铺编号
     * @param sevalStoreid 店铺编号
     */
    public void setSevalStoreid(Integer sevalStoreid) {
        this.sevalStoreid = sevalStoreid;
    }

    /**
     * 店铺名称
     * @return seval_storename 店铺名称
     */
    public String getSevalStorename() {
        return sevalStorename;
    }

    /**
     * 店铺名称
     * @param sevalStorename 店铺名称
     */
    public void setSevalStorename(String sevalStorename) {
        this.sevalStorename = sevalStorename == null ? null : sevalStorename.trim();
    }

    /**
     * 买家编号
     * @return seval_memberid 买家编号
     */
    public Integer getSevalMemberid() {
        return sevalMemberid;
    }

    /**
     * 买家编号
     * @param sevalMemberid 买家编号
     */
    public void setSevalMemberid(Integer sevalMemberid) {
        this.sevalMemberid = sevalMemberid;
    }

    /**
     * 买家名称
     * @return seval_membername 买家名称
     */
    public String getSevalMembername() {
        return sevalMembername;
    }

    /**
     * 买家名称
     * @param sevalMembername 买家名称
     */
    public void setSevalMembername(String sevalMembername) {
        this.sevalMembername = sevalMembername == null ? null : sevalMembername.trim();
    }

    /**
     * 描述相符评分
     * @return seval_desccredit 描述相符评分
     */
    public Byte getSevalDesccredit() {
        return sevalDesccredit;
    }

    /**
     * 描述相符评分
     * @param sevalDesccredit 描述相符评分
     */
    public void setSevalDesccredit(Byte sevalDesccredit) {
        this.sevalDesccredit = sevalDesccredit;
    }

    /**
     * 服务态度评分
     * @return seval_servicecredit 服务态度评分
     */
    public Byte getSevalServicecredit() {
        return sevalServicecredit;
    }

    /**
     * 服务态度评分
     * @param sevalServicecredit 服务态度评分
     */
    public void setSevalServicecredit(Byte sevalServicecredit) {
        this.sevalServicecredit = sevalServicecredit;
    }

    /**
     * 发货速度评分
     * @return seval_deliverycredit 发货速度评分
     */
    public Byte getSevalDeliverycredit() {
        return sevalDeliverycredit;
    }

    /**
     * 发货速度评分
     * @param sevalDeliverycredit 发货速度评分
     */
    public void setSevalDeliverycredit(Byte sevalDeliverycredit) {
        this.sevalDeliverycredit = sevalDeliverycredit;
    }

    /**
     * 发布者id
     * @return publisher_id 发布者id
     */
    public Integer getPublisherId() {
        return publisherId;
    }

    /**
     * 发布者id
     * @param publisherId 发布者id
     */
    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    /**
     * 评价类型0:系统自动评价1:手动评价
     * @return seval_type 评价类型0:系统自动评价1:手动评价
     */
    public Byte getSevalType() {
        return sevalType;
    }

    /**
     * 评价类型0:系统自动评价1:手动评价
     * @param sevalType 评价类型0:系统自动评价1:手动评价
     */
    public void setSevalType(Byte sevalType) {
        this.sevalType = sevalType;
    }
}