/**     
 * @Title: IWindWarn.java    
 * @Package com.scyb.aisweather.webservice   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月17日 下午2:37:01    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice;

import javax.jws.WebService;

import com.scyb.aisweather.webservice.bo.WindWarnBo;

/**   
 * @ClassName: IWindWarn   
 * @Description: TODO(海洋气象大风预警接口)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月17日 下午2:37:01      
 *    
 */
@WebService
public interface IWindWarn {

	public int windWarnBroadcastService(WindWarnBo windWarnBo);
}
