/**     
 * @Title: IMilitaryActivitiy.java    
 * @Package com.scyb.aisweather.webservice   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月23日 下午3:25:39    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice;

import javax.jws.WebService;

import com.scyb.aisweather.webservice.bo.MilitaryActivitiyBo;

/**   
 * @ClassName: IMilitaryActivitiy   
 * @Description: TODO(演习、打靶、海上军事活动接口)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月23日 下午3:25:39      
 *    
 */
@WebService
public interface IMilitaryActivitiy {

	public int maBroadcastService(MilitaryActivitiyBo maBo);
}
