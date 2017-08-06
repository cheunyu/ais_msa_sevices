/**     
 * @Title: DistressShipBo.java    
 * @Package com.scyb.aisweather.webservice.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月15日 下午3:24:55    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.bo;

/**
 *      @ClassName: DistressShipBo     @Description: TODO(这里用一句话描述这个类的作用)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年12月15日 下午3:24:55      
 *     
 */
public class DistressShipBo extends BroadcastMMSIBo{

	/**
	 *      @Fields DAC : TODO(区域码)   
	 */
	private final int DAC = 412;

	/**
	 *      @Fields FI : TODO(功能码)   
	 */
	private final int FI = 10;

	private int type;

	private int described;

	private int shipType;

	private int farther;

	/**
	 *      @Fields longitude : TODO(经度)   
	 */
	private int longitude;

	/**
	 *      @Fields latitude : TODO(纬度)   
	 */
	private int latitude;

	private Long dateTime;

	private int range;

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
	 * @return the described
	 */
	public int getDescribed() {
		return described;
	}

	/**
	 * @param described the described to set
	 */
	public void setDescribed(int described) {
		this.described = described;
	}

	/**
	 * @return the shipType
	 */
	public int getShipType() {
		return shipType;
	}

	/**
	 * @param shipType the shipType to set
	 */
	public void setShipType(int shipType) {
		this.shipType = shipType;
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
	 * @return the dateTime
	 */
	public Long getDateTime() {
		return dateTime;
	}

	/**
	 * @param dateTime the dateTime to set
	 */
	public void setDateTime(Long dateTime) {
		this.dateTime = dateTime;
	}

	/**
	 * @return the range
	 */
	public int getRange() {
		return range;
	}

	/**
	 * @param range the range to set
	 */
	public void setRange(int range) {
		this.range = range;
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
	public DistressShipBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param type
	 * @param described
	 * @param shipType
	 * @param farther
	 * @param longitude
	 * @param latitude
	 * @param dateTime
	 * @param range   
	 */
	public DistressShipBo(int type, int described, int shipType, int farther, int longitude, int latitude, Long dateTime, int range) {
		super();
		this.type = type;
		this.described = described;
		this.shipType = shipType;
		this.farther = farther;
		this.longitude = longitude;
		this.latitude = latitude;
		this.dateTime = dateTime;
		this.range = range;
	}

	/** (非 Javadoc)   
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return   
	 * @see java.lang.Object#toString()   
	 */
	@Override
	public String toString() {
		return "DistressShipBo [DAC=" + DAC + ", FI=" + FI + ", type=" + type + ", described=" + described + ", shipType=" + shipType + ", farther=" + farther
				+ ", longitude=" + longitude + ", latitude=" + latitude + ", dateTime=" + dateTime + ", range=" + range + "]";
	}
	
	
}
