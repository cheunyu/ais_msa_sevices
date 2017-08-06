/**     
 * @Title: IDistressShip.java    
 * @Package com.scyb.aisweather.webservice   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月23日 下午3:39:01    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice;

import javax.jws.WebService;

import com.scyb.aisweather.webservice.bo.DistressShipBo;
import com.scyb.aisweather.webservice.bo.FogWarnBo;

/**   
 * @ClassName: IDistressShip   
 * @Description: TODO(船舶遇险接口)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月23日 下午3:39:01      
 *    
 */
@WebService
public interface IDistressShip {

	public int dsBroadcastService(DistressShipBo dsBo);
}
