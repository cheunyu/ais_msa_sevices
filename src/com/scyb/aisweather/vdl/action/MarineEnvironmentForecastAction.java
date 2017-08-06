/**     
 * @Title: MarineEnvironmentForecastAction.java    
 * @Package com.scyb.aisweather.message.vdl.app.action   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年7月28日 上午9:35:34    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.action;

import com.opensymphony.xwork2.Action;
import com.scyb.aisweather.vdl.service.IMarineEnvironmentForecastService;
import com.scyb.aisweather.vdl.vo.MarineEnvironmentForecastVo;
import com.scyb.aisweather.vdl.vo.MarineEnvironmentForecastVo;

/**
 *      @ClassName: MarineEnvironmentForecastAction   
 *  @Description: TODO(这里用一句话描述这个类的作用)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年7月28日 上午9:35:34           
 */
public class MarineEnvironmentForecastAction implements Action {

	private MarineEnvironmentForecastVo mefVo;
	private IMarineEnvironmentForecastService mefServiceImpl;

	/**
	 * @param mefVo
	 *            the mefVo to set
	 */
	public void setMefVo(MarineEnvironmentForecastVo mefVo) {
		this.mefVo = mefVo;
	}

	/**
	 * @return the mefVo
	 */
	public MarineEnvironmentForecastVo getMefVo() {
		return mefVo;
	}

	/**
	 * @param mefServiceImpl
	 *            the mefServiceImpl to set
	 */
	public void setmefServiceImpl(IMarineEnvironmentForecastService mefServiceImpl) {
		this.mefServiceImpl = mefServiceImpl;
	}

	public String sendMessage() {
		int status = mefServiceImpl.transformVdl(mefVo);
		if (status == 0) {
			return this.SUCCESS;
		} else if (status == 1) {
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

	public void setMefServiceImpl(com.scyb.aisweather.vdl.service.impl.MarineEnvironmentForecastServiceImpl mefServiceImpl) {
	}
}