package com.shanyuan.platform.ms.dao.user.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 描述:sy_member表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-10-16
 */
public class SyMember implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * 会员id
     */
    private Integer memberId;
    //新增
    private Integer storeId;

    /**
     * 善源id
     */
    private Integer syId;

    /**
     * 会员名称
     */
    private String memberName;

    /**
     * 会员显示名称
     */
    private String memberDispName;

    /**
     * 真实姓名
     */
    private String memberTruename;

    /**
     * 账户类型(1个人/2企业/3基金会/4基金会下属法人)
     */
    private Byte memberType;

    /**
     * 证件类型(0其他/1身份证/2营业执照/3组织代码机构)
     */
    private Byte memberIdType;

    /**
     * 证件号码
     */
    private String memberIdValue;

    /**
     * 上级基金会id
     */
    private Integer memberParentId;

    /**
     * 账户介绍
     */
    private String memberIntro;

    /**
     * 会员头像
     */
    private String memberAvatar;

    /**
     * 会员性别
     */
    private Byte memberSex;

    /**
     * 生日
     */
    private Date memberBirthday;

    /**
     * 会员密码
     */
    private String memberPasswd;

    /**
     * 会员手机
     */
    private String memberMobile;

    /**
     * 会员邮箱
     */
    private String memberEmail;

    /**
     * qq
     */
    private String memberQq;

    /**
     * 阿里旺旺
     */
    private String memberWw;

    /**
     * 登录次数
     */
    private Integer memberLoginNum;

    /**
     * 会员注册时间
     */
    private String memberTime;

    /**
     * 当前登录时间
     */
    private String memberLoginTime;

    /**
     * 上次登录时间
     */
    private String memberOldLoginTime;

    /**
     * 当前登录ip
     */
    private String memberLoginIp;

    /**
     * 上次登录ip
     */
    private String memberOldLoginIp;

    /**
     * qq互联id
     */
    private String memberQqopenid;

    /**
     * 新浪微博登录id
     */
    private String memberSinaopenid;

    /**
     * 会员积分
     */
    private Integer memberPoints;

    /**
     * 预存款可用金额
     */
    private BigDecimal availablePredeposit;

    /**
     * 可用奖励金总额
     */
    private BigDecimal availableGiftdeposit;

    /**
     * 预存款冻结金额
     */
    private BigDecimal freezePredeposit;

    /**
     * 是否允许举报(1可以/2不可以)
     */
    private Byte informAllow;

    /**
     * 会员是否有购买权限 1为开启 0为关闭
     */
    private Byte isBuy;

    /**
     * 会员是否有咨询和发送站内信的权限 1为开启 0为关闭
     */
    private Byte isAllowtalk;

    /**
     * 会员的开启状态 1为开启 0为关闭
     */
    private Byte memberState;

    /**
     * 会员信用
     */
    private Integer memberCredit;

    /**
     * sns空间访问次数
     */
    private Integer memberSnsvisitnum;

    /**
     * 地区ID
     */
    private Integer memberAreaid;

    /**
     * 城市ID
     */
    private Integer memberCityid;

    /**
     * 省份ID
     */
    private Integer memberProvinceid;

    /**
     * 地区内容
     */
    private String memberAreainfo;

    /**
     * 证件电子版
     */
    private String memberIdImage;

    /**
     * 审核意见
     */
    private String memberAuthenticationComment;

    /**
     * 贡献善源数
     */
    private Integer memberContributeSyNum;

    /**
     * 使用善源数
     */
    private Integer memberUsedSyNum;

    /**
     * 捐款总金额
     */
    private BigDecimal memberContributeMoney;

    /**
     * 显示捐物协议
     */
    private Byte showGoodsDonationAgreement;

    /**
     * 微信互联id
     */
    private String memberWxopenid;

    /**
     * 总公益币
     */
    private Long syPoints;

    /**
     * 已捐公益币
     */
    private Long syPointsUsed;

    /**
     * 额外抽奖次数
     */
    private Integer extraLuckyDrawNum;

    /**
     * 已抽奖次数
     */
    private Integer luckyDrawNumUsed;

    /**
     * 行业分类ID
     */
    private Integer memberIcId;

    /**
     * 会员链接
     */
    private String memberUrl;

    /**
     * 家庭圈子id
     */
    private Integer memberFamilyId;

    /**
     * 籍贯
     */
    private String nativePlace;

    /**
     * 用户头衔
     */
    private Integer cmLevel;

    /**
     * 中元
     */
    private Long bocPoints;

    /**
     * 已使用积分
     */
    private Long bocPointsUsed;

    /**
     * 中元积分总排名
     */
    private Integer bocPointsRank;

    /**
     * 中元积分部门内排名
     */
    private Integer bocPointsDeptRank;

    /**
     * 用户级别（中行）1.为热心参与;2.为乐于助人;3.为大爱无疆
     */
    private Integer bocLevel;

    /**
     * 公益头衔变更时间
     */
    private String bocLevelTime;

    /**
     * 证件电子版背面
     */
    private String memberIdBackImage;

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

    
    public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	/**
     * 善源id
     * @return sy_id 善源id
     */
    public Integer getSyId() {
        return syId;
    }

    /**
     * 善源id
     * @param syId 善源id
     */
    public void setSyId(Integer syId) {
        this.syId = syId;
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
     * 真实姓名
     * @return member_truename 真实姓名
     */
    public String getMemberTruename() {
        return memberTruename;
    }

    /**
     * 真实姓名
     * @param memberTruename 真实姓名
     */
    public void setMemberTruename(String memberTruename) {
        this.memberTruename = memberTruename == null ? null : memberTruename.trim();
    }

    /**
     * 账户类型(1个人/2企业/3基金会/4基金会下属法人)
     * @return member_type 账户类型(1个人/2企业/3基金会/4基金会下属法人)
     */
    public Byte getMemberType() {
        return memberType;
    }

    /**
     * 账户类型(1个人/2企业/3基金会/4基金会下属法人)
     * @param memberType 账户类型(1个人/2企业/3基金会/4基金会下属法人)
     */
    public void setMemberType(Byte memberType) {
        this.memberType = memberType;
    }

    /**
     * 证件类型(0其他/1身份证/2营业执照/3组织代码机构)
     * @return member_id_type 证件类型(0其他/1身份证/2营业执照/3组织代码机构)
     */
    public Byte getMemberIdType() {
        return memberIdType;
    }

    /**
     * 证件类型(0其他/1身份证/2营业执照/3组织代码机构)
     * @param memberIdType 证件类型(0其他/1身份证/2营业执照/3组织代码机构)
     */
    public void setMemberIdType(Byte memberIdType) {
        this.memberIdType = memberIdType;
    }

    /**
     * 证件号码
     * @return member_id_value 证件号码
     */
    public String getMemberIdValue() {
        return memberIdValue;
    }

    /**
     * 证件号码
     * @param memberIdValue 证件号码
     */
    public void setMemberIdValue(String memberIdValue) {
        this.memberIdValue = memberIdValue == null ? null : memberIdValue.trim();
    }

    /**
     * 上级基金会id
     * @return member_parent_id 上级基金会id
     */
    public Integer getMemberParentId() {
        return memberParentId;
    }

    /**
     * 上级基金会id
     * @param memberParentId 上级基金会id
     */
    public void setMemberParentId(Integer memberParentId) {
        this.memberParentId = memberParentId;
    }

    /**
     * 账户介绍
     * @return member_intro 账户介绍
     */
    public String getMemberIntro() {
        return memberIntro;
    }

    /**
     * 账户介绍
     * @param memberIntro 账户介绍
     */
    public void setMemberIntro(String memberIntro) {
        this.memberIntro = memberIntro == null ? null : memberIntro.trim();
    }

    /**
     * 会员头像
     * @return member_avatar 会员头像
     */
    public String getMemberAvatar() {
        return memberAvatar;
    }

    /**
     * 会员头像
     * @param memberAvatar 会员头像
     */
    public void setMemberAvatar(String memberAvatar) {
        this.memberAvatar = memberAvatar == null ? null : memberAvatar.trim();
    }

    /**
     * 会员性别
     * @return member_sex 会员性别
     */
    public Byte getMemberSex() {
        return memberSex;
    }

    /**
     * 会员性别
     * @param memberSex 会员性别
     */
    public void setMemberSex(Byte memberSex) {
        this.memberSex = memberSex;
    }

    /**
     * 生日
     * @return member_birthday 生日
     */
    public Date getMemberBirthday() {
        return memberBirthday;
    }

    /**
     * 生日
     * @param memberBirthday 生日
     */
    public void setMemberBirthday(Date memberBirthday) {
        this.memberBirthday = memberBirthday;
    }

    /**
     * 会员密码
     * @return member_passwd 会员密码
     */
    public String getMemberPasswd() {
        return memberPasswd;
    }

    /**
     * 会员密码
     * @param memberPasswd 会员密码
     */
    public void setMemberPasswd(String memberPasswd) {
        this.memberPasswd = memberPasswd == null ? null : memberPasswd.trim();
    }

    /**
     * 会员手机
     * @return member_mobile 会员手机
     */
    public String getMemberMobile() {
        return memberMobile;
    }

    /**
     * 会员手机
     * @param memberMobile 会员手机
     */
    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile == null ? null : memberMobile.trim();
    }

    /**
     * 会员邮箱
     * @return member_email 会员邮箱
     */
    public String getMemberEmail() {
        return memberEmail;
    }

    /**
     * 会员邮箱
     * @param memberEmail 会员邮箱
     */
    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail == null ? null : memberEmail.trim();
    }

    /**
     * qq
     * @return member_qq qq
     */
    public String getMemberQq() {
        return memberQq;
    }

    /**
     * qq
     * @param memberQq qq
     */
    public void setMemberQq(String memberQq) {
        this.memberQq = memberQq == null ? null : memberQq.trim();
    }

    /**
     * 阿里旺旺
     * @return member_ww 阿里旺旺
     */
    public String getMemberWw() {
        return memberWw;
    }

    /**
     * 阿里旺旺
     * @param memberWw 阿里旺旺
     */
    public void setMemberWw(String memberWw) {
        this.memberWw = memberWw == null ? null : memberWw.trim();
    }

    /**
     * 登录次数
     * @return member_login_num 登录次数
     */
    public Integer getMemberLoginNum() {
        return memberLoginNum;
    }

    /**
     * 登录次数
     * @param memberLoginNum 登录次数
     */
    public void setMemberLoginNum(Integer memberLoginNum) {
        this.memberLoginNum = memberLoginNum;
    }

    /**
     * 会员注册时间
     * @return member_time 会员注册时间
     */
    public String getMemberTime() {
        return memberTime;
    }

    /**
     * 会员注册时间
     * @param memberTime 会员注册时间
     */
    public void setMemberTime(String memberTime) {
        this.memberTime = memberTime == null ? null : memberTime.trim();
    }

    /**
     * 当前登录时间
     * @return member_login_time 当前登录时间
     */
    public String getMemberLoginTime() {
        return memberLoginTime;
    }

    /**
     * 当前登录时间
     * @param memberLoginTime 当前登录时间
     */
    public void setMemberLoginTime(String memberLoginTime) {
        this.memberLoginTime = memberLoginTime == null ? null : memberLoginTime.trim();
    }

    /**
     * 上次登录时间
     * @return member_old_login_time 上次登录时间
     */
    public String getMemberOldLoginTime() {
        return memberOldLoginTime;
    }

    /**
     * 上次登录时间
     * @param memberOldLoginTime 上次登录时间
     */
    public void setMemberOldLoginTime(String memberOldLoginTime) {
        this.memberOldLoginTime = memberOldLoginTime == null ? null : memberOldLoginTime.trim();
    }

    /**
     * 当前登录ip
     * @return member_login_ip 当前登录ip
     */
    public String getMemberLoginIp() {
        return memberLoginIp;
    }

    /**
     * 当前登录ip
     * @param memberLoginIp 当前登录ip
     */
    public void setMemberLoginIp(String memberLoginIp) {
        this.memberLoginIp = memberLoginIp == null ? null : memberLoginIp.trim();
    }

    /**
     * 上次登录ip
     * @return member_old_login_ip 上次登录ip
     */
    public String getMemberOldLoginIp() {
        return memberOldLoginIp;
    }

    /**
     * 上次登录ip
     * @param memberOldLoginIp 上次登录ip
     */
    public void setMemberOldLoginIp(String memberOldLoginIp) {
        this.memberOldLoginIp = memberOldLoginIp == null ? null : memberOldLoginIp.trim();
    }

    /**
     * qq互联id
     * @return member_qqopenid qq互联id
     */
    public String getMemberQqopenid() {
        return memberQqopenid;
    }

    /**
     * qq互联id
     * @param memberQqopenid qq互联id
     */
    public void setMemberQqopenid(String memberQqopenid) {
        this.memberQqopenid = memberQqopenid == null ? null : memberQqopenid.trim();
    }

    /**
     * 新浪微博登录id
     * @return member_sinaopenid 新浪微博登录id
     */
    public String getMemberSinaopenid() {
        return memberSinaopenid;
    }

    /**
     * 新浪微博登录id
     * @param memberSinaopenid 新浪微博登录id
     */
    public void setMemberSinaopenid(String memberSinaopenid) {
        this.memberSinaopenid = memberSinaopenid == null ? null : memberSinaopenid.trim();
    }

    /**
     * 会员积分
     * @return member_points 会员积分
     */
    public Integer getMemberPoints() {
        return memberPoints;
    }

    /**
     * 会员积分
     * @param memberPoints 会员积分
     */
    public void setMemberPoints(Integer memberPoints) {
        this.memberPoints = memberPoints;
    }

    /**
     * 预存款可用金额
     * @return available_predeposit 预存款可用金额
     */
    public BigDecimal getAvailablePredeposit() {
        return availablePredeposit;
    }

    /**
     * 预存款可用金额
     * @param availablePredeposit 预存款可用金额
     */
    public void setAvailablePredeposit(BigDecimal availablePredeposit) {
        this.availablePredeposit = availablePredeposit;
    }

    /**
     * 可用奖励金总额
     * @return available_giftdeposit 可用奖励金总额
     */
    public BigDecimal getAvailableGiftdeposit() {
        return availableGiftdeposit;
    }

    /**
     * 可用奖励金总额
     * @param availableGiftdeposit 可用奖励金总额
     */
    public void setAvailableGiftdeposit(BigDecimal availableGiftdeposit) {
        this.availableGiftdeposit = availableGiftdeposit;
    }

    /**
     * 预存款冻结金额
     * @return freeze_predeposit 预存款冻结金额
     */
    public BigDecimal getFreezePredeposit() {
        return freezePredeposit;
    }

    /**
     * 预存款冻结金额
     * @param freezePredeposit 预存款冻结金额
     */
    public void setFreezePredeposit(BigDecimal freezePredeposit) {
        this.freezePredeposit = freezePredeposit;
    }

    /**
     * 是否允许举报(1可以/2不可以)
     * @return inform_allow 是否允许举报(1可以/2不可以)
     */
    public Byte getInformAllow() {
        return informAllow;
    }

    /**
     * 是否允许举报(1可以/2不可以)
     * @param informAllow 是否允许举报(1可以/2不可以)
     */
    public void setInformAllow(Byte informAllow) {
        this.informAllow = informAllow;
    }

    /**
     * 会员是否有购买权限 1为开启 0为关闭
     * @return is_buy 会员是否有购买权限 1为开启 0为关闭
     */
    public Byte getIsBuy() {
        return isBuy;
    }

    /**
     * 会员是否有购买权限 1为开启 0为关闭
     * @param isBuy 会员是否有购买权限 1为开启 0为关闭
     */
    public void setIsBuy(Byte isBuy) {
        this.isBuy = isBuy;
    }

    /**
     * 会员是否有咨询和发送站内信的权限 1为开启 0为关闭
     * @return is_allowtalk 会员是否有咨询和发送站内信的权限 1为开启 0为关闭
     */
    public Byte getIsAllowtalk() {
        return isAllowtalk;
    }

    /**
     * 会员是否有咨询和发送站内信的权限 1为开启 0为关闭
     * @param isAllowtalk 会员是否有咨询和发送站内信的权限 1为开启 0为关闭
     */
    public void setIsAllowtalk(Byte isAllowtalk) {
        this.isAllowtalk = isAllowtalk;
    }

    /**
     * 会员的开启状态 1为开启 0为关闭
     * @return member_state 会员的开启状态 1为开启 0为关闭
     */
    public Byte getMemberState() {
        return memberState;
    }

    /**
     * 会员的开启状态 1为开启 0为关闭
     * @param memberState 会员的开启状态 1为开启 0为关闭
     */
    public void setMemberState(Byte memberState) {
        this.memberState = memberState;
    }

    /**
     * 会员信用
     * @return member_credit 会员信用
     */
    public Integer getMemberCredit() {
        return memberCredit;
    }

    /**
     * 会员信用
     * @param memberCredit 会员信用
     */
    public void setMemberCredit(Integer memberCredit) {
        this.memberCredit = memberCredit;
    }

    /**
     * sns空间访问次数
     * @return member_snsvisitnum sns空间访问次数
     */
    public Integer getMemberSnsvisitnum() {
        return memberSnsvisitnum;
    }

    /**
     * sns空间访问次数
     * @param memberSnsvisitnum sns空间访问次数
     */
    public void setMemberSnsvisitnum(Integer memberSnsvisitnum) {
        this.memberSnsvisitnum = memberSnsvisitnum;
    }

    /**
     * 地区ID
     * @return member_areaid 地区ID
     */
    public Integer getMemberAreaid() {
        return memberAreaid;
    }

    /**
     * 地区ID
     * @param memberAreaid 地区ID
     */
    public void setMemberAreaid(Integer memberAreaid) {
        this.memberAreaid = memberAreaid;
    }

    /**
     * 城市ID
     * @return member_cityid 城市ID
     */
    public Integer getMemberCityid() {
        return memberCityid;
    }

    /**
     * 城市ID
     * @param memberCityid 城市ID
     */
    public void setMemberCityid(Integer memberCityid) {
        this.memberCityid = memberCityid;
    }

    /**
     * 省份ID
     * @return member_provinceid 省份ID
     */
    public Integer getMemberProvinceid() {
        return memberProvinceid;
    }

    /**
     * 省份ID
     * @param memberProvinceid 省份ID
     */
    public void setMemberProvinceid(Integer memberProvinceid) {
        this.memberProvinceid = memberProvinceid;
    }

    /**
     * 地区内容
     * @return member_areainfo 地区内容
     */
    public String getMemberAreainfo() {
        return memberAreainfo;
    }

    /**
     * 地区内容
     * @param memberAreainfo 地区内容
     */
    public void setMemberAreainfo(String memberAreainfo) {
        this.memberAreainfo = memberAreainfo == null ? null : memberAreainfo.trim();
    }

    /**
     * 证件电子版
     * @return member_id_image 证件电子版
     */
    public String getMemberIdImage() {
        return memberIdImage;
    }

    /**
     * 证件电子版
     * @param memberIdImage 证件电子版
     */
    public void setMemberIdImage(String memberIdImage) {
        this.memberIdImage = memberIdImage == null ? null : memberIdImage.trim();
    }

    /**
     * 审核意见
     * @return member_authentication_comment 审核意见
     */
    public String getMemberAuthenticationComment() {
        return memberAuthenticationComment;
    }

    /**
     * 审核意见
     * @param memberAuthenticationComment 审核意见
     */
    public void setMemberAuthenticationComment(String memberAuthenticationComment) {
        this.memberAuthenticationComment = memberAuthenticationComment == null ? null : memberAuthenticationComment.trim();
    }

    /**
     * 贡献善源数
     * @return member_contribute_sy_num 贡献善源数
     */
    public Integer getMemberContributeSyNum() {
        return memberContributeSyNum;
    }

    /**
     * 贡献善源数
     * @param memberContributeSyNum 贡献善源数
     */
    public void setMemberContributeSyNum(Integer memberContributeSyNum) {
        this.memberContributeSyNum = memberContributeSyNum;
    }

    /**
     * 使用善源数
     * @return member_used_sy_num 使用善源数
     */
    public Integer getMemberUsedSyNum() {
        return memberUsedSyNum;
    }

    /**
     * 使用善源数
     * @param memberUsedSyNum 使用善源数
     */
    public void setMemberUsedSyNum(Integer memberUsedSyNum) {
        this.memberUsedSyNum = memberUsedSyNum;
    }

    /**
     * 捐款总金额
     * @return member_contribute_money 捐款总金额
     */
    public BigDecimal getMemberContributeMoney() {
        return memberContributeMoney;
    }

    /**
     * 捐款总金额
     * @param memberContributeMoney 捐款总金额
     */
    public void setMemberContributeMoney(BigDecimal memberContributeMoney) {
        this.memberContributeMoney = memberContributeMoney;
    }

    /**
     * 显示捐物协议
     * @return show_goods_donation_agreement 显示捐物协议
     */
    public Byte getShowGoodsDonationAgreement() {
        return showGoodsDonationAgreement;
    }

    /**
     * 显示捐物协议
     * @param showGoodsDonationAgreement 显示捐物协议
     */
    public void setShowGoodsDonationAgreement(Byte showGoodsDonationAgreement) {
        this.showGoodsDonationAgreement = showGoodsDonationAgreement;
    }

    /**
     * 微信互联id
     * @return member_wxopenid 微信互联id
     */
    public String getMemberWxopenid() {
        return memberWxopenid;
    }

    /**
     * 微信互联id
     * @param memberWxopenid 微信互联id
     */
    public void setMemberWxopenid(String memberWxopenid) {
        this.memberWxopenid = memberWxopenid == null ? null : memberWxopenid.trim();
    }

    /**
     * 总公益币
     * @return sy_points 总公益币
     */
    public Long getSyPoints() {
        return syPoints;
    }

    /**
     * 总公益币
     * @param syPoints 总公益币
     */
    public void setSyPoints(Long syPoints) {
        this.syPoints = syPoints;
    }

    /**
     * 已捐公益币
     * @return sy_points_used 已捐公益币
     */
    public Long getSyPointsUsed() {
        return syPointsUsed;
    }

    /**
     * 已捐公益币
     * @param syPointsUsed 已捐公益币
     */
    public void setSyPointsUsed(Long syPointsUsed) {
        this.syPointsUsed = syPointsUsed;
    }

    /**
     * 额外抽奖次数
     * @return extra_lucky_draw_num 额外抽奖次数
     */
    public Integer getExtraLuckyDrawNum() {
        return extraLuckyDrawNum;
    }

    /**
     * 额外抽奖次数
     * @param extraLuckyDrawNum 额外抽奖次数
     */
    public void setExtraLuckyDrawNum(Integer extraLuckyDrawNum) {
        this.extraLuckyDrawNum = extraLuckyDrawNum;
    }

    /**
     * 已抽奖次数
     * @return lucky_draw_num_used 已抽奖次数
     */
    public Integer getLuckyDrawNumUsed() {
        return luckyDrawNumUsed;
    }

    /**
     * 已抽奖次数
     * @param luckyDrawNumUsed 已抽奖次数
     */
    public void setLuckyDrawNumUsed(Integer luckyDrawNumUsed) {
        this.luckyDrawNumUsed = luckyDrawNumUsed;
    }

    /**
     * 行业分类ID
     * @return member_ic_id 行业分类ID
     */
    public Integer getMemberIcId() {
        return memberIcId;
    }

    /**
     * 行业分类ID
     * @param memberIcId 行业分类ID
     */
    public void setMemberIcId(Integer memberIcId) {
        this.memberIcId = memberIcId;
    }

    /**
     * 会员链接
     * @return member_url 会员链接
     */
    public String getMemberUrl() {
        return memberUrl;
    }

    /**
     * 会员链接
     * @param memberUrl 会员链接
     */
    public void setMemberUrl(String memberUrl) {
        this.memberUrl = memberUrl == null ? null : memberUrl.trim();
    }

    /**
     * 家庭圈子id
     * @return member_family_id 家庭圈子id
     */
    public Integer getMemberFamilyId() {
        return memberFamilyId;
    }

    /**
     * 家庭圈子id
     * @param memberFamilyId 家庭圈子id
     */
    public void setMemberFamilyId(Integer memberFamilyId) {
        this.memberFamilyId = memberFamilyId;
    }

    /**
     * 籍贯
     * @return native_place 籍贯
     */
    public String getNativePlace() {
        return nativePlace;
    }

    /**
     * 籍贯
     * @param nativePlace 籍贯
     */
    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace == null ? null : nativePlace.trim();
    }

    /**
     * 用户头衔
     * @return cm_level 用户头衔
     */
    public Integer getCmLevel() {
        return cmLevel;
    }

    /**
     * 用户头衔
     * @param cmLevel 用户头衔
     */
    public void setCmLevel(Integer cmLevel) {
        this.cmLevel = cmLevel;
    }

    /**
     * 中元
     * @return boc_points 中元
     */
    public Long getBocPoints() {
        return bocPoints;
    }

    /**
     * 中元
     * @param bocPoints 中元
     */
    public void setBocPoints(Long bocPoints) {
        this.bocPoints = bocPoints;
    }

    /**
     * 已使用积分
     * @return boc_points_used 已使用积分
     */
    public Long getBocPointsUsed() {
        return bocPointsUsed;
    }

    /**
     * 已使用积分
     * @param bocPointsUsed 已使用积分
     */
    public void setBocPointsUsed(Long bocPointsUsed) {
        this.bocPointsUsed = bocPointsUsed;
    }

    /**
     * 中元积分总排名
     * @return boc_points_rank 中元积分总排名
     */
    public Integer getBocPointsRank() {
        return bocPointsRank;
    }

    /**
     * 中元积分总排名
     * @param bocPointsRank 中元积分总排名
     */
    public void setBocPointsRank(Integer bocPointsRank) {
        this.bocPointsRank = bocPointsRank;
    }

    /**
     * 中元积分部门内排名
     * @return boc_points_dept_rank 中元积分部门内排名
     */
    public Integer getBocPointsDeptRank() {
        return bocPointsDeptRank;
    }

    /**
     * 中元积分部门内排名
     * @param bocPointsDeptRank 中元积分部门内排名
     */
    public void setBocPointsDeptRank(Integer bocPointsDeptRank) {
        this.bocPointsDeptRank = bocPointsDeptRank;
    }

    /**
     * 用户级别（中行）1.为热心参与;2.为乐于助人;3.为大爱无疆
     * @return boc_level 用户级别（中行）1.为热心参与;2.为乐于助人;3.为大爱无疆
     */
    public Integer getBocLevel() {
        return bocLevel;
    }

    /**
     * 用户级别（中行）1.为热心参与;2.为乐于助人;3.为大爱无疆
     * @param bocLevel 用户级别（中行）1.为热心参与;2.为乐于助人;3.为大爱无疆
     */
    public void setBocLevel(Integer bocLevel) {
        this.bocLevel = bocLevel;
    }

    /**
     * 公益头衔变更时间
     * @return boc_level_time 公益头衔变更时间
     */
    public String getBocLevelTime() {
        return bocLevelTime;
    }

    /**
     * 公益头衔变更时间
     * @param bocLevelTime 公益头衔变更时间
     */
    public void setBocLevelTime(String bocLevelTime) {
        this.bocLevelTime = bocLevelTime == null ? null : bocLevelTime.trim();
    }

    /**
     * 证件电子版背面
     * @return member_id_back_image 证件电子版背面
     */
    public String getMemberIdBackImage() {
        return memberIdBackImage;
    }

    /**
     * 证件电子版背面
     * @param memberIdBackImage 证件电子版背面
     */
    public void setMemberIdBackImage(String memberIdBackImage) {
        this.memberIdBackImage = memberIdBackImage == null ? null : memberIdBackImage.trim();
    }

	@Override
	public String toString() {
		return "SyMember [memberId=" + memberId + ", syId=" + syId + ", memberName=" + memberName + ", memberDispName="
				+ memberDispName + ", memberTruename=" + memberTruename + ", memberType=" + memberType
				+ ", memberIdType=" + memberIdType + ", memberIdValue=" + memberIdValue + ", memberParentId="
				+ memberParentId + ", memberIntro=" + memberIntro + ", memberAvatar=" + memberAvatar + ", memberSex="
				+ memberSex + ", memberBirthday=" + memberBirthday + ", memberPasswd=" + memberPasswd
				+ ", memberMobile=" + memberMobile + ", memberEmail=" + memberEmail + ", memberQq=" + memberQq
				+ ", memberWw=" + memberWw + ", memberLoginNum=" + memberLoginNum + ", memberTime=" + memberTime
				+ ", memberLoginTime=" + memberLoginTime + ", memberOldLoginTime=" + memberOldLoginTime
				+ ", memberLoginIp=" + memberLoginIp + ", memberOldLoginIp=" + memberOldLoginIp + ", memberQqopenid="
				+ memberQqopenid + ", memberSinaopenid=" + memberSinaopenid + ", memberPoints=" + memberPoints
				+ ", availablePredeposit=" + availablePredeposit + ", availableGiftdeposit=" + availableGiftdeposit
				+ ", freezePredeposit=" + freezePredeposit + ", informAllow=" + informAllow + ", isBuy=" + isBuy
				+ ", isAllowtalk=" + isAllowtalk + ", memberState=" + memberState + ", memberCredit=" + memberCredit
				+ ", memberSnsvisitnum=" + memberSnsvisitnum + ", memberAreaid=" + memberAreaid + ", memberCityid="
				+ memberCityid + ", memberProvinceid=" + memberProvinceid + ", memberAreainfo=" + memberAreainfo
				+ ", memberIdImage=" + memberIdImage + ", memberAuthenticationComment=" + memberAuthenticationComment
				+ ", memberContributeSyNum=" + memberContributeSyNum + ", memberUsedSyNum=" + memberUsedSyNum
				+ ", memberContributeMoney=" + memberContributeMoney + ", showGoodsDonationAgreement="
				+ showGoodsDonationAgreement + ", memberWxopenid=" + memberWxopenid + ", syPoints=" + syPoints
				+ ", syPointsUsed=" + syPointsUsed + ", extraLuckyDrawNum=" + extraLuckyDrawNum + ", luckyDrawNumUsed="
				+ luckyDrawNumUsed + ", memberIcId=" + memberIcId + ", memberUrl=" + memberUrl + ", memberFamilyId="
				+ memberFamilyId + ", nativePlace=" + nativePlace + ", cmLevel=" + cmLevel + ", bocPoints=" + bocPoints
				+ ", bocPointsUsed=" + bocPointsUsed + ", bocPointsRank=" + bocPointsRank + ", bocPointsDeptRank="
				+ bocPointsDeptRank + ", bocLevel=" + bocLevel + ", bocLevelTime=" + bocLevelTime
				+ ", memberIdBackImage=" + memberIdBackImage + "]";
	}
    
    
}