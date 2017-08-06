/**     
 * @Title: SerialDataServiceImpl.java    
 * @Package com.scyb.aisweather.serial.service   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年9月4日 上午10:33:27    
 * @version V1.0    
 */
package com.scyb.aisweather.serial.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.web.context.ContextLoader;

import com.scyb.aisweather.serial.service.ISerialDataService;
import com.scyb.aisweather.serial.util.CheckCodeUtil;
import com.scyb.aisweather.vdl.bo.head.MessageEight;
import com.scyb.aisweather.vdl.bo.head.MessageSix;
import com.scyb.aisweather.vdl.util.AscIIConvertBinaryUtil;
import com.scyb.aisweather.vdl.util.IEC1371ConvertSerialUtil;

/**
 *      @ClassName: SerialDataServiceImpl   
 *  @Description: TODO(这里用一句话描述这个类的作用)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年9月4日 上午10:33:27           
 */
public class SerialDataServiceImpl implements ISerialDataService {

	private Logger log = Logger.getLogger(this.getClass());
	private AscIIConvertBinaryUtil acbUtil = new AscIIConvertBinaryUtil();
	private IEC1371ConvertSerialUtil icsUtil = new IEC1371ConvertSerialUtil();

	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: gsenerationSerialCode
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @param code     @see
	 * com.scyb.aisweather.serial.service.ISerialDataService
	 * #gsenerationSerialCode(java.lang.String)   
	 */
	@Override
	public List<String> generationABM(String iecCode, MessageSix messageSix) {
		List<String> serialCodeList = new ArrayList<String>();
		String serialCode = icsUtil.convertSerial(iecCode);
		int messageCount = icsUtil.getSerialMessageCount(serialCode);
		Map<Integer, String> messageMap = icsUtil.getMessageMap(serialCode, messageCount);
		String paddingCode = icsUtil.getPaddingCode(iecCode);
		StringBuffer sb = new StringBuffer();
		CheckCodeUtil checkUtil = new CheckCodeUtil();
		for (int i = 0; i < messageCount;) {
			sb.delete(0, sb.length());
			sb.append("!ECABM,");
			// 语句总数
			sb.append(messageCount).append(",");
			// 语句编号
			sb.append(++i).append(",");
			// 连续信息识别符
			sb.append(messageSix.getSequence_number()).append(",");
			// 目标AIS设备MMSI码
			sb.append(messageSix.getDestination_id()).append(",");
					
			
			// 用于无线信息广播的AIS信道
			sb.append("0").append(",");
			// 报文ID
			sb.append("06").append(",");
			// 1371-4封装的数据
			sb.append(messageMap.get(i)).append(",");
			// 填充位 
			sb.append(paddingCode);
			sb.append("*");
			sb.append(checkUtil.chkSumXOR(sb.toString()));
			sb.append("\r\n");
			log.info(sb.toString());
			serialCodeList.add(sb.toString());
		}
		return serialCodeList;
	}

	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: generationBBMEight
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @param code  @param me  @return     @see
	 * com.scyb.aisweather.serial.service
	 * .ISerialDataService#generationBBMEight(java.lang.String,
	 * com.scyb.aisweather.vdl.bo.head.MessageEight)   
	 */
	@Override
	public List<String> generationBBM(String iecCode, MessageEight me) {
		List<String> serialCodeList = new ArrayList<String>();
		String serialCode = icsUtil.convertSerial(iecCode);
		int messageCount = icsUtil.getSerialMessageCount(serialCode);
		Map<Integer, String> messageMap = icsUtil.getMessageMap(serialCode, messageCount);
		String paddingCode = icsUtil.getPaddingCode(iecCode);
		StringBuffer sb = new StringBuffer();
		CheckCodeUtil checkUtil = new CheckCodeUtil();
		for (int i = 0; i < messageCount;) {
			sb.delete(0, sb.length());
			sb.append("!ECBBM,");
			// 语句总数
			sb.append(messageCount).append(",");
			// 语句编号
			sb.append(++i).append(",");
			// 连续信息识别符
			sb.append(0).append(",");
			// 用于无线信息广播的AIS信道
			sb.append("0").append(",");
			// 报文ID
			sb.append("08").append(",");
			// 1371-4封装的数据
			sb.append(messageMap.get(i)).append(",");
			sb.append(paddingCode);
			// 填充位
//			sb.append(paddingCode).append("*");
//			sb.append(checkUtil.chkSumXOR(sb.toString()));
//			sb.append("\r\n");
			log.info(sb.toString());
			serialCodeList.add(sb.toString());
		}
		return serialCodeList;
	}
}
