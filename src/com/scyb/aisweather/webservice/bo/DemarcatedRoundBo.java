/**     
 * @Title: DemarcatedRoundBo.java    
 * @Package com.scyb.aisweather.webservice.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月15日 下午3:32:25    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.bo;

/**
 *      @ClassName: DemarcatedRoundBo     @Description: TODO(这里用一句话描述这个类的作用)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年12月15日 下午3:32:25      
 *     
 */
public class DemarcatedRoundBo extends DemarcatedAreaBo{

	/**
	 *      @Fields longitude : TODO(经度)   
	 */
	private int longitude;

	/**
	 *      @Fields latitude : TODO(纬度)   
	 */
	private int latitude;

	/**
	 *      @Fields radius : TODO(半径)   
	 */
	private Double radius;

	/**
	 * @return the longitude
	 */
	public int getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude
	 *            the longitude to set
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
	 * @param latitude
	 *            the latitude to set
	 */
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the radius
	 */
	public Double getRadius() {
		return radius;
	}

	/**
	 * @param radius
	 *            the radius to set
	 */
	public void setRadius(Double radius) {
		this.radius = radius;
	}

	/**
	 * <p>
	 * Title:
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param longitude
	 * @param latitude
	 * @param radius
	 */
	public DemarcatedRoundBo(int longitude, int latitude, Double radius) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
		this.radius = radius;
	}

	/**
	 * <p>
	 * Title:
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 */
	public DemarcatedRoundBo() {
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
		return "DemarcatedRoundBo [longitude=" + longitude + ", latitude=" + latitude + ", radius=" + radius + "]";
	}

}
