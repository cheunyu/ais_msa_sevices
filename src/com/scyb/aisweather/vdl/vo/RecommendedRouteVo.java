/**     
 * @Title: RecommendedRouteVo.java    
 * @Package com.scyb.aisweather.vdl.vo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月7日 下午4:56:01    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.vo;

import java.util.List;

/**
 *      @ClassName: RecommendedRouteVo     @Description: TODO(这里用一句话描述这个类的作用)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年10月7日 下午4:56:01           
 */
public class RecommendedRouteVo {

	/**
	 *      @Fields source_id : TODO(起始站台MMSI)   
	 */
	private int source_id;

	/**
	 *      @Fields destination_id : TODO(目标站台MMSI)   
	 */
	private int destination_id;

	/**
	 *      @Fields longitudeList : TODO(经度,度)   
	 */
	private List<Integer> longitudeDList;

	/**
	 *      @Fields longitudeMList : TODO(经度，分)   
	 */
	private List<Integer> longitudeMList;

	/**
	 *      @Fields longitudeSList : TODO(经度，秒)   
	 */
	private List<Double> longitudeSList;

	/**
	 *      @Fields latitudeList : TODO(纬度，度)   
	 */
	private List<Integer> latitudeDList;

	/**
	 *      @Fields latitudeMList : TODO(纬度，分)   
	 */
	private List<Integer> latitudeMList;

	/**
	 *      @Fields latitudeSList : TODO(纬度，秒)   
	 */
	private List<Double> latitudeSList;

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>      
	 */
	public RecommendedRouteVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param source_id
	 * @param destination_id
	 * @param longitudeDList
	 * @param longitudeMList
	 * @param longitudeSList
	 * @param latitudeDList
	 * @param latitudeMList
	 * @param latitudeSList   
	 */
	public RecommendedRouteVo(int source_id, int destination_id,
			List<Integer> longitudeDList, List<Integer> longitudeMList,
			List<Double> longitudeSList, List<Integer> latitudeDList,
			List<Integer> latitudeMList, List<Double> latitudeSList) {
		super();
		this.source_id = source_id;
		this.destination_id = destination_id;
		this.longitudeDList = longitudeDList;
		this.longitudeMList = longitudeMList;
		this.longitudeSList = longitudeSList;
		this.latitudeDList = latitudeDList;
		this.latitudeMList = latitudeMList;
		this.latitudeSList = latitudeSList;
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
	 * @return the longitudeDList
	 */
	public List<Integer> getLongitudeDList() {
		return longitudeDList;
	}

	/**
	 * @param longitudeDList the longitudeDList to set
	 */
	public void setLongitudeDList(List<Integer> longitudeDList) {
		this.longitudeDList = longitudeDList;
	}

	/**
	 * @return the longitudeMList
	 */
	public List<Integer> getLongitudeMList() {
		return longitudeMList;
	}

	/**
	 * @param longitudeMList the longitudeMList to set
	 */
	public void setLongitudeMList(List<Integer> longitudeMList) {
		this.longitudeMList = longitudeMList;
	}

	/**
	 * @return the longitudeSList
	 */
	public List<Double> getLongitudeSList() {
		return longitudeSList;
	}

	/**
	 * @param longitudeSList the longitudeSList to set
	 */
	public void setLongitudeSList(List<Double> longitudeSList) {
		this.longitudeSList = longitudeSList;
	}

	/**
	 * @return the latitudeDList
	 */
	public List<Integer> getLatitudeDList() {
		return latitudeDList;
	}

	/**
	 * @param latitudeDList the latitudeDList to set
	 */
	public void setLatitudeDList(List<Integer> latitudeDList) {
		this.latitudeDList = latitudeDList;
	}

	/**
	 * @return the latitudeMList
	 */
	public List<Integer> getLatitudeMList() {
		return latitudeMList;
	}

	/**
	 * @param latitudeMList the latitudeMList to set
	 */
	public void setLatitudeMList(List<Integer> latitudeMList) {
		this.latitudeMList = latitudeMList;
	}

	/**
	 * @return the latitudeSList
	 */
	public List<Double> getLatitudeSList() {
		return latitudeSList;
	}

	/**
	 * @param latitudeSList the latitudeSList to set
	 */
	public void setLatitudeSList(List<Double> latitudeSList) {
		this.latitudeSList = latitudeSList;
	}

	/** (非 Javadoc)   
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return   
	 * @see java.lang.Object#toString()   
	 */
	@Override
	public String toString() {
		return "RecommendedRouteVo [source_id=" + source_id
				+ ", destination_id=" + destination_id + ", longitudeDList="
				+ longitudeDList + ", longitudeMList=" + longitudeMList
				+ ", longitudeSList=" + longitudeSList + ", latitudeDList="
				+ latitudeDList + ", latitudeMList=" + latitudeMList
				+ ", latitudeSList=" + latitudeSList + "]";
	}
}
