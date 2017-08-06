/**     
 * @Title: PortStatusVo.java    
 * @Package com.scyb.aisweather.vdl.vo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月7日 下午6:59:12    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.vo;

/**   
 * @ClassName: PortStatusVo   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月7日 下午6:59:12      
 *    
 */
public class PortStatusVo {

	/**
	 *      @Fields source_id : TODO(起始站台MMSI)   
	 */
	private int source_id;

	/**
	 *      @Fields destination_id : TODO(目标站台MMSI)   
	 */
	private int destination_id;

	private int berthTotal;
	
	private int moorageTotal;
	
	private int waitInboundTotal;
	
	private int anchorageTotal;
	
	private int waitMoorageTotal;

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>      
	 */
	public PortStatusVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param source_id
	 * @param destination_id
	 * @param berthTotal
	 * @param moorageTotal
	 * @param waitInboundTotal
	 * @param anchorageTotal
	 * @param waitMoorageTotal   
	 */
	public PortStatusVo(int source_id, int destination_id, int berthTotal,
			int moorageTotal, int waitInboundTotal, int anchorageTotal,
			int waitMoorageTotal) {
		super();
		this.source_id = source_id;
		this.destination_id = destination_id;
		this.berthTotal = berthTotal;
		this.moorageTotal = moorageTotal;
		this.waitInboundTotal = waitInboundTotal;
		this.anchorageTotal = anchorageTotal;
		this.waitMoorageTotal = waitMoorageTotal;
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

	/** (非 Javadoc)   
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return   
	 * @see java.lang.Object#toString()   
	 */
	@Override
	public String toString() {
		return "PortStatusVo [source_id=" + source_id + ", destination_id="
				+ destination_id + ", berthTotal=" + berthTotal
				+ ", moorageTotal=" + moorageTotal + ", waitInboundTotal="
				+ waitInboundTotal + ", anchorageTotal=" + anchorageTotal
				+ ", waitMoorageTotal=" + waitMoorageTotal + "]";
	}
	
	
}
