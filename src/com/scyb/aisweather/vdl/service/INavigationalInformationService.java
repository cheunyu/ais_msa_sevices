/**     
 * @Title: INavigationalInformationService.java    
 * @Package com.scyb.aisweather.vdl.service   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月7日 下午7:27:49    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.service;

import com.scyb.aisweather.vdl.vo.NavigationalInformationVo;

/**   
 * @ClassName: INavigationalInformationService   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月7日 下午7:27:49      
 *    
 */
public interface INavigationalInformationService {

	/**
	 * @Title: transformVdl   
	 * @Description: TODO(转换VDL接口)   
	 * @param @param mwwVo    设定文件  
	 * @return void    返回类型  
	 * @throws   
	 */
	public int transformVdl(NavigationalInformationVo niVo);
}
