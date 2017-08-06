package com.scyb.aisweather.message.vdl.app.service.impl;

import org.apache.log4j.Logger;

import com.scyb.aisweather.message.vdl.app.bo.OceanMeteorologyForecast;
import com.scyb.aisweather.message.vdl.app.service.IOceanMeteorologyForecastService;
import com.scyb.aisweather.message.vdl.util.MessageHeadUtil;


public class OceanMeteorologyForecastServiceImpl implements
		IOceanMeteorologyForecastService {

	private Logger log = Logger.getLogger(this.getClass());
	@Override
	public String Transcode(OceanMeteorologyForecast omf) {
		if(omf.getMe()==null) {
			MessageHeadUtil.messageSix(omf.getMs());
		}
		return null;
	}

	
}
