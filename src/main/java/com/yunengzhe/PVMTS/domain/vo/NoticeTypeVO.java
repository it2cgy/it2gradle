package com.yunengzhe.PVMTS.domain.vo;

import java.io.Serializable;

public class NoticeTypeVO implements Serializable {
	private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
