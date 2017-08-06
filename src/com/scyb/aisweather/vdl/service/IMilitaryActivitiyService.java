/**     
 * @Title: IMilitaryActivitiyService.java    
 * @Package com.scyb.aisweather.vdl.service   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月6日 下午6:51:22    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.service;

import com.scyb.aisweather.vdl.vo.MilitaryActivitiyVo;

/**   
 * @ClassName: IMilitaryActivitiyService   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月6日 下午6:51:22      
 *    
 */
public interface IMilitaryActivitiyService {

	/**
	 * @Title: transformVdl   
	 * @Description: TODO(转换VDL接口)   
	 * @param @param mwwVo    设定文件  
	 * @return void    返回类型  
	 * @throws   
	 */
	public String transformVdl(MilitaryActivitiyVo maVo);
}
