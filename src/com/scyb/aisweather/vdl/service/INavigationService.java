/**     
 * @Title: INavigationService.java    
 * @Package com.scyb.aisweather.vdl.service   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月5日 下午9:38:54    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.service;

import com.scyb.aisweather.vdl.vo.NavigationVo;

/**   
 * @ClassName: INavigationService   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月5日 下午9:38:54      
 *    
 */
public interface INavigationService {

	/**
	 * @Title: transformVdl   
	 * @Description: TODO(转换VDL接口)   
	 * @param @param mwfVo    设定文件  
	 * @return void    返回类型  
	 * @throws   
	 */
	public String transformVdl(NavigationVo navVo);
}
