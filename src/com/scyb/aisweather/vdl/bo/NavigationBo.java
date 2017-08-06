/**     
 * @Title: NavigationBo.java    
 * @Package com.scyb.aisweather.vdl.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月5日 下午9:35:44    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.bo;

import java.util.Date;

import com.scyb.aisweather.vdl.bo.head.MessageEight;
import com.scyb.aisweather.vdl.bo.head.MessageSix;

/**
 *      @ClassName: NavigationBo     @Description: TODO(这里用一句话描述这个类的作用)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年10月5日 下午9:35:44           
 */
public class NavigationBo {

	/**
	 *      @Fields DAC : TODO(DAC码)   
	 */
	private final static int DAC = 412;

	/**
	 *      @Fields FI : TODO(FI功能码)   
	 */
	private final static int FI = 6;

	private int type;

	private int radius;

	private Date time1;

	private Date time2;

	private int farther;

	private MessageSix messageSix;

	private MessageEight messageEight;

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>      
	 */
	public NavigationBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param type
	 * @param radius
	 * @param time1
	 * @param time2
	 * @param farther
	 * @param messageSix
	 * @param messageEight   
	 */
	public NavigationBo(int type, int radius, Date time1, Date time2,
			int farther, MessageSix messageSix, MessageEight messageEight) {
		super();
		this.type = type;
		this.radius = radius;
		this.time1 = time1;
		this.time2 = time2;
		this.farther = farther;
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
	 * @return the time1
	 */
	public Date getTime1() {
		return time1;
	}

	/**
	 * @param time1 the time1 to set
	 */
	public void setTime1(Date time1) {
		this.time1 = time1;
	}

	/**
	 * @return the time2
	 */
	public Date getTime2() {
		return time2;
	}

	/**
	 * @param time2 the time2 to set
	 */
	public void setTime2(Date time2) {
		this.time2 = time2;
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
		return "NavigationBo [type=" + type + ", radius=" + radius + ", time1="
				+ time1 + ", time2=" + time2 + ", farther=" + farther
				+ ", messageSix=" + messageSix + ", messageEight="
				+ messageEight + "]";
	}
	
	
}
