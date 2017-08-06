/**     
 * @Title: LightDynamicBo.java    
 * @Package com.scyb.aisweather.webservice.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月15日 下午2:34:42    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.bo;

/**
 *      @ClassName: LightDynamicBo     @Description: TODO(助航标注动态灯质改变Bean)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年12月15日 下午2:34:42      
 *     
 */
public class LightDynamicBo  extends AidsMarkedDynamicBo{

	/**
	 *      @Fields longitude : TODO(经度)   
	 */
	private int longitude;

	/**
	 *      @Fields latitude : TODO(纬度)   
	 */
	private int latitude;

	private int type;

	private int rhythmName;

	private int rhythmParameters;

	private int lightColor;

	private int lightCycle;

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
	 * @return the rhythmName
	 */
	public int getRhythmName() {
		return rhythmName;
	}

	/**
	 * @param rhythmName
	 *            the rhythmName to set
	 */
	public void setRhythmName(int rhythmName) {
		this.rhythmName = rhythmName;
	}

	/**
	 * @return the rhythmParameters
	 */
	public int getRhythmParameters() {
		return rhythmParameters;
	}

	/**
	 * @param rhythmParameters
	 *            the rhythmParameters to set
	 */
	public void setRhythmParameters(int rhythmParameters) {
		this.rhythmParameters = rhythmParameters;
	}

	/**
	 * @return the lightColor
	 */
	public int getLightColor() {
		return lightColor;
	}

	/**
	 * @param lightColor
	 *            the lightColor to set
	 */
	public void setLightColor(int lightColor) {
		this.lightColor = lightColor;
	}

	/**
	 * @return the lightCycle
	 */
	public int getLightCycle() {
		return lightCycle;
	}

	/**
	 * @param lightCycle
	 *            the lightCycle to set
	 */
	public void setLightCycle(int lightCycle) {
		this.lightCycle = lightCycle;
	}

	/**
	 * <p>
	 * Title:
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 */
	public LightDynamicBo() {
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
	 * @param type
	 * @param rhythmName
	 * @param rhythmParameters
	 * @param lightColor
	 * @param lightCycle
	 */
	public LightDynamicBo(int longitude, int latitude, int type, int rhythmName, int rhythmParameters, int lightColor, int lightCycle) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
		this.type = type;
		this.rhythmName = rhythmName;
		this.rhythmParameters = rhythmParameters;
		this.lightColor = lightColor;
		this.lightCycle = lightCycle;
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
		return "LightDynamicBo [longitude=" + longitude + ", latitude=" + latitude + ", type=" + type + ", rhythmName=" + rhythmName + ", rhythmParameters="
				+ rhythmParameters + ", lightColor=" + lightColor + ", lightCycle=" + lightCycle + "]";
	}

}
