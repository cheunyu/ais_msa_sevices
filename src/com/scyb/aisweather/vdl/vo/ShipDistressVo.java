/**     
 * @Title: ShipDistressVo.java    
 * @Package com.scyb.aisweather.vdl.vo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月6日 下午9:44:15    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.vo;

import java.util.Date;

import com.scyb.aisweather.vdl.util.FiledDataFormatUtil;

/**   
 * @ClassName: ShipDistressVo   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月6日 下午9:44:15      
 *    
 */
public class ShipDistressVo {
	/**
	 *      @Fields messageNo : TODO(报文号)   
	 */
	private int messageNo;

	/**
	 *      @Fields source_id : TODO(起始站台MMSI)   
	 */
	private int source_id;

	/**
	 *      @Fields destination_id : TODO(目标站台MMSI)   
	 */
	private int destination_id;
	
	private int distressType;
	
	private int statusDescribed;
	
	private int shipType;
	
	private int farther;
	
	private Integer longitudeD;

	private Integer LongitudeM;

	private Double LongitudeS;

	private Integer LatitudeD;

	private Integer LatitudeM;

	private Double LatitudeS;
	
	private String dateTime;
	
	private int releaseTime;

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>      
	 */
	public ShipDistressVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param messageNo
	 * @param source_id
	 * @param destination_id
	 * @param distressType
	 * @param statusDescribed
	 * @param shipType
	 * @param farther
	 * @param longitudeD
	 * @param longitudeM
	 * @param longitudeS
	 * @param latitudeD
	 * @param latitudeM
	 * @param latitudeS
	 * @param dateTime
	 * @param releaseTime   
	 */
	public ShipDistressVo(int messageNo, int source_id, int destination_id,
			int distressType, int statusDescribed, int shipType, int farther,
			Integer longitudeD, Integer longitudeM, Double longitudeS,
			Integer latitudeD, Integer latitudeM, Double latitudeS,
			String dateTime, int releaseTime) {
		super();
		this.messageNo = messageNo;
		this.source_id = source_id;
		this.destination_id = destination_id;
		this.distressType = distressType;
		this.statusDescribed = statusDescribed;
		this.shipType = shipType;
		this.farther = farther;
		this.longitudeD = longitudeD;
		LongitudeM = longitudeM;
		LongitudeS = longitudeS;
		LatitudeD = latitudeD;
		LatitudeM = latitudeM;
		LatitudeS = latitudeS;
		this.dateTime = dateTime;
		this.releaseTime = releaseTime;
	}

	/**
	 * @return the messageNo
	 */
	public int getMessageNo() {
		return messageNo;
	}

	/**
	 * @param messageNo the messageNo to set
	 */
	public void setMessageNo(int messageNo) {
		this.messageNo = messageNo;
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
	 * @return the longitudeD
	 */
	public Integer getLongitudeD() {
		return longitudeD;
	}

	/**
	 * @param longitudeD the longitudeD to set
	 */
	public void setLongitudeD(Integer longitudeD) {
		this.longitudeD = longitudeD;
	}

	/**
	 * @return the longitudeM
	 */
	public Integer getLongitudeM() {
		return LongitudeM;
	}

	/**
	 * @param longitudeM the longitudeM to set
	 */
	public void setLongitudeM(Integer longitudeM) {
		LongitudeM = longitudeM;
	}

	/**
	 * @return the longitudeS
	 */
	public Double getLongitudeS() {
		return LongitudeS;
	}

	/**
	 * @param longitudeS the longitudeS to set
	 */
	public void setLongitudeS(Double longitudeS) {
		LongitudeS = longitudeS;
	}

	/**
	 * @return the latitudeD
	 */
	public Integer getLatitudeD() {
		return LatitudeD;
	}

	/**
	 * @param latitudeD the latitudeD to set
	 */
	public void setLatitudeD(Integer latitudeD) {
		LatitudeD = latitudeD;
	}

	/**
	 * @return the latitudeM
	 */
	public Integer getLatitudeM() {
		return LatitudeM;
	}

	/**
	 * @param latitudeM the latitudeM to set
	 */
	public void setLatitudeM(Integer latitudeM) {
		LatitudeM = latitudeM;
	}

	/**
	 * @return the latitudeS
	 */
	public Double getLatitudeS() {
		return LatitudeS;
	}

	/**
	 * @param latitudeS the latitudeS to set
	 */
	public void setLatitudeS(Double latitudeS) {
		LatitudeS = latitudeS;
	}

	/**
	 * @return the dateTime
	 */
	public String getDateTime() {
		return dateTime;
	}

	/**
	 * @param dateTime the dateTime to set
	 */
	public void setDateTime(String dateTime) {
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
	public void setReleaseTime(String releaseTime) {
		this.releaseTime = FiledDataFormatUtil.hourFormat(releaseTime);
	}

	/** (非 Javadoc)   
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return   
	 * @see java.lang.Object#toString()   
	 */
	@Override
	public String toString() {
		return "ShipDistressVo [messageNo=" + messageNo + ", source_id="
				+ source_id + ", destination_id=" + destination_id
				+ ", distressType=" + distressType + ", statusDescribed="
				+ statusDescribed + ", shipType=" + shipType + ", farther="
				+ farther + ", longitudeD=" + longitudeD + ", LongitudeM="
				+ LongitudeM + ", LongitudeS=" + LongitudeS + ", LatitudeD="
				+ LatitudeD + ", LatitudeM=" + LatitudeM + ", LatitudeS="
				+ LatitudeS + ", dateTime=" + dateTime + ", releaseTime="
				+ releaseTime + "]";
	}
	
}
