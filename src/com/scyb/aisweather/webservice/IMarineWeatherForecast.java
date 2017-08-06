package com.scyb.aisweather.webservice;

import com.scyb.aisweather.webservice.bo.MarineWeatherForecastBo;

import javax.jws.WebService;

/**
 *      @ClassName: IMarineEnvironmentForecast   
 *  @Description: TODO(海洋气象预报接口)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年12月15日 下午12:40:14           
 */
@WebService
public interface IMarineWeatherForecast {

    public int mwfBroadcastService(MarineWeatherForecastBo mwfBo);
}
