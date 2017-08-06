/**     
 * @Title: AidsMarkedDynamicVo.java    
 * @Package com.scyb.aisweather.vdl.vo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月5日 上午10:20:00    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.vo;

import java.util.List;

import com.scyb.aisweather.vdl.util.FiledDataFormatUtil;

/**   
 * @ClassName: AidsMarkedDynamicVo   
 * @Description: TODO(助航标注动态vo)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月5日 上午10:20:00      
 *    
 */
public class AidsMarkedDynamicVo {

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
	
	private int publishRange;
	
	private Integer otherLongitudeD;
	
	private Integer otherLongitudeM;
	
	private Double otherLongitudeS;
	
	private Integer otherLatitudeD;
	
	private Integer otherLatitudeM;
	
	private Double otherLatitudeS;
	
	private int otherType;
	
	private Integer shiftStartLongitudeD;
	
	private Integer shiftStartLongitudeM;
	
	private Double shiftStartLongitudeS;
	
	private Integer shiftStartLatitudeD;
	
	private Integer shiftStartLatitudeM;
	
	private Double shiftStartLatitudeS;
	
	private Integer shiftEndLongitudeD;
	
	private Integer shiftEndLongitudeM;
	
	private Double shiftEndLongitudeS;
	
	private Integer shiftEndLatitudeD;
	
	private Integer shiftEndLatitudeM;
	
	private Double shiftEndLatitudeS;
	
	private int shiftType;
	
	private Integer dgpsLongitudeD;
	
	private Integer dgpsLongitudeM;
	
	private Double dgpsLongitudeS;
	
	private Integer dgpsLatitudeD;
	
	private Integer dgpsLatitudeM;
	
	private Double dgpsLatitudeS;
	
	private Double dgpsLaunch;
	
	private Integer lightLongitudeD;
	
	private Integer lightLongitudeM;
	
	private Double lightLongitudeS;
	
	private Integer lightLatitudeD;
	
	private Integer lightLatitudeM;
	
	private Double lightLatitudeS;
	
	private int lightType;
	
	private int rhythmName;
	
	private int rhythmParameters;
	
	private int lightColor;
	
	private int lightCycle;

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>      
	 */
	public AidsMarkedDynamicVo() {
		super();
		// TODO Auto-generated constructor stub
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
	 * @return the publishRange
	 */
	public int getPublishRange() {
		return publishRange;
	}

	/**
	 * @param publishRange the publishRange to set
	 */
	public void setPublishRange(String publishRange) {
		this.publishRange = FiledDataFormatUtil.hourFormat(publishRange);
	}

	/**
	 * @return the otherLongitudeD
	 */
	public Integer getOtherLongitudeD() {
		if(otherLongitudeD == null) {
			otherLongitudeD = 0;
		}
		return otherLongitudeD;
	}

	/**
	 * @param otherLongitudeD the otherLongitudeD to set
	 */
	public void setOtherLongitudeD(Integer otherLongitudeD) {
		this.otherLongitudeD = otherLongitudeD;
	}

	/**
	 * @return the otherLongitudeM
	 */
	public Integer getOtherLongitudeM() {
		if(otherLongitudeM == null) {
			otherLongitudeM = 0;
		}
		return otherLongitudeM;
	}

	/**
	 * @param otherLongitudeM the otherLongitudeM to set
	 */
	public void setOtherLongitudeM(Integer otherLongitudeM) {
		this.otherLongitudeM = otherLongitudeM;
	}

	/**
	 * @return the otherLongitudeS
	 */
	public Double getOtherLongitudeS() {
		if(otherLongitudeS == null) {
			otherLongitudeS = 0d;
		}
		return otherLongitudeS;
	}

	/**
	 * @param otherLongitudeS the otherLongitudeS to set
	 */
	public void setOtherLongitudeS(Double otherLongitudeS) {
		this.otherLongitudeS = otherLongitudeS;
	}

	/**
	 * @return the otherLatitudeD
	 */
	public Integer getOtherLatitudeD() {
		if(otherLatitudeD == null) {
			otherLatitudeD = 0;
		}
		return otherLatitudeD;
	}

	/**
	 * @param otherLatitudeD the otherLatitudeD to set
	 */
	public void setOtherLatitudeD(Integer otherLatitudeD) {
		this.otherLatitudeD = otherLatitudeD;
	}

	/**
	 * @return the otherLatitudeM
	 */
	public Integer getOtherLatitudeM() {
		if(otherLatitudeM == null) {
			otherLatitudeM = 0;
		}
		return otherLatitudeM;
	}

	/**
	 * @param otherLatitudeM the otherLatitudeM to set
	 */
	public void setOtherLatitudeM(Integer otherLatitudeM) {
		this.otherLatitudeM = otherLatitudeM;
	}

	/**
	 * @return the otherLatitudeS
	 */
	public Double getOtherLatitudeS() {
		if(otherLatitudeS == null) {
			otherLatitudeS = 0d;
		}
		return otherLatitudeS;
	}

	/**
	 * @param otherLatitudeS the otherLatitudeS to set
	 */
	public void setOtherLatitudeS(Double otherLatitudeS) {
		this.otherLatitudeS = otherLatitudeS;
	}

	/**
	 * @return the otherType
	 */
	public int getOtherType() {
		return otherType;
	}

	/**
	 * @param otherType the otherType to set
	 */
	public void setOtherType(int otherType) {
		this.otherType = otherType;
	}

	/**
	 * @return the shiftStartLongitudeD
	 */
	public Integer getShiftStartLongitudeD() {
		if(shiftStartLongitudeD == null) {
			shiftStartLongitudeD = 0;
		}
		return shiftStartLongitudeD;
	}

	/**
	 * @param shiftStartLongitudeD the shiftStartLongitudeD to set
	 */
	public void setShiftStartLongitudeD(Integer shiftStartLongitudeD) {
		this.shiftStartLongitudeD = shiftStartLongitudeD;
	}

	/**
	 * @return the shiftStartLongitudeM
	 */
	public Integer getShiftStartLongitudeM() {
		if(shiftStartLongitudeM == null) {
			shiftStartLongitudeM = 0;
		}
		return shiftStartLongitudeM;
	}

	/**
	 * @param shiftStartLongitudeM the shiftStartLongitudeM to set
	 */
	public void setShiftStartLongitudeM(Integer shiftStartLongitudeM) {
		this.shiftStartLongitudeM = shiftStartLongitudeM;
	}

	/**
	 * @return the shiftStartLongitudeS
	 */
	public Double getShiftStartLongitudeS() {
		if(shiftStartLongitudeS == null) {
			shiftStartLongitudeS = 0d;
		}
		return shiftStartLongitudeS;
	}

	/**
	 * @param shiftStartLongitudeS the shiftStartLongitudeS to set
	 */
	public void setShiftStartLongitudeS(Double shiftStartLongitudeS) {
		this.shiftStartLongitudeS = shiftStartLongitudeS;
	}

	/**
	 * @return the shiftStartLatitudeD
	 */
	public Integer getShiftStartLatitudeD() {
		if(shiftStartLatitudeD == null) {
			shiftStartLatitudeD = 0;
		}
		return shiftStartLatitudeD;
	}

	/**
	 * @param shiftStartLatitudeD the shiftStartLatitudeD to set
	 */
	public void setShiftStartLatitudeD(Integer shiftStartLatitudeD) {
		this.shiftStartLatitudeD = shiftStartLatitudeD;
	}

	/**
	 * @return the shiftStartLatitudeM
	 */
	public Integer getShiftStartLatitudeM() {
		if(shiftStartLatitudeM == null) {
			shiftStartLatitudeM = 0;
		}
		return shiftStartLatitudeM;
	}

	/**
	 * @param shiftStartLatitudeM the shiftStartLatitudeM to set
	 */
	public void setShiftStartLatitudeM(Integer shiftStartLatitudeM) {
		this.shiftStartLatitudeM = shiftStartLatitudeM;
	}

	/**
	 * @return the shiftStartLatitudeS
	 */
	public Double getShiftStartLatitudeS() {
		if(shiftStartLatitudeS == null) {
			shiftStartLatitudeS = 0d;
		}
		return shiftStartLatitudeS;
	}

	/**
	 * @param shiftStartLatitudeS the shiftStartLatitudeS to set
	 */
	public void setShiftStartLatitudeS(Double shiftStartLatitudeS) {
		this.shiftStartLatitudeS = shiftStartLatitudeS;
	}

	/**
	 * @return the shiftEndLongitudeD
	 */
	public Integer getShiftEndLongitudeD() {
		if(shiftEndLongitudeD == null) {
			shiftEndLongitudeD = 0;
		}
		return shiftEndLongitudeD;
	}

	/**
	 * @param shiftEndLongitudeD the shiftEndLongitudeD to set
	 */
	public void setShiftEndLongitudeD(Integer shiftEndLongitudeD) {
		this.shiftEndLongitudeD = shiftEndLongitudeD;
	}

	/**
	 * @return the shiftEndLongitudeM
	 */
	public Integer getShiftEndLongitudeM() {
		if(shiftEndLongitudeM == null) {
			shiftEndLongitudeM = 0;
		}
		return shiftEndLongitudeM;
	}

	/**
	 * @param shiftEndLongitudeM the shiftEndLongitudeM to set
	 */
	public void setShiftEndLongitudeM(Integer shiftEndLongitudeM) {
		this.shiftEndLongitudeM = shiftEndLongitudeM;
	}

	/**
	 * @return the shiftEndLongitudeS
	 */
	public Double getShiftEndLongitudeS() {
		if(shiftEndLongitudeS == null) {
			shiftEndLongitudeS = 0d;
		}
		return shiftEndLongitudeS;
	}

	/**
	 * @param shiftEndLongitudeS the shiftEndLongitudeS to set
	 */
	public void setShiftEndLongitudeS(Double shiftEndLongitudeS) {
		this.shiftEndLongitudeS = shiftEndLongitudeS;
	}

	/**
	 * @return the shiftEndLatitudeD
	 */
	public Integer getShiftEndLatitudeD() {
		if(shiftEndLatitudeD == null) {
			shiftEndLatitudeD = 0;
		}
		return shiftEndLatitudeD;
	}

	/**
	 * @param shiftEndLatitudeD the shiftEndLatitudeD to set
	 */
	public void setShiftEndLatitudeD(Integer shiftEndLatitudeD) {
		this.shiftEndLatitudeD = shiftEndLatitudeD;
	}

	/**
	 * @return the shiftEndLatitudeM
	 */
	public Integer getShiftEndLatitudeM() {
		if(shiftEndLatitudeM == null) {
			shiftEndLatitudeM = 0;
		}
		return shiftEndLatitudeM;
	}

	/**
	 * @param shiftEndLatitudeM the shiftEndLatitudeM to set
	 */
	public void setShiftEndLatitudeM(Integer shiftEndLatitudeM) {
		this.shiftEndLatitudeM = shiftEndLatitudeM;
	}

	/**
	 * @return the shiftEndLatitudeS
	 */
	public Double getShiftEndLatitudeS() {
		if(shiftEndLatitudeS == null) {
			shiftEndLatitudeS = 0d;
		}
		return shiftEndLatitudeS;
	}

	/**
	 * @param shiftEndLatitudeS the shiftEndLatitudeS to set
	 */
	public void setShiftEndLatitudeS(Double shiftEndLatitudeS) {
		this.shiftEndLatitudeS = shiftEndLatitudeS;
	}

	/**
	 * @return the shiftType
	 */
	public int getShiftType() {
		return shiftType;
	}

	/**
	 * @param shiftType the shiftType to set
	 */
	public void setShiftType(int shiftType) {
		this.shiftType = shiftType;
	}

	/**
	 * @return the dgpsLongitudeD
	 */
	public Integer getDgpsLongitudeD() {
		if(dgpsLongitudeD == null) {
			dgpsLongitudeD = 0;
		}
		return dgpsLongitudeD;
	}

	/**
	 * @param dgpsLongitudeD the dgpsLongitudeD to set
	 */
	public void setDgpsLongitudeD(Integer dgpsLongitudeD) {
		this.dgpsLongitudeD = dgpsLongitudeD;
	}

	/**
	 * @return the dgpsLongitudeM
	 */
	public Integer getDgpsLongitudeM() {
		if(dgpsLongitudeM == null) {
			dgpsLongitudeM = 0;
		}
		return dgpsLongitudeM;
	}

	/**
	 * @param dgpsLongitudeM the dgpsLongitudeM to set
	 */
	public void setDgpsLongitudeM(Integer dgpsLongitudeM) {
		this.dgpsLongitudeM = dgpsLongitudeM;
	}

	/**
	 * @return the dgpsLongitudeS
	 */
	public Double getDgpsLongitudeS() {
		if(dgpsLongitudeS == null) {
			dgpsLongitudeS = 0d;
		}
		return dgpsLongitudeS;
	}

	/**
	 * @param dgpsLongitudeS the dgpsLongitudeS to set
	 */
	public void setDgpsLongitudeS(Double dgpsLongitudeS) {
		this.dgpsLongitudeS = dgpsLongitudeS;
	}

	/**
	 * @return the dgpsLatitudeD
	 */
	public Integer getDgpsLatitudeD() {
		if(dgpsLatitudeD == null) {
			dgpsLatitudeD = 0;
		}
		return dgpsLatitudeD;
	}

	/**
	 * @param dgpsLatitudeD the dgpsLatitudeD to set
	 */
	public void setDgpsLatitudeD(Integer dgpsLatitudeD) {
		this.dgpsLatitudeD = dgpsLatitudeD;
	}

	/**
	 * @return the dgpsLatitudeM
	 */
	public Integer getDgpsLatitudeM() {
		if(dgpsLatitudeM == null) {
			dgpsLatitudeM = 0;
		}
		return dgpsLatitudeM;
	}

	/**
	 * @param dgpsLatitudeM the dgpsLatitudeM to set
	 */
	public void setDgpsLatitudeM(Integer dgpsLatitudeM) {
		this.dgpsLatitudeM = dgpsLatitudeM;
	}

	/**
	 * @return the dgpsLatitudeS
	 */
	public Double getDgpsLatitudeS() {
		if(dgpsLatitudeS == null) {
			dgpsLatitudeS = 0d;
		}
		return dgpsLatitudeS;
	}

	/**
	 * @param dgpsLatitudeS the dgpsLatitudeS to set
	 */
	public void setDgpsLatitudeS(Double dgpsLatitudeS) {
		this.dgpsLatitudeS = dgpsLatitudeS;
	}

	/**
	 * @return the dgpsLaunch
	 */
	public Double getDgpsLaunch() {
		if(dgpsLaunch == null) {
			dgpsLaunch = 0d;
		}
		return dgpsLaunch;
	}

	/**
	 * @param dgpsLaunch the dgpsLaunch to set
	 */
	public void setDgpsLaunch(String dgpsLaunch) {
		this.dgpsLaunch = FiledDataFormatUtil.launchFormat(dgpsLaunch);
	}

	/**
	 * @return the lightLongitudeD
	 */
	public Integer getLightLongitudeD() {
		if(lightLongitudeD == null) {
			lightLongitudeD = 0;
		}
		return lightLongitudeD;
	}

	/**
	 * @param lightLongitudeD the lightLongitudeD to set
	 */
	public void setLightLongitudeD(Integer lightLongitudeD) {
		this.lightLongitudeD = lightLongitudeD;
	}

	/**
	 * @return the lightLongitudeM
	 */
	public Integer getLightLongitudeM() {
		if(lightLongitudeM == null) {
			lightLongitudeM = 0;
		}
		return lightLongitudeM;
	}

	/**
	 * @param lightLongitudeM the lightLongitudeM to set
	 */
	public void setLightLongitudeM(Integer lightLongitudeM) {
		this.lightLongitudeM = lightLongitudeM;
	}

	/**
	 * @return the lightLongitudeS
	 */
	public Double getLightLongitudeS() {
		if(lightLongitudeS == null) {
			lightLongitudeS = 0d;
		}
		return lightLongitudeS;
	}

	/**
	 * @param lightLongitudeS the lightLongitudeS to set
	 */
	public void setLightLongitudeS(Double lightLongitudeS) {
		this.lightLongitudeS = lightLongitudeS;
	}

	/**
	 * @return the lightLatitudeD
	 */
	public Integer getLightLatitudeD() {
		if(lightLatitudeD == null) {
			lightLatitudeD = 0;
		}
		return lightLatitudeD;
	}

	/**
	 * @param lightLatitudeD the lightLatitudeD to set
	 */
	public void setLightLatitudeD(Integer lightLatitudeD) {
		this.lightLatitudeD = lightLatitudeD;
	}

	/**
	 * @return the lightLatitudeM
	 */
	public Integer getLightLatitudeM() {
		if(lightLatitudeM == null) {
			lightLatitudeM = 0;
		}
		return lightLatitudeM;
	}

	/**
	 * @param lightLatitudeM the lightLatitudeM to set
	 */
	public void setLightLatitudeM(Integer lightLatitudeM) {
		this.lightLatitudeM = lightLatitudeM;
	}

	/**
	 * @return the lightLatitudeS
	 */
	public Double getLightLatitudeS() {
		if(lightLatitudeS == null) {
			lightLatitudeS = 0d;
		}
		return lightLatitudeS;
	}

	/**
	 * @param lightLatitudeS the lightLatitudeS to set
	 */
	public void setLightLatitudeS(Double lightLatitudeS) {
		this.lightLatitudeS = lightLatitudeS;
	}

	/**
	 * @return the lightType
	 */
	public int getLightType() {
		return lightType;
	}

	/**
	 * @param lightType the lightType to set
	 */
	public void setLightType(int lightType) {
		this.lightType = lightType;
	}

	/**
	 * @return the rhythmName
	 */
	public int getRhythmName() {
		return rhythmName;
	}

	/**
	 * @param rhythmName the rhythmName to set
	 */
	public void setRhythmName(int rhythmName) {
		this.rhythmName = rhythmName;
	}

	/**
	 * @return the rhythmParameters
	 */
	public int getRhythmParameters() {
		return rhythmParameters;
	}

	/**
	 * @param rhythmParameters the rhythmParameters to set
	 */
	public void setRhythmParameters(int rhythmParameters) {
		this.rhythmParameters = rhythmParameters;
	}

	/**
	 * @return the lightColor
	 */
	public int getLightColor() {
		return lightColor;
	}

	/**
	 * @param lightColor the lightColor to set
	 */
	public void setLightColor(int lightColor) {
		this.lightColor = lightColor;
	}

	/**
	 * @return the lightCycle
	 */
	public int getLightCycle() {
		return lightCycle;
	}

	/**
	 * @param lightCycle the lightCycle to set
	 */
	public void setLightCycle(int lightCycle) {
		this.lightCycle = lightCycle;
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param messageNo
	 * @param source_id
	 * @param destination_id
	 * @param type
	 * @param publishRange
	 * @param otherLongitudeD
	 * @param otherLongitudeM
	 * @param otherLongitudeS
	 * @param otherLatitudeD
	 * @param otherLatitudeM
	 * @param otherLatitudeS
	 * @param otherType
	 * @param shiftStartLongitudeD
	 * @param shiftStartLongitudeM
	 * @param shiftStartLongitudeS
	 * @param shiftStartLatitudeD
	 * @param shiftStartLatitudeM
	 * @param shiftStartLatitudeS
	 * @param shiftEndLongitudeD
	 * @param shiftEndLongitudeM
	 * @param shiftEndLongitudeS
	 * @param shiftEndLatitudeD
	 * @param shiftEndLatitudeM
	 * @param shiftEndLatitudeS
	 * @param shiftType
	 * @param dgpsLongitudeD
	 * @param dgpsLongitudeM
	 * @param dgpsLongitudeS
	 * @param dgpsLatitudeD
	 * @param dgpsLatitudeM
	 * @param dgpsLatitudeS
	 * @param dgpsLaunch
	 * @param lightLongitudeD
	 * @param lightLongitudeM
	 * @param lightLongitudeS
	 * @param lightLatitudeD
	 * @param lightLatitudeM
	 * @param lightLatitudeS
	 * @param lightType
	 * @param rhythmName
	 * @param rhythmParameters
	 * @param lightColor
	 * @param lightCycle   
	 */
	public AidsMarkedDynamicVo(int messageNo, int source_id, int destination_id, int type, int publishRange, Integer otherLongitudeD, Integer otherLongitudeM,
			Double otherLongitudeS, Integer otherLatitudeD, Integer otherLatitudeM, Double otherLatitudeS, int otherType, Integer shiftStartLongitudeD,
			Integer shiftStartLongitudeM, Double shiftStartLongitudeS, Integer shiftStartLatitudeD, Integer shiftStartLatitudeM, Double shiftStartLatitudeS,
			Integer shiftEndLongitudeD, Integer shiftEndLongitudeM, Double shiftEndLongitudeS, Integer shiftEndLatitudeD, Integer shiftEndLatitudeM,
			Double shiftEndLatitudeS, int shiftType, Integer dgpsLongitudeD, Integer dgpsLongitudeM, Double dgpsLongitudeS, Integer dgpsLatitudeD,
			Integer dgpsLatitudeM, Double dgpsLatitudeS, Double dgpsLaunch, Integer lightLongitudeD, Integer lightLongitudeM, Double lightLongitudeS,
			Integer lightLatitudeD, Integer lightLatitudeM, Double lightLatitudeS, int lightType, int rhythmName, int rhythmParameters, int lightColor,
			int lightCycle) {
		super();
		this.messageNo = messageNo;
		this.source_id = source_id;
		this.destination_id = destination_id;
		this.type = type;
		this.publishRange = publishRange;
		this.otherLongitudeD = otherLongitudeD;
		this.otherLongitudeM = otherLongitudeM;
		this.otherLongitudeS = otherLongitudeS;
		this.otherLatitudeD = otherLatitudeD;
		this.otherLatitudeM = otherLatitudeM;
		this.otherLatitudeS = otherLatitudeS;
		this.otherType = otherType;
		this.shiftStartLongitudeD = shiftStartLongitudeD;
		this.shiftStartLongitudeM = shiftStartLongitudeM;
		this.shiftStartLongitudeS = shiftStartLongitudeS;
		this.shiftStartLatitudeD = shiftStartLatitudeD;
		this.shiftStartLatitudeM = shiftStartLatitudeM;
		this.shiftStartLatitudeS = shiftStartLatitudeS;
		this.shiftEndLongitudeD = shiftEndLongitudeD;
		this.shiftEndLongitudeM = shiftEndLongitudeM;
		this.shiftEndLongitudeS = shiftEndLongitudeS;
		this.shiftEndLatitudeD = shiftEndLatitudeD;
		this.shiftEndLatitudeM = shiftEndLatitudeM;
		this.shiftEndLatitudeS = shiftEndLatitudeS;
		this.shiftType = shiftType;
		this.dgpsLongitudeD = dgpsLongitudeD;
		this.dgpsLongitudeM = dgpsLongitudeM;
		this.dgpsLongitudeS = dgpsLongitudeS;
		this.dgpsLatitudeD = dgpsLatitudeD;
		this.dgpsLatitudeM = dgpsLatitudeM;
		this.dgpsLatitudeS = dgpsLatitudeS;
		this.dgpsLaunch = dgpsLaunch;
		this.lightLongitudeD = lightLongitudeD;
		this.lightLongitudeM = lightLongitudeM;
		this.lightLongitudeS = lightLongitudeS;
		this.lightLatitudeD = lightLatitudeD;
		this.lightLatitudeM = lightLatitudeM;
		this.lightLatitudeS = lightLatitudeS;
		this.lightType = lightType;
		this.rhythmName = rhythmName;
		this.rhythmParameters = rhythmParameters;
		this.lightColor = lightColor;
		this.lightCycle = lightCycle;
	}

	/** (非 Javadoc)   
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return   
	 * @see java.lang.Object#toString()   
	 */
	@Override
	public String toString() {
		return "AidsMarkedDynamicVo [messageNo=" + messageNo + ", source_id=" + source_id + ", destination_id=" + destination_id + ", type=" + type
				+ ", publishRange=" + publishRange + ", otherLongitudeD=" + otherLongitudeD + ", otherLongitudeM=" + otherLongitudeM + ", otherLongitudeS="
				+ otherLongitudeS + ", otherLatitudeD=" + otherLatitudeD + ", otherLatitudeM=" + otherLatitudeM + ", otherLatitudeS=" + otherLatitudeS
				+ ", otherType=" + otherType + ", shiftStartLongitudeD=" + shiftStartLongitudeD + ", shiftStartLongitudeM=" + shiftStartLongitudeM
				+ ", shiftStartLongitudeS=" + shiftStartLongitudeS + ", shiftStartLatitudeD=" + shiftStartLatitudeD + ", shiftStartLatitudeM="
				+ shiftStartLatitudeM + ", shiftStartLatitudeS=" + shiftStartLatitudeS + ", shiftEndLongitudeD=" + shiftEndLongitudeD + ", shiftEndLongitudeM="
				+ shiftEndLongitudeM + ", shiftEndLongitudeS=" + shiftEndLongitudeS + ", shiftEndLatitudeD=" + shiftEndLatitudeD + ", shiftEndLatitudeM="
				+ shiftEndLatitudeM + ", shiftEndLatitudeS=" + shiftEndLatitudeS + ", shiftType=" + shiftType + ", dgpsLongitudeD=" + dgpsLongitudeD
				+ ", dgpsLongitudeM=" + dgpsLongitudeM + ", dgpsLongitudeS=" + dgpsLongitudeS + ", dgpsLatitudeD=" + dgpsLatitudeD + ", dgpsLatitudeM="
				+ dgpsLatitudeM + ", dgpsLatitudeS=" + dgpsLatitudeS + ", dgpsLaunch=" + dgpsLaunch + ", lightLongitudeD=" + lightLongitudeD
				+ ", lightLongitudeM=" + lightLongitudeM + ", lightLongitudeS=" + lightLongitudeS + ", lightLatitudeD=" + lightLatitudeD + ", lightLatitudeM="
				+ lightLatitudeM + ", lightLatitudeS=" + lightLatitudeS + ", lightType=" + lightType + ", rhythmName=" + rhythmName + ", rhythmParameters="
				+ rhythmParameters + ", lightColor=" + lightColor + ", lightCycle=" + lightCycle + "]";
	}

	
	
}
