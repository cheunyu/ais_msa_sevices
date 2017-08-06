/**     
 * @Title: MarineWeatherForecastVo.java    
 * @Package com.scyb.aisweather.vdl.vo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年9月16日 下午3:54:47    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.vo;

import java.util.ArrayList;
import java.util.List;

/**
 *      @ClassName: MarineWeatherForecastVo   
 *  @Description: TODO(这里用一句话描述这个类的作用)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年9月16日 下午3:54:47           
 */
public class MarineWeatherForecastVo {

	/**
	 *      @Fields messageNo : TODO(报文号)   
	 */
	private int messageNo;
	
	/**   
	 * @Fields source_id : TODO(起始站台MMSI)   
	 */
	private int source_id;
	
	/**   
	 * @Fields destination_id : TODO(目标站台MMSI)   
	 */
	private int destination_id;
	
	/**
	 *      @Fields forecastTime : TODO(预报时间)   
	 */
	private int forecastDateTime;
	/**
	 *      @Fields longitudeList : TODO(经度,度)   
	 */
	private List<String> longitudeDList;

	/**
	 *      @Fields longitudeMList : TODO(经度，分)   
	 */
	private List<String> longitudeMList;

	/**
	 *      @Fields longitudeSList : TODO(经度，秒)   
	 */
	private List<String> longitudeSList;

	/**
	 *      @Fields latitudeList : TODO(纬度，度)   
	 */
	private List<String> latitudeDList;

	/**
	 *      @Fields latitudeMList : TODO(纬度，分)   
	 */
	private List<String> latitudeMList;

	/**
	 *      @Fields latitudeSList : TODO(纬度，秒)   
	 */
	private List<String> latitudeSList;

	private List<Double> temperatureList;

	private List<Integer> pressureList;

	private List<Double> visibilityList;

	private List<Integer> weatherPhenomenaList;

	private List<Integer> windDirectionList;

	private List<Integer> windSpeedList;

	public List<Double> getTemperatureList() {
		return temperatureList;
	}

	public void setTemperatureList(List<Double> temperatureList) {
		this.temperatureList = temperatureList;
	}

	public List<Integer> getPressureList() {
		return pressureList;
	}

	public void setPressureList(List<Integer> pressureList) {
		this.pressureList = pressureList;
	}

	public List<Double> getVisibilityList() {
		return visibilityList;
	}

	public void setVisibilityList(List<Double> visibilityList) {
		this.visibilityList = visibilityList;
	}

	public List<Integer> getWeatherPhenomenaList() {
		return weatherPhenomenaList;
	}

	public void setWeatherPhenomenaList(List<Integer> weatherPhenomenaList) {
		this.weatherPhenomenaList = weatherPhenomenaList;
	}

	public List<Integer> getWindDirectionList() {
		return windDirectionList;
	}

	public void setWindDirectionList(List<Integer> windDirectionList) {
		this.windDirectionList = windDirectionList;
	}

	public List<Integer> getWindSpeedList() {
		return windSpeedList;
	}

	public void setWindSpeedList(List<Integer> windSpeedList) {
		this.windSpeedList = windSpeedList;
	}

	/**
	 * <p>Title: </p>   
	 * <p>Description: </p>      
	 */
	public MarineWeatherForecastVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MarineWeatherForecastVo(int messageNo, int source_id, int destination_id, int forecastDateTime, List<String> longitudeDList, List<String> longitudeMList, List<String> longitudeSList, List<String> latitudeDList, List<String> latitudeMList, List<String> latitudeSList, List<Double> temperatureList, List<Integer> pressureList, List<Double> visibilityList, List<Integer> weatherPhenomenaList, List<Integer> windDirectionList, List<Integer> windSpeedList) {
		this.messageNo = messageNo;
		this.source_id = source_id;
		this.destination_id = destination_id;
		this.forecastDateTime = forecastDateTime;
		this.longitudeDList = longitudeDList;
		this.longitudeMList = longitudeMList;
		this.longitudeSList = longitudeSList;
		this.latitudeDList = latitudeDList;
		this.latitudeMList = latitudeMList;
		this.latitudeSList = latitudeSList;
		this.temperatureList = temperatureList;
		this.pressureList = pressureList;
		this.visibilityList = visibilityList;
		this.weatherPhenomenaList = weatherPhenomenaList;
		this.windDirectionList = windDirectionList;
		this.windSpeedList = windSpeedList;
	}

	/**
	 * @return the messageNo
	 */
	public int getMessageNo() {
		return messageNo;
	}

	/**
	 * @param messageNo the messageNo to set
	 */
	public void setMessageNo(int messageNo) {
		this.messageNo = messageNo;
	}

	/**
	 * @return the source_id
	 */
	public int getSource_id() {
		return source_id;
	}

	/**
	 * @param source_id the source_id to set
	 */
	public void setSource_id(int source_id) {
		this.source_id = source_id;
	}

	/**
	 * @return the destination_id
	 */
	public int getDestination_id() {
		return destination_id;
	}

	/**
	 * @param destination_id the destination_id to set
	 */
	public void setDestination_id(int destination_id) {
		this.destination_id = destination_id;
	}

	/**
	 * @return the forecastDateTime
	 */
	public int getForecastDateTime() {
		return forecastDateTime;
	}

	/**
	 * @param forecastDateTime the forecastDateTime to set
	 */
	public void setForecastDateTime(int forecastDateTime) {
		this.forecastDateTime = forecastDateTime;
	}

	/**
	 * @return the longitudeDList
	 */
	public List<String> getLongitudeDList() {
		if (longitudeDList == null) {
			longitudeDList = new ArrayList<String>();
		}
		return longitudeDList;
	}

	/**
	 * @param longitudeDList the longitudeDList to set
	 */
	public void setLongitudeDList(List<String> longitudeDList) {
		this.longitudeDList = longitudeDList;
	}

	/**
	 * @return the longitudeMList
	 */
	public List<String> getLongitudeMList() {
		if (longitudeMList == null) {
			longitudeMList = new ArrayList<String>();
		}
		return longitudeMList;
	}

	/**
	 * @param longitudeMList the longitudeMList to set
	 */
	public void setLongitudeMList(List<String> longitudeMList) {
		this.longitudeMList = longitudeMList;
	}

	/**
	 * @return the longitudeSList
	 */
	public List<String> getLongitudeSList() {
		if (longitudeSList == null) {
			longitudeSList = new ArrayList<String>();
		}
		return longitudeSList;
	}

	/**
	 * @param longitudeSList the longitudeSList to set
	 */
	public void setLongitudeSList(List<String> longitudeSList) {
		this.longitudeSList = longitudeSList;
	}

	/**
	 * @return the latitudeDList
	 */
	public List<String> getLatitudeDList() {
		if (latitudeDList == null) {
			latitudeDList = new ArrayList<String>();
		}
		return latitudeDList;
	}

	/**
	 * @param latitudeDList the latitudeDList to set
	 */
	public void setLatitudeDList(List<String> latitudeDList) {
		this.latitudeDList = latitudeDList;
	}

	/**
	 * @return the latitudeMList
	 */
	public List<String> getLatitudeMList() {
		if (latitudeMList == null) {
			latitudeMList = new ArrayList<String>();
		}
		return latitudeMList;
	}

	/**
	 * @param latitudeMList the latitudeMList to set
	 */
	public void setLatitudeMList(List<String> latitudeMList) {
		this.latitudeMList = latitudeMList;
	}

	/**
	 * @return the latitudeSList
	 */
	public List<String> getLatitudeSList() {
		if (latitudeSList == null) {
			latitudeSList = new ArrayList<String>();
		}
		return latitudeSList;
	}

	/**
	 * @param latitudeSList the latitudeSList to set
	 */
	public void setLatitudeSList(List<String> latitudeSList) {
		this.latitudeSList = latitudeSList;
	}

	@Override
	public String toString() {
		return "MarineWeatherForecastVo{" +
				"messageNo=" + messageNo +
				", source_id=" + source_id +
				", destination_id=" + destination_id +
				", forecastDateTime=" + forecastDateTime +
				", longitudeDList=" + longitudeDList +
				", longitudeMList=" + longitudeMList +
				", longitudeSList=" + longitudeSList +
				", latitudeDList=" + latitudeDList +
				", latitudeMList=" + latitudeMList +
				", latitudeSList=" + latitudeSList +
				", temperatureList=" + temperatureList +
				", pressureList=" + pressureList +
				", visibilityList=" + visibilityList +
				", weatherPhenomenaList=" + weatherPhenomenaList +
				", windDirectionList=" + windDirectionList +
				", windSpeedList=" + windSpeedList +
				'}';
	}
}
