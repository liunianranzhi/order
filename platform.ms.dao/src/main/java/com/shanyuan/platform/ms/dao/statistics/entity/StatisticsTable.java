package com.shanyuan.platform.ms.dao.statistics.entity;


/**
 * 表实体类
 * @author yangjian
 * @date 2017/12/25
 *
 */
public class StatisticsTable {
	
	private String tableName;

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	
	public StatisticsTable(String tableName){
		this.tableName = tableName;
	}
	
	public StatisticsTable(){
		super();
	}

}
