/**     
 * @Title: MarineEnvironmentForecastBo.java    
 * @Package com.scyb.aisweather.vdl.bo.head   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年7月29日 下午2:30:17    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.bo;

import java.util.List;

import com.scyb.aisweather.vdl.bo.head.MessageEight;
import com.scyb.aisweather.vdl.bo.head.MessageSix;

/**
 *      @ClassName: MarineEnvironmentForecastBo   
 *  @Description: TODO(这里用一句话描述这个类的作用)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年7月29日 下午2:30:17           
 */
public class MarineEnvironmentForecastBo {

	/**
	 *      @Fields DAC : TODO(DAC码)   
	 */
	private final static int DAC = 412;

	/**
	 *      @Fields FI : TODO(FI功能码)   
	 */
	private final static int FI = 2;

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
	 *      @Fields waterSpeedList : TODO(流速)   
	 */
	private List<Double> waterSpeedList;

	/**
	 *      @Fields waterDirectionList : TODO(流向)   
	 */
	private List<Integer> waterDirectionList;

	/**
	 *      @Fields waveHsList : TODO(浪高)   
	 */
	private List<Double> waveHsList;

	/**
	 *      @Fields waveDirectionList : TODO(浪向)   
	 */
	private List<Integer> waveDirectionList;

	/**
	 *      @Fields waterTemperatureList : TODO(海温)   
	 */
	private List<Double> waterTemperatureList;

	private MessageSix messageSix;
	
	private MessageEight messageEight;

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param forecastDateTime
	 * @param longitudeList
	 * @param latitudeList
	 * @param waterSpeedList
	 * @param waterDirectionList
	 * @param waveHsList
	 * @param waveDirectionList
	 * @param waterTemperatureList
	 * @param messageSix
	 * @param messageEight   
	 */
	public MarineEnvironmentForecastBo(String forecastDateTime, List<String> longitudeList, List<String> latitudeList, List<Double> waterSpeedList,
			List<Integer> waterDirectionList, List<Double> waveHsList, List<Integer> waveDirectionList, List<Double> waterTemperatureList, MessageSix messageSix,
			MessageEight messageEight) {
		super();
		this.forecastDateTime = forecastDateTime;
		this.longitudeList = longitudeList;
		this.latitudeList = latitudeList;
		this.waterSpeedList = waterSpeedList;
		this.waterDirectionList = waterDirectionList;
		this.waveHsList = waveHsList;
		this.waveDirectionList = waveDirectionList;
		this.waterTemperatureList = waterTemperatureList;
		this.messageSix = messageSix;
		this.messageEight = messageEight;
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>      
	 */
	public MarineEnvironmentForecastBo() {
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
	 * @return the waterSpeedList
	 */
	public List<Double> getWaterSpeedList() {
		return waterSpeedList;
	}

	/**
	 * @param waterSpeedList the waterSpeedList to set
	 */
	public void setWaterSpeedList(List<Double> waterSpeedList) {
		this.waterSpeedList = waterSpeedList;
	}

	/**
	 * @return the waterDirectionList
	 */
	public List<Integer> getWaterDirectionList() {
		return waterDirectionList;
	}

	/**
	 * @param waterDirectionList the waterDirectionList to set
	 */
	public void setWaterDirectionList(List<Integer> waterDirectionList) {
		this.waterDirectionList = waterDirectionList;
	}

	/**
	 * @return the waveHsList
	 */
	public List<Double> getWaveHsList() {
		return waveHsList;
	}

	/**
	 * @param waveHsList the waveHsList to set
	 */
	public void setWaveHsList(List<Double> waveHsList) {
		this.waveHsList = waveHsList;
	}

	/**
	 * @return the waveDirectionList
	 */
	public List<Integer> getWaveDirectionList() {
		return waveDirectionList;
	}

	/**
	 * @param waveDirectionList the waveDirectionList to set
	 */
	public void setWaveDirectionList(List<Integer> waveDirectionList) {
		this.waveDirectionList = waveDirectionList;
	}

	/**
	 * @return the waterTemperatureList
	 */
	public List<Double> getWaterTemperatureList() {
		return waterTemperatureList;
	}

	/**
	 * @param waterTemperatureList the waterTemperatureList to set
	 */
	public void setWaterTemperatureList(List<Double> waterTemperatureList) {
		this.waterTemperatureList = waterTemperatureList;
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
		return "MarineEnvironmentForecastBo [forecastDateTime=" + forecastDateTime + ", longitudeList=" + longitudeList + ", latitudeList=" + latitudeList
				+ ", waterSpeedList=" + waterSpeedList + ", waterDirectionList=" + waterDirectionList + ", waveHsList=" + waveHsList + ", waveDirectionList="
				+ waveDirectionList + ", waterTemperatureList=" + waterTemperatureList + ", messageSix=" + messageSix + ", messageEight=" + messageEight + "]";
	}
	
}
