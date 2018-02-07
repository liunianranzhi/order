package com.shanyuan.platform.ms.dao.store.entity;

/**
 * 描述:sy_circle_member表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-10-17
 */
public class SyCircleMember extends SyCircleMemberKey {
    /**
     * 圈子名称
     */
    private String circleName;

    /**
     * 会员名称
     */
    private String memberName;

    /**
     * 申请内容
     */
    private String cmApplycontent;

    /**
     * 申请时间
     */
    private String cmApplytime;

    /**
     * 状态 0申请中 1通过 2未通过
     */
    private Byte cmState;

    /**
     * 自我介绍
     */
    private String cmIntro;

    /**
     * 加入时间
     */
    private String cmJointime;

    /**
     * 成员级别
     */
    private Integer cmLevel;

    /**
     * 成员头衔
     */
    private String cmLevelname;

    /**
     * 会员经验
     */
    private Integer cmExp;

    /**
     * 下一级所需经验
     */
    private Integer cmNextexp;

    /**
     * 1圈主 2管理 3成员
     */
    private Byte isIdentity;

    /**
     * 是否允许发言 1允许 0禁止
     */
    private Byte isAllowspeak;

    /**
     * 明星成员 1是 0否
     */
    private Byte isStar;

    /**
     * 主题数
     */
    private Integer cmThcount;

    /**
     * 回复数
     */
    private Integer cmComcount;

    /**
     * 最后发言时间
     */
    private String cmLastspeaktime;

    /**
     * 是否推荐 1是 0否
     */
    private Byte isRecommend;

    /**
     * 部门id
     */
    private Integer deptId;

    /**
     * 企业给员工发送短信的状态（0未发送|1发送|2正在发送|默认为0）
     */
    private Byte sendmsgState;

    /**
     * 判断是否正在发送短信，0否|1是，默认0
     */
    private Byte issending;

    /**
     * 标识代码
     */
    private String code;

    /**
     * 员工号
     */
    private String empNo;

    /**
     * 是否是党员，0为不是，1为是
     */
    private String cmTag;

    /**
     * 一级分行标签
     */
    private String deptTag1;

    /**
     * 二级分行标签
     */
    private String deptTag2;

    /**
     * 三级分行标签
     */
    private String deptTag3;

    /**
     * 圈子名称
     * @return circle_name 圈子名称
     */
    public String getCircleName() {
        return circleName;
    }

    /**
     * 圈子名称
     * @param circleName 圈子名称
     */
    public void setCircleName(String circleName) {
        this.circleName = circleName == null ? null : circleName.trim();
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

    /**
     * 申请内容
     * @return cm_applycontent 申请内容
     */
    public String getCmApplycontent() {
        return cmApplycontent;
    }

    /**
     * 申请内容
     * @param cmApplycontent 申请内容
     */
    public void setCmApplycontent(String cmApplycontent) {
        this.cmApplycontent = cmApplycontent == null ? null : cmApplycontent.trim();
    }

    /**
     * 申请时间
     * @return cm_applytime 申请时间
     */
    public String getCmApplytime() {
        return cmApplytime;
    }

    /**
     * 申请时间
     * @param cmApplytime 申请时间
     */
    public void setCmApplytime(String cmApplytime) {
        this.cmApplytime = cmApplytime == null ? null : cmApplytime.trim();
    }

    /**
     * 状态 0申请中 1通过 2未通过
     * @return cm_state 状态 0申请中 1通过 2未通过
     */
    public Byte getCmState() {
        return cmState;
    }

    /**
     * 状态 0申请中 1通过 2未通过
     * @param cmState 状态 0申请中 1通过 2未通过
     */
    public void setCmState(Byte cmState) {
        this.cmState = cmState;
    }

    /**
     * 自我介绍
     * @return cm_intro 自我介绍
     */
    public String getCmIntro() {
        return cmIntro;
    }

    /**
     * 自我介绍
     * @param cmIntro 自我介绍
     */
    public void setCmIntro(String cmIntro) {
        this.cmIntro = cmIntro == null ? null : cmIntro.trim();
    }

    /**
     * 加入时间
     * @return cm_jointime 加入时间
     */
    public String getCmJointime() {
        return cmJointime;
    }

    /**
     * 加入时间
     * @param cmJointime 加入时间
     */
    public void setCmJointime(String cmJointime) {
        this.cmJointime = cmJointime == null ? null : cmJointime.trim();
    }

    /**
     * 成员级别
     * @return cm_level 成员级别
     */
    public Integer getCmLevel() {
        return cmLevel;
    }

    /**
     * 成员级别
     * @param cmLevel 成员级别
     */
    public void setCmLevel(Integer cmLevel) {
        this.cmLevel = cmLevel;
    }

    /**
     * 成员头衔
     * @return cm_levelname 成员头衔
     */
    public String getCmLevelname() {
        return cmLevelname;
    }

    /**
     * 成员头衔
     * @param cmLevelname 成员头衔
     */
    public void setCmLevelname(String cmLevelname) {
        this.cmLevelname = cmLevelname == null ? null : cmLevelname.trim();
    }

    /**
     * 会员经验
     * @return cm_exp 会员经验
     */
    public Integer getCmExp() {
        return cmExp;
    }

    /**
     * 会员经验
     * @param cmExp 会员经验
     */
    public void setCmExp(Integer cmExp) {
        this.cmExp = cmExp;
    }

    /**
     * 下一级所需经验
     * @return cm_nextexp 下一级所需经验
     */
    public Integer getCmNextexp() {
        return cmNextexp;
    }

    /**
     * 下一级所需经验
     * @param cmNextexp 下一级所需经验
     */
    public void setCmNextexp(Integer cmNextexp) {
        this.cmNextexp = cmNextexp;
    }

    /**
     * 1圈主 2管理 3成员
     * @return is_identity 1圈主 2管理 3成员
     */
    public Byte getIsIdentity() {
        return isIdentity;
    }

    /**
     * 1圈主 2管理 3成员
     * @param isIdentity 1圈主 2管理 3成员
     */
    public void setIsIdentity(Byte isIdentity) {
        this.isIdentity = isIdentity;
    }

    /**
     * 是否允许发言 1允许 0禁止
     * @return is_allowspeak 是否允许发言 1允许 0禁止
     */
    public Byte getIsAllowspeak() {
        return isAllowspeak;
    }

    /**
     * 是否允许发言 1允许 0禁止
     * @param isAllowspeak 是否允许发言 1允许 0禁止
     */
    public void setIsAllowspeak(Byte isAllowspeak) {
        this.isAllowspeak = isAllowspeak;
    }

    /**
     * 明星成员 1是 0否
     * @return is_star 明星成员 1是 0否
     */
    public Byte getIsStar() {
        return isStar;
    }

    /**
     * 明星成员 1是 0否
     * @param isStar 明星成员 1是 0否
     */
    public void setIsStar(Byte isStar) {
        this.isStar = isStar;
    }

    /**
     * 主题数
     * @return cm_thcount 主题数
     */
    public Integer getCmThcount() {
        return cmThcount;
    }

    /**
     * 主题数
     * @param cmThcount 主题数
     */
    public void setCmThcount(Integer cmThcount) {
        this.cmThcount = cmThcount;
    }

    /**
     * 回复数
     * @return cm_comcount 回复数
     */
    public Integer getCmComcount() {
        return cmComcount;
    }

    /**
     * 回复数
     * @param cmComcount 回复数
     */
    public void setCmComcount(Integer cmComcount) {
        this.cmComcount = cmComcount;
    }

    /**
     * 最后发言时间
     * @return cm_lastspeaktime 最后发言时间
     */
    public String getCmLastspeaktime() {
        return cmLastspeaktime;
    }

    /**
     * 最后发言时间
     * @param cmLastspeaktime 最后发言时间
     */
    public void setCmLastspeaktime(String cmLastspeaktime) {
        this.cmLastspeaktime = cmLastspeaktime == null ? null : cmLastspeaktime.trim();
    }

    /**
     * 是否推荐 1是 0否
     * @return is_recommend 是否推荐 1是 0否
     */
    public Byte getIsRecommend() {
        return isRecommend;
    }

    /**
     * 是否推荐 1是 0否
     * @param isRecommend 是否推荐 1是 0否
     */
    public void setIsRecommend(Byte isRecommend) {
        this.isRecommend = isRecommend;
    }

    /**
     * 部门id
     * @return dept_id 部门id
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * 部门id
     * @param deptId 部门id
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * 企业给员工发送短信的状态（0未发送|1发送|2正在发送|默认为0）
     * @return sendmsg_state 企业给员工发送短信的状态（0未发送|1发送|2正在发送|默认为0）
     */
    public Byte getSendmsgState() {
        return sendmsgState;
    }

    /**
     * 企业给员工发送短信的状态（0未发送|1发送|2正在发送|默认为0）
     * @param sendmsgState 企业给员工发送短信的状态（0未发送|1发送|2正在发送|默认为0）
     */
    public void setSendmsgState(Byte sendmsgState) {
        this.sendmsgState = sendmsgState;
    }

    /**
     * 判断是否正在发送短信，0否|1是，默认0
     * @return issending 判断是否正在发送短信，0否|1是，默认0
     */
    public Byte getIssending() {
        return issending;
    }

    /**
     * 判断是否正在发送短信，0否|1是，默认0
     * @param issending 判断是否正在发送短信，0否|1是，默认0
     */
    public void setIssending(Byte issending) {
        this.issending = issending;
    }

    /**
     * 标识代码
     * @return code 标识代码
     */
    public String getCode() {
        return code;
    }

    /**
     * 标识代码
     * @param code 标识代码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 员工号
     * @return emp_no 员工号
     */
    public String getEmpNo() {
        return empNo;
    }

    /**
     * 员工号
     * @param empNo 员工号
     */
    public void setEmpNo(String empNo) {
        this.empNo = empNo == null ? null : empNo.trim();
    }

    /**
     * 是否是党员，0为不是，1为是
     * @return cm_tag 是否是党员，0为不是，1为是
     */
    public String getCmTag() {
        return cmTag;
    }

    /**
     * 是否是党员，0为不是，1为是
     * @param cmTag 是否是党员，0为不是，1为是
     */
    public void setCmTag(String cmTag) {
        this.cmTag = cmTag == null ? null : cmTag.trim();
    }

    /**
     * 一级分行标签
     * @return dept_tag1 一级分行标签
     */
    public String getDeptTag1() {
        return deptTag1;
    }

    /**
     * 一级分行标签
     * @param deptTag1 一级分行标签
     */
    public void setDeptTag1(String deptTag1) {
        this.deptTag1 = deptTag1 == null ? null : deptTag1.trim();
    }

    /**
     * 二级分行标签
     * @return dept_tag2 二级分行标签
     */
    public String getDeptTag2() {
        return deptTag2;
    }

    /**
     * 二级分行标签
     * @param deptTag2 二级分行标签
     */
    public void setDeptTag2(String deptTag2) {
        this.deptTag2 = deptTag2 == null ? null : deptTag2.trim();
    }

    /**
     * 三级分行标签
     * @return dept_tag3 三级分行标签
     */
    public String getDeptTag3() {
        return deptTag3;
    }

    /**
     * 三级分行标签
     * @param deptTag3 三级分行标签
     */
    public void setDeptTag3(String deptTag3) {
        this.deptTag3 = deptTag3 == null ? null : deptTag3.trim();
    }

	@Override
	public String toString() {
		return "SyCircleMember [circleName=" + circleName + ", memberName=" + memberName + ", cmApplycontent="
				+ cmApplycontent + ", cmApplytime=" + cmApplytime + ", cmState=" + cmState + ", cmIntro=" + cmIntro
				+ ", cmJointime=" + cmJointime + ", cmLevel=" + cmLevel + ", cmLevelname=" + cmLevelname + ", cmExp="
				+ cmExp + ", cmNextexp=" + cmNextexp + ", isIdentity=" + isIdentity + ", isAllowspeak=" + isAllowspeak
				+ ", isStar=" + isStar + ", cmThcount=" + cmThcount + ", cmComcount=" + cmComcount
				+ ", cmLastspeaktime=" + cmLastspeaktime + ", isRecommend=" + isRecommend + ", deptId=" + deptId
				+ ", sendmsgState=" + sendmsgState + ", issending=" + issending + ", code=" + code + ", empNo=" + empNo
				+ ", cmTag=" + cmTag + ", deptTag1=" + deptTag1 + ", deptTag2=" + deptTag2 + ", deptTag3=" + deptTag3
				+ "]";
	}
    
}