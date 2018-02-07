package com.shanyuan.platform.ms.dao.user.entity;

import java.math.BigDecimal;

/**
 * 描述:sy_poor表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-10-17
 */
public class SyPoor {
    /**
     * 贫困户id
     */
    private Integer poorId;

    /**
     * 会员id
     */
    private Integer memberId;

    /**
     * 住址id
     */
    private Integer addressId;

    /**
     * 家庭年收入
     */
    private String incomeYear;

    /**
     * 贫困户家庭合影照片
     */
    private String familyPhoto;

    /**
     * 居住环境照片
     */
    private String livePhoto;

    /**
     * 致贫原因
     */
    private String povertyReason;

    /**
     * 家庭情况文字介绍
     */
    private String poorIntro;

    /**
     * 心愿与诉求
     */
    private String poorWish;

    /**
     * 脱贫计划
     */
    private String overcomePovertyPlan;

    /**
     * 开户人姓名
     */
    private String poorReceiverName;

    /**
     * 贫困户银行账号
     */
    private String poorBankAccountNumber;

    /**
     * 贫困户开户银行支行名称
     */
    private String poorBankName;

    /**
     * 贫困户家庭人数
     */
    private Byte familyMemberNum;

    /**
     * 与户主关系
     */
    private String relation;

    /**
     * 个人照片
     */
    private String personPhoto;

    /**
     * 帮扶人数量
     */
    private Integer supporterCount;

    /**
     * 上架产品数量
     */
    private Integer onlineGoodsCount;

    /**
     * 帮扶人会员id
     */
    private Integer supporterMid;

    /**
     * 贫困户角色类型，0普通，1代理人预付费
     */
    private Byte poorType;

    /**
     * 已被帮扶的总金额
     */
    private BigDecimal supportedAmount;

    /**
     * 
     */
    private String pAddr1;

    /**
     * 
     */
    private String pAddr2;

    /**
     * 
     */
    private String pAddr3;

    /**
     * 
     */
    private String pAddr4;

    /**
     * 
     */
    private String pAddr5;

    /**
     * 
     */
    private String pAddr6;

    /**
     * 户编号
     */
    private String familyNo;

    /**
     * 人编号
     */
    private String memberNo;

    /**
     * 性别
     */
    private String memberSex;

    /**
     * 民族
     */
    private String national;

    /**
     * 出生年月
     */
    private Integer birthday;

    /**
     * 文化程度
     */
    private String education;

    /**
     * 在校生状况
     */
    private String student;

    /**
     * 健康状况
     */
    private String health;

    /**
     * 劳动技能
     */
    private String skill;

    /**
     * 务工状况
     */
    private String workingCondition;

    /**
     * 脱贫属性, 已脱贫/未脱贫
     */
    private String povertyProp;

    /**
     * 贫困户属性
     */
    private String poorProp;

    /**
     * 在户状态, 0不在户, 1在户
     */
    private Byte state;

    /**
     * 是否是军烈属, 0否, 1是
     */
    private Byte isSoldiersFamily;

    /**
     * 可创收项目
     */
    private String povertyProject;

    /**
     * 家庭情况视频介绍
     */
    private String poorVideoIntro;

    /**
     * 人均纯收入
     */
    private BigDecimal incomeYearPerPerson;

    /**
     * 渠道标识
     */
    private String channel;

    /**
     * 所属运营中心
     */
    private Integer operationId;

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
     * 贫困户总人数
     */
    private Integer familyMemberNumSum;
    
    

    public Integer getFamilyMemberNumSum() {
		return familyMemberNumSum;
	}

	public void setFamilyMemberNumSum(Integer familyMemberNumSum) {
		this.familyMemberNumSum = familyMemberNumSum;
	}

	/**
     * 贫困户id
     * @return poor_id 贫困户id
     */
    public Integer getPoorId() {
        return poorId;
    }

    /**
     * 贫困户id
     * @param poorId 贫困户id
     */
    public void setPoorId(Integer poorId) {
        this.poorId = poorId;
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
     * 住址id
     * @return address_id 住址id
     */
    public Integer getAddressId() {
        return addressId;
    }

    /**
     * 住址id
     * @param addressId 住址id
     */
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    /**
     * 家庭年收入
     * @return income_year 家庭年收入
     */
    public String getIncomeYear() {
        return incomeYear;
    }

    /**
     * 家庭年收入
     * @param incomeYear 家庭年收入
     */
    public void setIncomeYear(String incomeYear) {
        this.incomeYear = incomeYear == null ? null : incomeYear.trim();
    }

    /**
     * 贫困户家庭合影照片
     * @return family_photo 贫困户家庭合影照片
     */
    public String getFamilyPhoto() {
        return familyPhoto;
    }

    /**
     * 贫困户家庭合影照片
     * @param familyPhoto 贫困户家庭合影照片
     */
    public void setFamilyPhoto(String familyPhoto) {
        this.familyPhoto = familyPhoto == null ? null : familyPhoto.trim();
    }

    /**
     * 居住环境照片
     * @return live_photo 居住环境照片
     */
    public String getLivePhoto() {
        return livePhoto;
    }

    /**
     * 居住环境照片
     * @param livePhoto 居住环境照片
     */
    public void setLivePhoto(String livePhoto) {
        this.livePhoto = livePhoto == null ? null : livePhoto.trim();
    }

    /**
     * 致贫原因
     * @return poverty_reason 致贫原因
     */
    public String getPovertyReason() {
        return povertyReason;
    }

    /**
     * 致贫原因
     * @param povertyReason 致贫原因
     */
    public void setPovertyReason(String povertyReason) {
        this.povertyReason = povertyReason == null ? null : povertyReason.trim();
    }

    /**
     * 家庭情况文字介绍
     * @return poor_intro 家庭情况文字介绍
     */
    public String getPoorIntro() {
        return poorIntro;
    }

    /**
     * 家庭情况文字介绍
     * @param poorIntro 家庭情况文字介绍
     */
    public void setPoorIntro(String poorIntro) {
        this.poorIntro = poorIntro == null ? null : poorIntro.trim();
    }

    /**
     * 心愿与诉求
     * @return poor_wish 心愿与诉求
     */
    public String getPoorWish() {
        return poorWish;
    }

    /**
     * 心愿与诉求
     * @param poorWish 心愿与诉求
     */
    public void setPoorWish(String poorWish) {
        this.poorWish = poorWish == null ? null : poorWish.trim();
    }

    /**
     * 脱贫计划
     * @return overcome_poverty_plan 脱贫计划
     */
    public String getOvercomePovertyPlan() {
        return overcomePovertyPlan;
    }

    /**
     * 脱贫计划
     * @param overcomePovertyPlan 脱贫计划
     */
    public void setOvercomePovertyPlan(String overcomePovertyPlan) {
        this.overcomePovertyPlan = overcomePovertyPlan == null ? null : overcomePovertyPlan.trim();
    }

    /**
     * 开户人姓名
     * @return poor_receiver_name 开户人姓名
     */
    public String getPoorReceiverName() {
        return poorReceiverName;
    }

    /**
     * 开户人姓名
     * @param poorReceiverName 开户人姓名
     */
    public void setPoorReceiverName(String poorReceiverName) {
        this.poorReceiverName = poorReceiverName == null ? null : poorReceiverName.trim();
    }

    /**
     * 贫困户银行账号
     * @return poor_bank_account_number 贫困户银行账号
     */
    public String getPoorBankAccountNumber() {
        return poorBankAccountNumber;
    }

    /**
     * 贫困户银行账号
     * @param poorBankAccountNumber 贫困户银行账号
     */
    public void setPoorBankAccountNumber(String poorBankAccountNumber) {
        this.poorBankAccountNumber = poorBankAccountNumber == null ? null : poorBankAccountNumber.trim();
    }

    /**
     * 贫困户开户银行支行名称
     * @return poor_bank_name 贫困户开户银行支行名称
     */
    public String getPoorBankName() {
        return poorBankName;
    }

    /**
     * 贫困户开户银行支行名称
     * @param poorBankName 贫困户开户银行支行名称
     */
    public void setPoorBankName(String poorBankName) {
        this.poorBankName = poorBankName == null ? null : poorBankName.trim();
    }

    /**
     * 贫困户家庭人数
     * @return family_member_num 贫困户家庭人数
     */
    public Byte getFamilyMemberNum() {
        return familyMemberNum;
    }

    /**
     * 贫困户家庭人数
     * @param familyMemberNum 贫困户家庭人数
     */
    public void setFamilyMemberNum(Byte familyMemberNum) {
        this.familyMemberNum = familyMemberNum;
    }

    /**
     * 与户主关系
     * @return relation 与户主关系
     */
    public String getRelation() {
        return relation;
    }

    /**
     * 与户主关系
     * @param relation 与户主关系
     */
    public void setRelation(String relation) {
        this.relation = relation == null ? null : relation.trim();
    }

    /**
     * 个人照片
     * @return person_photo 个人照片
     */
    public String getPersonPhoto() {
        return personPhoto;
    }

    /**
     * 个人照片
     * @param personPhoto 个人照片
     */
    public void setPersonPhoto(String personPhoto) {
        this.personPhoto = personPhoto == null ? null : personPhoto.trim();
    }

    /**
     * 帮扶人数量
     * @return supporter_count 帮扶人数量
     */
    public Integer getSupporterCount() {
        return supporterCount;
    }

    /**
     * 帮扶人数量
     * @param supporterCount 帮扶人数量
     */
    public void setSupporterCount(Integer supporterCount) {
        this.supporterCount = supporterCount;
    }

    /**
     * 上架产品数量
     * @return online_goods_count 上架产品数量
     */
    public Integer getOnlineGoodsCount() {
        return onlineGoodsCount;
    }

    /**
     * 上架产品数量
     * @param onlineGoodsCount 上架产品数量
     */
    public void setOnlineGoodsCount(Integer onlineGoodsCount) {
        this.onlineGoodsCount = onlineGoodsCount;
    }

    /**
     * 帮扶人会员id
     * @return supporter_mid 帮扶人会员id
     */
    public Integer getSupporterMid() {
        return supporterMid;
    }

    /**
     * 帮扶人会员id
     * @param supporterMid 帮扶人会员id
     */
    public void setSupporterMid(Integer supporterMid) {
        this.supporterMid = supporterMid;
    }

    /**
     * 贫困户角色类型，0普通，1代理人预付费
     * @return poor_type 贫困户角色类型，0普通，1代理人预付费
     */
    public Byte getPoorType() {
        return poorType;
    }

    /**
     * 贫困户角色类型，0普通，1代理人预付费
     * @param poorType 贫困户角色类型，0普通，1代理人预付费
     */
    public void setPoorType(Byte poorType) {
        this.poorType = poorType;
    }

    /**
     * 已被帮扶的总金额
     * @return supported_amount 已被帮扶的总金额
     */
    public BigDecimal getSupportedAmount() {
        return supportedAmount;
    }

    /**
     * 已被帮扶的总金额
     * @param supportedAmount 已被帮扶的总金额
     */
    public void setSupportedAmount(BigDecimal supportedAmount) {
        this.supportedAmount = supportedAmount;
    }

    /**
     * 
     * @return p_addr1 
     */
    public String getpAddr1() {
        return pAddr1;
    }

    /**
     * 
     * @param pAddr1 
     */
    public void setpAddr1(String pAddr1) {
        this.pAddr1 = pAddr1 == null ? null : pAddr1.trim();
    }

    /**
     * 
     * @return p_addr2 
     */
    public String getpAddr2() {
        return pAddr2;
    }

    /**
     * 
     * @param pAddr2 
     */
    public void setpAddr2(String pAddr2) {
        this.pAddr2 = pAddr2 == null ? null : pAddr2.trim();
    }

    /**
     * 
     * @return p_addr3 
     */
    public String getpAddr3() {
        return pAddr3;
    }

    /**
     * 
     * @param pAddr3 
     */
    public void setpAddr3(String pAddr3) {
        this.pAddr3 = pAddr3 == null ? null : pAddr3.trim();
    }

    /**
     * 
     * @return p_addr4 
     */
    public String getpAddr4() {
        return pAddr4;
    }

    /**
     * 
     * @param pAddr4 
     */
    public void setpAddr4(String pAddr4) {
        this.pAddr4 = pAddr4 == null ? null : pAddr4.trim();
    }

    /**
     * 
     * @return p_addr5 
     */
    public String getpAddr5() {
        return pAddr5;
    }

    /**
     * 
     * @param pAddr5 
     */
    public void setpAddr5(String pAddr5) {
        this.pAddr5 = pAddr5 == null ? null : pAddr5.trim();
    }

    /**
     * 
     * @return p_addr6 
     */
    public String getpAddr6() {
        return pAddr6;
    }

    /**
     * 
     * @param pAddr6 
     */
    public void setpAddr6(String pAddr6) {
        this.pAddr6 = pAddr6 == null ? null : pAddr6.trim();
    }

    /**
     * 户编号
     * @return family_no 户编号
     */
    public String getFamilyNo() {
        return familyNo;
    }

    /**
     * 户编号
     * @param familyNo 户编号
     */
    public void setFamilyNo(String familyNo) {
        this.familyNo = familyNo == null ? null : familyNo.trim();
    }

    /**
     * 人编号
     * @return member_no 人编号
     */
    public String getMemberNo() {
        return memberNo;
    }

    /**
     * 人编号
     * @param memberNo 人编号
     */
    public void setMemberNo(String memberNo) {
        this.memberNo = memberNo == null ? null : memberNo.trim();
    }

    /**
     * 性别
     * @return member_sex 性别
     */
    public String getMemberSex() {
        return memberSex;
    }

    /**
     * 性别
     * @param memberSex 性别
     */
    public void setMemberSex(String memberSex) {
        this.memberSex = memberSex == null ? null : memberSex.trim();
    }

    /**
     * 民族
     * @return national 民族
     */
    public String getNational() {
        return national;
    }

    /**
     * 民族
     * @param national 民族
     */
    public void setNational(String national) {
        this.national = national == null ? null : national.trim();
    }

    /**
     * 出生年月
     * @return birthday 出生年月
     */
    public Integer getBirthday() {
        return birthday;
    }

    /**
     * 出生年月
     * @param birthday 出生年月
     */
    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }

    /**
     * 文化程度
     * @return education 文化程度
     */
    public String getEducation() {
        return education;
    }

    /**
     * 文化程度
     * @param education 文化程度
     */
    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    /**
     * 在校生状况
     * @return student 在校生状况
     */
    public String getStudent() {
        return student;
    }

    /**
     * 在校生状况
     * @param student 在校生状况
     */
    public void setStudent(String student) {
        this.student = student == null ? null : student.trim();
    }

    /**
     * 健康状况
     * @return health 健康状况
     */
    public String getHealth() {
        return health;
    }

    /**
     * 健康状况
     * @param health 健康状况
     */
    public void setHealth(String health) {
        this.health = health == null ? null : health.trim();
    }

    /**
     * 劳动技能
     * @return skill 劳动技能
     */
    public String getSkill() {
        return skill;
    }

    /**
     * 劳动技能
     * @param skill 劳动技能
     */
    public void setSkill(String skill) {
        this.skill = skill == null ? null : skill.trim();
    }

    /**
     * 务工状况
     * @return working_condition 务工状况
     */
    public String getWorkingCondition() {
        return workingCondition;
    }

    /**
     * 务工状况
     * @param workingCondition 务工状况
     */
    public void setWorkingCondition(String workingCondition) {
        this.workingCondition = workingCondition == null ? null : workingCondition.trim();
    }

    /**
     * 脱贫属性, 已脱贫/未脱贫
     * @return poverty_prop 脱贫属性, 已脱贫/未脱贫
     */
    public String getPovertyProp() {
        return povertyProp;
    }

    /**
     * 脱贫属性, 已脱贫/未脱贫
     * @param povertyProp 脱贫属性, 已脱贫/未脱贫
     */
    public void setPovertyProp(String povertyProp) {
        this.povertyProp = povertyProp == null ? null : povertyProp.trim();
    }

    /**
     * 贫困户属性
     * @return poor_prop 贫困户属性
     */
    public String getPoorProp() {
        return poorProp;
    }

    /**
     * 贫困户属性
     * @param poorProp 贫困户属性
     */
    public void setPoorProp(String poorProp) {
        this.poorProp = poorProp == null ? null : poorProp.trim();
    }

    /**
     * 在户状态, 0不在户, 1在户
     * @return state 在户状态, 0不在户, 1在户
     */
    public Byte getState() {
        return state;
    }

    /**
     * 在户状态, 0不在户, 1在户
     * @param state 在户状态, 0不在户, 1在户
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /**
     * 是否是军烈属, 0否, 1是
     * @return is_soldiers_family 是否是军烈属, 0否, 1是
     */
    public Byte getIsSoldiersFamily() {
        return isSoldiersFamily;
    }

    /**
     * 是否是军烈属, 0否, 1是
     * @param isSoldiersFamily 是否是军烈属, 0否, 1是
     */
    public void setIsSoldiersFamily(Byte isSoldiersFamily) {
        this.isSoldiersFamily = isSoldiersFamily;
    }

    /**
     * 可创收项目
     * @return poverty_project 可创收项目
     */
    public String getPovertyProject() {
        return povertyProject;
    }

    /**
     * 可创收项目
     * @param povertyProject 可创收项目
     */
    public void setPovertyProject(String povertyProject) {
        this.povertyProject = povertyProject == null ? null : povertyProject.trim();
    }

    /**
     * 家庭情况视频介绍
     * @return poor_video_intro 家庭情况视频介绍
     */
    public String getPoorVideoIntro() {
        return poorVideoIntro;
    }

    /**
     * 家庭情况视频介绍
     * @param poorVideoIntro 家庭情况视频介绍
     */
    public void setPoorVideoIntro(String poorVideoIntro) {
        this.poorVideoIntro = poorVideoIntro == null ? null : poorVideoIntro.trim();
    }

    /**
     * 人均纯收入
     * @return income_year_per_person 人均纯收入
     */
    public BigDecimal getIncomeYearPerPerson() {
        return incomeYearPerPerson;
    }

    /**
     * 人均纯收入
     * @param incomeYearPerPerson 人均纯收入
     */
    public void setIncomeYearPerPerson(BigDecimal incomeYearPerPerson) {
        this.incomeYearPerPerson = incomeYearPerPerson;
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
     * 所属运营中心
     * @return operation_id 所属运营中心
     */
    public Integer getOperationId() {
        return operationId;
    }

    /**
     * 所属运营中心
     * @param operationId 所属运营中心
     */
    public void setOperationId(Integer operationId) {
        this.operationId = operationId;
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
		return "SyPoor [poorId=" + poorId + ", memberId=" + memberId + ", addressId=" + addressId + ", incomeYear="
				+ incomeYear + ", familyPhoto=" + familyPhoto + ", livePhoto=" + livePhoto + ", povertyReason="
				+ povertyReason + ", poorIntro=" + poorIntro + ", poorWish=" + poorWish + ", overcomePovertyPlan="
				+ overcomePovertyPlan + ", poorReceiverName=" + poorReceiverName + ", poorBankAccountNumber="
				+ poorBankAccountNumber + ", poorBankName=" + poorBankName + ", familyMemberNum=" + familyMemberNum
				+ ", relation=" + relation + ", personPhoto=" + personPhoto + ", supporterCount=" + supporterCount
				+ ", onlineGoodsCount=" + onlineGoodsCount + ", supporterMid=" + supporterMid + ", poorType=" + poorType
				+ ", supportedAmount=" + supportedAmount + ", pAddr1=" + pAddr1 + ", pAddr2=" + pAddr2 + ", pAddr3="
				+ pAddr3 + ", pAddr4=" + pAddr4 + ", pAddr5=" + pAddr5 + ", pAddr6=" + pAddr6 + ", familyNo=" + familyNo
				+ ", memberNo=" + memberNo + ", memberSex=" + memberSex + ", national=" + national + ", birthday="
				+ birthday + ", education=" + education + ", student=" + student + ", health=" + health + ", skill="
				+ skill + ", workingCondition=" + workingCondition + ", povertyProp=" + povertyProp + ", poorProp="
				+ poorProp + ", state=" + state + ", isSoldiersFamily=" + isSoldiersFamily + ", povertyProject="
				+ povertyProject + ", poorVideoIntro=" + poorVideoIntro + ", incomeYearPerPerson=" + incomeYearPerPerson
				+ ", channel=" + channel + ", operationId=" + operationId + ", areaid1=" + areaid1 + ", areaid2="
				+ areaid2 + ", areaid3=" + areaid3 + "]";
	}
    
    
}