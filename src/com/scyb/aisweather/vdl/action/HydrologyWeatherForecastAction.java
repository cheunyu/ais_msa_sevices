/**     
 * @Title: HydrologyWeatherForecastAction.java    
 * @Package com.scyb.aisweather.vdl.action   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月4日 下午7:50:36    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.scyb.aisweather.vdl.service.IHydrologyWeatherForecastService;
import com.scyb.aisweather.vdl.vo.HydrologyWeatherForecastVo;

/**   
 * @ClassName: HydrologyWeatherForecastAction   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月4日 下午7:50:36      
 *    
 */
public class HydrologyWeatherForecastAction implements Action {
	private Logger log = Logger.getLogger(this.getClass());
	private HydrologyWeatherForecastVo hwfVo;
	private IHydrologyWeatherForecastService hwfServiceImpl;
	/**
	 * @return the hwfVo
	 */
	public HydrologyWeatherForecastVo getHwfVo() {
		return hwfVo;
	}

	/**
	 * @param hwfVo the hwfVo to set
	 */
	public void setHwfVo(HydrologyWeatherForecastVo hwfVo) {
		this.hwfVo = hwfVo;
	}

	/**
	 * @param hwfServiceImpl the hwfServiceImpl to set
	 */
	public void setHwfServiceImpl(IHydrologyWeatherForecastService hwfServiceImpl) {
		this.hwfServiceImpl = hwfServiceImpl;
	}

	
	public String sendMessage() {
		hwfServiceImpl.transformVdl(hwfVo);
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
