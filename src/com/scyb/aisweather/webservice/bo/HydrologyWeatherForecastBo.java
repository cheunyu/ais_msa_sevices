/**     
 * @Title: HydrologyWeatherForecastBo.java    
 * @Package com.scyb.aisweather.webservice.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月15日 下午12:42:15    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.bo;

import java.util.List;

/**
 *      @ClassName: HydrologyWeatherForecastBo   
 *  @Description: TODO(水文气象预报Bean)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年12月15日 下午12:42:15           
 */
public class HydrologyWeatherForecastBo extends BroadcastMMSIBo{

	/**BroadcastMMSIBo
	 *      @Fields DAC : TODO(区域码)   
	 */
	private final int DAC = 412;

	/**
	 *      @Fields FI : TODO(功能码)   
	 */
	private final int FI = 04;

	/**
	 *      @Fields time : TODO(预报时间)
	 */
	private int time;

	/**
	 *      @Fields longitude : TODO(经度)   
	 */
	private List<Integer> longitudeList;

	/**
	 *      @Fields latitude : TODO(纬度)   
	 */
	private List<Integer> latitudeList;

	/**
	 *      @Fields hightTideTime : TODO(高潮时间)   
	 */
	private List<Long> highTideTime;

	/**
	 *      @Fields lowtTideTime : TODO(低潮时间)   
	 */
	private List<Long> lowTideTime;

	/**
	 *      @Fields tide : TODO(水位)   
	 */
	private List<Double> tide;

    public HydrologyWeatherForecastBo() {
        super();
    }

    public HydrologyWeatherForecastBo(int source_id, int destination_id, int time, List<Integer> longitudeList, List<Integer> latitudeList, List<Long> highTideTime, List<Long> lowTideTime, List<Double> tide) {
        super(source_id, destination_id);
        this.time = time;
        this.longitudeList = longitudeList;
        this.latitudeList = latitudeList;
        this.highTideTime = highTideTime;
        this.lowTideTime = lowTideTime;
        this.tide = tide;
    }

    public int getDAC() {
        return DAC;
    }

    public int getFI() {
        return FI;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public List<Integer> getLongitudeList() {
        return longitudeList;
    }

    public void setLongitudeList(List<Integer> longitudeList) {
        this.longitudeList = longitudeList;
    }

    public List<Integer> getLatitudeList() {
        return latitudeList;
    }

    public void setLatitudeList(List<Integer> latitudeList) {
        this.latitudeList = latitudeList;
    }

    public List<Long> getHighTideTime() {
        return highTideTime;
    }

    public void setHighTideTime(List<Long> highTideTime) {
        this.highTideTime = highTideTime;
    }

    public List<Long> getLowTideTime() {
        return lowTideTime;
    }

    public void setLowTideTime(List<Long> lowTideTime) {
        this.lowTideTime = lowTideTime;
    }

    public List<Double> getTide() {
        return tide;
    }

    public void setTide(List<Double> tide) {
        this.tide = tide;
    }

    @Override
    public String toString() {
        return "HydrologyWeatherForecastBo{" +
                "DAC=" + DAC +
                ", FI=" + FI +
                ", time=" + time +
                ", longitudeList=" + longitudeList +
                ", latitudeList=" + latitudeList +
                ", highTideTime=" + highTideTime +
                ", lowTideTime=" + lowTideTime +
                ", tide=" + tide +
                '}';
    }
}
