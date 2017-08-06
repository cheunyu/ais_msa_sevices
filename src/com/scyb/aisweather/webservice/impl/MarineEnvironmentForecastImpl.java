package com.scyb.aisweather.webservice.impl;

import com.scyb.aisweather.vdl.service.IMarineEnvironmentForecastService;
import com.scyb.aisweather.vdl.vo.MarineEnvironmentForecastVo;
import com.scyb.aisweather.webservice.IMarineEnvironmentForecast;
import com.scyb.aisweather.webservice.bo.MarineEnvironmentForecastBo;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;

import javax.jws.WebService;
import java.lang.reflect.InvocationTargetException;

/**
 *      @ClassName: MarineEnvironmentForecast   
 *  @Description: TODO(海洋环境预报接口实现类)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年12月15日 下午12:40:14           
 */
@WebService
public class MarineEnvironmentForecastImpl implements IMarineEnvironmentForecast {

    private Logger log = Logger.getLogger(this.getClass());
    private IMarineEnvironmentForecastService mefServiceImpl;

    public void setMefServiceImpl(IMarineEnvironmentForecastService mefServiceImpl) {
        this.mefServiceImpl = mefServiceImpl;
    }

    public int mefBroadcastService(MarineEnvironmentForecastBo mefBo) {
        MarineEnvironmentForecastVo mefVo = new MarineEnvironmentForecastVo();
        try {
            BeanUtils.copyProperties(mefVo, mefBo);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        for(int i=0;i<mefBo.getLatitudeList().size();i++) {
            mefVo.getLatitudeDList().add(String.valueOf(mefBo.getLatitudeList().get(i) / 1000000));
            mefVo.getLatitudeMList().add(String.valueOf(mefBo.getLatitudeList().get(i) % 1000000 * 60 / 1000000));
            mefVo.getLatitudeSList().add(String.valueOf((Double) (Math.round(mefBo.getLatitudeList().get(i) % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0)));
            mefVo.getLongitudeDList().add(String.valueOf(mefBo.getLongitudeList().get(i) / 1000000));
            mefVo.getLongitudeMList().add(String.valueOf(mefBo.getLongitudeList().get(i) % 1000000 * 60 / 1000000));
            mefVo.getLongitudeSList().add(String.valueOf((Double) (Math.round(mefBo.getLongitudeList().get(i) % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0)));
        }
        mefServiceImpl.transformVdl(mefVo);
        return 0;
    }
}
