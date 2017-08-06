package com.scyb.aisweather.message.vdl.app.bo;

import java.util.List;

import com.scyb.aisweather.message.vdl.head.bo.MessageEight;
import com.scyb.aisweather.message.vdl.head.bo.MessageSix;

public class OceanMeteorologyForecast {

	/**
	 * DAC码
	 */
	private int dac;
	
	/**
	 * FI功能吗
	 */
	private int fi;
	
	/**
	 * 预报时间
	 */
	private int forecastTime;
	
	/**
	 * 天气现象
	 */
	private int weather;
	
	/**
	 * 经度
	 */
	private List<Integer> longitudeList;
	
	/**
	 * 纬度
	 */
	private List<Integer> latitude;
	/**
	 * 风速
	 */
	private List<Integer> windspeed;
	/**
	 * 风向
	 */
	private List<Integer> windDirection;
	/**
	 * 气温
	 */
	private List<Integer> airTemperature;
	/**
	 * 气压
	 */
	private List<Integer> pressure;
	/**
	 * 能见度
	 */
	private List<Integer> visibility;
	
	/**
	 * 六号报文
	 */
	private MessageSix ms;
	/**
	 * 八号报文
	 */
	private MessageEight me;
	public OceanMeteorologyForecast(int dac, int fi, int forecastTime,
			int weather, List<Integer> longitudeList, List<Integer> latitude,
			List<Integer> windspeed, List<Integer> windDirection,
			List<Integer> airTemperature, List<Integer> pressure,
			List<Integer> visibility, MessageSix ms, MessageEight me) {
		super();
		this.dac = dac;
		this.fi = fi;
		this.forecastTime = forecastTime;
		this.weather = weather;
		this.longitudeList = longitudeList;
		this.latitude = latitude;
		this.windspeed = windspeed;
		this.windDirection = windDirection;
		this.airTemperature = airTemperature;
		this.pressure = pressure;
		this.visibility = visibility;
		this.ms = ms;
		this.me = me;
	}
	
	public OceanMeteorologyForecast() {
		super();
	}

	public int getDac() {
		return dac;
	}
	public void setDac(int dac) {
		this.dac = dac;
	}
	public int getFi() {
		return fi;
	}
	public void setFi(int fi) {
		this.fi = fi;
	}
	public int getForecastTime() {
		return forecastTime;
	}
	public void setForecastTime(int forecastTime) {
		this.forecastTime = forecastTime;
	}
	public int getWeather() {
		return weather;
	}
	public void setWeather(int weather) {
		this.weather = weather;
	}
	public List<Integer> getLongitudeList() {
		return longitudeList;
	}
	public void setLongitudeList(List<Integer> longitudeList) {
		this.longitudeList = longitudeList;
	}
	public List<Integer> getLatitude() {
		return latitude;
	}
	public void setLatitude(List<Integer> latitude) {
		this.latitude = latitude;
	}
	public List<Integer> getWindspeed() {
		return windspeed;
	}
	public void setWindspeed(List<Integer> windspeed) {
		this.windspeed = windspeed;
	}
	public List<Integer> getWindDirection() {
		return windDirection;
	}
	public void setWindDirection(List<Integer> windDirection) {
		this.windDirection = windDirection;
	}
	public List<Integer> getAirTemperature() {
		return airTemperature;
	}
	public void setAirTemperature(List<Integer> airTemperature) {
		this.airTemperature = airTemperature;
	}
	public List<Integer> getPressure() {
		return pressure;
	}
	public void setPressure(List<Integer> pressure) {
		this.pressure = pressure;
	}
	public List<Integer> getVisibility() {
		return visibility;
	}
	public void setVisibility(List<Integer> visibility) {
		this.visibility = visibility;
	}
	public MessageSix getMs() {
		return ms;
	}
	public void setMs(MessageSix ms) {
		this.ms = ms;
	}
	
	public MessageEight getMe() {
		return me;
	}
	public void setMe(MessageEight me) {
		this.me = me;
	}
	@Override
	public String toString() {
		return "OceanMeteorologyForecast [dac=" + dac + ", fi=" + fi
				+ ", forecastTime=" + forecastTime + ", weather=" + weather
				+ ", longitudeList=" + longitudeList + ", latitude=" + latitude
				+ ", windspeed=" + windspeed + ", windDirection="
				+ windDirection + ", airTemperature=" + airTemperature
				+ ", pressure=" + pressure + ", visibility=" + visibility
				+ ", ms=" + ms + ", me=" + me + "]";
	}
	
}
