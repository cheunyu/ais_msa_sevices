/**     
 * @Title: MilitaryActivitiyBo.java    
 * @Package com.scyb.aisweather.vdl.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月6日 下午6:03:14    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.bo;

import java.util.Date;
import java.util.List;

import com.scyb.aisweather.vdl.bo.head.MessageEight;
import com.scyb.aisweather.vdl.bo.head.MessageSix;

/**
 *      @ClassName: MilitaryActivitiyBo   
 *  @Description: TODO(这里用一句话描述这个类的作用)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年10月6日 下午6:03:14           
 */
public class MilitaryActivitiyBo {
	/**
	 *      @Fields DAC : TODO(DAC码)   
	 */
	private final static int DAC = 412;

	/**
	 *      @Fields FI : TODO(FI功能码)   
	 */
	private final static int FI = 9;

	private int activitiyTheme;

	private int durationType;

	private Date startDateTime;

	private Date endDateTime;

	private int precautions;

	private MessageSix messageSix;

	private MessageEight messageEight;

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>      
	 */
	public MilitaryActivitiyBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param activitiyTheme
	 * @param durationType
	 * @param longitudeList
	 * @param latitudeList
	 * @param startDateTime
	 * @param endDateTime
	 * @param precautions
	 * @param messageSix
	 * @param messageEight   
	 */
	public MilitaryActivitiyBo(int activitiyTheme, int durationType,
			Date startDateTime, Date endDateTime, int precautions,
			MessageSix messageSix, MessageEight messageEight) {
		super();
		this.activitiyTheme = activitiyTheme;
		this.durationType = durationType;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.precautions = precautions;
		this.messageSix = messageSix;
		this.messageEight = messageEight;
	}

	/**
	 * @return the activitiyTheme
	 */
	public int getActivitiyTheme() {
		return activitiyTheme;
	}

	/**
	 * @param activitiyTheme the activitiyTheme to set
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
	 * @param durationType the durationType to set
	 */
	public void setDurationType(int durationType) {
		this.durationType = durationType;
	}


	/**
	 * @return the startDateTime
	 */
	public Date getStartDateTime() {
		return startDateTime;
	}

	/**
	 * @param startDateTime the startDateTime to set
	 */
	public void setStartDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
	}

	/**
	 * @return the endDateTime
	 */
	public Date getEndDateTime() {
		return endDateTime;
	}

	/**
	 * @param endDateTime the endDateTime to set
	 */
	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}

	/**
	 * @return the precautions
	 */
	public int getPrecautions() {
		return precautions;
	}

	/**
	 * @param precautions the precautions to set
	 */
	public void setPrecautions(int precautions) {
		this.precautions = precautions;
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
		return "MilitaryActivitiyBo [activitiyTheme=" + activitiyTheme
				+ ", durationType=" + durationType + ", startDateTime="
				+ startDateTime + ", endDateTime=" + endDateTime
				+ ", precautions=" + precautions + ", messageSix=" + messageSix
				+ ", messageEight=" + messageEight + "]";
	}

	
}
