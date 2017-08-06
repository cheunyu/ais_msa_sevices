/**     
 * @Title: DemarcatedAreaBo.java    
 * @Package com.scyb.aisweather.vdl.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月6日 下午10:26:46    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.bo;

import java.util.Date;

import com.scyb.aisweather.vdl.bo.head.MessageEight;
import com.scyb.aisweather.vdl.bo.head.MessageSix;

/**
 *      @ClassName: DemarcatedAreaBo     @Description: TODO(这里用一句话描述这个类的作用)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年10月6日 下午10:26:46      
 *     
 */
public class DemarcatedAreaBo {
	/**
	 *      @Fields DAC : TODO(DAC码)   
	 */
	private final static int DAC = 412;

	/**
	 *      @Fields FI : TODO(FI功能码)   
	 */
	private final static int FI = 11;

	private int areaType;

	private int areaFeature;

	private Integer roundLongitudeD;

	private Integer roundLongitudeM;

	private Double roundLongitudeS;

	private Integer roundLatitudeD;

	private Integer roundLatitudeM;

	private Double roundLatitudeS;

	private int radius;

	private Integer rectangleStartLongitudeD;

	private Integer rectangleStartLongitudeM;

	private Double rectangleStartLongitudeS;

	private Integer rectangleStartLatitudeD;

	private Integer rectangleStartLatitudeM;

	private Double rectangleStartLatitudeS;

	private Integer rectangleEndLongitudeD;

	private Integer rectangleEndLongitudeM;

	private Double rectangleEndLongitudeS;

	private Integer rectangleEndLatitudeD;

	private Integer rectangleEndLatitudeM;

	private Double rectangleEndLatitudeS;

	private Date startDateTime;

	private Date endDateTime;

	private int farther;

	private MessageSix messageSix;

	private MessageEight messageEight;

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>      
	 */
	public DemarcatedAreaBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param areaType
	 * @param areaFeature
	 * @param roundLongitudeD
	 * @param roundLongitudeM
	 * @param roundLongitudeS
	 * @param roundLatitudeD
	 * @param roundLatitudeM
	 * @param roundLatitudeS
	 * @param radius
	 * @param rectangleStartLongitudeD
	 * @param rectangleStartLongitudeM
	 * @param rectangleStartLongitudeS
	 * @param rectangleStartLatitudeD
	 * @param rectangleStartLatitudeM
	 * @param rectangleStartLatitudeS
	 * @param rectangleEndLongitudeD
	 * @param rectangleEndLongitudeM
	 * @param rectangleEndLongitudeS
	 * @param rectangleEndLatitudeD
	 * @param rectangleEndLatitudeM
	 * @param rectangleEndLatitudeS
	 * @param startDateTime
	 * @param endDateTime
	 * @param farther
	 * @param messageSix
	 * @param messageEight   
	 */
	public DemarcatedAreaBo(int areaType, int areaFeature,
			Integer roundLongitudeD, Integer roundLongitudeM,
			Double roundLongitudeS, Integer roundLatitudeD,
			Integer roundLatitudeM, Double roundLatitudeS, int radius,
			Integer rectangleStartLongitudeD, Integer rectangleStartLongitudeM,
			Double rectangleStartLongitudeS, Integer rectangleStartLatitudeD,
			Integer rectangleStartLatitudeM, Double rectangleStartLatitudeS,
			Integer rectangleEndLongitudeD, Integer rectangleEndLongitudeM,
			Double rectangleEndLongitudeS, Integer rectangleEndLatitudeD,
			Integer rectangleEndLatitudeM, Double rectangleEndLatitudeS,
			Date startDateTime, Date endDateTime, int farther,
			MessageSix messageSix, MessageEight messageEight) {
		super();
		this.areaType = areaType;
		this.areaFeature = areaFeature;
		this.roundLongitudeD = roundLongitudeD;
		this.roundLongitudeM = roundLongitudeM;
		this.roundLongitudeS = roundLongitudeS;
		this.roundLatitudeD = roundLatitudeD;
		this.roundLatitudeM = roundLatitudeM;
		this.roundLatitudeS = roundLatitudeS;
		this.radius = radius;
		this.rectangleStartLongitudeD = rectangleStartLongitudeD;
		this.rectangleStartLongitudeM = rectangleStartLongitudeM;
		this.rectangleStartLongitudeS = rectangleStartLongitudeS;
		this.rectangleStartLatitudeD = rectangleStartLatitudeD;
		this.rectangleStartLatitudeM = rectangleStartLatitudeM;
		this.rectangleStartLatitudeS = rectangleStartLatitudeS;
		this.rectangleEndLongitudeD = rectangleEndLongitudeD;
		this.rectangleEndLongitudeM = rectangleEndLongitudeM;
		this.rectangleEndLongitudeS = rectangleEndLongitudeS;
		this.rectangleEndLatitudeD = rectangleEndLatitudeD;
		this.rectangleEndLatitudeM = rectangleEndLatitudeM;
		this.rectangleEndLatitudeS = rectangleEndLatitudeS;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.farther = farther;
		this.messageSix = messageSix;
		this.messageEight = messageEight;
	}

	/**
	 * @return the areaType
	 */
	public int getAreaType() {
		return areaType;
	}

	/**
	 * @param areaType the areaType to set
	 */
	public void setAreaType(int areaType) {
		this.areaType = areaType;
	}

	/**
	 * @return the areaFeature
	 */
	public int getAreaFeature() {
		return areaFeature;
	}

	/**
	 * @param areaFeature the areaFeature to set
	 */
	public void setAreaFeature(int areaFeature) {
		this.areaFeature = areaFeature;
	}

	/**
	 * @return the roundLongitudeD
	 */
	public Integer getRoundLongitudeD() {
		return roundLongitudeD;
	}

	/**
	 * @param roundLongitudeD the roundLongitudeD to set
	 */
	public void setRoundLongitudeD(Integer roundLongitudeD) {
		this.roundLongitudeD = roundLongitudeD;
	}

	/**
	 * @return the roundLongitudeM
	 */
	public Integer getRoundLongitudeM() {
		return roundLongitudeM;
	}

	/**
	 * @param roundLongitudeM the roundLongitudeM to set
	 */
	public void setRoundLongitudeM(Integer roundLongitudeM) {
		this.roundLongitudeM = roundLongitudeM;
	}

	/**
	 * @return the roundLongitudeS
	 */
	public Double getRoundLongitudeS() {
		return roundLongitudeS;
	}

	/**
	 * @param roundLongitudeS the roundLongitudeS to set
	 */
	public void setRoundLongitudeS(Double roundLongitudeS) {
		this.roundLongitudeS = roundLongitudeS;
	}

	/**
	 * @return the roundLatitudeD
	 */
	public Integer getRoundLatitudeD() {
		return roundLatitudeD;
	}

	/**
	 * @param roundLatitudeD the roundLatitudeD to set
	 */
	public void setRoundLatitudeD(Integer roundLatitudeD) {
		this.roundLatitudeD = roundLatitudeD;
	}

	/**
	 * @return the roundLatitudeM
	 */
	public Integer getRoundLatitudeM() {
		return roundLatitudeM;
	}

	/**
	 * @param roundLatitudeM the roundLatitudeM to set
	 */
	public void setRoundLatitudeM(Integer roundLatitudeM) {
		this.roundLatitudeM = roundLatitudeM;
	}

	/**
	 * @return the roundLatitudeS
	 */
	public Double getRoundLatitudeS() {
		return roundLatitudeS;
	}

	/**
	 * @param roundLatitudeS the roundLatitudeS to set
	 */
	public void setRoundLatitudeS(Double roundLatitudeS) {
		this.roundLatitudeS = roundLatitudeS;
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
	 * @return the rectangleStartLongitudeD
	 */
	public Integer getRectangleStartLongitudeD() {
		return rectangleStartLongitudeD;
	}

	/**
	 * @param rectangleStartLongitudeD the rectangleStartLongitudeD to set
	 */
	public void setRectangleStartLongitudeD(Integer rectangleStartLongitudeD) {
		this.rectangleStartLongitudeD = rectangleStartLongitudeD;
	}

	/**
	 * @return the rectangleStartLongitudeM
	 */
	public Integer getRectangleStartLongitudeM() {
		return rectangleStartLongitudeM;
	}

	/**
	 * @param rectangleStartLongitudeM the rectangleStartLongitudeM to set
	 */
	public void setRectangleStartLongitudeM(Integer rectangleStartLongitudeM) {
		this.rectangleStartLongitudeM = rectangleStartLongitudeM;
	}

	/**
	 * @return the rectangleStartLongitudeS
	 */
	public Double getRectangleStartLongitudeS() {
		return rectangleStartLongitudeS;
	}

	/**
	 * @param rectangleStartLongitudeS the rectangleStartLongitudeS to set
	 */
	public void setRectangleStartLongitudeS(Double rectangleStartLongitudeS) {
		this.rectangleStartLongitudeS = rectangleStartLongitudeS;
	}

	/**
	 * @return the rectangleStartLatitudeD
	 */
	public Integer getRectangleStartLatitudeD() {
		return rectangleStartLatitudeD;
	}

	/**
	 * @param rectangleStartLatitudeD the rectangleStartLatitudeD to set
	 */
	public void setRectangleStartLatitudeD(Integer rectangleStartLatitudeD) {
		this.rectangleStartLatitudeD = rectangleStartLatitudeD;
	}

	/**
	 * @return the rectangleStartLatitudeM
	 */
	public Integer getRectangleStartLatitudeM() {
		return rectangleStartLatitudeM;
	}

	/**
	 * @param rectangleStartLatitudeM the rectangleStartLatitudeM to set
	 */
	public void setRectangleStartLatitudeM(Integer rectangleStartLatitudeM) {
		this.rectangleStartLatitudeM = rectangleStartLatitudeM;
	}

	/**
	 * @return the rectangleStartLatitudeS
	 */
	public Double getRectangleStartLatitudeS() {
		return rectangleStartLatitudeS;
	}

	/**
	 * @param rectangleStartLatitudeS the rectangleStartLatitudeS to set
	 */
	public void setRectangleStartLatitudeS(Double rectangleStartLatitudeS) {
		this.rectangleStartLatitudeS = rectangleStartLatitudeS;
	}

	/**
	 * @return the rectangleEndLongitudeD
	 */
	public Integer getRectangleEndLongitudeD() {
		return rectangleEndLongitudeD;
	}

	/**
	 * @param rectangleEndLongitudeD the rectangleEndLongitudeD to set
	 */
	public void setRectangleEndLongitudeD(Integer rectangleEndLongitudeD) {
		this.rectangleEndLongitudeD = rectangleEndLongitudeD;
	}

	/**
	 * @return the rectangleEndLongitudeM
	 */
	public Integer getRectangleEndLongitudeM() {
		return rectangleEndLongitudeM;
	}

	/**
	 * @param rectangleEndLongitudeM the rectangleEndLongitudeM to set
	 */
	public void setRectangleEndLongitudeM(Integer rectangleEndLongitudeM) {
		this.rectangleEndLongitudeM = rectangleEndLongitudeM;
	}

	/**
	 * @return the rectangleEndLongitudeS
	 */
	public Double getRectangleEndLongitudeS() {
		return rectangleEndLongitudeS;
	}

	/**
	 * @param rectangleEndLongitudeS the rectangleEndLongitudeS to set
	 */
	public void setRectangleEndLongitudeS(Double rectangleEndLongitudeS) {
		this.rectangleEndLongitudeS = rectangleEndLongitudeS;
	}

	/**
	 * @return the rectangleEndLatitudeD
	 */
	public Integer getRectangleEndLatitudeD() {
		return rectangleEndLatitudeD;
	}

	/**
	 * @param rectangleEndLatitudeD the rectangleEndLatitudeD to set
	 */
	public void setRectangleEndLatitudeD(Integer rectangleEndLatitudeD) {
		this.rectangleEndLatitudeD = rectangleEndLatitudeD;
	}

	/**
	 * @return the rectangleEndLatitudeM
	 */
	public Integer getRectangleEndLatitudeM() {
		return rectangleEndLatitudeM;
	}

	/**
	 * @param rectangleEndLatitudeM the rectangleEndLatitudeM to set
	 */
	public void setRectangleEndLatitudeM(Integer rectangleEndLatitudeM) {
		this.rectangleEndLatitudeM = rectangleEndLatitudeM;
	}

	/**
	 * @return the rectangleEndLatitudeS
	 */
	public Double getRectangleEndLatitudeS() {
		return rectangleEndLatitudeS;
	}

	/**
	 * @param rectangleEndLatitudeS the rectangleEndLatitudeS to set
	 */
	public void setRectangleEndLatitudeS(Double rectangleEndLatitudeS) {
		this.rectangleEndLatitudeS = rectangleEndLatitudeS;
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
		return "DemarcatedAreaBo [areaType=" + areaType + ", areaFeature="
				+ areaFeature + ", roundLongitudeD=" + roundLongitudeD
				+ ", roundLongitudeM=" + roundLongitudeM + ", roundLongitudeS="
				+ roundLongitudeS + ", roundLatitudeD=" + roundLatitudeD
				+ ", roundLatitudeM=" + roundLatitudeM + ", roundLatitudeS="
				+ roundLatitudeS + ", radius=" + radius
				+ ", rectangleStartLongitudeD=" + rectangleStartLongitudeD
				+ ", rectangleStartLongitudeM=" + rectangleStartLongitudeM
				+ ", rectangleStartLongitudeS=" + rectangleStartLongitudeS
				+ ", rectangleStartLatitudeD=" + rectangleStartLatitudeD
				+ ", rectangleStartLatitudeM=" + rectangleStartLatitudeM
				+ ", rectangleStartLatitudeS=" + rectangleStartLatitudeS
				+ ", rectangleEndLongitudeD=" + rectangleEndLongitudeD
				+ ", rectangleEndLongitudeM=" + rectangleEndLongitudeM
				+ ", rectangleEndLongitudeS=" + rectangleEndLongitudeS
				+ ", rectangleEndLatitudeD=" + rectangleEndLatitudeD
				+ ", rectangleEndLatitudeM=" + rectangleEndLatitudeM
				+ ", rectangleEndLatitudeS=" + rectangleEndLatitudeS
				+ ", startDateTime=" + startDateTime + ", endDateTime="
				+ endDateTime + ", farther=" + farther + ", messageSix="
				+ messageSix + ", messageEight=" + messageEight + "]";
	}
	
	
}
