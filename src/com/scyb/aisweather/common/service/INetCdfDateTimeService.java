/**     
 * @Title: INetCdfDateTimeService.java    
 * @Package com.scyb.aisweather.common.service   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年9月16日 下午3:14:58    
 * @version V1.0    
 */
package com.scyb.aisweather.common.service;

import java.util.List;

/**   
 * @ClassName: INetCdfDateTimeService   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年9月16日 下午3:14:58      
 *    
 */
public interface INetCdfDateTimeService {

	/**
	 * @Title: getNetCdfDateTime   
	 * @Description: TODO(获取NETCDF文件数据时间)   
	 * @param @return    设定文件  
	 * @return List<String>    返回类型  
	 * @throws   
	 */
	public List<String> getNetCdfDateTime();
}
