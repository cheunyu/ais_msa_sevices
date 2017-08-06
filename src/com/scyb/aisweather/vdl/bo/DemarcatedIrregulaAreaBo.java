/**     
 * @Title: DemarcatedIrregulaAreaBo.java    
 * @Package com.scyb.aisweather.vdl.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月7日 下午4:32:51    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.bo;

import java.util.Date;
import java.util.List;

import com.scyb.aisweather.vdl.bo.head.MessageEight;
import com.scyb.aisweather.vdl.bo.head.MessageSix;

/**
 *      @ClassName: DemarcatedIrregulaAreaBo   
 *  @Description: TODO(这里用一句话描述这个类的作用)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年10月7日 下午4:32:51           
 */
public class DemarcatedIrregulaAreaBo {

	/**
	 *      @Fields DAC : TODO(DAC码)   
	 */
	private final static int DAC = 412;

	/**
	 *      @Fields FI : TODO(FI功能码)   
	 */
	private final static int FI = 12;

	private int areaType;

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

	private Date startDateTime;

	private Date endDateTime;
	
	private MessageSix messageSix;

	private MessageEight messageEight;

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>      
	 */
	public DemarcatedIrregulaAreaBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param areaType
	 * @param longitudeDList
	 * @param longitudeMList
	 * @param longitudeSList
	 * @param latitudeDList
	 * @param latitudeMList
	 * @param latitudeSList
	 * @param startDateTime
	 * @param endDateTime
	 * @param messageSix
	 * @param messageEight   
	 */
	public DemarcatedIrregulaAreaBo(int areaType, List<Integer> longitudeDList,
			List<Integer> longitudeMList, List<Double> longitudeSList,
			List<Integer> latitudeDList, List<Integer> latitudeMList,
			List<Double> latitudeSList, Date startDateTime, Date endDateTime,
			MessageSix messageSix, MessageEight messageEight) {
		super();
		this.areaType = areaType;
		this.longitudeDList = longitudeDList;
		this.longitudeMList = longitudeMList;
		this.longitudeSList = longitudeSList;
		this.latitudeDList = latitudeDList;
		this.latitudeMList = latitudeMList;
		this.latitudeSList = latitudeSList;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.messageSix = messageSix;
		this.messageEight = messageEight;
	}

	/**
	 * @return the areaType
	 */
	public int getAreaType() {
		return areaType;
	}

	/**
	 * @param areaType the areaType to set
	 */
	public void setAreaType(int areaType) {
		this.areaType = areaType;
	}

	/**
	 * @return the longitudeDList
	 */
	public List<Integer> getLongitudeDList() {
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
	public Date getStartDateTime() {
		return startDateTime;
	}

	/**
	 * @param startDateTime the startDateTime to set
	 */
	public void setStartDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
	}

	/**
	 * @return the endDateTime
	 */
	public Date getEndDateTime() {
		return endDateTime;
	}

	/**
	 * @param endDateTime the endDateTime to set
	 */
	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}

	/**
	 * @return the messageSix
	 */
	public MessageSix getMessageSix() {
		return messageSix;
	}

	/**
	 * @param messageSix the messageSix to set
	 */
	public void setMessageSix(MessageSix messageSix) {
		this.messageSix = messageSix;
	}

	/**
	 * @return the messageEight
	 */
	public MessageEight getMessageEight() {
		return messageEight;
	}

	/**
	 * @param messageEight the messageEight to set
	 */
	public void setMessageEight(MessageEight messageEight) {
		this.messageEight = messageEight;
	}

	/**
	 * @return the dac
	 */
	public static int getDac() {
		return DAC;
	}

	/**
	 * @return the fi
	 */
	public static int getFi() {
		return FI;
	}

	/** (非 Javadoc)   
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return   
	 * @see java.lang.Object#toString()   
	 */
	@Override
	public String toString() {
		return "DemarcatedIrregulaAreaBo [areaType=" + areaType
				+ ", longitudeDList=" + longitudeDList + ", longitudeMList="
				+ longitudeMList + ", longitudeSList=" + longitudeSList
				+ ", latitudeDList=" + latitudeDList + ", latitudeMList="
				+ latitudeMList + ", latitudeSList=" + latitudeSList
				+ ", startDateTime=" + startDateTime + ", endDateTime="
				+ endDateTime + ", messageSix=" + messageSix
				+ ", messageEight=" + messageEight + "]";
	}
	
}
