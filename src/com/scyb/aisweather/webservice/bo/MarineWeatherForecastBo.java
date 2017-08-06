/**     
 * @Title: MarineWeatherForecastBo.java    
 * @Package com.scyb.aisweather.webservice.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月15日 下午12:36:33    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.bo;

import java.util.List;

/**
 *      @ClassName: MarineWeatherForecastBo     @Description: TODO(海洋气象预报Bean)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年12月15日 下午12:36:33      
 *     
 */
public class MarineWeatherForecastBo extends BroadcastMMSIBo{

	/**
	 *      @Fields DAC : TODO(区域码)   
	 */
	private final int DAC = 412;

	/**
	 *      @Fields FI : TODO(功能码)   
	 */
	private final int FI = 01;

	private int time;

    /**
     *      @Fields FI : TODO(天气现象)   
     */
    private List<Integer> weatherPhenomena;

	/**
	 *      @Fields longitude : TODO(中心位置经度)   
	 */
	private List<Integer> longitudeList;

	/**
	 *      @Fields latitude : TODO(中心位置维度)   
	 */
	private List<Integer> latitudeList;

    /**
     *      @Fields latitude : TODO(风速)   
     */
    private List<Integer> windSpeedList;

    /**
     *      @Fields latitude : TODO(风向)   
     */
    private List<Integer> windDirectionList;

    /**
     *      @Fields latitude : TODO(气温)   
     */
    private List<Double> temperatureList;

    /**
     *      @Fields latitude : TODO(气压)   
     */
    private List<Integer> pressureList;

    private List<Double> visibilityList;

    public List<Double> getVisibilityList() {
        return visibilityList;
    }

    public void setVisibilityList(List<Double> visibilityList) {
        this.visibilityList = visibilityList;
    }

    public List<Integer> getWeatherPhenomena() {
        return weatherPhenomena;
    }

    public void setWeatherPhenomena(List<Integer> weatherPhenomena) {
        this.weatherPhenomena = weatherPhenomena;
    }

    public List<Integer> getWindSpeedList() {
        return windSpeedList;
    }

    public void setWindSpeedList(List<Integer> windSpeedList) {
        this.windSpeedList = windSpeedList;
    }

    public List<Integer> getWindDirectionList() {
        return windDirectionList;
    }

    public void setWindDirectionList(List<Integer> windDirectionList) {
        this.windDirectionList = windDirectionList;
    }

    public List<Double> getTemperatureList() {
        return temperatureList;
    }

    public void setTemperatureList(List<Double> temperatureList) {
        this.temperatureList = temperatureList;
    }

    public List<Integer> getPressureList() {
        return pressureList;
    }

    public void setPressureList(List<Integer> pressureList) {
        this.pressureList = pressureList;
    }

    /**
	 * @return the time
	 */
	public int getTime() {
		return time;
	}

	/**
	 * @param time
	 *            the time to set
	 */
	public void setTime(int time) {
		this.time = time;
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

    public MarineWeatherForecastBo() {
        super();
    }

    public MarineWeatherForecastBo(int source_id, int destination_id, int time, List<Integer> weatherPhenomena, List<Integer> longitudeList, List<Integer> latitudeList, List<Integer> windSpeedList, List<Integer> windDirectionList, List<Double> temperatureList, List<Integer> pressureList, List<Double> visibilityList) {
        super(source_id, destination_id);
        this.time = time;
        this.weatherPhenomena = weatherPhenomena;
        this.longitudeList = longitudeList;
        this.latitudeList = latitudeList;
        this.windSpeedList = windSpeedList;
        this.windDirectionList = windDirectionList;
        this.temperatureList = temperatureList;
        this.pressureList = pressureList;
        this.visibilityList = visibilityList;
    }

    public MarineWeatherForecastBo(int time, List<Integer> weatherPhenomena, List<Integer> longitudeList, List<Integer> latitudeList, List<Integer> windSpeedList, List<Integer> windDirectionList, List<Double> temperatureList, List<Integer> pressureList, List<Double> visibilityList) {
        this.time = time;
        this.weatherPhenomena = weatherPhenomena;
        this.longitudeList = longitudeList;
        this.latitudeList = latitudeList;
        this.windSpeedList = windSpeedList;
        this.windDirectionList = windDirectionList;
        this.temperatureList = temperatureList;
        this.pressureList = pressureList;
        this.visibilityList = visibilityList;
    }

    /**
     *  (非 Javadoc)     
     * <p>
     * Title: toString
     * </p>
     *     
     * <p>
     * Description: 
     * </p>
     *     @return     @see java.lang.Object#toString()   
     */
    @Override
    public String toString() {
        return "MarineWeatherForecastBo{" +
                "DAC=" + DAC +
                ", FI=" + FI +
                ", time=" + time +
                ", weatherPhenomena=" + weatherPhenomena +
                ", longitudeList=" + longitudeList +
                ", latitudeList=" + latitudeList +
                ", windSpeedList=" + windSpeedList +
                ", windDirectionList=" + windDirectionList +
                ", temperatureList=" + temperatureList +
                ", pressureList=" + pressureList +
                '}';
    }

}
