/**     
 * @Title: DemarcatedAreaBo.java    
 * @Package com.scyb.aisweather.webservice.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月15日 下午3:27:25    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.bo;

import java.util.Date;

/**
 *      @ClassName: DemarcatedAreaBo     @Description: TODO(这里用一句话描述这个类的作用)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年12月15日 下午3:27:25      
 *     
 */
public class DemarcatedAreaBo extends BroadcastMMSIBo{

	/**
	 *      @Fields DAC : TODO(区域码)   
	 */
	private final int DAC = 412;

	/**
	 *      @Fields FI : TODO(功能码)   
	 */
	private final int FI = 11;

	/**
	 *      @Fields type : TODO(区域类型)   
	 */
	private int type;

	/**
	 *      @Fields feature : TODO(区域特性)   
	 */
	private int feature;

	/**
	 *      @Fields dateTime1 : TODO(时间1)   
	 */
	private Long dateTime1;

	/**
	 *      @Fields dateTime2 : TODO(时间2)   
	 */
	private Long dateTime2;

	/**
	 *      @Fields farther : TODO(补充)   
	 */
	private int farther;

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return the feature
	 */
	public int getFeature() {
		return feature;
	}

	/**
	 * @param feature
	 *            the feature to set
	 */
	public void setFeature(int feature) {
		this.feature = feature;
	}

	/**
	 * @return the dateTime1
	 */
	public Long getDateTime1() {
		return dateTime1;
	}

	/**
	 * @param dateTime1
	 *            the dateTime1 to set
	 */
	public void setDateTime1(Long dateTime1) {
		this.dateTime1 = dateTime1;
	}

	/**
	 * @return the dateTime2
	 */
	public Long getDateTime2() {
		return dateTime2;
	}

	/**
	 * @param dateTime2
	 *            the dateTime2 to set
	 */
	public void setDateTime2(Long dateTime2) {
		this.dateTime2 = dateTime2;
	}

	/**
	 * @return the farther
	 */
	public int getFarther() {
		return farther;
	}

	/**
	 * @param farther
	 *            the farther to set
	 */
	public void setFarther(int farther) {
		this.farther = farther;
	}

	/**
	 * @return the dAC
	 */
	public int getDAC() {
		return DAC;
	}

	/**
	 * @return the fI
	 */
	public int getFI() {
		return FI;
	}

	/**
	 * <p>
	 * Title:
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 */
	public DemarcatedAreaBo() {
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
	 * @param type
	 * @param feature
	 * @param dateTime1
	 * @param dateTime2
	 * @param farther
	 */
	public DemarcatedAreaBo(int type, int feature, Long dateTime1, Long dateTime2, int farther) {
		super();
		this.type = type;
		this.feature = feature;
		this.dateTime1 = dateTime1;
		this.dateTime2 = dateTime2;
		this.farther = farther;
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
		return "DemarcatedAreaBo [DAC=" + DAC + ", FI=" + FI + ", type=" + type + ", feature=" + feature + ", dateTime1=" + dateTime1 + ", dateTime2="
				+ dateTime2 + ", farther=" + farther + "]";
	}

}
