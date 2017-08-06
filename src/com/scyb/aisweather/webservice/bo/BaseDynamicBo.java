/**     
 * @Title: BaseDynamicBo.java    
 * @Package com.scyb.aisweather.webservice.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月15日 下午2:29:30    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.bo;

/**   
 * @ClassName: BaseDynamicBo   
 * @Description: TODO(助航标注动【新增，撤除，漂失，故障，恢复工作】Bean)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月15日 下午2:29:30      
 *    
 */
public class BaseDynamicBo extends AidsMarkedDynamicBo{
	
	/**
	 *      @Fields longitude : TODO(经度)   
	 */
	private int longitude;

	/**
	 *      @Fields latitude : TODO(纬度)   
	 */
	private int latitude;
	
	/**   
	 * @Fields type : TODO(航标类型)   
	 */
	private int type;

	/**
	 * @return the longitude
	 */
	public int getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the latitude
	 */
	public int getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(int latitude) {
		this.latitude = latitude;
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
	 * <p>Title: </p>   
	 * <p>Description: </p>      
	 */
	public BaseDynamicBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param longitude
	 * @param latitude
	 * @param type   
	 */
	public BaseDynamicBo(int longitude, int latitude, int type) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
		this.type = type;
	}

	/** (非 Javadoc)   
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return   
	 * @see java.lang.Object#toString()   
	 */
	@Override
	public String toString() {
		return "BaseDynamicBo [longitude=" + longitude + ", latitude=" + latitude + ", type=" + type + "]";
	}
	
	
}
