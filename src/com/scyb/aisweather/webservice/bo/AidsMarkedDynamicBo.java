/**     
 * @Title: AidsMarkedDynamicBo.java    
 * @Package com.scyb.aisweather.webservice.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月15日 下午2:03:52    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.bo;

/**
 *      @ClassName: AidsMarkedDynamicBo   
 *  @Description: TODO(助航标注动态公用Bean)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年12月15日 下午2:03:52           
 */
public class AidsMarkedDynamicBo extends BroadcastMMSIBo{

	/**
	 *      @Fields DAC : TODO(区域码)   
	 */
	private final int DAC = 412;

	/**
	 *      @Fields FI : TODO(功能码)   
	 */
	private final int FI = 05;

	/**
	 *      @Fields range : TODO(时效)   
	 */
	private int range;
	
	private int status;

	/**
	 * @return the range
	 */
	public int getRange() {
		return range;
	}

	/**
	 * @param range
	 *            the range to set
	 */
	public void setRange(int range) {
		this.range = range;
	}

	/**
	 * @return the dAC
	 */
	public int getDAC() {
		return DAC;
	}

	/**
	 * @return the fI
	 */
	public int getFI() {
		return FI;
	}

	
	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * <p>
	 * Title:
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 */
	public AidsMarkedDynamicBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param range
	 * @param status   
	 */
	public AidsMarkedDynamicBo(int range, int status) {
		super();
		this.range = range;
		this.status = status;
	}

	/** (非 Javadoc)   
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return   
	 * @see java.lang.Object#toString()   
	 */
	@Override
	public String toString() {
		return "AidsMarkedDynamicBo [DAC=" + DAC + ", FI=" + FI + ", range=" + range + ", status=" + status + "]";
	}

    public AidsMarkedDynamicBo(int source_id, int destination_id, int range, int status) {
        super(source_id, destination_id);
        this.range = range;
        this.status = status;
    }
}
