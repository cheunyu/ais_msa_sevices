package com.scyb.aisweather.message.util;

import org.apache.log4j.Logger;

import com.scyb.aisweather.message.bo.MessageValue;
import com.scyb.aisweather.message.bo.MessageValueVo;
import com.scyb.aisweather.message.service.IMessageSendService;
import com.scyb.aisweather.message.service.impl.MessageSendServiceImpl;

/**   
 * @ClassName: MessageValueUtil   
 * @Description: TODO(数值预报工具类)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date Nov 23, 2013 2:51:59 PM      
 *    
 */
public class MessageValueUtil {

	private Logger log = Logger.getLogger(this.getClass());
	
	private IMessageSendService msgSendService = new MessageSendServiceImpl();
	
	/**
	 * @Title: msaValueToSAAB   
	 * @Description: TODO(数值预报转萨博平台码)   
	 * @param msgValue    设定文件  
	 * @return void    返回类型  
	 * @throws   
	 */
	public void msgValueToSAAB(MessageValue msgValue) {
		/*模拟报文*/
		MessageValueVo msgValueVo = new MessageValueVo();
		msgValueVo.setTime(11);
		msgValueVo.setWeather(1);
		int lon[] = {925, 903, 883, 897, 877, 902, 848, 867, 912, 831};
		msgValueVo.setLon(lon);
		int lat[] = {1793, 1785, 1795, 1803, 1807, 1824, 1832, 1849, 1808, 1832};
		msgValueVo.setLat(lat);
		int windSpeed[] = {5, 6, 5, 6, 6, 5, 6, 6, 5, 5};
		msgValueVo.setWindSpeed(windSpeed);
		int windDirection[] = {335, 327, 338, 312, 322, 332, 317, 311, 326, 338};
		msgValueVo.setWindDirection(windDirection);
		int temperature[] = {68, 69, 72, 66, 65, 65, 67, 69, 69, 67};
		msgValueVo.setTemperature(temperature);
		int pressure[] = {100, 200, 100, 200, 200, 200, 100, 200, 100, 100};
		msgValueVo.setPressure(pressure);
		int visibility[] = {12, 16, 18, 14, 25, 21, 19, 23, 18, 21}; 
		msgValueVo.setVisibility(visibility);
		StringBuffer sb = new StringBuffer();
		sb.append(MessageValueUtil.toFullBinaryString(msgValueVo.getTime(), 5));
		sb.append(MessageValueUtil.toFullBinaryString(msgValueVo.getWeather(), 5));
		for(int i=0;i<lon.length; i++) {
			sb.append(MessageValueUtil.toFullBinaryString(msgValueVo.getLon()[i], 11));
			sb.append(MessageValueUtil.toFullBinaryString(msgValueVo.getLat()[i], 11));
			sb.append(MessageValueUtil.toFullBinaryString(msgValueVo.getWindSpeed()[i], 7));
			sb.append(MessageValueUtil.toFullBinaryString(msgValueVo.getWindDirection()[i], 9));
			sb.append(MessageValueUtil.toFullBinaryString(msgValueVo.getTemperature()[i], 11));
			sb.append(MessageValueUtil.toFullBinaryString(msgValueVo.getPressure()[i], 9));
			sb.append(MessageValueUtil.toFullBinaryString(msgValueVo.getVisibility()[i], 8));
		}
		sb.append("00");
		StringBuffer contentSb = new StringBuffer();
		int tem = 0;
		for(int i=0;i<sb.length();i++) {
			if(i%6 == 0) {
				tem = Integer.valueOf(sb.substring(i, i+6), 2);
				if(tem<40) {
					contentSb.append((char)(tem + 48));
				}else {
					contentSb.append((char)(tem + 56));
				}
			}
		}
		
		msgSendService.message6Send(contentSb.toString(), "123444321");
	}
	
	public static String toFullBinaryString(int num, int subIndex) {
		char[] chs = new char[subIndex];
		for (int i = 0, k = chs.length; i < k; i++) {
			chs[k - i - 1] = ((num >> i) & 1) == 0 ? '0' : '1';
		}
		return new String(chs);
	}
	
}
