package com.yunengzhe.PVMTS.domain.dto;

public class NoticeUpdateInfoDTO {
	private String name;
	private String typeId;//公告类型ID
	private String remarks;
	private String bodyHtmlText;
	private String status;//发布状态
	private String id;
	
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getBodyHtmlText() {
		return bodyHtmlText;
	}
	public void setBodyHtmlText(String bodyHtmlText) {
		this.bodyHtmlText = bodyHtmlText;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
