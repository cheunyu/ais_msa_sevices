/**     
 * @Title: ResolveVDMServiceImpl.java    
 * @Package com.scyb.aisweather.vdl.service.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年11月10日 上午10:55:08    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.service.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.springframework.web.context.ContextLoader;

import com.scyb.aisweather.vdl.service.IResolveVDMService;
import com.scyb.aisweather.vdl.util.NMEA0183ConvertBinaryUtil;

/**
 *      @ClassName: ResolveVDMServiceImpl   
 *  @Description: TODO(这里用一句话描述这个类的作用)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年11月10日 上午10:55:08           
 */
public class ResolveVDMServiceImpl implements IResolveVDMService {

	private Logger log = Logger.getLogger(this.getClass());
	NMEA0183ConvertBinaryUtil ncbUtil = new NMEA0183ConvertBinaryUtil();

	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: resolveVDM
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *          @see
	 * com.scyb.aisweather.vdl.service.IResolveVDMService#resolveVDM()   
	 */
	@Override
	public String resolveVDM(String message) {
		// TODO Auto-generated method stub
		Map<String, String> sixbitMap = (Map<String, String>) ContextLoader.getCurrentWebApplicationContext().getServletContext().getAttribute("sixbitMap");
		// log.info(message);
		StringBuffer binarySB = new StringBuffer();
		for (int i = 0; i < message.length(); i++) {
			Iterator<Entry<String, String>> iter = sixbitMap.entrySet().iterator();
			while (iter.hasNext()) {
				Entry entry = (Entry) iter.next();
				if (entry.getKey().equals(message.substring(i, i + 1))) {
					binarySB.append(entry.getValue());
				}
			}
		}
		return binarySB.toString();
	}
	
	/** (非 Javadoc)   
	 * <p>Title: splitVDM</p>  
	 * <p>Description: </p>  
	 * @param message
	 * @param messageMap
	 * @return   
	 * @see com.scyb.aisweather.vdl.service.IResolveVDMService#splitVDM(java.lang.String, java.util.HashMap)   
	 */
	@Override
	public String splitVDM(String message, HashMap<Integer, String> messageMap) {
		// TODO Auto-generated method stub
		String tmp[] = message.split(",");
		String tmpMsg = null;
		if (Integer.parseInt(tmp[1]) > 1) {
			if (messageMap.get(Integer.parseInt(tmp[3])) != null) {
				messageMap.put(Integer.parseInt(tmp[3]), messageMap.get(Integer.parseInt(tmp[3])) + tmp[5]);
			} else {
				messageMap.put(Integer.parseInt(tmp[3]), tmp[5]);
			}
			if (Integer.parseInt(tmp[1]) == Integer.parseInt(tmp[2])) {
				tmpMsg = messageMap.get(Integer.parseInt(tmp[3]));
				messageMap.put(Integer.parseInt(tmp[3]), null);
			}
		} else {
			tmpMsg = tmp[5];
		}
		return tmpMsg;
	}
	
	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: checkVDM
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @param message     @see
	 * com.scyb.aisweather.vdl.service.IResolveVDMService
	 * #checkVDM(java.lang.String)   
	 * 
	 * @return
	 */
	@Override
	public boolean checkVDM(String message) {
		// TODO Auto-generated method stub
		String tmp[] = message.split(",");
		if (tmp[0].indexOf("VDM") > 0) {
//			log.info("是VDM格式语句。");
			return true;
		}
		return false;
	}

	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: checkMessageNo
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @param binaryMessage  @return     @see
	 * com.scyb.aisweather.vdl.service
	 * .IResolveVDMService#checkMessageNo(java.lang.String)   
	 */
	@Override
	public int checkMessageNo(String binaryMessage) {
		// TODO Auto-generated method stub
		return Integer.valueOf(binaryMessage.substring(0, 6),2);
	}

}
