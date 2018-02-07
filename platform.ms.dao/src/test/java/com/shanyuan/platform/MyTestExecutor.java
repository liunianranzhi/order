package com.shanyuan.platform;

import java.util.Map;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.base.queue.redis.TaskQueueExecute;
import com.shanyuan.platform.ms.base.queue.redis.bean.BaseMessage;
import com.shanyuan.platform.ms.base.queue.redis.bean.MessageData;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
@Component
public class MyTestExecutor implements TaskQueueExecute {
    
    @Override
    public void executeTask(BaseMessage data) throws CoreServiceException {
    	
    	Map<String,Object> jsonData = JSON.parseObject(JSON.toJSONString(data), Map.class);
    	SyMember member=(SyMember) jsonData.get("data");
    	
    	Map<String,Object> data2=(Map<String, Object>) jsonData.get("data2");
    	
    	
    	
//    	System.out.println("============="+member.getMemberId()+"    "+member.getMemberName());
//    	System.out.println("============="+data2.toString());
//    	System.out.println("============="+jsonData.get("memberName"));
    	
        if(RandomUtils.nextInt(1, 9)>2) {
            System.out.println("============="+JSON.toJSONString(data));
        }else {
           try {
            Thread.currentThread().sleep(10);
           } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
           }
        }
        
        
    }

    @Override
    public void fallbackTask(BaseMessage data) throws CoreServiceException {
        System.out.println("=====i am  fallback========"+JSON.toJSONString(data));
        
    }

}
