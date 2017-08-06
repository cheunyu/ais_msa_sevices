package com.scyb.aisweather.message.bo;

import java.util.Date;

import com.scyb.aisweather.template.bo.Template;

/**
 * MessageValue entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class MessageValue implements java.io.Serializable {

	// Fields

	private String guid;
	private String lon;
	private String lat;
	private String dataType;
	private Integer dataTime;
	private Template template;
	private Date sendTime;
	private Date nextTime;
	private Date createTime;

	// Constructors

	/** default constructor */
	public MessageValue() {
	}

	/** minimal constructor */
	public MessageValue(String guid) {
		this.guid = guid;
	}

	/** full constructor */
	public MessageValue(String guid, String lon, String lat, String dataType,
			Integer dataTime, Template template, Date createTime,
			Date sendTime, Date nextTime) {
		this.guid = guid;
		this.lon = lon;
		this.lat = lat;
		this.dataType = dataType;
		this.dataTime = dataTime;
		this.template = template;
		this.sendTime = sendTime;
		this.nextTime = nextTime;
		this.createTime = createTime;
	}

	// Property accessors

	public MessageValue(String lon, String lat, String dataType,
			Integer dataTime, Template template, Date createTime,
			Date sendTime, Date nextTime) {
		super();
		this.lon = lon;
		this.lat = lat;
		this.dataType = dataType;
		this.dataTime = dataTime;
		this.template = template;
		this.sendTime = sendTime;
		this.nextTime = nextTime;
		this.createTime = createTime;
	}

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getLon() {
		return this.lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public String getLat() {
		return this.lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public Integer getDataTime() {
		return this.dataTime;
	}

	public void setDataTime(Integer dataTime) {
		this.dataTime = dataTime;
	}

	public Template getTemplate() {
		return this.template;
	}

	public void setTemplate(Template template) {
		this.template = template;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public Date getNextTime() {
		return nextTime;
	}

	public void setNextTime(Date nextTime) {
		this.nextTime = nextTime;
	}

}