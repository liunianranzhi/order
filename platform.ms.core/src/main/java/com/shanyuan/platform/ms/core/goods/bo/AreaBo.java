package com.shanyuan.platform.ms.core.goods.bo;

public class AreaBo {
	
	private Long areaId;
	
	private Long cityId;
	
	private Long provinceId;
	
	private String areaName;
	
	private String cityName;
	
	private String provinceName;
	
	private String specialtyStore; // 特产馆名称
	
	

	public AreaBo() {
		super();
		// TODO Auto-generated constructor stub
	}





	public AreaBo(Long areaId, Long cityId, Long provinceId, String areaName, String cityName, String provinceName, String specialtyStore) {
		super();
		this.areaId = areaId;
		this.cityId = cityId;
		this.provinceId = provinceId;
		this.areaName = areaName;
		this.cityName = cityName;
		this.provinceName = provinceName;
		this.specialtyStore = specialtyStore;
	}





	public Long getAreaId() {
		return areaId;
	}





	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}





	public Long getCityId() {
		return cityId;
	}





	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}





	public Long getProvinceId() {
		return provinceId;
	}





	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}





	public String getAreaName() {
		return areaName;
	}





	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}





	public String getCityName() {
		return cityName;
	}





	public void setCityName(String cityName) {
		this.cityName = cityName;
	}





	public String getProvinceName() {
		return provinceName;
	}





	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}





	public String getSpecialtyStore() {
		return specialtyStore;
	}





	public void setSpecialtyStore(String specialtyStore) {
		this.specialtyStore = specialtyStore;
	}

	
	
	
	

}
