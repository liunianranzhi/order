package com.shanyuan.platform.ms.base.exception;

/**
 * @author lee
 *
 */
public interface CoreServiceExcepType {
    
    CoreServiceExcepType DEFAULT_TYPE = new ExcepType("default");
    
    /**
     * 用户必须进行输入验证码，重新登陆
     */
    CoreServiceExcepType VERIFY_CODE = new ExcepType("verify_by_code");
    
    /**
     * 用户必须进行输入验证码，由于是第一次注册，可以填写邀请码
     */
    CoreServiceExcepType INVITE_CODE = new ExcepType("invite_code");
    
    /**
     * 没有权限执行该操作
     */
    CoreServiceExcepType PERM_FAIL = new ExcepType("permission_fail");
    
    
    /**
     * 用户必须进行强制升级
     */
    CoreServiceExcepType UPGRADE_NOW = new ExcepType("upgrade_now");
    /**
     * 不能识别的请求
     */
    CoreServiceExcepType UNKNOW_REQ = new ExcepType("unknow_request");
    
    /**
     * MD5校验失败MD5_CODE
     */
    CoreServiceExcepType MD5_CODE = new ExcepType("check_md5_fail");
    
    /**
     * 必须需要验证码进行验证，非登录使用
     */
    CoreServiceExcepType SUBMIT_CODE = new ExcepType("submit_code");
    
    /**
     * rest请求失败
     */
    CoreServiceExcepType REQUEST_CODE = new ExcepType("request_fail");
    
    CoreServiceExcepType EMPTY_ORDER = new ExcepType("empty_order");
    
    /**
     * 缺少参数
     */
    CoreServiceExcepType MISS_PARAMETER = new ExcepType("mess_parameter");
    
    /**
     * opensearcherror有返回值
     */
    CoreServiceExcepType OPEN_SEARCH_QUERY_ERROR = new ExcepType("open_search_query_error");
    
    /**
     * 
     * @author 曹勇军
     * 下订单出错时判断是哪个业务出错精准插入sql失败类型
     */
    public interface OrderUpError{
    	/**
    	 * @author caoyongjun
    	 * 订单的添加积分业务出错
    	 */
    	CoreServiceExcepType ORDER_ADD_POINTS = new ExcepType("order_add_points");
    	/**
    	 * @author caoyongjun
    	 * 订单的更新积分业务出错
    	 */
    	CoreServiceExcepType ORDER_UP_POINTS = new ExcepType("order_up_points");
    	
    	/**
    	 * @author caoyongjun
    	 * 订单的更新扶贫码业务出错
    	 */
    	CoreServiceExcepType ORDER_UP_POOR_CODE = new ExcepType("order_up_poor_code");
    	
    	/**
    	 * @author caoyongjun
    	 * 订单的更新扶贫码业务出错
    	 */
    	CoreServiceExcepType ORDER_ADD_VOURCHER_CODE = new ExcepType("order_add_voucher_code");
    	/**
    	 * @author caoyongjun
    	 * 订单的更新优惠券业务出错
    	 */
    	CoreServiceExcepType ORDER_UP_VOURCHER_CODE = new ExcepType("order_up_voucher_code");
    	
    	/**
    	 * @author caoyongjun
    	 * 订单的更新库存业务出错
    	 */
    	CoreServiceExcepType ORDER_UP_STORE_COUNT = new ExcepType("order_up_store_count");
    }
    /**
     * 定义勋章插入时失败的类型
     * @author 冯祚
     *
     */
    public interface GloryServiceExcepType {
    	/**
    	 * 勋章对象为空
    	 */
    	CoreServiceExcepType GLORY_NULL = new ExcepType("glory_null");
    	/**
    	 * 勋章名称为空
    	 */
    	CoreServiceExcepType GLORY_NAME_NULL = new ExcepType("glory_name_null");
    	/**
    	 * 勋章名称重复
    	 */
    	CoreServiceExcepType GLORY_NAME_REPEAT = new ExcepType("glory_name_repeat");
    	/**
    	 * 勋章编号为空
    	 */
    	CoreServiceExcepType GLORY_CODE_NULL = new ExcepType("glory_code_repeat");
    	/**
    	 * 勋章显示顺序为空
    	 */
    	CoreServiceExcepType GLORY_ORDER_NULL = new ExcepType("glory_order_null");
    	/**
    	 * 勋章显示顺序重复
    	 */
    	CoreServiceExcepType GLORY_ORDER_REPEAT = new ExcepType("glory_order_repeat");
    	/**
    	 * 勋章点亮图片为空
    	 */
    	CoreServiceExcepType GLORY_LIGHTEN_PHOTO_NULL = new ExcepType("glory_lighten_photo_null");
    	/**
    	 * 勋章原始图片为空
    	 */
    	CoreServiceExcepType GLORY_ORIGINAL_PHOTO_NULL = new ExcepType("glory_priginal_photo_null");
    	/**
    	 * 勋章描述为空
    	 */
    	CoreServiceExcepType GLORY_DISCRIBE_NULL = new ExcepType("glory_discribe_null");
    	/**
    	 * 勋章状态为空
    	 */
    	CoreServiceExcepType GLORY_STATE_NULL = new ExcepType("glory_state_null");
    	/**
    	 * 勋章增加失败
    	 */
    	CoreServiceExcepType GLORY_ADD_FAILED = new ExcepType("glory_add_failed");
    	
    }
    /**
     * 定义勋章插入时失败的类型
     * @author 冯祚
     *
     */
    public interface PointServiceExcepType {
    	/**
    	 * 积分对象为空
    	 */
    	CoreServiceExcepType POINT_NULL = new ExcepType("point_null");
    	/**
    	 * 积分ID为空
    	 */
    	CoreServiceExcepType POINT_ID_NULL = new ExcepType("point_id_null");
    	/**
    	 * 积分会员ID为空
    	 */
    	CoreServiceExcepType POINT_MEMBER_ID_NULL = new ExcepType("point_member_id_null");
    	/**
    	 * 积分会员名字为空
    	 */
    	CoreServiceExcepType POINT_MEMBER_NAME_NULL = new ExcepType("point_member_name_null");
    	/**
    	 * 积分值为空
    	 */
    	CoreServiceExcepType POINT_VALUE_NULL = new ExcepType("point_value_null");
    	/**
    	 * 积分描述为空
    	 */
    	CoreServiceExcepType POINT_DESC_NULL = new ExcepType("point_desc_null");
    	/**
    	 * 积分操作阶段为空
    	 */
    	CoreServiceExcepType POINT_STAGE_NULL = new ExcepType("point_stage_null");
    	/**
    	 * 积分增加失败
    	 */
    	CoreServiceExcepType POINT_ADD_FAILED = new ExcepType("point_add_failed");
    	/**
    	 * 积分更新失败
    	 */
    	CoreServiceExcepType POINT_UPDATE_FAILED = new ExcepType("point_update_failed");
    	/**
    	 * 积分删除失败
    	 */
    	CoreServiceExcepType POINT_DELETE_FAILED = new ExcepType("point_delete_failed");
    	
    }
    /***
     * 获取类型名称
     * @return
     */
    public String getName();
    
    
    class ExcepType implements CoreServiceExcepType {
        
        final String name;
        
        public ExcepType(String name) {
            this.name = name;
        }

		public String getName() {
			return name;
		}
      
    }
    
}
