package com.shanyuan.platform.ms.base.queue.redis;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

import org.apache.log4j.Logger;
import org.springframework.data.redis.core.RedisTemplate;

import com.shanyuan.platform.ms.base.queue.redis.bean.Topic;


public class SubServiceStatis {
    private final Logger  logger = Logger.getLogger(getClass());
    private final Topic topic ;
    private final  ArrayBlockingQueue<ExeResult> exeQueue = new ArrayBlockingQueue<ExeResult>(1024*1024);
    private final  RedisTemplate rt ;
    
    
    public SubServiceStatis(Topic topic , RedisTemplate rt ) {
        this.topic = topic;
        this.rt= rt;
    }
    
    class ExeResult{
        int exeMS ;
        long exeTime ;
        boolean succ;
        public ExeResult(int ms,boolean succ) {
            this.succ=succ;
            this.exeMS= ms ;
            this.exeTime = System.currentTimeMillis();
        }
    }
    
    public boolean addResult(boolean succ,int ms) {
        ExeResult er = new ExeResult(ms,succ);
        try {
              exeQueue.add(er);
              return true;
        } catch ( Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public void dealStatistics() {
        List<ExeResult> rlist = new ArrayList<ExeResult>();
        exeQueue.drainTo(rlist,1024);
        if(rlist.isEmpty()) {
            return ;
        }
        int succTime= 0 ;
        int failTime = 0 ;
        int max = 0 ;
        int min = 10000 ;
        long sum = 0L;
        int times = rlist.size();
        for(ExeResult er : rlist) {
            max =er.exeMS>=max?er.exeMS:max;
            min = er.exeMS<=min?er.exeMS:min;
            sum += er.exeMS;
            int m =er.succ?++succTime:++failTime;
        }
        int avg = (int) (sum/succTime);
        saveStatistics(succTime,failTime,max,min,times,avg);
    }
    
    private  void saveStatistics(int st,int ft, int max, int min ,int total ,int avg) {
      
       try {
           Object succObj= rt.opsForHash().get(topic.getTopicStatistKey(), topic.SUCCESS_STAT);
           rt.opsForHash().increment(topic.getTopicStatistKey(), topic.SUCCESS_STAT, st);
           rt.opsForHash().increment(topic.getTopicStatistKey(), topic.FAIL_STAT, ft);
           rt.opsForHash().increment(topic.getTopicStatistKey(), topic.TOTAL_STAT   , total);
           
           Object maxObj= rt.opsForHash().get(topic.getTopicStatistKey(), topic.MAX_STAT);
           int maxo = 0;
           if(maxObj!=null) {
               maxo= Integer.parseInt(maxObj.toString());
           }
           if(max > maxo) {
               rt.opsForHash().put(topic.getTopicStatistKey(), topic.MAX_STAT, max+"");
           }
           
           Object minObj= rt.opsForHash().get(topic.getTopicStatistKey(), topic.MIN_STAT);
           int mino = 0;
           if(minObj!=null) {
               mino= Integer.parseInt(minObj.toString());
           }
           if( mino == 0  ||min < mino) {
               rt.opsForHash().put(topic.getTopicStatistKey(), topic.MIN_STAT, min+"");
           }
           
           Object avgObj= rt.opsForHash().get(topic.getTopicStatistKey(), topic.AVEG_STAT);
           int avgo = 0;
           if(avgObj!=null) {
               avgo= Integer.parseInt(avgObj.toString());
           }
           int succo=0 ;
           if(succObj!=null) {
               succo = Integer.parseInt(succObj.toString());
           }
           if(st >0) {
               int navg = (avgo*succo +avg * st)/(succo+st);
               rt.opsForHash().put(topic.getTopicStatistKey(), topic.AVEG_STAT, navg+"");
           }
           
       }catch(Exception e) {
           logger.error(e.getMessage(),e);
       }
      
    }
    
}
