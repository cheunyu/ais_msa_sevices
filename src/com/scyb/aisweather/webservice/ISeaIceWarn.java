/**     
 * @Title: ISeaIceWarn.java    
 * @Package com.scyb.aisweather.webservice   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月17日 下午3:39:33    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice;

import javax.jws.WebService;

import com.scyb.aisweather.webservice.bo.SeaIceWarnBo;

/**   
 * @ClassName: ISeaIceWarn   
 * @Description: TODO(海洋气象海冰预警接口)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月17日 下午3:39:33      
 *    
 */
@WebService
public interface ISeaIceWarn {

	public int seaIceWarnBroadcastService(SeaIceWarnBo seaIceWarnBo);
}
