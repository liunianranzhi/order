package com.shanyuan.platform.ms.dao.user.entity;

/**
 * 描述:sy_syshop_account表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-10-17
 */
public class SyShopAccount {
    /**
     * 
     */
    private Integer recId;

    /**
     * 会员id
     */
    private Integer memberId;
    /*
     * 简称
     */
    private String companyAbbreviation;

    /**
     * 积分
     */
    private Long points;

    /**
     * 基金会费用的比例，实际比例为该值除以1000
     */
    private Short fundFeeRate;

    /**
     * 企业名称
     */
    private String companyName;

    /**
     * 企业logo
     */
    private String companyLogo;

    /**
     * 企业营业执照与证书号，json格式
     */
    private String licence;

    /**
     * 平台合同json格式
     */
    private String platformProt;

    /**
     * 善源联盟协议json格式
     */
    private String syProt;

    /**
     * 审核状态，0：未通过，1是通过，2审核中
     */
    private Byte status;

    /**
     * 审核不通过原因
     */
    private String failureReason;

    /**
     * 所属分馆id
     */
    private Integer areaId;

    /**
     * 
     * @return rec_id 
     */
    public Integer getRecId() {
        return recId;
    }

    public String getCompanyAbbreviation() {
		return companyAbbreviation;
	}

	public void setCompanyAbbreviation(String companyAbbreviation) {
		this.companyAbbreviation = companyAbbreviation;
	}

	/**
     * 
     * @param recId 
     */
    public void setRecId(Integer recId) {
        this.recId = recId;
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
     * 积分
     * @return points 积分
     */
    public Long getPoints() {
        return points;
    }

    /**
     * 积分
     * @param points 积分
     */
    public void setPoints(Long points) {
        this.points = points;
    }

    /**
     * 基金会费用的比例，实际比例为该值除以1000
     * @return fund_fee_rate 基金会费用的比例，实际比例为该值除以1000
     */
    public Short getFundFeeRate() {
        return fundFeeRate;
    }

    /**
     * 基金会费用的比例，实际比例为该值除以1000
     * @param fundFeeRate 基金会费用的比例，实际比例为该值除以1000
     */
    public void setFundFeeRate(Short fundFeeRate) {
        this.fundFeeRate = fundFeeRate;
    }

    /**
     * 企业名称
     * @return company_name 企业名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 企业名称
     * @param companyName 企业名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    /**
     * 企业logo
     * @return company_logo 企业logo
     */
    public String getCompanyLogo() {
        return companyLogo;
    }

    /**
     * 企业logo
     * @param companyLogo 企业logo
     */
    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo == null ? null : companyLogo.trim();
    }

    /**
     * 企业营业执照与证书号，json格式
     * @return licence 企业营业执照与证书号，json格式
     */
    public String getLicence() {
        return licence;
    }

    /**
     * 企业营业执照与证书号，json格式
     * @param licence 企业营业执照与证书号，json格式
     */
    public void setLicence(String licence) {
        this.licence = licence == null ? null : licence.trim();
    }

    /**
     * 平台合同json格式
     * @return platform_prot 平台合同json格式
     */
    public String getPlatformProt() {
        return platformProt;
    }

    /**
     * 平台合同json格式
     * @param platformProt 平台合同json格式
     */
    public void setPlatformProt(String platformProt) {
        this.platformProt = platformProt == null ? null : platformProt.trim();
    }

    /**
     * 善源联盟协议json格式
     * @return sy_prot 善源联盟协议json格式
     */
    public String getSyProt() {
        return syProt;
    }

    /**
     * 善源联盟协议json格式
     * @param syProt 善源联盟协议json格式
     */
    public void setSyProt(String syProt) {
        this.syProt = syProt == null ? null : syProt.trim();
    }

    /**
     * 审核状态，0：未通过，1是通过，2审核中
     * @return status 审核状态，0：未通过，1是通过，2审核中
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 审核状态，0：未通过，1是通过，2审核中
     * @param status 审核状态，0：未通过，1是通过，2审核中
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 审核不通过原因
     * @return failure_reason 审核不通过原因
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * 审核不通过原因
     * @param failureReason 审核不通过原因
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason == null ? null : failureReason.trim();
    }

    /**
     * 所属分馆id
     * @return area_id 所属分馆id
     */
    public Integer getAreaId() {
        return areaId;
    }

    /**
     * 所属分馆id
     * @param areaId 所属分馆id
     */
    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }
}