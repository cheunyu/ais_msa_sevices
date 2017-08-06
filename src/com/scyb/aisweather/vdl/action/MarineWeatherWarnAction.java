/**     
 * @Title: MarineWeatherWarnAction.java    
 * @Package com.scyb.aisweather.vdl.action   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年9月25日 下午2:41:24    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.scyb.aisweather.vdl.service.IMarineWeatherWarnService;
import com.scyb.aisweather.vdl.vo.MarineWeatherWarnVo;

/**   
 * @ClassName: MarineWeatherWarnAction   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年9月25日 下午2:41:24      
 *    
 */
public class MarineWeatherWarnAction implements Action {

	private Logger log = Logger.getLogger(this.getClass());
	private MarineWeatherWarnVo mwwVo;
	private IMarineWeatherWarnService mwwServiceImpl;
	
	/**
	 * @return the mwwVo
	 */
	public MarineWeatherWarnVo getMwwVo() {
		return mwwVo;
	}


	/**
	 * @param mwwVo the mwwVo to set
	 */
	public void setMwwVo(MarineWeatherWarnVo mwwVo) {
		this.mwwVo = mwwVo;
	}


	/**
	 * @param mwwServiceImpl the mwwServiceImpl to set
	 */
	public void setMwwServiceImpl(IMarineWeatherWarnService mwwServiceImpl) {
		this.mwwServiceImpl = mwwServiceImpl;
	}

	public String sendMessage() {
		mwwServiceImpl.transformVdl(mwwVo);
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
