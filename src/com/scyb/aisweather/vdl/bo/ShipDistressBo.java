/**     
 * @Title: ShipDistressBo.java    
 * @Package com.scyb.aisweather.vdl.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月6日 下午9:53:44    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.bo;

import java.util.Date;

import com.scyb.aisweather.vdl.bo.head.MessageEight;
import com.scyb.aisweather.vdl.bo.head.MessageSix;

/**
 *      @ClassName: ShipDistressBo     @Description: TODO(这里用一句话描述这个类的作用)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年10月6日 下午9:53:44           
 */
public class ShipDistressBo {

	/**
	 *      @Fields DAC : TODO(DAC码)   
	 */
	private final static int DAC = 412;

	/**
	 *      @Fields FI : TODO(FI功能码)   
	 */
	private final static int FI = 10;

	private int distressType;

	private int statusDescribed;

	private int shipType;

	private int farther;

	private Date dateTime;

	private int releaseTime;
	
	private MessageSix messageSix;

	private MessageEight messageEight;

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>      
	 */
	public ShipDistressBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param distressType
	 * @param statusDescribed
	 * @param shipType
	 * @param farther
	 * @param dateTime
	 * @param releaseTime
	 * @param messageSix
	 * @param messageEight   
	 */
	public ShipDistressBo(int distressType, int statusDescribed, int shipType,
			int farther, Date dateTime, int releaseTime, MessageSix messageSix,
			MessageEight messageEight) {
		super();
		this.distressType = distressType;
		this.statusDescribed = statusDescribed;
		this.shipType = shipType;
		this.farther = farther;
		this.dateTime = dateTime;
		this.releaseTime = releaseTime;
		this.messageSix = messageSix;
		this.messageEight = messageEight;
	}

	/**
	 * @return the distressType
	 */
	public int getDistressType() {
		return distressType;
	}

	/**
	 * @param distressType the distressType to set
	 */
	public void setDistressType(int distressType) {
		this.distressType = distressType;
	}

	/**
	 * @return the statusDescribed
	 */
	public int getStatusDescribed() {
		return statusDescribed;
	}

	/**
	 * @param statusDescribed the statusDescribed to set
	 */
	public void setStatusDescribed(int statusDescribed) {
		this.statusDescribed = statusDescribed;
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
	 * @return the dateTime
	 */
	public Date getDateTime() {
		return dateTime;
	}

	/**
	 * @param dateTime the dateTime to set
	 */
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	/**
	 * @return the releaseTime
	 */
	public int getReleaseTime() {
		return releaseTime;
	}

	/**
	 * @param releaseTime the releaseTime to set
	 */
	public void setReleaseTime(int releaseTime) {
		this.releaseTime = releaseTime;
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
		return "ShipDistressBo [distressType=" + distressType
				+ ", statusDescribed=" + statusDescribed + ", shipType="
				+ shipType + ", farther=" + farther + ", dateTime=" + dateTime
				+ ", releaseTime=" + releaseTime + ", messageSix=" + messageSix
				+ ", messageEight=" + messageEight + "]";
	}
	
}
