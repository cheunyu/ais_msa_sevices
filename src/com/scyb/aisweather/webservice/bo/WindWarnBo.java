/**     
 * @Title: WindWarn.java    
 * @Package com.scyb.aisweather.webservice.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月15日 上午10:48:02    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.bo;

/**
 *      @ClassName: WindWarn     @Description: TODO(海洋气象大风预警Bean)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年12月15日 上午10:48:02      
 *     
 */
public class WindWarnBo extends MarineWeatherWarnBo {

	/**
	 *      @Fields minPower : TODO(大风预警最低风力)   
	 */
	private int minPower;

	/**
	 *      @Fields maxPower : TODO(大风预警最高风力)   
	 */
	private int maxPower;

	/**
	 *      @Fields direction : TODO(大风预警风向)   
	 */
	private int direction;

	/**
	 * @return the minPower
	 */
	public int getMinPower() {
		return minPower;
	}

	/**
	 * @param minPower
	 *            the minPower to set
	 */
	public void setMinPower(int minPower) {
		this.minPower = minPower;
	}

	/**
	 * @return the maxPower
	 */
	public int getMaxPower() {
		return maxPower;
	}

	/**
	 * @param maxPower
	 *            the maxPower to set
	 */
	public void setMaxPower(int maxPower) {
		this.maxPower = maxPower;
	}

	/**
	 * @return the direction
	 */
	public int getDirection() {
		return direction;
	}

	/**
	 * @param direction
	 *            the direction to set
	 */
	public void setDirection(int direction) {
		this.direction = direction;
	}

	/**
	 * <p>
	 * Title:
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 */
	public WindWarnBo() {
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
	 * @param minPower
	 * @param maxPower
	 * @param direction
	 */
	public WindWarnBo(int minPower, int maxPower, int direction) {
		super();
		this.minPower = minPower;
		this.maxPower = maxPower;
		this.direction = direction;
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
		return "WindWarn [minPower=" + minPower + ", maxPower=" + maxPower + ", direction=" + direction + "]";
	}

}
