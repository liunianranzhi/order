package com.shanyuan.platform.ms.base.queue.redis;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;

import com.alibaba.fastjson.JSON;
import com.shanyuan.platform.ms.base.queue.redis.bean.BaseMessage;
import com.shanyuan.platform.ms.base.queue.redis.bean.Topic;

import redis.clients.jedis.Jedis;

public final class SubService {
	private final Logger logger = Logger.getLogger(getClass());
	private final String CLS_TIME_PRE = "cls_qtp_" ;
	private final  StringRedisTemplate redisTemplate ;
	private final Topic topic;
	private  List<TaskQueueExecute> exeList ;
	private static  RedisMessageListenerContainer container = new RedisMessageListenerContainer();
	private   int threadPoolSize =5;
	private final ExecutorService threadPool;
	private MessageListener myListener ;
	private final ChannelTopic ct  ;
	private final String subName ;
	private   volatile boolean  isStop=false;
	private final SubServiceStatis sss ;
	
	public SubService(StringRedisTemplate template , Topic topic, List<TaskQueueExecute> exeList ,String subName ) {
		this.redisTemplate = template ;
		this.topic = topic;
		 ct = new ChannelTopic(topic.getTopicName());
		this.exeList = exeList;
		this.threadPool = Executors.newFixedThreadPool(threadPoolSize) ;
		this.subName = subName;
		sss = new SubServiceStatis(topic,template);
	}
	public SubService(StringRedisTemplate template , Topic topic, List<TaskQueueExecute> exeList   ,int poolSize,String subName) {
		this.redisTemplate = template ;
		this.topic = topic;
		 ct = new ChannelTopic(topic.getTopicName());
		this.exeList = exeList;
		this.threadPoolSize = poolSize;
		if(this.threadPoolSize >=150) {
			this.setThreadPoolSize(150) ; 
		}
		this.threadPool = Executors.newFixedThreadPool(threadPoolSize) ;
		this.subName = subName;
		sss = new SubServiceStatis(topic,template);
	}
	
	
	public void start() {
		try {
		    CheckExeQueueRunnable ceq = new CheckExeQueueRunnable(this.redisTemplate );
		    Thread t = new Thread(ceq,subName+"_clean");
		    t.start();
		    
			List<String>messages = this.getMessageFromQueue(1000, topic);
			geneTasks(messages);
		}catch(Exception e) {
			logger.error("exe sub start error 1 "+ e.getMessage () ,e);
		}
		try {
			 	startSub();
		}catch(Exception e) {
			logger.error("exe sub start error 2 "+ e.getMessage () ,e);
		}
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				destory();
			}
			 
		});
	}
	
	public final void stop() {
	    this.isStop = true ;
			this.container.removeMessageListener(myListener); 
		
	}
	public final void destory() {
		try{ this.isStop = true ;
			try {
				this.container.removeMessageListener(myListener); 
			}catch(Exception e3) {
				logger.error("removeMessageListener fail   " +e3.getMessage(),e3);
			
						
			}
			if(redisTemplate!=null&&!redisTemplate.getConnectionFactory().getConnection() .isClosed()) {
				Jedis jedis = (Jedis) redisTemplate.getConnectionFactory().getConnection() .getNativeConnection();
				jedis.getClient().connect();
				List<Runnable> rs = this.threadPool.shutdownNow() ;
				for(Runnable run : rs ) {
					String messageKey = "";
					try {
						TaskExeRunnable t = (TaskExeRunnable) run;
						BaseMessage  data = t.getBaseMessage();
//						ListOperations<String,String>  lo = redisTemplate.opsForList();
//						messageKey = data.getMessageKey();
						jedis.rpush(data.getTopic().getTaskListKey(), data.getMessageKey());
//						lo.rightPush(data.getTopic().getTaskListKey(), data.getMessageKey());
					}catch(Exception e2) {
						logger.error("destory fail deal unexetask messagekey : "+messageKey,e2);
					}
				}
			}else {
				 this.threadPool.shutdown();
			}
		
			this.container.destroy() ;
		}catch(Exception e) {
			logger.error("destory subService fail: "+e.getMessage() ,e );
		}
	}
	
	private  void startSub(){
		container.setConnectionFactory(this.redisTemplate.getConnectionFactory());
		 if(!container.isRunning()) {
			 container.afterPropertiesSet();
			 container.setSubscriptionExecutor( Executors.newFixedThreadPool(10) );
			 container.start();
		 }
		  myListener =
			 new MessageListener() {
				public void onMessage(Message message, byte[] pattern) {
					String mstr = message.toString();
					if(logger.isDebugEnabled()) {
						logger.debug("sub receive message "+message);
					}
					if(topic.getTagName()!=null && topic.getTagName().equals(mstr)) {
							//  fetch real data 
							try {
									List<String>messages =getMessageFromQueue(10,topic );
									geneTasks(messages);
							}catch(Exception e) {
								logger.error("sub message fail "+e.getMessage() ,e);
							}
					}
				}
			 };
			 container.addMessageListener(myListener, ct);
		
	}
	 
	public StringRedisTemplate getRedisTemplate() {
		return redisTemplate;
	}
	public Topic getTopic() {
		return topic;
	}
	public List<TaskQueueExecute> getExeList() {
		return exeList;
	}
	public void setExeList(List<TaskQueueExecute> exeList) {
		this.exeList = exeList;
	}
	 
	private final void addExeResult(boolean succ,int exems ) {
	    
	    sss.addResult(succ, exems);
	    
	    
	}
	public int getThreadPoolSize() {
		return threadPoolSize;
	}
	public void setThreadPoolSize(int threadPoolSize) {
		this.threadPoolSize = threadPoolSize;
	}
	private final List<String> getMessageFromQueue(int fnum ,Topic topic ){
//	    redisTemplate.setEnableTransactionSupport(true);
//	    redisTemplate.multi();
		List<String>messages = new ArrayList<String>();
		List<String > messageKeys = new ArrayList<String>();
		ListOperations<String,String>  lo  =	redisTemplate.opsForList();
		for(int i =0 ; i<fnum ;i++) {
			String  rkey = lo.leftPop(topic.getTaskListKey(), 100, TimeUnit.MILLISECONDS);
			if(StringUtils.isEmpty(rkey)) {
				break;
			}
			messageKeys.add(rkey);
		}
		HashOperations<String,String,String>  ho =	redisTemplate. opsForHash( );
		if(!messageKeys.isEmpty()) {
			messages =ho.multiGet(topic.getTaskDataMap(), messageKeys);
		}
		String exeSetKey = topic.getTaskExeSet();
		ZSetOperations<String, String> opsForZSet = redisTemplate.opsForZSet();
		int nt = (int) (System.currentTimeMillis()/1000);
		double dt = nt;
		for(String  skey : messageKeys) {
		    opsForZSet.add(exeSetKey, skey, dt);
		}
//		redisTemplate.exec();
//		redisTemplate.setEnableTransactionSupport(false);
		return messages ;
	}
	
	private final void geneTasks(List<String> messages){
		for(String mes : messages) {
			try {
				BaseMessage data = JSON.parseObject(mes, BaseMessage.class);
				if(data==null){
					continue;
				}
				TaskExeRunnable tr = new TaskExeRunnable(this.redisTemplate ,data,this.exeList);
				Future f = this.threadPool.submit( tr);
			}catch(Exception e) {
				logger.error("gene task error : "+ mes,e);
			}
		}
	}
	
 
	class CheckExeQueueRunnable implements Runnable{
	    private final StringRedisTemplate redisTemplate ;
        
        public CheckExeQueueRunnable(StringRedisTemplate redisTemplate  ) {
            this.redisTemplate=redisTemplate;
        }
        @Override
        public void run() {
            while(!isStop) {
                try {
                    int m = 5 ;
                    Thread.sleep(m*1000);
                    sss.dealStatistics();
                    int ns= (int) (System.currentTimeMillis()/1000);
                    int os = 0;
                    String timeKey = CLS_TIME_PRE + topic.getTopicName();
                    String minTime = redisTemplate.opsForValue().getAndSet(timeKey, ns+"");
                    if(StringUtils.isNotEmpty(minTime)) {
                        os = Integer.parseInt(minTime);
                    }
                    if(os>=ns) {
                        m = RandomUtils.nextInt(1, 10);
                        continue;
                    }
                    int maxsc = ns - topic.getMaxExeSeconds();
                    int minsc = 0;
                    if(os >=topic.getMaxExeSeconds()) {
                          minsc = os - topic.getMaxExeSeconds();
                    } 
                    Set<String> timeOutSet =    redisTemplate.opsForZSet().rangeByScore(topic.getTaskExeSet(),minsc , maxsc);
                    int redo = 0;
                    for(String tokey : timeOutSet) {
//                        redisTemplate.setEnableTransactionSupport(true);
//                        redisTemplate.multi();
                        if(redisTemplate.opsForHash().hasKey(topic.getTaskDataMap(), tokey)) {
                            HashOperations<String,String,String>  ho =  redisTemplate. opsForHash( );
                            String oj = ho.get(topic.getTaskDataMap(), tokey );
                            BaseMessage data = JSON.parseObject(oj, BaseMessage.class);
                            if(data.getExeTimes()>=data.getMaxExeTimes()) {
                                //入异常队列
                                redisTemplate.opsForZSet().add(topic.getTaskErrorSet(), oj, ns);
                                
                            }else {
                                //重新执行
                                redisTemplate.opsForList().rightPush(topic.getTaskListKey(), tokey);
                                redo++;
                            }
                        } 
                        redisTemplate.opsForZSet().remove(topic.getTaskExeSet(), tokey);
//                        redisTemplate.exec();
//                        redisTemplate.setEnableTransactionSupport(false);
                    }
                    if(redo>0) {
                        redisTemplate.convertAndSend(topic.getTopicName(), topic.getTagName());
                    }
                }catch(Exception e) {
                    logger.error(e.getMessage() ,e );
                }
                
            }
            
            
        }
	    
	}
	
	
	class TaskExeRunnable implements Runnable{

		private final StringRedisTemplate redisTemplate ;
		
		private final BaseMessage message ;
		
		private final List<TaskQueueExecute> exes ;
		
		public TaskExeRunnable(StringRedisTemplate redisTemplate ,BaseMessage message,List<TaskQueueExecute> exes) {
			this.redisTemplate = redisTemplate;
			this.message = message ;
			this.exes = exes;
		}
		
		public void run() {
			long start = System.currentTimeMillis();
			List<TaskQueueExecute> finishList = new ArrayList<TaskQueueExecute>();
			boolean needRellow = false ;
			try {
				if(logger.isDebugEnabled()) {
					logger.debug("real Exeute message : "+JSON.toJSONString(message));
				}
				logger.info("real Exeute message : "+JSON.toJSONString(message));
				message.setLastExeTime(new Date());
				message.setExeTimes(message.getExeTimes()+1);
				for(TaskQueueExecute exe :exes) {
				    finishList.add(exe);
					exe.executeTask(message);
				}
                
			}catch(Exception e) {
				needRellow = true ;
				logger.error("task execute error "+ e.getMessage(),e);
				for(TaskQueueExecute exe : finishList ) {
					try{
						exe.fallbackTask(message);
					}catch(Exception e1) {
						logger.error("task execute fallback error " + e1.getMessage() ,e1);
					}
				}
			}finally {
			    long fin = System.currentTimeMillis();
				if(needRellow) {
//				    redisTemplate.setEnableTransactionSupport(true);
//                    redisTemplate.multi();
                    
				    if(message.getExeTimes()>=message.getMaxExeTimes()) {
	                    redisTemplate.opsForList().rightPush(message.getTopic().getTaskErrorSet(), JSON.toJSONString(message));
	                    HashOperations<String,String,String>  ho =  redisTemplate. opsForHash( );
	                    redisTemplate.opsForZSet().remove(message.getTopic().getTaskExeSet(),message.getMessageKey());
	                    ho.delete(message.getTopic().getTaskDataMap(), message.getMessageKey());
				    
				    }else {
				        ListOperations<String,String>  lo = redisTemplate.opsForList();
	                    lo.rightPush(message.getTopic().getTaskListKey(), message.getMessageKey());
	                    redisTemplate.opsForZSet().remove(message.getTopic().getTaskExeSet(),message.getMessageKey());
	                    HashOperations<String,String,String>  ho = redisTemplate. opsForHash( );
	                    ho.put(message.getTopic().getTaskDataMap(),  message.getMessageKey(), JSON.toJSONString(message));
	                    redisTemplate.convertAndSend(message.getTopic().getTopicName(), message.getTopic().getTagName());
				    }
				    
				    int  ms = (int) (fin -start) ;
                    addExeResult(false ,ms);
//					redisTemplate.exec();
//					redisTemplate.setEnableTransactionSupport(false);
					logger.error("task execute rellow  "   +JSON.toJSONString(message));
				}else {
				    
//				    redisTemplate.setEnableTransactionSupport(true);
//                    redisTemplate.multi();
				    redisTemplate.opsForZSet().remove(message.getTopic().getTaskExeSet(),message.getMessageKey());
					HashOperations<String,String,String>  ho =	redisTemplate. opsForHash( );
					ho.delete(message.getTopic().getTaskDataMap(), message.getMessageKey());
//					redisTemplate.exec();
//                    redisTemplate.setEnableTransactionSupport(false);
					if(logger.isDebugEnabled()) {
						logger.debug("real Exeute message success : "+JSON.toJSONString(message));
					}
					
					int  ms = (int) (fin -start) ;
					addExeResult(true ,ms);
				}
			}
		}
		public BaseMessage getBaseMessage() {
			return this.message;
		}
	}
	
	
}
