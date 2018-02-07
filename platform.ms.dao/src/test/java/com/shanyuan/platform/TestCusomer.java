package com.shanyuan.platform;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import com.shanyuan.platform.ms.base.queue.redis.SubService;
import com.shanyuan.platform.ms.base.queue.redis.TaskQueueExecute;
import com.shanyuan.platform.ms.base.queue.redis.bean.Topic;


@Component
public class TestCusomer {
    private final Logger logger = Logger.getLogger(getClass());
    @Autowired
    private StringRedisTemplate redisTemplate;
    @Autowired
    private MyTestExecutor mexe;
    
    @PostConstruct
    public void myTest() {
        logger.info("i am starting ");
        Topic t = new Topic("order","dealOrder");
        List<TaskQueueExecute> exes  = new ArrayList<TaskQueueExecute>();
        exes.add(mexe);
        SubService ss = new SubService(redisTemplate,t,exes,5,"mytest");
        ss.start();
    }
}
