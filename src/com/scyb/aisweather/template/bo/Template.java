package com.scyb.aisweather.template.bo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import org.apache.struts2.json.annotations.JSON;

import com.scyb.aisweather.message.bo.MessageValue;

/**
 * Template entity. @author MyEclipse Persistence Tools
 */

public class Template implements java.io.Serializable {

	// Fields    

	private String guid;
	private String templateName;
	private Integer intervalTime;
	private Date definite;
	private String remark;
	private Date createTime;
	private Set<Station> stations;
	private Set<MessageValue> messageValues;

	public Template() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Template(String guid, String templateName, Integer intervalTime,
			Integer countdown, Date definite, String remark, Date createTime,
			Set stations) {
		super();
		this.guid = guid;
		this.templateName = templateName;
		this.intervalTime = intervalTime;
		this.definite = definite;
		this.remark = remark;
		this.createTime = createTime;
		this.stations = stations;
	}

	public Template(String templateName, Integer intervalTime, Date definite, String remark, Date createTime) {
		super();
		this.templateName = templateName;
		this.intervalTime = intervalTime;
		this.definite = definite;
		this.remark = remark;
		this.createTime = createTime;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public Integer getIntervalTime() {
		return intervalTime;
	}

	public void setIntervalTime(Integer intervalTime) {
		this.intervalTime = intervalTime;
	}
	
	@JSON(format="yyyy-MM-dd HH:mm:ss")
	public Date getDefinite() {
		return definite;
	}

	public void setDefinite(Date definite) {
		this.definite = definite;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set getStations() {
		return stations;
	}

	public void setStations(Set stations) {
		this.stations = stations;
	}
	
	@JSON(format="yyyy-MM-dd HH:mm:ss")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Set getMessageValues() {
		return messageValues;
	}

	public void setMessageValues(Set messageValues) {
		this.messageValues = messageValues;
	}

}