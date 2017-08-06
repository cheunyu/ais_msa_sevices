/**     
 * @Title: ColdWarnBo.java    
 * @Package com.scyb.aisweather.webservice.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月15日 上午11:00:07    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.bo;

/**
 *      @ClassName: ColdWarnBo     @Description: TODO(海洋气象寒潮预警Bean)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年12月15日 上午11:00:07      
 *     
 */
public class ColdWarnBo extends MarineWeatherWarnBo{
	/**
	 *      @Fields level : TODO(寒潮预警级别)   
	 */
	private int level;

	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @param level
	 *            the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * <p>
	 * Title:
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 */
	public ColdWarnBo() {
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
	 * @param level
	 */
	public ColdWarnBo(int level) {
		super();
		this.level = level;
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
		return "ColdWarnBo [level=" + level + "]";
	}

}
