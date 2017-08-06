package com.scyb.aisweather.message.bo;

/**   
 * @ClassName: MessageValueVo   
 * @Description: TODO(模拟数值预报VO,参考《AIS二进制信息应用编码规范》Chapter 5.1 )   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date Nov 23, 2013 3:43:17 PM      
 *    
 */
/**   
 * @ClassName: MessageValueVo   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date Nov 23, 2013 4:01:40 PM      
 *    
 */
public class MessageValueVo {

	/**   
	 * @Fields time : TODO(预报时间)   
	 */
	private int time;
	/**   
	 * @Fields weather : TODO(天气现象)   
	 */
	private int weather;
	/**   
	 * @Fields lon : TODO(经度)   
	 */
	private int[] lon;
	/**   
	 * @Fields lat : TODO(纬度)   
	 */
	private int[] lat;
	/**   
	 * @Fields windSpeed : TODO(风速)   
	 */
	private int[] windSpeed;
	/**   
	 * @Fields windDirection : TODO(风向)   
	 */
	private int[] windDirection;
	/**   
	 * @Fields temperature : TODO(气温)   
	 */
	private int[] temperature;
	/**   
	 * @Fields pressure : TODO(气压)   
	 */
	private int[] pressure;
	/**   
	 * @Fields visibility : TODO(能见度)   
	 */
	private int[] visibility;
	
	public MessageValueVo(int time, int weather, int[] lon, int[] lat,
			int[] windSpeed, int[] windDirection, int[] temperature,
			int[] pressure, int[] visibility) {
		super();
		this.time = time;
		this.weather = weather;
		this.lon = lon;
		this.lat = lat;
		this.windSpeed = windSpeed;
		this.windDirection = windDirection;
		this.temperature = temperature;
		this.pressure = pressure;
		this.visibility = visibility;
	}
	
	public MessageValueVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int temperature() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getWeather() {
		return weather;
	}
	public void setWeather(int weather) {
		this.weather = weather;
	}
	public int[] getLon() {
		return lon;
	}
	public void setLon(int[] lon) {
		this.lon = lon;
	}
	public int[] getLat() {
		return lat;
	}
	public void setLat(int[] lat) {
		this.lat = lat;
	}
	public int[] getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(int[] windSpeed) {
		this.windSpeed = windSpeed;
	}
	public int[] getWindDirection() {
		return windDirection;
	}
	public void setWindDirection(int[] windDirection) {
		this.windDirection = windDirection;
	}
	public int[] getTemperature() {
		return temperature;
	}
	public void setTemperature(int[] temperature) {
		this.temperature = temperature;
	}
	public int[] getPressure() {
		return pressure;
	}
	public void setPressure(int[] pressure) {
		this.pressure = pressure;
	}
	public int[] getVisibility() {
		return visibility;
	}
	public void setVisibility(int[] visibility) {
		this.visibility = visibility;
	}

	public int getTime() {
		return time;
	}
	
	
}
