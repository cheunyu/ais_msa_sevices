/**     
 * @Title: IShiftAidsMarkedDynamic.java    
 * @Package com.scyb.aisweather.webservice   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月22日 下午2:58:37    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice;

import javax.jws.WebService;

import com.scyb.aisweather.webservice.bo.ShiftDynamicBo;

/**   
 * @ClassName: IShiftAidsMarkedDynamic   
 * @Description: TODO(助航标注动态移位接口)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月22日 下午2:58:37      
 *    
 */
@WebService
public interface IShiftAidsMarkedDynamic {

	public int shiftAmdBroadcastService(ShiftDynamicBo sdBo);
}
