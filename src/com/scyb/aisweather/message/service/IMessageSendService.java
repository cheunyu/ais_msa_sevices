/**     
 * @Title: IMessageSendService.java    
 * @Package com.scyb.aisweather.message.service   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2013-11-22 上午10:48:55    
 * @version V1.0    
 */
package com.scyb.aisweather.message.service;

import com.scyb.aisweather.message.bo.MessageValue;

/**   
 * @ClassName: IMessageSendService   
 * @Description: TODO(播发报文接口)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2013-11-22 上午10:48:55      
 *    
 */
public interface IMessageSendService {

	/**
	 * @Title: message6Send   
	 * @Description: TODO(数值预报)   
	 * @param msgValue    设定文件  
	 * @return void    返回类型  
	 * @throws   
	 */
	public void message6Send(String context, String stationId);
}
