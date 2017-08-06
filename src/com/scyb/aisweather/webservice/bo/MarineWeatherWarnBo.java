/**     
 * @Title: MarineWeatherWarn.java    
 * @Package com.scyb.aisweather.webservice.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月9日 下午12:38:33    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.bo;

/**
 *      @ClassName: MarineWeatherWarn     @Description: TODO(海洋气象预警)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年12月9日 下午12:38:33      
 *     
 */
public class MarineWeatherWarnBo extends BroadcastMMSIBo{

	/**
	 *      @Fields DAC : TODO(区域码)   
	 */
	private final int DAC = 412;

	/**
	 *      @Fields FI : TODO(功能码)   
	 */
	private final int FI = 03;

	/**
	 *      @Fields longitude : TODO(经度)   
	 */
	private int longitude;

	/**
	 *      @Fields latitude : TODO(纬度)   
	 */
	private int latitude;

	/**
	 *      @Fields radius : TODO(预警半径)   
	 */
	private int radius;

	/**
	 *      @Fields dateTime : TODO(预警时间)   
	 */
	private long dateTime;

	/**
	 *      @Fields range : TODO(预警时效)   
	 */
	private int range;

	/**
	 *      @Fields type : TODO(预警类型)   
	 */
	private int typeWarn;

	/**
	 * @return the longitude
	 */
	public int getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude
	 *            the longitude to set
	 */
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the latitude
	 */
	public int getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude
	 *            the latitude to set
	 */
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the radius
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * @param radius
	 *            the radius to set
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}

	/**
	 * @return the dateTime
	 */
	public long getDateTime() {
		return dateTime;
	}

	/**
	 * @param dateTime
	 *            the dateTime to set
	 */
	public void setDateTime(long dateTime) {
		this.dateTime = dateTime;
	}

	/**
	 * @return the range
	 */
	public int getRange() {
		return range;
	}

	/**
	 * @param range
	 *            the range to set
	 */
	public void setRange(int range) {
		this.range = range;
	}

	/**
	 * @return the typeWarn
	 */
	public int getTypeWarn() {
		return typeWarn;
	}

	/**
	 * @param typeWarn
	 *            the typeWarn to set
	 */
	public void setTypeWarn(int typeWarn) {
		this.typeWarn = typeWarn;
	}

	/**
	 * @return the dAC
	 */
	public int getDAC() {
		return DAC;
	}

	/**
	 * @return the fI
	 */
	public int getFI() {
		return FI;
	}

	/**
	 * <p>
	 * Title:
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 */
	public MarineWeatherWarnBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * <p>
	 * Title:
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param longitude
	 * @param latitude
	 * @param radius
	 * @param dateTime
	 * @param range
	 * @param typeWarn
	 */
	public MarineWeatherWarnBo(int longitude, int latitude, int radius, long dateTime, int range, int typeWarn) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
		this.radius = radius;
		this.dateTime = dateTime;
		this.range = range;
		this.typeWarn = typeWarn;
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
		return "MarineWeatherWarnBo [DAC=" + DAC + ", FI=" + FI + ", longitude=" + longitude + ", latitude=" + latitude + ", radius=" + radius + ", dateTime="
				+ dateTime + ", range=" + range + ", typeWarn=" + typeWarn + "]";
	}

}
