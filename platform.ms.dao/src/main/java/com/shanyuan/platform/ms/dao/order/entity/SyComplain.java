package com.shanyuan.platform.ms.dao.order.entity;

/**
 * 描述:sy_complain表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-10-30
 */
public class SyComplain {
    /**
     * 投诉id
     */
    private Integer complainId;

    /**
     * 订单id
     */
    private Integer orderId;

    /**
     * 原告id
     */
    private Integer accuserId;

    /**
     * 原告名称
     */
    private String accuserName;

    /**
     * 被告id
     */
    private Integer accusedId;

    /**
     * 被告名称
     */
    private String accusedName;

    /**
     * 投诉主题
     */
    private String complainSubjectContent;

    /**
     * 投诉主题id
     */
    private Integer complainSubjectId;

    /**
     * 投诉内容
     */
    private String complainContent;

    /**
     * 投诉图片1
     */
    private String complainPic1;

    /**
     * 投诉图片2
     */
    private String complainPic2;

    /**
     * 投诉图片3
     */
    private String complainPic3;

    /**
     * 投诉时间
     */
    private Integer complainDatetime;

    /**
     * 投诉处理时间
     */
    private Integer complainHandleDatetime;

    /**
     * 投诉处理人id
     */
    private Integer complainHandleMemberId;

    /**
     * 申诉内容
     */
    private String appealMessage;

    /**
     * 申诉时间
     */
    private Integer appealDatetime;

    /**
     * 申诉图片1
     */
    private String appealPic1;

    /**
     * 申诉图片2
     */
    private String appealPic2;

    /**
     * 申诉图片3
     */
    private String appealPic3;

    /**
     * 最终处理意见
     */
    private String finalHandleMessage;

    /**
     * 最终处理时间
     */
    private Integer finalHandleDatetime;

    /**
     * 最终处理人id
     */
    private Integer finalHandleMemberId;

    /**
     * 投诉状态(10-新投诉/20-投诉通过转给被投诉人/30-被投诉人已申诉/40-提交仲裁/99-已关闭)
     */
    private Byte complainState;

    /**
     * 处理结果
     */
    private Byte complainResult;

    /**
     * 投诉是否通过平台审批(1未通过/2通过)
     */
    private Byte complainActive;

    /**
     * 订单编号
     */
    private Long orderSn;

    /**
     * 投诉id
     * @return complain_id 投诉id
     */
    public Integer getComplainId() {
        return complainId;
    }

    /**
     * 投诉id
     * @param complainId 投诉id
     */
    public void setComplainId(Integer complainId) {
        this.complainId = complainId;
    }

    /**
     * 订单id
     * @return order_id 订单id
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 订单id
     * @param orderId 订单id
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 原告id
     * @return accuser_id 原告id
     */
    public Integer getAccuserId() {
        return accuserId;
    }

    /**
     * 原告id
     * @param accuserId 原告id
     */
    public void setAccuserId(Integer accuserId) {
        this.accuserId = accuserId;
    }

    /**
     * 原告名称
     * @return accuser_name 原告名称
     */
    public String getAccuserName() {
        return accuserName;
    }

    /**
     * 原告名称
     * @param accuserName 原告名称
     */
    public void setAccuserName(String accuserName) {
        this.accuserName = accuserName == null ? null : accuserName.trim();
    }

    /**
     * 被告id
     * @return accused_id 被告id
     */
    public Integer getAccusedId() {
        return accusedId;
    }

    /**
     * 被告id
     * @param accusedId 被告id
     */
    public void setAccusedId(Integer accusedId) {
        this.accusedId = accusedId;
    }

    /**
     * 被告名称
     * @return accused_name 被告名称
     */
    public String getAccusedName() {
        return accusedName;
    }

    /**
     * 被告名称
     * @param accusedName 被告名称
     */
    public void setAccusedName(String accusedName) {
        this.accusedName = accusedName == null ? null : accusedName.trim();
    }

    /**
     * 投诉主题
     * @return complain_subject_content 投诉主题
     */
    public String getComplainSubjectContent() {
        return complainSubjectContent;
    }

    /**
     * 投诉主题
     * @param complainSubjectContent 投诉主题
     */
    public void setComplainSubjectContent(String complainSubjectContent) {
        this.complainSubjectContent = complainSubjectContent == null ? null : complainSubjectContent.trim();
    }

    /**
     * 投诉主题id
     * @return complain_subject_id 投诉主题id
     */
    public Integer getComplainSubjectId() {
        return complainSubjectId;
    }

    /**
     * 投诉主题id
     * @param complainSubjectId 投诉主题id
     */
    public void setComplainSubjectId(Integer complainSubjectId) {
        this.complainSubjectId = complainSubjectId;
    }

    /**
     * 投诉内容
     * @return complain_content 投诉内容
     */
    public String getComplainContent() {
        return complainContent;
    }

    /**
     * 投诉内容
     * @param complainContent 投诉内容
     */
    public void setComplainContent(String complainContent) {
        this.complainContent = complainContent == null ? null : complainContent.trim();
    }

    /**
     * 投诉图片1
     * @return complain_pic1 投诉图片1
     */
    public String getComplainPic1() {
        return complainPic1;
    }

    /**
     * 投诉图片1
     * @param complainPic1 投诉图片1
     */
    public void setComplainPic1(String complainPic1) {
        this.complainPic1 = complainPic1 == null ? null : complainPic1.trim();
    }

    /**
     * 投诉图片2
     * @return complain_pic2 投诉图片2
     */
    public String getComplainPic2() {
        return complainPic2;
    }

    /**
     * 投诉图片2
     * @param complainPic2 投诉图片2
     */
    public void setComplainPic2(String complainPic2) {
        this.complainPic2 = complainPic2 == null ? null : complainPic2.trim();
    }

    /**
     * 投诉图片3
     * @return complain_pic3 投诉图片3
     */
    public String getComplainPic3() {
        return complainPic3;
    }

    /**
     * 投诉图片3
     * @param complainPic3 投诉图片3
     */
    public void setComplainPic3(String complainPic3) {
        this.complainPic3 = complainPic3 == null ? null : complainPic3.trim();
    }

    /**
     * 投诉时间
     * @return complain_datetime 投诉时间
     */
    public Integer getComplainDatetime() {
        return complainDatetime;
    }

    /**
     * 投诉时间
     * @param complainDatetime 投诉时间
     */
    public void setComplainDatetime(Integer complainDatetime) {
        this.complainDatetime = complainDatetime;
    }

    /**
     * 投诉处理时间
     * @return complain_handle_datetime 投诉处理时间
     */
    public Integer getComplainHandleDatetime() {
        return complainHandleDatetime;
    }

    /**
     * 投诉处理时间
     * @param complainHandleDatetime 投诉处理时间
     */
    public void setComplainHandleDatetime(Integer complainHandleDatetime) {
        this.complainHandleDatetime = complainHandleDatetime;
    }

    /**
     * 投诉处理人id
     * @return complain_handle_member_id 投诉处理人id
     */
    public Integer getComplainHandleMemberId() {
        return complainHandleMemberId;
    }

    /**
     * 投诉处理人id
     * @param complainHandleMemberId 投诉处理人id
     */
    public void setComplainHandleMemberId(Integer complainHandleMemberId) {
        this.complainHandleMemberId = complainHandleMemberId;
    }

    /**
     * 申诉内容
     * @return appeal_message 申诉内容
     */
    public String getAppealMessage() {
        return appealMessage;
    }

    /**
     * 申诉内容
     * @param appealMessage 申诉内容
     */
    public void setAppealMessage(String appealMessage) {
        this.appealMessage = appealMessage == null ? null : appealMessage.trim();
    }

    /**
     * 申诉时间
     * @return appeal_datetime 申诉时间
     */
    public Integer getAppealDatetime() {
        return appealDatetime;
    }

    /**
     * 申诉时间
     * @param appealDatetime 申诉时间
     */
    public void setAppealDatetime(Integer appealDatetime) {
        this.appealDatetime = appealDatetime;
    }

    /**
     * 申诉图片1
     * @return appeal_pic1 申诉图片1
     */
    public String getAppealPic1() {
        return appealPic1;
    }

    /**
     * 申诉图片1
     * @param appealPic1 申诉图片1
     */
    public void setAppealPic1(String appealPic1) {
        this.appealPic1 = appealPic1 == null ? null : appealPic1.trim();
    }

    /**
     * 申诉图片2
     * @return appeal_pic2 申诉图片2
     */
    public String getAppealPic2() {
        return appealPic2;
    }

    /**
     * 申诉图片2
     * @param appealPic2 申诉图片2
     */
    public void setAppealPic2(String appealPic2) {
        this.appealPic2 = appealPic2 == null ? null : appealPic2.trim();
    }

    /**
     * 申诉图片3
     * @return appeal_pic3 申诉图片3
     */
    public String getAppealPic3() {
        return appealPic3;
    }

    /**
     * 申诉图片3
     * @param appealPic3 申诉图片3
     */
    public void setAppealPic3(String appealPic3) {
        this.appealPic3 = appealPic3 == null ? null : appealPic3.trim();
    }

    /**
     * 最终处理意见
     * @return final_handle_message 最终处理意见
     */
    public String getFinalHandleMessage() {
        return finalHandleMessage;
    }

    /**
     * 最终处理意见
     * @param finalHandleMessage 最终处理意见
     */
    public void setFinalHandleMessage(String finalHandleMessage) {
        this.finalHandleMessage = finalHandleMessage == null ? null : finalHandleMessage.trim();
    }

    /**
     * 最终处理时间
     * @return final_handle_datetime 最终处理时间
     */
    public Integer getFinalHandleDatetime() {
        return finalHandleDatetime;
    }

    /**
     * 最终处理时间
     * @param finalHandleDatetime 最终处理时间
     */
    public void setFinalHandleDatetime(Integer finalHandleDatetime) {
        this.finalHandleDatetime = finalHandleDatetime;
    }

    /**
     * 最终处理人id
     * @return final_handle_member_id 最终处理人id
     */
    public Integer getFinalHandleMemberId() {
        return finalHandleMemberId;
    }

    /**
     * 最终处理人id
     * @param finalHandleMemberId 最终处理人id
     */
    public void setFinalHandleMemberId(Integer finalHandleMemberId) {
        this.finalHandleMemberId = finalHandleMemberId;
    }

    /**
     * 投诉状态(10-新投诉/20-投诉通过转给被投诉人/30-被投诉人已申诉/40-提交仲裁/99-已关闭)
     * @return complain_state 投诉状态(10-新投诉/20-投诉通过转给被投诉人/30-被投诉人已申诉/40-提交仲裁/99-已关闭)
     */
    public Byte getComplainState() {
        return complainState;
    }

    /**
     * 投诉状态(10-新投诉/20-投诉通过转给被投诉人/30-被投诉人已申诉/40-提交仲裁/99-已关闭)
     * @param complainState 投诉状态(10-新投诉/20-投诉通过转给被投诉人/30-被投诉人已申诉/40-提交仲裁/99-已关闭)
     */
    public void setComplainState(Byte complainState) {
        this.complainState = complainState;
    }

    /**
     * 处理结果
     * @return complain_result 处理结果
     */
    public Byte getComplainResult() {
        return complainResult;
    }

    /**
     * 处理结果
     * @param complainResult 处理结果
     */
    public void setComplainResult(Byte complainResult) {
        this.complainResult = complainResult;
    }

    /**
     * 投诉是否通过平台审批(1未通过/2通过)
     * @return complain_active 投诉是否通过平台审批(1未通过/2通过)
     */
    public Byte getComplainActive() {
        return complainActive;
    }

    /**
     * 投诉是否通过平台审批(1未通过/2通过)
     * @param complainActive 投诉是否通过平台审批(1未通过/2通过)
     */
    public void setComplainActive(Byte complainActive) {
        this.complainActive = complainActive;
    }

    /**
     * 订单编号
     * @return order_sn 订单编号
     */
    public Long getOrderSn() {
        return orderSn;
    }

    /**
     * 订单编号
     * @param orderSn 订单编号
     */
    public void setOrderSn(Long orderSn) {
        this.orderSn = orderSn;
    }
}