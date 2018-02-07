package com.shanyuan.platform.ms.core.goods;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.core.goods.bo.SyGoodsClassBo;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsClassInfo;

/**
 * 
 * @author 冯祚
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class SyGoodsClassServiceTest {
	@Autowired
	private SyGoodsClassService syGoodsClassService;
	/**
	 * 获取模块显示类型列表测试用例
	 */
	@Test
	public void getGoodsClassListByModuleTest() {
		Integer module = 3;
		List<SyGoodsClassBo> listBo = syGoodsClassService.getGoodsClassListByModule(module);
		for(SyGoodsClassBo bo : listBo) {
			System.err.println(bo.getGcName());
		}
		System.err.println(listBo);
	}
	/**
	 * 根据父id查分类列表测试用例
	 */
	@Test
	public void getGoodsClassListByParentIdTest() {
		Integer parentId = 1058;
		List<SyGoodsClassInfo> syGoodsClasses = syGoodsClassService.getGoodsClassListByParentId(parentId);
		for(SyGoodsClassInfo goodsClassInfo : syGoodsClasses) {
			System.err.println(goodsClassInfo.getGcName());
		}
		System.err.println(syGoodsClasses);
	}
	/**
	 * 获取指定模块商品所有类型测试用例
	 */
	@Test
	public void getGoodsClassListTest() {
		Integer moduleClassId = 1058;
		SyGoodsClassBo goodsClassBoList = syGoodsClassService.getGoodsClassList(moduleClassId);
		System.err.println(goodsClassBoList);
	}
	/**
	 * 查询集采分类信息 根据 集采模板id测试用例
	 */
	@Test
	public void getBizGoodsClassByGcIdTest() {
		Integer gcId = 1809;
		byte classState = '1';
		//BizGoodsClassManager selectByExample = syGoodsClassService.getBizGoodsClassByGcId(gcId, classState);
		//System.err.println(selectByExample);
	}
	/**
	 * 测试用例
	 */
	@Test
	public void selectGoodsClassByParentIdsTest() {
		List<Integer> parentIds = new ArrayList<>();
		Map<Integer,List<SyGoodsClassInfo>> goodsClass = syGoodsClassService.selectGoodsClassByParentIds(parentIds);
		System.err.println(goodsClass);
	}
	/**
	 * 测试用例
	 */
	@Test
	public void selectGoodsByGcidTest() {
		List<Integer> gcIds = new ArrayList<>();
		gcIds.add(1329);
		Integer goodsState = 0;
		Integer goodsProjectType = 17;
		List<Integer> selectGoodsByGcid = syGoodsClassService.selectGoodsByGcid(gcIds, goodsState, goodsProjectType);
	//	List<Integer> selectGoodsByGcid = syGoodsClassService.selectGoodsByGcid(null, null, null);
		System.err.println(selectGoodsByGcid);
	}
	
	
}
