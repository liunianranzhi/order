package com.shanyuan.platform.ms.dao.statistics.entity;

/**
 * 描述:point_details_tag表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2018-01-09
 */
public class PointDetailsTag {
    /**
     * 
     */
    private Integer memberId;

    /**
     * 联盟id
     */
    private Integer unionId;

    /**
     * 联盟名称
     */
    private String unionName;

    /**
     * 联盟标识
     */
    private String channel;

    /**
     * 累计积分标签
     */
    private Long totalPointTag;

    /**
     * 可用积分标签
     */
    private Long validPointTag;

    /**
     * 累计积分
     */
    private Long totalPoint;

    /**
     * 可用积分
     */
    private Long validPoint;

    /**
     * 手机号
     */
    private String memberMobile;

    /**
     * 用户真实姓名
     */
    private String memberTruename;

    /**
     * 会员显示名称
     */
    private String memberDispName;

    /**
     * 会员名称
     */
    private String memberName;

    /**
     * 
     * @return member_id 
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 
     * @param memberId 
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
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
     * 联盟标识
     * @return channel 联盟标识
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 联盟标识
     * @param channel 联盟标识
     */
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    /**
     * 累计积分标签
     * @return total_point_tag 累计积分标签
     */
    public Long getTotalPointTag() {
        return totalPointTag;
    }

    /**
     * 累计积分标签
     * @param totalPointTag 累计积分标签
     */
    public void setTotalPointTag(Long totalPointTag) {
        this.totalPointTag = totalPointTag;
    }

    /**
     * 可用积分标签
     * @return valid_point_tag 可用积分标签
     */
    public Long getValidPointTag() {
        return validPointTag;
    }

    /**
     * 可用积分标签
     * @param validPointTag 可用积分标签
     */
    public void setValidPointTag(Long validPointTag) {
        this.validPointTag = validPointTag;
    }

    /**
     * 累计积分
     * @return total_point 累计积分
     */
    public Long getTotalPoint() {
        return totalPoint;
    }

    /**
     * 累计积分
     * @param totalPoint 累计积分
     */
    public void setTotalPoint(Long totalPoint) {
        this.totalPoint = totalPoint;
    }

    /**
     * 可用积分
     * @return valid_point 可用积分
     */
    public Long getValidPoint() {
        return validPoint;
    }

    /**
     * 可用积分
     * @param validPoint 可用积分
     */
    public void setValidPoint(Long validPoint) {
        this.validPoint = validPoint;
    }

    /**
     * 手机号
     * @return member_mobile 手机号
     */
    public String getMemberMobile() {
        return memberMobile;
    }

    /**
     * 手机号
     * @param memberMobile 手机号
     */
    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile == null ? null : memberMobile.trim();
    }

    /**
     * 用户真实姓名
     * @return member_truename 用户真实姓名
     */
    public String getMemberTruename() {
        return memberTruename;
    }

    /**
     * 用户真实姓名
     * @param memberTruename 用户真实姓名
     */
    public void setMemberTruename(String memberTruename) {
        this.memberTruename = memberTruename == null ? null : memberTruename.trim();
    }

    /**
     * 会员显示名称
     * @return member_disp_name 会员显示名称
     */
    public String getMemberDispName() {
        return memberDispName;
    }

    /**
     * 会员显示名称
     * @param memberDispName 会员显示名称
     */
    public void setMemberDispName(String memberDispName) {
        this.memberDispName = memberDispName == null ? null : memberDispName.trim();
    }

    /**
     * 会员名称
     * @return member_name 会员名称
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * 会员名称
     * @param memberName 会员名称
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((channel == null) ? 0 : channel.hashCode());
		result = prime * result + ((memberDispName == null) ? 0 : memberDispName.hashCode());
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + ((memberMobile == null) ? 0 : memberMobile.hashCode());
		result = prime * result + ((memberName == null) ? 0 : memberName.hashCode());
		result = prime * result + ((memberTruename == null) ? 0 : memberTruename.hashCode());
		result = prime * result + ((totalPoint == null) ? 0 : totalPoint.hashCode());
		result = prime * result + ((totalPointTag == null) ? 0 : totalPointTag.hashCode());
		result = prime * result + ((unionId == null) ? 0 : unionId.hashCode());
		result = prime * result + ((unionName == null) ? 0 : unionName.hashCode());
		result = prime * result + ((validPoint == null) ? 0 : validPoint.hashCode());
		result = prime * result + ((validPointTag == null) ? 0 : validPointTag.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PointDetailsTag other = (PointDetailsTag) obj;
		if (channel == null) {
			if (other.channel != null)
				return false;
		} else if (!channel.equals(other.channel))
			return false;
		if (memberDispName == null) {
			if (other.memberDispName != null)
				return false;
		} else if (!memberDispName.equals(other.memberDispName))
			return false;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		if (memberMobile == null) {
			if (other.memberMobile != null)
				return false;
		} else if (!memberMobile.equals(other.memberMobile))
			return false;
		if (memberName == null) {
			if (other.memberName != null)
				return false;
		} else if (!memberName.equals(other.memberName))
			return false;
		if (memberTruename == null) {
			if (other.memberTruename != null)
				return false;
		} else if (!memberTruename.equals(other.memberTruename))
			return false;
		if (totalPoint == null) {
			if (other.totalPoint != null)
				return false;
		} else if (!totalPoint.equals(other.totalPoint))
			return false;
		if (totalPointTag == null) {
			if (other.totalPointTag != null)
				return false;
		} else if (!totalPointTag.equals(other.totalPointTag))
			return false;
		if (unionId == null) {
			if (other.unionId != null)
				return false;
		} else if (!unionId.equals(other.unionId))
			return false;
		if (unionName == null) {
			if (other.unionName != null)
				return false;
		} else if (!unionName.equals(other.unionName))
			return false;
		if (validPoint == null) {
			if (other.validPoint != null)
				return false;
		} else if (!validPoint.equals(other.validPoint))
			return false;
		if (validPointTag == null) {
			if (other.validPointTag != null)
				return false;
		} else if (!validPointTag.equals(other.validPointTag))
			return false;
		return true;
	}
    
}