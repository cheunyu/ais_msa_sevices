/**     
 * @Title: IStationService.java    
 * @Package com.scyb.aisweather.template.service   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2013-11-14 下午4:27:33    
 * @version V1.0    
 */
package com.scyb.aisweather.template.service;

import java.util.List;

/**   
 * @ClassName: IStationService   
 * @Description: TODO(基站业务层接口)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2013-11-14 下午4:27:33      
 *    
 */
public interface IStationService {

	/**
	 * @Title: getAllStationName   
	 * @Description: TODO(获取全部基站名称)   
	 * @param @return    设定文件  
	 * @return List<String>    返回类型  
	 * @throws   
	 */
	public List<String> getAllStationName();
	
	/**
	 * @Title: delStaByStaNames   
	 * @Description: TODO(通过基站名称删除基站)   
	 * @param @param staNames
	 * @param @return    设定文件  
	 * @return Boolean    返回类型  
	 * @throws   
	 */
	public void delStaByStaNames(String staNames);
}
