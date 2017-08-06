/**     
 * @Title: IDemarcatedIrregulaArea.java    
 * @Package com.scyb.aisweather.webservice   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月23日 下午4:04:11    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice;

import javax.jws.WebService;

import com.scyb.aisweather.webservice.bo.DemarcatedIrregulaAreaBo;

/**   
 * @ClassName: IDemarcatedIrregulaArea   
 * @Description: TODO(划定区域不规则图形接口)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月23日 下午4:04:11      
 *    
 */
@WebService
public interface IDemarcatedIrregulaArea {

	public int irregulaAreaBroadcastService(DemarcatedIrregulaAreaBo diaBo);
}
