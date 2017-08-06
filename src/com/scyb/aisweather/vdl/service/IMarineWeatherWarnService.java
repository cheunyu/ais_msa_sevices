/**     
 * @Title: IMarineWeatherWarnService.java    
 * @Package com.scyb.aisweather.vdl.service   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年9月25日 下午2:42:05    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.service;

import com.scyb.aisweather.vdl.vo.MarineWeatherWarnVo;

/**   
 * @ClassName: IMarineWeatherWarnService   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年9月25日 下午2:42:05      
 *    
 */
public interface IMarineWeatherWarnService {

	/**
	 * @Title: transformVdl   
	 * @Description: TODO(转换VDL接口)   
	 * @param @param mwwVo    设定文件  
	 * @return void    返回类型  
	 * @throws   
	 * @return 
	 */
	public String transformVdl(MarineWeatherWarnVo mwwVo);
}
