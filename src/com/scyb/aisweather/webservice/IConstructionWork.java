/**     
 * @Title: IConstructionWork.java    
 * @Package com.scyb.aisweather.webservice   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月23日 下午12:48:20    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice;

import javax.jws.WebService;

import com.scyb.aisweather.webservice.bo.ConstructionWorkBo;

/**   
 * @ClassName: IConstructionWork   
 * @Description: TODO(施工作业接口)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月23日 下午12:48:20      
 *    
 */
@WebService
public interface IConstructionWork {

	public int workBroadcastService(ConstructionWorkBo cwBo);
}