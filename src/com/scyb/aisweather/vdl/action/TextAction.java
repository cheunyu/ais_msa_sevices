/**     
 * @Title: TextAction.java    
 * @Package com.scyb.aisweather.vdl.action   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年10月16日 上午11:21:19    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.scyb.aisweather.vdl.service.IShipDistressService;
import com.scyb.aisweather.vdl.service.ITextService;
import com.scyb.aisweather.vdl.vo.ShipDistressVo;
import com.scyb.aisweather.vdl.vo.TextVo;

/**   
 * @ClassName: TextAction   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月16日 上午11:21:19      
 *    
 */
public class TextAction implements Action {

	private Logger log = Logger.getLogger(this.getClass());
	private TextVo textVo;
	private ITextService textServiceImpl;
	
	
	/**
	 * @return the textVo
	 */
	public TextVo getTextVo() {
		return textVo;
	}


	/**
	 * @param textVo the textVo to set
	 */
	public void setTextVo(TextVo textVo) {
		this.textVo = textVo;
	}


	/**
	 * @param textServiceImpl the textServiceImpl to set
	 */
	public void setTextServiceImpl(ITextService textServiceImpl) {
		this.textServiceImpl = textServiceImpl;
	}

	public String sendMessage() {
		log.info(textVo.getContent());
		textServiceImpl.transformVdl(textVo);
		return this.SUCCESS;
	}

	/** (非 Javadoc)   
	 * <p>Title: execute</p>  
	 * <p>Description: </p>  
	 * @return
	 * @throws Exception   
	 * @see com.opensymphony.xwork2.Action#execute()   
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
