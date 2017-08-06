/**     
 * @Title: NavigationBo.java    
 * @Package com.scyb.aisweather.webservice.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月15日 下午2:40:43    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.bo;

/**   
 * @ClassName: NavigationBo   
 * @Description: TODO(碍航物信息Bean)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月15日 下午2:40:43      
 *    
 */
public class NavigationBo extends BroadcastMMSIBo{

	/**
	 *      @Fields DAC : TODO(区域码)   
	 */
	private final int DAC = 412;

	/**
	 *      @Fields FI : TODO(功能码)   
	 */
	private final int FI = 06;
	
	private int type;
	
	/**
	 *      @Fields longitude : TODO(经度)   
	 */
	private int longitude;

	/**
	 *      @Fields latitude : TODO(纬度)   
	 */
	private int latitude;
	
	/**   
	 * @Fields radius : TODO(半径)   
	 */
	private Double radius;
	
	private Long time1;
	
	private Long time2;
	
	private int farther;

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return the longitude
	 */
	public int getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude the longitude to set
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
	 * @param latitude the latitude to set
	 */
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the radius
	 */
	public Double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(Double radius) {
		this.radius = radius;
	}

	/**
	 * @return the time1
	 */
	public Long getTime1() {
		return time1;
	}

	/**
	 * @param time1 the time1 to set
	 */
	public void setTime1(Long time1) {
		this.time1 = time1;
	}

	/**
	 * @return the time2
	 */
	public Long getTime2() {
		return time2;
	}

	/**
	 * @param time2 the time2 to set
	 */
	public void setTime2(Long time2) {
		this.time2 = time2;
	}

	/**
	 * @return the farther
	 */
	public int getFarther() {
		return farther;
	}

	/**
	 * @param farther the farther to set
	 */
	public void setFarther(int farther) {
		this.farther = farther;
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
	 * <p>Title: </p>   
	 * <p>Description: </p>      
	 */
	public NavigationBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param type
	 * @param longitude
	 * @param latitude
	 * @param radius
	 * @param time1
	 * @param time2
	 * @param farther   
	 */
	public NavigationBo(int type, int longitude, int latitude, Double radius, Long time1, Long time2, int farther) {
		super();
		this.type = type;
		this.longitude = longitude;
		this.latitude = latitude;
		this.radius = radius;
		this.time1 = time1;
		this.time2 = time2;
		this.farther = farther;
	}

	/** (非 Javadoc)   
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return   
	 * @see java.lang.Object#toString()   
	 */
	@Override
	public String toString() {
		return "NavigationBo [DAC=" + DAC + ", FI=" + FI + ", type=" + type + ", longitude=" + longitude + ", latitude=" + latitude + ", radius=" + radius
				+ ", time1=" + time1 + ", time2=" + time2 + ", farther=" + farther + "]";
	}
	
	
}
