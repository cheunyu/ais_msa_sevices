/**     
 * @Title: AidsMarkedDynamicBo.java    
 * @Package com.scyb.aisweather.vdl.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月5日 下午1:13:32    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.bo;

import com.scyb.aisweather.vdl.bo.head.MessageEight;
import com.scyb.aisweather.vdl.bo.head.MessageSix;

/**   
 * @ClassName: AidsMarkedDynamicBo   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月5日 下午1:13:32      
 *    
 */
public class AidsMarkedDynamicBo {

	/**
	 *      @Fields DAC : TODO(DAC码)   
	 */
	private final static int DAC = 412;

	/**
	 *      @Fields FI : TODO(FI功能码)   
	 */
	private final static int FI = 5;
	
	private int type;

	private String otherLongitude;
	
	private String otherLatitude;
	
	private int otherType;
	
	private String shiftStartLongitude;
	
	private String shiftStartLatitude;
	
	private String shiftEndLongitude;
	
	private String shiftEndLatitude;
	
	private int shiftType;
	
	private String dgpsLongitude;
	
	private String dgpsLatitude;
	
	private int dgpsLaunch;
	
	private String lightLongitude;
	
	private String lightLatitude;
	
	private int lightType;
	
	private int rhythmName;
	
	private int rhythmParameters;
	
	private int lightColor;
	
	private int lightCycle;
	
	/**   
	 * @Fields timeRange : TODO(发布时效)   
	 */
	private int publishRange;
	
	private MessageSix messageSix;
	
	private MessageEight messageEight;

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param type
	 * @param otherLongitude
	 * @param otherLatitude
	 * @param otherType
	 * @param shiftStartLongitude
	 * @param shiftStartLatitude
	 * @param shiftEndLongitude
	 * @param shiftEndLatitude
	 * @param shiftType
	 * @param dgpsLongitude
	 * @param dgpsLatitude
	 * @param dgpsLaunch
	 * @param lightLongitude
	 * @param lightLatitude
	 * @param lightType
	 * @param rhythmName
	 * @param rhythmParameters
	 * @param lightColor
	 * @param lightCycle
	 * @param publishRange
	 * @param messageSix
	 * @param messageEight   
	 */
	public AidsMarkedDynamicBo(int type, String otherLongitude,
			String otherLatitude, int otherType, String shiftStartLongitude,
			String shiftStartLatitude, String shiftEndLongitude,
			String shiftEndLatitude, int shiftType, String dgpsLongitude,
			String dgpsLatitude, int dgpsLaunch, String lightLongitude,
			String lightLatitude, int lightType, int rhythmName,
			int rhythmParameters, int lightColor, int lightCycle,
			int publishRange, MessageSix messageSix, MessageEight messageEight) {
		super();
		this.type = type;
		this.otherLongitude = otherLongitude;
		this.otherLatitude = otherLatitude;
		this.otherType = otherType;
		this.shiftStartLongitude = shiftStartLongitude;
		this.shiftStartLatitude = shiftStartLatitude;
		this.shiftEndLongitude = shiftEndLongitude;
		this.shiftEndLatitude = shiftEndLatitude;
		this.shiftType = shiftType;
		this.dgpsLongitude = dgpsLongitude;
		this.dgpsLatitude = dgpsLatitude;
		this.dgpsLaunch = dgpsLaunch;
		this.lightLongitude = lightLongitude;
		this.lightLatitude = lightLatitude;
		this.lightType = lightType;
		this.rhythmName = rhythmName;
		this.rhythmParameters = rhythmParameters;
		this.lightColor = lightColor;
		this.lightCycle = lightCycle;
		this.publishRange = publishRange;
		this.messageSix = messageSix;
		this.messageEight = messageEight;
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>      
	 */
	public AidsMarkedDynamicBo() {
		super();
		// TODO Auto-generated constructor stub
	}

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
	 * @return the otherLongitude
	 */
	public String getOtherLongitude() {
		return otherLongitude;
	}

	/**
	 * @param otherLongitude the otherLongitude to set
	 */
	public void setOtherLongitude(String otherLongitude) {
		this.otherLongitude = otherLongitude;
	}

	/**
	 * @return the otherLatitude
	 */
	public String getOtherLatitude() {
		return otherLatitude;
	}

	/**
	 * @param otherLatitude the otherLatitude to set
	 */
	public void setOtherLatitude(String otherLatitude) {
		this.otherLatitude = otherLatitude;
	}

	/**
	 * @return the otherType
	 */
	public int getOtherType() {
		return otherType;
	}

	/**
	 * @param otherType the otherType to set
	 */
	public void setOtherType(int otherType) {
		this.otherType = otherType;
	}

	/**
	 * @return the shiftStartLongitude
	 */
	public String getShiftStartLongitude() {
		return shiftStartLongitude;
	}

	/**
	 * @param shiftStartLongitude the shiftStartLongitude to set
	 */
	public void setShiftStartLongitude(String shiftStartLongitude) {
		this.shiftStartLongitude = shiftStartLongitude;
	}

	/**
	 * @return the shiftStartLatitude
	 */
	public String getShiftStartLatitude() {
		return shiftStartLatitude;
	}

	/**
	 * @param shiftStartLatitude the shiftStartLatitude to set
	 */
	public void setShiftStartLatitude(String shiftStartLatitude) {
		this.shiftStartLatitude = shiftStartLatitude;
	}

	/**
	 * @return the shiftEndLongitude
	 */
	public String getShiftEndLongitude() {
		return shiftEndLongitude;
	}

	/**
	 * @param shiftEndLongitude the shiftEndLongitude to set
	 */
	public void setShiftEndLongitude(String shiftEndLongitude) {
		this.shiftEndLongitude = shiftEndLongitude;
	}

	/**
	 * @return the shiftEndLatitude
	 */
	public String getShiftEndLatitude() {
		return shiftEndLatitude;
	}

	/**
	 * @param shiftEndLatitude the shiftEndLatitude to set
	 */
	public void setShiftEndLatitude(String shiftEndLatitude) {
		this.shiftEndLatitude = shiftEndLatitude;
	}

	/**
	 * @return the shiftType
	 */
	public int getShiftType() {
		return shiftType;
	}

	/**
	 * @param shiftType the shiftType to set
	 */
	public void setShiftType(int shiftType) {
		this.shiftType = shiftType;
	}

	/**
	 * @return the dgpsLongitude
	 */
	public String getDgpsLongitude() {
		return dgpsLongitude;
	}

	/**
	 * @param dgpsLongitude the dgpsLongitude to set
	 */
	public void setDgpsLongitude(String dgpsLongitude) {
		this.dgpsLongitude = dgpsLongitude;
	}

	/**
	 * @return the dgpsLatitude
	 */
	public String getDgpsLatitude() {
		return dgpsLatitude;
	}

	/**
	 * @param dgpsLatitude the dgpsLatitude to set
	 */
	public void setDgpsLatitude(String dgpsLatitude) {
		this.dgpsLatitude = dgpsLatitude;
	}

	/**
	 * @return the dgpsLaunch
	 */
	public int getDgpsLaunch() {
		return dgpsLaunch;
	}

	/**
	 * @param dgpsLaunch the dgpsLaunch to set
	 */
	public void setDgpsLaunch(int dgpsLaunch) {
		this.dgpsLaunch = dgpsLaunch*10;
	}

	/**
	 * @return the lightLongitude
	 */
	public String getLightLongitude() {
		return lightLongitude;
	}

	/**
	 * @param lightLongitude the lightLongitude to set
	 */
	public void setLightLongitude(String lightLongitude) {
		this.lightLongitude = lightLongitude;
	}

	/**
	 * @return the lightLatitude
	 */
	public String getLightLatitude() {
		return lightLatitude;
	}

	/**
	 * @param lightLatitude the lightLatitude to set
	 */
	public void setLightLatitude(String lightLatitude) {
		this.lightLatitude = lightLatitude;
	}

	/**
	 * @return the lightType
	 */
	public int getLightType() {
		return lightType;
	}

	/**
	 * @param lightType the lightType to set
	 */
	public void setLightType(int lightType) {
		this.lightType = lightType;
	}

	/**
	 * @return the rhythmName
	 */
	public int getRhythmName() {
		return rhythmName;
	}

	/**
	 * @param rhythmName the rhythmName to set
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
	 * @param rhythmParameters the rhythmParameters to set
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
	 * @param lightColor the lightColor to set
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
	 * @param lightCycle the lightCycle to set
	 */
	public void setLightCycle(int lightCycle) {
		this.lightCycle = lightCycle;
	}

	/**
	 * @return the publishRange
	 */
	public int getPublishRange() {
		return publishRange;
	}

	/**
	 * @param publishRange the publishRange to set
	 */
	public void setPublishRange(int publishRange) {
		this.publishRange = publishRange;
	}

	/**
	 * @return the messageSix
	 */
	public MessageSix getMessageSix() {
		return messageSix;
	}

	/**
	 * @param messageSix the messageSix to set
	 */
	public void setMessageSix(MessageSix messageSix) {
		this.messageSix = messageSix;
	}

	/**
	 * @return the messageEight
	 */
	public MessageEight getMessageEight() {
		return messageEight;
	}

	/**
	 * @param messageEight the messageEight to set
	 */
	public void setMessageEight(MessageEight messageEight) {
		this.messageEight = messageEight;
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

	/** (非 Javadoc)   
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return   
	 * @see java.lang.Object#toString()   
	 */
	@Override
	public String toString() {
		return "AidsMarkedDynamicBo [type=" + type + ", otherLongitude="
				+ otherLongitude + ", otherLatitude=" + otherLatitude
				+ ", otherType=" + otherType + ", shiftStartLongitude="
				+ shiftStartLongitude + ", shiftStartLatitude="
				+ shiftStartLatitude + ", shiftEndLongitude="
				+ shiftEndLongitude + ", shiftEndLatitude=" + shiftEndLatitude
				+ ", shiftType=" + shiftType + ", dgpsLongitude="
				+ dgpsLongitude + ", dgpsLatitude=" + dgpsLatitude
				+ ", dgpsLaunch=" + dgpsLaunch + ", lightLongitude="
				+ lightLongitude + ", lightLatitude=" + lightLatitude
				+ ", lightType=" + lightType + ", rhythmName=" + rhythmName
				+ ", rhythmParameters=" + rhythmParameters + ", lightColor="
				+ lightColor + ", lightCycle=" + lightCycle + ", publishRange="
				+ publishRange + ", messageSix=" + messageSix
				+ ", messageEight=" + messageEight + "]";
	}
	
	
}
