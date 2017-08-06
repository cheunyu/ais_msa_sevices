/**     
 * @Title: RecommendeRouteReqBo.java    
 * @Package com.scyb.aisweather.vdl.request.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2015年1月12日 上午11:47:13    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.request.bo;

/**
 *      @ClassName: RecommendeRouteReqBo   
 *  @Description: TODO(这里用一句话描述这个类的作用)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2015年1月12日 上午11:47:13           
 */
public class RecommendeRouteReqBo {

	/**
	 *      @Fields DAC : TODO(DAC码)   
	 */
	private final static int DAC = 412;

	/**
	 *      @Fields FI : TODO(FI功能码)   
	 */
	private final static int FI = 14;

	/**
	 *      @Fields tonnage : TODO(吨位)   
	 */
	private int tonnage;

	/**
	 *      @Fields cargoType : TODO(货物类型)   
	 */
	private int cargoType;

	/**
	 *      @Fields latitude1 : TODO(起始纬度)   
	 */
	private int latitude1;

	/**
	 *      @Fields longitude1 : TODO(起始经度)   
	 */
	private int longitude1;

	/**
	 *      @Fields latitude2 : TODO(目的纬度)   
	 */
	private int latitude2;

	/**
	 *      @Fields longitude2 : TODO(目的经度)   
	 */
	private int longitude2;

	/**
	 * <p>
	 * Title:
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param tonnage
	 * @param cargoType
	 * @param latitude1
	 * @param longitude1
	 * @param latitude2
	 * @param longitude2
	 */
	public RecommendeRouteReqBo(int tonnage, int cargoType, int latitude1, int longitude1, int latitude2, int longitude2) {
		super();
		this.tonnage = tonnage;
		this.cargoType = cargoType;
		this.latitude1 = latitude1;
		this.longitude1 = longitude1;
		this.latitude2 = latitude2;
		this.longitude2 = longitude2;
	}

	/**
	 * <p>
	 * Title:
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 */
	public RecommendeRouteReqBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the tonnage
	 */
	public int getTonnage() {
		return tonnage;
	}

	/**
	 * @param tonnage
	 *            the tonnage to set
	 */
	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}

	/**
	 * @return the cargoType
	 */
	public int getCargoType() {
		return cargoType;
	}

	/**
	 * @param cargoType
	 *            the cargoType to set
	 */
	public void setCargoType(int cargoType) {
		this.cargoType = cargoType;
	}

	/**
	 * @return the latitude1
	 */
	public int getLatitude1() {
		return latitude1;
	}

	/**
	 * @param latitude1
	 *            the latitude1 to set
	 */
	public void setLatitude1(int latitude1) {
		this.latitude1 = latitude1;
	}

	/**
	 * @return the longitude1
	 */
	public int getLongitude1() {
		return longitude1;
	}

	/**
	 * @param longitude1
	 *            the longitude1 to set
	 */
	public void setLongitude1(int longitude1) {
		this.longitude1 = longitude1;
	}

	/**
	 * @return the latitude2
	 */
	public int getLatitude2() {
		return latitude2;
	}

	/**
	 * @param latitude2
	 *            the latitude2 to set
	 */
	public void setLatitude2(int latitude2) {
		this.latitude2 = latitude2;
	}

	/**
	 * @return the longitude2
	 */
	public int getLongitude2() {
		return longitude2;
	}

	/**
	 * @param longitude2
	 *            the longitude2 to set
	 */
	public void setLongitude2(int longitude2) {
		this.longitude2 = longitude2;
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
		return "RecommendeRouteReqBo [tonnage=" + tonnage + ", cargoType=" + cargoType + ", latitude1=" + latitude1 + ", longitude1=" + longitude1
				+ ", latitude2=" + latitude2 + ", longitude2=" + longitude2 + "]";
	}

}
