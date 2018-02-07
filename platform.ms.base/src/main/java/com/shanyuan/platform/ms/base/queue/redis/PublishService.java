package  com.shanyuan.platform.ms.base.queue.redis;


import com.shanyuan.platform.ms.base.queue.redis.bean.BaseMessage;

public interface PublishService {

	
	public void  publishStringMessage(String topic,String tag ,String data,String searchKey ,String type ) ;
	
	public void  publishMessage(BaseMessage message);
	
	
	
	
}
