/**     
 * @Title: SeaIceWarnBo.java    
 * @Package com.scyb.aisweather.webservice.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月15日 上午10:59:16    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.bo;

/**
 *      @ClassName: SeaIceWarnBo     @Description: TODO(海洋气象海冰预警Bean)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年12月15日 上午10:59:16      
 *     
 */
public class SeaIceWarnBo extends MarineWeatherWarnBo{

	/**
	 *      @Fields thickness : TODO(海冰预警厚度)   
	 */
	private int thickness;

	/**
	 * @return the thickness
	 */
	public int getThickness() {
		return thickness;
	}

	/**
	 * @param thickness
	 *            the thickness to set
	 */
	public void setThickness(int thickness) {
		this.thickness = thickness;
	}

	/**
	 * <p>
	 * Title:
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 */
	public SeaIceWarnBo() {
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
	 * @param thickness
	 */
	public SeaIceWarnBo(int thickness) {
		super();
		this.thickness = thickness;
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
		return "SeaIceWarnBo [thickness=" + thickness + "]";
	}

}
