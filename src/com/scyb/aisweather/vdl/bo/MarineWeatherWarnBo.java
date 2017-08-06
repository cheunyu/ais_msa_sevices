/**     
 * @Title: MarineWeatherWarnBo.java    
 * @Package com.scyb.aisweather.vdl.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年9月25日 下午2:32:27    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.bo;

import com.scyb.aisweather.vdl.bo.head.MessageEight;
import com.scyb.aisweather.vdl.bo.head.MessageSix;

/**   
 * @ClassName: MarineWeatherWarnBo   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年9月25日 下午2:32:27      
 *    
 */
public class MarineWeatherWarnBo {

	/**
	 *      @Fields DAC : TODO(DAC码)   
	 */
	private final static int DAC = 412;

	/**
	 *      @Fields FI : TODO(FI功能码)   
	 */
	private final static int FI = 3;
	
	/**   
	 * @Fields warnType : TODO(预警类型)   
	 */
	private int warnType;
	
	/**   
	 * @Fields warnContent : TODO(预警内容)   
	 */
	private int warnContent;
	
	/**   
	 * @Fields warnDateTime : TODO(预警时间)   
	 */
	private String warnDateTime;
	
	/**   
	 * @Fields timeRange : TODO(预警时效)   
	 */
	private String timeRange;

	private MessageSix messageSix;
	
	private MessageEight messageEight;
	
	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>      
	 */
	public MarineWeatherWarnBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param warnType
	 * @param warnContent
	 * @param warnDateTime
	 * @param timeRange
	 * @param messageSix
	 * @param messageEight   
	 */
	public MarineWeatherWarnBo(int warnType, int warnContent, String warnDateTime, String timeRange, MessageSix messageSix, MessageEight messageEight) {
		super();
		this.warnType = warnType;
		this.warnContent = warnContent;
		this.warnDateTime = warnDateTime;
		this.timeRange = timeRange;
		this.messageSix = messageSix;
		this.messageEight = messageEight;
	}

	/**
	 * @return the warnType
	 */
	public int getWarnType() {
		return warnType;
	}

	/**
	 * @param warnType the warnType to set
	 */
	public void setWarnType(int warnType) {
		this.warnType = warnType;
	}

	/**
	 * @return the warnContent
	 */
	public int getWarnContent() {
		return warnContent;
	}

	/**
	 * @param warnContent the warnContent to set
	 */
	public void setWarnContent(int warnContent) {
		this.warnContent = warnContent;
	}

	/**
	 * @return the warnDateTime
	 */
	public String getWarnDateTime() {
		return warnDateTime;
	}

	/**
	 * @param warnDateTime the warnDateTime to set
	 */
	public void setWarnDateTime(String warnDateTime) {
		this.warnDateTime = warnDateTime;
	}

	/**
	 * @return the timeRange
	 */
	public String getTimeRange() {
		return timeRange;
	}

	/**
	 * @param timeRange the timeRange to set
	 */
	public void setTimeRange(String timeRange) {
		this.timeRange = timeRange;
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
		return "MarineWeatherWarnBo [warnType=" + warnType + ", warnContent=" + warnContent + ", warnDateTime=" + warnDateTime + ", timeRange=" + timeRange
				+ ", messageSix=" + messageSix + ", messageEight=" + messageEight + "]";
	}

	
}
