package com.shanyuan.platform.ms.core.constant;

/**
 * @author lee
 * 认证登录服务中使用的常量
 */
public interface AuthConstant {

	/**
	 * @author lee
	 * 用户登录类型的常量
	 */
	public interface LoginType {
		/**
		 * 使用验证码登录
		 */
		String CODE_LOGIN = "code_login";
		/**
		 * 使用密码登录
		 */
		String PWD_LOGIN ="pwd_login";
		
	}
	/**
	 * @author lee
	 * 使用白名单的登录类型
	 */
	public interface LoginType4WhiteList{
		/**
		 * 使用app登录
		 */
		String APP ="app";
		/**
		 * 使用pc登录
		 */
		String PC = "pc";
	}
	/**
	 * @author lee
	 * session中的存储的key
	 */
	public interface SessionKEY{
		/**
		 * 用户token ，来自于mb_user_token
		 */
		String TOKEN = "token";
		/**
		 * 用户是否登录
		 */
		String IS_LOGIN ="is_login" ;
		/**
		 * 用户id 
		 */
		String MEMBER_ID = "member_id" ;
		/**
		 * 用户名称
		 */
		String MEMBER_NAME = "member_name" ;
		/**
		 * 用户真实姓名
		 */
		String MEMBER_TRUENAME = "member_truename" ;
		/**
		 * 用户性别
		 */
		String MEMBER_SEX = "member_sex" ;
		/**
		 * 用户手机号
		 */
		String MEMBER_MOBILE = "member_mobile" ;
		/**
		 * 用户邮箱
		 */
		String MEMBER_EMAIL = "member_email" ;
		/**
		 * 用户是否买手
		 */
		String IS_BUY = "is_buy" ;
		/**
		 * 用户头像
		 */
		String MEMBRT_AVATAR = "member_avatar" ;
		/**
		 * 用户类型
		 */
		String MEMBER_TYPE = "member_type" ;
		/**
		 * 用户状态
		 */
		String MEMBER_STATE = "member_state" ;
		/**
		 * 组织id
		 */
		String CIRCLE_ID = "circle_id" ;
		/**
		 * 是否贫困户
		 */
		String IS_POOR= "is_poor" ;
		/**
		 * 是否助理人
		 */
		String IS_AGENT = "is_agent" ;
		/**
		 * 记录来源channel
		 */
		String SAVE_CHANNEL = "save_channel" ;
		/**
		 * 微信openid
		 */
		String WX_OPENID = "wx_openid" ;
		/**
		 * QQ openid
		 */
		String OPENID = "openid";
		/**
		 * 渠道
		 */
		String CHANNEL = "channel";
		
		/**
		 * 是否新注册
		 */
		String IS_REGISTER = "is_register";
		
	}
	
	/**
	 * @author lee
	 * cookie中存储的key
	 */
	public interface CookieKey {
		/**
		 * 存储用户session在redis中的key
		 */
		String USER_SESSION_TOKEN = "ust_ms";
	}
	/**
	 * @author lee
	 * redis中存储的和认证相关的key
	 */
	public interface RedisKey{
		/**
		 * redis存验证码的key的头部
		 */
		String PHONE_MCODE_PRE ="mcode_";
		/**
         * redis存手机发送短信的key的头部
         */
        String PHONE_SEND_PRE ="send_";
      
        /**
         * 存发送短信有序set的key
         */
        String SEND_TIMES_ZSET_PRE = "send_times_";
		
		/**
		 * 用户session的key的头部
		 */
		String USER_SESSION_TOKEN_PRE="usk_"; 
		/**
		 * 初始化勋章的key 的头部
		 */
		String GLORY_INIT_KEY_PRE="glory_init_key_";
		/**
		 * 平台用户计数的key
		 */
		String ALL_PLATFORM_USERS="platform_member_count";
		
		/**
		 * 图形验证码前缀
		 */
		String VCODE_PRE = "vcode_";
		/**
		 * 是否需要图形验证码
		 */
		String VCODE_EXPIRE_PRE = "vcode_expire_";


        /**
         * token hash前缀
         */
        String TOKEN_HASH_PRE = "token:hash:";
        /**
         * token hash zset
         */
        String TOKEN_HASH_SET = "token:zset";
	}
	
	public interface ClientType{
		String ANDROID = "android";
		String IOS = "ios";
	}
	
	/**
	 * 发送短信的页面
	 * @author 杨健
	 *
	 */
	public interface SmsRange{
		/**
		 * 全部   默认
		 */
		String ALL = "all";
		/**
		 * 仅老用户
		 */
		String HAS = "has";
		/**
		 * 仅未绑定
		 */
		String UNBIND = "unbind";
	}
	
	/**
	 * 短信签名
	 * @author 杨健
	 *
	 */
	public interface SmsPre{
		
		String SMS_CODE_PRE = "【一起善源】";
		
	}
	
}
