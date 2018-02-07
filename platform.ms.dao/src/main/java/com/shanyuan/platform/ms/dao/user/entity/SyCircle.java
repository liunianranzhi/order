package com.shanyuan.platform.ms.dao.user.entity;

/**
 * 描述:sy_circle表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-11-08
 */
public class SyCircle {
    /**
     * 圈子id
     */
    private Integer circleId;

    /**
     * 圈子名称
     */
    private String circleName;

    /**
     * 上级部门
     */
    private String parentCircleName;

    /**
     * 所属单位名称
     */
    private String orgName;

    /**
     * 圈子描述
     */
    private String circleDesc;

    /**
     * 圈主id
     */
    private Integer circleMasterid;

    /**
     * 圈主名称
     */
    private String circleMastername;

    /**
     * 圈子图片
     */
    private String circleImg;

    /**
     * 圈子分类
     */
    private Integer classId;

    /**
     * 圈子成员数
     */
    private Integer circleMcount;

    /**
     * 圈子主题数
     */
    private Integer circleThcount;

    /**
     * 圈子商品数
     */
    private Integer circleGcount;

    /**
     * 圈子申请理由
     */
    private String circlePursuereason;

    /**
     * 圈子公告
     */
    private String circleNotice;

    /**
     * 圈子状态，0关闭，1开启，2审核中，3审核失败
     */
    private Byte circleStatus;

    /**
     * 关闭或审核失败原因
     */
    private String circleStatusinfo;

    /**
     * 加入圈子时候需要审核，0不需要，1需要
     */
    private Byte circleJoinaudit;

    /**
     * 圈子创建时间
     */
    private String circleAddtime;

    /**
     * 圈子公告更新时间
     */
    private String circleNoticetime;

    /**
     * 是否推荐 0未推荐，1已推荐
     */
    private Byte isRecommend;

    /**
     * 是否为热门圈子 1是 0否
     */
    private Byte isHot;

    /**
     * 圈子标签
     */
    private String circleTag;

    /**
     * 等待审核成员数
     */
    private Integer newVerifycount;

    /**
     * 等待处理举报数
     */
    private Integer newInformcount;

    /**
     * 申请管理是否开启 0关闭，1开启
     */
    private Byte mapplyOpen;

    /**
     * 成员级别
     */
    private Byte mapplyMl;

    /**
     * 管理申请数量
     */
    private Integer newMapplycount;

    /**
     * 1企业，2家庭，3部门
     */
    private Byte circleType;

    /**
     * 所属圈子id
     */
    private Integer parentCircleId;

    /**
     * 标识代码
     */
    private String code;

    /**
     * 负责人的编号
     */
    private Integer respId;

    /**
     * 负责人姓名
     */
    private String respName;

    /**
     * 负责人电话
     */
    private String respMobile;

    /**
     * 扶贫联盟排序
     */
    private Integer bocSort;

    /**
     * 部门级别:1:一级分行,2:二级分行,3:三级分行
     */
    private Byte deptLevel;

    /**
     * 党组织/团组织对应的部门circle_id
     */
    private Integer orgCircleId;

    /**
     * 渠道标识,默认空
     */
    private String channel;

    /**
     * 是否有子部门（0、没有[默认] 1、有）
     */
    private Byte hasChildFlag;

    /**
     * 部门人数(仅子部门)
     */
    private Integer staffsAmount;

    /**
     * 圈子id
     * @return circle_id 圈子id
     */
    public Integer getCircleId() {
        return circleId;
    }

    /**
     * 圈子id
     * @param circleId 圈子id
     */
    public void setCircleId(Integer circleId) {
        this.circleId = circleId;
    }

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
     * 上级部门
     * @return parent_circle_name 上级部门
     */
    public String getParentCircleName() {
        return parentCircleName;
    }

    /**
     * 上级部门
     * @param parentCircleName 上级部门
     */
    public void setParentCircleName(String parentCircleName) {
        this.parentCircleName = parentCircleName == null ? null : parentCircleName.trim();
    }

    /**
     * 所属单位名称
     * @return org_name 所属单位名称
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * 所属单位名称
     * @param orgName 所属单位名称
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    /**
     * 圈子描述
     * @return circle_desc 圈子描述
     */
    public String getCircleDesc() {
        return circleDesc;
    }

    /**
     * 圈子描述
     * @param circleDesc 圈子描述
     */
    public void setCircleDesc(String circleDesc) {
        this.circleDesc = circleDesc == null ? null : circleDesc.trim();
    }

    /**
     * 圈主id
     * @return circle_masterid 圈主id
     */
    public Integer getCircleMasterid() {
        return circleMasterid;
    }

    /**
     * 圈主id
     * @param circleMasterid 圈主id
     */
    public void setCircleMasterid(Integer circleMasterid) {
        this.circleMasterid = circleMasterid;
    }

    /**
     * 圈主名称
     * @return circle_mastername 圈主名称
     */
    public String getCircleMastername() {
        return circleMastername;
    }

    /**
     * 圈主名称
     * @param circleMastername 圈主名称
     */
    public void setCircleMastername(String circleMastername) {
        this.circleMastername = circleMastername == null ? null : circleMastername.trim();
    }

    /**
     * 圈子图片
     * @return circle_img 圈子图片
     */
    public String getCircleImg() {
        return circleImg;
    }

    /**
     * 圈子图片
     * @param circleImg 圈子图片
     */
    public void setCircleImg(String circleImg) {
        this.circleImg = circleImg == null ? null : circleImg.trim();
    }

    /**
     * 圈子分类
     * @return class_id 圈子分类
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * 圈子分类
     * @param classId 圈子分类
     */
    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    /**
     * 圈子成员数
     * @return circle_mcount 圈子成员数
     */
    public Integer getCircleMcount() {
        return circleMcount;
    }

    /**
     * 圈子成员数
     * @param circleMcount 圈子成员数
     */
    public void setCircleMcount(Integer circleMcount) {
        this.circleMcount = circleMcount;
    }

    /**
     * 圈子主题数
     * @return circle_thcount 圈子主题数
     */
    public Integer getCircleThcount() {
        return circleThcount;
    }

    /**
     * 圈子主题数
     * @param circleThcount 圈子主题数
     */
    public void setCircleThcount(Integer circleThcount) {
        this.circleThcount = circleThcount;
    }

    /**
     * 圈子商品数
     * @return circle_gcount 圈子商品数
     */
    public Integer getCircleGcount() {
        return circleGcount;
    }

    /**
     * 圈子商品数
     * @param circleGcount 圈子商品数
     */
    public void setCircleGcount(Integer circleGcount) {
        this.circleGcount = circleGcount;
    }

    /**
     * 圈子申请理由
     * @return circle_pursuereason 圈子申请理由
     */
    public String getCirclePursuereason() {
        return circlePursuereason;
    }

    /**
     * 圈子申请理由
     * @param circlePursuereason 圈子申请理由
     */
    public void setCirclePursuereason(String circlePursuereason) {
        this.circlePursuereason = circlePursuereason == null ? null : circlePursuereason.trim();
    }

    /**
     * 圈子公告
     * @return circle_notice 圈子公告
     */
    public String getCircleNotice() {
        return circleNotice;
    }

    /**
     * 圈子公告
     * @param circleNotice 圈子公告
     */
    public void setCircleNotice(String circleNotice) {
        this.circleNotice = circleNotice == null ? null : circleNotice.trim();
    }

    /**
     * 圈子状态，0关闭，1开启，2审核中，3审核失败
     * @return circle_status 圈子状态，0关闭，1开启，2审核中，3审核失败
     */
    public Byte getCircleStatus() {
        return circleStatus;
    }

    /**
     * 圈子状态，0关闭，1开启，2审核中，3审核失败
     * @param circleStatus 圈子状态，0关闭，1开启，2审核中，3审核失败
     */
    public void setCircleStatus(Byte circleStatus) {
        this.circleStatus = circleStatus;
    }

    /**
     * 关闭或审核失败原因
     * @return circle_statusinfo 关闭或审核失败原因
     */
    public String getCircleStatusinfo() {
        return circleStatusinfo;
    }

    /**
     * 关闭或审核失败原因
     * @param circleStatusinfo 关闭或审核失败原因
     */
    public void setCircleStatusinfo(String circleStatusinfo) {
        this.circleStatusinfo = circleStatusinfo == null ? null : circleStatusinfo.trim();
    }

    /**
     * 加入圈子时候需要审核，0不需要，1需要
     * @return circle_joinaudit 加入圈子时候需要审核，0不需要，1需要
     */
    public Byte getCircleJoinaudit() {
        return circleJoinaudit;
    }

    /**
     * 加入圈子时候需要审核，0不需要，1需要
     * @param circleJoinaudit 加入圈子时候需要审核，0不需要，1需要
     */
    public void setCircleJoinaudit(Byte circleJoinaudit) {
        this.circleJoinaudit = circleJoinaudit;
    }

    /**
     * 圈子创建时间
     * @return circle_addtime 圈子创建时间
     */
    public String getCircleAddtime() {
        return circleAddtime;
    }

    /**
     * 圈子创建时间
     * @param circleAddtime 圈子创建时间
     */
    public void setCircleAddtime(String circleAddtime) {
        this.circleAddtime = circleAddtime == null ? null : circleAddtime.trim();
    }

    /**
     * 圈子公告更新时间
     * @return circle_noticetime 圈子公告更新时间
     */
    public String getCircleNoticetime() {
        return circleNoticetime;
    }

    /**
     * 圈子公告更新时间
     * @param circleNoticetime 圈子公告更新时间
     */
    public void setCircleNoticetime(String circleNoticetime) {
        this.circleNoticetime = circleNoticetime == null ? null : circleNoticetime.trim();
    }

    /**
     * 是否推荐 0未推荐，1已推荐
     * @return is_recommend 是否推荐 0未推荐，1已推荐
     */
    public Byte getIsRecommend() {
        return isRecommend;
    }

    /**
     * 是否推荐 0未推荐，1已推荐
     * @param isRecommend 是否推荐 0未推荐，1已推荐
     */
    public void setIsRecommend(Byte isRecommend) {
        this.isRecommend = isRecommend;
    }

    /**
     * 是否为热门圈子 1是 0否
     * @return is_hot 是否为热门圈子 1是 0否
     */
    public Byte getIsHot() {
        return isHot;
    }

    /**
     * 是否为热门圈子 1是 0否
     * @param isHot 是否为热门圈子 1是 0否
     */
    public void setIsHot(Byte isHot) {
        this.isHot = isHot;
    }

    /**
     * 圈子标签
     * @return circle_tag 圈子标签
     */
    public String getCircleTag() {
        return circleTag;
    }

    /**
     * 圈子标签
     * @param circleTag 圈子标签
     */
    public void setCircleTag(String circleTag) {
        this.circleTag = circleTag == null ? null : circleTag.trim();
    }

    /**
     * 等待审核成员数
     * @return new_verifycount 等待审核成员数
     */
    public Integer getNewVerifycount() {
        return newVerifycount;
    }

    /**
     * 等待审核成员数
     * @param newVerifycount 等待审核成员数
     */
    public void setNewVerifycount(Integer newVerifycount) {
        this.newVerifycount = newVerifycount;
    }

    /**
     * 等待处理举报数
     * @return new_informcount 等待处理举报数
     */
    public Integer getNewInformcount() {
        return newInformcount;
    }

    /**
     * 等待处理举报数
     * @param newInformcount 等待处理举报数
     */
    public void setNewInformcount(Integer newInformcount) {
        this.newInformcount = newInformcount;
    }

    /**
     * 申请管理是否开启 0关闭，1开启
     * @return mapply_open 申请管理是否开启 0关闭，1开启
     */
    public Byte getMapplyOpen() {
        return mapplyOpen;
    }

    /**
     * 申请管理是否开启 0关闭，1开启
     * @param mapplyOpen 申请管理是否开启 0关闭，1开启
     */
    public void setMapplyOpen(Byte mapplyOpen) {
        this.mapplyOpen = mapplyOpen;
    }

    /**
     * 成员级别
     * @return mapply_ml 成员级别
     */
    public Byte getMapplyMl() {
        return mapplyMl;
    }

    /**
     * 成员级别
     * @param mapplyMl 成员级别
     */
    public void setMapplyMl(Byte mapplyMl) {
        this.mapplyMl = mapplyMl;
    }

    /**
     * 管理申请数量
     * @return new_mapplycount 管理申请数量
     */
    public Integer getNewMapplycount() {
        return newMapplycount;
    }

    /**
     * 管理申请数量
     * @param newMapplycount 管理申请数量
     */
    public void setNewMapplycount(Integer newMapplycount) {
        this.newMapplycount = newMapplycount;
    }

    /**
     * 1企业，2家庭，3部门
     * @return circle_type 1企业，2家庭，3部门
     */
    public Byte getCircleType() {
        return circleType;
    }

    /**
     * 1企业，2家庭，3部门
     * @param circleType 1企业，2家庭，3部门
     */
    public void setCircleType(Byte circleType) {
        this.circleType = circleType;
    }

    /**
     * 所属圈子id
     * @return parent_circle_id 所属圈子id
     */
    public Integer getParentCircleId() {
        return parentCircleId;
    }

    /**
     * 所属圈子id
     * @param parentCircleId 所属圈子id
     */
    public void setParentCircleId(Integer parentCircleId) {
        this.parentCircleId = parentCircleId;
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
     * 负责人的编号
     * @return resp_id 负责人的编号
     */
    public Integer getRespId() {
        return respId;
    }

    /**
     * 负责人的编号
     * @param respId 负责人的编号
     */
    public void setRespId(Integer respId) {
        this.respId = respId;
    }

    /**
     * 负责人姓名
     * @return resp_name 负责人姓名
     */
    public String getRespName() {
        return respName;
    }

    /**
     * 负责人姓名
     * @param respName 负责人姓名
     */
    public void setRespName(String respName) {
        this.respName = respName == null ? null : respName.trim();
    }

    /**
     * 负责人电话
     * @return resp_mobile 负责人电话
     */
    public String getRespMobile() {
        return respMobile;
    }

    /**
     * 负责人电话
     * @param respMobile 负责人电话
     */
    public void setRespMobile(String respMobile) {
        this.respMobile = respMobile == null ? null : respMobile.trim();
    }

    /**
     * 扶贫联盟排序
     * @return boc_sort 扶贫联盟排序
     */
    public Integer getBocSort() {
        return bocSort;
    }

    /**
     * 扶贫联盟排序
     * @param bocSort 扶贫联盟排序
     */
    public void setBocSort(Integer bocSort) {
        this.bocSort = bocSort;
    }

    /**
     * 部门级别:1:一级分行,2:二级分行,3:三级分行
     * @return dept_level 部门级别:1:一级分行,2:二级分行,3:三级分行
     */
    public Byte getDeptLevel() {
        return deptLevel;
    }

    /**
     * 部门级别:1:一级分行,2:二级分行,3:三级分行
     * @param deptLevel 部门级别:1:一级分行,2:二级分行,3:三级分行
     */
    public void setDeptLevel(Byte deptLevel) {
        this.deptLevel = deptLevel;
    }

    /**
     * 党组织/团组织对应的部门circle_id
     * @return org_circle_id 党组织/团组织对应的部门circle_id
     */
    public Integer getOrgCircleId() {
        return orgCircleId;
    }

    /**
     * 党组织/团组织对应的部门circle_id
     * @param orgCircleId 党组织/团组织对应的部门circle_id
     */
    public void setOrgCircleId(Integer orgCircleId) {
        this.orgCircleId = orgCircleId;
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
     * 是否有子部门（0、没有[默认] 1、有）
     * @return has_child_flag 是否有子部门（0、没有[默认] 1、有）
     */
    public Byte getHasChildFlag() {
        return hasChildFlag;
    }

    /**
     * 是否有子部门（0、没有[默认] 1、有）
     * @param hasChildFlag 是否有子部门（0、没有[默认] 1、有）
     */
    public void setHasChildFlag(Byte hasChildFlag) {
        this.hasChildFlag = hasChildFlag;
    }

    /**
     * 部门人数(仅子部门)
     * @return staffs_amount 部门人数(仅子部门)
     */
    public Integer getStaffsAmount() {
        return staffsAmount;
    }

    /**
     * 部门人数(仅子部门)
     * @param staffsAmount 部门人数(仅子部门)
     */
    public void setStaffsAmount(Integer staffsAmount) {
        this.staffsAmount = staffsAmount;
    }
}