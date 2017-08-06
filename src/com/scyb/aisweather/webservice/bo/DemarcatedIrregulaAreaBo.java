/**     
 * @Title: DemarcatedIrregulaAreaBo.java    
 * @Package com.scyb.aisweather.webservice.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月15日 下午3:38:32    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.bo;

import java.util.Date;
import java.util.List;

/**
 *      @ClassName: DemarcatedIrregulaAreaBo   
 *  @Description: TODO(这里用一句话描述这个类的作用)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年12月15日 下午3:38:32           
 */
public class DemarcatedIrregulaAreaBo extends BroadcastMMSIBo{

	/**
	 *      @Fields DAC : TODO(区域码)   
	 */
	private final int DAC = 412;

	/**
	 *      @Fields FI : TODO(功能码)   
	 */
	private final int FI = 12;

	/**
	 *      @Fields type : TODO(区域类型)   
	 */
	private int type;

	/**
	 *      @Fields longitude : TODO(经度)   
	 */
	private List<Integer> longitudeList;

	/**
	 *      @Fields latitude : TODO(纬度)   
	 */
	private List<Integer> latitudeList;

	/**
	 *      @Fields dateTime1 : TODO(时间1)   
	 */
	private Long dateTime1;

	/**
	 *      @Fields dateTime2 : TODO(时间2)   
	 */
	private Long dateTime2;

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
	 * @return the longitudeList
	 */
	public List<Integer> getLongitudeList() {
		return longitudeList;
	}

	/**
	 * @param longitudeList the longitudeList to set
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
	 * @param latitudeList the latitudeList to set
	 */
	public void setLatitudeList(List<Integer> latitudeList) {
		this.latitudeList = latitudeList;
	}

	/**
	 * @return the dateTime1
	 */
	public Long getDateTime1() {
		return dateTime1;
	}

	/**
	 * @param dateTime1 the dateTime1 to set
	 */
	public void setDateTime1(Long dateTime1) {
		this.dateTime1 = dateTime1;
	}

	/**
	 * @return the dateTime2
	 */
	public Long getDateTime2() {
		return dateTime2;
	}

	/**
	 * @param dateTime2 the dateTime2 to set
	 */
	public void setDateTime2(Long dateTime2) {
		this.dateTime2 = dateTime2;
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

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>      
	 */
	public DemarcatedIrregulaAreaBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param type
	 * @param longitudeList
	 * @param latitudeList
	 * @param dateTime1
	 * @param dateTime2   
	 */
	public DemarcatedIrregulaAreaBo(int type, List<Integer> longitudeList, List<Integer> latitudeList, Long dateTime1, Long dateTime2) {
		super();
		this.type = type;
		this.longitudeList = longitudeList;
		this.latitudeList = latitudeList;
		this.dateTime1 = dateTime1;
		this.dateTime2 = dateTime2;
	}

	/** (非 Javadoc)   
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return   
	 * @see java.lang.Object#toString()   
	 */
	@Override
	public String toString() {
		return "DemarcatedIrregulaAreaBo [DAC=" + DAC + ", FI=" + FI + ", type=" + type + ", longitudeList=" + longitudeList + ", latitudeList=" + latitudeList
				+ ", dateTime1=" + dateTime1 + ", dateTime2=" + dateTime2 + "]";
	}

	
}
