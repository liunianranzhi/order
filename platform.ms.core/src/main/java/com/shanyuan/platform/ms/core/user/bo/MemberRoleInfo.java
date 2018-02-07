package com.shanyuan.platform.ms.core.user.bo;

/**
 * 用户角色信息
 * @author zhangwd
 *
 */
public class MemberRoleInfo {
	
	/**
	 * 角色名称
	 */
	private String roleName ;  
	
	/**
	 * 角色编号
	 */
	private int code ;
	
	/**
	 * 是否为部门管理员
	 */
	private Boolean isAdmin ;
	
	/**
	 * 是否为团组织管理员
	 */
	private Boolean isOrgAdmin ;
	
	public MemberRoleInfo() {
		
	}
	
	
	public MemberRoleInfo(String roleName, int code, Boolean isAdmin, Boolean isOrgAdmin) {
		super();
		this.roleName = roleName;
		this.code = code;
		this.isAdmin = isAdmin;
		this.isOrgAdmin = isOrgAdmin;
	}


	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Boolean getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public Boolean getIsOrgAdmin() {
		return isOrgAdmin;
	}
	public void setIsOrgAdmin(Boolean isOrgAdmin) {
		this.isOrgAdmin = isOrgAdmin;
	}
	
}
