/**     
 * @Title: RouteWeatherVo.java    
 * @Package com.scyb.aisweather.vdl.vo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月7日 下午6:57:24    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.request.bo;

import java.util.ArrayList;
import java.util.List;

/**
 *      @ClassName: RouteWeatherVo     @Description: TODO(这里用一句话描述这个类的作用)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年10月7日 下午6:57:24           
 */
public class RouteWeatherReqBo {

	/**
	 *      @Fields DAC : TODO(DAC码)   
	 */
	private final static int DAC = 412;

	/**
	 *      @Fields FI : TODO(FI功能码)   
	 */
	private final static int FI = 16;

	/**
	 *      @Fields longitudeList : TODO(经度)   
	 */
	private List<Integer> longitudeList;

	/**
	 *      @Fields latitudeList : TODO(纬度)   
	 */
	private List<Integer> latitudeList;

	/**
	 * @return the longitudeList
	 */
	public List<Integer> getLongitudeList() {
		if(longitudeList == null) {
			longitudeList = new ArrayList<Integer>();
		}
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
		if(latitudeList == null) {
			latitudeList = new ArrayList<Integer>();
		}
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

	/**
	 * <p>
	 * Title:
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param longitudeList
	 * @param latitudeList
	 */
	public RouteWeatherReqBo(List<Integer> longitudeList, List<Integer> latitudeList) {
		super();
		this.longitudeList = longitudeList;
		this.latitudeList = latitudeList;
	}

	/**
	 * <p>
	 * Title:
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 */
	public RouteWeatherReqBo() {
		super();
		// TODO Auto-generated constructor stub
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
		return "RouteWeatherReqBo [longitudeList=" + longitudeList + ", latitudeList=" + latitudeList + "]";
	}

}
