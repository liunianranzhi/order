package com.shanyuan.platform.ms.facade.auth.domain;

import java.util.List;

public class UnionDomain {

	/**
	 * 全部联盟
	 */
	private List<UnionInfo> allUnion;
	/**
	 * 政府联盟
	 */
	private List<UnionInfo> govUnion;
	/**
	 * 企业联盟
	 */
	private List<UnionInfo> comUnion;
	
	public UnionDomain(){
		super();
	}
	
	public UnionDomain(List<UnionInfo> allUnion, List<UnionInfo> govUnion, List<UnionInfo> comUnion){
		this.allUnion = allUnion;
		this.govUnion = govUnion;
		this.comUnion = comUnion;
	}
	
	public List<UnionInfo> getAllUnion() {
		return allUnion;
	}
	public void setAllUnion(List<UnionInfo> allUnion) {
		this.allUnion = allUnion;
	}
	public List<UnionInfo> getGovUnion() {
		return govUnion;
	}
	public void setGovUnion(List<UnionInfo> govUnion) {
		this.govUnion = govUnion;
	}
	public List<UnionInfo> getComUnion() {
		return comUnion;
	}
	public void setComUnion(List<UnionInfo> comUnion) {
		this.comUnion = comUnion;
	}
	
}
