package com.scyb.aisweather.template.bo;

import java.util.HashSet;
import java.util.Set;

/**
 * Station entity. @author MyEclipse Persistence Tools
 */

public class Station implements java.io.Serializable {

	// Fields

	private String stationName;
	private Set templates;

	// Constructors

	/** default constructor */
	public Station() {
	}

	/** minimal constructor */
	public Station(String stationName) {
		this.stationName = stationName;
	}

	/** full constructor */
	public Station(String stationName, Set templates) {
		this.stationName = stationName;
		this.templates = templates;
	}

	// Property accessors

	public String getStationName() {
		return this.stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public Set getTemplates() {
		return this.templates;
	}

	public void setTemplates(Set templates) {
		this.templates = templates;
	}

}