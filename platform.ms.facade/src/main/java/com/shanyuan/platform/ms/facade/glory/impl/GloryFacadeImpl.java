package com.shanyuan.platform.ms.facade.glory.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.user.GloryDealService;
import com.shanyuan.platform.ms.dao.user.entity.SyGloryTypeList;
import com.shanyuan.platform.ms.facade.glory.GloryFacade;
import com.shanyuan.platform.ms.facade.glory.impl.exceptype.GloryFacadeExcepType;

/** 
 * @author  wang chunru 
 * @date    2017年12月6日 下午5:06:13 
 * @Description   
 */
@Component
public class GloryFacadeImpl implements GloryFacade {
	
	@Autowired
	private GloryDealService gloryDealService;
	
	/**
	 * 获取勋章列表
	 */
	@Override
	public List<SyGloryTypeList> getGloryList(Integer onlineState) throws CoreServiceException {
		return this.gloryDealService.getAllGloryTypeList(onlineState);
	}
	
	/**
	 * 添加勋章
	 */
	@Override
	public int addGlory(SyGloryTypeList glory) throws CoreServiceException {
		if(ObjectUtils.isEmpty(glory)){
			throw new CoreServiceException(GloryFacadeExcepType.GLORY_NULL);
		}else if(!ObjectUtils.isEmpty(glory)) {
			//将勋章id设置为空，默认自增
			glory.setGloryId(null);
			//遍历勋章，得到勋章的名称集合gloryName和勋章显示顺序集合gloryShowIndex
			List<SyGloryTypeList> syGloryTypeList = this.getGloryList(null);
			List<String> gloryName =new ArrayList<String>();
			List<Integer> gloryShowIndex =new ArrayList<Integer>();
			for(SyGloryTypeList list :syGloryTypeList) {
				gloryName.add(list.getGloryName());
				gloryShowIndex.add(list.getGloryShowIndex());
			}
			
			if(ObjectUtils.isEmpty(glory.getGloryName())) {
				throw new CoreServiceException(GloryFacadeExcepType.GLORY_NAME_NULL);
			}
			if(ObjectUtils.isEmpty(glory.getGloryCode())) {
				throw new CoreServiceException(GloryFacadeExcepType.GLORY_CODE_NULL);
			}
			if (ObjectUtils.isEmpty(glory.getGloryShowIndex())) {
				throw new CoreServiceException(GloryFacadeExcepType.GLORY_ORDER_NULL);
			}
			if(ObjectUtils.isEmpty(glory.getGloryShowImgHilighted())) {
				throw new CoreServiceException(GloryFacadeExcepType.GLORY_LIGHTEN_PHOTO_NULL);
			}
			if(ObjectUtils.isEmpty(glory.getGloryShowImgGary())) {
				throw new CoreServiceException(GloryFacadeExcepType.GLORY_ORIGINAL_PHOTO_NULL );
			}
			if(ObjectUtils.isEmpty(glory.getGloryDescription())) {
				throw new CoreServiceException(GloryFacadeExcepType.GLORY_DISCRIBE_NULL);
			}
			if(ObjectUtils.isEmpty(glory.getOnlineState())) {
				throw new CoreServiceException(GloryFacadeExcepType.GLORY_STATE_NULL);
			}
			if(gloryName.contains(glory.getGloryName())) {
				throw new CoreServiceException(GloryFacadeExcepType.GLORY_NAME_REPEAT);
			}
			if (gloryShowIndex.contains(glory.getGloryShowIndex())) {
				throw new CoreServiceException(GloryFacadeExcepType.GLORY_ORDER_REPEAT);
			}
		}
		return this.gloryDealService.saveGlory(glory);
	}
	/**
	 * 更新勋章
	 */
	@Override
	public int updateGlory(SyGloryTypeList glory) throws CoreServiceException {
		return this.gloryDealService.updateGlory(glory);
	}
	
	/**
	 * 删除勋章
	 */
	@Override
	public int deleteGlory(Integer gloryId) throws CoreServiceException {
		return this.gloryDealService.deleteGlory(gloryId);
	}
	
}
