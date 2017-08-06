/**     
 * @Title: TextBo.java    
 * @Package com.scyb.aisweather.vdl.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年10月8日 下午3:57:20    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.bo;

import com.scyb.aisweather.vdl.bo.head.MessageEight;
import com.scyb.aisweather.vdl.bo.head.MessageSix;

/**   
 * @ClassName: TextBo   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月8日 下午3:57:20      
 *    
 */
public class TextBo {

	/**
	 *      @Fields DAC : TODO(DAC码)   
	 */
	private final static int DAC = 413;

	/**
	 *      @Fields FI : TODO(FI功能码)   
	 */
	private final static int FI = 1;
	
	private String content;
	
	private MessageSix messageSix;
	
	private MessageEight messageEight;

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>      
	 */
	public TextBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param content
	 * @param messageSix
	 * @param messageEight   
	 */
	public TextBo(String content, MessageSix messageSix, MessageEight messageEight) {
		super();
		this.content = content;
		this.messageSix = messageSix;
		this.messageEight = messageEight;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the messageSix
	 */
	public MessageSix getMessageSix() {
		return messageSix;
	}

	/**
	 * @param messageSix the messageSix to set
	 */
	public void setMessageSix(MessageSix messageSix) {
		this.messageSix = messageSix;
	}

	/**
	 * @return the messageEight
	 */
	public MessageEight getMessageEight() {
		return messageEight;
	}

	/**
	 * @param messageEight the messageEight to set
	 */
	public void setMessageEight(MessageEight messageEight) {
		this.messageEight = messageEight;
	}

	/**
	 * @return the dac
	 */
	public static int getDac() {
		return DAC;
	}

	/**
	 * @return the fi
	 */
	public static int getFi() {
		return FI;
	}

	/** (非 Javadoc)   
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return   
	 * @see java.lang.Object#toString()   
	 */
	@Override
	public String toString() {
		return "TextBo [content=" + content + ", messageSix=" + messageSix + ", messageEight=" + messageEight + "]";
	}
	
}
