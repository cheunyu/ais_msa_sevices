/**     
 * @Title: IWaveWarn.java    
 * @Package com.scyb.aisweather.webservice   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月17日 下午3:37:45    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice;

import javax.jws.WebService;

import com.scyb.aisweather.webservice.bo.WaveWarnBo;

/**
 *      @ClassName: IWaveWarn     @Description: TODO(海洋气象大浪预警接口)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年12月17日 下午3:37:45      
 *     
 */
@WebService
public interface IWaveWarn {

	public int waveWarnBroadcastService(WaveWarnBo waveWarnBo);
}
