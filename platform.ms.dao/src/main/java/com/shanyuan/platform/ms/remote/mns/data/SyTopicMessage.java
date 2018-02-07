/**
 * 2015年9月14日 下午1:44:01
 */
package com.shanyuan.platform.ms.remote.mns.data;

import java.util.UUID;

import com.shanyuan.platform.ms.base.common.util.DateUtil;

/**
 * 发送的报文信息
 * 
 * @author lee
 *
 */
public class SyTopicMessage<T> {
    private String serialNum; // 流水号，用来唯一确定一条数据
    private String buildTime; // 信息时间
    private String topicName; // 信息主体名称
    private String className ;
    private String tagName ;//标签名称
    private String phoneNum; // 关联的手机号码, 可以为空
    
    // 发送渠道
    private String channel ="boc";
    
    // 操作人admin id，默认为系统
    private String operatorId = "java-ms"; 
    
    private T data;
    
    public SyTopicMessage() {
        super();
    }

    public SyTopicMessage(String topicName, String tagName ,T data) {
        super();
        this.className = data.getClass().getName();
        this.topicName = topicName;
        this.tagName = tagName;
        this.data = data;
        this.serialNum = UUID.randomUUID().toString().replaceAll("-", "");
        this.buildTime = DateUtil.getTime();
    }
    
    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getTopicName() {
        return topicName;
    }

    public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public String getBuildTime() {
        return buildTime;
    }

    public T getData() {
        return data;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public void setBuildTime(String buildTime) {
        this.buildTime = buildTime;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    
}
