package com.yunengzhe.PVMTS.domain.vo;

import java.util.List;

public class QueryPointParam { 
	private String startTime;
	private String endTime;
	private String span; //时间跨度的余数 应该为0
	private String equipcontainerID;
	private String equipcontainerTableID;
	private String dateSpan; //时间跨度 300的整数倍
	private String measuerName;
	//生成参数
	private String id;
	private String startName; //历史表开始
	private String endName;  //历史表结束
	private List<String> tableName;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	 
	public List<String> getTableName() {
		return tableName;
	}
	public void setTableName(List<String> tableName) {
		this.tableName = tableName;
	}
	public String getStartName() {
		return startName;
	}
	public void setStartName(String startName) {
		this.startName = startName;
	}
	public String getEndName() {
		return endName;
	}
	public void setEndName(String endName) {
		this.endName = endName;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getSpan() {
		return span;
	}
	public void setSpan(String span) {
		this.span = span;
	}
  
	public String getMeasuerName() {
		return measuerName;
	}
	public void setMeasuerName(String measuerName) {
		this.measuerName = measuerName;
	}
	public String getEquipcontainerID() {
		return equipcontainerID;
	}
	public void setEquipcontainerID(String equipcontainerID) {
		this.equipcontainerID = equipcontainerID;
	}
	public String getEquipcontainerTableID() {
		return equipcontainerTableID;
	}
	public void setEquipcontainerTableID(String equipcontainerTableID) {
		this.equipcontainerTableID = equipcontainerTableID;
	}
	public String getDateSpan() {
		return dateSpan;
	}
	public void setDateSpan(String dateSpan) {
		this.dateSpan = dateSpan;
	}
	
	
}
