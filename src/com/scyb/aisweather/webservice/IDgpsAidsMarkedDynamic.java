/**     
 * @Title: IDgpsAidsMarkedDynamic.java    
 * @Package com.scyb.aisweather.webservice   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月22日 下午3:59:26    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice;

import javax.jws.WebService;

import com.scyb.aisweather.webservice.bo.DgpsDynamicBo;

/**   
 * @ClassName: IDgpsAidsMarkedDynamic   
 * @Description: TODO(助航标注动态-DGPS台站停止发射接口)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月22日 下午3:59:26      
 *    
 */
@WebService
public interface IDgpsAidsMarkedDynamic {

	public int dgpsAmdBroadcastService(DgpsDynamicBo dgpsBo);
}
