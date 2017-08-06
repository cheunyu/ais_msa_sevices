/**     
 * @Title: IHydrologyWeatherForecast.java    
 * @Package com.scyb.aisweather.webservice   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月19日 上午9:03:01    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice;

import javax.jws.WebService;

import com.scyb.aisweather.webservice.bo.HydrologyWeatherForecastBo;

/**   
 * @ClassName: IHydrologyWeatherForecast   
 * @Description: TODO(水文气象预报接口)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月19日 上午9:03:01      
 *    
 */
@WebService
public interface IHydrologyWeatherForecast {

	public int hwfBroadcastService(HydrologyWeatherForecastBo hwfBo);
}
