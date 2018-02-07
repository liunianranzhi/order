package com.shanyuan.platform.ms.core.user;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.core.user.bo.AddressBo;
import com.shanyuan.platform.ms.dao.user.entity.SyAddress;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class AddressManagerServiceTest {

	@Autowired
	private AddressManagerService addressManagerService;
	/**
	 * @author rzm
	 * 根据memberid和addressid查询地址
	 */
	@Test
	public void getAddressByIdAndUserIdTest() {
		Integer addressId=36;
		Integer memberId=38;
		String isDefault=null;
		Byte addressType=null;
		SyAddress addressByIdAndUserId = addressManagerService.getAddressByIdAndUserId(addressId, memberId, isDefault, addressType);
		System.out.println(addressByIdAndUserId);
	}
	
	/**
	 * @author Rzm
	 * 根据address，member，lastId查询是否有对应的List<SyAddress>;
	 */
	@Test
	public void checkHasKeyTest() {
		Long lastId=0L;
		Integer memberId=40;
		String address="北京市旧鼓楼大街张旺胡同17号";
		List<SyAddress> checkHasKey = addressManagerService.checkHasKey(address, memberId, lastId);
		System.out.println(checkHasKey);
	}
	/**
	 * @author Rzm
	 * 查询除传入address_id以外的所有用户id
	 */
	@Test
	public void getOtherAddressTest() {
		Integer memberId=39;
		Integer addressId=527552;
		Byte addressType=null;
		String orderBy=null;
		List<AddressBo> otherAddress = addressManagerService.getOtherAddress(memberId, addressId, addressType, orderBy);
		System.out.println(otherAddress);
	}
	
	/**
	 * @author Rzm
	 * 将member_id用户的address_id设为默认地址
	 */
	@Test
	public void setDefaultAddressTest() {
		Integer addressId =639277;
		Integer memberId = 39;
		Byte addressType= 0;
		addressManagerService.updateDefaultAddress(addressId, memberId, addressType);
	}
	
	/**
	 * @author Rzm
	 * 将memberId的用户所有地址设为认
	 */
	@Test
	public void setNotDefault() {
		Integer memberId=39;
		Byte addressType=0;
		addressManagerService.updateNotDefault(memberId, addressType);;
	}
	/**
	 * @author Rzm
	 * 修改address_id的地址状态
	 */
	@Test
	public void updateAddressTest() {
		Integer addressId=639277;
		Integer memberId=39;
		Long areaId=555666L;
		Long cityId=1001010L;
		String areaInfo ="河北省 涿州市";
		String address="河北省涿州市长空路108号";	
		String momPhone="任拯民";
		String trueName="13731285308";
		String isDefault="0";
		String oldisDefault= "1";
		Byte addressType =0;
		Long lastId=0L;
		Integer addressId2=527552;
		addressManagerService.updateAddress(addressId, memberId, areaId, cityId, areaInfo , address, momPhone, trueName, isDefault, oldisDefault, addressType, lastId, addressId2);
	}
	/**
	 * @author Rzm
	 * 查询用户地址数量
	 */
	@Test
	public void getCountByMidTest() {
		Integer memberId=39;
		String isDefault=null;
		Byte addressType=0;
		Integer countByMid = addressManagerService.getCountByMid(memberId, isDefault, addressType);
		System.out.println(countByMid);
	}
	/**
	 * @author Rzm
	 * 添加新地址(保证member_id,address,last_id,address_type)不完全相同
	 */
	@Test
	public void addAddressTest() {
		
		Integer memberId =0;
		Long areaId=0L;
		Long cityId=0L;
		String areaInfo="陕西省 咸阳市 淳化县 十里塬镇 三里塬村";
		String telPhone="13930271208";
		String trueName="任拯民";
		String address="河北省涿州市宏远二号院109号";
		String momPhone=null;
		String isDefault="1";
		Byte addressType=1;
		Long lastId=0L;
		SyAddress addAddress = addressManagerService.addAddress(memberId, areaId, cityId, areaInfo, address, telPhone, trueName, momPhone, isDefault, addressType, lastId);
		System.out.println(addAddress);
	}
	/**
	 * @author Rzm
	 * 根据Type不同，添加或编辑一个新地址。
	 */
	@Test
	public void editAddressTest() {
		Integer addressId=1;
		Integer memberId=0;
		Long xianId=12L;
		Long shiId=123L;
		String type="add";
		String areaInfo="河北 石家庄";
		String address="河北省石家庄市河北科技大学";
		String telPhone="13731285308";
		String trueName="任拯民";
		Long lastId = 0L;
		String isDefault ="1";
		AddressBo editAddress = addressManagerService.editAddress(addressId, memberId, xianId, shiId, type, areaInfo, address, telPhone, trueName, lastId, isDefault);
		System.out.println(editAddress);
		
	}
	/**
	 * @author Rzm
	 * 根据addressid和memeberid对用户地址进行删除
	 */
	@Test
	public void delAddress() {
		Integer addressId =928183;
		Integer memberId= 0;
		String type="del";
		Boolean delAddress = addressManagerService.delAddress(addressId, memberId, type);
		System.out.println(delAddress);
	}
//	
//	// @Test
//	public void updateAddressByMember() {
//
//		SyAddress member = addressManagerService.updatByPrimaryKeySlelctive(1, 1, 659004000000L, 37L, "北京市",
//				"望京方恒国际中心C座1117", "zhangwende", "18301487900", UserConstant.idDefaultAddress.IS_DEFAULT_ADDRESS,
//				(byte) 0, 611024100000L);
//		System.err.println(member);
//	}
//
//	
//	
//	
//	
//	
//	// @Test
//	public void addAddress() {
//
//		// memberId areaId cityId
//
//		SyAddress flag = addressManagerService.addAddress(2, 120223000001L, 120200000000L, "北京市 市辖区 西城区", "宋家庄",
//				"18301487900", "zhangwende", "", "1", (byte) 0, 110106000000L);
//		System.err.println(flag);
//	}
//
//	// @Test
//	public void deleteAddress() {
//		Boolean flag = addressManagerService.deleteAddress(899486, 8474, 899485, "1");
//		System.err.println(flag);
//	}
//	
//	
//	@Test
//	public void getAddress() {
//
//		List<AddressBo> address = addressManagerService.getAddress(1, null, null);
//		System.err.println(address);
//	}
}
