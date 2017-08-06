/**     
 * @Title: ConstructionWorkBo.java    
 * @Package com.scyb.aisweather.webservice.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月15日 下午2:55:22    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.bo;

/**
 *      @ClassName: ConstructionWorkBo     @Description: TODO(这里用一句话描述这个类的作用)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年12月15日 下午2:55:22      
 *     
 */
public class ConstructionWorkBo extends BroadcastMMSIBo{

	/**
	 *      @Fields DAC : TODO(区域码)   
	 */
	private final int DAC = 412;

	/**
	 *      @Fields FI : TODO(功能码)   
	 */
	private final int FI = 06;

	private int type;

	private int shipType;

	private int shipMmsi;

	/**
	 *      @Fields longitude1 : TODO(经度1)   
	 */
	private int longitudeStart;

	/**
	 *      @Fields latitude1 : TODO(纬度1)   
	 */
	private int latitudeStart;

	/**
	 *      @Fields longitude2 : TODO(经度2)   
	 */
	private int longitudeEnd;

	/**
	 *      @Fields latitude2 : TODO(纬度2)   
	 */
	private int latitudeEnd;

	/**
	 *      @Fields radius : TODO(半径)   
	 */
	private Double radius;

	/**
	 *      @Fields dateTime1 : TODO(时间1)   
	 */
	private Long dateTime1;

	/**
	 *      @Fields dateTime2 : TODO(时间2)   
	 */
	private Long dateTime2;

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return the shipType
	 */
	public int getShipType() {
		return shipType;
	}

	/**
	 * @param shipType
	 *            the shipType to set
	 */
	public void setShipType(int shipType) {
		this.shipType = shipType;
	}

	/**
	 * @return the shipMmsi
	 */
	public int getShipMmsi() {
		return shipMmsi;
	}

	/**
	 * @param shipMmsi
	 *            the shipMmsi to set
	 */
	public void setShipMmsi(int shipMmsi) {
		this.shipMmsi = shipMmsi;
	}

	public int getLongitudeStart() {
		return longitudeStart;
	}

	public void setLongitudeStart(int longitudeStart) {
		this.longitudeStart = longitudeStart;
	}

	public int getLatitudeStart() {
		return latitudeStart;
	}

	public void setLatitudeStart(int latitudeStart) {
		this.latitudeStart = latitudeStart;
	}

	public int getLongitudeEnd() {
		return longitudeEnd;
	}

	public void setLongitudeEnd(int longitudeEnd) {
		this.longitudeEnd = longitudeEnd;
	}

	public int getLatitudeEnd() {
		return latitudeEnd;
	}

	public void setLatitudeEnd(int latitudeEnd) {
		this.latitudeEnd = latitudeEnd;
	}

	/**
	 * @return the radius
	 */
	public Double getRadius() {
		return radius;
	}

	/**
	 * @param radius
	 *            the radius to set
	 */
	public void setRadius(Double radius) {
		this.radius = radius;
	}

	/**
	 * @return the dateTime1
	 */
	public Long getDateTime1() {
		return dateTime1;
	}

	/**
	 * @param dateTime1
	 *            the dateTime1 to set
	 */
	public void setDateTime1(Long dateTime1) {
		this.dateTime1 = dateTime1;
	}

	/**
	 * @return the dateTime2
	 */
	public Long getDateTime2() {
		return dateTime2;
	}

	/**
	 * @param dateTime2
	 *            the dateTime2 to set
	 */
	public void setDateTime2(Long dateTime2) {
		this.dateTime2 = dateTime2;
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
	public ConstructionWorkBo() {
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
	 * @param type
	 * @param shipType
	 * @param shipMmsi
	 * @param longitudeStart
	 * @param latitudeStart
	 * @param longitudeEnd
	 * @param latitudeEnd
	 * @param radius
	 * @param dateTime1
	 * @param dateTime2
	 */
	public ConstructionWorkBo(int type, int shipType, int shipMmsi, int longitudeStart, int latitudeStart, int longitudeEnd, int latitudeEnd, Double radius,
			Long dateTime1, Long dateTime2) {
		super();
		this.type = type;
		this.shipType = shipType;
		this.shipMmsi = shipMmsi;
		this.longitudeStart = longitudeStart;
		this.latitudeStart = latitudeStart;
		this.longitudeEnd = longitudeEnd;
		this.latitudeEnd = latitudeEnd;
		this.radius = radius;
		this.dateTime1 = dateTime1;
		this.dateTime2 = dateTime2;
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
		return "ConstructionWorkBo [DAC=" + DAC + ", FI=" + FI + ", type=" + type + ", shipType=" + shipType + ", shipMmsi=" + shipMmsi + ", longitudeStart="
				+ longitudeStart + ", latitudeStart=" + latitudeStart + ", longitudeEnd=" + longitudeEnd + ", latitudeEnd=" + latitudeEnd + ", radius=" + radius + ", dateTime1="
				+ dateTime1 + ", dateTime2=" + dateTime2 + "]";
	}

}
