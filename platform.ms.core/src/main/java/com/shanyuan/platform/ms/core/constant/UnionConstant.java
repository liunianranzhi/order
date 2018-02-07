package com.shanyuan.platform.ms.core.constant;

import com.shanyuan.platform.ms.base.common.util.ImageUtil;

/**
 * 联盟相关常量
 * @author zhangwd
 *
 */
public interface UnionConstant {

	/**
	 * 联盟类别 1 企业联盟 2 政府联盟
	 */
	public interface UnionType{
		
		/**
		 * 企业联盟
		 */
		Byte ENTERPRISE_UNION = 1;
		
		/**
		 * 政府联盟
		 */
		Byte GOVERNMENT_UNION = 2;
		
	}
	
	/**
	 * 显示状态 1 显示 2 不显示
	 */
	public interface UnionHidden{
		
		/**
		 * 显示
		 */
		Byte UNION_SHOW = 1;
		
		/**
		 * 不显示
		 */
		Byte UNION_HIDDEN = 2;
	}
	
	/**
	 * 可用状态 1 可用 2 不可用
	 */
	public interface UnionFree{
		
		/**
		 * 可用
		 */
		Byte UNION_USABLE = 1;
		
		/**
		 * 不可用
		 */
		Byte UNION_UNUSABLE = 2;
	}
	
	/**
	 * 是否删除：1正常，2删除
	 */
	public interface UnionDel{
		
		/**
		 * 正常
		 */
		Byte UNION_NORMAL = 1;
		
		/**
		 * 删除
		 */
		Byte UNION_DELETE = 2;
	}
	
	/**
	 * 试运营状态:1试运营,2正式运营
	 */
	public interface UnionOperation{
		
		/**
		 * 试运营
		 */
		Byte TRY_OPERATION = 1;
		
		/**
		 * 正式运营
		 */
		Byte NORMAL_OPERATION = 2;
	}
	
	/**
	 *  单位/组织标识代码
	 */
	public interface OrgCode{
		
		/**
		 * 一起善源
		 */
		String  CODE_17SY = "17sy";
		
		/**
		 * 中行
		 */
		String  CODE_BOC = "boc";
		
		/**
		 * 公益联盟
		 */
		String  CODE_GYLM = "gylm";
		
		/**
		 * 益客俱乐部
		 */
		String  CODE_YKJLB = "ykjlb";
		
		/**
		 * 国电
		 */
		String  CODE_GD = "gd";
	}
	
	/**
	 * 联盟是否参与排行榜：1参与  2不参与
	 */
	public interface TopListFlag{
		
		/**
		 * 1参与 
		 */
		byte YES = 1;
		
		/**
		 * 2不参与
		 */
		byte NO = 2;
	}
	
	/**
	 * 联盟帮扶类型  1供给侧,2帮扶侧  
	 */
	public interface UnionSupportType {
		
		/**
		 * 1供给侧
		 */
		byte GAVE = 1;

		/**
		 * 2帮扶侧  
		 */
		byte SUPPORT = 2;
	}

	/**
	 * 所属圈子id  
	 */
	public interface ParentCircle {
		
		/**
		 * 扶贫联盟圈子id
		 */
		Integer PARENT_CIRCLE_ID = 80;
	}
	
	/**
	 * 联盟相关redisKey
	 */
	public interface UnionRedisKey{
		
		/**
		 * 以新注册人数排序
		 */
		String SY_UNION_SORT_BYNEWENROLL = "sy_union_sort_by_new_enroll";
	}

	
	/**
	 * 联盟url拼接
	 */
	public interface UnionUrl{
		
		String UNION_MORE_URL =  "/bocm/index.php?act=index&op=showvue#/ranking_list";
	}
	
	/**
	 * 中行长武area_id
	 */
	public interface UnionArea{
		
		/**
		 * 中行长武县areaId
		 */
		Long ChangwuArea = 610428000000L;
	}
	
}
