package com.shanyuan.platform.ms.base.queue.redis.bean;

import java.util.Date;

/**
 * 字符串扩展的消息队列的消息报文结构
 * 
 * @author lee
 *
 */
public class MessageData extends BaseMessage {

    /**
     * 
     */
    private static final long serialVersionUID = -3214927159698465742L;
    private String jsonData;
    
    public  MessageData(String messageKey, Topic topic, Date createDate, String jsonData) {
        super(messageKey, topic, createDate);
        this.jsonData = jsonData;
    }

    public String getJsonData() {
        return jsonData;
    }

    public void setJsonData(String jsonData) {
        this.jsonData = jsonData;
    }

}
