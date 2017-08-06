/**     
 * @Title: NavigationalInformationBo.java    
 * @Package com.scyb.aisweather.vdl.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月7日 下午7:26:26    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.bo;

import com.scyb.aisweather.vdl.bo.head.MessageSix;

/**
 *      @ClassName: NavigationalInformationBo   
 *  @Description: TODO(这里用一句话描述这个类的作用)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年10月7日 下午7:26:26           
 */
public class NavigationalInformationBo {

	/**
	 *      @Fields DAC : TODO(DAC码)   
	 */
	private final static int DAC = 412;

	/**
	 *      @Fields FI : TODO(FI功能码)   
	 */
	private final static int FI = 20;

	private int departurePort;

	private int shipType;

	private int powerType;

	private int horsepower;

	private int personnelTotal;

	private int berthMarina;

	private int berthTime;

	private MessageSix messageSix;

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>      
	 */
	public NavigationalInformationBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param departurePort
	 * @param shipType
	 * @param powerType
	 * @param horsepower
	 * @param personnelTotal
	 * @param berthMarina
	 * @param berthTime
	 * @param messageSix   
	 */
	public NavigationalInformationBo(int departurePort, int shipType,
			int powerType, int horsepower, int personnelTotal, int berthMarina,
			int berthTime, MessageSix messageSix) {
		super();
		this.departurePort = departurePort;
		this.shipType = shipType;
		this.powerType = powerType;
		this.horsepower = horsepower;
		this.personnelTotal = personnelTotal;
		this.berthMarina = berthMarina;
		this.berthTime = berthTime;
		this.messageSix = messageSix;
	}

	/**
	 * @return the departurePort
	 */
	public int getDeparturePort() {
		return departurePort;
	}

	/**
	 * @param departurePort the departurePort to set
	 */
	public void setDeparturePort(int departurePort) {
		this.departurePort = departurePort;
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
	 * @return the powerType
	 */
	public int getPowerType() {
		return powerType;
	}

	/**
	 * @param powerType the powerType to set
	 */
	public void setPowerType(int powerType) {
		this.powerType = powerType;
	}

	/**
	 * @return the horsepower
	 */
	public int getHorsepower() {
		return horsepower;
	}

	/**
	 * @param horsepower the horsepower to set
	 */
	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	/**
	 * @return the personnelTotal
	 */
	public int getPersonnelTotal() {
		return personnelTotal;
	}

	/**
	 * @param personnelTotal the personnelTotal to set
	 */
	public void setPersonnelTotal(int personnelTotal) {
		this.personnelTotal = personnelTotal;
	}

	/**
	 * @return the berthMarina
	 */
	public int getBerthMarina() {
		return berthMarina;
	}

	/**
	 * @param berthMarina the berthMarina to set
	 */
	public void setBerthMarina(int berthMarina) {
		this.berthMarina = berthMarina;
	}

	/**
	 * @return the berthTime
	 */
	public int getBerthTime() {
		return berthTime;
	}

	/**
	 * @param berthTime the berthTime to set
	 */
	public void setBerthTime(int berthTime) {
		this.berthTime = berthTime;
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
		return "NavigationalInformationBo [departurePort=" + departurePort
				+ ", shipType=" + shipType + ", powerType=" + powerType
				+ ", horsepower=" + horsepower + ", personnelTotal="
				+ personnelTotal + ", berthMarina=" + berthMarina
				+ ", berthTime=" + berthTime + ", messageSix=" + messageSix
				+ "]";
	}
	
}
