/**     
 * @Title: INavigation.java    
 * @Package com.scyb.aisweather.webservice   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月23日 下午12:25:07    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice;

import javax.jws.WebService;

import com.scyb.aisweather.webservice.bo.NavigationBo;


/**   
 * @ClassName: INavigation   
 * @Description: TODO(碍航物信息接口)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月23日 下午12:25:07      
 *    
 */
@WebService
public interface INavigation {

	public int navBroadcastService(NavigationBo navBo);
}
