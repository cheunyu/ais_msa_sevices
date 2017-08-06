/**     
 * @Title: TextVo.java    
 * @Package com.scyb.aisweather.vdl.vo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年10月8日 下午3:29:26    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.vo;

/**   
 * @ClassName: TextVo   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月8日 下午3:29:26      
 *    
 */
public class TextVo {

	/**
	 *      @Fields messageNo : TODO(报文号)   
	 */
	private int messageNo;

	/**
	 *      @Fields source_id : TODO(起始站台MMSI)   
	 */
	private int source_id;

	/**
	 *      @Fields destination_id : TODO(目标站台MMSI)   
	 */
	private int destination_id;
	
	private String content;

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>      
	 */
	public TextVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param messageNo
	 * @param source_id
	 * @param destination_id
	 * @param content   
	 */
	public TextVo(int messageNo, int source_id, int destination_id, String content) {
		super();
		this.messageNo = messageNo;
		this.source_id = source_id;
		this.destination_id = destination_id;
		this.content = content;
	}

	/**
	 * @return the messageNo
	 */
	public int getMessageNo() {
		return messageNo;
	}

	/**
	 * @param messageNo the messageNo to set
	 */
	public void setMessageNo(int messageNo) {
		this.messageNo = messageNo;
	}

	/**
	 * @return the source_id
	 */
	public int getSource_id() {
		return source_id;
	}

	/**
	 * @param source_id the source_id to set
	 */
	public void setSource_id(int source_id) {
		this.source_id = source_id;
	}

	/**
	 * @return the destination_id
	 */
	public int getDestination_id() {
		return destination_id;
	}

	/**
	 * @param destination_id the destination_id to set
	 */
	public void setDestination_id(int destination_id) {
		this.destination_id = destination_id;
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

	/** (非 Javadoc)   
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return   
	 * @see java.lang.Object#toString()   
	 */
	@Override
	public String toString() {
		return "TextVo [messageNo=" + messageNo + ", source_id=" + source_id + ", destination_id=" + destination_id + ", content=" + content + "]";
	}
	
}
