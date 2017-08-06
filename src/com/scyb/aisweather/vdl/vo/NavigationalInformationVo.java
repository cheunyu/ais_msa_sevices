/**     
 * @Title: NavigationalInformationVo.java    
 * @Package com.scyb.aisweather.vdl.vo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月7日 下午7:21:15    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.vo;

/**   
 * @ClassName: NavigationalInformationVo   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月7日 下午7:21:15      
 *    
 */
public class NavigationalInformationVo {

	/**
	 *      @Fields source_id : TODO(起始站台MMSI)   
	 */
	private int source_id;

	/**
	 *      @Fields destination_id : TODO(目标站台MMSI)   
	 */
	private int destination_id;
	
	private int departurePort;
	
	private int shipType;
	
	private int powerType;
	
	private int horsepower;
	
	private int personnelTotal;
	
	private int berthMarina;
	
	private int berthTime;

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>      
	 */
	public NavigationalInformationVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param source_id
	 * @param destination_id
	 * @param departurePort
	 * @param shipType
	 * @param powerType
	 * @param horsepower
	 * @param personnelTotal
	 * @param berthMarina
	 * @param berthTime   
	 */
	public NavigationalInformationVo(int source_id, int destination_id,
			int departurePort, int shipType, int powerType, int horsepower,
			int personnelTotal, int berthMarina, int berthTime) {
		super();
		this.source_id = source_id;
		this.destination_id = destination_id;
		this.departurePort = departurePort;
		this.shipType = shipType;
		this.powerType = powerType;
		this.horsepower = horsepower;
		this.personnelTotal = personnelTotal;
		this.berthMarina = berthMarina;
		this.berthTime = berthTime;
	}

	/**
	 * @return the source_id
	 */
	public int getSource_id() {
		return source_id;
	}

	/**
	 * @param source_id the source_id to set
	 */
	public void setSource_id(int source_id) {
		this.source_id = source_id;
	}

	/**
	 * @return the destination_id
	 */
	public int getDestination_id() {
		return destination_id;
	}

	/**
	 * @param destination_id the destination_id to set
	 */
	public void setDestination_id(int destination_id) {
		this.destination_id = destination_id;
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

	/** (非 Javadoc)   
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return   
	 * @see java.lang.Object#toString()   
	 */
	@Override
	public String toString() {
		return "NavigationalInformationVo [source_id=" + source_id
				+ ", destination_id=" + destination_id + ", departurePort="
				+ departurePort + ", shipType=" + shipType + ", powerType="
				+ powerType + ", horsepower=" + horsepower
				+ ", personnelTotal=" + personnelTotal + ", berthMarina="
				+ berthMarina + ", berthTime=" + berthTime + "]";
	}
	
	
}
