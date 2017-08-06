package com.scyb.aisweather.webservice.impl;

import com.scyb.aisweather.vdl.service.IMarineWeatherForecastService;
import com.scyb.aisweather.vdl.vo.MarineWeatherForecastVo;
import com.scyb.aisweather.webservice.IMarineWeatherForecast;
import com.scyb.aisweather.webservice.bo.MarineWeatherForecastBo;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;

import javax.jws.WebService;
import java.lang.reflect.InvocationTargetException;

/**
 *      @ClassName: MarineWeatherForecastImpl   
 *  @Description: TODO(海洋气象预报接口实现类)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年12月15日 下午12:40:14           
 */
@WebService
public class MarineWeatherForecastImpl implements IMarineWeatherForecast {


    private Logger log = Logger.getLogger(this.getClass());
    private IMarineWeatherForecastService mwfServiceImpl;

    public void setMwfServiceImpl(IMarineWeatherForecastService mwfServiceImpl) {
        this.mwfServiceImpl = mwfServiceImpl;
    }

    @Override
    public int mwfBroadcastService(MarineWeatherForecastBo mwfBo) {
        MarineWeatherForecastVo mwfVo = new MarineWeatherForecastVo();
        try {
            BeanUtils.copyProperties(mwfVo, mwfBo);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        mwfVo.setMessageNo(6);
        mwfVo.setForecastDateTime(mwfBo.getTime());
        for(int i=0;i<mwfBo.getLatitudeList().size();i++) {
            mwfVo.getLatitudeDList().add(String.valueOf(mwfBo.getLatitudeList().get(i) / 1000000));
            mwfVo.getLatitudeMList().add(String.valueOf(mwfBo.getLatitudeList().get(i) % 1000000 * 60 / 1000000));
            mwfVo.getLatitudeSList().add(String.valueOf((Double) (Math.round(mwfBo.getLatitudeList().get(i) % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0)));
            mwfVo.getLongitudeDList().add(String.valueOf(mwfBo.getLongitudeList().get(i) / 1000000));
            mwfVo.getLongitudeMList().add(String.valueOf(mwfBo.getLongitudeList().get(i) % 1000000 * 60 / 1000000));
            mwfVo.getLongitudeSList().add(String.valueOf((Double) (Math.round(mwfBo.getLongitudeList().get(i) % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0)));
            mwfVo.setTemperatureList(mwfBo.getTemperatureList());
            mwfVo.setPressureList(mwfBo.getPressureList());
            mwfVo.setVisibilityList(mwfBo.getVisibilityList());
            mwfVo.setWeatherPhenomenaList(mwfBo.getWeatherPhenomena());
            mwfVo.setWindDirectionList(mwfBo.getWindDirectionList());
            mwfVo.setWindSpeedList(mwfBo.getWindSpeedList());
        }
        mwfServiceImpl.transformVdl(mwfVo);
        return 0;
    }
}
