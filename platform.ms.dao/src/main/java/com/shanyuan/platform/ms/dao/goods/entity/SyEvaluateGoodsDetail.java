package com.shanyuan.platform.ms.dao.goods.entity;

/**
 * 描述:sy_evaluate_goods_detail表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-10-19
 */
public class SyEvaluateGoodsDetail {
    /**
     * ID
     */
    private Integer gevalDetailId;

    /**
     * 评价ID
     */
    private Integer gevalId;

    /**
     * 回复内容
     */
    private String content;
    /**
     * 回复时间2
     */
    private String replayTime;

    /**
     * 回复时间
     */
    private Integer addtime;

    /**
     * 编辑时间
     */
    private Integer edittime;

    /**
     * 回复人编号
     */
    private Integer replyerId;

    /**
     * 回复人名称
     */
    private String replyerName;

    /**
     * 被回复人编号
     */
    private Integer toId;

    /**
     * 被回复人名称
     */
    private String toName;

    /**
     * 回复信息的状态 0为正常 1为禁止显示
     */
    private Byte state;

    /**
     * ID
     * @return geval_detail_id ID
     */
    public Integer getGevalDetailId() {
        return gevalDetailId;
    }

    /**
     * ID
     * @param gevalDetailId ID
     */
    public void setGevalDetailId(Integer gevalDetailId) {
        this.gevalDetailId = gevalDetailId;
    }

    public String getReplayTime() {
		return replayTime;
	}

	public void setReplayTime(String replayTime) {
		this.replayTime = replayTime;
	}

	/**
     * 评价ID
     * @return geval_id 评价ID
     */
    public Integer getGevalId() {
        return gevalId;
    }

    /**
     * 评价ID
     * @param gevalId 评价ID
     */
    public void setGevalId(Integer gevalId) {
        this.gevalId = gevalId;
    }

    /**
     * 回复内容
     * @return content 回复内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 回复内容
     * @param content 回复内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 回复时间
     * @return addtime 回复时间
     */
    public Integer getAddtime() {
        return addtime;
    }

    /**
     * 回复时间
     * @param addtime 回复时间
     */
    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    /**
     * 编辑时间
     * @return edittime 编辑时间
     */
    public Integer getEdittime() {
        return edittime;
    }

    /**
     * 编辑时间
     * @param edittime 编辑时间
     */
    public void setEdittime(Integer edittime) {
        this.edittime = edittime;
    }

    /**
     * 回复人编号
     * @return replyer_id 回复人编号
     */
    public Integer getReplyerId() {
        return replyerId;
    }

    /**
     * 回复人编号
     * @param replyerId 回复人编号
     */
    public void setReplyerId(Integer replyerId) {
        this.replyerId = replyerId;
    }

    /**
     * 回复人名称
     * @return replyer_name 回复人名称
     */
    public String getReplyerName() {
        return replyerName;
    }

    /**
     * 回复人名称
     * @param replyerName 回复人名称
     */
    public void setReplyerName(String replyerName) {
        this.replyerName = replyerName == null ? null : replyerName.trim();
    }

    /**
     * 被回复人编号
     * @return to_id 被回复人编号
     */
    public Integer getToId() {
        return toId;
    }

    /**
     * 被回复人编号
     * @param toId 被回复人编号
     */
    public void setToId(Integer toId) {
        this.toId = toId;
    }

    /**
     * 被回复人名称
     * @return to_name 被回复人名称
     */
    public String getToName() {
        return toName;
    }

    /**
     * 被回复人名称
     * @param toName 被回复人名称
     */
    public void setToName(String toName) {
        this.toName = toName == null ? null : toName.trim();
    }

    /**
     * 回复信息的状态 0为正常 1为禁止显示
     * @return state 回复信息的状态 0为正常 1为禁止显示
     */
    public Byte getState() {
        return state;
    }

    /**
     * 回复信息的状态 0为正常 1为禁止显示
     * @param state 回复信息的状态 0为正常 1为禁止显示
     */
    public void setState(Byte state) {
        this.state = state;
    }
}