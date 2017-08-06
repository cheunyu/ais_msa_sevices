/**     
 * @Title: IMarineWeatherForecastService.java    
 * @Package com.scyb.aisweather.vdl.service   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年9月17日 上午11:07:20    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.service;

import com.scyb.aisweather.vdl.vo.MarineWeatherForecastVo;

/**   
 * @ClassName: IMarineWeatherForecastService   
 * @Description: TODO(海洋气象预报业务逻辑接口)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年9月17日 上午11:07:20      
 *    
 */
public interface IMarineWeatherForecastService {

	/**
	 * @Title: transformVdl   
	 * @Description: TODO(转换VDL接口)   
	 * @param @param mwfVo    设定文件  
	 * @return void    返回类型  
	 * @throws   
	 */
	public int transformVdl(MarineWeatherForecastVo mwfVo);
}
