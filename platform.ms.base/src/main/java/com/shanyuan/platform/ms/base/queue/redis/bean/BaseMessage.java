package com.shanyuan.platform.ms.base.queue.redis.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @author lee
 * 消息队列的基本消息
 */
public class BaseMessage implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 7878786035557905182L;

    /**
     * 消息id，不能重复
     */
    private String messageKey;

    /**
     * 消息类型
     */
    private String type ;
    /**
     * 消息标题和标签相关内容
     */
    private Topic topic ;
    
    /**
     * 被检索的key;可以null
     */
    private String searchKey ;
    /**
     * 创建时间
     */
    private Date createDate ;
    
    /**
     * 最近一次执行时间
     */
    private Date lastExeTime ;
    
    /**
     * 执行次数
     */
    private int exeTimes ;
    
    
    private String jsonData;
    
    /**
     * 最多执行次数
     */
    private int maxExeTimes =3; 
    public BaseMessage() {}
    public BaseMessage(String messageKey, Topic topic, Date createDate) {
        super();
        this.messageKey = messageKey;
        this.topic = topic;
        this.createDate = createDate;
    }

    public String getMessageKey() {
        return messageKey;
    }

    public void setMessageKey(String messageKey) {
        this.messageKey = messageKey;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastExeTime() {
        return lastExeTime;
    }

    public void setLastExeTime(Date lastExeTime) {
        this.lastExeTime = lastExeTime;
    }

    public int getExeTimes() {
        return exeTimes;
    }

    public void setExeTimes(int exeTimes) {
        this.exeTimes = exeTimes;
    }

    public int getMaxExeTimes() {
        return maxExeTimes;
    }

    public void setMaxExeTimes(int maxExeTimes) {
        this.maxExeTimes = maxExeTimes;
    }
	public String getJsonData() {
		return jsonData;
	}
	public void setJsonData(String jsonData) {
		this.jsonData = jsonData;
	}
    
    
}
