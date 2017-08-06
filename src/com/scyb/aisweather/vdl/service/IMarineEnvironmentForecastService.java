/**     
 * @Title: IOceanEnvironmentForecastService.java    
 * @Package com.scyb.aisweather.vdl.service   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年7月29日 下午2:26:46    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.service;

import com.scyb.aisweather.vdl.vo.MarineEnvironmentForecastVo;

/**   
 * @ClassName: IOceanEnvironmentForecastService   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年7月29日 下午2:26:46      
 *    
 */
public interface IMarineEnvironmentForecastService {
	
	public int transformVdl(MarineEnvironmentForecastVo mefVo);

}
