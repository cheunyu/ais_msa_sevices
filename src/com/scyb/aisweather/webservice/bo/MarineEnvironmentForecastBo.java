/**     
 * @Title: MarineEnvironmentForecastBo.java    
 * @Package com.scyb.aisweather.webservice.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月15日 下午12:40:14    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.bo;

import java.util.List;

/**
 *      @ClassName: MarineEnvironmentForecastBo   
 *  @Description: TODO(海洋环境预报Bean)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年12月15日 下午12:40:14           
 */
public class MarineEnvironmentForecastBo extends BroadcastMMSIBo{

	/**
	 *      @Fields DAC : TODO(区域码)   
	 */
	private final int DAC = 412;

	/**
	 *      @Fields FI : TODO(功能码)   
	 */
	private final int FI = 02;

	/**   
	 * @Fields forecastDateTime : TODO(预报时间)   
	 */
	private String forecastDateTime;

	/**
	 *      @Fields longitude : TODO(经度)   
	 */
	private List<Integer> longitudeList;

	/**
	 *      @Fields latitude : TODO(纬度)   
	 */
	private List<Integer> latitudeList;

    /**
     *      @Fields speedList : TODO(流速)   
     */
    private List<Double> waterSpeedList;

    /**
     *      @Fields waterDirectionList : TODO(流向)   
     */
    private List<Integer> waterDirectionList;

    /**
     *      @Fields hsList : TODO(浪高)   
     */
    private List<Double> waveHsList;

    /**
     *      @Fields waveDirectionList : TODO(浪向)   
     */
    private List<Integer> waveDirectionList;

    /**
     *      @Fields waterTemperatureList : TODO(海温)   
     */
    private List<Double> waterTemperatureList;

    public String getForecastDateTime() {
        return forecastDateTime;
    }

    public void setForecastDateTime(String forecastDateTime) {
        this.forecastDateTime = forecastDateTime;
    }

    /**
	 * @return the longitudeList
	 */
	public List<Integer> getLongitudeList() {
		return longitudeList;
	}

	/**
	 * @param longitudeList
	 *            the longitudeList to set
	 */
	public void setLongitudeList(List<Integer> longitudeList) {
		this.longitudeList = longitudeList;
	}

	/**
	 * @return the latitudeList
	 */
	public List<Integer> getLatitudeList() {
		return latitudeList;
	}

	/**
	 * @param latitudeList
	 *            the latitudeList to set
	 */
	public void setLatitudeList(List<Integer> latitudeList) {
		this.latitudeList = latitudeList;
	}

	/**
	 * @return the dAC
	 */
	public int getDAC() {
		return DAC;
	}

	/**
	 * @return the fI
	 */
	public int getFI() {
		return FI;
	}


    public List<Integer> getWaterDirectionList() {
        return waterDirectionList;
    }

    public void setWaterDirectionList(List<Integer> waterDirectionList) {
        this.waterDirectionList = waterDirectionList;
    }

    public List<Double> getWaterSpeedList() {
        return waterSpeedList;
    }

    public void setWaterSpeedList(List<Double> waterSpeedList) {
        this.waterSpeedList = waterSpeedList;
    }

    public List<Double> getWaveHsList() {
        return waveHsList;
    }

    public void setWaveHsList(List<Double> waveHsList) {
        this.waveHsList = waveHsList;
    }

    public List<Integer> getWaveDirectionList() {
        return waveDirectionList;
    }

    public void setWaveDirectionList(List<Integer> waveDirectionList) {
        this.waveDirectionList = waveDirectionList;
    }

    public List<Double> getWaterTemperatureList() {
        return waterTemperatureList;
    }

    public void setWaterTemperatureList(List<Double> waterTemperatureList) {
        this.waterTemperatureList = waterTemperatureList;
    }

    /**
	 * <p>
	 * Title:
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 */
	public MarineEnvironmentForecastBo() {
		super();
		// TODO Auto-generated constructor stub
	}

    public MarineEnvironmentForecastBo(int source_id, int destination_id, String forecastDateTime, List<Integer> longitudeList, List<Integer> latitudeList, List<Double> waterSpeedList, List<Integer> waterDirectionList, List<Double> waveHsList, List<Integer> waveDirectionList, List<Double> waterTemperatureList) {
        super(source_id, destination_id);
        this.forecastDateTime = forecastDateTime;
        this.longitudeList = longitudeList;
        this.latitudeList = latitudeList;
        this.waterSpeedList = waterSpeedList;
        this.waterDirectionList = waterDirectionList;
        this.waveHsList = waveHsList;
        this.waveDirectionList = waveDirectionList;
        this.waterTemperatureList = waterTemperatureList;
    }

    public MarineEnvironmentForecastBo(String forecastDateTime, List<Integer> longitudeList, List<Integer> latitudeList, List<Double> waterSpeedList, List<Integer> waterDirectionList, List<Double> waveHsList, List<Integer> waveDirectionList, List<Double> waterTemperatureList) {
        this.forecastDateTime = forecastDateTime;
        this.longitudeList = longitudeList;
        this.latitudeList = latitudeList;
        this.waterSpeedList = waterSpeedList;
        this.waterDirectionList = waterDirectionList;
        this.waveHsList = waveHsList;
        this.waveDirectionList = waveDirectionList;
        this.waterTemperatureList = waterTemperatureList;
    }

    @Override
    public String toString() {
        return "MarineEnvironmentForecastBo{" +
                "DAC=" + DAC +
                ", FI=" + FI +
                ", forecastDateTime='" + forecastDateTime + '\'' +
                ", longitudeList=" + longitudeList +
                ", latitudeList=" + latitudeList +
                ", waterSpeedList=" + waterSpeedList +
                ", waterDirectionList=" + waterDirectionList +
                ", waveHsList=" + waveHsList +
                ", waveDirectionList=" + waveDirectionList +
                ", waterTemperatureList=" + waterTemperatureList +
                '}';
    }
}