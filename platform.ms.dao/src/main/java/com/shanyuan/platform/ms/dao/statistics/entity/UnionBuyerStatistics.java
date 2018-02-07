package com.shanyuan.platform.ms.dao.statistics.entity;

import java.math.BigDecimal;

/**
 * 描述:union_buyer_statistics表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2018-01-16
 */
public class UnionBuyerStatistics {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 大爱超市订单量
     */
    private Integer dacsOrderNum;

    /**
     * 大爱超市商品量
     */
    private Integer dacsGoodsNum;

    /**
     * 大爱超市金额
     */
    private BigDecimal dacsGoodsAmount;

    /**
     * 大爱超市帮扶金
     */
    private BigDecimal dacsHelpPrice;

    /**
     * 善源甄选订单量
     */
    private Integer syzxOrderNum;

    /**
     * 善源甄选商品量
     */
    private Integer syzxGoodsNum;

    /**
     * 善源甄选金额
     */
    private BigDecimal syzxGoodsAmount;

    /**
     * 善源甄选帮扶金
     */
    private BigDecimal syzxHelpPrice;

    /**
     * 善源商场订单量
     */
    private Integer syscOrderNum;

    /**
     * 善源商场商品量
     */
    private Integer syscGoodsNum;

    /**
     * 善源商场金额
     */
    private BigDecimal syscGoodsAmount;

    /**
     * 善源商场帮扶金
     */
    private BigDecimal syscHelpPrice;

    /**
     * 订单时间
     */
    private Integer cTime;

    /**
     * 联盟id
     */
    private Integer unionId;

    /**
     * 联盟名称
     */
    private String unionName;

    /**
     * 渠道标识
     */
    private String channel;

    /**
     * 主键
     * @return id 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 大爱超市订单量
     * @return dacs_order_num 大爱超市订单量
     */
    public Integer getDacsOrderNum() {
        return dacsOrderNum;
    }

    /**
     * 大爱超市订单量
     * @param dacsOrderNum 大爱超市订单量
     */
    public void setDacsOrderNum(Integer dacsOrderNum) {
        this.dacsOrderNum = dacsOrderNum;
    }

    /**
     * 大爱超市商品量
     * @return dacs_goods_num 大爱超市商品量
     */
    public Integer getDacsGoodsNum() {
        return dacsGoodsNum;
    }

    /**
     * 大爱超市商品量
     * @param dacsGoodsNum 大爱超市商品量
     */
    public void setDacsGoodsNum(Integer dacsGoodsNum) {
        this.dacsGoodsNum = dacsGoodsNum;
    }

    /**
     * 大爱超市金额
     * @return dacs_goods_amount 大爱超市金额
     */
    public BigDecimal getDacsGoodsAmount() {
        return dacsGoodsAmount;
    }

    /**
     * 大爱超市金额
     * @param dacsGoodsAmount 大爱超市金额
     */
    public void setDacsGoodsAmount(BigDecimal dacsGoodsAmount) {
        this.dacsGoodsAmount = dacsGoodsAmount;
    }

    /**
     * 大爱超市帮扶金
     * @return dacs_help_price 大爱超市帮扶金
     */
    public BigDecimal getDacsHelpPrice() {
        return dacsHelpPrice;
    }

    /**
     * 大爱超市帮扶金
     * @param dacsHelpPrice 大爱超市帮扶金
     */
    public void setDacsHelpPrice(BigDecimal dacsHelpPrice) {
        this.dacsHelpPrice = dacsHelpPrice;
    }

    /**
     * 善源甄选订单量
     * @return syzx_order_num 善源甄选订单量
     */
    public Integer getSyzxOrderNum() {
        return syzxOrderNum;
    }

    /**
     * 善源甄选订单量
     * @param syzxOrderNum 善源甄选订单量
     */
    public void setSyzxOrderNum(Integer syzxOrderNum) {
        this.syzxOrderNum = syzxOrderNum;
    }

    /**
     * 善源甄选商品量
     * @return syzx_goods_num 善源甄选商品量
     */
    public Integer getSyzxGoodsNum() {
        return syzxGoodsNum;
    }

    /**
     * 善源甄选商品量
     * @param syzxGoodsNum 善源甄选商品量
     */
    public void setSyzxGoodsNum(Integer syzxGoodsNum) {
        this.syzxGoodsNum = syzxGoodsNum;
    }

    /**
     * 善源甄选金额
     * @return syzx_goods_amount 善源甄选金额
     */
    public BigDecimal getSyzxGoodsAmount() {
        return syzxGoodsAmount;
    }

    /**
     * 善源甄选金额
     * @param syzxGoodsAmount 善源甄选金额
     */
    public void setSyzxGoodsAmount(BigDecimal syzxGoodsAmount) {
        this.syzxGoodsAmount = syzxGoodsAmount;
    }

    /**
     * 善源甄选帮扶金
     * @return syzx_help_price 善源甄选帮扶金
     */
    public BigDecimal getSyzxHelpPrice() {
        return syzxHelpPrice;
    }

    /**
     * 善源甄选帮扶金
     * @param syzxHelpPrice 善源甄选帮扶金
     */
    public void setSyzxHelpPrice(BigDecimal syzxHelpPrice) {
        this.syzxHelpPrice = syzxHelpPrice;
    }

    /**
     * 善源商场订单量
     * @return sysc_order_num 善源商场订单量
     */
    public Integer getSyscOrderNum() {
        return syscOrderNum;
    }

    /**
     * 善源商场订单量
     * @param syscOrderNum 善源商场订单量
     */
    public void setSyscOrderNum(Integer syscOrderNum) {
        this.syscOrderNum = syscOrderNum;
    }

    /**
     * 善源商场商品量
     * @return sysc_goods_num 善源商场商品量
     */
    public Integer getSyscGoodsNum() {
        return syscGoodsNum;
    }

    /**
     * 善源商场商品量
     * @param syscGoodsNum 善源商场商品量
     */
    public void setSyscGoodsNum(Integer syscGoodsNum) {
        this.syscGoodsNum = syscGoodsNum;
    }

    /**
     * 善源商场金额
     * @return sysc_goods_amount 善源商场金额
     */
    public BigDecimal getSyscGoodsAmount() {
        return syscGoodsAmount;
    }

    /**
     * 善源商场金额
     * @param syscGoodsAmount 善源商场金额
     */
    public void setSyscGoodsAmount(BigDecimal syscGoodsAmount) {
        this.syscGoodsAmount = syscGoodsAmount;
    }

    /**
     * 善源商场帮扶金
     * @return sysc_help_price 善源商场帮扶金
     */
    public BigDecimal getSyscHelpPrice() {
        return syscHelpPrice;
    }

    /**
     * 善源商场帮扶金
     * @param syscHelpPrice 善源商场帮扶金
     */
    public void setSyscHelpPrice(BigDecimal syscHelpPrice) {
        this.syscHelpPrice = syscHelpPrice;
    }

    /**
     * 订单时间
     * @return c_time 订单时间
     */
    public Integer getcTime() {
        return cTime;
    }

    /**
     * 订单时间
     * @param cTime 订单时间
     */
    public void setcTime(Integer cTime) {
        this.cTime = cTime;
    }

    /**
     * 联盟id
     * @return union_id 联盟id
     */
    public Integer getUnionId() {
        return unionId;
    }

    /**
     * 联盟id
     * @param unionId 联盟id
     */
    public void setUnionId(Integer unionId) {
        this.unionId = unionId;
    }

    /**
     * 联盟名称
     * @return union_name 联盟名称
     */
    public String getUnionName() {
        return unionName;
    }

    /**
     * 联盟名称
     * @param unionName 联盟名称
     */
    public void setUnionName(String unionName) {
        this.unionName = unionName == null ? null : unionName.trim();
    }

    /**
     * 渠道标识
     * @return channel 渠道标识
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 渠道标识
     * @param channel 渠道标识
     */
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

	public UnionBuyerStatistics(Integer dacsOrderNum, Integer dacsGoodsNum, BigDecimal dacsGoodsAmount,
			BigDecimal dacsHelpPrice, Integer syzxOrderNum, Integer syzxGoodsNum, BigDecimal syzxGoodsAmount,
			BigDecimal syzxHelpPrice, Integer syscOrderNum, Integer syscGoodsNum, BigDecimal syscGoodsAmount,
			BigDecimal syscHelpPrice, Integer cTime, Integer unionId, String unionName, String channel) {
		super();
		this.dacsOrderNum = dacsOrderNum;
		this.dacsGoodsNum = dacsGoodsNum;
		this.dacsGoodsAmount = dacsGoodsAmount;
		this.dacsHelpPrice = dacsHelpPrice;
		this.syzxOrderNum = syzxOrderNum;
		this.syzxGoodsNum = syzxGoodsNum;
		this.syzxGoodsAmount = syzxGoodsAmount;
		this.syzxHelpPrice = syzxHelpPrice;
		this.syscOrderNum = syscOrderNum;
		this.syscGoodsNum = syscGoodsNum;
		this.syscGoodsAmount = syscGoodsAmount;
		this.syscHelpPrice = syscHelpPrice;
		this.cTime = cTime;
		this.unionId = unionId;
		this.unionName = unionName;
		this.channel = channel;
	}

	public UnionBuyerStatistics() {
		super();
	}
    
    
}