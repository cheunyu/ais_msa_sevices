/**     
 * @Title: IHeavyTow.java    
 * @Package com.scyb.aisweather.webservice   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月23日 下午2:42:07    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice;

import javax.jws.WebService;

import com.scyb.aisweather.webservice.bo.HeavyTowBo;

/**   
 * @ClassName: IHeavyTow   
 * @Description: TODO(笨重拖带接口)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月23日 下午2:42:07      
 *    
 */
@WebService
public interface IHeavyTow {

	public int htBroadcastService(HeavyTowBo htBo);
}