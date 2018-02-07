package com.shanyuan.platform.ms.facade.topic.impl;


import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.base.common.util.ImageUtil;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.topic.SyTopicService;
import com.shanyuan.platform.ms.core.topic.bo.TopicBo;
import com.shanyuan.platform.ms.core.topic.bo.TopicGoodsInfo;
import com.shanyuan.platform.ms.core.topic.bo.TopicListBo;
import com.shanyuan.platform.ms.core.topic.impl.exceptype.SyTopicServiceExcepType;
import com.shanyuan.platform.ms.facade.topic.TopicFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.util.*;

/**
 * zhongying
 *
 */
@Component
public class TopicFacadeImpl implements TopicFacade {
    static final Logger logger = LoggerFactory.getLogger(TopicFacadeImpl.class);
    @Autowired
    private SyTopicService topicService;

    /**
     * 获得活动列表
     * @param topicid
     * @return
     * @throws CoreServiceException
     */
    public Map<String,Object> getTopicGoodsList(Integer topicid,Integer pageSize,Integer currentpage)throws CoreServiceException {
        Map<String,Object> map= new HashMap<String,Object>();
        if(ObjectUtils.isEmpty(topicid)){
            logger.error("getTopicGoodsList  topicid:"+topicid);
            throw new CoreServiceException(SyTopicServiceExcepType.params_error,"topicid 不能为空~");
        }
        List< List<TopicBo>> oldlist=topicService.getFloorList(topicid);
        List< List<TopicBo>> list=new ArrayList< List<TopicBo>>();
        String hasNext="N";
        if(!ObjectUtils.isEmpty(oldlist)){
            pageSize =ObjectUtils.isEmpty(pageSize)||pageSize<0?20:pageSize;
            currentpage =ObjectUtils.isEmpty(currentpage)||currentpage<0?1:currentpage;
                Integer start= (currentpage-1)*pageSize;
                if(!ObjectUtils.isEmpty(oldlist)) {
                    Integer size = oldlist.size();
                    hasNext =size<(pageSize)*currentpage?"N":"Y";
                    Integer showcount=size<(pageSize)*currentpage?size:(pageSize)*currentpage;
                    if(showcount<start){
                        logger.error("getTopicGoodsList 当前页数： currentpage:"+currentpage+"error;总记录数 size："+size);
                        throw new CoreServiceException(SyTopicServiceExcepType.params_error,"参数currentpage不正确~");
                    }
                    list=oldlist.subList(start, showcount);
                }
            Iterator<List<TopicBo>> iterator = list.iterator();
            while(iterator.hasNext()){
                List<TopicBo> listo = iterator.next();
                Iterator<TopicBo> tbo = listo.iterator();

                while (tbo.hasNext()){
                    TopicBo bo = tbo.next();
                    String goodsStatus="";
                    Integer actStorage=0;
                    Integer aTime=0;
                    String floorType = bo.getFloorType();
                    if("0".equals(floorType)){//商品
                        Integer goodsId = bo.getGoodsId();
                        TopicGoodsInfo topicGoods = topicService.getTopicGoods(goodsId);
                        if(!ObjectUtils.isEmpty(topicGoods)){
                            goodsStatus = topicGoods.getGoodsStatus();
                            actStorage = ObjectUtils.isEmpty(topicGoods.getActStorage())?0:topicGoods.getActStorage();

                        }
                        String startTime = bo.getSaleStartTime();
                        if(!ObjectUtils.isEmpty(startTime)&&!"0".equals(floorType)){
                            Long longTimes = DateUtil.getLongTimes(startTime);
                            aTime=(int)(longTimes/1000);
                        }
                    }

                    bo.setStartTime(aTime);
                    bo.setGoodsStatus(goodsStatus);
                    bo.setActStorage(actStorage);
                }

            }
        }

        TopicListBo topicFromRedis = topicService.getTopicFromRedis(topicid);
        String topicUrl = ImageUtil.getTopicUrl(topicFromRedis.getShareIcon(), null);
        topicFromRedis.setShareIconUrl(topicUrl);
        map.put("list",  list);
        map.put("topicInfo",topicFromRedis);
        map.put("hasNext",    hasNext);
        return map;
    }
}
