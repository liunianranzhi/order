/**
 * 
 */
package com.shanyuan.platform.ms.deal.order.consumer;

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
import com.shanyuan.platform.ms.deal.order.execute.DealOrderExecutor;
import com.shanyuan.platform.ms.facade.constant.OrderFacadeConstant;

/**
 * @author 曹勇军
 *
 */
@Component
public class DealOrderConsumer {
    private final Logger logger = Logger.getLogger(getClass());
    
    @Autowired
    private StringRedisTemplate redisTemplate;
    
    @Autowired
    private DealOrderExecutor mexe;
    
    private final int poolSize=1000;
    
    @PostConstruct
    public void dealOrder() {
        logger.info("i am starting ");
        Topic t = new Topic(OrderFacadeConstant.PublishType.ORDER_TOPIC,OrderFacadeConstant.PublishType.ORDER_TAGNAME);
        List<TaskQueueExecute> exes  = new ArrayList<TaskQueueExecute>();
        exes.add(mexe);
        SubService ss = new SubService(redisTemplate,t,exes,poolSize,"orderAction");
        ss.start();
    }
}
