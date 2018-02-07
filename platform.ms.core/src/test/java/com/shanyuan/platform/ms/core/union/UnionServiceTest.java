package com.shanyuan.platform.ms.core.union;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.data.redis.core.ZSetOperations.TypedTuple;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSONObject;
import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.base.common.util.HashMapperUtils;
import com.shanyuan.platform.ms.core.constant.UnionConstant;
import com.shanyuan.platform.ms.core.union.bo.UnionBo;
import com.shanyuan.platform.ms.core.union.bo.UnionStatisticBo;
import com.shanyuan.platform.ms.dao.union.entity.SyUnion;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class UnionServiceTest {

	
	@Autowired
	private StringRedisTemplate stringRedisTemplate;


	@Autowired
	private RedisTemplate redisTemplate;

	private final Logger logger = Logger.getLogger(getClass());
	@Autowired
	private UnionService unionService;
	
	@Test
	public void getRedisValue() {
		
		ValueOperations<String, String> opsForValue = stringRedisTemplate.opsForValue();
		
		String string = opsForValue.get("sy_union_top_list");
		JSONObject parse = (JSONObject) JSONObject.parse(string);
		JSONObject top_list = (JSONObject) parse.get("top_list");
		JSONObject union_top_list = (JSONObject) top_list.get("enrollment");
		
		
		Set<String> keySet = union_top_list.keySet();
		Iterator<String> iterator = keySet.iterator();
		int i = 1;
		while (iterator.hasNext()) {
			if(i>3){
                 break;
             }
			System.err.println(union_top_list.get(iterator.next()));
			i++; 
		}
		
		System.err.println(parse.get(""));
	}
	
	@Test
	public void unionScheduleTask()  {

		logger.info(System.currentTimeMillis());
		// 存储所有联盟的统计信息
		Map<String,UnionStatisticBo> usbMap = new TreeMap<>();
		
		ValueOperations<String, String> opsForValue = stringRedisTemplate.opsForValue();
		List<SyUnion> unionList = unionService.getUnionList();
		for (SyUnion union : unionList) {

			UnionStatisticBo uStatisticBo = unionService.getUnionCountInfo(union);
			uStatisticBo.setUnionChannel(union.getUnionChannel());
			uStatisticBo.setUnionId(union.getUnionId());
			uStatisticBo.setUnionName(union.getUnionName());
			uStatisticBo.setUnionRanking(0); //默认为0 
			// 缓存数据
			HashMapperUtils<UnionStatisticBo, String, Object> mapperUtils = HashMapperUtils.getInstance(UnionStatisticBo.class, String.class, Object.class);
			stringRedisTemplate.opsForHash().putAll("uni_" + union.getUnionId(), mapperUtils.toHash(uStatisticBo));
			stringRedisTemplate.opsForSet().add("uniset", "uni_" + union.getUnionId());
			usbMap.put(union.getUnionChannel() + "_" + union.getUnionId(), uStatisticBo);
		}
		//统计信息排序处理
		List<Map.Entry<String, UnionStatisticBo>> arrayList = new ArrayList<Map.Entry<String,UnionStatisticBo>>(usbMap.entrySet());
		//按新注册人数排序
		Collections.sort(arrayList, new Comparator<Map.Entry<String, UnionStatisticBo>>() {

			@Override
			public int compare(Entry<String, UnionStatisticBo> o1, Entry<String, UnionStatisticBo> o2) {
				
				return  o2.getValue().getUnionNewEnrollment() -  o1.getValue().getUnionNewEnrollment();
			}
		});
		
		//设置联盟的排名
		Set<String> keySet = usbMap.keySet();
		Iterator<String> iterator = keySet.iterator();
		for (int i = 1; iterator.hasNext(); i++) {
			usbMap.get(iterator.next()).setUnionRanking(i);
		}
		
		opsForValue.set(UnionConstant.UnionRedisKey.SY_UNION_SORT_BYNEWENROLL, JSONObject.toJSONString(usbMap));
	}
	
	
	/**
	 * 查询 首页选择联盟政企  
	 * @param unionHidden  是否显示
	 * @param unionDel	是否删除
	 * @param unionType 联盟类型
	 * @param count  查询条数
	 * @return
	 * @author zhangwd
	 */
	@Test
	public void selectUnion() {
		
		byte unionType = 1;
		Integer count = null;
		List<UnionBo> selectUnion = unionService.selectUnion( unionType, null, count);
	
		System.err.println( selectUnion );
	}
	
	@Test
	public void getRedisValueList() {
		
		ValueOperations<String, String> opsForValue = stringRedisTemplate.opsForValue();
		String string = opsForValue.get(UnionConstant.UnionRedisKey.SY_UNION_SORT_BYNEWENROLL);
		
		
		
		//JSONArray parse = (JSONArray) JSONArray.parse(string);
		JSONObject parse = (JSONObject) JSONObject.parse(string);
		
		System.err.println(parse.get(""));
	}
	
	@Test
	public void getOrderAmount() {
		
		Integer orderAmount = 0;
		try {
			orderAmount = unionService.getOrderAmount();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println(orderAmount);
	}
	
	@Test
	public void getZeroTime() {
		//long current=;
		long zero=System.currentTimeMillis()/(1000*3600*24)*(1000*3600*24) - TimeZone.getDefault().getRawOffset();
		
		System.err.println((int)(zero / 1000));
	}
	
	@Test
	public void getUnionTopList() {
		//Map<String, Object> unionTopList = unionService.getUnionTopList("boc");
	}
	
	@Test
	public void byteTest() {
		
		 /*ArrayList<Object> list = new ArrayList<>();
		 list.add(1);
		 list.add(2);
		 list.add(4);
		 list.add(3);
		 list.add(5);
		String jsonString = JSONUtils.toJSONString(list);
		System.err.println(jsonString);
		List<Integer> parse = (List<Integer>) JSONArray.parse(jsonString); 
		
		System.err.println(parse);*/
		
		ZSetOperations<String, String> opsForZSet = this.stringRedisTemplate.opsForZSet();
		Set<TypedTuple<String>> scores = opsForZSet.reverseRangeWithScores("aiset1", 0, 8);
		Iterator<TypedTuple<String>> iterator = scores.iterator();
		//System.err.println(list);
		while (iterator.hasNext()) {
			TypedTuple<String> next = iterator.next();
			String value = next.getValue();
			next.getScore();
			System.err.println(value);
			System.err.println(next.getScore());
			
		}
	}
	
	@Test
	public void TestTOUpper() {
		
		String str  = "union_new_enrollment";
		String newStr = null;
		int indexOf = this.name(str); //diyici
		if (indexOf != -1) {
			String subFirst = str.substring(0, indexOf);
			String substring = str.substring(indexOf + 1);
			char at = str.charAt(indexOf + 1);
			newStr = subFirst + StringUtils.upperCase(at + "") + substring;
		}
		
		System.err.println(newStr);
	}
	
	public int name( String str) {
		
		return str.indexOf("_");
	}
	
	
	@Test
	public void TestSort() {
		
		String string  = "{\r\n" + 
				"    \"shanxi1_14\": {\r\n" + 
				"        \"union_id\": \"14\",\r\n" + 
				"        \"union_channel\": \"shanxi1\",\r\n" + 
				"        \"union_name\": \"公益山西\",\r\n" + 
				"        \"union_spending\": \"41083\",\r\n" + 
				"        \"union_donation\": \"1074\",\r\n" + 
				"        \"union_ranking\": 1,\r\n" + 
				"        \"union_enrollment\": 182774,\r\n" + 
				"        \"union_new_enrollment\": 810,\r\n" + 
				"        \"union_points\": \"101\",\r\n" + 
				"        \"union_sales_amount\": \"3211047\",\r\n" + 
				"        \"union_info_url\": \"https://www.17shanyuan.com/bocm/index.php?act=union&op=index&union_id=14&channel=shanxi1\"\r\n" + 
				"    },\r\n" + 
				"    \"gd_2\": {\r\n" + 
				"        \"union_id\": \"2\",\r\n" + 
				"        \"union_channel\": \"gd\",\r\n" + 
				"        \"union_name\": \"公益国电测试\",\r\n" + 
				"        \"union_spending\": \"621072\",\r\n" + 
				"        \"union_donation\": \"33572\",\r\n" + 
				"        \"union_ranking\": 2,\r\n" + 
				"        \"union_enrollment\": 93275,\r\n" + 
				"        \"union_new_enrollment\": 345,\r\n" + 
				"        \"union_points\": \"143\",\r\n" + 
				"        \"union_sales_amount\": \"282499\",\r\n" + 
				"        \"union_info_url\": \"https://www.17shanyuan.com/bocm/index.php?act=union&op=index&union_id=2&channel=gd\"\r\n" + 
				"    },\r\n" + 
				"    \"tianjin_12\": {\r\n" + 
				"        \"union_id\": \"12\",\r\n" + 
				"        \"union_channel\": \"tianjin\",\r\n" + 
				"        \"union_name\": \"公益天津\",\r\n" + 
				"        \"union_spending\": \"675807\",\r\n" + 
				"        \"union_donation\": \"1965\",\r\n" + 
				"        \"union_ranking\": 3,\r\n" + 
				"        \"union_enrollment\": 18221,\r\n" + 
				"        \"union_new_enrollment\": 112,\r\n" + 
				"        \"union_points\": \"371\",\r\n" + 
				"        \"union_sales_amount\": \"654634\",\r\n" + 
				"        \"union_info_url\": \"https://www.17shanyuan.com/bocm/index.php?act=union&op=index&union_id=12&channel=tianjin\"\r\n" + 
				"    },\r\n" + 
				"    \"shebao_18\": {\r\n" + 
				"        \"union_id\": \"18\",\r\n" + 
				"        \"union_channel\": \"shebao\",\r\n" + 
				"        \"union_name\": \"公益社保\",\r\n" + 
				"        \"union_spending\": \"50793\",\r\n" + 
				"        \"union_donation\": \"35\",\r\n" + 
				"        \"union_ranking\": 4,\r\n" + 
				"        \"union_enrollment\": 227,\r\n" + 
				"        \"union_new_enrollment\": 6,\r\n" + 
				"        \"union_points\": \"2980\",\r\n" + 
				"        \"union_sales_amount\": \"12831\",\r\n" + 
				"        \"union_info_url\": \"https://www.17shanyuan.com/bocm/index.php?act=union&op=index&union_id=18&channel=shebao\"\r\n" + 
				"    },\r\n" + 
				"    \"jiangsu_24\": {\r\n" + 
				"        \"union_id\": \"24\",\r\n" + 
				"        \"union_channel\": \"jiangsu\",\r\n" + 
				"        \"union_name\": \"公益江苏\",\r\n" + 
				"        \"union_spending\": \"73071\",\r\n" + 
				"        \"union_donation\": \"316\",\r\n" + 
				"        \"union_ranking\": 5,\r\n" + 
				"        \"union_enrollment\": 11398,\r\n" + 
				"        \"union_new_enrollment\": 3,\r\n" + 
				"        \"union_points\": \"112\",\r\n" + 
				"        \"union_sales_amount\": \"23754\",\r\n" + 
				"        \"union_info_url\": \"https://www.17shanyuan.com/bocm/index.php?act=union&op=index&union_id=24&channel=jiangsu\"\r\n" + 
				"    },\r\n" + 
				"    \"shanxi_6\": {\r\n" + 
				"        \"union_id\": \"6\",\r\n" + 
				"        \"union_channel\": \"shanxi\",\r\n" + 
				"        \"union_name\": \"公益陕西\",\r\n" + 
				"        \"union_spending\": \"23303\",\r\n" + 
				"        \"union_donation\": \"291\",\r\n" + 
				"        \"union_ranking\": 6,\r\n" + 
				"        \"union_enrollment\": 6440,\r\n" + 
				"        \"union_new_enrollment\": 2,\r\n" + 
				"        \"union_points\": \"46\",\r\n" + 
				"        \"union_sales_amount\": \"118667\",\r\n" + 
				"        \"union_info_url\": \"https://www.17shanyuan.com/bocm/index.php?act=union&op=index&union_id=6&channel=shanxi\"\r\n" + 
				"    },\r\n" + 
				"    \"yunnan_10\": {\r\n" + 
				"        \"union_id\": \"10\",\r\n" + 
				"        \"union_channel\": \"yunnan\",\r\n" + 
				"        \"union_name\": \"公益云南\",\r\n" + 
				"        \"union_spending\": \"176099\",\r\n" + 
				"        \"union_donation\": \"919\",\r\n" + 
				"        \"union_ranking\": 7,\r\n" + 
				"        \"union_enrollment\": 3745,\r\n" + 
				"        \"union_new_enrollment\": 1,\r\n" + 
				"        \"union_points\": \"562\",\r\n" + 
				"        \"union_sales_amount\": \"212797\",\r\n" + 
				"        \"union_info_url\": \"https://www.17shanyuan.com/bocm/index.php?act=union&op=index&union_id=10&channel=yunnan\"\r\n" + 
				"    },\r\n" + 
				"    \"shandong_17\": {\r\n" + 
				"        \"union_id\": \"17\",\r\n" + 
				"        \"union_channel\": \"shandong\",\r\n" + 
				"        \"union_name\": \"公益青岛\",\r\n" + 
				"        \"union_spending\": \"3840\",\r\n" + 
				"        \"union_donation\": \"6\",\r\n" + 
				"        \"union_ranking\": 8,\r\n" + 
				"        \"union_enrollment\": 102,\r\n" + 
				"        \"union_new_enrollment\": 1,\r\n" + 
				"        \"union_points\": \"1054\",\r\n" + 
				"        \"union_sales_amount\": \"10680\",\r\n" + 
				"        \"union_info_url\": \"https://www.17shanyuan.com/bocm/index.php?act=union&op=index&union_id=17&channel=shandong\"\r\n" + 
				"    },\r\n" + 
				"    \"boc_1\": {\r\n" + 
				"        \"union_id\": \"1\",\r\n" + 
				"        \"union_channel\": \"boc\",\r\n" + 
				"        \"union_name\": \"公益中行\",\r\n" + 
				"        \"union_spending\": \"69019686\",\r\n" + 
				"        \"union_donation\": \"583074\",\r\n" + 
				"        \"union_ranking\": 9,\r\n" + 
				"        \"union_enrollment\": 715943,\r\n" + 
				"        \"union_new_enrollment\": 0,\r\n" + 
				"        \"union_points\": \"2313\",\r\n" + 
				"        \"union_sales_amount\": \"42582526\",\r\n" + 
				"        \"union_info_url\": \"https://www.17shanyuan.com/bocm/index.php?act=union&op=index&union_id=1&channel=boc\"\r\n" + 
				"    },\r\n" + 
				"    \"liaoning_9\": {\r\n" + 
				"        \"union_id\": \"9\",\r\n" + 
				"        \"union_channel\": \"liaoning\",\r\n" + 
				"        \"union_name\": \"公益辽宁\",\r\n" + 
				"        \"union_spending\": \"1013\",\r\n" + 
				"        \"union_donation\": \"125\",\r\n" + 
				"        \"union_ranking\": 10,\r\n" + 
				"        \"union_enrollment\": 507,\r\n" + 
				"        \"union_new_enrollment\": 0,\r\n" + 
				"        \"union_points\": \"57\",\r\n" + 
				"        \"union_sales_amount\": \"22876\",\r\n" + 
				"        \"union_info_url\": \"https://www.17shanyuan.com/bocm/index.php?act=union&op=index&union_id=9&channel=liaoning\"\r\n" + 
				"    },\r\n" + 
				"    \"hebei_15\": {\r\n" + 
				"        \"union_id\": \"15\",\r\n" + 
				"        \"union_channel\": \"hebei\",\r\n" + 
				"        \"union_name\": \"公益河北\",\r\n" + 
				"        \"union_spending\": \"4941\",\r\n" + 
				"        \"union_donation\": \"325\",\r\n" + 
				"        \"union_ranking\": 11,\r\n" + 
				"        \"union_enrollment\": 514,\r\n" + 
				"        \"union_new_enrollment\": 0,\r\n" + 
				"        \"union_points\": \"122\",\r\n" + 
				"        \"union_sales_amount\": \"35758\",\r\n" + 
				"        \"union_info_url\": \"https://www.17shanyuan.com/bocm/index.php?act=union&op=index&union_id=15&channel=hebei\"\r\n" + 
				"    },\r\n" + 
				"    \"ceshishi_35\": {\r\n" + 
				"        \"union_id\": \"35\",\r\n" + 
				"        \"union_channel\": \"ceshishi\",\r\n" + 
				"        \"union_name\": \"测试新联盟\",\r\n" + 
				"        \"union_spending\": \"0\",\r\n" + 
				"        \"union_donation\": \"0\",\r\n" + 
				"        \"union_ranking\": 12,\r\n" + 
				"        \"union_enrollment\": 0,\r\n" + 
				"        \"union_new_enrollment\": 0,\r\n" + 
				"        \"union_points\": 0,\r\n" + 
				"        \"union_sales_amount\": \"0\",\r\n" + 
				"        \"union_info_url\": \"https://www.17shanyuan.com/bocm/index.php?act=union&op=index&union_id=35&channel=ceshishi\"\r\n" + 
				"    }\r\n" + 
				"}";
		
		JSONObject parse = (JSONObject) JSONObject.parse(string);
		
		Iterator<String> it = parse.keySet().iterator();
		/*Set<Entry<String,Object>> entrySet = parse.entrySet();
		List<Map.Entry<String, JSONObject>> arrayList = new ArrayList<Map.Entry<String,JSONObject>>(((Collection<? extends Entry<String, JSONObject>>) parse.entrySet()));
		Collections.sort(arrayList, (o1, o2) -> o2. -  o1.getValue().getUnionNewEnrollment());*/
		while (it.hasNext()) {
			String next = it.next();
			
		}
		
		
	}


	@Test
	public  void testUnionChannel(){

        SyUnion shandong2 = unionService.getUnionByUnionChannel("shandong2");

        System.out.print(shandong2);
    }

    @Test
	public void testHashKeyExist(){

        Boolean aBoolean = redisTemplate.hasKey("uni_1");
        System.out.print(aBoolean);

    }
}












