/**     
 * @Title: IText.java    
 * @Package com.scyb.aisweather.webservice   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月24日 上午8:58:47    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice;

import javax.jws.WebService;

import com.scyb.aisweather.webservice.bo.TextBo;
import com.scyb.aisweather.webservice.bo.TropicalCycloneWarnBo;

/**   
 * @ClassName: IText   
 * @Description: TODO(中英文播发接口)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月24日 上午8:58:47      
 *    
 */
@WebService
public interface IText {

	public int textBroadcastService(TextBo textBo);
}
