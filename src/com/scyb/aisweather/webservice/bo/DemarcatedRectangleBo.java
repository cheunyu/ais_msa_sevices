/**     
 * @Title: DemarcatedRectangleBo.java    
 * @Package com.scyb.aisweather.webservice.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月15日 下午3:37:18    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.bo;

/**
 *      @ClassName: DemarcatedRectangleBo   
 *  @Description: TODO(这里用一句话描述这个类的作用)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年12月15日 下午3:37:18           
 */
public class DemarcatedRectangleBo extends DemarcatedAreaBo{

	/**
	 *      @Fields longitude1 : TODO(经度1)   
	 */
	private int longitudeNw;

	/**
	 *      @Fields latitude1 : TODO(纬度1)   
	 */
	private int latitudeNw;

	/**
	 *      @Fields longitude2 : TODO(经度2)   
	 */
	private int longitudeSe;

	/**
	 *      @Fields latitude2 : TODO(纬度2)   
	 */
	private int latitudeSe;

	public int getLongitudeNw() {
		return longitudeNw;
	}

	public void setLongitudeNw(int longitudeNw) {
		this.longitudeNw = longitudeNw;
	}

	public int getLatitudeNw() {
		return latitudeNw;
	}

	public void setLatitudeNw(int latitudeNw) {
		this.latitudeNw = latitudeNw;
	}

	public int getLongitudeSe() {
		return longitudeSe;
	}

	public void setLongitudeSe(int longitudeSe) {
		this.longitudeSe = longitudeSe;
	}

	public int getLatitudeSe() {
		return latitudeSe;
	}

	public void setLatitudeSe(int latitudeSe) {
		this.latitudeSe = latitudeSe;
	}

	/**
	 * <p>
	 * Title:
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 */
	public DemarcatedRectangleBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * <p>
	 * Title:
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param longitudeNw
	 * @param latitudeNw
	 * @param longitudeSe
	 * @param latitudeSe
	 */
	public DemarcatedRectangleBo(int longitudeNw, int latitudeNw, int longitudeSe, int latitudeSe) {
		super();
		this.longitudeNw = longitudeNw;
		this.latitudeNw = latitudeNw;
		this.longitudeSe = longitudeSe;
		this.latitudeSe = latitudeSe;
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
		return "DemarcatedRectangleBo [longitudeNw=" + longitudeNw + ", latitudeNw=" + latitudeNw + ", longitudeSe=" + longitudeSe + ", latitudeSe=" + latitudeSe + "]";
	}

}
