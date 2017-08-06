package com.scyb.aisweather.message.vdl.app.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.scyb.aisweather.message.vdl.app.bo.OceanMeteorologyForecast;
import com.scyb.aisweather.message.vdl.app.service.IOceanMeteorologyForecastService;

/**   
 * @ClassName: OceanMeteorologyForecastAction   
 * @Description: TODO(海洋气象预报)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年7月21日 上午11:02:15      
 *    
 */
public class OceanMeteorologyForecastAction implements Action {

	private Logger log = Logger.getLogger(this.getClass());
	private OceanMeteorologyForecast omf;
	private IOceanMeteorologyForecastService omfServiceImpl;
	
	public OceanMeteorologyForecast getOmf() {
		return omf;
	}

	public void setOmf(OceanMeteorologyForecast omf) {
		this.omf = omf;
		omf.setDac(412);
		omf.setFi(1); 
		omf.setForecastTime(10);
	}

	public void setOmfServiceImpl(IOceanMeteorologyForecastService omfServiceImpl) {
		this.omfServiceImpl = omfServiceImpl;
	}

	public void sendMessage() {
//		omfServiceImpl.Transcode(omf);
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}