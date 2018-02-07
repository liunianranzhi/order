package com.shanyuan.platform.ms.dao.stats.entity;

import java.math.BigDecimal;

/**
 * 描述:sy_poor_fpb_raw_data表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-11-10
 */
public class SyPoorFpbRawData {
    /**
     * 
     */
    private Integer recId;

    /**
     * 会员id
     */
    private Integer memberId;

    /**
     * 姓名
     */
    private String memberName;

    /**
     * 证件类型, 0身份证
     */
    private Byte idType;

    /**
     * 证件号码
     */
    private String idValue;

    /**
     * 性别
     */
    private String memberSex;

    /**
     * 是否是户主, 0家庭成员, 1户主
     */
    private Byte isMaster;

    /**
     * 与户主关系
     */
    private String relation;

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
     * 联系电话
     */
    private String memberMobile;

    /**
     * 致贫原因
     */
    private String povertyReason;

    /**
     * 人均纯收入
     */
    private BigDecimal incomeYearPerPerson;

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
     * 一级地区id
     */
    private Long areaid1;

    /**
     * 三级地区id
     */
    private Long areaid2;

    /**
     * 三级地区id
     */
    private Long areaid3;

    /**
     * 银行卡号
     */
    private String poorBankAccountNumber;

    /**
     * 开户人
     */
    private String poorReceiverName;

    /**
     * 开户银行名称
     */
    private String poorBankName;

    /**
     * 家庭成员
     */
    private Byte familyMemberNum;

    /**
     * 户主的rec_id
     */
    private Integer masterRecId;

    /**
     * 户编号
     */
    private String familyNo;

    /**
     * 人编号
     */
    private String memberNo;

    /**
     * 是否在户, 0不在户, 1在户
     */
    private Byte state;

    /**
     * 是否是军烈属, 0否, 1是
     */
    private Byte isSoldiersFamily;

    /**
     * 渠道标识,默认空
     */
    private String channel;

    /**
     * 是否有效, 0无效, 1有效
     */
    private Byte valid;

    /**
     * 校验错误信息
     */
    private String error;

    /**
     * 与原系统比对的错误信息
     */
    private String error2;

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
     * 姓名
     * @return member_name 姓名
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * 姓名
     * @param memberName 姓名
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    /**
     * 证件类型, 0身份证
     * @return id_type 证件类型, 0身份证
     */
    public Byte getIdType() {
        return idType;
    }

    /**
     * 证件类型, 0身份证
     * @param idType 证件类型, 0身份证
     */
    public void setIdType(Byte idType) {
        this.idType = idType;
    }

    /**
     * 证件号码
     * @return id_value 证件号码
     */
    public String getIdValue() {
        return idValue;
    }

    /**
     * 证件号码
     * @param idValue 证件号码
     */
    public void setIdValue(String idValue) {
        this.idValue = idValue == null ? null : idValue.trim();
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
     * 是否是户主, 0家庭成员, 1户主
     * @return is_master 是否是户主, 0家庭成员, 1户主
     */
    public Byte getIsMaster() {
        return isMaster;
    }

    /**
     * 是否是户主, 0家庭成员, 1户主
     * @param isMaster 是否是户主, 0家庭成员, 1户主
     */
    public void setIsMaster(Byte isMaster) {
        this.isMaster = isMaster;
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
     * 联系电话
     * @return member_mobile 联系电话
     */
    public String getMemberMobile() {
        return memberMobile;
    }

    /**
     * 联系电话
     * @param memberMobile 联系电话
     */
    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile == null ? null : memberMobile.trim();
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
     * 三级地区id
     * @return areaid_2 三级地区id
     */
    public Long getAreaid2() {
        return areaid2;
    }

    /**
     * 三级地区id
     * @param areaid2 三级地区id
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

    /**
     * 银行卡号
     * @return poor_bank_account_number 银行卡号
     */
    public String getPoorBankAccountNumber() {
        return poorBankAccountNumber;
    }

    /**
     * 银行卡号
     * @param poorBankAccountNumber 银行卡号
     */
    public void setPoorBankAccountNumber(String poorBankAccountNumber) {
        this.poorBankAccountNumber = poorBankAccountNumber == null ? null : poorBankAccountNumber.trim();
    }

    /**
     * 开户人
     * @return poor_receiver_name 开户人
     */
    public String getPoorReceiverName() {
        return poorReceiverName;
    }

    /**
     * 开户人
     * @param poorReceiverName 开户人
     */
    public void setPoorReceiverName(String poorReceiverName) {
        this.poorReceiverName = poorReceiverName == null ? null : poorReceiverName.trim();
    }

    /**
     * 开户银行名称
     * @return poor_bank_name 开户银行名称
     */
    public String getPoorBankName() {
        return poorBankName;
    }

    /**
     * 开户银行名称
     * @param poorBankName 开户银行名称
     */
    public void setPoorBankName(String poorBankName) {
        this.poorBankName = poorBankName == null ? null : poorBankName.trim();
    }

    /**
     * 家庭成员
     * @return family_member_num 家庭成员
     */
    public Byte getFamilyMemberNum() {
        return familyMemberNum;
    }

    /**
     * 家庭成员
     * @param familyMemberNum 家庭成员
     */
    public void setFamilyMemberNum(Byte familyMemberNum) {
        this.familyMemberNum = familyMemberNum;
    }

    /**
     * 户主的rec_id
     * @return master_rec_id 户主的rec_id
     */
    public Integer getMasterRecId() {
        return masterRecId;
    }

    /**
     * 户主的rec_id
     * @param masterRecId 户主的rec_id
     */
    public void setMasterRecId(Integer masterRecId) {
        this.masterRecId = masterRecId;
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
     * 是否在户, 0不在户, 1在户
     * @return state 是否在户, 0不在户, 1在户
     */
    public Byte getState() {
        return state;
    }

    /**
     * 是否在户, 0不在户, 1在户
     * @param state 是否在户, 0不在户, 1在户
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
     * 渠道标识,默认空
     * @return channel 渠道标识,默认空
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 渠道标识,默认空
     * @param channel 渠道标识,默认空
     */
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    /**
     * 是否有效, 0无效, 1有效
     * @return valid 是否有效, 0无效, 1有效
     */
    public Byte getValid() {
        return valid;
    }

    /**
     * 是否有效, 0无效, 1有效
     * @param valid 是否有效, 0无效, 1有效
     */
    public void setValid(Byte valid) {
        this.valid = valid;
    }

    /**
     * 校验错误信息
     * @return error 校验错误信息
     */
    public String getError() {
        return error;
    }

    /**
     * 校验错误信息
     * @param error 校验错误信息
     */
    public void setError(String error) {
        this.error = error == null ? null : error.trim();
    }

    /**
     * 与原系统比对的错误信息
     * @return error2 与原系统比对的错误信息
     */
    public String getError2() {
        return error2;
    }

    /**
     * 与原系统比对的错误信息
     * @param error2 与原系统比对的错误信息
     */
    public void setError2(String error2) {
        this.error2 = error2 == null ? null : error2.trim();
    }
}