/**     
 * @Title: IHydrologyWeatherForecastService.java    
 * @Package com.scyb.aisweather.vdl.service   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月4日 下午7:54:53    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.service;

import com.scyb.aisweather.vdl.vo.HydrologyWeatherForecastVo;

/**   
 * @ClassName: IHydrologyWeatherForecastService   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月4日 下午7:54:53      
 *    
 */
public interface IHydrologyWeatherForecastService {

	/**
	 * @Title: transformVdl   
	 * @Description: TODO(转换VDL接口)   
	 * @param @param mwfVo    设定文件  
	 * @return void    返回类型  
	 * @throws   
	 */
	public String transformVdl(HydrologyWeatherForecastVo hwfVo);
}
