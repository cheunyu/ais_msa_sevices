package com.scyb.aisweather.webservice;


import com.scyb.aisweather.webservice.bo.MarineEnvironmentForecastBo;

import javax.jws.WebService;

/**
 *      @ClassName: IMarineEnvironmentForecast   
 *  @Description: TODO(海洋环境预报接口)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年12月15日 下午12:40:14           
 */
@WebService
public interface IMarineEnvironmentForecast {

    public int mefBroadcastService(MarineEnvironmentForecastBo mefBo);
}
