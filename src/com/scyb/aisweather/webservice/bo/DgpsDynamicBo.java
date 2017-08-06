/**     
 * @Title: DgpsDDynamicBo.java    
 * @Package com.scyb.aisweather.webservice.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月15日 下午2:32:49    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.bo;

/**   
 * @ClassName: DgpsDDynamicBo   
 * @Description: TODO(助航标注动态-DGPS台站停止发射Bean)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月15日 下午2:32:49      
 *    
 */
public class DgpsDynamicBo extends AidsMarkedDynamicBo{

	/**
	 *      @Fields longitude : TODO(经度)   
	 */
	private int longitude;

	/**
	 *      @Fields latitude : TODO(纬度)   
	 */
	private int latitude;
	
	/**   
	 * @Fields launch : TODO(发射频率)   
	 */
	private int launch;

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
	 * @return the launch
	 */
	public int getLaunch() {
		return launch;
	}

	/**
	 * @param launch the launch to set
	 */
	public void setLaunch(int launch) {
		this.launch = launch;
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>      
	 */
	public DgpsDynamicBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param longitude
	 * @param latitude
	 * @param launch   
	 */
	public DgpsDynamicBo(int longitude, int latitude, int launch) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
		this.launch = launch;
	}

	/** (非 Javadoc)   
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return   
	 * @see java.lang.Object#toString()   
	 */
	@Override
	public String toString() {
		return "DgpsDDynamicBo [longitude=" + longitude + ", latitude=" + latitude + ", launch=" + launch + "]";
	}
	
	
}
