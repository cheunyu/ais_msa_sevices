/**     
 * @Title: IAidsMarkedDynamicService.java    
 * @Package com.scyb.aisweather.vdl.service   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月5日 下午1:10:58    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.service;

import javax.jws.WebService;

import com.scyb.aisweather.vdl.vo.AidsMarkedDynamicVo;


/**   
 * @ClassName: IAidsMarkedDynamicService   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月5日 下午1:10:58      
 *    
 */
@WebService
public interface IAidsMarkedDynamicService {
	/**
	 * @Title: transformVdl   
	 * @Description: TODO(转换VDL接口)   
	 * @param @param mwfVo    设定文件  
	 * @return void    返回类型  
	 * @throws   
	 */
	public String transformVdl(AidsMarkedDynamicVo amdVo);
}