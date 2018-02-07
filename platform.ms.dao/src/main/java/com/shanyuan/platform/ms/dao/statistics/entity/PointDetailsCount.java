package com.shanyuan.platform.ms.dao.statistics.entity;

/**
 * 描述:statistics_point_details_count表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2018-01-23
 */
public class PointDetailsCount {
    /**
     * 
     */
    private Integer recId;

    /**
     * 联盟id，0为所有联盟
     */
    private Integer unionId;

    /**
     * 联盟标识
     */
    private String unionChannel;

    /**
     * 联盟名称
     */
    private String unionName;

    /**
     * 标签
     */
    private Long tag;

    /**
     * 累计积分人数
     */
    private Integer totalNum;

    /**
     * 累计积分人数
     */
    private Integer validNum;

    /**
     * 创建时间
     */
    private Integer cTime;

    /**
     * 
     * @return rec_id 
     */
    public Integer getRecId() {
        return recId;
    }

    /**
     * 
     * @param recId 
     */
    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    /**
     * 联盟id，0为所有联盟
     * @return union_id 联盟id，0为所有联盟
     */
    public Integer getUnionId() {
        return unionId;
    }

    /**
     * 联盟id，0为所有联盟
     * @param unionId 联盟id，0为所有联盟
     */
    public void setUnionId(Integer unionId) {
        this.unionId = unionId;
    }

    /**
     * 联盟标识
     * @return union_channel 联盟标识
     */
    public String getUnionChannel() {
        return unionChannel;
    }

    /**
     * 联盟标识
     * @param unionChannel 联盟标识
     */
    public void setUnionChannel(String unionChannel) {
        this.unionChannel = unionChannel == null ? null : unionChannel.trim();
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
     * 标签
     * @return tag 标签
     */
    public Long getTag() {
        return tag;
    }

    /**
     * 标签
     * @param tag 标签
     */
    public void setTag(Long tag) {
        this.tag = tag;
    }

    /**
     * 累计积分人数
     * @return total_num 累计积分人数
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    /**
     * 累计积分人数
     * @param totalNum 累计积分人数
     */
    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    /**
     * 累计积分人数
     * @return valid_num 累计积分人数
     */
    public Integer getValidNum() {
        return validNum;
    }

    /**
     * 累计积分人数
     * @param validNum 累计积分人数
     */
    public void setValidNum(Integer validNum) {
        this.validNum = validNum;
    }

    /**
     * 创建时间
     * @return c_time 创建时间
     */
    public Integer getcTime() {
        return cTime;
    }

    /**
     * 创建时间
     * @param cTime 创建时间
     */
    public void setcTime(Integer cTime) {
        this.cTime = cTime;
    }

	public PointDetailsCount(Integer unionId, String unionChannel, String unionName, Long tag, Integer totalNum,
			Integer validNum, Integer cTime) {
		super();
		this.unionId = unionId;
		this.unionChannel = unionChannel;
		this.unionName = unionName;
		this.tag = tag;
		this.totalNum = totalNum;
		this.validNum = validNum;
		this.cTime = cTime;
	}

	public PointDetailsCount() {
		super();
	}
    
    
}