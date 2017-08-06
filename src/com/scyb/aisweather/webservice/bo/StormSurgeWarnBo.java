/**     
 * @Title: StormSurgeWarnBo.java    
 * @Package com.scyb.aisweather.webservice.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月15日 上午10:58:03    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.bo;

/**
 *      @ClassName: StormSurgeWarnBo     @Description: TODO(海洋气象风暴潮预警Bean)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年12月15日 上午10:58:03      
 *     
 */
public class StormSurgeWarnBo extends MarineWeatherWarnBo{
	/**
	 *      @Fields increasWater : TODO(风暴潮预警增水)   
	 */
	private int increasWater;

	/**
	 *      @Fields tide : TODO(风暴潮预警潮位)   
	 */
	private int tide;

	/**
	 *      @Fields period : TODO(风暴潮预警波周期)   
	 */
	private int period;

	/**
	 * @return the increasWater
	 */
	public int getIncreasWater() {
		return increasWater;
	}

	/**
	 * @param increasWater
	 *            the increasWater to set
	 */
	public void setIncreasWater(int increasWater) {
		this.increasWater = increasWater;
	}

	/**
	 * @return the tide
	 */
	public int getTide() {
		return tide;
	}

	/**
	 * @param tide
	 *            the tide to set
	 */
	public void setTide(int tide) {
		this.tide = tide;
	}


	/**
	 * @return the period
	 */
	public int getPeriod() {
		return period;
	}

	/**
	 * @param period the period to set
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
	public StormSurgeWarnBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param increasWater
	 * @param tide
	 * @param period   
	 */
	public StormSurgeWarnBo(int increasWater, int tide, int period) {
		super();
		this.increasWater = increasWater;
		this.tide = tide;
		this.period = period;
	}

	/** (非 Javadoc)   
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return   
	 * @see java.lang.Object#toString()   
	 */
	@Override
	public String toString() {
		return "StormSurgeWarnBo [increasWater=" + increasWater + ", tide=" + tide + ", period=" + period + "]";
	}


}
