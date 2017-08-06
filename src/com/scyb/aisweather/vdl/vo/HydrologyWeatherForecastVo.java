/**     
 * @Title: YdrologyWeatherForecastVo.java    
 * @Package com.scyb.aisweather.vdl.vo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年9月29日 上午11:16:42    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *      @ClassName: HydrologyWeatherForecastVo   
 *  @Description: TODO(这里用一句话描述这个类的作用)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年9月29日 上午11:16:42           
 */
public class HydrologyWeatherForecastVo {

	/**
	 *      @Fields messageNo : TODO(报文号)   
	 */
	private int messageNo;

	/**
	 *      @Fields source_id : TODO(起始站台MMSI)   
	 */
	private int source_id;

	/**
	 *      @Fields destination_id : TODO(目标站台MMSI)   
	 */
	private int destination_id;
	/**
	 *      @Fields forecastTime : TODO(预报时间)   
	 */
	private String forecastDateTime;

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

	/**
	 *      @Fields hightTideTime : TODO(高潮时间)   
	 */
	private List<String> highTideTime;

	/**
	 *      @Fields lowtTideTime : TODO(低潮时间)   
	 */
	private List<String> lowTideTime;

	/**
	 *      @Fields tide : TODO(水位)   
	 */
	private List<Double> tide;

	/**
	 * @return the messageNo
	 */
	public int getMessageNo() {
		return messageNo;
	}

	/**
	 * @param messageNo
	 *            the messageNo to set
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
	 * @param source_id
	 *            the source_id to set
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
	 * @param destination_id
	 *            the destination_id to set
	 */
	public void setDestination_id(int destination_id) {
		this.destination_id = destination_id;
	}

	/**
	 * @return the forecastDateTime
	 */
	public String getForecastDateTime() {
		return forecastDateTime;
	}

	/**
	 * @param forecastDateTime
	 *            the forecastDateTime to set
	 */
	public void setForecastDateTime(String forecastDateTime) {
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
	 * @param longitudeDList
	 *            the longitudeDList to set
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
	 * @param longitudeMList
	 *            the longitudeMList to set
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
	 * @param longitudeSList
	 *            the longitudeSList to set
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
	 * @param latitudeDList
	 *            the latitudeDList to set
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
	 * @param latitudeMList
	 *            the latitudeMList to set
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
	 * @param latitudeSList
	 *            the latitudeSList to set
	 */
	public void setLatitudeSList(List<String> latitudeSList) {
		this.latitudeSList = latitudeSList;
	}

	/**
	 * @return the highTideTime
	 */
	public List<String> getHighTideTime() {
		if (highTideTime == null) {
			highTideTime = new ArrayList<String>();
		}
		return highTideTime;
	}

	/**
	 * @param highTideTime
	 *            the highTideTime to set
	 */
	public void setHighTideTime(List<String> highTideTime) {
		this.highTideTime = highTideTime;
	}

	/**
	 * @return the lowTideTime
	 */
	public List<String> getLowTideTime() {
		if (lowTideTime == null) {
			lowTideTime = new ArrayList<String>();
		}
		return lowTideTime;
	}

	/**
	 * @param lowTideTime
	 *            the lowTideTime to set
	 */
	public void setLowTideTime(List<String> lowTideTime) {
		this.lowTideTime = lowTideTime;
	}

	/**
	 * @return the tide
	 */
	public List<Double> getTide() {
		if (tide == null) {
			tide = new ArrayList<Double>();
		}
		return tide;
	}

	/**
	 * @param tide
	 *            the tide to set
	 */
	public void setTide(List<Double> tide) {
		this.tide = tide;
	}

	/**
	 * <p>
	 * Title:
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param messageNo
	 * @param source_id
	 * @param destination_id
	 * @param forecastDateTime
	 * @param longitudeDList
	 * @param longitudeMList
	 * @param longitudeSList
	 * @param latitudeDList
	 * @param latitudeMList
	 * @param latitudeSList
	 * @param highTideTime
	 * @param lowTideTime
	 * @param tide
	 */
	public HydrologyWeatherForecastVo(int messageNo, int source_id, int destination_id, String forecastDateTime, List<String> longitudeDList,
			List<String> longitudeMList, List<String> longitudeSList, List<String> latitudeDList, List<String> latitudeMList, List<String> latitudeSList,
			List<String> highTideTime, List<String> lowTideTime, List<Double> tide) {
		super();
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
		this.highTideTime = highTideTime;
		this.lowTideTime = lowTideTime;
		this.tide = tide;
	}

	/**
	 * <p>
	 * Title:
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 */
	public HydrologyWeatherForecastVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: toString
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @return     @see java.lang.Object#toString()   
	 */
	@Override
	public String toString() {
		return "HydrologyWeatherForecastVo [messageNo=" + messageNo + ", source_id=" + source_id + ", destination_id=" + destination_id + ", forecastDateTime="
				+ forecastDateTime + ", longitudeDList=" + longitudeDList + ", longitudeMList=" + longitudeMList + ", longitudeSList=" + longitudeSList
				+ ", latitudeDList=" + latitudeDList + ", latitudeMList=" + latitudeMList + ", latitudeSList=" + latitudeSList + ", highTideTime="
				+ highTideTime + ", lowTideTime=" + lowTideTime + ", tide=" + tide + "]";
	}

}
