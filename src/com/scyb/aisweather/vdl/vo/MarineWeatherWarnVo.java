/**     
 * @Title: MarineWeatherWarnVo.java    
 * @Package com.scyb.aisweather.vdl.vo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年9月23日 下午1:57:50    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.vo;

import java.util.List;

import com.scyb.aisweather.vdl.util.FiledDataFormatUtil;

/**   
 * @ClassName: MarineWeatherWarnVo   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年9月23日 下午1:57:50      
 *    
 */
public class MarineWeatherWarnVo {

	/**
	 *      @Fields messageNo : TODO(报文号)   
	 */
	private int messageNo;
	
	/**   
	 * @Fields source_id : TODO(起始站台MMSI)   
	 */
	private int source_id;
	
	/**   
	 * @Fields destination_id : TODO(目标站台MMSI)   
	 */
	private int destination_id;
	
	/**
	 *      @Fields forecastTime : TODO(预警时间)   
	 */
	private String warnDateTime;
	
	/**   
	 * @Fields timeRange : TODO(预警时效)   
	 */
	private int timeRange;
	
	/**   
	 * @Fields warnType : TODO(预警类型)   
	 */
	private int warnType;
	
	/**   
	 * @Fields tropicalCycloneLond : TODO(热带气旋经度°)   
	 */
	private Integer tropicalCycloneLond;
	
	/**   
	 * @Fields tropicalCycloneLonm : TODO(热带气旋经度′)   
	 */
	private Integer tropicalCycloneLonm;
	
	/**   
	 * @Fields tropicalCycloneLons : TODO(热带气旋经度″)   
	 */
	private Double tropicalCycloneLons;
	
	/**   
	 * @Fields tropicalCycloneLatd : TODO(热带气旋纬度°)   
	 */
	private Integer tropicalCycloneLatd;
	
	/**   
	 * @Fields tropicalCycloneLatm : TODO(热带气旋纬度′)   
	 */
	private Integer tropicalCycloneLatm;
	
	/**   
	 * @Fields tropicalCycloneLats : TODO(热带气旋纬度″)   
	 */
	private Double tropicalCycloneLats;
	
	/**   
	 * @Fields tropicalCycloneType : TODO(气旋类型)   
	 */
	private int tropicalCycloneType;
	
	/**   
	 * @Fields tropicalCycloneRad : TODO(气旋半径)   
	 */
	private int tropicalCycloneRad;
	
	/**   
	 * @Fields tropicalCycloneSpeed : TODO(移动速度)   
	 */
	private int tropicalCycloneSpeed;
	
	/**   
	 * @Fields tropicalCycloneDirection : TODO(移动方向)   
	 */
	private int tropicalCycloneDirection;
	
	/**   
	 * @Fields tropicalCycloneWindPower : TODO(中心风力)   
	 */
	private int tropicalCycloneWindPower;
	
	/**   
	 * @Fields windWarnLond : TODO(大风预警经度°)   
	 */
	private Integer windWarnLond;
	
	/**   
	 * @Fields windWarnLonm : TODO(大风预警经度′)   
	 */
	private Integer windWarnLonm;
	
	/**   
	 * @Fields windWarnLons : TODO(大风预警经度″)   
	 */
	private Double windWarnLons;
	
	/**   
	 * @Fields windWarnLatd : TODO(大风预警纬度°)   
	 */
	private Integer windWarnLatd;
	
	/**   
	 * @Fields windWarnLatm : TODO(大风预警纬度′)   
	 */
	private Integer windWarnLatm;
	
	/**   
	 * @Fields windWarnLats : TODO(大风预警纬度″)   
	 */
	private Double windWarnLats; 
	
	/**   
	 * @Fields windWarnRad : TODO(大风预警半径)   
	 */
	private int windWarnRad; 
	
	/**   
	 * @Fields windWarnMinWindPower : TODO(大风预警最低风力)   
	 */
	private int windWarnMinWindPower; 
	
	/**   
	 * @Fields windWarnMaxWindPower : TODO(大风预警最高风力)   
	 */
	private int windWarnMaxWindPower; 
	
	/**   
	 * @Fields windWarnDirection : TODO(大风预警风向)   
	 */
	private int windWarnDirection; 
	
	/**   
	 * @Fields waveWarnLond : TODO(大浪预警经度°)   
	 */
	private Integer waveWarnLond;
	
	/**   
	 * @Fields waveWarnLonm : TODO(大浪预警经度′)   
	 */
	private Integer waveWarnLonm;
	
	/**   
	 * @Fields waveWarnLons : TODO(大浪预警经度″)   
	 */
	private Double waveWarnLons;
	
	/**   
	 * @Fields waveWarnLatd : TODO(大浪预警纬度°)   
	 */
	private Integer waveWarnLatd;
	
	/**   
	 * @Fields waveWarnLatm : TODO(大浪预警纬度′)   
	 */
	private Integer waveWarnLatm;
	
	/**   
	 * @Fields waveWarnLats : TODO(大浪预警纬度″)   
	 */
	private Double waveWarnLats; 
	
	/**   
	 * @Fields waveWarnRad : TODO(大浪预警半径)   
	 */
	private int waveWarnRad;
	
	/**   
	 * @Fields waveWarnHs : TODO(大浪预警波高)   
	 */
	private int waveWarnHs;
	
	/**   
	 * @Fields waveWarnPeriod : TODO(大浪预警波周期)   
	 */
	private int waveWarnPeriod;
	
	/**   
	 * @Fields fogWarnLond : TODO(大雾预警经度°)   
	 */
	private Integer fogWarnLond;
	
	/**   
	 * @Fields fogWarnLonm : TODO(大雾预警经度′)   
	 */
	private Integer fogWarnLonm;
	
	/**   
	 * @Fields fogWarnLons : TODO(大雾预警经度″)   
	 */
	private Double fogWarnLons;
	
	/**   
	 * @Fields fogWarnLatd : TODO(大雾预警纬度°)   
	 */
	private Integer fogWarnLatd;
	
	/**   
	 * @Fields fogWarnLatm : TODO(大雾预警纬度′)   
	 */
	private Integer fogWarnLatm;
	
	/**   
	 * @Fields fogWarnLats : TODO(大雾预警纬度″)   
	 */
	private Double fogWarnLats; 
	
	/**   
	 * @Fields fogWarnRad : TODO(大雾预警半径)   
	 */
	private int fogWarnRad;
	
	/**   
	 * @Fields fogWarnVisibility : TODO(大雾预警能见度)   
	 */
	private int fogWarnVisibility;
	
	/**   
	 * @Fields stormSurgeWarnLond : TODO(风暴潮预警经度°)   
	 */
	private Integer stormSurgeWarnLond;
	
	/**   
	 * @Fields stormSurgeWarnLonm : TODO(风暴潮预警经度′)   
	 */
	private Integer stormSurgeWarnLonm;
	
	/**   
	 * @Fields stormSurgeWarnLons : TODO(风暴潮预警经度″)   
	 */
	private Double stormSurgeWarnLons;
	
	/**   
	 * @Fields stormSurgeWarnLatd : TODO(风暴潮预警纬度°)   
	 */
	private Integer stormSurgeWarnLatd;
	
	/**   
	 * @Fields stormSurgeWarnLatm : TODO(风暴潮预警纬度′)   
	 */
	private Integer stormSurgeWarnLatm;
	
	/**   
	 * @Fields stormSurgeWarnLats : TODO(风暴潮预警纬度″)   
	 */
	private Double stormSurgeWarnLats; 
	
	/**   
	 * @Fields stormSurgeWarnRad : TODO(风暴潮预警半径)   
	 */
	private int stormSurgeWarnRad;
	
	/**   
	 * @Fields stormSurgeWarnIncreasWater : TODO(风暴潮预警增水)   
	 */
	private int stormSurgeWarnIncreasWater;
	
	/**   
	 * @Fields stormSurgeWarnTide : TODO(风暴潮预警潮位)   
	 */
	private int stormSurgeWarnTide;
	
	/**   
	 * @Fields stormSurgeWarnWavePeriod : TODO(风暴潮预警波周期)   
	 */
	private int stormSurgeWarnWavePeriod;
	
	/**   
	 * @Fields seaIceWarnLond : TODO(海冰预警经度°)   
	 */
	private Integer seaIceWarnLond;
	
	/**   
	 * @Fields seaIceWarnLonm : TODO(海冰预警经度′)   
	 */
	private Integer seaIceWarnLonm;
	
	/**   
	 * @Fields seaIceWarnLons : TODO(海冰预警经度″)   
	 */
	private Double seaIceWarnLons;
	
	/**   
	 * @Fields seaIceWarnLatd : TODO(海冰预警纬度°)   
	 */
	private Integer seaIceWarnLatd;
	
	/**   
	 * @Fields seaIceWarnLatm : TODO(海冰预警纬度′)   
	 */
	private Integer seaIceWarnLatm;
	
	/**   
	 * @Fields seaIceWarnLats : TODO(海冰预警纬度″)   
	 */
	private Double seaIceWarnLats; 
	
	/**   
	 * @Fields seaIceWarnRad : TODO(海冰预警半径)   
	 */
	private int seaIceWarnRad;
	
	/**   
	 * @Fields seaIceWarnThickness : TODO(海冰预警厚度)   
	 */
	private int seaIceWarnThickness;
	
	/**   
	 * @Fields coldWarnLond : TODO(寒潮预警经度°)   
	 */
	private Integer coldWarnLond;
	
	/**   
	 * @Fields coldWarnLonm : TODO(寒潮预警经度′)   
	 */
	private Integer coldWarnLonm;
	
	/**   
	 * @Fields coldWarnLons : TODO(寒潮预警经度″)   
	 */
	private Double coldWarnLons;
	
	/**   
	 * @Fields coldWarnLatd : TODO(寒潮预警纬度°)   
	 */
	private Integer coldWarnLatd;
	
	/**   
	 * @Fields coldWarnLatm : TODO(寒潮预警纬度′)   
	 */
	private Integer coldWarnLatm;
	
	/**   
	 * @Fields coldWarnLats : TODO(寒潮预警纬度″)   
	 */
	private Double coldWarnLats; 
	
	/**   
	 * @Fields coldWarnRad : TODO(寒潮预警半径)   
	 */
	private int coldWarnRad;
	
	/**   
	 * @Fields coldWarnLevel : TODO(寒潮预警级别)   
	 */
	private int coldWarnLevel;

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>      
	 */
	public MarineWeatherWarnVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param messageNo
	 * @param source_id
	 * @param destination_id
	 * @param warnDateTime
	 * @param timeRange
	 * @param warnType
	 * @param tropicalCycloneLond
	 * @param tropicalCycloneLonm
	 * @param tropicalCycloneLons
	 * @param tropicalCycloneLatd
	 * @param tropicalCycloneLatm
	 * @param tropicalCycloneLats
	 * @param tropicalCycloneType
	 * @param tropicalCycloneRad
	 * @param tropicalCycloneSpeed
	 * @param tropicalCycloneDirection
	 * @param tropicalCycloneWindPower
	 * @param windWarnLond
	 * @param windWarnLonm
	 * @param windWarnLons
	 * @param windWarnLatd
	 * @param windWarnLatm
	 * @param windWarnLats
	 * @param windWarnRad
	 * @param windWarnMinWindPower
	 * @param windWarnMaxWindPower
	 * @param windWarnDirection
	 * @param waveWarnLond
	 * @param waveWarnLonm
	 * @param waveWarnLons
	 * @param waveWarnLatd
	 * @param waveWarnLatm
	 * @param waveWarnLats
	 * @param waveWarnRad
	 * @param waveWarnHs
	 * @param waveWarnPeriod
	 * @param fogWarnLond
	 * @param fogWarnLonm
	 * @param fogWarnLons
	 * @param fogWarnLatd
	 * @param fogWarnLatm
	 * @param fogWarnLats
	 * @param fogWarnRad
	 * @param fogWarnVisibility
	 * @param stormSurgeWarnLond
	 * @param stormSurgeWarnLonm
	 * @param stormSurgeWarnLons
	 * @param stormSurgeWarnLatd
	 * @param stormSurgeWarnLatm
	 * @param stormSurgeWarnLats
	 * @param stormSurgeWarnRad
	 * @param stormSurgeWarnIncreasWater
	 * @param stormSurgeWarnTide
	 * @param stormSurgeWarnWavePeriod
	 * @param seaIceWarnLond
	 * @param seaIceWarnLonm
	 * @param seaIceWarnLons
	 * @param seaIceWarnLatd
	 * @param seaIceWarnLatm
	 * @param seaIceWarnLats
	 * @param seaIceWarnRad
	 * @param seaIceWarnThickness
	 * @param coldWarnLond
	 * @param coldWarnLonm
	 * @param coldWarnLons
	 * @param coldWarnLatd
	 * @param coldWarnLatm
	 * @param coldWarnLats
	 * @param coldWarnRad
	 * @param coldWarnLevel   
	 */
	public MarineWeatherWarnVo(int messageNo, int source_id, int destination_id, String warnDateTime, Integer timeRange, int warnType,
			Integer tropicalCycloneLond, Integer tropicalCycloneLonm, Double tropicalCycloneLons, Integer tropicalCycloneLatd, Integer tropicalCycloneLatm,
			Double tropicalCycloneLats, int tropicalCycloneType, int tropicalCycloneRad, int tropicalCycloneSpeed, int tropicalCycloneDirection,
			int tropicalCycloneWindPower, Integer windWarnLond, Integer windWarnLonm, Double windWarnLons, Integer windWarnLatd, Integer windWarnLatm,
			Double windWarnLats, int windWarnRad, int windWarnMinWindPower, int windWarnMaxWindPower, int windWarnDirection, Integer waveWarnLond,
			Integer waveWarnLonm, Double waveWarnLons, Integer waveWarnLatd, Integer waveWarnLatm, Double waveWarnLats, int waveWarnRad, int waveWarnHs,
			int waveWarnPeriod, Integer fogWarnLond, Integer fogWarnLonm, Double fogWarnLons, Integer fogWarnLatd, Integer fogWarnLatm, Double fogWarnLats,
			int fogWarnRad, int fogWarnVisibility, Integer stormSurgeWarnLond, Integer stormSurgeWarnLonm, Double stormSurgeWarnLons,
			Integer stormSurgeWarnLatd, Integer stormSurgeWarnLatm, Double stormSurgeWarnLats, int stormSurgeWarnRad, int stormSurgeWarnIncreasWater,
			int stormSurgeWarnTide, int stormSurgeWarnWavePeriod, Integer seaIceWarnLond, Integer seaIceWarnLonm, Double seaIceWarnLons,
			Integer seaIceWarnLatd, Integer seaIceWarnLatm, Double seaIceWarnLats, int seaIceWarnRad, int seaIceWarnThickness, Integer coldWarnLond,
			Integer coldWarnLonm, Double coldWarnLons, Integer coldWarnLatd, Integer coldWarnLatm, Double coldWarnLats, int coldWarnRad, int coldWarnLevel) {
		super();
		this.messageNo = messageNo;
		this.source_id = source_id;
		this.destination_id = destination_id;
		this.warnDateTime = warnDateTime;
		this.timeRange = timeRange;
		this.warnType = warnType;
		this.tropicalCycloneLond = tropicalCycloneLond;
		this.tropicalCycloneLonm = tropicalCycloneLonm;
		this.tropicalCycloneLons = tropicalCycloneLons;
		this.tropicalCycloneLatd = tropicalCycloneLatd;
		this.tropicalCycloneLatm = tropicalCycloneLatm;
		this.tropicalCycloneLats = tropicalCycloneLats;
		this.tropicalCycloneType = tropicalCycloneType;
		this.tropicalCycloneRad = tropicalCycloneRad;
		this.tropicalCycloneSpeed = tropicalCycloneSpeed;
		this.tropicalCycloneDirection = tropicalCycloneDirection;
		this.tropicalCycloneWindPower = tropicalCycloneWindPower;
		this.windWarnLond = windWarnLond;
		this.windWarnLonm = windWarnLonm;
		this.windWarnLons = windWarnLons;
		this.windWarnLatd = windWarnLatd;
		this.windWarnLatm = windWarnLatm;
		this.windWarnLats = windWarnLats;
		this.windWarnRad = windWarnRad;
		this.windWarnMinWindPower = windWarnMinWindPower;
		this.windWarnMaxWindPower = windWarnMaxWindPower;
		this.windWarnDirection = windWarnDirection;
		this.waveWarnLond = waveWarnLond;
		this.waveWarnLonm = waveWarnLonm;
		this.waveWarnLons = waveWarnLons;
		this.waveWarnLatd = waveWarnLatd;
		this.waveWarnLatm = waveWarnLatm;
		this.waveWarnLats = waveWarnLats;
		this.waveWarnRad = waveWarnRad;
		this.waveWarnHs = waveWarnHs;
		this.waveWarnPeriod = waveWarnPeriod;
		this.fogWarnLond = fogWarnLond;
		this.fogWarnLonm = fogWarnLonm;
		this.fogWarnLons = fogWarnLons;
		this.fogWarnLatd = fogWarnLatd;
		this.fogWarnLatm = fogWarnLatm;
		this.fogWarnLats = fogWarnLats;
		this.fogWarnRad = fogWarnRad;
		this.fogWarnVisibility = fogWarnVisibility;
		this.stormSurgeWarnLond = stormSurgeWarnLond;
		this.stormSurgeWarnLonm = stormSurgeWarnLonm;
		this.stormSurgeWarnLons = stormSurgeWarnLons;
		this.stormSurgeWarnLatd = stormSurgeWarnLatd;
		this.stormSurgeWarnLatm = stormSurgeWarnLatm;
		this.stormSurgeWarnLats = stormSurgeWarnLats;
		this.stormSurgeWarnRad = stormSurgeWarnRad;
		this.stormSurgeWarnIncreasWater = stormSurgeWarnIncreasWater;
		this.stormSurgeWarnTide = stormSurgeWarnTide;
		this.stormSurgeWarnWavePeriod = stormSurgeWarnWavePeriod;
		this.seaIceWarnLond = seaIceWarnLond;
		this.seaIceWarnLonm = seaIceWarnLonm;
		this.seaIceWarnLons = seaIceWarnLons;
		this.seaIceWarnLatd = seaIceWarnLatd;
		this.seaIceWarnLatm = seaIceWarnLatm;
		this.seaIceWarnLats = seaIceWarnLats;
		this.seaIceWarnRad = seaIceWarnRad;
		this.seaIceWarnThickness = seaIceWarnThickness;
		this.coldWarnLond = coldWarnLond;
		this.coldWarnLonm = coldWarnLonm;
		this.coldWarnLons = coldWarnLons;
		this.coldWarnLatd = coldWarnLatd;
		this.coldWarnLatm = coldWarnLatm;
		this.coldWarnLats = coldWarnLats;
		this.coldWarnRad = coldWarnRad;
		this.coldWarnLevel = coldWarnLevel;
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
	public Integer getTimeRange() {
		return timeRange;
	}

	/**
	 * @param timeRange the timeRange to set
	 */
	public void setTimeRange(String timeRange) {
		this.timeRange = FiledDataFormatUtil.hourFormat(timeRange);
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
	 * @return the tropicalCycloneLond
	 */
	public Integer getTropicalCycloneLond() {
		return tropicalCycloneLond;
	}

	/**
	 * @param tropicalCycloneLond the tropicalCycloneLond to set
	 */
	public void setTropicalCycloneLond(Integer tropicalCycloneLond) {
		this.tropicalCycloneLond = tropicalCycloneLond;
	}

	/**
	 * @return the tropicalCycloneLonm
	 */
	public Integer getTropicalCycloneLonm() {
		return tropicalCycloneLonm;
	}

	/**
	 * @param tropicalCycloneLonm the tropicalCycloneLonm to set
	 */
	public void setTropicalCycloneLonm(Integer tropicalCycloneLonm) {
		this.tropicalCycloneLonm = tropicalCycloneLonm;
	}

	/**
	 * @return the tropicalCycloneLons
	 */
	public Double getTropicalCycloneLons() {
		return tropicalCycloneLons;
	}

	/**
	 * @param tropicalCycloneLons the tropicalCycloneLons to set
	 */
	public void setTropicalCycloneLons(Double tropicalCycloneLons) {
		this.tropicalCycloneLons = tropicalCycloneLons;
	}

	/**
	 * @return the tropicalCycloneLatd
	 */
	public Integer getTropicalCycloneLatd() {
		return tropicalCycloneLatd;
	}

	/**
	 * @param tropicalCycloneLatd the tropicalCycloneLatd to set
	 */
	public void setTropicalCycloneLatd(Integer tropicalCycloneLatd) {
		this.tropicalCycloneLatd = tropicalCycloneLatd;
	}

	/**
	 * @return the tropicalCycloneLatm
	 */
	public Integer getTropicalCycloneLatm() {
		return tropicalCycloneLatm;
	}

	/**
	 * @param tropicalCycloneLatm the tropicalCycloneLatm to set
	 */
	public void setTropicalCycloneLatm(Integer tropicalCycloneLatm) {
		this.tropicalCycloneLatm = tropicalCycloneLatm;
	}

	/**
	 * @return the tropicalCycloneLats
	 */
	public Double getTropicalCycloneLats() {
		return tropicalCycloneLats;
	}

	/**
	 * @param tropicalCycloneLats the tropicalCycloneLats to set
	 */
	public void setTropicalCycloneLats(Double tropicalCycloneLats) {
		this.tropicalCycloneLats = tropicalCycloneLats;
	}

	/**
	 * @return the tropicalCycloneType
	 */
	public int getTropicalCycloneType() {
		return tropicalCycloneType;
	}

	/**
	 * @param tropicalCycloneType the tropicalCycloneType to set
	 */
	public void setTropicalCycloneType(String tropicalCycloneType) {
		this.tropicalCycloneType = FiledDataFormatUtil.optionDefaultFormat(tropicalCycloneType);
	}

	/**
	 * @return the tropicalCycloneRad
	 */
	public int getTropicalCycloneRad() {
		return tropicalCycloneRad;
	}

	/**
	 * @param tropicalCycloneRad the tropicalCycloneRad to set
	 */
	public void setTropicalCycloneRad(String tropicalCycloneRad) {
		this.tropicalCycloneRad = FiledDataFormatUtil.nauticalMileFormat(tropicalCycloneRad);
	}

	/**
	 * @return the tropicalCycloneSpeed
	 */
	public int getTropicalCycloneSpeed() {
		return tropicalCycloneSpeed;
	}

	/**
	 * @param tropicalCycloneSpeed the tropicalCycloneSpeed to set
	 */
	public void setTropicalCycloneSpeed(String tropicalCycloneSpeed) {
		this.tropicalCycloneSpeed = FiledDataFormatUtil.speedFormat(tropicalCycloneSpeed);
	}

	/**
	 * @return the tropicalCycloneDirection
	 */
	public int getTropicalCycloneDirection() {
		return tropicalCycloneDirection;
	}

	/**
	 * @param tropicalCycloneDirection the tropicalCycloneDirection to set
	 */
	public void setTropicalCycloneDirection(String tropicalCycloneDirection) {
		this.tropicalCycloneDirection = FiledDataFormatUtil.directionFormat(tropicalCycloneDirection);
	}

	/**
	 * @return the tropicalCycloneWindPower
	 */
	public int getTropicalCycloneWindPower() {
		return tropicalCycloneWindPower;
	}

	/**
	 * @param tropicalCycloneWindPower the tropicalCycloneWindPower to set
	 */
	public void setTropicalCycloneWindPower(String tropicalCycloneWindPower) {
		this.tropicalCycloneWindPower = FiledDataFormatUtil.windPowerFormat(tropicalCycloneWindPower);
	}

	/**
	 * @return the windWarnLond
	 */
	public Integer getWindWarnLond() {
		return windWarnLond;
	}

	/**
	 * @param windWarnLond the windWarnLond to set
	 */
	public void setWindWarnLond(Integer windWarnLond) {
		this.windWarnLond = windWarnLond;
	}

	/**
	 * @return the windWarnLonm
	 */
	public Integer getWindWarnLonm() {
		return windWarnLonm;
	}

	/**
	 * @param windWarnLonm the windWarnLonm to set
	 */
	public void setWindWarnLonm(Integer windWarnLonm) {
		this.windWarnLonm = windWarnLonm;
	}

	/**
	 * @return the windWarnLons
	 */
	public Double getWindWarnLons() {
		return windWarnLons;
	}

	/**
	 * @param windWarnLons the windWarnLons to set
	 */
	public void setWindWarnLons(Double windWarnLons) {
		this.windWarnLons = windWarnLons;
	}

	/**
	 * @return the windWarnLatd
	 */
	public Integer getWindWarnLatd() {
		return windWarnLatd;
	}

	/**
	 * @param windWarnLatd the windWarnLatd to set
	 */
	public void setWindWarnLatd(Integer windWarnLatd) {
		this.windWarnLatd = windWarnLatd;
	}

	/**
	 * @return the windWarnLatm
	 */
	public Integer getWindWarnLatm() {
		return windWarnLatm;
	}

	/**
	 * @param windWarnLatm the windWarnLatm to set
	 */
	public void setWindWarnLatm(Integer windWarnLatm) {
		this.windWarnLatm = windWarnLatm;
	}

	/**
	 * @return the windWarnLats
	 */
	public Double getWindWarnLats() {
		return windWarnLats;
	}

	/**
	 * @param windWarnLats the windWarnLats to set
	 */
	public void setWindWarnLats(Double windWarnLats) {
		this.windWarnLats = windWarnLats;
	}

	/**
	 * @return the windWarnRad
	 */
	public int getWindWarnRad() {
		return windWarnRad;
	}

	/**
	 * @param windWarnRad the windWarnRad to set
	 */
	public void setWindWarnRad(String windWarnRad) {
		this.windWarnRad = FiledDataFormatUtil.nauticalMileFormat(windWarnRad);
	}

	/**
	 * @return the windWarnMinWindPower
	 */
	public int getWindWarnMinWindPower() {
		return windWarnMinWindPower;
	}

	/**
	 * @param windWarnMinWindPower the windWarnMinWindPower to set
	 */
	public void setWindWarnMinWindPower(String windWarnMinWindPower) {
		this.windWarnMinWindPower = FiledDataFormatUtil.windPowerFormat(windWarnMinWindPower);
	}

	/**
	 * @return the windWarnMaxWindPower
	 */
	public int getWindWarnMaxWindPower() {
		return windWarnMaxWindPower;
	}

	/**
	 * @param windWarnMaxWindPower the windWarnMaxWindPower to set
	 */
	public void setWindWarnMaxWindPower(String windWarnMaxWindPower) {
		this.windWarnMaxWindPower = FiledDataFormatUtil.windPowerFormat(windWarnMaxWindPower);
	}

	/**
	 * @return the windWarnDirection
	 */
	public int getWindWarnDirection() {
		return windWarnDirection;
	}

	/**
	 * @param windWarnDirection the windWarnDirection to set
	 */
	public void setWindWarnDirection(String windWarnDirection) {
		this.windWarnDirection = FiledDataFormatUtil.optionDefaultFormat(windWarnDirection);
	}

	/**
	 * @return the waveWarnLond
	 */
	public Integer getWaveWarnLond() {
		return waveWarnLond;
	}

	/**
	 * @param waveWarnLond the waveWarnLond to set
	 */
	public void setWaveWarnLond(Integer waveWarnLond) {
		this.waveWarnLond = waveWarnLond;
	}

	/**
	 * @return the waveWarnLonm
	 */
	public Integer getWaveWarnLonm() {
		return waveWarnLonm;
	}

	/**
	 * @param waveWarnLonm the waveWarnLonm to set
	 */
	public void setWaveWarnLonm(Integer waveWarnLonm) {
		this.waveWarnLonm = waveWarnLonm;
	}

	/**
	 * @return the waveWarnLons
	 */
	public Double getWaveWarnLons() {
		return waveWarnLons;
	}

	/**
	 * @param waveWarnLons the waveWarnLons to set
	 */
	public void setWaveWarnLons(Double waveWarnLons) {
		this.waveWarnLons = waveWarnLons;
	}

	/**
	 * @return the waveWarnLatd
	 */
	public Integer getWaveWarnLatd() {
		return waveWarnLatd;
	}

	/**
	 * @param waveWarnLatd the waveWarnLatd to set
	 */
	public void setWaveWarnLatd(Integer waveWarnLatd) {
		this.waveWarnLatd = waveWarnLatd;
	}

	/**
	 * @return the waveWarnLatm
	 */
	public Integer getWaveWarnLatm() {
		return waveWarnLatm;
	}

	/**
	 * @param waveWarnLatm the waveWarnLatm to set
	 */
	public void setWaveWarnLatm(Integer waveWarnLatm) {
		this.waveWarnLatm = waveWarnLatm;
	}

	/**
	 * @return the waveWarnLats
	 */
	public Double getWaveWarnLats() {
		return waveWarnLats;
	}

	/**
	 * @param waveWarnLats the waveWarnLats to set
	 */
	public void setWaveWarnLats(Double waveWarnLats) {
		this.waveWarnLats = waveWarnLats;
	}

	/**
	 * @return the waveWarnRad
	 */
	public int getWaveWarnRad() {
		return waveWarnRad;
	}

	/**
	 * @param waveWarnRad the waveWarnRad to set
	 */
	public void setWaveWarnRad(String waveWarnRad) {
		this.waveWarnRad = FiledDataFormatUtil.kilometerFormat(waveWarnRad);
	}

	/**
	 * @return the waveWarnHs
	 */
	public int getWaveWarnHs() {
		return waveWarnHs;
	}

	/**
	 * @param waveWarnHs the waveWarnHs to set
	 */
	public void setWaveWarnHs(String waveWarnHs) {
		this.waveWarnHs = FiledDataFormatUtil.meterFormat(waveWarnHs);
	}

	/**
	 * @return the waveWarnPeriod
	 */
	public int getWaveWarnPeriod() {
		return waveWarnPeriod;
	}

	/**
	 * @param waveWarnPeriod the waveWarnPeriod to set
	 */
	public void setWaveWarnPeriod(String waveWarnPeriod) {
		this.waveWarnPeriod = FiledDataFormatUtil.secondsFormat(waveWarnPeriod);
	}

	/**
	 * @return the fogWarnLond
	 */
	public Integer getFogWarnLond() {
		return fogWarnLond;
	}

	/**
	 * @param fogWarnLond the fogWarnLond to set
	 */
	public void setFogWarnLond(Integer fogWarnLond) {
		this.fogWarnLond = fogWarnLond;
	}

	/**
	 * @return the fogWarnLonm
	 */
	public Integer getFogWarnLonm() {
		return fogWarnLonm;
	}

	/**
	 * @param fogWarnLonm the fogWarnLonm to set
	 */
	public void setFogWarnLonm(Integer fogWarnLonm) {
		this.fogWarnLonm = fogWarnLonm;
	}

	/**
	 * @return the fogWarnLons
	 */
	public Double getFogWarnLons() {
		return fogWarnLons;
	}

	/**
	 * @param fogWarnLons the fogWarnLons to set
	 */
	public void setFogWarnLons(Double fogWarnLons) {
		this.fogWarnLons = fogWarnLons;
	}

	/**
	 * @return the fogWarnLatd
	 */
	public Integer getFogWarnLatd() {
		return fogWarnLatd;
	}

	/**
	 * @param fogWarnLatd the fogWarnLatd to set
	 */
	public void setFogWarnLatd(Integer fogWarnLatd) {
		this.fogWarnLatd = fogWarnLatd;
	}

	/**
	 * @return the fogWarnLatm
	 */
	public Integer getFogWarnLatm() {
		return fogWarnLatm;
	}

	/**
	 * @param fogWarnLatm the fogWarnLatm to set
	 */
	public void setFogWarnLatm(Integer fogWarnLatm) {
		this.fogWarnLatm = fogWarnLatm;
	}

	/**
	 * @return the fogWarnLats
	 */
	public Double getFogWarnLats() {
		return fogWarnLats;
	}

	/**
	 * @param fogWarnLats the fogWarnLats to set
	 */
	public void setFogWarnLats(Double fogWarnLats) {
		this.fogWarnLats = fogWarnLats;
	}

	/**
	 * @return the fogWarnRad
	 */
	public int getFogWarnRad() {
		return fogWarnRad;
	}

	/**
	 * @param fogWarnRad the fogWarnRad to set
	 */
	public void setFogWarnRad(String fogWarnRad) {
		this.fogWarnRad = FiledDataFormatUtil.kilometerFormat(fogWarnRad);
	}

	/**
	 * @return the fogWarnVisibility
	 */
	public int getFogWarnVisibility() {
		return fogWarnVisibility;
	}

	/**
	 * @param fogWarnVisibility the fogWarnVisibility to set
	 */
	public void setFogWarnVisibility(String fogWarnVisibility) {
		this.fogWarnVisibility = FiledDataFormatUtil.nauticalMileFormat(fogWarnVisibility);
	}

	/**
	 * @return the stormSurgeWarnLond
	 */
	public Integer getStormSurgeWarnLond() {
		return stormSurgeWarnLond;
	}

	/**
	 * @param stormSurgeWarnLond the stormSurgeWarnLond to set
	 */
	public void setStormSurgeWarnLond(Integer stormSurgeWarnLond) {
		this.stormSurgeWarnLond = stormSurgeWarnLond;
	}

	/**
	 * @return the stormSurgeWarnLonm
	 */
	public Integer getStormSurgeWarnLonm() {
		return stormSurgeWarnLonm;
	}

	/**
	 * @param stormSurgeWarnLonm the stormSurgeWarnLonm to set
	 */
	public void setStormSurgeWarnLonm(Integer stormSurgeWarnLonm) {
		this.stormSurgeWarnLonm = stormSurgeWarnLonm;
	}

	/**
	 * @return the stormSurgeWarnLons
	 */
	public Double getStormSurgeWarnLons() {
		return stormSurgeWarnLons;
	}

	/**
	 * @param stormSurgeWarnLons the stormSurgeWarnLons to set
	 */
	public void setStormSurgeWarnLons(Double stormSurgeWarnLons) {
		this.stormSurgeWarnLons = stormSurgeWarnLons;
	}

	/**
	 * @return the stormSurgeWarnLatd
	 */
	public Integer getStormSurgeWarnLatd() {
		return stormSurgeWarnLatd;
	}

	/**
	 * @param stormSurgeWarnLatd the stormSurgeWarnLatd to set
	 */
	public void setStormSurgeWarnLatd(Integer stormSurgeWarnLatd) {
		this.stormSurgeWarnLatd = stormSurgeWarnLatd;
	}

	/**
	 * @return the stormSurgeWarnLatm
	 */
	public Integer getStormSurgeWarnLatm() {
		return stormSurgeWarnLatm;
	}

	/**
	 * @param stormSurgeWarnLatm the stormSurgeWarnLatm to set
	 */
	public void setStormSurgeWarnLatm(Integer stormSurgeWarnLatm) {
		this.stormSurgeWarnLatm = stormSurgeWarnLatm;
	}

	/**
	 * @return the stormSurgeWarnLats
	 */
	public Double getStormSurgeWarnLats() {
		return stormSurgeWarnLats;
	}

	/**
	 * @param stormSurgeWarnLats the stormSurgeWarnLats to set
	 */
	public void setStormSurgeWarnLats(Double stormSurgeWarnLats) {
		this.stormSurgeWarnLats = stormSurgeWarnLats;
	}

	/**
	 * @return the stormSurgeWarnRad
	 */
	public int getStormSurgeWarnRad() {
		return stormSurgeWarnRad;
	}

	/**
	 * @param stormSurgeWarnRad the stormSurgeWarnRad to set
	 */
	public void setStormSurgeWarnRad(String stormSurgeWarnRad) {
		this.stormSurgeWarnRad = FiledDataFormatUtil.nauticalMileFormat(stormSurgeWarnRad);
	}

	/**
	 * @return the stormSurgeWarnIncreasWater
	 */
	public int getStormSurgeWarnIncreasWater() {
		return stormSurgeWarnIncreasWater;
	}

	/**
	 * @param stormSurgeWarnIncreasWater the stormSurgeWarnIncreasWater to set
	 */
	public void setStormSurgeWarnIncreasWater(String stormSurgeWarnIncreasWater) {
		this.stormSurgeWarnIncreasWater = FiledDataFormatUtil.centimeterFormat(stormSurgeWarnIncreasWater);
	}

	/**
	 * @return the stormSurgeWarnTide
	 */
	public int getStormSurgeWarnTide() {
		return stormSurgeWarnTide;
	}

	/**
	 * @param stormSurgeWarnTide the stormSurgeWarnTide to set
	 */
	public void setStormSurgeWarnTide(String stormSurgeWarnTide) {
		this.stormSurgeWarnTide = FiledDataFormatUtil.centimeterFormat(stormSurgeWarnTide);
	}

	/**
	 * @return the stormSurgeWarnWavePeriod
	 */
	public int getStormSurgeWarnWavePeriod() {
		return stormSurgeWarnWavePeriod;
	}

	/**
	 * @param stormSurgeWarnWavePeriod the stormSurgeWarnWavePeriod to set
	 */
	public void setStormSurgeWarnWavePeriod(String stormSurgeWarnWavePeriod) {
		this.stormSurgeWarnWavePeriod = FiledDataFormatUtil.secondsFormat(stormSurgeWarnWavePeriod);
	}

	/**
	 * @return the seaIceWarnLond
	 */
	public Integer getSeaIceWarnLond() {
		return seaIceWarnLond;
	}

	/**
	 * @param seaIceWarnLond the seaIceWarnLond to set
	 */
	public void setSeaIceWarnLond(Integer seaIceWarnLond) {
		this.seaIceWarnLond = seaIceWarnLond;
	}

	/**
	 * @return the seaIceWarnLonm
	 */
	public Integer getSeaIceWarnLonm() {
		return seaIceWarnLonm;
	}

	/**
	 * @param seaIceWarnLonm the seaIceWarnLonm to set
	 */
	public void setSeaIceWarnLonm(Integer seaIceWarnLonm) {
		this.seaIceWarnLonm = seaIceWarnLonm;
	}

	/**
	 * @return the seaIceWarnLons
	 */
	public Double getSeaIceWarnLons() {
		return seaIceWarnLons;
	}

	/**
	 * @param seaIceWarnLons the seaIceWarnLons to set
	 */
	public void setSeaIceWarnLons(Double seaIceWarnLons) {
		this.seaIceWarnLons = seaIceWarnLons;
	}

	/**
	 * @return the seaIceWarnLatd
	 */
	public Integer getSeaIceWarnLatd() {
		return seaIceWarnLatd;
	}

	/**
	 * @param seaIceWarnLatd the seaIceWarnLatd to set
	 */
	public void setSeaIceWarnLatd(Integer seaIceWarnLatd) {
		this.seaIceWarnLatd = seaIceWarnLatd;
	}

	/**
	 * @return the seaIceWarnLatm
	 */
	public Integer getSeaIceWarnLatm() {
		return seaIceWarnLatm;
	}

	/**
	 * @param seaIceWarnLatm the seaIceWarnLatm to set
	 */
	public void setSeaIceWarnLatm(Integer seaIceWarnLatm) {
		this.seaIceWarnLatm = seaIceWarnLatm;
	}

	/**
	 * @return the seaIceWarnLats
	 */
	public Double getSeaIceWarnLats() {
		return seaIceWarnLats;
	}

	/**
	 * @param seaIceWarnLats the seaIceWarnLats to set
	 */
	public void setSeaIceWarnLats(Double seaIceWarnLats) {
		this.seaIceWarnLats = seaIceWarnLats;
	}

	/**
	 * @return the seaIceWarnRad
	 */
	public int getSeaIceWarnRad() {
		return seaIceWarnRad;
	}

	/**
	 * @param seaIceWarnRad the seaIceWarnRad to set
	 */
	public void setSeaIceWarnRad(String seaIceWarnRad) {
		this.seaIceWarnRad = FiledDataFormatUtil.kilometerFormat(seaIceWarnRad);
	}

	/**
	 * @return the seaIceWarnThickness
	 */
	public int getSeaIceWarnThickness() {
		return seaIceWarnThickness;
	}

	/**
	 * @param seaIceWarnThickness the seaIceWarnThickness to set
	 */
	public void setSeaIceWarnThickness(String seaIceWarnThickness) {
		this.seaIceWarnThickness = FiledDataFormatUtil.centimeterFormat(seaIceWarnThickness);
	}

	/**
	 * @return the coldWarnLond
	 */
	public Integer getColdWarnLond() {
		return coldWarnLond;
	}

	/**
	 * @param coldWarnLond the coldWarnLond to set
	 */
	public void setColdWarnLond(Integer coldWarnLond) {
		this.coldWarnLond = coldWarnLond;
	}

	/**
	 * @return the coldWarnLonm
	 */
	public Integer getColdWarnLonm() {
		return coldWarnLonm;
	}

	/**
	 * @param coldWarnLonm the coldWarnLonm to set
	 */
	public void setColdWarnLonm(Integer coldWarnLonm) {
		this.coldWarnLonm = coldWarnLonm;
	}

	/**
	 * @return the coldWarnLons
	 */
	public Double getColdWarnLons() {
		return coldWarnLons;
	}

	/**
	 * @param coldWarnLons the coldWarnLons to set
	 */
	public void setColdWarnLons(Double coldWarnLons) {
		this.coldWarnLons = coldWarnLons;
	}

	/**
	 * @return the coldWarnLatd
	 */
	public Integer getColdWarnLatd() {
		return coldWarnLatd;
	}

	/**
	 * @param coldWarnLatd the coldWarnLatd to set
	 */
	public void setColdWarnLatd(Integer coldWarnLatd) {
		this.coldWarnLatd = coldWarnLatd;
	}

	/**
	 * @return the coldWarnLatm
	 */
	public Integer getColdWarnLatm() {
		return coldWarnLatm;
	}

	/**
	 * @param coldWarnLatm the coldWarnLatm to set
	 */
	public void setColdWarnLatm(Integer coldWarnLatm) {
		this.coldWarnLatm = coldWarnLatm;
	}

	/**
	 * @return the coldWarnLats
	 */
	public Double getColdWarnLats() {
		return coldWarnLats;
	}

	/**
	 * @param coldWarnLats the coldWarnLats to set
	 */
	public void setColdWarnLats(Double coldWarnLats) {
		this.coldWarnLats = coldWarnLats;
	}

	/**
	 * @return the coldWarnRad
	 */
	public int getColdWarnRad() {
		return coldWarnRad;
	}

	/**
	 * @param coldWarnRad the coldWarnRad to set
	 */
	public void setColdWarnRad(String coldWarnRad) {
		this.coldWarnRad = FiledDataFormatUtil.kilometerFormat(coldWarnRad);
	}

	/**
	 * @return the coldWarnLevel
	 */
	public int getColdWarnLevel() {
		return coldWarnLevel;
	}

	/**
	 * @param coldWarnLevel the coldWarnLevel to set
	 */
	public void setColdWarnLevel(String coldWarnLevel) {
		this.coldWarnLevel = FiledDataFormatUtil.optionDefaultFormat(coldWarnLevel);
	}

	/** (非 Javadoc)   
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return   
	 * @see java.lang.Object#toString()   
	 */
	@Override
	public String toString() {
		return "MarineWeatherWarnVo [messageNo=" + messageNo + ", source_id=" + source_id + ", destination_id=" + destination_id + ", warnDateTime="
				+ warnDateTime + ", timeRange=" + timeRange + ", warnType=" + warnType + ", tropicalCycloneLond=" + tropicalCycloneLond
				+ ", tropicalCycloneLonm=" + tropicalCycloneLonm + ", tropicalCycloneLons=" + tropicalCycloneLons + ", tropicalCycloneLatd="
				+ tropicalCycloneLatd + ", tropicalCycloneLatm=" + tropicalCycloneLatm + ", tropicalCycloneLats=" + tropicalCycloneLats
				+ ", tropicalCycloneType=" + tropicalCycloneType + ", tropicalCycloneRad=" + tropicalCycloneRad + ", tropicalCycloneSpeed="
				+ tropicalCycloneSpeed + ", tropicalCycloneDirection=" + tropicalCycloneDirection + ", tropicalCycloneWindPower=" + tropicalCycloneWindPower
				+ ", windWarnLond=" + windWarnLond + ", windWarnLonm=" + windWarnLonm + ", windWarnLons=" + windWarnLons + ", windWarnLatd=" + windWarnLatd
				+ ", windWarnLatm=" + windWarnLatm + ", windWarnLats=" + windWarnLats + ", windWarnRad=" + windWarnRad + ", windWarnMinWindPower="
				+ windWarnMinWindPower + ", windWarnMaxWindPower=" + windWarnMaxWindPower + ", windWarnDirection=" + windWarnDirection + ", waveWarnLond="
				+ waveWarnLond + ", waveWarnLonm=" + waveWarnLonm + ", waveWarnLons=" + waveWarnLons + ", waveWarnLatd=" + waveWarnLatd + ", waveWarnLatm="
				+ waveWarnLatm + ", waveWarnLats=" + waveWarnLats + ", waveWarnRad=" + waveWarnRad + ", waveWarnHs=" + waveWarnHs + ", waveWarnPeriod="
				+ waveWarnPeriod + ", fogWarnLond=" + fogWarnLond + ", fogWarnLonm=" + fogWarnLonm + ", fogWarnLons=" + fogWarnLons + ", fogWarnLatd="
				+ fogWarnLatd + ", fogWarnLatm=" + fogWarnLatm + ", fogWarnLats=" + fogWarnLats + ", fogWarnRad=" + fogWarnRad + ", fogWarnVisibility="
				+ fogWarnVisibility + ", stormSurgeWarnLond=" + stormSurgeWarnLond + ", stormSurgeWarnLonm=" + stormSurgeWarnLonm + ", stormSurgeWarnLons="
				+ stormSurgeWarnLons + ", stormSurgeWarnLatd=" + stormSurgeWarnLatd + ", stormSurgeWarnLatm=" + stormSurgeWarnLatm + ", stormSurgeWarnLats="
				+ stormSurgeWarnLats + ", stormSurgeWarnRad=" + stormSurgeWarnRad + ", stormSurgeWarnIncreasWater=" + stormSurgeWarnIncreasWater
				+ ", stormSurgeWarnTide=" + stormSurgeWarnTide + ", stormSurgeWarnWavePeriod=" + stormSurgeWarnWavePeriod + ", seaIceWarnLond="
				+ seaIceWarnLond + ", seaIceWarnLonm=" + seaIceWarnLonm + ", seaIceWarnLons=" + seaIceWarnLons + ", seaIceWarnLatd=" + seaIceWarnLatd
				+ ", seaIceWarnLatm=" + seaIceWarnLatm + ", seaIceWarnLats=" + seaIceWarnLats + ", seaIceWarnRad=" + seaIceWarnRad + ", seaIceWarnThickness="
				+ seaIceWarnThickness + ", coldWarnLond=" + coldWarnLond + ", coldWarnLonm=" + coldWarnLonm + ", coldWarnLons=" + coldWarnLons
				+ ", coldWarnLatd=" + coldWarnLatd + ", coldWarnLatm=" + coldWarnLatm + ", coldWarnLats=" + coldWarnLats + ", coldWarnRad=" + coldWarnRad
				+ ", coldWarnLevel=" + coldWarnLevel + "]";
	}

}
