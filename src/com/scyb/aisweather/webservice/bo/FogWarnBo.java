/**     
 * @Title: fogWarnBo.java    
 * @Package com.scyb.aisweather.webservice.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月15日 上午10:57:07    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.bo;

/**
 *      @ClassName: fogWarnBo     @Description: TODO(海洋气象大雾预警Bean)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年12月15日 上午10:57:07      
 *     
 */
public class FogWarnBo extends MarineWeatherWarnBo{
	/**
	 *      @Fields visibility : TODO(大雾预警能见度)   
	 */
	private int visibility;

	/**
	 * @return the visibility
	 */
	public int getVisibility() {
		return visibility;
	}

	/**
	 * @param visibility
	 *            the visibility to set
	 */
	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}

	/**
	 * <p>
	 * Title:
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 */
	public FogWarnBo() {
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
	 * @param visibility
	 */
	public FogWarnBo(int visibility) {
		super();
		this.visibility = visibility;
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
		return "fogWarnBo [visibility=" + visibility + "]";
	}

}
