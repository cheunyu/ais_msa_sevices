/**     
 * @Title: ITextService.java    
 * @Package com.scyb.aisweather.vdl.service   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年10月8日 下午3:59:01    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.service;

import com.scyb.aisweather.vdl.vo.TextVo;

/**   
 * @ClassName: ITextService   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月8日 下午3:59:01      
 *    
 */
public interface ITextService {

	/**
	 * @Title: transformVdl   
	 * @Description: TODO(转换VDL接口)   
	 * @param @param mwfVo    设定文件  
	 * @return void    返回类型  
	 * @throws   
	 */
	public String transformVdl(TextVo tVo);
}
