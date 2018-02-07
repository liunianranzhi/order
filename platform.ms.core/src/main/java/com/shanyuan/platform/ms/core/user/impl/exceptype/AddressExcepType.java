package com.shanyuan.platform.ms.core.user.impl.exceptype;

import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType;

public interface AddressExcepType extends CoreServiceExcepType{

	
    CoreServiceExcepType insert_address_fail = new ExcepType("insert_address_fail");

    CoreServiceExcepType update_address_fail = new ExcepType("update_address_fail");
    CoreServiceExcepType set_default_fail = new ExcepType("set_default_fail");
    CoreServiceExcepType set_not_default_fail = new ExcepType("set_not_default_fail");
    CoreServiceExcepType telphone_error = new ExcepType("telphone_error");
    
    CoreServiceExcepType del_address_fail = new ExcepType("del_address_fail");
    CoreServiceExcepType areaid_error = new ExcepType("areaid_error");
    CoreServiceExcepType addressId_error = new ExcepType("addressId_error");
    CoreServiceExcepType missing_parameter = new ExcepType("missing_parameter");
    CoreServiceExcepType address_existed = new ExcepType("address_existed");
    CoreServiceExcepType address_not_existed = new ExcepType("address_not_existed");
    CoreServiceExcepType params_too_long = new ExcepType("address_too_long");
}

