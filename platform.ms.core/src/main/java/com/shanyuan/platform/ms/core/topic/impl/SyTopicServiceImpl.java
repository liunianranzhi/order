package com.shanyuan.platform.ms.core.topic.impl;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.core.constant.GoodsConstant;
import com.shanyuan.platform.ms.core.constant.GoodsConstant.goodsType;
import com.shanyuan.platform.ms.core.topic.SyTopicService;
import com.shanyuan.platform.ms.core.topic.bo.TopicBo;
import com.shanyuan.platform.ms.core.topic.bo.TopicGoodsInfo;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.topic.bo.TopicListBo;
import com.shanyuan.platform.ms.core.topic.impl.exceptype.SyTopicServiceExcepType;
import com.shanyuan.platform.ms.dao.goods.entity.SyTopicGoods;
import com.shanyuan.platform.ms.dao.goods.mapper.SyTopicGoodsMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.*;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class SyTopicServiceImpl implements  SyTopicService{
    private static final Logger logger = LoggerFactory.getLogger(SyTopicServiceImpl.class);

    @Autowired
    private StringRedisTemplate redisTemplate;
    @Autowired
    private SyTopicGoodsMapper syTopicGoodsMapper;

    //专题活动商品价格库存等信息redis key前缀(完整为前缀拼上id);
    private String rkey_topic_goods_info = "sy_topic_goods_info_";
    //专题活动列表
    private String  rkey_topic_list="sy_topic_list" ;
    //楼层列表redis key前缀(完整为前缀拼上topic_id)
    private String rkey_floor_list="sy_topic_floor_list_" ;

    /**
     * 判断商品是否是活动期间的商品
     * $goods_id商品id
     */
    @Override
    public boolean isTopicStartGoods(Integer goodsid) throws CoreServiceException{
        String rkey=rkey_topic_goods_info+goodsid;
        return  redisTemplate.hasKey(rkey);

    }

    /**
     * 取活动的商品
     * @param topicid
     * @return
     * @throws CoreServiceException
     */
    public List<List<TopicBo>> getFloorList(Integer topicid) throws CoreServiceException{
        String rkey=rkey_floor_list+topicid;
        ValueOperations<String, String> str = redisTemplate.opsForValue();
        String s = str.get(rkey);
        try{
            List<List<TopicBo>>  biglist=new ArrayList<List<TopicBo>>();
            JSONArray lists= (JSONArray)JSONObject.parse(s);
            for(int i=0;i< lists.size();i++){
                JSONArray ob = (JSONArray)lists.get(i);
                List<TopicBo>  list=new ArrayList<TopicBo>();
                for(int j=0;j< ob.size();j++) {
                    TopicBo topic= new TopicBo();
                    JSONObject o = (JSONObject)ob.get(j);
                    String tids=  (String)o.get("topic_id");
                    Integer  tid =ObjectUtils.isEmpty(tids)?0:Integer.parseInt(tids);
                    String gids=  (String)o.get("goods_id");
                    Integer  gid =ObjectUtils.isEmpty(gids)?0:Integer.parseInt(gids);
                    String cids=  (String)o.get("goods_commonid");
                    Integer  cid =ObjectUtils.isEmpty(cids)?0:Integer.parseInt(cids);
                    String time=  (String)o.get("sale_start_time");
                    time =ObjectUtils.isEmpty(time)?"":time;
                    String limited=  (String)o.get("daily_limited");
                    limited =ObjectUtils.isEmpty(limited)?"":limited;
                    String sort=  (String)o.get("floor_sort");
                    sort =ObjectUtils.isEmpty(sort)?"":sort;
                    String type=  (String)o.get("floor_type");
                    type =ObjectUtils.isEmpty(type)?"":type;
                    String image=  (String)o.get("floor_image_url");
                    image =ObjectUtils.isEmpty(image)?"":image;
                    String show=  (String)o.get("show_url");
                    show =ObjectUtils.isEmpty(show)?"":show;
                    topic.setTopicId(tid);
                    topic.setGoodsId(gid);
                    topic.setGoodsCommonid(cid);
                    topic.setSaleStartTime(time);
                    topic.setDailyLimited(limited);
                    topic.setFloorSort(sort);
                    topic.setFloorType(type);
                    topic.setFloorImageUrl(image);
                    topic.setShowUrl(show);
                    list.add(topic);
                }

                biglist.add(list);
            }

            return biglist;
        }catch (Exception e) {
        logger.error("getFloorList topicid:"+topicid,e);
        throw new CoreServiceException(SyTopicServiceExcepType.topic_floor_error,"得到活动列表失败！",e);
        }

    }

    /**
     * 获得专题活动信息
     * @param topicid
     * @return
     * @throws CoreServiceException
     */
    public TopicListBo getTopicFromRedis(Integer topicid) throws CoreServiceException{
        String rkey= rkey_topic_list;
        if(redisTemplate.hasKey(rkey)){
            HashOperations<String, String, String> hashmap = redisTemplate.opsForHash();
            String o = hashmap.get(rkey, topicid.toString());
            try{
                TopicListBo bo=   new TopicListBo();
                if(!ObjectUtils.isEmpty(o)){
                    JSONObject list=(JSONObject)JSONObject.parse(o);
                    Integer id= (Integer)list.get("id");
                    String title= (String)list.get("topic_title");
                    title =ObjectUtils.isEmpty(title)?"":title;
                    String btime= (String)list.get("begin_time");
                    btime =ObjectUtils.isEmpty(btime)?"":btime;
                    String etime= (String)list.get("end_time");
                    etime =ObjectUtils.isEmpty(etime)?"":etime;
                    Boolean flag= (Boolean)list.get("init_flag");
                    flag =ObjectUtils.isEmpty(flag)?true:flag;
                    String status= (String)list.get("status");
                    status =ObjectUtils.isEmpty(status)?"":status;
                    String stitle= (String)list.get("share_title");
                    stitle =ObjectUtils.isEmpty(stitle)?"":stitle;
                    String subtitle= (String)list.get("share_subtitle");
                    subtitle =ObjectUtils.isEmpty(subtitle)?"":subtitle;
                    String icon= (String)list.get("share_icon");
                    icon =ObjectUtils.isEmpty(icon)?"":icon;
                    String guide= (String)list.get("down_guide");
                    guide =ObjectUtils.isEmpty(guide)?"":guide;
                    bo.setId(id);
                    bo.setTopicTitle(title);
                    bo.setBeginTime(btime);
                    bo.setEndTime(etime);
                    bo.setInitFlag(flag);
                    bo.setStatus(status);
                    bo.setShareTitle(stitle);
                    bo.setShareSubtitle(subtitle);
                    bo.setShareIcon(icon);
                    bo.setDownGuide(guide);
                }
                return bo;
            }catch (Exception e) {
                logger.error("getTopicFromRedis topicid:"+topicid,e);
                throw new CoreServiceException(SyTopicServiceExcepType.topic_floor_error,"获得专题活动信息！",e);
            }
        }else{
            return null;
        }
    }

    /**
     * 获得活动信息
     * @param goodsid
     * @return
     * @throws CoreServiceException
     */
    public TopicGoodsInfo getTopicGoods(Integer goodsid) throws CoreServiceException{
        TopicGoodsInfo topic=new TopicGoodsInfo();
        try {
            if(!this.isTopicStartGoods(goodsid)) {
                topic.setGoodsStatus(GoodsConstant.TopicStatus.no_start);
                return topic;
            }
            String rkey=rkey_topic_goods_info+goodsid;
            HashOperations<String,String,String> ho =  redisTemplate. opsForHash();
            String topicId = ho.get(rkey, "topic_id");
            Integer tid= ObjectUtils.isEmpty(topicId)?0:Integer.parseInt(topicId);
            String goodsId = ho.get(rkey, "goods_id");
            Integer gid= ObjectUtils.isEmpty(goodsId)?0:Integer.parseInt(goodsId);
            String actSaleNum = ho.get(rkey, "act_sale_num");
            Integer salenum= ObjectUtils.isEmpty(actSaleNum)?0:Integer.parseInt(actSaleNum);
            String actGoodsStorage = ho.get(rkey, "act_goods_storage");
            Integer storage= ObjectUtils.isEmpty(actGoodsStorage)?0:Integer.parseInt(actGoodsStorage);
            String floorsSort = ho.get(rkey, "floor_sort");
            Integer fsort= ObjectUtils.isEmpty(floorsSort)?0:Integer.parseInt(floorsSort);
            String goodsCommonid = ho.get(rkey, "goods_commonid");
            Integer cid= ObjectUtils.isEmpty(goodsCommonid)?0:Integer.parseInt(goodsCommonid);
            String todaySale =  ho.get(rkey, "today_sale");
            Integer tsale= ObjectUtils.isEmpty(todaySale)?0:Integer.parseInt(todaySale);
            String todayNum =  ho.get(rkey, "today_num");
            Integer tnum= ObjectUtils.isEmpty(todayNum)?0:Integer.parseInt(todayNum);
            String actBocPoints =  ho.get(rkey, "act_boc_points");
            Integer bpoints= ObjectUtils.isEmpty(actBocPoints)?0:Integer.parseInt(actBocPoints);
            //String
            String dailyLimited =  ho.get(rkey, "daily_limited");
            String saleStartTime =  ho.get(rkey, "sale_start_time");

            String purchasePrice = ho.get(rkey, "purchase_price");
            BigDecimal pprice= ObjectUtils.isEmpty(purchasePrice)?BigDecimal.ZERO:new BigDecimal(purchasePrice);
            String actGoodsPrice = ho.get(rkey, "act_goods_price");
            BigDecimal goodsprice= ObjectUtils.isEmpty(actGoodsPrice)?BigDecimal.ZERO:new BigDecimal(actGoodsPrice);
            String bocPointRate = ho.get(rkey, "boc_point_rate");
            BigDecimal brate= ObjectUtils.isEmpty(bocPointRate)?BigDecimal.ZERO:new BigDecimal(bocPointRate);
            String bocPointsPrice = ho.get(rkey, "boc_points_price");
            BigDecimal bprice= ObjectUtils.isEmpty(bocPointsPrice)?BigDecimal.ZERO:new BigDecimal(bocPointsPrice);
            String note=GoodsConstant.TopicStatus.can_buy;
            Integer acstorage=0;
            if(storage!=0) {
                acstorage=  storage-salenum;//正真的实际库存
            }
            if(acstorage<=0) {
                note=GoodsConstant.TopicStatus.no_storage;
            }
            if("1".equals(dailyLimited)){
                note =GoodsConstant.TopicStatus.limit_time;
                acstorage=tnum-tsale;//正真的实际库存
                if(!ObjectUtils.isEmpty(saleStartTime)){
                    Long longTimes = DateUtil.getLongTimes(saleStartTime);//开始时间
                    Long now = DateUtil.getNowLong();//当前时间
                    if(now*1000>=longTimes){
                        if(tsale <tnum){
                            note = GoodsConstant.TopicStatus.can_buy;
                        }else{
                            note= GoodsConstant.TopicStatus.today_finish;
                        }
                    }
                }
            }
            topic.setTopicId(tid);
            topic.setGoodsId(gid);
            topic.setGoodsCommonid(cid);
            topic.setActGoodsStorage(storage);
            topic.setActSaleNum(salenum);
            topic.setFloorsSort(fsort);
            topic.setTodaySale(tsale);
            topic.setTodayNum(tnum);
            topic.setActBocPoints(bpoints);

            topic.setDailyLimited(dailyLimited);
            topic.setSaleStartTime(saleStartTime);
            topic.setGoodsStatus(note);
            if( GoodsConstant.TopicStatus.can_buy.equals(note)) {
                topic.setGoodsType(goodsType.isTopic);
            }else {
                topic.setGoodsType(goodsType.notTopic);
            }

            topic.setPurchasePrice(pprice);
            topic.setActGoodsPrice(goodsprice);
            topic.setBocPointRate(brate);
            topic.setBocPointsPrice(bprice);
            topic.setActStorage(acstorage);
        }catch (Exception e) {
            logger.error("getTopicGoods goodsid:"+goodsid,e);
            throw new CoreServiceException(SyTopicServiceExcepType.topic_info_error,"获取活动信息失败",e);
        }

        return  topic;
    }
    /***
     *更新销量，并不更新库存
     * @param goodsid
     * @param salenum
     * @return
     * @throws CoreServiceException
     */
    public Integer updateTopicGoodsSaleNum(Integer goodsid,Integer salenum) throws CoreServiceException{
        String rkey=rkey_topic_goods_info+goodsid;
        HashOperations<String,String,String> ho =  redisTemplate. opsForHash();
        String topic_id = ho.get(rkey, "topic_id");
        salenum = ObjectUtils.isEmpty(salenum)?0:salenum;
        Integer row=0;
        if(ObjectUtils.isEmpty(topic_id)){
            return row;
        }
        try{
            SyTopicGoods topic= new SyTopicGoods();
            Integer topicid=Integer.parseInt(topic_id);
            topic.setTopicId(topicid);
            topic.setGoodsId(goodsid);
            topic.setActSaleNum(salenum.longValue());
            if(salenum >0){
                row = syTopicGoodsMapper.updateMoreNum(topic);
                //更新redis
                ho.increment(rkey,"act_sale_num",salenum);
            }else{
                row = syTopicGoodsMapper.updateLessNum(topic);
                //更新redis
                ho.increment(rkey,"act_sale_num",salenum);
            }
            String today_sale = ho.get(rkey, "today_sale");
            if(!ObjectUtils.isEmpty(today_sale)&&salenum >0){
                ho.increment(rkey,"today_sale",salenum);
            }
        }catch (Exception e){
            logger.error("updateTopicGoodsSaleNum goodsid:"+goodsid,e);
            throw new CoreServiceException(SyTopicServiceExcepType.update_topic_error,"更新销量失败",e);
        }
        return row;

    }
    /**
     * 
     * @param keys
     * @return
     */
	  public List<String> getStringRedis(List<String> keys) {    
	        final RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
	        List<Object> pwdLogList=redisTemplate.executePipelined(new RedisCallback<String>() {
	            @Override    
	            public String doInRedis(RedisConnection conn)    
	                    throws DataAccessException {
	            	for(String key:keys){
	            		byte[] listName  = serializer.serialize(key);
	                    conn.get(listName);
	            	}
	                return null;
	            }    
	        }, serializer);    
	        if(logger.isDebugEnabled()) {
	        	 System.err.println("executePipelined:"+JSON.toJSONString(pwdLogList)); 
	        }
	          
	        ArrayList<String> newList=new ArrayList<String>();  
	        Iterator<Object> iterator = pwdLogList.iterator();
	        while(iterator.hasNext()) {
	        	Object next = iterator.next();
	        	if(next !=null) {
	        		newList.add(String.valueOf(next));    
	        	}
	        }
	        return newList;    
	    }
}
