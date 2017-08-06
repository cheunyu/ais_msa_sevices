/**     
 * @Title: IResolveNcService.java    
 * @Package com.scyb.aisweather.nc.service   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2013-11-4 上午11:58:28    
 * @version V1.0    
 */
package com.scyb.aisweather.nc.service;

/**   
 * @ClassName: IResolveNcService   
 * @Description: TODO(解析NetCdf数据包接口)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2013-11-4 上午11:58:28      
 *    
 */
public interface IResolveNcService {

	/**
	 * @Title: resolveWind   
	 * @Description: TODO(解析风场数据接口)   
	 * @param @param filePath    设定文件  
	 * @return void    返回类型  
	 * @throws   
	 */
	public void resolveWind(String filePath);
}
