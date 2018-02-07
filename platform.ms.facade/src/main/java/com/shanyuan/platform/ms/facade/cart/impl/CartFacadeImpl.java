/**
 * 
 */
package com.shanyuan.platform.ms.facade.cart.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.shanyuan.platform.ms.core.constant.OrderConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.cart.CartService;
import com.shanyuan.platform.ms.core.cart.bo.CartGoodsBo;
import com.shanyuan.platform.ms.core.cart.bo.SyCartBO;
import com.shanyuan.platform.ms.core.order.impl.exceptype.OrderServiceExcepType;
import com.shanyuan.platform.ms.core.store.SyStoreService;
import com.shanyuan.platform.ms.core.syshop.SyShopAccountService;
import com.shanyuan.platform.ms.core.user.UserCorrelationService;
import com.shanyuan.platform.ms.dao.cart.entity.SyCart;
import com.shanyuan.platform.ms.dao.user.entity.SyShopAccount;
import com.shanyuan.platform.ms.facade.cart.CartFacade;
import com.shanyuan.platform.ms.facade.cart.domain.CartListInfo;
import com.shanyuan.platform.ms.facade.goods.SearchGoodsFacade;

/**
 * @author 曹勇军
 *
 */
@Component
public class CartFacadeImpl implements CartFacade{
	
	private final static Logger logger=LoggerFactory.getLogger(SearchGoodsFacade.class);
	
	@Autowired
	private CartService cartService;
	
	@Autowired
	private UserCorrelationService userCorrelationService;
	@Autowired
	private SyStoreService storeService;
	@Autowired
	private SyShopAccountService syShopAccountService;
	
	/**
	 * @author zhongying
	 * @param memberId
	 * @return
	 * @throws CoreServiceException
	 */
	public Map<String , Object>cartListByMid(Integer memberId,Integer pagesize,Integer currentpage)throws CoreServiceException{
		
		Map<String, Object> cartListByMid = cartService.cartListByMid(memberId,pagesize,currentpage,null);
		String hasNext = (String)cartListByMid.get("hasNext");
        @SuppressWarnings("unchecked")
        List<Integer>  plist= ( List<Integer>)cartListByMid.get("publisherids");
        @SuppressWarnings("unchecked")
        List<Integer>  syshoplist= ( List<Integer>)cartListByMid.get("syshopids");
        @SuppressWarnings("unchecked")
        Map<String ,String>  ownertypes= ( Map<String ,String>)cartListByMid.get("ownertypes");
		@SuppressWarnings("unchecked")
		Map<String, List<CartGoodsBo>> cartMap =(Map<String, List<CartGoodsBo>>)cartListByMid.get("cartMap");
		List<CartListInfo> cartListInfo=new ArrayList<CartListInfo>();
        Map<Integer, String> memberMaps =  new HashMap<Integer, String>();
		if(!ObjectUtils.isEmpty(plist)){
          memberMaps = userCorrelationService.getMemberTrueNames(plist);
        }
		 Map<Integer, SyShopAccount> syshopInfo =  new HashMap<Integer, SyShopAccount>();
		if(!ObjectUtils.isEmpty(syshoplist)) {
			 syshopInfo = syShopAccountService.getSyshopInfo(syshoplist);
		}
		Map<String , Object>  data =new HashMap<String , Object>();
		for(String key:cartMap.keySet()) {
			CartListInfo cartInfo =new CartListInfo();
			List<CartGoodsBo> list = cartMap.get(key);
            Integer publiserId = list.get(0).getPublisherId();
            String ownertype = "";
            String turename="";
            if(!ObjectUtils.isEmpty(ownertypes)){
            	 ownertype = ownertypes.get(key);
                if(!ObjectUtils.isEmpty(memberMaps)){
                    
                    if(OrderConstant.orderType.order_agent.equals(ownertype)){
                        turename="助理人"+memberMaps.get(publiserId);
                    }else if(OrderConstant.orderType.order_poor.equals(ownertype)){
                        turename="贫困户"+memberMaps.get(publiserId);
                    }
                }
                if(OrderConstant.orderType.order_syshop.equals(ownertype)){
                    if(!ObjectUtils.isEmpty(syshopInfo)) {
                    	SyShopAccount syinfo = syshopInfo.get(publiserId);
                    	String companyAbbreviation = syinfo.getCompanyAbbreviation();
                    	String companyName = syinfo.getCompanyName();
                    	turename =ObjectUtils.isEmpty(companyAbbreviation)?companyName:companyAbbreviation;
                    	turename ="善企"+turename;
                    }
                }else if(OrderConstant.orderType.order_biz.equals(ownertype)) {
                	turename ="善源甄选";
                }
            }
            cartInfo.setOwnerType(ownertype);
			cartInfo.setSplitKey(key);
			cartInfo.setTrueName(turename);
			cartInfo.setCartlist(list);
			cartListInfo.add(cartInfo);
		}
		SyCart	 record= new SyCart();
		record.setBuyerId(memberId);
		record.setChecked((byte)1);
		SyCartBO numCart = cartService.getNumCart(record);
		data.put("cartListInfo", cartListInfo);
		data.put("allInfo", numCart);
		data.put("hasNext", hasNext);
		return data;
		}
	/**
	 * 添加购物车
	 *  by zy
	 */
	@Transactional(timeout=36000,rollbackFor=Throwable.class)
	public Map<String , Object> addNewCart(Integer memberId,Integer goodsId,Integer goodsNum)throws CoreServiceException{
		if(ObjectUtils.isEmpty(memberId)) {
			logger.info("memberId为空！, memberId={}", memberId);
			throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"memberId为空！");
		}
		Map<String , Object> data=new HashMap<String , Object>();
		List<Integer> userstoreId = storeService.getStoreIdByMid(memberId);
		cartService.addCartInfo(memberId, goodsId, goodsNum, userstoreId);
		return data;
	}
	/**
	 * 删除购物车
	 * by zy
	 */
	@Transactional(timeout=36000,rollbackFor=Throwable.class)
	public Map<String , Object> delCart(Integer memberId,Integer cartId)throws CoreServiceException{
		if(ObjectUtils.isEmpty(memberId)) {
			logger.info("memberId为空！, memberId={}", memberId);
			throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"memberId为空！");
		}
		SyCartBO deleteCartById = cartService.deleteCartById(cartId, memberId);
		Map<String , Object> data=new HashMap<String , Object>();
		data.put("cartInfo", deleteCartById);
		return data;
	}
	/**
	 * 更新购物车
	 */
	@Transactional(timeout=36000,rollbackFor=Throwable.class)
	public Map<String , Object> updateCart(Integer memberId,Integer cartId,Integer goodsNum,String ischeck)throws CoreServiceException{
		Map<String , Object> data=new HashMap<String , Object>();
		SyCartBO cart = cartService.updateNewCart(cartId, memberId, goodsNum, ischeck);
		data.put("cartInfo", cart);
		return data;
	}

}
