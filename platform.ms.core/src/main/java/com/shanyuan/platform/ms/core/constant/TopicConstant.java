package com.shanyuan.platform.ms.core.constant;

/**
 * 
 * @author yangjian
 * @date 2017/11/16
 *
 */
public interface TopicConstant {

	/**
	 * 积分消息队列
	 * @author yangjian
	 *
	 */
	public interface PointPublish{
		/**
		 * 积分topic
		 */
		public String POINT_TOPIC = "point_topic";
		/**
		 * 积分标签
		 */
		public String POINT_TAGNAME = "point_tag";
	}
	
	/**
	 * 荣誉勋章队列 
	 * @author yangjian
	 *
	 */
	public interface GloryPublish{
		/**
		 * 荣誉勋章topic
		 */
		public String GLORY_TOPIC = "glory_topic";
		/**
		 * 荣誉勋章tag
		 */
		public String GLORY_TAGNAME = "glory_tag";
	}
	
	/**
	 * 消息推送队列
	 * @author yangjian
	 * @date 2017/12/11
	 *
	 */
	public interface MessagePublish{
		/**
		 * 站内信topic
		 */
		public String MESSAGE_TOPIC = "message_topic";
		/**
		 * 站内信tag
		 */
		public String MESSAGE_TAGNAME = "message_tag";
		
		/**
		 * 消息推送topic
		 */
		public String NOTIFY_TOPIC = "notify_topic";
		
		/**
		 * 消息推送tag
		 */
		public String NOTIFY_TAGNAME = "notify_tag";
	}
	
}
