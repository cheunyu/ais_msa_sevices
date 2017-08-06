/**     
 * @Title: SerialDataService.java    
 * @Package com.scyb.aisweather.serial.service   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年9月3日 下午2:55:02    
 * @version V1.0    
 */
package com.scyb.aisweather.serial.service;

import java.util.List;

import com.scyb.aisweather.vdl.bo.head.MessageEight;
import com.scyb.aisweather.vdl.bo.head.MessageSix;

/**   
 * @ClassName: SerialDataService   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年9月3日 下午2:55:02      
 *    
 */
public interface ISerialDataService {
	
	/**
	 * @Title: gsenerationSerialCode   
	 * @Description: TODO(生成串口)   
	 * @param     设定文件  
	 * @return void    返回类型  
	 * @throws   
	 */
	public List<String> generationABM(String iecCode, MessageSix messageSix);
	
	public List<String> generationBBM(String iecCode, MessageEight messageEight);
}
