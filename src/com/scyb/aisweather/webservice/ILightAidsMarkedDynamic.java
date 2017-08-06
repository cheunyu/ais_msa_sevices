/**     
 * @Title: ILightAidsMarkedDynamic.java    
 * @Package com.scyb.aisweather.webservice   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月22日 下午3:34:30    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice;

import javax.jws.WebService;

import com.scyb.aisweather.webservice.bo.LightDynamicBo;

/**   
 * @ClassName: ILightAidsMarkedDynamic   
 * @Description: TODO(助航标注动态灯质改变接口)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月22日 下午3:34:30      
 *    
 */
@WebService
public interface ILightAidsMarkedDynamic {

	public int lightAmdBroadcastService(LightDynamicBo ldBo);
}
