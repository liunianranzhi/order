package com.shanyuan.platform.ms.base.queue.redis.impl;

import java.util.Date;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.shanyuan.platform.ms.base.queue.redis.PublishService;
import com.shanyuan.platform.ms.base.queue.redis.bean.BaseMessage;
import com.shanyuan.platform.ms.base.queue.redis.bean.MessageData;
import com.shanyuan.platform.ms.base.queue.redis.bean.Topic;
@Component
public  final class PublishServiceImpl implements PublishService{
    private final Logger logger = Logger.getLogger(getClass());
    @Autowired
    public StringRedisTemplate redisTemplate ;
    
    
    


    @Override
    public void publishStringMessage(String topic, String tag, String data, String searchKey, String type) {

        Topic t = new Topic(topic ,tag);
        String key = UUID.randomUUID().toString().replaceAll("-", "").toLowerCase();
        MessageData md = new MessageData(key,t,new Date(),data); 
        md.setSearchKey(searchKey);
        md.setType(type);
        String mesString = JSON.toJSONString(md);
        if(logger.isDebugEnabled()) {
            logger.debug("taskQueue init  Message : " +mesString);
        }
        try {
//            redisTemplate.setEnableTransactionSupport(true);
//            redisTemplate.multi();
            String mapkey = t.getTaskDataMap();
            HashOperations<String,String,String>  ho =  redisTemplate. opsForHash( );
            ho.put(mapkey, key, mesString);
            if(logger.isDebugEnabled()) {
                logger.debug("taskQueue map hput  Message : " +mapkey+ JSON.toJSONString(md));
            }
            ListOperations<String,String>  lo = redisTemplate.opsForList();
            lo.rightPush(t.getTaskListKey(), key);
            if(logger.isDebugEnabled()) {
                logger.debug("taskQueue list rpush  Message : " + t.getTaskListKey() +" : "+key);
            }
            redisTemplate.convertAndSend(t.getTopicName(), t.getTagName());
            if(logger.isDebugEnabled()) {
                logger.debug("taskQueue pub  Message : " + t.getTopicName()+" : "+ t.getTagName());
            }
//            redisTemplate.exec();
//            redisTemplate.setEnableTransactionSupport(false);
        }catch(Exception e ) {
            HashOperations<String,String,String>  ho =  redisTemplate. opsForHash( );
            ho.delete(t.getTaskDataMap(), key);
            ListOperations<String,String>  lo = redisTemplate.opsForList();
            lo.remove(t.getTaskListKey(),-1, key);
            logger.error("taskQueue pub error : "+e.getMessage(), e);
        }finally {
            
            if(logger.isDebugEnabled()) {
                logger.debug("taskQueue finish pub  Message : " + t.getTopicName()+" : "+ t.getTagName());
            }
        }
        
    }


    @Override
    public void publishMessage(BaseMessage message) {
        Topic t =message.getTopic();
        String key = UUID.randomUUID().toString().replaceAll("-", "").toLowerCase();
        String mesString = JSON.toJSONString(message);
        if(logger.isDebugEnabled()) {
            logger.debug("taskQueue init  Message : " +mesString);
        }
        try {
//            redisTemplate.setEnableTransactionSupport(true);
//            redisTemplate.multi();
            String mapkey = t.getTaskDataMap();
            HashOperations<String,String,String>  ho =  redisTemplate. opsForHash( );
            ho.put(mapkey, key, mesString);
            if(logger.isDebugEnabled()) {
                logger.debug("taskQueue map hput  Message : " +mapkey+ JSON.toJSONString(message));
            }
            ListOperations<String,String>  lo = redisTemplate.opsForList();
            lo.rightPush(t.getTaskListKey(), key);
            if(logger.isDebugEnabled()) {
                logger.debug("taskQueue list rpush  Message : " + t.getTaskListKey() +" : "+key);
            }
            redisTemplate.convertAndSend(t.getTopicName(), t.getTagName());
            if(logger.isDebugEnabled()) {
                logger.debug("taskQueue pub  Message : " + t.getTopicName()+" : "+ t.getTagName());
            }
//            redisTemplate.exec();
        }catch(Exception e ) {
            HashOperations<String,String,String>  ho =  redisTemplate. opsForHash( );
            ho.delete(t.getTaskDataMap(), key);
            ListOperations<String,String>  lo = redisTemplate.opsForList();
            lo.remove(t.getTaskListKey(),-1, key);
            logger.error("taskQueue pub error : "+e.getMessage(), e);
        }finally {
            
            if(logger.isDebugEnabled()) {
                logger.debug("taskQueue finish pub  Message : " + t.getTopicName()+" : "+ t.getTagName());
            }
        }
        
    }
    
}
