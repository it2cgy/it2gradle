package com.yunengzhe.PVMTS.domain.dto.monitor;

import java.util.Date;
 
import com.fasterxml.jackson.annotation.JsonFormat;

public class PointReqDTO {
	private int analoginputId;  
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+08:00")
	private Date startTime; 
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+08:00")
	private Date endTime;
	private long minutesSpan;//两个测点之间的测量间隔单位为分钟
	 
	private int haveReal;
	
	
	public int getHaveReal() {
		return haveReal;
	}
	public void setHaveReal(int haveReal) {
		this.haveReal = haveReal;
	}
 
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public long getMinutesSpan() {
		return minutesSpan;
	}
	public void setMinutesSpan(long minutesSpan) {
		this.minutesSpan = minutesSpan;
	}
	public int getAnaloginputId() {
		return analoginputId;
	}
	public void setAnaloginputId(int analoginputId) {
		this.analoginputId = analoginputId;
	}
	 
}
