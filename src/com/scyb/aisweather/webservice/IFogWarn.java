/**     
 * @Title: IFogWarn.java    
 * @Package com.scyb.aisweather.webservice   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月17日 下午3:38:26    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice;

import javax.jws.WebService;

import com.scyb.aisweather.webservice.bo.FogWarnBo;

/**   
 * @ClassName: IFogWarn   
 * @Description: TODO(海洋气象大雾预警接口)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月17日 下午3:38:26      
 *    
 */
@WebService
public interface IFogWarn {

	public int fogWarnBroadcastService(FogWarnBo fogWarnBo);
}
