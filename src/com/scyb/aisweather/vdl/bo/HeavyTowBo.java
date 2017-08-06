/**     
 * @Title: HeavyTowBo.java    
 * @Package com.scyb.aisweather.vdl.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月6日 下午6:29:55    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.bo;

import java.util.Date;

import com.scyb.aisweather.vdl.bo.head.MessageEight;
import com.scyb.aisweather.vdl.bo.head.MessageSix;

/**
 *      @ClassName: HeavyTowBo     @Description: TODO(这里用一句话描述这个类的作用)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年10月6日 下午6:29:55           
 */
public class HeavyTowBo {
	/**
	 *      @Fields DAC : TODO(DAC码)   
	 */
	private final static int DAC = 412;

	/**
	 *      @Fields FI : TODO(FI功能码)   
	 */
	private final static int FI = 8;

	private int mmsi;

	private int overallLength;

	private int speed;

	private Date startDateTime;

	private Date endDateTime;

	private int precautions;
	
	private MessageSix messageSix;
	
	private MessageEight messageEight;

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>      
	 */
	public HeavyTowBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param mmsi
	 * @param overallLength
	 * @param speed
	 * @param startDateTime
	 * @param endDateTime
	 * @param precautions
	 * @param messageSix
	 * @param messageEight   
	 */
	public HeavyTowBo(int mmsi, int overallLength, int speed,
			Date startDateTime, Date endDateTime, int precautions,
			MessageSix messageSix, MessageEight messageEight) {
		super();
		this.mmsi = mmsi;
		this.overallLength = overallLength;
		this.speed = speed;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.precautions = precautions;
		this.messageSix = messageSix;
		this.messageEight = messageEight;
	}

	/**
	 * @return the mmsi
	 */
	public int getMmsi() {
		return mmsi;
	}

	/**
	 * @param mmsi the mmsi to set
	 */
	public void setMmsi(int mmsi) {
		this.mmsi = mmsi;
	}

	/**
	 * @return the overallLength
	 */
	public int getOverallLength() {
		return overallLength;
	}

	/**
	 * @param overallLength the overallLength to set
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
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
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
		return "HeavyTowBo [mmsi=" + mmsi + ", overallLength=" + overallLength
				+ ", speed=" + speed + ", startDateTime=" + startDateTime
				+ ", endDateTime=" + endDateTime + ", precautions="
				+ precautions + ", messageSix=" + messageSix
				+ ", messageEight=" + messageEight + "]";
	}
	
	
}
