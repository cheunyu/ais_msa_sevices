/**     
 * @Title: ConstructionWorkBo.java    
 * @Package com.scyb.aisweather.vdl.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月6日 下午1:17:50    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.bo;

import java.util.Date;

import com.scyb.aisweather.vdl.bo.head.MessageEight;
import com.scyb.aisweather.vdl.bo.head.MessageSix;

/**
 *      @ClassName: ConstructionWorkBo     @Description: TODO(这里用一句话描述这个类的作用)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年10月6日 下午1:17:50           
 */
public class ConstructionWorkBo {
	/**
	 *      @Fields DAC : TODO(DAC码)   
	 */
	private final static int DAC = 412;

	/**
	 *      @Fields FI : TODO(FI功能码)   
	 */
	private final static int FI = 7;

	private int type;

	private int shipType;

	private int shipMMSI;

	private int radius;

	private Date startDateTime;

	private Date endDateTime;
	
	private MessageSix messageSix;
	
	private MessageEight messageEight;

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>      
	 */
	public ConstructionWorkBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param type
	 * @param shipType
	 * @param shipMMSI
	 * @param radius
	 * @param startDateTime
	 * @param endDateTime
	 * @param messageSix
	 * @param messageEight   
	 */
	public ConstructionWorkBo(int type, int shipType, int shipMMSI,
			int radius, Date startDateTime, Date endDateTime,
			MessageSix messageSix, MessageEight messageEight) {
		super();
		this.type = type;
		this.shipType = shipType;
		this.shipMMSI = shipMMSI;
		this.radius = radius;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.messageSix = messageSix;
		this.messageEight = messageEight;
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
	 * @return the shipMMSI
	 */
	public int getShipMMSI() {
		return shipMMSI;
	}

	/**
	 * @param shipMMSI the shipMMSI to set
	 */
	public void setShipMMSI(int shipMMSI) {
		this.shipMMSI = shipMMSI;
	}

	/**
	 * @return the radius
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(int radius) {
		this.radius = radius;
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
		return "ConstructionWorkBo [type=" + type + ", shipType=" + shipType
				+ ", shipMMSI=" + shipMMSI + ", radius=" + radius
				+ ", startDateTime=" + startDateTime + ", endDateTime="
				+ endDateTime + ", messageSix=" + messageSix
				+ ", messageEight=" + messageEight + "]";
	}
	
	
}
