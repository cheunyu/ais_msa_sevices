/**     
 * @Title: TextBo.java    
 * @Package com.scyb.aisweather.webservice.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月15日 下午3:42:04    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.bo;

/**
 *      @ClassName: TextBo     @Description: TODO(这里用一句话描述这个类的作用)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年12月15日 下午3:42:04      
 *     
 */
public class TextBo extends BroadcastMMSIBo{

	/**
	 *      @Fields DAC : TODO(区域码)   
	 */
	private final int DAC = 413;

	/**
	 *      @Fields FI : TODO(功能码)   
	 */
	private final int FI = 1;

	/**
	 *      @Fields content : TODO(文本内容)   
	 */
	private String content;

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public void setContent(String content) {
		this.content = content;
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
	 * <p>
	 * Title:
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 */
	public TextBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * <p>
	 * Title:
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param content
	 */
	public TextBo(String content) {
		super();
		this.content = content;
	}

	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: toString
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @return     @see java.lang.Object#toString()   
	 */
	@Override
	public String toString() {
		return "TextBo [DAC=" + DAC + ", FI=" + FI + ", content=" + content + "]";
	}

}
