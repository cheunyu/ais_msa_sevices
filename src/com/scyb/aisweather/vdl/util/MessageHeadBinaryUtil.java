/**     
 * @Title: MessageHeadBinaryUtil.java    
 * @Package com.scyb.aisweather.vdl.util   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年9月22日 下午5:17:00    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.util;


import com.scyb.aisweather.vdl.bo.head.MessageEight;
import com.scyb.aisweather.vdl.bo.head.MessageSix;

/**
 *      @ClassName: MessageHeadBinaryUtil     @Description: TODO(表头二进制工具类)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年9月22日 下午5:17:00           
 */
public class MessageHeadBinaryUtil {

	private StringBuffer messageHeadBin = new StringBuffer();
	private AscIIConvertBinaryUtil acbUtil = new AscIIConvertBinaryUtil();
	
	public String generationMessageSixHead(MessageSix messageSix) {
		messageHeadBin.append(acbUtil.convertBin(6, 6));
		messageHeadBin.append(acbUtil.convertBin(messageSix.getRepeat(), 2));
		messageHeadBin.append(acbUtil.convertBin(messageSix.getSource_id(), 30));
		messageHeadBin.append(acbUtil.convertBin(messageSix.getSequence_number(), 2));
		messageHeadBin.append(acbUtil.convertBin(messageSix.getDestination_id(), 30));
		messageHeadBin.append(acbUtil.convertBin(messageSix.getRetransmit_flag(), 1));
		messageHeadBin.append(acbUtil.convertBin(messageSix.getSpare(), 1));
		return messageHeadBin.toString();

	}

	public String generationMessageEightHead(MessageEight messageEight) {
		messageHeadBin.append(acbUtil.convertBin(8, 6));
		messageHeadBin.append(acbUtil.convertBin(messageEight.getRepeat(), 2));
		messageHeadBin.append(acbUtil.convertBin(messageEight.getSource_id(), 30));
		messageHeadBin.append(acbUtil.convertBin(messageEight.getSpare(), 2));
		return null;

	}
}
