/**     
 * @Title: MilitaryActivitiyVo.java    
 * @Package com.scyb.aisweather.vdl.vo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月6日 下午3:25:50    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**   
 * @ClassName: MilitaryActivitiyVo   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月6日 下午3:25:50      
 *    
 */
public class MilitaryActivitiyVo {
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
	
	private int activitiyTheme;
	
	private int durationType;
	
	/**
	 *      @Fields longitudeList : TODO(经度,度)   
	 */
	private List<Integer> longitudeDList;

	/**
	 *      @Fields longitudeMList : TODO(经度，分)   
	 */
	private List<Integer> longitudeMList;

	/**
	 *      @Fields longitudeSList : TODO(经度，秒)   
	 */
	private List<Double> longitudeSList;

	/**
	 *      @Fields latitudeList : TODO(纬度，度)   
	 */
	private List<Integer> latitudeDList;

	/**
	 *      @Fields latitudeMList : TODO(纬度，分)   
	 */
	private List<Integer> latitudeMList;

	/**
	 *      @Fields latitudeSList : TODO(纬度，秒)   
	 */
	private List<Double> latitudeSList;
	
	private String startDateTime;
	
	private String endDateTime;
	
	private int precautions;

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>      
	 */
	public MilitaryActivitiyVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param messageNo
	 * @param source_id
	 * @param destination_id
	 * @param activitiyTheme
	 * @param durationType
	 * @param longitudeDList
	 * @param longitudeMList
	 * @param longitudeSList
	 * @param latitudeDList
	 * @param latitudeMList
	 * @param latitudeSList
	 * @param startDateTime
	 * @param endDateTime
	 * @param precautions   
	 */
	public MilitaryActivitiyVo(int messageNo, int source_id,
			int destination_id, int activitiyTheme, int durationType,
			List<Integer> longitudeDList, List<Integer> longitudeMList,
			List<Double> longitudeSList, List<Integer> latitudeDList,
			List<Integer> latitudeMList, List<Double> latitudeSList,
			String startDateTime, String endDateTime, int precautions) {
		super();
		this.messageNo = messageNo;
		this.source_id = source_id;
		this.destination_id = destination_id;
		this.activitiyTheme = activitiyTheme;
		this.durationType = durationType;
		this.longitudeDList = longitudeDList;
		this.longitudeMList = longitudeMList;
		this.longitudeSList = longitudeSList;
		this.latitudeDList = latitudeDList;
		this.latitudeMList = latitudeMList;
		this.latitudeSList = latitudeSList;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.precautions = precautions;
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
	 * @return the activitiyTheme
	 */
	public int getActivitiyTheme() {
		return activitiyTheme;
	}

	/**
	 * @param activitiyTheme the activitiyTheme to set
	 */
	public void setActivitiyTheme(int activitiyTheme) {
		this.activitiyTheme = activitiyTheme;
	}

	/**
	 * @return the durationType
	 */
	public int getDurationType() {
		return durationType;
	}

	/**
	 * @param durationType the durationType to set
	 */
	public void setDurationType(int durationType) {
		this.durationType = durationType;
	}

	/**
	 * @return the longitudeDList
	 */
	public List<Integer> getLongitudeDList() {
		if(longitudeDList == null) {
			longitudeDList = new ArrayList<Integer>();
		}
		return longitudeDList;
	}

	/**
	 * @param longitudeDList the longitudeDList to set
	 */
	public void setLongitudeDList(List<Integer> longitudeDList) {
		this.longitudeDList = longitudeDList;
	}

	/**
	 * @return the longitudeMList
	 */
	public List<Integer> getLongitudeMList() {
		if(longitudeMList == null) {
			longitudeMList = new ArrayList<Integer>();
		}
		return longitudeMList;
	}

	/**
	 * @param longitudeMList the longitudeMList to set
	 */
	public void setLongitudeMList(List<Integer> longitudeMList) {
		this.longitudeMList = longitudeMList;
	}

	/**
	 * @return the longitudeSList
	 */
	public List<Double> getLongitudeSList() {
		if(longitudeSList == null) {
			longitudeSList = new ArrayList<Double>();
		}
		return longitudeSList;
	}

	/**
	 * @param longitudeSList the longitudeSList to set
	 */
	public void setLongitudeSList(List<Double> longitudeSList) {
		this.longitudeSList = longitudeSList;
	}

	/**
	 * @return the latitudeDList
	 */
	public List<Integer> getLatitudeDList() {
		if(latitudeDList == null) {
			latitudeDList = new ArrayList<Integer>();
		}
		return latitudeDList;
	}

	/**
	 * @param latitudeDList the latitudeDList to set
	 */
	public void setLatitudeDList(List<Integer> latitudeDList) {
		this.latitudeDList = latitudeDList;
	}

	/**
	 * @return the latitudeMList
	 */
	public List<Integer> getLatitudeMList() {
		if(latitudeMList == null) {
			latitudeMList = new ArrayList<Integer>();
		}
		return latitudeMList;
	}

	/**
	 * @param latitudeMList the latitudeMList to set
	 */
	public void setLatitudeMList(List<Integer> latitudeMList) {
		this.latitudeMList = latitudeMList;
	}

	/**
	 * @return the latitudeSList
	 */
	public List<Double> getLatitudeSList() {
		if(latitudeSList == null) {
			latitudeSList = new ArrayList<Double>();
		}
		return latitudeSList;
	}

	/**
	 * @param latitudeSList the latitudeSList to set
	 */
	public void setLatitudeSList(List<Double> latitudeSList) {
		this.latitudeSList = latitudeSList;
	}

	/**
	 * @return the startDateTime
	 */
	public String getStartDateTime() {
		return startDateTime;
	}

	/**
	 * @param startDateTime the startDateTime to set
	 */
	public void setStartDateTime(String startDateTime) {
		this.startDateTime = startDateTime;
	}

	/**
	 * @return the endDateTime
	 */
	public String getEndDateTime() {
		return endDateTime;
	}

	/**
	 * @param endDateTime the endDateTime to set
	 */
	public void setEndDateTime(String endDateTime) {
		this.endDateTime = endDateTime;
	}

	/**
	 * @return the precautions
	 */
	public int getPrecautions() {
		return precautions;
	}

	/**
	 * @param precautions the precautions to set
	 */
	public void setPrecautions(int precautions) {
		this.precautions = precautions;
	}

	/** (非 Javadoc)   
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return   
	 * @see java.lang.Object#toString()   
	 */
	@Override
	public String toString() {
		return "MilitaryActivitiyVo [messageNo=" + messageNo + ", source_id="
				+ source_id + ", destination_id=" + destination_id
				+ ", activitiyTheme=" + activitiyTheme + ", durationType="
				+ durationType + ", longitudeDList=" + longitudeDList
				+ ", longitudeMList=" + longitudeMList + ", longitudeSList="
				+ longitudeSList + ", latitudeDList=" + latitudeDList
				+ ", latitudeMList=" + latitudeMList + ", latitudeSList="
				+ latitudeSList + ", startDateTime=" + startDateTime
				+ ", endDateTime=" + endDateTime + ", precautions="
				+ precautions + "]";
	}

	
}
