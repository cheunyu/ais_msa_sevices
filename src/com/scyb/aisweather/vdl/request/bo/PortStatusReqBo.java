/**     
 * @Title: PortStatusVo.java    
 * @Package com.scyb.aisweather.vdl.vo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月7日 下午6:59:12    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.request.bo;

/**
 *      @ClassName: PortStatusVo     @Description: TODO(这里用一句话描述这个类的作用)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年10月7日 下午6:59:12           
 */
public class PortStatusReqBo {

	/**
	 *      @Fields DAC : TODO(DAC码)   
	 */
	private final static int DAC = 412;

	/**
	 *      @Fields FI : TODO(FI功能码)   
	 */
	private final static int FI = 18;
	
	/**   
	 * @Fields codeType : TODO(文字编码)   
	 */
	private int codeType;

	/**
	 *      @Fields portName : TODO(港口名称)   
	 */
	private String portName;

	/**
	 *      @Fields anchorageName : TODO(锚地名称)   
	 */
	private String anchorageName;

	/**
	 * @return the portName
	 */
	public String getPortName() {
		return portName;
	}

	/**
	 * @return the codeType
	 */
	public int getCodeType() {
		return codeType;
	}

	/**
	 * @param codeType the codeType to set
	 */
	public void setCodeType(int codeType) {
		this.codeType = codeType;
	}

	/**
	 * @param portName
	 *            the portName to set
	 */
	public void setPortName(String portName) {
		this.portName = portName;
	}

	/**
	 * @return the anchorageName
	 */
	public String getAnchorageName() {
		return anchorageName;
	}

	/**
	 * @param anchorageName
	 *            the anchorageName to set
	 */
	public void setAnchorageName(String anchorageName) {
		this.anchorageName = anchorageName;
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

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>      
	 */
	public PortStatusReqBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**    
	 * <p>Title: </p>   
	 * <p>Description: </p>   
	 * @param codeType
	 * @param portName
	 * @param anchorageName   
	 */
	public PortStatusReqBo(int codeType, String portName, String anchorageName) {
		super();
		this.codeType = codeType;
		this.portName = portName;
		this.anchorageName = anchorageName;
	}

	/** (非 Javadoc)   
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return   
	 * @see java.lang.Object#toString()   
	 */
	@Override
	public String toString() {
		return "PortStatusReqBo [codeType=" + codeType + ", portName=" + portName + ", anchorageName=" + anchorageName + "]";
	}


}
