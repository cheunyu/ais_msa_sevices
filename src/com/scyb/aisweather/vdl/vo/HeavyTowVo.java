/**     
 * @Title: HeavyTowVo.java    
 * @Package com.scyb.aisweather.vdl.vo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月6日 下午6:20:05    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.vo;

import java.util.Date;

import com.scyb.aisweather.vdl.util.FiledDataFormatUtil;

/**   
 * @ClassName: HeavyTowVo   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月6日 下午6:20:05      
 *    
 */
public class HeavyTowVo {
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
	
	private int mmsi;
	
	private Integer startLongitudeD;

	private Integer startLongitudeM;

	private Double startLongitudeS;

	private Integer startLatitudeD;

	private Integer startLatitudeM;

	private Double startLatitudeS;
	
	private Integer endLongitudeD;

	private Integer endLongitudeM;

	private Double endLongitudeS;

	private Integer endLatitudeD;

	private Integer endLatitudeM;

	private Double endLatitudeS;
	
	private int overallLength;
	
	private int speed;
	
	private String startDateTime;
	
	private String endDateTime;
	
	private int precautions;

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>      
	 */
	public HeavyTowVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param messageNo
	 * @param source_id
	 * @param destination_id
	 * @param mmsi
	 * @param startLongitudeD
	 * @param startLongitudeM
	 * @param startLongitudeS
	 * @param startLatitudeD
	 * @param startLatitudeM
	 * @param startLatitudeS
	 * @param endLongitudeD
	 * @param endLongitudeM
	 * @param endLongitudeS
	 * @param endLatitudeD
	 * @param endLatitudeM
	 * @param endLatitudeS
	 * @param overallLength
	 * @param speed
	 * @param startDateTime
	 * @param endDateTime
	 * @param precautions   
	 */
	public HeavyTowVo(int messageNo, int source_id, int destination_id,
			int mmsi, Integer startLongitudeD, Integer startLongitudeM,
			Double startLongitudeS, Integer startLatitudeD,
			Integer startLatitudeM, Double startLatitudeS,
			Integer endLongitudeD, Integer endLongitudeM, Double endLongitudeS,
			Integer endLatitudeD, Integer endLatitudeM, Double endLatitudeS,
			int overallLength, int speed, String startDateTime, String endDateTime,
			int precautions) {
		super();
		this.messageNo = messageNo;
		this.source_id = source_id;
		this.destination_id = destination_id;
		this.mmsi = mmsi;
		this.startLongitudeD = startLongitudeD;
		this.startLongitudeM = startLongitudeM;
		this.startLongitudeS = startLongitudeS;
		this.startLatitudeD = startLatitudeD;
		this.startLatitudeM = startLatitudeM;
		this.startLatitudeS = startLatitudeS;
		this.endLongitudeD = endLongitudeD;
		this.endLongitudeM = endLongitudeM;
		this.endLongitudeS = endLongitudeS;
		this.endLatitudeD = endLatitudeD;
		this.endLatitudeM = endLatitudeM;
		this.endLatitudeS = endLatitudeS;
		this.overallLength = overallLength;
		this.speed = speed;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.precautions = precautions;
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
	 * @return the startLongitudeD
	 */
	public Integer getStartLongitudeD() {
		return startLongitudeD;
	}

	/**
	 * @param startLongitudeD the startLongitudeD to set
	 */
	public void setStartLongitudeD(Integer startLongitudeD) {
		this.startLongitudeD = startLongitudeD;
	}

	/**
	 * @return the startLongitudeM
	 */
	public Integer getStartLongitudeM() {
		return startLongitudeM;
	}

	/**
	 * @param startLongitudeM the startLongitudeM to set
	 */
	public void setStartLongitudeM(Integer startLongitudeM) {
		this.startLongitudeM = startLongitudeM;
	}

	/**
	 * @return the startLongitudeS
	 */
	public Double getStartLongitudeS() {
		return startLongitudeS;
	}

	/**
	 * @param startLongitudeS the startLongitudeS to set
	 */
	public void setStartLongitudeS(Double startLongitudeS) {
		this.startLongitudeS = startLongitudeS;
	}

	/**
	 * @return the startLatitudeD
	 */
	public Integer getStartLatitudeD() {
		return startLatitudeD;
	}

	/**
	 * @param startLatitudeD the startLatitudeD to set
	 */
	public void setStartLatitudeD(Integer startLatitudeD) {
		this.startLatitudeD = startLatitudeD;
	}

	/**
	 * @return the startLatitudeM
	 */
	public Integer getStartLatitudeM() {
		return startLatitudeM;
	}

	/**
	 * @param startLatitudeM the startLatitudeM to set
	 */
	public void setStartLatitudeM(Integer startLatitudeM) {
		this.startLatitudeM = startLatitudeM;
	}

	/**
	 * @return the startLatitudeS
	 */
	public Double getStartLatitudeS() {
		return startLatitudeS;
	}

	/**
	 * @param startLatitudeS the startLatitudeS to set
	 */
	public void setStartLatitudeS(Double startLatitudeS) {
		this.startLatitudeS = startLatitudeS;
	}

	/**
	 * @return the endLongitudeD
	 */
	public Integer getEndLongitudeD() {
		return endLongitudeD;
	}

	/**
	 * @param endLongitudeD the endLongitudeD to set
	 */
	public void setEndLongitudeD(Integer endLongitudeD) {
		this.endLongitudeD = endLongitudeD;
	}

	/**
	 * @return the endLongitudeM
	 */
	public Integer getEndLongitudeM() {
		return endLongitudeM;
	}

	/**
	 * @param endLongitudeM the endLongitudeM to set
	 */
	public void setEndLongitudeM(Integer endLongitudeM) {
		this.endLongitudeM = endLongitudeM;
	}

	/**
	 * @return the endLongitudeS
	 */
	public Double getEndLongitudeS() {
		return endLongitudeS;
	}

	/**
	 * @param endLongitudeS the endLongitudeS to set
	 */
	public void setEndLongitudeS(Double endLongitudeS) {
		this.endLongitudeS = endLongitudeS;
	}

	/**
	 * @return the endLatitudeD
	 */
	public Integer getEndLatitudeD() {
		return endLatitudeD;
	}

	/**
	 * @param endLatitudeD the endLatitudeD to set
	 */
	public void setEndLatitudeD(Integer endLatitudeD) {
		this.endLatitudeD = endLatitudeD;
	}

	/**
	 * @return the endLatitudeM
	 */
	public Integer getEndLatitudeM() {
		return endLatitudeM;
	}

	/**
	 * @param endLatitudeM the endLatitudeM to set
	 */
	public void setEndLatitudeM(Integer endLatitudeM) {
		this.endLatitudeM = endLatitudeM;
	}

	/**
	 * @return the endLatitudeS
	 */
	public Double getEndLatitudeS() {
		return endLatitudeS;
	}

	/**
	 * @param endLatitudeS the endLatitudeS to set
	 */
	public void setEndLatitudeS(Double endLatitudeS) {
		this.endLatitudeS = endLatitudeS;
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
	public void setOverallLength(String overallLength) {
		this.overallLength = FiledDataFormatUtil.meterFormat(overallLength);
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
	public void setSpeed(String speed) {
		this.speed = FiledDataFormatUtil.speedJieFormat(speed);
	}

	/**
	 * @return the startDateTime
	 */
	public String getStartDateTime() {
		return startDateTime;
	}

	/**
	 * @param startDateTime the startDateTime to set
	 */
	public void setStartDateTime(String startDateTime) {
		this.startDateTime = startDateTime;
	}

	/**
	 * @return the endDateTime
	 */
	public String getEndDateTime() {
		return endDateTime;
	}

	/**
	 * @param endDateTime the endDateTime to set
	 */
	public void setEndDateTime(String endDateTime) {
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

	/** (非 Javadoc)   
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return   
	 * @see java.lang.Object#toString()   
	 */
	@Override
	public String toString() {
		return "HeavyTowVo [messageNo=" + messageNo + ", source_id="
				+ source_id + ", destination_id=" + destination_id + ", mmsi="
				+ mmsi + ", startLongitudeD=" + startLongitudeD
				+ ", startLongitudeM=" + startLongitudeM + ", startLongitudeS="
				+ startLongitudeS + ", startLatitudeD=" + startLatitudeD
				+ ", startLatitudeM=" + startLatitudeM + ", startLatitudeS="
				+ startLatitudeS + ", endLongitudeD=" + endLongitudeD
				+ ", endLongitudeM=" + endLongitudeM + ", endLongitudeS="
				+ endLongitudeS + ", endLatitudeD=" + endLatitudeD
				+ ", endLatitudeM=" + endLatitudeM + ", endLatitudeS="
				+ endLatitudeS + ", overallLength=" + overallLength
				+ ", speed=" + speed + ", startDateTime=" + startDateTime
				+ ", endDateTime=" + endDateTime + ", precautions="
				+ precautions + "]";
	}
	
	
}
