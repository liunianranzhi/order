package com.shanyuan.platform.ms.facade.constant;

/**
 * 
 * @author zhangwd
 *
 */
public interface UserFacadeConstant {

	/**
	 * 首页用户信息接口点击url
	 */
	public interface UserClickUrl{
		
		/**
		 * 用户是员工  公益排名url
		 */
		String DEPT_RANK_URL = "/bocm/index.php?act=rank&op=index";
		
		/**
		 * 用户是员工 益客数量为0 去邀请url
		 */
		String INVITE_NUM_URL = "/bocm/index.php?act=mhome&op=weal_club_invite&from=app&appVariant=pwcn";
	
		/**
		 * 不是中行员工 公益积分url
		 */
		String BOC_POINTS_URL  = "/bocm/index.php?act=point&op=point_detail_list&appVariant=pwcn";
	
		/**
		 * 用户是益客  消费次数为0 时，去逛逛url
		 */
		String BUY_NUM_URL = "/bocm/index.php?act=goods&op=search_poor_goods_list&from_action=index";
		
		/**
		 * 用户是益客 公益项目为0 时， 去围观url
		 */
		String WEAL_NUM_URL = "/bocm/index.php?act=index&op=showvue#/pubwel_list?project_mode=";
	
		/**
		 * 普通用户完善个人信息url
		 */
		String CODE_FALSE_URL = "/bocm/index.php?act=home&op=choose_boc_member_v1";
		
		/**
		 * 用户默认头像
		 */
		String MEMBER_DEFAULT_URL = "/boc/templates/default/assets/images/man_1710.png";
		
		/**
		 * 结队贫困户url
		 */
		String POOR_URL = "/bocm/index.php?act=home&op=my_support_poor&from=app&appVariant=pwcn";
	}
	
	/**
	 * 首页联盟默认title
	 */
	public interface HomePageTitle{
		
		/**
		 * 默认
		 */
		String TOP_TITLE = "一起善源  公益中国";
	}
	/**
	 * 分页信息
	 */
	public interface Pages{
		
		/**
		 * 默认pagesize
		 */
		Integer POINT_LIST_PAGE_SIZE = 20;
		/**
		 * 默认pageNo
		 */
		Integer PAGE_NUM = 1;
	}
}
