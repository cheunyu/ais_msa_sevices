/**     
 * @Title: WaveWarnBo.java    
 * @Package com.scyb.aisweather.webservice.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月15日 上午10:55:36    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.bo;

/**
 *      @ClassName: WaveWarnBo     @Description: TODO(海洋气象大浪预警Bean)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年12月15日 上午10:55:36      
 *     
 */
public class WaveWarnBo extends MarineWeatherWarnBo{

	/**
	 *      @Fields hs : TODO(大浪预警波高)   
	 */
	private int hs;

	/**
	 *      @Fields period : TODO(大浪预警波周期)   
	 */
	private int period;

	/**
	 * @return the hs
	 */
	public int getHs() {
		return hs;
	}

	/**
	 * @param hs
	 *            the hs to set
	 */
	public void setHs(int hs) {
		this.hs = hs;
	}

	/**
	 * @return the period
	 */
	public int getPeriod() {
		return period;
	}

	/**
	 * @param period
	 *            the period to set
	 */
	public void setPeriod(int period) {
		this.period = period;
	}

	/**
	 * <p>
	 * Title:
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 */
	public WaveWarnBo() {
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
	 * @param hs
	 * @param period
	 */
	public WaveWarnBo(int hs, int period) {
		super();
		this.hs = hs;
		this.period = period;
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
		return "WaveWarnBo [hs=" + hs + ", period=" + period + "]";
	}

}
