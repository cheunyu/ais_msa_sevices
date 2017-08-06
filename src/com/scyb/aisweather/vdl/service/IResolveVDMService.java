/**     
 * @Title: IResolveVDMService.java    
 * @Package com.scyb.aisweather.vdl.service   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年11月10日 上午10:54:19    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.service;

import java.util.HashMap;

/**   
 * @ClassName: IResolveVDMService   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年11月10日 上午10:54:19      
 *    
 */
public interface IResolveVDMService {

	/**
	 * @Title: checkVDM   
	 * @Description: TODO(判断是否是VDM语句)   
	 * @param @param message
	 * @param @return    设定文件  
	 * @return boolean    返回类型  
	 * @throws   
	 */
	public boolean checkVDM(String message);
	
	/**
	 * @Title: splitVDM   
	 * @Description: TODO(拼接多条VDM语句)   
	 * @param @param message
	 * @param @param messageMap
	 * @param @return    设定文件  
	 * @return String    返回类型  
	 * @throws   
	 */
	public String splitVDM(String message, HashMap<Integer, String> messageMap);
	
	/**
	 * @Title: resolveVDM   
	 * @Description: TODO(6位码转二进制)   
	 * @param @param message
	 * @param @return    设定文件  
	 * @return String    返回类型  
	 * @throws   
	 */
	public String resolveVDM(String message);
	
	/**
	 * @Title: checkMessageNo   
	 * @Description: TODO(判断报文号)   
	 * @param @param binaryMessage
	 * @param @return    设定文件  
	 * @return int    返回类型  
	 * @throws   
	 */
	public int checkMessageNo(String binaryMessage);
}
