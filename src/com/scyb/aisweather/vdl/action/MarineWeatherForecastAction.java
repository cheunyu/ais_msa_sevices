/**     
 * @Title: MarineWeatherForecastAction.java    
 * @Package com.scyb.aisweather.vdl.action   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年9月17日 上午11:06:21    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.scyb.aisweather.vdl.service.IMarineWeatherForecastService;
import com.scyb.aisweather.vdl.vo.MarineWeatherForecastVo;

/**
 *      @ClassName: MarineWeatherForecastAction   
 *  @Description: TODO(这里用一句话描述这个类的作用)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年9月17日 上午11:06:21           
 */
public class MarineWeatherForecastAction implements Action {

	private Logger log = Logger.getLogger(this.getClass());
	private MarineWeatherForecastVo mwfVo;
	private IMarineWeatherForecastService mwfServiceImpl;

	/**
	 * @param mwfServiceImpl
	 *            the mwfServiceImpl to set
	 */
	public void setMwfServiceImpl(IMarineWeatherForecastService mwfServiceImpl) {
		this.mwfServiceImpl = mwfServiceImpl;
	}

	/**
	 * @param mwfVo
	 *            the mwfVo to set
	 */
	public void setMwfVo(MarineWeatherForecastVo mwfVo) {
		this.mwfVo = mwfVo;
	}

	/**
	 * @return the mwfVo
	 */
	public MarineWeatherForecastVo getMwfVo() {
		return mwfVo;
	}

	public String sendMessage() {
		int status = mwfServiceImpl.transformVdl(mwfVo);
		if(status == 0) {
			return this.SUCCESS;
		}else if(status == 1) {
			return this.ERROR;
		}
		return null;
		
	}

	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: execute
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @return  @throws Exception     @see
	 * com.opensymphony.xwork2.Action#execute()   
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
