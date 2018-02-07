package com.shanyuan.platform.ms.core.constant;

public interface LoginConstant {

	public interface LoginType {
		String CODE_LOGIN = "code_login";
		String PWD_LOGIN = "pwd_login";
		String WX_LOGIN = "wx_login";
	}
	public interface LoginType4WhiteList{
		String APP ="app";
		String PC = "pc";
	}
	public interface SessionKEY{
		String TOKEN = "token";
		String IS_LOGIN ="is_login" ;
		String MEMBER_ID = "member_id" ;
		String MEMBER_NAME = "member_name" ;
		String MEMBER_TRUENAME = "member_truename" ;
		String MEMBER_SEX = "member_sex" ;
		String MEMBER_MOBILE = "member_mobile" ;
		String MEMBER_EMAIL = "member_email" ;
		String IS_BUY = "is_buy" ;
		String MEMBRT_AVATAR = "member_avatar" ;
		String MEMBER_TYPE = "member_type" ;
		String MEMBER_STATE = "member_state" ;
		String CIRCLE_ID = "circle_id" ;
		String IS_POOR= "is_poor" ;
		String IS_AGENT = "is_agent" ;
		String SAVE_CHANNEL = "save_channel" ;
		String WX_OPENID = "wx_openid" ;
		String OPENID = "openid";
		String CHANNEL = "channel";
		
	}
	public interface RoleType {
		// 农业主体：合作社和经营大户
		Byte ROLE_TYPE_COOP=1;
		// 商业主体：电商和网商
		Byte ROLE_TYPE_WS= 2;
		// 责任主体 - 生产大户，农村能人，回乡创业人员
		Byte ROLE_TYPE_GOV= 3;
		// 工业主体代理人
		Byte ROLE_TYPE_INDUSTRY= 4;
		// 默认角色类型
		Byte ROLE_TYPE_DEFAULT_AGENT= ROLE_TYPE_WS;
		//善源商场角色类型		
		Byte  ROLE_TYPE_VENDOR= 20 ;
	}
	public interface ClientType {
		String ANDROID = "android";
		String IOS = "ios";
	}
	public interface RedisKey{
		String PHONE_MCODE_PRE ="mcode_";
//		String ALL_MCODE_SEND_HISTORY = "mcode_history_map";
		String USER_SESSION_TOKEN_PRE="usk_"; 
		String GLORY_INIT_KEY_PRE="glory_init_key_";
		String ALL_PLATFORM_USERS="sy_platform_member_count";
	}
	
	public interface CookieKey {
		String USER_SESSION_TOKEN = "ust_ms";
	}
	
	public interface CircleMemberState{
		//申请中
		Byte CIRCLE_MEMBER_STATE_WAIT_AUTHEN_APPROVAL= 0 ;
		//已通过
		Byte CIRCLE_MEMBER_STATE_ENABLED= 1 ;
		//未通过
		Byte CIRCLE_MEMBER_STATE_DISABLED= 2 ;
	}
	
	/**
	 *  单位/组织标识代码
	 * @author lee
	 */
	public interface CircleCode{
		 
		/**
		 *  一起善源
		 */
		String CODE_17SY = "17sy";
		/**
		 * 中行
		 */
		String CODE_BOC = "boc";
		/**
		 *公益联盟 
		 */
		String CODE_GYLM = "gylm";
		/**
		 *益客俱乐部 
		 */
		String CODE_YKJLB = "ykjlb";
		String CODE_GD = "gd";
	}
	
	/**
	 * @author lee
	 *商家入驻状态定义
	 */
	public interface StoreStatus{
		 
		/**
		 * 新申请
		 */
		int STORE_JOIN_STATE_NEW=10;
		/**
		 * 完成付款
		 */
		int STORE_JOIN_STATE_PAY=11;
		/**
		 *  自动创建店铺
		 */
		int STORE_JOIN_STATE_AUTO_CREATE=12;
		/**
		 * 初审成功
		 */
		int STORE_JOIN_STATE_VERIFY_SUCCESS=20;
		/**
		 * 初审失败
		 */
		int STORE_JOIN_STATE_VERIFY_FAIL=30;
		/**
		 * 付款审核失败
		 */
		int STORE_JOIN_STATE_PAY_FAIL=31;
		/**
		 *  开店成功
		 */
		int STORE_JOIN_STATE_FINAL=40;
	}
	
	/**
	 * @author lee
	 *  账户类型
	 */
	public interface UserType{
		
		/**
		 *  个人
		 */
		Byte USER_C=1;
		/**
		 *  企业
		 */
		Byte USER_B=2;
		/**
		 * 基金会
		 */
		Byte USER_P=3;
		/**
		 * 组织机构
		 */
		Byte USER_O=4;
		/**
		 * 受捐方
		 */
		Byte USER_BF=5;
	}
	
	/**
	 * @author lee
	 *用户身份标识
	 */
	public interface UserRole{
		int USER_ROLE_COMMON_USER=1;
		int USER_ROLE_NOCODE_YIKE_USER=2;
		int USER_ROLE_CODE_YIKE_USER=3;
		int USER_ROLE_ADMIN_USER=4;
		int USER_ROLE_AGENT_USER=5;
		int USER_ROLE_POOR_USER=6;
		int USER_ROLE_EMPLOYEE_USER=7;
	}
	
	/**
	 * 
	 */
	public interface FacadeContants{
		String BOC_CIRCLE= "BOC_CIRCLE";
		String MEMBER= "MEMBER";
		String SESSION= "SESSION";
		String POOR= "POOR";
		String ROLE= "ROLE";
		String ISREGISTER = "is_register";
	}
}
