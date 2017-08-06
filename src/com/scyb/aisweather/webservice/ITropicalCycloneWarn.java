/**     
 * @Title: ITropicalCycloneWarn.java    
 * @Package com.scyb.aisweather.webservice   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月11日 下午2:48:17    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice;

import javax.jws.WebService;

import com.scyb.aisweather.webservice.bo.TropicalCycloneWarnBo;

/**   
 * @ClassName: ITropicalCycloneWarn   
 * @Description: TODO(海洋气象预警热带气旋接口)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月11日 下午2:48:17      
 *    
 */
@WebService
public interface ITropicalCycloneWarn {

	public int tcWarnBroadcastService(TropicalCycloneWarnBo tcWarn);
}
