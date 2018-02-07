/**
 * 
 */
package com.shanyuan.platform.ms.core.user;



import com.shanyuan.platform.ms.dao.user.entity.SyPoor;

/**
 * @author 曹勇军
 *
 */
public interface SyPoorService {
	SyPoor getSyPoorByMemberId(Integer memberId);
	
	/**
	 * 获取自营贫困户总户数
	 * @author yangjian
	 * @param countryId
	 * @return
	 */
	Integer getSelfEmpPoorTotalFamily(Long countryId);
	
	/**
	 * 获取贫困户总人数
	 * @author yangjian
	 * @param countryId
	 * @return
	 */
	Integer getPoorTotalPeopleNum(Long countryId);
	
	/**
	 * 获取贫困户总户数
	 * @author yangjian
	 * @param countryId
	 * @return
	 */
	Integer getPoorTotalCount(Long countryId);
	
}
