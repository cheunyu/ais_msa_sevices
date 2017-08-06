/**     
 * @Title: MilitaryActivitiyBo.java    
 * @Package com.scyb.aisweather.webservice.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月15日 下午3:03:01    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.bo;

import java.util.List;

/**
 *      @ClassName: MilitaryActivitiyBo     @Description: TODO(军事活动)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年12月15日 下午3:03:01      
 *     
 */
public class MilitaryActivitiyBo extends BroadcastMMSIBo{

	/**
	 *      @Fields DAC : TODO(区域码)   
	 */
	private final int DAC = 412;

	/**
	 *      @Fields FI : TODO(功能码)   
	 */
	private final int FI = 8;

	/**
	 *      @Fields activitiyTheme : TODO(活动主题)   
	 */
	private int activitiyTheme;

	/**
	 *      @Fields durationType : TODO(持续时间类型)   
	 */
	private int durationType;

	/**
	 *      @Fields longitude : TODO(经度)   
	 */
	private List<Integer> longitudeList;

	/**
	 *      @Fields latitude : TODO(纬度)   
	 */
	private List<Integer> latitudeList;

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
	 * @return the activitiyTheme
	 */
	public int getActivitiyTheme() {
		return activitiyTheme;
	}

	/**
	 * @param activitiyTheme
	 *            the activitiyTheme to set
	 */
	public void setActivitiyTheme(int activitiyTheme) {
		this.activitiyTheme = activitiyTheme;
	}

	/**
	 * @return the durationType
	 */
	public int getDurationType() {
		return durationType;
	}

	/**
	 * @param durationType
	 *            the durationType to set
	 */
	public void setDurationType(int durationType) {
		this.durationType = durationType;
	}

	/**
	 * @return the longitudeList
	 */
	public List<Integer> getLongitudeList() {
		return longitudeList;
	}

	/**
	 * @param longitudeList
	 *            the longitudeList to set
	 */
	public void setLongitudeList(List<Integer> longitudeList) {
		this.longitudeList = longitudeList;
	}

	/**
	 * @return the latitudeList
	 */
	public List<Integer> getLatitudeList() {
		return latitudeList;
	}

	/**
	 * @param latitudeList
	 *            the latitudeList to set
	 */
	public void setLatitudeList(List<Integer> latitudeList) {
		this.latitudeList = latitudeList;
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
	public MilitaryActivitiyBo() {
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
	 * @param activitiyTheme
	 * @param durationType
	 * @param longitudeList
	 * @param latitudeList
	 * @param dateTime1
	 * @param dateTime2
	 * @param precautions
	 */
	public MilitaryActivitiyBo(int activitiyTheme, int durationType, List<Integer> longitudeList, List<Integer> latitudeList, Long dateTime1, Long dateTime2,
			int precautions) {
		super();
		this.activitiyTheme = activitiyTheme;
		this.durationType = durationType;
		this.longitudeList = longitudeList;
		this.latitudeList = latitudeList;
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
		return "MilitaryActivitiyBo [DAC=" + DAC + ", FI=" + FI + ", activitiyTheme=" + activitiyTheme + ", durationType=" + durationType + ", longitudeList="
				+ longitudeList + ", latitudeList=" + latitudeList + ", dateTime1=" + dateTime1 + ", dateTime2=" + dateTime2 + ", precautions=" + precautions
				+ "]";
	}

}
