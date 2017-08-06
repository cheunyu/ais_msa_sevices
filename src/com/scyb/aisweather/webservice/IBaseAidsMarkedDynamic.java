/**     
 * @Title: IAidsMarkedDynamic.java    
 * @Package com.scyb.aisweather.webservice   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月5日 上午9:42:53    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice;

import javax.jws.WebService;

import com.scyb.aisweather.webservice.bo.BaseDynamicBo;

/**   
 * @ClassName: IAidsMarkedDynamic   
 * @Description: TODO(助航标注动态【新增，撤除，漂失，故障，恢复工作】接口)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月5日 上午9:42:53      
 *    
 */
@WebService
public interface IBaseAidsMarkedDynamic {
	
	public int amdBroadcastService(BaseDynamicBo bdBo);
}
