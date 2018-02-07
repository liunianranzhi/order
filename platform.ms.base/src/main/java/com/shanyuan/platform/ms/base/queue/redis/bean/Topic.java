package com.shanyuan.platform.ms.base.queue.redis.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.util.StringUtils;


/**
 * 		@author lee
 *		订阅信息标准组
 */
public class Topic {
	
	private static final String TOPIC_LIST_PRE="sr_qtql_";
	private static final String TOPIC_MAP_PRE="sr_qtmap_";
	private static final String TOPIC_EXE_PRE="sr_qexeset_";
	private static final String TOPIC_ERROR_PRE = "sr_qerrset_";
	
	public static final String SUCCESS_STAT = "success";
	public static final String FAIL_STAT="fail" ;
	public static final String TOTAL_STAT = "total" ;
	public static final String MAX_STAT = "max" ;
	public static final String MIN_STAT = "min" ;
	public static final String AVEG_STAT = "aveg" ;
	
	/**
	 * 该订阅下消息的最大执行时间 
	 */
	private int maxExeSeconds = 600 ;
	/**
	 * 订阅主题
	 * 不能为空
	 */
	private String topicName  = "taskTopic";
	
	
	/**
	 * 订阅标签
	 * 可以为空
	 */
	private String  tagName=""  ;
	public Topic() {}
	public Topic(String topicName ,String tagName ) {
		this.tagName = tagName ;
		if(topicName!=null) {
			this.topicName = topicName;
		}
		
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	/**
	 * 返回当前topic和tag下的消息key队列
	 * @return 
	 */
	public String getTaskListKey() {
		
		if(StringUtils.isEmpty(this.tagName)) {
			return TOPIC_LIST_PRE+this.getTopicName();
		}else {
			return TOPIC_LIST_PRE+this.getTopicName()+"_"+this.tagName;
		}
	}
	
	public String getTaskDataMap() {

		if(StringUtils.isEmpty(this.tagName)) {
			return TOPIC_MAP_PRE+this.getTopicName();
		}else {
			return TOPIC_MAP_PRE+this.getTopicName()+"_"+this.tagName;
		}
	}
	
	   public String getTaskExeSet() {

	        if(StringUtils.isEmpty(this.tagName)) {
	            return TOPIC_EXE_PRE+this.getTopicName();
	        }else {
	            return TOPIC_EXE_PRE+this.getTopicName()+"_"+this.tagName;
	        }
	    }
	   
	   public String getTaskErrorSet() {

           if(StringUtils.isEmpty(this.tagName)) {
               return TOPIC_ERROR_PRE+this.getTopicName();
           }else {
               return TOPIC_ERROR_PRE+this.getTopicName()+"_"+this.tagName;
           }
       }
    public int getMaxExeSeconds() {
        return maxExeSeconds;
    }
    public void setMaxExeSeconds(int maxExeSeconds) {
        this.maxExeSeconds = maxExeSeconds;
    }
    
    /**
     * @return 返回订阅标题统计信息map存放的key
     */
    public String getTopicStatistKey() {
        SimpleDateFormat sdfTime = new SimpleDateFormat("yyyy-MM-dd HH");
        String dstr = sdfTime.format(new Date());
        return this.getTaskListKey()+"_statis_"+ dstr;
    }
    
    /**
     * @return 返回订阅标题執行的mingxi信息
     */
    public String getExeDetailKey() {
        return this.getTaskListKey()+"_exe";
    }
    
	

}
