/**     
 * @Title: NavigationVo.java    
 * @Package com.scyb.aisweather.vdl.vo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月5日 下午2:54:32    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.vo;

import java.util.Date;
import java.util.List;

import com.scyb.aisweather.vdl.util.FiledDataFormatUtil;

/**
 *      @ClassName: NavigationVo     @Description: TODO(这里用一句话描述这个类的作用)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年10月5日 下午2:54:32           
 */
public class NavigationVo {

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

	private int type;

	private Integer longitudeD;

	private Integer LongitudeM;

	private Double LongitudeS;

	private Integer LatitudeD;

	private Integer LatitudeM;

	private Double LatitudeS;
	
	private Double radius;
	
	private String time1;
	
	private String time2;
	
	private int farther;

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>      
	 */
	public NavigationVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param messageNo
	 * @param source_id
	 * @param destination_id
	 * @param type
	 * @param longitudeD
	 * @param longitudeM
	 * @param longitudeS
	 * @param latitudeD
	 * @param latitudeM
	 * @param latitudeS
	 * @param radius
	 * @param time1
	 * @param time2
	 * @param farther   
	 */
	public NavigationVo(int messageNo, int source_id, int destination_id,
			int type, Integer longitudeD, Integer longitudeM,
			Double longitudeS, Integer latitudeD, Integer latitudeM,
			Double latitudeS, Double radius, String time1, String time2, int farther) {
		super();
		this.messageNo = messageNo;
		this.source_id = source_id;
		this.destination_id = destination_id;
		this.type = type;
		this.longitudeD = longitudeD;
		LongitudeM = longitudeM;
		LongitudeS = longitudeS;
		LatitudeD = latitudeD;
		LatitudeM = latitudeM;
		LatitudeS = latitudeS;
		this.radius = radius;
		this.time1 = time1;
		this.time2 = time2;
		this.farther = farther;
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
	 * @return the radius
	 */
	public Double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(String radius) {
		this.radius = FiledDataFormatUtil.nauticalMileFormatDouble(radius);
	}

	/**
	 * @return the time1
	 */
	public String getTime1() {
		return time1;
	}

	/**
	 * @param time1 the time1 to set
	 */
	public void setTime1(String time1) {
		this.time1 = time1;
	}

	/**
	 * @return the time2
	 */
	public String getTime2() {
		return time2;
	}

	/**
	 * @param time2 the time2 to set
	 */
	public void setTime2(String time2) {
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

	/** (非 Javadoc)   
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return   
	 * @see java.lang.Object#toString()   
	 */
	@Override
	public String toString() {
		return "NavigationVo [messageNo=" + messageNo + ", source_id="
				+ source_id + ", destination_id=" + destination_id + ", type="
				+ type + ", longitudeD=" + longitudeD + ", LongitudeM="
				+ LongitudeM + ", LongitudeS=" + LongitudeS + ", LatitudeD="
				+ LatitudeD + ", LatitudeM=" + LatitudeM + ", LatitudeS="
				+ LatitudeS + ", radius=" + radius + ", time1=" + time1
				+ ", time2=" + time2 + ", farther=" + farther + "]";
	}
	
	
	
}
