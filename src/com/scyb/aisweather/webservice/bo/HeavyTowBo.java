/**     
 * @Title: HeavyTowBo.java    
 * @Package com.scyb.aisweather.webservice.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月15日 下午3:00:39    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.bo;

/**
 *      @ClassName: HeavyTowBo     @Description: TODO(这里用一句话描述这个类的作用)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年12月15日 下午3:00:39      
 *     
 */
public class HeavyTowBo extends BroadcastMMSIBo{

	/**
	 *      @Fields DAC : TODO(区域码)   
	 */
	private final int DAC = 412;

	/**
	 *      @Fields FI : TODO(功能码)   
	 */
	private final int FI = 8;

	/**
	 *      @Fields mmsi : TODO(船舶MMSI)   
	 */
	private int mmsi;

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
	 *      @Fields overallLength : TODO(总长)   
	 */
	private int overallLength;

	/**
	 *      @Fields speed : TODO(航速   
	 */
	private int speed;

	/**
	 *      @Fields dateTime1 : TODO(时间1)   
	 */
	private Long dateTime1;

	/**
	 *      @Fields dateTime2 : TODO(时间2)   
	 */
	private Long dateTime2;

	/**
	 *      @Fields precautions : TODO(注意事项)   
	 */
	private int precautions;

	/**
	 * @return the mmsi
	 */
	public int getMmsi() {
		return mmsi;
	}

	/**
	 * @param mmsi
	 *            the mmsi to set
	 */
	public void setMmsi(int mmsi) {
		this.mmsi = mmsi;
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
	 * @return the overallLength
	 */
	public int getOverallLength() {
		return overallLength;
	}

	/**
	 * @param overallLength
	 *            the overallLength to set
	 */
	public void setOverallLength(int overallLength) {
		this.overallLength = overallLength;
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @param speed
	 *            the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
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
	 * @return the precautions
	 */
	public int getPrecautions() {
		return precautions;
	}

	/**
	 * @param precautions
	 *            the precautions to set
	 */
	public void setPrecautions(int precautions) {
		this.precautions = precautions;
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
	public HeavyTowBo() {
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
	 * @param mmsi
	 * @param longitude1
	 * @param latitude1
	 * @param longitude2
	 * @param latitude2
	 * @param overallLength
	 * @param speed
	 * @param dateTime1
	 * @param dateTime2
	 * @param precautions
	 */
	public HeavyTowBo(int mmsi, int longitudeStart, int latitudeStart, int longitudeEnd, int latitudeEnd, int overallLength, int speed, Long dateTime1, Long dateTime2,
			int precautions) {
		super();
		this.mmsi = mmsi;
		this.longitudeStart = longitudeStart;
		this.latitudeStart = latitudeStart;
		this.longitudeEnd = longitudeEnd;
		this.latitudeEnd = latitudeEnd;
		this.overallLength = overallLength;
		this.speed = speed;
		this.dateTime1 = dateTime1;
		this.dateTime2 = dateTime2;
		this.precautions = precautions;
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
		return "HeavyTowBo [DAC=" + DAC + ", FI=" + FI + ", mmsi=" + mmsi + ", latitudeStart=" + latitudeStart + ", latitudeStart=" + latitudeStart + ", longitudeEnd="
				+ longitudeEnd + ", latitudeEnd=" + latitudeEnd + ", overallLength=" + overallLength + ", speed=" + speed + ", dateTime1=" + dateTime1
				+ ", dateTime2=" + dateTime2 + ", precautions=" + precautions + "]";
	}

}
