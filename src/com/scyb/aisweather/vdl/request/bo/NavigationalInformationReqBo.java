/**     
 * @Title: NavigationalInformationVo.java    
 * @Package com.scyb.aisweather.vdl.vo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月7日 下午7:21:15    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.request.bo;

/**
 *      @ClassName: NavigationalInformationVo   
 *  @Description: TODO(这里用一句话描述这个类的作用)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年10月7日 下午7:21:15           
 */
public class NavigationalInformationReqBo {

	/**
	 *      @Fields DAC : TODO(DAC码)   
	 */
	private final static int DAC = 412;

	/**
	 *      @Fields FI : TODO(FI功能码)   
	 */
	private final static int FI = 20;
	
	/**   
	 * @Fields departurePort : TODO(出发港口)   
	 */
	private int departurePort;

	private int shipType;

	private int powerType;

	private int horsepower;

	private int personnelTotal;

	private int berthMarina;

	private int berthTime;


}
