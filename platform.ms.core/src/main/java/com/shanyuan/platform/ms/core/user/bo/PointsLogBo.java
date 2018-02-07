package com.shanyuan.platform.ms.core.user.bo;

public class PointsLogBo {
	  /**
     * 积分日志编号
     */
    private Integer plId;

    /**
     * 会员编号
     */
    private Integer plMemberid;

    /**
     * 会员名称
     */
    private String plMembername;

    /**
     * 会员真实姓名
     */
    private String plMemberTruename;

    /**
     * 会员身份证号码
     */
    private String plMemberIdcard;

    /**
     * 订单索引id
     */
    private Integer plOrderid;

    /**
     * 管理员编号
     */
    private Integer plAdminid;

    /**
     * 管理员名称
     */
    private String plAdminname;

    /**
     * 积分数负数表示扣除
     */
    private Integer plPoints;

    /**
     * 添加时间
     */
    private String addtime;

    /**
     * 操作描述
     */
    private String plDesc;

    /**
     * 操作阶段
     */
    private String plStage;
    
 

	private String from;
	
	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

    /**
     * 渠道id
     */
    private String channel;

    /**
     * 会员编号2
     */
    private Integer plMemberid2;

    /**
     * 积分日志编号
     * @return pl_id 积分日志编号
     */
    public Integer getPlId() {
        return plId;
    }

    /**
     * 积分日志编号
     * @param plId 积分日志编号
     */
    public void setPlId(Integer plId) {
        this.plId = plId;
    }

    /**
     * 会员编号
     * @return pl_memberid 会员编号
     */
    public Integer getPlMemberid() {
        return plMemberid;
    }

    /**
     * 会员编号
     * @param plMemberid 会员编号
     */
    public void setPlMemberid(Integer plMemberid) {
        this.plMemberid = plMemberid;
    }

    /**
     * 会员名称
     * @return pl_membername 会员名称
     */
    public String getPlMembername() {
        return plMembername;
    }

    /**
     * 会员名称
     * @param plMembername 会员名称
     */
    public void setPlMembername(String plMembername) {
        this.plMembername = plMembername == null ? null : plMembername.trim();
    }

    /**
     * 会员真实姓名
     * @return pl_member_truename 会员真实姓名
     */
    public String getPlMemberTruename() {
        return plMemberTruename;
    }

    /**
     * 会员真实姓名
     * @param plMemberTruename 会员真实姓名
     */
    public void setPlMemberTruename(String plMemberTruename) {
        this.plMemberTruename = plMemberTruename == null ? null : plMemberTruename.trim();
    }

    /**
     * 会员身份证号码
     * @return pl_member_idcard 会员身份证号码
     */
    public String getPlMemberIdcard() {
        return plMemberIdcard;
    }

    /**
     * 会员身份证号码
     * @param plMemberIdcard 会员身份证号码
     */
    public void setPlMemberIdcard(String plMemberIdcard) {
        this.plMemberIdcard = plMemberIdcard == null ? null : plMemberIdcard.trim();
    }

    /**
     * 订单索引id
     * @return pl_orderid 订单索引id
     */
    public Integer getPlOrderid() {
        return plOrderid;
    }

    /**
     * 订单索引id
     * @param plOrderid 订单索引id
     */
    public void setPlOrderid(Integer plOrderid) {
        this.plOrderid = plOrderid;
    }

    /**
     * 管理员编号
     * @return pl_adminid 管理员编号
     */
    public Integer getPlAdminid() {
        return plAdminid;
    }

    /**
     * 管理员编号
     * @param plAdminid 管理员编号
     */
    public void setPlAdminid(Integer plAdminid) {
        this.plAdminid = plAdminid;
    }

    /**
     * 管理员名称
     * @return pl_adminname 管理员名称
     */
    public String getPlAdminname() {
        return plAdminname;
    }

    /**
     * 管理员名称
     * @param plAdminname 管理员名称
     */
    public void setPlAdminname(String plAdminname) {
        this.plAdminname = plAdminname == null ? null : plAdminname.trim();
    }

    /**
     * 积分数负数表示扣除
     * @return pl_points 积分数负数表示扣除
     */
    public Integer getPlPoints() {
        return plPoints;
    }

    /**
     * 积分数负数表示扣除
     * @param plPoints 积分数负数表示扣除
     */
    public void setPlPoints(Integer plPoints) {
        this.plPoints = plPoints;
    }

    /**
     * 添加时间
     * @return pl_addtime 添加时间
     */
    public String getAddtime() {
        return addtime;
    }

    /**
     * 添加时间
     * @param plAddtime 添加时间
     */
    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    /**
     * 操作描述
     * @return pl_desc 操作描述
     */
    public String getPlDesc() {
        return plDesc;
    }

    /**
     * 操作描述
     * @param plDesc 操作描述
     */
    public void setPlDesc(String plDesc) {
        this.plDesc = plDesc == null ? null : plDesc.trim();
    }

    /**
     * 操作阶段
     * @return pl_stage 操作阶段
     */
    public String getPlStage() {
        return plStage;
    }

    /**
     * 操作阶段
     * @param plStage 操作阶段
     */
    public void setPlStage(String plStage) {
        this.plStage = plStage == null ? null : plStage.trim();
    }

    /**
     * 渠道id
     * @return channel 渠道id
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 渠道id
     * @param channel 渠道id
     */
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    /**
     * 会员编号2
     * @return pl_memberid2 会员编号2
     */
    public Integer getPlMemberid2() {
        return plMemberid2;
    }

    /**
     * 会员编号2
     * @param plMemberid2 会员编号2
     */
    public void setPlMemberid2(Integer plMemberid2) {
        this.plMemberid2 = plMemberid2;
    }
}
