/**     
 * @Title: PortStatusBo.java    
 * @Package com.scyb.aisweather.vdl.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月7日 下午7:03:23    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.bo;

import com.scyb.aisweather.vdl.bo.head.MessageSix;

/**
 *      @ClassName: PortStatusBo     @Description: TODO(这里用一句话描述这个类的作用)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年10月7日 下午7:03:23           
 */
public class PortStatusBo {

	/**
	 *      @Fields DAC : TODO(DAC码)   
	 */
	private final static int DAC = 412;

	/**
	 *      @Fields FI : TODO(FI功能码)   
	 */
	private final static int FI = 19;

	private int berthTotal;

	private int moorageTotal;

	private int waitInboundTotal;

	private int anchorageTotal;

	private int waitMoorageTotal;

	private MessageSix messageSix;

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>      
	 */
	public PortStatusBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param berthTotal
	 * @param moorageTotal
	 * @param waitInboundTotal
	 * @param anchorageTotal
	 * @param waitMoorageTotal
	 * @param messageSix   
	 */
	public PortStatusBo(int berthTotal, int moorageTotal, int waitInboundTotal,
			int anchorageTotal, int waitMoorageTotal, MessageSix messageSix) {
		super();
		this.berthTotal = berthTotal;
		this.moorageTotal = moorageTotal;
		this.waitInboundTotal = waitInboundTotal;
		this.anchorageTotal = anchorageTotal;
		this.waitMoorageTotal = waitMoorageTotal;
		this.messageSix = messageSix;
	}

	/**
	 * @return the berthTotal
	 */
	public int getBerthTotal() {
		return berthTotal;
	}

	/**
	 * @param berthTotal the berthTotal to set
	 */
	public void setBerthTotal(int berthTotal) {
		this.berthTotal = berthTotal;
	}

	/**
	 * @return the moorageTotal
	 */
	public int getMoorageTotal() {
		return moorageTotal;
	}

	/**
	 * @param moorageTotal the moorageTotal to set
	 */
	public void setMoorageTotal(int moorageTotal) {
		this.moorageTotal = moorageTotal;
	}

	/**
	 * @return the waitInboundTotal
	 */
	public int getWaitInboundTotal() {
		return waitInboundTotal;
	}

	/**
	 * @param waitInboundTotal the waitInboundTotal to set
	 */
	public void setWaitInboundTotal(int waitInboundTotal) {
		this.waitInboundTotal = waitInboundTotal;
	}

	/**
	 * @return the anchorageTotal
	 */
	public int getAnchorageTotal() {
		return anchorageTotal;
	}

	/**
	 * @param anchorageTotal the anchorageTotal to set
	 */
	public void setAnchorageTotal(int anchorageTotal) {
		this.anchorageTotal = anchorageTotal;
	}

	/**
	 * @return the waitMoorageTotal
	 */
	public int getWaitMoorageTotal() {
		return waitMoorageTotal;
	}

	/**
	 * @param waitMoorageTotal the waitMoorageTotal to set
	 */
	public void setWaitMoorageTotal(int waitMoorageTotal) {
		this.waitMoorageTotal = waitMoorageTotal;
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
		return "PortStatusBo [berthTotal=" + berthTotal + ", moorageTotal="
				+ moorageTotal + ", waitInboundTotal=" + waitInboundTotal
				+ ", anchorageTotal=" + anchorageTotal + ", waitMoorageTotal="
				+ waitMoorageTotal + ", messageSix=" + messageSix + "]";
	}
	
}
