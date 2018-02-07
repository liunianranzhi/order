package com.shanyuan.platform.ms.dao.user.entity;

/**
 * 描述:sy_role表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-10-17
 */
public class SyRole {
    /**
     * 角色id
     */
    private Integer roleId;

    /**
     * 会员id
     */
    private Integer memberId;

    /**
     * 发货地址id
     */
    private Integer addressId;

    /**
     * 角色的类型，1为合作社，2为网商
     */
    private Byte roleType;

    /**
     * 管理费的比例，实际比例为该值除以1000
     */
    private Short mFeeRate;

    /**
     * 是否同意协议0没有同意1同意
     */
    private Byte sureAgreement;

    /**
     * 代理人同意协议的时间
     */
    private Integer sureAgreementTime;

    /**
     * 确认代理的贫困户0没确认1代理信息正确2代理信息有误
     */
    private Byte surePoor;

    /**
     * 代理人确认代理贫困户的时间
     */
    private Integer surePoorTime;

    /**
     * 推荐理由
     */
    private String recommendReason;

    /**
     * 是否为推荐代理人
     */
    private String recommend;

    /**
     * 推荐时间
     */
    private Integer recommendTime;

    /**
     * 公益捐赠的标准比例,值是乘1000得到的
     */
    private Short fundFeeRate;

    /**
     * 渠道标识
     */
    private String channel;

    /**
     * 一级地区id
     */
    private Long areaid1;

    /**
     * 二级地区id
     */
    private Long areaid2;

    /**
     * 三级地区id
     */
    private Long areaid3;

    /**
     * 角色id
     * @return role_id 角色id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 角色id
     * @param roleId 角色id
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 会员id
     * @return member_id 会员id
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 会员id
     * @param memberId 会员id
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 发货地址id
     * @return address_id 发货地址id
     */
    public Integer getAddressId() {
        return addressId;
    }

    /**
     * 发货地址id
     * @param addressId 发货地址id
     */
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    /**
     * 角色的类型，1为合作社，2为网商
     * @return role_type 角色的类型，1为合作社，2为网商
     */
    public Byte getRoleType() {
        return roleType;
    }

    /**
     * 角色的类型，1为合作社，2为网商
     * @param roleType 角色的类型，1为合作社，2为网商
     */
    public void setRoleType(Byte roleType) {
        this.roleType = roleType;
    }

    /**
     * 管理费的比例，实际比例为该值除以1000
     * @return m_fee_rate 管理费的比例，实际比例为该值除以1000
     */
    public Short getmFeeRate() {
        return mFeeRate;
    }

    /**
     * 管理费的比例，实际比例为该值除以1000
     * @param mFeeRate 管理费的比例，实际比例为该值除以1000
     */
    public void setmFeeRate(Short mFeeRate) {
        this.mFeeRate = mFeeRate;
    }

    /**
     * 是否同意协议0没有同意1同意
     * @return sure_agreement 是否同意协议0没有同意1同意
     */
    public Byte getSureAgreement() {
        return sureAgreement;
    }

    /**
     * 是否同意协议0没有同意1同意
     * @param sureAgreement 是否同意协议0没有同意1同意
     */
    public void setSureAgreement(Byte sureAgreement) {
        this.sureAgreement = sureAgreement;
    }

    /**
     * 代理人同意协议的时间
     * @return sure_agreement_time 代理人同意协议的时间
     */
    public Integer getSureAgreementTime() {
        return sureAgreementTime;
    }

    /**
     * 代理人同意协议的时间
     * @param sureAgreementTime 代理人同意协议的时间
     */
    public void setSureAgreementTime(Integer sureAgreementTime) {
        this.sureAgreementTime = sureAgreementTime;
    }

    /**
     * 确认代理的贫困户0没确认1代理信息正确2代理信息有误
     * @return sure_poor 确认代理的贫困户0没确认1代理信息正确2代理信息有误
     */
    public Byte getSurePoor() {
        return surePoor;
    }

    /**
     * 确认代理的贫困户0没确认1代理信息正确2代理信息有误
     * @param surePoor 确认代理的贫困户0没确认1代理信息正确2代理信息有误
     */
    public void setSurePoor(Byte surePoor) {
        this.surePoor = surePoor;
    }

    /**
     * 代理人确认代理贫困户的时间
     * @return sure_poor_time 代理人确认代理贫困户的时间
     */
    public Integer getSurePoorTime() {
        return surePoorTime;
    }

    /**
     * 代理人确认代理贫困户的时间
     * @param surePoorTime 代理人确认代理贫困户的时间
     */
    public void setSurePoorTime(Integer surePoorTime) {
        this.surePoorTime = surePoorTime;
    }

    /**
     * 推荐理由
     * @return recommend_reason 推荐理由
     */
    public String getRecommendReason() {
        return recommendReason;
    }

    /**
     * 推荐理由
     * @param recommendReason 推荐理由
     */
    public void setRecommendReason(String recommendReason) {
        this.recommendReason = recommendReason == null ? null : recommendReason.trim();
    }

    /**
     * 是否为推荐代理人
     * @return recommend 是否为推荐代理人
     */
    public String getRecommend() {
        return recommend;
    }

    /**
     * 是否为推荐代理人
     * @param recommend 是否为推荐代理人
     */
    public void setRecommend(String recommend) {
        this.recommend = recommend == null ? null : recommend.trim();
    }

    /**
     * 推荐时间
     * @return recommend_time 推荐时间
     */
    public Integer getRecommendTime() {
        return recommendTime;
    }

    /**
     * 推荐时间
     * @param recommendTime 推荐时间
     */
    public void setRecommendTime(Integer recommendTime) {
        this.recommendTime = recommendTime;
    }

    /**
     * 公益捐赠的标准比例,值是乘1000得到的
     * @return fund_fee_rate 公益捐赠的标准比例,值是乘1000得到的
     */
    public Short getFundFeeRate() {
        return fundFeeRate;
    }

    /**
     * 公益捐赠的标准比例,值是乘1000得到的
     * @param fundFeeRate 公益捐赠的标准比例,值是乘1000得到的
     */
    public void setFundFeeRate(Short fundFeeRate) {
        this.fundFeeRate = fundFeeRate;
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

    /**
     * 一级地区id
     * @return areaid_1 一级地区id
     */
    public Long getAreaid1() {
        return areaid1;
    }

    /**
     * 一级地区id
     * @param areaid1 一级地区id
     */
    public void setAreaid1(Long areaid1) {
        this.areaid1 = areaid1;
    }

    /**
     * 二级地区id
     * @return areaid_2 二级地区id
     */
    public Long getAreaid2() {
        return areaid2;
    }

    /**
     * 二级地区id
     * @param areaid2 二级地区id
     */
    public void setAreaid2(Long areaid2) {
        this.areaid2 = areaid2;
    }

    /**
     * 三级地区id
     * @return areaid_3 三级地区id
     */
    public Long getAreaid3() {
        return areaid3;
    }

    /**
     * 三级地区id
     * @param areaid3 三级地区id
     */
    public void setAreaid3(Long areaid3) {
        this.areaid3 = areaid3;
    }

	@Override
	public String toString() {
		return "SyRole [roleId=" + roleId + ", memberId=" + memberId + ", addressId=" + addressId + ", roleType="
				+ roleType + ", mFeeRate=" + mFeeRate + ", sureAgreement=" + sureAgreement + ", sureAgreementTime="
				+ sureAgreementTime + ", surePoor=" + surePoor + ", surePoorTime=" + surePoorTime + ", recommendReason="
				+ recommendReason + ", recommend=" + recommend + ", recommendTime=" + recommendTime + ", fundFeeRate="
				+ fundFeeRate + ", channel=" + channel + ", areaid1=" + areaid1 + ", areaid2=" + areaid2 + ", areaid3="
				+ areaid3 + "]";
	}
    
}