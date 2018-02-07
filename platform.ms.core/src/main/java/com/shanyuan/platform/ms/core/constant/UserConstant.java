package com.shanyuan.platform.ms.core.constant;

/**
 * user用户相关微服务中用到的常量
 * @author zhangwd
 *
 */
public interface UserConstant {

	/**
	 * 角色类型
	 * @author zhangwd
	 *
	 */
	public interface RoleType {
		/** 
		 * 农业主体：合作社和经营大户 
		 */
		Byte ROLE_TYPE_COOP=1;
		/**
		 *  商业主体：电商和网商
		 */
		Byte ROLE_TYPE_WS= 2;
		/**
		 *  责任主体 - 生产大户，农村能人，回乡创业人员
		 */
		Byte ROLE_TYPE_GOV= 3;
		/**
		 *  工业主体代理人
		 */
		Byte ROLE_TYPE_INDUSTRY= 4;
		/**
		 *  默认角色类型
		 */
		Byte ROLE_TYPE_DEFAULT_AGENT= ROLE_TYPE_WS;
		/**
		 * 善源商场角色类型		
		 */
		Byte  ROLE_TYPE_VENDOR= 20 ;
	}
	
	/**
	 * 默认收货地址
	 * @author zhangwd
	 */
	public interface idDefaultAddress{
		
		/**
	     * 1默认收货地址
	     */
		String IS_DEFAULT_ADDRESS = "1";
		
	}
	
	/**
	 * 注册相关状态
	 */
	public interface registerCorr {
		
		String ISREGISTER = "is_register";
	}
	
	/**
	 * 勋章可使用状态
	 */
	public interface GloryEnableState {
		
		/**
		 * 1 表示有效
		 */
		Integer ENABLESTATE = 1;
		
		/**
		 * 0 表示无效
		 */
		Integer DISENABLESTATE = 0;
		
	}
	
	/**
	 * 账户的类型
	 * @author sunyue
	 *
	 */
	public interface UserType{
		
		/**
		 *  个人
		 */
		byte USER_C=1;
		
		/**
		 *  企业
		 */
		byte  USER_B=2;
		
		/**
		 *  基金会
		 */
		byte  USER_P=3;
		
		/**
		 *  组织机构
		 */
		byte  USER_O =4;
		
		/**
		 *  受捐方
		 */
		byte  USER_BF=5;

	}
	
	/**
	 * 用户所在联盟
	 * @author zhangwd
	 */
	public interface UnionType{
		
		/**
		 * boc
		 */
		String BOC = "boc";
		
		/**
		 * ykjlb
		 */
		String YKJLB = "ykjlb";
	}
	
	/**
	 * 用户性别
	 * @author zhangwd
	 */
	public interface UserSexType{
		
		/**
		 * 男
		 */
		byte USER_SEX_MALE = 1;
		
		/**
		 * 女
		 */
		byte USER_SEX_FEMALE = 2;
	}
	
	/**
	 * 用户身份标识
	 * @author zhangwd
	 */
	public interface UserRoleType{
		/**
		 * 普通用户
		 */
		int USER_ROLE_COMMON_USER =  1;
		
		/**
		 * 无码益客
		 */
		int USER_ROLE_NOCODE_YIKE_USER =  2;
		
		/**
		 * 有码益客
		 */
		int USER_ROLE_CODE_YIKE_USER = 3;
		
		/**
		 * 部门管理员
		 */
		int USER_ROLE_ADMIN_USER =  4;
		
		/**
		 * 扶贫助理人
		 */
		int USER_ROLE_AGENT_USER = 5;
		
		/**
		 * 贫困户
		 */
		int USER_ROLE_POOR_USER = 6;
		
		/**
		 * 员工
		 */
		int USER_ROLE_EMPLOYEE_USER = 7;
	}
	
	/**
	 * 用户身份标识CODE
	 * @author zhangwd
	 */
	public interface UserRoleCode{
		
		/**
		 * 普通用户
		 */
		String COMMON = "common";
		
		/**
		 * 员工
		 */
		String EMP = "emp";
		
		/**
		 * 益客
		 */
		String YIKE = "yike";
		
		/**
		 *中行员工 
		 */
		String BOC_EMP = "boc_emp";
		
		/**
		 * 代理人
		 */
		String AGENT = "agent";
		
		/**
		 * 代理人
		 */
		String POOR = "poor";
		
		
		/**
		 * 其他
		 */
		String OTHER = "other";
	}
	/**
	 * 默认金额配置
	 * @author 王春如
	 *
	 */
	public interface DefaultMoney {
		/**
		 * 贫困户扶贫 目标金额/人
		 */
		Integer POOR_TARGET_MONEY = 3000;
	}
	/**
	 * 默认特殊县编号
	 * @author 王春如
	 *
	 */
	public interface SpecialArea {
		/**
		 * 长武县
		 */
		Long CHANGWU_AREA = 610428000000L;
	}
	/**
	 * 俱乐部
	 * @author 王春如
	 *
	 */
	public interface CircleClub {
		/**
		 * 益客俱乐部
		 */
		Integer CIRCLE_ID_WEAL_CLUB = 12310;
		/**
		 * 公益联盟企业
		 */
		Integer CIRCLE_ID_WEAL_ENTERPRISE = 12309;
	}
}
