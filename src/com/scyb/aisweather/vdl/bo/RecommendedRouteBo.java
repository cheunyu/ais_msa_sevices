/**     
 * @Title: RecommendedRouteBo.java    
 * @Package com.scyb.aisweather.vdl.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月7日 下午4:59:42    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.bo;

import java.util.List;

import com.scyb.aisweather.vdl.bo.head.MessageSix;

/**   
 * @ClassName: RecommendedRouteBo   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月7日 下午4:59:42      
 *    
 */
public class RecommendedRouteBo {

	/**
	 *      @Fields DAC : TODO(DAC码)   
	 */
	private final static int DAC = 412;

	/**
	 *      @Fields FI : TODO(FI功能码)   
	 */
	private final static int FI = 15;
	
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

	private MessageSix messageSix;

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>      
	 */
	public RecommendedRouteBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param longitudeDList
	 * @param longitudeMList
	 * @param longitudeSList
	 * @param latitudeDList
	 * @param latitudeMList
	 * @param latitudeSList
	 * @param messageSix   
	 */
	public RecommendedRouteBo(List<Integer> longitudeDList,
			List<Integer> longitudeMList, List<Double> longitudeSList,
			List<Integer> latitudeDList, List<Integer> latitudeMList,
			List<Double> latitudeSList, MessageSix messageSix) {
		super();
		this.longitudeDList = longitudeDList;
		this.longitudeMList = longitudeMList;
		this.longitudeSList = longitudeSList;
		this.latitudeDList = latitudeDList;
		this.latitudeMList = latitudeMList;
		this.latitudeSList = latitudeSList;
		this.messageSix = messageSix;
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
		return "RecommendedRouteBo [longitudeDList=" + longitudeDList
				+ ", longitudeMList=" + longitudeMList + ", longitudeSList="
				+ longitudeSList + ", latitudeDList=" + latitudeDList
				+ ", latitudeMList=" + latitudeMList + ", latitudeSList="
				+ latitudeSList + ", messageSix=" + messageSix + "]";
	}
	
}
