/**     
 * @Title: MarineWeatherForecastBo.java    
 * @Package com.scyb.aisweather.vdl.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年9月16日 下午4:01:16    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.bo;

import java.util.List;

import com.scyb.aisweather.vdl.bo.head.MessageEight;
import com.scyb.aisweather.vdl.bo.head.MessageSix;

/**   
 * @ClassName: MarineWeatherForecastBo   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年9月16日 下午4:01:16      
 *    
 */
public class MarineWeatherForecastBo {
	/**
	 *      @Fields DAC : TODO(DAC码)   
	 */
	private final static int DAC = 412;

	/**
	 *      @Fields FI : TODO(FI功能码)   
	 */
	private final static int FI = 1;

	/**
	 *      @Fields forecastTime : TODO(预报时间)   
	 */
	private int forecastDateTime;
	
	/**   
	 * @Fields weatherPhenomena : TODO(天气现象)   
	 */
	private List<Integer> weatherPhenomenaList;

	/**
	 *      @Fields longitudeList : TODO(经度)   
	 */
	private List<String> longitudeList;

	/**
	 *      @Fields latitudeList : TODO(纬度)   temperature at 2m : K
	 */
	private List<String> latitudeList;
	
	/**   
	 * @Fields windSpeedList : TODO(风速)   
	 */
	private List<Integer> windSpeedList;
	
	/**   
	 * @Fields windDirectionList : TODO(风向)   
	 */
	private List<Integer> windDirectionList;
	
	/**   
	 * @Fields temperature : TODO(气温)   
	 */
	private List<Double> temperatureList;
	
	/**   
	 * @Fields pressure : TODO(气压)   
	 */
	private List<Integer> pressureList;
	
	/**   
	 * @Fields visibilityList : TODO(能见度)   
	 */
	private List<Double> visibilityList;

	private MessageSix ms;
	
	private MessageEight me;

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
	 * @return the weatherPhenomenaList
	 */
	public List<Integer> getWeatherPhenomenaList() {
		return weatherPhenomenaList;
	}

	/**
	 * @param weatherPhenomenaList the weatherPhenomenaList to set
	 */
	public void setWeatherPhenomenaList(List<Integer> weatherPhenomenaList) {
		this.weatherPhenomenaList = weatherPhenomenaList;
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
	 * @return the windSpeedList
	 */
	public List<Integer> getWindSpeedList() {
		return windSpeedList;
	}

	/**
	 * @param windSpeedList the windSpeedList to set
	 */
	public void setWindSpeedList(List<Integer> windSpeedList) {
		this.windSpeedList = windSpeedList;
	}

	/**
	 * @return the windDirectionList
	 */
	public List<Integer> getWindDirectionList() {
		return windDirectionList;
	}

	/**
	 * @param windDirectionList the windDirectionList to set
	 */
	public void setWindDirectionList(List<Integer> windDirectionList) {
		this.windDirectionList = windDirectionList;
	}

	/**
	 * @return the temperatureList
	 */
	public List<Double> getTemperatureList() {
		return temperatureList;
	}

	/**
	 * @param temperatureList the temperatureList to set
	 */
	public void setTemperatureList(List<Double> temperatureList) {
		this.temperatureList = temperatureList;
	}

	/**
	 * @return the pressureList
	 */
	public List<Integer> getPressureList() {
		return pressureList;
	}

	/**
	 * @param pressureList the pressureList to set
	 */
	public void setPressureList(List<Integer> pressureList) {
		this.pressureList = pressureList;
	}

	/**
	 * @return the visibilityList
	 */
	public List<Double> getVisibilityList() {
		return visibilityList;
	}

	/**
	 * @param visibilityList the visibilityList to set
	 */
	public void setVisibilityList(List<Double> visibilityList) {
		this.visibilityList = visibilityList;
	}

	/**
	 * @return the ms
	 */
	public MessageSix getMs() {
		return ms;
	}

	/**
	 * @param ms the ms to set
	 */
	public void setMs(MessageSix ms) {
		this.ms = ms;
	}

	/**
	 * @return the me
	 */
	public MessageEight getMe() {
		return me;
	}

	/**
	 * @param me the me to set
	 */
	public void setMe(MessageEight me) {
		this.me = me;
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


	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>      
	 */
	public MarineWeatherForecastBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param forecastDateTime
	 * @param weatherPhenomenaList
	 * @param longitudeList
	 * @param latitudeList
	 * @param windSpeedList
	 * @param windDirectionList
	 * @param temperatureList
	 * @param pressureList
	 * @param visibilityList
	 * @param ms
	 * @param me   
	 */
	public MarineWeatherForecastBo(int forecastDateTime, List<Integer> weatherPhenomenaList, List<String> longitudeList, List<String> latitudeList,
			List<Integer> windSpeedList, List<Integer> windDirectionList, List<Double> temperatureList, List<Integer> pressureList, List<Double> visibilityList,
			MessageSix ms, MessageEight me) {
		super();
		this.forecastDateTime = forecastDateTime;
		this.weatherPhenomenaList = weatherPhenomenaList;
		this.longitudeList = longitudeList;
		this.latitudeList = latitudeList;
		this.windSpeedList = windSpeedList;
		this.windDirectionList = windDirectionList;
		this.temperatureList = temperatureList;
		this.pressureList = pressureList;
		this.visibilityList = visibilityList;
		this.ms = ms;
		this.me = me;
	}

	/** (非 Javadoc)   
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return   
	 * @see java.lang.Object#toString()   
	 */
	@Override
	public String toString() {
		return "MarineWeatherForecastBo [forecastDateTime=" + forecastDateTime + ", weatherPhenomenaList=" + weatherPhenomenaList + ", longitudeList="
				+ longitudeList + ", latitudeList=" + latitudeList + ", windSpeedList=" + windSpeedList + ", windDirectionList=" + windDirectionList
				+ ", temperatureList=" + temperatureList + ", pressureList=" + pressureList + ", visibilityList=" + visibilityList + ", ms=" + ms + ", me="
				+ me + "]";
	}

	
}
