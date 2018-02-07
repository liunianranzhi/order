package com.shanyuan.platform.ms.facade.topic;


import com.shanyuan.platform.ms.base.exception.CoreServiceException;

import java.util.Map;

public interface TopicFacade {
    /**
     * 专题活动
     * @param topicid
     * @param pageSize
     * @param currentpage
     * @return
     * @throws CoreServiceException
     */
    Map<String,Object> getTopicGoodsList(Integer topicid, Integer pageSize, Integer currentpage)throws CoreServiceException;
}