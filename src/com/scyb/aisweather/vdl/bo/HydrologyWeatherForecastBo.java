/**     
 * @Title: HydrologyWeatherForecastBo.java    
 * @Package com.scyb.aisweather.vdl.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月4日 下午8:20:30    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.bo;

import java.util.Date;
import java.util.List;

import com.scyb.aisweather.vdl.bo.head.MessageEight;
import com.scyb.aisweather.vdl.bo.head.MessageSix;

/**   
 * @ClassName: HydrologyWeatherForecastBo   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月4日 下午8:20:30      
 *    
 */
public class HydrologyWeatherForecastBo {

	/**
	 *      @Fields DAC : TODO(DAC码)   
	 */
	private final static int DAC = 412;

	/**
	 *      @Fields FI : TODO(FI功能码)   
	 */
	private final static int FI = 4;

	/**
	 *      @Fields forecastTime : TODO(预报时间)   
	 */
	private String forecastDateTime;

	/**
	 *      @Fields longitudeList : TODO(经度)   
	 */
	private List<String> longitudeList;

	/**
	 *      @Fields latitudeList : TODO(纬度)   
	 */
	private List<String> latitudeList;
	
	/**   
	 * @Fields hightTideTime : TODO(高潮时间)   
	 */
	private List<String> highTideTimeList;
	
	/**   
	 * @Fields lowtTideTime : TODO(低潮时间)   
	 */
	private List<String> lowTideTimeList;
	
	/**   
	 * @Fields tide : TODO(水位)   
	 */
	private List<Double> tideList;

	private MessageSix messageSix;
	
	private MessageEight messageEight;

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param forecastDateTime
	 * @param longitudeList
	 * @param latitudeList
	 * @param highTideTimeList
	 * @param lowTideTimeList
	 * @param tideList
	 * @param messageSix
	 * @param messageEight   
	 */
	public HydrologyWeatherForecastBo(String forecastDateTime,
			List<String> longitudeList, List<String> latitudeList,
			List<String> highTideTimeList, List<String> lowTideTimeList,
			List<Double> tideList, MessageSix messageSix,
			MessageEight messageEight) {
		super();
		this.forecastDateTime = forecastDateTime;
		this.longitudeList = longitudeList;
		this.latitudeList = latitudeList;
		this.highTideTimeList = highTideTimeList;
		this.lowTideTimeList = lowTideTimeList;
		this.tideList = tideList;
		this.messageSix = messageSix;
		this.messageEight = messageEight;
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>      
	 */
	public HydrologyWeatherForecastBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the forecastDateTime
	 */
	public String getForecastDateTime() {
		return forecastDateTime;
	}

	/**
	 * @param forecastDateTime the forecastDateTime to set
	 */
	public void setForecastDateTime(String forecastDateTime) {
		this.forecastDateTime = forecastDateTime;
	}

	/**
	 * @return the longitudeList
	 */
	public List<String> getLongitudeList() {
		return longitudeList;
	}

	/**
	 * @param longitudeList the longitudeList to set
	 */
	public void setLongitudeList(List<String> longitudeList) {
		this.longitudeList = longitudeList;
	}

	/**
	 * @return the latitudeList
	 */
	public List<String> getLatitudeList() {
		return latitudeList;
	}

	/**
	 * @param latitudeList the latitudeList to set
	 */
	public void setLatitudeList(List<String> latitudeList) {
		this.latitudeList = latitudeList;
	}

	/**
	 * @return the highTideTimeList
	 */
	public List<String> getHighTideTimeList() {
		return highTideTimeList;
	}

	/**
	 * @param highTideTimeList the highTideTimeList to set
	 */
	public void setHighTideTimeList(List<String> highTideTimeList) {
		this.highTideTimeList = highTideTimeList;
	}

	/**
	 * @return the lowTideTimeList
	 */
	public List<String> getLowTideTimeList() {
		return lowTideTimeList;
	}

	/**
	 * @param lowTideTimeList the lowTideTimeList to set
	 */
	public void setLowTideTimeList(List<String> lowTideTimeList) {
		this.lowTideTimeList = lowTideTimeList;
	}

	/**
	 * @return the tideList
	 */
	public List<Double> getTideList() {
		return tideList;
	}

	/**
	 * @param tideList the tideList to set
	 */
	public void setTideList(List<Double> tideList) {
		this.tideList = tideList;
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
		return "HydrologyWeatherForecastBo [forecastDateTime="
				+ forecastDateTime + ", longitudeList=" + longitudeList
				+ ", latitudeList=" + latitudeList + ", highTideTimeList="
				+ highTideTimeList + ", lowTideTimeList=" + lowTideTimeList
				+ ", tideList=" + tideList + ", messageSix=" + messageSix
				+ ", messageEight=" + messageEight + "]";
	}

	
}
